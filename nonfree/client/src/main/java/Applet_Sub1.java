import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
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

@OriginalClass("client!bh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static138.aFrame1 == null) {
			return Static76.aClass66_2 == null || Static76.aClass66_2.anApplet1 == this ? super.getDocumentBase() : Static76.aClass66_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static138.aFrame1 == null) {
			return Static76.aClass66_2 == null || Static76.aClass66_2.anApplet1 == this ? super.getAppletContext() : Static76.aClass66_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method610(@OriginalArg(0) String arg0) {
		if (this.aBoolean35) {
			return;
		}
		this.aBoolean35 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!bh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static78.anApplet_Sub1_1 == this && !Static10.aBoolean15) {
			Static79.aLong72 = 0L;
		}
	}

	@OriginalMember(owner = "client!bh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIIII)V")
	protected final void method612(@OriginalArg(1) int arg0) {
		try {
			if (Static78.anApplet_Sub1_1 == null) {
				Static78.anApplet_Sub1_1 = this;
				Static80.anInt2060 = 765;
				Static148.anInt3352 = 480;
				Static110.anInt2688 = 503;
				if (Static76.aClass66_2 == null) {
					Static99.aClass66_3 = Static76.aClass66_2 = new Class66(false, this, arg0, null, 0);
				}
				Static76.aClass66_2.method2127(this, 1);
			} else {
				Static97.anInt2450++;
				if (Static97.anInt2450 >= 3) {
					this.method610("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(62) Exception local62) {
			Static178.method2785(null, local62);
			this.method610("crash");
		}
	}

	@OriginalMember(owner = "client!bh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static78.anApplet_Sub1_1 == this && !Static10.aBoolean15) {
			Static79.aLong72 = Static177.method2758();
			Static176.method2744(5000L);
			Static99.aClass66_3 = null;
			this.method617();
		}
	}

	@OriginalMember(owner = "client!bh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static78.anApplet_Sub1_1 != this || Static10.aBoolean15) {
			return;
		}
		Static116.aBoolean128 = true;
		if (Static134.aString5 != null && Static134.aString5.startsWith("1.5") && Static177.method2758() - Static72.aLong64 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static80.anInt2060 <= local30.width && local30.height >= Static110.anInt2688) {
				Static24.aBoolean23 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static59.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!bh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	protected abstract void method613();

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	protected abstract void method614();

	@OriginalMember(owner = "client!bh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static138.aFrame1 == null) {
			return Static76.aClass66_2 == null || Static76.aClass66_2.anApplet1 == this ? super.getCodeBase() : Static76.aClass66_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static134.aString4 != null) {
				@Pc(10) String local10 = Static134.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static134.aString5;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method610("wrongjava");
						return;
					}
					Static181.anInt4071 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static134.aString5 == null || Static134.aString5.equals("1.4.2"))) {
					this.method610("wrongjava");
					return;
				}
			}
			if (Static76.aClass66_2.anApplet1 != null) {
				@Pc(67) Method local67 = Static134.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static76.aClass66_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method623();
			Static62.aClass8_1 = Static49.method925(Static110.anInt2688, Static49.aCanvas1, Static80.anInt2060);
			this.method626();
			Static33.aClass1_1 = Static82.method1473();
			while (Static79.aLong72 == 0L || Static79.aLong72 > Static177.method2758()) {
				Static21.anInt736 = Static33.aClass1_1.method2040(Static181.anInt4071, Static89.anInt2276);
				for (@Pc(108) int local108 = 0; local108 < Static21.anInt736; local108++) {
					this.method624();
				}
				this.method620();
				Static124.method2023(Static49.aCanvas1, Static76.aClass66_2);
			}
		} catch (@Pc(141) Exception local141) {
			Static178.method2785(null, local141);
			this.method610("crash");
		}
		this.method617();
	}

	@OriginalMember(owner = "client!bh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)Z")
	protected final boolean method616() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
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
				this.method610("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	private synchronized void method617() {
		if (Static10.aBoolean15) {
			return;
		}
		Static10.aBoolean15 = true;
		try {
			Static49.aCanvas1.removeFocusListener(this);
		} catch (@Pc(21) Exception local21) {
		}
		try {
			this.method625();
		} catch (@Pc(26) Exception local26) {
		}
		if (Static138.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		if (Static76.aClass66_2 != null) {
			try {
				Static76.aClass66_2.method2124();
			} catch (@Pc(40) Exception local40) {
			}
		}
		this.method613();
	}

	@OriginalMember(owner = "client!bh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static59.aBoolean79 = true;
		Static116.aBoolean128 = true;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
	private void method620() {
		@Pc(6) long local6 = Static177.method2758();
		@Pc(10) long local10 = Static92.aLongArray8[Static9.anInt472];
		Static92.aLongArray8[Static9.anInt472] = local6;
		Static9.anInt472 = Static9.anInt472 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(46) int local46 = (int) (local6 - local10);
			Static80.anInt2059 = ((local46 >> 1) + 32000) / local46;
		}
		if (Static153.anInt3436++ > 50) {
			Static116.aBoolean128 = true;
			Static153.anInt3436 -= 50;
			Static49.aCanvas1.setSize(Static80.anInt2060, Static110.anInt2688);
			Static49.aCanvas1.setVisible(true);
			if (Static138.aFrame1 == null) {
				Static49.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(87) Insets local87 = Static138.aFrame1.getInsets();
				Static49.aCanvas1.setLocation(local87.left, local87.top);
			}
		}
		this.method614();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;IIIBII)V")
	protected final void method622(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static80.anInt2060 = 765;
			Static78.anApplet_Sub1_1 = this;
			Static110.anInt2688 = 503;
			Static148.anInt3352 = 480;
			Static138.aFrame1 = new Frame();
			Static138.aFrame1.setTitle("Jagex");
			Static138.aFrame1.setResizable(false);
			Static138.aFrame1.addWindowListener(this);
			Static138.aFrame1.setVisible(true);
			Static138.aFrame1.toFront();
			@Pc(33) Insets local33 = Static138.aFrame1.getInsets();
			Static138.aFrame1.setSize(local33.left + local33.right + 765, local33.bottom + local33.top + 503);
			Static99.aClass66_3 = Static76.aClass66_2 = new Class66(true, null, arg1, arg0, 16);
			Static76.aClass66_2.method2127(this, 1);
		} catch (@Pc(68) Exception local68) {
			Static178.method2785(null, local68);
		}
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
	protected final synchronized void method623() {
		@Pc(14) Container local14;
		if (Static138.aFrame1 == null) {
			local14 = Static76.aClass66_2.anApplet1;
		} else {
			local14 = Static138.aFrame1;
		}
		if (Static49.aCanvas1 != null) {
			Static49.aCanvas1.removeFocusListener(this);
			local14.remove(Static49.aCanvas1);
		}
		Static49.aCanvas1 = new Canvas_Sub1(this);
		local14.add(Static49.aCanvas1);
		Static49.aCanvas1.setSize(Static80.anInt2060, Static110.anInt2688);
		Static49.aCanvas1.setVisible(true);
		if (Static138.aFrame1 == null) {
			Static49.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static138.aFrame1.getInsets();
			Static49.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static49.aCanvas1.addFocusListener(this);
		Static49.aCanvas1.requestFocus();
		Static116.aBoolean128 = true;
		Static24.aBoolean23 = false;
		Static72.aLong64 = Static177.method2758();
	}

	@OriginalMember(owner = "client!bh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	private void method624() {
		@Pc(2) long local2 = Static177.method2758();
		@Pc(10) long local10 = Static75.aLongArray6[Static116.anInt2825];
		Static75.aLongArray6[Static116.anInt2825] = local2;
		Static116.anInt2825 = Static116.anInt2825 + 1 & 0x1F;
		synchronized (this) {
			Static131.aBoolean138 = Static59.aBoolean79;
		}
		@Pc(52) boolean local52;
		if (local10 == 0L || local10 >= local2) {
			local52 = false;
		} else {
			local52 = true;
		}
		this.method627();
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
	protected abstract void method625();

	@OriginalMember(owner = "client!bh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
	protected abstract void method626();

	@OriginalMember(owner = "client!bh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static78.anApplet_Sub1_1 == this && !Static10.aBoolean15) {
			Static79.aLong72 = Static177.method2758() + 4000L;
		}
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	protected abstract void method627();

	@OriginalMember(owner = "client!bh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static138.aFrame1 == null) {
			return Static76.aClass66_2 == null || Static76.aClass66_2.anApplet1 == this ? super.getParameter(arg0) : Static76.aClass66_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}
}
