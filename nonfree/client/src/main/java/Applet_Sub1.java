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

@OriginalClass("client!d")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!d", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static51.aFrame1 == null) {
			return Static65.aClass55_2 == null || Static65.aClass55_2.anApplet1 == this ? super.getDocumentBase() : Static65.aClass55_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(B)Z")
	protected final boolean method508() {
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
				this.method515("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V")
	protected abstract void method509();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method510(@OriginalArg(5) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static127.anApplet_Sub1_1 = this;
			Static70.anInt1626 = 765;
			Static91.anInt2289 = 461;
			Static72.anInt1641 = 503;
			Static51.aFrame1 = new Frame();
			Static51.aFrame1.setTitle("Jagex");
			Static51.aFrame1.setResizable(false);
			Static51.aFrame1.addWindowListener(this);
			Static51.aFrame1.setVisible(true);
			Static51.aFrame1.toFront();
			@Pc(28) Insets local28 = Static51.aFrame1.getInsets();
			Static51.aFrame1.setSize(local28.left + local28.right + 765, local28.top + (503 - -local28.bottom));
			Static43.aClass55_1 = Static65.aClass55_2 = new Class55(true, null, arg1, arg0, 16);
			Static65.aClass55_2.method1537(1, this);
		} catch (@Pc(70) Exception local70) {
			Static122.method2173(local70, null);
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	protected abstract void method511();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	protected final void method512(@OriginalArg(1) int arg0) {
		try {
			if (Static127.anApplet_Sub1_1 == null) {
				Static72.anInt1641 = 503;
				Static70.anInt1626 = 765;
				Static91.anInt2289 = 461;
				Static127.anApplet_Sub1_1 = this;
				if (Static65.aClass55_2 == null) {
					Static43.aClass55_1 = Static65.aClass55_2 = new Class55(false, this, arg0, null, 0);
				}
				Static65.aClass55_2.method1537(1, this);
			} else {
				Static84.anInt2148++;
				if (Static84.anInt2148 >= 3) {
					this.method515("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(58) Exception local58) {
			Static122.method2173(local58, null);
			this.method515("crash");
		}
	}

	@OriginalMember(owner = "client!d", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!d", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static51.aFrame1 == null) {
			return Static65.aClass55_2 == null || Static65.aClass55_2.anApplet1 == this ? super.getCodeBase() : Static65.aClass55_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method515(@OriginalArg(0) String arg0) {
		if (this.aBoolean19) {
			return;
		}
		this.aBoolean19 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	protected abstract void method516();

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
	private void method517() {
		@Pc(7) long local7 = Static129.aLongArray6[Static95.anInt2358];
		@Pc(10) long local10 = Static52.method906();
		Static129.aLongArray6[Static95.anInt2358] = local10;
		Static95.anInt2358 = Static95.anInt2358 + 1 & 0x1F;
		synchronized (this) {
			Static104.aBoolean101 = Static121.aBoolean118;
		}
		@Pc(41) boolean local41;
		if (local7 == 0L || local7 >= local10) {
			local41 = false;
		} else {
			local41 = true;
		}
		this.method520();
	}

	@OriginalMember(owner = "client!d", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static121.aBoolean118 = false;
	}

	@OriginalMember(owner = "client!d", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	private void method518() {
		@Pc(7) long local7 = Static84.aLongArray2[Static68.anInt1585];
		@Pc(10) long local10 = Static52.method906();
		Static84.aLongArray2[Static68.anInt1585] = local10;
		Static68.anInt1585 = Static68.anInt1585 + 1 & 0x1F;
		if (local7 != 0L && local10 > local7) {
			@Pc(43) int local43 = (int) (local10 - local7);
			Static123.anInt3139 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static5.anInt153++ > 50) {
			Static7.aBoolean5 = true;
			Static5.anInt153 -= 50;
			Static12.aCanvas3.setSize(Static70.anInt1626, Static72.anInt1641);
			Static12.aCanvas3.setVisible(true);
			if (Static51.aFrame1 == null) {
				Static12.aCanvas3.setLocation(0, 0);
			} else {
				@Pc(84) Insets local84 = Static51.aFrame1.getInsets();
				Static12.aCanvas3.setLocation(local84.left, local84.top);
			}
		}
		this.method509();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	protected final synchronized void method519() {
		@Pc(9) Container local9;
		if (Static51.aFrame1 == null) {
			local9 = Static65.aClass55_2.anApplet1;
		} else {
			local9 = Static51.aFrame1;
		}
		if (Static12.aCanvas3 != null) {
			Static12.aCanvas3.removeFocusListener(this);
			local9.remove(Static12.aCanvas3);
		}
		Static12.aCanvas3 = new Canvas_Sub1(this);
		local9.add(Static12.aCanvas3);
		Static12.aCanvas3.setSize(Static70.anInt1626, Static72.anInt1641);
		Static12.aCanvas3.setVisible(true);
		if (Static51.aFrame1 == null) {
			Static12.aCanvas3.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static51.aFrame1.getInsets();
			Static12.aCanvas3.setLocation(local49.left, local49.top);
		}
		Static12.aCanvas3.addFocusListener(this);
		Static12.aCanvas3.requestFocus();
		Static7.aBoolean5 = true;
		Static113.aBoolean106 = false;
		Static55.aLong40 = Static52.method906();
	}

	@OriginalMember(owner = "client!d", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static127.anApplet_Sub1_1 != this || Static97.aBoolean94) {
			return;
		}
		Static7.aBoolean5 = true;
		if (Static88.aString3 != null && Static88.aString3.startsWith("1.5") && Static52.method906() - Static55.aLong40 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static70.anInt1626 && Static72.anInt1641 <= local27.height) {
				Static113.aBoolean106 = true;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!d", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!d", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static127.anApplet_Sub1_1 == this && !Static97.aBoolean94) {
			Static48.aLong35 = Static52.method906();
			Static70.method1226(5000L);
			Static43.aClass55_1 = null;
			this.method523();
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
	protected abstract void method520();

	@OriginalMember(owner = "client!d", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static127.anApplet_Sub1_1 == this && !Static97.aBoolean94) {
			Static48.aLong35 = 0L;
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
	protected abstract void method521();

	@OriginalMember(owner = "client!d", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static51.aFrame1 == null) {
			return Static65.aClass55_2 == null || Static65.aClass55_2.anApplet1 == this ? super.getAppletContext() : Static65.aClass55_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!d", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!d", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static127.anApplet_Sub1_1 == this && !Static97.aBoolean94) {
			Static48.aLong35 = Static52.method906() + 4000L;
		}
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static88.aString2 != null) {
				@Pc(10) String local10 = Static88.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static88.aString3;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method515("wrongjava");
						return;
					}
					Static119.anInt3103 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static88.aString3 == null || Static88.aString3.equals("1.4.2"))) {
					this.method515("wrongjava");
					return;
				}
			}
			if (Static65.aClass55_2.anApplet1 != null) {
				@Pc(69) Method local69 = Static88.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static65.aClass55_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method519();
			Static90.aClass43_1 = Static55.method949(Static12.aCanvas3, Static70.anInt1626, Static72.anInt1641);
			this.method521();
			Static119.aClass8_1 = Static40.method782();
			Static119.aClass8_1.method2240();
			while (Static48.aLong35 == 0L || Static52.method906() < Static48.aLong35) {
				Static46.anInt1120 = Static119.aClass8_1.method2242(Static80.anInt1999, Static119.anInt3103);
				for (@Pc(113) int local113 = 0; local113 < Static46.anInt1120; local113++) {
					this.method517();
				}
				this.method518();
				Static68.method1209(Static65.aClass55_2, Static12.aCanvas3);
			}
		} catch (@Pc(142) Exception local142) {
			Static122.method2173(local142, null);
			this.method515("crash");
		}
		this.method523();
	}

	@OriginalMember(owner = "client!d", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!d", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static51.aFrame1 == null) {
			return Static65.aClass55_2 == null || Static65.aClass55_2.anApplet1 == this ? super.getParameter(arg0) : Static65.aClass55_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	private synchronized void method523() {
		if (Static97.aBoolean94) {
			return;
		}
		Static97.aBoolean94 = true;
		try {
			Static12.aCanvas3.removeFocusListener(this);
		} catch (@Pc(19) Exception local19) {
		}
		try {
			this.method511();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static51.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static65.aClass55_2 != null) {
			try {
				Static65.aClass55_2.method1533();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method516();
	}

	@OriginalMember(owner = "client!d", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static121.aBoolean118 = true;
		Static7.aBoolean5 = true;
	}

	@OriginalMember(owner = "client!d", name = "init", descriptor = "()V")
	public abstract void init();
}
