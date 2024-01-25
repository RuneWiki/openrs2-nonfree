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

@OriginalClass("client!ch")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!ch", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static371.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ch", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)Z")
	protected final boolean method1040() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
			return true;
		} else if (local10.equals("stellardawn.com") || local10.endsWith(".stellardawn.com")) {
			return true;
		} else if (local10.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local10.length() > 0 && local10.charAt(local10.length() - 1) >= '0' && local10.charAt(local10.length() - 1) <= '9') {
				local10 = local10.substring(0, local10.length() - 1);
			}
			if (local10.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1047("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)Z")
	public final boolean method1041() {
		return Static34.method446("jagmisc");
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
	private void method1042() {
		@Pc(6) long local6 = Static549.method7758();
		@Pc(10) long local10 = Static65.aLongArray3[Static30.anInt392];
		Static65.aLongArray3[Static30.anInt392] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local6 <= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static30.anInt392 = Static30.anInt392 + 1 & 0x1F;
		synchronized (this) {
			Static285.aBoolean390 = Static657.aBoolean757;
		}
		this.method1051();
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)Z")
	public final boolean method1043() {
		return Static34.method446("jagtheora");
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V")
	public synchronized void method1044() {
		if (Static4.aCanvas1 != null) {
			Static4.aCanvas1.removeFocusListener(this);
			Static4.aCanvas1.getParent().setBackground(Color.black);
			Static4.aCanvas1.getParent().remove(Static4.aCanvas1);
		}
		@Pc(24) Container local24;
		if (Static221.aFrame1 != null) {
			local24 = Static221.aFrame1;
		} else if (Static637.aFrame3 != null) {
			local24 = Static637.aFrame3;
		} else if (Static371.anApplet1 == null) {
			local24 = Static34.anApplet_Sub1_1;
		} else {
			local24 = Static371.anApplet1;
		}
		local24.setLayout((LayoutManager) null);
		Static4.aCanvas1 = new Canvas_Sub1(this);
		local24.add(Static4.aCanvas1);
		Static4.aCanvas1.setSize(Static535.anInt4128, Static274.anInt3226);
		Static4.aCanvas1.setVisible(true);
		if (local24 == Static637.aFrame3) {
			@Pc(69) Insets local69 = Static637.aFrame3.getInsets();
			Static4.aCanvas1.setLocation(Static409.anInt7136 + local69.left, local69.top - -Static494.anInt4031);
		} else {
			Static4.aCanvas1.setLocation(Static409.anInt7136, Static494.anInt4031);
		}
		Static4.aCanvas1.addFocusListener(this);
		Static4.aCanvas1.requestFocus();
		Static285.aBoolean390 = true;
		Static657.aBoolean757 = true;
		Static217.aBoolean340 = true;
		Static634.aBoolean730 = false;
		Static685.aLong345 = Static549.method7758();
	}

	@OriginalMember(owner = "client!ch", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static637.aFrame3 == null) {
			return Static371.anApplet1 == null || Static371.anApplet1 == this ? super.getDocumentBase() : Static371.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static34.anApplet_Sub1_1 == this && !Static623.aBoolean725) {
			Static34.aLong22 = Static549.method7758() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ch", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static637.aFrame3 == null) {
			return Static371.anApplet1 == null || Static371.anApplet1 == this ? super.getAppletContext() : Static371.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZZ)V")
	private void method1045(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static623.aBoolean725) {
				return;
			}
			Static623.aBoolean725 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static371.anApplet1 != null) {
			Static371.anApplet1.destroy();
		}
		try {
			this.method1055();
		} catch (@Pc(47) Exception local47) {
		}
		if (this.aBoolean78) {
			try {
				jagmisc.quit();
			} catch (@Pc(53) Throwable local53) {
			}
			this.aBoolean78 = false;
		}
		Static179.method3410();
		Static628.method8567();
		if (Static4.aCanvas1 != null) {
			try {
				Static4.aCanvas1.removeFocusListener(this);
				Static4.aCanvas1.getParent().remove(Static4.aCanvas1);
			} catch (@Pc(78) Exception local78) {
			}
		}
		if (Static651.aClass122_38 != null) {
			try {
				Static651.aClass122_38.method3353();
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.method1054();
		if (Static637.aFrame3 != null) {
			Static637.aFrame3.setVisible(false);
			Static637.aFrame3.dispose();
			Static637.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method1046() {
		return null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1047(@OriginalArg(1) String arg0) {
		if (this.aBoolean79) {
			return;
		}
		this.aBoolean79 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static692.method2495("loggedout", Static371.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!ch", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZLjava/lang/String;IIIIZ)V")
	protected final void method1048(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static409.anInt7136 = 0;
			Static45.anInt570 = 658;
			Static494.anInt4031 = 0;
			Static535.anInt4128 = 1024;
			Static238.anInt4606 = 1024;
			Static34.anApplet_Sub1_1 = this;
			Static399.anApplet2 = null;
			Static274.anInt3226 = 768;
			Static542.anInt8800 = 768;
			Static637.aFrame3 = new Frame();
			Static637.aFrame3.setTitle("Jagex");
			Static637.aFrame3.setResizable(true);
			Static637.aFrame3.addWindowListener(this);
			Static637.aFrame3.setVisible(true);
			Static637.aFrame3.toFront();
			@Pc(46) Insets local46 = Static637.aFrame3.getInsets();
			Static637.aFrame3.setSize(local46.right + Static238.anInt4606 + local46.left, local46.bottom + Static542.anInt8800 - -local46.top);
			Static345.aClass122_24 = Static651.aClass122_38 = new Class122(arg1, arg0, 37, true);
			@Pc(79) Class380 local79 = Static651.aClass122_38.method3352(this, 1);
			while (local79.anInt10067 == 0) {
				Static255.method4444(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static550.method7785(local94, (String) null);
		}
	}

	@OriginalMember(owner = "client!ch", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)Z")
	public final boolean method1049() {
		return Static34.method446("jaclib");
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
	protected abstract void method1050();

	@OriginalMember(owner = "client!ch", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
	protected abstract void method1051();

	@OriginalMember(owner = "client!ch", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static657.aBoolean757 = false;
	}

	@OriginalMember(owner = "client!ch", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method1052(@OriginalArg(2) String arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static34.anApplet_Sub1_1 == null) {
				Static45.anInt570 = 658;
				Static535.anInt4128 = arg3;
				Static238.anInt4606 = arg3;
				Static274.anInt3226 = arg1;
				Static542.anInt8800 = arg1;
				Static494.anInt4031 = 0;
				Static399.anApplet2 = Static371.anApplet1;
				Static34.anApplet_Sub1_1 = this;
				Static409.anInt7136 = 0;
				Static345.aClass122_24 = Static651.aClass122_38 = new Class122(arg2, arg0, 37, Static371.anApplet1 != null);
				@Pc(72) Class380 local72 = Static651.aClass122_38.method3352(this, 1);
				while (local72.anInt10067 == 0) {
					Static255.method4444(10L);
				}
			} else {
				Static544.anInt8813++;
				if (Static544.anInt8813 >= 3) {
					this.method1047("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(86) Throwable local86) {
			Static550.method7785(local86, (String) null);
			this.method1047("crash");
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	private void method1053() {
		@Pc(11) long local11 = Static549.method7758();
		@Pc(15) long local15 = Static446.aLongArray17[Static75.anInt1040];
		Static446.aLongArray17[Static75.anInt1040] = local11;
		if (local15 != 0L && local15 < local11) {
			@Pc(41) int local41 = (int) (local11 - local15);
			Static467.anInt8014 = ((local41 >> 1) + 32000) / local41;
		}
		Static75.anInt1040 = Static75.anInt1040 + 1 & 0x1F;
		if (Static232.anInt4497++ > 50) {
			Static217.aBoolean340 = true;
			Static232.anInt4497 -= 50;
			Static4.aCanvas1.setSize(Static535.anInt4128, Static274.anInt3226);
			Static4.aCanvas1.setVisible(true);
			if (Static637.aFrame3 != null && Static221.aFrame1 == null) {
				@Pc(96) Insets local96 = Static637.aFrame3.getInsets();
				Static4.aCanvas1.setLocation(local96.left + Static409.anInt7136, local96.top - -Static494.anInt4031);
			} else {
				Static4.aCanvas1.setLocation(Static409.anInt7136, Static494.anInt4031);
			}
		}
		this.method1056();
	}

	@OriginalMember(owner = "client!ch", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static34.anApplet_Sub1_1 == this && !Static623.aBoolean725) {
			Static34.aLong22 = Static549.method7758();
			Static255.method4444(5000L);
			Static345.aClass122_24 = null;
			this.method1045(false);
		}
	}

	@OriginalMember(owner = "client!ch", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static34.anApplet_Sub1_1 == this && !Static623.aBoolean725) {
			Static34.aLong22 = 0L;
		}
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
	protected abstract void method1054();

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	protected abstract void method1055();

	@OriginalMember(owner = "client!ch", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static174.aString38 != null) {
				@Pc(10) String local10 = Static174.aString38.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(61) String local61 = Static174.aString37;
					if (local61.equals("1.1") || local61.startsWith("1.1.") || local61.equals("1.2") || local61.startsWith("1.2.")) {
						this.method1047("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static174.aString37 == null || Static174.aString37.equals("1.4.2"))) {
					this.method1047("wrongjava");
					return;
				}
			}
			if (Static174.aString37 != null && Static174.aString37.startsWith("1.")) {
				@Pc(115) int local115 = 2;
				@Pc(117) int local117 = 0;
				while (local115 < Static174.aString37.length()) {
					@Pc(125) char local125 = Static174.aString37.charAt(local115);
					if (local125 < '0' || local125 > '9') {
						break;
					}
					local117 = local117 * 10 + local125 - 48;
					local115++;
				}
				if (local117 >= 5) {
					Static245.aBoolean362 = true;
				}
			}
			@Pc(165) Applet local165 = Static34.anApplet_Sub1_1;
			if (Static371.anApplet1 != null) {
				local165 = Static371.anApplet1;
			}
			@Pc(171) Method local171 = Static174.aMethod2;
			if (local171 != null) {
				try {
					local171.invoke(local165, Boolean.TRUE);
				} catch (@Pc(185) Throwable local185) {
				}
			}
			Static576.method8037();
			Static16.method209();
			this.method1044();
			this.method1050();
			Static125.aClass29_1 = Static159.method3130();
			while (Static34.aLong22 == 0L || Static34.aLong22 > Static549.method7758()) {
				Static52.anInt3726 = Static125.aClass29_1.method8352(Static651.aLong340);
				for (@Pc(210) int local210 = 0; local210 < Static52.anInt3726; local210++) {
					this.method1042();
				}
				this.method1053();
				Static372.method8350(Static4.aCanvas1, Static651.aClass122_38);
			}
		} catch (@Pc(251) ThreadDeath local251) {
			throw local251;
		} catch (@Pc(254) Throwable local254) {
			Static550.method7785(local254, this.method1046());
			this.method1047("crash");
		} finally {
			@Pc(272) Object local272 = null;
			this.method1045(true);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	protected abstract void method1056();

	@OriginalMember(owner = "client!ch", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static637.aFrame3 == null) {
			return Static371.anApplet1 == null || Static371.anApplet1 == this ? super.getParameter(arg0) : Static371.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ch", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static657.aBoolean757 = true;
		Static217.aBoolean340 = true;
	}

	@OriginalMember(owner = "client!ch", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static34.anApplet_Sub1_1 != this || Static623.aBoolean725) {
			return;
		}
		Static217.aBoolean340 = true;
		if (Static245.aBoolean362 && Static549.method7758() - Static685.aLong345 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || local29.width >= Static238.anInt4606 && Static542.anInt8800 <= local29.height) {
				Static634.aBoolean730 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static637.aFrame3 == null) {
			return Static371.anApplet1 == null || Static371.anApplet1 == this ? super.getCodeBase() : Static371.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}
}
