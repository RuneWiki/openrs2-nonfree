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

@OriginalClass("client!hh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!hh", name = "providesignlink", descriptor = "(Lclient!na;)V")
	public static void providesignlink(@OriginalArg(0) Class112 arg0) {
		Static142.aClass112_2 = arg0;
		Static36.aClass112_1 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIBII)V")
	protected final void method715(@OriginalArg(0) int arg0) {
		try {
			if (Static82.anApplet_Sub1_1 != null) {
				Static131.anInt3045++;
				if (Static131.anInt3045 >= 3) {
					this.method717("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static82.anApplet_Sub1_1 = this;
			Static146.anInt4438 = 0;
			Static8.anInt227 = 1551;
			Static270.anInt5412 = 503;
			Static7.anInt207 = 503;
			Static38.anInt950 = 765;
			Static163.anInt3557 = 765;
			Static69.anInt1438 = 0;
			@Pc(55) String local55 = this.getParameter("openwinjs");
			if (local55 != null && local55.equals("1")) {
				Static24.aBoolean35 = true;
			} else {
				Static24.aBoolean35 = false;
			}
			if (Static142.aClass112_2 == null) {
				Static36.aClass112_1 = Static142.aClass112_2 = new Class112(this, arg0, null, 0);
			}
			@Pc(86) Class47 local86 = Static142.aClass112_2.method2879(1, this);
			while (local86.anInt1417 == 0) {
				Static312.method4734(10L);
			}
			Static147.aThread2 = (Thread) local86.anObject2;
		} catch (@Pc(101) Exception local101) {
			Static66.method3525(local101, null);
			this.method717("crash");
		}
	}

	@OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static179.aString256 != null) {
				@Pc(10) String local10 = Static179.aString256.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static179.aString255;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method717("wrongjava");
						return;
					}
					Static182.anInt4017 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static179.aString255 == null || Static179.aString255.equals("1.4.2"))) {
					this.method717("wrongjava");
					return;
				}
			}
			@Pc(73) int local73;
			if (Static179.aString255 != null && Static179.aString255.startsWith("1.")) {
				local73 = 2;
				@Pc(75) int local75 = 0;
				while (local73 < Static179.aString255.length()) {
					@Pc(87) char local87 = Static179.aString255.charAt(local73);
					if (local87 < '0' || local87 > '9') {
						break;
					}
					local75 = local87 + local75 * 10 - 48;
					local73++;
				}
				if (local75 >= 5) {
					Static297.aBoolean384 = true;
				}
			}
			if (Static142.aClass112_2.anApplet1 != null) {
				@Pc(124) Method local124 = Static179.aMethod2;
				if (local124 != null) {
					try {
						local124.invoke(Static142.aClass112_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(140) Throwable local140) {
					}
				}
			}
			Static292.method4471();
			this.method723();
			Static293.aClass3_1 = Static87.method1509(Static38.anInt950, Static270.anInt5412, Static108.aCanvas1);
			this.method725();
			Static211.aClass14_1 = Static166.method2721();
			this.method727();
			while (Static261.aLong202 == 0L || Static261.aLong202 > Static258.method3967()) {
				Static167.anInt3760 = Static211.aClass14_1.method3259(Static66.anInt4746, Static182.anInt4017);
				for (local73 = 0; local73 < Static167.anInt3760; local73++) {
					this.method733();
				}
				this.method719();
				Static316.method4774(Static142.aClass112_2, Static108.aCanvas1);
			}
		} catch (@Pc(201) Exception local201) {
			Static66.method3525(local201, null);
			this.method717("crash");
		}
		this.method734(true);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	protected abstract void method716();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method717(@OriginalArg(0) String arg0) {
		if (this.aBoolean60) {
			return;
		}
		this.aBoolean60 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static317.method295(Static142.aClass112_2.anApplet1, "loggedout");
		} catch (@Pc(36) Throwable local36) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static280.aFrame2 == null) {
			return Static142.aClass112_2 == null || Static142.aClass112_2.anApplet1 == this ? super.getDocumentBase() : Static142.aClass112_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	private void method719() {
		@Pc(6) long local6 = Static258.method3967();
		@Pc(10) long local10 = Static44.aLongArray3[Static205.anInt4444];
		Static44.aLongArray3[Static205.anInt4444] = local6;
		Static205.anInt4444 = Static205.anInt4444 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static25.anInt692 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static169.anInt3803++ > 50) {
			Static283.aBoolean358 = true;
			Static169.anInt3803 -= 50;
			Static108.aCanvas1.setSize(Static38.anInt950, Static270.anInt5412);
			Static108.aCanvas1.setVisible(true);
			if (Static280.aFrame2 != null && Static229.aFrame1 == null) {
				@Pc(83) Insets local83 = Static280.aFrame2.getInsets();
				Static108.aCanvas1.setLocation(Static69.anInt1438 + local83.left, Static146.anInt4438 + local83.top);
			} else {
				Static108.aCanvas1.setLocation(Static69.anInt1438, Static146.anInt4438);
			}
		}
		this.method735();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	protected abstract void method720();

	@OriginalMember(owner = "client!hh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static280.aFrame2 == null) {
			return Static142.aClass112_2 == null || Static142.aClass112_2.anApplet1 == this ? super.getAppletContext() : Static142.aClass112_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	protected abstract void method721();

	@OriginalMember(owner = "client!hh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static82.anApplet_Sub1_1 == this && !Static186.aBoolean258) {
			Static261.aLong202 = Static258.method3967() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public final synchronized void method723() {
		if (Static108.aCanvas1 != null) {
			Static108.aCanvas1.removeFocusListener(this);
			Static108.aCanvas1.getParent().remove(Static108.aCanvas1);
		}
		@Pc(20) Container local20;
		if (Static229.aFrame1 != null) {
			local20 = Static229.aFrame1;
		} else if (Static280.aFrame2 == null) {
			local20 = Static142.aClass112_2.anApplet1;
		} else {
			local20 = Static280.aFrame2;
		}
		local20.setLayout(null);
		Static108.aCanvas1 = new Canvas_Sub2(this);
		local20.add(Static108.aCanvas1);
		Static108.aCanvas1.setSize(Static38.anInt950, Static270.anInt5412);
		Static108.aCanvas1.setVisible(true);
		if (Static280.aFrame2 == local20) {
			@Pc(61) Insets local61 = Static280.aFrame2.getInsets();
			Static108.aCanvas1.setLocation(local61.left + Static69.anInt1438, local61.top + Static146.anInt4438);
		} else {
			Static108.aCanvas1.setLocation(Static69.anInt1438, Static146.anInt4438);
		}
		Static108.aCanvas1.addFocusListener(this);
		Static108.aCanvas1.requestFocus();
		Static205.aBoolean279 = true;
		Static283.aBoolean358 = true;
		Static135.aBoolean191 = true;
		Static272.aBoolean337 = false;
		Static316.aLong248 = Static258.method3967();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
	protected final boolean method724() {
		@Pc(6) String local6 = this.getDocumentBase().getHost().toLowerCase();
		if (local6.equals("jagex.com") || local6.endsWith(".jagex.com")) {
			return true;
		} else if (local6.equals("runescape.com") || local6.endsWith(".runescape.com")) {
			return true;
		} else if (local6.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local6.length() > 0 && local6.charAt(local6.length() - 1) >= '0' && local6.charAt(local6.length() - 1) <= '9') {
				local6 = local6.substring(0, local6.length() - 1);
			}
			if (local6.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method717("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	protected abstract void method725();

	@OriginalMember(owner = "client!hh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static82.anApplet_Sub1_1 != this || Static186.aBoolean258) {
			return;
		}
		Static283.aBoolean358 = true;
		if (Static297.aBoolean384 && !Static294.aBoolean367 && Static258.method3967() - Static316.aLong248 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || local25.width >= Static163.anInt3557 && local25.height >= Static7.anInt207) {
				Static272.aBoolean337 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public final void method727() {
		if (this.aBoolean59) {
			return;
		}
		try {
			@Pc(14) Class47 local14 = Static142.aClass112_2.method2892(Static82.anApplet_Sub1_1.getClass());
			while (local14.anInt1417 == 0) {
				Static312.method4734(100L);
			}
			if (local14.anObject2 != null) {
				throw (Throwable) local14.anObject2;
			}
			jagmisc.init();
			this.aBoolean59 = true;
			Static211.aClass14_1 = Static166.method2721();
		} catch (@Pc(41) Throwable local41) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static82.anApplet_Sub1_1 == this && !Static186.aBoolean258) {
			Static261.aLong202 = 0L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static82.anApplet_Sub1_1 == this && !Static186.aBoolean258) {
			Static261.aLong202 = Static258.method3967();
			Static312.method4734(5000L);
			Static36.aClass112_1 = null;
			this.method734(false);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZILjava/lang/String;IIII)V")
	protected final void method730(@OriginalArg(3) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static8.anInt227 = 551;
			Static270.anInt5412 = 768;
			Static7.anInt207 = 768;
			Static146.anInt4438 = 0;
			Static69.anInt1438 = 0;
			Static38.anInt950 = 1024;
			Static163.anInt3557 = 1024;
			Static82.anApplet_Sub1_1 = this;
			Static280.aFrame2 = new Frame();
			Static280.aFrame2.setTitle("Jagex");
			Static280.aFrame2.setResizable(true);
			Static280.aFrame2.addWindowListener(this);
			Static280.aFrame2.setVisible(true);
			Static280.aFrame2.toFront();
			@Pc(38) Insets local38 = Static280.aFrame2.getInsets();
			Static280.aFrame2.setSize(Static163.anInt3557 + local38.left + local38.right, local38.bottom + local38.top + Static7.anInt207);
			Static36.aClass112_1 = Static142.aClass112_2 = new Class112(null, arg1, arg0, 29);
			@Pc(71) Class47 local71 = Static142.aClass112_2.method2879(1, this);
			while (local71.anInt1417 == 0) {
				Static312.method4734(10L);
			}
			Static147.aThread2 = (Thread) local71.anObject2;
		} catch (@Pc(86) Exception local86) {
			Static66.method3525(local86, null);
		}
	}

	@OriginalMember(owner = "client!hh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static280.aFrame2 == null) {
			return Static142.aClass112_2 == null || Static142.aClass112_2.anApplet1 == this ? super.getCodeBase() : Static142.aClass112_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static205.aBoolean279 = true;
		Static283.aBoolean358 = true;
	}

	@OriginalMember(owner = "client!hh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
	private void method733() {
		@Pc(11) long local11 = Static219.aLongArray8[Static63.anInt1368];
		@Pc(16) long local16 = Static258.method3967();
		if (local11 != 0L && local16 <= local11) {
		}
		Static219.aLongArray8[Static63.anInt1368] = local16;
		Static63.anInt1368 = Static63.anInt1368 + 1 & 0x1F;
		synchronized (this) {
			Static135.aBoolean191 = Static205.aBoolean279;
		}
		this.method716();
	}

	@OriginalMember(owner = "client!hh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static280.aFrame2 == null) {
			return Static142.aClass112_2 == null || Static142.aClass112_2.anApplet1 == this ? super.getParameter(arg0) : Static142.aClass112_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static205.aBoolean279 = false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	private void method734(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static186.aBoolean258) {
				return;
			}
			Static186.aBoolean258 = true;
		}
		if (Static142.aClass112_2.anApplet1 != null) {
			Static142.aClass112_2.anApplet1.destroy();
		}
		try {
			this.method720();
		} catch (@Pc(36) Exception local36) {
		}
		if (this.aBoolean59) {
			try {
				jagmisc.quit();
			} catch (@Pc(43) Throwable local43) {
			}
			this.aBoolean59 = false;
		}
		Static142.aClass112_2.method2900(Static82.anApplet_Sub1_1.getClass());
		if (Static108.aCanvas1 != null) {
			try {
				Static108.aCanvas1.removeFocusListener(this);
				Static108.aCanvas1.getParent().remove(Static108.aCanvas1);
			} catch (@Pc(63) Exception local63) {
			}
		}
		if (Static142.aClass112_2 != null) {
			try {
				Static142.aClass112_2.method2895();
			} catch (@Pc(74) Exception local74) {
			}
		}
		this.method721();
		if (Static280.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(85) Throwable local85) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)V")
	protected abstract void method735();
}
