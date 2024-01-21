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

@OriginalClass("client!e")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!e", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	private synchronized void method432() {
		if (Static104.aBoolean99) {
			return;
		}
		Static104.aBoolean99 = true;
		try {
			Static4.aCanvas2.removeFocusListener(this);
		} catch (@Pc(22) Exception local22) {
		}
		try {
			this.method443();
		} catch (@Pc(27) Exception local27) {
		}
		if (Static79.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(33) Throwable local33) {
			}
		}
		if (Static86.aClass80_2 != null) {
			try {
				Static86.aClass80_2.method2041();
			} catch (@Pc(41) Exception local41) {
			}
		}
		this.method440();
	}

	@OriginalMember(owner = "client!e", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static60.anApplet_Sub1_1 == this && !Static104.aBoolean99) {
			Static67.aLong55 = 0L;
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static128.aString3 != null) {
				@Pc(10) String local10 = Static128.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static128.aString5;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method438("wrongjava");
						return;
					}
					Static59.anInt1435 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static128.aString5 == null || Static128.aString5.equals("1.4.2"))) {
					this.method438("wrongjava");
					return;
				}
			}
			if (Static86.aClass80_2.anApplet1 != null) {
				@Pc(69) Method local69 = Static128.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static86.aClass80_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method447();
			Static11.aClass36_1 = Static25.method512(Static4.aCanvas2, Static75.anInt1775, Static4.anInt2610);
			this.method433();
			Static114.aClass47_1 = Static81.method2180();
			while (Static67.aLong55 == 0L || Static67.aLong55 > Static102.method1742()) {
				Static106.anInt2742 = Static114.aClass47_1.method1288(Static118.anInt3018, Static59.anInt1435);
				for (@Pc(110) int local110 = 0; local110 < Static106.anInt2742; local110++) {
					this.method435();
				}
				this.method448();
				Static121.method1906(Static4.aCanvas2, Static86.aClass80_2);
			}
		} catch (@Pc(143) Exception local143) {
			Static21.method462(null, local143);
			this.method438("crash");
		}
		this.method432();
	}

	@OriginalMember(owner = "client!e", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static60.anApplet_Sub1_1 == this && !Static104.aBoolean99) {
			Static67.aLong55 = Static102.method1742() + 4000L;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	protected abstract void method433();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	private void method435() {
		@Pc(3) long local3 = Static111.aLongArray6[Static44.anInt1128];
		@Pc(6) long local6 = Static102.method1742();
		Static111.aLongArray6[Static44.anInt1128] = local6;
		Static44.anInt1128 = Static44.anInt1128 + 1 & 0x1F;
		@Pc(29) boolean local29;
		if (local3 == 0L || local3 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		synchronized (this) {
			Static60.aBoolean51 = Static76.aBoolean73;
		}
		this.method442();
	}

	@OriginalMember(owner = "client!e", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!e", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	protected abstract void method437();

	@OriginalMember(owner = "client!e", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static79.aFrame1 == null) {
			return Static86.aClass80_2 == null || Static86.aClass80_2.anApplet1 == this ? super.getCodeBase() : Static86.aClass80_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method438(@OriginalArg(1) String arg0) {
		if (this.aBoolean19) {
			return;
		}
		this.aBoolean19 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Z")
	protected final boolean method439() {
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
				this.method438("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static76.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
	protected abstract void method440();

	@OriginalMember(owner = "client!e", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!e", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	protected abstract void method442();

	@OriginalMember(owner = "client!e", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
	protected abstract void method443();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method444(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			Static4.anInt2610 = 765;
			Static60.anApplet_Sub1_1 = this;
			Static75.anInt1775 = 503;
			Static100.anInt2608 = 471;
			Static79.aFrame1 = new Frame();
			Static79.aFrame1.setTitle("Jagex");
			Static79.aFrame1.setResizable(false);
			Static79.aFrame1.addWindowListener(this);
			Static79.aFrame1.setVisible(true);
			Static79.aFrame1.toFront();
			@Pc(36) Insets local36 = Static79.aFrame1.getInsets();
			Static79.aFrame1.setSize(local36.right + local36.left + 765, local36.top + 503 - -local36.bottom);
			Static123.aClass80_4 = Static86.aClass80_2 = new Class80(true, null, arg0, arg1, 16);
			Static86.aClass80_2.method2040(this, 1);
		} catch (@Pc(73) Exception local73) {
			Static21.method462(null, local73);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIBI)V")
	protected final void method446(@OriginalArg(1) int arg0) {
		try {
			if (Static60.anApplet_Sub1_1 == null) {
				Static60.anApplet_Sub1_1 = this;
				Static4.anInt2610 = 765;
				Static75.anInt1775 = 503;
				Static100.anInt2608 = 471;
				if (Static86.aClass80_2 == null) {
					Static123.aClass80_4 = Static86.aClass80_2 = new Class80(false, this, arg0, null, 0);
				}
				Static86.aClass80_2.method2040(this, 1);
			} else {
				Static133.anInt3397++;
				if (Static133.anInt3397 >= 3) {
					this.method438("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static21.method462(null, local61);
			this.method438("crash");
		}
	}

	@OriginalMember(owner = "client!e", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static60.anApplet_Sub1_1 != this || Static104.aBoolean99) {
			return;
		}
		Static58.aBoolean50 = true;
		if (Static128.aString5 != null && Static128.aString5.startsWith("1.5") && Static102.method1742() - Static72.aLong65 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || Static4.anInt2610 <= local27.width && Static75.anInt1775 <= local27.height) {
				Static113.aBoolean103 = true;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	protected final synchronized void method447() {
		@Pc(6) Container local6;
		if (Static79.aFrame1 == null) {
			local6 = Static86.aClass80_2.anApplet1;
		} else {
			local6 = Static79.aFrame1;
		}
		if (Static4.aCanvas2 != null) {
			Static4.aCanvas2.removeFocusListener(this);
			local6.remove(Static4.aCanvas2);
		}
		Static4.aCanvas2 = new Canvas_Sub1(this);
		local6.add(Static4.aCanvas2);
		Static4.aCanvas2.setSize(Static4.anInt2610, Static75.anInt1775);
		Static4.aCanvas2.setVisible(true);
		if (Static79.aFrame1 == null) {
			Static4.aCanvas2.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static79.aFrame1.getInsets();
			Static4.aCanvas2.setLocation(local43.left, local43.top);
		}
		Static4.aCanvas2.addFocusListener(this);
		Static4.aCanvas2.requestFocus();
		Static58.aBoolean50 = true;
		Static113.aBoolean103 = false;
		Static72.aLong65 = Static102.method1742();
	}

	@OriginalMember(owner = "client!e", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static79.aFrame1 == null) {
			return Static86.aClass80_2 == null || Static86.aClass80_2.anApplet1 == this ? super.getAppletContext() : Static86.aClass80_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	private void method448() {
		@Pc(3) long local3 = Static50.aLongArray2[Static77.anInt1913];
		@Pc(6) long local6 = Static102.method1742();
		Static50.aLongArray2[Static77.anInt1913] = local6;
		if (local3 != 0L && local3 < local6) {
			@Pc(28) int local28 = (int) (local6 - local3);
			Static1.anInt14 = ((local28 >> 1) + 32000) / local28;
		}
		Static77.anInt1913 = Static77.anInt1913 + 1 & 0x1F;
		if (Static44.anInt1134++ > 50) {
			Static58.aBoolean50 = true;
			Static44.anInt1134 -= 50;
			Static4.aCanvas2.setSize(Static4.anInt2610, Static75.anInt1775);
			Static4.aCanvas2.setVisible(true);
			if (Static79.aFrame1 == null) {
				Static4.aCanvas2.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static79.aFrame1.getInsets();
				Static4.aCanvas2.setLocation(local79.left, local79.top);
			}
		}
		this.method437();
	}

	@OriginalMember(owner = "client!e", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!e", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static79.aFrame1 == null) {
			return Static86.aClass80_2 == null || Static86.aClass80_2.anApplet1 == this ? super.getDocumentBase() : Static86.aClass80_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static76.aBoolean73 = true;
		Static58.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!e", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static79.aFrame1 == null) {
			return Static86.aClass80_2 == null || Static86.aClass80_2.anApplet1 == this ? super.getParameter(arg0) : Static86.aClass80_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!e", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!e", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static60.anApplet_Sub1_1 == this && !Static104.aBoolean99) {
			Static67.aLong55 = Static102.method1742();
			Static118.method1893(5000L);
			Static123.aClass80_4 = null;
			this.method432();
		}
	}
}
