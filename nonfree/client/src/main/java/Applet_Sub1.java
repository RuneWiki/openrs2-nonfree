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

@OriginalClass("client!lca")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!lca", name = "B", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!lca", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static304.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	protected abstract void method1683();

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
	protected abstract void method1684();

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	protected abstract void method1685();

	@OriginalMember(owner = "client!lca", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V")
	private void method1686() {
		@Pc(6) long local6 = Static96.method2000();
		@Pc(10) long local10 = Static545.aLongArray15[Static491.anInt8435];
		Static545.aLongArray15[Static491.anInt8435] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local10 >= local6) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static491.anInt8435 = Static491.anInt8435 + 1 & 0x1F;
		synchronized (this) {
			Static269.aBoolean336 = Static245.aBoolean315;
		}
		this.method1690();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
	public synchronized void method1687() {
		if (Static129.aCanvas6 != null) {
			Static129.aCanvas6.removeFocusListener(this);
			Static129.aCanvas6.getParent().setBackground(Color.black);
			Static129.aCanvas6.getParent().remove(Static129.aCanvas6);
		}
		@Pc(24) Container local24;
		if (Static178.aFrame3 != null) {
			local24 = Static178.aFrame3;
		} else if (Static302.aFrame2 != null) {
			local24 = Static302.aFrame2;
		} else if (Static304.anApplet1 == null) {
			local24 = Static350.anApplet_Sub1_1;
		} else {
			local24 = Static304.anApplet1;
		}
		local24.setLayout(null);
		Static129.aCanvas6 = new Canvas_Sub1(this);
		local24.add(Static129.aCanvas6);
		Static129.aCanvas6.setSize(Static34.anInt3201, Static492.anInt8445);
		Static129.aCanvas6.setVisible(true);
		if (Static302.aFrame2 == local24) {
			@Pc(69) Insets local69 = Static302.aFrame2.getInsets();
			Static129.aCanvas6.setLocation(local69.left + Static537.anInt9359, local69.top - -Static490.anInt8427);
		} else {
			Static129.aCanvas6.setLocation(Static537.anInt9359, Static490.anInt8427);
		}
		Static129.aCanvas6.addFocusListener(this);
		Static129.aCanvas6.requestFocus();
		Static269.aBoolean336 = true;
		Static245.aBoolean315 = true;
		Static69.aBoolean465 = true;
		Static32.aBoolean231 = false;
		Static27.aLong11 = Static96.method2000();
	}

	@OriginalMember(owner = "client!lca", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lca", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static302.aFrame2 == null) {
			return Static304.anApplet1 == null || Static304.anApplet1 == this ? super.getAppletContext() : Static304.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lca", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static350.anApplet_Sub1_1 != this || Static23.aBoolean16) {
			return;
		}
		Static69.aBoolean465 = true;
		if (Static297.aBoolean587 && Static96.method2000() - Static27.aLong11 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static483.anInt8361 <= local26.width && Static429.anInt7984 <= local26.height) {
				Static32.aBoolean231 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZZIIILjava/lang/String;I)V")
	protected final void method1688(@OriginalArg(5) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static34.anInt3201 = 1024;
			Static483.anInt8361 = 1024;
			Static537.anInt9359 = 0;
			Static350.anApplet_Sub1_1 = this;
			Static492.anInt8445 = 768;
			Static429.anInt7984 = 768;
			Static490.anInt8427 = 0;
			Static560.anApplet2 = null;
			Static509.anInt6570 = 625;
			Static302.aFrame2 = new Frame();
			Static302.aFrame2.setTitle("Jagex");
			Static302.aFrame2.setResizable(true);
			Static302.aFrame2.addWindowListener(this);
			Static302.aFrame2.setVisible(true);
			Static302.aFrame2.toFront();
			@Pc(44) Insets local44 = Static302.aFrame2.getInsets();
			Static302.aFrame2.setSize(Static483.anInt8361 + local44.left + local44.right, local44.bottom + Static429.anInt7984 - -local44.top);
			Static210.aClass168_17 = Static467.aClass168_12 = new Class168(arg0, arg1, 35, true);
			@Pc(79) Class309 local79 = Static467.aClass168_12.method4091(this, 1);
			while (local79.anInt8650 == 0) {
				Static373.method5240(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static332.method1390(local89, null);
		}
	}

	@OriginalMember(owner = "client!lca", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static302.aFrame2 == null) {
			return Static304.anApplet1 == null || Static304.anApplet1 == this ? super.getCodeBase() : Static304.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lca", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static350.anApplet_Sub1_1 == this && !Static23.aBoolean16) {
			Static69.aLong180 = Static96.method2000() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V")
	protected abstract void method1689();

	@OriginalMember(owner = "client!lca", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static245.aBoolean315 = false;
	}

	@OriginalMember(owner = "client!lca", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static350.anApplet_Sub1_1 == this && !Static23.aBoolean16) {
			Static69.aLong180 = Static96.method2000();
			Static373.method5240(5000L);
			Static210.aClass168_17 = null;
			this.method1696(false);
		}
	}

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)V")
	protected abstract void method1690();

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1691(@OriginalArg(1) String arg0) {
		if (this.aBoolean148) {
			return;
		}
		this.aBoolean148 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static600.method2906("loggedout", Static304.anApplet1);
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "(I)Z")
	public final boolean method1692() {
		return Static298.method4529("jagmisc");
	}

	@OriginalMember(owner = "client!lca", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
	private void method1693() {
		@Pc(14) long local14 = Static96.method2000();
		@Pc(18) long local18 = Static369.aLongArray13[Static28.anInt364];
		Static369.aLongArray13[Static28.anInt364] = local14;
		Static28.anInt364 = Static28.anInt364 + 1 & 0x1F;
		if (local18 != 0L && local18 < local14) {
			@Pc(44) int local44 = (int) (local14 - local18);
			Static180.anInt3953 = ((local44 >> 1) + 32000) / local44;
		}
		if (Static315.anInt5710++ > 50) {
			Static69.aBoolean465 = true;
			Static315.anInt5710 -= 50;
			Static129.aCanvas6.setSize(Static34.anInt3201, Static492.anInt8445);
			Static129.aCanvas6.setVisible(true);
			if (Static302.aFrame2 != null && Static178.aFrame3 == null) {
				@Pc(79) Insets local79 = Static302.aFrame2.getInsets();
				Static129.aCanvas6.setLocation(local79.left + Static537.anInt9359, local79.top - -Static490.anInt8427);
			} else {
				Static129.aCanvas6.setLocation(Static537.anInt9359, Static490.anInt8427);
			}
		}
		this.method1689();
	}

	@OriginalMember(owner = "client!lca", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static350.anApplet_Sub1_1 == this && !Static23.aBoolean16) {
			Static69.aLong180 = 0L;
		}
	}

	@OriginalMember(owner = "client!lca", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static245.aBoolean315 = true;
		Static69.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!lca", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static302.aFrame2 == null) {
			return Static304.anApplet1 == null || Static304.anApplet1 == this ? super.getDocumentBase() : Static304.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)Z")
	protected final boolean method1695() {
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
				this.method1691("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lca", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZI)V")
	private void method1696(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static23.aBoolean16) {
				return;
			}
			Static23.aBoolean16 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static304.anApplet1 != null) {
			Static304.anApplet1.destroy();
		}
		try {
			this.method1683();
		} catch (@Pc(45) Exception local45) {
		}
		if (this.aBoolean147) {
			try {
				jagmisc.quit();
			} catch (@Pc(51) Throwable local51) {
			}
			this.aBoolean147 = false;
		}
		Static41.method1085();
		Static186.method3291();
		if (Static129.aCanvas6 != null) {
			try {
				Static129.aCanvas6.removeFocusListener(this);
				Static129.aCanvas6.getParent().remove(Static129.aCanvas6);
			} catch (@Pc(71) Exception local71) {
			}
		}
		if (Static467.aClass168_12 != null) {
			try {
				Static467.aClass168_12.method4095();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method1685();
		if (Static302.aFrame2 != null) {
			Static302.aFrame2.setVisible(false);
			Static302.aFrame2.dispose();
			Static302.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method1697(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static350.anApplet_Sub1_1 == null) {
				Static509.anInt6570 = 625;
				Static492.anInt8445 = arg3;
				Static429.anInt7984 = arg3;
				Static350.anApplet_Sub1_1 = this;
				Static537.anInt9359 = 0;
				Static490.anInt8427 = 0;
				Static34.anInt3201 = arg0;
				Static483.anInt8361 = arg0;
				Static560.anApplet2 = Static304.anApplet1;
				Static210.aClass168_17 = Static467.aClass168_12 = new Class168(arg2, arg1, 35, Static304.anApplet1 != null);
				@Pc(68) Class309 local68 = Static467.aClass168_12.method4091(this, 1);
				while (local68.anInt8650 == 0) {
					Static373.method5240(10L);
				}
			} else {
				Static150.anInt3468++;
				if (Static150.anInt3468 >= 3) {
					this.method1691("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Throwable local78) {
			Static332.method1390(local78, null);
			this.method1691("crash");
		}
	}

	@OriginalMember(owner = "client!lca", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method1698() {
		return null;
	}

	@OriginalMember(owner = "client!lca", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static302.aFrame2 == null) {
			return Static304.anApplet1 == null || Static304.anApplet1 == this ? super.getParameter(arg0) : Static304.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "(B)Z")
	public final boolean method1701() {
		return Static298.method4529("jaclib");
	}

	@OriginalMember(owner = "client!lca", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lca", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static268.aString131 != null) {
				@Pc(10) String local10 = Static268.aString131.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static268.aString134;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1691("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static268.aString134 == null || Static268.aString134.equals("1.4.2"))) {
					this.method1691("wrongjava");
					return;
				}
			}
			if (Static268.aString134 != null && Static268.aString134.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static268.aString134.length()) {
					@Pc(78) char local78 = Static268.aString134.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local72 = local78 + local72 * 10 - '0';
					local70++;
				}
				if (local72 >= 5) {
					Static297.aBoolean587 = true;
				}
			}
			@Pc(114) Applet local114 = Static350.anApplet_Sub1_1;
			if (Static304.anApplet1 != null) {
				local114 = Static304.anApplet1;
			}
			@Pc(120) Method local120 = Static268.aMethod1;
			if (local120 != null) {
				try {
					local120.invoke(local114, Boolean.TRUE);
				} catch (@Pc(134) Throwable local134) {
				}
			}
			Static346.method5019();
			Static181.method3233();
			this.method1687();
			this.method1684();
			Static83.aClass125_1 = Static139.method4615();
			while (Static69.aLong180 == 0L || Static96.method2000() < Static69.aLong180) {
				Static335.anInt6045 = Static83.aClass125_1.method8180(Static310.aLong157);
				for (@Pc(157) int local157 = 0; local157 < Static335.anInt6045; local157++) {
					this.method1686();
				}
				this.method1693();
				Static7.method63(Static467.aClass168_12, Static129.aCanvas6);
			}
		} catch (@Pc(192) ThreadDeath local192) {
			throw local192;
		} catch (@Pc(195) Throwable local195) {
			Static332.method1390(local195, this.method1698());
			this.method1691("crash");
		} finally {
			@Pc(211) Object local211 = null;
			this.method1696(true);
		}
	}
}
