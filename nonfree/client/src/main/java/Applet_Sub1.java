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

@OriginalClass("client!we")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Z")
	private boolean aBoolean32 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	protected final synchronized void method367() {
		@Pc(6) Container local6;
		if (Static44.aFrame1 == null) {
			local6 = Static67.aClass75_4.anApplet1;
		} else {
			local6 = Static44.aFrame1;
		}
		if (Static58.aCanvas1 != null) {
			Static58.aCanvas1.removeFocusListener(this);
			local6.remove(Static58.aCanvas1);
		}
		Static58.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static58.aCanvas1);
		Static58.aCanvas1.setSize(Static96.anInt2603, Static93.anInt2527);
		Static58.aCanvas1.setVisible(true);
		if (Static44.aFrame1 == null) {
			Static58.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static44.aFrame1.getInsets();
			Static58.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static58.aCanvas1.addFocusListener(this);
		Static58.aCanvas1.requestFocus();
		Static24.aBoolean47 = true;
		Static121.aBoolean175 = false;
		Static14.aLong13 = Static87.method1625();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	private void method368() {
		@Pc(2) long local2 = Static87.method1625();
		@Pc(15) long local15 = Static53.aLongArray4[Static65.anInt1962];
		Static53.aLongArray4[Static65.anInt1962] = local2;
		if (local15 != 0L && local2 > local15) {
			@Pc(33) int local33 = (int) (local2 - local15);
			Static121.anInt3167 = ((local33 >> 1) + 32000) / local33;
		}
		Static65.anInt1962 = Static65.anInt1962 + 1 & 0x1F;
		if (Static47.anInt1428++ > 50) {
			Static24.aBoolean47 = true;
			Static47.anInt1428 -= 50;
			Static58.aCanvas1.setSize(Static96.anInt2603, Static93.anInt2527);
			Static58.aCanvas1.setVisible(true);
			if (Static44.aFrame1 == null) {
				Static58.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(72) Insets local72 = Static44.aFrame1.getInsets();
				Static58.aCanvas1.setLocation(local72.left, local72.top);
			}
		}
		this.method369();
	}

	@OriginalMember(owner = "client!we", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static44.aFrame1 == null) {
			return Static67.aClass75_4 == null || Static67.aClass75_4.anApplet1 == this ? super.getParameter(arg0) : Static67.aClass75_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	protected abstract void method369();

	@OriginalMember(owner = "client!we", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static44.aFrame1 == null) {
			return Static67.aClass75_4 == null || Static67.aClass75_4.anApplet1 == this ? super.getCodeBase() : Static67.aClass75_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILjava/lang/String;ZI)V")
	protected final void method371(@OriginalArg(4) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static36.anInt1191 = 464;
			Static93.anInt2527 = 503;
			Static114.anApplet_Sub1_1 = this;
			Static96.anInt2603 = 765;
			Static44.aFrame1 = new Frame();
			Static44.aFrame1.setTitle("Jagex");
			Static44.aFrame1.setResizable(false);
			Static44.aFrame1.addWindowListener(this);
			Static44.aFrame1.setVisible(true);
			Static44.aFrame1.toFront();
			@Pc(28) Insets local28 = Static44.aFrame1.getInsets();
			Static44.aFrame1.setSize(local28.left + local28.right + 765, local28.bottom + (503 - -local28.top));
			Static125.aClass75_6 = Static67.aClass75_4 = new Class75(true, null, arg1, arg0, 16);
			Static67.aClass75_4.method2174(this, 1);
		} catch (@Pc(64) Exception local64) {
			Static38.method768(local64, null);
		}
	}

	@OriginalMember(owner = "client!we", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static114.anApplet_Sub1_1 == this && !Static47.aBoolean77) {
			Static80.aLong68 = 0L;
		}
	}

	@OriginalMember(owner = "client!we", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	protected abstract void method373();

	@OriginalMember(owner = "client!we", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static53.aBoolean84 = true;
		Static24.aBoolean47 = true;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	protected abstract void method374();

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
	private synchronized void method375() {
		if (Static47.aBoolean77) {
			return;
		}
		Static47.aBoolean77 = true;
		try {
			Static58.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method378();
		} catch (@Pc(25) Exception local25) {
		}
		if (Static44.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		if (Static67.aClass75_4 != null) {
			try {
				Static67.aClass75_4.method2176();
			} catch (@Pc(39) Exception local39) {
			}
		}
		this.method373();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method376(@OriginalArg(1) String arg0) {
		if (this.aBoolean32) {
			return;
		}
		this.aBoolean32 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!we", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!we", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	protected abstract void method378();

	@OriginalMember(owner = "client!we", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static114.anApplet_Sub1_1 == this && !Static47.aBoolean77) {
			Static80.aLong68 = Static87.method1625();
			Static40.method783(5000L);
			Static125.aClass75_6 = null;
			this.method375();
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	private void method379() {
		@Pc(6) long local6 = Static87.method1625();
		@Pc(15) long local15 = Static67.aLongArray7[Static7.anInt190];
		@Pc(24) boolean local24;
		if (local15 == 0L || local15 >= local6) {
			local24 = false;
		} else {
			local24 = true;
		}
		Static67.aLongArray7[Static7.anInt190] = local6;
		Static7.anInt190 = Static7.anInt190 + 1 & 0x1F;
		synchronized (this) {
			Static4.aBoolean12 = Static53.aBoolean84;
		}
		this.method382();
	}

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static123.aString3 != null) {
				@Pc(10) String local10 = Static123.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static123.aString5;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method376("wrongjava");
						return;
					}
					Static100.anInt3234 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static123.aString5 == null || Static123.aString5.equals("1.4.2"))) {
					this.method376("wrongjava");
					return;
				}
			}
			if (Static67.aClass75_4.anApplet1 != null) {
				@Pc(68) Method local68 = Static123.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static67.aClass75_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method367();
			Static102.aClass6_1 = Static103.method1908(Static96.anInt2603, Static58.aCanvas1, Static93.anInt2527);
			this.method374();
			Static81.aClass11_1 = Static73.method1340();
			while (Static80.aLong68 == 0L || Static80.aLong68 > Static87.method1625()) {
				Static60.anInt1825 = Static81.aClass11_1.method2164(Static100.anInt3234, Static52.anInt1617);
				for (@Pc(109) int local109 = 0; local109 < Static60.anInt1825; local109++) {
					this.method379();
				}
				this.method368();
				Static38.method770(Static58.aCanvas1, Static67.aClass75_4);
			}
		} catch (@Pc(144) Exception local144) {
			Static38.method768(local144, null);
			this.method376("crash");
		}
		this.method375();
	}

	@OriginalMember(owner = "client!we", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static44.aFrame1 == null) {
			return Static67.aClass75_4 == null || Static67.aClass75_4.anApplet1 == this ? super.getDocumentBase() : Static67.aClass75_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBII)V")
	protected final void method380(@OriginalArg(4) int arg0) {
		try {
			if (Static114.anApplet_Sub1_1 == null) {
				Static114.anApplet_Sub1_1 = this;
				Static93.anInt2527 = 503;
				Static36.anInt1191 = 464;
				Static96.anInt2603 = 765;
				if (Static67.aClass75_4 == null) {
					Static125.aClass75_6 = Static67.aClass75_4 = new Class75(false, this, arg0, null, 0);
				}
				Static67.aClass75_4.method2174(this, 1);
			} else {
				Static71.anInt2027++;
				if (Static71.anInt2027 >= 3) {
					this.method376("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static38.method768(local61, null);
			this.method376("crash");
		}
	}

	@OriginalMember(owner = "client!we", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static53.aBoolean84 = false;
	}

	@OriginalMember(owner = "client!we", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static114.anApplet_Sub1_1 != this || Static47.aBoolean77) {
			return;
		}
		Static24.aBoolean47 = true;
		if (Static123.aString5 != null && Static123.aString5.startsWith("1.5") && Static87.method1625() - Static14.aLong13 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static96.anInt2603 && Static93.anInt2527 <= local28.height) {
				Static121.aBoolean175 = true;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!we", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static114.anApplet_Sub1_1 == this && !Static47.aBoolean77) {
			Static80.aLong68 = Static87.method1625() + 4000L;
		}
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "(I)Z")
	protected final boolean method381() {
		@Pc(4) String local4 = this.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method376("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static44.aFrame1 == null) {
			return Static67.aClass75_4 == null || Static67.aClass75_4.anApplet1 == this ? super.getAppletContext() : Static67.aClass75_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(I)V")
	protected abstract void method382();
}
