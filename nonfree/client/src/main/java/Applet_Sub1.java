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

@OriginalClass("client!ue")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	protected abstract void method484();

	@OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static116.aBoolean169 = true;
		Static92.aBoolean135 = true;
	}

	@OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static84.anApplet_Sub1_2 != this || Static55.aBoolean89) {
			return;
		}
		Static92.aBoolean135 = true;
		if (Static8.aString2 != null && Static8.aString2.startsWith("1.5") && Static89.method1607() - Static117.aLong83 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static79.anInt2163 <= local28.width && local28.height >= Static118.anInt3181) {
				Static49.aBoolean75 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	private void method485() {
		@Pc(7) long local7 = Static109.aLongArray6[Static94.anInt2623];
		@Pc(10) long local10 = Static89.method1607();
		Static109.aLongArray6[Static94.anInt2623] = local10;
		@Pc(25) boolean local25;
		if (local7 == 0L || local7 >= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static94.anInt2623 = Static94.anInt2623 + 1 & 0x1F;
		synchronized (this) {
			Static81.aBoolean114 = Static116.aBoolean169;
		}
		this.method486();
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static116.aBoolean169 = false;
	}

	@OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static24.aFrame1 == null) {
			return Static4.aClass8_1 == null || Static4.aClass8_1.anApplet1 == this ? super.getCodeBase() : Static4.aClass8_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	protected abstract void method486();

	@OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	protected abstract void method487();

	@OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static84.anApplet_Sub1_2 == this && !Static55.aBoolean89) {
			Static19.aLong22 = Static89.method1607();
			Static53.method2063(5000L);
			Static115.aClass8_3 = null;
			this.method495();
		}
	}

	@OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static24.aFrame1 == null) {
			return Static4.aClass8_1 == null || Static4.aClass8_1.anApplet1 == this ? super.getAppletContext() : Static4.aClass8_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static24.aFrame1 == null) {
			return Static4.aClass8_1 == null || Static4.aClass8_1.anApplet1 == this ? super.getDocumentBase() : Static4.aClass8_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
	protected final boolean method489() {
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
				this.method491("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
	protected final synchronized void method490() {
		@Pc(9) Container local9;
		if (Static24.aFrame1 == null) {
			local9 = Static4.aClass8_1.anApplet1;
		} else {
			local9 = Static24.aFrame1;
		}
		if (Static38.aCanvas1 != null) {
			Static38.aCanvas1.removeFocusListener(this);
			local9.remove(Static38.aCanvas1);
		}
		Static38.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static38.aCanvas1);
		Static38.aCanvas1.setSize(Static79.anInt2163, Static118.anInt3181);
		Static38.aCanvas1.setVisible(true);
		if (Static24.aFrame1 == null) {
			Static38.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static24.aFrame1.getInsets();
			Static38.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static38.aCanvas1.addFocusListener(this);
		Static38.aCanvas1.requestFocus();
		Static92.aBoolean135 = true;
		Static49.aBoolean75 = false;
		Static117.aLong83 = Static89.method1607();
	}

	@OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method491(@OriginalArg(0) String arg0) {
		if (this.aBoolean35) {
			return;
		}
		this.aBoolean35 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static84.anApplet_Sub1_2 == this && !Static55.aBoolean89) {
			Static19.aLong22 = Static89.method1607() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	private void method492() {
		@Pc(2) long local2 = Static89.method1607();
		@Pc(6) long local6 = Static31.aLongArray1[Static124.anInt3315];
		Static31.aLongArray1[Static124.anInt3315] = local2;
		if (local6 != 0L && local6 < local2) {
			@Pc(27) int local27 = (int) (local2 - local6);
			Static114.anInt3105 = ((local27 >> 1) + 32000) / local27;
		}
		Static124.anInt3315 = Static124.anInt3315 + 1 & 0x1F;
		if (Static24.anInt821++ > 50) {
			Static24.anInt821 -= 50;
			Static92.aBoolean135 = true;
			Static38.aCanvas1.setSize(Static79.anInt2163, Static118.anInt3181);
			Static38.aCanvas1.setVisible(true);
			if (Static24.aFrame1 == null) {
				Static38.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(67) Insets local67 = Static24.aFrame1.getInsets();
				Static38.aCanvas1.setLocation(local67.left, local67.top);
			}
		}
		this.method493();
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(Z)V")
	protected abstract void method493();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	protected final void method494(@OriginalArg(3) int arg0) {
		try {
			if (Static84.anApplet_Sub1_2 == null) {
				Static114.anInt3106 = 452;
				Static84.anApplet_Sub1_2 = this;
				Static118.anInt3181 = 503;
				Static79.anInt2163 = 765;
				if (Static4.aClass8_1 == null) {
					Static115.aClass8_3 = Static4.aClass8_1 = new Class8(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static4.aClass8_1.method145(1, this);
			} else {
				Static21.anInt683++;
				if (Static21.anInt683 >= 3) {
					this.method491("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(60) Exception local60) {
			Static92.method1674(local60, null);
			this.method491("crash");
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	private synchronized void method495() {
		if (Static55.aBoolean89) {
			return;
		}
		Static55.aBoolean89 = true;
		try {
			Static38.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method487();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static24.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static4.aClass8_1 != null) {
			try {
				Static4.aClass8_1.method149();
			} catch (@Pc(32) Exception local32) {
			}
		}
		this.method497();
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	protected abstract void method497();

	@OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static24.aFrame1 == null) {
			return Static4.aClass8_1 == null || Static4.aClass8_1.anApplet1 == this ? super.getParameter(arg0) : Static4.aClass8_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static84.anApplet_Sub1_2 == this && !Static55.aBoolean89) {
			Static19.aLong22 = 0L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static8.aString3 != null) {
				@Pc(10) String local10 = Static8.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static8.aString2;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method491("wrongjava");
						return;
					}
					Static102.anInt2832 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static8.aString2 == null || Static8.aString2.equals("1.4.2"))) {
					this.method491("wrongjava");
					return;
				}
			}
			if (Static4.aClass8_1.anApplet1 != null) {
				@Pc(68) Method local68 = Static8.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static4.aClass8_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method490();
			Static86.aClass29_15 = Static70.method1366(Static79.anInt2163, Static118.anInt3181, Static38.aCanvas1);
			this.method484();
			Static86.aClass56_1 = Static120.method2147();
			Static86.aClass56_1.method2004();
			while (Static19.aLong22 == 0L || Static89.method1607() < Static19.aLong22) {
				Static70.anInt2003 = Static86.aClass56_1.method2002(Static102.anInt2832, Static32.anInt1129);
				for (@Pc(112) int local112 = 0; local112 < Static70.anInt2003; local112++) {
					this.method485();
				}
				this.method492();
				Static34.method846(true);
			}
		} catch (@Pc(140) Exception local140) {
			Static92.method1674(local140, null);
			this.method491("crash");
		}
		this.method495();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZLjava/lang/String;ILjava/net/InetAddress;III)V")
	protected final void method498(@OriginalArg(2) String arg0, @OriginalArg(4) InetAddress arg1, @OriginalArg(7) int arg2) {
		try {
			Static118.anInt3181 = 503;
			Static114.anInt3106 = 452;
			Static84.anApplet_Sub1_2 = this;
			Static79.anInt2163 = 765;
			Static24.aFrame1 = new Frame();
			Static24.aFrame1.setTitle("Jagex");
			Static24.aFrame1.setResizable(false);
			Static24.aFrame1.addWindowListener(this);
			Static24.aFrame1.setVisible(true);
			Static24.aFrame1.toFront();
			@Pc(32) Insets local32 = Static24.aFrame1.getInsets();
			Static24.aFrame1.setSize(local32.right + local32.left + 765, local32.top + 503 - -local32.bottom);
			Static115.aClass8_3 = Static4.aClass8_1 = new Class8(true, null, arg1, arg2, arg0, 16);
			Static4.aClass8_1.method145(1, this);
		} catch (@Pc(69) Exception local69) {
			Static92.method1674(local69, null);
		}
	}
}
