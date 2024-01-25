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

@OriginalClass("client!pj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!pj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static290.anApplet_Sub1_1 == this && !Static193.aBoolean336) {
			Static187.aLong103 = 0L;
		}
	}

	@OriginalMember(owner = "client!pj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static142.aFrame2 == null) {
			return Static341.aClass162_5 == null || Static341.aClass162_5.anApplet1 == this ? super.getDocumentBase() : Static341.aClass162_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static290.anApplet_Sub1_1 == this && !Static193.aBoolean336) {
			Static187.aLong103 = Static378.method5293();
			Static57.method5056(5000L);
			Static50.aClass162_1 = null;
			this.method787(false);
		}
	}

	@OriginalMember(owner = "client!pj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method786(@OriginalArg(0) String arg0) {
		if (this.aBoolean89) {
			return;
		}
		this.aBoolean89 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static396.method1248(Static341.aClass162_5.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZ)V")
	private void method787(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static193.aBoolean336) {
				return;
			}
			Static193.aBoolean336 = true;
		}
		if (Static341.aClass162_5.anApplet1 != null) {
			Static341.aClass162_5.anApplet1.destroy();
		}
		try {
			this.method802();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean88) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean88 = false;
		}
		@Pc(52) Class112 local52 = Static341.aClass162_5.method3274(Static290.anApplet_Sub1_1.getClass());
		while (local52.anInt2969 == 0) {
			Static57.method5056(100L);
		}
		if (Static177.aCanvas3 != null) {
			try {
				Static177.aCanvas3.removeFocusListener(this);
				Static177.aCanvas3.getParent().remove(Static177.aCanvas3);
			} catch (@Pc(71) Exception local71) {
			}
		}
		if (Static341.aClass162_5 != null) {
			try {
				Static341.aClass162_5.method3280();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method803();
		if (Static142.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	protected abstract void method788();

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	private void method790() {
		@Pc(6) long local6 = Static378.method5293();
		@Pc(10) long local10 = Static5.aLongArray1[Static202.anInt3546];
		Static5.aLongArray1[Static202.anInt3546] = local6;
		Static202.anInt3546 = Static202.anInt3546 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(39) int local39 = (int) (local6 - local10);
			Static37.anInt718 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static321.anInt5435++ > 50) {
			Static321.anInt5435 -= 50;
			Static326.aBoolean515 = true;
			Static177.aCanvas3.setSize(Static136.anInt6304, Static218.anInt3871);
			Static177.aCanvas3.setVisible(true);
			if (Static142.aFrame2 != null && Static47.aFrame1 == null) {
				@Pc(80) Insets local80 = Static142.aFrame2.getInsets();
				Static177.aCanvas3.setLocation(Static307.anInt5742 + local80.left, Static155.anInt2835 + local80.top);
			} else {
				Static177.aCanvas3.setLocation(Static307.anInt5742, Static155.anInt2835);
			}
		}
		this.method788();
	}

	@OriginalMember(owner = "client!pj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static290.anApplet_Sub1_1 == this && !Static193.aBoolean336) {
			Static187.aLong103 = Static378.method5293() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static142.aFrame2 == null) {
			return Static341.aClass162_5 == null || Static341.aClass162_5.anApplet1 == this ? super.getCodeBase() : Static341.aClass162_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static385.aBoolean580 = true;
		Static326.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	public final void method791() {
		if (this.aBoolean88) {
			return;
		}
		try {
			@Pc(21) Class112 local21 = Static341.aClass162_5.method3267(Static290.anApplet_Sub1_1.getClass());
			while (local21.anInt2969 == 0) {
				Static57.method5056(100L);
			}
			if (local21.anObject5 != null) {
				throw (Throwable) local21.anObject5;
			}
			jagmisc.init();
			this.aBoolean88 = true;
			Static379.aClass50_1 = Static308.method4584();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILjava/lang/String;IIZBI)V")
	protected final void method792(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static307.anInt5742 = 0;
			Static218.anInt3871 = 768;
			Static278.anInt4645 = 768;
			Static136.anInt6304 = 1024;
			Static160.anInt2899 = 1024;
			Static290.anApplet_Sub1_1 = this;
			Static193.anInt3401 = 575;
			Static155.anInt2835 = 0;
			Static142.aFrame2 = new Frame();
			Static142.aFrame2.setTitle("Jagex");
			Static142.aFrame2.setResizable(true);
			Static142.aFrame2.addWindowListener(this);
			Static142.aFrame2.setVisible(true);
			Static142.aFrame2.toFront();
			@Pc(38) Insets local38 = Static142.aFrame2.getInsets();
			Static142.aFrame2.setSize(local38.left + Static160.anInt2899 + local38.right, local38.bottom + Static278.anInt4645 - -local38.top);
			Static50.aClass162_1 = Static341.aClass162_5 = new Class162(null, arg1, arg0, 29);
			@Pc(71) Class112 local71 = Static341.aClass162_5.method3278(1, this);
			while (local71.anInt2969 == 0) {
				Static57.method5056(10L);
			}
		} catch (@Pc(81) Exception local81) {
			Static62.method1006(local81, null);
		}
	}

	@OriginalMember(owner = "client!pj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static290.anApplet_Sub1_1 != this || Static193.aBoolean336) {
			return;
		}
		Static326.aBoolean515 = true;
		if (Static246.aBoolean422 && Static378.method5293() - Static182.aLong102 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static160.anInt2899 && local24.height >= Static278.anInt4645) {
				Static153.aBoolean243 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIBI)V")
	protected final void method793(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static290.anApplet_Sub1_1 == null) {
				Static193.anInt3401 = 575;
				Static218.anInt3871 = arg0;
				Static278.anInt4645 = arg0;
				Static307.anInt5742 = 0;
				Static155.anInt2835 = 0;
				Static290.anApplet_Sub1_1 = this;
				Static136.anInt6304 = arg1;
				Static160.anInt2899 = arg1;
				if (Static341.aClass162_5 == null) {
					Static50.aClass162_1 = Static341.aClass162_5 = new Class162(this, arg2, null, 0);
				}
				@Pc(65) Class112 local65 = Static341.aClass162_5.method3278(1, this);
				while (local65.anInt2969 == 0) {
					Static57.method5056(10L);
				}
			} else {
				Static46.anInt908++;
				if (Static46.anInt908 >= 3) {
					this.method786("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Exception local78) {
			Static62.method1006(local78, null);
			this.method786("crash");
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	protected abstract void method794();

	@OriginalMember(owner = "client!pj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static142.aFrame2 == null) {
			return Static341.aClass162_5 == null || Static341.aClass162_5.anApplet1 == this ? super.getParameter(arg0) : Static341.aClass162_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
	protected final boolean method796() {
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
				this.method786("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	private void method798() {
		@Pc(14) long local14 = Static378.method5293();
		@Pc(18) long local18 = Static32.aLongArray2[Static366.anInt5882];
		Static32.aLongArray2[Static366.anInt5882] = local14;
		@Pc(35) boolean local35;
		if (local18 == 0L || local18 >= local14) {
			local35 = false;
		} else {
			local35 = true;
		}
		Static366.anInt5882 = Static366.anInt5882 + 1 & 0x1F;
		synchronized (this) {
			Static300.aBoolean485 = Static385.aBoolean580;
		}
		this.method794();
	}

	@OriginalMember(owner = "client!pj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static385.aBoolean580 = false;
	}

	@OriginalMember(owner = "client!pj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static237.aString49 != null) {
					@Pc(10) String local10 = Static237.aString49.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static237.aString48;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method786("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static237.aString48 == null || Static237.aString48.equals("1.4.2"))) {
						this.method786("wrongjava");
						break label111;
					}
				}
				@Pc(71) int local71;
				if (Static237.aString48 != null && Static237.aString48.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static237.aString48.length()) {
						@Pc(79) char local79 = Static237.aString48.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local73 = local73 * 10 + local79 - 48;
						local71++;
					}
					if (local73 >= 5) {
						Static246.aBoolean422 = true;
					}
				}
				if (Static341.aClass162_5.anApplet1 != null) {
					@Pc(113) Method local113 = Static237.aMethod2;
					if (local113 != null) {
						try {
							local113.invoke(Static341.aClass162_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static298.method1647();
				Static352.method4942();
				this.method799();
				this.method800();
				Static379.aClass50_1 = Static308.method4584();
				this.method791();
				while (Static187.aLong103 == 0L || Static378.method5293() < Static187.aLong103) {
					Static372.anInt1559 = Static379.aClass50_1.method5055(Static368.anInt5965);
					for (local71 = 0; local71 < Static372.anInt1559; local71++) {
						this.method798();
					}
					this.method790();
					Static265.method4065(Static341.aClass162_5, Static177.aCanvas3);
				}
			}
		} catch (@Pc(181) Exception local181) {
			Static62.method1006(local181, null);
			this.method786("crash");
		}
		this.method787(true);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	public final synchronized void method799() {
		if (Static177.aCanvas3 != null) {
			Static177.aCanvas3.removeFocusListener(this);
			Static177.aCanvas3.getParent().remove(Static177.aCanvas3);
		}
		@Pc(18) Container local18;
		if (Static47.aFrame1 != null) {
			local18 = Static47.aFrame1;
		} else if (Static142.aFrame2 == null) {
			local18 = Static341.aClass162_5.anApplet1;
		} else {
			local18 = Static142.aFrame2;
		}
		local18.setLayout(null);
		Static177.aCanvas3 = new Canvas_Sub1(this);
		local18.add(Static177.aCanvas3);
		Static177.aCanvas3.setSize(Static136.anInt6304, Static218.anInt3871);
		Static177.aCanvas3.setVisible(true);
		if (local18 == Static142.aFrame2) {
			@Pc(60) Insets local60 = Static142.aFrame2.getInsets();
			Static177.aCanvas3.setLocation(local60.left + Static307.anInt5742, local60.top - -Static155.anInt2835);
		} else {
			Static177.aCanvas3.setLocation(Static307.anInt5742, Static155.anInt2835);
		}
		Static177.aCanvas3.addFocusListener(this);
		Static177.aCanvas3.requestFocus();
		Static385.aBoolean580 = true;
		Static300.aBoolean485 = true;
		Static326.aBoolean515 = true;
		Static153.aBoolean243 = false;
		Static182.aLong102 = Static378.method5293();
	}

	@OriginalMember(owner = "client!pj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static142.aFrame2 == null) {
			return Static341.aClass162_5 == null || Static341.aClass162_5.anApplet1 == this ? super.getAppletContext() : Static341.aClass162_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V")
	protected abstract void method800();

	@OriginalMember(owner = "client!pj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	protected abstract void method802();

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	protected abstract void method803();
}
