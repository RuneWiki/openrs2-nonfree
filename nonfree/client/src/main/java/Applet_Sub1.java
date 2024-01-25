import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!ue")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!ue", name = "s", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ue", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static635.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z")
	public final boolean method2115() {
		return Static362.method5843("jagmisc");
	}

	@OriginalMember(owner = "client!ue", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Z")
	public final boolean method2117() {
		return Static362.method5843("jaclib");
	}

	@OriginalMember(owner = "client!ue", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static560.anApplet_Sub1_1 == this && !Static340.aBoolean543) {
			Static338.aLong184 = Static582.method8056();
			Static344.method5698(5000L);
			Static457.aClass104_3 = null;
			this.method2133(false);
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z")
	public final boolean method2118() {
		return Static362.method5843("jagtheora");
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method2119(@OriginalArg(1) int arg0, @OriginalArg(4) String arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static560.anApplet_Sub1_1 == null) {
				Static305.anInt6170 = 637;
				Static253.anApplet1 = Static635.anApplet2;
				Static294.anInt6026 = arg3;
				Static351.anInt6858 = arg3;
				Static277.anInt5899 = arg0;
				Static59.anInt1894 = arg0;
				Static184.anInt4050 = 0;
				Static354.anInt6878 = 0;
				Static560.anApplet_Sub1_1 = this;
				Static457.aClass104_3 = Static496.aClass104_4 = new Class104(arg2, arg1, 37, Static635.anApplet2 != null);
				@Pc(72) Class159 local72 = Static496.aClass104_4.method3127(1, this);
				while (local72.anInt5910 == 0) {
					Static344.method5698(10L);
				}
			} else {
				Static458.anInt8217++;
				if (Static458.anInt8217 >= 3) {
					this.method2132("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(85) Throwable local85) {
			Static358.method5809(local85, (String) null);
			this.method2132("crash");
		}
	}

	@OriginalMember(owner = "client!ue", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static500.aFrame9 == null) {
			return Static635.anApplet2 == null || Static635.anApplet2 == this ? super.getParameter(arg0) : Static635.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	private void method2120() {
		@Pc(11) long local11 = Static582.method8056();
		@Pc(15) long local15 = Static476.aLongArray8[Static515.anInt8986];
		Static476.aLongArray8[Static515.anInt8986] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local11 <= local15) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static515.anInt8986 = Static515.anInt8986 + 1 & 0x1F;
		synchronized (this) {
			Static8.aBoolean55 = Static292.aBoolean471;
		}
		this.method2121();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	protected abstract void method2121();

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public synchronized void method2122() {
		if (Static428.aCanvas12 != null) {
			Static428.aCanvas12.removeFocusListener(this);
			Static428.aCanvas12.getParent().setBackground(Color.black);
			Static428.aCanvas12.getParent().remove(Static428.aCanvas12);
		}
		@Pc(22) Container local22;
		if (Static224.aFrame5 != null) {
			local22 = Static224.aFrame5;
		} else if (Static500.aFrame9 != null) {
			local22 = Static500.aFrame9;
		} else if (Static635.anApplet2 == null) {
			local22 = Static560.anApplet_Sub1_1;
		} else {
			local22 = Static635.anApplet2;
		}
		local22.setLayout((LayoutManager) null);
		Static428.aCanvas12 = new Canvas_Sub1(this);
		local22.add(Static428.aCanvas12);
		Static428.aCanvas12.setSize(Static294.anInt6026, Static277.anInt5899);
		Static428.aCanvas12.setVisible(true);
		if (Static500.aFrame9 == local22) {
			@Pc(69) Insets local69 = Static500.aFrame9.getInsets();
			Static428.aCanvas12.setLocation(Static184.anInt4050 + local69.left, Static354.anInt6878 + local69.top);
		} else {
			Static428.aCanvas12.setLocation(Static184.anInt4050, Static354.anInt6878);
		}
		Static428.aCanvas12.addFocusListener(this);
		Static428.aCanvas12.requestFocus();
		Static8.aBoolean55 = true;
		Static292.aBoolean471 = true;
		Static459.aBoolean659 = true;
		Static274.aBoolean459 = false;
		Static75.aLong50 = Static582.method8056();
	}

	@OriginalMember(owner = "client!ue", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static560.anApplet_Sub1_1 == this && !Static340.aBoolean543) {
			Static338.aLong184 = 0L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLjava/lang/String;IIIZII)V")
	protected final void method2123(@OriginalArg(1) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static560.anApplet_Sub1_1 = this;
			Static184.anInt4050 = 0;
			Static277.anInt5899 = 768;
			Static59.anInt1894 = 768;
			Static294.anInt6026 = 1024;
			Static351.anInt6858 = 1024;
			Static253.anApplet1 = null;
			Static354.anInt6878 = 0;
			Static305.anInt6170 = 637;
			Static500.aFrame9 = new Frame();
			Static500.aFrame9.setTitle("Jagex");
			Static500.aFrame9.setResizable(true);
			Static500.aFrame9.addWindowListener(this);
			Static500.aFrame9.setVisible(true);
			Static500.aFrame9.toFront();
			@Pc(40) Insets local40 = Static500.aFrame9.getInsets();
			Static500.aFrame9.setSize(local40.left + Static351.anInt6858 + local40.right, local40.bottom + (Static59.anInt1894 - -local40.top));
			Static457.aClass104_3 = Static496.aClass104_4 = new Class104(arg1, arg0, 37, true);
			@Pc(73) Class159 local73 = Static496.aClass104_4.method3127(1, this);
			while (local73.anInt5910 == 0) {
				Static344.method5698(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static358.method5809(local86, (String) null);
		}
	}

	@OriginalMember(owner = "client!ue", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static292.aBoolean471 = false;
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static161.aString37 != null) {
				@Pc(10) String local10 = Static161.aString37.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static161.aString35;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method2132("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static161.aString35 == null || Static161.aString35.equals("1.4.2"))) {
					this.method2132("wrongjava");
					return;
				}
			}
			if (Static161.aString35 != null && Static161.aString35.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static161.aString35.length()) {
					@Pc(79) char local79 = Static161.aString35.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local73 * 10 + local79 - 48;
					local71++;
				}
				if (local73 >= 5) {
					Static421.aBoolean228 = true;
				}
			}
			@Pc(114) Applet local114 = Static560.anApplet_Sub1_1;
			if (Static635.anApplet2 != null) {
				local114 = Static635.anApplet2;
			}
			@Pc(120) Method local120 = Static161.aMethod1;
			if (local120 != null) {
				try {
					local120.invoke(local114, Boolean.TRUE);
				} catch (@Pc(134) Throwable local134) {
				}
			}
			Static171.method3231();
			Static156.method3072();
			this.method2122();
			this.method2130();
			Static97.aClass130_1 = Static198.method3588();
			while (Static338.aLong184 == 0L || Static582.method8056() < Static338.aLong184) {
				Static2.anInt5126 = Static97.aClass130_1.method7419(Static382.aLong192);
				for (@Pc(157) int local157 = 0; local157 < Static2.anInt5126; local157++) {
					this.method2120();
				}
				this.method2126();
				Static403.method6329(Static496.aClass104_4, Static428.aCanvas12);
			}
		} catch (@Pc(190) ThreadDeath local190) {
			throw local190;
		} catch (@Pc(193) Throwable local193) {
			Static358.method5809(local193, this.method2129());
			this.method2132("crash");
		} finally {
			@Pc(209) Object local209 = null;
			this.method2133(true);
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Z")
	protected final boolean method2124() {
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
				this.method2132("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
	protected abstract void method2125();

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "(I)V")
	private void method2126() {
		@Pc(8) long local8 = Static582.method8056();
		@Pc(12) long local12 = Static162.aLongArray4[Static188.anInt4105];
		Static162.aLongArray4[Static188.anInt4105] = local8;
		Static188.anInt4105 = Static188.anInt4105 + 1 & 0x1F;
		if (local12 != 0L && local8 > local12) {
			@Pc(44) int local44 = (int) (local8 - local12);
			Static576.anInt9821 = ((local44 >> 1) + 32000) / local44;
		}
		if (Static97.anInt2772++ > 50) {
			Static459.aBoolean659 = true;
			Static97.anInt2772 -= 50;
			Static428.aCanvas12.setSize(Static294.anInt6026, Static277.anInt5899);
			Static428.aCanvas12.setVisible(true);
			if (Static500.aFrame9 != null && Static224.aFrame5 == null) {
				@Pc(87) Insets local87 = Static500.aFrame9.getInsets();
				Static428.aCanvas12.setLocation(local87.left + Static184.anInt4050, Static354.anInt6878 + local87.top);
			} else {
				Static428.aCanvas12.setLocation(Static184.anInt4050, Static354.anInt6878);
			}
		}
		this.method2128();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	protected abstract void method2127();

	@OriginalMember(owner = "client!ue", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static500.aFrame9 == null) {
			return Static635.anApplet2 == null || Static635.anApplet2 == this ? super.getDocumentBase() : Static635.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "(I)V")
	protected abstract void method2128();

	@OriginalMember(owner = "client!ue", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static500.aFrame9 == null) {
			return Static635.anApplet2 == null || Static635.anApplet2 == this ? super.getAppletContext() : Static635.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static500.aFrame9 == null) {
			return Static635.anApplet2 == null || Static635.anApplet2 == this ? super.getCodeBase() : Static635.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ue", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static560.anApplet_Sub1_1 == this && !Static340.aBoolean543) {
			Static338.aLong184 = Static582.method8056() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ue", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method2129() {
		return null;
	}

	@OriginalMember(owner = "client!ue", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ue", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static560.anApplet_Sub1_1 != this || Static340.aBoolean543) {
			return;
		}
		Static459.aBoolean659 = true;
		if (Static421.aBoolean228 && Static582.method8056() - Static75.aLong50 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static351.anInt6858 && local24.height >= Static59.anInt1894) {
				Static274.aBoolean459 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "(I)V")
	protected abstract void method2130();

	@OriginalMember(owner = "client!ue", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static292.aBoolean471 = true;
		Static459.aBoolean659 = true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method2132(@OriginalArg(1) String arg0) {
		if (this.aBoolean197) {
			return;
		}
		this.aBoolean197 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static651.method5913("loggedout", Static635.anApplet2);
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
	private void method2133(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static340.aBoolean543) {
				return;
			}
			Static340.aBoolean543 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static635.anApplet2 != null) {
			Static635.anApplet2.destroy();
		}
		try {
			this.method2127();
		} catch (@Pc(44) Exception local44) {
		}
		if (this.aBoolean196) {
			try {
				jagmisc.quit();
			} catch (@Pc(50) Throwable local50) {
			}
			this.aBoolean196 = false;
		}
		Static355.method5749();
		Static602.method8317();
		if (Static428.aCanvas12 != null) {
			try {
				Static428.aCanvas12.removeFocusListener(this);
				Static428.aCanvas12.getParent().remove(Static428.aCanvas12);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static496.aClass104_4 != null) {
			try {
				Static496.aClass104_4.method3143();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method2125();
		if (Static500.aFrame9 != null) {
			Static500.aFrame9.setVisible(false);
			Static500.aFrame9.dispose();
			Static500.aFrame9 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}
}
