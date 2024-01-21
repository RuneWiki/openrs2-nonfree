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

@OriginalClass("client!te")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static44.aBoolean72 = true;
		Static86.aBoolean121 = true;
	}

	@OriginalMember(owner = "client!te", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!te", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static100.anApplet_Sub1_1 == this && !Static31.aBoolean46) {
			Static76.aLong110 = Static35.method634();
			Static109.method2037(5000L);
			Static26.aClass15_1 = null;
			this.method418();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	private synchronized void method418() {
		if (Static31.aBoolean46) {
			return;
		}
		Static31.aBoolean46 = true;
		try {
			Static7.aCanvas1.removeFocusListener(this);
		} catch (@Pc(19) Exception local19) {
		}
		try {
			this.method431();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static116.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static100.aClass15_4 != null) {
			try {
				Static100.aClass15_4.method485();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method428();
	}

	@OriginalMember(owner = "client!te", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static116.aFrame1 == null) {
			return Static100.aClass15_4 == null || Static100.aClass15_4.anApplet1 == this ? super.getCodeBase() : Static100.aClass15_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	protected abstract void method419();

	@OriginalMember(owner = "client!te", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	protected final void method421(@OriginalArg(0) int arg0) {
		try {
			if (Static100.anApplet_Sub1_1 == null) {
				Static49.anInt1468 = 765;
				Static100.anApplet_Sub1_1 = this;
				Static15.anInt602 = 463;
				Static19.anInt660 = 503;
				if (Static100.aClass15_4 == null) {
					Static26.aClass15_1 = Static100.aClass15_4 = new Class15(false, this, arg0, null, 0);
				}
				Static100.aClass15_4.method488(1, this);
			} else {
				Static2.anInt270++;
				if (Static2.anInt270 >= 3) {
					this.method429("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(57) Exception local57) {
			Static65.method1115(null, local57);
			this.method429("crash");
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
	protected final boolean method423() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
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
				this.method429("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static116.aFrame1 == null) {
			return Static100.aClass15_4 == null || Static100.aClass15_4.anApplet1 == this ? super.getParameter(arg0) : Static100.aClass15_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	protected abstract void method424();

	@OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static44.aBoolean72 = false;
	}

	@OriginalMember(owner = "client!te", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static25.aString1 != null) {
				@Pc(10) String local10 = Static25.aString1.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static25.aString2;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method429("wrongjava");
						return;
					}
					Static19.anInt659 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static25.aString2 == null || Static25.aString2.equals("1.4.2"))) {
					this.method429("wrongjava");
					return;
				}
			}
			if (Static100.aClass15_4.anApplet1 != null) {
				@Pc(68) Method local68 = Static25.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static100.aClass15_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method435();
			Static62.aClass6_1 = Static6.method229(Static49.anInt1468, Static19.anInt660, Static7.aCanvas1);
			this.method424();
			Static51.aClass11_1 = Static58.method1030();
			while (Static76.aLong110 == 0L || Static76.aLong110 > Static35.method634()) {
				Static30.anInt911 = Static51.aClass11_1.method1912(Static56.anInt2364, Static19.anInt659);
				for (@Pc(109) int local109 = 0; local109 < Static30.anInt911; local109++) {
					this.method430();
				}
				this.method427();
				Static93.method1597(Static100.aClass15_4, Static7.aCanvas1);
			}
		} catch (@Pc(142) Exception local142) {
			Static65.method1115(null, local142);
			this.method429("crash");
		}
		this.method418();
	}

	@OriginalMember(owner = "client!te", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static100.anApplet_Sub1_1 == this && !Static31.aBoolean46) {
			Static76.aLong110 = 0L;
		}
	}

	@OriginalMember(owner = "client!te", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!te", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	protected abstract void method426();

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	private void method427() {
		@Pc(4) long local4 = Static35.method634();
		@Pc(12) long local12 = Static31.aLongArray2[Static55.anInt1556];
		Static31.aLongArray2[Static55.anInt1556] = local4;
		Static55.anInt1556 = Static55.anInt1556 + 1 & 0x1F;
		if (local12 != 0L && local4 > local12) {
			@Pc(37) int local37 = (int) (local4 - local12);
			Static51.anInt1484 = ((local37 >> 1) + 32000) / local37;
		}
		if (Static84.anInt2207++ > 50) {
			Static86.aBoolean121 = true;
			Static84.anInt2207 -= 50;
			Static7.aCanvas1.setSize(Static49.anInt1468, Static19.anInt660);
			Static7.aCanvas1.setVisible(true);
			if (Static116.aFrame1 == null) {
				Static7.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(83) Insets local83 = Static116.aFrame1.getInsets();
				Static7.aCanvas1.setLocation(local83.left, local83.top);
			}
		}
		this.method426();
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	protected abstract void method428();

	@OriginalMember(owner = "client!te", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method429(@OriginalArg(1) String arg0) {
		if (this.aBoolean34) {
			return;
		}
		this.aBoolean34 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	private void method430() {
		@Pc(3) long local3 = Static50.aLongArray5[Static60.anInt1656];
		@Pc(6) long local6 = Static35.method634();
		Static50.aLongArray5[Static60.anInt1656] = local6;
		Static60.anInt1656 = Static60.anInt1656 + 1 & 0x1F;
		@Pc(40) boolean local40;
		if (local3 == 0L || local3 >= local6) {
			local40 = false;
		} else {
			local40 = true;
		}
		synchronized (this) {
			Static133.aBoolean186 = Static44.aBoolean72;
		}
		this.method419();
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	protected abstract void method431();

	@OriginalMember(owner = "client!te", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static116.aFrame1 == null) {
			return Static100.aClass15_4 == null || Static100.aClass15_4.anApplet1 == this ? super.getAppletContext() : Static100.aClass15_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static100.anApplet_Sub1_1 != this || Static31.aBoolean46) {
			return;
		}
		Static86.aBoolean121 = true;
		if (Static25.aString2 != null && Static25.aString2.startsWith("1.5") && Static35.method634() - Static128.aLong155 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static49.anInt1468 <= local28.width && Static19.anInt660 <= local28.height) {
				Static76.aBoolean108 = true;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIILjava/lang/String;II)V")
	protected final void method434(@OriginalArg(2) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static100.anApplet_Sub1_1 = this;
			Static15.anInt602 = 463;
			Static19.anInt660 = 503;
			Static49.anInt1468 = 765;
			Static116.aFrame1 = new Frame();
			Static116.aFrame1.setTitle("Jagex");
			Static116.aFrame1.setResizable(false);
			Static116.aFrame1.addWindowListener(this);
			Static116.aFrame1.setVisible(true);
			Static116.aFrame1.toFront();
			@Pc(40) Insets local40 = Static116.aFrame1.getInsets();
			Static116.aFrame1.setSize(local40.right + local40.left + 765, local40.bottom + (503 - -local40.top));
			Static26.aClass15_1 = Static100.aClass15_4 = new Class15(true, null, arg0, arg1, 16);
			Static100.aClass15_4.method488(1, this);
		} catch (@Pc(76) Exception local76) {
			Static65.method1115(null, local76);
		}
	}

	@OriginalMember(owner = "client!te", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static100.anApplet_Sub1_1 == this && !Static31.aBoolean46) {
			Static76.aLong110 = Static35.method634() + 4000L;
		}
	}

	@OriginalMember(owner = "client!te", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static116.aFrame1 == null) {
			return Static100.aClass15_4 == null || Static100.aClass15_4.anApplet1 == this ? super.getDocumentBase() : Static100.aClass15_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
	protected final synchronized void method435() {
		@Pc(9) Container local9;
		if (Static116.aFrame1 == null) {
			local9 = Static100.aClass15_4.anApplet1;
		} else {
			local9 = Static116.aFrame1;
		}
		if (Static7.aCanvas1 != null) {
			Static7.aCanvas1.removeFocusListener(this);
			local9.remove(Static7.aCanvas1);
		}
		Static7.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static7.aCanvas1);
		Static7.aCanvas1.setSize(Static49.anInt1468, Static19.anInt660);
		Static7.aCanvas1.setVisible(true);
		if (Static116.aFrame1 == null) {
			Static7.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static116.aFrame1.getInsets();
			Static7.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static7.aCanvas1.addFocusListener(this);
		Static7.aCanvas1.requestFocus();
		Static86.aBoolean121 = true;
		Static76.aBoolean108 = false;
		Static128.aLong155 = Static35.method634();
	}
}
