/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2007, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU Lesser General Public License as published by 
 * the Free Software Foundation; either version 2.1 of the License, or 
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public 
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, 
 * USA.  
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc. 
 * in the United States and other countries.]
 *
 * ---------------------
 * ApplicationFrame.java
 * ---------------------
 * (C) Copyright 2000-2007, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * $Id: ApplicationFrame.java,v 1.4 2005/11/16 15:58:41 taqua Exp $
 *
 * Changes (from 30-May-2002)
 * --------------------------
 * 30-May-2002 : Added title (DG);
 * 13-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 *
 */

package org.jfree.chart.util;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * A base class for creating the main frame for simple applications.  The frame
 * listens for window closing events, and responds by shutting down the JVM.  
 * This is OK for small demo applications...for more serious applications, 
 * you'll want to use something more robust.
 */
public class ApplicationFrame extends JFrame implements WindowListener {

    /**
     * Constructs a new application frame.
     *
     * @param title  the frame title.
     */
    public ApplicationFrame(String title) {
        super(title);
        addWindowListener(this);
    }

    /**
     * Listens for the main window closing, and shuts down the application.
     *
     * @param event  information about the window event.
     */
    public void windowClosing(WindowEvent event) {
        if (event.getWindow() == this) {
            dispose();
            System.exit(0);
        }
    }

    /**
     * Required for WindowListener interface, but not used by this class.
     *
     * @param event  information about the window event.
     */
    public void windowClosed(WindowEvent event) {
        // ignore
    }

    /**
     * Required for WindowListener interface, but not used by this class.
     *
     * @param event  information about the window event.
     */
    public void windowActivated(WindowEvent event) {
        // ignore
    }

    /**
     * Required for WindowListener interface, but not used by this class.
     *
     * @param event  information about the window event.
     */
    public void windowDeactivated(WindowEvent event) {
        // ignore
    }

    /**
     * Required for WindowListener interface, but not used by this class.
     *
     * @param event  information about the window event.
     */
    public void windowDeiconified(WindowEvent event) {
        // ignore
    }

    /**
     * Required for WindowListener interface, but not used by this class.
     *
     * @param event  information about the window event.
     */
    public void windowIconified(WindowEvent event) {
        // ignore
    }

    /**
     * Required for WindowListener interface, but not used by this class.
     *
     * @param event  information about the window event.
     */
    public void windowOpened(WindowEvent event) {
        // ignore
    }

}
