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

@OriginalClass("client!ga")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static13.aFrame2 == null) {
			return Static67.aClass11_1 == null || Static67.aClass11_1.anApplet1 == this ? super.getDocumentBase() : Static67.aClass11_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static13.aFrame2 == null) {
			return Static67.aClass11_1 == null || Static67.aClass11_1.anApplet1 == this ? super.getParameter(arg0) : Static67.aClass11_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static13.aFrame2 == null) {
			return Static67.aClass11_1 == null || Static67.aClass11_1.anApplet1 == this ? super.getCodeBase() : Static67.aClass11_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static68.anApplet_Sub1_1 == this && !Static105.aBoolean127) {
			Static15.aLong10 = Static66.method1158();
			Static68.method1173(5000L);
			Static112.aClass11_4 = null;
			this.method322();
		}
	}

	@OriginalMember(owner = "client!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static68.anApplet_Sub1_1 != this || Static105.aBoolean127) {
			return;
		}
		Static108.aBoolean131 = true;
		if (Static12.aString3 != null && Static12.aString3.startsWith("1.5") && Static66.method1158() - Static89.aLong71 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static51.anInt2591 && local30.height >= Static39.anInt979) {
				Static25.aBoolean24 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V")
	protected final void method318(@OriginalArg(0) int arg0) {
		try {
			if (Static68.anApplet_Sub1_1 == null) {
				Static105.anInt2733 = 445;
				Static39.anInt979 = 503;
				Static51.anInt2591 = 765;
				Static68.anApplet_Sub1_1 = this;
				if (Static67.aClass11_1 == null) {
					Static112.aClass11_4 = Static67.aClass11_1 = new Class11(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static67.aClass11_1.method237(1, this);
			} else {
				Static66.anInt1690++;
				if (Static66.anInt1690 >= 3) {
					this.method329("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(65) Exception local65) {
			Static90.method1648(local65, null);
			this.method329("crash");
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLjava/lang/String;IIIILjava/net/InetAddress;I)V")
	protected final void method319(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(6) InetAddress arg2) {
		try {
			Static68.anApplet_Sub1_1 = this;
			Static39.anInt979 = 503;
			Static105.anInt2733 = 445;
			Static51.anInt2591 = 765;
			Static13.aFrame2 = new Frame();
			Static13.aFrame2.setTitle("Jagex");
			Static13.aFrame2.setResizable(false);
			Static13.aFrame2.addWindowListener(this);
			Static13.aFrame2.setVisible(true);
			Static13.aFrame2.toFront();
			@Pc(32) Insets local32 = Static13.aFrame2.getInsets();
			Static13.aFrame2.setSize(local32.left + local32.right + 765, local32.top + (503 - -local32.bottom));
			Static112.aClass11_4 = Static67.aClass11_1 = new Class11(true, null, arg2, arg1, arg0, 14);
			Static67.aClass11_1.method237(1, this);
		} catch (@Pc(70) Exception local70) {
			Static90.method1648(local70, null);
		}
	}

	@OriginalMember(owner = "client!ga", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static68.anApplet_Sub1_1 == this && !Static105.aBoolean127) {
			Static15.aLong10 = Static66.method1158() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static13.aFrame2 == null) {
			return Static67.aClass11_1 == null || Static67.aClass11_1.anApplet1 == this ? super.getAppletContext() : Static67.aClass11_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	protected final synchronized void method320() {
		@Pc(9) Container local9;
		if (Static13.aFrame2 == null) {
			local9 = Static67.aClass11_1.anApplet1;
		} else {
			local9 = Static13.aFrame2;
		}
		if (Static107.aCanvas1 != null) {
			Static107.aCanvas1.removeFocusListener(this);
			local9.remove(Static107.aCanvas1);
		}
		Static107.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static107.aCanvas1);
		Static107.aCanvas1.setSize(Static51.anInt2591, Static39.anInt979);
		Static107.aCanvas1.setVisible(true);
		if (Static13.aFrame2 == null) {
			Static107.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static13.aFrame2.getInsets();
			Static107.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static107.aCanvas1.addFocusListener(this);
		Static107.aCanvas1.requestFocus();
		Static108.aBoolean131 = true;
		Static25.aBoolean24 = false;
		Static89.aLong71 = Static66.method1158();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	protected abstract void method321();

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	private synchronized void method322() {
		if (Static105.aBoolean127) {
			return;
		}
		Static105.aBoolean127 = true;
		try {
			Static107.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method321();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static13.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static67.aClass11_1 != null) {
			try {
				Static67.aClass11_1.method231();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method324();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	private void method323() {
		@Pc(8) long local8 = Static66.method1158();
		@Pc(12) long local12 = Static24.aLongArray3[Static29.anInt815];
		@Pc(25) boolean local25;
		if (local12 == 0L || local8 <= local12) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static24.aLongArray3[Static29.anInt815] = local8;
		Static29.anInt815 = Static29.anInt815 + 1 & 0x1F;
		synchronized (this) {
			Static103.aBoolean123 = Static104.aBoolean124;
		}
		this.method333();
	}

	@OriginalMember(owner = "client!ga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean124 = false;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	protected abstract void method324();

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)Z")
	protected final boolean method325() {
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
				this.method329("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static68.anApplet_Sub1_1 == this && !Static105.aBoolean127) {
			Static15.aLong10 = 0L;
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	protected abstract void method327();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method329(@OriginalArg(0) String arg0) {
		if (this.aBoolean12) {
			return;
		}
		this.aBoolean12 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static12.aString4 != null) {
				@Pc(10) String local10 = Static12.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(38) String local38 = Static12.aString3;
					if (local38.equals("1.1") || local38.startsWith("1.1.") || local38.equals("1.2") || local38.startsWith("1.2.")) {
						this.method329("wrongjava");
						return;
					}
					Static38.anInt964 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static12.aString3 == null || Static12.aString3.equals("1.4.2"))) {
					this.method329("wrongjava");
					return;
				}
			}
			if (Static67.aClass11_1.anApplet1 != null) {
				@Pc(66) Method local66 = Static12.aMethod1;
				if (local66 != null) {
					try {
						local66.invoke(Static67.aClass11_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(81) Throwable local81) {
					}
				}
			}
			this.method320();
			Static65.aClass14_24 = Static39.method751(Static51.anInt2591, Static39.anInt979, Static107.aCanvas1);
			this.method335();
			Static67.aClass27_1 = Static100.method1852();
			Static67.aClass27_1.method1924();
			while (Static15.aLong10 == 0L || Static15.aLong10 > Static66.method1158()) {
				Static66.anInt1693 = Static67.aClass27_1.method1921(Static63.anInt1626, Static38.anInt964);
				for (@Pc(110) int local110 = 0; local110 < Static66.anInt1693; local110++) {
					this.method323();
				}
				this.method330();
			}
		} catch (@Pc(137) Exception local137) {
			Static90.method1648(local137, null);
			this.method329("crash");
		}
		this.method322();
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	private void method330() {
		@Pc(6) long local6 = Static66.method1158();
		@Pc(10) long local10 = Static64.aLongArray5[Static88.anInt2324];
		Static64.aLongArray5[Static88.anInt2324] = local6;
		Static88.anInt2324 = Static88.anInt2324 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static3.anInt1297 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static106.anInt2725++ > 50) {
			Static106.anInt2725 -= 50;
			Static108.aBoolean131 = true;
			Static107.aCanvas1.setSize(Static51.anInt2591, Static39.anInt979);
			Static107.aCanvas1.setVisible(true);
			if (Static13.aFrame2 == null) {
				Static107.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(75) Insets local75 = Static13.aFrame2.getInsets();
				Static107.aCanvas1.setLocation(local75.left, local75.top);
			}
		}
		this.method327();
	}

	@OriginalMember(owner = "client!ga", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)V")
	protected abstract void method333();

	@OriginalMember(owner = "client!ga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean124 = true;
		Static108.aBoolean131 = true;
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
	protected abstract void method335();
}
