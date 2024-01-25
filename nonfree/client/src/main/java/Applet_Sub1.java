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

@OriginalClass("client!pp")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIBI)V")
	protected final void method1009(@OriginalArg(0) int arg0) {
		try {
			if (Static258.anApplet_Sub1_1 == null) {
				Static151.anInt3239 = 564;
				Static205.anInt4113 = 0;
				Static249.anInt4822 = 0;
				Static258.anApplet_Sub1_1 = this;
				Static294.anInt5659 = 765;
				Static2.anInt104 = 765;
				Static46.anInt1173 = 503;
				Static218.anInt4396 = 503;
				if (Static105.aClass15_2 == null) {
					Static103.aClass15_1 = Static105.aClass15_2 = new Class15(this, arg0, null, 0);
				}
				@Pc(67) Class205 local67 = Static105.aClass15_2.method287(1, this);
				while (local67.anInt6370 == 0) {
					Static15.method5425(10L);
				}
			} else {
				Static272.anInt5176++;
				if (Static272.anInt5176 >= 3) {
					this.method1017("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(77) Exception local77) {
			Static47.method1149(local77, null);
			this.method1017("crash");
		}
	}

	@OriginalMember(owner = "client!pp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static90.aBoolean148 = false;
	}

	@OriginalMember(owner = "client!pp", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static258.anApplet_Sub1_1 == this && !Static65.aBoolean375) {
			Static191.aLong121 = 0L;
		}
	}

	@OriginalMember(owner = "client!pp", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static277.aFrame2 == null) {
			return Static105.aClass15_2 == null || Static105.aClass15_2.anApplet1 == this ? super.getAppletContext() : Static105.aClass15_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public final void method1010() {
		if (this.aBoolean61) {
			return;
		}
		try {
			@Pc(17) Class205 local17 = Static105.aClass15_2.method276(Static258.anApplet_Sub1_1.getClass());
			while (local17.anInt6370 == 0) {
				Static15.method5425(100L);
			}
			if (local17.anObject7 != null) {
				throw (Throwable) local17.anObject7;
			}
			jagmisc.init();
			this.aBoolean61 = true;
			Static284.aClass29_1 = Static72.method1769();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
	public final synchronized void method1011() {
		if (Static95.aCanvas2 != null) {
			Static95.aCanvas2.removeFocusListener(this);
			Static95.aCanvas2.getParent().remove(Static95.aCanvas2);
		}
		@Pc(23) Container local23;
		if (Static267.aFrame1 != null) {
			local23 = Static267.aFrame1;
		} else if (Static277.aFrame2 == null) {
			local23 = Static105.aClass15_2.anApplet1;
		} else {
			local23 = Static277.aFrame2;
		}
		local23.setLayout(null);
		Static95.aCanvas2 = new Canvas_Sub1(this);
		local23.add(Static95.aCanvas2);
		Static95.aCanvas2.setSize(Static294.anInt5659, Static46.anInt1173);
		Static95.aCanvas2.setVisible(true);
		if (Static277.aFrame2 == local23) {
			@Pc(59) Insets local59 = Static277.aFrame2.getInsets();
			Static95.aCanvas2.setLocation(Static205.anInt4113 + local59.left, local59.top - -Static249.anInt4822);
		} else {
			Static95.aCanvas2.setLocation(Static205.anInt4113, Static249.anInt4822);
		}
		Static95.aCanvas2.addFocusListener(this);
		Static95.aCanvas2.requestFocus();
		Static131.aBoolean115 = true;
		Static90.aBoolean148 = true;
		Static116.aBoolean180 = true;
		Static308.aBoolean298 = false;
		Static104.aLong67 = Static168.method3300();
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	protected abstract void method1012();

	@OriginalMember(owner = "client!pp", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Z")
	protected final boolean method1014() {
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
				this.method1017("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
	private void method1015(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static65.aBoolean375) {
				return;
			}
			Static65.aBoolean375 = true;
		}
		if (Static105.aClass15_2.anApplet1 != null) {
			Static105.aClass15_2.anApplet1.destroy();
		}
		try {
			this.method1026();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean61) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean61 = false;
		}
		@Pc(55) Class205 local55 = Static105.aClass15_2.method293(Static258.anApplet_Sub1_1.getClass());
		while (local55.anInt6370 == 0) {
			Static15.method5425(100L);
		}
		if (Static95.aCanvas2 != null) {
			try {
				Static95.aCanvas2.removeFocusListener(this);
				Static95.aCanvas2.getParent().remove(Static95.aCanvas2);
			} catch (@Pc(77) Exception local77) {
			}
		}
		if (Static105.aClass15_2 != null) {
			try {
				Static105.aClass15_2.method285();
			} catch (@Pc(85) Exception local85) {
			}
		}
		this.method1019();
		if (Static277.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(95) Throwable local95) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
	private void method1016() {
		@Pc(10) long local10 = Static168.method3300();
		@Pc(14) long local14 = Static140.aLongArray5[Static159.anInt3349];
		Static140.aLongArray5[Static159.anInt3349] = local10;
		@Pc(31) boolean local31;
		if (local14 == 0L || local14 >= local10) {
			local31 = false;
		} else {
			local31 = true;
		}
		Static159.anInt3349 = Static159.anInt3349 + 1 & 0x1F;
		synchronized (this) {
			Static131.aBoolean115 = Static90.aBoolean148;
		}
		this.method1020();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1017(@OriginalArg(0) String arg0) {
		if (this.aBoolean60) {
			return;
		}
		this.aBoolean60 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static356.method171(Static105.aClass15_2.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!pp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static90.aBoolean148 = true;
		Static116.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!pp", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static277.aFrame2 == null) {
			return Static105.aClass15_2 == null || Static105.aClass15_2.anApplet1 == this ? super.getDocumentBase() : Static105.aClass15_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pp", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static258.anApplet_Sub1_1 == this && !Static65.aBoolean375) {
			Static191.aLong121 = Static168.method3300();
			Static15.method5425(5000L);
			Static103.aClass15_1 = null;
			this.method1015(false);
		}
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
	protected abstract void method1019();

	@OriginalMember(owner = "client!pp", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	protected abstract void method1020();

	@OriginalMember(owner = "client!pp", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pp", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static12.aString9 != null) {
					@Pc(6) String local6 = Static12.aString9.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static12.aString8;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method1017("wrongjava");
							break label107;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static12.aString8 == null || Static12.aString8.equals("1.4.2"))) {
						this.method1017("wrongjava");
						break label107;
					}
				}
				@Pc(66) int local66;
				if (Static12.aString8 != null && Static12.aString8.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (local66 < Static12.aString8.length()) {
						@Pc(74) char local74 = Static12.aString8.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local66++;
						local68 = local68 * 10 + local74 - 48;
					}
					if (local68 >= 5) {
						Static94.aBoolean152 = true;
					}
				}
				if (Static105.aClass15_2.anApplet1 != null) {
					@Pc(113) Method local113 = Static12.aMethod2;
					if (local113 != null) {
						try {
							local113.invoke(Static105.aClass15_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static174.method3395();
				Static158.method3093();
				this.method1011();
				this.method1027();
				Static284.aClass29_1 = Static72.method1769();
				this.method1010();
				while (Static191.aLong121 == 0L || Static191.aLong121 > Static168.method3300()) {
					Static255.anInt4875 = Static284.aClass29_1.method5293(Static4.anInt113);
					for (local66 = 0; local66 < Static255.anInt4875; local66++) {
						this.method1016();
					}
					this.method1028();
					Static165.method4554(Static95.aCanvas2, Static105.aClass15_2);
				}
			}
		} catch (@Pc(185) Exception local185) {
			Static47.method1149(local185, null);
			this.method1017("crash");
		}
		this.method1015(true);
	}

	@OriginalMember(owner = "client!pp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static258.anApplet_Sub1_1 != this || Static65.aBoolean375) {
			return;
		}
		Static116.aBoolean180 = true;
		if (Static94.aBoolean152 && Static168.method3300() - Static104.aLong67 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static2.anInt104 <= local24.width && Static218.anInt4396 <= local24.height) {
				Static308.aBoolean298 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static258.anApplet_Sub1_1 == this && !Static65.aBoolean375) {
			Static191.aLong121 = Static168.method3300() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIIIILjava/lang/String;ZI)V")
	protected final void method1021(@OriginalArg(2) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static205.anInt4113 = 0;
			Static151.anInt3239 = 564;
			Static294.anInt5659 = 1024;
			Static2.anInt104 = 1024;
			Static258.anApplet_Sub1_1 = this;
			Static249.anInt4822 = 0;
			Static46.anInt1173 = 768;
			Static218.anInt4396 = 768;
			Static277.aFrame2 = new Frame();
			Static277.aFrame2.setTitle("Jagex");
			Static277.aFrame2.setResizable(true);
			Static277.aFrame2.addWindowListener(this);
			Static277.aFrame2.setVisible(true);
			Static277.aFrame2.toFront();
			@Pc(42) Insets local42 = Static277.aFrame2.getInsets();
			Static277.aFrame2.setSize(local42.right + local42.left + Static2.anInt104, local42.bottom + local42.top + Static218.anInt4396);
			Static103.aClass15_1 = Static105.aClass15_2 = new Class15(null, arg0, arg1, 29);
			@Pc(74) Class205 local74 = Static105.aClass15_2.method287(1, this);
			while (local74.anInt6370 == 0) {
				Static15.method5425(10L);
			}
		} catch (@Pc(84) Exception local84) {
			Static47.method1149(local84, null);
		}
	}

	@OriginalMember(owner = "client!pp", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static277.aFrame2 == null) {
			return Static105.aClass15_2 == null || Static105.aClass15_2.anApplet1 == this ? super.getCodeBase() : Static105.aClass15_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pp", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static277.aFrame2 == null) {
			return Static105.aClass15_2 == null || Static105.aClass15_2.anApplet1 == this ? super.getParameter(arg0) : Static105.aClass15_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V")
	protected abstract void method1026();

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)V")
	protected abstract void method1027();

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
	private void method1028() {
		@Pc(6) long local6 = Static168.method3300();
		@Pc(10) long local10 = Static111.aLongArray4[Static343.anInt6573];
		Static111.aLongArray4[Static343.anInt6573] = local6;
		Static343.anInt6573 = Static343.anInt6573 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(39) int local39 = (int) (local6 - local10);
			Static116.anInt2558 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static187.anInt3856++ > 50) {
			Static116.aBoolean180 = true;
			Static187.anInt3856 -= 50;
			Static95.aCanvas2.setSize(Static294.anInt5659, Static46.anInt1173);
			Static95.aCanvas2.setVisible(true);
			if (Static277.aFrame2 != null && Static267.aFrame1 == null) {
				@Pc(77) Insets local77 = Static277.aFrame2.getInsets();
				Static95.aCanvas2.setLocation(local77.left + Static205.anInt4113, Static249.anInt4822 + local77.top);
			} else {
				Static95.aCanvas2.setLocation(Static205.anInt4113, Static249.anInt4822);
			}
		}
		this.method1012();
	}
}
