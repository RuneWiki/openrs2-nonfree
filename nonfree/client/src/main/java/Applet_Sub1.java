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

@OriginalClass("client!ls")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!ls", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static158.anApplet_Sub1_1 == this && !Static149.aBoolean442) {
			Static150.aLong89 = Static279.method4058();
			Static224.method3441(5000L);
			Static455.aClass180_5 = null;
			this.method1225(false);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
	protected abstract void method1213();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIIILjava/lang/String;Z)V")
	protected final void method1215(@OriginalArg(0) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static34.anInt715 = 768;
			Static107.anInt2270 = 768;
			Static158.anApplet_Sub1_1 = this;
			Static202.anInt3872 = 0;
			Static123.anInt2494 = 594;
			Static95.anInt1971 = 1024;
			Static299.anInt700 = 1024;
			Static308.anInt5300 = 0;
			Static285.aFrame4 = new Frame();
			Static285.aFrame4.setTitle("Jagex");
			Static285.aFrame4.setResizable(true);
			Static285.aFrame4.addWindowListener(this);
			Static285.aFrame4.setVisible(true);
			Static285.aFrame4.toFront();
			@Pc(38) Insets local38 = Static285.aFrame4.getInsets();
			Static285.aFrame4.setSize(local38.left + Static299.anInt700 + local38.right, local38.bottom + Static107.anInt2270 + local38.top);
			Static455.aClass180_5 = Static77.aClass180_1 = new Class180(null, arg0, arg1, 30);
			@Pc(70) Class9 local70 = Static77.aClass180_1.method4084(1, this);
			while (local70.anInt368 == 0) {
				Static224.method3441(10L);
			}
		} catch (@Pc(83) Exception local83) {
			Static158.method2570(local83, null);
		}
	}

	@OriginalMember(owner = "client!ls", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ls", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static282.aString46 != null) {
					@Pc(10) String local10 = Static282.aString46.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static282.aString44;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1229("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static282.aString44 == null || Static282.aString44.equals("1.4.2"))) {
						this.method1229("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Static282.aString44 != null && Static282.aString44.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Static282.aString44.length()) {
						@Pc(78) char local78 = Static282.aString44.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local78 + local72 * 10 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Static129.aBoolean282 = true;
					}
				}
				if (Static77.aClass180_1.anApplet1 != null) {
					@Pc(113) Method local113 = Static282.aMethod1;
					if (local113 != null) {
						try {
							local113.invoke(Static77.aClass180_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static266.method5707();
				Static30.method600();
				this.method1231();
				this.method1230();
				this.method1222();
				Static264.aClass77_1 = Static374.method5096();
				this.method1230();
				while (Static150.aLong89 == 0L || Static150.aLong89 > Static279.method4058()) {
					Static395.anInt6337 = Static264.aClass77_1.method3069(Static372.anInt6090);
					for (local70 = 0; local70 < Static395.anInt6337; local70++) {
						this.method1219();
					}
					this.method1218();
					Static328.method4664(Static77.aClass180_1, Static155.aCanvas4);
				}
			}
		} catch (@Pc(188) Throwable local188) {
			Static158.method2570(local188, this.method1232());
			this.method1229("crash");
		}
		this.method1225(true);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	private void method1218() {
		@Pc(8) long local8 = Static279.method4058();
		@Pc(12) long local12 = Static339.aLongArray7[Static21.anInt525];
		Static339.aLongArray7[Static21.anInt525] = local8;
		Static21.anInt525 = Static21.anInt525 + 1 & 0x1F;
		if (local12 != 0L && local8 > local12) {
			@Pc(46) int local46 = (int) (local8 - local12);
			Static295.anInt5133 = ((local46 >> 1) + 32000) / local46;
		}
		if (Static319.anInt4220++ > 50) {
			Static90.aBoolean117 = true;
			Static319.anInt4220 -= 50;
			Static155.aCanvas4.setSize(Static95.anInt1971, Static34.anInt715);
			Static155.aCanvas4.setVisible(true);
			if (Static285.aFrame4 != null && Static373.aFrame5 == null) {
				@Pc(87) Insets local87 = Static285.aFrame4.getInsets();
				Static155.aCanvas4.setLocation(local87.left + Static202.anInt3872, Static308.anInt5300 + local87.top);
			} else {
				Static155.aCanvas4.setLocation(Static202.anInt3872, Static308.anInt5300);
			}
		}
		this.method1224();
	}

	@OriginalMember(owner = "client!ls", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
	private void method1219() {
		@Pc(6) long local6 = Static279.method4058();
		@Pc(10) long local10 = Static418.aLongArray9[Static7.anInt196];
		Static418.aLongArray9[Static7.anInt196] = local6;
		Static7.anInt196 = Static7.anInt196 + 1 & 0x1F;
		@Pc(29) boolean local29;
		if (local10 == 0L || local6 <= local10) {
			local29 = false;
		} else {
			local29 = true;
		}
		synchronized (this) {
			Static289.aBoolean418 = Static155.aBoolean179;
		}
		this.method1226();
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	protected abstract void method1222();

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)Z")
	protected final boolean method1223() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.equals("stellardawn.com") || local16.endsWith(".stellardawn.com")) {
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
				this.method1229("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(B)V")
	protected abstract void method1224();

	@OriginalMember(owner = "client!ls", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static285.aFrame4 == null) {
			return Static77.aClass180_1 == null || Static77.aClass180_1.anApplet1 == this ? super.getCodeBase() : Static77.aClass180_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZ)V")
	private void method1225(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static149.aBoolean442) {
				return;
			}
			Static149.aBoolean442 = true;
		}
		if (Static77.aClass180_1.anApplet1 != null) {
			Static77.aClass180_1.anApplet1.destroy();
		}
		try {
			this.method1227();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean80) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean80 = false;
		}
		@Pc(54) Class9 local54 = Static77.aClass180_1.method4077(Static158.anApplet_Sub1_1.getClass());
		while (local54.anInt368 == 0) {
			Static224.method3441(100L);
		}
		if (Static155.aCanvas4 != null) {
			try {
				Static155.aCanvas4.removeFocusListener(this);
				Static155.aCanvas4.getParent().remove(Static155.aCanvas4);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static77.aClass180_1 != null) {
			try {
				Static77.aClass180_1.method4095();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method1213();
		if (Static285.aFrame4 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ls", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	protected abstract void method1226();

	@OriginalMember(owner = "client!ls", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ls", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static285.aFrame4 == null) {
			return Static77.aClass180_1 == null || Static77.aClass180_1.anApplet1 == this ? super.getAppletContext() : Static77.aClass180_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static158.anApplet_Sub1_1 == this && !Static149.aBoolean442) {
			Static150.aLong89 = Static279.method4058() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
	protected abstract void method1227();

	@OriginalMember(owner = "client!ls", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static158.anApplet_Sub1_1 == this && !Static149.aBoolean442) {
			Static150.aLong89 = 0L;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1229(@OriginalArg(0) String arg0) {
		if (this.aBoolean79) {
			return;
		}
		this.aBoolean79 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static463.method2376("loggedout", Static77.aClass180_1.anApplet1);
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "(B)V")
	public final void method1230() {
		if (this.aBoolean80) {
			return;
		}
		try {
			@Pc(17) Class9 local17 = Static77.aClass180_1.method4092(Static158.anApplet_Sub1_1.getClass());
			while (local17.anInt368 == 0) {
				Static224.method3441(100L);
			}
			if (local17.anObject2 != null) {
				throw (Throwable) local17.anObject2;
			}
			jagmisc.init();
			this.aBoolean80 = true;
			Static264.aClass77_1 = Static374.method5096();
		} catch (@Pc(44) Throwable local44) {
		}
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)V")
	public final synchronized void method1231() {
		if (Static155.aCanvas4 != null) {
			Static155.aCanvas4.removeFocusListener(this);
			Static155.aCanvas4.getParent().remove(Static155.aCanvas4);
		}
		@Pc(16) Container local16;
		if (Static373.aFrame5 != null) {
			local16 = Static373.aFrame5;
		} else if (Static285.aFrame4 == null) {
			local16 = Static77.aClass180_1.anApplet1;
		} else {
			local16 = Static285.aFrame4;
		}
		local16.setLayout(null);
		Static155.aCanvas4 = new Canvas_Sub1(this);
		local16.add(Static155.aCanvas4);
		Static155.aCanvas4.setSize(Static95.anInt1971, Static34.anInt715);
		Static155.aCanvas4.setVisible(true);
		if (local16 == Static285.aFrame4) {
			@Pc(55) Insets local55 = Static285.aFrame4.getInsets();
			Static155.aCanvas4.setLocation(Static202.anInt3872 + local55.left, local55.top + Static308.anInt5300);
		} else {
			Static155.aCanvas4.setLocation(Static202.anInt3872, Static308.anInt5300);
		}
		Static155.aCanvas4.addFocusListener(this);
		Static155.aCanvas4.requestFocus();
		Static289.aBoolean418 = true;
		Static155.aBoolean179 = true;
		Static90.aBoolean117 = true;
		Static278.aBoolean322 = false;
		Static81.aLong54 = Static279.method4058();
	}

	@OriginalMember(owner = "client!ls", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static155.aBoolean179 = false;
	}

	@OriginalMember(owner = "client!ls", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ls", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static285.aFrame4 == null) {
			return Static77.aClass180_1 == null || Static77.aClass180_1.anApplet1 == this ? super.getParameter(arg0) : Static77.aClass180_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static155.aBoolean179 = true;
		Static90.aBoolean117 = true;
	}

	@OriginalMember(owner = "client!ls", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static285.aFrame4 == null) {
			return Static77.aClass180_1 == null || Static77.aClass180_1.anApplet1 == this ? super.getDocumentBase() : Static77.aClass180_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(Z)Ljava/lang/String;")
	protected String method1232() {
		return null;
	}

	@OriginalMember(owner = "client!ls", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
	protected final void method1233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static158.anApplet_Sub1_1 == null) {
				Static123.anInt2494 = 594;
				Static202.anInt3872 = 0;
				Static34.anInt715 = arg0;
				Static107.anInt2270 = arg0;
				Static95.anInt1971 = arg2;
				Static299.anInt700 = arg2;
				Static308.anInt5300 = 0;
				Static158.anApplet_Sub1_1 = this;
				if (Static77.aClass180_1 == null) {
					Static455.aClass180_5 = Static77.aClass180_1 = new Class180(this, arg1, null, 0);
				}
				@Pc(66) Class9 local66 = Static77.aClass180_1.method4084(1, this);
				while (local66.anInt368 == 0) {
					Static224.method3441(10L);
				}
			} else {
				Static420.anInt6806++;
				if (Static420.anInt6806 >= 3) {
					this.method1229("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Throwable local78) {
			Static158.method2570(local78, null);
			this.method1229("crash");
		}
	}

	@OriginalMember(owner = "client!ls", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static158.anApplet_Sub1_1 != this || Static149.aBoolean442) {
			return;
		}
		Static90.aBoolean117 = true;
		if (Static129.aBoolean282 && Static279.method4058() - Static81.aLong54 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static299.anInt700 && local26.height >= Static107.anInt2270) {
				Static278.aBoolean322 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
