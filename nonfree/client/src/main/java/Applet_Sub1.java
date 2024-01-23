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

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!od", name = "providesignlink", descriptor = "(Lclient!we;)V")
	public static void providesignlink(@OriginalArg(0) Class184 arg0) {
		Static95.aClass184_3 = arg0;
		Static3.aClass184_1 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!od", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static300.aString197 != null) {
				@Pc(10) String local10 = Static300.aString197.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static300.aString193;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method769("wrongjava");
						return;
					}
					Static175.anInt3550 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static300.aString193 == null || Static300.aString193.equals("1.4.2"))) {
					this.method769("wrongjava");
					return;
				}
			}
			@Pc(74) int local74;
			if (Static300.aString193 != null && Static300.aString193.startsWith("1.")) {
				local74 = 2;
				@Pc(76) int local76 = 0;
				while (Static300.aString193.length() > local74) {
					@Pc(88) char local88 = Static300.aString193.charAt(local74);
					if (local88 < '0' || local88 > '9') {
						break;
					}
					local76 = local88 + local76 * 10 - '0';
					local74++;
				}
				if (local76 >= 5) {
					Static240.aBoolean167 = true;
				}
			}
			if (Static95.aClass184_3.anApplet1 != null) {
				@Pc(120) Method local120 = Static300.aMethod2;
				if (local120 != null) {
					try {
						local120.invoke(Static95.aClass184_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(137) Throwable local137) {
					}
				}
			}
			Static4.method63();
			this.method774();
			Static147.aClass42_1 = Static186.method2979(Static189.anInt5672, Static292.anInt5674, Static139.aCanvas1);
			this.method775();
			Static148.aClass25_1 = Static136.method2196();
			this.method777();
			while (Static168.aLong123 == 0L || Static168.aLong123 > Static61.method1150()) {
				Static132.anInt2633 = Static148.aClass25_1.method4574(Static175.anInt3550, Static233.anInt4654);
				for (local74 = 0; local74 < Static132.anInt2633; local74++) {
					this.method780();
				}
				this.method772();
				Static151.method2392(Static95.aClass184_3, Static139.aCanvas1);
			}
		} catch (@Pc(196) Exception local196) {
			Static204.method3269(local196, null);
			this.method769("crash");
		}
		this.method768(true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	protected final void method767(@OriginalArg(3) int arg0) {
		try {
			if (Static81.anApplet_Sub1_1 != null) {
				Static277.anInt5463++;
				if (Static277.anInt5463 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method769("alreadyloaded");
				return;
			}
			Static292.anInt5674 = 503;
			Static242.anInt4775 = 503;
			Static81.anApplet_Sub1_1 = this;
			Static303.anInt5768 = 0;
			Static189.anInt5672 = 765;
			Static162.anInt3312 = 765;
			Static226.anInt4572 = 1546;
			Static268.anInt5346 = 0;
			@Pc(57) String local57 = this.getParameter("openwinjs");
			if (local57 != null && local57.equals("1")) {
				Static293.aBoolean393 = true;
			} else {
				Static293.aBoolean393 = false;
			}
			if (Static95.aClass184_3 == null) {
				Static3.aClass184_1 = Static95.aClass184_3 = new Class184(this, arg0, null, 0);
			}
			@Pc(90) Class119 local90 = Static95.aClass184_3.method4621(this, 1);
			while (local90.anInt3695 == 0) {
				Static193.method3169(10L);
			}
			Static169.aThread2 = (Thread) local90.anObject4;
		} catch (@Pc(104) Exception local104) {
			Static204.method3269(local104, null);
			this.method769("crash");
		}
	}

	@OriginalMember(owner = "client!od", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	private void method768(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static34.aBoolean395) {
				return;
			}
			Static34.aBoolean395 = true;
		}
		if (Static95.aClass184_3.anApplet1 != null) {
			Static95.aClass184_3.anApplet1.destroy();
		}
		try {
			this.method776();
		} catch (@Pc(36) Exception local36) {
		}
		if (this.aBoolean55) {
			try {
				jagmisc.quit();
			} catch (@Pc(42) Throwable local42) {
			}
			this.aBoolean55 = false;
		}
		Static95.aClass184_3.method4610(Static81.anApplet_Sub1_1.getClass());
		if (Static139.aCanvas1 != null) {
			try {
				Static139.aCanvas1.removeFocusListener(this);
				Static139.aCanvas1.getParent().remove(Static139.aCanvas1);
			} catch (@Pc(66) Exception local66) {
			}
		}
		if (Static95.aClass184_3 != null) {
			try {
				Static95.aClass184_3.method4620();
			} catch (@Pc(74) Exception local74) {
			}
		}
		this.method770();
		if (Static32.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(84) Throwable local84) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!od", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static32.aFrame1 == null) {
			return Static95.aClass184_3 == null || Static95.aClass184_3.anApplet1 == this ? super.getDocumentBase() : Static95.aClass184_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static98.aBoolean113 = true;
		Static159.aBoolean210 = true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method769(@OriginalArg(0) String arg0) {
		if (this.aBoolean56) {
			return;
		}
		this.aBoolean56 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static311.method1064("loggedout", Static95.aClass184_3.anApplet1);
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!od", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static32.aFrame1 == null) {
			return Static95.aClass184_3 == null || Static95.aClass184_3.anApplet1 == this ? super.getAppletContext() : Static95.aClass184_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	protected abstract void method770();

	@OriginalMember(owner = "client!od", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static81.anApplet_Sub1_1 == this && !Static34.aBoolean395) {
			Static168.aLong123 = 0L;
		}
	}

	@OriginalMember(owner = "client!od", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static81.anApplet_Sub1_1 == this && !Static34.aBoolean395) {
			Static168.aLong123 = Static61.method1150();
			Static193.method3169(5000L);
			Static3.aClass184_1 = null;
			this.method768(false);
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	protected abstract void method771();

	@OriginalMember(owner = "client!od", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static32.aFrame1 == null) {
			return Static95.aClass184_3 == null || Static95.aClass184_3.anApplet1 == this ? super.getParameter(arg0) : Static95.aClass184_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	private void method772() {
		@Pc(2) long local2 = Static61.method1150();
		@Pc(10) long local10 = Static188.aLongArray13[Static262.anInt5102];
		Static188.aLongArray13[Static262.anInt5102] = local2;
		Static262.anInt5102 = Static262.anInt5102 + 1 & 0x1F;
		if (local10 != 0L && local10 < local2) {
			@Pc(38) int local38 = (int) (local2 - local10);
			Static278.anInt5386 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static84.anInt1718++ > 50) {
			Static159.aBoolean210 = true;
			Static84.anInt1718 -= 50;
			Static139.aCanvas1.setSize(Static189.anInt5672, Static292.anInt5674);
			Static139.aCanvas1.setVisible(true);
			if (Static32.aFrame1 != null && Static250.aFrame2 == null) {
				@Pc(76) Insets local76 = Static32.aFrame1.getInsets();
				Static139.aCanvas1.setLocation(local76.left + Static268.anInt5346, Static303.anInt5768 + local76.top);
			} else {
				Static139.aCanvas1.setLocation(Static268.anInt5346, Static303.anInt5768);
			}
		}
		this.method771();
	}

	@OriginalMember(owner = "client!od", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static32.aFrame1 == null) {
			return Static95.aClass184_3 == null || Static95.aClass184_3.anApplet1 == this ? super.getCodeBase() : Static95.aClass184_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)Z")
	protected final boolean method773() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
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
				this.method769("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public final synchronized void method774() {
		if (Static139.aCanvas1 != null) {
			Static139.aCanvas1.removeFocusListener(this);
			Static139.aCanvas1.getParent().remove(Static139.aCanvas1);
		}
		@Pc(22) Container local22;
		if (Static250.aFrame2 != null) {
			local22 = Static250.aFrame2;
		} else if (Static32.aFrame1 == null) {
			local22 = Static95.aClass184_3.anApplet1;
		} else {
			local22 = Static32.aFrame1;
		}
		local22.setLayout(null);
		Static139.aCanvas1 = new Canvas_Sub1(this);
		local22.add(Static139.aCanvas1);
		Static139.aCanvas1.setSize(Static189.anInt5672, Static292.anInt5674);
		Static139.aCanvas1.setVisible(true);
		if (Static32.aFrame1 == local22) {
			@Pc(64) Insets local64 = Static32.aFrame1.getInsets();
			Static139.aCanvas1.setLocation(local64.left + Static268.anInt5346, local64.top - -Static303.anInt5768);
		} else {
			Static139.aCanvas1.setLocation(Static268.anInt5346, Static303.anInt5768);
		}
		Static139.aCanvas1.addFocusListener(this);
		Static139.aCanvas1.requestFocus();
		Static132.aBoolean169 = true;
		Static98.aBoolean113 = true;
		Static159.aBoolean210 = true;
		Static66.aBoolean338 = false;
		Static201.aLong144 = Static61.method1150();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	protected abstract void method775();

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	protected abstract void method776();

	@OriginalMember(owner = "client!od", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static81.anApplet_Sub1_1 == this && !Static34.aBoolean395) {
			Static168.aLong123 = Static61.method1150() + 4000L;
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public final void method777() {
		if (this.aBoolean55) {
			return;
		}
		try {
			@Pc(21) Class119 local21 = Static95.aClass184_3.method4619(Static81.anApplet_Sub1_1.getClass());
			while (local21.anInt3695 == 0) {
				Static193.method3169(100L);
			}
			if (local21.anObject4 != null) {
				throw (Throwable) local21.anObject4;
			}
			jagmisc.init();
			this.aBoolean55 = true;
			Static148.aClass25_1 = Static136.method2196();
		} catch (@Pc(48) Throwable local48) {
		}
	}

	@OriginalMember(owner = "client!od", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!od", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static98.aBoolean113 = false;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	protected abstract void method779();

	@OriginalMember(owner = "client!od", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static81.anApplet_Sub1_1 != this || Static34.aBoolean395) {
			return;
		}
		Static159.aBoolean210 = true;
		if (Static240.aBoolean167 && !Static251.aBoolean330 && Static61.method1150() - Static201.aLong144 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static162.anInt3312 <= local30.width && Static242.anInt4775 <= local30.height) {
				Static66.aBoolean338 = true;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!od", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	private void method780() {
		@Pc(6) long local6 = Static61.method1150();
		@Pc(10) long local10 = Static112.aLongArray4[Static139.anInt2757];
		if (local10 != 0L && local6 > local10) {
		}
		Static112.aLongArray4[Static139.anInt2757] = local6;
		Static139.anInt2757 = Static139.anInt2757 + 1 & 0x1F;
		synchronized (this) {
			Static132.aBoolean169 = Static98.aBoolean113;
		}
		this.method779();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZZILjava/lang/String;)V")
	protected final void method781(@OriginalArg(6) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static226.anInt4572 = 546;
			Static81.anApplet_Sub1_1 = this;
			Static292.anInt5674 = 768;
			Static242.anInt4775 = 768;
			Static268.anInt5346 = 0;
			Static303.anInt5768 = 0;
			Static189.anInt5672 = 1024;
			Static162.anInt3312 = 1024;
			Static32.aFrame1 = new Frame();
			Static32.aFrame1.setTitle("Jagex");
			Static32.aFrame1.setResizable(true);
			Static32.aFrame1.addWindowListener(this);
			Static32.aFrame1.setVisible(true);
			Static32.aFrame1.toFront();
			@Pc(42) Insets local42 = Static32.aFrame1.getInsets();
			Static32.aFrame1.setSize(local42.right + Static162.anInt3312 + local42.left, Static242.anInt4775 + local42.top + local42.bottom);
			Static3.aClass184_1 = Static95.aClass184_3 = new Class184(null, arg0, arg1, 29);
			@Pc(74) Class119 local74 = Static95.aClass184_3.method4621(this, 1);
			while (local74.anInt3695 == 0) {
				Static193.method3169(10L);
			}
			Static169.aThread2 = (Thread) local74.anObject4;
		} catch (@Pc(89) Exception local89) {
			Static204.method3269(local89, null);
		}
	}

	@OriginalMember(owner = "client!od", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
