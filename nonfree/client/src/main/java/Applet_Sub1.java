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

@OriginalClass("client!re")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!re", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!re", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static35.anApplet_Sub1_1 == this && !Static104.aBoolean80) {
			Static17.aLong16 = 0L;
		}
	}

	@OriginalMember(owner = "client!re", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static11.aFrame1 == null) {
			return Static56.aClass23_3 == null || Static56.aClass23_3.anApplet1 == this ? super.getParameter(arg0) : Static56.aClass23_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static74.aBoolean89 = true;
		Static27.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!re", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static26.aString3 != null) {
				@Pc(10) String local10 = Static26.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static26.aString6;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method381("wrongjava");
						return;
					}
					Static44.anInt1253 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static26.aString6 == null || Static26.aString6.equals("1.4.2"))) {
					this.method381("wrongjava");
					return;
				}
			}
			if (Static56.aClass23_3.anApplet1 != null) {
				@Pc(67) Method local67 = Static26.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static56.aClass23_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method390();
			Static51.aClass2_19 = Static92.method1544(Static62.aCanvas1, Static100.anInt2509, Static82.anInt2023);
			this.method382();
			Static115.aClass37_1 = Static96.method1321();
			Static115.aClass37_1.method1695();
			while (Static17.aLong16 == 0L || Static3.method125() < Static17.aLong16) {
				Static3.anInt291 = Static115.aClass37_1.method1696(Static44.anInt1253, Static17.anInt613);
				for (@Pc(111) int local111 = 0; local111 < Static3.anInt291; local111++) {
					this.method378();
				}
				this.method392();
			}
		} catch (@Pc(138) Exception local138) {
			Static69.method1187(local138, null);
			this.method381("crash");
		}
		this.method389();
	}

	@OriginalMember(owner = "client!re", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	private void method378() {
		@Pc(8) long local8 = Static3.method125();
		@Pc(12) long local12 = Static111.aLongArray7[Static53.anInt1406];
		@Pc(27) boolean local27;
		if (local12 == 0L || local12 >= local8) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static111.aLongArray7[Static53.anInt1406] = local8;
		Static53.anInt1406 = Static53.anInt1406 + 1 & 0x1F;
		synchronized (this) {
			Static70.aBoolean84 = Static74.aBoolean89;
		}
		this.method395();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	protected final void method379(@OriginalArg(2) int arg0) {
		try {
			if (Static35.anApplet_Sub1_1 == null) {
				Static115.anInt2974 = 443;
				Static82.anInt2023 = 503;
				Static100.anInt2509 = 765;
				Static35.anApplet_Sub1_1 = this;
				if (Static56.aClass23_3 == null) {
					Static9.aClass23_1 = Static56.aClass23_3 = new Class23(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static56.aClass23_3.method520(this, 1);
			} else {
				Static31.anInt1152++;
				if (Static31.anInt1152 >= 3) {
					this.method381("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(62) Exception local62) {
			Static69.method1187(local62, null);
			this.method381("crash");
		}
	}

	@OriginalMember(owner = "client!re", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method381(@OriginalArg(1) String arg0) {
		if (this.aBoolean25) {
			return;
		}
		this.aBoolean25 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
	protected abstract void method382();

	@OriginalMember(owner = "client!re", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static11.aFrame1 == null) {
			return Static56.aClass23_3 == null || Static56.aClass23_3.anApplet1 == this ? super.getAppletContext() : Static56.aClass23_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	protected abstract void method384();

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/net/InetAddress;Ljava/lang/String;IIIII)V")
	protected final void method385(@OriginalArg(1) InetAddress arg0, @OriginalArg(2) String arg1, @OriginalArg(7) int arg2) {
		try {
			Static35.anApplet_Sub1_1 = this;
			Static115.anInt2974 = 443;
			Static82.anInt2023 = 503;
			Static100.anInt2509 = 765;
			Static11.aFrame1 = new Frame();
			Static11.aFrame1.setTitle("Jagex");
			Static11.aFrame1.setResizable(false);
			Static11.aFrame1.addWindowListener(this);
			Static11.aFrame1.setVisible(true);
			Static11.aFrame1.toFront();
			@Pc(38) Insets local38 = Static11.aFrame1.getInsets();
			Static11.aFrame1.setSize(local38.right + local38.left + 765, local38.top + 503 + local38.bottom);
			Static9.aClass23_1 = Static56.aClass23_3 = new Class23(true, null, arg0, arg2, arg1, 14);
			Static56.aClass23_3.method520(this, 1);
		} catch (@Pc(74) Exception local74) {
			Static69.method1187(local74, null);
		}
	}

	@OriginalMember(owner = "client!re", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static11.aFrame1 == null) {
			return Static56.aClass23_3 == null || Static56.aClass23_3.anApplet1 == this ? super.getCodeBase() : Static56.aClass23_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!re", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	private synchronized void method389() {
		if (Static104.aBoolean80) {
			return;
		}
		Static104.aBoolean80 = true;
		try {
			Static62.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method384();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static11.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static56.aClass23_3 != null) {
			try {
				Static56.aClass23_3.method525();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method393();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	protected final synchronized void method390() {
		@Pc(9) Container local9;
		if (Static11.aFrame1 == null) {
			local9 = Static56.aClass23_3.anApplet1;
		} else {
			local9 = Static11.aFrame1;
		}
		if (Static62.aCanvas1 != null) {
			Static62.aCanvas1.removeFocusListener(this);
			local9.remove(Static62.aCanvas1);
		}
		Static62.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static62.aCanvas1);
		Static62.aCanvas1.setSize(Static100.anInt2509, Static82.anInt2023);
		Static62.aCanvas1.setVisible(true);
		if (Static11.aFrame1 == null) {
			Static62.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static11.aFrame1.getInsets();
			Static62.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static62.aCanvas1.addFocusListener(this);
		Static62.aCanvas1.requestFocus();
		Static27.aBoolean42 = true;
		Static69.aBoolean83 = false;
		Static62.aLong53 = Static3.method125();
	}

	@OriginalMember(owner = "client!re", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static35.anApplet_Sub1_1 != this || Static104.aBoolean80) {
			return;
		}
		Static27.aBoolean42 = true;
		if (Static26.aString6 != null && Static26.aString6.startsWith("1.5") && Static3.method125() - Static62.aLong53 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || Static100.anInt2509 <= local27.width && Static82.anInt2023 <= local27.height) {
				Static69.aBoolean83 = true;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static35.anApplet_Sub1_1 == this && !Static104.aBoolean80) {
			Static17.aLong16 = Static3.method125() + 4000L;
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Z")
	protected final boolean method391() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.endsWith("jagex.com")) {
			return true;
		} else if (local13.endsWith("runescape.com")) {
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
				this.method381("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static35.anApplet_Sub1_1 == this && !Static104.aBoolean80) {
			Static17.aLong16 = Static3.method125();
			Static74.method1220(5000L);
			Static9.aClass23_1 = null;
			this.method389();
		}
	}

	@OriginalMember(owner = "client!re", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
	private void method392() {
		@Pc(11) long local11 = Static3.method125();
		@Pc(15) long local15 = Static69.aLongArray5[Static64.anInt1695];
		Static69.aLongArray5[Static64.anInt1695] = local11;
		if (local15 != 0L && local15 < local11) {
			@Pc(33) int local33 = (int) (local11 - local15);
			Static112.anInt2927 = ((local33 >> 1) + 32000) / local33;
		}
		Static64.anInt1695 = Static64.anInt1695 + 1 & 0x1F;
		if (Static74.anInt1890++ > 50) {
			Static74.anInt1890 -= 50;
			Static27.aBoolean42 = true;
			Static62.aCanvas1.setSize(Static100.anInt2509, Static82.anInt2023);
			Static62.aCanvas1.setVisible(true);
			if (Static11.aFrame1 == null) {
				Static62.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static11.aFrame1.getInsets();
				Static62.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method394();
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	protected abstract void method393();

	@OriginalMember(owner = "client!re", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!re", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static11.aFrame1 == null) {
			return Static56.aClass23_3 == null || Static56.aClass23_3.anApplet1 == this ? super.getDocumentBase() : Static56.aClass23_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static74.aBoolean89 = false;
	}

	@OriginalMember(owner = "client!re", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
	protected abstract void method394();

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	protected abstract void method395();
}
