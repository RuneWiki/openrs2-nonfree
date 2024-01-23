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

@OriginalClass("client!l")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!l", name = "j", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!l", name = "providesignlink", descriptor = "(Lclient!uo;)V")
	public static void providesignlink(@OriginalArg(0) Class176 arg0) {
		Static222.aClass176_3 = arg0;
		Static17.aClass176_1 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static295.anApplet_Sub1_1 == this && !Static128.aBoolean222) {
			Static307.aLong212 = Static244.method3859();
			Static16.method242(5000L);
			Static17.aClass176_1 = null;
			this.method752(false);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public final void method751() {
		if (this.aBoolean84) {
			return;
		}
		try {
			@Pc(21) Class153 local21 = Static222.aClass176_3.method4376(Static295.anApplet_Sub1_1.getClass());
			while (local21.anInt4614 == 0) {
				Static16.method242(100L);
			}
			if (local21.anObject6 != null) {
				throw (Throwable) local21.anObject6;
			}
			jagmisc.init();
			this.aBoolean84 = true;
			Static81.aClass34_1 = Static54.method989();
		} catch (@Pc(53) Throwable local53) {
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V")
	private void method752(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static128.aBoolean222) {
				return;
			}
			Static128.aBoolean222 = true;
		}
		if (Static222.aClass176_3.anApplet1 != null) {
			Static222.aClass176_3.anApplet1.destroy();
		}
		try {
			this.method754();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean84) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean84 = false;
		}
		Static222.aClass176_3.method4364(Static295.anApplet_Sub1_1.getClass());
		if (Static229.aCanvas2 != null) {
			try {
				Static229.aCanvas2.removeFocusListener(this);
				Static229.aCanvas2.getParent().remove(Static229.aCanvas2);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (Static222.aClass176_3 != null) {
			try {
				Static222.aClass176_3.method4359();
			} catch (@Pc(76) Exception local76) {
			}
		}
		this.method765();
		if (Static311.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(85) Throwable local85) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static290.aString207 != null) {
				@Pc(11) String local11 = Static290.aString207.toLowerCase();
				if (local11.indexOf("sun") != -1 || local11.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static290.aString204;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method759("wrongjava");
						return;
					}
					Static138.anInt4490 = 5;
				} else if (local11.indexOf("ibm") != -1 && (Static290.aString204 == null || Static290.aString204.equals("1.4.2"))) {
					this.method759("wrongjava");
					return;
				}
			}
			@Pc(76) int local76;
			if (Static290.aString204 != null && Static290.aString204.startsWith("1.")) {
				local76 = 2;
				@Pc(78) int local78 = 0;
				while (Static290.aString204.length() > local76) {
					@Pc(90) char local90 = Static290.aString204.charAt(local76);
					if (local90 < '0' || local90 > '9') {
						break;
					}
					local76++;
					local78 = local90 + local78 * 10 - 48;
				}
				if (local78 >= 5) {
					Static129.aBoolean226 = true;
				}
			}
			if (Static222.aClass176_3.anApplet1 != null) {
				@Pc(120) Method local120 = Static290.aMethod2;
				if (local120 != null) {
					try {
						local120.invoke(Static222.aClass176_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(137) Throwable local137) {
					}
				}
			}
			Static76.method3990();
			this.method766();
			Static82.aClass130_1 = Static268.method4138(Static288.anInt5232, Static229.aCanvas2, Static194.anInt3876);
			this.method758();
			Static81.aClass34_1 = Static54.method989();
			this.method751();
			while (Static307.aLong212 == 0L || Static307.aLong212 > Static244.method3859()) {
				Static37.anInt680 = Static81.aClass34_1.method4655(Static138.anInt4490, Static268.anInt4955);
				for (local76 = 0; local76 < Static37.anInt680; local76++) {
					this.method760();
				}
				this.method763();
				Static102.method1972(Static222.aClass176_3, Static229.aCanvas2);
			}
		} catch (@Pc(198) Exception local198) {
			Static6.method4140(local198, null);
			this.method759("crash");
		}
		this.method752(true);
	}

	@OriginalMember(owner = "client!l", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	protected abstract void method753();

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	protected abstract void method754();

	@OriginalMember(owner = "client!l", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static311.aFrame2 == null) {
			return Static222.aClass176_3 == null || Static222.aClass176_3.anApplet1 == this ? super.getDocumentBase() : Static222.aClass176_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZIILjava/lang/String;I)V")
	protected final void method755(@OriginalArg(6) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static194.anInt3876 = 1024;
			Static187.anInt3577 = 1024;
			Static310.anInt5534 = 0;
			Static295.anApplet_Sub1_1 = this;
			Static31.anInt570 = 548;
			Static24.anInt500 = 0;
			Static288.anInt5232 = 768;
			Static253.anInt4653 = 768;
			Static311.aFrame2 = new Frame();
			Static311.aFrame2.setTitle("Jagex");
			Static311.aFrame2.setResizable(true);
			Static311.aFrame2.addWindowListener(this);
			Static311.aFrame2.setVisible(true);
			Static311.aFrame2.toFront();
			@Pc(41) Insets local41 = Static311.aFrame2.getInsets();
			Static311.aFrame2.setSize(local41.right + Static187.anInt3577 + local41.left, local41.bottom + Static253.anInt4653 - -local41.top);
			Static17.aClass176_1 = Static222.aClass176_3 = new Class176(null, arg1, arg0, 29);
			@Pc(74) Class153 local74 = Static222.aClass176_3.method4373(1, this);
			while (local74.anInt4614 == 0) {
				Static16.method242(10L);
			}
			Static222.aThread1 = (Thread) local74.anObject6;
		} catch (@Pc(91) Exception local91) {
			Static6.method4140(local91, null);
		}
	}

	@OriginalMember(owner = "client!l", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static311.aFrame2 == null) {
			return Static222.aClass176_3 == null || Static222.aClass176_3.anApplet1 == this ? super.getCodeBase() : Static222.aClass176_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!l", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)Z")
	protected final boolean method756() {
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
				this.method759("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static295.anApplet_Sub1_1 == this && !Static128.aBoolean222) {
			Static307.aLong212 = Static244.method3859() + 4000L;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
	protected final void method757(@OriginalArg(4) int arg0) {
		try {
			if (Static295.anApplet_Sub1_1 != null) {
				Static121.anInt2460++;
				if (Static121.anInt2460 < 3) {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
					return;
				}
				this.method759("alreadyloaded");
				return;
			}
			Static295.anApplet_Sub1_1 = this;
			Static31.anInt570 = 1548;
			Static310.anInt5534 = 0;
			Static288.anInt5232 = 503;
			Static253.anInt4653 = 503;
			Static24.anInt500 = 0;
			Static194.anInt3876 = 765;
			Static187.anInt3577 = 765;
			@Pc(56) String local56 = this.getParameter("openwinjs");
			if (local56 != null && local56.equals("1")) {
				Static179.aBoolean301 = true;
			} else {
				Static179.aBoolean301 = false;
			}
			if (Static222.aClass176_3 == null) {
				Static17.aClass176_1 = Static222.aClass176_3 = new Class176(this, arg0, null, 0);
			}
			@Pc(88) Class153 local88 = Static222.aClass176_3.method4373(1, this);
			while (local88.anInt4614 == 0) {
				Static16.method242(10L);
			}
			Static222.aThread1 = (Thread) local88.anObject6;
		} catch (@Pc(105) Exception local105) {
			Static6.method4140(local105, null);
			this.method759("crash");
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	protected abstract void method758();

	@OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static295.anApplet_Sub1_1 != this || Static128.aBoolean222) {
			return;
		}
		Static183.aBoolean309 = true;
		if (Static129.aBoolean226 && !Static71.aBoolean165 && Static244.method3859() - Static195.aLong144 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static187.anInt3577 && local27.height >= Static253.anInt4653) {
				Static300.aBoolean509 = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static295.anApplet_Sub1_1 == this && !Static128.aBoolean222) {
			Static307.aLong212 = 0L;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method759(@OriginalArg(1) String arg0) {
		if (this.aBoolean83) {
			return;
		}
		this.aBoolean83 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static320.method2266("loggedout", Static222.aClass176_3.anApplet1);
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	private void method760() {
		@Pc(8) long local8 = Static244.method3859();
		@Pc(12) long local12 = Static11.aLongArray1[Static117.anInt2405];
		Static11.aLongArray1[Static117.anInt2405] = local8;
		Static117.anInt2405 = Static117.anInt2405 + 1 & 0x1F;
		synchronized (this) {
			Static295.aBoolean500 = Static156.aBoolean272;
		}
		this.method767();
		if (local12 != 0L && local8 > local12) {
		}
	}

	@OriginalMember(owner = "client!l", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static311.aFrame2 == null) {
			return Static222.aClass176_3 == null || Static222.aClass176_3.anApplet1 == this ? super.getAppletContext() : Static222.aClass176_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!l", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static311.aFrame2 == null) {
			return Static222.aClass176_3 == null || Static222.aClass176_3.anApplet1 == this ? super.getParameter(arg0) : Static222.aClass176_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static156.aBoolean272 = false;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	private void method763() {
		@Pc(8) long local8 = Static244.method3859();
		@Pc(12) long local12 = Static269.aLongArray10[Static172.anInt3360];
		Static269.aLongArray10[Static172.anInt3360] = local8;
		if (local12 != 0L && local8 > local12) {
			@Pc(31) int local31 = (int) (local8 - local12);
			Static230.anInt4307 = ((local31 >> 1) + 32000) / local31;
		}
		Static172.anInt3360 = Static172.anInt3360 + 1 & 0x1F;
		if (Static101.anInt2159++ > 50) {
			Static101.anInt2159 -= 50;
			Static183.aBoolean309 = true;
			Static229.aCanvas2.setSize(Static194.anInt3876, Static288.anInt5232);
			Static229.aCanvas2.setVisible(true);
			if (Static311.aFrame2 != null && Static196.aFrame1 == null) {
				@Pc(85) Insets local85 = Static311.aFrame2.getInsets();
				Static229.aCanvas2.setLocation(local85.left + Static310.anInt5534, local85.top - -Static24.anInt500);
			} else {
				Static229.aCanvas2.setLocation(Static310.anInt5534, Static24.anInt500);
			}
		}
		this.method753();
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(B)V")
	protected abstract void method765();

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	public final synchronized void method766() {
		if (Static229.aCanvas2 != null) {
			Static229.aCanvas2.removeFocusListener(this);
			Static229.aCanvas2.getParent().remove(Static229.aCanvas2);
		}
		@Pc(20) Container local20;
		if (Static196.aFrame1 != null) {
			local20 = Static196.aFrame1;
		} else if (Static311.aFrame2 == null) {
			local20 = Static222.aClass176_3.anApplet1;
		} else {
			local20 = Static311.aFrame2;
		}
		local20.setLayout(null);
		Static229.aCanvas2 = new Canvas_Sub1(this);
		local20.add(Static229.aCanvas2);
		Static229.aCanvas2.setSize(Static194.anInt3876, Static288.anInt5232);
		Static229.aCanvas2.setVisible(true);
		if (local20 == Static311.aFrame2) {
			@Pc(57) Insets local57 = Static311.aFrame2.getInsets();
			Static229.aCanvas2.setLocation(local57.left + Static310.anInt5534, local57.top + Static24.anInt500);
		} else {
			Static229.aCanvas2.setLocation(Static310.anInt5534, Static24.anInt500);
		}
		Static229.aCanvas2.addFocusListener(this);
		Static229.aCanvas2.requestFocus();
		Static156.aBoolean272 = true;
		Static183.aBoolean309 = true;
		Static300.aBoolean509 = false;
		Static295.aBoolean500 = true;
		Static195.aLong144 = Static244.method3859();
	}

	@OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static156.aBoolean272 = true;
		Static183.aBoolean309 = true;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	protected abstract void method767();

	@OriginalMember(owner = "client!l", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
