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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
	private boolean aBoolean18 = false;

	@OriginalMember(owner = "client!he", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static97.anApplet_Sub1_1 != this || Static21.aBoolean30) {
			return;
		}
		Static91.aBoolean134 = true;
		if (Static102.aString6 == null || !Static102.aString6.startsWith("1.5") || System.currentTimeMillis() - Static63.aLong46 <= 1000L) {
			return;
		}
		@Pc(27) Rectangle local27 = arg0.getClipBounds();
		if (local27 == null) {
			System.out.println("Rect: null");
		} else {
			System.out.println("Rect: " + local27.x + "," + local27.y + "," + local27.width + "," + local27.height);
		}
		if (local27 == null || local27.width >= Static12.anInt367 && Static99.anInt2511 <= local27.height) {
			Static43.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	protected abstract void method300();

	@OriginalMember(owner = "client!he", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	private void method301() {
		@Pc(7) long local7 = Static2.aLongArray1[Static12.anInt369];
		@Pc(9) long local9 = System.currentTimeMillis();
		Static2.aLongArray1[Static12.anInt369] = local9;
		Static12.anInt369 = Static12.anInt369 + 1 & 0x1F;
		if (local7 != 0L && local7 < local9) {
			@Pc(38) int local38 = (int) (local9 - local7);
			Static50.anInt1725 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static57.anInt2697++ > 50) {
			Static57.anInt2697 -= 50;
			Static91.aBoolean134 = true;
			Static89.aCanvas1.setSize(Static12.anInt367, Static99.anInt2511);
			Static89.aCanvas1.setVisible(true);
			if (Static15.aFrame1 == null) {
				Static89.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(73) Insets local73 = Static15.aFrame1.getInsets();
				Static89.aCanvas1.setLocation(local73.left, local73.top);
			}
		}
		this.method311();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	protected abstract void method303();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
	private synchronized void method305() {
		if (Static21.aBoolean30) {
			return;
		}
		Static21.aBoolean30 = true;
		try {
			Static89.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method303();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static15.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static64.aClass60_3 != null) {
			try {
				Static64.aClass60_3.method1808();
			} catch (@Pc(32) Exception local32) {
			}
		}
		this.method315();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/net/InetAddress;Ljava/lang/String;IIIIII)V")
	protected final void method306(@OriginalArg(0) InetAddress arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		try {
			Static12.anInt367 = 765;
			Static38.anInt950 = 419;
			Static97.anApplet_Sub1_1 = this;
			Static99.anInt2511 = 503;
			Static15.aFrame1 = new Frame();
			Static15.aFrame1.setTitle("Jagex");
			Static15.aFrame1.setResizable(false);
			Static15.aFrame1.addWindowListener(this);
			Static15.aFrame1.setVisible(true);
			Static15.aFrame1.toFront();
			@Pc(37) Insets local37 = Static15.aFrame1.getInsets();
			Static15.aFrame1.setSize(local37.right + local37.left + 765, local37.top + (503 - -local37.bottom));
			Static29.aClass60_1 = Static64.aClass60_3 = new Class60(true, null, arg0, arg2, arg1, 12);
			Static64.aClass60_3.method1807(this, 1);
		} catch (@Pc(75) Exception local75) {
			Static95.method1687(null, local75);
		}
	}

	@OriginalMember(owner = "client!he", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static97.anApplet_Sub1_1 == this && !Static21.aBoolean30) {
			Static71.aLong60 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	protected final void method307(@OriginalArg(3) int arg0) {
		try {
			if (Static97.anApplet_Sub1_1 == null) {
				Static99.anInt2511 = 503;
				Static38.anInt950 = 419;
				Static97.anApplet_Sub1_1 = this;
				Static12.anInt367 = 765;
				if (Static64.aClass60_3 == null) {
					Static29.aClass60_1 = Static64.aClass60_3 = new Class60(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static64.aClass60_3.method1807(this, 1);
			} else {
				this.method309("alreadyloaded");
			}
		} catch (@Pc(50) Exception local50) {
			Static95.method1687(null, local50);
			this.method309("crash");
		}
	}

	@OriginalMember(owner = "client!he", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method309(@OriginalArg(0) String arg0) {
		if (this.aBoolean18) {
			return;
		}
		this.aBoolean18 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	private void method310() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(16) long local16 = Static45.aLongArray4[Static71.anInt1825];
		Static45.aLongArray4[Static71.anInt1825] = local5;
		Static71.anInt1825 = Static71.anInt1825 + 1 & 0x1F;
		synchronized (this) {
			Static52.aBoolean83 = Static6.aBoolean6;
		}
		this.method314();
		@Pc(50) boolean local50;
		if (local16 == 0L || local5 <= local16) {
			local50 = false;
		} else {
			local50 = true;
		}
	}

	@OriginalMember(owner = "client!he", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	protected abstract void method311();

	@OriginalMember(owner = "client!he", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static15.aFrame1 == null) {
			return Static64.aClass60_3 == null || Static64.aClass60_3.anApplet1 == this ? super.getAppletContext() : Static64.aClass60_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static97.anApplet_Sub1_1 == this && !Static21.aBoolean30) {
			Static71.aLong60 = System.currentTimeMillis();
			Static9.method179(5000L);
			Static29.aClass60_1 = null;
			this.method305();
		}
	}

	@OriginalMember(owner = "client!he", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static15.aFrame1 == null) {
			return Static64.aClass60_3 == null || Static64.aClass60_3.anApplet1 == this ? super.getDocumentBase() : Static64.aClass60_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static6.aBoolean6 = true;
		Static91.aBoolean134 = true;
	}

	@OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static6.aBoolean6 = false;
	}

	@OriginalMember(owner = "client!he", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static102.aString3 != null) {
				@Pc(10) String local10 = Static102.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static102.aString6;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method309("wrongjava");
						return;
					}
					Static59.anInt1993 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static102.aString6 == null || Static102.aString6.equals("1.4.2"))) {
					this.method309("wrongjava");
					return;
				}
			}
			this.method313();
			Static13.aClass31_11 = Static61.method1022(Static89.aCanvas1, Static99.anInt2511, Static12.anInt367);
			this.method300();
			Static72.aClass7_3 = Static31.method1564();
			Static72.aClass7_3.method1653();
			while (Static71.aLong60 == 0L || Static71.aLong60 > System.currentTimeMillis()) {
				Static6.anInt160 = Static72.aClass7_3.method1654(Static59.anInt1993, Static34.anInt854);
				for (@Pc(93) int local93 = 0; local93 < Static6.anInt160; local93++) {
					this.method310();
				}
				this.method301();
			}
		} catch (@Pc(115) Exception local115) {
			Static95.method1687(null, local115);
			this.method309("crash");
		}
		this.method305();
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	protected final synchronized void method313() {
		System.out.println("addcanvas");
		@Pc(12) Container local12;
		if (Static15.aFrame1 == null) {
			local12 = Static64.aClass60_3.anApplet1;
		} else {
			local12 = Static15.aFrame1;
		}
		if (Static89.aCanvas1 != null) {
			Static89.aCanvas1.removeFocusListener(this);
			local12.remove(Static89.aCanvas1);
		}
		Static89.aCanvas1 = new Canvas_Sub1(this);
		local12.add(Static89.aCanvas1);
		Static89.aCanvas1.setSize(Static12.anInt367, Static99.anInt2511);
		Static89.aCanvas1.setVisible(true);
		if (Static15.aFrame1 == null) {
			Static89.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(50) Insets local50 = Static15.aFrame1.getInsets();
			Static89.aCanvas1.setLocation(local50.left, local50.top);
		}
		Static89.aCanvas1.addFocusListener(this);
		Static89.aCanvas1.requestFocus();
		Static91.aBoolean134 = true;
		Static43.aBoolean61 = false;
		Static63.aLong46 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!he", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	protected abstract void method314();

	@OriginalMember(owner = "client!he", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(B)V")
	protected abstract void method315();

	@OriginalMember(owner = "client!he", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static97.anApplet_Sub1_1 == this && !Static21.aBoolean30) {
			Static71.aLong60 = 0L;
		}
	}

	@OriginalMember(owner = "client!he", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static15.aFrame1 == null) {
			return Static64.aClass60_3 == null || Static64.aClass60_3.anApplet1 == this ? super.getCodeBase() : Static64.aClass60_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static15.aFrame1 == null) {
			return Static64.aClass60_3 == null || Static64.aClass60_3.anApplet1 == this ? super.getParameter(arg0) : Static64.aClass60_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(B)Z")
	protected final boolean method317() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.endsWith("jagex.com")) {
			return true;
		} else if (local16.endsWith("runescape.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method309("invalidhost");
				return false;
			}
		}
	}
}
