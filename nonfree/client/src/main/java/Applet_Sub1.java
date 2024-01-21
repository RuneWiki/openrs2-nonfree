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

@OriginalClass("client!fc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	protected abstract void method293();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method295(@OriginalArg(1) String arg0) {
		if (this.aBoolean20) {
			return;
		}
		this.aBoolean20 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	private void method296() {
		@Pc(6) long local6 = Static62.method1228();
		@Pc(10) long local10 = Static105.aLongArray6[Static39.anInt2122];
		Static105.aLongArray6[Static39.anInt2122] = local6;
		if ((long) 0 != local10 && local10 < local6) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static67.anInt1913 = ((local28 >> 1) + 32000) / local28;
		}
		Static39.anInt2122 = Static39.anInt2122 + 1 & 0x1F;
		if (Static54.anInt1639++ > 50) {
			Static54.anInt1639 -= 50;
			Static19.aBoolean26 = true;
			Static75.aCanvas1.setSize(Static57.anInt1704, Static16.anInt513);
			Static75.aCanvas1.setVisible(true);
			if (Static35.aFrame1 == null) {
				Static75.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(69) Insets local69 = Static35.aFrame1.getInsets();
				Static75.aCanvas1.setLocation(local69.left, local69.top);
			}
		}
		this.method299();
	}

	@OriginalMember(owner = "client!fc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static35.aFrame1 == null) {
			return Static96.aClass77_3 == null || Static96.aClass77_3.anApplet1 == this ? super.getParameter(arg0) : Static96.aClass77_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static40.anApplet_Sub1_1 == this && !Static21.aBoolean30) {
			Static28.aLong53 = 0L;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	private void method297() {
		@Pc(6) long local6 = Static62.method1228();
		@Pc(10) long local10 = Static54.aLongArray2[Static88.anInt2498];
		@Pc(23) boolean local23;
		if (local10 == 0L || local10 >= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static54.aLongArray2[Static88.anInt2498] = local6;
		Static88.anInt2498 = Static88.anInt2498 + 1 & 0x1F;
		synchronized (this) {
			Static88.aBoolean115 = Static75.aBoolean100;
		}
		this.method306();
	}

	@OriginalMember(owner = "client!fc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	protected final synchronized void method298() {
		@Pc(10) Container local10;
		if (Static35.aFrame1 == null) {
			local10 = Static96.aClass77_3.anApplet1;
		} else {
			local10 = Static35.aFrame1;
		}
		if (Static75.aCanvas1 != null) {
			Static75.aCanvas1.removeFocusListener(this);
			local10.remove(Static75.aCanvas1);
		}
		Static75.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static75.aCanvas1);
		Static75.aCanvas1.setSize(Static57.anInt1704, Static16.anInt513);
		Static75.aCanvas1.setVisible(true);
		if (Static35.aFrame1 == null) {
			Static75.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static35.aFrame1.getInsets();
			Static75.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static75.aCanvas1.addFocusListener(this);
		Static75.aCanvas1.requestFocus();
		Static19.aBoolean26 = true;
		Static46.aBoolean71 = false;
		Static60.aLong87 = Static62.method1228();
	}

	@OriginalMember(owner = "client!fc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static75.aBoolean100 = true;
		Static19.aBoolean26 = true;
	}

	@OriginalMember(owner = "client!fc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static35.aFrame1 == null) {
			return Static96.aClass77_3 == null || Static96.aClass77_3.anApplet1 == this ? super.getAppletContext() : Static96.aClass77_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V")
	protected abstract void method299();

	@OriginalMember(owner = "client!fc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static35.aFrame1 == null) {
			return Static96.aClass77_3 == null || Static96.aClass77_3.anApplet1 == this ? super.getCodeBase() : Static96.aClass77_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static35.aFrame1 == null) {
			return Static96.aClass77_3 == null || Static96.aClass77_3.anApplet1 == this ? super.getDocumentBase() : Static96.aClass77_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static40.anApplet_Sub1_1 == this && !Static21.aBoolean30) {
			Static28.aLong53 = Static62.method1228() + 4000L;
		}
	}

	@OriginalMember(owner = "client!fc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	private synchronized void method301() {
		if (Static21.aBoolean30) {
			return;
		}
		Static21.aBoolean30 = true;
		try {
			Static75.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method304();
		} catch (@Pc(22) Exception local22) {
		}
		if (Static35.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		if (Static96.aClass77_3 != null) {
			try {
				Static96.aClass77_3.method2163();
			} catch (@Pc(36) Exception local36) {
			}
		}
		this.method293();
	}

	@OriginalMember(owner = "client!fc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static40.anApplet_Sub1_1 != this || Static21.aBoolean30) {
			return;
		}
		Static19.aBoolean26 = true;
		if (Static123.aString3 != null && Static123.aString3.startsWith("1.5") && Static62.method1228() - Static60.aLong87 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static57.anInt1704 && local28.height >= Static16.anInt513) {
				Static46.aBoolean71 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
	protected final boolean method302() {
		@Pc(9) String local9 = this.getDocumentBase().getHost().toLowerCase();
		if (local9.equals("jagex.com") || local9.endsWith(".jagex.com")) {
			return true;
		} else if (local9.equals("runescape.com") || local9.endsWith(".runescape.com")) {
			return true;
		} else if (local9.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local9.length() > 0 && local9.charAt(local9.length() - 1) >= '0' && local9.charAt(local9.length() - 1) <= '9') {
				local9 = local9.substring(0, local9.length() - 1);
			}
			if (local9.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method295("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static40.anApplet_Sub1_1 == this && !Static21.aBoolean30) {
			Static28.aLong53 = Static62.method1228();
			Static17.method318(5000L);
			Static60.aClass77_2 = null;
			this.method301();
		}
	}

	@OriginalMember(owner = "client!fc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static123.aString2 != null) {
				@Pc(10) String local10 = Static123.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static123.aString3;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method295("wrongjava");
						return;
					}
					Static7.anInt201 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static123.aString3 == null || Static123.aString3.equals("1.4.2"))) {
					this.method295("wrongjava");
					return;
				}
			}
			if (Static96.aClass77_3.anApplet1 != null) {
				@Pc(68) Method local68 = Static123.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static96.aClass77_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method298();
			Static42.aClass11_39 = Static55.method1154(Static57.anInt1704, Static16.anInt513, Static75.aCanvas1);
			this.method305();
			Static121.aClass4_3 = Static49.method1109();
			Static121.aClass4_3.method1695();
			while (Static28.aLong53 == 0L || Static62.method1228() < Static28.aLong53) {
				Static88.anInt2503 = Static121.aClass4_3.method1692(Static7.anInt201, Static120.anInt3123);
				for (@Pc(112) int local112 = 0; local112 < Static88.anInt2503; local112++) {
					this.method297();
				}
				this.method296();
			}
		} catch (@Pc(141) Exception local141) {
			Static53.method1609(null, local141);
			this.method295("crash");
		}
		this.method301();
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	protected abstract void method304();

	@OriginalMember(owner = "client!fc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static75.aBoolean100 = false;
	}

	@OriginalMember(owner = "client!fc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	protected abstract void method305();

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V")
	protected abstract void method306();

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/net/InetAddress;ILjava/lang/String;II)V")
	protected final void method307(@OriginalArg(3) InetAddress arg0, @OriginalArg(4) int arg1, @OriginalArg(5) String arg2) {
		try {
			Static57.anInt1704 = 765;
			Static40.anApplet_Sub1_1 = this;
			Static16.anInt513 = 503;
			Static105.anInt2779 = 451;
			Static35.aFrame1 = new Frame();
			Static35.aFrame1.setTitle("Jagex");
			Static35.aFrame1.setResizable(false);
			Static35.aFrame1.addWindowListener(this);
			Static35.aFrame1.setVisible(true);
			Static35.aFrame1.toFront();
			@Pc(38) Insets local38 = Static35.aFrame1.getInsets();
			Static35.aFrame1.setSize(local38.right + local38.left + 765, local38.top + 503 - -local38.bottom);
			Static60.aClass77_2 = Static96.aClass77_3 = new Class77(true, null, arg0, arg1, arg2, 16);
			Static96.aClass77_3.method2166(this, 1);
		} catch (@Pc(75) Exception local75) {
			Static53.method1609(null, local75);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZII)V")
	protected final void method308(@OriginalArg(1) int arg0) {
		try {
			if (Static40.anApplet_Sub1_1 == null) {
				Static40.anApplet_Sub1_1 = this;
				Static57.anInt1704 = 765;
				Static105.anInt2779 = 451;
				Static16.anInt513 = 503;
				if (Static96.aClass77_3 == null) {
					Static60.aClass77_2 = Static96.aClass77_3 = new Class77(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static96.aClass77_3.method2166(this, 1);
			} else {
				Static57.anInt1708++;
				if (Static57.anInt1708 >= 3) {
					this.method295("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static53.method1609(null, local61);
			this.method295("crash");
		}
	}

	@OriginalMember(owner = "client!fc", name = "init", descriptor = "()V")
	public abstract void init();
}
