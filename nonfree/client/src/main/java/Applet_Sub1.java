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

@OriginalClass("client!gd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!gd", name = "U", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!gd", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static265.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1191() {
		return null;
	}

	@OriginalMember(owner = "client!gd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1192(@OriginalArg(1) String arg0) {
		if (this.aBoolean102) {
			return;
		}
		this.aBoolean102 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static684.method782(Static265.anApplet2, "loggedout");
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static207.aFrame2 == null) {
			return Static265.anApplet2 == null || Static265.anApplet2 == this ? super.getAppletContext() : Static265.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static576.aString110 != null) {
				@Pc(10) String local10 = Static576.aString110.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(29) String local29 = Static576.aString107;
					if (local29.equals("1.1") || local29.startsWith("1.1.") || local29.equals("1.2") || local29.startsWith("1.2.")) {
						this.method1192("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static576.aString107 == null || Static576.aString107.equals("1.4.2"))) {
					this.method1192("wrongjava");
					return;
				}
			}
			if (Static576.aString107 != null && Static576.aString107.startsWith("1.")) {
				@Pc(115) int local115 = 2;
				@Pc(117) int local117 = 0;
				while (local115 < Static576.aString107.length()) {
					@Pc(125) char local125 = Static576.aString107.charAt(local115);
					if (local125 < '0' || local125 > '9') {
						break;
					}
					local117 = local125 + local117 * 10 - '0';
					local115++;
				}
				if (local117 >= 5) {
					Static85.aBoolean694 = true;
				}
			}
			@Pc(171) Applet local171 = Static597.anApplet_Sub1_1;
			if (Static265.anApplet2 != null) {
				local171 = Static265.anApplet2;
			}
			@Pc(177) Method local177 = Static576.aMethod1;
			if (local177 != null) {
				try {
					local177.invoke(local171, Boolean.TRUE);
				} catch (@Pc(191) Throwable local191) {
				}
			}
			Static64.method1080();
			Static312.method4811();
			this.method1205();
			this.method1204();
			Static446.aClass36_1 = Static603.method8268();
			while (Static73.aLong53 == 0L || Static73.aLong53 > Static480.method6763()) {
				Static261.anInt4684 = Static446.aClass36_1.method3809(Static137.aLong81);
				for (@Pc(216) int local216 = 0; local216 < Static261.anInt4684; local216++) {
					this.method1200();
				}
				this.method1193();
				Static266.method4313(Static681.aClass349_6, Static357.aCanvas8);
			}
		} catch (@Pc(257) ThreadDeath local257) {
			throw local257;
		} catch (@Pc(260) Throwable local260) {
			Static522.method7115(local260, this.method1191());
			this.method1192("crash");
		} finally {
			@Pc(278) Object local278 = null;
			this.method1203(true);
		}
	}

	@OriginalMember(owner = "client!gd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static207.aFrame2 == null) {
			return Static265.anApplet2 == null || Static265.anApplet2 == this ? super.getCodeBase() : Static265.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	private void method1193() {
		@Pc(6) long local6 = Static480.method6763();
		@Pc(10) long local10 = Static656.aLongArray21[Static200.anInt3621];
		Static656.aLongArray21[Static200.anInt3621] = local6;
		Static200.anInt3621 = Static200.anInt3621 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(38) int local38 = (int) (local6 - local10);
			Static69.anInt1172 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static18.anInt238++ > 50) {
			Static18.anInt238 -= 50;
			Static538.aBoolean565 = true;
			Static357.aCanvas8.setSize(Static85.anInt9921, Static256.anInt4629);
			Static357.aCanvas8.setVisible(true);
			if (Static207.aFrame2 != null && Static95.aFrame1 == null) {
				@Pc(77) Insets local77 = Static207.aFrame2.getInsets();
				Static357.aCanvas8.setLocation(local77.left + Static304.anInt5288, Static517.anInt8215 + local77.top);
			} else {
				Static357.aCanvas8.setLocation(Static304.anInt5288, Static517.anInt8215);
			}
		}
		this.method1194();
	}

	@OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static387.aBoolean429 = false;
	}

	@OriginalMember(owner = "client!gd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
	protected abstract void method1194();

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(B)V")
	protected abstract void method1195();

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	protected abstract void method1196();

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Z")
	public final boolean method1197() {
		return Static472.method6674("jaclib");
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Z")
	public final boolean method1198() {
		return Static472.method6674("jagmisc");
	}

	@OriginalMember(owner = "client!gd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static597.anApplet_Sub1_1 == this && !Static414.aBoolean464) {
			Static73.aLong53 = Static480.method6763() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static207.aFrame2 == null) {
			return Static265.anApplet2 == null || Static265.anApplet2 == this ? super.getParameter(arg0) : Static265.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method1199(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (Static597.anApplet_Sub1_1 == null) {
				Static155.anApplet1 = Static265.anApplet2;
				Static85.anInt9921 = arg3;
				Static166.anInt3250 = arg3;
				Static256.anInt4629 = arg2;
				Static249.anInt4342 = arg2;
				Static166.anInt3254 = 656;
				Static597.anApplet_Sub1_1 = this;
				Static304.anInt5288 = 0;
				Static517.anInt8215 = 0;
				Static9.aClass349_2 = Static681.aClass349_6 = new Class349(arg1, arg0, 37, Static265.anApplet2 != null);
				@Pc(72) Class361 local72 = Static681.aClass349_6.method7746(this, 1);
				while (local72.anInt9720 == 0) {
					Static620.method7045(-4, 10L);
				}
				if (-1 != -1) {
					this.windowOpened((WindowEvent) null);
				}
			} else {
				Static30.anInt445++;
				if (Static30.anInt445 >= 3) {
					this.method1192("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(97) Throwable local97) {
			Static522.method7115(local97, (String) null);
			this.method1192("crash");
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	private void method1200() {
		@Pc(6) long local6 = Static480.method6763();
		@Pc(10) long local10 = Static7.aLongArray2[Static383.anInt6453];
		Static7.aLongArray2[Static383.anInt6453] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local6 <= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static383.anInt6453 = Static383.anInt6453 + 1 & 0x1F;
		synchronized (this) {
			Static645.aBoolean756 = Static387.aBoolean429;
		}
		this.method1196();
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
	protected abstract void method1201();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)Z")
	public final boolean method1202() {
		return Static472.method6674("jagtheora");
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	private void method1203(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static414.aBoolean464) {
				return;
			}
			Static414.aBoolean464 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static265.anApplet2 != null) {
			Static265.anApplet2.destroy();
		}
		try {
			this.method1201();
		} catch (@Pc(42) Exception local42) {
		}
		if (this.aBoolean103) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable local48) {
			}
			this.aBoolean103 = false;
		}
		Static679.method9178();
		Static73.method1223();
		if (Static357.aCanvas8 != null) {
			try {
				Static357.aCanvas8.removeFocusListener(this);
				Static357.aCanvas8.getParent().remove(Static357.aCanvas8);
			} catch (@Pc(68) Exception local68) {
			}
		}
		if (Static681.aClass349_6 != null) {
			try {
				Static681.aClass349_6.method7735();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method1195();
		if (Static207.aFrame2 != null) {
			Static207.aFrame2.setVisible(false);
			Static207.aFrame2.dispose();
			Static207.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static597.anApplet_Sub1_1 == this && !Static414.aBoolean464) {
			Static73.aLong53 = Static480.method6763();
			Static620.method7045(-4, 5000L);
			Static9.aClass349_2 = null;
			this.method1203(false);
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	protected abstract void method1204();

	@OriginalMember(owner = "client!gd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static597.anApplet_Sub1_1 != this || Static414.aBoolean464) {
			return;
		}
		Static538.aBoolean565 = true;
		if (Static85.aBoolean694 && Static480.method6763() - Static62.aLong43 > 1000L) {
			@Pc(31) Rectangle local31 = arg0.getClipBounds();
			if (local31 == null || local31.width >= Static166.anInt3250 && local31.height >= Static249.anInt4342) {
				Static549.aBoolean574 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!gd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static597.anApplet_Sub1_1 == this && !Static414.aBoolean464) {
			Static73.aLong53 = 0L;
		}
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	public synchronized void method1205() {
		if (Static357.aCanvas8 != null) {
			Static357.aCanvas8.removeFocusListener(this);
			Static357.aCanvas8.getParent().setBackground(Color.black);
			Static357.aCanvas8.getParent().remove(Static357.aCanvas8);
		}
		@Pc(40) Container local40;
		if (Static95.aFrame1 != null) {
			local40 = Static95.aFrame1;
		} else if (Static207.aFrame2 != null) {
			local40 = Static207.aFrame2;
		} else if (Static265.anApplet2 == null) {
			local40 = Static597.anApplet_Sub1_1;
		} else {
			local40 = Static265.anApplet2;
		}
		local40.setLayout((LayoutManager) null);
		Static357.aCanvas8 = new Canvas_Sub1(this);
		local40.add(Static357.aCanvas8);
		Static357.aCanvas8.setSize(Static85.anInt9921, Static256.anInt4629);
		Static357.aCanvas8.setVisible(true);
		if (Static207.aFrame2 == local40) {
			@Pc(77) Insets local77 = Static207.aFrame2.getInsets();
			Static357.aCanvas8.setLocation(local77.left + Static304.anInt5288, local77.top - -Static517.anInt8215);
		} else {
			Static357.aCanvas8.setLocation(Static304.anInt5288, Static517.anInt8215);
		}
		Static357.aCanvas8.addFocusListener(this);
		Static357.aCanvas8.requestFocus();
		Static645.aBoolean756 = true;
		Static387.aBoolean429 = true;
		Static538.aBoolean565 = true;
		Static549.aBoolean574 = false;
		Static62.aLong43 = Static480.method6763();
	}

	@OriginalMember(owner = "client!gd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static387.aBoolean429 = true;
		Static538.aBoolean565 = true;
	}

	@OriginalMember(owner = "client!gd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIBIIILjava/lang/String;)V")
	protected final void method1206(@OriginalArg(5) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static85.anInt9921 = 1024;
			Static166.anInt3250 = 1024;
			Static517.anInt8215 = 0;
			Static166.anInt3254 = 656;
			Static256.anInt4629 = 768;
			Static249.anInt4342 = 768;
			Static155.anApplet1 = null;
			Static597.anApplet_Sub1_1 = this;
			Static304.anInt5288 = 0;
			Static207.aFrame2 = new Frame();
			Static207.aFrame2.setTitle("Jagex");
			Static207.aFrame2.setResizable(true);
			Static207.aFrame2.addWindowListener(this);
			Static207.aFrame2.setVisible(true);
			Static207.aFrame2.toFront();
			@Pc(47) Insets local47 = Static207.aFrame2.getInsets();
			Static207.aFrame2.setSize(local47.right + Static166.anInt3250 + local47.left, Static249.anInt4342 - (-local47.top + -local47.bottom));
			Static9.aClass349_2 = Static681.aClass349_6 = new Class349(arg0, arg1, 37, true);
			@Pc(81) Class361 local81 = Static681.aClass349_6.method7746(this, 1);
			while (local81.anInt9720 == 0) {
				Static620.method7045(-4, 10L);
			}
		} catch (@Pc(93) Exception local93) {
			Static522.method7115(local93, (String) null);
		}
	}

	@OriginalMember(owner = "client!gd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static207.aFrame2 == null) {
			return Static265.anApplet2 == null || Static265.anApplet2 == this ? super.getDocumentBase() : Static265.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)Z")
	protected final boolean method1207() {
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
				this.method1192("invalidhost");
				return false;
			}
		}
	}
}
