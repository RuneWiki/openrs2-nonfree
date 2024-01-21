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

@OriginalClass("client!v")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!v", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static73.aFrame1 == null) {
			return Static35.aClass74_1 == null || Static35.aClass74_1.anApplet1 == this ? super.getParameter(arg0) : Static35.aClass74_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	protected abstract void method459();

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	private synchronized void method460() {
		if (Static39.aBoolean38) {
			return;
		}
		Static39.aBoolean38 = true;
		try {
			Static2.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method467();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static73.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static35.aClass74_1 != null) {
			try {
				Static35.aClass74_1.method2120();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method478();
	}

	@OriginalMember(owner = "client!v", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static71.aBoolean50 = true;
		Static33.aBoolean35 = true;
	}

	@OriginalMember(owner = "client!v", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static73.aFrame1 == null) {
			return Static35.aClass74_1 == null || Static35.aClass74_1.anApplet1 == this ? super.getCodeBase() : Static35.aClass74_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Z")
	protected final boolean method461() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method463("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method463(@OriginalArg(1) String arg0) {
		if (this.aBoolean24) {
			return;
		}
		this.aBoolean24 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!v", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static51.anApplet_Sub1_2 == this && !Static39.aBoolean38) {
			Static17.aLong25 = Static102.method1996();
			Static126.method2277(5000L);
			Static73.aClass74_3 = null;
			this.method460();
		}
	}

	@OriginalMember(owner = "client!v", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static73.aFrame1 == null) {
			return Static35.aClass74_1 == null || Static35.aClass74_1.anApplet1 == this ? super.getAppletContext() : Static35.aClass74_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static73.aFrame1 == null) {
			return Static35.aClass74_1 == null || Static35.aClass74_1.anApplet1 == this ? super.getDocumentBase() : Static35.aClass74_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!v", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
	protected final synchronized void method465() {
		@Pc(9) Container local9;
		if (Static73.aFrame1 == null) {
			local9 = Static35.aClass74_1.anApplet1;
		} else {
			local9 = Static73.aFrame1;
		}
		if (Static2.aCanvas1 != null) {
			Static2.aCanvas1.removeFocusListener(this);
			local9.remove(Static2.aCanvas1);
		}
		Static2.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static2.aCanvas1);
		Static2.aCanvas1.setSize(Static120.anInt3263, Static23.anInt2584);
		Static2.aCanvas1.setVisible(true);
		if (Static73.aFrame1 == null) {
			Static2.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(46) Insets local46 = Static73.aFrame1.getInsets();
			Static2.aCanvas1.setLocation(local46.left, local46.top);
		}
		Static2.aCanvas1.addFocusListener(this);
		Static2.aCanvas1.requestFocus();
		Static33.aBoolean35 = true;
		Static8.aBoolean12 = false;
		Static55.aLong60 = Static102.method1996();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	protected abstract void method467();

	@OriginalMember(owner = "client!v", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static51.anApplet_Sub1_2 != this || Static39.aBoolean38) {
			return;
		}
		Static33.aBoolean35 = true;
		if (Static116.aString5 != null && Static116.aString5.startsWith("1.5") && Static102.method1996() - Static55.aLong60 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static120.anInt3263 <= local28.width && local28.height >= Static23.anInt2584) {
				Static8.aBoolean12 = true;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!v", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static116.aString3 != null) {
				@Pc(10) String local10 = Static116.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static116.aString5;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method463("wrongjava");
						return;
					}
					Static32.anInt1112 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static116.aString5 == null || Static116.aString5.equals("1.4.2"))) {
					this.method463("wrongjava");
					return;
				}
			}
			if (Static35.aClass74_1.anApplet1 != null) {
				@Pc(69) Method local69 = Static116.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static35.aClass74_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method465();
			Static30.aClass16_27 = Static42.method971(Static2.aCanvas1, Static120.anInt3263, Static23.anInt2584);
			this.method477();
			Static6.aClass39_1 = Static84.method1662();
			Static6.aClass39_1.method2141();
			while (Static17.aLong25 == 0L || Static17.aLong25 > Static102.method1996()) {
				Static63.anInt2914 = Static6.aClass39_1.method2145(Static103.anInt2992, Static32.anInt1112);
				for (@Pc(113) int local113 = 0; local113 < Static63.anInt2914; local113++) {
					this.method471();
				}
				this.method479();
				Static12.method337(Static2.aCanvas1, Static35.aClass74_1);
			}
		} catch (@Pc(144) Exception local144) {
			Static87.method1031(local144, null);
			this.method463("crash");
		}
		this.method460();
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	private void method471() {
		@Pc(7) long local7 = Static102.method1996();
		@Pc(15) long local15 = Static67.aLongArray2[Static108.anInt3051];
		@Pc(30) boolean local30;
		if (local15 == 0L || local7 <= local15) {
			local30 = false;
		} else {
			local30 = true;
		}
		Static67.aLongArray2[Static108.anInt3051] = local7;
		Static108.anInt3051 = Static108.anInt3051 + 1 & 0x1F;
		synchronized (this) {
			Static12.aBoolean14 = Static71.aBoolean50;
		}
		this.method481();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method473(@OriginalArg(1) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static23.anInt2584 = 503;
			Static120.anInt3263 = 765;
			Static51.anApplet_Sub1_2 = this;
			Static11.anInt344 = 459;
			Static73.aFrame1 = new Frame();
			Static73.aFrame1.setTitle("Jagex");
			Static73.aFrame1.setResizable(false);
			Static73.aFrame1.addWindowListener(this);
			Static73.aFrame1.setVisible(true);
			Static73.aFrame1.toFront();
			@Pc(32) Insets local32 = Static73.aFrame1.getInsets();
			Static73.aFrame1.setSize(local32.left + local32.right + 765, local32.bottom + local32.top + 503);
			Static73.aClass74_3 = Static35.aClass74_1 = new Class74(true, null, arg1, arg0, 16);
			Static35.aClass74_1.method2122(this, 1);
		} catch (@Pc(74) Exception local74) {
			Static87.method1031(local74, null);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	protected final void method475(@OriginalArg(2) int arg0) {
		try {
			if (Static51.anApplet_Sub1_2 != null) {
				Static63.anInt2901++;
				if (Static63.anInt2901 >= 3) {
					this.method463("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static120.anInt3263 = 765;
			Static11.anInt344 = 459;
			Static51.anApplet_Sub1_2 = this;
			Static23.anInt2584 = 503;
			if (Static35.aClass74_1 == null) {
				Static73.aClass74_3 = Static35.aClass74_1 = new Class74(false, this, arg0, null, 0);
			}
			Static35.aClass74_1.method2122(this, 1);
		} catch (@Pc(55) Exception local55) {
			Static87.method1031(local55, null);
			this.method463("crash");
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	protected abstract void method477();

	@OriginalMember(owner = "client!v", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!v", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static51.anApplet_Sub1_2 == this && !Static39.aBoolean38) {
			Static17.aLong25 = Static102.method1996() + 4000L;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
	protected abstract void method478();

	@OriginalMember(owner = "client!v", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static51.anApplet_Sub1_2 == this && !Static39.aBoolean38) {
			Static17.aLong25 = 0L;
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
	private void method479() {
		@Pc(6) long local6 = Static102.method1996();
		@Pc(10) long local10 = Static70.aLongArray3[Static48.anInt1550];
		Static70.aLongArray3[Static48.anInt1550] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static10.anInt331 = ((local34 >> 1) + 32000) / local34;
		}
		Static48.anInt1550 = Static48.anInt1550 + 1 & 0x1F;
		if (Static123.anInt3350++ > 50) {
			Static33.aBoolean35 = true;
			Static123.anInt3350 -= 50;
			Static2.aCanvas1.setSize(Static120.anInt3263, Static23.anInt2584);
			Static2.aCanvas1.setVisible(true);
			if (Static73.aFrame1 == null) {
				Static2.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static73.aFrame1.getInsets();
				Static2.aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.method459();
	}

	@OriginalMember(owner = "client!v", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static71.aBoolean50 = false;
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
	protected abstract void method481();
}
