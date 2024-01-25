import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!mha")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!mha", name = "t", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!mha", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static152.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!mha", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static602.aFrame3 == null) {
			return Static152.anApplet1 == null || Static152.anApplet1 == this ? super.getAppletContext() : Static152.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!mha", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static602.aFrame3 == null) {
			return Static152.anApplet1 == null || Static152.anApplet1 == this ? super.getDocumentBase() : Static152.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)Z")
	public final boolean method1901() {
		return Static267.method4634("jagtheora");
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	protected abstract void method1903();

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method1904(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) String arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static370.anApplet_Sub1_1 == null) {
				Static313.anInt6355 = arg3;
				Static69.anInt7730 = arg3;
				Static256.anInt3670 = 632;
				Static573.anApplet2 = Static152.anApplet1;
				Static508.anInt8942 = 0;
				Static370.anApplet_Sub1_1 = this;
				Static235.anInt5298 = arg1;
				Static354.anInt6829 = arg1;
				Static34.anInt8073 = 0;
				Static486.aClass118_4 = Static51.aClass118_1 = new Class118(arg0, arg2, 37, Static152.anApplet1 != null);
				@Pc(72) Class301 local72 = Static51.aClass118_1.method3410(1, this);
				while (local72.anInt8915 == 0) {
					Static214.method4061(10L);
				}
			} else {
				Static153.anInt3783++;
				if (Static153.anInt3783 >= 3) {
					this.method1905("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(85) Throwable local85) {
			Static596.method8231(null, local85);
			this.method1905("crash");
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1905(@OriginalArg(1) String arg0) {
		if (this.aBoolean153) {
			return;
		}
		this.aBoolean153 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static646.method1435("loggedout", Static152.anApplet1);
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!mha", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V")
	private void method1906() {
		@Pc(6) long local6 = Static342.method5463();
		@Pc(10) long local10 = Static107.aLongArray1[Static267.anInt5687];
		Static107.aLongArray1[Static267.anInt5687] = local6;
		@Pc(23) boolean local23;
		if (local10 == 0L || local10 >= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static267.anInt5687 = Static267.anInt5687 + 1 & 0x1F;
		synchronized (this) {
			Static216.aBoolean372 = Static291.aBoolean425;
		}
		this.method1910();
	}

	@OriginalMember(owner = "client!mha", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static602.aFrame3 == null) {
			return Static152.anApplet1 == null || Static152.anApplet1 == this ? super.getParameter(arg0) : Static152.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static602.aFrame3 == null) {
			return Static152.anApplet1 == null || Static152.anApplet1 == this ? super.getCodeBase() : Static152.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mha", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static370.anApplet_Sub1_1 == this && !Static492.aBoolean617) {
			Static384.aLong186 = Static342.method5463() + 4000L;
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V")
	public synchronized void method1907() {
		if (Static549.aCanvas13 != null) {
			Static549.aCanvas13.removeFocusListener(this);
			Static549.aCanvas13.getParent().setBackground(Color.black);
			Static549.aCanvas13.getParent().remove(Static549.aCanvas13);
		}
		@Pc(26) Container local26;
		if (Static197.aFrame1 != null) {
			local26 = Static197.aFrame1;
		} else if (Static602.aFrame3 != null) {
			local26 = Static602.aFrame3;
		} else if (Static152.anApplet1 == null) {
			local26 = Static370.anApplet_Sub1_1;
		} else {
			local26 = Static152.anApplet1;
		}
		local26.setLayout(null);
		Static549.aCanvas13 = new Canvas_Sub1(this);
		local26.add(Static549.aCanvas13);
		Static549.aCanvas13.setSize(Static235.anInt5298, Static313.anInt6355);
		Static549.aCanvas13.setVisible(true);
		if (local26 == Static602.aFrame3) {
			@Pc(67) Insets local67 = Static602.aFrame3.getInsets();
			Static549.aCanvas13.setLocation(Static508.anInt8942 + local67.left, Static34.anInt8073 + local67.top);
		} else {
			Static549.aCanvas13.setLocation(Static508.anInt8942, Static34.anInt8073);
		}
		Static549.aCanvas13.addFocusListener(this);
		Static549.aCanvas13.requestFocus();
		Static216.aBoolean372 = true;
		Static291.aBoolean425 = true;
		Static277.aBoolean412 = true;
		Static11.aBoolean9 = false;
		Static414.aLong203 = Static342.method5463();
	}

	@OriginalMember(owner = "client!mha", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!mha", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static291.aBoolean425 = true;
		Static277.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!mha", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static370.anApplet_Sub1_1 == this && !Static492.aBoolean617) {
			Static384.aLong186 = Static342.method5463();
			Static214.method4061(5000L);
			Static486.aClass118_4 = null;
			this.method1914(false);
		}
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)Z")
	protected final boolean method1908() {
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
				this.method1905("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)V")
	protected abstract void method1909();

	@OriginalMember(owner = "client!mha", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static370.anApplet_Sub1_1 == this && !Static492.aBoolean617) {
			Static384.aLong186 = 0L;
		}
	}

	@OriginalMember(owner = "client!mha", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static175.aString47 != null) {
				@Pc(10) String local10 = Static175.aString47.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static175.aString52;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1905("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static175.aString52 == null || Static175.aString52.equals("1.4.2"))) {
					this.method1905("wrongjava");
					return;
				}
			}
			if (Static175.aString52 != null && Static175.aString52.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static175.aString52.length()) {
					@Pc(79) char local79 = Static175.aString52.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local73 * 10 + local79 - 48;
				}
				if (local73 >= 5) {
					Static428.aBoolean577 = true;
				}
			}
			@Pc(115) Applet local115 = Static370.anApplet_Sub1_1;
			if (Static152.anApplet1 != null) {
				local115 = Static152.anApplet1;
			}
			@Pc(121) Method local121 = Static175.aMethod2;
			if (local121 != null) {
				try {
					local121.invoke(local115, Boolean.TRUE);
				} catch (@Pc(135) Throwable local135) {
				}
			}
			Static94.method5138();
			Static383.method6160();
			this.method1907();
			this.method1913();
			Static538.aClass109_1 = Static399.method6348();
			while (Static384.aLong186 == 0L || Static384.aLong186 > Static342.method5463()) {
				Static89.anInt2537 = Static538.aClass109_1.method4085(Static233.aLong132);
				for (@Pc(158) int local158 = 0; local158 < Static89.anInt2537; local158++) {
					this.method1906();
				}
				this.method1915();
				Static148.method5409(Static51.aClass118_1, Static549.aCanvas13);
			}
		} catch (@Pc(185) ThreadDeath local185) {
			throw local185;
		} catch (@Pc(188) Throwable local188) {
			Static596.method8231(this.method1912(), local188);
			this.method1905("crash");
		} finally {
			@Pc(204) Object local204 = null;
			this.method1914(true);
		}
	}

	@OriginalMember(owner = "client!mha", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static370.anApplet_Sub1_1 != this || Static492.aBoolean617) {
			return;
		}
		Static277.aBoolean412 = true;
		if (Static428.aBoolean577 && Static342.method5463() - Static414.aLong203 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static354.anInt6829 && Static69.anInt7730 <= local24.height) {
				Static11.aBoolean9 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(B)V")
	protected abstract void method1910();

	@OriginalMember(owner = "client!mha", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)Z")
	public final boolean method1911() {
		return Static267.method4634("jaclib");
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1912() {
		return null;
	}

	@OriginalMember(owner = "client!mha", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!mha", name = "e", descriptor = "(B)V")
	protected abstract void method1913();

	@OriginalMember(owner = "client!mha", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mha", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static291.aBoolean425 = false;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI)V")
	private void method1914(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static492.aBoolean617) {
				return;
			}
			Static492.aBoolean617 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static152.anApplet1 != null) {
			Static152.anApplet1.destroy();
		}
		try {
			this.method1918();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean154) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean154 = false;
		}
		Static606.method8290();
		Static158.method3216();
		if (Static549.aCanvas13 != null) {
			try {
				Static549.aCanvas13.removeFocusListener(this);
				Static549.aCanvas13.getParent().remove(Static549.aCanvas13);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static51.aClass118_1 != null) {
			try {
				Static51.aClass118_1.method3403();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1909();
		if (Static602.aFrame3 != null) {
			Static602.aFrame3.setVisible(false);
			Static602.aFrame3.dispose();
			Static602.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "(Z)V")
	private void method1915() {
		@Pc(10) long local10 = Static342.method5463();
		@Pc(14) long local14 = Static230.aLongArray7[Static514.anInt9013];
		Static230.aLongArray7[Static514.anInt9013] = local10;
		if (local14 != 0L && local10 > local14) {
			@Pc(32) int local32 = (int) (local10 - local14);
			Static563.anInt9710 = ((local32 >> 1) + 32000) / local32;
		}
		Static514.anInt9013 = Static514.anInt9013 + 1 & 0x1F;
		if (Static90.anInt2539++ > 50) {
			Static277.aBoolean412 = true;
			Static90.anInt2539 -= 50;
			Static549.aCanvas13.setSize(Static235.anInt5298, Static313.anInt6355);
			Static549.aCanvas13.setVisible(true);
			if (Static602.aFrame3 != null && Static197.aFrame1 == null) {
				@Pc(73) Insets local73 = Static602.aFrame3.getInsets();
				Static549.aCanvas13.setLocation(Static508.anInt8942 + local73.left, Static34.anInt8073 + local73.top);
			} else {
				Static549.aCanvas13.setLocation(Static508.anInt8942, Static34.anInt8073);
			}
		}
		this.method1903();
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V")
	protected final void method1916(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static573.anApplet2 = null;
			Static235.anInt5298 = 1024;
			Static354.anInt6829 = 1024;
			Static256.anInt3670 = 632;
			Static370.anApplet_Sub1_1 = this;
			Static508.anInt8942 = 0;
			Static34.anInt8073 = 0;
			Static313.anInt6355 = 768;
			Static69.anInt7730 = 768;
			Static602.aFrame3 = new Frame();
			Static602.aFrame3.setTitle("Jagex");
			Static602.aFrame3.setResizable(true);
			Static602.aFrame3.addWindowListener(this);
			Static602.aFrame3.setVisible(true);
			Static602.aFrame3.toFront();
			@Pc(44) Insets local44 = Static602.aFrame3.getInsets();
			Static602.aFrame3.setSize(local44.left + Static354.anInt6829 + local44.right, local44.bottom + local44.top + Static69.anInt7730);
			Static486.aClass118_4 = Static51.aClass118_1 = new Class118(arg0, arg1, 37, true);
			@Pc(80) Class301 local80 = Static51.aClass118_1.method3410(1, this);
			while (local80.anInt8915 == 0) {
				Static214.method4061(10L);
			}
		} catch (@Pc(93) Exception local93) {
			Static596.method8231(null, local93);
		}
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)Z")
	public final boolean method1917() {
		return Static267.method4634("jagmisc");
	}

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "(Z)V")
	protected abstract void method1918();
}
