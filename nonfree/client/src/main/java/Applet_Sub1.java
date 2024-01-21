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

@OriginalClass("client!rc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static20.aFrame1 == null) {
			return Static105.aClass81_4 == null || Static105.aClass81_4.anApplet1 == this ? super.getParameter(arg0) : Static105.aClass81_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static20.aFrame1 == null) {
			return Static105.aClass81_4 == null || Static105.aClass81_4.anApplet1 == this ? super.getDocumentBase() : Static105.aClass81_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	private void method334() {
		@Pc(12) long local12 = Static8.method75();
		@Pc(16) long local16 = Static21.aLongArray2[Static121.anInt2787];
		Static21.aLongArray2[Static121.anInt2787] = local12;
		@Pc(33) boolean local33;
		if (local16 == 0L || local12 <= local16) {
			local33 = false;
		} else {
			local33 = true;
		}
		Static121.anInt2787 = Static121.anInt2787 + 1 & 0x1F;
		synchronized (this) {
			Static97.aBoolean83 = Static70.aBoolean64;
		}
		this.method343();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	protected final synchronized void method335() {
		@Pc(12) Container local12;
		if (Static20.aFrame1 == null) {
			local12 = Static105.aClass81_4.anApplet1;
		} else {
			local12 = Static20.aFrame1;
		}
		if (Static110.aCanvas1 != null) {
			Static110.aCanvas1.removeFocusListener(this);
			local12.remove(Static110.aCanvas1);
		}
		Static110.aCanvas1 = new Canvas_Sub1(this);
		local12.add(Static110.aCanvas1);
		Static110.aCanvas1.setSize(Static60.anInt2958, Static112.anInt2680);
		Static110.aCanvas1.setVisible(true);
		if (Static20.aFrame1 == null) {
			Static110.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(50) Insets local50 = Static20.aFrame1.getInsets();
			Static110.aCanvas1.setLocation(local50.left, local50.top);
		}
		Static110.aCanvas1.addFocusListener(this);
		Static110.aCanvas1.requestFocus();
		Static19.aBoolean24 = true;
		Static84.aBoolean70 = false;
		Static51.aLong47 = Static8.method75();
	}

	@OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static103.anApplet_Sub1_1 != this || Static131.aBoolean127) {
			return;
		}
		Static19.aBoolean24 = true;
		if (Static126.aString3 != null && Static126.aString3.startsWith("1.5") && Static8.method75() - Static51.aLong47 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static60.anInt2958 <= local30.width && Static112.anInt2680 <= local30.height) {
				Static84.aBoolean70 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static103.anApplet_Sub1_1 == this && !Static131.aBoolean127) {
			Static122.aLong95 = Static8.method75();
			Static103.method1711(5000L);
			Static16.aClass81_1 = null;
			this.method348();
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	protected abstract void method336();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	protected final void method337(@OriginalArg(1) int arg0) {
		try {
			if (Static103.anApplet_Sub1_1 == null) {
				Static103.anApplet_Sub1_1 = this;
				Static11.anInt427 = 465;
				Static112.anInt2680 = 503;
				Static60.anInt2958 = 765;
				if (Static105.aClass81_4 == null) {
					Static16.aClass81_1 = Static105.aClass81_4 = new Class81(false, this, arg0, null, 0);
				}
				Static105.aClass81_4.method1937(1, this);
			} else {
				Static42.anInt1085++;
				if (Static42.anInt1085 >= 3) {
					this.method347("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(60) Exception local60) {
			Static117.method1885(null, local60);
			this.method347("crash");
		}
	}

	@OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)Z")
	protected final boolean method338() {
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
				this.method347("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static103.anApplet_Sub1_1 == this && !Static131.aBoolean127) {
			Static122.aLong95 = 0L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static70.aBoolean64 = false;
	}

	@OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static20.aFrame1 == null) {
			return Static105.aClass81_4 == null || Static105.aClass81_4.anApplet1 == this ? super.getCodeBase() : Static105.aClass81_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static103.anApplet_Sub1_1 == this && !Static131.aBoolean127) {
			Static122.aLong95 = Static8.method75() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	protected abstract void method339();

	@OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	private void method341() {
		@Pc(6) long local6 = Static8.method75();
		@Pc(10) long local10 = Static107.aLongArray6[Static40.anInt1059];
		Static107.aLongArray6[Static40.anInt1059] = local6;
		Static40.anInt1059 = Static40.anInt1059 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static107.anInt2530 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static48.anInt1170++ > 50) {
			Static48.anInt1170 -= 50;
			Static19.aBoolean24 = true;
			Static110.aCanvas1.setSize(Static60.anInt2958, Static112.anInt2680);
			Static110.aCanvas1.setVisible(true);
			if (Static20.aFrame1 == null) {
				Static110.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static20.aFrame1.getInsets();
				Static110.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method339();
	}

	@OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBILjava/lang/String;)V")
	protected final void method342(@OriginalArg(2) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static112.anInt2680 = 503;
			Static11.anInt427 = 465;
			Static60.anInt2958 = 765;
			Static103.anApplet_Sub1_1 = this;
			Static20.aFrame1 = new Frame();
			Static20.aFrame1.setTitle("Jagex");
			Static20.aFrame1.setResizable(false);
			Static20.aFrame1.addWindowListener(this);
			Static20.aFrame1.setVisible(true);
			Static20.aFrame1.toFront();
			@Pc(37) Insets local37 = Static20.aFrame1.getInsets();
			Static20.aFrame1.setSize(local37.right + local37.left + 765, local37.bottom + local37.top + 503);
			Static16.aClass81_1 = Static105.aClass81_4 = new Class81(true, null, arg0, arg1, 16);
			Static105.aClass81_4.method1937(1, this);
		} catch (@Pc(72) Exception local72) {
			Static117.method1885(null, local72);
		}
	}

	@OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static70.aBoolean64 = true;
		Static19.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	protected abstract void method343();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	protected abstract void method344();

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static126.aString5 != null) {
				@Pc(10) String local10 = Static126.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static126.aString3;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method347("wrongjava");
						return;
					}
					Static40.anInt1063 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static126.aString3 == null || Static126.aString3.equals("1.4.2"))) {
					this.method347("wrongjava");
					return;
				}
			}
			if (Static105.aClass81_4.anApplet1 != null) {
				@Pc(67) Method local67 = Static126.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static105.aClass81_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method335();
			Static86.aClass14_1 = Static46.method645(Static112.anInt2680, Static110.aCanvas1, Static60.anInt2958);
			this.method344();
			Static80.aClass3_1 = Static12.method1781();
			while (Static122.aLong95 == 0L || Static8.method75() < Static122.aLong95) {
				Static50.anInt1428 = Static80.aClass3_1.method635(Static55.anInt1496, Static40.anInt1063);
				for (@Pc(108) int local108 = 0; local108 < Static50.anInt1428; local108++) {
					this.method334();
				}
				this.method341();
				Static55.method883(Static110.aCanvas1, Static105.aClass81_4);
			}
		} catch (@Pc(141) Exception local141) {
			Static117.method1885(null, local141);
			this.method347("crash");
		}
		this.method348();
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	protected abstract void method345();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method347(@OriginalArg(1) String arg0) {
		if (this.aBoolean21) {
			return;
		}
		this.aBoolean21 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static20.aFrame1 == null) {
			return Static105.aClass81_4 == null || Static105.aClass81_4.anApplet1 == this ? super.getAppletContext() : Static105.aClass81_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
	private synchronized void method348() {
		if (Static131.aBoolean127) {
			return;
		}
		Static131.aBoolean127 = true;
		try {
			Static110.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method336();
		} catch (@Pc(20) Exception local20) {
		}
		if (Static20.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		if (Static105.aClass81_4 != null) {
			try {
				Static105.aClass81_4.method1941();
			} catch (@Pc(34) Exception local34) {
			}
		}
		this.method345();
	}
}
