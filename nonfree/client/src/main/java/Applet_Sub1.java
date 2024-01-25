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

@OriginalClass("client!od")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Z")
	private boolean aBoolean52 = false;

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!od", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!od", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	protected abstract void method697();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	private void method698(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static297.aBoolean307) {
				return;
			}
			Static297.aBoolean307 = true;
		}
		if (Static230.aClass61_4.anApplet1 != null) {
			Static230.aClass61_4.anApplet1.destroy();
		}
		try {
			this.method697();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean52) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean52 = false;
		}
		@Pc(53) Class236 local53 = Static230.aClass61_4.method1473(Static387.anApplet_Sub1_3.getClass());
		while (local53.anInt6178 == 0) {
			Static214.method2089(100L);
		}
		if (Static95.aCanvas3 != null) {
			try {
				Static95.aCanvas3.removeFocusListener(this);
				Static95.aCanvas3.getParent().remove(Static95.aCanvas3);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static230.aClass61_4 != null) {
			try {
				Static230.aClass61_4.method1467();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method709();
		if (Static452.aFrame5 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)Z")
	protected final boolean method699() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.equals("stellardawn.com") || local13.endsWith(".stellardawn.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method711("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	protected abstract void method700();

	@OriginalMember(owner = "client!od", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static452.aFrame5 == null) {
			return Static230.aClass61_4 == null || Static230.aClass61_4.anApplet1 == this ? super.getParameter(arg0) : Static230.aClass61_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static452.aFrame5 == null) {
			return Static230.aClass61_4 == null || Static230.aClass61_4.anApplet1 == this ? super.getAppletContext() : Static230.aClass61_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	protected abstract void method701();

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	private void method702() {
		@Pc(12) long local12 = Static158.method2342();
		@Pc(16) long local16 = Static258.aLongArray8[Static202.anInt3581];
		Static258.aLongArray8[Static202.anInt3581] = local12;
		Static202.anInt3581 = Static202.anInt3581 + 1 & 0x1F;
		if (local16 != 0L && local12 > local16) {
			@Pc(40) int local40 = (int) (local12 - local16);
			Static446.anInt7362 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static408.anInt6460++ > 50) {
			Static124.aBoolean135 = true;
			Static408.anInt6460 -= 50;
			Static95.aCanvas3.setSize(Static251.anInt4258, Static286.anInt4051);
			Static95.aCanvas3.setVisible(true);
			if (Static452.aFrame5 != null && Static145.aFrame4 == null) {
				@Pc(81) Insets local81 = Static452.aFrame5.getInsets();
				Static95.aCanvas3.setLocation(Static148.anInt2796 + local81.left, local81.top + Static445.anInt1110);
			} else {
				Static95.aCanvas3.setLocation(Static148.anInt2796, Static445.anInt1110);
			}
		}
		this.method701();
	}

	@OriginalMember(owner = "client!od", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static452.aFrame5 == null) {
			return Static230.aClass61_4 == null || Static230.aClass61_4.anApplet1 == this ? super.getCodeBase() : Static230.aClass61_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static387.anApplet_Sub1_3 != this || Static297.aBoolean307) {
			return;
		}
		Static124.aBoolean135 = true;
		if (Static170.aBoolean291 && Static158.method2342() - Static257.aLong138 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static382.anInt6127 && Static439.anInt7322 <= local26.height) {
				Static141.aBoolean166 = true;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	protected abstract void method703();

	@OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static171.aBoolean185 = true;
		Static124.aBoolean135 = true;
	}

	@OriginalMember(owner = "client!od", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static387.anApplet_Sub1_3 == this && !Static297.aBoolean307) {
			Static421.aLong211 = Static158.method2342() + 4000L;
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	private void method705() {
		@Pc(12) long local12 = Static158.method2342();
		@Pc(16) long local16 = Static51.aLongArray1[Static44.anInt728];
		Static51.aLongArray1[Static44.anInt728] = local12;
		Static44.anInt728 = Static44.anInt728 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local16 == 0L || local16 >= local12) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static173.aBoolean186 = Static171.aBoolean185;
		}
		this.method700();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public final void method707() {
		if (this.aBoolean52) {
			return;
		}
		try {
			@Pc(20) Class236 local20 = Static230.aClass61_4.method1457(Static387.anApplet_Sub1_3.getClass());
			while (local20.anInt6178 == 0) {
				Static214.method2089(100L);
			}
			if (local20.anObject8 != null) {
				throw (Throwable) local20.anObject8;
			}
			jagmisc.init();
			this.aBoolean52 = true;
			Static184.aClass99_1 = Static379.method4670();
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	public final synchronized void method708() {
		if (Static95.aCanvas3 != null) {
			Static95.aCanvas3.removeFocusListener(this);
			Static95.aCanvas3.getParent().remove(Static95.aCanvas3);
		}
		@Pc(18) Container local18;
		if (Static145.aFrame4 != null) {
			local18 = Static145.aFrame4;
		} else if (Static452.aFrame5 == null) {
			local18 = Static230.aClass61_4.anApplet1;
		} else {
			local18 = Static452.aFrame5;
		}
		local18.setLayout(null);
		Static95.aCanvas3 = new Canvas_Sub1(this);
		local18.add(Static95.aCanvas3);
		Static95.aCanvas3.setSize(Static251.anInt4258, Static286.anInt4051);
		Static95.aCanvas3.setVisible(true);
		if (local18 == Static452.aFrame5) {
			@Pc(60) Insets local60 = Static452.aFrame5.getInsets();
			Static95.aCanvas3.setLocation(Static148.anInt2796 + local60.left, Static445.anInt1110 + local60.top);
		} else {
			Static95.aCanvas3.setLocation(Static148.anInt2796, Static445.anInt1110);
		}
		Static95.aCanvas3.addFocusListener(this);
		Static95.aCanvas3.requestFocus();
		Static173.aBoolean186 = true;
		Static171.aBoolean185 = true;
		Static124.aBoolean135 = true;
		Static141.aBoolean166 = false;
		Static257.aLong138 = Static158.method2342();
	}

	@OriginalMember(owner = "client!od", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static387.anApplet_Sub1_3 == this && !Static297.aBoolean307) {
			Static421.aLong211 = Static158.method2342();
			Static214.method2089(5000L);
			Static217.aClass61_3 = null;
			this.method698(false);
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	protected abstract void method709();

	@OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static85.aString14 != null) {
					@Pc(10) String local10 = Static85.aString14.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(39) String local39 = Static85.aString8;
						if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
							this.method711("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static85.aString8 == null || Static85.aString8.equals("1.4.2"))) {
						this.method711("wrongjava");
						break label107;
					}
				}
				@Pc(69) int local69;
				if (Static85.aString8 != null && Static85.aString8.startsWith("1.")) {
					local69 = 2;
					@Pc(71) int local71 = 0;
					while (local69 < Static85.aString8.length()) {
						@Pc(77) char local77 = Static85.aString8.charAt(local69);
						if (local77 < '0' || local77 > '9') {
							break;
						}
						local69++;
						local71 = local71 * 10 + local77 - 48;
					}
					if (local71 >= 5) {
						Static170.aBoolean291 = true;
					}
				}
				if (Static230.aClass61_4.anApplet1 != null) {
					@Pc(118) Method local118 = Static85.aMethod2;
					if (local118 != null) {
						try {
							local118.invoke(Static230.aClass61_4.anApplet1, Boolean.TRUE);
						} catch (@Pc(133) Throwable local133) {
						}
					}
				}
				Static286.method3217();
				Static23.method250();
				this.method708();
				this.method707();
				this.method703();
				Static184.aClass99_1 = Static379.method4670();
				this.method707();
				while (Static421.aLong211 == 0L || Static158.method2342() < Static421.aLong211) {
					Static305.anInt7340 = Static184.aClass99_1.method2624(Static9.anInt57);
					for (local69 = 0; local69 < Static305.anInt7340; local69++) {
						this.method705();
					}
					this.method702();
					Static22.method3910(Static95.aCanvas3, Static230.aClass61_4);
				}
			}
		} catch (@Pc(193) Throwable local193) {
			Static419.method5247(local193, this.method713());
			this.method711("crash");
		}
		this.method698(true);
	}

	@OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static171.aBoolean185 = false;
	}

	@OriginalMember(owner = "client!od", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method711(@OriginalArg(1) String arg0) {
		if (this.aBoolean53) {
			return;
		}
		this.aBoolean53 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static468.method5098(Static230.aClass61_4.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	protected final void method712(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static387.anApplet_Sub1_3 != null) {
				Static302.anInt5113++;
				if (Static302.anInt5113 >= 3) {
					this.method711("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static403.anInt4197 = 595;
			Static286.anInt4051 = arg0;
			Static439.anInt7322 = arg0;
			Static148.anInt2796 = 0;
			Static387.anApplet_Sub1_3 = this;
			Static251.anInt4258 = arg1;
			Static382.anInt6127 = arg1;
			Static445.anInt1110 = 0;
			if (Static230.aClass61_4 == null) {
				Static217.aClass61_3 = Static230.aClass61_4 = new Class61(this, arg2, null, 0);
			}
			@Pc(62) Class236 local62 = Static230.aClass61_4.method1459(this, 1);
			while (local62.anInt6178 == 0) {
				Static214.method2089(10L);
			}
		} catch (@Pc(77) Throwable local77) {
			Static419.method5247(local77, null);
			this.method711("crash");
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)Ljava/lang/String;")
	protected String method713() {
		return null;
	}

	@OriginalMember(owner = "client!od", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static387.anApplet_Sub1_3 == this && !Static297.aBoolean307) {
			Static421.aLong211 = 0L;
		}
	}

	@OriginalMember(owner = "client!od", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static452.aFrame5 == null) {
			return Static230.aClass61_4 == null || Static230.aClass61_4.anApplet1 == this ? super.getDocumentBase() : Static230.aClass61_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZLjava/lang/String;IIII)V")
	protected final void method715(@OriginalArg(3) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static286.anInt4051 = 768;
			Static439.anInt7322 = 768;
			Static403.anInt4197 = 595;
			Static251.anInt4258 = 1024;
			Static382.anInt6127 = 1024;
			Static387.anApplet_Sub1_3 = this;
			Static445.anInt1110 = 0;
			Static148.anInt2796 = 0;
			Static452.aFrame5 = new Frame();
			Static452.aFrame5.setTitle("Jagex");
			Static452.aFrame5.setResizable(true);
			Static452.aFrame5.addWindowListener(this);
			Static452.aFrame5.setVisible(true);
			Static452.aFrame5.toFront();
			@Pc(38) Insets local38 = Static452.aFrame5.getInsets();
			Static452.aFrame5.setSize(local38.right + Static382.anInt6127 + local38.left, local38.bottom + Static439.anInt7322 + local38.top);
			Static217.aClass61_3 = Static230.aClass61_4 = new Class61(null, arg1, arg0, 30);
			@Pc(76) Class236 local76 = Static230.aClass61_4.method1459(this, 1);
			while (local76.anInt6178 == 0) {
				Static214.method2089(10L);
			}
		} catch (@Pc(91) Exception local91) {
			Static419.method5247(local91, null);
		}
	}
}
