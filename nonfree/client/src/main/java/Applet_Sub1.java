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

@OriginalClass("client!gd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!gd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static227.aBoolean307 = false;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	protected abstract void method611();

	@OriginalMember(owner = "client!gd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	private void method612() {
		@Pc(6) long local6 = Static268.method4627();
		@Pc(10) long local10 = Static182.aLongArray4[Static157.anInt3003];
		Static182.aLongArray4[Static157.anInt3003] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static347.anInt6638 = ((local34 >> 1) + 32000) / local34;
		}
		Static157.anInt3003 = Static157.anInt3003 + 1 & 0x1F;
		if (Static262.anInt5361++ > 50) {
			Static262.anInt5361 -= 50;
			Static153.aBoolean190 = true;
			Static34.aCanvas1.setSize(Static164.anInt3090, Static79.anInt5259);
			Static34.aCanvas1.setVisible(true);
			if (Static241.aFrame2 != null && Static29.aFrame1 == null) {
				@Pc(75) Insets local75 = Static241.aFrame2.getInsets();
				Static34.aCanvas1.setLocation(Static343.anInt6572 + local75.left, Static54.anInt1024 + local75.top);
			} else {
				Static34.aCanvas1.setLocation(Static343.anInt6572, Static54.anInt1024);
			}
		}
		this.method621();
	}

	@OriginalMember(owner = "client!gd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static156.anApplet_Sub1_1 == this && !Static325.aBoolean80) {
			Static186.aLong110 = 0L;
		}
	}

	@OriginalMember(owner = "client!gd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static241.aFrame2 == null) {
			return Static77.aClass118_7 == null || Static77.aClass118_7.anApplet1 == this ? super.getParameter(arg0) : Static77.aClass118_7.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	private void method614(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static325.aBoolean80) {
				return;
			}
			Static325.aBoolean80 = true;
		}
		if (Static77.aClass118_7.anApplet1 != null) {
			Static77.aClass118_7.anApplet1.destroy();
		}
		try {
			this.method624();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean50) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean50 = false;
		}
		@Pc(48) Class2 local48 = Static77.aClass118_7.method2692(Static156.anApplet_Sub1_1.getClass());
		while (local48.anInt6 == 0) {
			Static244.method4311(100L);
		}
		if (Static34.aCanvas1 != null) {
			try {
				Static34.aCanvas1.removeFocusListener(this);
				Static34.aCanvas1.getParent().remove(Static34.aCanvas1);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Static77.aClass118_7 != null) {
			try {
				Static77.aClass118_7.method2698();
			} catch (@Pc(81) Exception local81) {
			}
		}
		this.method611();
		if (Static241.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(91) Throwable local91) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;ZIIIIII)V")
	protected final void method616(@OriginalArg(0) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static129.anInt2386 = 567;
			Static343.anInt6572 = 0;
			Static156.anApplet_Sub1_1 = this;
			Static164.anInt3090 = 1024;
			Static264.anInt5404 = 1024;
			Static79.anInt5259 = 768;
			Static319.anInt6199 = 768;
			Static54.anInt1024 = 0;
			Static241.aFrame2 = new Frame();
			Static241.aFrame2.setTitle("Jagex");
			Static241.aFrame2.setResizable(true);
			Static241.aFrame2.addWindowListener(this);
			Static241.aFrame2.setVisible(true);
			Static241.aFrame2.toFront();
			@Pc(44) Insets local44 = Static241.aFrame2.getInsets();
			Static241.aFrame2.setSize(local44.right + local44.left + Static264.anInt5404, local44.bottom + (Static319.anInt6199 - -local44.top));
			Static142.aClass118_3 = Static77.aClass118_7 = new Class118(null, arg1, arg0, 29);
			@Pc(77) Class2 local77 = Static77.aClass118_7.method2712(1, this);
			while (local77.anInt6 == 0) {
				Static244.method4311(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static38.method554(local90, null);
		}
	}

	@OriginalMember(owner = "client!gd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static227.aBoolean307 = true;
		Static153.aBoolean190 = true;
	}

	@OriginalMember(owner = "client!gd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static156.anApplet_Sub1_1 == this && !Static325.aBoolean80) {
			Static186.aLong110 = Static268.method4627();
			Static244.method4311(5000L);
			Static142.aClass118_3 = null;
			this.method614(false);
		}
	}

	@OriginalMember(owner = "client!gd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static241.aFrame2 == null) {
			return Static77.aClass118_7 == null || Static77.aClass118_7.anApplet1 == this ? super.getDocumentBase() : Static77.aClass118_7.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public final synchronized void method618() {
		if (Static34.aCanvas1 != null) {
			Static34.aCanvas1.removeFocusListener(this);
			Static34.aCanvas1.getParent().remove(Static34.aCanvas1);
		}
		@Pc(26) Container local26;
		if (Static29.aFrame1 != null) {
			local26 = Static29.aFrame1;
		} else if (Static241.aFrame2 == null) {
			local26 = Static77.aClass118_7.anApplet1;
		} else {
			local26 = Static241.aFrame2;
		}
		local26.setLayout(null);
		Static34.aCanvas1 = new Canvas_Sub1(this);
		local26.add(Static34.aCanvas1);
		Static34.aCanvas1.setSize(Static164.anInt3090, Static79.anInt5259);
		Static34.aCanvas1.setVisible(true);
		if (Static241.aFrame2 == local26) {
			@Pc(59) Insets local59 = Static241.aFrame2.getInsets();
			Static34.aCanvas1.setLocation(local59.left + Static343.anInt6572, Static54.anInt1024 + local59.top);
		} else {
			Static34.aCanvas1.setLocation(Static343.anInt6572, Static54.anInt1024);
		}
		Static34.aCanvas1.addFocusListener(this);
		Static34.aCanvas1.requestFocus();
		Static224.aBoolean407 = true;
		Static227.aBoolean307 = true;
		Static153.aBoolean190 = true;
		Static269.aBoolean356 = false;
		Static192.aLong115 = Static268.method4627();
	}

	@OriginalMember(owner = "client!gd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static167.aString29 != null) {
					@Pc(6) String local6 = Static167.aString29.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(20) String local20 = Static167.aString31;
						if (local20.equals("1.1") || local20.startsWith("1.1.") || local20.equals("1.2") || local20.startsWith("1.2.")) {
							this.method622("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static167.aString31 == null || Static167.aString31.equals("1.4.2"))) {
						this.method622("wrongjava");
						break label113;
					}
				}
				@Pc(67) int local67;
				if (Static167.aString31 != null && Static167.aString31.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (Static167.aString31.length() > local67) {
						@Pc(75) char local75 = Static167.aString31.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local67++;
						local69 = local75 + local69 * 10 - 48;
					}
					if (local69 >= 5) {
						Static17.aBoolean12 = true;
					}
				}
				if (Static77.aClass118_7.anApplet1 != null) {
					@Pc(110) Method local110 = Static167.aMethod2;
					if (local110 != null) {
						try {
							local110.invoke(Static77.aClass118_7.anApplet1, Boolean.TRUE);
						} catch (@Pc(125) Throwable local125) {
						}
					}
				}
				Static165.method2683();
				Static46.method678();
				this.method618();
				this.method627();
				Static76.aClass18_3 = Static261.method4527();
				this.method626();
				while (Static186.aLong110 == 0L || Static186.aLong110 > Static268.method4627()) {
					Static191.anInt6248 = Static76.aClass18_3.method4636(Static32.anInt584);
					for (local67 = 0; local67 < Static191.anInt6248; local67++) {
						this.method620();
					}
					this.method612();
					Static207.method3723(Static34.aCanvas1, Static77.aClass118_7);
				}
			}
		} catch (@Pc(188) Exception local188) {
			Static38.method554(local188, null);
			this.method622("crash");
		}
		this.method614(true);
	}

	@OriginalMember(owner = "client!gd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
	protected final boolean method619() {
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
				this.method622("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	private void method620() {
		@Pc(6) long local6 = Static268.method4627();
		@Pc(10) long local10 = Static237.aLongArray6[Static147.anInt2682];
		Static237.aLongArray6[Static147.anInt2682] = local6;
		Static147.anInt2682 = Static147.anInt2682 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local6 <= local10) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static224.aBoolean407 = Static227.aBoolean307;
		}
		this.method625();
	}

	@OriginalMember(owner = "client!gd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static156.anApplet_Sub1_1 != this || Static325.aBoolean80) {
			return;
		}
		Static153.aBoolean190 = true;
		if (Static17.aBoolean12 && Static268.method4627() - Static192.aLong115 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static264.anInt5404 <= local24.width && local24.height >= Static319.anInt6199) {
				Static269.aBoolean356 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	protected abstract void method621();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method622(@OriginalArg(0) String arg0) {
		if (this.aBoolean49) {
			return;
		}
		this.aBoolean49 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static360.method555("loggedout", Static77.aClass118_7.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
	protected final void method623(@OriginalArg(2) int arg0) {
		try {
			if (Static156.anApplet_Sub1_1 == null) {
				Static54.anInt1024 = 0;
				Static156.anApplet_Sub1_1 = this;
				Static164.anInt3090 = 765;
				Static264.anInt5404 = 765;
				Static343.anInt6572 = 0;
				Static79.anInt5259 = 503;
				Static319.anInt6199 = 503;
				Static129.anInt2386 = 567;
				if (Static77.aClass118_7 == null) {
					Static142.aClass118_3 = Static77.aClass118_7 = new Class118(this, arg0, null, 0);
				}
				@Pc(64) Class2 local64 = Static77.aClass118_7.method2712(1, this);
				while (local64.anInt6 == 0) {
					Static244.method4311(10L);
				}
			} else {
				Static69.anInt1301++;
				if (Static69.anInt1301 >= 3) {
					this.method622("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Exception local74) {
			Static38.method554(local74, null);
			this.method622("crash");
		}
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	protected abstract void method624();

	@OriginalMember(owner = "client!gd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static156.anApplet_Sub1_1 == this && !Static325.aBoolean80) {
			Static186.aLong110 = Static268.method4627() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static241.aFrame2 == null) {
			return Static77.aClass118_7 == null || Static77.aClass118_7.anApplet1 == this ? super.getCodeBase() : Static77.aClass118_7.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	protected abstract void method625();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public final void method626() {
		if (this.aBoolean50) {
			return;
		}
		try {
			@Pc(14) Class2 local14 = Static77.aClass118_7.method2718(Static156.anApplet_Sub1_1.getClass());
			while (local14.anInt6 == 0) {
				Static244.method4311(100L);
			}
			if (local14.anObject1 != null) {
				throw (Throwable) local14.anObject1;
			}
			jagmisc.init();
			this.aBoolean50 = true;
			Static76.aClass18_3 = Static261.method4527();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static241.aFrame2 == null) {
			return Static77.aClass118_7 == null || Static77.aClass118_7.anApplet1 == this ? super.getAppletContext() : Static77.aClass118_7.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	protected abstract void method627();
}
