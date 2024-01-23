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

@OriginalClass("client!ea")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!ea", name = "providesignlink", descriptor = "(Lclient!ua;)V")
	public static void providesignlink(@OriginalArg(0) Class176 arg0) {
		Static274.aClass176_4 = arg0;
		Static202.aClass176_1 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static153.anApplet_Sub1_1 == this && !Static176.aBoolean236) {
			Static177.aLong149 = Static128.method2196();
			Static150.method2552(5000L);
			Static202.aClass176_1 = null;
			this.method605(false);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	protected abstract void method592();

	@OriginalMember(owner = "client!ea", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	protected abstract void method595();

	@OriginalMember(owner = "client!ea", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	protected final void method596(@OriginalArg(2) int arg0) {
		try {
			if (Static153.anApplet_Sub1_1 != null) {
				Static65.anInt1223++;
				if (Static65.anInt1223 >= 3) {
					this.method602("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static253.anInt5224 = 765;
			Static199.anInt3882 = 765;
			Static91.anInt1673 = 1554;
			Static153.anApplet_Sub1_1 = this;
			Static123.anInt2333 = 503;
			Static256.anInt5286 = 503;
			Static307.anInt6024 = 0;
			Static59.anInt1138 = 0;
			@Pc(50) String local50 = this.getParameter("openwinjs");
			if (local50 != null && local50.equals("1")) {
				Static208.aBoolean292 = true;
			} else {
				Static208.aBoolean292 = false;
			}
			if (Static274.aClass176_4 == null) {
				Static202.aClass176_1 = Static274.aClass176_4 = new Class176(this, arg0, null, 0);
			}
			@Pc(90) Class178 local90 = Static274.aClass176_4.method4523(this, 1);
			while (local90.anInt5649 == 0) {
				Static150.method2552(10L);
			}
			Static161.aThread1 = (Thread) local90.anObject6;
		} catch (@Pc(104) Exception local104) {
			Static42.method613(null, local104);
			this.method602("crash");
		}
	}

	@OriginalMember(owner = "client!ea", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	protected abstract void method597();

	@OriginalMember(owner = "client!ea", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
	protected final boolean method599() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
			return true;
		} else if (local10.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local10.length() > 0 && local10.charAt(local10.length() - 1) >= '0' && local10.charAt(local10.length() - 1) <= '9') {
				local10 = local10.substring(0, local10.length() - 1);
			}
			if (local10.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method602("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILjava/lang/String;IZI)V")
	protected final void method600(@OriginalArg(3) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static91.anInt1673 = 554;
			Static153.anApplet_Sub1_1 = this;
			Static307.anInt6024 = 0;
			Static59.anInt1138 = 0;
			Static253.anInt5224 = 1024;
			Static199.anInt3882 = 1024;
			Static123.anInt2333 = 768;
			Static256.anInt5286 = 768;
			Static276.aFrame2 = new Frame();
			Static276.aFrame2.setTitle("Jagex");
			Static276.aFrame2.setResizable(true);
			Static276.aFrame2.addWindowListener(this);
			Static276.aFrame2.setVisible(true);
			Static276.aFrame2.toFront();
			@Pc(42) Insets local42 = Static276.aFrame2.getInsets();
			Static276.aFrame2.setSize(local42.right + local42.left + Static199.anInt3882, local42.bottom + Static256.anInt5286 - -local42.top);
			Static202.aClass176_1 = Static274.aClass176_4 = new Class176(null, arg0, arg1, 29);
			@Pc(75) Class178 local75 = Static274.aClass176_4.method4523(this, 1);
			while (local75.anInt5649 == 0) {
				Static150.method2552(10L);
			}
			Static161.aThread1 = (Thread) local75.anObject6;
		} catch (@Pc(89) Exception local89) {
			Static42.method613(null, local89);
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	protected abstract void method601();

	@OriginalMember(owner = "client!ea", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static275.aString211 != null) {
				@Pc(10) String local10 = Static275.aString211.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static275.aString213;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method602("wrongjava");
						return;
					}
					Static221.anInt4336 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static275.aString213 == null || Static275.aString213.equals("1.4.2"))) {
					this.method602("wrongjava");
					return;
				}
			}
			@Pc(72) int local72;
			if (Static275.aString213 != null && Static275.aString213.startsWith("1.")) {
				local72 = 2;
				@Pc(74) int local74 = 0;
				while (Static275.aString213.length() > local72) {
					@Pc(82) char local82 = Static275.aString213.charAt(local72);
					if (local82 < '0' || local82 > '9') {
						break;
					}
					local74 = local82 + local74 * 10 - '0';
					local72++;
				}
				if (local74 >= 5) {
					Static253.aBoolean361 = true;
				}
			}
			if (Static274.aClass176_4.anApplet1 != null) {
				@Pc(117) Method local117 = Static275.aMethod1;
				if (local117 != null) {
					try {
						local117.invoke(Static274.aClass176_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(133) Throwable local133) {
					}
				}
			}
			Static25.method410();
			this.method608();
			Static94.aClass128_1 = Static145.method2479(Static224.aCanvas12, Static123.anInt2333, Static253.anInt5224);
			this.method592();
			Static152.aClass34_1 = Static208.method3463();
			this.method606();
			while (Static177.aLong149 == 0L || Static177.aLong149 > Static128.method2196()) {
				Static31.anInt568 = Static152.aClass34_1.method5037(Static99.anInt1825, Static221.anInt4336);
				for (local72 = 0; local72 < Static31.anInt568; local72++) {
					this.method604();
				}
				this.method607();
				Static26.method419(Static274.aClass176_4, Static224.aCanvas12);
			}
		} catch (@Pc(200) Exception local200) {
			Static42.method613(null, local200);
			this.method602("crash");
		}
		this.method605(true);
	}

	@OriginalMember(owner = "client!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static276.aFrame2 == null) {
			return Static274.aClass176_4 == null || Static274.aClass176_4.anApplet1 == this ? super.getParameter(arg0) : Static274.aClass176_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method602(@OriginalArg(0) String arg0) {
		if (this.aBoolean63) {
			return;
		}
		this.aBoolean63 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static325.method4166(Static274.aClass176_4.anApplet1, "loggedout");
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static153.anApplet_Sub1_1 != this || Static176.aBoolean236) {
			return;
		}
		Static176.aBoolean235 = true;
		if (Static253.aBoolean361 && !Static283.aBoolean393 && Static128.method2196() - Static139.aLong148 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static199.anInt3882 && local28.height >= Static256.anInt5286) {
				Static90.aBoolean137 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	protected abstract void method603();

	@OriginalMember(owner = "client!ea", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static276.aFrame2 == null) {
			return Static274.aClass176_4 == null || Static274.aClass176_4.anApplet1 == this ? super.getAppletContext() : Static274.aClass176_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	private void method604() {
		@Pc(3) long local3 = Static302.aLongArray13[Static131.anInt2479];
		@Pc(6) long local6 = Static128.method2196();
		if (local3 != 0L && local3 < local6) {
		}
		Static302.aLongArray13[Static131.anInt2479] = local6;
		Static131.anInt2479 = Static131.anInt2479 + 1 & 0x1F;
		synchronized (this) {
			Static224.aBoolean432 = Static167.aBoolean227;
		}
		this.method601();
	}

	@OriginalMember(owner = "client!ea", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static167.aBoolean227 = false;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	private void method605(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static176.aBoolean236) {
				return;
			}
			Static176.aBoolean236 = true;
		}
		if (Static274.aClass176_4.anApplet1 != null) {
			Static274.aClass176_4.anApplet1.destroy();
		}
		try {
			this.method597();
		} catch (@Pc(34) Exception local34) {
		}
		if (this.aBoolean62) {
			try {
				jagmisc.quit();
			} catch (@Pc(40) Throwable local40) {
			}
			this.aBoolean62 = false;
		}
		Static274.aClass176_4.method4522(Static153.anApplet_Sub1_1.getClass());
		if (Static224.aCanvas12 != null) {
			try {
				Static224.aCanvas12.removeFocusListener(this);
				Static224.aCanvas12.getParent().remove(Static224.aCanvas12);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (Static274.aClass176_4 != null) {
			try {
				Static274.aClass176_4.method4526();
			} catch (@Pc(75) Exception local75) {
			}
		}
		this.method595();
		if (Static276.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(86) Throwable local86) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)V")
	public final void method606() {
		if (this.aBoolean62) {
			return;
		}
		try {
			@Pc(23) Class178 local23 = Static274.aClass176_4.method4508(Static153.anApplet_Sub1_1.getClass());
			while (local23.anInt5649 == 0) {
				Static150.method2552(100L);
			}
			if (local23.anObject6 != null) {
				throw (Throwable) local23.anObject6;
			}
			jagmisc.init();
			this.aBoolean62 = true;
			Static152.aClass34_1 = Static208.method3463();
		} catch (@Pc(52) Throwable local52) {
		}
	}

	@OriginalMember(owner = "client!ea", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static276.aFrame2 == null) {
			return Static274.aClass176_4 == null || Static274.aClass176_4.anApplet1 == this ? super.getDocumentBase() : Static274.aClass176_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static153.anApplet_Sub1_1 == this && !Static176.aBoolean236) {
			Static177.aLong149 = 0L;
		}
	}

	@OriginalMember(owner = "client!ea", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)V")
	private void method607() {
		@Pc(6) long local6 = Static128.method2196();
		@Pc(10) long local10 = Static11.aLongArray11[Static18.anInt343];
		Static11.aLongArray11[Static18.anInt343] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(27) int local27 = (int) (local6 - local10);
			Static199.anInt3877 = ((local27 >> 1) + 32000) / local27;
		}
		Static18.anInt343 = Static18.anInt343 + 1 & 0x1F;
		if (Static281.anInt4667++ > 50) {
			Static176.aBoolean235 = true;
			Static281.anInt4667 -= 50;
			Static224.aCanvas12.setSize(Static253.anInt5224, Static123.anInt2333);
			Static224.aCanvas12.setVisible(true);
			if (Static276.aFrame2 != null && Static73.aFrame1 == null) {
				@Pc(74) Insets local74 = Static276.aFrame2.getInsets();
				Static224.aCanvas12.setLocation(local74.left + Static59.anInt1138, local74.top - -Static307.anInt6024);
			} else {
				Static224.aCanvas12.setLocation(Static59.anInt1138, Static307.anInt6024);
			}
		}
		this.method603();
	}

	@OriginalMember(owner = "client!ea", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static276.aFrame2 == null) {
			return Static274.aClass176_4 == null || Static274.aClass176_4.anApplet1 == this ? super.getCodeBase() : Static274.aClass176_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(I)V")
	public final synchronized void method608() {
		if (Static224.aCanvas12 != null) {
			Static224.aCanvas12.removeFocusListener(this);
			Static224.aCanvas12.getParent().remove(Static224.aCanvas12);
		}
		@Pc(24) Container local24;
		if (Static73.aFrame1 != null) {
			local24 = Static73.aFrame1;
		} else if (Static276.aFrame2 == null) {
			local24 = Static274.aClass176_4.anApplet1;
		} else {
			local24 = Static276.aFrame2;
		}
		local24.setLayout(null);
		Static224.aCanvas12 = new Canvas_Sub1(this);
		local24.add(Static224.aCanvas12);
		Static224.aCanvas12.setSize(Static253.anInt5224, Static123.anInt2333);
		Static224.aCanvas12.setVisible(true);
		if (local24 == Static276.aFrame2) {
			@Pc(60) Insets local60 = Static276.aFrame2.getInsets();
			Static224.aCanvas12.setLocation(Static59.anInt1138 + local60.left, Static307.anInt6024 + local60.top);
		} else {
			Static224.aCanvas12.setLocation(Static59.anInt1138, Static307.anInt6024);
		}
		Static224.aCanvas12.addFocusListener(this);
		Static224.aCanvas12.requestFocus();
		Static167.aBoolean227 = true;
		Static224.aBoolean432 = true;
		Static176.aBoolean235 = true;
		Static90.aBoolean137 = false;
		Static139.aLong148 = Static128.method2196();
	}

	@OriginalMember(owner = "client!ea", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static153.anApplet_Sub1_1 == this && !Static176.aBoolean236) {
			Static177.aLong149 = Static128.method2196() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ea", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static167.aBoolean227 = true;
		Static176.aBoolean235 = true;
	}
}
