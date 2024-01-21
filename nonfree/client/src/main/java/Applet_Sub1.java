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

@OriginalClass("client!jf")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!jf", name = "R", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!jf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static71.aBoolean72 = true;
		Static23.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Z")
	protected final boolean method319() {
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
				this.method329("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static53.aString1 != null) {
				@Pc(10) String local10 = Static53.aString1.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static53.aString3;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method329("wrongjava");
						return;
					}
					Static34.anInt897 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static53.aString3 == null || Static53.aString3.equals("1.4.2"))) {
					this.method329("wrongjava");
					return;
				}
			}
			if (Static129.aClass35_3.anApplet1 != null) {
				@Pc(69) Method local69 = Static53.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static129.aClass35_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method333();
			Static20.aClass2_1 = Static130.method2137(Static28.anInt810, Static111.anInt2680, Static83.aCanvas1);
			this.method325();
			Static38.aClass8_1 = Static24.method471();
			Static38.aClass8_1.method2117();
			while (Static107.aLong89 == 0L || Static107.aLong89 > Static16.method286()) {
				Static101.anInt2466 = Static38.aClass8_1.method2114(Static34.anInt897, Static85.anInt2025);
				for (@Pc(113) int local113 = 0; local113 < Static101.anInt2466; local113++) {
					this.method320();
				}
				this.method332();
				Static38.method644(Static129.aClass35_3, Static83.aCanvas1);
			}
		} catch (@Pc(140) Exception local140) {
			Static15.method2092(local140, null);
			this.method329("crash");
		}
		this.method335();
	}

	@OriginalMember(owner = "client!jf", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static77.anApplet_Sub1_1 == this && !Static38.aBoolean28) {
			Static107.aLong89 = 0L;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	private void method320() {
		@Pc(3) long local3 = Static115.aLongArray11[Static70.anInt1810];
		@Pc(6) long local6 = Static16.method286();
		Static115.aLongArray11[Static70.anInt1810] = local6;
		@Pc(31) boolean local31;
		if (local3 == 0L || local3 >= local6) {
			local31 = false;
		} else {
			local31 = true;
		}
		Static70.anInt1810 = Static70.anInt1810 + 1 & 0x1F;
		synchronized (this) {
			Static32.aBoolean25 = Static71.aBoolean72;
		}
		this.method336();
	}

	@OriginalMember(owner = "client!jf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static107.aFrame1 == null) {
			return Static129.aClass35_3 == null || Static129.aClass35_3.anApplet1 == this ? super.getAppletContext() : Static129.aClass35_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!jf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static107.aFrame1 == null) {
			return Static129.aClass35_3 == null || Static129.aClass35_3.anApplet1 == this ? super.getCodeBase() : Static129.aClass35_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!jf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static77.anApplet_Sub1_1 != this || Static38.aBoolean28) {
			return;
		}
		Static23.aBoolean20 = true;
		if (Static53.aString3 != null && Static53.aString3.startsWith("1.5") && Static16.method286() - Static16.aLong12 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static28.anInt810 <= local30.width && local30.height >= Static111.anInt2680) {
				Static75.aBoolean75 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
	protected final void method324(@OriginalArg(0) int arg0) {
		try {
			if (Static77.anApplet_Sub1_1 != null) {
				Static28.anInt809++;
				if (Static28.anInt809 >= 3) {
					this.method329("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static76.anInt1898 = 462;
			Static77.anApplet_Sub1_1 = this;
			Static111.anInt2680 = 503;
			Static28.anInt810 = 765;
			if (Static129.aClass35_3 == null) {
				Static26.aClass35_1 = Static129.aClass35_3 = new Class35(false, this, arg0, null, 0);
			}
			Static129.aClass35_3.method981(1, this);
		} catch (@Pc(53) Exception local53) {
			Static15.method2092(local53, null);
			this.method329("crash");
		}
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	protected abstract void method325();

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	protected abstract void method326();

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	protected abstract void method327();

	@OriginalMember(owner = "client!jf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static71.aBoolean72 = false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method329(@OriginalArg(1) String arg0) {
		if (this.aBoolean17) {
			return;
		}
		this.aBoolean17 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!jf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static107.aFrame1 == null) {
			return Static129.aClass35_3 == null || Static129.aClass35_3.anApplet1 == this ? super.getParameter(arg0) : Static129.aClass35_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
	protected abstract void method331();

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
	private void method332() {
		@Pc(7) long local7 = Static122.aLongArray14[Static46.anInt1200];
		@Pc(10) long local10 = Static16.method286();
		Static122.aLongArray14[Static46.anInt1200] = local10;
		if (local7 != 0L && local10 > local7) {
			@Pc(32) int local32 = (int) (local10 - local7);
			Static107.anInt2523 = ((local32 >> 1) + 32000) / local32;
		}
		Static46.anInt1200 = Static46.anInt1200 + 1 & 0x1F;
		if (Static115.anInt2759++ > 50) {
			Static23.aBoolean20 = true;
			Static115.anInt2759 -= 50;
			Static83.aCanvas1.setSize(Static28.anInt810, Static111.anInt2680);
			Static83.aCanvas1.setVisible(true);
			if (Static107.aFrame1 == null) {
				Static83.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(84) Insets local84 = Static107.aFrame1.getInsets();
				Static83.aCanvas1.setLocation(local84.left, local84.top);
			}
		}
		this.method327();
	}

	@OriginalMember(owner = "client!jf", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static77.anApplet_Sub1_1 == this && !Static38.aBoolean28) {
			Static107.aLong89 = Static16.method286();
			Static13.method278(5000L);
			Static26.aClass35_1 = null;
			this.method335();
		}
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V")
	protected final synchronized void method333() {
		@Pc(13) Container local13;
		if (Static107.aFrame1 == null) {
			local13 = Static129.aClass35_3.anApplet1;
		} else {
			local13 = Static107.aFrame1;
		}
		if (Static83.aCanvas1 != null) {
			Static83.aCanvas1.removeFocusListener(this);
			local13.remove(Static83.aCanvas1);
		}
		Static83.aCanvas1 = new Canvas_Sub1(this);
		local13.add(Static83.aCanvas1);
		Static83.aCanvas1.setSize(Static28.anInt810, Static111.anInt2680);
		Static83.aCanvas1.setVisible(true);
		if (Static107.aFrame1 == null) {
			Static83.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(47) Insets local47 = Static107.aFrame1.getInsets();
			Static83.aCanvas1.setLocation(local47.left, local47.top);
		}
		Static83.aCanvas1.addFocusListener(this);
		Static83.aCanvas1.requestFocus();
		Static23.aBoolean20 = true;
		Static75.aBoolean75 = false;
		Static16.aLong12 = Static16.method286();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method334(@OriginalArg(1) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static111.anInt2680 = 503;
			Static77.anApplet_Sub1_1 = this;
			Static28.anInt810 = 765;
			Static76.anInt1898 = 462;
			Static107.aFrame1 = new Frame();
			Static107.aFrame1.setTitle("Jagex");
			Static107.aFrame1.setResizable(false);
			Static107.aFrame1.addWindowListener(this);
			Static107.aFrame1.setVisible(true);
			Static107.aFrame1.toFront();
			@Pc(32) Insets local32 = Static107.aFrame1.getInsets();
			Static107.aFrame1.setSize(local32.right + local32.left + 765, local32.bottom + 503 + local32.top);
			Static26.aClass35_1 = Static129.aClass35_3 = new Class35(true, null, arg1, arg0, 16);
			Static129.aClass35_3.method981(1, this);
		} catch (@Pc(67) Exception local67) {
			Static15.method2092(local67, null);
		}
	}

	@OriginalMember(owner = "client!jf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static107.aFrame1 == null) {
			return Static129.aClass35_3 == null || Static129.aClass35_3.anApplet1 == this ? super.getDocumentBase() : Static129.aClass35_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V")
	private synchronized void method335() {
		if (Static38.aBoolean28) {
			return;
		}
		Static38.aBoolean28 = true;
		try {
			Static83.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method326();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static107.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static129.aClass35_3 != null) {
			try {
				Static129.aClass35_3.method988();
			} catch (@Pc(32) Exception local32) {
			}
		}
		this.method331();
	}

	@OriginalMember(owner = "client!jf", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static77.anApplet_Sub1_1 == this && !Static38.aBoolean28) {
			Static107.aLong89 = Static16.method286() + 4000L;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
	protected abstract void method336();
}
