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

@OriginalClass("client!rc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "[I")
	public static final int[] anIntArray87 = new int[16384];

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
	public static final int[] anIntArray85 = new int[16384];

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
	private boolean aBoolean107 = false;

	static {
		@Pc(48) double local48 = 3.834951969714103E-4D;
		for (@Pc(50) int local50 = 0; local50 < 16384; local50++) {
			anIntArray85[local50] = (int) (Math.sin((double) local50 * local48) * 32768.0D);
			anIntArray87[local50] = (int) (Math.cos(local48 * (double) local50) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static330.aBoolean424 = false;
	}

	@OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static225.aFrame1 == null) {
			return Static295.aClass103_5 == null || Static295.aClass103_5.anApplet1 == this ? super.getParameter(arg0) : Static295.aClass103_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
	protected final void method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static205.anApplet_Sub1_1 == null) {
				Static120.anInt2616 = arg0;
				Static251.anInt4721 = arg0;
				Static405.anInt7048 = 0;
				Static385.anInt6686 = arg2;
				Static196.anInt3872 = arg2;
				Static205.anApplet_Sub1_1 = this;
				Static370.anInt6575 = 0;
				Static86.anInt1836 = 583;
				if (Static295.aClass103_5 == null) {
					Static129.aClass103_3 = Static295.aClass103_5 = new Class103(this, arg1, null, 0);
				}
				@Pc(64) Class190 local64 = Static295.aClass103_5.method2832(this, 1);
				while (local64.anInt5799 == 0) {
					Static135.method2458(10L);
				}
			} else {
				Static356.anInt6393++;
				if (Static356.anInt6393 >= 3) {
					this.method1141("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Throwable local74) {
			Static379.method1671(local74, null);
			this.method1141("crash");
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	public final void method1135() {
		if (this.aBoolean106) {
			return;
		}
		try {
			@Pc(17) Class190 local17 = Static295.aClass103_5.method2827(Static205.anApplet_Sub1_1.getClass());
			while (local17.anInt5799 == 0) {
				Static135.method2458(100L);
			}
			if (local17.anObject7 != null) {
				throw (Throwable) local17.anObject7;
			}
			jagmisc.init();
			this.aBoolean106 = true;
			Static62.aClass159_1 = Static130.method4832();
		} catch (@Pc(41) Throwable local41) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	private void method1136() {
		@Pc(6) long local6 = Static150.method2672();
		@Pc(10) long local10 = Static291.aLongArray6[Static413.anInt3902];
		Static291.aLongArray6[Static413.anInt3902] = local6;
		Static413.anInt3902 = Static413.anInt3902 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(33) int local33 = (int) (local6 - local10);
			Static53.anInt1285 = ((local33 >> 1) + 32000) / local33;
		}
		if (Static153.anInt3335++ > 50) {
			Static91.aBoolean161 = true;
			Static153.anInt3335 -= 50;
			Static351.aCanvas6.setSize(Static385.anInt6686, Static120.anInt2616);
			Static351.aCanvas6.setVisible(true);
			if (Static225.aFrame1 != null && Static342.aFrame2 == null) {
				@Pc(68) Insets local68 = Static225.aFrame1.getInsets();
				Static351.aCanvas6.setLocation(Static405.anInt7048 + local68.left, local68.top + Static370.anInt6575);
			} else {
				Static351.aCanvas6.setLocation(Static405.anInt7048, Static370.anInt6575);
			}
		}
		this.method1143();
	}

	@OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static225.aFrame1 == null) {
			return Static295.aClass103_5 == null || Static295.aClass103_5.anApplet1 == this ? super.getAppletContext() : Static295.aClass103_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Z")
	protected final boolean method1138() {
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
				this.method1141("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	protected abstract void method1139();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public final synchronized void method1140() {
		if (Static351.aCanvas6 != null) {
			Static351.aCanvas6.removeFocusListener(this);
			Static351.aCanvas6.getParent().remove(Static351.aCanvas6);
		}
		@Pc(22) Container local22;
		if (Static342.aFrame2 != null) {
			local22 = Static342.aFrame2;
		} else if (Static225.aFrame1 == null) {
			local22 = Static295.aClass103_5.anApplet1;
		} else {
			local22 = Static225.aFrame1;
		}
		local22.setLayout(null);
		Static351.aCanvas6 = new Canvas_Sub1(this);
		local22.add(Static351.aCanvas6);
		Static351.aCanvas6.setSize(Static385.anInt6686, Static120.anInt2616);
		Static351.aCanvas6.setVisible(true);
		if (local22 == Static225.aFrame1) {
			@Pc(54) Insets local54 = Static225.aFrame1.getInsets();
			Static351.aCanvas6.setLocation(local54.left + Static405.anInt7048, local54.top - -Static370.anInt6575);
		} else {
			Static351.aCanvas6.setLocation(Static405.anInt7048, Static370.anInt6575);
		}
		Static351.aCanvas6.addFocusListener(this);
		Static351.aCanvas6.requestFocus();
		Static330.aBoolean424 = true;
		Static108.aBoolean266 = true;
		Static91.aBoolean161 = true;
		Static273.aBoolean374 = false;
		Static294.aLong159 = Static150.method2672();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1141(@OriginalArg(0) String arg0) {
		if (this.aBoolean107) {
			return;
		}
		this.aBoolean107 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static462.method4867(Static295.aClass103_5.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	protected abstract void method1142();

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	protected abstract void method1143();

	@OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static205.anApplet_Sub1_1 == this && !Static217.aBoolean332) {
			Static64.aLong54 = Static150.method2672();
			Static135.method2458(5000L);
			Static129.aClass103_3 = null;
			this.method1147(false);
		}
	}

	@OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	protected abstract void method1146();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
	private void method1147(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static217.aBoolean332) {
				return;
			}
			Static217.aBoolean332 = true;
		}
		if (Static295.aClass103_5.anApplet1 != null) {
			Static295.aClass103_5.anApplet1.destroy();
		}
		try {
			this.method1139();
		} catch (@Pc(31) Exception local31) {
		}
		if (this.aBoolean106) {
			try {
				jagmisc.quit();
			} catch (@Pc(37) Throwable local37) {
			}
			this.aBoolean106 = false;
		}
		@Pc(54) Class190 local54 = Static295.aClass103_5.method2839(Static205.anApplet_Sub1_1.getClass());
		while (local54.anInt5799 == 0) {
			Static135.method2458(100L);
		}
		if (Static351.aCanvas6 != null) {
			try {
				Static351.aCanvas6.removeFocusListener(this);
				Static351.aCanvas6.getParent().remove(Static351.aCanvas6);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static295.aClass103_5 != null) {
			try {
				Static295.aClass103_5.method2838();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method1146();
		if (Static225.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static205.anApplet_Sub1_1 == this && !Static217.aBoolean332) {
			Static64.aLong54 = 0L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static162.aString38 != null) {
					@Pc(10) String local10 = Static162.aString38.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static162.aString35;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1141("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static162.aString35 == null || Static162.aString35.equals("1.4.2"))) {
						this.method1141("wrongjava");
						break label111;
					}
				}
				@Pc(70) int local70;
				if (Static162.aString35 != null && Static162.aString35.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static162.aString35.length() > local70) {
						@Pc(78) char local78 = Static162.aString35.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local72 * 10 + local78 - 48;
					}
					if (local72 >= 5) {
						Static257.aBoolean357 = true;
					}
				}
				if (Static295.aClass103_5.anApplet1 != null) {
					@Pc(116) Method local116 = Static162.aMethod1;
					if (local116 != null) {
						try {
							local116.invoke(Static295.aClass103_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(131) Throwable local131) {
						}
					}
				}
				Static186.method3117();
				Static4.method739();
				this.method1140();
				this.method1153();
				Static62.aClass159_1 = Static130.method4832();
				this.method1135();
				while (Static64.aLong54 == 0L || Static150.method2672() < Static64.aLong54) {
					Static231.anInt4451 = Static62.aClass159_1.method5789(Static286.anInt6049);
					for (local70 = 0; local70 < Static231.anInt4451; local70++) {
						this.method1148();
					}
					this.method1136();
					Static363.method5127(Static295.aClass103_5, Static351.aCanvas6);
				}
			}
		} catch (@Pc(184) Throwable local184) {
			Static379.method1671(local184, null);
			this.method1141("crash");
		}
		this.method1147(true);
	}

	@OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static205.anApplet_Sub1_1 == this && !Static217.aBoolean332) {
			Static64.aLong54 = Static150.method2672() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static225.aFrame1 == null) {
			return Static295.aClass103_5 == null || Static295.aClass103_5.anApplet1 == this ? super.getDocumentBase() : Static295.aClass103_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static205.anApplet_Sub1_1 != this || Static217.aBoolean332) {
			return;
		}
		Static91.aBoolean161 = true;
		if (Static257.aBoolean357 && Static150.method2672() - Static294.aLong159 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static196.anInt3872 <= local24.width && local24.height >= Static251.anInt4721) {
				Static273.aBoolean374 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	private void method1148() {
		@Pc(6) long local6 = Static150.method2672();
		@Pc(10) long local10 = Static439.aLongArray9[Static381.anInt2834];
		Static439.aLongArray9[Static381.anInt2834] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local10 >= local6) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static381.anInt2834 = Static381.anInt2834 + 1 & 0x1F;
		synchronized (this) {
			Static108.aBoolean266 = Static330.aBoolean424;
		}
		this.method1142();
	}

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static330.aBoolean424 = true;
		Static91.aBoolean161 = true;
	}

	@OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static225.aFrame1 == null) {
			return Static295.aClass103_5 == null || Static295.aClass103_5.anApplet1 == this ? super.getCodeBase() : Static295.aClass103_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILjava/lang/String;ZIIIIB)V")
	protected final void method1152(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			Static120.anInt2616 = 768;
			Static251.anInt4721 = 768;
			Static86.anInt1836 = 583;
			Static405.anInt7048 = 0;
			Static205.anApplet_Sub1_1 = this;
			Static385.anInt6686 = 1024;
			Static196.anInt3872 = 1024;
			Static370.anInt6575 = 0;
			Static225.aFrame1 = new Frame();
			Static225.aFrame1.setTitle("Jagex");
			Static225.aFrame1.setResizable(true);
			Static225.aFrame1.addWindowListener(this);
			Static225.aFrame1.setVisible(true);
			Static225.aFrame1.toFront();
			@Pc(46) Insets local46 = Static225.aFrame1.getInsets();
			Static225.aFrame1.setSize(local46.left + Static196.anInt3872 + local46.right, local46.top + Static251.anInt4721 + local46.bottom);
			Static129.aClass103_3 = Static295.aClass103_5 = new Class103(null, arg0, arg1, 30);
			@Pc(78) Class190 local78 = Static295.aClass103_5.method2832(this, 1);
			while (local78.anInt5799 == 0) {
				Static135.method2458(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static379.method1671(local88, null);
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	protected abstract void method1153();
}
