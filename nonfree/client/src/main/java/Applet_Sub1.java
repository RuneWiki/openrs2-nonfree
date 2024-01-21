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

@OriginalClass("client!hc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!hc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	protected final synchronized void method211() {
		@Pc(13) Container local13;
		if (Static17.aFrame1 == null) {
			local13 = Static121.aClass14_3.anApplet1;
		} else {
			local13 = Static17.aFrame1;
		}
		if (Static1.aCanvas1 != null) {
			Static1.aCanvas1.removeFocusListener(this);
			local13.remove(Static1.aCanvas1);
		}
		Static1.aCanvas1 = new Canvas_Sub1(this);
		local13.add(Static1.aCanvas1);
		Static1.aCanvas1.setSize(Static79.anInt946, Static30.anInt1429);
		Static1.aCanvas1.setVisible(true);
		if (Static17.aFrame1 == null) {
			Static1.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static17.aFrame1.getInsets();
			Static1.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static1.aCanvas1.addFocusListener(this);
		Static1.aCanvas1.requestFocus();
		Static104.aBoolean138 = true;
		Static40.aBoolean68 = false;
		Static24.aLong24 = Static42.method793();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
	protected abstract void method213();

	@OriginalMember(owner = "client!hc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static72.anApplet_Sub1_1 != this || Static43.aBoolean16) {
			return;
		}
		Static104.aBoolean138 = true;
		if (Static16.aString3 != null && Static16.aString3.startsWith("1.5") && Static42.method793() - Static24.aLong24 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || Static79.anInt946 <= local29.width && Static30.anInt1429 <= local29.height) {
				Static40.aBoolean68 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static111.aBoolean143 = false;
	}

	@OriginalMember(owner = "client!hc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static72.anApplet_Sub1_1 == this && !Static43.aBoolean16) {
			Static121.aLong95 = 0L;
		}
	}

	@OriginalMember(owner = "client!hc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	private void method215() {
		@Pc(6) long local6 = Static42.method793();
		@Pc(10) long local10 = Static124.aLongArray65[Static114.anInt2466];
		Static124.aLongArray65[Static114.anInt2466] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static23.anInt536 = ((local28 >> 1) + 32000) / local28;
		}
		Static114.anInt2466 = Static114.anInt2466 + 1 & 0x1F;
		if (Static12.anInt219++ > 50) {
			Static12.anInt219 -= 50;
			Static104.aBoolean138 = true;
			Static1.aCanvas1.setSize(Static79.anInt946, Static30.anInt1429);
			Static1.aCanvas1.setVisible(true);
			if (Static17.aFrame1 == null) {
				Static1.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(69) Insets local69 = Static17.aFrame1.getInsets();
				Static1.aCanvas1.setLocation(local69.left, local69.top);
			}
		}
		this.method225();
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	private synchronized void method216() {
		if (Static43.aBoolean16) {
			return;
		}
		Static43.aBoolean16 = true;
		try {
			Static1.aCanvas1.removeFocusListener(this);
		} catch (@Pc(19) Exception local19) {
		}
		try {
			this.method220();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static17.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static121.aClass14_3 != null) {
			try {
				Static121.aClass14_3.method189();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method226();
	}

	@OriginalMember(owner = "client!hc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static17.aFrame1 == null) {
			return Static121.aClass14_3 == null || Static121.aClass14_3.anApplet1 == this ? super.getCodeBase() : Static121.aClass14_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static16.aString2 != null) {
				@Pc(10) String local10 = Static16.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static16.aString3;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method223("wrongjava");
						return;
					}
					Static78.anInt1986 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static16.aString3 == null || Static16.aString3.equals("1.4.2"))) {
					this.method223("wrongjava");
					return;
				}
			}
			if (Static121.aClass14_3.anApplet1 != null) {
				@Pc(67) Method local67 = Static16.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static121.aClass14_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method211();
			Static118.aClass43_1 = Static76.method1378(Static30.anInt1429, Static1.aCanvas1, Static79.anInt946);
			this.method213();
			Static9.aClass2_1 = Static102.method1595();
			while (Static121.aLong95 == 0L || Static42.method793() < Static121.aLong95) {
				Static123.anInt2705 = Static9.aClass2_1.method1398(Static19.anInt1159, Static78.anInt1986);
				for (@Pc(108) int local108 = 0; local108 < Static123.anInt2705; local108++) {
					this.method221();
				}
				this.method215();
				Static50.method873(Static121.aClass14_3, Static1.aCanvas1);
			}
		} catch (@Pc(139) Exception local139) {
			Static102.method1593(null, local139);
			this.method223("crash");
		}
		this.method216();
	}

	@OriginalMember(owner = "client!hc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static72.anApplet_Sub1_1 == this && !Static43.aBoolean16) {
			Static121.aLong95 = Static42.method793();
			Static6.method84(5000L);
			Static38.aClass14_1 = null;
			this.method216();
		}
	}

	@OriginalMember(owner = "client!hc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static72.anApplet_Sub1_1 == this && !Static43.aBoolean16) {
			Static121.aLong95 = Static42.method793() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	protected abstract void method218();

	@OriginalMember(owner = "client!hc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static17.aFrame1 == null) {
			return Static121.aClass14_3 == null || Static121.aClass14_3.anApplet1 == this ? super.getAppletContext() : Static121.aClass14_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
	protected final boolean method219() {
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
				this.method223("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static111.aBoolean143 = true;
		Static104.aBoolean138 = true;
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
	protected abstract void method220();

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
	private void method221() {
		@Pc(7) long local7 = Static49.aLongArray30[Static42.anInt1166];
		@Pc(10) long local10 = Static42.method793();
		Static49.aLongArray30[Static42.anInt1166] = local10;
		Static42.anInt1166 = Static42.anInt1166 + 1 & 0x1F;
		@Pc(36) boolean local36;
		if (local7 == 0L || local7 >= local10) {
			local36 = false;
		} else {
			local36 = true;
		}
		synchronized (this) {
			Static59.aBoolean96 = Static111.aBoolean143;
		}
		this.method218();
	}

	@OriginalMember(owner = "client!hc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method223(@OriginalArg(0) String arg0) {
		if (this.aBoolean15) {
			return;
		}
		this.aBoolean15 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBIIIILjava/lang/String;)V")
	protected final void method224(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static120.anInt2590 = 469;
			Static72.anApplet_Sub1_1 = this;
			Static79.anInt946 = 765;
			Static30.anInt1429 = 503;
			Static17.aFrame1 = new Frame();
			Static17.aFrame1.setTitle("Jagex");
			Static17.aFrame1.setResizable(false);
			Static17.aFrame1.addWindowListener(this);
			Static17.aFrame1.setVisible(true);
			Static17.aFrame1.toFront();
			@Pc(28) Insets local28 = Static17.aFrame1.getInsets();
			Static17.aFrame1.setSize(local28.right + local28.left + 765, local28.top + (503 - -local28.bottom));
			Static38.aClass14_1 = Static121.aClass14_3 = new Class14(true, null, arg0, arg1, 16);
			Static121.aClass14_3.method192(this, 1);
		} catch (@Pc(69) Exception local69) {
			Static102.method1593(null, local69);
		}
	}

	@OriginalMember(owner = "client!hc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
	protected abstract void method225();

	@OriginalMember(owner = "client!hc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static17.aFrame1 == null) {
			return Static121.aClass14_3 == null || Static121.aClass14_3.anApplet1 == this ? super.getDocumentBase() : Static121.aClass14_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static17.aFrame1 == null) {
			return Static121.aClass14_3 == null || Static121.aClass14_3.anApplet1 == this ? super.getParameter(arg0) : Static121.aClass14_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
	protected abstract void method226();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIZ)V")
	protected final void method227(@OriginalArg(0) int arg0) {
		try {
			if (Static72.anApplet_Sub1_1 == null) {
				Static79.anInt946 = 765;
				Static30.anInt1429 = 503;
				Static120.anInt2590 = 469;
				Static72.anApplet_Sub1_1 = this;
				if (Static121.aClass14_3 == null) {
					Static38.aClass14_1 = Static121.aClass14_3 = new Class14(false, this, arg0, null, 0);
				}
				Static121.aClass14_3.method192(this, 1);
			} else {
				Static6.anInt131++;
				if (Static6.anInt131 >= 3) {
					this.method223("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static102.method1593(null, local59);
			this.method223("crash");
		}
	}
}
