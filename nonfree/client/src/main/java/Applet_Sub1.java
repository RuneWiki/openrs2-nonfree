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

@OriginalClass("client!rd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZB)V")
	private void method465(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static187.aBoolean171) {
				return;
			}
			Static187.aBoolean171 = true;
		}
		if (Static126.aClass76_4.anApplet1 != null) {
			Static126.aClass76_4.anApplet1.destroy();
		}
		if (Static137.aCanvas1 != null) {
			try {
				Static137.aCanvas1.removeFocusListener(this);
				@Pc(43) Container local43;
				if (Static164.aFrame1 == null) {
					local43 = Static126.aClass76_4.anApplet1;
				} else {
					local43 = Static164.aFrame1;
				}
				local43.remove(Static137.aCanvas1);
			} catch (@Pc(52) Exception local52) {
			}
		}
		try {
			this.method481();
		} catch (@Pc(58) Exception local58) {
		}
		if (Static126.aClass76_4 != null) {
			try {
				Static126.aClass76_4.method2562();
			} catch (@Pc(65) Exception local65) {
			}
		}
		this.method476();
		if (Static164.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(75) Throwable local75) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	private void method466() {
		@Pc(14) long local14 = Static149.method2559();
		@Pc(18) long local18 = Static143.aLongArray38[Static68.anInt1849];
		Static143.aLongArray38[Static68.anInt1849] = local14;
		if (local18 != 0L && local18 < local14) {
			@Pc(38) int local38 = (int) (local14 - local18);
			Static176.anInt3960 = ((local38 >> 1) + 32000) / local38;
		}
		Static68.anInt1849 = Static68.anInt1849 + 1 & 0x1F;
		if (Static183.anInt1799++ > 50) {
			Static9.aBoolean19 = true;
			Static183.anInt1799 -= 50;
			Static137.aCanvas1.setSize(Static102.anInt2589, Static47.anInt1222);
			Static137.aCanvas1.setVisible(true);
			if (Static164.aFrame1 == null) {
				Static137.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(83) Insets local83 = Static164.aFrame1.getInsets();
				Static137.aCanvas1.setLocation(local83.left, local83.top);
			}
		}
		this.method467();
	}

	@OriginalMember(owner = "client!rd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static73.anApplet_Sub1_1 == this && !Static187.aBoolean171) {
			Static73.aLong60 = Static149.method2559();
			Static52.method1025(5000L);
			Static38.aClass76_1 = null;
			this.method465(false);
		}
	}

	@OriginalMember(owner = "client!rd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static164.aFrame1 == null) {
			return Static126.aClass76_4 == null || Static126.aClass76_4.anApplet1 == this ? super.getDocumentBase() : Static126.aClass76_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	protected abstract void method467();

	@OriginalMember(owner = "client!rd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static164.aFrame1 == null) {
			return Static126.aClass76_4 == null || Static126.aClass76_4.anApplet1 == this ? super.getParameter(arg0) : Static126.aClass76_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	protected abstract void method469();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIB)V")
	protected final void method470(@OriginalArg(1) int arg0) {
		try {
			if (Static73.anApplet_Sub1_1 == null) {
				Static73.anApplet_Sub1_1 = this;
				Static102.anInt2589 = 765;
				Static47.anInt1222 = 503;
				Static93.anInt2385 = 488;
				if (Static126.aClass76_4 == null) {
					Static38.aClass76_1 = Static126.aClass76_4 = new Class76(false, this, arg0, null, 0);
				}
				Static126.aClass76_4.method2566(this, 1);
			} else {
				Static44.anInt1090++;
				if (Static44.anInt1090 >= 3) {
					this.method474("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(63) Exception local63) {
			Static146.method2485(null, local63);
			this.method474("crash");
		}
	}

	@OriginalMember(owner = "client!rd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static73.anApplet_Sub1_1 == this && !Static187.aBoolean171) {
			Static73.aLong60 = Static149.method2559() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static73.anApplet_Sub1_1 == this && !Static187.aBoolean171) {
			Static73.aLong60 = 0L;
		}
	}

	@OriginalMember(owner = "client!rd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
	protected final synchronized void method472() {
		@Pc(9) Container local9;
		if (Static164.aFrame1 == null) {
			local9 = Static126.aClass76_4.anApplet1;
		} else {
			local9 = Static164.aFrame1;
		}
		if (Static137.aCanvas1 != null) {
			Static137.aCanvas1.removeFocusListener(this);
			local9.remove(Static137.aCanvas1);
		}
		Static137.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static137.aCanvas1);
		Static137.aCanvas1.setSize(Static102.anInt2589, Static47.anInt1222);
		Static137.aCanvas1.setVisible(true);
		if (Static164.aFrame1 == null) {
			Static137.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(47) Insets local47 = Static164.aFrame1.getInsets();
			Static137.aCanvas1.setLocation(local47.left, local47.top);
		}
		Static137.aCanvas1.addFocusListener(this);
		Static137.aCanvas1.requestFocus();
		Static9.aBoolean19 = true;
		Static63.aBoolean72 = false;
		Static8.aLong9 = Static149.method2559();
	}

	@OriginalMember(owner = "client!rd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)Z")
	protected final boolean method473() {
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
				this.method474("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method474(@OriginalArg(1) String arg0) {
		if (this.aBoolean35) {
			return;
		}
		this.aBoolean35 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	protected abstract void method475();

	@OriginalMember(owner = "client!rd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static126.aBoolean129 = true;
		Static9.aBoolean19 = true;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	protected abstract void method476();

	@OriginalMember(owner = "client!rd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static126.aBoolean129 = false;
	}

	@OriginalMember(owner = "client!rd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static164.aFrame1 == null) {
			return Static126.aClass76_4 == null || Static126.aClass76_4.anApplet1 == this ? super.getCodeBase() : Static126.aClass76_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static73.anApplet_Sub1_1 != this || Static187.aBoolean171) {
			return;
		}
		Static9.aBoolean19 = true;
		if (Static150.aString5 != null && Static150.aString5.startsWith("1.5") && Static149.method2559() - Static8.aLong9 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || Static102.anInt2589 <= local30.width && Static47.anInt1222 <= local30.height) {
				Static63.aBoolean72 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method479(@OriginalArg(0) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static73.anApplet_Sub1_1 = this;
			Static102.anInt2589 = 765;
			Static47.anInt1222 = 503;
			Static93.anInt2385 = 488;
			Static164.aFrame1 = new Frame();
			Static164.aFrame1.setTitle("Jagex");
			Static164.aFrame1.setResizable(false);
			Static164.aFrame1.addWindowListener(this);
			Static164.aFrame1.setVisible(true);
			Static164.aFrame1.toFront();
			@Pc(28) Insets local28 = Static164.aFrame1.getInsets();
			Static164.aFrame1.setSize(local28.right + local28.left + 765, local28.bottom + local28.top + 503);
			Static38.aClass76_1 = Static126.aClass76_4 = new Class76(true, null, arg1, arg0, 23);
			Static126.aClass76_4.method2566(this, 1);
		} catch (@Pc(65) Exception local65) {
			Static146.method2485(null, local65);
		}
	}

	@OriginalMember(owner = "client!rd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static164.aFrame1 == null) {
			return Static126.aClass76_4 == null || Static126.aClass76_4.anApplet1 == this ? super.getAppletContext() : Static126.aClass76_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
	protected abstract void method481();

	@OriginalMember(owner = "client!rd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V")
	private void method482() {
		@Pc(2) long local2 = Static149.method2559();
		@Pc(6) long local6 = Static174.aLongArray45[Static44.anInt1087];
		Static174.aLongArray45[Static44.anInt1087] = local2;
		@Pc(19) boolean local19;
		if (local6 == 0L || local6 >= local2) {
			local19 = false;
		} else {
			local19 = true;
		}
		Static44.anInt1087 = Static44.anInt1087 + 1 & 0x1F;
		synchronized (this) {
			Static181.aBoolean167 = Static126.aBoolean129;
		}
		this.method475();
	}

	@OriginalMember(owner = "client!rd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static150.aString4 != null) {
				@Pc(10) String local10 = Static150.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static150.aString5;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method474("wrongjava");
						return;
					}
					Static131.anInt3139 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static150.aString5 == null || Static150.aString5.equals("1.4.2"))) {
					this.method474("wrongjava");
					return;
				}
			}
			if (Static126.aClass76_4.anApplet1 != null) {
				@Pc(67) Method local67 = Static150.aMethod2;
				if (local67 != null) {
					try {
						local67.invoke(Static126.aClass76_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method472();
			Static69.aClass42_1 = Static180.method3096(Static102.anInt2589, Static47.anInt1222, Static137.aCanvas1);
			this.method469();
			Static128.aClass28_1 = Static84.method3160();
			while (Static73.aLong60 == 0L || Static73.aLong60 > Static149.method2559()) {
				Static143.anInt3326 = Static128.aClass28_1.method3135(Static131.anInt3139, Static102.anInt2590);
				for (@Pc(108) int local108 = 0; local108 < Static143.anInt3326; local108++) {
					this.method482();
				}
				this.method466();
				Static123.method2212(Static137.aCanvas1, Static126.aClass76_4);
			}
		} catch (@Pc(143) Exception local143) {
			Static146.method2485(null, local143);
			this.method474("crash");
		}
		this.method465(true);
	}
}
