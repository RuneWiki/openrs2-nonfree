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

@OriginalClass("client!fj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "Z")
	private boolean aBoolean79 = false;

	static {
		new Class40("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!fj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static265.aFrame25 == null) {
			return Static159.aClass9_10 == null || Static159.aClass9_10.anApplet1 == this ? super.getCodeBase() : Static159.aClass9_10.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
	private void method1261(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static138.aBoolean184) {
				return;
			}
			Static138.aBoolean184 = true;
		}
		if (Static159.aClass9_10.anApplet1 != null) {
			Static159.aClass9_10.anApplet1.destroy();
		}
		try {
			this.method1271();
		} catch (@Pc(36) Exception local36) {
		}
		if (this.aBoolean78) {
			try {
				jagmisc.quit();
			} catch (@Pc(42) Throwable local42) {
			}
			this.aBoolean78 = false;
		}
		Static351.method5437();
		Static543.method5326();
		if (Static209.aCanvas6 != null) {
			try {
				Static209.aCanvas6.removeFocusListener(this);
				Static209.aCanvas6.getParent().remove(Static209.aCanvas6);
			} catch (@Pc(62) Exception local62) {
			}
		}
		if (Static159.aClass9_10 != null) {
			try {
				Static159.aClass9_10.method289();
			} catch (@Pc(70) Exception local70) {
			}
		}
		this.method1263();
		if (Static265.aFrame25 != null) {
			try {
				System.exit(0);
			} catch (@Pc(80) Throwable local80) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!fj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static265.aFrame25 == null) {
			return Static159.aClass9_10 == null || Static159.aClass9_10.anApplet1 == this ? super.getAppletContext() : Static159.aClass9_10.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1262(@OriginalArg(0) String arg0) {
		if (this.aBoolean79) {
			return;
		}
		this.aBoolean79 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static555.method5217(Static159.aClass9_10.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!fj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static265.aFrame25 == null) {
			return Static159.aClass9_10 == null || Static159.aClass9_10.anApplet1 == this ? super.getDocumentBase() : Static159.aClass9_10.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	protected abstract void method1263();

	@OriginalMember(owner = "client!fj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static532.anApplet_Sub1_1 != this || Static138.aBoolean184) {
			return;
		}
		Static304.aBoolean414 = true;
		if (Static470.aBoolean575 && Static105.method2132() - Static148.aLong102 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || local25.width >= Static149.anInt3095 && Static295.anInt5920 <= local25.height) {
				Static398.aBoolean504 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1265() {
		return null;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	protected abstract void method1266();

	@OriginalMember(owner = "client!fj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!fj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static532.anApplet_Sub1_1 == this && !Static138.aBoolean184) {
			Static134.aLong96 = Static105.method2132();
			Static213.method3465(5000L);
			Static390.aClass9_20 = null;
			this.method1261(false);
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
	private void method1267() {
		@Pc(6) long local6 = Static105.method2132();
		@Pc(10) long local10 = Static37.aLongArray3[Static431.anInt7571];
		Static37.aLongArray3[Static431.anInt7571] = local6;
		Static431.anInt7571 = Static431.anInt7571 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(38) int local38 = (int) (local6 - local10);
			Static115.anInt2500 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static465.anInt7977++ > 50) {
			Static304.aBoolean414 = true;
			Static465.anInt7977 -= 50;
			Static209.aCanvas6.setSize(Static383.anInt6994, Static456.anInt7874);
			Static209.aCanvas6.setVisible(true);
			if (Static265.aFrame25 != null && Static254.aFrame32 == null) {
				@Pc(79) Insets local79 = Static265.aFrame25.getInsets();
				Static209.aCanvas6.setLocation(local79.left + Static186.anInt3583, local79.top + Static10.anInt149);
			} else {
				Static209.aCanvas6.setLocation(Static186.anInt3583, Static10.anInt149);
			}
		}
		this.method1276();
	}

	@OriginalMember(owner = "client!fj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z")
	protected final boolean method1270() {
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
				this.method1262("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static265.aFrame25 == null) {
			return Static159.aClass9_10 == null || Static159.aClass9_10.anApplet1 == this ? super.getParameter(arg0) : Static159.aClass9_10.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
	protected abstract void method1271();

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)Z")
	protected final boolean method1272() {
		return Static66.method1216("jaclib");
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
	private void method1274() {
		@Pc(6) long local6 = Static105.method2132();
		@Pc(10) long local10 = Static325.aLongArray6[Static332.anInt6290];
		Static325.aLongArray6[Static332.anInt6290] = local6;
		Static332.anInt6290 = Static332.anInt6290 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local10 >= local6) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static538.aBoolean658 = Static42.aBoolean41;
		}
		this.method1277();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIZILjava/lang/String;ZI)V")
	protected final void method1275(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static186.anInt3583 = 0;
			Static301.anInt5982 = 608;
			Static532.anApplet_Sub1_1 = this;
			Static10.anInt149 = 0;
			Static383.anInt6994 = 1024;
			Static149.anInt3095 = 1024;
			Static456.anInt7874 = 768;
			Static295.anInt5920 = 768;
			Static265.aFrame25 = new Frame();
			Static265.aFrame25.setTitle("Jagex");
			Static265.aFrame25.setResizable(true);
			Static265.aFrame25.addWindowListener(this);
			Static265.aFrame25.setVisible(true);
			Static265.aFrame25.toFront();
			@Pc(38) Insets local38 = Static265.aFrame25.getInsets();
			Static265.aFrame25.setSize(local38.right + local38.left + Static149.anInt3095, local38.bottom + local38.top + Static295.anInt5920);
			Static390.aClass9_20 = Static159.aClass9_10 = new Class9(null, arg1, arg0, 32);
			@Pc(70) Class83 local70 = Static159.aClass9_10.method282(this, 1);
			while (local70.anInt2495 == 0) {
				Static213.method3465(10L);
			}
		} catch (@Pc(80) Exception local80) {
			Static370.method6434(null, local80);
		}
	}

	@OriginalMember(owner = "client!fj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static42.aBoolean41 = true;
		Static304.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)V")
	protected abstract void method1276();

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(Z)V")
	protected abstract void method1277();

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)Z")
	public final boolean method1278() {
		return Static66.method1216("jagmisc");
	}

	@OriginalMember(owner = "client!fj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static532.anApplet_Sub1_1 == this && !Static138.aBoolean184) {
			Static134.aLong96 = Static105.method2132() + 4000L;
		}
	}

	@OriginalMember(owner = "client!fj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static42.aBoolean41 = false;
	}

	@OriginalMember(owner = "client!fj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
	public final synchronized void method1279() {
		if (Static209.aCanvas6 != null) {
			Static209.aCanvas6.removeFocusListener(this);
			Static209.aCanvas6.getParent().remove(Static209.aCanvas6);
		}
		@Pc(21) Container local21;
		if (Static254.aFrame32 != null) {
			local21 = Static254.aFrame32;
		} else if (Static265.aFrame25 == null) {
			local21 = Static159.aClass9_10.anApplet1;
		} else {
			local21 = Static265.aFrame25;
		}
		local21.setLayout(null);
		Static209.aCanvas6 = new Canvas_Sub1(this);
		local21.add(Static209.aCanvas6);
		Static209.aCanvas6.setSize(Static383.anInt6994, Static456.anInt7874);
		Static209.aCanvas6.setVisible(true);
		if (local21 == Static265.aFrame25) {
			@Pc(58) Insets local58 = Static265.aFrame25.getInsets();
			Static209.aCanvas6.setLocation(local58.left + Static186.anInt3583, local58.top - -Static10.anInt149);
		} else {
			Static209.aCanvas6.setLocation(Static186.anInt3583, Static10.anInt149);
		}
		Static209.aCanvas6.addFocusListener(this);
		Static209.aCanvas6.requestFocus();
		Static538.aBoolean658 = true;
		Static42.aBoolean41 = true;
		Static304.aBoolean414 = true;
		Static398.aBoolean504 = false;
		Static148.aLong102 = Static105.method2132();
	}

	@OriginalMember(owner = "client!fj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!fj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static9.aString5 != null) {
					@Pc(6) String local6 = Static9.aString5.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(37) String local37 = Static9.aString7;
						if (local37.equals("1.1") || local37.startsWith("1.1.") || local37.equals("1.2") || local37.startsWith("1.2.")) {
							this.method1262("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static9.aString7 == null || Static9.aString7.equals("1.4.2"))) {
						this.method1262("wrongjava");
						break label113;
					}
				}
				@Pc(67) int local67;
				if (Static9.aString7 != null && Static9.aString7.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (local67 < Static9.aString7.length()) {
						@Pc(75) char local75 = Static9.aString7.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local69 = local69 * 10 + local75 - 48;
						local67++;
					}
					if (local69 >= 5) {
						Static470.aBoolean575 = true;
					}
				}
				if (Static159.aClass9_10.anApplet1 != null) {
					@Pc(112) Method local112 = Static9.aMethod2;
					if (local112 != null) {
						try {
							local112.invoke(Static159.aClass9_10.anApplet1, Boolean.TRUE);
						} catch (@Pc(127) Throwable local127) {
						}
					}
				}
				Static421.method6048();
				Static455.method5585();
				this.method1279();
				this.method1266();
				Static291.aClass1_1 = Static2.method203();
				while (Static134.aLong96 == 0L || Static105.method2132() < Static134.aLong96) {
					Static545.anInt9127 = Static291.aClass1_1.method6836(Static54.aLong40);
					for (local67 = 0; local67 < Static545.anInt9127; local67++) {
						this.method1274();
					}
					this.method1267();
					Static153.method2805(Static159.aClass9_10, Static209.aCanvas6);
				}
			}
		} catch (@Pc(183) Throwable local183) {
			Static370.method6434(this.method1265(), local183);
			this.method1262("crash");
		}
		this.method1261(true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
	protected final void method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static532.anApplet_Sub1_1 == null) {
				Static10.anInt149 = 0;
				Static456.anInt7874 = arg1;
				Static295.anInt5920 = arg1;
				Static186.anInt3583 = 0;
				Static301.anInt5982 = 608;
				Static532.anApplet_Sub1_1 = this;
				Static383.anInt6994 = arg0;
				Static149.anInt3095 = arg0;
				if (Static159.aClass9_10 == null) {
					Static390.aClass9_20 = Static159.aClass9_10 = new Class9(this, arg2, null, 0);
				}
				@Pc(65) Class83 local65 = Static159.aClass9_10.method282(this, 1);
				while (local65.anInt2495 == 0) {
					Static213.method3465(10L);
				}
			} else {
				Static354.anInt6684++;
				if (Static354.anInt6684 >= 3) {
					this.method1262("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(75) Throwable local75) {
			Static370.method6434(null, local75);
			this.method1262("crash");
		}
	}

	@OriginalMember(owner = "client!fj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static532.anApplet_Sub1_1 == this && !Static138.aBoolean184) {
			Static134.aLong96 = 0L;
		}
	}
}
