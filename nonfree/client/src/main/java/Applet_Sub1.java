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

@OriginalClass("client!th")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!th", name = "C", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!th", name = "providesignlink", descriptor = "(Lclient!pc;)V")
	public static void providesignlink(@OriginalArg(0) Class87 arg0) {
		Static4.aClass87_1 = arg0;
		Static123.aClass87_6 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method530(@OriginalArg(1) String arg0) {
		if (this.aBoolean23) {
			return;
		}
		this.aBoolean23 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!th", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static69.aFrame1 == null) {
			return Static4.aClass87_1 == null || Static4.aClass87_1.anApplet1 == this ? super.getDocumentBase() : Static4.aClass87_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static69.aFrame1 == null) {
			return Static4.aClass87_1 == null || Static4.aClass87_1.anApplet1 == this ? super.getCodeBase() : Static4.aClass87_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!th", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!th", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static69.aFrame1 == null) {
			return Static4.aClass87_1 == null || Static4.aClass87_1.anApplet1 == this ? super.getAppletContext() : Static4.aClass87_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
	private void method531(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static205.aBoolean195) {
				return;
			}
			Static205.aBoolean195 = true;
		}
		if (Static4.aClass87_1.anApplet1 != null) {
			Static4.aClass87_1.anApplet1.destroy();
		}
		try {
			this.method539();
		} catch (@Pc(35) Exception local35) {
		}
		if (Static193.aCanvas4 != null) {
			try {
				Static193.aCanvas4.removeFocusListener(this);
				Static193.aCanvas4.getParent().remove(Static193.aCanvas4);
			} catch (@Pc(46) Exception local46) {
			}
		}
		if (Static4.aClass87_1 != null) {
			try {
				Static4.aClass87_1.method2695();
			} catch (@Pc(54) Exception local54) {
			}
		}
		this.method542();
		if (Static69.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(64) Throwable local64) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	protected abstract void method533();

	@OriginalMember(owner = "client!th", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static84.anApplet_Sub1_1 == this && !Static205.aBoolean195) {
			Static177.aLong144 = 0L;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	protected abstract void method536();

	@OriginalMember(owner = "client!th", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static84.anApplet_Sub1_1 == this && !Static205.aBoolean195) {
			Static177.aLong144 = Static179.method2941();
			Static204.method3250(5000L);
			Static123.aClass87_6 = null;
			this.method531(false);
		}
	}

	@OriginalMember(owner = "client!th", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	public final synchronized void method537() {
		if (Static193.aCanvas4 != null) {
			Static193.aCanvas4.removeFocusListener(this);
			Static193.aCanvas4.getParent().remove(Static193.aCanvas4);
		}
		if (Static30.aCanvas1 != null) {
			Static30.aCanvas1.getParent().remove(Static30.aCanvas1);
			Static30.aCanvas1 = null;
		}
		@Pc(31) Container local31;
		if (Static176.aFrame2 != null) {
			local31 = Static176.aFrame2;
		} else if (Static69.aFrame1 == null) {
			local31 = Static4.aClass87_1.anApplet1;
		} else {
			local31 = Static69.aFrame1;
		}
		local31.setLayout(null);
		@Pc(76) Insets local76;
		if (Static75.anInt1529 != 0) {
			Static30.aCanvas1 = new Canvas_Sub1(this);
			local31.add(Static30.aCanvas1);
			Static30.aCanvas1.setSize(Static185.anInt3844, Static75.anInt1529);
			Static30.aCanvas1.setVisible(true);
			if (Static69.aFrame1 == local31) {
				local76 = Static69.aFrame1.getInsets();
				Static30.aCanvas1.setLocation(local76.left, local76.top);
			} else {
				Static30.aCanvas1.setLocation(0, 0);
			}
		}
		Static193.aCanvas4 = new Canvas_Sub1(this);
		local31.add(Static193.aCanvas4);
		Static193.aCanvas4.setSize(Static185.anInt3844, Static48.anInt1023);
		Static193.aCanvas4.setVisible(true);
		if (local31 == Static69.aFrame1) {
			local76 = Static69.aFrame1.getInsets();
			Static193.aCanvas4.setLocation(local76.left, local76.top + Static75.anInt1529);
		} else {
			Static193.aCanvas4.setLocation(0, Static75.anInt1529);
		}
		Static193.aCanvas4.addFocusListener(this);
		Static193.aCanvas4.requestFocus();
		Static56.aBoolean56 = true;
		Static60.aBoolean61 = true;
		Static122.aBoolean104 = false;
		Static231.aBoolean215 = true;
		Static72.aLong57 = Static179.method2941();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	protected final boolean method538() {
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
				this.method530("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	protected abstract void method539();

	@OriginalMember(owner = "client!th", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static56.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	private void method540() {
		@Pc(7) long local7 = Static203.aLongArray2[Static174.anInt4279];
		@Pc(10) long local10 = Static179.method2941();
		Static203.aLongArray2[Static174.anInt4279] = local10;
		Static174.anInt4279 = Static174.anInt4279 + 1 & 0x1F;
		if (local7 != 0L && local10 > local7) {
			@Pc(34) int local34 = (int) (local10 - local7);
			Static42.anInt923 = ((local34 >> 1) + 32000) / local34;
		}
		if (Static199.anInt4017++ > 50) {
			Static60.aBoolean61 = true;
			Static199.anInt4017 -= 50;
			Static193.aCanvas4.setSize(Static185.anInt3844, Static48.anInt1023);
			Static193.aCanvas4.setVisible(true);
			if (Static69.aFrame1 != null && Static176.aFrame2 == null) {
				@Pc(71) Insets local71 = Static69.aFrame1.getInsets();
				Static193.aCanvas4.setLocation(local71.left, Static75.anInt1529 + local71.top);
			} else {
				Static193.aCanvas4.setLocation(0, Static75.anInt1529);
			}
		}
		this.method547();
	}

	@OriginalMember(owner = "client!th", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static84.anApplet_Sub1_1 == this && !Static205.aBoolean195) {
			Static177.aLong144 = Static179.method2941() + 4000L;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
	protected abstract void method542();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	protected final void method544(@OriginalArg(0) int arg0) {
		try {
			if (Static84.anApplet_Sub1_1 != null) {
				Static126.anInt2530++;
				if (Static126.anInt2530 >= 3) {
					this.method530("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static185.anInt3844 = 765;
			Static7.anInt154 = 506;
			Static48.anInt1023 = 503;
			Static84.anApplet_Sub1_1 = this;
			@Pc(38) String local38 = this.getParameter("openwinjs");
			@Pc(45) boolean local45;
			if (local38 != null && local38.equals("1")) {
				local45 = true;
			} else {
				local45 = false;
			}
			if (Static4.aClass87_1 == null) {
				Static123.aClass87_6 = Static4.aClass87_1 = new Class87(false, this, arg0, null, 0);
			}
			Static4.aClass87_1.method2694(this, 1);
		} catch (@Pc(69) Exception local69) {
			Static204.method3249(local69, null);
			this.method530("crash");
		}
	}

	@OriginalMember(owner = "client!th", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static69.aFrame1 == null) {
			return Static4.aClass87_1 == null || Static4.aClass87_1.anApplet1 == this ? super.getParameter(arg0) : Static4.aClass87_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static84.anApplet_Sub1_1 != this || Static205.aBoolean195) {
			return;
		}
		Static60.aBoolean61 = true;
		if (Static161.aString8 != null && Static161.aString8.startsWith("1.5") && Static179.method2941() - Static72.aLong57 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static185.anInt3844 <= local28.width && Static48.anInt1023 <= local28.height) {
				Static122.aBoolean104 = true;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static56.aBoolean56 = true;
		Static60.aBoolean61 = true;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	private void method546() {
		@Pc(7) long local7 = Static179.aLongArray7[Static72.anInt1356];
		@Pc(10) long local10 = Static179.method2941();
		@Pc(25) boolean local25;
		if (local7 == 0L || local7 >= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static179.aLongArray7[Static72.anInt1356] = local10;
		Static72.anInt1356 = Static72.anInt1356 + 1 & 0x1F;
		synchronized (this) {
			Static231.aBoolean215 = Static56.aBoolean56;
		}
		this.method533();
	}

	@OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static161.aString6 != null) {
				@Pc(10) String local10 = Static161.aString6.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static161.aString8;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method530("wrongjava");
						return;
					}
					Static131.anInt2719 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static161.aString8 == null || Static161.aString8.equals("1.4.2"))) {
					this.method530("wrongjava");
					return;
				}
			}
			if (Static4.aClass87_1.anApplet1 != null) {
				@Pc(68) Method local68 = Static161.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static4.aClass87_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method537();
			Static133.aClass35_1 = Static147.method2483(Static193.aCanvas4, Static48.anInt1023, Static185.anInt3844);
			this.method536();
			Static33.aClass92_1 = Static197.method3496();
			while (Static177.aLong144 == 0L || Static179.method2941() < Static177.aLong144) {
				Static45.anInt942 = Static33.aClass92_1.method3384(Static143.anInt2892, Static131.anInt2719);
				for (@Pc(109) int local109 = 0; local109 < Static45.anInt942; local109++) {
					this.method546();
				}
				this.method540();
				Static201.method3213(Static193.aCanvas4, Static4.aClass87_1);
			}
		} catch (@Pc(146) Exception local146) {
			Static204.method3249(local146, null);
			this.method530("crash");
		}
		this.method531(true);
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	protected abstract void method547();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIILjava/lang/String;Z)V")
	protected final void method548(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static84.anApplet_Sub1_1 = this;
			Static48.anInt1023 = 503;
			Static185.anInt3844 = 765;
			Static7.anInt154 = 506;
			Static69.aFrame1 = new Frame();
			Static69.aFrame1.setTitle("Jagex");
			Static69.aFrame1.setResizable(false);
			Static69.aFrame1.addWindowListener(this);
			Static69.aFrame1.setVisible(true);
			Static69.aFrame1.toFront();
			@Pc(28) Insets local28 = Static69.aFrame1.getInsets();
			Static69.aFrame1.setSize(local28.left + local28.right + 765, local28.bottom + 503 - -local28.top);
			Static123.aClass87_6 = Static4.aClass87_1 = new Class87(true, null, arg0, arg1, 27);
			Static4.aClass87_1.method2694(this, 1);
		} catch (@Pc(65) Exception local65) {
			Static204.method3249(local65, null);
		}
	}

	@OriginalMember(owner = "client!th", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}
}
