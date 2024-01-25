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

@OriginalClass("client!dh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!dh", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static7.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BZ)V")
	private void method1262(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static625.aBoolean744) {
				return;
			}
			Static625.aBoolean744 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static7.anApplet1 != null) {
			Static7.anApplet1.destroy();
		}
		try {
			this.method1268();
		} catch (@Pc(46) Exception local46) {
		}
		if (this.aBoolean100) {
			try {
				jagmisc.quit();
			} catch (@Pc(52) Throwable local52) {
			}
			this.aBoolean100 = false;
		}
		Static544.method7966();
		Static32.method415();
		if (Static83.aCanvas14 != null) {
			try {
				Static83.aCanvas14.removeFocusListener(this);
				Static83.aCanvas14.getParent().remove(Static83.aCanvas14);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static470.aClass100_14 != null) {
			try {
				Static470.aClass100_14.method2089();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1269();
		if (Static190.aFrame1 != null) {
			Static190.aFrame1.setVisible(false);
			Static190.aFrame1.dispose();
			Static190.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!dh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)Z")
	public final boolean method1263() {
		return Static82.method1382("jaclib");
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void method1264(@OriginalArg(5) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static580.anApplet_Sub1_1 = this;
			Static559.anInt9421 = 635;
			Static147.anInt2574 = 0;
			Static254.anApplet2 = null;
			Static408.anInt7118 = 768;
			Static28.anInt359 = 768;
			Static246.anInt4491 = 0;
			Static345.anInt5827 = 1024;
			Static312.anInt10525 = 1024;
			Static190.aFrame1 = new Frame();
			Static190.aFrame1.setTitle("Jagex");
			Static190.aFrame1.setResizable(true);
			Static190.aFrame1.addWindowListener(this);
			Static190.aFrame1.setVisible(true);
			Static190.aFrame1.toFront();
			@Pc(48) Insets local48 = Static190.aFrame1.getInsets();
			Static190.aFrame1.setSize(local48.left + Static312.anInt10525 + local48.right, local48.bottom + Static28.anInt359 - -local48.top);
			Static401.aClass100_10 = Static470.aClass100_14 = new Class100(arg1, arg0, 37, true);
			@Pc(82) Class91 local82 = Static470.aClass100_14.method2095(this, 1);
			while (local82.anInt2271 == 0) {
				Static314.method4821(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static524.method7740(local92, null);
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
	private void method1265() {
		@Pc(6) long local6 = Static95.method1587();
		@Pc(10) long local10 = Static446.aLongArray13[Static82.anInt1688];
		Static446.aLongArray13[Static82.anInt1688] = local6;
		Static82.anInt1688 = Static82.anInt1688 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local10 == 0L || local6 <= local10) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static311.aBoolean389 = Static92.aBoolean140;
		}
		this.method1273();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1266(@OriginalArg(1) String arg0) {
		if (this.aBoolean99) {
			return;
		}
		this.aBoolean99 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static653.method5177(Static7.anApplet1, "loggedout");
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)Z")
	public final boolean method1267() {
		return Static82.method1382("jagmisc");
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
	protected abstract void method1268();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	protected abstract void method1269();

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	private void method1270() {
		@Pc(11) long local11 = Static95.method1587();
		@Pc(15) long local15 = Static322.aLongArray5[Static641.anInt10604];
		Static322.aLongArray5[Static641.anInt10604] = local11;
		Static641.anInt10604 = Static641.anInt10604 + 1 & 0x1F;
		if (local15 != 0L && local11 > local15) {
			@Pc(41) int local41 = (int) (local11 - local15);
			Static263.anInt4785 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static193.anInt8329++ > 50) {
			Static193.anInt8329 -= 50;
			Static48.aBoolean60 = true;
			Static83.aCanvas14.setSize(Static345.anInt5827, Static408.anInt7118);
			Static83.aCanvas14.setVisible(true);
			if (Static190.aFrame1 != null && Static323.aFrame2 == null) {
				@Pc(76) Insets local76 = Static190.aFrame1.getInsets();
				Static83.aCanvas14.setLocation(Static246.anInt4491 + local76.left, local76.top + Static147.anInt2574);
			} else {
				Static83.aCanvas14.setLocation(Static246.anInt4491, Static147.anInt2574);
			}
		}
		this.method1271();
	}

	@OriginalMember(owner = "client!dh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static190.aFrame1 == null) {
			return Static7.anApplet1 == null || Static7.anApplet1 == this ? super.getDocumentBase() : Static7.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static190.aFrame1 == null) {
			return Static7.anApplet1 == null || Static7.anApplet1 == this ? super.getCodeBase() : Static7.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!dh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static190.aFrame1 == null) {
			return Static7.anApplet1 == null || Static7.anApplet1 == this ? super.getParameter(arg0) : Static7.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static92.aBoolean140 = true;
		Static48.aBoolean60 = true;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	protected abstract void method1271();

	@OriginalMember(owner = "client!dh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static92.aBoolean140 = false;
	}

	@OriginalMember(owner = "client!dh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILjava/lang/String;BIII)V")
	protected final void method1272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static580.anApplet_Sub1_1 == null) {
				Static254.anApplet2 = Static7.anApplet1;
				Static147.anInt2574 = 0;
				Static559.anInt9421 = 635;
				Static580.anApplet_Sub1_1 = this;
				Static345.anInt5827 = arg1;
				Static312.anInt10525 = arg1;
				Static408.anInt7118 = arg0;
				Static28.anInt359 = arg0;
				Static246.anInt4491 = 0;
				Static401.aClass100_10 = Static470.aClass100_14 = new Class100(arg3, arg2, 37, Static7.anApplet1 != null);
				@Pc(68) Class91 local68 = Static470.aClass100_14.method2095(this, 1);
				while (local68.anInt2271 == 0) {
					Static314.method4821(10L);
				}
			} else {
				Static537.anInt9174++;
				if (Static537.anInt9174 >= 3) {
					this.method1266("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static524.method7740(local81, null);
			this.method1266("crash");
		}
	}

	@OriginalMember(owner = "client!dh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static580.anApplet_Sub1_1 != this || Static625.aBoolean744) {
			return;
		}
		Static48.aBoolean60 = true;
		if (Static121.aBoolean164 && Static95.method1587() - Static180.aLong88 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || local25.width >= Static312.anInt10525 && Static28.anInt359 <= local25.height) {
				Static283.aBoolean376 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	protected abstract void method1273();

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)Z")
	protected final boolean method1274() {
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
				this.method1266("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static580.anApplet_Sub1_1 == this && !Static625.aBoolean744) {
			Static389.aLong161 = 0L;
		}
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
	public synchronized void method1275() {
		if (Static83.aCanvas14 != null) {
			Static83.aCanvas14.removeFocusListener(this);
			Static83.aCanvas14.getParent().setBackground(Color.black);
			Static83.aCanvas14.getParent().remove(Static83.aCanvas14);
		}
		@Pc(26) Container local26;
		if (Static323.aFrame2 != null) {
			local26 = Static323.aFrame2;
		} else if (Static190.aFrame1 != null) {
			local26 = Static190.aFrame1;
		} else if (Static7.anApplet1 == null) {
			local26 = Static580.anApplet_Sub1_1;
		} else {
			local26 = Static7.anApplet1;
		}
		local26.setLayout(null);
		Static83.aCanvas14 = new Canvas_Sub1(this);
		local26.add(Static83.aCanvas14);
		Static83.aCanvas14.setSize(Static345.anInt5827, Static408.anInt7118);
		Static83.aCanvas14.setVisible(true);
		if (local26 == Static190.aFrame1) {
			@Pc(63) Insets local63 = Static190.aFrame1.getInsets();
			Static83.aCanvas14.setLocation(local63.left + Static246.anInt4491, local63.top + Static147.anInt2574);
		} else {
			Static83.aCanvas14.setLocation(Static246.anInt4491, Static147.anInt2574);
		}
		Static83.aCanvas14.addFocusListener(this);
		Static83.aCanvas14.requestFocus();
		Static311.aBoolean389 = true;
		Static92.aBoolean140 = true;
		Static48.aBoolean60 = true;
		Static283.aBoolean376 = false;
		Static180.aLong88 = Static95.method1587();
	}

	@OriginalMember(owner = "client!dh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static144.aString32 != null) {
				@Pc(10) String local10 = Static144.aString32.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static144.aString34;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method1266("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static144.aString34 == null || Static144.aString34.equals("1.4.2"))) {
					this.method1266("wrongjava");
					return;
				}
			}
			if (Static144.aString34 != null && Static144.aString34.startsWith("1.")) {
				@Pc(69) int local69 = 2;
				@Pc(71) int local71 = 0;
				while (Static144.aString34.length() > local69) {
					@Pc(77) char local77 = Static144.aString34.charAt(local69);
					if (local77 < '0' || local77 > '9') {
						break;
					}
					local71 = local77 + local71 * 10 - 48;
					local69++;
				}
				if (local71 >= 5) {
					Static121.aBoolean164 = true;
				}
			}
			@Pc(107) Applet local107 = Static580.anApplet_Sub1_1;
			if (Static7.anApplet1 != null) {
				local107 = Static7.anApplet1;
			}
			@Pc(113) Method local113 = Static144.aMethod2;
			if (local113 != null) {
				try {
					local113.invoke(local107, Boolean.TRUE);
				} catch (@Pc(127) Throwable local127) {
				}
			}
			Static427.method6562();
			Static336.method5071();
			this.method1275();
			this.method1278();
			Static581.aClass47_1 = Static248.method4099();
			while (Static389.aLong161 == 0L || Static389.aLong161 > Static95.method1587()) {
				Static177.anInt3153 = Static581.aClass47_1.method8502(Static152.aLong77);
				for (@Pc(150) int local150 = 0; local150 < Static177.anInt3153; local150++) {
					this.method1265();
				}
				this.method1270();
				Static138.method2021(Static470.aClass100_14, Static83.aCanvas14);
			}
		} catch (@Pc(185) ThreadDeath local185) {
			throw local185;
		} catch (@Pc(188) Throwable local188) {
			Static524.method7740(local188, this.method1280());
			this.method1266("crash");
		} finally {
			@Pc(204) Object local204 = null;
			this.method1262(true);
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
	protected abstract void method1278();

	@OriginalMember(owner = "client!dh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static580.anApplet_Sub1_1 == this && !Static625.aBoolean744) {
			Static389.aLong161 = Static95.method1587();
			Static314.method4821(5000L);
			Static401.aClass100_10 = null;
			this.method1262(false);
		}
	}

	@OriginalMember(owner = "client!dh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(B)Z")
	public final boolean method1279() {
		return Static82.method1382("jagtheora");
	}

	@OriginalMember(owner = "client!dh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static190.aFrame1 == null) {
			return Static7.anApplet1 == null || Static7.anApplet1 == this ? super.getAppletContext() : Static7.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static580.anApplet_Sub1_1 == this && !Static625.aBoolean744) {
			Static389.aLong161 = Static95.method1587() + 4000L;
		}
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method1280() {
		return null;
	}
}
