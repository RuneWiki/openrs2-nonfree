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

@OriginalClass("client!os")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!os", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V")
	protected final void method778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static444.anApplet_Sub1_1 == null) {
				Static287.anInt4720 = 0;
				Static141.anInt2513 = arg1;
				Static155.anInt2673 = arg1;
				Static7.anInt125 = 0;
				Static261.anInt2240 = 599;
				Static444.anApplet_Sub1_1 = this;
				Static314.anInt5426 = arg2;
				Static324.anInt5540 = arg2;
				if (Static79.aClass183_2 == null) {
					Static425.aClass183_5 = Static79.aClass183_2 = new Class183(this, arg0, null, 0);
				}
				@Pc(62) Class91 local62 = Static79.aClass183_2.method3904(this, 1);
				while (local62.anInt2446 == 0) {
					Static429.method5376(10L);
				}
			} else {
				Static127.anInt2290++;
				if (Static127.anInt2290 >= 3) {
					this.method789("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Throwable local78) {
			Static434.method5460(local78, null);
			this.method789("crash");
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	protected abstract void method779();

	@OriginalMember(owner = "client!os", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!os", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static444.anApplet_Sub1_1 == this && !Static209.aBoolean214) {
			Static116.aLong71 = 0L;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZZ)V")
	private void method780(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static209.aBoolean214) {
				return;
			}
			Static209.aBoolean214 = true;
		}
		if (Static79.aClass183_2.anApplet1 != null) {
			Static79.aClass183_2.anApplet1.destroy();
		}
		try {
			this.method791();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean85) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean85 = false;
		}
		Static1.method1();
		@Pc(57) Class91 local57 = Static79.aClass183_2.method3918(Static444.anApplet_Sub1_1.getClass());
		while (local57.anInt2446 == 0) {
			Static429.method5376(100L);
		}
		if (Static286.aCanvas4 != null) {
			try {
				Static286.aCanvas4.removeFocusListener(this);
				Static286.aCanvas4.getParent().remove(Static286.aCanvas4);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static79.aClass183_2 != null) {
			try {
				Static79.aClass183_2.method3905();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method793();
		if (Static261.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!os", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	public final void method781() {
		if (this.aBoolean85) {
			return;
		}
		try {
			@Pc(14) Class91 local14 = Static79.aClass183_2.method3912(Static444.anApplet_Sub1_1.getClass());
			while (local14.anInt2446 == 0) {
				Static429.method5376(100L);
			}
			if (local14.anObject3 != null) {
				throw (Throwable) local14.anObject3;
			}
			jagmisc.init();
			this.aBoolean85 = true;
			Static336.aClass140_1 = Static281.method3750();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)V")
	public final synchronized void method782() {
		if (Static286.aCanvas4 != null) {
			Static286.aCanvas4.removeFocusListener(this);
			Static286.aCanvas4.getParent().remove(Static286.aCanvas4);
		}
		@Pc(21) Container local21;
		if (Static300.aFrame4 != null) {
			local21 = Static300.aFrame4;
		} else if (Static261.aFrame3 == null) {
			local21 = Static79.aClass183_2.anApplet1;
		} else {
			local21 = Static261.aFrame3;
		}
		local21.setLayout(null);
		Static286.aCanvas4 = new Canvas_Sub1(this);
		local21.add(Static286.aCanvas4);
		Static286.aCanvas4.setSize(Static141.anInt2513, Static314.anInt5426);
		Static286.aCanvas4.setVisible(true);
		if (Static261.aFrame3 == local21) {
			@Pc(60) Insets local60 = Static261.aFrame3.getInsets();
			Static286.aCanvas4.setLocation(local60.left + Static7.anInt125, Static287.anInt4720 + local60.top);
		} else {
			Static286.aCanvas4.setLocation(Static7.anInt125, Static287.anInt4720);
		}
		Static286.aCanvas4.addFocusListener(this);
		Static286.aCanvas4.requestFocus();
		Static26.aBoolean45 = true;
		Static68.aBoolean354 = true;
		Static307.aBoolean391 = true;
		Static200.aBoolean205 = false;
		Static401.aLong198 = Static110.method1702();
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
	private void method783() {
		@Pc(6) long local6 = Static110.method1702();
		@Pc(10) long local10 = Static387.aLongArray11[Static344.anInt5850];
		Static387.aLongArray11[Static344.anInt5850] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(31) int local31 = (int) (local6 - local10);
			Static394.anInt6483 = ((local31 >> 1) + 32000) / local31;
		}
		Static344.anInt5850 = Static344.anInt5850 + 1 & 0x1F;
		if (Static312.anInt5381++ > 50) {
			Static312.anInt5381 -= 50;
			Static307.aBoolean391 = true;
			Static286.aCanvas4.setSize(Static141.anInt2513, Static314.anInt5426);
			Static286.aCanvas4.setVisible(true);
			if (Static261.aFrame3 != null && Static300.aFrame4 == null) {
				@Pc(79) Insets local79 = Static261.aFrame3.getInsets();
				Static286.aCanvas4.setLocation(Static7.anInt125 + local79.left, Static287.anInt4720 + local79.top);
			} else {
				Static286.aCanvas4.setLocation(Static7.anInt125, Static287.anInt4720);
			}
		}
		this.method787();
	}

	@OriginalMember(owner = "client!os", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static261.aFrame3 == null) {
			return Static79.aClass183_2 == null || Static79.aClass183_2.anApplet1 == this ? super.getDocumentBase() : Static79.aClass183_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)Z")
	protected final boolean method785() {
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
				this.method789("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	protected abstract void method787();

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method789(@OriginalArg(0) String arg0) {
		if (this.aBoolean86) {
			return;
		}
		this.aBoolean86 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static469.method4194("loggedout", Static79.aClass183_2.anApplet1);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!os", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!os", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!os", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static68.aBoolean354 = false;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public String method790() {
		return null;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
	protected abstract void method791();

	@OriginalMember(owner = "client!os", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static261.aFrame3 == null) {
			return Static79.aClass183_2 == null || Static79.aClass183_2.anApplet1 == this ? super.getParameter(arg0) : Static79.aClass183_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static444.anApplet_Sub1_1 == this && !Static209.aBoolean214) {
			Static116.aLong71 = Static110.method1702();
			Static429.method5376(5000L);
			Static425.aClass183_5 = null;
			this.method780(false);
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
	protected abstract void method792();

	@OriginalMember(owner = "client!os", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static444.anApplet_Sub1_1 == this && !Static209.aBoolean214) {
			Static116.aLong71 = Static110.method1702() + 4000L;
		}
	}

	@OriginalMember(owner = "client!os", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!os", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static444.anApplet_Sub1_1 != this || Static209.aBoolean214) {
			return;
		}
		Static307.aBoolean391 = true;
		if (Static194.aBoolean199 && Static110.method1702() - Static401.aLong198 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static155.anInt2673 && Static324.anInt5540 <= local24.height) {
				Static200.aBoolean205 = true;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
	protected abstract void method793();

	@OriginalMember(owner = "client!os", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static68.aBoolean354 = true;
		Static307.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!os", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!os", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static261.aFrame3 == null) {
			return Static79.aClass183_2 == null || Static79.aClass183_2.anApplet1 == this ? super.getCodeBase() : Static79.aClass183_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static261.aFrame3 == null) {
			return Static79.aClass183_2 == null || Static79.aClass183_2.anApplet1 == this ? super.getAppletContext() : Static79.aClass183_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!os", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static293.aString139 != null) {
					@Pc(6) String local6 = Static293.aString139.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static293.aString140;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method789("wrongjava");
							break label107;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static293.aString140 == null || Static293.aString140.equals("1.4.2"))) {
						this.method789("wrongjava");
						break label107;
					}
				}
				@Pc(66) int local66;
				if (Static293.aString140 != null && Static293.aString140.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (local66 < Static293.aString140.length()) {
						@Pc(74) char local74 = Static293.aString140.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local68 = local68 * 10 + local74 - 48;
						local66++;
					}
					if (local68 >= 5) {
						Static194.aBoolean199 = true;
					}
				}
				if (Static79.aClass183_2.anApplet1 != null) {
					@Pc(107) Method local107 = Static293.aMethod2;
					if (local107 != null) {
						try {
							local107.invoke(Static79.aClass183_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(122) Throwable local122) {
						}
					}
				}
				Static28.method447();
				Static59.method2521();
				this.method782();
				this.method781();
				this.method779();
				Static336.aClass140_1 = Static281.method3750();
				this.method781();
				while (Static116.aLong71 == 0L || Static110.method1702() < Static116.aLong71) {
					Static319.anInt5486 = Static336.aClass140_1.method5400(Static412.anInt6744);
					for (local66 = 0; local66 < Static319.anInt5486; local66++) {
						this.method796();
					}
					this.method783();
					Static269.method3637(Static79.aClass183_2, Static286.aCanvas4);
				}
			}
		} catch (@Pc(178) Throwable local178) {
			Static434.method5460(local178, this.method790());
			this.method789("crash");
		}
		this.method780(true);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V")
	protected final void method795(@OriginalArg(2) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static314.anInt5426 = 768;
			Static324.anInt5540 = 768;
			Static7.anInt125 = 0;
			Static261.anInt2240 = 599;
			Static287.anInt4720 = 0;
			Static444.anApplet_Sub1_1 = this;
			Static141.anInt2513 = 1024;
			Static155.anInt2673 = 1024;
			Static261.aFrame3 = new Frame();
			Static261.aFrame3.setTitle("Jagex");
			Static261.aFrame3.setResizable(true);
			Static261.aFrame3.addWindowListener(this);
			Static261.aFrame3.setVisible(true);
			Static261.aFrame3.toFront();
			@Pc(38) Insets local38 = Static261.aFrame3.getInsets();
			Static261.aFrame3.setSize(local38.left + Static155.anInt2673 + local38.right, local38.bottom + local38.top + Static324.anInt5540);
			Static425.aClass183_5 = Static79.aClass183_2 = new Class183(null, arg0, arg1, 30);
			@Pc(71) Class91 local71 = Static79.aClass183_2.method3904(this, 1);
			while (local71.anInt2446 == 0) {
				Static429.method5376(10L);
			}
		} catch (@Pc(81) Exception local81) {
			Static434.method5460(local81, null);
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
	private void method796() {
		@Pc(12) long local12 = Static110.method1702();
		@Pc(16) long local16 = Static360.aLongArray9[Static141.anInt2514];
		Static360.aLongArray9[Static141.anInt2514] = local12;
		@Pc(33) boolean local33;
		if (local16 == 0L || local16 >= local12) {
			local33 = false;
		} else {
			local33 = true;
		}
		Static141.anInt2514 = Static141.anInt2514 + 1 & 0x1F;
		synchronized (this) {
			Static26.aBoolean45 = Static68.aBoolean354;
		}
		this.method792();
	}
}
