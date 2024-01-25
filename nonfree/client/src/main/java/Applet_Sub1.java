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

@OriginalClass("client!tk")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!tk", name = "H", descriptor = "Z")
	private boolean aBoolean73 = false;

	static {
		new Class151(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!tk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static158.aFrame2 == null) {
			return Static41.aClass124_2 == null || Static41.aClass124_2.anApplet1 == this ? super.getDocumentBase() : Static41.aClass124_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILjava/lang/String;BZI)V")
	protected final void method777(@OriginalArg(1) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static434.anInt4327 = 0;
			Static126.anInt2202 = 1024;
			Static320.anInt5295 = 1024;
			Static236.anInt3837 = 589;
			Static239.anInt3852 = 0;
			Static378.anApplet_Sub1_1 = this;
			Static92.anInt1618 = 768;
			Static347.anInt5659 = 768;
			Static158.aFrame2 = new Frame();
			Static158.aFrame2.setTitle("Jagex");
			Static158.aFrame2.setResizable(true);
			Static158.aFrame2.addWindowListener(this);
			Static158.aFrame2.setVisible(true);
			Static158.aFrame2.toFront();
			@Pc(38) Insets local38 = Static158.aFrame2.getInsets();
			Static158.aFrame2.setSize(local38.right + Static320.anInt5295 + local38.left, local38.bottom + (Static347.anInt5659 - -local38.top));
			Static357.aClass124_5 = Static41.aClass124_2 = new Class124(null, arg0, arg1, 30);
			@Pc(71) Class215 local71 = Static41.aClass124_2.method2529(this, 1);
			while (local71.anInt5791 == 0) {
				Static252.method2874(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static211.method2815(local90, null);
		}
	}

	@OriginalMember(owner = "client!tk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
	protected abstract void method778();

	@OriginalMember(owner = "client!tk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static158.aFrame2 == null) {
			return Static41.aClass124_2 == null || Static41.aClass124_2.anApplet1 == this ? super.getAppletContext() : Static41.aClass124_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
	protected final boolean method780() {
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
				this.method795("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	protected abstract void method781();

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
	public final synchronized void method782() {
		if (Static226.aCanvas9 != null) {
			Static226.aCanvas9.removeFocusListener(this);
			Static226.aCanvas9.getParent().remove(Static226.aCanvas9);
		}
		@Pc(24) Container local24;
		if (Static70.aFrame1 != null) {
			local24 = Static70.aFrame1;
		} else if (Static158.aFrame2 == null) {
			local24 = Static41.aClass124_2.anApplet1;
		} else {
			local24 = Static158.aFrame2;
		}
		local24.setLayout(null);
		Static226.aCanvas9 = new Canvas_Sub1(this);
		local24.add(Static226.aCanvas9);
		Static226.aCanvas9.setSize(Static126.anInt2202, Static92.anInt1618);
		Static226.aCanvas9.setVisible(true);
		if (local24 == Static158.aFrame2) {
			@Pc(66) Insets local66 = Static158.aFrame2.getInsets();
			Static226.aCanvas9.setLocation(Static434.anInt4327 + local66.left, Static239.anInt3852 + local66.top);
		} else {
			Static226.aCanvas9.setLocation(Static434.anInt4327, Static239.anInt3852);
		}
		Static226.aCanvas9.addFocusListener(this);
		Static226.aCanvas9.requestFocus();
		Static323.aBoolean426 = true;
		Static301.aBoolean404 = true;
		Static107.aBoolean140 = true;
		Static5.aBoolean14 = false;
		Static352.aLong173 = Static232.method3058();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)V")
	private void method783(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static83.aBoolean145) {
				return;
			}
			Static83.aBoolean145 = true;
		}
		if (Static41.aClass124_2.anApplet1 != null) {
			Static41.aClass124_2.anApplet1.destroy();
		}
		try {
			this.method789();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean72) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean72 = false;
		}
		@Pc(54) Class215 local54 = Static41.aClass124_2.method2506(Static378.anApplet_Sub1_1.getClass());
		while (local54.anInt5791 == 0) {
			Static252.method2874(100L);
		}
		if (Static226.aCanvas9 != null) {
			try {
				Static226.aCanvas9.removeFocusListener(this);
				Static226.aCanvas9.getParent().remove(Static226.aCanvas9);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static41.aClass124_2 != null) {
			try {
				Static41.aClass124_2.method2512();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method785();
		if (Static158.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)Ljava/lang/String;")
	protected String method784() {
		return null;
	}

	@OriginalMember(owner = "client!tk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static301.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
	protected abstract void method785();

	@OriginalMember(owner = "client!tk", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!tk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
	public final void method787() {
		if (this.aBoolean72) {
			return;
		}
		try {
			@Pc(14) Class215 local14 = Static41.aClass124_2.method2526(Static378.anApplet_Sub1_1.getClass());
			while (local14.anInt5791 == 0) {
				Static252.method2874(100L);
			}
			if (local14.anObject10 != null) {
				throw (Throwable) local14.anObject10;
			}
			jagmisc.init();
			this.aBoolean72 = true;
			Static123.aClass11_1 = Static66.method996();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!tk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!tk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static378.anApplet_Sub1_1 != this || Static83.aBoolean145) {
			return;
		}
		Static107.aBoolean140 = true;
		if (Static334.aBoolean446 && Static232.method3058() - Static352.aLong173 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static320.anInt5295 <= local26.width && Static347.anInt5659 <= local26.height) {
				Static5.aBoolean14 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
	protected abstract void method788();

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
	protected abstract void method789();

	@OriginalMember(owner = "client!tk", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static378.anApplet_Sub1_1 == this && !Static83.aBoolean145) {
			Static133.aLong70 = Static232.method3058() + 4000L;
		}
	}

	@OriginalMember(owner = "client!tk", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static378.anApplet_Sub1_1 == this && !Static83.aBoolean145) {
			Static133.aLong70 = Static232.method3058();
			Static252.method2874(5000L);
			Static357.aClass124_5 = null;
			this.method783(false);
		}
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
	private void method792() {
		@Pc(10) long local10 = Static232.method3058();
		@Pc(14) long local14 = Static442.aLongArray10[Static160.anInt6708];
		Static442.aLongArray10[Static160.anInt6708] = local10;
		if (local14 != 0L && local14 < local10) {
			@Pc(34) int local34 = (int) (local10 - local14);
			Static38.anInt741 = ((local34 >> 1) + 32000) / local34;
		}
		Static160.anInt6708 = Static160.anInt6708 + 1 & 0x1F;
		if (Static339.anInt5516++ > 50) {
			Static339.anInt5516 -= 50;
			Static107.aBoolean140 = true;
			Static226.aCanvas9.setSize(Static126.anInt2202, Static92.anInt1618);
			Static226.aCanvas9.setVisible(true);
			if (Static158.aFrame2 != null && Static70.aFrame1 == null) {
				@Pc(81) Insets local81 = Static158.aFrame2.getInsets();
				Static226.aCanvas9.setLocation(local81.left + Static434.anInt4327, local81.top + Static239.anInt3852);
			} else {
				Static226.aCanvas9.setLocation(Static434.anInt4327, Static239.anInt3852);
			}
		}
		this.method778();
	}

	@OriginalMember(owner = "client!tk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static158.aFrame2 == null) {
			return Static41.aClass124_2 == null || Static41.aClass124_2.anApplet1 == this ? super.getParameter(arg0) : Static41.aClass124_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static191.aString30 != null) {
					@Pc(6) String local6 = Static191.aString30.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(38) String local38 = Static191.aString29;
						if (local38.equals("1.1") || local38.startsWith("1.1.") || local38.equals("1.2") || local38.startsWith("1.2.")) {
							this.method795("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static191.aString29 == null || Static191.aString29.equals("1.4.2"))) {
						this.method795("wrongjava");
						break label113;
					}
				}
				@Pc(68) int local68;
				if (Static191.aString29 != null && Static191.aString29.startsWith("1.")) {
					local68 = 2;
					@Pc(70) int local70 = 0;
					while (local68 < Static191.aString29.length()) {
						@Pc(76) char local76 = Static191.aString29.charAt(local68);
						if (local76 < '0' || local76 > '9') {
							break;
						}
						local70 = local76 + local70 * 10 - 48;
						local68++;
					}
					if (local70 >= 5) {
						Static334.aBoolean446 = true;
					}
				}
				if (Static41.aClass124_2.anApplet1 != null) {
					@Pc(116) Method local116 = Static191.aMethod2;
					if (local116 != null) {
						try {
							local116.invoke(Static41.aClass124_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(131) Throwable local131) {
						}
					}
				}
				Static345.method4400();
				Static235.method3089();
				this.method782();
				this.method781();
				Static123.aClass11_1 = Static66.method996();
				this.method787();
				while (Static133.aLong70 == 0L || Static232.method3058() < Static133.aLong70) {
					Static90.anInt1582 = Static123.aClass11_1.method4919(Static12.anInt231);
					for (local68 = 0; local68 < Static90.anInt1582; local68++) {
						this.method793();
					}
					this.method792();
					Static95.method1359(Static41.aClass124_2, Static226.aCanvas9);
				}
			}
		} catch (@Pc(190) Throwable local190) {
			Static211.method2815(local190, this.method784());
			this.method795("crash");
		}
		this.method783(true);
	}

	@OriginalMember(owner = "client!tk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static301.aBoolean404 = true;
		Static107.aBoolean140 = true;
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
	private void method793() {
		@Pc(6) long local6 = Static232.method3058();
		@Pc(10) long local10 = Static183.aLongArray5[Static247.anInt4036];
		Static183.aLongArray5[Static247.anInt4036] = local6;
		Static247.anInt4036 = Static247.anInt4036 + 1 & 0x1F;
		@Pc(30) boolean local30;
		if (local10 == (long) 0 || local6 <= local10) {
			local30 = false;
		} else {
			local30 = true;
		}
		synchronized (this) {
			Static323.aBoolean426 = Static301.aBoolean404;
		}
		this.method788();
	}

	@OriginalMember(owner = "client!tk", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static378.anApplet_Sub1_1 == this && !Static83.aBoolean145) {
			Static133.aLong70 = 0L;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIB)V")
	protected final void method794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static378.anApplet_Sub1_1 == null) {
				Static126.anInt2202 = arg0;
				Static320.anInt5295 = arg0;
				Static434.anInt4327 = 0;
				Static236.anInt3837 = 589;
				Static378.anApplet_Sub1_1 = this;
				Static239.anInt3852 = 0;
				Static92.anInt1618 = arg2;
				Static347.anInt5659 = arg2;
				if (Static41.aClass124_2 == null) {
					Static357.aClass124_5 = Static41.aClass124_2 = new Class124(this, arg1, null, 0);
				}
				@Pc(67) Class215 local67 = Static41.aClass124_2.method2529(this, 1);
				while (local67.anInt5791 == 0) {
					Static252.method2874(10L);
				}
			} else {
				Static138.anInt3549++;
				if (Static138.anInt3549 >= 3) {
					this.method795("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static211.method2815(local80, null);
			this.method795("crash");
		}
	}

	@OriginalMember(owner = "client!tk", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static158.aFrame2 == null) {
			return Static41.aClass124_2 == null || Static41.aClass124_2.anApplet1 == this ? super.getCodeBase() : Static41.aClass124_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method795(@OriginalArg(0) String arg0) {
		if (this.aBoolean73) {
			return;
		}
		this.aBoolean73 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static460.method3422("loggedout", Static41.aClass124_2.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!tk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}
}
