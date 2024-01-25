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

@OriginalClass("client!wh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!wh", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static492.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	protected abstract void method1226();

	@OriginalMember(owner = "client!wh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static453.aBoolean590 = true;
		Static494.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!wh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1228() {
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
	private void method1229(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static265.aBoolean357) {
				return;
			}
			Static265.aBoolean357 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static492.anApplet2 != null) {
			Static492.anApplet2.destroy();
		}
		try {
			this.method1243();
		} catch (@Pc(50) Exception local50) {
		}
		if (this.aBoolean113) {
			try {
				jagmisc.quit();
			} catch (@Pc(56) Throwable local56) {
			}
			this.aBoolean113 = false;
		}
		Static428.method6345();
		Static257.method5456();
		if (Static24.aCanvas1 != null) {
			try {
				Static24.aCanvas1.removeFocusListener(this);
				Static24.aCanvas1.getParent().remove(Static24.aCanvas1);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static294.aClass230_3 != null) {
			try {
				Static294.aClass230_3.method5355();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method1235();
		if (Static675.aFrame3 != null) {
			Static675.aFrame3.setVisible(false);
			Static675.aFrame3.dispose();
			Static675.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	private void method1230() {
		@Pc(6) long local6 = Static515.method7499(82);
		@Pc(10) long local10 = Static438.aLongArray22[Static143.anInt2317];
		Static438.aLongArray22[Static143.anInt2317] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static57.anInt866 = ((local32 >> 1) + 32000) / local32;
		}
		Static143.anInt2317 = Static143.anInt2317 + 1 & 0x1F;
		if (Static592.anInt9983++ > 50) {
			Static494.aBoolean619 = true;
			Static592.anInt9983 -= 50;
			Static24.aCanvas1.setSize(Static70.anInt1125, Static631.anInt10283);
			Static24.aCanvas1.setVisible(true);
			if (Static675.aFrame3 != null && Static517.aFrame1 == null) {
				@Pc(78) Insets local78 = Static675.aFrame3.getInsets();
				Static24.aCanvas1.setLocation(Static211.anInt3445 + local78.left, local78.top - -Static228.anInt3709);
			} else {
				Static24.aCanvas1.setLocation(Static211.anInt3445, Static228.anInt3709);
			}
		}
		this.method1233();
	}

	@OriginalMember(owner = "client!wh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static361.anApplet_Sub1_1 != this || Static265.aBoolean357) {
			return;
		}
		Static494.aBoolean619 = true;
		if (Static384.aBoolean505 && Static515.method7499(86) - Static91.aLong42 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static340.anInt6053 <= local30.width && Static584.anInt9793 <= local30.height) {
				Static666.aBoolean785 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)Z")
	public final boolean method1231() {
		return Static513.method7491("jagmisc");
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Z")
	public final boolean method1232() {
		return Static513.method7491("jagtheora");
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(B)V")
	protected abstract void method1233();

	@OriginalMember(owner = "client!wh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static453.aBoolean590 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBIZILjava/lang/String;)V")
	protected final void method1234(@OriginalArg(1) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static631.anInt10283 = 768;
			Static584.anInt9793 = 768;
			Static228.anInt3709 = 0;
			Static361.anApplet_Sub1_1 = this;
			Static342.anInt6074 = 652;
			Static39.anApplet1 = null;
			Static70.anInt1125 = 1024;
			Static340.anInt6053 = 1024;
			Static211.anInt3445 = 0;
			Static675.aFrame3 = new Frame();
			Static675.aFrame3.setTitle("Jagex");
			Static675.aFrame3.setResizable(true);
			Static675.aFrame3.addWindowListener(this);
			Static675.aFrame3.setVisible(true);
			Static675.aFrame3.toFront();
			@Pc(42) Insets local42 = Static675.aFrame3.getInsets();
			Static675.aFrame3.setSize(Static340.anInt6053 + local42.left + local42.right, Static584.anInt9793 + (local42.top - -local42.bottom));
			Static34.aClass230_1 = Static294.aClass230_3 = new Class230(arg0, arg1, 37, true);
			@Pc(83) Class366 local83 = Static294.aClass230_3.method5358(this, 1);
			while (local83.anInt10206 == 0) {
				Static351.method5279(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static405.method5934((String) null, local95);
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	protected abstract void method1235();

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)Z")
	protected final boolean method1236() {
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
				this.method1238("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static361.anApplet_Sub1_1 == this && !Static265.aBoolean357) {
			Static516.aLong260 = 0L;
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	private void method1237() {
		@Pc(6) long local6 = Static515.method7499(71);
		@Pc(10) long local10 = Static467.aLongArray23[Static11.anInt224];
		Static467.aLongArray23[Static11.anInt224] = local6;
		Static11.anInt224 = Static11.anInt224 + 1 & 0x1F;
		@Pc(31) boolean local31;
		if (local10 == 0L || local10 >= local6) {
			local31 = false;
		} else {
			local31 = true;
		}
		synchronized (this) {
			Static429.aBoolean567 = Static453.aBoolean590;
		}
		this.method1226();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1238(@OriginalArg(0) String arg0) {
		if (this.aBoolean112) {
			return;
		}
		this.aBoolean112 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static681.method743(Static492.anApplet2, "loggedout");
		} catch (@Pc(39) Throwable local39) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!wh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static675.aFrame3 == null) {
			return Static492.anApplet2 == null || Static492.anApplet2 == this ? super.getParameter(arg0) : Static492.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V")
	public synchronized void method1239() {
		if (Static24.aCanvas1 != null) {
			Static24.aCanvas1.removeFocusListener(this);
			Static24.aCanvas1.getParent().setBackground(Color.black);
			Static24.aCanvas1.getParent().remove(Static24.aCanvas1);
		}
		@Pc(24) Container local24;
		if (Static517.aFrame1 != null) {
			local24 = Static517.aFrame1;
		} else if (Static675.aFrame3 != null) {
			local24 = Static675.aFrame3;
		} else if (Static492.anApplet2 == null) {
			local24 = Static361.anApplet_Sub1_1;
		} else {
			local24 = Static492.anApplet2;
		}
		local24.setLayout((LayoutManager) null);
		Static24.aCanvas1 = new Canvas_Sub1(this);
		local24.add(Static24.aCanvas1);
		Static24.aCanvas1.setSize(Static70.anInt1125, Static631.anInt10283);
		Static24.aCanvas1.setVisible(true);
		if (Static675.aFrame3 == local24) {
			@Pc(77) Insets local77 = Static675.aFrame3.getInsets();
			Static24.aCanvas1.setLocation(Static211.anInt3445 + local77.left, local77.top + Static228.anInt3709);
		} else {
			Static24.aCanvas1.setLocation(Static211.anInt3445, Static228.anInt3709);
		}
		Static24.aCanvas1.addFocusListener(this);
		Static24.aCanvas1.requestFocus();
		Static429.aBoolean567 = true;
		Static453.aBoolean590 = true;
		Static494.aBoolean619 = true;
		Static666.aBoolean785 = false;
		Static91.aLong42 = Static515.method7499(79);
	}

	@OriginalMember(owner = "client!wh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static359.aString87 != null) {
				@Pc(10) String local10 = Static359.aString87.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(62) String local62 = Static359.aString83;
					if (local62.equals("1.1") || local62.startsWith("1.1.") || local62.equals("1.2") || local62.startsWith("1.2.")) {
						this.method1238("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static359.aString83 == null || Static359.aString83.equals("1.4.2"))) {
					this.method1238("wrongjava");
					return;
				}
			}
			if (Static359.aString83 != null && Static359.aString83.startsWith("1.")) {
				@Pc(116) int local116 = 2;
				@Pc(118) int local118 = 0;
				while (Static359.aString83.length() > local116) {
					@Pc(126) char local126 = Static359.aString83.charAt(local116);
					if (local126 < '0' || local126 > '9') {
						break;
					}
					local116++;
					local118 = local126 + local118 * 10 - 48;
				}
				if (local118 >= 5) {
					Static384.aBoolean505 = true;
				}
			}
			@Pc(164) Applet local164 = Static361.anApplet_Sub1_1;
			if (Static492.anApplet2 != null) {
				local164 = Static492.anApplet2;
			}
			@Pc(170) Method local170 = Static359.aMethod2;
			if (local170 != null) {
				try {
					local170.invoke(local164, Boolean.TRUE);
				} catch (@Pc(184) Throwable local184) {
				}
			}
			Static130.method1895();
			Static295.method4366();
			this.method1239();
			this.method1241();
			Static451.aClass67_1 = Static202.method2912();
			while (Static516.aLong260 == 0L || Static515.method7499(126) < Static516.aLong260) {
				Static652.anInt10540 = Static451.aClass67_1.method5455(Static510.aLong257);
				for (@Pc(209) int local209 = 0; local209 < Static652.anInt10540; local209++) {
					this.method1237();
				}
				this.method1230();
				Static378.method5535(Static294.aClass230_3, Static24.aCanvas1);
			}
		} catch (@Pc(254) ThreadDeath local254) {
			throw local254;
		} catch (@Pc(257) Throwable local257) {
			Static405.method5934(this.method1228(), local257);
			this.method1238("crash");
		} finally {
			@Pc(275) Object local275 = null;
			this.method1229(true);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method1240(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static361.anApplet_Sub1_1 != null) {
				Static30.anInt491++;
				if (Static30.anInt491 >= 3) {
					this.method1238("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static631.anInt10283 = arg1;
			Static584.anInt9793 = arg1;
			Static361.anApplet_Sub1_1 = this;
			Static39.anApplet1 = Static492.anApplet2;
			Static211.anInt3445 = 0;
			Static228.anInt3709 = 0;
			Static342.anInt6074 = 652;
			Static70.anInt1125 = arg3;
			Static340.anInt6053 = arg3;
			Static34.aClass230_1 = Static294.aClass230_3 = new Class230(arg0, arg2, 37, Static492.anApplet2 != null);
			@Pc(72) Class366 local72 = Static294.aClass230_3.method5358(this, 1);
			while (local72.anInt10206 == 0) {
				Static351.method5279(10L);
			}
		} catch (@Pc(84) Throwable local84) {
			Static405.method5934((String) null, local84);
			this.method1238("crash");
		}
	}

	@OriginalMember(owner = "client!wh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static361.anApplet_Sub1_1 == this && !Static265.aBoolean357) {
			Static516.aLong260 = Static515.method7499(105);
			Static351.method5279(5000L);
			Static34.aClass230_1 = null;
			this.method1229(false);
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	protected abstract void method1241();

	@OriginalMember(owner = "client!wh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static675.aFrame3 == null) {
			return Static492.anApplet2 == null || Static492.anApplet2 == this ? super.getAppletContext() : Static492.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)Z")
	public final boolean method1242() {
		return Static513.method7491("jaclib");
	}

	@OriginalMember(owner = "client!wh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static675.aFrame3 == null) {
			return Static492.anApplet2 == null || Static492.anApplet2 == this ? super.getCodeBase() : Static492.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static675.aFrame3 == null) {
			return Static492.anApplet2 == null || Static492.anApplet2 == this ? super.getDocumentBase() : Static492.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	protected abstract void method1243();

	@OriginalMember(owner = "client!wh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static361.anApplet_Sub1_1 == this && !Static265.aBoolean357) {
			Static516.aLong260 = Static515.method7499(108) + 4000L;
		}
	}
}
