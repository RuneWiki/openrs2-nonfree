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

@OriginalClass("client!jg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "Z")
	private boolean aBoolean47 = false;

	static {
		new Class84("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	protected abstract void method895();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method896(@OriginalArg(1) String arg0) {
		if (this.aBoolean47) {
			return;
		}
		this.aBoolean47 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static456.method694(Static119.aClass138_7.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!jg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZIIII)V")
	protected final void method897(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static38.anApplet_Sub1_1 == null) {
				Static452.anInt7811 = 586;
				Static38.anApplet_Sub1_1 = this;
				Static226.anInt4101 = 0;
				Static255.anInt4574 = arg2;
				Static119.anInt7598 = arg2;
				Static207.anInt3842 = arg0;
				Static288.anInt5035 = arg0;
				Static340.anInt5935 = 0;
				if (Static119.aClass138_7 == null) {
					Static293.aClass138_4 = Static119.aClass138_7 = new Class138(this, arg1, null, 0);
				}
				@Pc(68) Class100 local68 = Static119.aClass138_7.method3220(1, this);
				while (local68.anInt2365 == 0) {
					Static67.method1189(10L);
				}
			} else {
				Static38.anInt707++;
				if (Static38.anInt707 >= 3) {
					this.method896("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Throwable local78) {
			Static315.method4700(local78, null);
			this.method896("crash");
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public final void method898() {
		if (this.aBoolean46) {
			return;
		}
		try {
			@Pc(18) Class100 local18 = Static119.aClass138_7.method3198(Static38.anApplet_Sub1_1.getClass());
			while (local18.anInt2365 == 0) {
				Static67.method1189(100L);
			}
			if (local18.anObject4 != null) {
				throw (Throwable) local18.anObject4;
			}
			jagmisc.init();
			this.aBoolean46 = true;
			Static397.aClass63_1 = Static313.method4477();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	private void method899() {
		@Pc(8) long local8 = Static101.method1557();
		@Pc(12) long local12 = Static325.aLongArray7[Static97.anInt1820];
		Static325.aLongArray7[Static97.anInt1820] = local8;
		@Pc(29) boolean local29;
		if (local12 == 0L || local8 <= local12) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static97.anInt1820 = Static97.anInt1820 + 1 & 0x1F;
		synchronized (this) {
			Static40.aBoolean28 = Static319.aBoolean368;
		}
		this.method902();
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	protected abstract void method900();

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
	protected abstract void method901();

	@OriginalMember(owner = "client!jg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static38.anApplet_Sub1_1 != this || Static194.aBoolean208) {
			return;
		}
		Static335.aBoolean59 = true;
		if (Static78.aBoolean79 && Static101.method1557() - Static133.aLong71 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static288.anInt5035 <= local26.width && local26.height >= Static119.anInt7598) {
				Static448.aBoolean489 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
	protected abstract void method902();

	@OriginalMember(owner = "client!jg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static97.aFrame1 == null) {
			return Static119.aClass138_7 == null || Static119.aClass138_7.anApplet1 == this ? super.getAppletContext() : Static119.aClass138_7.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static38.anApplet_Sub1_1 == this && !Static194.aBoolean208) {
			Static184.aLong99 = Static101.method1557();
			Static67.method1189(5000L);
			Static293.aClass138_4 = null;
			this.method905(false);
		}
	}

	@OriginalMember(owner = "client!jg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static97.aFrame1 == null) {
			return Static119.aClass138_7 == null || Static119.aClass138_7.anApplet1 == this ? super.getDocumentBase() : Static119.aClass138_7.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static97.aFrame1 == null) {
			return Static119.aClass138_7 == null || Static119.aClass138_7.anApplet1 == this ? super.getCodeBase() : Static119.aClass138_7.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static38.anApplet_Sub1_1 == this && !Static194.aBoolean208) {
			Static184.aLong99 = Static101.method1557() + 4000L;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	protected abstract void method903();

	@OriginalMember(owner = "client!jg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static97.aFrame1 == null) {
			return Static119.aClass138_7 == null || Static119.aClass138_7.anApplet1 == this ? super.getParameter(arg0) : Static119.aClass138_7.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
	private void method905(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static194.aBoolean208) {
				return;
			}
			Static194.aBoolean208 = true;
		}
		if (Static119.aClass138_7.anApplet1 != null) {
			Static119.aClass138_7.anApplet1.destroy();
		}
		try {
			this.method901();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean46) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean46 = false;
		}
		@Pc(53) Class100 local53 = Static119.aClass138_7.method3202(Static38.anApplet_Sub1_1.getClass());
		while (local53.anInt2365 == 0) {
			Static67.method1189(100L);
		}
		if (Static299.aCanvas5 != null) {
			try {
				Static299.aCanvas5.removeFocusListener(this);
				Static299.aCanvas5.getParent().remove(Static299.aCanvas5);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static119.aClass138_7 != null) {
			try {
				Static119.aClass138_7.method3210();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method903();
		if (Static97.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(90) Throwable local90) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!jg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static319.aBoolean368 = false;
	}

	@OriginalMember(owner = "client!jg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static210.aString27 != null) {
					@Pc(6) String local6 = Static210.aString27.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(20) String local20 = Static210.aString31;
						if (local20.equals("1.1") || local20.startsWith("1.1.") || local20.equals("1.2") || local20.startsWith("1.2.")) {
							this.method896("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static210.aString31 == null || Static210.aString31.equals("1.4.2"))) {
						this.method896("wrongjava");
						break label113;
					}
				}
				@Pc(67) int local67;
				if (Static210.aString31 != null && Static210.aString31.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (Static210.aString31.length() > local67) {
						@Pc(75) char local75 = Static210.aString31.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local69 = local75 + local69 * 10 - 48;
						local67++;
					}
					if (local69 >= 5) {
						Static78.aBoolean79 = true;
					}
				}
				if (Static119.aClass138_7.anApplet1 != null) {
					@Pc(114) Method local114 = Static210.aMethod1;
					if (local114 != null) {
						try {
							local114.invoke(Static119.aClass138_7.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static395.method5367();
				Static255.method3758();
				this.method910();
				this.method900();
				Static397.aClass63_1 = Static313.method4477();
				this.method898();
				while (Static184.aLong99 == 0L || Static184.aLong99 > Static101.method1557()) {
					Static359.anInt6114 = Static397.aClass63_1.method5556(Static399.anInt6925);
					for (local67 = 0; local67 < Static359.anInt6114; local67++) {
						this.method899();
					}
					this.method907();
					Static58.method1059(Static299.aCanvas5, Static119.aClass138_7);
				}
			}
		} catch (@Pc(186) Throwable local186) {
			Static315.method4700(local186, null);
			this.method896("crash");
		}
		this.method905(true);
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
	private void method907() {
		@Pc(6) long local6 = Static101.method1557();
		@Pc(10) long local10 = Static106.aLongArray3[Static327.anInt5734];
		Static106.aLongArray3[Static327.anInt5734] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static14.anInt344 = ((local34 >> 1) + 32000) / local34;
		}
		Static327.anInt5734 = Static327.anInt5734 + 1 & 0x1F;
		if (Static15.anInt3200++ > 50) {
			Static15.anInt3200 -= 50;
			Static335.aBoolean59 = true;
			Static299.aCanvas5.setSize(Static207.anInt3842, Static255.anInt4574);
			Static299.aCanvas5.setVisible(true);
			if (Static97.aFrame1 != null && Static421.aFrame2 == null) {
				@Pc(85) Insets local85 = Static97.aFrame1.getInsets();
				Static299.aCanvas5.setLocation(Static226.anInt4101 + local85.left, local85.top + Static340.anInt5935);
			} else {
				Static299.aCanvas5.setLocation(Static226.anInt4101, Static340.anInt5935);
			}
		}
		this.method895();
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)Z")
	protected final boolean method908() {
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
				this.method896("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V")
	public final synchronized void method910() {
		if (Static299.aCanvas5 != null) {
			Static299.aCanvas5.removeFocusListener(this);
			Static299.aCanvas5.getParent().remove(Static299.aCanvas5);
		}
		@Pc(21) Container local21;
		if (Static421.aFrame2 != null) {
			local21 = Static421.aFrame2;
		} else if (Static97.aFrame1 == null) {
			local21 = Static119.aClass138_7.anApplet1;
		} else {
			local21 = Static97.aFrame1;
		}
		local21.setLayout(null);
		Static299.aCanvas5 = new Canvas_Sub1(this);
		local21.add(Static299.aCanvas5);
		Static299.aCanvas5.setSize(Static207.anInt3842, Static255.anInt4574);
		Static299.aCanvas5.setVisible(true);
		if (local21 == Static97.aFrame1) {
			@Pc(60) Insets local60 = Static97.aFrame1.getInsets();
			Static299.aCanvas5.setLocation(local60.left + Static226.anInt4101, Static340.anInt5935 + local60.top);
		} else {
			Static299.aCanvas5.setLocation(Static226.anInt4101, Static340.anInt5935);
		}
		Static299.aCanvas5.addFocusListener(this);
		Static299.aCanvas5.requestFocus();
		Static319.aBoolean368 = true;
		Static40.aBoolean28 = true;
		Static335.aBoolean59 = true;
		Static448.aBoolean489 = false;
		Static133.aLong71 = Static101.method1557();
	}

	@OriginalMember(owner = "client!jg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILjava/lang/String;ZIIIZ)V")
	protected final void method911(@OriginalArg(2) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static452.anInt7811 = 586;
			Static255.anInt4574 = 768;
			Static119.anInt7598 = 768;
			Static226.anInt4101 = 0;
			Static38.anApplet_Sub1_1 = this;
			Static207.anInt3842 = 1024;
			Static288.anInt5035 = 1024;
			Static340.anInt5935 = 0;
			Static97.aFrame1 = new Frame();
			Static97.aFrame1.setTitle("Jagex");
			Static97.aFrame1.setResizable(true);
			Static97.aFrame1.addWindowListener(this);
			Static97.aFrame1.setVisible(true);
			Static97.aFrame1.toFront();
			@Pc(51) Insets local51 = Static97.aFrame1.getInsets();
			Static97.aFrame1.setSize(local51.right + Static288.anInt5035 + local51.left, local51.top + Static119.anInt7598 + local51.bottom);
			Static293.aClass138_4 = Static119.aClass138_7 = new Class138(null, arg1, arg0, 30);
			@Pc(84) Class100 local84 = Static119.aClass138_7.method3220(1, this);
			while (local84.anInt2365 == 0) {
				Static67.method1189(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static315.method4700(local94, null);
		}
	}

	@OriginalMember(owner = "client!jg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static38.anApplet_Sub1_1 == this && !Static194.aBoolean208) {
			Static184.aLong99 = 0L;
		}
	}

	@OriginalMember(owner = "client!jg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!jg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static319.aBoolean368 = true;
		Static335.aBoolean59 = true;
	}
}
