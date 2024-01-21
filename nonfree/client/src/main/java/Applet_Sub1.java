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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	protected abstract void method343();

	@OriginalMember(owner = "client!pc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static54.aFrame1 == null) {
			return Static97.aClass53_3 == null || Static97.aClass53_3.anApplet1 == this ? super.getAppletContext() : Static97.aClass53_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static97.anApplet_Sub1_1 == this && !Static106.aBoolean154) {
			Static50.aLong42 = Static76.method1306() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	protected final void method345(@OriginalArg(3) int arg0) {
		try {
			if (Static97.anApplet_Sub1_1 == null) {
				Static97.anApplet_Sub1_1 = this;
				Static3.anInt183 = 503;
				Static69.anInt2065 = 427;
				Static39.anInt1242 = 765;
				if (Static97.aClass53_3 == null) {
					Static97.aClass53_4 = Static97.aClass53_3 = new Class53(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static97.aClass53_3.method1628(this, 1);
			} else {
				this.method352("alreadyloaded");
			}
		} catch (@Pc(47) Exception local47) {
			Static30.method573(null, local47);
			this.method352("crash");
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static97.anApplet_Sub1_1 != this || Static106.aBoolean154) {
			return;
		}
		Static38.aBoolean74 = true;
		if (Static94.aString5 != null && Static94.aString5.startsWith("1.5") && Static76.method1306() - Static83.aLong69 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static39.anInt1242 && local30.height >= Static3.anInt183) {
				Static74.aBoolean85 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	protected final synchronized void method347() {
		@Pc(10) Container local10;
		if (Static54.aFrame1 == null) {
			local10 = Static97.aClass53_3.anApplet1;
		} else {
			local10 = Static54.aFrame1;
		}
		if (Static70.aCanvas1 != null) {
			Static70.aCanvas1.removeFocusListener(this);
			local10.remove(Static70.aCanvas1);
		}
		Static70.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static70.aCanvas1);
		Static70.aCanvas1.setSize(Static39.anInt1242, Static3.anInt183);
		Static70.aCanvas1.setVisible(true);
		if (Static54.aFrame1 == null) {
			Static70.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static54.aFrame1.getInsets();
			Static70.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static70.aCanvas1.addFocusListener(this);
		Static70.aCanvas1.requestFocus();
		Static38.aBoolean74 = true;
		Static74.aBoolean85 = false;
		Static83.aLong69 = Static76.method1306();
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	private void method348() {
		@Pc(6) long local6 = Static76.method1306();
		@Pc(10) long local10 = Static4.aLongArray1[Static104.anInt2827];
		Static4.aLongArray1[Static104.anInt2827] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static76.anInt2213 = ((local28 >> 1) + 32000) / local28;
		}
		Static104.anInt2827 = Static104.anInt2827 + 1 & 0x1F;
		if (Static78.anInt551++ > 50) {
			Static38.aBoolean74 = true;
			Static78.anInt551 -= 50;
			Static70.aCanvas1.setSize(Static39.anInt1242, Static3.anInt183);
			Static70.aCanvas1.setVisible(true);
			if (Static54.aFrame1 == null) {
				Static70.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(71) Insets local71 = Static54.aFrame1.getInsets();
				Static70.aCanvas1.setLocation(local71.left, local71.top);
			}
		}
		this.method343();
	}

	@OriginalMember(owner = "client!pc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static97.anApplet_Sub1_1 == this && !Static106.aBoolean154) {
			Static50.aLong42 = Static76.method1306();
			Static34.method698(5000L);
			Static97.aClass53_4 = null;
			this.method349();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	private synchronized void method349() {
		if (Static106.aBoolean154) {
			return;
		}
		Static106.aBoolean154 = true;
		try {
			Static70.aCanvas1.removeFocusListener(this);
		} catch (@Pc(17) Exception local17) {
		}
		try {
			this.method354();
		} catch (@Pc(22) Exception local22) {
		}
		if (Static54.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		if (Static97.aClass53_3 != null) {
			try {
				Static97.aClass53_3.method1630();
			} catch (@Pc(36) Exception local36) {
			}
		}
		this.method350();
	}

	@OriginalMember(owner = "client!pc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	protected abstract void method350();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Z")
	protected final boolean method351() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.endsWith("jagex.com")) {
			return true;
		} else if (local14.endsWith("runescape.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method352("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static94.aString4 != null) {
				@Pc(10) String local10 = Static94.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static94.aString5;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method352("wrongjava");
						return;
					}
					Static71.anInt2162 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static94.aString5 == null || Static94.aString5.equals("1.4.2"))) {
					this.method352("wrongjava");
					return;
				}
			}
			if (Static97.aClass53_3.anApplet1 != null) {
				@Pc(70) Method local70 = Static94.aMethod1;
				if (local70 != null) {
					try {
						local70.invoke(Static97.aClass53_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method347();
			Static46.aClass15_34 = Static18.method1551(Static3.anInt183, Static70.aCanvas1, Static39.anInt1242);
			this.method357();
			Static19.aClass8_3 = Static17.method364();
			Static19.aClass8_3.method834();
			while (Static50.aLong42 == 0L || Static76.method1306() < Static50.aLong42) {
				Static32.anInt1057 = Static19.aClass8_3.method831(Static79.anInt2280, Static71.anInt2162);
				for (@Pc(114) int local114 = 0; local114 < Static32.anInt1057; local114++) {
					this.method353();
				}
				this.method348();
			}
		} catch (@Pc(143) Exception local143) {
			Static30.method573(null, local143);
			this.method352("crash");
		}
		this.method349();
	}

	@OriginalMember(owner = "client!pc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method352(@OriginalArg(1) String arg0) {
		if (this.aBoolean38) {
			return;
		}
		this.aBoolean38 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!pc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static92.aBoolean134 = true;
		Static38.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	private void method353() {
		@Pc(3) long local3 = Static63.aLongArray9[Static15.anInt465];
		@Pc(14) long local14 = Static76.method1306();
		@Pc(29) boolean local29;
		if (local3 == 0L || local3 >= local14) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static63.aLongArray9[Static15.anInt465] = local14;
		Static15.anInt465 = Static15.anInt465 + 1 & 0x1F;
		synchronized (this) {
			Static102.aBoolean151 = Static92.aBoolean134;
		}
		this.method355();
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	protected abstract void method354();

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	protected abstract void method355();

	@OriginalMember(owner = "client!pc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static54.aFrame1 == null) {
			return Static97.aClass53_3 == null || Static97.aClass53_3.anApplet1 == this ? super.getParameter(arg0) : Static97.aClass53_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static54.aFrame1 == null) {
			return Static97.aClass53_3 == null || Static97.aClass53_3.anApplet1 == this ? super.getCodeBase() : Static97.aClass53_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
	protected abstract void method357();

	@OriginalMember(owner = "client!pc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static92.aBoolean134 = false;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;ILjava/net/InetAddress;IIIII)V")
	protected final void method358(@OriginalArg(0) String arg0, @OriginalArg(2) InetAddress arg1, @OriginalArg(6) int arg2) {
		try {
			Static69.anInt2065 = 427;
			Static3.anInt183 = 503;
			Static97.anApplet_Sub1_1 = this;
			Static39.anInt1242 = 765;
			Static54.aFrame1 = new Frame();
			Static54.aFrame1.setTitle("Jagex");
			Static54.aFrame1.setResizable(false);
			Static54.aFrame1.addWindowListener(this);
			Static54.aFrame1.setVisible(true);
			Static54.aFrame1.toFront();
			@Pc(36) Insets local36 = Static54.aFrame1.getInsets();
			Static54.aFrame1.setSize(local36.right + local36.left + 765, local36.bottom + local36.top + 503);
			Static97.aClass53_4 = Static97.aClass53_3 = new Class53(true, null, arg1, arg2, arg0, 12);
			Static97.aClass53_3.method1628(this, 1);
		} catch (@Pc(72) Exception local72) {
			Static30.method573(null, local72);
		}
	}

	@OriginalMember(owner = "client!pc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static97.anApplet_Sub1_1 == this && !Static106.aBoolean154) {
			Static50.aLong42 = 0L;
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static54.aFrame1 == null) {
			return Static97.aClass53_3 == null || Static97.aClass53_3.anApplet1 == this ? super.getDocumentBase() : Static97.aClass53_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
