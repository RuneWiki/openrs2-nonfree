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

@OriginalClass("client!r")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!r", name = "N", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	protected final synchronized void method328() {
		@Pc(13) Container local13;
		if (Static26.aFrame1 == null) {
			local13 = Static28.aClass28_6.anApplet1;
		} else {
			local13 = Static26.aFrame1;
		}
		if (Static93.aCanvas1 != null) {
			Static93.aCanvas1.removeFocusListener(this);
			local13.remove(Static93.aCanvas1);
		}
		Static93.aCanvas1 = new Canvas_Sub1(this);
		local13.add(Static93.aCanvas1);
		Static93.aCanvas1.setSize(Static80.anInt1895, Static57.anInt1299);
		Static93.aCanvas1.setVisible(true);
		if (Static26.aFrame1 == null) {
			Static93.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static26.aFrame1.getInsets();
			Static93.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static93.aCanvas1.addFocusListener(this);
		Static93.aCanvas1.requestFocus();
		Static27.aBoolean59 = true;
		Static40.aBoolean60 = false;
		Static20.aLong20 = Static80.method1369();
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
	protected abstract void method330();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBILjava/lang/String;ILjava/net/InetAddress;)V")
	protected final void method331(@OriginalArg(5) String arg0, @OriginalArg(6) int arg1, @OriginalArg(7) InetAddress arg2) {
		try {
			Static94.anInt2135 = 449;
			Static80.anInt1895 = 765;
			Static28.anApplet_Sub1_3 = this;
			Static57.anInt1299 = 503;
			Static26.aFrame1 = new Frame();
			Static26.aFrame1.setTitle("Jagex");
			Static26.aFrame1.setResizable(false);
			Static26.aFrame1.addWindowListener(this);
			Static26.aFrame1.setVisible(true);
			Static26.aFrame1.toFront();
			@Pc(36) Insets local36 = Static26.aFrame1.getInsets();
			Static26.aFrame1.setSize(local36.left + local36.right + 765, local36.top - -local36.bottom + 503);
			Static60.aClass28_5 = Static28.aClass28_6 = new Class28(true, null, arg2, arg1, arg0, 14);
			Static28.aClass28_6.method579(1, this);
		} catch (@Pc(75) Exception local75) {
			Static99.method1601(local75, null);
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
	private void method332() {
		@Pc(10) long local10 = Static80.method1369();
		@Pc(14) long local14 = Static19.aLongArray2[Static82.anInt1905];
		Static19.aLongArray2[Static82.anInt1905] = local10;
		@Pc(31) boolean local31;
		if (local14 == 0L || local10 <= local14) {
			local31 = false;
		} else {
			local31 = true;
		}
		Static82.anInt1905 = Static82.anInt1905 + 1 & 0x1F;
		synchronized (this) {
			Static99.aBoolean134 = Static70.aBoolean85;
		}
		this.method330();
	}

	@OriginalMember(owner = "client!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	private synchronized void method333() {
		if (Static94.aBoolean130) {
			return;
		}
		Static94.aBoolean130 = true;
		try {
			Static93.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method334();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static26.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static28.aClass28_6 != null) {
			try {
				Static28.aClass28_6.method569();
			} catch (@Pc(34) Exception local34) {
			}
		}
		this.method336();
	}

	@OriginalMember(owner = "client!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	protected abstract void method334();

	@OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static70.aBoolean85 = true;
		Static27.aBoolean59 = true;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Z")
	protected final boolean method335() {
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
				this.method342("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static28.anApplet_Sub1_3 != this || Static94.aBoolean130) {
			return;
		}
		Static27.aBoolean59 = true;
		if (Static35.aString2 != null && Static35.aString2.startsWith("1.5") && Static80.method1369() - Static20.aLong20 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static80.anInt1895 <= local30.width && Static57.anInt1299 <= local30.height) {
				Static40.aBoolean60 = true;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	protected abstract void method336();

	@OriginalMember(owner = "client!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static26.aFrame1 == null) {
			return Static28.aClass28_6 == null || Static28.aClass28_6.anApplet1 == this ? super.getDocumentBase() : Static28.aClass28_6.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(B)V")
	protected abstract void method337();

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(B)V")
	private void method338() {
		@Pc(6) long local6 = Static80.method1369();
		@Pc(10) long local10 = Static26.aLongArray3[Static37.anInt878];
		Static26.aLongArray3[Static37.anInt878] = local6;
		Static37.anInt878 = Static37.anInt878 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(42) int local42 = (int) (local6 - local10);
			Static119.anInt2847 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static12.anInt1940++ > 50) {
			Static27.aBoolean59 = true;
			Static12.anInt1940 -= 50;
			Static93.aCanvas1.setSize(Static80.anInt1895, Static57.anInt1299);
			Static93.aCanvas1.setVisible(true);
			if (Static26.aFrame1 == null) {
				Static93.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(75) Insets local75 = Static26.aFrame1.getInsets();
				Static93.aCanvas1.setLocation(local75.left, local75.top);
			}
		}
		this.method345();
	}

	@OriginalMember(owner = "client!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static35.aString1 != null) {
				@Pc(10) String local10 = Static35.aString1.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static35.aString2;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method342("wrongjava");
						return;
					}
					Static23.anInt698 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static35.aString2 == null || Static35.aString2.equals("1.4.2"))) {
					this.method342("wrongjava");
					return;
				}
			}
			if (Static28.aClass28_6.anApplet1 != null) {
				@Pc(68) Method local68 = Static35.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static28.aClass28_6.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method328();
			Static119.aClass37_39 = Static55.method2074(Static80.anInt1895, Static57.anInt1299, Static93.aCanvas1);
			this.method337();
			Static9.aClass2_1 = Static116.method2042();
			Static9.aClass2_1.method678();
			while (Static16.aLong19 == 0L || Static16.aLong19 > Static80.method1369()) {
				Static66.anInt1525 = Static9.aClass2_1.method673(Static23.anInt698, Static20.anInt636);
				for (@Pc(112) int local112 = 0; local112 < Static66.anInt1525; local112++) {
					this.method332();
				}
				this.method338();
			}
		} catch (@Pc(139) Exception local139) {
			Static99.method1601(local139, null);
			this.method342("crash");
		}
		this.method333();
	}

	@OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static70.aBoolean85 = false;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	protected final void method341(@OriginalArg(1) int arg0) {
		try {
			if (Static28.anApplet_Sub1_3 == null) {
				Static94.anInt2135 = 449;
				Static57.anInt1299 = 503;
				Static28.anApplet_Sub1_3 = this;
				Static80.anInt1895 = 765;
				if (Static28.aClass28_6 == null) {
					Static60.aClass28_5 = Static28.aClass28_6 = new Class28(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static28.aClass28_6.method579(1, this);
			} else {
				Static92.anInt2045++;
				if (Static92.anInt2045 >= 3) {
					this.method342("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static99.method1601(local61, null);
			this.method342("crash");
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method342(@OriginalArg(1) String arg0) {
		if (this.aBoolean37) {
			return;
		}
		this.aBoolean37 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static26.aFrame1 == null) {
			return Static28.aClass28_6 == null || Static28.aClass28_6.anApplet1 == this ? super.getCodeBase() : Static28.aClass28_6.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static26.aFrame1 == null) {
			return Static28.aClass28_6 == null || Static28.aClass28_6.anApplet1 == this ? super.getParameter(arg0) : Static28.aClass28_6.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static28.anApplet_Sub1_3 == this && !Static94.aBoolean130) {
			Static16.aLong19 = 0L;
		}
	}

	@OriginalMember(owner = "client!r", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static28.anApplet_Sub1_3 == this && !Static94.aBoolean130) {
			Static16.aLong19 = Static80.method1369() + 4000L;
		}
	}

	@OriginalMember(owner = "client!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static28.anApplet_Sub1_3 == this && !Static94.aBoolean130) {
			Static16.aLong19 = Static80.method1369();
			Static117.method2058(5000L);
			Static60.aClass28_5 = null;
			this.method333();
		}
	}

	@OriginalMember(owner = "client!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static26.aFrame1 == null) {
			return Static28.aClass28_6 == null || Static28.aClass28_6.anApplet1 == this ? super.getAppletContext() : Static28.aClass28_6.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	protected abstract void method345();

	@OriginalMember(owner = "client!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
