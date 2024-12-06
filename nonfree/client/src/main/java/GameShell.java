import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;
	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!dc;")
	public static SignLink aClass17_3;
	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!dc;")
	public static SignLink aClass17_4;
	@OriginalMember(owner = "client!j", name = "bb", descriptor = "Lclient!lf;")
	public static GameShell anApplet_Sub1_1 = null;
	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	public static int anInt685;
	@OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
	public static int anInt2572;
	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	public static int anInt2947;
	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "J")
	public static long aLong41 = 0L;
	@OriginalMember(owner = "client!j", name = "eb", descriptor = "Z")
	public static boolean aBoolean139 = false;
	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;
	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Z")
	public static boolean aBoolean234;
	@OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean55 = true;
	@OriginalMember(owner = "client!s", name = "f", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];
	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public static int anInt3083;
	@OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean1 = true;
	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean285 = false;
	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static int anInt1798 = 1;
	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!gf;")
	public static PixMap drawArea;
	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!ba;")
	public static Timer aClass7_1;
	@OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
	public static int anInt2315;
	@OriginalMember(owner = "client!ja", name = "d", descriptor = "J")
	public static volatile long aLong47 = 0L;
	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];
	@OriginalMember(owner = "client!q", name = "Xc", descriptor = "I")
	public static int anInt2523;
	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public static int anInt2200 = 0;
	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt2533 = 500;
	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	public static int anInt3151 = 0;
	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/Object;Lclient!dc;I)V")
	public static void method904(@OriginalArg(0) Object arg0, @OriginalArg(1) SignLink arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static46.method889(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		aBoolean55 = false;
	}

	@OriginalMember(owner = "client!lf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (aFrame1 == null) {
			return aClass17_4 == null || aClass17_4.anApplet1 == this ? super.getParameter(arg0) : aClass17_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	protected abstract void mainloop();

	@OriginalMember(owner = "client!lf", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (anApplet_Sub1_1 == this && !aBoolean139) {
			aLong41 = 0L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
	protected final boolean method337() {
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
				this.method352("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (aFrame1 == null) {
			return aClass17_4 == null || aClass17_4.anApplet1 == this ? super.getCodeBase() : aClass17_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	protected abstract void method338();

	@OriginalMember(owner = "client!lf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void initApplication(@OriginalArg(3) String arg0, @OriginalArg(6) int arg1) {
		try {
			anApplet_Sub1_1 = this;
			anInt685 = 503;
			anInt2572 = 468;
			anInt2947 = 765;
			aFrame1 = new Frame();
			aFrame1.setTitle("Jagex");
			aFrame1.setResizable(false);
			aFrame1.addWindowListener(this);
			aFrame1.setVisible(true);
			aFrame1.toFront();
			@Pc(32) Insets local32 = aFrame1.getInsets();
			aFrame1.setSize(local32.right + local32.left + 765, local32.bottom + (503 - -local32.top));
			aClass17_3 = aClass17_4 = new SignLink(true, null, arg1, arg0, 16);
			aClass17_4.method383(1, this);
		} catch (@Pc(70) Exception local70) {
			JagException.report(local70, null);
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	protected abstract void method341();

	@OriginalMember(owner = "client!lf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (aFrame1 == null) {
			return aClass17_4 == null || aClass17_4.anApplet1 == this ? super.getAppletContext() : aClass17_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (anApplet_Sub1_1 == this && !aBoolean139) {
			aLong41 = Static44.method861() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	private synchronized void method342() {
		if (aBoolean139) {
			return;
		}
		aBoolean139 = true;
		try {
			aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method344();
		} catch (@Pc(24) Exception local24) {
		}
		if (aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (aClass17_4 != null) {
			try {
				aClass17_4.method384();
			} catch (@Pc(40) Exception local40) {
			}
		}
		this.method341();
	}

	@OriginalMember(owner = "client!lf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	private void mainloopwrapper() {
		@Pc(6) long local6 = Static44.method861();
		@Pc(10) long local10 = aLongArray6[anInt3083];
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		aLongArray6[anInt3083] = local6;
		anInt3083 = anInt3083 + 1 & 0x1F;
		synchronized (this) {
			aBoolean234 = aBoolean55;
		}
		this.mainloop();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	protected abstract void method344();

	@OriginalMember(owner = "client!lf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		aBoolean55 = true;
		aBoolean1 = true;
	}

	@OriginalMember(owner = "client!lf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (anApplet_Sub1_1 != this || aBoolean139) {
			return;
		}
		aBoolean1 = true;
		if (SignLink.aString2 != null && SignLink.aString2.startsWith("1.5") && Static44.method861() - aLong47 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= anInt2947 && anInt685 <= local28.height) {
				aBoolean285 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (SignLink.aString3 != null) {
				@Pc(10) String local10 = SignLink.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = SignLink.aString2;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method352("wrongjava");
						return;
					}
					anInt1798 = 5;
				} else if (local10.indexOf("ibm") != -1 && (SignLink.aString2 == null || SignLink.aString2.equals("1.4.2"))) {
					this.method352("wrongjava");
					return;
				}
			}
			if (aClass17_4.anApplet1 != null) {
				@Pc(69) Method local69 = SignLink.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(aClass17_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method347();
			drawArea = Static110.method1775(anInt685, anInt2947, aCanvas1);
			this.method338();
			aClass7_1 = Static68.method340();
			while (aLong41 == 0L || Static44.method861() < aLong41) {
				anInt2315 = aClass7_1.method1574(Static79.anInt2178, anInt1798);
				for (@Pc(110) int local110 = 0; local110 < anInt2315; local110++) {
					this.mainloopwrapper();
				}
				this.mainredrawwrapper();
				method904(aCanvas1, aClass17_4);
			}
		} catch (@Pc(141) Exception local141) {
			JagException.report(local141, null);
			this.method352("crash");
		}
		this.method342();
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	protected final synchronized void method347() {
		@Pc(10) Container local10;
		if (aFrame1 == null) {
			local10 = aClass17_4.anApplet1;
		} else {
			local10 = aFrame1;
		}
		if (aCanvas1 != null) {
			aCanvas1.removeFocusListener(this);
			local10.remove(aCanvas1);
		}
		aCanvas1 = new GameCanvas(this);
		local10.add(aCanvas1);
		aCanvas1.setSize(anInt2947, anInt685);
		aCanvas1.setVisible(true);
		if (aFrame1 == null) {
			aCanvas1.setLocation(0, 0);
		} else {
			@Pc(48) Insets local48 = aFrame1.getInsets();
			aCanvas1.setLocation(local48.left, local48.top);
		}
		aCanvas1.addFocusListener(this);
		aCanvas1.requestFocus();
		aBoolean1 = true;
		aBoolean285 = false;
		aLong47 = Static44.method861();
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	private void mainredrawwrapper() {
		@Pc(6) long local6 = Static44.method861();
		@Pc(14) long local14 = aLongArray2[anInt2523];
		aLongArray2[anInt2523] = local6;
		anInt2523 = anInt2523 + 1 & 0x1F;
		if (local14 != 0L && local14 < local6) {
			@Pc(39) int local39 = (int) (local6 - local14);
			anInt2200 = ((local39 >> 1) + 32000) / local39;
		}
		if (anInt2533++ > 50) {
			aBoolean1 = true;
			anInt2533 -= 50;
			aCanvas1.setSize(anInt2947, anInt685);
			aCanvas1.setVisible(true);
			if (aFrame1 == null) {
				aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = aFrame1.getInsets();
				aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.mainredraw();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	protected final void method349(@OriginalArg(1) int arg0) {
		try {
			if (anApplet_Sub1_1 == null) {
				anApplet_Sub1_1 = this;
				anInt2947 = 765;
				anInt685 = 503;
				anInt2572 = 468;
				if (aClass17_4 == null) {
					aClass17_3 = aClass17_4 = new SignLink(false, this, arg0, null, 0);
				}
				aClass17_4.method383(1, this);
			} else {
				anInt3151++;
				if (anInt3151 >= 3) {
					this.method352("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(60) Exception local60) {
			JagException.report(local60, null);
			this.method352("crash");
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lf", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (aFrame1 == null) {
			return aClass17_4 == null || aClass17_4.anApplet1 == this ? super.getDocumentBase() : aClass17_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	protected abstract void mainredraw();

	@OriginalMember(owner = "client!lf", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (anApplet_Sub1_1 == this && !aBoolean139) {
			aLong41 = Static44.method861();
			Static46.method889(5000L);
			aClass17_3 = null;
			this.method342();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method352(@OriginalArg(1) String arg0) {
		if (this.aBoolean47) {
			return;
		}
		this.aBoolean47 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!lf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}
}
