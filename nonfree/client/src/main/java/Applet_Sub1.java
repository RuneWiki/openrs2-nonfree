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

@OriginalClass("client!vfa")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!vfa", name = "y", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!vfa", name = "G", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!vfa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static110.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static475.aFrame3 == null) {
			return Static110.anApplet1 == null || Static110.anApplet1 == this ? super.getAppletContext() : Static110.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
	protected final void method1147(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static162.anApplet_Sub1_1 == null) {
				Static401.anApplet2 = Static110.anApplet1;
				Static162.anApplet_Sub1_1 = this;
				Static278.anInt5702 = 623;
				Static375.anInt7256 = arg1;
				Static238.anInt4332 = arg1;
				Static179.anInt3617 = 0;
				Static580.anInt2905 = 0;
				Static554.anInt9828 = arg3;
				Static286.anInt5862 = arg3;
				Static358.aClass354_3 = Static406.aClass354_5 = new Class354(arg2, arg0, 35, Static110.anApplet1 != null);
				@Pc(64) Class234 local64 = Static406.aClass354_5.method8231(this, 1);
				while (local64.anInt6717 == 0) {
					Static63.method1019(10L);
				}
			} else {
				Static298.anInt6033++;
				if (Static298.anInt6033 >= 3) {
					this.method1149("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Throwable local76) {
			Static205.method3450(null, local76);
			this.method1149("crash");
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	private void method1148() {
		@Pc(6) long local6 = Static574.method8210();
		@Pc(10) long local10 = Static92.aLongArray1[Static380.anInt7348];
		Static92.aLongArray1[Static380.anInt7348] = local6;
		Static380.anInt7348 = Static380.anInt7348 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static382.anInt7358 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static358.anInt6974++ > 50) {
			Static530.aBoolean664 = true;
			Static358.anInt6974 -= 50;
			Static475.aCanvas12.setSize(Static554.anInt9828, Static375.anInt7256);
			Static475.aCanvas12.setVisible(true);
			if (Static475.aFrame3 != null && Static13.aFrame1 == null) {
				@Pc(75) Insets local75 = Static475.aFrame3.getInsets();
				Static475.aCanvas12.setLocation(local75.left + Static580.anInt2905, Static179.anInt3617 + local75.top);
			} else {
				Static475.aCanvas12.setLocation(Static580.anInt2905, Static179.anInt3617);
			}
		}
		this.method1150();
	}

	@OriginalMember(owner = "client!vfa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1149(@OriginalArg(1) String arg0) {
		if (this.aBoolean68) {
			return;
		}
		this.aBoolean68 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static604.method8248(Static110.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
	protected abstract void method1150();

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BIIIILjava/lang/String;IZ)V")
	protected final void method1151(@OriginalArg(5) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static179.anInt3617 = 0;
			Static401.anApplet2 = null;
			Static580.anInt2905 = 0;
			Static554.anInt9828 = 1024;
			Static286.anInt5862 = 1024;
			Static278.anInt5702 = 623;
			Static375.anInt7256 = 768;
			Static238.anInt4332 = 768;
			Static162.anApplet_Sub1_1 = this;
			Static475.aFrame3 = new Frame();
			Static475.aFrame3.setTitle("Jagex");
			Static475.aFrame3.setResizable(true);
			Static475.aFrame3.addWindowListener(this);
			Static475.aFrame3.setVisible(true);
			Static475.aFrame3.toFront();
			@Pc(52) Insets local52 = Static475.aFrame3.getInsets();
			Static475.aFrame3.setSize(Static286.anInt5862 + local52.left + local52.right, local52.bottom + local52.top + Static238.anInt4332);
			Static358.aClass354_3 = Static406.aClass354_5 = new Class354(arg1, arg0, 35, true);
			@Pc(85) Class234 local85 = Static406.aClass354_5.method8231(this, 1);
			while (local85.anInt6717 == 0) {
				Static63.method1019(10L);
			}
		} catch (@Pc(98) Exception local98) {
			Static205.method3450(null, local98);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Z)V")
	protected abstract void method1152();

	@OriginalMember(owner = "client!vfa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static162.anApplet_Sub1_1 != this || Static118.aBoolean298) {
			return;
		}
		Static530.aBoolean664 = true;
		if (Static70.aBoolean80 && Static574.method8210() - Static31.aLong21 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || local25.width >= Static286.anInt5862 && Static238.anInt4332 <= local25.height) {
				Static498.aBoolean633 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)Z")
	public final boolean method1153() {
		return Static138.method2728("jagmisc");
	}

	@OriginalMember(owner = "client!vfa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static475.aFrame3 == null) {
			return Static110.anApplet1 == null || Static110.anApplet1 == this ? super.getCodeBase() : Static110.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(B)V")
	protected abstract void method1154();

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	public synchronized void method1155() {
		if (Static475.aCanvas12 != null) {
			Static475.aCanvas12.removeFocusListener(this);
			Static475.aCanvas12.getParent().setBackground(Color.black);
			Static475.aCanvas12.getParent().remove(Static475.aCanvas12);
		}
		@Pc(30) Container local30;
		if (Static13.aFrame1 != null) {
			local30 = Static13.aFrame1;
		} else if (Static475.aFrame3 != null) {
			local30 = Static475.aFrame3;
		} else if (Static110.anApplet1 == null) {
			local30 = Static162.anApplet_Sub1_1;
		} else {
			local30 = Static110.anApplet1;
		}
		local30.setLayout(null);
		Static475.aCanvas12 = new Canvas_Sub1(this);
		local30.add(Static475.aCanvas12);
		Static475.aCanvas12.setSize(Static554.anInt9828, Static375.anInt7256);
		Static475.aCanvas12.setVisible(true);
		if (local30 == Static475.aFrame3) {
			@Pc(67) Insets local67 = Static475.aFrame3.getInsets();
			Static475.aCanvas12.setLocation(local67.left + Static580.anInt2905, Static179.anInt3617 + local67.top);
		} else {
			Static475.aCanvas12.setLocation(Static580.anInt2905, Static179.anInt3617);
		}
		Static475.aCanvas12.addFocusListener(this);
		Static475.aCanvas12.requestFocus();
		Static450.aBoolean600 = true;
		Static125.aBoolean210 = true;
		Static530.aBoolean664 = true;
		Static498.aBoolean633 = false;
		Static31.aLong21 = Static574.method8210();
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)Z")
	protected final boolean method1157() {
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
				this.method1149("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vfa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!vfa", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static162.anApplet_Sub1_1 == this && !Static118.aBoolean298) {
			Static328.aLong158 = 0L;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static475.aFrame3 == null) {
			return Static110.anApplet1 == null || Static110.anApplet1 == this ? super.getDocumentBase() : Static110.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static576.aString99 != null) {
				@Pc(10) String local10 = Static576.aString99.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static576.aString98;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method1149("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static576.aString98 == null || Static576.aString98.equals("1.4.2"))) {
					this.method1149("wrongjava");
					return;
				}
			}
			if (Static576.aString98 != null && Static576.aString98.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (Static576.aString98.length() > local70) {
					@Pc(78) char local78 = Static576.aString98.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local72 = local78 + local72 * 10 - '0';
					local70++;
				}
				if (local72 >= 5) {
					Static70.aBoolean80 = true;
				}
			}
			@Pc(112) Applet local112 = Static162.anApplet_Sub1_1;
			if (Static110.anApplet1 != null) {
				local112 = Static110.anApplet1;
			}
			@Pc(118) Method local118 = Static576.aMethod1;
			if (local118 != null) {
				try {
					local118.invoke(local112, Boolean.TRUE);
				} catch (@Pc(132) Throwable local132) {
				}
			}
			Static208.method3465();
			Static584.method8301();
			this.method1155();
			this.method1154();
			Static589.aClass151_1 = Static460.method7017();
			while (Static328.aLong158 == 0L || Static574.method8210() < Static328.aLong158) {
				Static367.anInt7145 = Static589.aClass151_1.method6456(Static239.aLong222);
				for (@Pc(155) int local155 = 0; local155 < Static367.anInt7145; local155++) {
					this.method1164();
				}
				this.method1148();
				Static197.method3386(Static406.aClass354_5, Static475.aCanvas12);
			}
		} catch (@Pc(190) ThreadDeath local190) {
			throw local190;
		} catch (@Pc(193) Throwable local193) {
			Static205.method3450(this.method1165(), local193);
			this.method1149("crash");
		} finally {
			@Pc(209) Object local209 = null;
			this.method1161(true);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "(I)V")
	protected abstract void method1160();

	@OriginalMember(owner = "client!vfa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static475.aFrame3 == null) {
			return Static110.anApplet1 == null || Static110.anApplet1 == this ? super.getParameter(arg0) : Static110.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZI)V")
	private void method1161(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static118.aBoolean298) {
				return;
			}
			Static118.aBoolean298 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static110.anApplet1 != null) {
			Static110.anApplet1.destroy();
		}
		try {
			this.method1160();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean69) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean69 = false;
		}
		Static302.method5181();
		Static587.method8306();
		if (Static475.aCanvas12 != null) {
			try {
				Static475.aCanvas12.removeFocusListener(this);
				Static475.aCanvas12.getParent().remove(Static475.aCanvas12);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static406.aClass354_5 != null) {
			try {
				Static406.aClass354_5.method8225();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method1152();
		if (Static475.aFrame3 != null) {
			Static475.aFrame3.setVisible(false);
			Static475.aFrame3.dispose();
			Static475.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!vfa", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static162.anApplet_Sub1_1 == this && !Static118.aBoolean298) {
			Static328.aLong158 = Static574.method8210();
			Static63.method1019(5000L);
			Static358.aClass354_3 = null;
			this.method1161(false);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(Z)V")
	protected abstract void method1162();

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "(B)Z")
	public final boolean method1163() {
		return Static138.method2728("jaclib");
	}

	@OriginalMember(owner = "client!vfa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static125.aBoolean210 = true;
		Static530.aBoolean664 = true;
	}

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "(I)V")
	private void method1164() {
		@Pc(6) long local6 = Static574.method8210();
		@Pc(18) long local18 = Static587.aLongArray18[Static136.anInt2913];
		Static587.aLongArray18[Static136.anInt2913] = local6;
		@Pc(37) boolean local37;
		if (local18 == 0L || local18 >= local6) {
			local37 = false;
		} else {
			local37 = true;
		}
		Static136.anInt2913 = Static136.anInt2913 + 1 & 0x1F;
		synchronized (this) {
			Static450.aBoolean600 = Static125.aBoolean210;
		}
		this.method1162();
	}

	@OriginalMember(owner = "client!vfa", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method1165() {
		return null;
	}

	@OriginalMember(owner = "client!vfa", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static162.anApplet_Sub1_1 == this && !Static118.aBoolean298) {
			Static328.aLong158 = Static574.method8210() + 4000L;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static125.aBoolean210 = false;
	}
}
