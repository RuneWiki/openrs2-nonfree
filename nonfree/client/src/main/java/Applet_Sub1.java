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

@OriginalClass("client!r")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	protected abstract void method589();

	@OriginalMember(owner = "client!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static40.aFrame1 == null) {
			return Static86.aClass68_2 == null || Static86.aClass68_2.anApplet1 == this ? super.getParameter(arg0) : Static86.aClass68_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static130.aString4 != null) {
				@Pc(10) String local10 = Static130.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static130.aString5;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method599("wrongjava");
						return;
					}
					Static164.anInt3772 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static130.aString5 == null || Static130.aString5.equals("1.4.2"))) {
					this.method599("wrongjava");
					return;
				}
			}
			if (Static86.aClass68_2.anApplet1 != null) {
				@Pc(68) Method local68 = Static130.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static86.aClass68_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method593();
			Static147.aClass34_1 = Static142.method2393(Static162.anInt3715, Static114.aCanvas3, Static3.anInt112);
			this.method591();
			Static94.aClass36_1 = Static109.method1825();
			while (Static30.aLong26 == 0L || Static30.aLong26 > Static23.method507()) {
				Static2.anInt47 = Static94.aClass36_1.method2684(Static132.anInt2865, Static164.anInt3772);
				for (@Pc(109) int local109 = 0; local109 < Static2.anInt47; local109++) {
					this.method606();
				}
				this.method600();
				Static109.method1826(Static114.aCanvas3, Static86.aClass68_2);
			}
		} catch (@Pc(136) Exception local136) {
			Static5.method115(null, local136);
			this.method599("crash");
		}
		this.method590();
	}

	@OriginalMember(owner = "client!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	private synchronized void method590() {
		if (Static144.aBoolean125) {
			return;
		}
		Static144.aBoolean125 = true;
		try {
			Static114.aCanvas3.removeFocusListener(this);
		} catch (@Pc(20) Exception local20) {
		}
		try {
			this.method604();
		} catch (@Pc(25) Exception local25) {
		}
		if (Static40.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		if (Static86.aClass68_2 != null) {
			try {
				Static86.aClass68_2.method2223();
			} catch (@Pc(39) Exception local39) {
			}
		}
		this.method601();
	}

	@OriginalMember(owner = "client!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static40.aFrame1 == null) {
			return Static86.aClass68_2 == null || Static86.aClass68_2.anApplet1 == this ? super.getCodeBase() : Static86.aClass68_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	protected abstract void method591();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Z")
	protected final boolean method592() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method599("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static143.aBoolean124 = false;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	protected final synchronized void method593() {
		@Pc(17) Container local17;
		if (Static40.aFrame1 == null) {
			local17 = Static86.aClass68_2.anApplet1;
		} else {
			local17 = Static40.aFrame1;
		}
		if (Static114.aCanvas3 != null) {
			Static114.aCanvas3.removeFocusListener(this);
			local17.remove(Static114.aCanvas3);
		}
		Static114.aCanvas3 = new Canvas_Sub1(this);
		local17.add(Static114.aCanvas3);
		Static114.aCanvas3.setSize(Static162.anInt3715, Static3.anInt112);
		Static114.aCanvas3.setVisible(true);
		if (Static40.aFrame1 == null) {
			Static114.aCanvas3.setLocation(0, 0);
		} else {
			@Pc(57) Insets local57 = Static40.aFrame1.getInsets();
			Static114.aCanvas3.setLocation(local57.left, local57.top);
		}
		Static114.aCanvas3.addFocusListener(this);
		Static114.aCanvas3.requestFocus();
		Static139.aBoolean119 = true;
		Static157.aBoolean151 = false;
		Static53.aLong44 = Static23.method507();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	protected abstract void method595();

	@OriginalMember(owner = "client!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method596(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			Static185.anApplet_Sub1_3 = this;
			Static162.anInt3715 = 765;
			Static3.anInt112 = 503;
			Static3.anInt110 = 485;
			Static40.aFrame1 = new Frame();
			Static40.aFrame1.setTitle("Jagex");
			Static40.aFrame1.setResizable(false);
			Static40.aFrame1.addWindowListener(this);
			Static40.aFrame1.setVisible(true);
			Static40.aFrame1.toFront();
			@Pc(28) Insets local28 = Static40.aFrame1.getInsets();
			Static40.aFrame1.setSize(local28.right + local28.left + 765, local28.bottom + 503 - -local28.top);
			Static125.aClass68_3 = Static86.aClass68_2 = new Class68(true, null, arg0, arg1, 16);
			Static86.aClass68_2.method2226(1, this);
		} catch (@Pc(64) Exception local64) {
			Static5.method115(null, local64);
		}
	}

	@OriginalMember(owner = "client!r", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!r", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static185.anApplet_Sub1_3 == this && !Static144.aBoolean125) {
			Static30.aLong26 = Static23.method507();
			Static133.method2259(5000L);
			Static125.aClass68_3 = null;
			this.method590();
		}
	}

	@OriginalMember(owner = "client!r", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static185.anApplet_Sub1_3 == this && !Static144.aBoolean125) {
			Static30.aLong26 = 0L;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method599(@OriginalArg(1) String arg0) {
		if (this.aBoolean22) {
			return;
		}
		this.aBoolean22 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
	private void method600() {
		@Pc(2) long local2 = Static23.method507();
		@Pc(6) long local6 = Static179.aLongArray10[Static57.anInt1361];
		Static179.aLongArray10[Static57.anInt1361] = local2;
		if (local6 != 0L && local6 < local2) {
			@Pc(30) int local30 = (int) (local2 - local6);
			Static141.anInt700 = ((local30 >> 1) + 32000) / local30;
		}
		Static57.anInt1361 = Static57.anInt1361 + 1 & 0x1F;
		if (Static94.anInt2073++ > 50) {
			Static139.aBoolean119 = true;
			Static94.anInt2073 -= 50;
			Static114.aCanvas3.setSize(Static162.anInt3715, Static3.anInt112);
			Static114.aCanvas3.setVisible(true);
			if (Static40.aFrame1 == null) {
				Static114.aCanvas3.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static40.aFrame1.getInsets();
				Static114.aCanvas3.setLocation(local81.left, local81.top);
			}
		}
		this.method589();
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	protected abstract void method601();

	@OriginalMember(owner = "client!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static40.aFrame1 == null) {
			return Static86.aClass68_2 == null || Static86.aClass68_2.anApplet1 == this ? super.getDocumentBase() : Static86.aClass68_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static185.anApplet_Sub1_3 == this && !Static144.aBoolean125) {
			Static30.aLong26 = Static23.method507() + 4000L;
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	protected abstract void method604();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIII)V")
	protected final void method605(@OriginalArg(1) int arg0) {
		try {
			if (Static185.anApplet_Sub1_3 != null) {
				Static160.anInt3657++;
				if (Static160.anInt3657 >= 3) {
					this.method599("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static162.anInt3715 = 765;
			Static185.anApplet_Sub1_3 = this;
			Static3.anInt110 = 485;
			Static3.anInt112 = 503;
			if (Static86.aClass68_2 == null) {
				Static125.aClass68_3 = Static86.aClass68_2 = new Class68(false, this, arg0, null, 0);
			}
			Static86.aClass68_2.method2226(1, this);
		} catch (@Pc(55) Exception local55) {
			Static5.method115(null, local55);
			this.method599("crash");
		}
	}

	@OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static143.aBoolean124 = true;
		Static139.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static185.anApplet_Sub1_3 != this || Static144.aBoolean125) {
			return;
		}
		Static139.aBoolean119 = true;
		if (Static130.aString5 != null && Static130.aString5.startsWith("1.5") && Static23.method507() - Static53.aLong44 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || Static162.anInt3715 <= local29.width && Static3.anInt112 <= local29.height) {
				Static157.aBoolean151 = true;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	private void method606() {
		@Pc(7) long local7 = Static104.aLongArray5[Static175.anInt2851];
		@Pc(12) long local12 = Static23.method507();
		Static104.aLongArray5[Static175.anInt2851] = local12;
		Static175.anInt2851 = Static175.anInt2851 + 1 & 0x1F;
		synchronized (this) {
			Static110.aBoolean104 = Static143.aBoolean124;
		}
		this.method595();
		@Pc(52) boolean local52;
		if (local7 == 0L || local7 >= local12) {
			local52 = false;
		} else {
			local52 = true;
		}
	}

	@OriginalMember(owner = "client!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static40.aFrame1 == null) {
			return Static86.aClass68_2 == null || Static86.aClass68_2.anApplet1 == this ? super.getAppletContext() : Static86.aClass68_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}
}
