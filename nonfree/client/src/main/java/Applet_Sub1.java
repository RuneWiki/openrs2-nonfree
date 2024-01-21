import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
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

@OriginalClass("client!ua")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	protected abstract void method596();

	@OriginalMember(owner = "client!ua", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method597(@OriginalArg(1) String arg0) {
		if (this.aBoolean38) {
			return;
		}
		this.aBoolean38 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static191.anApplet_Sub1_1 == this && !Static67.aBoolean85) {
			Static106.aLong77 = Static24.method503() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ua", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	protected abstract void method598();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	private void method599() {
		@Pc(2) long local2 = Static24.method503();
		@Pc(10) long local10 = Static15.aLongArray5[Static59.anInt1432];
		@Pc(23) boolean local23;
		if (local10 == 0L || local2 <= local10) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static15.aLongArray5[Static59.anInt1432] = local2;
		Static59.anInt1432 = Static59.anInt1432 + 1 & 0x1F;
		synchronized (this) {
			Static161.aBoolean168 = Static202.aBoolean224;
		}
		this.method598();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	protected abstract void method600();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIII)V")
	protected final void method601(@OriginalArg(2) int arg0) {
		try {
			if (Static191.anApplet_Sub1_1 != null) {
				Static24.anInt655++;
				if (Static24.anInt655 >= 3) {
					this.method597("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static116.anInt2589 = 765;
			Static191.anApplet_Sub1_1 = this;
			Static147.anInt3283 = 503;
			Static207.anInt4079 = 494;
			if (Static76.aClass99_1 == null) {
				Static85.aClass99_5 = Static76.aClass99_1 = new Class99(false, this, arg0, null, 0);
			}
			Static76.aClass99_1.method3421(1, this);
		} catch (@Pc(55) Exception local55) {
			Static151.method2591(null, local55);
			this.method597("crash");
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	private synchronized void method602() {
		@Pc(16) Container local16;
		if (Static32.aFrame1 == null) {
			local16 = Static76.aClass99_1.anApplet1;
		} else {
			local16 = Static32.aFrame1;
		}
		if (Static8.aCanvas1 != null) {
			Static8.aCanvas1.removeFocusListener(this);
			local16.remove(Static8.aCanvas1);
		}
		Static8.aCanvas1 = new Canvas_Sub1(this);
		local16.add(Static8.aCanvas1);
		Static8.aCanvas1.setSize(Static116.anInt2589, Static147.anInt3283);
		Static8.aCanvas1.setVisible(true);
		if (Static32.aFrame1 == null) {
			Static8.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(55) Insets local55 = Static32.aFrame1.getInsets();
			Static8.aCanvas1.setLocation(local55.left, local55.top);
		}
		Static8.aCanvas1.addFocusListener(this);
		Static8.aCanvas1.requestFocus();
		Static63.aBoolean81 = true;
		Static162.aLong115 = Static24.method503();
	}

	@OriginalMember(owner = "client!ua", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static32.aFrame1 == null) {
			return Static76.aClass99_1 == null || Static76.aClass99_1.anApplet1 == this ? super.getDocumentBase() : Static76.aClass99_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static191.anApplet_Sub1_1 == this && !Static67.aBoolean85) {
			Static106.aLong77 = Static24.method503();
			Static75.method3577(5000L);
			Static85.aClass99_5 = null;
			this.method605(false);
		}
	}

	@OriginalMember(owner = "client!ua", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ua", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static191.anApplet_Sub1_1 == this && !Static67.aBoolean85) {
			Static106.aLong77 = 0L;
		}
	}

	@OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static203.aString3 != null) {
				@Pc(10) String local10 = Static203.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static203.aString5;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method597("wrongjava");
						return;
					}
					Static44.anInt1139 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static203.aString5 == null || Static203.aString5.equals("1.4.2"))) {
					this.method597("wrongjava");
					return;
				}
			}
			if (Static76.aClass99_1.anApplet1 != null) {
				@Pc(68) Method local68 = Static203.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static76.aClass99_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method602();
			Static25.aClass7_1 = Static41.method1052(Static8.aCanvas1, Static116.anInt2589, Static147.anInt3283);
			this.method600();
			Static176.aClass3_32 = Static65.method1310();
			while (Static106.aLong77 == 0L || Static106.aLong77 > Static24.method503()) {
				Static106.anInt2403 = Static176.aClass3_32.method3512(Static105.anInt2363, Static44.anInt1139);
				for (@Pc(109) int local109 = 0; local109 < Static106.anInt2403; local109++) {
					this.method599();
				}
				this.method607();
				Static194.method3314(Static8.aCanvas1, Static76.aClass99_1);
			}
		} catch (@Pc(142) Exception local142) {
			Static151.method2591(null, local142);
			this.method597("crash");
		}
		this.method605(true);
	}

	@OriginalMember(owner = "client!ua", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static191.anApplet_Sub1_1 != this || Static67.aBoolean85) {
			return;
		}
		Static63.aBoolean81 = true;
		if (Static203.aString5 == null || !Static203.aString5.startsWith("1.5") || Static24.method503() - Static162.aLong115 <= 1000L) {
			return;
		}
		@Pc(30) Rectangle local30 = arg0.getClipBounds();
		@Pc(49) boolean local49;
		if (local30 == null || Static116.anInt2589 <= local30.width && Static147.anInt3283 <= local30.height) {
			local49 = true;
		} else {
			local49 = false;
		}
	}

	@OriginalMember(owner = "client!ua", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static202.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!ua", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)Z")
	protected final boolean method604() {
		@Pc(6) String local6 = this.getDocumentBase().getHost().toLowerCase();
		if (local6.equals("jagex.com") || local6.endsWith(".jagex.com")) {
			return true;
		} else if (local6.equals("runescape.com") || local6.endsWith(".runescape.com")) {
			return true;
		} else if (local6.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local6.length() > 0 && local6.charAt(local6.length() - 1) >= '0' && local6.charAt(local6.length() - 1) <= '9') {
				local6 = local6.substring(0, local6.length() - 1);
			}
			if (local6.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method597("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static202.aBoolean224 = true;
		Static63.aBoolean81 = true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V")
	private void method605(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static67.aBoolean85) {
				return;
			}
			Static67.aBoolean85 = true;
		}
		if (Static76.aClass99_1.anApplet1 != null) {
			Static76.aClass99_1.anApplet1.destroy();
		}
		if (Static8.aCanvas1 != null) {
			try {
				Static8.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static32.aFrame1 == null) {
					local35 = Static76.aClass99_1.anApplet1;
				} else {
					local35 = Static32.aFrame1;
				}
				local35.remove(Static8.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method608();
		} catch (@Pc(52) Exception local52) {
		}
		if (Static76.aClass99_1 != null) {
			try {
				Static76.aClass99_1.method3420();
			} catch (@Pc(59) Exception local59) {
			}
		}
		this.method609();
		if (Static32.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(73) Throwable local73) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method606(@OriginalArg(0) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static207.anInt4079 = 494;
			Static191.anApplet_Sub1_1 = this;
			Static147.anInt3283 = 503;
			Static116.anInt2589 = 765;
			Static32.aFrame1 = new Frame();
			Static32.aFrame1.setTitle("Jagex");
			Static32.aFrame1.setResizable(false);
			Static32.aFrame1.addWindowListener(this);
			Static32.aFrame1.setVisible(true);
			Static32.aFrame1.toFront();
			@Pc(32) Insets local32 = Static32.aFrame1.getInsets();
			Static32.aFrame1.setSize(local32.left + local32.right + 765, local32.bottom + 503 - -local32.top);
			Static85.aClass99_5 = Static76.aClass99_1 = new Class99(true, null, arg1, arg0, 24);
			Static76.aClass99_1.method3421(1, this);
		} catch (@Pc(69) Exception local69) {
			Static151.method2591(null, local69);
		}
	}

	@OriginalMember(owner = "client!ua", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static32.aFrame1 == null) {
			return Static76.aClass99_1 == null || Static76.aClass99_1.anApplet1 == this ? super.getCodeBase() : Static76.aClass99_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	private void method607() {
		@Pc(13) long local13 = Static24.method503();
		@Pc(17) long local17 = Static130.aLongArray23[Static33.anInt884];
		Static130.aLongArray23[Static33.anInt884] = local13;
		Static33.anInt884 = Static33.anInt884 + 1 & 0x1F;
		if (local17 != 0L && local13 > local17) {
			@Pc(43) int local43 = (int) (local13 - local17);
			Static194.anInt4323 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static7.anInt175++ > 50) {
			Static63.aBoolean81 = true;
			Static7.anInt175 -= 50;
			Static8.aCanvas1.setSize(Static116.anInt2589, Static147.anInt3283);
			Static8.aCanvas1.setVisible(true);
			if (Static32.aFrame1 == null) {
				Static8.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(77) Insets local77 = Static32.aFrame1.getInsets();
				Static8.aCanvas1.setLocation(local77.left, local77.top);
			}
		}
		this.method596();
	}

	@OriginalMember(owner = "client!ua", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static32.aFrame1 == null) {
			return Static76.aClass99_1 == null || Static76.aClass99_1.anApplet1 == this ? super.getAppletContext() : Static76.aClass99_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
	protected abstract void method608();

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	protected abstract void method609();

	@OriginalMember(owner = "client!ua", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static32.aFrame1 == null) {
			return Static76.aClass99_1 == null || Static76.aClass99_1.anApplet1 == this ? super.getParameter(arg0) : Static76.aClass99_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}
}
