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

@OriginalClass("client!h")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!h", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static116.anApplet_Sub1_1 == this && !Static82.aBoolean95) {
			Static85.aLong76 = 0L;
		}
	}

	@OriginalMember(owner = "client!h", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!h", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static116.anApplet_Sub1_1 == this && !Static82.aBoolean95) {
			Static85.aLong76 = Static143.method2807() + 4000L;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	private void method763() {
		@Pc(6) long local6 = Static143.method2807();
		@Pc(10) long local10 = Static96.aLongArray6[Static90.anInt2655];
		Static96.aLongArray6[Static90.anInt2655] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static110.anInt3090 = ((local34 >> 1) + 32000) / local34;
		}
		Static90.anInt2655 = Static90.anInt2655 + 1 & 0x1F;
		if (Static177.anInt4477++ > 50) {
			Static177.anInt4477 -= 50;
			Static11.aBoolean16 = true;
			Static24.aCanvas1.setSize(Static152.anInt2186, Static5.anInt210);
			Static24.aCanvas1.setVisible(true);
			if (Static131.aFrame1 == null) {
				Static24.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static131.aFrame1.getInsets();
				Static24.aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.method776();
	}

	@OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static62.aString2 != null) {
				@Pc(10) String local10 = Static62.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static62.aString3;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method764("wrongjava");
						return;
					}
					Static75.anInt2280 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static62.aString3 == null || Static62.aString3.equals("1.4.2"))) {
					this.method764("wrongjava");
					return;
				}
			}
			if (Static9.aClass32_1.anApplet1 != null) {
				@Pc(67) Method local67 = Static62.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static9.aClass32_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method774();
			Static31.aClass14_1 = Static128.method3225(Static24.aCanvas1, Static152.anInt2186, Static5.anInt210);
			this.method768();
			Static95.aClass16_1 = Static152.method1615();
			while (Static85.aLong76 == 0L || Static85.aLong76 > Static143.method2807()) {
				Static102.anInt2918 = Static95.aClass16_1.method1662(Static128.anInt4223, Static75.anInt2280);
				for (@Pc(108) int local108 = 0; local108 < Static102.anInt2918; local108++) {
					this.method775();
				}
				this.method763();
				Static82.method1863(Static9.aClass32_1, Static24.aCanvas1);
			}
		} catch (@Pc(141) Exception local141) {
			Static141.method2762(local141, null);
			this.method764("crash");
		}
		this.method780();
	}

	@OriginalMember(owner = "client!h", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static131.aFrame1 == null) {
			return Static9.aClass32_1 == null || Static9.aClass32_1.anApplet1 == this ? super.getParameter(arg0) : Static9.aClass32_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method764(@OriginalArg(0) String arg0) {
		if (this.aBoolean42) {
			return;
		}
		this.aBoolean42 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!h", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static131.aFrame1 == null) {
			return Static9.aClass32_1 == null || Static9.aClass32_1.anApplet1 == this ? super.getCodeBase() : Static9.aClass32_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!h", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!h", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static131.aFrame1 == null) {
			return Static9.aClass32_1 == null || Static9.aClass32_1.anApplet1 == this ? super.getAppletContext() : Static9.aClass32_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!h", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	protected abstract void method767();

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	protected abstract void method768();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)Z")
	protected final boolean method769() {
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
				this.method764("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILjava/lang/String;III)V")
	protected final void method770(@OriginalArg(3) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static116.anApplet_Sub1_1 = this;
			Static152.anInt2186 = 765;
			Static5.anInt210 = 503;
			Static48.anInt1635 = 483;
			Static131.aFrame1 = new Frame();
			Static131.aFrame1.setTitle("Jagex");
			Static131.aFrame1.setResizable(false);
			Static131.aFrame1.addWindowListener(this);
			Static131.aFrame1.setVisible(true);
			Static131.aFrame1.toFront();
			@Pc(36) Insets local36 = Static131.aFrame1.getInsets();
			Static131.aFrame1.setSize(local36.right + local36.left + 765, 503 - (-local36.top + -local36.bottom));
			Static66.aClass32_3 = Static9.aClass32_1 = new Class32(true, null, arg1, arg0, 16);
			Static9.aClass32_1.method1483(1, this);
		} catch (@Pc(73) Exception local73) {
			Static141.method2762(local73, null);
		}
	}

	@OriginalMember(owner = "client!h", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!h", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static68.aBoolean73 = true;
		Static11.aBoolean16 = true;
	}

	@OriginalMember(owner = "client!h", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	protected abstract void method772();

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
	protected final synchronized void method774() {
		@Pc(14) Container local14;
		if (Static131.aFrame1 == null) {
			local14 = Static9.aClass32_1.anApplet1;
		} else {
			local14 = Static131.aFrame1;
		}
		if (Static24.aCanvas1 != null) {
			Static24.aCanvas1.removeFocusListener(this);
			local14.remove(Static24.aCanvas1);
		}
		Static24.aCanvas1 = new Canvas_Sub1(this);
		local14.add(Static24.aCanvas1);
		Static24.aCanvas1.setSize(Static152.anInt2186, Static5.anInt210);
		Static24.aCanvas1.setVisible(true);
		if (Static131.aFrame1 == null) {
			Static24.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(47) Insets local47 = Static131.aFrame1.getInsets();
			Static24.aCanvas1.setLocation(local47.left, local47.top);
		}
		Static24.aCanvas1.addFocusListener(this);
		Static24.aCanvas1.requestFocus();
		Static11.aBoolean16 = true;
		Static4.aBoolean9 = false;
		Static79.aLong70 = Static143.method2807();
	}

	@OriginalMember(owner = "client!h", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!h", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static68.aBoolean73 = false;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
	private void method775() {
		@Pc(6) long local6 = Static143.method2807();
		@Pc(10) long local10 = Static81.aLongArray5[Static40.anInt1394];
		Static81.aLongArray5[Static40.anInt1394] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local10 >= local6) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static40.anInt1394 = Static40.anInt1394 + 1 & 0x1F;
		synchronized (this) {
			Static167.aBoolean168 = Static68.aBoolean73;
		}
		this.method772();
	}

	@OriginalMember(owner = "client!h", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static131.aFrame1 == null) {
			return Static9.aClass32_1 == null || Static9.aClass32_1.anApplet1 == this ? super.getDocumentBase() : Static9.aClass32_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	protected abstract void method776();

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIB)V")
	protected final void method777(@OriginalArg(3) int arg0) {
		try {
			if (Static116.anApplet_Sub1_1 == null) {
				Static152.anInt2186 = 765;
				Static48.anInt1635 = 483;
				Static5.anInt210 = 503;
				Static116.anApplet_Sub1_1 = this;
				if (Static9.aClass32_1 == null) {
					Static66.aClass32_3 = Static9.aClass32_1 = new Class32(false, this, arg0, null, 0);
				}
				Static9.aClass32_1.method1483(1, this);
			} else {
				Static44.anInt1473++;
				if (Static44.anInt1473 >= 3) {
					this.method764("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(63) Exception local63) {
			Static141.method2762(local63, null);
			this.method764("crash");
		}
	}

	@OriginalMember(owner = "client!h", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static116.anApplet_Sub1_1 != this || Static82.aBoolean95) {
			return;
		}
		Static11.aBoolean16 = true;
		if (Static62.aString3 != null && Static62.aString3.startsWith("1.5") && Static143.method2807() - Static79.aLong70 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static152.anInt2186 && local28.height >= Static5.anInt210) {
				Static4.aBoolean9 = true;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static116.anApplet_Sub1_1 == this && !Static82.aBoolean95) {
			Static85.aLong76 = Static143.method2807();
			Static24.method517(5000L);
			Static66.aClass32_3 = null;
			this.method780();
		}
	}

	@OriginalMember(owner = "client!h", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
	protected abstract void method779();

	@OriginalMember(owner = "client!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)V")
	private synchronized void method780() {
		if (Static82.aBoolean95) {
			return;
		}
		Static82.aBoolean95 = true;
		try {
			Static24.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method767();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static131.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static9.aClass32_1 != null) {
			try {
				Static9.aClass32_1.method1484();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method779();
	}
}
