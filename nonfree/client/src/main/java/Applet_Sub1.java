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

@OriginalClass("client!jl")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "Z")
	private boolean aBoolean70 = false;

	@OriginalMember(owner = "client!jl", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static433.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	private void method1074() {
		@Pc(6) long local6 = Static480.method6650();
		@Pc(10) long local10 = Static278.aLongArray12[Static531.anInt8976];
		Static278.aLongArray12[Static531.anInt8976] = local6;
		@Pc(28) boolean local28;
		if ((long) 0 == local10 || local10 >= local6) {
			local28 = false;
		} else {
			local28 = true;
		}
		Static531.anInt8976 = Static531.anInt8976 + 1 & 0x1F;
		synchronized (this) {
			Static13.aBoolean9 = Static81.aBoolean100;
		}
		this.method1088();
	}

	@OriginalMember(owner = "client!jl", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static73.aFrame1 == null) {
			return Static433.anApplet2 == null || Static433.anApplet2 == this ? super.getCodeBase() : Static433.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIZLjava/lang/String;)V")
	protected final void method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) String arg3) {
		try {
			if (Static149.anApplet_Sub1_1 == null) {
				Static74.anInt3296 = 626;
				Static415.anApplet3 = Static433.anApplet2;
				Static594.anInt9806 = arg0;
				Static65.anInt1195 = arg0;
				Static465.anInt8056 = 0;
				Static349.anInt6422 = arg1;
				Static8.anInt5988 = arg1;
				Static149.anApplet_Sub1_1 = this;
				Static273.anInt1189 = 0;
				Static325.aClass198_2 = Static361.aClass198_3 = new Class198(arg2, arg3, 35, Static433.anApplet2 != null);
				@Pc(72) Class191 local72 = Static361.aClass198_3.method4285(1, this);
				while (local72.anInt5014 == 0) {
					Static408.method5841(10L);
				}
			} else {
				Static350.anInt6434++;
				if (Static350.anInt6434 >= 3) {
					this.method1086("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(85) Throwable local85) {
			Static419.method5957(null, local85);
			this.method1086("crash");
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)Z")
	public final boolean method1077() {
		return Static362.method5319("jagmisc");
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	protected abstract void method1078();

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	protected abstract void method1079();

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)V")
	public synchronized void method1080() {
		if (Static103.aCanvas2 != null) {
			Static103.aCanvas2.removeFocusListener(this);
			Static103.aCanvas2.getParent().setBackground(Color.black);
			Static103.aCanvas2.getParent().remove(Static103.aCanvas2);
		}
		@Pc(22) Container local22;
		if (Static180.aFrame5 != null) {
			local22 = Static180.aFrame5;
		} else if (Static73.aFrame1 != null) {
			local22 = Static73.aFrame1;
		} else if (Static433.anApplet2 == null) {
			local22 = Static149.anApplet_Sub1_1;
		} else {
			local22 = Static433.anApplet2;
		}
		local22.setLayout(null);
		Static103.aCanvas2 = new Canvas_Sub1(this);
		local22.add(Static103.aCanvas2);
		Static103.aCanvas2.setSize(Static349.anInt6422, Static594.anInt9806);
		Static103.aCanvas2.setVisible(true);
		if (local22 == Static73.aFrame1) {
			@Pc(69) Insets local69 = Static73.aFrame1.getInsets();
			Static103.aCanvas2.setLocation(local69.left + Static273.anInt1189, local69.top - -Static465.anInt8056);
		} else {
			Static103.aCanvas2.setLocation(Static273.anInt1189, Static465.anInt8056);
		}
		Static103.aCanvas2.addFocusListener(this);
		Static103.aCanvas2.requestFocus();
		Static81.aBoolean100 = true;
		Static13.aBoolean9 = true;
		Static47.aBoolean50 = true;
		Static194.aBoolean273 = false;
		Static279.aLong127 = Static480.method6650();
	}

	@OriginalMember(owner = "client!jl", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)Z")
	protected final boolean method1082() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
			return true;
		} else if (local14.equals("stellardawn.com") || local14.endsWith(".stellardawn.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1086("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "(I)Z")
	public final boolean method1083() {
		return Static362.method5319("jaclib");
	}

	@OriginalMember(owner = "client!jl", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static149.anApplet_Sub1_1 == this && !Static386.aBoolean529) {
			Static361.aLong158 = Static480.method6650();
			Static408.method5841(5000L);
			Static325.aClass198_2 = null;
			this.method1091(false);
		}
	}

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "(I)Ljava/lang/String;")
	public String method1084() {
		return null;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILjava/lang/String;IBIZ)V")
	protected final void method1085(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static349.anInt6422 = 1024;
			Static8.anInt5988 = 1024;
			Static149.anApplet_Sub1_1 = this;
			Static273.anInt1189 = 0;
			Static415.anApplet3 = null;
			Static465.anInt8056 = 0;
			Static594.anInt9806 = 768;
			Static65.anInt1195 = 768;
			Static74.anInt3296 = 626;
			Static73.aFrame1 = new Frame();
			Static73.aFrame1.setTitle("Jagex");
			Static73.aFrame1.setResizable(true);
			Static73.aFrame1.addWindowListener(this);
			Static73.aFrame1.setVisible(true);
			Static73.aFrame1.toFront();
			@Pc(40) Insets local40 = Static73.aFrame1.getInsets();
			Static73.aFrame1.setSize(local40.right + Static8.anInt5988 + local40.left, local40.bottom + Static65.anInt1195 + local40.top);
			Static325.aClass198_2 = Static361.aClass198_3 = new Class198(arg0, arg1, 35, true);
			@Pc(81) Class191 local81 = Static361.aClass198_3.method4285(1, this);
			while (local81.anInt5014 == 0) {
				Static408.method5841(10L);
			}
		} catch (@Pc(91) Exception local91) {
			Static419.method5957(null, local91);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1086(@OriginalArg(1) String arg0) {
		if (this.aBoolean69) {
			return;
		}
		this.aBoolean69 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static597.method645(Static433.anApplet2, "loggedout");
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "(I)V")
	private void method1087() {
		@Pc(6) long local6 = Static480.method6650();
		@Pc(10) long local10 = Static254.aLongArray4[Static361.anInt6563];
		Static254.aLongArray4[Static361.anInt6563] = local6;
		Static361.anInt6563 = Static361.anInt6563 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static403.anInt7222 = ((local34 >> 1) + 32000) / local34;
		}
		if (Static589.anInt9673++ > 50) {
			Static589.anInt9673 -= 50;
			Static47.aBoolean50 = true;
			Static103.aCanvas2.setSize(Static349.anInt6422, Static594.anInt9806);
			Static103.aCanvas2.setVisible(true);
			if (Static73.aFrame1 != null && Static180.aFrame5 == null) {
				@Pc(69) Insets local69 = Static73.aFrame1.getInsets();
				Static103.aCanvas2.setLocation(local69.left + Static273.anInt1189, local69.top + Static465.anInt8056);
			} else {
				Static103.aCanvas2.setLocation(Static273.anInt1189, Static465.anInt8056);
			}
		}
		this.method1078();
	}

	@OriginalMember(owner = "client!jl", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static149.anApplet_Sub1_1 == this && !Static386.aBoolean529) {
			Static361.aLong158 = Static480.method6650() + 4000L;
		}
	}

	@OriginalMember(owner = "client!jl", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static149.anApplet_Sub1_1 == this && !Static386.aBoolean529) {
			Static361.aLong158 = 0L;
		}
	}

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "(I)V")
	protected abstract void method1088();

	@OriginalMember(owner = "client!jl", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "(I)V")
	protected abstract void method1089();

	@OriginalMember(owner = "client!jl", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!jl", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static285.aString62 != null) {
				@Pc(10) String local10 = Static285.aString62.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static285.aString64;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1086("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static285.aString64 == null || Static285.aString64.equals("1.4.2"))) {
					this.method1086("wrongjava");
					return;
				}
			}
			if (Static285.aString64 != null && Static285.aString64.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static285.aString64.length()) {
					@Pc(78) char local78 = Static285.aString64.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local78 + local72 * 10 - 48;
				}
				if (local72 >= 5) {
					Static585.aBoolean712 = true;
				}
			}
			@Pc(106) Applet local106 = Static149.anApplet_Sub1_1;
			if (Static433.anApplet2 != null) {
				local106 = Static433.anApplet2;
			}
			@Pc(112) Method local112 = Static285.aMethod2;
			if (local112 != null) {
				try {
					local112.invoke(local106, Boolean.TRUE);
				} catch (@Pc(126) Throwable local126) {
				}
			}
			Static245.method3616();
			Static412.method5864();
			this.method1080();
			this.method1090();
			Static406.aClass188_1 = Static480.method6651();
			while (Static361.aLong158 == 0L || Static480.method6650() < Static361.aLong158) {
				Static165.anInt3159 = Static406.aClass188_1.method7562(Static30.aLong22);
				for (@Pc(149) int local149 = 0; local149 < Static165.anInt3159; local149++) {
					this.method1074();
				}
				this.method1087();
				Static464.method7013(Static103.aCanvas2, Static361.aClass198_3);
			}
		} catch (@Pc(182) ThreadDeath local182) {
			throw local182;
		} catch (@Pc(185) Throwable local185) {
			Static419.method5957(this.method1084(), local185);
			this.method1086("crash");
		} finally {
			@Pc(201) Object local201 = null;
			this.method1091(true);
		}
	}

	@OriginalMember(owner = "client!jl", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static73.aFrame1 == null) {
			return Static433.anApplet2 == null || Static433.anApplet2 == this ? super.getDocumentBase() : Static433.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "(I)V")
	protected abstract void method1090();

	@OriginalMember(owner = "client!jl", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static149.anApplet_Sub1_1 != this || Static386.aBoolean529) {
			return;
		}
		Static47.aBoolean50 = true;
		if (Static585.aBoolean712 && Static480.method6650() - Static279.aLong127 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static8.anInt5988 <= local24.width && local24.height >= Static65.anInt1195) {
				Static194.aBoolean273 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static81.aBoolean100 = true;
		Static47.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!jl", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jl", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
	private void method1091(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static386.aBoolean529) {
				return;
			}
			Static386.aBoolean529 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static433.anApplet2 != null) {
			Static433.anApplet2.destroy();
		}
		try {
			this.method1079();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean70) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean70 = false;
		}
		Static37.method671();
		Static585.method7838();
		if (Static103.aCanvas2 != null) {
			try {
				Static103.aCanvas2.removeFocusListener(this);
				Static103.aCanvas2.getParent().remove(Static103.aCanvas2);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static361.aClass198_3 != null) {
			try {
				Static361.aClass198_3.method4295();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method1089();
		if (Static73.aFrame1 != null) {
			Static73.aFrame1.setVisible(false);
			Static73.aFrame1.dispose();
			Static73.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!jl", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jl", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static73.aFrame1 == null) {
			return Static433.anApplet2 == null || Static433.anApplet2 == this ? super.getAppletContext() : Static433.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static81.aBoolean100 = false;
	}

	@OriginalMember(owner = "client!jl", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jl", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static73.aFrame1 == null) {
			return Static433.anApplet2 == null || Static433.anApplet2 == this ? super.getParameter(arg0) : Static433.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}
}
