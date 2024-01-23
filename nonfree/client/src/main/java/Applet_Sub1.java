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

@OriginalClass("client!dd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!dd", name = "providesignlink", descriptor = "(Lclient!wa;)V")
	public static void providesignlink(@OriginalArg(0) Class175 arg0) {
		Static253.aClass175_4 = arg0;
		Static203.aClass175_3 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V")
	protected final void method741(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static214.anApplet_Sub1_1 = this;
			Static273.anInt5328 = 0;
			Static148.anInt3206 = 768;
			Static179.anInt3754 = 768;
			Static3.anInt122 = 1024;
			Static82.anInt1780 = 1024;
			Static172.anInt3655 = 541;
			Static98.anInt2312 = 0;
			Static193.aFrame1 = new Frame();
			Static193.aFrame1.setTitle("Jagex");
			Static193.aFrame1.setResizable(true);
			Static193.aFrame1.addWindowListener(this);
			Static193.aFrame1.setVisible(true);
			Static193.aFrame1.toFront();
			@Pc(46) Insets local46 = Static193.aFrame1.getInsets();
			Static193.aFrame1.setSize(local46.right + local46.left + Static82.anInt1780, local46.bottom + local46.top + Static179.anInt3754);
			Static203.aClass175_3 = Static253.aClass175_4 = new Class175(null, arg0, arg1, 29);
			@Pc(78) Class116 local78 = Static253.aClass175_4.method4320(this, 1);
			while (local78.anInt3812 == 0) {
				Static48.method934(10L);
			}
			Static243.aThread2 = (Thread) local78.anObject5;
		} catch (@Pc(95) Exception local95) {
			Static3.method136(null, local95);
		}
	}

	@OriginalMember(owner = "client!dd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	protected abstract void method742();

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	protected abstract void method743();

	@OriginalMember(owner = "client!dd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static214.anApplet_Sub1_1 != this || Static267.aBoolean390) {
			return;
		}
		Static115.aBoolean188 = true;
		if (Static152.aBoolean239 && !Static277.aBoolean412 && Static294.method4413() - Static214.aLong154 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || Static82.anInt1780 <= local27.width && local27.height >= Static179.anInt3754) {
				Static26.aBoolean49 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	protected abstract void method744();

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method745(@OriginalArg(0) String arg0) {
		if (this.aBoolean68) {
			return;
		}
		this.aBoolean68 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static309.method3982(Static253.aClass175_4.anApplet1, "loggedout");
		} catch (@Pc(36) Throwable local36) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!dd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static193.aFrame1 == null) {
			return Static253.aClass175_4 == null || Static253.aClass175_4.anApplet1 == this ? super.getDocumentBase() : Static253.aClass175_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static214.anApplet_Sub1_1 == this && !Static267.aBoolean390) {
			Static279.aLong193 = Static294.method4413() + 4000L;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	protected abstract void method749();

	@OriginalMember(owner = "client!dd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
	protected final void method750(@OriginalArg(3) int arg0) {
		try {
			if (Static214.anApplet_Sub1_1 != null) {
				Static58.anInt994++;
				if (Static58.anInt994 >= 3) {
					this.method745("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static98.anInt2312 = 0;
			Static148.anInt3206 = 503;
			Static179.anInt3754 = 503;
			Static172.anInt3655 = 1541;
			Static3.anInt122 = 765;
			Static82.anInt1780 = 765;
			Static273.anInt5328 = 0;
			Static214.anApplet_Sub1_1 = this;
			@Pc(54) String local54 = this.getParameter("openwinjs");
			if (local54 != null && local54.equals("1")) {
				Static121.aBoolean207 = true;
			} else {
				Static121.aBoolean207 = false;
			}
			if (Static253.aClass175_4 == null) {
				Static203.aClass175_3 = Static253.aClass175_4 = new Class175(this, arg0, null, 0);
			}
			@Pc(88) Class116 local88 = Static253.aClass175_4.method4320(this, 1);
			while (local88.anInt3812 == 0) {
				Static48.method934(10L);
			}
			Static243.aThread2 = (Thread) local88.anObject5;
		} catch (@Pc(107) Exception local107) {
			Static3.method136(null, local107);
			this.method745("crash");
		}
	}

	@OriginalMember(owner = "client!dd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static193.aFrame1 == null) {
			return Static253.aClass175_4 == null || Static253.aClass175_4.anApplet1 == this ? super.getCodeBase() : Static253.aClass175_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static214.anApplet_Sub1_1 == this && !Static267.aBoolean390) {
			Static279.aLong193 = Static294.method4413();
			Static48.method934(5000L);
			Static203.aClass175_3 = null;
			this.method754(false);
		}
	}

	@OriginalMember(owner = "client!dd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static288.aString323 != null) {
				@Pc(12) String local12 = Static288.aString323.toLowerCase();
				if (local12.indexOf("sun") != -1 || local12.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static288.aString326;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method745("wrongjava");
						return;
					}
					Static274.anInt5344 = 5;
				} else if (local12.indexOf("ibm") != -1 && (Static288.aString326 == null || Static288.aString326.equals("1.4.2"))) {
					this.method745("wrongjava");
					return;
				}
			}
			@Pc(79) int local79;
			if (Static288.aString326 != null && Static288.aString326.startsWith("1.")) {
				@Pc(77) int local77 = 0;
				local79 = 2;
				while (local79 < Static288.aString326.length()) {
					@Pc(91) char local91 = Static288.aString326.charAt(local79);
					if (local91 < '0' || local91 > '9') {
						break;
					}
					local79++;
					local77 = local91 + local77 * 10 - 48;
				}
				if (local77 >= 5) {
					Static152.aBoolean239 = true;
				}
			}
			if (Static253.aClass175_4.anApplet1 != null) {
				@Pc(125) Method local125 = Static288.aMethod1;
				if (local125 != null) {
					try {
						local125.invoke(Static253.aClass175_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(141) Throwable local141) {
					}
				}
			}
			Static43.method752();
			this.method758();
			Static72.aClass99_1 = Static202.method3258(Static156.aCanvas2, Static148.anInt3206, Static3.anInt122);
			this.method742();
			Static124.aClass77_1 = Static83.method1455();
			while (Static279.aLong193 == 0L || Static279.aLong193 > Static294.method4413()) {
				Static109.anInt2543 = Static124.aClass77_1.method4028(Static274.anInt5344, Static43.anInt903);
				for (local79 = 0; local79 < Static109.anInt2543; local79++) {
					this.method753();
				}
				this.method756();
				Static199.method3244(Static156.aCanvas2, Static253.aClass175_4);
			}
		} catch (@Pc(201) Exception local201) {
			Static3.method136(null, local201);
			this.method745("crash");
		}
		this.method754(true);
	}

	@OriginalMember(owner = "client!dd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static214.anApplet_Sub1_1 == this && !Static267.aBoolean390) {
			Static279.aLong193 = 0L;
		}
	}

	@OriginalMember(owner = "client!dd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static86.aBoolean136 = true;
		Static115.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!dd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)Z")
	protected final boolean method751() {
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
				this.method745("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	private void method753() {
		@Pc(7) long local7 = Static84.aLongArray2[Static228.anInt4514];
		@Pc(10) long local10 = Static294.method4413();
		if (local7 != 0L && local7 < local10) {
		}
		Static84.aLongArray2[Static228.anInt4514] = local10;
		Static228.anInt4514 = Static228.anInt4514 + 1 & 0x1F;
		synchronized (this) {
			Static59.aBoolean304 = Static86.aBoolean136;
		}
		this.method744();
	}

	@OriginalMember(owner = "client!dd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!dd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static193.aFrame1 == null) {
			return Static253.aClass175_4 == null || Static253.aClass175_4.anApplet1 == this ? super.getAppletContext() : Static253.aClass175_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static193.aFrame1 == null) {
			return Static253.aClass175_4 == null || Static253.aClass175_4.anApplet1 == this ? super.getParameter(arg0) : Static253.aClass175_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZB)V")
	private void method754(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static267.aBoolean390) {
				return;
			}
			Static267.aBoolean390 = true;
		}
		if (Static253.aClass175_4.anApplet1 != null) {
			Static253.aClass175_4.anApplet1.destroy();
		}
		try {
			this.method743();
		} catch (@Pc(35) Exception local35) {
		}
		if (Static156.aCanvas2 != null) {
			try {
				Static156.aCanvas2.removeFocusListener(this);
				Static156.aCanvas2.getParent().remove(Static156.aCanvas2);
			} catch (@Pc(47) Exception local47) {
			}
		}
		if (Static253.aClass175_4 != null) {
			try {
				Static253.aClass175_4.method4337();
			} catch (@Pc(63) Exception local63) {
			}
		}
		this.method755();
		if (Static193.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(72) Throwable local72) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
	protected abstract void method755();

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	private void method756() {
		@Pc(6) long local6 = Static294.method4413();
		@Pc(10) long local10 = Static18.aLongArray1[Static7.anInt2287];
		Static18.aLongArray1[Static7.anInt2287] = local6;
		Static7.anInt2287 = Static7.anInt2287 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(36) int local36 = (int) (local6 - local10);
			Static67.anInt1416 = ((local36 >> 1) + 32000) / local36;
		}
		if (Static137.anInt3007++ > 50) {
			Static115.aBoolean188 = true;
			Static137.anInt3007 -= 50;
			Static156.aCanvas2.setSize(Static3.anInt122, Static148.anInt3206);
			Static156.aCanvas2.setVisible(true);
			if (Static193.aFrame1 != null && Static237.aFrame2 == null) {
				@Pc(75) Insets local75 = Static193.aFrame1.getInsets();
				Static156.aCanvas2.setLocation(Static273.anInt5328 + local75.left, local75.top + Static98.anInt2312);
			} else {
				Static156.aCanvas2.setLocation(Static273.anInt5328, Static98.anInt2312);
			}
		}
		this.method749();
	}

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V")
	public final synchronized void method758() {
		if (Static156.aCanvas2 != null) {
			Static156.aCanvas2.removeFocusListener(this);
			Static156.aCanvas2.getParent().remove(Static156.aCanvas2);
		}
		@Pc(21) Container local21;
		if (Static237.aFrame2 != null) {
			local21 = Static237.aFrame2;
		} else if (Static193.aFrame1 == null) {
			local21 = Static253.aClass175_4.anApplet1;
		} else {
			local21 = Static193.aFrame1;
		}
		local21.setLayout(null);
		Static156.aCanvas2 = new Canvas_Sub2(this);
		local21.add(Static156.aCanvas2);
		Static156.aCanvas2.setSize(Static3.anInt122, Static148.anInt3206);
		Static156.aCanvas2.setVisible(true);
		if (local21 == Static193.aFrame1) {
			@Pc(71) Insets local71 = Static193.aFrame1.getInsets();
			Static156.aCanvas2.setLocation(local71.left + Static273.anInt5328, local71.top + Static98.anInt2312);
		} else {
			Static156.aCanvas2.setLocation(Static273.anInt5328, Static98.anInt2312);
		}
		Static156.aCanvas2.addFocusListener(this);
		Static156.aCanvas2.requestFocus();
		Static59.aBoolean304 = true;
		Static86.aBoolean136 = true;
		Static115.aBoolean188 = true;
		Static26.aBoolean49 = false;
		Static214.aLong154 = Static294.method4413();
	}

	@OriginalMember(owner = "client!dd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static86.aBoolean136 = false;
	}
}
