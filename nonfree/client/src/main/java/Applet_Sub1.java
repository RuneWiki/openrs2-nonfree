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

@OriginalClass("client!db")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!db", name = "B", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!db", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static37.aFrame1 == null) {
			return Static9.aClass74_1 == null || Static9.aClass74_1.anApplet1 == this ? super.getDocumentBase() : Static9.aClass74_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static76.aBoolean142 = true;
		Static82.aBoolean236 = true;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	protected abstract void method461();

	@OriginalMember(owner = "client!db", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!db", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static76.anApplet_Sub1_1 == this && !Static125.aBoolean209) {
			Static118.aLong90 = 0L;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
	protected final boolean method463() {
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
				this.method475("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static37.aFrame1 == null) {
			return Static9.aClass74_1 == null || Static9.aClass74_1.anApplet1 == this ? super.getAppletContext() : Static9.aClass74_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	protected abstract void method465();

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
	protected final synchronized void method466() {
		@Pc(14) Container local14;
		if (Static37.aFrame1 == null) {
			local14 = Static9.aClass74_1.anApplet1;
		} else {
			local14 = Static37.aFrame1;
		}
		if (Static119.aCanvas2 != null) {
			Static119.aCanvas2.removeFocusListener(this);
			local14.remove(Static119.aCanvas2);
		}
		Static119.aCanvas2 = new Canvas_Sub1(this);
		local14.add(Static119.aCanvas2);
		Static119.aCanvas2.setSize(Static106.anInt2842, Static55.anInt1311);
		Static119.aCanvas2.setVisible(true);
		if (Static37.aFrame1 == null) {
			Static119.aCanvas2.setLocation(0, 0);
		} else {
			@Pc(47) Insets local47 = Static37.aFrame1.getInsets();
			Static119.aCanvas2.setLocation(local47.left, local47.top);
		}
		Static119.aCanvas2.addFocusListener(this);
		Static119.aCanvas2.requestFocus();
		Static82.aBoolean236 = true;
		Static123.aBoolean242 = false;
		Static108.aLong86 = Static49.method877();
	}

	@OriginalMember(owner = "client!db", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!db", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static76.anApplet_Sub1_1 == this && !Static125.aBoolean209) {
			Static118.aLong90 = Static49.method877() + 4000L;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	protected abstract void method468();

	@OriginalMember(owner = "client!db", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static37.aFrame1 == null) {
			return Static9.aClass74_1 == null || Static9.aClass74_1.anApplet1 == this ? super.getCodeBase() : Static9.aClass74_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBII)V")
	protected final void method469(@OriginalArg(4) int arg0) {
		try {
			if (Static76.anApplet_Sub1_1 == null) {
				Static106.anInt2842 = 765;
				Static7.anInt192 = 454;
				Static55.anInt1311 = 503;
				Static76.anApplet_Sub1_1 = this;
				if (Static9.aClass74_1 == null) {
					Static18.aClass74_3 = Static9.aClass74_1 = new Class74(false, this, arg0, null, 0);
				}
				Static9.aClass74_1.method1875(1, this);
			} else {
				Static83.anInt2047++;
				if (Static83.anInt2047 >= 3) {
					this.method475("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(62) Exception local62) {
			Static53.method953(null, local62);
			this.method475("crash");
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	private void method470() {
		@Pc(7) long local7 = Static87.aLongArray8[Static19.anInt810];
		@Pc(10) long local10 = Static49.method877();
		Static87.aLongArray8[Static19.anInt810] = local10;
		if (local7 != 0L && local7 < local10) {
			@Pc(34) int local34 = (int) (local10 - local7);
			Static57.anInt1741 = ((local34 >> 1) + 32000) / local34;
		}
		Static19.anInt810 = Static19.anInt810 + 1 & 0x1F;
		if (Static15.anInt425++ > 50) {
			Static15.anInt425 -= 50;
			Static82.aBoolean236 = true;
			Static119.aCanvas2.setSize(Static106.anInt2842, Static55.anInt1311);
			Static119.aCanvas2.setVisible(true);
			if (Static37.aFrame1 == null) {
				Static119.aCanvas2.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static37.aFrame1.getInsets();
				Static119.aCanvas2.setLocation(local79.left, local79.top);
			}
		}
		this.method465();
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
	private synchronized void method471() {
		if (Static125.aBoolean209) {
			return;
		}
		Static125.aBoolean209 = true;
		try {
			Static119.aCanvas2.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method468();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static37.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static9.aClass74_1 != null) {
			try {
				Static9.aClass74_1.method1873();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method461();
	}

	@OriginalMember(owner = "client!db", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static76.anApplet_Sub1_1 != this || Static125.aBoolean209) {
			return;
		}
		Static82.aBoolean236 = true;
		if (Static116.aString5 != null && Static116.aString5.startsWith("1.5") && Static49.method877() - Static108.aLong86 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static106.anInt2842 && local28.height >= Static55.anInt1311) {
				Static123.aBoolean242 = true;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!db", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!db", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	protected abstract void method473();

	@OriginalMember(owner = "client!db", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static37.aFrame1 == null) {
			return Static9.aClass74_1 == null || Static9.aClass74_1.anApplet1 == this ? super.getParameter(arg0) : Static9.aClass74_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!db", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!db", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!db", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static76.anApplet_Sub1_1 == this && !Static125.aBoolean209) {
			Static118.aLong90 = Static49.method877();
			Static62.method1070(5000L);
			Static18.aClass74_3 = null;
			this.method471();
		}
	}

	@OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static116.aString3 != null) {
				@Pc(10) String local10 = Static116.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static116.aString5;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method475("wrongjava");
						return;
					}
					Static103.anInt2678 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static116.aString5 == null || Static116.aString5.equals("1.4.2"))) {
					this.method475("wrongjava");
					return;
				}
			}
			if (Static9.aClass74_1.anApplet1 != null) {
				@Pc(69) Method local69 = Static116.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static9.aClass74_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method466();
			Static38.aClass22_7 = Static70.method1128(Static119.aCanvas2, Static55.anInt1311, Static106.anInt2842);
			this.method476();
			Static14.aClass28_1 = Static105.method1438();
			Static14.aClass28_1.method716();
			while (Static118.aLong90 == 0L || Static49.method877() < Static118.aLong90) {
				Static89.anInt2171 = Static14.aClass28_1.method715(Static103.anInt2678, Static14.anInt417);
				for (@Pc(113) int local113 = 0; local113 < Static89.anInt2171; local113++) {
					this.method474();
				}
				this.method470();
				Static60.method1051(true);
			}
		} catch (@Pc(149) Exception local149) {
			Static53.method953(null, local149);
			this.method475("crash");
		}
		this.method471();
	}

	@OriginalMember(owner = "client!db", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static76.aBoolean142 = false;
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	private void method474() {
		@Pc(2) long local2 = Static49.method877();
		@Pc(10) long local10 = Static45.aLongArray6[Static30.anInt1075];
		@Pc(25) boolean local25;
		if (local10 == 0L || local2 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static45.aLongArray6[Static30.anInt1075] = local2;
		Static30.anInt1075 = Static30.anInt1075 + 1 & 0x1F;
		synchronized (this) {
			Static102.aBoolean199 = Static76.aBoolean142;
		}
		this.method473();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method475(@OriginalArg(0) String arg0) {
		if (this.aBoolean58) {
			return;
		}
		this.aBoolean58 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	protected abstract void method476();

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method477(@OriginalArg(3) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static76.anApplet_Sub1_1 = this;
			Static106.anInt2842 = 765;
			Static7.anInt192 = 454;
			Static55.anInt1311 = 503;
			Static37.aFrame1 = new Frame();
			Static37.aFrame1.setTitle("Jagex");
			Static37.aFrame1.setResizable(false);
			Static37.aFrame1.addWindowListener(this);
			Static37.aFrame1.setVisible(true);
			Static37.aFrame1.toFront();
			@Pc(28) Insets local28 = Static37.aFrame1.getInsets();
			Static37.aFrame1.setSize(local28.left + local28.right + 765, local28.top - -local28.bottom + 503);
			Static18.aClass74_3 = Static9.aClass74_1 = new Class74(true, null, arg1, arg0, 16);
			Static9.aClass74_1.method1875(1, this);
		} catch (@Pc(66) Exception local66) {
			Static53.method953(null, local66);
		}
	}

	@OriginalMember(owner = "client!db", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
