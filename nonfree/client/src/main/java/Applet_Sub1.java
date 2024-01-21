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

@OriginalClass("client!jc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	protected abstract void method381();

	@OriginalMember(owner = "client!jc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static47.aFrame1 == null) {
			return Static35.aClass15_59 == null || Static35.aClass15_59.anApplet1 == this ? super.getCodeBase() : Static35.aClass15_59.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static22.aString3 != null) {
				@Pc(10) String local10 = Static22.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static22.aString2;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method390("wrongjava");
						return;
					}
					Static64.anInt1438 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static22.aString2 == null || Static22.aString2.equals("1.4.2"))) {
					this.method390("wrongjava");
					return;
				}
			}
			if (Static35.aClass15_59.anApplet1 != null) {
				@Pc(71) Method local71 = Static22.aMethod1;
				if (local71 != null) {
					try {
						local71.invoke(Static35.aClass15_59.anApplet1, Boolean.TRUE);
					} catch (@Pc(86) Throwable local86) {
					}
				}
			}
			this.method397();
			Static123.aClass9_56 = Static80.method1253(Static52.anInt1262, Static124.anInt2736, Static51.aCanvas2);
			this.method393();
			Static65.aClass7_1 = Static91.method1341();
			Static65.aClass7_1.method925();
			while (Static127.aLong95 == 0L || Static10.method244() < Static127.aLong95) {
				Static99.anInt2122 = Static65.aClass7_1.method922(Static64.anInt1438, Static102.anInt2293);
				for (@Pc(115) int local115 = 0; local115 < Static99.anInt2122; local115++) {
					this.method399();
				}
				this.method395();
				Static84.method1289(true);
			}
		} catch (@Pc(143) Exception local143) {
			Static29.method518(null, local143);
			this.method390("crash");
		}
		this.method385();
	}

	@OriginalMember(owner = "client!jc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!jc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static99.aBoolean88 = false;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	protected abstract void method383();

	@OriginalMember(owner = "client!jc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static62.anApplet_Sub1_1 == this && !Static85.aBoolean74) {
			Static127.aLong95 = 0L;
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	private synchronized void method385() {
		if (Static85.aBoolean74) {
			return;
		}
		Static85.aBoolean74 = true;
		try {
			Static51.aCanvas2.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method387();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static47.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static35.aClass15_59 != null) {
			try {
				Static35.aClass15_59.method460();
			} catch (@Pc(39) Exception local39) {
			}
		}
		this.method383();
	}

	@OriginalMember(owner = "client!jc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static62.anApplet_Sub1_1 == this && !Static85.aBoolean74) {
			Static127.aLong95 = Static10.method244() + 4000L;
		}
	}

	@OriginalMember(owner = "client!jc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static47.aFrame1 == null) {
			return Static35.aClass15_59 == null || Static35.aClass15_59.anApplet1 == this ? super.getParameter(arg0) : Static35.aClass15_59.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	protected abstract void method387();

	@OriginalMember(owner = "client!jc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Z")
	protected final boolean method388() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method390("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static47.aFrame1 == null) {
			return Static35.aClass15_59 == null || Static35.aClass15_59.anApplet1 == this ? super.getAppletContext() : Static35.aClass15_59.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static62.anApplet_Sub1_1 != this || Static85.aBoolean74) {
			return;
		}
		Static46.aBoolean43 = true;
		if (Static22.aString2 != null && Static22.aString2.startsWith("1.5") && Static10.method244() - Static23.aLong25 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || Static124.anInt2736 <= local29.width && Static52.anInt1262 <= local29.height) {
				Static124.aBoolean118 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method390(@OriginalArg(0) String arg0) {
		if (this.aBoolean15) {
			return;
		}
		this.aBoolean15 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIII)V")
	protected final void method391(@OriginalArg(0) int arg0) {
		try {
			if (Static62.anApplet_Sub1_1 == null) {
				Static83.anInt1809 = 456;
				Static124.anInt2736 = 765;
				Static52.anInt1262 = 503;
				Static62.anApplet_Sub1_1 = this;
				if (Static35.aClass15_59 == null) {
					Static95.aClass15_46 = Static35.aClass15_59 = new Class15(false, this, arg0, null, 0);
				}
				Static35.aClass15_59.method463(1, this);
			} else {
				Static89.anInt1883++;
				if (Static89.anInt1883 >= 3) {
					this.method390("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static29.method518(null, local59);
			this.method390("crash");
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
	protected final void method392(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static52.anInt1262 = 503;
			Static62.anApplet_Sub1_1 = this;
			Static83.anInt1809 = 456;
			Static124.anInt2736 = 765;
			Static47.aFrame1 = new Frame();
			Static47.aFrame1.setTitle("Jagex");
			Static47.aFrame1.setResizable(false);
			Static47.aFrame1.addWindowListener(this);
			Static47.aFrame1.setVisible(true);
			Static47.aFrame1.toFront();
			@Pc(32) Insets local32 = Static47.aFrame1.getInsets();
			Static47.aFrame1.setSize(local32.left + local32.right + 765, local32.bottom + 503 + local32.top);
			Static95.aClass15_46 = Static35.aClass15_59 = new Class15(true, null, arg0, arg1, 16);
			Static35.aClass15_59.method463(1, this);
		} catch (@Pc(67) Exception local67) {
			Static29.method518(null, local67);
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!jc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static99.aBoolean88 = true;
		Static46.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	protected abstract void method393();

	@OriginalMember(owner = "client!jc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static62.anApplet_Sub1_1 == this && !Static85.aBoolean74) {
			Static127.aLong95 = Static10.method244();
			Static80.method1260(5000L);
			Static95.aClass15_46 = null;
			this.method385();
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	private void method395() {
		@Pc(6) long local6 = Static10.method244();
		@Pc(10) long local10 = Static123.aLongArray15[Static15.anInt426];
		Static123.aLongArray15[Static15.anInt426] = local6;
		Static15.anInt426 = Static15.anInt426 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(50) int local50 = (int) (local6 - local10);
			Static99.anInt2121 = ((local50 >> 1) + 32000) / local50;
		}
		if (Static90.anInt1901++ > 50) {
			Static46.aBoolean43 = true;
			Static90.anInt1901 -= 50;
			Static51.aCanvas2.setSize(Static124.anInt2736, Static52.anInt1262);
			Static51.aCanvas2.setVisible(true);
			if (Static47.aFrame1 == null) {
				Static51.aCanvas2.setLocation(0, 0);
			} else {
				@Pc(86) Insets local86 = Static47.aFrame1.getInsets();
				Static51.aCanvas2.setLocation(local86.left, local86.top);
			}
		}
		this.method381();
	}

	@OriginalMember(owner = "client!jc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static47.aFrame1 == null) {
			return Static35.aClass15_59 == null || Static35.aClass15_59.anApplet1 == this ? super.getDocumentBase() : Static35.aClass15_59.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	protected final synchronized void method397() {
		@Pc(14) Container local14;
		if (Static47.aFrame1 == null) {
			local14 = Static35.aClass15_59.anApplet1;
		} else {
			local14 = Static47.aFrame1;
		}
		if (Static51.aCanvas2 != null) {
			Static51.aCanvas2.removeFocusListener(this);
			local14.remove(Static51.aCanvas2);
		}
		Static51.aCanvas2 = new Canvas_Sub1(this);
		local14.add(Static51.aCanvas2);
		Static51.aCanvas2.setSize(Static124.anInt2736, Static52.anInt1262);
		Static51.aCanvas2.setVisible(true);
		if (Static47.aFrame1 == null) {
			Static51.aCanvas2.setLocation(0, 0);
		} else {
			@Pc(48) Insets local48 = Static47.aFrame1.getInsets();
			Static51.aCanvas2.setLocation(local48.left, local48.top);
		}
		Static51.aCanvas2.addFocusListener(this);
		Static51.aCanvas2.requestFocus();
		Static46.aBoolean43 = true;
		Static124.aBoolean118 = false;
		Static23.aLong25 = Static10.method244();
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
	protected abstract void method398();

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	private void method399() {
		@Pc(6) long local6 = Static10.method244();
		@Pc(10) long local10 = Static17.aLongArray7[Static111.anInt2413];
		@Pc(21) boolean local21;
		if (local10 == 0L || local6 <= local10) {
			local21 = false;
		} else {
			local21 = true;
		}
		Static17.aLongArray7[Static111.anInt2413] = local6;
		Static111.anInt2413 = Static111.anInt2413 + 1 & 0x1F;
		synchronized (this) {
			Static80.aBoolean72 = Static99.aBoolean88;
		}
		this.method398();
	}
}
