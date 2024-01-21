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

@OriginalClass("client!ee")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!ee", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static125.aString3 != null) {
				@Pc(10) String local10 = Static125.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static125.aString5;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method392("wrongjava");
						return;
					}
					Static31.anInt1008 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static125.aString5 == null || Static125.aString5.equals("1.4.2"))) {
					this.method392("wrongjava");
					return;
				}
			}
			if (Static92.aClass79_2.anApplet1 != null) {
				@Pc(69) Method local69 = Static125.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static92.aClass79_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method394();
			Static52.aClass6_13 = Static64.method1143(Static16.aCanvas10, Static31.anInt1010, Static64.anInt1666);
			this.method391();
			Static29.aClass14_1 = Static118.method2046();
			Static29.aClass14_1.method1810();
			while (Static56.aLong41 == 0L || Static124.method2079() < Static56.aLong41) {
				Static29.anInt973 = Static29.aClass14_1.method1811(Static31.anInt1008, Static51.anInt1395);
				for (@Pc(113) int local113 = 0; local113 < Static29.anInt973; local113++) {
					this.method385();
				}
				this.method398();
				Static14.method293(true);
			}
		} catch (@Pc(143) Exception local143) {
			Static95.method2004(null, local143);
			this.method392("crash");
		}
		this.method397();
	}

	@OriginalMember(owner = "client!ee", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static1.aFrame1 == null) {
			return Static92.aClass79_2 == null || Static92.aClass79_2.anApplet1 == this ? super.getDocumentBase() : Static92.aClass79_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	private void method385() {
		@Pc(6) long local6 = Static124.method2079();
		@Pc(10) long local10 = Static121.aLongArray6[Static32.anInt698];
		Static121.aLongArray6[Static32.anInt698] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local6 <= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static32.anInt698 = Static32.anInt698 + 1 & 0x1F;
		synchronized (this) {
			Static41.aBoolean241 = Static124.aBoolean237;
		}
		this.method388();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	protected abstract void method387();

	@OriginalMember(owner = "client!ee", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	protected abstract void method388();

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z")
	protected final boolean method389() {
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
				this.method392("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static124.aBoolean237 = true;
		Static119.aBoolean234 = true;
	}

	@OriginalMember(owner = "client!ee", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static32.anApplet_Sub1_2 == this && !Static81.aBoolean164) {
			Static56.aLong41 = Static124.method2079();
			Static96.method1616(5000L);
			Static13.aClass79_1 = null;
			this.method397();
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	protected abstract void method391();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method392(@OriginalArg(1) String arg0) {
		if (this.aBoolean61) {
			return;
		}
		this.aBoolean61 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!ee", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static32.anApplet_Sub1_2 == this && !Static81.aBoolean164) {
			Static56.aLong41 = 0L;
		}
	}

	@OriginalMember(owner = "client!ee", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static32.anApplet_Sub1_2 != this || Static81.aBoolean164) {
			return;
		}
		Static119.aBoolean234 = true;
		if (Static125.aString5 != null && Static125.aString5.startsWith("1.5") && Static124.method2079() - Static81.aLong57 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static31.anInt1010 && local28.height >= Static64.anInt1666) {
				Static38.aBoolean103 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static32.anApplet_Sub1_2 == this && !Static81.aBoolean164) {
			Static56.aLong41 = Static124.method2079() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	protected final synchronized void method394() {
		@Pc(9) Container local9;
		if (Static1.aFrame1 == null) {
			local9 = Static92.aClass79_2.anApplet1;
		} else {
			local9 = Static1.aFrame1;
		}
		if (Static16.aCanvas10 != null) {
			Static16.aCanvas10.removeFocusListener(this);
			local9.remove(Static16.aCanvas10);
		}
		Static16.aCanvas10 = new Canvas_Sub1(this);
		local9.add(Static16.aCanvas10);
		Static16.aCanvas10.setSize(Static31.anInt1010, Static64.anInt1666);
		Static16.aCanvas10.setVisible(true);
		if (Static1.aFrame1 == null) {
			Static16.aCanvas10.setLocation(0, 0);
		} else {
			@Pc(48) Insets local48 = Static1.aFrame1.getInsets();
			Static16.aCanvas10.setLocation(local48.left, local48.top);
		}
		Static16.aCanvas10.addFocusListener(this);
		Static16.aCanvas10.requestFocus();
		Static119.aBoolean234 = true;
		Static38.aBoolean103 = false;
		Static81.aLong57 = Static124.method2079();
	}

	@OriginalMember(owner = "client!ee", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static1.aFrame1 == null) {
			return Static92.aClass79_2 == null || Static92.aClass79_2.anApplet1 == this ? super.getParameter(arg0) : Static92.aClass79_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIII)V")
	protected final void method396(@OriginalArg(1) int arg0) {
		try {
			if (Static32.anApplet_Sub1_2 == null) {
				Static32.anApplet_Sub1_2 = this;
				Static31.anInt1010 = 765;
				Static64.anInt1666 = 503;
				Static34.anInt1062 = 457;
				if (Static92.aClass79_2 == null) {
					Static13.aClass79_1 = Static92.aClass79_2 = new Class79(false, this, arg0, null, 0);
				}
				Static92.aClass79_2.method2087(1, this);
			} else {
				Static35.anInt1067++;
				if (Static35.anInt1067 >= 3) {
					this.method392("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(57) Exception local57) {
			Static95.method2004(null, local57);
			this.method392("crash");
		}
	}

	@OriginalMember(owner = "client!ee", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static1.aFrame1 == null) {
			return Static92.aClass79_2 == null || Static92.aClass79_2.anApplet1 == this ? super.getCodeBase() : Static92.aClass79_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	private synchronized void method397() {
		if (Static81.aBoolean164) {
			return;
		}
		Static81.aBoolean164 = true;
		try {
			Static16.aCanvas10.removeFocusListener(this);
		} catch (@Pc(17) Exception local17) {
		}
		try {
			this.method400();
		} catch (@Pc(22) Exception local22) {
		}
		if (Static1.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		if (Static92.aClass79_2 != null) {
			try {
				Static92.aClass79_2.method2093();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method399();
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	private void method398() {
		@Pc(11) long local11 = Static124.method2079();
		@Pc(15) long local15 = Static43.aLongArray1[Static123.anInt2995];
		Static43.aLongArray1[Static123.anInt2995] = local11;
		Static123.anInt2995 = Static123.anInt2995 + 1 & 0x1F;
		if (local15 != 0L && local11 > local15) {
			@Pc(41) int local41 = (int) (local11 - local15);
			Static67.anInt1736 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static44.anInt1246++ > 50) {
			Static119.aBoolean234 = true;
			Static44.anInt1246 -= 50;
			Static16.aCanvas10.setSize(Static31.anInt1010, Static64.anInt1666);
			Static16.aCanvas10.setVisible(true);
			if (Static1.aFrame1 == null) {
				Static16.aCanvas10.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static1.aFrame1.getInsets();
				Static16.aCanvas10.setLocation(local81.left, local81.top);
			}
		}
		this.method387();
	}

	@OriginalMember(owner = "client!ee", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	protected abstract void method399();

	@OriginalMember(owner = "client!ee", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	protected abstract void method400();

	@OriginalMember(owner = "client!ee", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static124.aBoolean237 = false;
	}

	@OriginalMember(owner = "client!ee", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static1.aFrame1 == null) {
			return Static92.aClass79_2 == null || Static92.aClass79_2.anApplet1 == this ? super.getAppletContext() : Static92.aClass79_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method402(@OriginalArg(0) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static32.anApplet_Sub1_2 = this;
			Static34.anInt1062 = 457;
			Static31.anInt1010 = 765;
			Static64.anInt1666 = 503;
			Static1.aFrame1 = new Frame();
			Static1.aFrame1.setTitle("Jagex");
			Static1.aFrame1.setResizable(false);
			Static1.aFrame1.addWindowListener(this);
			Static1.aFrame1.setVisible(true);
			Static1.aFrame1.toFront();
			@Pc(32) Insets local32 = Static1.aFrame1.getInsets();
			Static1.aFrame1.setSize(local32.right + local32.left + 765, local32.top + 503 + local32.bottom);
			Static13.aClass79_1 = Static92.aClass79_2 = new Class79(true, null, arg1, arg0, 16);
			Static92.aClass79_2.method2087(1, this);
		} catch (@Pc(72) Exception local72) {
			Static95.method2004(null, local72);
		}
	}
}
