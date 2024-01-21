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

@OriginalClass("client!gg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!gg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static170.aBoolean197 = true;
		Static79.aBoolean109 = true;
	}

	@OriginalMember(owner = "client!gg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!gg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
	protected abstract void method535();

	@OriginalMember(owner = "client!gg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static11.aFrame1 == null) {
			return Static169.aClass24_4 == null || Static169.aClass24_4.anApplet1 == this ? super.getDocumentBase() : Static169.aClass24_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static19.anApplet_Sub1_1 != this || Static76.aBoolean102) {
			return;
		}
		Static79.aBoolean109 = true;
		if (Static30.aString1 == null || !Static30.aString1.startsWith("1.5") || Static124.method1828() - Static171.aLong195 <= 1000L) {
			return;
		}
		@Pc(30) Rectangle local30 = arg0.getClipBounds();
		@Pc(41) boolean local41;
		if (local30 == null || Static63.anInt3568 <= local30.width && Static111.anInt2396 <= local30.height) {
			local41 = true;
		} else {
			local41 = false;
		}
	}

	@OriginalMember(owner = "client!gg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static11.aFrame1 == null) {
			return Static169.aClass24_4 == null || Static169.aClass24_4.anApplet1 == this ? super.getCodeBase() : Static169.aClass24_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method536(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			Static63.anInt3568 = 765;
			Static138.anInt2801 = 492;
			Static111.anInt2396 = 503;
			Static19.anApplet_Sub1_1 = this;
			Static11.aFrame1 = new Frame();
			Static11.aFrame1.setTitle("Jagex");
			Static11.aFrame1.setResizable(false);
			Static11.aFrame1.addWindowListener(this);
			Static11.aFrame1.setVisible(true);
			Static11.aFrame1.toFront();
			@Pc(38) Insets local38 = Static11.aFrame1.getInsets();
			Static11.aFrame1.setSize(local38.right + local38.left + 765, local38.bottom + local38.top + 503);
			Static20.aClass24_1 = Static169.aClass24_4 = new Class24(true, null, arg0, arg1, 24);
			Static169.aClass24_4.method560(this, 1);
		} catch (@Pc(73) Exception local73) {
			Static61.method998(local73, null);
		}
	}

	@OriginalMember(owner = "client!gg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)V")
	private void method537(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static76.aBoolean102) {
				return;
			}
			Static76.aBoolean102 = true;
		}
		if (Static169.aClass24_4.anApplet1 != null) {
			Static169.aClass24_4.anApplet1.destroy();
		}
		if (Static119.aCanvas1 != null) {
			try {
				Static119.aCanvas1.removeFocusListener(this);
				@Pc(40) Container local40;
				if (Static11.aFrame1 == null) {
					local40 = Static169.aClass24_4.anApplet1;
				} else {
					local40 = Static11.aFrame1;
				}
				local40.remove(Static119.aCanvas1);
			} catch (@Pc(48) Exception local48) {
			}
		}
		try {
			this.method538();
		} catch (@Pc(54) Exception local54) {
		}
		if (Static169.aClass24_4 != null) {
			try {
				Static169.aClass24_4.method558();
			} catch (@Pc(61) Exception local61) {
			}
		}
		this.method539();
		if (Static11.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(71) Throwable local71) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	protected abstract void method538();

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	protected abstract void method539();

	@OriginalMember(owner = "client!gg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
	protected abstract void method540();

	@OriginalMember(owner = "client!gg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static11.aFrame1 == null) {
			return Static169.aClass24_4 == null || Static169.aClass24_4.anApplet1 == this ? super.getAppletContext() : Static169.aClass24_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static170.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIIII)V")
	protected final void method541(@OriginalArg(2) int arg0) {
		try {
			if (Static19.anApplet_Sub1_1 != null) {
				Static113.anInt2434++;
				if (Static113.anInt2434 >= 3) {
					this.method544("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static63.anInt3568 = 765;
			Static111.anInt2396 = 503;
			Static138.anInt2801 = 492;
			Static19.anApplet_Sub1_1 = this;
			if (Static169.aClass24_4 == null) {
				Static20.aClass24_1 = Static169.aClass24_4 = new Class24(false, this, arg0, null, 0);
			}
			Static169.aClass24_4.method560(this, 1);
		} catch (@Pc(55) Exception local55) {
			Static61.method998(local55, null);
			this.method544("crash");
		}
	}

	@OriginalMember(owner = "client!gg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static19.anApplet_Sub1_1 == this && !Static76.aBoolean102) {
			Static146.aLong159 = Static124.method1828();
			Static199.method3292(5000L);
			Static20.aClass24_1 = null;
			this.method537(false);
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	private void method542() {
		@Pc(7) long local7 = Static102.aLongArray6[Static74.anInt1649];
		@Pc(10) long local10 = Static124.method1828();
		Static102.aLongArray6[Static74.anInt1649] = local10;
		@Pc(27) boolean local27;
		if (local7 == 0L || local7 >= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static74.anInt1649 = Static74.anInt1649 + 1 & 0x1F;
		synchronized (this) {
			Static53.aBoolean81 = Static170.aBoolean197;
		}
		this.method540();
	}

	@OriginalMember(owner = "client!gg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static11.aFrame1 == null) {
			return Static169.aClass24_4 == null || Static169.aClass24_4.anApplet1 == this ? super.getParameter(arg0) : Static169.aClass24_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	protected abstract void method543();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method544(@OriginalArg(0) String arg0) {
		if (this.aBoolean46) {
			return;
		}
		this.aBoolean46 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static30.aString3 != null) {
				@Pc(10) String local10 = Static30.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static30.aString1;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method544("wrongjava");
						return;
					}
					Static73.anInt1642 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static30.aString1 == null || Static30.aString1.equals("1.4.2"))) {
					this.method544("wrongjava");
					return;
				}
			}
			if (Static169.aClass24_4.anApplet1 != null) {
				@Pc(69) Method local69 = Static30.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static169.aClass24_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method547();
			Static84.aClass22_1 = Static12.method227(Static63.anInt3568, Static111.anInt2396, Static119.aCanvas1);
			this.method543();
			Static170.aClass35_1 = Static116.method1720();
			while (Static146.aLong159 == 0L || Static146.aLong159 > Static124.method1828()) {
				Static144.anInt2883 = Static170.aClass35_1.method2687(Static73.anInt1642, Static20.anInt545);
				for (@Pc(110) int local110 = 0; local110 < Static144.anInt2883; local110++) {
					this.method542();
				}
				this.method546();
				Static160.method2512(Static119.aCanvas1, Static169.aClass24_4);
			}
		} catch (@Pc(143) Exception local143) {
			Static61.method998(local143, null);
			this.method544("crash");
		}
		this.method537(true);
	}

	@OriginalMember(owner = "client!gg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static19.anApplet_Sub1_1 == this && !Static76.aBoolean102) {
			Static146.aLong159 = 0L;
		}
	}

	@OriginalMember(owner = "client!gg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)Z")
	protected final boolean method545() {
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
				this.method544("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static19.anApplet_Sub1_1 == this && !Static76.aBoolean102) {
			Static146.aLong159 = Static124.method1828() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
	private void method546() {
		@Pc(2) long local2 = Static124.method1828();
		@Pc(10) long local10 = Static68.aLongArray5[Static196.anInt4258];
		Static68.aLongArray5[Static196.anInt4258] = local2;
		Static196.anInt4258 = Static196.anInt4258 + 1 & 0x1F;
		if (local10 != 0L && local2 > local10) {
			@Pc(39) int local39 = (int) (local2 - local10);
			Static43.anInt1136 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static145.anInt2919++ > 50) {
			Static145.anInt2919 -= 50;
			Static79.aBoolean109 = true;
			Static119.aCanvas1.setSize(Static63.anInt3568, Static111.anInt2396);
			Static119.aCanvas1.setVisible(true);
			if (Static11.aFrame1 == null) {
				Static119.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static11.aFrame1.getInsets();
				Static119.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method535();
	}

	@OriginalMember(owner = "client!gg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
	private synchronized void method547() {
		@Pc(10) Container local10;
		if (Static11.aFrame1 == null) {
			local10 = Static169.aClass24_4.anApplet1;
		} else {
			local10 = Static11.aFrame1;
		}
		if (Static119.aCanvas1 != null) {
			Static119.aCanvas1.removeFocusListener(this);
			local10.remove(Static119.aCanvas1);
		}
		Static119.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static119.aCanvas1);
		Static119.aCanvas1.setSize(Static63.anInt3568, Static111.anInt2396);
		Static119.aCanvas1.setVisible(true);
		if (Static11.aFrame1 == null) {
			Static119.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static11.aFrame1.getInsets();
			Static119.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static119.aCanvas1.addFocusListener(this);
		Static119.aCanvas1.requestFocus();
		Static79.aBoolean109 = true;
		Static171.aLong195 = Static124.method1828();
	}
}
