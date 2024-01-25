import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lla")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!lla", name = "C", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!lla", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static41.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!lla", name = "g", descriptor = "(I)V")
	protected abstract void method1839();

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(ZB)V")
	private void method1840(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static634.aBoolean656) {
				return;
			}
			Static634.aBoolean656 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static41.anApplet1 != null) {
			Static41.anApplet1.destroy();
		}
		try {
			this.method1853();
		} catch (@Pc(42) Exception local42) {
		}
		if (this.aBoolean142) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable local48) {
			}
			this.aBoolean142 = false;
		}
		Static199.method3054();
		Static338.method4840();
		if (Static508.aCanvas8 != null) {
			try {
				Static508.aCanvas8.removeFocusListener(this);
				Static508.aCanvas8.getParent().remove(Static508.aCanvas8);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static122.aClass47_1 != null) {
			try {
				Static122.aClass47_1.method1390();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method1848();
		if (Static628.aFrame2 != null) {
			Static628.aFrame2.setVisible(false);
			Static628.aFrame2.dispose();
			Static628.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!lla", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static628.aFrame2 == null) {
			return Static41.anApplet1 == null || Static41.anApplet1 == this ? super.getDocumentBase() : Static41.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lla", name = "f", descriptor = "(I)V")
	public synchronized void method1841() {
		if (Static508.aCanvas8 != null) {
			Static508.aCanvas8.removeFocusListener(this);
			Static508.aCanvas8.getParent().setBackground(Color.black);
			Static508.aCanvas8.getParent().remove(Static508.aCanvas8);
		}
		@Pc(24) Container local24;
		if (Static702.aFrame3 != null) {
			local24 = Static702.aFrame3;
		} else if (Static628.aFrame2 != null) {
			local24 = Static628.aFrame2;
		} else if (Static41.anApplet1 == null) {
			local24 = Static229.anApplet_Sub1_1;
		} else {
			local24 = Static41.anApplet1;
		}
		local24.setLayout((LayoutManager) null);
		Static508.aCanvas8 = new Canvas_Sub1(this);
		local24.add(Static508.aCanvas8);
		Static508.aCanvas8.setSize(Static681.anInt10652, Static76.anInt1720);
		Static508.aCanvas8.setVisible(true);
		if (Static628.aFrame2 == local24) {
			@Pc(74) Insets local74 = Static628.aFrame2.getInsets();
			Static508.aCanvas8.setLocation(Static251.anInt3914 + local74.left, local74.top + Static388.anInt5985);
		} else {
			Static508.aCanvas8.setLocation(Static251.anInt3914, Static388.anInt5985);
		}
		Static508.aCanvas8.addFocusListener(this);
		Static508.aCanvas8.requestFocus();
		Static213.aBoolean221 = true;
		Static160.aBoolean182 = true;
		Static43.aBoolean88 = true;
		Static689.aBoolean728 = false;
		Static33.aLong37 = Static517.method6965();
	}

	@OriginalMember(owner = "client!lla", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static628.aFrame2 == null) {
			return Static41.anApplet1 == null || Static41.anApplet1 == this ? super.getAppletContext() : Static41.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method1842() {
		return null;
	}

	@OriginalMember(owner = "client!lla", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static160.aBoolean182 = true;
		Static43.aBoolean88 = true;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(IIBIZILjava/lang/String;I)V")
	protected final void method1843(@OriginalArg(3) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static159.anApplet2 = null;
			Static229.anApplet_Sub1_1 = this;
			Static76.anInt1720 = 768;
			Static342.anInt5491 = 768;
			Static251.anInt3914 = 0;
			Static388.anInt5985 = 0;
			Static681.anInt10652 = 1024;
			Static91.anInt2083 = 1024;
			Static344.anInt5516 = 665;
			Static628.aFrame2 = new Frame();
			Static628.aFrame2.setTitle("Jagex");
			Static628.aFrame2.setResizable(true);
			Static628.aFrame2.addWindowListener(this);
			Static628.aFrame2.setVisible(true);
			Static628.aFrame2.toFront();
			@Pc(50) Insets local50 = Static628.aFrame2.getInsets();
			Static628.aFrame2.setSize(local50.right + local50.left + Static91.anInt2083, local50.bottom + Static342.anInt5491 + local50.top);
			Static568.aClass47_6 = Static122.aClass47_1 = new Class47(arg0, arg1, 37, true);
			@Pc(82) Class338 local82 = Static122.aClass47_1.method1394(1, this);
			while (local82.anInt8934 == 0) {
				Static550.method7219(10L);
			}
		} catch (@Pc(99) Exception local99) {
			Static275.method4893((String) null, local99);
		}
	}

	@OriginalMember(owner = "client!lla", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static229.anApplet_Sub1_1 != this || Static634.aBoolean656) {
			return;
		}
		Static43.aBoolean88 = true;
		if (Static683.aBoolean720 && Static517.method6965() - Static33.aLong37 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static91.anInt2083 && Static342.anInt5491 <= local28.height) {
				Static689.aBoolean728 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lla", name = "d", descriptor = "(I)V")
	private void method1844() {
		@Pc(14) long local14 = Static517.method6965();
		@Pc(18) long local18 = Static651.aLongArray25[Static345.anInt5526];
		Static651.aLongArray25[Static345.anInt5526] = local14;
		@Pc(33) boolean local33;
		if (local18 == 0L || local14 <= local18) {
			local33 = false;
		} else {
			local33 = true;
		}
		Static345.anInt5526 = Static345.anInt5526 + 1 & 0x1F;
		synchronized (this) {
			Static213.aBoolean221 = Static160.aBoolean182;
		}
		this.method1839();
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1845(@OriginalArg(0) String arg0) {
		if (this.aBoolean143) {
			return;
		}
		this.aBoolean143 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static728.method688(Static41.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!lla", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static628.aFrame2 == null) {
			return Static41.anApplet1 == null || Static41.anApplet1 == this ? super.getParameter(arg0) : Static41.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "(B)Z")
	public final boolean method1846() {
		return Static67.method1514("jaclib");
	}

	@OriginalMember(owner = "client!lla", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static229.anApplet_Sub1_1 == this && !Static634.aBoolean656) {
			Static571.aLong293 = Static517.method6965();
			Static550.method7219(5000L);
			Static568.aClass47_6 = null;
			this.method1840(false);
		}
	}

	@OriginalMember(owner = "client!lla", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(Z)V")
	protected abstract void method1847();

	@OriginalMember(owner = "client!lla", name = "e", descriptor = "(I)V")
	protected abstract void method1848();

	@OriginalMember(owner = "client!lla", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static229.anApplet_Sub1_1 == this && !Static634.aBoolean656) {
			Static571.aLong293 = 0L;
		}
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(I)Z")
	protected final boolean method1849() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
			return true;
		} else if (local10.equals("stellardawn.com") || local10.endsWith(".stellardawn.com")) {
			return true;
		} else if (local10.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local10.length() > 0 && local10.charAt(local10.length() - 1) >= '0' && local10.charAt(local10.length() - 1) <= '9') {
				local10 = local10.substring(0, local10.length() - 1);
			}
			if (local10.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1845("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lla", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lla", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Z)Z")
	public final boolean method1850() {
		return Static67.method1514("jagtheora");
	}

	@OriginalMember(owner = "client!lla", name = "c", descriptor = "(I)V")
	protected abstract void method1851();

	@OriginalMember(owner = "client!lla", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lla", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lla", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static60.aString27 != null) {
				@Pc(10) String local10 = Static60.aString27.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(61) String local61 = Static60.aString23;
					if (local61.equals("1.1") || local61.startsWith("1.1.") || local61.equals("1.2") || local61.startsWith("1.2.")) {
						this.method1845("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static60.aString23 == null || Static60.aString23.equals("1.4.2"))) {
					this.method1845("wrongjava");
					return;
				}
			}
			if (Static60.aString23 != null && Static60.aString23.startsWith("1.")) {
				@Pc(115) int local115 = 2;
				@Pc(117) int local117 = 0;
				while (local115 < Static60.aString23.length()) {
					@Pc(125) char local125 = Static60.aString23.charAt(local115);
					if (local125 < '0' || local125 > '9') {
						break;
					}
					local117 = local117 * 10 + local125 - 48;
					local115++;
				}
				if (local117 >= 5) {
					Static683.aBoolean720 = true;
				}
			}
			@Pc(167) Applet local167 = Static229.anApplet_Sub1_1;
			if (Static41.anApplet1 != null) {
				local167 = Static41.anApplet1;
			}
			@Pc(173) Method local173 = Static60.aMethod2;
			if (local173 != null) {
				try {
					local173.invoke(local167, Boolean.TRUE);
				} catch (@Pc(187) Throwable local187) {
				}
			}
			Static595.method7681();
			Static94.method1950();
			this.method1841();
			this.method1851();
			Static477.aClass87_1 = Static9.method256();
			while (Static571.aLong293 == 0L || Static571.aLong293 > Static517.method6965()) {
				Static65.anInt8657 = Static477.aClass87_1.method6746(Static365.aLong196);
				for (@Pc(212) int local212 = 0; local212 < Static65.anInt8657; local212++) {
					this.method1844();
				}
				this.method1855();
				Static154.method2524(Static508.aCanvas8, Static122.aClass47_1);
			}
		} catch (@Pc(253) ThreadDeath local253) {
			throw local253;
		} catch (@Pc(256) Throwable local256) {
			Static275.method4893(this.method1842(), local256);
			this.method1845("crash");
		} finally {
			@Pc(274) Object local274 = null;
			this.method1840(true);
		}
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(B)V")
	protected abstract void method1853();

	@OriginalMember(owner = "client!lla", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static160.aBoolean182 = false;
	}

	@OriginalMember(owner = "client!lla", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lla", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static628.aFrame2 == null) {
			return Static41.anApplet1 == null || Static41.anApplet1 == this ? super.getCodeBase() : Static41.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lla", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lla", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static229.anApplet_Sub1_1 == this && !Static634.aBoolean656) {
			Static571.aLong293 = Static517.method6965() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lla", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lla", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(B)Z")
	public final boolean method1854() {
		return Static67.method1514("jagmisc");
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(I)V")
	private void method1855() {
		@Pc(6) long local6 = Static517.method6965();
		@Pc(10) long local10 = Static13.aLongArray1[Static561.anInt8573];
		Static13.aLongArray1[Static561.anInt8573] = local6;
		Static561.anInt8573 = Static561.anInt8573 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(38) int local38 = (int) (local6 - local10);
			Static605.anInt9179 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static661.anInt10133++ > 50) {
			Static43.aBoolean88 = true;
			Static661.anInt10133 -= 50;
			Static508.aCanvas8.setSize(Static681.anInt10652, Static76.anInt1720);
			Static508.aCanvas8.setVisible(true);
			if (Static628.aFrame2 != null && Static702.aFrame3 == null) {
				@Pc(88) Insets local88 = Static628.aFrame2.getInsets();
				Static508.aCanvas8.setLocation(Static251.anInt3914 + local88.left, Static388.anInt5985 + local88.top);
			} else {
				Static508.aCanvas8.setLocation(Static251.anInt3914, Static388.anInt5985);
			}
		}
		this.method1847();
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method1856(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static229.anApplet_Sub1_1 == null) {
				Static388.anInt5985 = 0;
				Static344.anInt5516 = 665;
				Static76.anInt1720 = arg2;
				Static342.anInt5491 = arg2;
				Static159.anApplet2 = Static41.anApplet1;
				Static251.anInt3914 = 0;
				Static229.anApplet_Sub1_1 = this;
				Static681.anInt10652 = arg3;
				Static91.anInt2083 = arg3;
				Static568.aClass47_6 = Static122.aClass47_1 = new Class47(arg1, arg0, 37, Static41.anApplet1 != null);
				@Pc(80) Class338 local80 = Static122.aClass47_1.method1394(1, this);
				while (local80.anInt8934 == 0) {
					Static550.method7219(10L);
				}
			} else {
				Static98.anInt2139++;
				if (Static98.anInt2139 >= 3) {
					this.method1845("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(94) Throwable local94) {
			Static275.method4893((String) null, local94);
			this.method1845("crash");
		}
	}
}
