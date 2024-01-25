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

@OriginalClass("client!pr")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Z")
	private boolean aBoolean84 = false;

	static {
		new Class198("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BZ)V")
	private void method861(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static280.aBoolean287) {
				return;
			}
			Static280.aBoolean287 = true;
		}
		if (Static7.aClass93_1.anApplet1 != null) {
			Static7.aClass93_1.anApplet1.destroy();
		}
		try {
			this.method863();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean83) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean83 = false;
		}
		Static155.method2189();
		@Pc(57) Class268 local57 = Static7.aClass93_1.method2077(Static79.anApplet_Sub1_1.getClass());
		while (local57.anInt7420 == 0) {
			Static140.method2004(100L);
		}
		if (Static246.aCanvas2 != null) {
			try {
				Static246.aCanvas2.removeFocusListener(this);
				Static246.aCanvas2.getParent().remove(Static246.aCanvas2);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static7.aClass93_1 != null) {
			try {
				Static7.aClass93_1.method2087();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method879();
		if (Static34.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!pr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static79.anApplet_Sub1_1 != this || Static280.aBoolean287) {
			return;
		}
		Static448.aBoolean495 = true;
		if (Static20.aBoolean36 && Static446.method5903() - Static170.aLong94 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static236.anInt3873 <= local26.width && local26.height >= Static273.anInt4301) {
				Static53.aBoolean76 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static79.anApplet_Sub1_1 == this && !Static280.aBoolean287) {
			Static447.aLong228 = 0L;
		}
	}

	@OriginalMember(owner = "client!pr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static79.anApplet_Sub1_1 == this && !Static280.aBoolean287) {
			Static447.aLong228 = Static446.method5903() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	protected abstract void method863();

	@OriginalMember(owner = "client!pr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
	protected final boolean method865() {
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
				this.method868("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static34.aFrame1 == null) {
			return Static7.aClass93_1 == null || Static7.aClass93_1.anApplet1 == this ? super.getDocumentBase() : Static7.aClass93_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static3.aBoolean21 = true;
		Static448.aBoolean495 = true;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	protected abstract void method866();

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
	protected abstract void method867();

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method868(@OriginalArg(1) String arg0) {
		if (this.aBoolean84) {
			return;
		}
		this.aBoolean84 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static471.method4680("loggedout", Static7.aClass93_1.anApplet1);
		} catch (@Pc(29) Throwable local29) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!pr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static3.aBoolean21 = false;
	}

	@OriginalMember(owner = "client!pr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static34.aFrame1 == null) {
			return Static7.aClass93_1 == null || Static7.aClass93_1.anApplet1 == this ? super.getAppletContext() : Static7.aClass93_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static79.anApplet_Sub1_1 == this && !Static280.aBoolean287) {
			Static447.aLong228 = Static446.method5903();
			Static140.method2004(5000L);
			Static253.aClass93_3 = null;
			this.method861(false);
		}
	}

	@OriginalMember(owner = "client!pr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static34.aFrame1 == null) {
			return Static7.aClass93_1 == null || Static7.aClass93_1.anApplet1 == this ? super.getCodeBase() : Static7.aClass93_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static34.aFrame1 == null) {
			return Static7.aClass93_1 == null || Static7.aClass93_1.anApplet1 == this ? super.getParameter(arg0) : Static7.aClass93_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)V")
	protected abstract void method869();

	@OriginalMember(owner = "client!pr", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static144.aString23 != null) {
					@Pc(10) String local10 = Static144.aString23.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(40) String local40 = Static144.aString25;
						if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
							this.method868("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static144.aString25 == null || Static144.aString25.equals("1.4.2"))) {
						this.method868("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Static144.aString25 != null && Static144.aString25.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Static144.aString25.length()) {
						@Pc(78) char local78 = Static144.aString25.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local78 + local72 * 10 - 48;
					}
					if (local72 >= 5) {
						Static20.aBoolean36 = true;
					}
				}
				if (Static7.aClass93_1.anApplet1 != null) {
					@Pc(114) Method local114 = Static144.aMethod2;
					if (local114 != null) {
						try {
							local114.invoke(Static7.aClass93_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static351.method4564();
				Static303.method3769();
				this.method873();
				this.method875();
				this.method869();
				Static329.aClass21_1 = Static218.method3700();
				this.method875();
				while (Static447.aLong228 == 0L || Static446.method5903() < Static447.aLong228) {
					Static195.anInt3248 = Static329.aClass21_1.method5373(Static70.anInt1274);
					for (local70 = 0; local70 < Static195.anInt3248; local70++) {
						this.method874();
					}
					this.method876();
					Static209.method2789(Static246.aCanvas2, Static7.aClass93_1);
				}
			}
		} catch (@Pc(189) Throwable local189) {
			Static206.method2769(this.method878(), local189);
			this.method868("crash");
		}
		this.method861(true);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZIII)V")
	protected final void method871(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static79.anApplet_Sub1_1 == null) {
				Static59.anInt1109 = 0;
				Static102.anInt1723 = arg2;
				Static273.anInt4301 = arg2;
				Static178.anInt5792 = arg1;
				Static236.anInt3873 = arg1;
				Static433.anInt7213 = 0;
				Static182.anInt3091 = 602;
				Static79.anApplet_Sub1_1 = this;
				if (Static7.aClass93_1 == null) {
					Static253.aClass93_3 = Static7.aClass93_1 = new Class93(this, arg0, null, 0);
				}
				@Pc(65) Class268 local65 = Static7.aClass93_1.method2076(1, this);
				while (local65.anInt7420 == 0) {
					Static140.method2004(10L);
				}
			} else {
				Static275.anInt4320++;
				if (Static275.anInt4320 >= 3) {
					this.method868("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Throwable local78) {
			Static206.method2769(null, local78);
			this.method868("crash");
		}
	}

	@OriginalMember(owner = "client!pr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIILjava/lang/String;ZII)V")
	protected final void method872(@OriginalArg(4) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static59.anInt1109 = 0;
			Static178.anInt5792 = 1024;
			Static236.anInt3873 = 1024;
			Static79.anApplet_Sub1_1 = this;
			Static182.anInt3091 = 602;
			Static102.anInt1723 = 768;
			Static273.anInt4301 = 768;
			Static433.anInt7213 = 0;
			Static34.aFrame1 = new Frame();
			Static34.aFrame1.setTitle("Jagex");
			Static34.aFrame1.setResizable(true);
			Static34.aFrame1.addWindowListener(this);
			Static34.aFrame1.setVisible(true);
			Static34.aFrame1.toFront();
			@Pc(42) Insets local42 = Static34.aFrame1.getInsets();
			Static34.aFrame1.setSize(local42.right + local42.left + Static236.anInt3873, local42.bottom + Static273.anInt4301 + local42.top);
			Static253.aClass93_3 = Static7.aClass93_1 = new Class93(null, arg1, arg0, 30);
			@Pc(74) Class268 local74 = Static7.aClass93_1.method2076(1, this);
			while (local74.anInt7420 == 0) {
				Static140.method2004(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static206.method2769(null, local87);
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	public final synchronized void method873() {
		if (Static246.aCanvas2 != null) {
			Static246.aCanvas2.removeFocusListener(this);
			Static246.aCanvas2.getParent().remove(Static246.aCanvas2);
		}
		@Pc(21) Container local21;
		if (Static317.aFrame2 != null) {
			local21 = Static317.aFrame2;
		} else if (Static34.aFrame1 == null) {
			local21 = Static7.aClass93_1.anApplet1;
		} else {
			local21 = Static34.aFrame1;
		}
		local21.setLayout(null);
		Static246.aCanvas2 = new Canvas_Sub1(this);
		local21.add(Static246.aCanvas2);
		Static246.aCanvas2.setSize(Static178.anInt5792, Static102.anInt1723);
		Static246.aCanvas2.setVisible(true);
		if (Static34.aFrame1 == local21) {
			@Pc(60) Insets local60 = Static34.aFrame1.getInsets();
			Static246.aCanvas2.setLocation(Static433.anInt7213 + local60.left, Static59.anInt1109 + local60.top);
		} else {
			Static246.aCanvas2.setLocation(Static433.anInt7213, Static59.anInt1109);
		}
		Static246.aCanvas2.addFocusListener(this);
		Static246.aCanvas2.requestFocus();
		Static3.aBoolean21 = true;
		Static68.aBoolean96 = true;
		Static448.aBoolean495 = true;
		Static53.aBoolean76 = false;
		Static170.aLong94 = Static446.method5903();
	}

	@OriginalMember(owner = "client!pr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)V")
	private void method874() {
		@Pc(10) long local10 = Static446.method5903();
		@Pc(14) long local14 = Static43.aLongArray28[Static108.anInt1830];
		Static43.aLongArray28[Static108.anInt1830] = local10;
		Static108.anInt1830 = Static108.anInt1830 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local14 == 0L || local14 >= local10) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static68.aBoolean96 = Static3.aBoolean21;
		}
		this.method867();
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(I)V")
	public final void method875() {
		if (this.aBoolean83) {
			return;
		}
		try {
			@Pc(14) Class268 local14 = Static7.aClass93_1.method2098(Static79.anApplet_Sub1_1.getClass());
			while (local14.anInt7420 == 0) {
				Static140.method2004(100L);
			}
			if (local14.anObject10 != null) {
				throw (Throwable) local14.anObject10;
			}
			jagmisc.init();
			this.aBoolean83 = true;
			Static329.aClass21_1 = Static218.method3700();
		} catch (@Pc(39) Throwable local39) {
		}
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
	private void method876() {
		@Pc(6) long local6 = Static446.method5903();
		@Pc(10) long local10 = Static447.aLongArray37[Static214.anInt3564];
		Static447.aLongArray37[Static214.anInt3564] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(30) int local30 = (int) (local6 - local10);
			Static150.anInt2694 = ((local30 >> 1) + 32000) / local30;
		}
		Static214.anInt3564 = Static214.anInt3564 + 1 & 0x1F;
		if (Static462.anInt7537++ > 50) {
			Static448.aBoolean495 = true;
			Static462.anInt7537 -= 50;
			Static246.aCanvas2.setSize(Static178.anInt5792, Static102.anInt1723);
			Static246.aCanvas2.setVisible(true);
			if (Static34.aFrame1 != null && Static317.aFrame2 == null) {
				@Pc(72) Insets local72 = Static34.aFrame1.getInsets();
				Static246.aCanvas2.setLocation(Static433.anInt7213 + local72.left, local72.top + Static59.anInt1109);
			} else {
				Static246.aCanvas2.setLocation(Static433.anInt7213, Static59.anInt1109);
			}
		}
		this.method866();
	}

	@OriginalMember(owner = "client!pr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(B)Ljava/lang/String;")
	public String method878() {
		return null;
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(I)V")
	protected abstract void method879();
}
