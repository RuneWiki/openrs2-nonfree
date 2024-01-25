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

@OriginalClass("client!wg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!wg", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static55.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static31.anApplet_Sub1_1 == this && !Static64.aBoolean89) {
			Static11.aLong9 = Static184.method3422();
			Static55.method845(5000L);
			Static99.aClass161_3 = null;
			this.method1201(false);
		}
	}

	@OriginalMember(owner = "client!wg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
	protected final boolean method1199() {
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
				this.method1208("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static592.aBoolean682 = true;
		Static493.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V")
	private void method1201(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static64.aBoolean89) {
				return;
			}
			Static64.aBoolean89 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static55.anApplet1 != null) {
			Static55.anApplet1.destroy();
		}
		try {
			this.method1207();
		} catch (@Pc(46) Exception local46) {
		}
		if (this.aBoolean121) {
			try {
				jagmisc.quit();
			} catch (@Pc(52) Throwable local52) {
			}
			this.aBoolean121 = false;
		}
		Static111.method2325();
		Static477.method6637();
		if (Static379.aCanvas13 != null) {
			try {
				Static379.aCanvas13.removeFocusListener(this);
				Static379.aCanvas13.getParent().remove(Static379.aCanvas13);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static147.aClass161_4 != null) {
			try {
				Static147.aClass161_4.method3822();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1215();
		if (Static537.aFrame2 != null) {
			Static537.aFrame2.setVisible(false);
			Static537.aFrame2.dispose();
			Static537.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	protected abstract void method1202();

	@OriginalMember(owner = "client!wg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!wg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static31.anApplet_Sub1_1 == this && !Static64.aBoolean89) {
			Static11.aLong9 = 0L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static537.aFrame2 == null) {
			return Static55.anApplet1 == null || Static55.anApplet1 == this ? super.getParameter(arg0) : Static55.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public synchronized void method1204() {
		if (Static379.aCanvas13 != null) {
			Static379.aCanvas13.removeFocusListener(this);
			Static379.aCanvas13.getParent().setBackground(Color.black);
			Static379.aCanvas13.getParent().remove(Static379.aCanvas13);
		}
		@Pc(22) Container local22;
		if (Static528.aFrame1 != null) {
			local22 = Static528.aFrame1;
		} else if (Static537.aFrame2 != null) {
			local22 = Static537.aFrame2;
		} else if (Static55.anApplet1 == null) {
			local22 = Static31.anApplet_Sub1_1;
		} else {
			local22 = Static55.anApplet1;
		}
		local22.setLayout(null);
		Static379.aCanvas13 = new Canvas_Sub1(this);
		local22.add(Static379.aCanvas13);
		Static379.aCanvas13.setSize(Static2.anInt29, Static19.anInt390);
		Static379.aCanvas13.setVisible(true);
		if (Static537.aFrame2 == local22) {
			@Pc(69) Insets local69 = Static537.aFrame2.getInsets();
			Static379.aCanvas13.setLocation(local69.left + Static191.anInt5908, local69.top + Static249.anInt4946);
		} else {
			Static379.aCanvas13.setLocation(Static191.anInt5908, Static249.anInt4946);
		}
		Static379.aCanvas13.addFocusListener(this);
		Static379.aCanvas13.requestFocus();
		Static340.aBoolean446 = true;
		Static592.aBoolean682 = true;
		Static493.aBoolean599 = true;
		Static118.aBoolean222 = false;
		Static156.aLong81 = Static184.method3422();
	}

	@OriginalMember(owner = "client!wg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static592.aBoolean682 = false;
	}

	@OriginalMember(owner = "client!wg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
	protected abstract void method1205();

	@OriginalMember(owner = "client!wg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static222.aString51 != null) {
				@Pc(10) String local10 = Static222.aString51.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static222.aString47;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1208("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static222.aString47 == null || Static222.aString47.equals("1.4.2"))) {
					this.method1208("wrongjava");
					return;
				}
			}
			if (Static222.aString47 != null && Static222.aString47.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (Static222.aString47.length() > local70) {
					@Pc(78) char local78 = Static222.aString47.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local72 * 10 + local78 - 48;
				}
				if (local72 >= 5) {
					Static519.aBoolean613 = true;
				}
			}
			@Pc(108) Applet local108 = Static31.anApplet_Sub1_1;
			if (Static55.anApplet1 != null) {
				local108 = Static55.anApplet1;
			}
			@Pc(114) Method local114 = Static222.aMethod1;
			if (local114 != null) {
				try {
					local114.invoke(local108, Boolean.TRUE);
				} catch (@Pc(128) Throwable local128) {
				}
			}
			Static189.method3459();
			Static430.method6119();
			this.method1204();
			this.method1209();
			Static66.aClass103_5 = Static40.method692();
			while (Static11.aLong9 == 0L || Static184.method3422() < Static11.aLong9) {
				Static348.anInt6080 = Static66.aClass103_5.method7409(Static156.aLong82);
				for (@Pc(151) int local151 = 0; local151 < Static348.anInt6080; local151++) {
					this.method1213();
				}
				this.method1210();
				Static208.method3668(Static379.aCanvas13, Static147.aClass161_4);
			}
		} catch (@Pc(182) ThreadDeath local182) {
			throw local182;
		} catch (@Pc(185) Throwable local185) {
			Static473.method6593(local185, this.method1214());
			this.method1208("crash");
		} finally {
			@Pc(201) Object local201 = null;
			this.method1201(true);
		}
	}

	@OriginalMember(owner = "client!wg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method1206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (Static31.anApplet_Sub1_1 == null) {
				Static191.anInt5908 = 0;
				Static195.anApplet2 = Static55.anApplet1;
				Static19.anInt390 = arg1;
				Static86.anInt2256 = arg1;
				Static31.anApplet_Sub1_1 = this;
				Static2.anInt29 = arg2;
				Static376.anInt6720 = arg2;
				Static249.anInt4946 = 0;
				Static104.anInt2566 = 617;
				Static99.aClass161_3 = Static147.aClass161_4 = new Class161(arg0, arg3, 35, Static55.anApplet1 != null);
				@Pc(71) Class299 local71 = Static147.aClass161_4.method3827(this, 1);
				while (local71.anInt7985 == 0) {
					Static55.method845(10L);
				}
			} else {
				Static76.anInt1598++;
				if (Static76.anInt1598 >= 3) {
					this.method1208("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static473.method6593(local81, null);
			this.method1208("crash");
		}
	}

	@OriginalMember(owner = "client!wg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static31.anApplet_Sub1_1 != this || Static64.aBoolean89) {
			return;
		}
		Static493.aBoolean599 = true;
		if (Static519.aBoolean613 && Static184.method3422() - Static156.aLong81 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static376.anInt6720 <= local26.width && Static86.anInt2256 <= local26.height) {
				Static118.aBoolean222 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static31.anApplet_Sub1_1 == this && !Static64.aBoolean89) {
			Static11.aLong9 = Static184.method3422() + 4000L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static537.aFrame2 == null) {
			return Static55.anApplet1 == null || Static55.anApplet1 == this ? super.getAppletContext() : Static55.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(Z)V")
	protected abstract void method1207();

	@OriginalMember(owner = "client!wg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1208(@OriginalArg(0) String arg0) {
		if (this.aBoolean120) {
			return;
		}
		this.aBoolean120 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static611.method6758("loggedout", Static55.anApplet1);
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(Z)V")
	protected abstract void method1209();

	@OriginalMember(owner = "client!wg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(Z)V")
	private void method1210() {
		@Pc(6) long local6 = Static184.method3422();
		@Pc(10) long local10 = Static549.aLongArray15[Static371.anInt6685];
		Static549.aLongArray15[Static371.anInt6685] = local6;
		Static371.anInt6685 = Static371.anInt6685 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static317.anInt5705 = ((local34 >> 1) + 32000) / local34;
		}
		if (Static25.anInt461++ > 50) {
			Static493.aBoolean599 = true;
			Static25.anInt461 -= 50;
			Static379.aCanvas13.setSize(Static2.anInt29, Static19.anInt390);
			Static379.aCanvas13.setVisible(true);
			if (Static537.aFrame2 != null && Static528.aFrame1 == null) {
				@Pc(69) Insets local69 = Static537.aFrame2.getInsets();
				Static379.aCanvas13.setLocation(Static191.anInt5908 + local69.left, Static249.anInt4946 + local69.top);
			} else {
				Static379.aCanvas13.setLocation(Static191.anInt5908, Static249.anInt4946);
			}
		}
		this.method1205();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Z")
	public final boolean method1211() {
		return Static157.method5013("jaclib");
	}

	@OriginalMember(owner = "client!wg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static537.aFrame2 == null) {
			return Static55.anApplet1 == null || Static55.anApplet1 == this ? super.getCodeBase() : Static55.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;IIBIIIZ)V")
	protected final void method1212(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static195.anApplet2 = null;
			Static104.anInt2566 = 617;
			Static2.anInt29 = 1024;
			Static376.anInt6720 = 1024;
			Static19.anInt390 = 768;
			Static86.anInt2256 = 768;
			Static191.anInt5908 = 0;
			Static249.anInt4946 = 0;
			Static31.anApplet_Sub1_1 = this;
			Static537.aFrame2 = new Frame();
			Static537.aFrame2.setTitle("Jagex");
			Static537.aFrame2.setResizable(true);
			Static537.aFrame2.addWindowListener(this);
			Static537.aFrame2.setVisible(true);
			Static537.aFrame2.toFront();
			@Pc(48) Insets local48 = Static537.aFrame2.getInsets();
			Static537.aFrame2.setSize(Static376.anInt6720 + local48.left + local48.right, local48.bottom + (Static86.anInt2256 - -local48.top));
			Static99.aClass161_3 = Static147.aClass161_4 = new Class161(arg1, arg0, 35, true);
			@Pc(82) Class299 local82 = Static147.aClass161_4.method3827(this, 1);
			while (local82.anInt7985 == 0) {
				Static55.method845(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static473.method6593(local95, null);
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	private void method1213() {
		@Pc(6) long local6 = Static184.method3422();
		@Pc(15) long local15 = Static581.aLongArray16[Static425.anInt7330];
		Static581.aLongArray16[Static425.anInt7330] = local6;
		@Pc(28) boolean local28;
		if (local15 == 0L || local6 <= local15) {
			local28 = false;
		} else {
			local28 = true;
		}
		Static425.anInt7330 = Static425.anInt7330 + 1 & 0x1F;
		synchronized (this) {
			Static340.aBoolean446 = Static592.aBoolean682;
		}
		this.method1202();
	}

	@OriginalMember(owner = "client!wg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static537.aFrame2 == null) {
			return Static55.anApplet1 == null || Static55.anApplet1 == this ? super.getDocumentBase() : Static55.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1214() {
		return null;
	}

	@OriginalMember(owner = "client!wg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	protected abstract void method1215();

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Z")
	public final boolean method1216() {
		return Static157.method5013("jagmisc");
	}

	@OriginalMember(owner = "client!wg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}
}
