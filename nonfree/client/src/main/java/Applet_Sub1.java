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

@OriginalClass("client!ve")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	private void method648() {
		@Pc(13) long local13 = Static176.method3161();
		@Pc(17) long local17 = Static150.aLongArray7[Static161.anInt3931];
		@Pc(30) boolean local30;
		if (local17 == 0L || local17 >= local13) {
			local30 = false;
		} else {
			local30 = true;
		}
		Static150.aLongArray7[Static161.anInt3931] = local13;
		Static161.anInt3931 = Static161.anInt3931 + 1 & 0x1F;
		synchronized (this) {
			Static52.aBoolean85 = Static117.aBoolean146;
		}
		this.method656();
	}

	@OriginalMember(owner = "client!ve", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	protected abstract void method650();

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBLjava/lang/String;II)V")
	protected final void method651(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static129.anApplet_Sub1_1 = this;
			Static15.anInt1149 = 765;
			Static107.anInt2763 = 503;
			Static32.anInt971 = 481;
			Static29.aFrame1 = new Frame();
			Static29.aFrame1.setTitle("Jagex");
			Static29.aFrame1.setResizable(false);
			Static29.aFrame1.addWindowListener(this);
			Static29.aFrame1.setVisible(true);
			Static29.aFrame1.toFront();
			@Pc(37) Insets local37 = Static29.aFrame1.getInsets();
			Static29.aFrame1.setSize(local37.left + local37.right + 765, local37.bottom + 503 - -local37.top);
			Static111.aClass68_3 = Static123.aClass68_4 = new Class68(true, null, arg0, arg1, 16);
			Static123.aClass68_4.method2525(1, this);
		} catch (@Pc(74) Exception local74) {
			Static146.method2791(local74, null);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIBI)V")
	protected final void method652(@OriginalArg(4) int arg0) {
		try {
			if (Static129.anApplet_Sub1_1 == null) {
				Static32.anInt971 = 481;
				Static15.anInt1149 = 765;
				Static129.anApplet_Sub1_1 = this;
				Static107.anInt2763 = 503;
				if (Static123.aClass68_4 == null) {
					Static111.aClass68_3 = Static123.aClass68_4 = new Class68(false, this, arg0, null, 0);
				}
				Static123.aClass68_4.method2525(1, this);
			} else {
				Static121.anInt3121++;
				if (Static121.anInt3121 >= 3) {
					this.method655("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(62) Exception local62) {
			Static146.method2791(local62, null);
			this.method655("crash");
		}
	}

	@OriginalMember(owner = "client!ve", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static29.aFrame1 == null) {
			return Static123.aClass68_4 == null || Static123.aClass68_4.anApplet1 == this ? super.getDocumentBase() : Static123.aClass68_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static117.aBoolean146 = true;
		Static54.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!ve", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static130.aString5 != null) {
				@Pc(10) String local10 = Static130.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static130.aString3;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method655("wrongjava");
						return;
					}
					Static67.anInt2100 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static130.aString3 == null || Static130.aString3.equals("1.4.2"))) {
					this.method655("wrongjava");
					return;
				}
			}
			if (Static123.aClass68_4.anApplet1 != null) {
				@Pc(67) Method local67 = Static130.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static123.aClass68_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method660();
			Static68.aClass70_1 = Static98.method2683(Static41.aCanvas1, Static15.anInt1149, Static107.anInt2763);
			this.method650();
			Static118.aClass9_1 = Static85.method1973();
			while (Static171.aLong140 == 0L || Static176.method3161() < Static171.aLong140) {
				Static167.anInt4074 = Static118.aClass9_1.method3010(Static123.anInt3178, Static67.anInt2100);
				for (@Pc(108) int local108 = 0; local108 < Static167.anInt4074; local108++) {
					this.method648();
				}
				this.method661();
				Static78.method1816(Static41.aCanvas1, Static123.aClass68_4);
			}
		} catch (@Pc(145) Exception local145) {
			Static146.method2791(local145, null);
			this.method655("crash");
		}
		this.method664();
	}

	@OriginalMember(owner = "client!ve", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static29.aFrame1 == null) {
			return Static123.aClass68_4 == null || Static123.aClass68_4.anApplet1 == this ? super.getAppletContext() : Static123.aClass68_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static129.anApplet_Sub1_1 != this || Static154.aBoolean178) {
			return;
		}
		Static54.aBoolean92 = true;
		if (Static130.aString3 != null && Static130.aString3.startsWith("1.5") && Static176.method3161() - Static126.aLong107 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static15.anInt1149 && local30.height >= Static107.anInt2763) {
				Static172.aBoolean192 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	protected abstract void method654();

	@OriginalMember(owner = "client!ve", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method655(@OriginalArg(1) String arg0) {
		if (this.aBoolean40) {
			return;
		}
		this.aBoolean40 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	protected abstract void method656();

	@OriginalMember(owner = "client!ve", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static129.anApplet_Sub1_1 == this && !Static154.aBoolean178) {
			Static171.aLong140 = Static176.method3161() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ve", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static129.anApplet_Sub1_1 == this && !Static154.aBoolean178) {
			Static171.aLong140 = 0L;
		}
	}

	@OriginalMember(owner = "client!ve", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static29.aFrame1 == null) {
			return Static123.aClass68_4 == null || Static123.aClass68_4.anApplet1 == this ? super.getParameter(arg0) : Static123.aClass68_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	protected abstract void method659();

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	protected final synchronized void method660() {
		@Pc(9) Container local9;
		if (Static29.aFrame1 == null) {
			local9 = Static123.aClass68_4.anApplet1;
		} else {
			local9 = Static29.aFrame1;
		}
		if (Static41.aCanvas1 != null) {
			Static41.aCanvas1.removeFocusListener(this);
			local9.remove(Static41.aCanvas1);
		}
		Static41.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static41.aCanvas1);
		Static41.aCanvas1.setSize(Static15.anInt1149, Static107.anInt2763);
		Static41.aCanvas1.setVisible(true);
		if (Static29.aFrame1 == null) {
			Static41.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(46) Insets local46 = Static29.aFrame1.getInsets();
			Static41.aCanvas1.setLocation(local46.left, local46.top);
		}
		Static41.aCanvas1.addFocusListener(this);
		Static41.aCanvas1.requestFocus();
		Static54.aBoolean92 = true;
		Static172.aBoolean192 = false;
		Static126.aLong107 = Static176.method3161();
	}

	@OriginalMember(owner = "client!ve", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static29.aFrame1 == null) {
			return Static123.aClass68_4 == null || Static123.aClass68_4.anApplet1 == this ? super.getCodeBase() : Static123.aClass68_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	private void method661() {
		@Pc(2) long local2 = Static176.method3161();
		@Pc(6) long local6 = Static136.aLongArray5[Static4.anInt127];
		Static136.aLongArray5[Static4.anInt127] = local2;
		if (local6 != 0L && local2 > local6) {
			@Pc(34) int local34 = (int) (local2 - local6);
			Static42.anInt1183 = ((local34 >> 1) + 32000) / local34;
		}
		Static4.anInt127 = Static4.anInt127 + 1 & 0x1F;
		if (Static162.anInt3948++ > 50) {
			Static162.anInt3948 -= 50;
			Static54.aBoolean92 = true;
			Static41.aCanvas1.setSize(Static15.anInt1149, Static107.anInt2763);
			Static41.aCanvas1.setVisible(true);
			if (Static29.aFrame1 == null) {
				Static41.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(83) Insets local83 = Static29.aFrame1.getInsets();
				Static41.aCanvas1.setLocation(local83.left, local83.top);
			}
		}
		this.method654();
	}

	@OriginalMember(owner = "client!ve", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	protected abstract void method662();

	@OriginalMember(owner = "client!ve", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static129.anApplet_Sub1_1 == this && !Static154.aBoolean178) {
			Static171.aLong140 = Static176.method3161();
			Static65.method1574(5000L);
			Static111.aClass68_3 = null;
			this.method664();
		}
	}

	@OriginalMember(owner = "client!ve", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)Z")
	protected final boolean method663() {
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
				this.method655("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
	private synchronized void method664() {
		if (Static154.aBoolean178) {
			return;
		}
		Static154.aBoolean178 = true;
		try {
			Static41.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method659();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static29.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static123.aClass68_4 != null) {
			try {
				Static123.aClass68_4.method2529();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method662();
	}

	@OriginalMember(owner = "client!ve", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static117.aBoolean146 = false;
	}

	@OriginalMember(owner = "client!ve", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}
}
