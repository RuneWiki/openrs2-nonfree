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

@OriginalClass("client!jc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Z")
	private boolean aBoolean98 = false;

	static {
		new Class231("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	protected abstract void method996();

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	protected abstract void method997();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method998(@OriginalArg(1) String arg0) {
		if (this.aBoolean97) {
			return;
		}
		this.aBoolean97 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static453.method333(Static165.aClass103_3.anApplet1, "loggedout");
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!jc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static143.aString28 != null) {
					@Pc(6) String local6 = Static143.aString28.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(19) String local19 = Static143.aString24;
						if (local19.equals("1.1") || local19.startsWith("1.1.") || local19.equals("1.2") || local19.startsWith("1.2.")) {
							this.method998("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static143.aString24 == null || Static143.aString24.equals("1.4.2"))) {
						this.method998("wrongjava");
						break label113;
					}
				}
				@Pc(67) int local67;
				if (Static143.aString24 != null && Static143.aString24.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (Static143.aString24.length() > local67) {
						@Pc(75) char local75 = Static143.aString24.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local67++;
						local69 = local75 + local69 * 10 - '0';
					}
					if (local69 >= 5) {
						Static315.aBoolean274 = true;
					}
				}
				if (Static165.aClass103_3.anApplet1 != null) {
					@Pc(116) Method local116 = Static143.aMethod2;
					if (local116 != null) {
						try {
							local116.invoke(Static165.aClass103_3.anApplet1, Boolean.TRUE);
						} catch (@Pc(131) Throwable local131) {
						}
					}
				}
				Static278.method4210();
				Static274.method4165();
				this.method1002();
				this.method1003();
				Static300.aClass55_2 = Static6.method90();
				this.method999();
				while (Static17.aLong16 == 0L || Static17.aLong16 > Static154.method2527()) {
					Static213.anInt3693 = Static300.aClass55_2.method4703(Static405.anInt6805);
					for (local67 = 0; local67 < Static213.anInt3693; local67++) {
						this.method1010();
					}
					this.method1009();
					Static288.method4289(Static314.aCanvas8, Static165.aClass103_3);
				}
			}
		} catch (@Pc(194) Throwable local194) {
			Static40.method799(local194, null);
			this.method998("crash");
		}
		this.method1001(true);
	}

	@OriginalMember(owner = "client!jc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public final void method999() {
		if (this.aBoolean98) {
			return;
		}
		try {
			@Pc(14) Class249 local14 = Static165.aClass103_3.method2361(Static122.anApplet_Sub1_1.getClass());
			while (local14.anInt6929 == 0) {
				Static170.method1617(100L);
			}
			if (local14.anObject10 != null) {
				throw (Throwable) local14.anObject10;
			}
			jagmisc.init();
			this.aBoolean98 = true;
			Static300.aClass55_2 = Static6.method90();
		} catch (@Pc(39) Throwable local39) {
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIII)V")
	protected final void method1000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static122.anApplet_Sub1_1 == null) {
				Static268.anInt4597 = 0;
				Static335.anInt5653 = 0;
				Static122.anApplet_Sub1_1 = this;
				Static342.anInt5732 = 581;
				Static235.anInt4053 = arg2;
				Static377.anInt6742 = arg2;
				Static381.anInt6279 = arg1;
				Static383.anInt6310 = arg1;
				if (Static165.aClass103_3 == null) {
					Static281.aClass103_4 = Static165.aClass103_3 = new Class103(this, arg0, null, 0);
				}
				@Pc(65) Class249 local65 = Static165.aClass103_3.method2374(1, this);
				while (local65.anInt6929 == 0) {
					Static170.method1617(10L);
				}
			} else {
				Static166.anInt2964++;
				if (Static166.anInt2964 >= 3) {
					this.method998("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(75) Throwable local75) {
			Static40.method799(local75, null);
			this.method998("crash");
		}
	}

	@OriginalMember(owner = "client!jc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZB)V")
	private void method1001(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static244.aBoolean271) {
				return;
			}
			Static244.aBoolean271 = true;
		}
		if (Static165.aClass103_3.anApplet1 != null) {
			Static165.aClass103_3.anApplet1.destroy();
		}
		try {
			this.method1011();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean98) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean98 = false;
		}
		@Pc(48) Class249 local48 = Static165.aClass103_3.method2364(Static122.anApplet_Sub1_1.getClass());
		while (local48.anInt6929 == 0) {
			Static170.method1617(100L);
		}
		if (Static314.aCanvas8 != null) {
			try {
				Static314.aCanvas8.removeFocusListener(this);
				Static314.aCanvas8.getParent().remove(Static314.aCanvas8);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static165.aClass103_3 != null) {
			try {
				Static165.aClass103_3.method2379();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method997();
		if (Static176.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!jc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static176.aFrame2 == null) {
			return Static165.aClass103_3 == null || Static165.aClass103_3.anApplet1 == this ? super.getAppletContext() : Static165.aClass103_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static42.aBoolean75 = false;
	}

	@OriginalMember(owner = "client!jc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static176.aFrame2 == null) {
			return Static165.aClass103_3 == null || Static165.aClass103_3.anApplet1 == this ? super.getParameter(arg0) : Static165.aClass103_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	public final synchronized void method1002() {
		if (Static314.aCanvas8 != null) {
			Static314.aCanvas8.removeFocusListener(this);
			Static314.aCanvas8.getParent().remove(Static314.aCanvas8);
		}
		@Pc(28) Container local28;
		if (Static93.aFrame1 != null) {
			local28 = Static93.aFrame1;
		} else if (Static176.aFrame2 == null) {
			local28 = Static165.aClass103_3.anApplet1;
		} else {
			local28 = Static176.aFrame2;
		}
		local28.setLayout(null);
		Static314.aCanvas8 = new Canvas_Sub1(this);
		local28.add(Static314.aCanvas8);
		Static314.aCanvas8.setSize(Static235.anInt4053, Static381.anInt6279);
		Static314.aCanvas8.setVisible(true);
		if (Static176.aFrame2 == local28) {
			@Pc(68) Insets local68 = Static176.aFrame2.getInsets();
			Static314.aCanvas8.setLocation(Static268.anInt4597 + local68.left, local68.top - -Static335.anInt5653);
		} else {
			Static314.aCanvas8.setLocation(Static268.anInt4597, Static335.anInt5653);
		}
		Static314.aCanvas8.addFocusListener(this);
		Static314.aCanvas8.requestFocus();
		Static42.aBoolean75 = true;
		Static343.aBoolean385 = true;
		Static44.aBoolean76 = true;
		Static422.aBoolean477 = false;
		Static33.aLong24 = Static154.method2527();
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	protected abstract void method1003();

	@OriginalMember(owner = "client!jc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static42.aBoolean75 = true;
		Static44.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
	protected final boolean method1004() {
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
				this.method998("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static122.anApplet_Sub1_1 == this && !Static244.aBoolean271) {
			Static17.aLong16 = 0L;
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIIZLjava/lang/String;III)V")
	protected final void method1007(@OriginalArg(4) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static335.anInt5653 = 0;
			Static235.anInt4053 = 1024;
			Static377.anInt6742 = 1024;
			Static381.anInt6279 = 768;
			Static383.anInt6310 = 768;
			Static268.anInt4597 = 0;
			Static122.anApplet_Sub1_1 = this;
			Static342.anInt5732 = 581;
			Static176.aFrame2 = new Frame();
			Static176.aFrame2.setTitle("Jagex");
			Static176.aFrame2.setResizable(true);
			Static176.aFrame2.addWindowListener(this);
			Static176.aFrame2.setVisible(true);
			Static176.aFrame2.toFront();
			@Pc(47) Insets local47 = Static176.aFrame2.getInsets();
			Static176.aFrame2.setSize(local47.right + local47.left + Static377.anInt6742, Static383.anInt6310 + local47.top - -local47.bottom);
			Static281.aClass103_4 = Static165.aClass103_3 = new Class103(null, arg1, arg0, 30);
			@Pc(80) Class249 local80 = Static165.aClass103_3.method2374(1, this);
			while (local80.anInt6929 == 0) {
				Static170.method1617(10L);
			}
		} catch (@Pc(93) Exception local93) {
			Static40.method799(local93, null);
		}
	}

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	protected abstract void method1008();

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
	private void method1009() {
		@Pc(6) long local6 = Static154.method2527();
		@Pc(10) long local10 = Static116.aLongArray3[Static126.anInt4529];
		Static116.aLongArray3[Static126.anInt4529] = local6;
		Static126.anInt4529 = Static126.anInt4529 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(38) int local38 = (int) (local6 - local10);
			Static288.anInt4836 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static222.anInt5659++ > 50) {
			Static222.anInt5659 -= 50;
			Static44.aBoolean76 = true;
			Static314.aCanvas8.setSize(Static235.anInt4053, Static381.anInt6279);
			Static314.aCanvas8.setVisible(true);
			if (Static176.aFrame2 != null && Static93.aFrame1 == null) {
				@Pc(82) Insets local82 = Static176.aFrame2.getInsets();
				Static314.aCanvas8.setLocation(local82.left + Static268.anInt4597, Static335.anInt5653 + local82.top);
			} else {
				Static314.aCanvas8.setLocation(Static268.anInt4597, Static335.anInt5653);
			}
		}
		this.method1008();
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	private void method1010() {
		@Pc(6) long local6 = Static154.method2527();
		@Pc(10) long local10 = Static269.aLongArray7[Static19.anInt323];
		Static269.aLongArray7[Static19.anInt323] = local6;
		Static19.anInt323 = Static19.anInt323 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local6 <= local10) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static343.aBoolean385 = Static42.aBoolean75;
		}
		this.method996();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V")
	protected abstract void method1011();

	@OriginalMember(owner = "client!jc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static122.anApplet_Sub1_1 != this || Static244.aBoolean271) {
			return;
		}
		Static44.aBoolean76 = true;
		if (Static315.aBoolean274 && Static154.method2527() - Static33.aLong24 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static377.anInt6742 && local26.height >= Static383.anInt6310) {
				Static422.aBoolean477 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static122.anApplet_Sub1_1 == this && !Static244.aBoolean271) {
			Static17.aLong16 = Static154.method2527() + 4000L;
		}
	}

	@OriginalMember(owner = "client!jc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static176.aFrame2 == null) {
			return Static165.aClass103_3 == null || Static165.aClass103_3.anApplet1 == this ? super.getDocumentBase() : Static165.aClass103_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static176.aFrame2 == null) {
			return Static165.aClass103_3 == null || Static165.aClass103_3.anApplet1 == this ? super.getCodeBase() : Static165.aClass103_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static122.anApplet_Sub1_1 == this && !Static244.aBoolean271) {
			Static17.aLong16 = Static154.method2527();
			Static170.method1617(5000L);
			Static281.aClass103_4 = null;
			this.method1001(false);
		}
	}

	@OriginalMember(owner = "client!jc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}
}
