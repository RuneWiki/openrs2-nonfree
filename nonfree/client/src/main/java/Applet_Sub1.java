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

@OriginalClass("client!vj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!vj", name = "providesignlink", descriptor = "(Lclient!bk;)V")
	public static void providesignlink(@OriginalArg(0) Class17 arg0) {
		Static199.aClass17_3 = arg0;
		Static141.aClass17_2 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static11.aBoolean243 = true;
		Static272.aBoolean453 = true;
	}

	@OriginalMember(owner = "client!vj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static17.anApplet_Sub1_1 != this || Static261.aBoolean432) {
			return;
		}
		Static272.aBoolean453 = true;
		if (Static14.aBoolean25 && !Static116.aBoolean188 && Static71.method1143() - Static276.aLong195 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || local29.width >= Static11.anInt2953 && Static151.anInt4076 <= local29.height) {
				Static120.aBoolean205 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static26.aString28 != null) {
				@Pc(11) String local11 = Static26.aString28.toLowerCase();
				if (local11.indexOf("sun") != -1 || local11.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static26.aString26;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method649("wrongjava");
						return;
					}
					Static42.anInt967 = 5;
				} else if (local11.indexOf("ibm") != -1 && (Static26.aString26 == null || Static26.aString26.equals("1.4.2"))) {
					this.method649("wrongjava");
					return;
				}
			}
			@Pc(79) int local79;
			if (Static26.aString26 != null && Static26.aString26.startsWith("1.")) {
				@Pc(77) int local77 = 0;
				local79 = 2;
				while (Static26.aString26.length() > local79) {
					@Pc(87) char local87 = Static26.aString26.charAt(local79);
					if (local87 < '0' || local87 > '9') {
						break;
					}
					local79++;
					local77 = local87 + local77 * 10 - 48;
				}
				if (local77 >= 5) {
					Static14.aBoolean25 = true;
				}
			}
			if (Static199.aClass17_3.anApplet1 != null) {
				@Pc(119) Method local119 = Static26.aMethod1;
				if (local119 != null) {
					try {
						local119.invoke(Static199.aClass17_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(135) Throwable local135) {
					}
				}
			}
			Static221.method3444();
			this.method652();
			Static99.aClass4_1 = Static275.method4088(Static39.aCanvas1, Static13.anInt356, Static250.anInt4959);
			this.method658();
			Static219.aClass25_1 = Static220.method3434();
			while (Static295.aLong136 == 0L || Static295.aLong136 > Static71.method1143()) {
				Static290.anInt5654 = Static219.aClass25_1.method1355(Static57.anInt1262, Static42.anInt967);
				for (local79 = 0; local79 < Static290.anInt5654; local79++) {
					this.method653();
				}
				this.method646();
				Static283.method4211(Static199.aClass17_3, Static39.aCanvas1);
			}
		} catch (@Pc(199) Exception local199) {
			Static88.method1444(null, local199);
			this.method649("crash");
		}
		this.method650(true);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	private void method646() {
		@Pc(8) long local8 = Static71.method1143();
		@Pc(12) long local12 = Static202.aLongArray9[Static97.anInt1998];
		Static202.aLongArray9[Static97.anInt1998] = local8;
		Static97.anInt1998 = Static97.anInt1998 + 1 & 0x1F;
		if (local12 != 0L && local8 > local12) {
			@Pc(39) int local39 = (int) (local8 - local12);
			Static222.anInt4576 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static248.anInt4914++ > 50) {
			Static272.aBoolean453 = true;
			Static248.anInt4914 -= 50;
			Static39.aCanvas1.setSize(Static250.anInt4959, Static13.anInt356);
			Static39.aCanvas1.setVisible(true);
			if (Static209.aFrame3 != null && Static58.aFrame2 == null) {
				@Pc(78) Insets local78 = Static209.aFrame3.getInsets();
				Static39.aCanvas1.setLocation(Static167.anInt3366 + local78.left, Static41.anInt884 + local78.top);
			} else {
				Static39.aCanvas1.setLocation(Static167.anInt3366, Static41.anInt884);
			}
		}
		this.method647();
	}

	@OriginalMember(owner = "client!vj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	protected abstract void method647();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method649(@OriginalArg(1) String arg0) {
		if (this.aBoolean66) {
			return;
		}
		this.aBoolean66 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static304.method1290(Static199.aClass17_3.anApplet1, "loggedout");
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
	private void method650(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static261.aBoolean432) {
				return;
			}
			Static261.aBoolean432 = true;
		}
		if (Static199.aClass17_3.anApplet1 != null) {
			Static199.aClass17_3.anApplet1.destroy();
		}
		try {
			this.method655();
		} catch (@Pc(40) Exception local40) {
		}
		if (Static39.aCanvas1 != null) {
			try {
				Static39.aCanvas1.removeFocusListener(this);
				Static39.aCanvas1.getParent().remove(Static39.aCanvas1);
			} catch (@Pc(53) Exception local53) {
			}
		}
		if (Static199.aClass17_3 != null) {
			try {
				Static199.aClass17_3.method452();
			} catch (@Pc(61) Exception local61) {
			}
		}
		this.method661();
		if (Static209.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(71) Throwable local71) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!vj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!vj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static209.aFrame3 == null) {
			return Static199.aClass17_3 == null || Static199.aClass17_3.anApplet1 == this ? super.getAppletContext() : Static199.aClass17_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public final synchronized void method652() {
		if (Static39.aCanvas1 != null) {
			Static39.aCanvas1.removeFocusListener(this);
			Static39.aCanvas1.getParent().remove(Static39.aCanvas1);
		}
		@Pc(21) Container local21;
		if (Static58.aFrame2 != null) {
			local21 = Static58.aFrame2;
		} else if (Static209.aFrame3 == null) {
			local21 = Static199.aClass17_3.anApplet1;
		} else {
			local21 = Static209.aFrame3;
		}
		local21.setLayout(null);
		Static39.aCanvas1 = new Canvas_Sub2(this);
		local21.add(Static39.aCanvas1);
		Static39.aCanvas1.setSize(Static250.anInt4959, Static13.anInt356);
		Static39.aCanvas1.setVisible(true);
		if (local21 == Static209.aFrame3) {
			@Pc(55) Insets local55 = Static209.aFrame3.getInsets();
			Static39.aCanvas1.setLocation(local55.left + Static167.anInt3366, Static41.anInt884 + local55.top);
		} else {
			Static39.aCanvas1.setLocation(Static167.anInt3366, Static41.anInt884);
		}
		Static39.aCanvas1.addFocusListener(this);
		Static39.aCanvas1.requestFocus();
		Static11.aBoolean243 = true;
		Static269.aBoolean400 = true;
		Static272.aBoolean453 = true;
		Static120.aBoolean205 = false;
		Static276.aLong195 = Static71.method1143();
	}

	@OriginalMember(owner = "client!vj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static11.aBoolean243 = false;
	}

	@OriginalMember(owner = "client!vj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!vj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	private void method653() {
		@Pc(6) long local6 = Static71.method1143();
		@Pc(10) long local10 = Static121.aLongArray8[Static97.anInt2001];
		Static121.aLongArray8[Static97.anInt2001] = local6;
		Static97.anInt2001 = Static97.anInt2001 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
		}
		synchronized (this) {
			Static269.aBoolean400 = Static11.aBoolean243;
		}
		this.method657();
	}

	@OriginalMember(owner = "client!vj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static17.anApplet_Sub1_1 == this && !Static261.aBoolean432) {
			Static295.aLong136 = 0L;
		}
	}

	@OriginalMember(owner = "client!vj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZIII)V")
	protected final void method654(@OriginalArg(0) int arg0) {
		try {
			if (Static17.anApplet_Sub1_1 != null) {
				Static20.anInt537++;
				if (Static20.anInt537 >= 3) {
					this.method649("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static250.anInt4959 = 765;
			Static11.anInt2953 = 765;
			Static167.anInt3366 = 0;
			Static41.anInt884 = 0;
			Static273.anInt5363 = 1544;
			Static17.anApplet_Sub1_1 = this;
			Static13.anInt356 = 503;
			Static151.anInt4076 = 503;
			@Pc(46) String local46 = this.getParameter("openwinjs");
			if (local46 != null && local46.equals("1")) {
				Static40.aBoolean59 = true;
			} else {
				Static40.aBoolean59 = false;
			}
			if (Static199.aClass17_3 == null) {
				Static141.aClass17_2 = Static199.aClass17_3 = new Class17(this, arg0, null, 0);
			}
			@Pc(81) Class163 local81 = Static199.aClass17_3.method449(this, 1);
			while (local81.anInt5259 == 0) {
				Static162.method2645(10L);
			}
			Static289.aThread3 = (Thread) local81.anObject7;
		} catch (@Pc(98) Exception local98) {
			Static88.method1444(null, local98);
			this.method649("crash");
		}
	}

	@OriginalMember(owner = "client!vj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static209.aFrame3 == null) {
			return Static199.aClass17_3 == null || Static199.aClass17_3.anApplet1 == this ? super.getCodeBase() : Static199.aClass17_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	protected abstract void method655();

	@OriginalMember(owner = "client!vj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static17.anApplet_Sub1_1 == this && !Static261.aBoolean432) {
			Static295.aLong136 = Static71.method1143();
			Static162.method2645(5000L);
			Static141.aClass17_2 = null;
			this.method650(false);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;IIIIII)V")
	protected final void method656(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static250.anInt4959 = 1024;
			Static11.anInt2953 = 1024;
			Static273.anInt5363 = 544;
			Static41.anInt884 = 0;
			Static167.anInt3366 = 0;
			Static17.anApplet_Sub1_1 = this;
			Static13.anInt356 = 768;
			Static151.anInt4076 = 768;
			Static209.aFrame3 = new Frame();
			Static209.aFrame3.setTitle("Jagex");
			Static209.aFrame3.setResizable(true);
			Static209.aFrame3.addWindowListener(this);
			Static209.aFrame3.setVisible(true);
			Static209.aFrame3.toFront();
			@Pc(38) Insets local38 = Static209.aFrame3.getInsets();
			Static209.aFrame3.setSize(local38.right + local38.left + Static11.anInt2953, local38.bottom + Static151.anInt4076 - -local38.top);
			Static141.aClass17_2 = Static199.aClass17_3 = new Class17(null, arg1, arg0, 29);
			@Pc(71) Class163 local71 = Static199.aClass17_3.method449(this, 1);
			while (local71.anInt5259 == 0) {
				Static162.method2645(10L);
			}
			Static289.aThread3 = (Thread) local71.anObject7;
		} catch (@Pc(86) Exception local86) {
			Static88.method1444(null, local86);
		}
	}

	@OriginalMember(owner = "client!vj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static209.aFrame3 == null) {
			return Static199.aClass17_3 == null || Static199.aClass17_3.anApplet1 == this ? super.getDocumentBase() : Static199.aClass17_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
	protected abstract void method657();

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V")
	protected abstract void method658();

	@OriginalMember(owner = "client!vj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static17.anApplet_Sub1_1 == this && !Static261.aBoolean432) {
			Static295.aLong136 = Static71.method1143() + 4000L;
		}
	}

	@OriginalMember(owner = "client!vj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Z")
	protected final boolean method660() {
		@Pc(15) String local15 = this.getDocumentBase().getHost().toLowerCase();
		if (local15.equals("jagex.com") || local15.endsWith(".jagex.com")) {
			return true;
		} else if (local15.equals("runescape.com") || local15.endsWith(".runescape.com")) {
			return true;
		} else if (local15.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local15.length() > 0 && local15.charAt(local15.length() - 1) >= '0' && local15.charAt(local15.length() - 1) <= '9') {
				local15 = local15.substring(0, local15.length() - 1);
			}
			if (local15.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method649("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(B)V")
	protected abstract void method661();

	@OriginalMember(owner = "client!vj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static209.aFrame3 == null) {
			return Static199.aClass17_3 == null || Static199.aClass17_3.anApplet1 == this ? super.getParameter(arg0) : Static199.aClass17_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}
}
