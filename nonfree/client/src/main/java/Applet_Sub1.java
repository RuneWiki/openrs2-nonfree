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

@OriginalClass("client!uo")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "Z")
	private boolean aBoolean76 = false;

	static {
		new Class221("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!uo", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static189.aBoolean389 = false;
	}

	@OriginalMember(owner = "client!uo", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!uo", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static189.aBoolean389 = true;
		Static186.aBoolean473 = true;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	private void method860() {
		@Pc(6) long local6 = Static51.method979();
		@Pc(10) long local10 = Static172.aLongArray7[Static91.anInt1713];
		Static172.aLongArray7[Static91.anInt1713] = local6;
		Static91.anInt1713 = Static91.anInt1713 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(44) int local44 = (int) (local6 - local10);
			Static280.anInt4946 = ((local44 >> 1) + 32000) / local44;
		}
		if (Static186.anInt6316++ > 50) {
			Static186.anInt6316 -= 50;
			Static186.aBoolean473 = true;
			Static170.aCanvas4.setSize(Static335.anInt5875, Static263.anInt4662);
			Static170.aCanvas4.setVisible(true);
			if (Static154.aFrame1 != null && Static363.aFrame4 == null) {
				@Pc(79) Insets local79 = Static154.aFrame1.getInsets();
				Static170.aCanvas4.setLocation(Static125.anInt2378 + local79.left, Static284.anInt5038 + local79.top);
			} else {
				Static170.aCanvas4.setLocation(Static125.anInt2378, Static284.anInt5038);
			}
		}
		this.method876();
	}

	@OriginalMember(owner = "client!uo", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static65.aString10 != null) {
					@Pc(10) String local10 = Static65.aString10.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(41) String local41 = Static65.aString9;
						if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
							this.method871("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static65.aString9 == null || Static65.aString9.equals("1.4.2"))) {
						this.method871("wrongjava");
						break label107;
					}
				}
				@Pc(71) int local71;
				if (Static65.aString9 != null && Static65.aString9.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (Static65.aString9.length() > local71) {
						@Pc(79) char local79 = Static65.aString9.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local71++;
						local73 = local73 * 10 + local79 - 48;
					}
					if (local73 >= 5) {
						Static56.aBoolean102 = true;
					}
				}
				if (Static92.aClass53_2.anApplet1 != null) {
					@Pc(117) Method local117 = Static65.aMethod2;
					if (local117 != null) {
						try {
							local117.invoke(Static92.aClass53_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(132) Throwable local132) {
						}
					}
				}
				Static83.method1468();
				Static314.method4882();
				this.method867();
				this.method863();
				Static240.aClass103_1 = Static215.method3638();
				this.method864();
				while (Static142.aLong110 == 0L || Static51.method979() < Static142.aLong110) {
					Static197.anInt3618 = Static240.aClass103_1.method4086(Static150.anInt2708);
					for (local71 = 0; local71 < Static197.anInt3618; local71++) {
						this.method865();
					}
					this.method860();
					Static357.method870(Static92.aClass53_2, Static170.aCanvas4);
				}
			}
		} catch (@Pc(185) Exception local185) {
			Static235.method3843(null, local185);
			this.method871("crash");
		}
		this.method869(true);
	}

	@OriginalMember(owner = "client!uo", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static154.aFrame1 == null) {
			return Static92.aClass53_2 == null || Static92.aClass53_2.anApplet1 == this ? super.getCodeBase() : Static92.aClass53_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static154.aFrame1 == null) {
			return Static92.aClass53_2 == null || Static92.aClass53_2.anApplet1 == this ? super.getDocumentBase() : Static92.aClass53_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	protected abstract void method863();

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	public final void method864() {
		if (this.aBoolean76) {
			return;
		}
		try {
			@Pc(14) Class1 local14 = Static92.aClass53_2.method1194(Static69.anApplet_Sub1_1.getClass());
			while (local14.anInt2 == 0) {
				Static185.method3004(100L);
			}
			if (local14.anObject1 != null) {
				throw (Throwable) local14.anObject1;
			}
			jagmisc.init();
			this.aBoolean76 = true;
			Static240.aClass103_1 = Static215.method3638();
		} catch (@Pc(44) Throwable local44) {
		}
	}

	@OriginalMember(owner = "client!uo", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!uo", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static69.anApplet_Sub1_1 == this && !Static32.aBoolean456) {
			Static142.aLong110 = Static51.method979();
			Static185.method3004(5000L);
			Static271.aClass53_4 = null;
			this.method869(false);
		}
	}

	@OriginalMember(owner = "client!uo", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	private void method865() {
		@Pc(12) long local12 = Static51.method979();
		@Pc(16) long local16 = Static54.aLongArray2[Static90.anInt1706];
		Static54.aLongArray2[Static90.anInt1706] = local12;
		Static90.anInt1706 = Static90.anInt1706 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local16 == 0L || local16 >= local12) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static144.aBoolean199 = Static189.aBoolean389;
		}
		this.method868();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIII)V")
	protected final void method866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static69.anApplet_Sub1_1 == null) {
				Static202.anInt3721 = 572;
				Static263.anInt4662 = arg1;
				Static388.anInt4032 = arg1;
				Static125.anInt2378 = 0;
				Static284.anInt5038 = 0;
				Static335.anInt5875 = arg2;
				Static269.anInt4774 = arg2;
				Static69.anApplet_Sub1_1 = this;
				if (Static92.aClass53_2 == null) {
					Static271.aClass53_4 = Static92.aClass53_2 = new Class53(this, arg0, null, 0);
				}
				@Pc(66) Class1 local66 = Static92.aClass53_2.method1169(this, 1);
				while (local66.anInt2 == 0) {
					Static185.method3004(10L);
				}
			} else {
				Static115.anInt2255++;
				if (Static115.anInt2255 >= 3) {
					this.method871("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Exception local78) {
			Static235.method3843(null, local78);
			this.method871("crash");
		}
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	public final synchronized void method867() {
		if (Static170.aCanvas4 != null) {
			Static170.aCanvas4.removeFocusListener(this);
			Static170.aCanvas4.getParent().remove(Static170.aCanvas4);
		}
		@Pc(25) Container local25;
		if (Static363.aFrame4 != null) {
			local25 = Static363.aFrame4;
		} else if (Static154.aFrame1 == null) {
			local25 = Static92.aClass53_2.anApplet1;
		} else {
			local25 = Static154.aFrame1;
		}
		local25.setLayout(null);
		Static170.aCanvas4 = new Canvas_Sub1(this);
		local25.add(Static170.aCanvas4);
		Static170.aCanvas4.setSize(Static335.anInt5875, Static263.anInt4662);
		Static170.aCanvas4.setVisible(true);
		if (Static154.aFrame1 == local25) {
			@Pc(59) Insets local59 = Static154.aFrame1.getInsets();
			Static170.aCanvas4.setLocation(Static125.anInt2378 + local59.left, Static284.anInt5038 + local59.top);
		} else {
			Static170.aCanvas4.setLocation(Static125.anInt2378, Static284.anInt5038);
		}
		Static170.aCanvas4.addFocusListener(this);
		Static170.aCanvas4.requestFocus();
		Static144.aBoolean199 = true;
		Static189.aBoolean389 = true;
		Static186.aBoolean473 = true;
		Static97.aBoolean150 = false;
		Static324.aLong178 = Static51.method979();
	}

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)V")
	protected abstract void method868();

	@OriginalMember(owner = "client!uo", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BZ)V")
	private void method869(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static32.aBoolean456) {
				return;
			}
			Static32.aBoolean456 = true;
		}
		if (Static92.aClass53_2.anApplet1 != null) {
			Static92.aClass53_2.anApplet1.destroy();
		}
		try {
			this.method872();
		} catch (@Pc(35) Exception local35) {
		}
		if (this.aBoolean76) {
			try {
				jagmisc.quit();
			} catch (@Pc(41) Throwable local41) {
			}
			this.aBoolean76 = false;
		}
		@Pc(50) Class1 local50 = Static92.aClass53_2.method1190(Static69.anApplet_Sub1_1.getClass());
		while (local50.anInt2 == 0) {
			Static185.method3004(100L);
		}
		if (Static170.aCanvas4 != null) {
			try {
				Static170.aCanvas4.removeFocusListener(this);
				Static170.aCanvas4.getParent().remove(Static170.aCanvas4);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static92.aClass53_2 != null) {
			try {
				Static92.aClass53_2.method1178();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method875();
		if (Static154.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(87) Throwable local87) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method871(@OriginalArg(0) String arg0) {
		if (this.aBoolean75) {
			return;
		}
		this.aBoolean75 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static400.method4007(Static92.aClass53_2.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!uo", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static154.aFrame1 == null) {
			return Static92.aClass53_2 == null || Static92.aClass53_2.anApplet1 == this ? super.getAppletContext() : Static92.aClass53_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
	protected abstract void method872();

	@OriginalMember(owner = "client!uo", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static69.anApplet_Sub1_1 == this && !Static32.aBoolean456) {
			Static142.aLong110 = 0L;
		}
	}

	@OriginalMember(owner = "client!uo", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static154.aFrame1 == null) {
			return Static92.aClass53_2 == null || Static92.aClass53_2.anApplet1 == this ? super.getParameter(arg0) : Static92.aClass53_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)Z")
	protected final boolean method874() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
			return true;
		} else if (local14.equals("stellardawn.com") || local14.endsWith(".stellardawn.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method871("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static69.anApplet_Sub1_1 != this || Static32.aBoolean456) {
			return;
		}
		Static186.aBoolean473 = true;
		if (Static56.aBoolean102 && Static51.method979() - Static324.aLong178 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || local23.width >= Static269.anInt4774 && Static388.anInt4032 <= local23.height) {
				Static97.aBoolean150 = true;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V")
	protected abstract void method875();

	@OriginalMember(owner = "client!uo", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static69.anApplet_Sub1_1 == this && !Static32.aBoolean456) {
			Static142.aLong110 = Static51.method979() + 4000L;
		}
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)V")
	protected abstract void method876();

	@OriginalMember(owner = "client!uo", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILjava/lang/String;ZIIII)V")
	protected final void method877(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			Static284.anInt5038 = 0;
			Static69.anApplet_Sub1_1 = this;
			Static263.anInt4662 = 768;
			Static388.anInt4032 = 768;
			Static335.anInt5875 = 1024;
			Static269.anInt4774 = 1024;
			Static125.anInt2378 = 0;
			Static202.anInt3721 = 572;
			Static154.aFrame1 = new Frame();
			Static154.aFrame1.setTitle("Jagex");
			Static154.aFrame1.setResizable(true);
			Static154.aFrame1.addWindowListener(this);
			Static154.aFrame1.setVisible(true);
			Static154.aFrame1.toFront();
			@Pc(43) Insets local43 = Static154.aFrame1.getInsets();
			Static154.aFrame1.setSize(local43.right + local43.left + Static269.anInt4774, Static388.anInt4032 + local43.top + local43.bottom);
			Static271.aClass53_4 = Static92.aClass53_2 = new Class53(null, arg0, arg1, 29);
			@Pc(75) Class1 local75 = Static92.aClass53_2.method1169(this, 1);
			while (local75.anInt2 == 0) {
				Static185.method3004(10L);
			}
		} catch (@Pc(85) Exception local85) {
			Static235.method3843(null, local85);
		}
	}

	@OriginalMember(owner = "client!uo", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}
}
