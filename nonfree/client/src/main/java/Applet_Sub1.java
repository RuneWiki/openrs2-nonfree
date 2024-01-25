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

@OriginalClass("client!lc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!lc", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static287.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	protected abstract void method1732();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
	private void method1733(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static246.aBoolean361) {
				return;
			}
			Static246.aBoolean361 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static287.anApplet2 != null) {
			Static287.anApplet2.destroy();
		}
		try {
			this.method1749();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean164) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean164 = false;
		}
		Static20.method727();
		Static340.method5164();
		if (Static469.aCanvas11 != null) {
			try {
				Static469.aCanvas11.removeFocusListener(this);
				Static469.aCanvas11.getParent().remove(Static469.aCanvas11);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static499.aClass231_4 != null) {
			try {
				Static499.aClass231_4.method5301();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method1744();
		if (Static90.aFrame2 != null) {
			Static90.aFrame2.setVisible(false);
			Static90.aFrame2.dispose();
			Static90.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!lc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static287.anApplet_Sub1_1 == this && !Static246.aBoolean361) {
			Static66.aLong40 = 0L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1734(@OriginalArg(1) String arg0) {
		if (this.aBoolean165) {
			return;
		}
		this.aBoolean165 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static685.method3974(Static287.anApplet2, "loggedout");
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	protected abstract void method1735();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public synchronized void method1736() {
		if (Static469.aCanvas11 != null) {
			Static469.aCanvas11.removeFocusListener(this);
			Static469.aCanvas11.getParent().setBackground(Color.black);
			Static469.aCanvas11.getParent().remove(Static469.aCanvas11);
		}
		@Pc(28) Container local28;
		if (Static153.aFrame3 != null) {
			local28 = Static153.aFrame3;
		} else if (Static90.aFrame2 != null) {
			local28 = Static90.aFrame2;
		} else if (Static287.anApplet2 == null) {
			local28 = Static287.anApplet_Sub1_1;
		} else {
			local28 = Static287.anApplet2;
		}
		local28.setLayout((LayoutManager) null);
		Static469.aCanvas11 = new Canvas_Sub1(this);
		local28.add(Static469.aCanvas11);
		Static469.aCanvas11.setSize(Static654.anInt10064, Static483.anInt8181);
		Static469.aCanvas11.setVisible(true);
		if (local28 == Static90.aFrame2) {
			@Pc(69) Insets local69 = Static90.aFrame2.getInsets();
			Static469.aCanvas11.setLocation(Static225.anInt4116 + local69.left, local69.top - -Static40.anInt1166);
		} else {
			Static469.aCanvas11.setLocation(Static225.anInt4116, Static40.anInt1166);
		}
		Static469.aCanvas11.addFocusListener(this);
		Static469.aCanvas11.requestFocus();
		Static474.aBoolean613 = true;
		Static322.aBoolean468 = true;
		Static27.aBoolean72 = true;
		Static492.aBoolean629 = false;
		Static89.aLong57 = Static131.method2268();
	}

	@OriginalMember(owner = "client!lc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method1737() {
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static287.anApplet_Sub1_1 == this && !Static246.aBoolean361) {
			Static66.aLong40 = Static131.method2268() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static287.anApplet_Sub1_1 == this && !Static246.aBoolean361) {
			Static66.aLong40 = Static131.method2268();
			Static365.method3472(5000L);
			Static310.aClass231_2 = null;
			this.method1733(false);
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	private void method1738() {
		@Pc(6) long local6 = Static131.method2268();
		@Pc(10) long local10 = Static404.aLongArray15[Static300.anInt5494];
		Static404.aLongArray15[Static300.anInt5494] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(31) int local31 = (int) (local6 - local10);
			Static3.anInt18 = ((local31 >> 1) + 32000) / local31;
		}
		Static300.anInt5494 = Static300.anInt5494 + 1 & 0x1F;
		if (Static115.anInt2297++ > 50) {
			Static27.aBoolean72 = true;
			Static115.anInt2297 -= 50;
			Static469.aCanvas11.setSize(Static654.anInt10064, Static483.anInt8181);
			Static469.aCanvas11.setVisible(true);
			if (Static90.aFrame2 != null && Static153.aFrame3 == null) {
				@Pc(72) Insets local72 = Static90.aFrame2.getInsets();
				Static469.aCanvas11.setLocation(Static225.anInt4116 + local72.left, local72.top + Static40.anInt1166);
			} else {
				Static469.aCanvas11.setLocation(Static225.anInt4116, Static40.anInt1166);
			}
		}
		this.method1747();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZIIILjava/lang/String;)V")
	protected final void method1739(@OriginalArg(1) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static654.anInt10064 = 1024;
			Static83.anInt1901 = 1024;
			Static220.anApplet1 = null;
			Static40.anInt1166 = 0;
			Static287.anApplet_Sub1_1 = this;
			Static225.anInt4116 = 0;
			Static334.anInt6107 = 642;
			Static483.anInt8181 = 768;
			Static597.anInt9407 = 768;
			Static90.aFrame2 = new Frame();
			Static90.aFrame2.setTitle("Jagex");
			Static90.aFrame2.setResizable(true);
			Static90.aFrame2.addWindowListener(this);
			Static90.aFrame2.setVisible(true);
			Static90.aFrame2.toFront();
			@Pc(44) Insets local44 = Static90.aFrame2.getInsets();
			Static90.aFrame2.setSize(local44.right + Static83.anInt1901 + local44.left, local44.bottom + (Static597.anInt9407 - -local44.top));
			Static310.aClass231_2 = Static499.aClass231_4 = new Class231(arg0, arg1, 37, true);
			@Pc(77) Class129 local77 = Static499.aClass231_4.method5297(1, this);
			while (local77.anInt3299 == 0) {
				Static365.method3472(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static81.method1711((String) null, local95);
		}
	}

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static353.aString79 != null) {
				@Pc(10) String local10 = Static353.aString79.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static353.aString84;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method1734("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static353.aString84 == null || Static353.aString84.equals("1.4.2"))) {
					this.method1734("wrongjava");
					return;
				}
			}
			if (Static353.aString84 != null && Static353.aString84.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static353.aString84.length()) {
					@Pc(79) char local79 = Static353.aString84.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local73 * 10 + local79 - 48;
					local71++;
				}
				if (local73 >= 5) {
					Static388.aBoolean514 = true;
				}
			}
			@Pc(111) Applet local111 = Static287.anApplet_Sub1_1;
			if (Static287.anApplet2 != null) {
				local111 = Static287.anApplet2;
			}
			@Pc(117) Method local117 = Static353.aMethod2;
			if (local117 != null) {
				try {
					local117.invoke(local111, Boolean.TRUE);
				} catch (@Pc(131) Throwable local131) {
				}
			}
			Static212.method3371();
			Static255.method4049();
			this.method1736();
			this.method1732();
			Static258.aClass212_1 = Static14.method137();
			while (Static66.aLong40 == 0L || Static66.aLong40 > Static131.method2268()) {
				Static651.anInt10024 = Static258.aClass212_1.method7748(Static201.aLong102);
				for (@Pc(154) int local154 = 0; local154 < Static651.anInt10024; local154++) {
					this.method1746();
				}
				this.method1738();
				Static297.method4593(Static499.aClass231_4, Static469.aCanvas11);
			}
		} catch (@Pc(187) ThreadDeath local187) {
			throw local187;
		} catch (@Pc(190) Throwable local190) {
			Static81.method1711(this.method1737(), local190);
			this.method1734("crash");
		} finally {
			@Pc(206) Object local206 = null;
			this.method1733(true);
		}
	}

	@OriginalMember(owner = "client!lc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Z")
	public final boolean method1740() {
		return Static519.method7352("jagtheora");
	}

	@OriginalMember(owner = "client!lc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static322.aBoolean468 = true;
		Static27.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)Z")
	public final boolean method1741() {
		return Static519.method7352("jaclib");
	}

	@OriginalMember(owner = "client!lc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static90.aFrame2 == null) {
			return Static287.anApplet2 == null || Static287.anApplet2 == this ? super.getAppletContext() : Static287.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z")
	public final boolean method1743() {
		return Static519.method7352("jagmisc");
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	protected abstract void method1744();

	@OriginalMember(owner = "client!lc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static90.aFrame2 == null) {
			return Static287.anApplet2 == null || Static287.anApplet2 == this ? super.getParameter(arg0) : Static287.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static287.anApplet_Sub1_1 != this || Static246.aBoolean361) {
			return;
		}
		Static27.aBoolean72 = true;
		if (Static388.aBoolean514 && Static131.method2268() - Static89.aLong57 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static83.anInt1901 <= local24.width && local24.height >= Static597.anInt9407) {
				Static492.aBoolean629 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static90.aFrame2 == null) {
			return Static287.anApplet2 == null || Static287.anApplet2 == this ? super.getDocumentBase() : Static287.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static322.aBoolean468 = false;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	private void method1746() {
		@Pc(8) long local8 = Static131.method2268();
		@Pc(12) long local12 = Static341.aLongArray13[Static251.anInt4685];
		Static341.aLongArray13[Static251.anInt4685] = local8;
		@Pc(29) boolean local29;
		if (local12 == 0L || local8 <= local12) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static251.anInt4685 = Static251.anInt4685 + 1 & 0x1F;
		synchronized (this) {
			Static474.aBoolean613 = Static322.aBoolean468;
		}
		this.method1735();
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	protected abstract void method1747();

	@OriginalMember(owner = "client!lc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static90.aFrame2 == null) {
			return Static287.anApplet2 == null || Static287.anApplet2 == this ? super.getCodeBase() : Static287.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method1748(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		try {
			if (Static287.anApplet_Sub1_1 == null) {
				Static654.anInt10064 = arg1;
				Static83.anInt1901 = arg1;
				Static483.anInt8181 = arg2;
				Static597.anInt9407 = arg2;
				Static220.anApplet1 = Static287.anApplet2;
				Static40.anInt1166 = 0;
				Static287.anApplet_Sub1_1 = this;
				Static334.anInt6107 = 642;
				Static225.anInt4116 = 0;
				Static310.aClass231_2 = Static499.aClass231_4 = new Class231(arg0, arg3, 37, Static287.anApplet2 != null);
				@Pc(71) Class129 local71 = Static499.aClass231_4.method5297(1, this);
				while (local71.anInt3299 == 0) {
					Static365.method3472(10L);
				}
			} else {
				Static397.anInt6854++;
				if (Static397.anInt6854 >= 3) {
					this.method1734("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static81.method1711((String) null, local81);
			this.method1734("crash");
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V")
	protected abstract void method1749();

	@OriginalMember(owner = "client!lc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)Z")
	protected final boolean method1750() {
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
				this.method1734("invalidhost");
				return false;
			}
		}
	}
}
