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

@OriginalClass("client!og")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	protected abstract void method1017();

	@OriginalMember(owner = "client!og", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	protected abstract void method1018();

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	protected abstract void method1020();

	@OriginalMember(owner = "client!og", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static99.aBoolean197 = true;
		Static157.aBoolean286 = true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1021(@OriginalArg(0) String arg0) {
		if (this.aBoolean89) {
			return;
		}
		this.aBoolean89 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static358.method3(Static177.aClass168_2.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	protected abstract void method1022();

	@OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static268.aString54 != null) {
					@Pc(10) String local10 = Static268.aString54.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static268.aString51;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1021("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static268.aString51 == null || Static268.aString51.equals("1.4.2"))) {
						this.method1021("wrongjava");
						break label111;
					}
				}
				@Pc(70) int local70;
				if (Static268.aString51 != null && Static268.aString51.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Static268.aString51.length()) {
						@Pc(78) char local78 = Static268.aString51.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local78 + local72 * 10 - 48;
					}
					if (local72 >= 5) {
						Static109.aBoolean209 = true;
					}
				}
				if (Static177.aClass168_2.anApplet1 != null) {
					@Pc(114) Method local114 = Static268.aMethod2;
					if (local114 != null) {
						try {
							local114.invoke(Static177.aClass168_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static126.method2618();
				Static29.method765();
				this.method1025();
				this.method1018();
				Static355.aClass66_1 = Static234.method4054();
				this.method1028();
				while (Static258.aLong155 == 0L || Static258.aLong155 > Static51.method1197()) {
					Static170.anInt3039 = Static355.aClass66_1.method5847(Static203.anInt3378);
					for (local70 = 0; local70 < Static170.anInt3039; local70++) {
						this.method1037();
					}
					this.method1024();
					Static8.method218(Static240.aCanvas4, Static177.aClass168_2);
				}
			}
		} catch (@Pc(192) Exception local192) {
			Static69.method1566(null, local192);
			this.method1021("crash");
		}
		this.method1036(true);
	}

	@OriginalMember(owner = "client!og", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static348.aFrame2 == null) {
			return Static177.aClass168_2 == null || Static177.aClass168_2.anApplet1 == this ? super.getAppletContext() : Static177.aClass168_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	private void method1024() {
		@Pc(12) long local12 = Static51.method1197();
		@Pc(16) long local16 = Static297.aLongArray4[Static53.anInt1130];
		Static297.aLongArray4[Static53.anInt1130] = local12;
		if (local16 != 0L && local16 < local12) {
			@Pc(40) int local40 = (int) (local12 - local16);
			Static265.anInt6827 = ((local40 >> 1) + 32000) / local40;
		}
		Static53.anInt1130 = Static53.anInt1130 + 1 & 0x1F;
		if (Static320.anInt6208++ > 50) {
			Static320.anInt6208 -= 50;
			Static157.aBoolean286 = true;
			Static240.aCanvas4.setSize(Static136.anInt2829, Static198.anInt3876);
			Static240.aCanvas4.setVisible(true);
			if (Static348.aFrame2 != null && Static335.aFrame1 == null) {
				@Pc(89) Insets local89 = Static348.aFrame2.getInsets();
				Static240.aCanvas4.setLocation(Static197.anInt3869 + local89.left, Static168.anInt3423 + local89.top);
			} else {
				Static240.aCanvas4.setLocation(Static197.anInt3869, Static168.anInt3423);
			}
		}
		this.method1017();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
	public final synchronized void method1025() {
		if (Static240.aCanvas4 != null) {
			Static240.aCanvas4.removeFocusListener(this);
			Static240.aCanvas4.getParent().remove(Static240.aCanvas4);
		}
		@Pc(18) Container local18;
		if (Static335.aFrame1 != null) {
			local18 = Static335.aFrame1;
		} else if (Static348.aFrame2 == null) {
			local18 = Static177.aClass168_2.anApplet1;
		} else {
			local18 = Static348.aFrame2;
		}
		local18.setLayout(null);
		Static240.aCanvas4 = new Canvas_Sub1(this);
		local18.add(Static240.aCanvas4);
		Static240.aCanvas4.setSize(Static136.anInt2829, Static198.anInt3876);
		Static240.aCanvas4.setVisible(true);
		if (Static348.aFrame2 == local18) {
			@Pc(60) Insets local60 = Static348.aFrame2.getInsets();
			Static240.aCanvas4.setLocation(Static197.anInt3869 + local60.left, local60.top - -Static168.anInt3423);
		} else {
			Static240.aCanvas4.setLocation(Static197.anInt3869, Static168.anInt3423);
		}
		Static240.aCanvas4.addFocusListener(this);
		Static240.aCanvas4.requestFocus();
		Static99.aBoolean197 = true;
		Static81.aBoolean158 = true;
		Static157.aBoolean286 = true;
		Static253.aBoolean604 = false;
		Static197.aLong111 = Static51.method1197();
	}

	@OriginalMember(owner = "client!og", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static249.anApplet_Sub1_1 != this || Static160.aBoolean289) {
			return;
		}
		Static157.aBoolean286 = true;
		if (Static109.aBoolean209 && Static51.method1197() - Static197.aLong111 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static33.anInt591 && local26.height >= Static1.anInt16) {
				Static253.aBoolean604 = true;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static249.anApplet_Sub1_1 == this && !Static160.aBoolean289) {
			Static258.aLong155 = Static51.method1197();
			Static102.method2276(5000L);
			Static125.aClass168_1 = null;
			this.method1036(false);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILjava/lang/String;IIZII)V")
	protected final void method1027(@OriginalArg(2) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static168.anInt3423 = 0;
			Static162.anInt3272 = 569;
			Static197.anInt3869 = 0;
			Static136.anInt2829 = 1024;
			Static33.anInt591 = 1024;
			Static198.anInt3876 = 768;
			Static1.anInt16 = 768;
			Static249.anApplet_Sub1_1 = this;
			Static348.aFrame2 = new Frame();
			Static348.aFrame2.setTitle("Jagex");
			Static348.aFrame2.setResizable(true);
			Static348.aFrame2.addWindowListener(this);
			Static348.aFrame2.setVisible(true);
			Static348.aFrame2.toFront();
			@Pc(48) Insets local48 = Static348.aFrame2.getInsets();
			Static348.aFrame2.setSize(local48.right + Static33.anInt591 + local48.left, local48.top + Static1.anInt16 + local48.bottom);
			Static125.aClass168_1 = Static177.aClass168_2 = new Class168(null, arg1, arg0, 29);
			@Pc(81) Class193 local81 = Static177.aClass168_2.method4856(this, 1);
			while (local81.anInt6293 == 0) {
				Static102.method2276(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static69.method1566(null, local94);
		}
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	public final void method1028() {
		if (this.aBoolean88) {
			return;
		}
		try {
			@Pc(18) Class193 local18 = Static177.aClass168_2.method4837(Static249.anApplet_Sub1_1.getClass());
			while (local18.anInt6293 == 0) {
				Static102.method2276(100L);
			}
			if (local18.anObject7 != null) {
				throw (Throwable) local18.anObject7;
			}
			jagmisc.init();
			this.aBoolean88 = true;
			Static355.aClass66_1 = Static234.method4054();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!og", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	protected final void method1030(@OriginalArg(3) int arg0) {
		try {
			if (Static249.anApplet_Sub1_1 == null) {
				Static162.anInt3272 = 569;
				Static168.anInt3423 = 0;
				Static249.anApplet_Sub1_1 = this;
				Static136.anInt2829 = 765;
				Static33.anInt591 = 765;
				Static198.anInt3876 = 503;
				Static1.anInt16 = 503;
				Static197.anInt3869 = 0;
				if (Static177.aClass168_2 == null) {
					Static125.aClass168_1 = Static177.aClass168_2 = new Class168(this, arg0, null, 0);
				}
				@Pc(64) Class193 local64 = Static177.aClass168_2.method4856(this, 1);
				while (local64.anInt6293 == 0) {
					Static102.method2276(10L);
				}
			} else {
				Static248.anInt4878++;
				if (Static248.anInt4878 >= 3) {
					this.method1021("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(77) Exception local77) {
			Static69.method1566(null, local77);
			this.method1021("crash");
		}
	}

	@OriginalMember(owner = "client!og", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	protected abstract void method1033();

	@OriginalMember(owner = "client!og", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static348.aFrame2 == null) {
			return Static177.aClass168_2 == null || Static177.aClass168_2.anApplet1 == this ? super.getDocumentBase() : Static177.aClass168_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!og", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static348.aFrame2 == null) {
			return Static177.aClass168_2 == null || Static177.aClass168_2.anApplet1 == this ? super.getParameter(arg0) : Static177.aClass168_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Z")
	protected final boolean method1034() {
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
				this.method1021("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static249.anApplet_Sub1_1 == this && !Static160.aBoolean289) {
			Static258.aLong155 = Static51.method1197() + 4000L;
		}
	}

	@OriginalMember(owner = "client!og", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!og", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static348.aFrame2 == null) {
			return Static177.aClass168_2 == null || Static177.aClass168_2.anApplet1 == this ? super.getCodeBase() : Static177.aClass168_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static99.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IZ)V")
	private void method1036(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static160.aBoolean289) {
				return;
			}
			Static160.aBoolean289 = true;
		}
		if (Static177.aClass168_2.anApplet1 != null) {
			Static177.aClass168_2.anApplet1.destroy();
		}
		try {
			this.method1020();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean88) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean88 = false;
		}
		@Pc(48) Class193 local48 = Static177.aClass168_2.method4847(Static249.anApplet_Sub1_1.getClass());
		while (local48.anInt6293 == 0) {
			Static102.method2276(100L);
		}
		if (Static240.aCanvas4 != null) {
			try {
				Static240.aCanvas4.removeFocusListener(this);
				Static240.aCanvas4.getParent().remove(Static240.aCanvas4);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static177.aClass168_2 != null) {
			try {
				Static177.aClass168_2.method4838();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method1022();
		if (Static348.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!og", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static249.anApplet_Sub1_1 == this && !Static160.aBoolean289) {
			Static258.aLong155 = 0L;
		}
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V")
	private void method1037() {
		@Pc(6) long local6 = Static51.method1197();
		@Pc(10) long local10 = Static79.aLongArray2[Static61.anInt1325];
		Static79.aLongArray2[Static61.anInt1325] = local6;
		Static61.anInt1325 = Static61.anInt1325 + 1 & 0x1F;
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		synchronized (this) {
			Static81.aBoolean158 = Static99.aBoolean197;
		}
		this.method1033();
	}

	@OriginalMember(owner = "client!og", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
