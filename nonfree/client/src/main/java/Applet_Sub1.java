import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
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

@OriginalClass("client!mg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	private synchronized void method543() {
		if (Static11.aBoolean13) {
			return;
		}
		Static11.aBoolean13 = true;
		try {
			Static1.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method552();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static145.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static144.aClass50_4 != null) {
			try {
				Static144.aClass50_4.method1745();
			} catch (@Pc(32) Exception local32) {
			}
		}
		this.method546();
	}

	@OriginalMember(owner = "client!mg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static7.anApplet_Sub1_1 == this && !Static11.aBoolean13) {
			Static1.aLong1 = 0L;
		}
	}

	@OriginalMember(owner = "client!mg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static7.anApplet_Sub1_1 == this && !Static11.aBoolean13) {
			Static1.aLong1 = Static101.method1795();
			Static27.method564(5000L);
			Static132.aClass50_3 = null;
			this.method543();
		}
	}

	@OriginalMember(owner = "client!mg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method544(@OriginalArg(4) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static118.anInt2926 = 765;
			Static7.anApplet_Sub1_1 = this;
			Static9.anInt260 = 503;
			Static72.anInt1933 = 475;
			Static145.aFrame1 = new Frame();
			Static145.aFrame1.setTitle("Jagex");
			Static145.aFrame1.setResizable(false);
			Static145.aFrame1.addWindowListener(this);
			Static145.aFrame1.setVisible(true);
			Static145.aFrame1.toFront();
			@Pc(32) Insets local32 = Static145.aFrame1.getInsets();
			Static145.aFrame1.setSize(local32.left + local32.right + 765, 503 - (-local32.top + -local32.bottom));
			Static132.aClass50_3 = Static144.aClass50_4 = new Class50(true, null, arg1, arg0, 16);
			Static144.aClass50_4.method1748(this, 1);
		} catch (@Pc(75) Exception local75) {
			Static19.method441(null, local75);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
	protected final boolean method545() {
		@Pc(4) String local4 = this.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method555("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static7.anApplet_Sub1_1 != this || Static11.aBoolean13) {
			return;
		}
		Static158.aBoolean160 = true;
		if (Static95.aString3 != null && Static95.aString3.startsWith("1.5") && Static101.method1795() - Static152.aLong111 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static118.anInt2926 <= local30.width && Static9.anInt260 <= local30.height) {
				Static163.aBoolean165 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static145.aFrame1 == null) {
			return Static144.aClass50_4 == null || Static144.aClass50_4.anApplet1 == this ? super.getDocumentBase() : Static144.aClass50_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	protected abstract void method546();

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
	private void method547() {
		@Pc(6) long local6 = Static101.method1795();
		@Pc(10) long local10 = Static24.aLongArray1[Static26.anInt736];
		Static24.aLongArray1[Static26.anInt736] = local6;
		Static26.anInt736 = Static26.anInt736 + 1 & 0x1F;
		synchronized (this) {
			Static41.aBoolean57 = Static105.aBoolean108;
		}
		@Pc(43) boolean local43;
		if (local10 == 0L || local10 >= local6) {
			local43 = false;
		} else {
			local43 = true;
		}
		this.method558();
	}

	@OriginalMember(owner = "client!mg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static145.aFrame1 == null) {
			return Static144.aClass50_4 == null || Static144.aClass50_4.anApplet1 == this ? super.getCodeBase() : Static144.aClass50_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	protected final void method548(@OriginalArg(1) int arg0) {
		try {
			if (Static7.anApplet_Sub1_1 == null) {
				Static118.anInt2926 = 765;
				Static7.anApplet_Sub1_1 = this;
				Static9.anInt260 = 503;
				Static72.anInt1933 = 475;
				if (Static144.aClass50_4 == null) {
					Static132.aClass50_3 = Static144.aClass50_4 = new Class50(false, this, arg0, null, 0);
				}
				Static144.aClass50_4.method1748(this, 1);
			} else {
				Static84.anInt3148++;
				if (Static84.anInt3148 >= 3) {
					this.method555("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(60) Exception local60) {
			Static19.method441(null, local60);
			this.method555("crash");
		}
	}

	@OriginalMember(owner = "client!mg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!mg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	private void method550() {
		@Pc(2) long local2 = Static101.method1795();
		@Pc(6) long local6 = Static108.aLongArray5[Static105.anInt2569];
		Static108.aLongArray5[Static105.anInt2569] = local2;
		Static105.anInt2569 = Static105.anInt2569 + 1 & 0x1F;
		if (local6 != 0L && local2 > local6) {
			@Pc(42) int local42 = (int) (local2 - local6);
			Static139.anInt3370 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static173.anInt4432++ > 50) {
			Static158.aBoolean160 = true;
			Static173.anInt4432 -= 50;
			Static1.aCanvas1.setSize(Static118.anInt2926, Static9.anInt260);
			Static1.aCanvas1.setVisible(true);
			if (Static145.aFrame1 == null) {
				Static1.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(77) Insets local77 = Static145.aFrame1.getInsets();
				Static1.aCanvas1.setLocation(local77.left, local77.top);
			}
		}
		this.method553();
	}

	@OriginalMember(owner = "client!mg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!mg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static7.anApplet_Sub1_1 == this && !Static11.aBoolean13) {
			Static1.aLong1 = Static101.method1795() + 4000L;
		}
	}

	@OriginalMember(owner = "client!mg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static145.aFrame1 == null) {
			return Static144.aClass50_4 == null || Static144.aClass50_4.anApplet1 == this ? super.getAppletContext() : Static144.aClass50_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static105.aBoolean108 = false;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	protected abstract void method552();

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
	protected abstract void method553();

	@OriginalMember(owner = "client!mg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static95.aString5 != null) {
				@Pc(10) String local10 = Static95.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static95.aString3;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method555("wrongjava");
						return;
					}
					Static75.anInt1980 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static95.aString3 == null || Static95.aString3.equals("1.4.2"))) {
					this.method555("wrongjava");
					return;
				}
			}
			if (Static144.aClass50_4.anApplet1 != null) {
				@Pc(67) Method local67 = Static95.aMethod1;
				if (local67 != null) {
					try {
						local67.invoke(Static144.aClass50_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method554();
			Static152.aClass57_1 = Static37.method746(Static1.aCanvas1, Static118.anInt2926, Static9.anInt260);
			this.method557();
			Static152.aClass23_1 = Static88.method1623();
			while (Static1.aLong1 == 0L || Static101.method1795() < Static1.aLong1) {
				Static71.anInt1922 = Static152.aClass23_1.method1620(Static134.anInt3283, Static75.anInt1980);
				for (@Pc(108) int local108 = 0; local108 < Static71.anInt1922; local108++) {
					this.method547();
				}
				this.method550();
				Static121.method2130(Static144.aClass50_4, Static1.aCanvas1);
			}
		} catch (@Pc(145) Exception local145) {
			Static19.method441(null, local145);
			this.method555("crash");
		}
		this.method543();
	}

	@OriginalMember(owner = "client!mg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static105.aBoolean108 = true;
		Static158.aBoolean160 = true;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(Z)V")
	protected final synchronized void method554() {
		@Pc(10) Container local10;
		if (Static145.aFrame1 == null) {
			local10 = Static144.aClass50_4.anApplet1;
		} else {
			local10 = Static145.aFrame1;
		}
		if (Static1.aCanvas1 != null) {
			Static1.aCanvas1.removeFocusListener(this);
			local10.remove(Static1.aCanvas1);
		}
		Static1.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static1.aCanvas1);
		Static1.aCanvas1.setSize(Static118.anInt2926, Static9.anInt260);
		Static1.aCanvas1.setVisible(true);
		if (Static145.aFrame1 == null) {
			Static1.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static145.aFrame1.getInsets();
			Static1.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static1.aCanvas1.addFocusListener(this);
		Static1.aCanvas1.requestFocus();
		Static158.aBoolean160 = true;
		Static163.aBoolean165 = false;
		Static152.aLong111 = Static101.method1795();
	}

	@OriginalMember(owner = "client!mg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static145.aFrame1 == null) {
			return Static144.aClass50_4 == null || Static144.aClass50_4.anApplet1 == this ? super.getParameter(arg0) : Static144.aClass50_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method555(@OriginalArg(0) String arg0) {
		if (this.aBoolean42) {
			return;
		}
		this.aBoolean42 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V")
	protected abstract void method557();

	@OriginalMember(owner = "client!mg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V")
	protected abstract void method558();
}
