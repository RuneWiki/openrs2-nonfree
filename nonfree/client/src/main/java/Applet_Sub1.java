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

@OriginalClass("client!na")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!na", name = "M", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	protected abstract void method746();

	@OriginalMember(owner = "client!na", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static63.anApplet_Sub1_1 == this && !Static24.aBoolean26) {
			Static27.aLong25 = 0L;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	private void method747() {
		@Pc(7) long local7 = Static146.aLongArray8[Static120.anInt3325];
		@Pc(14) long local14 = Static1.method2();
		@Pc(23) boolean local23;
		if (local7 == 0L || local14 <= local7) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static146.aLongArray8[Static120.anInt3325] = local14;
		Static120.anInt3325 = Static120.anInt3325 + 1 & 0x1F;
		synchronized (this) {
			Static101.aBoolean113 = Static179.aBoolean173;
		}
		this.method746();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	protected final synchronized void method748() {
		@Pc(6) Container local6;
		if (Static183.aFrame1 == null) {
			local6 = Static65.aClass81_1.anApplet1;
		} else {
			local6 = Static183.aFrame1;
		}
		if (Static159.aCanvas36 != null) {
			Static159.aCanvas36.removeFocusListener(this);
			local6.remove(Static159.aCanvas36);
		}
		Static159.aCanvas36 = new Canvas_Sub1(this);
		local6.add(Static159.aCanvas36);
		Static159.aCanvas36.setSize(Static99.anInt2872, Static18.anInt4398);
		Static159.aCanvas36.setVisible(true);
		if (Static183.aFrame1 == null) {
			Static159.aCanvas36.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static183.aFrame1.getInsets();
			Static159.aCanvas36.setLocation(local43.left, local43.top);
		}
		Static159.aCanvas36.addFocusListener(this);
		Static159.aCanvas36.requestFocus();
		Static94.aBoolean109 = true;
		Static18.aBoolean176 = false;
		Static127.aLong114 = Static1.method2();
	}

	@OriginalMember(owner = "client!na", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	protected abstract void method749();

	@OriginalMember(owner = "client!na", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static183.aFrame1 == null) {
			return Static65.aClass81_1 == null || Static65.aClass81_1.anApplet1 == this ? super.getCodeBase() : Static65.aClass81_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static63.anApplet_Sub1_1 == this && !Static24.aBoolean26) {
			Static27.aLong25 = Static1.method2() + 4000L;
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)V")
	protected abstract void method750();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method751(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			Static63.anApplet_Sub1_1 = this;
			Static18.anInt4398 = 503;
			Static99.anInt2872 = 765;
			Static75.anInt2298 = 490;
			Static183.aFrame1 = new Frame();
			Static183.aFrame1.setTitle("Jagex");
			Static183.aFrame1.setResizable(false);
			Static183.aFrame1.addWindowListener(this);
			Static183.aFrame1.setVisible(true);
			Static183.aFrame1.toFront();
			@Pc(32) Insets local32 = Static183.aFrame1.getInsets();
			Static183.aFrame1.setSize(local32.right + local32.left + 765, local32.bottom + 503 + local32.top);
			Static104.aClass81_2 = Static65.aClass81_1 = new Class81(true, null, arg0, arg1, 23);
			Static65.aClass81_1.method3153(1, this);
		} catch (@Pc(67) Exception local67) {
			Static153.method2973(null, local67);
		}
	}

	@OriginalMember(owner = "client!na", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static179.aBoolean173 = true;
		Static94.aBoolean109 = true;
	}

	@OriginalMember(owner = "client!na", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!na", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!na", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static183.aFrame1 == null) {
			return Static65.aClass81_1 == null || Static65.aClass81_1.anApplet1 == this ? super.getAppletContext() : Static65.aClass81_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	protected abstract void method753();

	@OriginalMember(owner = "client!na", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static170.aString5 != null) {
				@Pc(10) String local10 = Static170.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static170.aString4;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method760("wrongjava");
						return;
					}
					Static36.anInt1079 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static170.aString4 == null || Static170.aString4.equals("1.4.2"))) {
					this.method760("wrongjava");
					return;
				}
			}
			if (Static65.aClass81_1.anApplet1 != null) {
				@Pc(68) Method local68 = Static170.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static65.aClass81_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method748();
			Static192.aClass44_1 = Static144.method2916(Static18.anInt4398, Static99.anInt2872, Static159.aCanvas36);
			this.method753();
			Static143.aClass29_1 = Static119.method2564();
			while (Static27.aLong25 == 0L || Static27.aLong25 > Static1.method2()) {
				Static123.anInt3377 = Static143.aClass29_1.method3259(Static36.anInt1079, Static101.anInt2911);
				for (@Pc(109) int local109 = 0; local109 < Static123.anInt3377; local109++) {
					this.method747();
				}
				this.method762();
				Static93.method2182(Static65.aClass81_1, Static159.aCanvas36);
			}
		} catch (@Pc(142) Exception local142) {
			Static153.method2973(null, local142);
			this.method760("crash");
		}
		this.method757(true);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	protected abstract void method756();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
	private void method757(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static24.aBoolean26) {
				return;
			}
			Static24.aBoolean26 = true;
		}
		if (Static65.aClass81_1.anApplet1 != null) {
			Static65.aClass81_1.anApplet1.destroy();
		}
		if (Static159.aCanvas36 != null) {
			try {
				Static159.aCanvas36.removeFocusListener(this);
				@Pc(43) Container local43;
				if (Static183.aFrame1 == null) {
					local43 = Static65.aClass81_1.anApplet1;
				} else {
					local43 = Static183.aFrame1;
				}
				local43.remove(Static159.aCanvas36);
			} catch (@Pc(52) Exception local52) {
			}
		}
		try {
			this.method749();
		} catch (@Pc(58) Exception local58) {
		}
		if (Static65.aClass81_1 != null) {
			try {
				Static65.aClass81_1.method3150();
			} catch (@Pc(65) Exception local65) {
			}
		}
		this.method756();
		if (Static183.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(75) Throwable local75) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!na", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static63.anApplet_Sub1_1 != this || Static24.aBoolean26) {
			return;
		}
		Static94.aBoolean109 = true;
		if (Static170.aString4 != null && Static170.aString4.startsWith("1.5") && Static1.method2() - Static127.aLong114 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || Static99.anInt2872 <= local29.width && local29.height >= Static18.anInt4398) {
				Static18.aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!na", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static63.anApplet_Sub1_1 == this && !Static24.aBoolean26) {
			Static27.aLong25 = Static1.method2();
			Static85.method1993(5000L);
			Static104.aClass81_2 = null;
			this.method757(false);
		}
	}

	@OriginalMember(owner = "client!na", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static183.aFrame1 == null) {
			return Static65.aClass81_1 == null || Static65.aClass81_1.anApplet1 == this ? super.getDocumentBase() : Static65.aClass81_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method760(@OriginalArg(1) String arg0) {
		if (this.aBoolean38) {
			return;
		}
		this.aBoolean38 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!na", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)V")
	private void method762() {
		@Pc(6) long local6 = Static1.method2();
		@Pc(10) long local10 = Static186.aLongArray10[Static56.anInt1777];
		Static186.aLongArray10[Static56.anInt1777] = local6;
		Static56.anInt1777 = Static56.anInt1777 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(37) int local37 = (int) (local6 - local10);
			Static41.anInt1303 = ((local37 >> 1) + 32000) / local37;
		}
		if (Static9.anInt301++ > 50) {
			Static9.anInt301 -= 50;
			Static94.aBoolean109 = true;
			Static159.aCanvas36.setSize(Static99.anInt2872, Static18.anInt4398);
			Static159.aCanvas36.setVisible(true);
			if (Static183.aFrame1 == null) {
				Static159.aCanvas36.setLocation(0, 0);
			} else {
				@Pc(70) Insets local70 = Static183.aFrame1.getInsets();
				Static159.aCanvas36.setLocation(local70.left, local70.top);
			}
		}
		this.method750();
	}

	@OriginalMember(owner = "client!na", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!na", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static183.aFrame1 == null) {
			return Static65.aClass81_1 == null || Static65.aClass81_1.anApplet1 == this ? super.getParameter(arg0) : Static65.aClass81_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!na", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII)V")
	protected final void method763(@OriginalArg(3) int arg0) {
		try {
			if (Static63.anApplet_Sub1_1 == null) {
				Static75.anInt2298 = 490;
				Static63.anApplet_Sub1_1 = this;
				Static99.anInt2872 = 765;
				Static18.anInt4398 = 503;
				if (Static65.aClass81_1 == null) {
					Static104.aClass81_2 = Static65.aClass81_1 = new Class81(false, this, arg0, null, 0);
				}
				Static65.aClass81_1.method3153(1, this);
			} else {
				Static172.anInt4193++;
				if (Static172.anInt4193 >= 3) {
					this.method760("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static153.method2973(null, local61);
			this.method760("crash");
		}
	}

	@OriginalMember(owner = "client!na", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!na", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static179.aBoolean173 = false;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)Z")
	protected final boolean method764() {
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
				this.method760("invalidhost");
				return false;
			}
		}
	}
}
