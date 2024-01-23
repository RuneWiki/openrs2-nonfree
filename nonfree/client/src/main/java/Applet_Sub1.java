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

@OriginalClass("client!qc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!qc", name = "providesignlink", descriptor = "(Lclient!jh;)V")
	public static void providesignlink(@OriginalArg(0) Class84 arg0) {
		Static13.aClass84_3 = arg0;
		Static187.aClass84_4 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z")
	protected final boolean method779() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
			return true;
		} else if (local10.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local10.length() > 0 && local10.charAt(local10.length() - 1) >= '0' && local10.charAt(local10.length() - 1) <= '9') {
				local10 = local10.substring(0, local10.length() - 1);
			}
			if (local10.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method792("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	protected abstract void method780();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	protected abstract void method781();

	@OriginalMember(owner = "client!qc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static237.anApplet_Sub1_2 == this && !Static131.aBoolean174) {
			Static176.aLong110 = 0L;
		}
	}

	@OriginalMember(owner = "client!qc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static299.aFrame2 == null) {
			return Static13.aClass84_3 == null || Static13.aClass84_3.anApplet1 == this ? super.getAppletContext() : Static13.aClass84_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static251.aBoolean395 = false;
	}

	@OriginalMember(owner = "client!qc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static299.aFrame2 == null) {
			return Static13.aClass84_3 == null || Static13.aClass84_3.anApplet1 == this ? super.getCodeBase() : Static13.aClass84_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static237.anApplet_Sub1_2 == this && !Static131.aBoolean174) {
			Static176.aLong110 = Static252.method3964() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static237.anApplet_Sub1_2 != this || Static131.aBoolean174) {
			return;
		}
		Static278.aBoolean425 = true;
		if (Static36.aBoolean355 && !Static240.aBoolean369 && Static252.method3964() - Static41.aLong34 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static139.anInt2621 && local28.height >= Static269.anInt5394) {
				Static242.aBoolean388 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public final synchronized void method783() {
		if (Static189.aCanvas1 != null) {
			Static189.aCanvas1.removeFocusListener(this);
			Static189.aCanvas1.getParent().remove(Static189.aCanvas1);
		}
		@Pc(22) Container local22;
		if (Static136.aFrame1 != null) {
			local22 = Static136.aFrame1;
		} else if (Static299.aFrame2 == null) {
			local22 = Static13.aClass84_3.anApplet1;
		} else {
			local22 = Static299.aFrame2;
		}
		local22.setLayout(null);
		Static189.aCanvas1 = new Canvas_Sub1(this);
		local22.add(Static189.aCanvas1);
		Static189.aCanvas1.setSize(Static145.anInt2690, Static166.anInt3046);
		Static189.aCanvas1.setVisible(true);
		if (Static299.aFrame2 == local22) {
			@Pc(62) Insets local62 = Static299.aFrame2.getInsets();
			Static189.aCanvas1.setLocation(Static47.anInt5869 + local62.left, local62.top + Static125.anInt2380);
		} else {
			Static189.aCanvas1.setLocation(Static47.anInt5869, Static125.anInt2380);
		}
		Static189.aCanvas1.addFocusListener(this);
		Static189.aCanvas1.requestFocus();
		Static251.aBoolean395 = true;
		Static278.aBoolean425 = true;
		Static242.aBoolean388 = false;
		Static297.aBoolean450 = true;
		Static41.aLong34 = Static252.method3964();
	}

	@OriginalMember(owner = "client!qc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static299.aFrame2 == null) {
			return Static13.aClass84_3 == null || Static13.aClass84_3.anApplet1 == this ? super.getDocumentBase() : Static13.aClass84_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V")
	protected abstract void method785();

	@OriginalMember(owner = "client!qc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static237.anApplet_Sub1_2 == this && !Static131.aBoolean174) {
			Static176.aLong110 = Static252.method3964();
			Static275.method4233(5000L);
			Static187.aClass84_4 = null;
			this.method786(false);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZB)V")
	private void method786(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static131.aBoolean174) {
				return;
			}
			Static131.aBoolean174 = true;
		}
		if (Static13.aClass84_3.anApplet1 != null) {
			Static13.aClass84_3.anApplet1.destroy();
		}
		try {
			this.method781();
		} catch (@Pc(39) Exception local39) {
		}
		if (Static189.aCanvas1 != null) {
			try {
				Static189.aCanvas1.removeFocusListener(this);
				Static189.aCanvas1.getParent().remove(Static189.aCanvas1);
			} catch (@Pc(51) Exception local51) {
			}
		}
		if (Static13.aClass84_3 != null) {
			try {
				Static13.aClass84_3.method1951();
			} catch (@Pc(60) Exception local60) {
			}
		}
		this.method785();
		if (Static299.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(71) Throwable local71) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	protected final void method787(@OriginalArg(4) int arg0) {
		try {
			if (Static237.anApplet_Sub1_2 != null) {
				Static294.anInt5843++;
				if (Static294.anInt5843 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method792("alreadyloaded");
				return;
			}
			Static47.anInt5869 = 0;
			Static145.anInt2690 = 765;
			Static139.anInt2621 = 765;
			Static125.anInt2380 = 0;
			Static237.anApplet_Sub1_2 = this;
			Static137.anInt3864 = 1540;
			Static166.anInt3046 = 503;
			Static269.anInt5394 = 503;
			@Pc(49) String local49 = this.getParameter("openwinjs");
			if (local49 != null && local49.equals("1")) {
				Static163.aBoolean349 = true;
			} else {
				Static163.aBoolean349 = false;
			}
			if (Static13.aClass84_3 == null) {
				Static187.aClass84_4 = Static13.aClass84_3 = new Class84(this, arg0, null, 0);
			}
			@Pc(86) Class118 local86 = Static13.aClass84_3.method1958(this, 1);
			while (local86.anInt3187 == 0) {
				Static275.method4233(10L);
			}
			Static257.aThread2 = (Thread) local86.anObject3;
		} catch (@Pc(100) Exception local100) {
			Static6.method149(local100, null);
			this.method792("crash");
		}
	}

	@OriginalMember(owner = "client!qc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static299.aFrame2 == null) {
			return Static13.aClass84_3 == null || Static13.aClass84_3.anApplet1 == this ? super.getParameter(arg0) : Static13.aClass84_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
	protected abstract void method788();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZIIBILjava/lang/String;)V")
	protected final void method789(@OriginalArg(4) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static125.anInt2380 = 0;
			Static137.anInt3864 = 540;
			Static145.anInt2690 = 1024;
			Static139.anInt2621 = 1024;
			Static47.anInt5869 = 0;
			Static237.anApplet_Sub1_2 = this;
			Static166.anInt3046 = 768;
			Static269.anInt5394 = 768;
			Static299.aFrame2 = new Frame();
			Static299.aFrame2.setTitle("Jagex");
			Static299.aFrame2.setResizable(true);
			Static299.aFrame2.addWindowListener(this);
			Static299.aFrame2.setVisible(true);
			Static299.aFrame2.toFront();
			@Pc(42) Insets local42 = Static299.aFrame2.getInsets();
			Static299.aFrame2.setSize(local42.right + local42.left + Static139.anInt2621, local42.top + Static269.anInt5394 + local42.bottom);
			Static187.aClass84_4 = Static13.aClass84_3 = new Class84(null, arg0, arg1, 29);
			@Pc(74) Class118 local74 = Static13.aClass84_3.method1958(this, 1);
			while (local74.anInt3187 == 0) {
				Static275.method4233(10L);
			}
			Static257.aThread2 = (Thread) local74.anObject3;
		} catch (@Pc(91) Exception local91) {
			Static6.method149(local91, null);
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	protected abstract void method790();

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	private void method791() {
		@Pc(2) long local2 = Static252.method3964();
		@Pc(18) long local18 = Static218.aLongArray3[Static170.anInt3120];
		Static218.aLongArray3[Static170.anInt3120] = local2;
		if (local18 != 0L && local2 > local18) {
			@Pc(39) int local39 = (int) (local2 - local18);
			Static249.anInt5049 = ((local39 >> 1) + 32000) / local39;
		}
		Static170.anInt3120 = Static170.anInt3120 + 1 & 0x1F;
		if (Static60.anInt1249++ > 50) {
			Static278.aBoolean425 = true;
			Static60.anInt1249 -= 50;
			Static189.aCanvas1.setSize(Static145.anInt2690, Static166.anInt3046);
			Static189.aCanvas1.setVisible(true);
			if (Static299.aFrame2 != null && Static136.aFrame1 == null) {
				@Pc(90) Insets local90 = Static299.aFrame2.getInsets();
				Static189.aCanvas1.setLocation(Static47.anInt5869 + local90.left, local90.top - -Static125.anInt2380);
			} else {
				Static189.aCanvas1.setLocation(Static47.anInt5869, Static125.anInt2380);
			}
		}
		this.method788();
	}

	@OriginalMember(owner = "client!qc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static127.aString84 != null) {
				@Pc(12) String local12 = Static127.aString84.toLowerCase();
				if (local12.indexOf("sun") != -1 || local12.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static127.aString78;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method792("wrongjava");
						return;
					}
					Static291.anInt5795 = 5;
				} else if (local12.indexOf("ibm") != -1 && (Static127.aString78 == null || Static127.aString78.equals("1.4.2"))) {
					this.method792("wrongjava");
					return;
				}
			}
			@Pc(75) int local75;
			if (Static127.aString78 != null && Static127.aString78.startsWith("1.")) {
				local75 = 2;
				@Pc(77) int local77 = 0;
				while (local75 < Static127.aString78.length()) {
					@Pc(89) char local89 = Static127.aString78.charAt(local75);
					if (local89 < '0' || local89 > '9') {
						break;
					}
					local75++;
					local77 = local89 + local77 * 10 - 48;
				}
				if (local77 >= 5) {
					Static36.aBoolean355 = true;
				}
			}
			if (Static13.aClass84_3.anApplet1 != null) {
				@Pc(122) Method local122 = Static127.aMethod1;
				if (local122 != null) {
					try {
						local122.invoke(Static13.aClass84_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(139) Throwable local139) {
					}
				}
			}
			Static120.method1890();
			this.method783();
			Static282.aClass23_33 = Static259.method4017(Static189.aCanvas1, Static166.anInt3046, Static145.anInt2690);
			this.method780();
			Static247.aClass30_1 = Static113.method1768();
			while (Static176.aLong110 == 0L || Static252.method3964() < Static176.aLong110) {
				Static75.anInt1505 = Static247.aClass30_1.method4519(Static291.anInt5795, Static189.anInt3540);
				for (local75 = 0; local75 < Static75.anInt1505; local75++) {
					this.method793();
				}
				this.method791();
				Static80.method1356(Static189.aCanvas1, Static13.aClass84_3);
			}
		} catch (@Pc(199) Exception local199) {
			Static6.method149(local199, null);
			this.method792("crash");
		}
		this.method786(true);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method792(@OriginalArg(1) String arg0) {
		if (this.aBoolean85) {
			return;
		}
		this.aBoolean85 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static301.method946("loggedout", Static13.aClass84_3.anApplet1);
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	private void method793() {
		@Pc(6) long local6 = Static252.method3964();
		@Pc(10) long local10 = Static229.aLongArray10[Static55.anInt1162];
		Static229.aLongArray10[Static55.anInt1162] = local6;
		Static55.anInt1162 = Static55.anInt1162 + 1 & 0x1F;
		synchronized (this) {
			Static297.aBoolean450 = Static251.aBoolean395;
		}
		this.method790();
		if (local10 != 0L && local10 >= local6) {
		}
	}

	@OriginalMember(owner = "client!qc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static251.aBoolean395 = true;
		Static278.aBoolean425 = true;
	}
}
