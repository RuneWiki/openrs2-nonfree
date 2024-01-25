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

@OriginalClass("client!bga")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!bga", name = "m", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!bga", name = "z", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!bga", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static562.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!bga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static509.anApplet_Sub1_1 != this || Static221.aBoolean340) {
			return;
		}
		Static481.aBoolean644 = true;
		if (Static229.aBoolean349 && Static548.method7437() - Static285.aLong169 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static455.anInt7877 && local26.height >= Static248.anInt4654) {
				Static573.aBoolean716 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1068(@OriginalArg(0) String arg0) {
		if (this.aBoolean111) {
			return;
		}
		this.aBoolean111 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static602.method6577("loggedout", Static562.anApplet2);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!bga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)Z")
	public final boolean method1069() {
		return Static533.method7648("jagmisc");
	}

	@OriginalMember(owner = "client!bga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(B)V")
	private void method1070() {
		@Pc(6) long local6 = Static548.method7437();
		@Pc(10) long local10 = Static503.aLongArray13[Static224.anInt4204];
		Static503.aLongArray13[Static224.anInt4204] = local6;
		Static224.anInt4204 = Static224.anInt4204 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(43) int local43 = (int) (local6 - local10);
			Static156.anInt8495 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static151.anInt3043++ > 50) {
			Static151.anInt3043 -= 50;
			Static481.aBoolean644 = true;
			Static471.aCanvas12.setSize(Static140.anInt2937, Static120.anInt2371);
			Static471.aCanvas12.setVisible(true);
			if (Static593.aFrame2 != null && Static125.aFrame1 == null) {
				@Pc(81) Insets local81 = Static593.aFrame2.getInsets();
				Static471.aCanvas12.setLocation(Static212.anInt4095 + local81.left, local81.top + Static561.anInt9195);
			} else {
				Static471.aCanvas12.setLocation(Static212.anInt4095, Static561.anInt9195);
			}
		}
		this.method1077();
	}

	@OriginalMember(owner = "client!bga", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static509.anApplet_Sub1_1 == this && !Static221.aBoolean340) {
			Static116.aLong75 = Static548.method7437() + 4000L;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZIIZIIILjava/lang/String;)V")
	protected final void method1071(@OriginalArg(5) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static516.anApplet1 = null;
			Static509.anApplet_Sub1_1 = this;
			Static120.anInt2371 = 768;
			Static248.anInt4654 = 768;
			Static561.anInt9195 = 0;
			Static140.anInt2937 = 1024;
			Static455.anInt7877 = 1024;
			Static212.anInt4095 = 0;
			Static225.anInt4213 = 621;
			Static593.aFrame2 = new Frame();
			Static593.aFrame2.setTitle("Jagex");
			Static593.aFrame2.setResizable(true);
			Static593.aFrame2.addWindowListener(this);
			Static593.aFrame2.setVisible(true);
			Static593.aFrame2.toFront();
			@Pc(44) Insets local44 = Static593.aFrame2.getInsets();
			Static593.aFrame2.setSize(local44.right + local44.left + Static455.anInt7877, local44.bottom + Static248.anInt4654 + local44.top);
			Static13.aClass287_6 = Static356.aClass287_5 = new Class287(arg0, arg1, 35, true);
			@Pc(76) Class347 local76 = Static356.aClass287_5.method6533(1, this);
			while (local76.anInt9172 == 0) {
				Static459.method6498(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static58.method946(null, local89);
		}
	}

	@OriginalMember(owner = "client!bga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)Z")
	protected final boolean method1072() {
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
				this.method1068("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static295.aBoolean657 = false;
	}

	@OriginalMember(owner = "client!bga", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static509.anApplet_Sub1_1 == this && !Static221.aBoolean340) {
			Static116.aLong75 = Static548.method7437();
			Static459.method6498(5000L);
			Static13.aClass287_6 = null;
			this.method1080(false);
		}
	}

	@OriginalMember(owner = "client!bga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static295.aBoolean657 = true;
		Static481.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!bga", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static593.aFrame2 == null) {
			return Static562.anApplet2 == null || Static562.anApplet2 == this ? super.getCodeBase() : Static562.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(B)V")
	public synchronized void method1073() {
		if (Static471.aCanvas12 != null) {
			Static471.aCanvas12.removeFocusListener(this);
			Static471.aCanvas12.getParent().setBackground(Color.black);
			Static471.aCanvas12.getParent().remove(Static471.aCanvas12);
		}
		@Pc(22) Container local22;
		if (Static125.aFrame1 != null) {
			local22 = Static125.aFrame1;
		} else if (Static593.aFrame2 != null) {
			local22 = Static593.aFrame2;
		} else if (Static562.anApplet2 == null) {
			local22 = Static509.anApplet_Sub1_1;
		} else {
			local22 = Static562.anApplet2;
		}
		local22.setLayout(null);
		Static471.aCanvas12 = new Canvas_Sub1(this);
		local22.add(Static471.aCanvas12);
		Static471.aCanvas12.setSize(Static140.anInt2937, Static120.anInt2371);
		Static471.aCanvas12.setVisible(true);
		if (Static593.aFrame2 == local22) {
			@Pc(63) Insets local63 = Static593.aFrame2.getInsets();
			Static471.aCanvas12.setLocation(Static212.anInt4095 + local63.left, local63.top + Static561.anInt9195);
		} else {
			Static471.aCanvas12.setLocation(Static212.anInt4095, Static561.anInt9195);
		}
		Static471.aCanvas12.addFocusListener(this);
		Static471.aCanvas12.requestFocus();
		Static523.aBoolean664 = true;
		Static295.aBoolean657 = true;
		Static481.aBoolean644 = true;
		Static573.aBoolean716 = false;
		Static285.aLong169 = Static548.method7437();
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)Z")
	public final boolean method1074() {
		return Static533.method7648("jaclib");
	}

	@OriginalMember(owner = "client!bga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static593.aFrame2 == null) {
			return Static562.anApplet2 == null || Static562.anApplet2 == this ? super.getAppletContext() : Static562.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)V")
	protected abstract void method1075();

	@OriginalMember(owner = "client!bga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static593.aFrame2 == null) {
			return Static562.anApplet2 == null || Static562.anApplet2 == this ? super.getParameter(arg0) : Static562.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1076() {
		return null;
	}

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
	protected abstract void method1077();

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "(I)V")
	protected abstract void method1078();

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(IBLjava/lang/String;IIII)V")
	protected final void method1079(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static509.anApplet_Sub1_1 == null) {
				Static509.anApplet_Sub1_1 = this;
				Static516.anApplet1 = Static562.anApplet2;
				Static561.anInt9195 = 0;
				Static225.anInt4213 = 621;
				Static140.anInt2937 = arg2;
				Static455.anInt7877 = arg2;
				Static212.anInt4095 = 0;
				Static120.anInt2371 = arg3;
				Static248.anInt4654 = arg3;
				Static13.aClass287_6 = Static356.aClass287_5 = new Class287(arg0, arg1, 35, Static562.anApplet2 != null);
				@Pc(70) Class347 local70 = Static356.aClass287_5.method6533(1, this);
				while (local70.anInt9172 == 0) {
					Static459.method6498(10L);
				}
			} else {
				Static98.anInt2031++;
				if (Static98.anInt2031 >= 3) {
					this.method1068("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static58.method946(null, local80);
			this.method1068("crash");
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BZ)V")
	private void method1080(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static221.aBoolean340) {
				return;
			}
			Static221.aBoolean340 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static562.anApplet2 != null) {
			Static562.anApplet2.destroy();
		}
		try {
			this.method1082();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean110) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean110 = false;
		}
		Static214.method3447();
		Static472.method6650();
		if (Static471.aCanvas12 != null) {
			try {
				Static471.aCanvas12.removeFocusListener(this);
				Static471.aCanvas12.getParent().remove(Static471.aCanvas12);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static356.aClass287_5 != null) {
			try {
				Static356.aClass287_5.method6547();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1075();
		if (Static593.aFrame2 != null) {
			Static593.aFrame2.setVisible(false);
			Static593.aFrame2.dispose();
			Static593.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
	private void method1081() {
		@Pc(10) long local10 = Static548.method7437();
		@Pc(14) long local14 = Static250.aLongArray6[Static429.anInt7300];
		Static250.aLongArray6[Static429.anInt7300] = local10;
		@Pc(29) boolean local29;
		if (local14 == 0L || local10 <= local14) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static429.anInt7300 = Static429.anInt7300 + 1 & 0x1F;
		synchronized (this) {
			Static523.aBoolean664 = Static295.aBoolean657;
		}
		this.method1078();
	}

	@OriginalMember(owner = "client!bga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!bga", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static464.aString77 != null) {
				@Pc(10) String local10 = Static464.aString77.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static464.aString82;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method1068("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static464.aString82 == null || Static464.aString82.equals("1.4.2"))) {
					this.method1068("wrongjava");
					return;
				}
			}
			if (Static464.aString82 != null && Static464.aString82.startsWith("1.")) {
				@Pc(69) int local69 = 2;
				@Pc(71) int local71 = 0;
				while (Static464.aString82.length() > local69) {
					@Pc(77) char local77 = Static464.aString82.charAt(local69);
					if (local77 < '0' || local77 > '9') {
						break;
					}
					local71 = local77 + local71 * 10 - 48;
					local69++;
				}
				if (local71 >= 5) {
					Static229.aBoolean349 = true;
				}
			}
			@Pc(111) Applet local111 = Static509.anApplet_Sub1_1;
			if (Static562.anApplet2 != null) {
				local111 = Static562.anApplet2;
			}
			@Pc(117) Method local117 = Static464.aMethod1;
			if (local117 != null) {
				try {
					local117.invoke(local111, Boolean.TRUE);
				} catch (@Pc(131) Throwable local131) {
				}
			}
			Static392.method5759();
			Static20.method6754();
			this.method1073();
			this.method1083();
			Static9.aClass15_1 = Static227.method3534();
			while (Static116.aLong75 == 0L || Static116.aLong75 > Static548.method7437()) {
				Static336.anInt6191 = Static9.aClass15_1.method5278(Static360.aLong173);
				for (@Pc(154) int local154 = 0; local154 < Static336.anInt6191; local154++) {
					this.method1081();
				}
				this.method1070();
				Static421.method6466(Static356.aClass287_5, Static471.aCanvas12);
			}
		} catch (@Pc(191) ThreadDeath local191) {
			throw local191;
		} catch (@Pc(194) Throwable local194) {
			Static58.method946(this.method1076(), local194);
			this.method1068("crash");
		} finally {
			@Pc(210) Object local210 = null;
			this.method1080(true);
		}
	}

	@OriginalMember(owner = "client!bga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static593.aFrame2 == null) {
			return Static562.anApplet2 == null || Static562.anApplet2 == this ? super.getDocumentBase() : Static562.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "(I)V")
	protected abstract void method1082();

	@OriginalMember(owner = "client!bga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "(I)V")
	protected abstract void method1083();

	@OriginalMember(owner = "client!bga", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static509.anApplet_Sub1_1 == this && !Static221.aBoolean340) {
			Static116.aLong75 = 0L;
		}
	}
}
