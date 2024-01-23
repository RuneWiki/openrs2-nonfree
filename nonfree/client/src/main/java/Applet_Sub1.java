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

@OriginalClass("client!hk")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!hk", name = "providesignlink", descriptor = "(Lclient!gn;)V")
	public static void providesignlink(@OriginalArg(0) Class66 arg0) {
		Static43.aClass66_1 = arg0;
		Static70.aClass66_3 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	protected abstract void method829();

	@OriginalMember(owner = "client!hk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static48.aFrame1 == null) {
			return Static43.aClass66_1 == null || Static43.aClass66_1.anApplet1 == this ? super.getAppletContext() : Static43.aClass66_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	protected abstract void method832();

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
	protected abstract void method833();

	@OriginalMember(owner = "client!hk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static179.aBoolean206 = false;
	}

	@OriginalMember(owner = "client!hk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static289.anApplet_Sub1_1 == this && !Static258.aBoolean299) {
			Static245.aLong177 = Static294.method4792();
			Static230.method4022(5000L);
			Static70.aClass66_3 = null;
			this.method848(false);
		}
	}

	@OriginalMember(owner = "client!hk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static289.anApplet_Sub1_1 != this || Static258.aBoolean299) {
			return;
		}
		Static52.aBoolean83 = true;
		if (Static156.aBoolean185 && !Static296.aBoolean335 && Static294.method4792() - Static59.aLong58 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static105.anInt6113 <= local26.width && local26.height >= Static80.anInt1912) {
				Static252.aBoolean293 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	protected final void method836(@OriginalArg(0) int arg0) {
		try {
			if (Static289.anApplet_Sub1_1 != null) {
				Static166.anInt3796++;
				if (Static166.anInt3796 >= 3) {
					this.method841("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static186.anInt4165 = 0;
			Static139.anInt6125 = 1545;
			Static289.anApplet_Sub1_1 = this;
			Static54.anInt1439 = 0;
			Static193.anInt4370 = 765;
			Static105.anInt6113 = 765;
			Static144.anInt3368 = 503;
			Static80.anInt1912 = 503;
			@Pc(50) String local50 = this.getParameter("openwinjs");
			if (local50 != null && local50.equals("1")) {
				Static11.aBoolean150 = true;
			} else {
				Static11.aBoolean150 = false;
			}
			if (Static43.aClass66_1 == null) {
				Static70.aClass66_3 = Static43.aClass66_1 = new Class66(this, arg0, null, 0);
			}
			@Pc(81) Class43 local81 = Static43.aClass66_1.method1615(1, this);
			while (local81.anInt1456 == 0) {
				Static230.method4022(10L);
			}
			Static125.aThread2 = (Thread) local81.anObject3;
		} catch (@Pc(95) Exception local95) {
			Static217.method3829(null, local95);
			this.method841("crash");
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public final synchronized void method838() {
		if (Static9.aCanvas1 != null) {
			Static9.aCanvas1.removeFocusListener(this);
			Static9.aCanvas1.getParent().remove(Static9.aCanvas1);
		}
		@Pc(27) Container local27;
		if (Static158.aFrame2 != null) {
			local27 = Static158.aFrame2;
		} else if (Static48.aFrame1 == null) {
			local27 = Static43.aClass66_1.anApplet1;
		} else {
			local27 = Static48.aFrame1;
		}
		local27.setLayout(null);
		Static9.aCanvas1 = new Canvas_Sub1(this);
		local27.add(Static9.aCanvas1);
		Static9.aCanvas1.setSize(Static193.anInt4370, Static144.anInt3368);
		Static9.aCanvas1.setVisible(true);
		if (Static48.aFrame1 == local27) {
			@Pc(67) Insets local67 = Static48.aFrame1.getInsets();
			Static9.aCanvas1.setLocation(Static54.anInt1439 + local67.left, local67.top - -Static186.anInt4165);
		} else {
			Static9.aCanvas1.setLocation(Static54.anInt1439, Static186.anInt4165);
		}
		Static9.aCanvas1.addFocusListener(this);
		Static9.aCanvas1.requestFocus();
		Static179.aBoolean206 = true;
		Static52.aBoolean83 = true;
		Static252.aBoolean293 = false;
		Static76.aBoolean290 = true;
		Static59.aLong58 = Static294.method4792();
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	protected abstract void method839();

	@OriginalMember(owner = "client!hk", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static289.anApplet_Sub1_1 == this && !Static258.aBoolean299) {
			Static245.aLong177 = Static294.method4792() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method841(@OriginalArg(1) String arg0) {
		if (this.aBoolean68) {
			return;
		}
		this.aBoolean68 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static301.method406("loggedout", Static43.aClass66_1.anApplet1);
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!hk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static48.aFrame1 == null) {
			return Static43.aClass66_1 == null || Static43.aClass66_1.anApplet1 == this ? super.getParameter(arg0) : Static43.aClass66_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static289.anApplet_Sub1_1 == this && !Static258.aBoolean299) {
			Static245.aLong177 = 0L;
		}
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V")
	private void method842() {
		@Pc(6) long local6 = Static294.method4792();
		@Pc(10) long local10 = Static33.aLongArray5[Static5.anInt146];
		Static33.aLongArray5[Static5.anInt146] = local6;
		Static5.anInt146 = Static5.anInt146 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(37) int local37 = (int) (local6 - local10);
			Static181.anInt4085 = ((local37 >> 1) + 32000) / local37;
		}
		if (Static147.anInt3492++ > 50) {
			Static147.anInt3492 -= 50;
			Static52.aBoolean83 = true;
			Static9.aCanvas1.setSize(Static193.anInt4370, Static144.anInt3368);
			Static9.aCanvas1.setVisible(true);
			if (Static48.aFrame1 != null && Static158.aFrame2 == null) {
				@Pc(79) Insets local79 = Static48.aFrame1.getInsets();
				Static9.aCanvas1.setLocation(Static54.anInt1439 + local79.left, local79.top - -Static186.anInt4165);
			} else {
				Static9.aCanvas1.setLocation(Static54.anInt1439, Static186.anInt4165);
			}
		}
		this.method832();
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	private void method844() {
		@Pc(2) long local2 = Static294.method4792();
		@Pc(10) long local10 = Static180.aLongArray10[Static66.anInt3704];
		Static180.aLongArray10[Static66.anInt3704] = local2;
		if (local10 != (long) 0 && local2 > local10) {
		}
		Static66.anInt3704 = Static66.anInt3704 + 1 & 0x1F;
		synchronized (this) {
			Static76.aBoolean290 = Static179.aBoolean206;
		}
		this.method839();
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)Z")
	protected final boolean method845() {
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
				this.method841("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIZIILjava/lang/String;II)V")
	protected final void method846(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static144.anInt3368 = 768;
			Static80.anInt1912 = 768;
			Static186.anInt4165 = 0;
			Static193.anInt4370 = 1024;
			Static105.anInt6113 = 1024;
			Static289.anApplet_Sub1_1 = this;
			Static139.anInt6125 = 545;
			Static54.anInt1439 = 0;
			Static48.aFrame1 = new Frame();
			Static48.aFrame1.setTitle("Jagex");
			Static48.aFrame1.setResizable(true);
			Static48.aFrame1.addWindowListener(this);
			Static48.aFrame1.setVisible(true);
			Static48.aFrame1.toFront();
			@Pc(38) Insets local38 = Static48.aFrame1.getInsets();
			Static48.aFrame1.setSize(local38.right + Static105.anInt6113 + local38.left, Static80.anInt1912 + (local38.top - -local38.bottom));
			Static70.aClass66_3 = Static43.aClass66_1 = new Class66(null, arg0, arg1, 29);
			@Pc(76) Class43 local76 = Static43.aClass66_1.method1615(1, this);
			while (local76.anInt1456 == 0) {
				Static230.method4022(10L);
			}
			Static125.aThread2 = (Thread) local76.anObject3;
		} catch (@Pc(90) Exception local90) {
			Static217.method3829(null, local90);
		}
	}

	@OriginalMember(owner = "client!hk", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static93.aString66 != null) {
				@Pc(10) String local10 = Static93.aString66.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(43) String local43 = Static93.aString62;
					if (local43.equals("1.1") || local43.startsWith("1.1.") || local43.equals("1.2") || local43.startsWith("1.2.")) {
						this.method841("wrongjava");
						return;
					}
					Static233.anInt5155 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static93.aString62 == null || Static93.aString62.equals("1.4.2"))) {
					this.method841("wrongjava");
					return;
				}
			}
			@Pc(75) int local75;
			if (Static93.aString62 != null && Static93.aString62.startsWith("1.")) {
				local75 = 2;
				@Pc(77) int local77 = 0;
				while (Static93.aString62.length() > local75) {
					@Pc(89) char local89 = Static93.aString62.charAt(local75);
					if (local89 < '0' || local89 > '9') {
						break;
					}
					local77 = local77 * 10 + local89 - 48;
					local75++;
				}
				if (local77 >= 5) {
					Static156.aBoolean185 = true;
				}
			}
			if (Static43.aClass66_1.anApplet1 != null) {
				@Pc(124) Method local124 = Static93.aMethod1;
				if (local124 != null) {
					try {
						local124.invoke(Static43.aClass66_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(140) Throwable local140) {
					}
				}
			}
			Static48.method1025();
			this.method838();
			Static1.aClass5_1 = Static177.method3221(Static9.aCanvas1, Static193.anInt4370, Static144.anInt3368);
			this.method829();
			Static117.aClass8_1 = Static299.method4856();
			while (Static245.aLong177 == 0L || Static294.method4792() < Static245.aLong177) {
				Static265.anInt5772 = Static117.aClass8_1.method329(Static233.anInt5155, Static213.anInt4719);
				for (local75 = 0; local75 < Static265.anInt5772; local75++) {
					this.method844();
				}
				this.method842();
				Static274.method2237(Static43.aClass66_1, Static9.aCanvas1);
			}
		} catch (@Pc(196) Exception local196) {
			Static217.method3829(null, local196);
			this.method841("crash");
		}
		this.method848(true);
	}

	@OriginalMember(owner = "client!hk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
	private void method848(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static258.aBoolean299) {
				return;
			}
			Static258.aBoolean299 = true;
		}
		if (Static43.aClass66_1.anApplet1 != null) {
			Static43.aClass66_1.anApplet1.destroy();
		}
		try {
			this.method849();
		} catch (@Pc(39) Exception local39) {
		}
		if (Static9.aCanvas1 != null) {
			try {
				Static9.aCanvas1.removeFocusListener(this);
				Static9.aCanvas1.getParent().remove(Static9.aCanvas1);
			} catch (@Pc(51) Exception local51) {
			}
		}
		if (Static43.aClass66_1 != null) {
			try {
				Static43.aClass66_1.method1613();
			} catch (@Pc(58) Exception local58) {
			}
		}
		this.method833();
		if (Static48.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(68) Throwable local68) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!hk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static48.aFrame1 == null) {
			return Static43.aClass66_1 == null || Static43.aClass66_1.anApplet1 == this ? super.getDocumentBase() : Static43.aClass66_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V")
	protected abstract void method849();

	@OriginalMember(owner = "client!hk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static179.aBoolean206 = true;
		Static52.aBoolean83 = true;
	}

	@OriginalMember(owner = "client!hk", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static48.aFrame1 == null) {
			return Static43.aClass66_1 == null || Static43.aClass66_1.anApplet1 == this ? super.getCodeBase() : Static43.aClass66_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}
}
