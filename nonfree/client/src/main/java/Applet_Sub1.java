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

@OriginalClass("client!o")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!o", name = "l", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	protected abstract void method212();

	@OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static88.aBoolean65 = true;
		Static54.aBoolean86 = true;
	}

	@OriginalMember(owner = "client!o", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!o", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Z")
	protected final boolean method213() {
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
				this.method228("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/net/InetAddress;IIIILjava/lang/String;I)V")
	protected final void method214(@OriginalArg(1) InetAddress arg0, @OriginalArg(5) int arg1, @OriginalArg(6) String arg2) {
		try {
			Static65.anInt1962 = 765;
			Static96.anInt1791 = 441;
			Static25.anApplet_Sub1_1 = this;
			Static76.anInt2082 = 503;
			Static61.aFrame1 = new Frame();
			Static61.aFrame1.setTitle("Jagex");
			Static61.aFrame1.setResizable(false);
			Static61.aFrame1.addWindowListener(this);
			Static61.aFrame1.setVisible(true);
			Static61.aFrame1.toFront();
			@Pc(37) Insets local37 = Static61.aFrame1.getInsets();
			Static61.aFrame1.setSize(local37.left + local37.right + 765, local37.bottom + 503 + local37.top);
			Static82.aClass54_3 = Static26.aClass54_2 = new Class54(true, null, arg0, arg1, arg2, 14);
			Static26.aClass54_2.method1495(1, this);
		} catch (@Pc(73) Exception local73) {
			Static42.method908(null, local73);
		}
	}

	@OriginalMember(owner = "client!o", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static25.anApplet_Sub1_1 != this || Static10.aBoolean8) {
			return;
		}
		Static54.aBoolean86 = true;
		if (Static86.aString3 != null && Static86.aString3.startsWith("1.5") && Static82.method1454() - Static51.aLong42 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static65.anInt1962 && local27.height >= Static76.anInt2082) {
				Static9.aBoolean6 = true;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static86.aString2 != null) {
				@Pc(10) String local10 = Static86.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static86.aString3;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method228("wrongjava");
						return;
					}
					Static7.anInt179 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static86.aString3 == null || Static86.aString3.equals("1.4.2"))) {
					this.method228("wrongjava");
					return;
				}
			}
			if (Static26.aClass54_2.anApplet1 != null) {
				@Pc(70) Method local70 = Static86.aMethod2;
				if (local70 != null) {
					try {
						local70.invoke(Static26.aClass54_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method215();
			Static77.aClass34_58 = Static114.method1928(Static65.anInt1962, Static26.aCanvas1, Static76.anInt2082);
			this.method224();
			Static70.aClass22_3 = Static64.method1243();
			Static70.aClass22_3.method900();
			while (Static108.aLong83 == 0L || Static108.aLong83 > Static82.method1454()) {
				Static77.anInt2100 = Static70.aClass22_3.method898(Static1.anInt74, Static7.anInt179);
				for (@Pc(114) int local114 = 0; local114 < Static77.anInt2100; local114++) {
					this.method226();
				}
				this.method219();
			}
		} catch (@Pc(143) Exception local143) {
			Static42.method908(null, local143);
			this.method228("crash");
		}
		this.method218();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	protected final synchronized void method215() {
		@Pc(9) Container local9;
		if (Static61.aFrame1 == null) {
			local9 = Static26.aClass54_2.anApplet1;
		} else {
			local9 = Static61.aFrame1;
		}
		if (Static26.aCanvas1 != null) {
			Static26.aCanvas1.removeFocusListener(this);
			local9.remove(Static26.aCanvas1);
		}
		Static26.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static26.aCanvas1);
		Static26.aCanvas1.setSize(Static65.anInt1962, Static76.anInt2082);
		Static26.aCanvas1.setVisible(true);
		if (Static61.aFrame1 == null) {
			Static26.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static61.aFrame1.getInsets();
			Static26.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static26.aCanvas1.addFocusListener(this);
		Static26.aCanvas1.requestFocus();
		Static54.aBoolean86 = true;
		Static9.aBoolean6 = false;
		Static51.aLong42 = Static82.method1454();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	protected abstract void method217();

	@OriginalMember(owner = "client!o", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	private synchronized void method218() {
		if (Static10.aBoolean8) {
			return;
		}
		Static10.aBoolean8 = true;
		try {
			Static26.aCanvas1.removeFocusListener(this);
		} catch (@Pc(19) Exception local19) {
		}
		try {
			this.method217();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static61.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static26.aClass54_2 != null) {
			try {
				Static26.aClass54_2.method1491();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method220();
	}

	@OriginalMember(owner = "client!o", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static61.aFrame1 == null) {
			return Static26.aClass54_2 == null || Static26.aClass54_2.anApplet1 == this ? super.getParameter(arg0) : Static26.aClass54_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	private void method219() {
		@Pc(7) long local7 = Static13.aLongArray5[Static62.anInt1903];
		@Pc(10) long local10 = Static82.method1454();
		Static13.aLongArray5[Static62.anInt1903] = local10;
		if (local7 != 0L && local7 < local10) {
			@Pc(27) int local27 = (int) (local10 - local7);
			Static2.anInt2291 = ((local27 >> 1) + 32000) / local27;
		}
		Static62.anInt1903 = Static62.anInt1903 + 1 & 0x1F;
		if (Static47.anInt1601++ > 50) {
			Static54.aBoolean86 = true;
			Static47.anInt1601 -= 50;
			Static26.aCanvas1.setSize(Static65.anInt1962, Static76.anInt2082);
			Static26.aCanvas1.setVisible(true);
			if (Static61.aFrame1 == null) {
				Static26.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(78) Insets local78 = Static61.aFrame1.getInsets();
				Static26.aCanvas1.setLocation(local78.left, local78.top);
			}
		}
		this.method212();
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(B)V")
	protected abstract void method220();

	@OriginalMember(owner = "client!o", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static61.aFrame1 == null) {
			return Static26.aClass54_2 == null || Static26.aClass54_2.anApplet1 == this ? super.getDocumentBase() : Static26.aClass54_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static88.aBoolean65 = false;
	}

	@OriginalMember(owner = "client!o", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static61.aFrame1 == null) {
			return Static26.aClass54_2 == null || Static26.aClass54_2.anApplet1 == this ? super.getAppletContext() : Static26.aClass54_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static61.aFrame1 == null) {
			return Static26.aClass54_2 == null || Static26.aClass54_2.anApplet1 == this ? super.getCodeBase() : Static26.aClass54_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static25.anApplet_Sub1_1 == this && !Static10.aBoolean8) {
			Static108.aLong83 = Static82.method1454();
			Static39.method862(5000L);
			Static82.aClass54_3 = null;
			this.method218();
		}
	}

	@OriginalMember(owner = "client!o", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static25.anApplet_Sub1_1 == this && !Static10.aBoolean8) {
			Static108.aLong83 = 0L;
		}
	}

	@OriginalMember(owner = "client!o", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static25.anApplet_Sub1_1 == this && !Static10.aBoolean8) {
			Static108.aLong83 = Static82.method1454() + 4000L;
		}
	}

	@OriginalMember(owner = "client!o", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)V")
	protected abstract void method224();

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
	protected abstract void method225();

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(B)V")
	private void method226() {
		@Pc(10) long local10 = Static82.method1454();
		@Pc(14) long local14 = Static89.aLongArray29[Static49.anInt1440];
		Static89.aLongArray29[Static49.anInt1440] = local10;
		@Pc(33) boolean local33;
		if (local14 == 0L || local10 <= local14) {
			local33 = false;
		} else {
			local33 = true;
		}
		Static49.anInt1440 = Static49.anInt1440 + 1 & 0x1F;
		synchronized (this) {
			Static72.aBoolean101 = Static88.aBoolean65;
		}
		this.method225();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method228(@OriginalArg(1) String arg0) {
		if (this.aBoolean26) {
			return;
		}
		this.aBoolean26 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!o", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!o", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
	protected final void method229(@OriginalArg(4) int arg0) {
		try {
			if (Static25.anApplet_Sub1_1 == null) {
				Static25.anApplet_Sub1_1 = this;
				Static76.anInt2082 = 503;
				Static96.anInt1791 = 441;
				Static65.anInt1962 = 765;
				if (Static26.aClass54_2 == null) {
					Static82.aClass54_3 = Static26.aClass54_2 = new Class54(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static26.aClass54_2.method1495(1, this);
			} else {
				this.method228("alreadyloaded");
			}
		} catch (@Pc(51) Exception local51) {
			Static42.method908(null, local51);
			this.method228("crash");
		}
	}
}
