import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
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

@OriginalClass("client!kn")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!kn", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	protected abstract void method1025();

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
	private void method1026(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static384.aBoolean443) {
				return;
			}
			Static384.aBoolean443 = true;
		}
		if (Static32.aClass51_1.anApplet1 != null) {
			Static32.aClass51_1.anApplet1.destroy();
		}
		try {
			this.method1025();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean66) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean66 = false;
		}
		Static115.method1852();
		@Pc(58) Class181 local58 = Static32.aClass51_1.method1365(Static90.anApplet_Sub1_1.getClass());
		while (local58.anInt5298 == 0) {
			Static83.method1499(100L);
		}
		if (Static151.aCanvas2 != null) {
			try {
				Static151.aCanvas2.removeFocusListener(this);
				Static151.aCanvas2.getParent().remove(Static151.aCanvas2);
			} catch (@Pc(77) Exception local77) {
			}
		}
		if (Static32.aClass51_1 != null) {
			try {
				Static32.aClass51_1.method1370();
			} catch (@Pc(85) Exception local85) {
			}
		}
		this.method1033();
		if (Static456.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(97) Throwable local97) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public final synchronized void method1027() {
		if (Static151.aCanvas2 != null) {
			Static151.aCanvas2.removeFocusListener(this);
			Static151.aCanvas2.getParent().remove(Static151.aCanvas2);
		}
		@Pc(18) Container local18;
		if (Static52.aFrame1 != null) {
			local18 = Static52.aFrame1;
		} else if (Static456.aFrame2 == null) {
			local18 = Static32.aClass51_1.anApplet1;
		} else {
			local18 = Static456.aFrame2;
		}
		local18.setLayout(null);
		Static151.aCanvas2 = new Canvas_Sub1(this);
		local18.add(Static151.aCanvas2);
		Static151.aCanvas2.setSize(Static310.anInt5307, Static166.anInt3014);
		Static151.aCanvas2.setVisible(true);
		if (local18 == Static456.aFrame2) {
			@Pc(54) Insets local54 = Static456.aFrame2.getInsets();
			Static151.aCanvas2.setLocation(Static229.anInt3847 + local54.left, Static159.anInt2944 + local54.top);
		} else {
			Static151.aCanvas2.setLocation(Static229.anInt3847, Static159.anInt2944);
		}
		Static151.aCanvas2.addFocusListener(this);
		Static151.aCanvas2.requestFocus();
		Static58.aBoolean72 = true;
		Static104.aBoolean114 = true;
		Static99.aBoolean112 = true;
		Static413.aBoolean473 = false;
		Static57.aLong41 = Static354.method4966();
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(Z)V")
	protected abstract void method1028();

	@OriginalMember(owner = "client!kn", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static90.anApplet_Sub1_1 == this && !Static384.aBoolean443) {
			Static403.aLong223 = Static354.method4966();
			Static83.method1499(5000L);
			Static106.aClass51_5 = null;
			this.method1026(false);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIILjava/lang/String;IIZ)V")
	protected final void method1030(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static229.anInt3847 = 0;
			Static332.anInt5532 = 603;
			Static166.anInt3014 = 768;
			Static199.anInt3571 = 768;
			Static159.anInt2944 = 0;
			Static310.anInt5307 = 1024;
			Static277.anInt5005 = 1024;
			Static90.anApplet_Sub1_1 = this;
			Static456.aFrame2 = new Frame();
			Static456.aFrame2.setTitle("Jagex");
			Static456.aFrame2.setResizable(true);
			Static456.aFrame2.addWindowListener(this);
			Static456.aFrame2.setVisible(true);
			Static456.aFrame2.toFront();
			@Pc(47) Insets local47 = Static456.aFrame2.getInsets();
			Static456.aFrame2.setSize(Static277.anInt5005 + local47.left + local47.right, local47.bottom + local47.top + Static199.anInt3571);
			Static106.aClass51_5 = Static32.aClass51_1 = new Class51(null, arg0, arg1, 30);
			@Pc(80) Class181 local80 = Static32.aClass51_1.method1385(1, this);
			while (local80.anInt5298 == 0) {
				Static83.method1499(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static120.method1926(null, local90);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BIIII)V")
	protected final void method1032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static90.anApplet_Sub1_1 == null) {
				Static229.anInt3847 = 0;
				Static166.anInt3014 = arg0;
				Static199.anInt3571 = arg0;
				Static90.anApplet_Sub1_1 = this;
				Static310.anInt5307 = arg2;
				Static277.anInt5005 = arg2;
				Static159.anInt2944 = 0;
				Static332.anInt5532 = 603;
				if (Static32.aClass51_1 == null) {
					Static106.aClass51_5 = Static32.aClass51_1 = new Class51(this, arg1, null, 0);
				}
				@Pc(64) Class181 local64 = Static32.aClass51_1.method1385(1, this);
				while (local64.anInt5298 == 0) {
					Static83.method1499(10L);
				}
			} else {
				Static9.anInt117++;
				if (Static9.anInt117 >= 3) {
					this.method1042("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Throwable local74) {
			Static120.method1926(null, local74);
			this.method1042("crash");
		}
	}

	@OriginalMember(owner = "client!kn", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static90.anApplet_Sub1_1 != this || Static384.aBoolean443) {
			return;
		}
		Static99.aBoolean112 = true;
		if (Static188.aBoolean262 && Static354.method4966() - Static57.aLong41 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static277.anInt5005 && Static199.anInt3571 <= local24.height) {
				Static413.aBoolean473 = true;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	protected abstract void method1033();

	@OriginalMember(owner = "client!kn", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static456.aFrame2 == null) {
			return Static32.aClass51_1 == null || Static32.aClass51_1.anApplet1 == this ? super.getParameter(arg0) : Static32.aClass51_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static456.aFrame2 == null) {
			return Static32.aClass51_1 == null || Static32.aClass51_1.anApplet1 == this ? super.getAppletContext() : Static32.aClass51_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static75.aString21 != null) {
					@Pc(6) String local6 = Static75.aString21.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static75.aString15;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method1042("wrongjava");
							break label108;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static75.aString15 == null || Static75.aString15.equals("1.4.2"))) {
						this.method1042("wrongjava");
						break label108;
					}
				}
				@Pc(66) int local66;
				if (Static75.aString15 != null && Static75.aString15.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (local66 < Static75.aString15.length()) {
						@Pc(74) char local74 = Static75.aString15.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local68 = local68 * 10 + local74 - 48;
						local66++;
					}
					if (local68 >= 5) {
						Static188.aBoolean262 = true;
					}
				}
				if (Static32.aClass51_1.anApplet1 != null) {
					@Pc(110) Method local110 = Static75.aMethod1;
					if (local110 != null) {
						try {
							local110.invoke(Static32.aClass51_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(125) Throwable local125) {
						}
					}
				}
				Static183.method2884();
				Static452.method6156();
				this.method1027();
				this.method1036();
				this.method1035();
				Static369.aClass63_1 = Static170.method2610();
				this.method1036();
				while (Static403.aLong223 == 0L || Static354.method4966() < Static403.aLong223) {
					Static345.anInt5821 = Static369.aClass63_1.method4643(Static81.anInt1468);
					for (local66 = 0; local66 < Static345.anInt5821; local66++) {
						this.method1041();
					}
					this.method1040();
					Static121.method1944(Static151.aCanvas2, Static32.aClass51_1);
				}
			}
		} catch (@Pc(183) Throwable local183) {
			Static120.method1926(this.method1037(), local183);
			this.method1042("crash");
		}
		this.method1026(true);
	}

	@OriginalMember(owner = "client!kn", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static456.aFrame2 == null) {
			return Static32.aClass51_1 == null || Static32.aClass51_1.anApplet1 == this ? super.getDocumentBase() : Static32.aClass51_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static90.anApplet_Sub1_1 == this && !Static384.aBoolean443) {
			Static403.aLong223 = 0L;
		}
	}

	@OriginalMember(owner = "client!kn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean114 = true;
		Static99.aBoolean112 = true;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	protected abstract void method1034();

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
	protected abstract void method1035();

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
	public final void method1036() {
		if (this.aBoolean66) {
			return;
		}
		try {
			@Pc(20) Class181 local20 = Static32.aClass51_1.method1383(Static90.anApplet_Sub1_1.getClass());
			while (local20.anInt5298 == 0) {
				Static83.method1499(100L);
			}
			if (local20.anObject7 != null) {
				throw (Throwable) local20.anObject7;
			}
			jagmisc.init();
			this.aBoolean66 = true;
			Static369.aClass63_1 = Static170.method2610();
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1037() {
		return null;
	}

	@OriginalMember(owner = "client!kn", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static456.aFrame2 == null) {
			return Static32.aClass51_1 == null || Static32.aClass51_1.anApplet1 == this ? super.getCodeBase() : Static32.aClass51_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)Z")
	protected final boolean method1038() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.equals("stellardawn.com") || local8.endsWith(".stellardawn.com")) {
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
				this.method1042("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "(I)V")
	private void method1040() {
		@Pc(6) long local6 = Static354.method4966();
		@Pc(10) long local10 = Static64.aLongArray4[Static195.anInt3529];
		Static64.aLongArray4[Static195.anInt3529] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static128.anInt2338 = ((local34 >> 1) + 32000) / local34;
		}
		Static195.anInt3529 = Static195.anInt3529 + 1 & 0x1F;
		if (Static170.anInt3087++ > 50) {
			Static99.aBoolean112 = true;
			Static170.anInt3087 -= 50;
			Static151.aCanvas2.setSize(Static310.anInt5307, Static166.anInt3014);
			Static151.aCanvas2.setVisible(true);
			if (Static456.aFrame2 != null && Static52.aFrame1 == null) {
				@Pc(76) Insets local76 = Static456.aFrame2.getInsets();
				Static151.aCanvas2.setLocation(local76.left + Static229.anInt3847, local76.top + Static159.anInt2944);
			} else {
				Static151.aCanvas2.setLocation(Static229.anInt3847, Static159.anInt2944);
			}
		}
		this.method1028();
	}

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "(I)V")
	private void method1041() {
		@Pc(6) long local6 = Static354.method4966();
		@Pc(10) long local10 = Static126.aLongArray6[Static314.anInt5337];
		Static126.aLongArray6[Static314.anInt5337] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static314.anInt5337 = Static314.anInt5337 + 1 & 0x1F;
		synchronized (this) {
			Static58.aBoolean72 = Static104.aBoolean114;
		}
		this.method1034();
	}

	@OriginalMember(owner = "client!kn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean114 = false;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1042(@OriginalArg(0) String arg0) {
		if (this.aBoolean67) {
			return;
		}
		this.aBoolean67 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static473.method5059(Static32.aClass51_1.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!kn", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!kn", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kn", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static90.anApplet_Sub1_1 == this && !Static384.aBoolean443) {
			Static403.aLong223 = Static354.method4966() + 4000L;
		}
	}

	@OriginalMember(owner = "client!kn", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!kn", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
