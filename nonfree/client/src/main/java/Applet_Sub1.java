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

@OriginalClass("client!of")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!of", name = "v", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!of", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static75.aFrame1 == null) {
			return Static71.aClass74_2 == null || Static71.aClass74_2.anApplet1 == this ? super.getDocumentBase() : Static71.aClass74_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!of", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static75.aFrame1 == null) {
			return Static71.aClass74_2 == null || Static71.aClass74_2.anApplet1 == this ? super.getParameter(arg0) : Static71.aClass74_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	protected abstract void method407();

	@OriginalMember(owner = "client!of", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static57.anApplet_Sub1_2 == this && !Static111.aBoolean116) {
			Static5.aLong7 = Static26.method596() + 4000L;
		}
	}

	@OriginalMember(owner = "client!of", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static75.aFrame1 == null) {
			return Static71.aClass74_2 == null || Static71.aClass74_2.anApplet1 == this ? super.getCodeBase() : Static71.aClass74_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static75.aFrame1 == null) {
			return Static71.aClass74_2 == null || Static71.aClass74_2.anApplet1 == this ? super.getAppletContext() : Static71.aClass74_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!of", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static57.anApplet_Sub1_2 != this || Static111.aBoolean116) {
			return;
		}
		Static60.aBoolean54 = true;
		if (Static113.aString3 != null && Static113.aString3.startsWith("1.5") && Static26.method596() - Static23.aLong50 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || Static11.anInt276 <= local27.width && local27.height >= Static77.anInt1676) {
				Static49.aBoolean51 = true;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	private void method408() {
		@Pc(2) long local2 = Static26.method596();
		@Pc(14) long local14 = Static107.aLongArray4[Static71.anInt1491];
		Static107.aLongArray4[Static71.anInt1491] = local2;
		Static71.anInt1491 = Static71.anInt1491 + 1 & 0x1F;
		@Pc(37) boolean local37;
		if (local14 == 0L || local14 >= local2) {
			local37 = false;
		} else {
			local37 = true;
		}
		synchronized (this) {
			Static47.aBoolean50 = Static16.aBoolean12;
		}
		this.method413();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	protected abstract void method409();

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	protected abstract void method410();

	@OriginalMember(owner = "client!of", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static16.aBoolean12 = true;
		Static60.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!of", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!of", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	protected abstract void method413();

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)V")
	protected abstract void method414();

	@OriginalMember(owner = "client!of", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!of", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)Z")
	protected final boolean method416() {
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
				this.method418("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static57.anApplet_Sub1_2 == this && !Static111.aBoolean116) {
			Static5.aLong7 = 0L;
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
	private synchronized void method417() {
		if (Static111.aBoolean116) {
			return;
		}
		Static111.aBoolean116 = true;
		try {
			Static119.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method410();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static75.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static71.aClass74_2 != null) {
			try {
				Static71.aClass74_2.method1820();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method409();
	}

	@OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static113.aString5 != null) {
				@Pc(10) String local10 = Static113.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static113.aString3;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method418("wrongjava");
						return;
					}
					Static100.anInt2322 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static113.aString3 == null || Static113.aString3.equals("1.4.2"))) {
					this.method418("wrongjava");
					return;
				}
			}
			if (Static71.aClass74_2.anApplet1 != null) {
				@Pc(67) Method local67 = Static113.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static71.aClass74_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method421();
			Static15.aClass7_4 = Static3.method37(Static77.anInt1676, Static11.anInt276, Static119.aCanvas1);
			this.method414();
			Static90.aClass19_1 = Static127.method2039();
			Static90.aClass19_1.method1737();
			while (Static5.aLong7 == 0L || Static26.method596() < Static5.aLong7) {
				Static30.anInt821 = Static90.aClass19_1.method1736(Static3.anInt62, Static100.anInt2322);
				for (@Pc(111) int local111 = 0; local111 < Static30.anInt821; local111++) {
					this.method408();
				}
				this.method419();
				Static39.method889(true);
			}
		} catch (@Pc(145) Exception local145) {
			Static120.method1980(null, local145);
			this.method418("crash");
		}
		this.method417();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method418(@OriginalArg(0) String arg0) {
		if (this.aBoolean16) {
			return;
		}
		this.aBoolean16 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!of", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static57.anApplet_Sub1_2 == this && !Static111.aBoolean116) {
			Static5.aLong7 = Static26.method596();
			Static53.method1782(5000L);
			Static68.aClass74_1 = null;
			this.method417();
		}
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	private void method419() {
		@Pc(6) long local6 = Static26.method596();
		@Pc(18) long local18 = Static21.aLongArray1[Static89.anInt514];
		Static21.aLongArray1[Static89.anInt514] = local6;
		if (local18 != 0L && local6 > local18) {
			@Pc(40) int local40 = (int) (local6 - local18);
			Static107.anInt2487 = ((local40 >> 1) + 32000) / local40;
		}
		Static89.anInt514 = Static89.anInt514 + 1 & 0x1F;
		if (Static118.anInt2717++ > 50) {
			Static118.anInt2717 -= 50;
			Static60.aBoolean54 = true;
			Static119.aCanvas1.setSize(Static11.anInt276, Static77.anInt1676);
			Static119.aCanvas1.setVisible(true);
			if (Static75.aFrame1 == null) {
				Static119.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(79) Insets local79 = Static75.aFrame1.getInsets();
				Static119.aCanvas1.setLocation(local79.left, local79.top);
			}
		}
		this.method407();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method420(@OriginalArg(3) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static57.anApplet_Sub1_2 = this;
			Static11.anInt276 = 765;
			Static77.anInt1676 = 503;
			Static100.anInt2319 = 458;
			Static75.aFrame1 = new Frame();
			Static75.aFrame1.setTitle("Jagex");
			Static75.aFrame1.setResizable(false);
			Static75.aFrame1.addWindowListener(this);
			Static75.aFrame1.setVisible(true);
			Static75.aFrame1.toFront();
			@Pc(32) Insets local32 = Static75.aFrame1.getInsets();
			Static75.aFrame1.setSize(local32.left + local32.right + 765, local32.top + 503 - -local32.bottom);
			Static68.aClass74_1 = Static71.aClass74_2 = new Class74(true, null, arg0, arg1, 16);
			Static71.aClass74_2.method1821(1, this);
		} catch (@Pc(68) Exception local68) {
			Static120.method1980(null, local68);
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	protected final synchronized void method421() {
		@Pc(10) Container local10;
		if (Static75.aFrame1 == null) {
			local10 = Static71.aClass74_2.anApplet1;
		} else {
			local10 = Static75.aFrame1;
		}
		if (Static119.aCanvas1 != null) {
			Static119.aCanvas1.removeFocusListener(this);
			local10.remove(Static119.aCanvas1);
		}
		Static119.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static119.aCanvas1);
		Static119.aCanvas1.setSize(Static11.anInt276, Static77.anInt1676);
		Static119.aCanvas1.setVisible(true);
		if (Static75.aFrame1 == null) {
			Static119.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static75.aFrame1.getInsets();
			Static119.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static119.aCanvas1.addFocusListener(this);
		Static119.aCanvas1.requestFocus();
		Static60.aBoolean54 = true;
		Static49.aBoolean51 = false;
		Static23.aLong50 = Static26.method596();
	}

	@OriginalMember(owner = "client!of", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static16.aBoolean12 = false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIII)V")
	protected final void method422(@OriginalArg(3) int arg0) {
		try {
			if (Static57.anApplet_Sub1_2 == null) {
				Static11.anInt276 = 765;
				Static100.anInt2319 = 458;
				Static77.anInt1676 = 503;
				Static57.anApplet_Sub1_2 = this;
				if (Static71.aClass74_2 == null) {
					Static68.aClass74_1 = Static71.aClass74_2 = new Class74(false, this, arg0, null, 0);
				}
				Static71.aClass74_2.method1821(1, this);
			} else {
				Static95.anInt2168++;
				if (Static95.anInt2168 >= 3) {
					this.method418("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static120.method1980(null, local61);
			this.method418("crash");
		}
	}

	@OriginalMember(owner = "client!of", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}
}
