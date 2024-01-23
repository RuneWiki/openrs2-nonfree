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

@OriginalClass("client!sb")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!sb", name = "providesignlink", descriptor = "(Lclient!mc;)V")
	public static void providesignlink(@OriginalArg(0) Class65 arg0) {
		Static116.aClass65_4 = arg0;
		Static136.aClass65_5 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	private synchronized void method570() {
		@Pc(5) Container local5;
		if (Static99.aFrame1 == null) {
			local5 = Static116.aClass65_4.anApplet1;
		} else {
			local5 = Static99.aFrame1;
		}
		if (Static78.aCanvas1 != null) {
			Static78.aCanvas1.removeFocusListener(this);
			local5.remove(Static78.aCanvas1);
		}
		Static78.aCanvas1 = new Canvas_Sub1(this);
		local5.add(Static78.aCanvas1);
		Static78.aCanvas1.setSize(Static88.anInt2058, Static112.anInt2563);
		Static78.aCanvas1.setVisible(true);
		if (Static99.aFrame1 == null) {
			Static78.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static99.aFrame1.getInsets();
			Static78.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static78.aCanvas1.addFocusListener(this);
		Static78.aCanvas1.requestFocus();
		Static50.aBoolean100 = true;
		Static16.aLong11 = Static3.method57();
	}

	@OriginalMember(owner = "client!sb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method571(@OriginalArg(1) String arg0) {
		if (this.aBoolean50) {
			return;
		}
		this.aBoolean50 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!sb", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	private void method572() {
		@Pc(11) long local11 = Static3.method57();
		@Pc(15) long local15 = Static171.aLongArray8[Static6.anInt166];
		Static171.aLongArray8[Static6.anInt166] = local11;
		Static6.anInt166 = Static6.anInt166 + 1 & 0x1F;
		if (local15 != 0L && local11 > local15) {
			@Pc(39) int local39 = (int) (local11 - local15);
			Static35.anInt837 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static10.anInt339++ > 50) {
			Static10.anInt339 -= 50;
			Static50.aBoolean100 = true;
			Static78.aCanvas1.setSize(Static88.anInt2058, Static112.anInt2563);
			Static78.aCanvas1.setVisible(true);
			if (Static99.aFrame1 == null) {
				Static78.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(74) Insets local74 = Static99.aFrame1.getInsets();
				Static78.aCanvas1.setLocation(local74.left, local74.top);
			}
		}
		this.method586();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
	protected final boolean method573() {
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
				this.method571("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	private void method575() {
		@Pc(6) long local6 = Static3.method57();
		@Pc(10) long local10 = Static114.aLongArray6[Static78.anInt1885];
		@Pc(25) boolean local25;
		if (local10 == 0L || local10 >= local6) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static114.aLongArray6[Static78.anInt1885] = local6;
		Static78.anInt1885 = Static78.anInt1885 + 1 & 0x1F;
		synchronized (this) {
			Static204.aBoolean242 = Static118.aBoolean147;
		}
		this.method582();
	}

	@OriginalMember(owner = "client!sb", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static130.anApplet_Sub1_1 == this && !Static73.aBoolean95) {
			Static4.aLong4 = 0L;
		}
	}

	@OriginalMember(owner = "client!sb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static99.aFrame1 == null) {
			return Static116.aClass65_4 == null || Static116.aClass65_4.anApplet1 == this ? super.getParameter(arg0) : Static116.aClass65_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V")
	private void method576(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static73.aBoolean95) {
				return;
			}
			Static73.aBoolean95 = true;
		}
		if (Static116.aClass65_4.anApplet1 != null) {
			Static116.aClass65_4.anApplet1.destroy();
		}
		if (Static78.aCanvas1 != null) {
			try {
				Static78.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static99.aFrame1 == null) {
					local35 = Static116.aClass65_4.anApplet1;
				} else {
					local35 = Static99.aFrame1;
				}
				local35.remove(Static78.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method580();
		} catch (@Pc(52) Exception local52) {
		}
		if (Static116.aClass65_4 != null) {
			try {
				Static116.aClass65_4.method2013();
			} catch (@Pc(61) Exception local61) {
			}
		}
		this.method579();
		if (Static99.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(78) Throwable local78) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!sb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static99.aFrame1 == null) {
			return Static116.aClass65_4 == null || Static116.aClass65_4.anApplet1 == this ? super.getDocumentBase() : Static116.aClass65_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method577(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static112.anInt2563 = 503;
			Static49.anInt1242 = 499;
			Static88.anInt2058 = 765;
			Static130.anApplet_Sub1_1 = this;
			Static99.aFrame1 = new Frame();
			Static99.aFrame1.setTitle("Jagex");
			Static99.aFrame1.setResizable(false);
			Static99.aFrame1.addWindowListener(this);
			Static99.aFrame1.setVisible(true);
			Static99.aFrame1.toFront();
			@Pc(28) Insets local28 = Static99.aFrame1.getInsets();
			Static99.aFrame1.setSize(local28.left + local28.right + 765, local28.top + 503 + local28.bottom);
			Static136.aClass65_5 = Static116.aClass65_4 = new Class65(true, null, arg0, arg1, 27);
			Static116.aClass65_4.method2005(1, this);
		} catch (@Pc(63) Exception local63) {
			Static131.method2194(null, local63);
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	protected abstract void method579();

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	protected abstract void method580();

	@OriginalMember(owner = "client!sb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!sb", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static130.anApplet_Sub1_1 == this && !Static73.aBoolean95) {
			Static4.aLong4 = Static3.method57() + 4000L;
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	protected abstract void method582();

	@OriginalMember(owner = "client!sb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static99.aFrame1 == null) {
			return Static116.aClass65_4 == null || Static116.aClass65_4.anApplet1 == this ? super.getAppletContext() : Static116.aClass65_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static118.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!sb", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static130.anApplet_Sub1_1 == this && !Static73.aBoolean95) {
			Static4.aLong4 = Static3.method57();
			Static146.method2494(5000L);
			Static136.aClass65_5 = null;
			this.method576(false);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBII)V")
	protected final void method583(@OriginalArg(1) int arg0) {
		try {
			if (Static130.anApplet_Sub1_1 == null) {
				Static130.anApplet_Sub1_1 = this;
				Static49.anInt1242 = 499;
				Static88.anInt2058 = 765;
				Static112.anInt2563 = 503;
				if (Static116.aClass65_4 == null) {
					Static136.aClass65_5 = Static116.aClass65_4 = new Class65(false, this, arg0, null, 0);
				}
				Static116.aClass65_4.method2005(1, this);
			} else {
				Static83.anInt1955++;
				if (Static83.anInt1955 >= 3) {
					this.method571("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(58) Exception local58) {
			Static131.method2194(null, local58);
			this.method571("crash");
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
	protected abstract void method584();

	@OriginalMember(owner = "client!sb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static118.aBoolean147 = true;
		Static50.aBoolean100 = true;
	}

	@OriginalMember(owner = "client!sb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static99.aFrame1 == null) {
			return Static116.aClass65_4 == null || Static116.aClass65_4.anApplet1 == this ? super.getCodeBase() : Static116.aClass65_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static119.aString2 != null) {
				@Pc(10) String local10 = Static119.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static119.aString3;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method571("wrongjava");
						return;
					}
					Static68.anInt1700 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static119.aString3 == null || Static119.aString3.equals("1.4.2"))) {
					this.method571("wrongjava");
					return;
				}
			}
			if (Static116.aClass65_4.anApplet1 != null) {
				@Pc(69) Method local69 = Static119.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static116.aClass65_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method570();
			Static21.aClass5_1 = Static95.method2549(Static78.aCanvas1, Static88.anInt2058, Static112.anInt2563);
			this.method584();
			Static183.aClass26_1 = Static188.method2947();
			while (Static4.aLong4 == 0L || Static4.aLong4 > Static3.method57()) {
				Static6.anInt162 = Static183.aClass26_1.method3054(Static68.anInt1700, Static177.anInt3807);
				for (@Pc(110) int local110 = 0; local110 < Static6.anInt162; local110++) {
					this.method575();
				}
				this.method572();
				Static139.method2383(Static78.aCanvas1, Static116.aClass65_4);
			}
		} catch (@Pc(141) Exception local141) {
			Static131.method2194(null, local141);
			this.method571("crash");
		}
		this.method576(true);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(Z)V")
	protected abstract void method586();

	@OriginalMember(owner = "client!sb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static130.anApplet_Sub1_1 != this || Static73.aBoolean95) {
			return;
		}
		Static50.aBoolean100 = true;
		if (Static119.aString3 == null || !Static119.aString3.startsWith("1.5") || Static3.method57() - Static16.aLong11 <= 1000L) {
			return;
		}
		@Pc(30) Rectangle local30 = arg0.getClipBounds();
		@Pc(45) boolean local45;
		if (local30 == null || local30.width >= Static88.anInt2058 && Static112.anInt2563 <= local30.height) {
			local45 = true;
		} else {
			local45 = false;
		}
	}
}
