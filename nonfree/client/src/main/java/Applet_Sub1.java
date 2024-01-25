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

@OriginalClass("client!vt")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "Z")
	private boolean aBoolean127 = false;

	@OriginalMember(owner = "client!vt", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static234.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!vt", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static493.anApplet_Sub1_1 == this && !Static213.aBoolean113) {
			Static108.aLong77 = 0L;
		}
	}

	@OriginalMember(owner = "client!vt", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static397.aBoolean529 = false;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IZ)V")
	private void method1307(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static213.aBoolean113) {
				return;
			}
			Static213.aBoolean113 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static234.anApplet2 != null) {
			Static234.anApplet2.destroy();
		}
		try {
			this.method1313();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean128) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean128 = false;
		}
		Static46.method928();
		Static598.method2774();
		if (Static147.aCanvas5 != null) {
			try {
				Static147.aCanvas5.removeFocusListener(this);
				Static147.aCanvas5.getParent().remove(Static147.aCanvas5);
			} catch (@Pc(71) Exception local71) {
			}
		}
		if (Static375.aClass359_4 != null) {
			try {
				Static375.aClass359_4.method8261();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method1311();
		if (Static503.aFrame3 != null) {
			Static503.aFrame3.setVisible(false);
			Static503.aFrame3.dispose();
			Static503.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!vt", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1308(@OriginalArg(1) String arg0) {
		if (this.aBoolean127) {
			return;
		}
		this.aBoolean127 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static648.method3663("loggedout", Static234.anApplet2);
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)V")
	public synchronized void method1309() {
		if (Static147.aCanvas5 != null) {
			Static147.aCanvas5.removeFocusListener(this);
			Static147.aCanvas5.getParent().setBackground(Color.black);
			Static147.aCanvas5.getParent().remove(Static147.aCanvas5);
		}
		@Pc(20) Container local20;
		if (Static275.aFrame2 != null) {
			local20 = Static275.aFrame2;
		} else if (Static503.aFrame3 != null) {
			local20 = Static503.aFrame3;
		} else if (Static234.anApplet2 == null) {
			local20 = Static493.anApplet_Sub1_1;
		} else {
			local20 = Static234.anApplet2;
		}
		local20.setLayout(null);
		Static147.aCanvas5 = new Canvas_Sub1(this);
		local20.add(Static147.aCanvas5);
		Static147.aCanvas5.setSize(Static571.anInt9399, Static585.anInt9606);
		Static147.aCanvas5.setVisible(true);
		if (local20 == Static503.aFrame3) {
			@Pc(58) Insets local58 = Static503.aFrame3.getInsets();
			Static147.aCanvas5.setLocation(Static480.anInt8253 + local58.left, Static386.anInt6957 + local58.top);
		} else {
			Static147.aCanvas5.setLocation(Static480.anInt8253, Static386.anInt6957);
		}
		Static147.aCanvas5.addFocusListener(this);
		Static147.aCanvas5.requestFocus();
		Static540.aBoolean661 = true;
		Static397.aBoolean529 = true;
		Static85.aBoolean151 = true;
		Static571.aBoolean684 = false;
		Static397.aLong203 = Static438.method6517();
	}

	@OriginalMember(owner = "client!vt", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static503.aFrame3 == null) {
			return Static234.anApplet2 == null || Static234.anApplet2 == this ? super.getDocumentBase() : Static234.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	private void method1310() {
		@Pc(6) long local6 = Static438.method6517();
		@Pc(10) long local10 = Static172.aLongArray11[Static30.anInt6667];
		Static172.aLongArray11[Static30.anInt6667] = local6;
		Static30.anInt6667 = Static30.anInt6667 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(43) int local43 = (int) (local6 - local10);
			Static93.anInt1859 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static81.anInt1733++ > 50) {
			Static85.aBoolean151 = true;
			Static81.anInt1733 -= 50;
			Static147.aCanvas5.setSize(Static571.anInt9399, Static585.anInt9606);
			Static147.aCanvas5.setVisible(true);
			if (Static503.aFrame3 != null && Static275.aFrame2 == null) {
				@Pc(86) Insets local86 = Static503.aFrame3.getInsets();
				Static147.aCanvas5.setLocation(Static480.anInt8253 + local86.left, local86.top + Static386.anInt6957);
			} else {
				Static147.aCanvas5.setLocation(Static480.anInt8253, Static386.anInt6957);
			}
		}
		this.method1316();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
	protected abstract void method1311();

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
	protected abstract void method1312();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
	protected abstract void method1313();

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
	protected abstract void method1314();

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V")
	protected final void method1315(@OriginalArg(2) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static386.anInt6957 = 0;
			Static193.anApplet1 = null;
			Static585.anInt9606 = 768;
			Static547.anInt9285 = 768;
			Static571.anInt9399 = 1024;
			Static519.anInt8672 = 1024;
			Static493.anApplet_Sub1_1 = this;
			Static480.anInt8253 = 0;
			Static80.anInt1718 = 629;
			Static503.aFrame3 = new Frame();
			Static503.aFrame3.setTitle("Jagex");
			Static503.aFrame3.setResizable(true);
			Static503.aFrame3.addWindowListener(this);
			Static503.aFrame3.setVisible(true);
			Static503.aFrame3.toFront();
			@Pc(44) Insets local44 = Static503.aFrame3.getInsets();
			Static503.aFrame3.setSize(Static519.anInt8672 + local44.left + local44.right, local44.bottom + local44.top + Static547.anInt9285);
			Static22.aClass359_8 = Static375.aClass359_4 = new Class359(arg0, arg1, 37, true);
			@Pc(77) Class26 local77 = Static375.aClass359_4.method8278(1, this);
			while (local77.anInt762 == 0) {
				Static57.method1062(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static420.method6396(null, local87);
		}
	}

	@OriginalMember(owner = "client!vt", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(B)V")
	protected abstract void method1316();

	@OriginalMember(owner = "client!vt", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static493.anApplet_Sub1_1 == this && !Static213.aBoolean113) {
			Static108.aLong77 = Static438.method6517();
			Static57.method1062(5000L);
			Static22.aClass359_8 = null;
			this.method1307(false);
		}
	}

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)Z")
	public final boolean method1317() {
		return Static472.method6791("jaclib");
	}

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)Z")
	protected final boolean method1318() {
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
				this.method1308("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!vt", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static503.aFrame3 == null) {
			return Static234.anApplet2 == null || Static234.anApplet2 == this ? super.getParameter(arg0) : Static234.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static503.aFrame3 == null) {
			return Static234.anApplet2 == null || Static234.anApplet2 == this ? super.getAppletContext() : Static234.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)Z")
	public final boolean method1319() {
		return Static472.method6791("jagtheora");
	}

	@OriginalMember(owner = "client!vt", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!vt", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static493.anApplet_Sub1_1 == this && !Static213.aBoolean113) {
			Static108.aLong77 = Static438.method6517() + 4000L;
		}
	}

	@OriginalMember(owner = "client!vt", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)Ljava/lang/String;")
	public String method1320() {
		return null;
	}

	@OriginalMember(owner = "client!vt", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static604.aString95 != null) {
				@Pc(10) String local10 = Static604.aString95.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static604.aString96;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1308("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static604.aString96 == null || Static604.aString96.equals("1.4.2"))) {
					this.method1308("wrongjava");
					return;
				}
			}
			if (Static604.aString96 != null && Static604.aString96.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (Static604.aString96.length() > local71) {
					@Pc(79) char local79 = Static604.aString96.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local73 * 10 + local79 - 48;
					local71++;
				}
				if (local73 >= 5) {
					Static215.aBoolean374 = true;
				}
			}
			@Pc(112) Applet local112 = Static493.anApplet_Sub1_1;
			if (Static234.anApplet2 != null) {
				local112 = Static234.anApplet2;
			}
			@Pc(118) Method local118 = Static604.aMethod2;
			if (local118 != null) {
				try {
					local118.invoke(local112, Boolean.TRUE);
				} catch (@Pc(132) Throwable local132) {
				}
			}
			Static317.method4791();
			Static185.method3331();
			this.method1309();
			this.method1314();
			Static149.aClass15_10 = Static385.method5794();
			while (Static108.aLong77 == 0L || Static108.aLong77 > Static438.method6517()) {
				Static85.anInt1775 = Static149.aClass15_10.method8361(Static303.aLong163);
				for (@Pc(155) int local155 = 0; local155 < Static85.anInt1775; local155++) {
					this.method1323();
				}
				this.method1310();
				Static28.method3675(Static375.aClass359_4, Static147.aCanvas5);
			}
		} catch (@Pc(184) ThreadDeath local184) {
			throw local184;
		} catch (@Pc(187) Throwable local187) {
			Static420.method6396(this.method1320(), local187);
			this.method1308("crash");
		} finally {
			@Pc(203) Object local203 = null;
			this.method1307(true);
		}
	}

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "(I)Z")
	public final boolean method1321() {
		return Static472.method6791("jagmisc");
	}

	@OriginalMember(owner = "client!vt", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static397.aBoolean529 = true;
		Static85.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!vt", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static493.anApplet_Sub1_1 != this || Static213.aBoolean113) {
			return;
		}
		Static85.aBoolean151 = true;
		if (Static215.aBoolean374 && Static438.method6517() - Static397.aLong203 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static519.anInt8672 <= local24.width && local24.height >= Static547.anInt9285) {
				Static571.aBoolean684 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static503.aFrame3 == null) {
			return Static234.anApplet2 == null || Static234.anApplet2 == this ? super.getCodeBase() : Static234.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method1322(@OriginalArg(2) int arg0, @OriginalArg(4) String arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static493.anApplet_Sub1_1 == null) {
				Static80.anInt1718 = 629;
				Static193.anApplet1 = Static234.anApplet2;
				Static493.anApplet_Sub1_1 = this;
				Static480.anInt8253 = 0;
				Static585.anInt9606 = arg0;
				Static547.anInt9285 = arg0;
				Static386.anInt6957 = 0;
				Static571.anInt9399 = arg3;
				Static519.anInt8672 = arg3;
				Static22.aClass359_8 = Static375.aClass359_4 = new Class359(arg2, arg1, 37, Static234.anApplet2 != null);
				@Pc(62) Class26 local62 = Static375.aClass359_4.method8278(1, this);
				while (local62.anInt762 == 0) {
					Static57.method1062(10L);
				}
			} else {
				Static238.anInt4735++;
				if (Static238.anInt4735 >= 3) {
					this.method1308("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(77) Throwable local77) {
			Static420.method6396(null, local77);
			this.method1308("crash");
		}
	}

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "(I)V")
	private void method1323() {
		@Pc(6) long local6 = Static438.method6517();
		@Pc(10) long local10 = Static611.aLongArray16[Static636.anInt10189];
		Static611.aLongArray16[Static636.anInt10189] = local6;
		@Pc(34) boolean local34;
		if (local10 == 0L || local6 <= local10) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static636.anInt10189 = Static636.anInt10189 + 1 & 0x1F;
		synchronized (this) {
			Static540.aBoolean661 = Static397.aBoolean529;
		}
		this.method1312();
	}

	@OriginalMember(owner = "client!vt", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vt", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
