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

@OriginalClass("client!ii")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Z")
	private boolean aBoolean58 = false;

	static {
		new Class85("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!ii", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static60.aFrame3 == null) {
			return Static182.aClass139_5 == null || Static182.aClass139_5.anApplet1 == this ? super.getParameter(arg0) : Static182.aClass139_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	protected abstract void method687();

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	protected abstract void method688();

	@OriginalMember(owner = "client!ii", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static257.anApplet_Sub1_1 == this && !Static204.aBoolean333) {
			Static251.aLong167 = Static340.method5863() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
	protected abstract void method689();

	@OriginalMember(owner = "client!ii", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIIII)V")
	protected final void method690(@OriginalArg(2) int arg0) {
		try {
			if (Static257.anApplet_Sub1_1 == null) {
				Static256.anInt5066 = 503;
				Static32.anInt632 = 503;
				Static134.anInt2040 = 0;
				Static257.anApplet_Sub1_1 = this;
				Static168.anInt3376 = 765;
				Static1.anInt9 = 765;
				Static146.anInt2896 = 565;
				Static84.anInt4252 = 0;
				if (Static182.aClass139_5 == null) {
					Static14.aClass139_1 = Static182.aClass139_5 = new Class139(this, arg0, null, 0);
				}
				@Pc(68) Class16 local68 = Static182.aClass139_5.method3855(this, 1);
				while (local68.anInt381 == 0) {
					Static20.method408(10L);
				}
			} else {
				Static322.anInt612++;
				if (Static322.anInt612 >= 3) {
					this.method700("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Exception local81) {
			Static114.method1992(local81, null);
			this.method700("crash");
		}
	}

	@OriginalMember(owner = "client!ii", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static257.anApplet_Sub1_1 != this || Static204.aBoolean333) {
			return;
		}
		Static78.aBoolean102 = true;
		if (Static287.aBoolean469 && Static340.method5863() - Static312.aLong211 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || Static1.anInt9 <= local23.width && local23.height >= Static32.anInt632) {
				Static57.aBoolean492 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	protected abstract void method691();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	protected abstract void method692();

	@OriginalMember(owner = "client!ii", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static35.aBoolean44 = false;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BZIIILjava/lang/String;II)V")
	protected final void method693(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static84.anInt4252 = 0;
			Static257.anApplet_Sub1_1 = this;
			Static256.anInt5066 = 768;
			Static32.anInt632 = 768;
			Static134.anInt2040 = 0;
			Static168.anInt3376 = 1024;
			Static1.anInt9 = 1024;
			Static146.anInt2896 = 565;
			Static60.aFrame3 = new Frame();
			Static60.aFrame3.setTitle("Jagex");
			Static60.aFrame3.setResizable(true);
			Static60.aFrame3.addWindowListener(this);
			Static60.aFrame3.setVisible(true);
			Static60.aFrame3.toFront();
			@Pc(42) Insets local42 = Static60.aFrame3.getInsets();
			Static60.aFrame3.setSize(Static1.anInt9 + local42.left + local42.right, local42.bottom + local42.top + Static32.anInt632);
			Static14.aClass139_1 = Static182.aClass139_5 = new Class139(null, arg0, arg1, 29);
			@Pc(76) Class16 local76 = Static182.aClass139_5.method3855(this, 1);
			while (local76.anInt381 == 0) {
				Static20.method408(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static114.method1992(local86, null);
		}
	}

	@OriginalMember(owner = "client!ii", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static257.anApplet_Sub1_1 == this && !Static204.aBoolean333) {
			Static251.aLong167 = 0L;
		}
	}

	@OriginalMember(owner = "client!ii", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static60.aFrame3 == null) {
			return Static182.aClass139_5 == null || Static182.aClass139_5.anApplet1 == this ? super.getAppletContext() : Static182.aClass139_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	public final synchronized void method695() {
		if (Static102.aCanvas3 != null) {
			Static102.aCanvas3.removeFocusListener(this);
			Static102.aCanvas3.getParent().remove(Static102.aCanvas3);
		}
		@Pc(16) Container local16;
		if (Static110.aFrame4 != null) {
			local16 = Static110.aFrame4;
		} else if (Static60.aFrame3 == null) {
			local16 = Static182.aClass139_5.anApplet1;
		} else {
			local16 = Static60.aFrame3;
		}
		local16.setLayout(null);
		Static102.aCanvas3 = new Canvas_Sub1(this);
		local16.add(Static102.aCanvas3);
		Static102.aCanvas3.setSize(Static168.anInt3376, Static256.anInt5066);
		Static102.aCanvas3.setVisible(true);
		if (Static60.aFrame3 == local16) {
			@Pc(61) Insets local61 = Static60.aFrame3.getInsets();
			Static102.aCanvas3.setLocation(Static84.anInt4252 + local61.left, local61.top - -Static134.anInt2040);
		} else {
			Static102.aCanvas3.setLocation(Static84.anInt4252, Static134.anInt2040);
		}
		Static102.aCanvas3.addFocusListener(this);
		Static102.aCanvas3.requestFocus();
		Static35.aBoolean44 = true;
		Static87.aBoolean113 = true;
		Static78.aBoolean102 = true;
		Static57.aBoolean492 = false;
		Static312.aLong211 = Static340.method5863();
	}

	@OriginalMember(owner = "client!ii", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static257.anApplet_Sub1_1 == this && !Static204.aBoolean333) {
			Static251.aLong167 = Static340.method5863();
			Static20.method408(5000L);
			Static14.aClass139_1 = null;
			this.method697(false);
		}
	}

	@OriginalMember(owner = "client!ii", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ii", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static60.aFrame3 == null) {
			return Static182.aClass139_5 == null || Static182.aClass139_5.anApplet1 == this ? super.getCodeBase() : Static182.aClass139_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static210.aString30 != null) {
					@Pc(10) String local10 = Static210.aString30.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(22) String local22 = Static210.aString35;
						if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
							this.method700("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static210.aString35 == null || Static210.aString35.equals("1.4.2"))) {
						this.method700("wrongjava");
						break label111;
					}
				}
				@Pc(69) int local69;
				if (Static210.aString35 != null && Static210.aString35.startsWith("1.")) {
					local69 = 2;
					@Pc(71) int local71 = 0;
					while (Static210.aString35.length() > local69) {
						@Pc(77) char local77 = Static210.aString35.charAt(local69);
						if (local77 < '0' || local77 > '9') {
							break;
						}
						local69++;
						local71 = local77 + local71 * 10 - 48;
					}
					if (local71 >= 5) {
						Static287.aBoolean469 = true;
					}
				}
				if (Static182.aClass139_5.anApplet1 != null) {
					@Pc(115) Method local115 = Static210.aMethod1;
					if (local115 != null) {
						try {
							local115.invoke(Static182.aClass139_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(130) Throwable local130) {
						}
					}
				}
				Static311.method3255();
				Static342.method5875();
				this.method695();
				this.method689();
				Static185.aClass10_1 = Static22.method443();
				this.method703();
				while (Static251.aLong167 == 0L || Static251.aLong167 > Static340.method5863()) {
					Static88.anInt1650 = Static185.aClass10_1.method3935(Static102.anInt1950);
					for (local69 = 0; local69 < Static88.anInt1650; local69++) {
						this.method696();
					}
					this.method699();
					Static131.method2335(Static182.aClass139_5, Static102.aCanvas3);
				}
			}
		} catch (@Pc(189) Exception local189) {
			Static114.method1992(local189, null);
			this.method700("crash");
		}
		this.method697(true);
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
	private void method696() {
		@Pc(6) long local6 = Static340.method5863();
		@Pc(15) long local15 = Static131.aLongArray2[Static28.anInt710];
		Static131.aLongArray2[Static28.anInt710] = local6;
		@Pc(28) boolean local28;
		if (local15 == 0L || local15 >= local6) {
			local28 = false;
		} else {
			local28 = true;
		}
		Static28.anInt710 = Static28.anInt710 + 1 & 0x1F;
		synchronized (this) {
			Static87.aBoolean113 = Static35.aBoolean44;
		}
		this.method688();
	}

	@OriginalMember(owner = "client!ii", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static35.aBoolean44 = true;
		Static78.aBoolean102 = true;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V")
	private void method697(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static204.aBoolean333) {
				return;
			}
			Static204.aBoolean333 = true;
		}
		if (Static182.aClass139_5.anApplet1 != null) {
			Static182.aClass139_5.anApplet1.destroy();
		}
		try {
			this.method692();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean58) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean58 = false;
		}
		@Pc(55) Class16 local55 = Static182.aClass139_5.method3876(Static257.anApplet_Sub1_1.getClass());
		while (local55.anInt381 == 0) {
			Static20.method408(100L);
		}
		if (Static102.aCanvas3 != null) {
			try {
				Static102.aCanvas3.removeFocusListener(this);
				Static102.aCanvas3.getParent().remove(Static102.aCanvas3);
			} catch (@Pc(77) Exception local77) {
			}
		}
		if (Static182.aClass139_5 != null) {
			try {
				Static182.aClass139_5.method3859();
			} catch (@Pc(85) Exception local85) {
			}
		}
		this.method687();
		if (Static60.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(95) Throwable local95) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ii", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static60.aFrame3 == null) {
			return Static182.aClass139_5 == null || Static182.aClass139_5.anApplet1 == this ? super.getDocumentBase() : Static182.aClass139_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
	private void method699() {
		@Pc(12) long local12 = Static340.method5863();
		@Pc(16) long local16 = Static343.aLongArray8[Static36.anInt654];
		Static343.aLongArray8[Static36.anInt654] = local12;
		Static36.anInt654 = Static36.anInt654 + 1 & 0x1F;
		if (local16 != 0L && local16 < local12) {
			@Pc(40) int local40 = (int) (local12 - local16);
			Static205.anInt4080 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static121.anInt2269++ > 50) {
			Static121.anInt2269 -= 50;
			Static78.aBoolean102 = true;
			Static102.aCanvas3.setSize(Static168.anInt3376, Static256.anInt5066);
			Static102.aCanvas3.setVisible(true);
			if (Static60.aFrame3 != null && Static110.aFrame4 == null) {
				@Pc(84) Insets local84 = Static60.aFrame3.getInsets();
				Static102.aCanvas3.setLocation(Static84.anInt4252 + local84.left, Static134.anInt2040 + local84.top);
			} else {
				Static102.aCanvas3.setLocation(Static84.anInt4252, Static134.anInt2040);
			}
		}
		this.method691();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method700(@OriginalArg(0) String arg0) {
		if (this.aBoolean57) {
			return;
		}
		this.aBoolean57 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static370.method5989(Static182.aClass139_5.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)Z")
	protected final boolean method701() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.equals("stellardawn.com") || local8.endsWith(".stellardawn.com")) {
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
				this.method700("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ii", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	public final void method703() {
		if (this.aBoolean58) {
			return;
		}
		try {
			@Pc(14) Class16 local14 = Static182.aClass139_5.method3874(Static257.anApplet_Sub1_1.getClass());
			while (local14.anInt381 == 0) {
				Static20.method408(100L);
			}
			if (local14.anObject1 != null) {
				throw (Throwable) local14.anObject1;
			}
			jagmisc.init();
			this.aBoolean58 = true;
			Static185.aClass10_1 = Static22.method443();
		} catch (@Pc(44) Throwable local44) {
		}
	}
}
