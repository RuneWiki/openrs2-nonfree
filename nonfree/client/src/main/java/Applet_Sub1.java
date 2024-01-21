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

@OriginalClass("client!kf")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
	protected final void method465(@OriginalArg(1) int arg0) {
		try {
			if (Static102.anApplet_Sub1_1 == null) {
				Static136.anInt3193 = 479;
				Static43.anInt1207 = 503;
				Static121.anInt2857 = 765;
				Static102.anApplet_Sub1_1 = this;
				if (Static66.aClass68_4 == null) {
					Static26.aClass68_2 = Static66.aClass68_4 = new Class68(false, this, arg0, null, 0);
				}
				Static66.aClass68_4.method2193(this, 1);
			} else {
				Static60.anInt1634++;
				if (Static60.anInt1634 >= 3) {
					this.method473("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static124.method2117(null, local61);
			this.method473("crash");
		}
	}

	@OriginalMember(owner = "client!kf", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static102.anApplet_Sub1_1 == this && !Static108.aBoolean108) {
			Static102.aLong82 = 0L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static58.aFrame1 == null) {
			return Static66.aClass68_4 == null || Static66.aClass68_4.anApplet1 == this ? super.getDocumentBase() : Static66.aClass68_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!kf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static69.aBoolean67 = true;
		Static159.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!kf", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static102.anApplet_Sub1_1 == this && !Static108.aBoolean108) {
			Static102.aLong82 = Static150.method2481() + 4000L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static58.aFrame1 == null) {
			return Static66.aClass68_4 == null || Static66.aClass68_4.anApplet1 == this ? super.getCodeBase() : Static66.aClass68_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	protected abstract void method466();

	@OriginalMember(owner = "client!kf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	protected final synchronized void method467() {
		@Pc(9) Container local9;
		if (Static58.aFrame1 == null) {
			local9 = Static66.aClass68_4.anApplet1;
		} else {
			local9 = Static58.aFrame1;
		}
		if (Static100.aCanvas1 != null) {
			Static100.aCanvas1.removeFocusListener(this);
			local9.remove(Static100.aCanvas1);
		}
		Static100.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static100.aCanvas1);
		Static100.aCanvas1.setSize(Static121.anInt2857, Static43.anInt1207);
		Static100.aCanvas1.setVisible(true);
		if (Static58.aFrame1 == null) {
			Static100.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static58.aFrame1.getInsets();
			Static100.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static100.aCanvas1.addFocusListener(this);
		Static100.aCanvas1.requestFocus();
		Static159.aBoolean149 = true;
		Static26.aBoolean20 = false;
		Static65.aLong63 = Static150.method2481();
	}

	@OriginalMember(owner = "client!kf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static131.aString3 != null) {
				@Pc(10) String local10 = Static131.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static131.aString5;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method473("wrongjava");
						return;
					}
					Static89.anInt2176 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static131.aString5 == null || Static131.aString5.equals("1.4.2"))) {
					this.method473("wrongjava");
					return;
				}
			}
			if (Static66.aClass68_4.anApplet1 != null) {
				@Pc(70) Method local70 = Static131.aMethod1;
				if (local70 != null) {
					try {
						local70.invoke(Static66.aClass68_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method467();
			Static139.aClass8_1 = Static179.method2871(Static100.aCanvas1, Static121.anInt2857, Static43.anInt1207);
			this.method480();
			Static147.aClass28_1 = Static104.method1716();
			while (Static102.aLong82 == 0L || Static150.method2481() < Static102.aLong82) {
				Static64.anInt1665 = Static147.aClass28_1.method2587(Static89.anInt2176, Static79.anInt1981);
				for (@Pc(111) int local111 = 0; local111 < Static64.anInt1665; local111++) {
					this.method469();
				}
				this.method470();
				Static38.method685(Static100.aCanvas1, Static66.aClass68_4);
			}
		} catch (@Pc(146) Exception local146) {
			Static124.method2117(null, local146);
			this.method473("crash");
		}
		this.method476();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	private void method469() {
		@Pc(10) long local10 = Static150.method2481();
		@Pc(14) long local14 = Static162.aLongArray6[Static122.anInt2898];
		Static162.aLongArray6[Static122.anInt2898] = local10;
		Static122.anInt2898 = Static122.anInt2898 + 1 & 0x1F;
		synchronized (this) {
			Static89.aBoolean92 = Static69.aBoolean67;
		}
		this.method472();
		@Pc(54) boolean local54;
		if (local14 == 0L || local14 >= local10) {
			local54 = false;
		} else {
			local54 = true;
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	private void method470() {
		@Pc(6) long local6 = Static150.method2481();
		@Pc(10) long local10 = Static155.aLongArray4[Static16.anInt416];
		Static155.aLongArray4[Static16.anInt416] = local6;
		Static16.anInt416 = Static16.anInt416 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(42) int local42 = (int) (local6 - local10);
			Static161.anInt3580 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static86.anInt2114++ > 50) {
			Static86.anInt2114 -= 50;
			Static159.aBoolean149 = true;
			Static100.aCanvas1.setSize(Static121.anInt2857, Static43.anInt1207);
			Static100.aCanvas1.setVisible(true);
			if (Static58.aFrame1 == null) {
				Static100.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static58.aFrame1.getInsets();
				Static100.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method466();
	}

	@OriginalMember(owner = "client!kf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	protected abstract void method471();

	@OriginalMember(owner = "client!kf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	protected abstract void method472();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method473(@OriginalArg(0) String arg0) {
		if (this.aBoolean23) {
			return;
		}
		this.aBoolean23 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	protected abstract void method474();

	@OriginalMember(owner = "client!kf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!kf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static102.anApplet_Sub1_1 != this || Static108.aBoolean108) {
			return;
		}
		Static159.aBoolean149 = true;
		if (Static131.aString5 != null && Static131.aString5.startsWith("1.5") && Static150.method2481() - Static65.aLong63 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static121.anInt2857 && Static43.anInt1207 <= local28.height) {
				Static26.aBoolean20 = true;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static102.anApplet_Sub1_1 == this && !Static108.aBoolean108) {
			Static102.aLong82 = Static150.method2481();
			Static35.method627(5000L);
			Static26.aClass68_2 = null;
			this.method476();
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
	private synchronized void method476() {
		if (Static108.aBoolean108) {
			return;
		}
		Static108.aBoolean108 = true;
		try {
			Static100.aCanvas1.removeFocusListener(this);
		} catch (@Pc(16) Exception local16) {
		}
		try {
			this.method474();
		} catch (@Pc(21) Exception local21) {
		}
		if (Static58.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		if (Static66.aClass68_4 != null) {
			try {
				Static66.aClass68_4.method2191();
			} catch (@Pc(35) Exception local35) {
			}
		}
		this.method471();
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(Z)Z")
	protected final boolean method477() {
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
				this.method473("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static69.aBoolean67 = false;
	}

	@OriginalMember(owner = "client!kf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static58.aFrame1 == null) {
			return Static66.aClass68_4 == null || Static66.aClass68_4.anApplet1 == this ? super.getParameter(arg0) : Static66.aClass68_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method479(@OriginalArg(3) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static43.anInt1207 = 503;
			Static121.anInt2857 = 765;
			Static136.anInt3193 = 479;
			Static102.anApplet_Sub1_1 = this;
			Static58.aFrame1 = new Frame();
			Static58.aFrame1.setTitle("Jagex");
			Static58.aFrame1.setResizable(false);
			Static58.aFrame1.addWindowListener(this);
			Static58.aFrame1.setVisible(true);
			Static58.aFrame1.toFront();
			@Pc(28) Insets local28 = Static58.aFrame1.getInsets();
			Static58.aFrame1.setSize(local28.left + local28.right + 765, local28.bottom + 503 + local28.top);
			Static26.aClass68_2 = Static66.aClass68_4 = new Class68(true, null, arg1, arg0, 16);
			Static66.aClass68_4.method2193(this, 1);
		} catch (@Pc(64) Exception local64) {
			Static124.method2117(null, local64);
		}
	}

	@OriginalMember(owner = "client!kf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static58.aFrame1 == null) {
			return Static66.aClass68_4 == null || Static66.aClass68_4.anApplet1 == this ? super.getAppletContext() : Static66.aClass68_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
	protected abstract void method480();
}
