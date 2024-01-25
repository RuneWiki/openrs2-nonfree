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

@OriginalClass("client!ar")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ar", name = "K", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!ar", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)V")
	private void method853(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static3.aBoolean13) {
				return;
			}
			Static3.aBoolean13 = true;
		}
		if (Static1.aClass134_7.anApplet1 != null) {
			Static1.aClass134_7.anApplet1.destroy();
		}
		try {
			this.method859();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean89) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean89 = false;
		}
		@Pc(53) Class185 local53 = Static1.aClass134_7.method3761(Static144.anApplet_Sub1_1.getClass());
		while (local53.anInt5682 == 0) {
			Static249.method4396(100L);
		}
		if (Static300.aCanvas5 != null) {
			try {
				Static300.aCanvas5.removeFocusListener(this);
				Static300.aCanvas5.getParent().remove(Static300.aCanvas5);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static1.aClass134_7 != null) {
			try {
				Static1.aClass134_7.method3770();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method856();
		if (Static308.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ar", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static308.aFrame2 == null) {
			return Static1.aClass134_7 == null || Static1.aClass134_7.anApplet1 == this ? super.getParameter(arg0) : Static1.aClass134_7.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	protected abstract void method854();

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
	protected abstract void method856();

	@OriginalMember(owner = "client!ar", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static144.anApplet_Sub1_1 != this || Static3.aBoolean13) {
			return;
		}
		Static195.aBoolean315 = true;
		if (Static211.aBoolean338 && Static208.method3879() - Static347.aLong216 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static255.anInt5171 <= local26.width && Static165.anInt3522 <= local26.height) {
				Static199.aBoolean317 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method857(@OriginalArg(0) String arg0) {
		if (this.aBoolean88) {
			return;
		}
		this.aBoolean88 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static366.method4253("loggedout", Static1.aClass134_7.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!ar", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V")
	protected abstract void method859();

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	protected abstract void method860();

	@OriginalMember(owner = "client!ar", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static30.aBoolean83 = false;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)Z")
	protected final boolean method861() {
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
				this.method857("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ar", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	private void method864() {
		@Pc(10) long local10 = Static208.method3879();
		@Pc(14) long local14 = Static305.aLongArray10[Static338.anInt6454];
		Static305.aLongArray10[Static338.anInt6454] = local10;
		if (local14 != 0L && local14 < local10) {
			@Pc(34) int local34 = (int) (local10 - local14);
			Static296.anInt5726 = ((local34 >> 1) + 32000) / local34;
		}
		Static338.anInt6454 = Static338.anInt6454 + 1 & 0x1F;
		if (Static35.anInt981++ > 50) {
			Static195.aBoolean315 = true;
			Static35.anInt981 -= 50;
			Static300.aCanvas5.setSize(Static24.anInt496, Static23.anInt465);
			Static300.aCanvas5.setVisible(true);
			if (Static308.aFrame2 != null && Static229.aFrame1 == null) {
				@Pc(81) Insets local81 = Static308.aFrame2.getInsets();
				Static300.aCanvas5.setLocation(Static179.anInt3824 + local81.left, local81.top + Static140.anInt3219);
			} else {
				Static300.aCanvas5.setLocation(Static179.anInt3824, Static140.anInt3219);
			}
		}
		this.method854();
	}

	@OriginalMember(owner = "client!ar", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static308.aFrame2 == null) {
			return Static1.aClass134_7 == null || Static1.aClass134_7.anApplet1 == this ? super.getAppletContext() : Static1.aClass134_7.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label112: {
				if (Static200.aString38 != null) {
					@Pc(10) String local10 = Static200.aString38.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(24) String local24 = Static200.aString39;
						if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
							this.method857("wrongjava");
							break label112;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static200.aString39 == null || Static200.aString39.equals("1.4.2"))) {
						this.method857("wrongjava");
						break label112;
					}
				}
				@Pc(72) int local72;
				if (Static200.aString39 != null && Static200.aString39.startsWith("1.")) {
					local72 = 2;
					@Pc(74) int local74 = 0;
					while (Static200.aString39.length() > local72) {
						@Pc(80) char local80 = Static200.aString39.charAt(local72);
						if (local80 < '0' || local80 > '9') {
							break;
						}
						local72++;
						local74 = local74 * 10 + local80 - 48;
					}
					if (local74 >= 5) {
						Static211.aBoolean338 = true;
					}
				}
				if (Static1.aClass134_7.anApplet1 != null) {
					@Pc(113) Method local113 = Static200.aMethod2;
					if (local113 != null) {
						try {
							local113.invoke(Static1.aClass134_7.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static268.method4615();
				Static241.method4297();
				this.method868();
				this.method875();
				Static348.aClass6_1 = Static187.method3561();
				this.method866();
				while (Static265.aLong161 == 0L || Static208.method3879() < Static265.aLong161) {
					Static305.anInt6789 = Static348.aClass6_1.method4658(Static243.anInt5991);
					for (local72 = 0; local72 < Static305.anInt6789; local72++) {
						this.method872();
					}
					this.method864();
					Static70.method1651(Static300.aCanvas5, Static1.aClass134_7);
				}
			}
		} catch (@Pc(183) Exception local183) {
			Static289.method4874(null, local183);
			this.method857("crash");
		}
		this.method853(true);
	}

	@OriginalMember(owner = "client!ar", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static30.aBoolean83 = true;
		Static195.aBoolean315 = true;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
	public final void method866() {
		if (this.aBoolean89) {
			return;
		}
		try {
			@Pc(14) Class185 local14 = Static1.aClass134_7.method3771(Static144.anApplet_Sub1_1.getClass());
			while (local14.anInt5682 == 0) {
				Static249.method4396(100L);
			}
			if (local14.anObject4 != null) {
				throw (Throwable) local14.anObject4;
			}
			jagmisc.init();
			this.aBoolean89 = true;
			Static348.aClass6_1 = Static187.method3561();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!ar", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;ZIIIIZI)V")
	protected final void method867(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static140.anInt3219 = 0;
			Static179.anInt3824 = 0;
			Static24.anInt496 = 1024;
			Static255.anInt5171 = 1024;
			Static23.anInt465 = 768;
			Static165.anInt3522 = 768;
			Static347.anInt6580 = 566;
			Static144.anApplet_Sub1_1 = this;
			Static308.aFrame2 = new Frame();
			Static308.aFrame2.setTitle("Jagex");
			Static308.aFrame2.setResizable(true);
			Static308.aFrame2.addWindowListener(this);
			Static308.aFrame2.setVisible(true);
			Static308.aFrame2.toFront();
			@Pc(42) Insets local42 = Static308.aFrame2.getInsets();
			Static308.aFrame2.setSize(local42.right + Static255.anInt5171 + local42.left, local42.top + (Static165.anInt3522 - -local42.bottom));
			Static230.aClass134_8 = Static1.aClass134_7 = new Class134(null, arg1, arg0, 29);
			@Pc(76) Class185 local76 = Static1.aClass134_7.method3762(1, this);
			while (local76.anInt5682 == 0) {
				Static249.method4396(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static289.method4874(null, local86);
		}
	}

	@OriginalMember(owner = "client!ar", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static308.aFrame2 == null) {
			return Static1.aClass134_7 == null || Static1.aClass134_7.anApplet1 == this ? super.getCodeBase() : Static1.aClass134_7.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V")
	public final synchronized void method868() {
		if (Static300.aCanvas5 != null) {
			Static300.aCanvas5.removeFocusListener(this);
			Static300.aCanvas5.getParent().remove(Static300.aCanvas5);
		}
		@Pc(18) Container local18;
		if (Static229.aFrame1 != null) {
			local18 = Static229.aFrame1;
		} else if (Static308.aFrame2 == null) {
			local18 = Static1.aClass134_7.anApplet1;
		} else {
			local18 = Static308.aFrame2;
		}
		local18.setLayout(null);
		Static300.aCanvas5 = new Canvas_Sub1(this);
		local18.add(Static300.aCanvas5);
		Static300.aCanvas5.setSize(Static24.anInt496, Static23.anInt465);
		Static300.aCanvas5.setVisible(true);
		if (local18 == Static308.aFrame2) {
			@Pc(54) Insets local54 = Static308.aFrame2.getInsets();
			Static300.aCanvas5.setLocation(local54.left + Static179.anInt3824, local54.top + Static140.anInt3219);
		} else {
			Static300.aCanvas5.setLocation(Static179.anInt3824, Static140.anInt3219);
		}
		Static300.aCanvas5.addFocusListener(this);
		Static300.aCanvas5.requestFocus();
		Static30.aBoolean83 = true;
		Static96.aBoolean470 = true;
		Static195.aBoolean315 = true;
		Static199.aBoolean317 = false;
		Static347.aLong216 = Static208.method3879();
	}

	@OriginalMember(owner = "client!ar", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static144.anApplet_Sub1_1 == this && !Static3.aBoolean13) {
			Static265.aLong161 = Static208.method3879() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
	private void method872() {
		@Pc(6) long local6 = Static208.method3879();
		@Pc(10) long local10 = Static277.aLongArray6[Static172.anInt3670];
		Static277.aLongArray6[Static172.anInt3670] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local10 >= local6) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static172.anInt3670 = Static172.anInt3670 + 1 & 0x1F;
		synchronized (this) {
			Static96.aBoolean470 = Static30.aBoolean83;
		}
		this.method860();
	}

	@OriginalMember(owner = "client!ar", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ar", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static144.anApplet_Sub1_1 == this && !Static3.aBoolean13) {
			Static265.aLong161 = Static208.method3879();
			Static249.method4396(5000L);
			Static230.aClass134_8 = null;
			this.method853(false);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIZ)V")
	protected final void method874(@OriginalArg(1) int arg0) {
		try {
			if (Static144.anApplet_Sub1_1 == null) {
				Static179.anInt3824 = 0;
				Static140.anInt3219 = 0;
				Static347.anInt6580 = 566;
				Static144.anApplet_Sub1_1 = this;
				Static24.anInt496 = 765;
				Static255.anInt5171 = 765;
				Static23.anInt465 = 503;
				Static165.anInt3522 = 503;
				if (Static1.aClass134_7 == null) {
					Static230.aClass134_8 = Static1.aClass134_7 = new Class134(this, arg0, null, 0);
				}
				@Pc(70) Class185 local70 = Static1.aClass134_7.method3762(1, this);
				while (local70.anInt5682 == 0) {
					Static249.method4396(10L);
				}
			} else {
				Static145.anInt3274++;
				if (Static145.anInt3274 >= 3) {
					this.method857("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(83) Exception local83) {
			Static289.method4874(null, local83);
			this.method857("crash");
		}
	}

	@OriginalMember(owner = "client!ar", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static144.anApplet_Sub1_1 == this && !Static3.aBoolean13) {
			Static265.aLong161 = 0L;
		}
	}

	@OriginalMember(owner = "client!ar", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static308.aFrame2 == null) {
			return Static1.aClass134_7 == null || Static1.aClass134_7.anApplet1 == this ? super.getDocumentBase() : Static1.aClass134_7.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ar", name = "i", descriptor = "(I)V")
	protected abstract void method875();
}
