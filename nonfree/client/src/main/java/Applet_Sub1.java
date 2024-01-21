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

@OriginalClass("client!vd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!vd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static91.aFrame1 == null) {
			return Static4.aClass6_1 == null || Static4.aClass6_1.anApplet1 == this ? super.getParameter(arg0) : Static4.aClass6_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	private void method272() {
		@Pc(7) long local7 = Static21.aLongArray3[Static15.anInt344];
		@Pc(10) long local10 = Static89.method1462();
		Static21.aLongArray3[Static15.anInt344] = local10;
		Static15.anInt344 = Static15.anInt344 + 1 & 0x1F;
		synchronized (this) {
			Static20.aBoolean29 = Static8.aBoolean8;
		}
		@Pc(52) boolean local52;
		if (local7 == 0L || local10 <= local7) {
			local52 = false;
		} else {
			local52 = true;
		}
		this.method277();
	}

	@OriginalMember(owner = "client!vd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static91.aFrame1 == null) {
			return Static4.aClass6_1 == null || Static4.aClass6_1.anApplet1 == this ? super.getAppletContext() : Static4.aClass6_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	protected abstract void method273();

	@OriginalMember(owner = "client!vd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!vd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static113.anApplet_Sub1_1 == this && !Static68.aBoolean60) {
			Static125.aLong95 = Static89.method1462() + 4000L;
		}
	}

	@OriginalMember(owner = "client!vd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Z")
	protected final boolean method275() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local8.length() > 0 && local8.charAt(local8.length() - 1) >= '0' && local8.charAt(local8.length() - 1) <= '9') {
				local8 = local8.substring(0, local8.length() - 1);
			}
			if (local8.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method286("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static8.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static6.aString3 != null) {
				@Pc(10) String local10 = Static6.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static6.aString1;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method286("wrongjava");
						return;
					}
					Static95.anInt2271 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static6.aString1 == null || Static6.aString1.equals("1.4.2"))) {
					this.method286("wrongjava");
					return;
				}
			}
			if (Static4.aClass6_1.anApplet1 != null) {
				@Pc(68) Method local68 = Static6.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static4.aClass6_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method287();
			Static90.aClass27_34 = Static11.method180(Static70.anInt1781, Static60.anInt1561, Static87.aCanvas1);
			this.method279();
			Static114.aClass4_1 = Static15.method225();
			Static114.aClass4_1.method1908();
			while (Static125.aLong95 == 0L || Static125.aLong95 > Static89.method1462()) {
				Static90.anInt2120 = Static114.aClass4_1.method1913(Static95.anInt2271, Static21.anInt712);
				for (@Pc(112) int local112 = 0; local112 < Static90.anInt2120; local112++) {
					this.method272();
				}
				this.method283();
				Static51.method946(true);
			}
		} catch (@Pc(138) Exception local138) {
			Static10.method172(null, local138);
			this.method286("crash");
		}
		this.method288();
	}

	@OriginalMember(owner = "client!vd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static91.aFrame1 == null) {
			return Static4.aClass6_1 == null || Static4.aClass6_1.anApplet1 == this ? super.getDocumentBase() : Static4.aClass6_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)V")
	protected abstract void method277();

	@OriginalMember(owner = "client!vd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static113.anApplet_Sub1_1 == this && !Static68.aBoolean60) {
			Static125.aLong95 = 0L;
		}
	}

	@OriginalMember(owner = "client!vd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!vd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static113.anApplet_Sub1_1 != this || Static68.aBoolean60) {
			return;
		}
		Static123.aBoolean128 = true;
		if (Static6.aString1 != null && Static6.aString1.startsWith("1.5") && Static89.method1462() - Static18.aLong24 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static60.anInt1561 && local28.height >= Static70.anInt1781) {
				Static87.aBoolean80 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!vd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static113.anApplet_Sub1_1 == this && !Static68.aBoolean60) {
			Static125.aLong95 = Static89.method1462();
			Static40.method822(5000L);
			Static106.aClass6_3 = null;
			this.method288();
		}
	}

	@OriginalMember(owner = "client!vd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	protected abstract void method279();

	@OriginalMember(owner = "client!vd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static8.aBoolean8 = true;
		Static123.aBoolean128 = true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;IIBII)V")
	protected final void method281(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static51.anInt1328 = 453;
			Static113.anApplet_Sub1_1 = this;
			Static60.anInt1561 = 765;
			Static70.anInt1781 = 503;
			Static91.aFrame1 = new Frame();
			Static91.aFrame1.setTitle("Jagex");
			Static91.aFrame1.setResizable(false);
			Static91.aFrame1.addWindowListener(this);
			Static91.aFrame1.setVisible(true);
			Static91.aFrame1.toFront();
			@Pc(35) Insets local35 = Static91.aFrame1.getInsets();
			Static91.aFrame1.setSize(local35.right + local35.left + 765, local35.top - -local35.bottom + 503);
			Static106.aClass6_3 = Static4.aClass6_1 = new Class6(true, null, arg1, arg0, 16);
			Static4.aClass6_1.method122(this, 1);
		} catch (@Pc(71) Exception local71) {
			Static10.method172(null, local71);
		}
	}

	@OriginalMember(owner = "client!vd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static91.aFrame1 == null) {
			return Static4.aClass6_1 == null || Static4.aClass6_1.anApplet1 == this ? super.getCodeBase() : Static4.aClass6_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V")
	private void method283() {
		@Pc(7) long local7 = Static121.aLongArray6[Static58.anInt1535];
		@Pc(10) long local10 = Static89.method1462();
		Static121.aLongArray6[Static58.anInt1535] = local10;
		if (local7 != 0L && local10 > local7) {
			@Pc(32) int local32 = (int) (local10 - local7);
			Static78.anInt1963 = ((local32 >> 1) + 32000) / local32;
		}
		Static58.anInt1535 = Static58.anInt1535 + 1 & 0x1F;
		if (Static81.anInt2039++ > 50) {
			Static123.aBoolean128 = true;
			Static81.anInt2039 -= 50;
			Static87.aCanvas1.setSize(Static60.anInt1561, Static70.anInt1781);
			Static87.aCanvas1.setVisible(true);
			if (Static91.aFrame1 == null) {
				Static87.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static91.aFrame1.getInsets();
				Static87.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method289();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V")
	protected final void method284(@OriginalArg(3) int arg0) {
		try {
			if (Static113.anApplet_Sub1_1 == null) {
				Static113.anApplet_Sub1_1 = this;
				Static60.anInt1561 = 765;
				Static51.anInt1328 = 453;
				Static70.anInt1781 = 503;
				if (Static4.aClass6_1 == null) {
					Static106.aClass6_3 = Static4.aClass6_1 = new Class6(false, this, arg0, null, 0);
				}
				Static4.aClass6_1.method122(this, 1);
			} else {
				Static75.anInt1862++;
				if (Static75.anInt1862 >= 3) {
					this.method286("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(57) Exception local57) {
			Static10.method172(null, local57);
			this.method286("crash");
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method286(@OriginalArg(0) String arg0) {
		if (this.aBoolean24) {
			return;
		}
		this.aBoolean24 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
	protected final synchronized void method287() {
		@Pc(10) Container local10;
		if (Static91.aFrame1 == null) {
			local10 = Static4.aClass6_1.anApplet1;
		} else {
			local10 = Static91.aFrame1;
		}
		if (Static87.aCanvas1 != null) {
			Static87.aCanvas1.removeFocusListener(this);
			local10.remove(Static87.aCanvas1);
		}
		Static87.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static87.aCanvas1);
		Static87.aCanvas1.setSize(Static60.anInt1561, Static70.anInt1781);
		Static87.aCanvas1.setVisible(true);
		if (Static91.aFrame1 == null) {
			Static87.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static91.aFrame1.getInsets();
			Static87.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static87.aCanvas1.addFocusListener(this);
		Static87.aCanvas1.requestFocus();
		Static123.aBoolean128 = true;
		Static87.aBoolean80 = false;
		Static18.aLong24 = Static89.method1462();
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	private synchronized void method288() {
		if (Static68.aBoolean60) {
			return;
		}
		Static68.aBoolean60 = true;
		try {
			Static87.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method273();
		} catch (@Pc(26) Exception local26) {
		}
		if (Static91.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		if (Static4.aClass6_1 != null) {
			try {
				Static4.aClass6_1.method125();
			} catch (@Pc(40) Exception local40) {
			}
		}
		this.method290();
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	protected abstract void method289();

	@OriginalMember(owner = "client!vd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
	protected abstract void method290();
}
