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

@OriginalClass("client!hu")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hu", name = "w", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!hu", name = "K", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!hu", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static504.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1803() {
		return null;
	}

	@OriginalMember(owner = "client!hu", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
	protected abstract void method1804();

	@OriginalMember(owner = "client!hu", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static128.anApplet_Sub1_1 == this && !Static68.aBoolean104) {
			Static160.aLong81 = 0L;
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Z")
	protected final boolean method1805() {
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
				this.method1822("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	protected abstract void method1806();

	@OriginalMember(owner = "client!hu", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(Z)V")
	protected abstract void method1807();

	@OriginalMember(owner = "client!hu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static414.aBoolean535 = false;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)Z")
	public final boolean method1808() {
		return Static522.method7730("jaclib");
	}

	@OriginalMember(owner = "client!hu", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static209.aFrame3 == null) {
			return Static504.anApplet2 == null || Static504.anApplet2 == this ? super.getCodeBase() : Static504.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
	protected abstract void method1810();

	@OriginalMember(owner = "client!hu", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZIILjava/lang/String;IIII)V")
	protected final void method1812(@OriginalArg(3) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static518.anInt8973 = 630;
			Static128.anApplet_Sub1_1 = this;
			Static109.anInt2357 = 1024;
			Static463.anInt7087 = 1024;
			Static603.anInt9836 = 0;
			Static349.anInt6748 = 0;
			Static291.anApplet1 = null;
			Static330.anInt6165 = 768;
			Static73.anInt1757 = 768;
			Static209.aFrame3 = new Frame();
			Static209.aFrame3.setTitle("Jagex");
			Static209.aFrame3.setResizable(true);
			Static209.aFrame3.addWindowListener(this);
			Static209.aFrame3.setVisible(true);
			Static209.aFrame3.toFront();
			@Pc(44) Insets local44 = Static209.aFrame3.getInsets();
			Static209.aFrame3.setSize(local44.right + Static463.anInt7087 + local44.left, local44.bottom + local44.top + Static73.anInt1757);
			Static134.aClass138_1 = Static205.aClass138_2 = new Class138(arg1, arg0, 37, true);
			@Pc(76) Class304 local76 = Static205.aClass138_2.method3577(1, this);
			while (local76.anInt8838 == 0) {
				Static258.method4293(10L);
			}
		} catch (@Pc(91) Exception local91) {
			Static335.method5467(null, local91);
		}
	}

	@OriginalMember(owner = "client!hu", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)Z")
	public final boolean method1813() {
		return Static522.method7730("jagtheora");
	}

	@OriginalMember(owner = "client!hu", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(Z)V")
	private void method1815() {
		@Pc(6) long local6 = Static374.method6036();
		@Pc(10) long local10 = Static7.aLongArray7[Static474.anInt8290];
		Static7.aLongArray7[Static474.anInt8290] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(33) int local33 = (int) (local6 - local10);
			Static295.anInt5199 = ((local33 >> 1) + 32000) / local33;
		}
		Static474.anInt8290 = Static474.anInt8290 + 1 & 0x1F;
		if (Static222.anInt4241++ > 50) {
			Static20.aBoolean62 = true;
			Static222.anInt4241 -= 50;
			Static364.aCanvas13.setSize(Static109.anInt2357, Static330.anInt6165);
			Static364.aCanvas13.setVisible(true);
			if (Static209.aFrame3 != null && Static4.aFrame1 == null) {
				@Pc(84) Insets local84 = Static209.aFrame3.getInsets();
				Static364.aCanvas13.setLocation(Static349.anInt6748 + local84.left, local84.top - -Static603.anInt9836);
			} else {
				Static364.aCanvas13.setLocation(Static349.anInt6748, Static603.anInt9836);
			}
		}
		this.method1806();
	}

	@OriginalMember(owner = "client!hu", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static128.anApplet_Sub1_1 == this && !Static68.aBoolean104) {
			Static160.aLong81 = Static374.method6036();
			Static258.method4293(5000L);
			Static134.aClass138_1 = null;
			this.method1821(false);
		}
	}

	@OriginalMember(owner = "client!hu", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static209.aFrame3 == null) {
			return Static504.anApplet2 == null || Static504.anApplet2 == this ? super.getAppletContext() : Static504.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hu", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hu", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static128.anApplet_Sub1_1 == this && !Static68.aBoolean104) {
			Static160.aLong81 = Static374.method6036() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)Z")
	public final boolean method1816() {
		return Static522.method7730("jagmisc");
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method1817(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static128.anApplet_Sub1_1 == null) {
				Static291.anApplet1 = Static504.anApplet2;
				Static330.anInt6165 = arg3;
				Static73.anInt1757 = arg3;
				Static128.anApplet_Sub1_1 = this;
				Static518.anInt8973 = 630;
				Static603.anInt9836 = 0;
				Static109.anInt2357 = arg2;
				Static463.anInt7087 = arg2;
				Static349.anInt6748 = 0;
				Static134.aClass138_1 = Static205.aClass138_2 = new Class138(arg0, arg1, 37, Static504.anApplet2 != null);
				@Pc(66) Class304 local66 = Static205.aClass138_2.method3577(1, this);
				while (local66.anInt8838 == 0) {
					Static258.method4293(10L);
				}
			} else {
				Static143.anInt2869++;
				if (Static143.anInt2869 >= 3) {
					this.method1822("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Throwable local76) {
			Static335.method5467(null, local76);
			this.method1822("crash");
		}
	}

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)V")
	private void method1818() {
		@Pc(6) long local6 = Static374.method6036();
		@Pc(10) long local10 = Static32.aLongArray18[Static123.anInt2590];
		Static32.aLongArray18[Static123.anInt2590] = local6;
		@Pc(23) boolean local23;
		if (local10 == 0L || local10 >= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static123.anInt2590 = Static123.anInt2590 + 1 & 0x1F;
		synchronized (this) {
			Static638.aBoolean726 = Static414.aBoolean535;
		}
		this.method1820();
	}

	@OriginalMember(owner = "client!hu", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static209.aFrame3 == null) {
			return Static504.anApplet2 == null || Static504.anApplet2 == this ? super.getDocumentBase() : Static504.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)V")
	public synchronized void method1819() {
		if (Static364.aCanvas13 != null) {
			Static364.aCanvas13.removeFocusListener(this);
			Static364.aCanvas13.getParent().setBackground(Color.black);
			Static364.aCanvas13.getParent().remove(Static364.aCanvas13);
		}
		@Pc(24) Container local24;
		if (Static4.aFrame1 != null) {
			local24 = Static4.aFrame1;
		} else if (Static209.aFrame3 != null) {
			local24 = Static209.aFrame3;
		} else if (Static504.anApplet2 == null) {
			local24 = Static128.anApplet_Sub1_1;
		} else {
			local24 = Static504.anApplet2;
		}
		local24.setLayout(null);
		Static364.aCanvas13 = new Canvas_Sub1(this);
		local24.add(Static364.aCanvas13);
		Static364.aCanvas13.setSize(Static109.anInt2357, Static330.anInt6165);
		Static364.aCanvas13.setVisible(true);
		if (Static209.aFrame3 == local24) {
			@Pc(69) Insets local69 = Static209.aFrame3.getInsets();
			Static364.aCanvas13.setLocation(local69.left + Static349.anInt6748, Static603.anInt9836 + local69.top);
		} else {
			Static364.aCanvas13.setLocation(Static349.anInt6748, Static603.anInt9836);
		}
		Static364.aCanvas13.addFocusListener(this);
		Static364.aCanvas13.requestFocus();
		Static638.aBoolean726 = true;
		Static414.aBoolean535 = true;
		Static20.aBoolean62 = true;
		Static406.aBoolean531 = false;
		Static192.aLong105 = Static374.method6036();
	}

	@OriginalMember(owner = "client!hu", name = "i", descriptor = "(I)V")
	protected abstract void method1820();

	@OriginalMember(owner = "client!hu", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static211.aString42 != null) {
				@Pc(10) String local10 = Static211.aString42.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static211.aString47;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method1822("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static211.aString47 == null || Static211.aString47.equals("1.4.2"))) {
					this.method1822("wrongjava");
					return;
				}
			}
			if (Static211.aString47 != null && Static211.aString47.startsWith("1.")) {
				@Pc(72) int local72 = 2;
				@Pc(74) int local74 = 0;
				while (local72 < Static211.aString47.length()) {
					@Pc(80) char local80 = Static211.aString47.charAt(local72);
					if (local80 < '0' || local80 > '9') {
						break;
					}
					local74 = local80 + local74 * 10 - '0';
					local72++;
				}
				if (local74 >= 5) {
					Static387.aBoolean515 = true;
				}
			}
			@Pc(113) Applet local113 = Static128.anApplet_Sub1_1;
			if (Static504.anApplet2 != null) {
				local113 = Static504.anApplet2;
			}
			@Pc(119) Method local119 = Static211.aMethod1;
			if (local119 != null) {
				try {
					local119.invoke(local113, Boolean.TRUE);
				} catch (@Pc(133) Throwable local133) {
				}
			}
			Static471.method7103();
			Static169.method2956();
			this.method1819();
			this.method1810();
			Static41.aClass14_1 = Static134.method2555();
			while (Static160.aLong81 == 0L || Static160.aLong81 > Static374.method6036()) {
				Static17.anInt778 = Static41.aClass14_1.method3828(Static307.aLong177);
				for (@Pc(156) int local156 = 0; local156 < Static17.anInt778; local156++) {
					this.method1818();
				}
				this.method1815();
				Static358.method5878(Static205.aClass138_2, Static364.aCanvas13);
			}
		} catch (@Pc(193) ThreadDeath local193) {
			throw local193;
		} catch (@Pc(196) Throwable local196) {
			Static335.method5467(this.method1803(), local196);
			this.method1822("crash");
		} finally {
			@Pc(212) Object local212 = null;
			this.method1821(true);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
	private void method1821(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static68.aBoolean104) {
				return;
			}
			Static68.aBoolean104 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static504.anApplet2 != null) {
			Static504.anApplet2.destroy();
		}
		try {
			this.method1807();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean117) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean117 = false;
		}
		Static122.method2422();
		Static408.method6493();
		if (Static364.aCanvas13 != null) {
			try {
				Static364.aCanvas13.removeFocusListener(this);
				Static364.aCanvas13.getParent().remove(Static364.aCanvas13);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static205.aClass138_2 != null) {
			try {
				Static205.aClass138_2.method3573();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method1804();
		if (Static209.aFrame3 != null) {
			Static209.aFrame3.setVisible(false);
			Static209.aFrame3.dispose();
			Static209.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1822(@OriginalArg(1) String arg0) {
		if (this.aBoolean116) {
			return;
		}
		this.aBoolean116 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static646.method3052(Static504.anApplet2, "loggedout");
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!hu", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static209.aFrame3 == null) {
			return Static504.anApplet2 == null || Static504.anApplet2 == this ? super.getParameter(arg0) : Static504.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static414.aBoolean535 = true;
		Static20.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!hu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!hu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static128.anApplet_Sub1_1 != this || Static68.aBoolean104) {
			return;
		}
		Static20.aBoolean62 = true;
		if (Static387.aBoolean515 && Static374.method6036() - Static192.aLong105 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static463.anInt7087 <= local25.width && local25.height >= Static73.anInt1757) {
				Static406.aBoolean531 = true;
			}
		}
	}
}
