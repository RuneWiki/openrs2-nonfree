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

@OriginalClass("client!pa")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pa", name = "I", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!pa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static100.anApplet_Sub1_1 != this || Static56.aBoolean98) {
			return;
		}
		Static103.aBoolean216 = true;
		if (Static2.aString1 != null && Static2.aString1.startsWith("1.5") && Static82.method1291() - Static65.aLong56 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static7.anInt280 && local28.height >= Static42.anInt1136) {
				Static69.aBoolean187 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pa", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static100.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static87.aLong49 = Static82.method1291() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean219 = false;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	protected abstract void method260();

	@OriginalMember(owner = "client!pa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static2.aString5 != null) {
				@Pc(10) String local10 = Static2.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static2.aString1;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method268("wrongjava");
						return;
					}
					Static89.anInt2045 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static2.aString1 == null || Static2.aString1.equals("1.4.2"))) {
					this.method268("wrongjava");
					return;
				}
			}
			if (Static24.aClass2_1.anApplet1 != null) {
				@Pc(71) Method local71 = Static2.aMethod1;
				if (local71 != null) {
					try {
						local71.invoke(Static24.aClass2_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(86) Throwable local86) {
					}
				}
			}
			this.method277();
			Static4.aClass25_18 = Static11.method1928(Static9.aCanvas1, Static7.anInt280, Static42.anInt1136);
			this.method265();
			Static61.aClass7_1 = Static88.method1389();
			Static61.aClass7_1.method1657();
			while (Static87.aLong49 == 0L || Static82.method1291() < Static87.aLong49) {
				Static61.anInt1514 = Static61.aClass7_1.method1652(Static89.anInt2045, Static47.anInt1184);
				for (@Pc(115) int local115 = 0; local115 < Static61.anInt1514; local115++) {
					this.method266();
				}
				this.method262();
			}
		} catch (@Pc(148) Exception local148) {
			Static101.method1675(local148, null);
			this.method268("crash");
		}
		this.method272();
	}

	@OriginalMember(owner = "client!pa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean219 = true;
		Static103.aBoolean216 = true;
	}

	@OriginalMember(owner = "client!pa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	private void method262() {
		@Pc(6) long local6 = Static82.method1291();
		@Pc(14) long local14 = Static38.aLongArray35[Static46.anInt2738];
		Static38.aLongArray35[Static46.anInt2738] = local6;
		if (local14 != 0L && local6 > local14) {
			@Pc(32) int local32 = (int) (local6 - local14);
			Static113.anInt2860 = ((local32 >> 1) + 32000) / local32;
		}
		Static46.anInt2738 = Static46.anInt2738 + 1 & 0x1F;
		if (Static72.anInt1738++ > 50) {
			Static103.aBoolean216 = true;
			Static72.anInt1738 -= 50;
			Static9.aCanvas1.setSize(Static7.anInt280, Static42.anInt1136);
			Static9.aCanvas1.setVisible(true);
			if (Static69.aFrame3 == null) {
				Static9.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static69.aFrame3.getInsets();
				Static9.aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.method271();
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z")
	protected final boolean method263() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.endsWith("jagex.com")) {
			return true;
		} else if (local8.endsWith("runescape.com")) {
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
				this.method268("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	protected abstract void method264();

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	protected abstract void method265();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	private void method266() {
		@Pc(2) long local2 = Static82.method1291();
		@Pc(14) long local14 = Static82.aLongArray22[Static34.anInt1035];
		@Pc(23) boolean local23;
		if (local14 == 0L || local2 <= local14) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static82.aLongArray22[Static34.anInt1035] = local2;
		Static34.anInt1035 = Static34.anInt1035 + 1 & 0x1F;
		synchronized (this) {
			Static66.aBoolean126 = Static104.aBoolean219;
		}
		this.method260();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method268(@OriginalArg(0) String arg0) {
		if (this.aBoolean28) {
			return;
		}
		this.aBoolean28 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!pa", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static100.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static87.aLong49 = 0L;
		}
	}

	@OriginalMember(owner = "client!pa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static69.aFrame3 == null) {
			return Static24.aClass2_1 == null || Static24.aClass2_1.anApplet1 == this ? super.getAppletContext() : Static24.aClass2_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	protected abstract void method270();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	protected abstract void method271();

	@OriginalMember(owner = "client!pa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	private synchronized void method272() {
		if (Static56.aBoolean98) {
			return;
		}
		Static56.aBoolean98 = true;
		try {
			Static9.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method270();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static69.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static24.aClass2_1 != null) {
			try {
				Static24.aClass2_1.method11();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method264();
	}

	@OriginalMember(owner = "client!pa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static69.aFrame3 == null) {
			return Static24.aClass2_1 == null || Static24.aClass2_1.anApplet1 == this ? super.getDocumentBase() : Static24.aClass2_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIBI)V")
	protected final void method273(@OriginalArg(4) int arg0) {
		try {
			if (Static100.anApplet_Sub1_1 == null) {
				Static101.anInt2509 = 433;
				Static42.anInt1136 = 503;
				Static7.anInt280 = 765;
				Static100.anApplet_Sub1_1 = this;
				if (Static24.aClass2_1 == null) {
					Static74.aClass2_3 = Static24.aClass2_1 = new Class2(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static24.aClass2_1.method13(1, this);
			} else {
				this.method268("alreadyloaded");
			}
		} catch (@Pc(49) Exception local49) {
			Static101.method1675(local49, null);
			this.method268("crash");
		}
	}

	@OriginalMember(owner = "client!pa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static69.aFrame3 == null) {
			return Static24.aClass2_1 == null || Static24.aClass2_1.anApplet1 == this ? super.getParameter(arg0) : Static24.aClass2_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILjava/lang/String;IIIIILjava/net/InetAddress;)V")
	protected final void method276(@OriginalArg(1) String arg0, @OriginalArg(5) int arg1, @OriginalArg(7) InetAddress arg2) {
		try {
			Static101.anInt2509 = 433;
			Static100.anApplet_Sub1_1 = this;
			Static7.anInt280 = 765;
			Static42.anInt1136 = 503;
			Static69.aFrame3 = new Frame();
			Static69.aFrame3.setTitle("Jagex");
			Static69.aFrame3.setResizable(false);
			Static69.aFrame3.addWindowListener(this);
			Static69.aFrame3.setVisible(true);
			Static69.aFrame3.toFront();
			@Pc(40) Insets local40 = Static69.aFrame3.getInsets();
			Static69.aFrame3.setSize(local40.right + local40.left + 765, local40.bottom + local40.top + 503);
			Static74.aClass2_3 = Static24.aClass2_1 = new Class2(true, null, arg2, arg1, arg0, 13);
			Static24.aClass2_1.method13(1, this);
		} catch (@Pc(76) Exception local76) {
			Static101.method1675(local76, null);
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	protected final synchronized void method277() {
		@Pc(10) Container local10;
		if (Static69.aFrame3 == null) {
			local10 = Static24.aClass2_1.anApplet1;
		} else {
			local10 = Static69.aFrame3;
		}
		if (Static9.aCanvas1 != null) {
			Static9.aCanvas1.removeFocusListener(this);
			local10.remove(Static9.aCanvas1);
		}
		Static9.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static9.aCanvas1);
		Static9.aCanvas1.setSize(Static7.anInt280, Static42.anInt1136);
		Static9.aCanvas1.setVisible(true);
		if (Static69.aFrame3 == null) {
			Static9.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(48) Insets local48 = Static69.aFrame3.getInsets();
			Static9.aCanvas1.setLocation(local48.left, local48.top);
		}
		Static9.aCanvas1.addFocusListener(this);
		Static9.aCanvas1.requestFocus();
		Static103.aBoolean216 = true;
		Static69.aBoolean187 = false;
		Static65.aLong56 = Static82.method1291();
	}

	@OriginalMember(owner = "client!pa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static69.aFrame3 == null) {
			return Static24.aClass2_1 == null || Static24.aClass2_1.anApplet1 == this ? super.getCodeBase() : Static24.aClass2_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static100.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static87.aLong49 = Static82.method1291();
			Static104.method1701(5000L);
			Static74.aClass2_3 = null;
			this.method272();
		}
	}
}
