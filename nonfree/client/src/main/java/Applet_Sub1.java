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

@OriginalClass("client!of")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!of", name = "providesignlink", descriptor = "(Lclient!mi;)V")
	public static void providesignlink(@OriginalArg(0) Class72 arg0) {
		Static51.aClass72_3 = arg0;
		Static150.aClass72_4 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public final synchronized void method563() {
		if (Static36.aCanvas1 != null) {
			Static36.aCanvas1.removeFocusListener(this);
			Static36.aCanvas1.getParent().remove(Static36.aCanvas1);
		}
		if (Static107.aCanvas2 != null) {
			Static107.aCanvas2.getParent().remove(Static107.aCanvas2);
			Static107.aCanvas2 = null;
		}
		@Pc(26) Container local26;
		if (Static200.aFrame2 != null) {
			local26 = Static200.aFrame2;
		} else if (Static95.aFrame1 == null) {
			local26 = Static51.aClass72_3.anApplet1;
		} else {
			local26 = Static95.aFrame1;
		}
		local26.setLayout(null);
		@Pc(64) Insets local64;
		if (Static111.anInt2460 != 0) {
			Static107.aCanvas2 = new Canvas_Sub1(this);
			local26.add(Static107.aCanvas2);
			Static107.aCanvas2.setSize(Static185.anInt4016, Static111.anInt2460);
			Static107.aCanvas2.setVisible(true);
			if (local26 == Static95.aFrame1) {
				local64 = Static95.aFrame1.getInsets();
				Static107.aCanvas2.setLocation(local64.left, local64.top);
			} else {
				Static107.aCanvas2.setLocation(0, 0);
			}
		}
		Static36.aCanvas1 = new Canvas_Sub1(this);
		local26.add(Static36.aCanvas1);
		Static36.aCanvas1.setSize(Static185.anInt4016, Static90.anInt4701);
		Static36.aCanvas1.setVisible(true);
		if (local26 == Static95.aFrame1) {
			local64 = Static95.aFrame1.getInsets();
			Static36.aCanvas1.setLocation(local64.left, Static111.anInt2460 + local64.top);
		} else {
			Static36.aCanvas1.setLocation(0, Static111.anInt2460);
		}
		Static36.aCanvas1.addFocusListener(this);
		Static36.aCanvas1.requestFocus();
		Static124.aBoolean205 = true;
		Static24.aBoolean25 = true;
		Static88.aBoolean89 = true;
		Static85.aBoolean88 = false;
		Static55.aLong39 = Static144.method2489();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	protected abstract void method564();

	@OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static130.aString3 != null) {
				@Pc(10) String local10 = Static130.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static130.aString4;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method566("wrongjava");
						return;
					}
					Static114.anInt2484 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static130.aString4 == null || Static130.aString4.equals("1.4.2"))) {
					this.method566("wrongjava");
					return;
				}
			}
			if (Static51.aClass72_3.anApplet1 != null) {
				@Pc(68) Method local68 = Static130.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static51.aClass72_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method563();
			Static210.aClass19_1 = Static195.method2072(Static185.anInt4016, Static90.anInt4701, Static36.aCanvas1);
			this.method575();
			Static39.aClass24_1 = Static62.method1085();
			while (Static110.aLong46 == 0L || Static144.method2489() < Static110.aLong46) {
				Static201.anInt4262 = Static39.aClass24_1.method1679(Static114.anInt2484, Static10.anInt227);
				for (@Pc(109) int local109 = 0; local109 < Static201.anInt4262; local109++) {
					this.method570();
				}
				this.method576();
				Static145.method2494(Static36.aCanvas1, Static51.aClass72_3);
			}
		} catch (@Pc(146) Exception local146) {
			Static34.method595(null, local146);
			this.method566("crash");
		}
		this.method574(true);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
	protected final boolean method565() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method566("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method566(@OriginalArg(0) String arg0) {
		if (this.aBoolean32) {
			return;
		}
		this.aBoolean32 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!of", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static218.anApplet_Sub1_5 != this || Static154.aBoolean162) {
			return;
		}
		Static88.aBoolean89 = true;
		if (Static130.aString4 != null && Static130.aString4.startsWith("1.5") && Static144.method2489() - Static55.aLong39 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static185.anInt4016 && local28.height >= Static90.anInt4701) {
				Static85.aBoolean88 = true;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIILjava/lang/String;II)V")
	protected final void method568(@OriginalArg(4) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static185.anInt4016 = 765;
			Static218.anApplet_Sub1_5 = this;
			Static31.anInt696 = 503;
			Static90.anInt4701 = 503;
			Static95.aFrame1 = new Frame();
			Static95.aFrame1.setTitle("Jagex");
			Static95.aFrame1.setResizable(false);
			Static95.aFrame1.addWindowListener(this);
			Static95.aFrame1.setVisible(true);
			Static95.aFrame1.toFront();
			@Pc(32) Insets local32 = Static95.aFrame1.getInsets();
			Static95.aFrame1.setSize(local32.left + local32.right + 765, local32.bottom + (503 - -local32.top));
			Static150.aClass72_4 = Static51.aClass72_3 = new Class72(true, null, arg1, arg0, 27);
			Static51.aClass72_3.method2246(this, 1);
		} catch (@Pc(68) Exception local68) {
			Static34.method595(null, local68);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	protected abstract void method569();

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
	private void method570() {
		@Pc(6) long local6 = Static144.method2489();
		@Pc(14) long local14 = Static125.aLongArray10[Static51.anInt1229];
		@Pc(25) boolean local25;
		if (local14 == 0L || local6 <= local14) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static125.aLongArray10[Static51.anInt1229] = local6;
		Static51.anInt1229 = Static51.anInt1229 + 1 & 0x1F;
		synchronized (this) {
			Static24.aBoolean25 = Static124.aBoolean205;
		}
		this.method572();
	}

	@OriginalMember(owner = "client!of", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static95.aFrame1 == null) {
			return Static51.aClass72_3 == null || Static51.aClass72_3.anApplet1 == this ? super.getParameter(arg0) : Static51.aClass72_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
	protected abstract void method571();

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	protected abstract void method572();

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
	protected final void method573(@OriginalArg(3) int arg0) {
		try {
			if (Static218.anApplet_Sub1_5 == null) {
				Static218.anApplet_Sub1_5 = this;
				Static185.anInt4016 = 765;
				Static90.anInt4701 = 503;
				Static31.anInt696 = 503;
				@Pc(45) String local45 = this.getParameter("openwinjs");
				@Pc(52) boolean local52;
				if (local45 != null && local45.equals("1")) {
					local52 = true;
				} else {
					local52 = false;
				}
				if (Static51.aClass72_3 == null) {
					Static150.aClass72_4 = Static51.aClass72_3 = new Class72(false, this, arg0, null, 0);
				}
				Static51.aClass72_3.method2246(this, 1);
			} else {
				Static128.anInt4774++;
				if (Static128.anInt4774 >= 3) {
					this.method566("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			Static34.method595(null, local76);
			this.method566("crash");
		}
	}

	@OriginalMember(owner = "client!of", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	private void method574(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static154.aBoolean162) {
				return;
			}
			Static154.aBoolean162 = true;
		}
		if (Static51.aClass72_3.anApplet1 != null) {
			Static51.aClass72_3.anApplet1.destroy();
		}
		try {
			this.method569();
		} catch (@Pc(31) Exception local31) {
		}
		if (Static36.aCanvas1 != null) {
			try {
				Static36.aCanvas1.removeFocusListener(this);
				Static36.aCanvas1.getParent().remove(Static36.aCanvas1);
			} catch (@Pc(42) Exception local42) {
			}
		}
		if (Static51.aClass72_3 != null) {
			try {
				Static51.aClass72_3.method2257();
			} catch (@Pc(50) Exception local50) {
			}
		}
		this.method571();
		if (Static95.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(60) Throwable local60) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!of", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static124.aBoolean205 = true;
		Static88.aBoolean89 = true;
	}

	@OriginalMember(owner = "client!of", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static218.anApplet_Sub1_5 == this && !Static154.aBoolean162) {
			Static110.aLong46 = Static144.method2489() + 4000L;
		}
	}

	@OriginalMember(owner = "client!of", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
	protected abstract void method575();

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	private void method576() {
		@Pc(6) long local6 = Static144.method2489();
		@Pc(10) long local10 = Static14.aLongArray1[Static71.anInt1629];
		Static14.aLongArray1[Static71.anInt1629] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static132.anInt2984 = ((local32 >> 1) + 32000) / local32;
		}
		Static71.anInt1629 = Static71.anInt1629 + 1 & 0x1F;
		if (Static198.anInt4214++ > 50) {
			Static88.aBoolean89 = true;
			Static198.anInt4214 -= 50;
			Static36.aCanvas1.setSize(Static185.anInt4016, Static90.anInt4701);
			Static36.aCanvas1.setVisible(true);
			if (Static95.aFrame1 != null && Static200.aFrame2 == null) {
				@Pc(74) Insets local74 = Static95.aFrame1.getInsets();
				Static36.aCanvas1.setLocation(local74.left, Static111.anInt2460 + local74.top);
			} else {
				Static36.aCanvas1.setLocation(0, Static111.anInt2460);
			}
		}
		this.method564();
	}

	@OriginalMember(owner = "client!of", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!of", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static218.anApplet_Sub1_5 == this && !Static154.aBoolean162) {
			Static110.aLong46 = 0L;
		}
	}

	@OriginalMember(owner = "client!of", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static95.aFrame1 == null) {
			return Static51.aClass72_3 == null || Static51.aClass72_3.anApplet1 == this ? super.getDocumentBase() : Static51.aClass72_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static95.aFrame1 == null) {
			return Static51.aClass72_3 == null || Static51.aClass72_3.anApplet1 == this ? super.getAppletContext() : Static51.aClass72_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static218.anApplet_Sub1_5 == this && !Static154.aBoolean162) {
			Static110.aLong46 = Static144.method2489();
			Static186.method3115(5000L);
			Static150.aClass72_4 = null;
			this.method574(false);
		}
	}

	@OriginalMember(owner = "client!of", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static124.aBoolean205 = false;
	}

	@OriginalMember(owner = "client!of", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static95.aFrame1 == null) {
			return Static51.aClass72_3 == null || Static51.aClass72_3.anApplet1 == this ? super.getCodeBase() : Static51.aClass72_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}
}
