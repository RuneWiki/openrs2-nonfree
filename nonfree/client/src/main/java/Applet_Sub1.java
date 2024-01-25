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

@OriginalClass("client!bs")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!bs", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static198.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
	private void method1013() {
		@Pc(6) long local6 = Static416.method5922();
		@Pc(10) long local10 = Static137.aLongArray12[Static315.anInt6063];
		Static137.aLongArray12[Static315.anInt6063] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static315.anInt6063 = Static315.anInt6063 + 1 & 0x1F;
		synchronized (this) {
			Static162.aBoolean225 = Static100.aBoolean120;
		}
		this.method1026();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
	protected abstract void method1014();

	@OriginalMember(owner = "client!bs", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!bs", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static508.aString76 != null) {
				@Pc(10) String local10 = Static508.aString76.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static508.aString78;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method1029("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static508.aString78 == null || Static508.aString78.equals("1.4.2"))) {
					this.method1029("wrongjava");
					return;
				}
			}
			if (Static508.aString78 != null && Static508.aString78.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static508.aString78.length()) {
					@Pc(78) char local78 = Static508.aString78.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local72 * 10 + local78 - 48;
				}
				if (local72 >= 5) {
					Static270.aBoolean353 = true;
				}
			}
			@Pc(112) Applet local112 = Static576.anApplet_Sub1_1;
			if (Static198.anApplet1 != null) {
				local112 = Static198.anApplet1;
			}
			@Pc(118) Method local118 = Static508.aMethod2;
			if (local118 != null) {
				try {
					local118.invoke(local112, Boolean.TRUE);
				} catch (@Pc(132) Throwable local132) {
				}
			}
			Static281.method4290();
			Static425.method5990();
			this.method1019();
			this.method1028();
			Static536.aClass32_1 = Static39.method646();
			while (Static307.aLong139 == 0L || Static307.aLong139 > Static416.method5922()) {
				Static1.anInt30 = Static536.aClass32_1.method7210(Static271.aLong100);
				for (@Pc(155) int local155 = 0; local155 < Static1.anInt30; local155++) {
					this.method1013();
				}
				this.method1015();
				Static200.method3330(Static77.aCanvas1, Static174.aClass313_24);
			}
		} catch (@Pc(188) ThreadDeath local188) {
			throw local188;
		} catch (@Pc(191) Throwable local191) {
			Static214.method5693(this.method1018(), local191);
			this.method1029("crash");
		} finally {
			@Pc(207) Object local207 = null;
			this.method1027(true);
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
	private void method1015() {
		@Pc(6) long local6 = Static416.method5922();
		@Pc(16) long local16 = Static9.aLongArray2[Static492.anInt8636];
		Static9.aLongArray2[Static492.anInt8636] = local6;
		Static492.anInt8636 = Static492.anInt8636 + 1 & 0x1F;
		if (local16 != 0L && local16 < local6) {
			@Pc(40) int local40 = (int) (local6 - local16);
			Static236.anInt4289 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static122.anInt2117++ > 50) {
			Static122.anInt2117 -= 50;
			Static485.aBoolean558 = true;
			Static77.aCanvas1.setSize(Static367.anInt6719, Static154.anInt2867);
			Static77.aCanvas1.setVisible(true);
			if (Static435.aFrame2 != null && Static85.aFrame1 == null) {
				@Pc(82) Insets local82 = Static435.aFrame2.getInsets();
				Static77.aCanvas1.setLocation(Static201.anInt3846 + local82.left, Static223.anInt4111 + local82.top);
			} else {
				Static77.aCanvas1.setLocation(Static201.anInt3846, Static223.anInt4111);
			}
		}
		this.method1014();
	}

	@OriginalMember(owner = "client!bs", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
	protected abstract void method1016();

	@OriginalMember(owner = "client!bs", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static100.aBoolean120 = false;
	}

	@OriginalMember(owner = "client!bs", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static576.anApplet_Sub1_1 == this && !Static307.aBoolean403) {
			Static307.aLong139 = Static416.method5922() + 4000L;
		}
	}

	@OriginalMember(owner = "client!bs", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static435.aFrame2 == null) {
			return Static198.anApplet1 == null || Static198.anApplet1 == this ? super.getAppletContext() : Static198.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bs", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Z")
	public final boolean method1017() {
		return Static560.method7781("jaclib");
	}

	@OriginalMember(owner = "client!bs", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static576.anApplet_Sub1_1 != this || Static307.aBoolean403) {
			return;
		}
		Static485.aBoolean558 = true;
		if (Static270.aBoolean353 && Static416.method5922() - Static177.aLong71 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static258.anInt4672 <= local25.width && local25.height >= Static460.anInt8100) {
				Static142.aBoolean211 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method1018() {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)V")
	public final synchronized void method1019() {
		if (Static77.aCanvas1 != null) {
			Static77.aCanvas1.removeFocusListener(this);
			Static77.aCanvas1.getParent().remove(Static77.aCanvas1);
		}
		@Pc(22) Container local22;
		if (Static85.aFrame1 != null) {
			local22 = Static85.aFrame1;
		} else if (Static435.aFrame2 != null) {
			local22 = Static435.aFrame2;
		} else if (Static198.anApplet1 == null) {
			local22 = Static576.anApplet_Sub1_1;
		} else {
			local22 = Static198.anApplet1;
		}
		local22.setLayout(null);
		Static77.aCanvas1 = new Canvas_Sub1(this);
		local22.add(Static77.aCanvas1);
		Static77.aCanvas1.setSize(Static367.anInt6719, Static154.anInt2867);
		Static77.aCanvas1.setVisible(true);
		if (Static435.aFrame2 == local22) {
			@Pc(64) Insets local64 = Static435.aFrame2.getInsets();
			Static77.aCanvas1.setLocation(Static201.anInt3846 + local64.left, Static223.anInt4111 + local64.top);
		} else {
			Static77.aCanvas1.setLocation(Static201.anInt3846, Static223.anInt4111);
		}
		Static77.aCanvas1.addFocusListener(this);
		Static77.aCanvas1.requestFocus();
		Static162.aBoolean225 = true;
		Static100.aBoolean120 = true;
		Static485.aBoolean558 = true;
		Static142.aBoolean211 = false;
		Static177.aLong71 = Static416.method5922();
	}

	@OriginalMember(owner = "client!bs", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!bs", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static435.aFrame2 == null) {
			return Static198.anApplet1 == null || Static198.anApplet1 == this ? super.getCodeBase() : Static198.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bs", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static100.aBoolean120 = true;
		Static485.aBoolean558 = true;
	}

	@OriginalMember(owner = "client!bs", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static576.anApplet_Sub1_1 == this && !Static307.aBoolean403) {
			Static307.aLong139 = 0L;
		}
	}

	@OriginalMember(owner = "client!bs", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIILjava/lang/String;ZII)V")
	protected final void method1020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static576.anApplet_Sub1_1 == null) {
				Static223.anInt4111 = 0;
				Static367.anInt6719 = arg1;
				Static258.anInt4672 = arg1;
				Static312.anApplet2 = Static198.anApplet1;
				Static201.anInt3846 = 0;
				Static154.anInt2867 = arg0;
				Static460.anInt8100 = arg0;
				Static576.anApplet_Sub1_1 = this;
				Static282.anInt5205 = 614;
				Static118.aClass313_51 = Static174.aClass313_24 = new Class313(arg3, arg2, 34, Static198.anApplet1 != null);
				@Pc(68) Class224 local68 = Static174.aClass313_24.method6991(1, this);
				while (local68.anInt6632 == 0) {
					Static183.method3079(10L);
				}
			} else {
				Static86.anInt10002++;
				if (Static86.anInt10002 >= 3) {
					this.method1029("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static214.method5693(null, local81);
			this.method1029("crash");
		}
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
	protected abstract void method1021();

	@OriginalMember(owner = "client!bs", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static435.aFrame2 == null) {
			return Static198.anApplet1 == null || Static198.anApplet1 == this ? super.getParameter(arg0) : Static198.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILjava/lang/String;BIZII)V")
	protected final void method1022(@OriginalArg(2) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static223.anInt4111 = 0;
			Static201.anInt3846 = 0;
			Static154.anInt2867 = 768;
			Static460.anInt8100 = 768;
			Static367.anInt6719 = 1024;
			Static258.anInt4672 = 1024;
			Static282.anInt5205 = 614;
			Static576.anApplet_Sub1_1 = this;
			Static312.anApplet2 = null;
			Static435.aFrame2 = new Frame();
			Static435.aFrame2.setTitle("Jagex");
			Static435.aFrame2.setResizable(true);
			Static435.aFrame2.addWindowListener(this);
			Static435.aFrame2.setVisible(true);
			Static435.aFrame2.toFront();
			@Pc(48) Insets local48 = Static435.aFrame2.getInsets();
			Static435.aFrame2.setSize(local48.right + Static258.anInt4672 + local48.left, Static460.anInt8100 + local48.top + local48.bottom);
			Static118.aClass313_51 = Static174.aClass313_24 = new Class313(arg1, arg0, 34, true);
			@Pc(80) Class224 local80 = Static174.aClass313_24.method6991(1, this);
			while (local80.anInt6632 == 0) {
				Static183.method3079(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static214.method5693(null, local90);
		}
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)Z")
	protected final boolean method1023() {
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
				this.method1029("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(B)Z")
	public final boolean method1025() {
		return Static560.method7781("jagmisc");
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
	protected abstract void method1026();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZB)V")
	private void method1027(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static307.aBoolean403) {
				return;
			}
			Static307.aBoolean403 = true;
		}
		if (Static198.anApplet1 != null) {
			Static198.anApplet1.destroy();
		}
		try {
			this.method1021();
		} catch (@Pc(44) Exception local44) {
		}
		if (this.aBoolean89) {
			try {
				jagmisc.quit();
			} catch (@Pc(50) Throwable local50) {
			}
			this.aBoolean89 = false;
		}
		Static489.method6852();
		Static328.method5050();
		if (Static77.aCanvas1 != null) {
			try {
				Static77.aCanvas1.removeFocusListener(this);
				Static77.aCanvas1.getParent().remove(Static77.aCanvas1);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static174.aClass313_24 != null) {
			try {
				Static174.aClass313_24.method6983();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method1016();
		if (Static435.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
	protected abstract void method1028();

	@OriginalMember(owner = "client!bs", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static576.anApplet_Sub1_1 == this && !Static307.aBoolean403) {
			Static307.aLong139 = Static416.method5922();
			Static183.method3079(5000L);
			Static118.aClass313_51 = null;
			this.method1027(false);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1029(@OriginalArg(1) String arg0) {
		if (this.aBoolean90) {
			return;
		}
		this.aBoolean90 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static594.method6348("loggedout", Static198.anApplet1);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!bs", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static435.aFrame2 == null) {
			return Static198.anApplet1 == null || Static198.anApplet1 == this ? super.getDocumentBase() : Static198.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}
}
