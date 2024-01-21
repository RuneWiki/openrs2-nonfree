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

@OriginalClass("client!lf")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!lf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static23.aBoolean55 = false;
	}

	@OriginalMember(owner = "client!lf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static9.aFrame1 == null) {
			return Static130.aClass17_4 == null || Static130.aClass17_4.anApplet1 == this ? super.getParameter(arg0) : Static130.aClass17_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	protected abstract void method336();

	@OriginalMember(owner = "client!lf", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static51.anApplet_Sub1_1 == this && !Static51.aBoolean139) {
			Static45.aLong41 = 0L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z")
	protected final boolean method337() {
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
				this.method352("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static9.aFrame1 == null) {
			return Static130.aClass17_4 == null || Static130.aClass17_4.anApplet1 == this ? super.getCodeBase() : Static130.aClass17_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	protected abstract void method338();

	@OriginalMember(owner = "client!lf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method339(@OriginalArg(3) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static51.anApplet_Sub1_1 = this;
			Static29.anInt685 = 503;
			Static97.anInt2572 = 468;
			Static121.anInt2947 = 765;
			Static9.aFrame1 = new Frame();
			Static9.aFrame1.setTitle("Jagex");
			Static9.aFrame1.setResizable(false);
			Static9.aFrame1.addWindowListener(this);
			Static9.aFrame1.setVisible(true);
			Static9.aFrame1.toFront();
			@Pc(32) Insets local32 = Static9.aFrame1.getInsets();
			Static9.aFrame1.setSize(local32.right + local32.left + 765, local32.bottom + (503 - -local32.top));
			Static72.aClass17_3 = Static130.aClass17_4 = new Class17(true, null, arg1, arg0, 16);
			Static130.aClass17_4.method383(1, this);
		} catch (@Pc(70) Exception local70) {
			Static91.method1588(local70, null);
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	protected abstract void method341();

	@OriginalMember(owner = "client!lf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static9.aFrame1 == null) {
			return Static130.aClass17_4 == null || Static130.aClass17_4.anApplet1 == this ? super.getAppletContext() : Static130.aClass17_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static51.anApplet_Sub1_1 == this && !Static51.aBoolean139) {
			Static45.aLong41 = Static44.method861() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
	private synchronized void method342() {
		if (Static51.aBoolean139) {
			return;
		}
		Static51.aBoolean139 = true;
		try {
			Static89.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method344();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static9.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static130.aClass17_4 != null) {
			try {
				Static130.aClass17_4.method384();
			} catch (@Pc(40) Exception local40) {
			}
		}
		this.method341();
	}

	@OriginalMember(owner = "client!lf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	private void method343() {
		@Pc(6) long local6 = Static44.method861();
		@Pc(10) long local10 = Static104.aLongArray6[Static123.anInt3083];
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static104.aLongArray6[Static123.anInt3083] = local6;
		Static123.anInt3083 = Static123.anInt3083 + 1 & 0x1F;
		synchronized (this) {
			Static105.aBoolean234 = Static23.aBoolean55;
		}
		this.method336();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	protected abstract void method344();

	@OriginalMember(owner = "client!lf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static23.aBoolean55 = true;
		Static1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!lf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static51.anApplet_Sub1_1 != this || Static51.aBoolean139) {
			return;
		}
		Static1.aBoolean1 = true;
		if (Static21.aString2 != null && Static21.aString2.startsWith("1.5") && Static44.method861() - Static52.aLong47 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static121.anInt2947 && Static29.anInt685 <= local28.height) {
				Static133.aBoolean285 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static21.aString3 != null) {
				@Pc(10) String local10 = Static21.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static21.aString2;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method352("wrongjava");
						return;
					}
					Static61.anInt1798 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static21.aString2 == null || Static21.aString2.equals("1.4.2"))) {
					this.method352("wrongjava");
					return;
				}
			}
			if (Static130.aClass17_4.anApplet1 != null) {
				@Pc(69) Method local69 = Static21.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static130.aClass17_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method347();
			Static43.aClass11_1 = Static110.method1775(Static29.anInt685, Static121.anInt2947, Static89.aCanvas1);
			this.method338();
			Static71.aClass7_1 = Static68.method340();
			while (Static45.aLong41 == 0L || Static44.method861() < Static45.aLong41) {
				Static87.anInt2315 = Static71.aClass7_1.method1574(Static79.anInt2178, Static61.anInt1798);
				for (@Pc(110) int local110 = 0; local110 < Static87.anInt2315; local110++) {
					this.method343();
				}
				this.method348();
				Static48.method904(Static89.aCanvas1, Static130.aClass17_4);
			}
		} catch (@Pc(141) Exception local141) {
			Static91.method1588(local141, null);
			this.method352("crash");
		}
		this.method342();
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	protected final synchronized void method347() {
		@Pc(10) Container local10;
		if (Static9.aFrame1 == null) {
			local10 = Static130.aClass17_4.anApplet1;
		} else {
			local10 = Static9.aFrame1;
		}
		if (Static89.aCanvas1 != null) {
			Static89.aCanvas1.removeFocusListener(this);
			local10.remove(Static89.aCanvas1);
		}
		Static89.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static89.aCanvas1);
		Static89.aCanvas1.setSize(Static121.anInt2947, Static29.anInt685);
		Static89.aCanvas1.setVisible(true);
		if (Static9.aFrame1 == null) {
			Static89.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(48) Insets local48 = Static9.aFrame1.getInsets();
			Static89.aCanvas1.setLocation(local48.left, local48.top);
		}
		Static89.aCanvas1.addFocusListener(this);
		Static89.aCanvas1.requestFocus();
		Static1.aBoolean1 = true;
		Static133.aBoolean285 = false;
		Static52.aLong47 = Static44.method861();
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	private void method348() {
		@Pc(6) long local6 = Static44.method861();
		@Pc(14) long local14 = Static38.aLongArray2[Static92.anInt2523];
		Static38.aLongArray2[Static92.anInt2523] = local6;
		Static92.anInt2523 = Static92.anInt2523 + 1 & 0x1F;
		if (local14 != 0L && local14 < local6) {
			@Pc(39) int local39 = (int) (local6 - local14);
			Static80.anInt2200 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static94.anInt2533++ > 50) {
			Static1.aBoolean1 = true;
			Static94.anInt2533 -= 50;
			Static89.aCanvas1.setSize(Static121.anInt2947, Static29.anInt685);
			Static89.aCanvas1.setVisible(true);
			if (Static9.aFrame1 == null) {
				Static89.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static9.aFrame1.getInsets();
				Static89.aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.method351();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	protected final void method349(@OriginalArg(1) int arg0) {
		try {
			if (Static51.anApplet_Sub1_1 == null) {
				Static51.anApplet_Sub1_1 = this;
				Static121.anInt2947 = 765;
				Static29.anInt685 = 503;
				Static97.anInt2572 = 468;
				if (Static130.aClass17_4 == null) {
					Static72.aClass17_3 = Static130.aClass17_4 = new Class17(false, this, arg0, null, 0);
				}
				Static130.aClass17_4.method383(1, this);
			} else {
				Static133.anInt3151++;
				if (Static133.anInt3151 >= 3) {
					this.method352("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(60) Exception local60) {
			Static91.method1588(local60, null);
			this.method352("crash");
		}
	}

	@OriginalMember(owner = "client!lf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lf", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static9.aFrame1 == null) {
			return Static130.aClass17_4 == null || Static130.aClass17_4.anApplet1 == this ? super.getDocumentBase() : Static130.aClass17_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
	protected abstract void method351();

	@OriginalMember(owner = "client!lf", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static51.anApplet_Sub1_1 == this && !Static51.aBoolean139) {
			Static45.aLong41 = Static44.method861();
			Static46.method889(5000L);
			Static72.aClass17_3 = null;
			this.method342();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method352(@OriginalArg(1) String arg0) {
		if (this.aBoolean47) {
			return;
		}
		this.aBoolean47 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!lf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}
}
