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

@OriginalClass("client!on")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!on", name = "w", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!on", name = "n", descriptor = "Z")
	private boolean aBoolean51 = false;

	static {
		new Class57("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!on", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static74.aBoolean127 = false;
	}

	@OriginalMember(owner = "client!on", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static218.aString47 != null) {
					@Pc(10) String local10 = Static218.aString47.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(24) String local24 = Static218.aString42;
						if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
							this.method886("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static218.aString42 == null || Static218.aString42.equals("1.4.2"))) {
						this.method886("wrongjava");
						break label111;
					}
				}
				@Pc(71) int local71;
				if (Static218.aString42 != null && Static218.aString42.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static218.aString42.length()) {
						@Pc(79) char local79 = Static218.aString42.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local73 = local73 * 10 + local79 - 48;
						local71++;
					}
					if (local73 >= 5) {
						Static261.aBoolean363 = true;
					}
				}
				if (Static61.aClass156_1.anApplet1 != null) {
					@Pc(117) Method local117 = Static218.aMethod2;
					if (local117 != null) {
						try {
							local117.invoke(Static61.aClass156_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(132) Throwable local132) {
						}
					}
				}
				Static366.method4385();
				Static368.method5519();
				this.method896();
				this.method892();
				Static169.aClass34_1 = Static73.method1284();
				this.method899();
				while (Static187.aLong131 == 0L || Static187.aLong131 > Static288.method4512()) {
					Static20.anInt255 = Static169.aClass34_1.method3922(Static334.anInt5686);
					for (local71 = 0; local71 < Static20.anInt255; local71++) {
						this.method893();
					}
					this.method898();
					Static182.method2842(Static61.aClass156_1, Static173.aCanvas2);
				}
			}
		} catch (@Pc(191) Exception local191) {
			Static355.method5328(null, local191);
			this.method886("crash");
		}
		this.method891(true);
	}

	@OriginalMember(owner = "client!on", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method886(@OriginalArg(1) String arg0) {
		if (this.aBoolean51) {
			return;
		}
		this.aBoolean51 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static398.method1714(Static61.aClass156_1.anApplet1, "loggedout");
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!on", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static34.aFrame1 == null) {
			return Static61.aClass156_1 == null || Static61.aClass156_1.anApplet1 == this ? super.getDocumentBase() : Static61.aClass156_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	protected abstract void method889();

	@OriginalMember(owner = "client!on", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static299.anApplet_Sub1_1 != this || Static378.aBoolean491) {
			return;
		}
		Static122.aBoolean179 = true;
		if (Static261.aBoolean363 && Static288.method4512() - Static91.aLong116 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || Static276.anInt4800 <= local23.width && local23.height >= Static177.anInt3088) {
				Static175.aBoolean237 = true;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static299.anApplet_Sub1_1 == this && !Static378.aBoolean491) {
			Static187.aLong131 = Static288.method4512() + 4000L;
		}
	}

	@OriginalMember(owner = "client!on", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILjava/lang/String;IZIII)V")
	protected final void method890(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		try {
			Static125.anInt2386 = 0;
			Static199.anInt3567 = 1024;
			Static276.anInt4800 = 1024;
			Static207.anInt2251 = 768;
			Static177.anInt3088 = 768;
			Static266.anInt4709 = 577;
			Static299.anApplet_Sub1_1 = this;
			Static92.anInt1900 = 0;
			Static34.aFrame1 = new Frame();
			Static34.aFrame1.setTitle("Jagex");
			Static34.aFrame1.setResizable(true);
			Static34.aFrame1.addWindowListener(this);
			Static34.aFrame1.setVisible(true);
			Static34.aFrame1.toFront();
			@Pc(42) Insets local42 = Static34.aFrame1.getInsets();
			Static34.aFrame1.setSize(local42.left + Static276.anInt4800 + local42.right, local42.top + (Static177.anInt3088 - -local42.bottom));
			Static275.aClass156_4 = Static61.aClass156_1 = new Class156(null, arg0, arg1, 29);
			@Pc(76) Class133 local76 = Static61.aClass156_1.method3658(this, 1);
			while (local76.anInt3257 == 0) {
				Static37.method613(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static355.method5328(null, local89);
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(ZI)V")
	private void method891(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static378.aBoolean491) {
				return;
			}
			Static378.aBoolean491 = true;
		}
		if (Static61.aClass156_1.anApplet1 != null) {
			Static61.aClass156_1.anApplet1.destroy();
		}
		try {
			this.method895();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean52) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean52 = false;
		}
		@Pc(53) Class133 local53 = Static61.aClass156_1.method3655(Static299.anApplet_Sub1_1.getClass());
		while (local53.anInt3257 == 0) {
			Static37.method613(100L);
		}
		if (Static173.aCanvas2 != null) {
			try {
				Static173.aCanvas2.removeFocusListener(this);
				Static173.aCanvas2.getParent().remove(Static173.aCanvas2);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static61.aClass156_1 != null) {
			try {
				Static61.aClass156_1.method3647();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method889();
		if (Static34.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(90) Throwable local90) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	protected abstract void method892();

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	private void method893() {
		@Pc(6) long local6 = Static288.method4512();
		@Pc(10) long local10 = Static347.aLongArray7[Static326.anInt5554];
		Static347.aLongArray7[Static326.anInt5554] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static326.anInt5554 = Static326.anInt5554 + 1 & 0x1F;
		synchronized (this) {
			Static245.aBoolean344 = Static74.aBoolean127;
		}
		this.method901();
	}

	@OriginalMember(owner = "client!on", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static299.anApplet_Sub1_1 == this && !Static378.aBoolean491) {
			Static187.aLong131 = Static288.method4512();
			Static37.method613(5000L);
			Static275.aClass156_4 = null;
			this.method891(false);
		}
	}

	@OriginalMember(owner = "client!on", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!on", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	protected abstract void method895();

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
	public final synchronized void method896() {
		if (Static173.aCanvas2 != null) {
			Static173.aCanvas2.removeFocusListener(this);
			Static173.aCanvas2.getParent().remove(Static173.aCanvas2);
		}
		@Pc(18) Container local18;
		if (Static225.aFrame2 != null) {
			local18 = Static225.aFrame2;
		} else if (Static34.aFrame1 == null) {
			local18 = Static61.aClass156_1.anApplet1;
		} else {
			local18 = Static34.aFrame1;
		}
		local18.setLayout(null);
		Static173.aCanvas2 = new Canvas_Sub1(this);
		local18.add(Static173.aCanvas2);
		Static173.aCanvas2.setSize(Static199.anInt3567, Static207.anInt2251);
		Static173.aCanvas2.setVisible(true);
		if (local18 == Static34.aFrame1) {
			@Pc(60) Insets local60 = Static34.aFrame1.getInsets();
			Static173.aCanvas2.setLocation(local60.left + Static125.anInt2386, Static92.anInt1900 + local60.top);
		} else {
			Static173.aCanvas2.setLocation(Static125.anInt2386, Static92.anInt1900);
		}
		Static173.aCanvas2.addFocusListener(this);
		Static173.aCanvas2.requestFocus();
		Static245.aBoolean344 = true;
		Static74.aBoolean127 = true;
		Static122.aBoolean179 = true;
		Static175.aBoolean237 = false;
		Static91.aLong116 = Static288.method4512();
	}

	@OriginalMember(owner = "client!on", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)Z")
	protected final boolean method897() {
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
				this.method886("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
	private void method898() {
		@Pc(8) long local8 = Static288.method4512();
		@Pc(12) long local12 = Static125.aLongArray4[Static90.anInt1855];
		Static125.aLongArray4[Static90.anInt1855] = local8;
		if (local12 != 0L && local8 > local12) {
			@Pc(33) int local33 = (int) (local8 - local12);
			Static296.anInt5115 = ((local33 >> 1) + 32000) / local33;
		}
		Static90.anInt1855 = Static90.anInt1855 + 1 & 0x1F;
		if (Static120.anInt2266++ > 50) {
			Static120.anInt2266 -= 50;
			Static122.aBoolean179 = true;
			Static173.aCanvas2.setSize(Static199.anInt3567, Static207.anInt2251);
			Static173.aCanvas2.setVisible(true);
			if (Static34.aFrame1 != null && Static225.aFrame2 == null) {
				@Pc(82) Insets local82 = Static34.aFrame1.getInsets();
				Static173.aCanvas2.setLocation(Static125.anInt2386 + local82.left, Static92.anInt1900 + local82.top);
			} else {
				Static173.aCanvas2.setLocation(Static125.anInt2386, Static92.anInt1900);
			}
		}
		this.method904();
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V")
	public final void method899() {
		if (this.aBoolean52) {
			return;
		}
		try {
			@Pc(22) Class133 local22 = Static61.aClass156_1.method3650(Static299.anApplet_Sub1_1.getClass());
			while (local22.anInt3257 == 0) {
				Static37.method613(100L);
			}
			if (local22.anObject3 != null) {
				throw (Throwable) local22.anObject3;
			}
			jagmisc.init();
			this.aBoolean52 = true;
			Static169.aClass34_1 = Static73.method1284();
		} catch (@Pc(50) Throwable local50) {
		}
	}

	@OriginalMember(owner = "client!on", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static299.anApplet_Sub1_1 == this && !Static378.aBoolean491) {
			Static187.aLong131 = 0L;
		}
	}

	@OriginalMember(owner = "client!on", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static74.aBoolean127 = true;
		Static122.aBoolean179 = true;
	}

	@OriginalMember(owner = "client!on", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static34.aFrame1 == null) {
			return Static61.aClass156_1 == null || Static61.aClass156_1.anApplet1 == this ? super.getParameter(arg0) : Static61.aClass156_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V")
	protected final void method900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static299.anApplet_Sub1_1 == null) {
				Static207.anInt2251 = arg0;
				Static177.anInt3088 = arg0;
				Static125.anInt2386 = 0;
				Static92.anInt1900 = 0;
				Static299.anApplet_Sub1_1 = this;
				Static199.anInt3567 = arg2;
				Static276.anInt4800 = arg2;
				Static266.anInt4709 = 577;
				if (Static61.aClass156_1 == null) {
					Static275.aClass156_4 = Static61.aClass156_1 = new Class156(this, arg1, null, 0);
				}
				@Pc(68) Class133 local68 = Static61.aClass156_1.method3658(this, 1);
				while (local68.anInt3257 == 0) {
					Static37.method613(10L);
				}
			} else {
				Static364.anInt6110++;
				if (Static364.anInt6110 >= 3) {
					this.method886("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Exception local81) {
			Static355.method5328(null, local81);
			this.method886("crash");
		}
	}

	@OriginalMember(owner = "client!on", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static34.aFrame1 == null) {
			return Static61.aClass156_1 == null || Static61.aClass156_1.anApplet1 == this ? super.getCodeBase() : Static61.aClass156_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V")
	protected abstract void method901();

	@OriginalMember(owner = "client!on", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static34.aFrame1 == null) {
			return Static61.aClass156_1 == null || Static61.aClass156_1.anApplet1 == this ? super.getAppletContext() : Static61.aClass156_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!on", name = "g", descriptor = "(I)V")
	protected abstract void method904();
}
