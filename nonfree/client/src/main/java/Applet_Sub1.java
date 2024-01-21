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

@OriginalClass("client!de")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	private synchronized void method319() {
		if (Static31.aBoolean35) {
			return;
		}
		Static31.aBoolean35 = true;
		try {
			Static8.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method326();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static14.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static126.aClass29_63 != null) {
			try {
				Static126.aClass29_63.method601();
			} catch (@Pc(32) Exception local32) {
			}
		}
		this.method325();
	}

	@OriginalMember(owner = "client!de", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/lang/String;BIIII)V")
	protected final void method320(@OriginalArg(1) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static98.anInt1021 = 460;
			Static59.anApplet_Sub1_1 = this;
			Static99.anInt2490 = 765;
			Static115.anInt2885 = 503;
			Static14.aFrame1 = new Frame();
			Static14.aFrame1.setTitle("Jagex");
			Static14.aFrame1.setResizable(false);
			Static14.aFrame1.addWindowListener(this);
			Static14.aFrame1.setVisible(true);
			Static14.aFrame1.toFront();
			@Pc(36) Insets local36 = Static14.aFrame1.getInsets();
			Static14.aFrame1.setSize(local36.left + local36.right + 765, local36.bottom + local36.top + 503);
			Static59.aClass29_28 = Static126.aClass29_63 = new Class29(true, null, arg1, arg0, 16);
			Static126.aClass29_63.method607(this, 1);
		} catch (@Pc(72) Exception local72) {
			Static77.method1294(local72, null);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method321(@OriginalArg(0) String arg0) {
		if (this.aBoolean18) {
			return;
		}
		this.aBoolean18 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!de", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!de", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static59.anApplet_Sub1_1 == this && !Static31.aBoolean35) {
			Static75.aLong88 = Static23.method431() + 4000L;
		}
	}

	@OriginalMember(owner = "client!de", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static14.aFrame1 == null) {
			return Static126.aClass29_63 == null || Static126.aClass29_63.anApplet1 == this ? super.getCodeBase() : Static126.aClass29_63.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	protected final synchronized void method323() {
		@Pc(5) Container local5;
		if (Static14.aFrame1 == null) {
			local5 = Static126.aClass29_63.anApplet1;
		} else {
			local5 = Static14.aFrame1;
		}
		if (Static8.aCanvas1 != null) {
			Static8.aCanvas1.removeFocusListener(this);
			local5.remove(Static8.aCanvas1);
		}
		Static8.aCanvas1 = new Canvas_Sub1(this);
		local5.add(Static8.aCanvas1);
		Static8.aCanvas1.setSize(Static99.anInt2490, Static115.anInt2885);
		Static8.aCanvas1.setVisible(true);
		if (Static14.aFrame1 == null) {
			Static8.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(54) Insets local54 = Static14.aFrame1.getInsets();
			Static8.aCanvas1.setLocation(local54.left, local54.top);
		}
		Static8.aCanvas1.addFocusListener(this);
		Static8.aCanvas1.requestFocus();
		Static58.aBoolean86 = true;
		Static88.aBoolean111 = false;
		Static5.aLong129 = Static23.method431();
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Z")
	protected final boolean method324() {
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
				this.method321("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static14.aFrame1 == null) {
			return Static126.aClass29_63 == null || Static126.aClass29_63.anApplet1 == this ? super.getParameter(arg0) : Static126.aClass29_63.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static59.anApplet_Sub1_1 != this || Static31.aBoolean35) {
			return;
		}
		Static58.aBoolean86 = true;
		if (Static37.aString4 != null && Static37.aString4.startsWith("1.5") && Static23.method431() - Static5.aLong129 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static99.anInt2490 && Static115.anInt2885 <= local28.height) {
				Static88.aBoolean111 = true;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	protected abstract void method325();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	protected abstract void method326();

	@OriginalMember(owner = "client!de", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!de", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	private void method328() {
		@Pc(6) long local6 = Static23.method431();
		@Pc(10) long local10 = Static96.aLongArray6[Static54.anInt1472];
		@Pc(27) boolean local27;
		if (local10 == 0L || local6 <= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static96.aLongArray6[Static54.anInt1472] = local6;
		Static54.anInt1472 = Static54.anInt1472 + 1 & 0x1F;
		synchronized (this) {
			Static102.aBoolean124 = Static121.aBoolean149;
		}
		this.method329();
	}

	@OriginalMember(owner = "client!de", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static14.aFrame1 == null) {
			return Static126.aClass29_63 == null || Static126.aClass29_63.anApplet1 == this ? super.getDocumentBase() : Static126.aClass29_63.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	protected abstract void method329();

	@OriginalMember(owner = "client!de", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!de", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static14.aFrame1 == null) {
			return Static126.aClass29_63 == null || Static126.aClass29_63.anApplet1 == this ? super.getAppletContext() : Static126.aClass29_63.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static37.aString2 != null) {
				@Pc(10) String local10 = Static37.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static37.aString4;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method321("wrongjava");
						return;
					}
					Static105.anInt2014 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static37.aString4 == null || Static37.aString4.equals("1.4.2"))) {
					this.method321("wrongjava");
					return;
				}
			}
			if (Static126.aClass29_63.anApplet1 != null) {
				@Pc(69) Method local69 = Static37.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static126.aClass29_63.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method323();
			Static91.aClass6_1 = Static23.method429(Static8.aCanvas1, Static115.anInt2885, Static99.anInt2490);
			this.method331();
			Static96.aClass55_1 = Static104.method1862();
			Static96.aClass55_1.method2208();
			while (Static75.aLong88 == 0L || Static75.aLong88 > Static23.method431()) {
				Static131.anInt3187 = Static96.aClass55_1.method2211(Static105.anInt2014, Static122.anInt3018);
				for (@Pc(113) int local113 = 0; local113 < Static131.anInt3187; local113++) {
					this.method328();
				}
				this.method330();
				Static125.method2175(Static126.aClass29_63, Static8.aCanvas1);
			}
		} catch (@Pc(140) Exception local140) {
			Static77.method1294(local140, null);
			this.method321("crash");
		}
		this.method319();
	}

	@OriginalMember(owner = "client!de", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static59.anApplet_Sub1_1 == this && !Static31.aBoolean35) {
			Static75.aLong88 = Static23.method431();
			Static125.method2177(5000L);
			Static59.aClass29_28 = null;
			this.method319();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
	private void method330() {
		@Pc(2) long local2 = Static23.method431();
		@Pc(10) long local10 = Static7.aLongArray1[Static101.anInt2517];
		Static7.aLongArray1[Static101.anInt2517] = local2;
		if (local10 != 0L && local2 > local10) {
			@Pc(28) int local28 = (int) (local2 - local10);
			Static73.anInt1765 = ((local28 >> 1) + 32000) / local28;
		}
		Static101.anInt2517 = Static101.anInt2517 + 1 & 0x1F;
		if (Static62.anInt1635++ > 50) {
			Static62.anInt1635 -= 50;
			Static58.aBoolean86 = true;
			Static8.aCanvas1.setSize(Static99.anInt2490, Static115.anInt2885);
			Static8.aCanvas1.setVisible(true);
			if (Static14.aFrame1 == null) {
				Static8.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(74) Insets local74 = Static14.aFrame1.getInsets();
				Static8.aCanvas1.setLocation(local74.left, local74.top);
			}
		}
		this.method332();
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	protected abstract void method331();

	@OriginalMember(owner = "client!de", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static121.aBoolean149 = false;
	}

	@OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
	protected abstract void method332();

	@OriginalMember(owner = "client!de", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static59.anApplet_Sub1_1 == this && !Static31.aBoolean35) {
			Static75.aLong88 = 0L;
		}
	}

	@OriginalMember(owner = "client!de", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!de", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!de", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!de", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static121.aBoolean149 = true;
		Static58.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIBI)V")
	protected final void method335(@OriginalArg(4) int arg0) {
		try {
			if (Static59.anApplet_Sub1_1 == null) {
				Static99.anInt2490 = 765;
				Static115.anInt2885 = 503;
				Static59.anApplet_Sub1_1 = this;
				Static98.anInt1021 = 460;
				if (Static126.aClass29_63 == null) {
					Static59.aClass29_28 = Static126.aClass29_63 = new Class29(false, this, arg0, null, 0);
				}
				Static126.aClass29_63.method607(this, 1);
			} else {
				Static65.anInt1665++;
				if (Static65.anInt1665 >= 3) {
					this.method321("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static77.method1294(local61, null);
			this.method321("crash");
		}
	}
}
