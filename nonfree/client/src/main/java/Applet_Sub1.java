import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
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

@OriginalClass("client!ue")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ue", name = "providesignlink", descriptor = "(Lclient!pm;)V")
	public static void providesignlink(@OriginalArg(0) Class139 arg0) {
		Static276.aClass139_4 = arg0;
		Static179.aClass139_3 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	protected abstract void method663();

	@OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static172.aFrame2 == null) {
			return Static276.aClass139_4 == null || Static276.aClass139_4.anApplet1 == this ? super.getAppletContext() : Static276.aClass139_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	private void method666() {
		@Pc(6) long local6 = Static101.method1677();
		@Pc(10) long local10 = Static239.aLongArray40[Static194.anInt5198];
		Static239.aLongArray40[Static194.anInt5198] = local6;
		if ((long) 0 != local10 && local10 < local6) {
		}
		Static194.anInt5198 = Static194.anInt5198 + 1 & 0x1F;
		synchronized (this) {
			Static115.aBoolean158 = Static306.aBoolean401;
		}
		this.method663();
	}

	@OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static172.aFrame2 == null) {
			return Static276.aClass139_4 == null || Static276.aClass139_4.anApplet1 == this ? super.getDocumentBase() : Static276.aClass139_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static306.aBoolean401 = true;
		Static239.aBoolean315 = true;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public final synchronized void method669() {
		if (Static188.aCanvas115 != null) {
			Static188.aCanvas115.removeFocusListener(this);
			Static188.aCanvas115.getParent().remove(Static188.aCanvas115);
		}
		@Pc(23) Container local23;
		if (Static122.aFrame1 != null) {
			local23 = Static122.aFrame1;
		} else if (Static172.aFrame2 == null) {
			local23 = Static276.aClass139_4.anApplet1;
		} else {
			local23 = Static172.aFrame2;
		}
		local23.setLayout(null);
		Static188.aCanvas115 = new Canvas_Sub2(this);
		local23.add(Static188.aCanvas115);
		Static188.aCanvas115.setSize(Static31.anInt526, Static40.anInt690);
		Static188.aCanvas115.setVisible(true);
		if (Static172.aFrame2 == local23) {
			@Pc(57) Insets local57 = Static172.aFrame2.getInsets();
			Static188.aCanvas115.setLocation(local57.left + Static255.anInt4860, Static300.anInt5626 + local57.top);
		} else {
			Static188.aCanvas115.setLocation(Static255.anInt4860, Static300.anInt5626);
		}
		Static188.aCanvas115.addFocusListener(this);
		Static188.aCanvas115.requestFocus();
		Static306.aBoolean401 = true;
		Static239.aBoolean315 = true;
		Static20.aBoolean18 = false;
		Static115.aBoolean158 = true;
		Static226.aLong26 = Static101.method1677();
	}

	@OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method670(@OriginalArg(1) String arg0) {
		if (this.aBoolean43) {
			return;
		}
		this.aBoolean43 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static319.method1852(Static276.aClass139_4.anApplet1, "loggedout");
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static47.anApplet_Sub1_1 != this || Static41.aBoolean45) {
			return;
		}
		Static239.aBoolean315 = true;
		if (Static68.aBoolean77 && !Static94.aBoolean138 && Static101.method1677() - Static226.aLong26 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static73.anInt1635 && Static228.anInt4381 <= local27.height) {
				Static20.aBoolean18 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
	protected final boolean method671() {
		@Pc(6) String local6 = this.getDocumentBase().getHost().toLowerCase();
		if (local6.equals("jagex.com") || local6.endsWith(".jagex.com")) {
			return true;
		} else if (local6.equals("runescape.com") || local6.endsWith(".runescape.com")) {
			return true;
		} else if (local6.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local6.length() > 0 && local6.charAt(local6.length() - 1) >= '0' && local6.charAt(local6.length() - 1) <= '9') {
				local6 = local6.substring(0, local6.length() - 1);
			}
			if (local6.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method670("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	protected abstract void method672();

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	protected abstract void method673();

	@OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static47.anApplet_Sub1_1 == this && !Static41.aBoolean45) {
			Static291.aLong191 = 0L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static172.aFrame2 == null) {
			return Static276.aClass139_4 == null || Static276.aClass139_4.anApplet1 == this ? super.getCodeBase() : Static276.aClass139_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	private void method674() {
		@Pc(14) long local14 = Static101.method1677();
		@Pc(18) long local18 = Static280.aLongArray8[Static145.anInt2832];
		Static280.aLongArray8[Static145.anInt2832] = local14;
		if (local18 != 0L && local14 > local18) {
			@Pc(42) int local42 = (int) (local14 - local18);
			Static113.anInt2295 = ((local42 >> 1) + 32000) / local42;
		}
		Static145.anInt2832 = Static145.anInt2832 + 1 & 0x1F;
		if (Static183.anInt3488++ > 50) {
			Static183.anInt3488 -= 50;
			Static239.aBoolean315 = true;
			Static188.aCanvas115.setSize(Static31.anInt526, Static40.anInt690);
			Static188.aCanvas115.setVisible(true);
			if (Static172.aFrame2 != null && Static122.aFrame1 == null) {
				@Pc(86) Insets local86 = Static172.aFrame2.getInsets();
				Static188.aCanvas115.setLocation(local86.left + Static255.anInt4860, Static300.anInt5626 + local86.top);
			} else {
				Static188.aCanvas115.setLocation(Static255.anInt4860, Static300.anInt5626);
			}
		}
		this.method678();
	}

	@OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static47.anApplet_Sub1_1 == this && !Static41.aBoolean45) {
			Static291.aLong191 = Static101.method1677() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
	private void method675(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static41.aBoolean45) {
				return;
			}
			Static41.aBoolean45 = true;
		}
		if (Static276.aClass139_4.anApplet1 != null) {
			Static276.aClass139_4.anApplet1.destroy();
		}
		try {
			this.method672();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean42) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean42 = false;
		}
		Static276.aClass139_4.method3498(Static47.anApplet_Sub1_1.getClass());
		if (Static188.aCanvas115 != null) {
			try {
				Static188.aCanvas115.removeFocusListener(this);
				Static188.aCanvas115.getParent().remove(Static188.aCanvas115);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static276.aClass139_4 != null) {
			try {
				Static276.aClass139_4.method3497();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method673();
		if (Static172.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(87) Throwable local87) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)V")
	protected final void method677(@OriginalArg(1) int arg0) {
		try {
			if (Static47.anApplet_Sub1_1 != null) {
				Static102.anInt2145++;
				if (Static102.anInt2145 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method670("alreadyloaded");
				return;
			}
			Static255.anInt4860 = 0;
			Static47.anApplet_Sub1_1 = this;
			Static300.anInt5626 = 0;
			Static31.anInt526 = 765;
			Static73.anInt1635 = 765;
			Static277.anInt5283 = 1550;
			Static40.anInt690 = 503;
			Static228.anInt4381 = 503;
			@Pc(50) String local50 = this.getParameter("openwinjs");
			if (local50 != null && local50.equals("1")) {
				Static151.aBoolean207 = true;
			} else {
				Static151.aBoolean207 = false;
			}
			if (Static276.aClass139_4 == null) {
				Static179.aClass139_3 = Static276.aClass139_4 = new Class139(this, arg0, null, 0);
			}
			@Pc(80) Class185 local80 = Static276.aClass139_4.method3494(1, this);
			while (local80.anInt5623 == 0) {
				Static303.method4677(10L);
			}
			Static308.aThread3 = (Thread) local80.anObject7;
		} catch (@Pc(97) Exception local97) {
			Static193.method3072(local97, null);
			this.method670("crash");
		}
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static215.aString256 != null) {
				@Pc(10) String local10 = Static215.aString256.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static215.aString253;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method670("wrongjava");
						return;
					}
					Static230.anInt4398 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static215.aString253 == null || Static215.aString253.equals("1.4.2"))) {
					this.method670("wrongjava");
					return;
				}
			}
			@Pc(75) int local75;
			if (Static215.aString253 != null && Static215.aString253.startsWith("1.")) {
				local75 = 2;
				@Pc(77) int local77 = 0;
				while (Static215.aString253.length() > local75) {
					@Pc(89) char local89 = Static215.aString253.charAt(local75);
					if (local89 < '0' || local89 > '9') {
						break;
					}
					local75++;
					local77 = local77 * 10 + local89 - 48;
				}
				if (local77 >= 5) {
					Static68.aBoolean77 = true;
				}
			}
			if (Static276.aClass139_4.anApplet1 != null) {
				@Pc(124) Method local124 = Static215.aMethod1;
				if (local124 != null) {
					try {
						local124.invoke(Static276.aClass139_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(140) Throwable local140) {
					}
				}
			}
			Static42.method697();
			this.method669();
			Static152.aClass59_1 = Static174.method2740(Static40.anInt690, Static31.anInt526, Static188.aCanvas115);
			this.method681();
			Static50.aClass78_1 = Static85.method1500();
			this.method682();
			while (Static291.aLong191 == 0L || Static101.method1677() < Static291.aLong191) {
				Static172.anInt3326 = Static50.aClass78_1.method3296(Static230.anInt4398, Static4.anInt80);
				for (local75 = 0; local75 < Static172.anInt3326; local75++) {
					this.method666();
				}
				this.method674();
				Static62.method1013(Static276.aClass139_4, Static188.aCanvas115);
			}
		} catch (@Pc(197) Exception local197) {
			Static193.method3072(local197, null);
			this.method670("crash");
		}
		this.method675(true);
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	protected abstract void method678();

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILjava/lang/String;IZIII)V")
	protected final void method679(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			Static300.anInt5626 = 0;
			Static277.anInt5283 = 550;
			Static40.anInt690 = 768;
			Static228.anInt4381 = 768;
			Static31.anInt526 = 1024;
			Static73.anInt1635 = 1024;
			Static47.anApplet_Sub1_1 = this;
			Static255.anInt4860 = 0;
			Static172.aFrame2 = new Frame();
			Static172.aFrame2.setTitle("Jagex");
			Static172.aFrame2.setResizable(true);
			Static172.aFrame2.addWindowListener(this);
			Static172.aFrame2.setVisible(true);
			Static172.aFrame2.toFront();
			@Pc(44) Insets local44 = Static172.aFrame2.getInsets();
			Static172.aFrame2.setSize(local44.left + Static73.anInt1635 + local44.right, local44.bottom + (Static228.anInt4381 - -local44.top));
			Static179.aClass139_3 = Static276.aClass139_4 = new Class139(null, arg0, arg1, 29);
			@Pc(77) Class185 local77 = Static276.aClass139_4.method3494(1, this);
			while (local77.anInt5623 == 0) {
				Static303.method4677(10L);
			}
			Static308.aThread3 = (Thread) local77.anObject7;
		} catch (@Pc(94) Exception local94) {
			Static193.method3072(local94, null);
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	protected abstract void method681();

	@OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static306.aBoolean401 = false;
	}

	@OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V")
	public final void method682() {
		if (this.aBoolean42) {
			return;
		}
		try {
			@Pc(18) Class185 local18 = Static276.aClass139_4.method3503(Static47.anApplet_Sub1_1.getClass());
			while (local18.anInt5623 == 0) {
				Static303.method4677(100L);
			}
			if (local18.anObject7 != null) {
				throw (Throwable) local18.anObject7;
			}
			jagmisc.init();
			this.aBoolean42 = true;
			Static50.aClass78_1 = Static85.method1500();
		} catch (@Pc(48) Throwable local48) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static47.anApplet_Sub1_1 == this && !Static41.aBoolean45) {
			Static291.aLong191 = Static101.method1677();
			Static303.method4677(5000L);
			Static179.aClass139_3 = null;
			this.method675(false);
		}
	}

	@OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static172.aFrame2 == null) {
			return Static276.aClass139_4 == null || Static276.aClass139_4.anApplet1 == this ? super.getParameter(arg0) : Static276.aClass139_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}
}
