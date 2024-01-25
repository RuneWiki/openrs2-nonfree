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

@OriginalClass("client!nq")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "Z")
	private boolean aBoolean97 = false;

	static {
		new Class242("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZIIZILjava/lang/String;II)V")
	protected final void method1098(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static87.anInt1948 = 1024;
			Static290.anInt5237 = 1024;
			Static349.anInt6303 = 768;
			Static274.anInt4847 = 768;
			Static353.anInt6357 = 0;
			Static279.anApplet_Sub1_1 = this;
			Static76.anInt1789 = 0;
			Static375.anInt5261 = 587;
			Static373.aFrame2 = new Frame();
			Static373.aFrame2.setTitle("Jagex");
			Static373.aFrame2.setResizable(true);
			Static373.aFrame2.addWindowListener(this);
			Static373.aFrame2.setVisible(true);
			Static373.aFrame2.toFront();
			@Pc(38) Insets local38 = Static373.aFrame2.getInsets();
			Static373.aFrame2.setSize(local38.right + local38.left + Static290.anInt5237, local38.bottom + Static274.anInt4847 + local38.top);
			Static295.aClass114_4 = Static89.aClass114_3 = new Class114(null, arg1, arg0, 30);
			@Pc(70) Class108 local70 = Static89.aClass114_3.method2342(1, this);
			while (local70.anInt2803 == 0) {
				Static20.method1515(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static273.method3690(null, local88);
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)Ljava/lang/String;")
	protected String method1099() {
		return null;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)Z")
	protected final boolean method1100() {
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
				this.method1107("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	protected abstract void method1101();

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	protected abstract void method1102();

	@OriginalMember(owner = "client!nq", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static279.anApplet_Sub1_1 == this && !Static408.aBoolean469) {
			Static232.aLong114 = 0L;
		}
	}

	@OriginalMember(owner = "client!nq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static279.anApplet_Sub1_1 != this || Static408.aBoolean469) {
			return;
		}
		Static70.aBoolean488 = true;
		if (Static1.aBoolean5 && Static199.method2845() - Static81.aLong42 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || local23.width >= Static290.anInt5237 && local23.height >= Static274.anInt4847) {
				Static255.aBoolean339 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static7.aBoolean12 = true;
		Static70.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public final synchronized void method1103() {
		if (Static248.aCanvas5 != null) {
			Static248.aCanvas5.removeFocusListener(this);
			Static248.aCanvas5.getParent().remove(Static248.aCanvas5);
		}
		@Pc(18) Container local18;
		if (Static269.aFrame1 != null) {
			local18 = Static269.aFrame1;
		} else if (Static373.aFrame2 == null) {
			local18 = Static89.aClass114_3.anApplet1;
		} else {
			local18 = Static373.aFrame2;
		}
		local18.setLayout(null);
		Static248.aCanvas5 = new Canvas_Sub1(this);
		local18.add(Static248.aCanvas5);
		Static248.aCanvas5.setSize(Static87.anInt1948, Static349.anInt6303);
		Static248.aCanvas5.setVisible(true);
		if (Static373.aFrame2 == local18) {
			@Pc(54) Insets local54 = Static373.aFrame2.getInsets();
			Static248.aCanvas5.setLocation(local54.left + Static353.anInt6357, local54.top - -Static76.anInt1789);
		} else {
			Static248.aCanvas5.setLocation(Static353.anInt6357, Static76.anInt1789);
		}
		Static248.aCanvas5.addFocusListener(this);
		Static248.aCanvas5.requestFocus();
		Static165.aBoolean224 = true;
		Static7.aBoolean12 = true;
		Static70.aBoolean488 = true;
		Static255.aBoolean339 = false;
		Static81.aLong42 = Static199.method2845();
	}

	@OriginalMember(owner = "client!nq", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static7.aBoolean12 = false;
	}

	@OriginalMember(owner = "client!nq", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static279.anApplet_Sub1_1 == this && !Static408.aBoolean469) {
			Static232.aLong114 = Static199.method2845() + 4000L;
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(Z)V")
	protected abstract void method1105();

	@OriginalMember(owner = "client!nq", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static373.aFrame2 == null) {
			return Static89.aClass114_3 == null || Static89.aClass114_3.anApplet1 == this ? super.getCodeBase() : Static89.aClass114_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static373.aFrame2 == null) {
			return Static89.aClass114_3 == null || Static89.aClass114_3.anApplet1 == this ? super.getParameter(arg0) : Static89.aClass114_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static279.anApplet_Sub1_1 == this && !Static408.aBoolean469) {
			Static232.aLong114 = Static199.method2845();
			Static20.method1515(5000L);
			Static295.aClass114_4 = null;
			this.method1112(false);
		}
	}

	@OriginalMember(owner = "client!nq", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1107(@OriginalArg(1) String arg0) {
		if (this.aBoolean97) {
			return;
		}
		this.aBoolean97 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static459.method3567(Static89.aClass114_3.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
	protected abstract void method1108();

	@OriginalMember(owner = "client!nq", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static159.aString34 != null) {
					@Pc(6) String local6 = Static159.aString34.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static159.aString33;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method1107("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static159.aString33 == null || Static159.aString33.equals("1.4.2"))) {
						this.method1107("wrongjava");
						break label113;
					}
				}
				@Pc(66) int local66;
				if (Static159.aString33 != null && Static159.aString33.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (Static159.aString33.length() > local66) {
						@Pc(74) char local74 = Static159.aString33.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local68 = local68 * 10 + local74 - 48;
						local66++;
					}
					if (local68 >= 5) {
						Static1.aBoolean5 = true;
					}
				}
				if (Static89.aClass114_3.anApplet1 != null) {
					@Pc(112) Method local112 = Static159.aMethod2;
					if (local112 != null) {
						try {
							local112.invoke(Static89.aClass114_3.anApplet1, Boolean.TRUE);
						} catch (@Pc(127) Throwable local127) {
						}
					}
				}
				Static251.method3445();
				Static326.method2432();
				this.method1103();
				this.method1101();
				Static53.aClass173_1 = Static59.method1173();
				this.method1111();
				while (Static232.aLong114 == 0L || Static199.method2845() < Static232.aLong114) {
					Static417.anInt7078 = Static53.aClass173_1.method5212(Static37.anInt842);
					for (local66 = 0; local66 < Static417.anInt7078; local66++) {
						this.method1113();
					}
					this.method1114();
					Static342.method4774(Static248.aCanvas5, Static89.aClass114_3);
				}
			}
		} catch (@Pc(182) Throwable local182) {
			Static273.method3690(this.method1099(), local182);
			this.method1107("crash");
		}
		this.method1112(true);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
	protected abstract void method1109();

	@OriginalMember(owner = "client!nq", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZIII)V")
	protected final void method1110(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static279.anApplet_Sub1_1 == null) {
				Static375.anInt5261 = 587;
				Static87.anInt1948 = arg2;
				Static290.anInt5237 = arg2;
				Static279.anApplet_Sub1_1 = this;
				Static353.anInt6357 = 0;
				Static349.anInt6303 = arg1;
				Static274.anInt4847 = arg1;
				Static76.anInt1789 = 0;
				if (Static89.aClass114_3 == null) {
					Static295.aClass114_4 = Static89.aClass114_3 = new Class114(this, arg0, null, 0);
				}
				@Pc(64) Class108 local64 = Static89.aClass114_3.method2342(1, this);
				while (local64.anInt2803 == 0) {
					Static20.method1515(10L);
				}
			} else {
				Static212.anInt3969++;
				if (Static212.anInt3969 >= 3) {
					this.method1107("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Throwable local74) {
			Static273.method3690(null, local74);
			this.method1107("crash");
		}
	}

	@OriginalMember(owner = "client!nq", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static373.aFrame2 == null) {
			return Static89.aClass114_3 == null || Static89.aClass114_3.anApplet1 == this ? super.getDocumentBase() : Static89.aClass114_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static373.aFrame2 == null) {
			return Static89.aClass114_3 == null || Static89.aClass114_3.anApplet1 == this ? super.getAppletContext() : Static89.aClass114_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nq", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(Z)V")
	public final void method1111() {
		if (this.aBoolean96) {
			return;
		}
		try {
			@Pc(18) Class108 local18 = Static89.aClass114_3.method2361(Static279.anApplet_Sub1_1.getClass());
			while (local18.anInt2803 == 0) {
				Static20.method1515(100L);
			}
			if (local18.anObject4 != null) {
				throw (Throwable) local18.anObject4;
			}
			jagmisc.init();
			this.aBoolean96 = true;
			Static53.aClass173_1 = Static59.method1173();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZB)V")
	private void method1112(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static408.aBoolean469) {
				return;
			}
			Static408.aBoolean469 = true;
		}
		if (Static89.aClass114_3.anApplet1 != null) {
			Static89.aClass114_3.anApplet1.destroy();
		}
		try {
			this.method1102();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean96) {
			try {
				jagmisc.quit();
			} catch (@Pc(43) Throwable local43) {
			}
			this.aBoolean96 = false;
		}
		@Pc(52) Class108 local52 = Static89.aClass114_3.method2359(Static279.anApplet_Sub1_1.getClass());
		while (local52.anInt2803 == 0) {
			Static20.method1515(100L);
		}
		if (Static248.aCanvas5 != null) {
			try {
				Static248.aCanvas5.removeFocusListener(this);
				Static248.aCanvas5.getParent().remove(Static248.aCanvas5);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Static89.aClass114_3 != null) {
			try {
				Static89.aClass114_3.method2343();
			} catch (@Pc(82) Exception local82) {
			}
		}
		this.method1109();
		if (Static373.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(92) Throwable local92) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!nq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
	private void method1113() {
		@Pc(6) long local6 = Static199.method2845();
		@Pc(10) long local10 = Static52.aLongArray1[Static339.anInt5969];
		Static52.aLongArray1[Static339.anInt5969] = local6;
		Static339.anInt5969 = Static339.anInt5969 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local10 >= local6) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static165.aBoolean224 = Static7.aBoolean12;
		}
		this.method1105();
	}

	@OriginalMember(owner = "client!nq", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
	private void method1114() {
		@Pc(14) long local14 = Static199.method2845();
		@Pc(18) long local18 = Static102.aLongArray3[Static362.anInt6454];
		Static102.aLongArray3[Static362.anInt6454] = local14;
		if (local18 != 0L && local18 < local14) {
			@Pc(38) int local38 = (int) (local14 - local18);
			Static379.anInt6645 = ((local38 >> 1) + 32000) / local38;
		}
		Static362.anInt6454 = Static362.anInt6454 + 1 & 0x1F;
		if (Static26.anInt668++ > 50) {
			Static70.aBoolean488 = true;
			Static26.anInt668 -= 50;
			Static248.aCanvas5.setSize(Static87.anInt1948, Static349.anInt6303);
			Static248.aCanvas5.setVisible(true);
			if (Static373.aFrame2 != null && Static269.aFrame1 == null) {
				@Pc(86) Insets local86 = Static373.aFrame2.getInsets();
				Static248.aCanvas5.setLocation(local86.left + Static353.anInt6357, Static76.anInt1789 + local86.top);
			} else {
				Static248.aCanvas5.setLocation(Static353.anInt6357, Static76.anInt1789);
			}
		}
		this.method1108();
	}

	@OriginalMember(owner = "client!nq", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
