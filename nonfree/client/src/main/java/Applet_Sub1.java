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

@OriginalClass("client!o")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Z")
	protected final boolean method869() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.equals("stellardawn.com") || local16.endsWith(".stellardawn.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method871("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	private void method870() {
		@Pc(13) long local13 = Static282.method3962();
		@Pc(17) long local17 = Static142.aLongArray6[Static21.anInt290];
		Static142.aLongArray6[Static21.anInt290] = local13;
		@Pc(36) boolean local36;
		if (local17 == 0L || local17 >= local13) {
			local36 = false;
		} else {
			local36 = true;
		}
		Static21.anInt290 = Static21.anInt290 + 1 & 0x1F;
		synchronized (this) {
			Static265.aBoolean457 = Static198.aBoolean359;
		}
		this.method872();
	}

	@OriginalMember(owner = "client!o", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static198.aBoolean359 = true;
		Static100.aBoolean189 = true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method871(@OriginalArg(1) String arg0) {
		if (this.aBoolean88) {
			return;
		}
		this.aBoolean88 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static458.method2593(Static206.aClass66_4.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	protected abstract void method872();

	@OriginalMember(owner = "client!o", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static437.anApplet_Sub1_2 == this && !Static438.aBoolean675) {
			Static173.aLong118 = 0L;
		}
	}

	@OriginalMember(owner = "client!o", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static226.aFrame1 == null) {
			return Static206.aClass66_4 == null || Static206.aClass66_4.anApplet1 == this ? super.getAppletContext() : Static206.aClass66_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public final synchronized void method874() {
		if (Static273.aCanvas5 != null) {
			Static273.aCanvas5.removeFocusListener(this);
			Static273.aCanvas5.getParent().remove(Static273.aCanvas5);
		}
		@Pc(18) Container local18;
		if (Static320.aFrame3 != null) {
			local18 = Static320.aFrame3;
		} else if (Static226.aFrame1 == null) {
			local18 = Static206.aClass66_4.anApplet1;
		} else {
			local18 = Static226.aFrame1;
		}
		local18.setLayout(null);
		Static273.aCanvas5 = new Canvas_Sub1(this);
		local18.add(Static273.aCanvas5);
		Static273.aCanvas5.setSize(Static141.anInt2881, Static302.anInt5346);
		Static273.aCanvas5.setVisible(true);
		if (local18 == Static226.aFrame1) {
			@Pc(60) Insets local60 = Static226.aFrame1.getInsets();
			Static273.aCanvas5.setLocation(Static230.anInt4424 + local60.left, local60.top + Static303.anInt5363);
		} else {
			Static273.aCanvas5.setLocation(Static230.anInt4424, Static303.anInt5363);
		}
		Static273.aCanvas5.addFocusListener(this);
		Static273.aCanvas5.requestFocus();
		Static198.aBoolean359 = true;
		Static265.aBoolean457 = true;
		Static100.aBoolean189 = true;
		Static84.aBoolean383 = false;
		Static83.aLong59 = Static282.method3962();
	}

	@OriginalMember(owner = "client!o", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static437.anApplet_Sub1_2 != this || Static438.aBoolean675) {
			return;
		}
		Static100.aBoolean189 = true;
		if (Static263.aBoolean455 && Static282.method3962() - Static83.aLong59 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static425.anInt7000 <= local24.width && Static17.anInt222 <= local24.height) {
				Static84.aBoolean383 = true;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static226.aFrame1 == null) {
			return Static206.aClass66_4 == null || Static206.aClass66_4.anApplet1 == this ? super.getParameter(arg0) : Static206.aClass66_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static437.anApplet_Sub1_2 == this && !Static438.aBoolean675) {
			Static173.aLong118 = Static282.method3962() + 4000L;
		}
	}

	@OriginalMember(owner = "client!o", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!o", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZZ)V")
	private void method876(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static438.aBoolean675) {
				return;
			}
			Static438.aBoolean675 = true;
		}
		if (Static206.aClass66_4.anApplet1 != null) {
			Static206.aClass66_4.anApplet1.destroy();
		}
		try {
			this.method886();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean89) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean89 = false;
		}
		@Pc(48) Class199 local48 = Static206.aClass66_4.method1746(Static437.anApplet_Sub1_2.getClass());
		while (local48.anInt5760 == 0) {
			Static435.method5503(100L);
		}
		if (Static273.aCanvas5 != null) {
			try {
				Static273.aCanvas5.removeFocusListener(this);
				Static273.aCanvas5.getParent().remove(Static273.aCanvas5);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static206.aClass66_4 != null) {
			try {
				Static206.aClass66_4.method1732();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method880();
		if (Static226.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public final void method877() {
		if (this.aBoolean89) {
			return;
		}
		try {
			@Pc(22) Class199 local22 = Static206.aClass66_4.method1736(Static437.anApplet_Sub1_2.getClass());
			while (local22.anInt5760 == 0) {
				Static435.method5503(100L);
			}
			if (local22.anObject29 != null) {
				throw (Throwable) local22.anObject29;
			}
			jagmisc.init();
			this.aBoolean89 = true;
			Static63.aClass36_1 = Static337.method4580();
		} catch (@Pc(50) Throwable local50) {
		}
	}

	@OriginalMember(owner = "client!o", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static437.anApplet_Sub1_2 == this && !Static438.aBoolean675) {
			Static173.aLong118 = Static282.method3962();
			Static435.method5503(5000L);
			Static386.aClass66_5 = null;
			this.method876(false);
		}
	}

	@OriginalMember(owner = "client!o", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static198.aBoolean359 = false;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	protected abstract void method880();

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIB)V")
	protected final void method881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static437.anApplet_Sub1_2 == null) {
				Static303.anInt5363 = 0;
				Static230.anInt4424 = 0;
				Static437.anApplet_Sub1_2 = this;
				Static302.anInt5346 = arg1;
				Static17.anInt222 = arg1;
				Static13.anInt178 = 592;
				Static141.anInt2881 = arg2;
				Static425.anInt7000 = arg2;
				if (Static206.aClass66_4 == null) {
					Static386.aClass66_5 = Static206.aClass66_4 = new Class66(this, arg0, null, 0);
				}
				@Pc(67) Class199 local67 = Static206.aClass66_4.method1741(1, this);
				while (local67.anInt5760 == 0) {
					Static435.method5503(10L);
				}
			} else {
				Static406.anInt6704++;
				if (Static406.anInt6704 >= 3) {
					this.method871("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static94.method1654(local80, null);
			this.method871("crash");
		}
	}

	@OriginalMember(owner = "client!o", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	protected abstract void method883();

	@OriginalMember(owner = "client!o", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static98.aString23 != null) {
					@Pc(10) String local10 = Static98.aString23.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(40) String local40 = Static98.aString24;
						if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
							this.method871("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static98.aString24 == null || Static98.aString24.equals("1.4.2"))) {
						this.method871("wrongjava");
						break label107;
					}
				}
				@Pc(70) int local70;
				if (Static98.aString24 != null && Static98.aString24.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static98.aString24.length() > local70) {
						@Pc(78) char local78 = Static98.aString24.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local72 * 10 + local78 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Static263.aBoolean455 = true;
					}
				}
				if (Static206.aClass66_4.anApplet1 != null) {
					@Pc(114) Method local114 = Static98.aMethod2;
					if (local114 != null) {
						try {
							local114.invoke(Static206.aClass66_4.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static324.method4384();
				Static112.method2036();
				this.method874();
				this.method883();
				Static63.aClass36_1 = Static337.method4580();
				this.method877();
				while (Static173.aLong118 == 0L || Static282.method3962() < Static173.aLong118) {
					Static411.anInt6741 = Static63.aClass36_1.method2253(Static243.anInt4535);
					for (local70 = 0; local70 < Static411.anInt6741; local70++) {
						this.method870();
					}
					this.method892();
					Static441.method5566(Static206.aClass66_4, Static273.aCanvas5);
				}
			}
		} catch (@Pc(190) Throwable local190) {
			Static94.method1654(local190, this.method887());
			this.method871("crash");
		}
		this.method876(true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
	protected final void method885(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static141.anInt2881 = 1024;
			Static425.anInt7000 = 1024;
			Static303.anInt5363 = 0;
			Static230.anInt4424 = 0;
			Static13.anInt178 = 592;
			Static302.anInt5346 = 768;
			Static17.anInt222 = 768;
			Static437.anApplet_Sub1_2 = this;
			Static226.aFrame1 = new Frame();
			Static226.aFrame1.setTitle("Jagex");
			Static226.aFrame1.setResizable(true);
			Static226.aFrame1.addWindowListener(this);
			Static226.aFrame1.setVisible(true);
			Static226.aFrame1.toFront();
			@Pc(38) Insets local38 = Static226.aFrame1.getInsets();
			Static226.aFrame1.setSize(local38.right + Static425.anInt7000 + local38.left, local38.bottom + Static17.anInt222 + local38.top);
			Static386.aClass66_5 = Static206.aClass66_4 = new Class66(null, arg1, arg0, 30);
			@Pc(70) Class199 local70 = Static206.aClass66_4.method1741(1, this);
			while (local70.anInt5760 == 0) {
				Static435.method5503(10L);
			}
		} catch (@Pc(83) Exception local83) {
			Static94.method1654(local83, null);
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
	protected abstract void method886();

	@OriginalMember(owner = "client!o", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(B)Ljava/lang/String;")
	protected String method887() {
		return null;
	}

	@OriginalMember(owner = "client!o", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static226.aFrame1 == null) {
			return Static206.aClass66_4 == null || Static206.aClass66_4.anApplet1 == this ? super.getDocumentBase() : Static206.aClass66_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!o", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static226.aFrame1 == null) {
			return Static206.aClass66_4 == null || Static206.aClass66_4.anApplet1 == this ? super.getCodeBase() : Static206.aClass66_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	protected abstract void method891();

	@OriginalMember(owner = "client!o", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!o", name = "h", descriptor = "(I)V")
	private void method892() {
		@Pc(10) long local10 = Static282.method3962();
		@Pc(14) long local14 = Static347.aLongArray8[Static406.anInt6705];
		Static347.aLongArray8[Static406.anInt6705] = local10;
		if (local14 != 0L && local10 > local14) {
			@Pc(38) int local38 = (int) (local10 - local14);
			Static213.anInt3956 = ((local38 >> 1) + 32000) / local38;
		}
		Static406.anInt6705 = Static406.anInt6705 + 1 & 0x1F;
		if (Static452.anInt7357++ > 50) {
			Static452.anInt7357 -= 50;
			Static100.aBoolean189 = true;
			Static273.aCanvas5.setSize(Static141.anInt2881, Static302.anInt5346);
			Static273.aCanvas5.setVisible(true);
			if (Static226.aFrame1 != null && Static320.aFrame3 == null) {
				@Pc(86) Insets local86 = Static226.aFrame1.getInsets();
				Static273.aCanvas5.setLocation(Static230.anInt4424 + local86.left, local86.top - -Static303.anInt5363);
			} else {
				Static273.aCanvas5.setLocation(Static230.anInt4424, Static303.anInt5363);
			}
		}
		this.method891();
	}
}
