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

@OriginalClass("client!je")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
	public static int[] anIntArray59 = new int[32];

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Z")
	private boolean aBoolean26 = false;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray59[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	protected final synchronized void method570() {
		@Pc(6) Container local6;
		if (Static11.aFrame3 == null) {
			local6 = Static57.aClass63_4.anApplet1;
		} else {
			local6 = Static11.aFrame3;
		}
		if (Static25.aCanvas1 != null) {
			Static25.aCanvas1.removeFocusListener(this);
			local6.remove(Static25.aCanvas1);
		}
		Static25.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static25.aCanvas1);
		Static25.aCanvas1.setSize(Static44.anInt1028, Static65.anInt1588);
		Static25.aCanvas1.setVisible(true);
		if (Static11.aFrame3 == null) {
			Static25.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static11.aFrame3.getInsets();
			Static25.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static25.aCanvas1.addFocusListener(this);
		Static25.aCanvas1.requestFocus();
		Static20.aBoolean18 = true;
		Static117.aBoolean116 = false;
		Static4.aLong5 = Static29.method615();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBI)V")
	protected final void method571(@OriginalArg(2) int arg0) {
		try {
			if (Static87.anApplet_Sub1_1 == null) {
				Static44.anInt1028 = 765;
				Static65.anInt1588 = 503;
				Static46.anInt1139 = 473;
				Static87.anApplet_Sub1_1 = this;
				if (Static57.aClass63_4 == null) {
					Static11.aClass63_6 = Static57.aClass63_4 = new Class63(false, this, arg0, null, 0);
				}
				Static57.aClass63_4.method1956(this, 1);
			} else {
				Static65.anInt1583++;
				if (Static65.anInt1583 >= 3) {
					this.method573("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(60) Exception local60) {
			Static165.method2525(null, local60);
			this.method573("crash");
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	private void method572() {
		@Pc(6) long local6 = Static29.method615();
		@Pc(10) long local10 = Static33.aLongArray3[Static22.anInt549];
		Static33.aLongArray3[Static22.anInt549] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static92.anInt2189 = ((local34 >> 1) + 32000) / local34;
		}
		Static22.anInt549 = Static22.anInt549 + 1 & 0x1F;
		if (Static90.anInt2133++ > 50) {
			Static20.aBoolean18 = true;
			Static90.anInt2133 -= 50;
			Static25.aCanvas1.setSize(Static44.anInt1028, Static65.anInt1588);
			Static25.aCanvas1.setVisible(true);
			if (Static11.aFrame3 == null) {
				Static25.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static11.aFrame3.getInsets();
				Static25.aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.method576();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method573(@OriginalArg(0) String arg0) {
		if (this.aBoolean26) {
			return;
		}
		this.aBoolean26 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!je", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static44.aBoolean44 = false;
	}

	@OriginalMember(owner = "client!je", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static11.aFrame3 == null) {
			return Static57.aClass63_4 == null || Static57.aClass63_4.anApplet1 == this ? super.getDocumentBase() : Static57.aClass63_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!je", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static44.aBoolean44 = true;
		Static20.aBoolean18 = true;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	protected abstract void method576();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	protected abstract void method578();

	@OriginalMember(owner = "client!je", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static87.anApplet_Sub1_1 == this && !Static66.aBoolean70) {
			Static46.aLong37 = Static29.method615();
			Static50.method927(5000L);
			Static11.aClass63_6 = null;
			this.method582();
		}
	}

	@OriginalMember(owner = "client!je", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static87.anApplet_Sub1_1 == this && !Static66.aBoolean70) {
			Static46.aLong37 = Static29.method615() + 4000L;
		}
	}

	@OriginalMember(owner = "client!je", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static87.anApplet_Sub1_1 != this || Static66.aBoolean70) {
			return;
		}
		Static20.aBoolean18 = true;
		if (Static122.aString4 != null && Static122.aString4.startsWith("1.5") && Static29.method615() - Static4.aLong5 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static44.anInt1028 <= local30.width && Static65.anInt1588 <= local30.height) {
				Static117.aBoolean116 = true;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	protected abstract void method579();

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	private void method580() {
		@Pc(7) long local7 = Static81.aLongArray4[Static15.anInt412];
		@Pc(14) long local14 = Static29.method615();
		@Pc(23) boolean local23;
		if (local7 == 0L || local7 >= local14) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static81.aLongArray4[Static15.anInt412] = local14;
		Static15.anInt412 = Static15.anInt412 + 1 & 0x1F;
		synchronized (this) {
			Static62.aBoolean66 = Static44.aBoolean44;
		}
		this.method586();
	}

	@OriginalMember(owner = "client!je", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!je", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static87.anApplet_Sub1_1 == this && !Static66.aBoolean70) {
			Static46.aLong37 = 0L;
		}
	}

	@OriginalMember(owner = "client!je", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static122.aString2 != null) {
				@Pc(10) String local10 = Static122.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static122.aString4;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method573("wrongjava");
						return;
					}
					Static138.anInt3055 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static122.aString4 == null || Static122.aString4.equals("1.4.2"))) {
					this.method573("wrongjava");
					return;
				}
			}
			if (Static57.aClass63_4.anApplet1 != null) {
				@Pc(70) Method local70 = Static122.aMethod2;
				if (local70 != null) {
					try {
						local70.invoke(Static57.aClass63_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method570();
			Static133.aClass40_1 = Static168.method2588(Static25.aCanvas1, Static44.anInt1028, Static65.anInt1588);
			this.method584();
			Static115.aClass38_1 = Static97.method1608();
			while (Static46.aLong37 == 0L || Static46.aLong37 > Static29.method615()) {
				Static45.anInt1120 = Static115.aClass38_1.method1879(Static171.anInt3705, Static138.anInt3055);
				for (@Pc(111) int local111 = 0; local111 < Static45.anInt1120; local111++) {
					this.method580();
				}
				this.method572();
				Static60.method1093(Static25.aCanvas1, Static57.aClass63_4);
			}
		} catch (@Pc(142) Exception local142) {
			Static165.method2525(null, local142);
			this.method573("crash");
		}
		this.method582();
	}

	@OriginalMember(owner = "client!je", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Z")
	protected final boolean method581() {
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
				this.method573("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	private synchronized void method582() {
		if (Static66.aBoolean70) {
			return;
		}
		Static66.aBoolean70 = true;
		try {
			Static25.aCanvas1.removeFocusListener(this);
		} catch (@Pc(21) Exception local21) {
		}
		try {
			this.method578();
		} catch (@Pc(26) Exception local26) {
		}
		if (Static11.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		if (Static57.aClass63_4 != null) {
			try {
				Static57.aClass63_4.method1954();
			} catch (@Pc(40) Exception local40) {
			}
		}
		this.method579();
	}

	@OriginalMember(owner = "client!je", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
	protected final void method583(@OriginalArg(1) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static46.anInt1139 = 473;
			Static87.anApplet_Sub1_1 = this;
			Static65.anInt1588 = 503;
			Static44.anInt1028 = 765;
			Static11.aFrame3 = new Frame();
			Static11.aFrame3.setTitle("Jagex");
			Static11.aFrame3.setResizable(false);
			Static11.aFrame3.addWindowListener(this);
			Static11.aFrame3.setVisible(true);
			Static11.aFrame3.toFront();
			@Pc(28) Insets local28 = Static11.aFrame3.getInsets();
			Static11.aFrame3.setSize(local28.left + local28.right + 765, local28.top + (503 - -local28.bottom));
			Static11.aClass63_6 = Static57.aClass63_4 = new Class63(true, null, arg1, arg0, 16);
			Static57.aClass63_4.method1956(this, 1);
		} catch (@Pc(65) Exception local65) {
			Static165.method2525(null, local65);
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V")
	protected abstract void method584();

	@OriginalMember(owner = "client!je", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!je", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static11.aFrame3 == null) {
			return Static57.aClass63_4 == null || Static57.aClass63_4.anApplet1 == this ? super.getCodeBase() : Static57.aClass63_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!je", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static11.aFrame3 == null) {
			return Static57.aClass63_4 == null || Static57.aClass63_4.anApplet1 == this ? super.getParameter(arg0) : Static57.aClass63_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!je", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static11.aFrame3 == null) {
			return Static57.aClass63_4 == null || Static57.aClass63_4.anApplet1 == this ? super.getAppletContext() : Static57.aClass63_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)V")
	protected abstract void method586();
}
