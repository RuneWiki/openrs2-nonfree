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

@OriginalClass("client!qj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!qj", name = "J", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!qj", name = "providesignlink", descriptor = "(Lclient!nf;)V")
	public static void providesignlink(@OriginalArg(0) Class117 arg0) {
		Static117.aClass117_3 = arg0;
		Static298.aClass117_4 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static181.aString118 != null) {
				@Pc(11) String local11 = Static181.aString118.toLowerCase();
				if (local11.indexOf("sun") != -1 || local11.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static181.aString116;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method623("wrongjava");
						return;
					}
					Static220.anInt5825 = 5;
				} else if (local11.indexOf("ibm") != -1 && (Static181.aString116 == null || Static181.aString116.equals("1.4.2"))) {
					this.method623("wrongjava");
					return;
				}
			}
			@Pc(74) int local74;
			if (Static181.aString116 != null && Static181.aString116.startsWith("1.")) {
				local74 = 2;
				@Pc(76) int local76 = 0;
				while (Static181.aString116.length() > local74) {
					@Pc(84) char local84 = Static181.aString116.charAt(local74);
					if (local84 < '0' || local84 > '9') {
						break;
					}
					local74++;
					local76 = local84 + local76 * 10 - 48;
				}
				if (local76 >= 5) {
					Static301.aBoolean418 = true;
				}
			}
			if (Static117.aClass117_3.anApplet1 != null) {
				@Pc(116) Method local116 = Static181.aMethod1;
				if (local116 != null) {
					try {
						local116.invoke(Static117.aClass117_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(132) Throwable local132) {
					}
				}
			}
			Static93.method1377();
			this.method632();
			Static242.aClass62_1 = Static207.method3283(Static159.anInt3348, Static136.anInt2696, Static304.aCanvas1);
			this.method634();
			Static109.aClass37_1 = Static269.method420();
			this.method627();
			while (Static120.aLong85 == 0L || Static120.aLong85 > Static135.method2186()) {
				Static82.anInt1505 = Static109.aClass37_1.method2935(Static220.anInt5825, Static262.anInt2348);
				for (local74 = 0; local74 < Static82.anInt1505; local74++) {
					this.method637();
				}
				this.method631();
				Static68.method1139(Static117.aClass117_3, Static304.aCanvas1);
			}
		} catch (@Pc(189) Exception local189) {
			Static195.method3178(null, local189);
			this.method623("crash");
		}
		this.method628(true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	protected abstract void method622();

	@OriginalMember(owner = "client!qj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static220.anApplet_Sub1_41 == this && !Static247.aBoolean350) {
			Static120.aLong85 = 0L;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method623(@OriginalArg(0) String arg0) {
		if (this.aBoolean53) {
			return;
		}
		this.aBoolean53 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static324.method4224("loggedout", Static117.aClass117_3.anApplet1);
		} catch (@Pc(29) Throwable local29) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static53.aBoolean80 = false;
	}

	@OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static78.aFrame2 == null) {
			return Static117.aClass117_3 == null || Static117.aClass117_3.anApplet1 == this ? super.getParameter(arg0) : Static117.aClass117_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static220.anApplet_Sub1_41 != this || Static247.aBoolean350) {
			return;
		}
		Static311.aBoolean426 = true;
		if (Static301.aBoolean418 && !Static291.aBoolean404 && Static135.method2186() - Static282.aLong201 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static21.anInt417 && Static302.anInt5720 <= local30.height) {
				Static85.aBoolean122 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static220.anApplet_Sub1_41 == this && !Static247.aBoolean350) {
			Static120.aLong85 = Static135.method2186() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static220.anApplet_Sub1_41 == this && !Static247.aBoolean350) {
			Static120.aLong85 = Static135.method2186();
			Static202.method3246(5000L);
			Static298.aClass117_4 = null;
			this.method628(false);
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static78.aFrame2 == null) {
			return Static117.aClass117_3 == null || Static117.aClass117_3.anApplet1 == this ? super.getAppletContext() : Static117.aClass117_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static78.aFrame2 == null) {
			return Static117.aClass117_3 == null || Static117.aClass117_3.anApplet1 == this ? super.getDocumentBase() : Static117.aClass117_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	protected abstract void method626();

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	public final void method627() {
		if (this.aBoolean54) {
			return;
		}
		try {
			@Pc(22) Class10 local22 = Static117.aClass117_3.method3008(Static220.anApplet_Sub1_41.getClass());
			while (local22.anInt151 == 0) {
				Static202.method3246(100L);
			}
			if (local22.anObject1 != null) {
				throw (Throwable) local22.anObject1;
			}
			jagmisc.init();
			this.aBoolean54 = true;
			Static109.aClass37_1 = Static269.method420();
		} catch (@Pc(50) Throwable local50) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	private void method628(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static247.aBoolean350) {
				return;
			}
			Static247.aBoolean350 = true;
		}
		if (Static117.aClass117_3.anApplet1 != null) {
			Static117.aClass117_3.anApplet1.destroy();
		}
		try {
			this.method626();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean54) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean54 = false;
		}
		Static117.aClass117_3.method3004(Static220.anApplet_Sub1_41.getClass());
		if (Static304.aCanvas1 != null) {
			try {
				Static304.aCanvas1.removeFocusListener(this);
				Static304.aCanvas1.getParent().remove(Static304.aCanvas1);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static117.aClass117_3 != null) {
			try {
				Static117.aClass117_3.method2991();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method630();
		if (Static78.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Z")
	protected final boolean method629() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
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
				this.method623("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
	protected abstract void method630();

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
	private void method631() {
		@Pc(6) long local6 = Static135.method2186();
		@Pc(15) long local15 = Static216.aLongArray90[Static295.anInt5583];
		Static216.aLongArray90[Static295.anInt5583] = local6;
		Static295.anInt5583 = Static295.anInt5583 + 1 & 0x1F;
		if (local15 != 0L && local6 > local15) {
			@Pc(46) int local46 = (int) (local6 - local15);
			Static136.anInt2698 = ((local46 >> 1) + 32000) / local46;
		}
		if (Static88.anInt1614++ > 50) {
			Static311.aBoolean426 = true;
			Static88.anInt1614 -= 50;
			Static304.aCanvas1.setSize(Static159.anInt3348, Static136.anInt2696);
			Static304.aCanvas1.setVisible(true);
			if (Static78.aFrame2 != null && Static75.aFrame1 == null) {
				@Pc(83) Insets local83 = Static78.aFrame2.getInsets();
				Static304.aCanvas1.setLocation(Static109.anInt2179 + local83.left, Static60.anInt1203 + local83.top);
			} else {
				Static304.aCanvas1.setLocation(Static109.anInt2179, Static60.anInt1203);
			}
		}
		this.method622();
	}

	@OriginalMember(owner = "client!qj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static53.aBoolean80 = true;
		Static311.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!qj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
	public final synchronized void method632() {
		if (Static304.aCanvas1 != null) {
			Static304.aCanvas1.removeFocusListener(this);
			Static304.aCanvas1.getParent().remove(Static304.aCanvas1);
		}
		@Pc(26) Container local26;
		if (Static75.aFrame1 != null) {
			local26 = Static75.aFrame1;
		} else if (Static78.aFrame2 == null) {
			local26 = Static117.aClass117_3.anApplet1;
		} else {
			local26 = Static78.aFrame2;
		}
		local26.setLayout(null);
		Static304.aCanvas1 = new Canvas_Sub2(this);
		local26.add(Static304.aCanvas1);
		Static304.aCanvas1.setSize(Static159.anInt3348, Static136.anInt2696);
		Static304.aCanvas1.setVisible(true);
		if (Static78.aFrame2 == local26) {
			@Pc(69) Insets local69 = Static78.aFrame2.getInsets();
			Static304.aCanvas1.setLocation(local69.left + Static109.anInt2179, local69.top + Static60.anInt1203);
		} else {
			Static304.aCanvas1.setLocation(Static109.anInt2179, Static60.anInt1203);
		}
		Static304.aCanvas1.addFocusListener(this);
		Static304.aCanvas1.requestFocus();
		Static53.aBoolean80 = true;
		Static162.aBoolean235 = true;
		Static311.aBoolean426 = true;
		Static85.aBoolean122 = false;
		Static282.aLong201 = Static135.method2186();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZLjava/lang/String;BIIII)V")
	protected final void method633(@OriginalArg(2) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static220.anApplet_Sub1_41 = this;
			Static60.anInt1203 = 0;
			Static159.anInt3348 = 1024;
			Static21.anInt417 = 1024;
			Static136.anInt2696 = 768;
			Static302.anInt5720 = 768;
			Static53.anInt1015 = 552;
			Static109.anInt2179 = 0;
			Static78.aFrame2 = new Frame();
			Static78.aFrame2.setTitle("Jagex");
			Static78.aFrame2.setResizable(true);
			Static78.aFrame2.addWindowListener(this);
			Static78.aFrame2.setVisible(true);
			Static78.aFrame2.toFront();
			@Pc(38) Insets local38 = Static78.aFrame2.getInsets();
			Static78.aFrame2.setSize(local38.right + Static21.anInt417 + local38.left, local38.bottom + (Static302.anInt5720 - -local38.top));
			Static298.aClass117_4 = Static117.aClass117_3 = new Class117(null, arg1, arg0, 29);
			@Pc(77) Class10 local77 = Static117.aClass117_3.method3000(1, this);
			while (local77.anInt151 == 0) {
				Static202.method3246(10L);
			}
			Static51.aThread2 = (Thread) local77.anObject1;
		} catch (@Pc(94) Exception local94) {
			Static195.method3178(null, local94);
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
	protected abstract void method634();

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIBI)V")
	protected final void method635(@OriginalArg(1) int arg0) {
		try {
			if (Static220.anApplet_Sub1_41 != null) {
				Static199.anInt4005++;
				if (Static199.anInt4005 >= 3) {
					this.method623("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static220.anApplet_Sub1_41 = this;
			Static136.anInt2696 = 503;
			Static302.anInt5720 = 503;
			Static60.anInt1203 = 0;
			Static109.anInt2179 = 0;
			Static159.anInt3348 = 765;
			Static21.anInt417 = 765;
			Static53.anInt1015 = 1552;
			@Pc(48) String local48 = this.getParameter("openwinjs");
			if (local48 != null && local48.equals("1")) {
				Static295.aBoolean416 = true;
			} else {
				Static295.aBoolean416 = false;
			}
			if (Static117.aClass117_3 == null) {
				Static298.aClass117_4 = Static117.aClass117_3 = new Class117(this, arg0, null, 0);
			}
			@Pc(81) Class10 local81 = Static117.aClass117_3.method3000(1, this);
			while (local81.anInt151 == 0) {
				Static202.method3246(10L);
			}
			Static51.aThread2 = (Thread) local81.anObject1;
		} catch (@Pc(95) Exception local95) {
			Static195.method3178(null, local95);
			this.method623("crash");
		}
	}

	@OriginalMember(owner = "client!qj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static78.aFrame2 == null) {
			return Static117.aClass117_3 == null || Static117.aClass117_3.anApplet1 == this ? super.getCodeBase() : Static117.aClass117_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
	protected abstract void method636();

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V")
	private void method637() {
		@Pc(8) long local8 = Static135.method2186();
		@Pc(16) long local16 = Static115.aLongArray48[Static29.anInt542];
		if (local16 != 0L && local16 < local8) {
		}
		Static115.aLongArray48[Static29.anInt542] = local8;
		Static29.anInt542 = Static29.anInt542 + 1 & 0x1F;
		synchronized (this) {
			Static162.aBoolean235 = Static53.aBoolean80;
		}
		this.method636();
	}
}
