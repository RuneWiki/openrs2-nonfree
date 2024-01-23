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

@OriginalClass("client!lb")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!lb", name = "providesignlink", descriptor = "(Lclient!d;)V")
	public static void providesignlink(@OriginalArg(0) Class28 arg0) {
		Static38.aClass28_1 = arg0;
		Static150.aClass28_5 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static172.aBoolean195 = false;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	protected abstract void method685();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method686(@OriginalArg(0) String arg0) {
		if (this.aBoolean58) {
			return;
		}
		this.aBoolean58 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static267.method82("loggedout", Static38.aClass28_1.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!lb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static42.aFrame1 == null) {
			return Static38.aClass28_1 == null || Static38.aClass28_1.anApplet1 == this ? super.getParameter(arg0) : Static38.aClass28_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	protected final void method687(@OriginalArg(4) int arg0) {
		try {
			if (Static55.anApplet_Sub1_1 == null) {
				Static55.anApplet_Sub1_1 = this;
				Static92.anInt2555 = 535;
				Static123.anInt1284 = 0;
				Static251.anInt5352 = 503;
				Static39.anInt1098 = 503;
				Static200.anInt4411 = 765;
				Static101.anInt2760 = 765;
				Static58.anInt1620 = 0;
				@Pc(51) String local51 = this.getParameter("openwinjs");
				@Pc(58) boolean local58;
				if (local51 != null && local51.equals("1")) {
					local58 = true;
				} else {
					local58 = false;
				}
				if (Static38.aClass28_1 == null) {
					Static150.aClass28_5 = Static38.aClass28_1 = new Class28(this, arg0, null, 0);
				}
				@Pc(79) Class145 local79 = Static38.aClass28_1.method719(this, 1);
				while (local79.anInt5354 == 0) {
					Static30.method587(10L);
				}
			} else {
				Static74.anInt2013++;
				if (Static74.anInt2013 >= 3) {
					this.method686("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(89) Exception local89) {
			Static57.method1101(null, local89);
			this.method686("crash");
		}
	}

	@OriginalMember(owner = "client!lb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lb", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static55.anApplet_Sub1_1 == this && !Static15.aBoolean30) {
			Static52.aLong45 = Static31.method591() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static42.aFrame1 == null) {
			return Static38.aClass28_1 == null || Static38.aClass28_1.anApplet1 == this ? super.getAppletContext() : Static38.aClass28_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V")
	private void method688(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static15.aBoolean30) {
				return;
			}
			Static15.aBoolean30 = true;
		}
		if (Static38.aClass28_1.anApplet1 != null) {
			Static38.aClass28_1.anApplet1.destroy();
		}
		try {
			this.method690();
		} catch (@Pc(31) Exception local31) {
		}
		if (Static98.aCanvas1 != null) {
			try {
				Static98.aCanvas1.removeFocusListener(this);
				Static98.aCanvas1.getParent().remove(Static98.aCanvas1);
			} catch (@Pc(46) Exception local46) {
			}
		}
		if (Static38.aClass28_1 != null) {
			try {
				Static38.aClass28_1.method722();
			} catch (@Pc(54) Exception local54) {
			}
		}
		this.method696();
		if (Static42.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(64) Throwable local64) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!lb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static42.aFrame1 == null) {
			return Static38.aClass28_1 == null || Static38.aClass28_1.anApplet1 == this ? super.getDocumentBase() : Static38.aClass28_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static42.aFrame1 == null) {
			return Static38.aClass28_1 == null || Static38.aClass28_1.anApplet1 == this ? super.getCodeBase() : Static38.aClass28_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static172.aBoolean195 = true;
		Static122.aBoolean170 = true;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
	protected abstract void method690();

	@OriginalMember(owner = "client!lb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static55.anApplet_Sub1_1 != this || Static15.aBoolean30) {
			return;
		}
		Static122.aBoolean170 = true;
		if (Static137.aBoolean178 && Static31.method591() - Static137.aLong106 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static101.anInt2760 && local24.height >= Static39.anInt1098) {
				Static64.aBoolean99 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V")
	protected abstract void method692();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	private void method693() {
		@Pc(11) long local11 = Static31.method591();
		@Pc(15) long local15 = Static13.aLongArray3[Static184.anInt4177];
		@Pc(30) boolean local30;
		if (local15 == 0L || local11 <= local15) {
			local30 = false;
		} else {
			local30 = true;
		}
		Static13.aLongArray3[Static184.anInt4177] = local11;
		Static184.anInt4177 = Static184.anInt4177 + 1 & 0x1F;
		synchronized (this) {
			Static33.aBoolean264 = Static172.aBoolean195;
		}
		this.method700();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZILjava/lang/String;IIZII)V")
	protected final void method694(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static200.anInt4411 = 1024;
			Static101.anInt2760 = 1024;
			Static123.anInt1284 = 0;
			Static58.anInt1620 = 0;
			Static251.anInt5352 = 768;
			Static39.anInt1098 = 768;
			Static92.anInt2555 = 535;
			Static55.anApplet_Sub1_1 = this;
			Static42.aFrame1 = new Frame();
			Static42.aFrame1.setTitle("Jagex");
			Static42.aFrame1.setResizable(true);
			Static42.aFrame1.addWindowListener(this);
			Static42.aFrame1.setVisible(true);
			Static42.aFrame1.toFront();
			@Pc(42) Insets local42 = Static42.aFrame1.getInsets();
			Static42.aFrame1.setSize(local42.left + Static101.anInt2760 + local42.right, local42.bottom + Static39.anInt1098 + local42.top);
			Static150.aClass28_5 = Static38.aClass28_1 = new Class28(null, arg1, arg0, 29);
			@Pc(74) Class145 local74 = Static38.aClass28_1.method719(this, 1);
			while (local74.anInt5354 == 0) {
				Static30.method587(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static57.method1101(null, local87);
		}
	}

	@OriginalMember(owner = "client!lb", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static55.anApplet_Sub1_1 == this && !Static15.aBoolean30) {
			Static52.aLong45 = Static31.method591();
			Static30.method587(5000L);
			Static150.aClass28_5 = null;
			this.method688(false);
		}
	}

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
	private void method695() {
		@Pc(2) long local2 = Static31.method591();
		@Pc(10) long local10 = Static233.aLongArray35[Static208.anInt4573];
		Static233.aLongArray35[Static208.anInt4573] = local2;
		Static208.anInt4573 = Static208.anInt4573 + 1 & 0x1F;
		if (local10 != 0L && local10 < local2) {
			@Pc(38) int local38 = (int) (local2 - local10);
			Static43.anInt1294 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static42.anInt1188++ > 50) {
			Static42.anInt1188 -= 50;
			Static122.aBoolean170 = true;
			Static98.aCanvas1.setSize(Static200.anInt4411, Static251.anInt5352);
			Static98.aCanvas1.setVisible(true);
			if (Static42.aFrame1 != null && Static88.aFrame2 == null) {
				@Pc(75) Insets local75 = Static42.aFrame1.getInsets();
				Static98.aCanvas1.setLocation(Static58.anInt1620 + local75.left, local75.top - -Static123.anInt1284);
			} else {
				Static98.aCanvas1.setLocation(Static58.anInt1620, Static123.anInt1284);
			}
		}
		this.method685();
	}

	@OriginalMember(owner = "client!lb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	protected abstract void method696();

	@OriginalMember(owner = "client!lb", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static55.anApplet_Sub1_1 == this && !Static15.aBoolean30) {
			Static52.aLong45 = 0L;
		}
	}

	@OriginalMember(owner = "client!lb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	public final synchronized void method698() {
		if (Static98.aCanvas1 != null) {
			Static98.aCanvas1.removeFocusListener(this);
			Static98.aCanvas1.getParent().remove(Static98.aCanvas1);
		}
		@Pc(18) Container local18;
		if (Static88.aFrame2 != null) {
			local18 = Static88.aFrame2;
		} else if (Static42.aFrame1 == null) {
			local18 = Static38.aClass28_1.anApplet1;
		} else {
			local18 = Static42.aFrame1;
		}
		local18.setLayout(null);
		Static98.aCanvas1 = new Canvas_Sub1(this);
		local18.add(Static98.aCanvas1);
		Static98.aCanvas1.setSize(Static200.anInt4411, Static251.anInt5352);
		Static98.aCanvas1.setVisible(true);
		if (Static42.aFrame1 == local18) {
			@Pc(68) Insets local68 = Static42.aFrame1.getInsets();
			Static98.aCanvas1.setLocation(local68.left + Static58.anInt1620, local68.top + Static123.anInt1284);
		} else {
			Static98.aCanvas1.setLocation(Static58.anInt1620, Static123.anInt1284);
		}
		Static98.aCanvas1.addFocusListener(this);
		Static98.aCanvas1.requestFocus();
		Static33.aBoolean264 = true;
		Static172.aBoolean195 = true;
		Static122.aBoolean170 = true;
		Static64.aBoolean99 = false;
		Static137.aLong106 = Static31.method591();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)Z")
	protected final boolean method699() {
		@Pc(21) String local21 = this.getDocumentBase().getHost().toLowerCase();
		if (local21.equals("jagex.com") || local21.endsWith(".jagex.com")) {
			return true;
		} else if (local21.equals("runescape.com") || local21.endsWith(".runescape.com")) {
			return true;
		} else if (local21.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local21.length() > 0 && local21.charAt(local21.length() - 1) >= '0' && local21.charAt(local21.length() - 1) <= '9') {
				local21 = local21.substring(0, local21.length() - 1);
			}
			if (local21.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method686("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	protected abstract void method700();

	@OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static40.aString55 != null) {
				@Pc(10) String local10 = Static40.aString55.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static40.aString57;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method686("wrongjava");
						return;
					}
					Static149.anInt3581 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static40.aString57 == null || Static40.aString57.equals("1.4.2"))) {
					this.method686("wrongjava");
					return;
				}
			}
			@Pc(71) int local71;
			if (Static40.aString57 != null && Static40.aString57.startsWith("1.")) {
				local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static40.aString57.length()) {
					@Pc(79) char local79 = Static40.aString57.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local79 + local73 * 10 - 48;
					local71++;
				}
				if (local73 >= 5) {
					Static137.aBoolean178 = true;
				}
			}
			if (Static38.aClass28_1.anApplet1 != null) {
				@Pc(117) Method local117 = Static40.aMethod1;
				if (local117 != null) {
					try {
						local117.invoke(Static38.aClass28_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(132) Throwable local132) {
					}
				}
			}
			Static251.method4066();
			this.method698();
			Static193.aClass73_1 = Static146.method2664(Static98.aCanvas1, Static200.anInt4411, Static251.anInt5352);
			this.method692();
			Static4.aClass68_1 = Static12.method225();
			while (Static52.aLong45 == 0L || Static31.method591() < Static52.aLong45) {
				Static260.anInt2794 = Static4.aClass68_1.method2537(Static149.anInt3581, Static242.anInt5230);
				for (local71 = 0; local71 < Static260.anInt2794; local71++) {
					this.method693();
				}
				this.method695();
				Static226.method3733(Static98.aCanvas1, Static38.aClass28_1);
			}
		} catch (@Pc(197) Exception local197) {
			Static57.method1101(null, local197);
			this.method686("crash");
		}
		this.method688(true);
	}
}
