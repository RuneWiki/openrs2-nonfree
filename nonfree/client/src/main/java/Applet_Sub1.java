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

@OriginalClass("client!km")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!km", name = "q", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!km", name = "A", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!km", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static334.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	protected abstract void method2210();

	@OriginalMember(owner = "client!km", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static297.anApplet_Sub1_1 == this && !Static223.aBoolean372) {
			Static38.aLong28 = Static277.method5091() + 4000L;
		}
	}

	@OriginalMember(owner = "client!km", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static255.aFrame2 == null) {
			return Static334.anApplet2 == null || Static334.anApplet2 == this ? super.getParameter(arg0) : Static334.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method2211() {
		return null;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method2212(@OriginalArg(1) String arg0) {
		if (this.aBoolean194) {
			return;
		}
		this.aBoolean194 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static646.method1788(Static334.anApplet2, "loggedout");
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!km", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)Z")
	public final boolean method2213() {
		return Static472.method7443("jagmisc");
	}

	@OriginalMember(owner = "client!km", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static420.aBoolean570 = false;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	private void method2214() {
		@Pc(8) long local8 = Static277.method5091();
		@Pc(12) long local12 = Static109.aLongArray4[Static535.anInt9669];
		Static109.aLongArray4[Static535.anInt9669] = local8;
		Static535.anInt9669 = Static535.anInt9669 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local12 == 0L || local12 >= local8) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static437.aBoolean575 = Static420.aBoolean570;
		}
		this.method2229();
	}

	@OriginalMember(owner = "client!km", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!km", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!km", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static255.aFrame2 == null) {
			return Static334.anApplet2 == null || Static334.anApplet2 == this ? super.getDocumentBase() : Static334.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
	public synchronized void method2217() {
		if (Static639.aCanvas10 != null) {
			Static639.aCanvas10.removeFocusListener(this);
			Static639.aCanvas10.getParent().setBackground(Color.black);
			Static639.aCanvas10.getParent().remove(Static639.aCanvas10);
		}
		@Pc(32) Container local32;
		if (Static232.aFrame1 != null) {
			local32 = Static232.aFrame1;
		} else if (Static255.aFrame2 != null) {
			local32 = Static255.aFrame2;
		} else if (Static334.anApplet2 == null) {
			local32 = Static297.anApplet_Sub1_1;
		} else {
			local32 = Static334.anApplet2;
		}
		local32.setLayout(null);
		Static639.aCanvas10 = new Canvas_Sub1(this);
		local32.add(Static639.aCanvas10);
		Static639.aCanvas10.setSize(Static81.anInt2497, Static423.anInt7984);
		Static639.aCanvas10.setVisible(true);
		if (local32 == Static255.aFrame2) {
			@Pc(69) Insets local69 = Static255.aFrame2.getInsets();
			Static639.aCanvas10.setLocation(local69.left + Static57.anInt1928, local69.top - -Static110.anInt3008);
		} else {
			Static639.aCanvas10.setLocation(Static57.anInt1928, Static110.anInt3008);
		}
		Static639.aCanvas10.addFocusListener(this);
		Static639.aCanvas10.requestFocus();
		Static420.aBoolean570 = true;
		Static437.aBoolean575 = true;
		Static249.aBoolean394 = true;
		Static483.aBoolean653 = false;
		Static22.aLong12 = Static277.method5091();
	}

	@OriginalMember(owner = "client!km", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!km", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static297.anApplet_Sub1_1 != this || Static223.aBoolean372) {
			return;
		}
		Static249.aBoolean394 = true;
		if (Static47.aBoolean156 && Static277.method5091() - Static22.aLong12 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static584.anInt5338 <= local26.width && local26.height >= Static330.anInt6688) {
				Static483.aBoolean653 = true;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	private void method2218() {
		@Pc(6) long local6 = Static277.method5091();
		@Pc(10) long local10 = Static66.aLongArray18[Static403.anInt7659];
		Static66.aLongArray18[Static403.anInt7659] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(27) int local27 = (int) (local6 - local10);
			Static290.anInt6169 = ((local27 >> 1) + 32000) / local27;
		}
		Static403.anInt7659 = Static403.anInt7659 + 1 & 0x1F;
		if (Static412.anInt7768++ > 50) {
			Static412.anInt7768 -= 50;
			Static249.aBoolean394 = true;
			Static639.aCanvas10.setSize(Static81.anInt2497, Static423.anInt7984);
			Static639.aCanvas10.setVisible(true);
			if (Static255.aFrame2 != null && Static232.aFrame1 == null) {
				@Pc(68) Insets local68 = Static255.aFrame2.getInsets();
				Static639.aCanvas10.setLocation(local68.left + Static57.anInt1928, local68.top + Static110.anInt3008);
			} else {
				Static639.aCanvas10.setLocation(Static57.anInt1928, Static110.anInt3008);
			}
		}
		this.method2223();
	}

	@OriginalMember(owner = "client!km", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!km", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static420.aBoolean570 = true;
		Static249.aBoolean394 = true;
	}

	@OriginalMember(owner = "client!km", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)Z")
	protected final boolean method2219() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.equals("stellardawn.com") || local13.endsWith(".stellardawn.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method2212("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZ)V")
	private void method2220(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static223.aBoolean372) {
				return;
			}
			Static223.aBoolean372 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static334.anApplet2 != null) {
			Static334.anApplet2.destroy();
		}
		try {
			this.method2210();
		} catch (@Pc(44) Exception local44) {
		}
		if (this.aBoolean193) {
			try {
				jagmisc.quit();
			} catch (@Pc(50) Throwable local50) {
			}
			this.aBoolean193 = false;
		}
		Static59.method1911();
		Static516.method7853();
		if (Static639.aCanvas10 != null) {
			try {
				Static639.aCanvas10.removeFocusListener(this);
				Static639.aCanvas10.getParent().remove(Static639.aCanvas10);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Static268.aClass370_3 != null) {
			try {
				Static268.aClass370_3.method9069();
			} catch (@Pc(82) Exception local82) {
			}
		}
		this.method2221();
		if (Static255.aFrame2 != null) {
			Static255.aFrame2.setVisible(false);
			Static255.aFrame2.dispose();
			Static255.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(B)V")
	protected abstract void method2221();

	@OriginalMember(owner = "client!km", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static255.aFrame2 == null) {
			return Static334.anApplet2 == null || Static334.anApplet2 == this ? super.getAppletContext() : Static334.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static255.aFrame2 == null) {
			return Static334.anApplet2 == null || Static334.anApplet2 == this ? super.getCodeBase() : Static334.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!km", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static297.anApplet_Sub1_1 == this && !Static223.aBoolean372) {
			Static38.aLong28 = Static277.method5091();
			Static190.method3914(5000L);
			Static519.aClass370_6 = null;
			this.method2220(false);
		}
	}

	@OriginalMember(owner = "client!km", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static623.aString112 != null) {
				@Pc(10) String local10 = Static623.aString112.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static623.aString115;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method2212("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static623.aString115 == null || Static623.aString115.equals("1.4.2"))) {
					this.method2212("wrongjava");
					return;
				}
			}
			if (Static623.aString115 != null && Static623.aString115.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static623.aString115.length()) {
					@Pc(79) char local79 = Static623.aString115.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local73 * 10 + local79 - 48;
				}
				if (local73 >= 5) {
					Static47.aBoolean156 = true;
				}
			}
			@Pc(114) Applet local114 = Static297.anApplet_Sub1_1;
			if (Static334.anApplet2 != null) {
				local114 = Static334.anApplet2;
			}
			@Pc(120) Method local120 = Static623.aMethod2;
			if (local120 != null) {
				try {
					local120.invoke(local114, Boolean.TRUE);
				} catch (@Pc(134) Throwable local134) {
				}
			}
			Static363.method6140();
			Static133.method3048();
			this.method2217();
			this.method2222();
			Static186.aClass50_1 = Static517.method7855();
			while (Static38.aLong28 == 0L || Static38.aLong28 > Static277.method5091()) {
				Static200.anInt4633 = Static186.aClass50_1.method6602(Static298.aLong137);
				for (@Pc(157) int local157 = 0; local157 < Static200.anInt4633; local157++) {
					this.method2214();
				}
				this.method2218();
				Static166.method3586(Static639.aCanvas10, Static268.aClass370_3);
			}
		} catch (@Pc(188) ThreadDeath local188) {
			throw local188;
		} catch (@Pc(191) Throwable local191) {
			Static408.method6625(this.method2211(), local191);
			this.method2212("crash");
		} finally {
			@Pc(207) Object local207 = null;
			this.method2220(true);
		}
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)V")
	protected abstract void method2222();

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	protected abstract void method2223();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		try {
			if (Static297.anApplet_Sub1_1 == null) {
				Static57.anInt1928 = 0;
				Static423.anInt7984 = arg1;
				Static330.anInt6688 = arg1;
				Static81.anInt2497 = arg0;
				Static584.anInt5338 = arg0;
				Static110.anInt3008 = 0;
				Static196.anInt4543 = 634;
				Static297.anApplet_Sub1_1 = this;
				Static186.anApplet1 = Static334.anApplet2;
				Static519.aClass370_6 = Static268.aClass370_3 = new Class370(arg2, arg3, 37, Static334.anApplet2 != null);
				@Pc(64) Class240 local64 = Static268.aClass370_3.method9071(this, 1);
				while (local64.anInt7566 == 0) {
					Static190.method3914(10L);
				}
			} else {
				Static99.anInt2778++;
				if (Static99.anInt2778 >= 3) {
					this.method2212("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static408.method6625(null, local82);
			this.method2212("crash");
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void method2226(@OriginalArg(0) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static81.anInt2497 = 1024;
			Static584.anInt5338 = 1024;
			Static423.anInt7984 = 768;
			Static330.anInt6688 = 768;
			Static297.anApplet_Sub1_1 = this;
			Static110.anInt3008 = 0;
			Static57.anInt1928 = 0;
			Static196.anInt4543 = 634;
			Static186.anApplet1 = null;
			Static255.aFrame2 = new Frame();
			Static255.aFrame2.setTitle("Jagex");
			Static255.aFrame2.setResizable(true);
			Static255.aFrame2.addWindowListener(this);
			Static255.aFrame2.setVisible(true);
			Static255.aFrame2.toFront();
			@Pc(44) Insets local44 = Static255.aFrame2.getInsets();
			Static255.aFrame2.setSize(local44.right + local44.left + Static584.anInt5338, local44.bottom + Static330.anInt6688 + local44.top);
			Static519.aClass370_6 = Static268.aClass370_3 = new Class370(arg0, arg1, 37, true);
			@Pc(78) Class240 local78 = Static268.aClass370_3.method9071(this, 1);
			while (local78.anInt7566 == 0) {
				Static190.method3914(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static408.method6625(null, local88);
		}
	}

	@OriginalMember(owner = "client!km", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!km", name = "g", descriptor = "(I)Z")
	public final boolean method2227() {
		return Static472.method7443("jaclib");
	}

	@OriginalMember(owner = "client!km", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static297.anApplet_Sub1_1 == this && !Static223.aBoolean372) {
			Static38.aLong28 = 0L;
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(B)V")
	protected abstract void method2229();

	@OriginalMember(owner = "client!km", name = "i", descriptor = "(I)Z")
	public final boolean method2230() {
		return Static472.method7443("jagtheora");
	}
}
