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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!kd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static58.aString5 != null) {
				@Pc(10) String local10 = Static58.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static58.aString7;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method481("wrongjava");
						return;
					}
					Static20.anInt901 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static58.aString7 == null || Static58.aString7.equals("1.4.2"))) {
					this.method481("wrongjava");
					return;
				}
			}
			if (Static34.aClass34_4.anApplet1 != null) {
				@Pc(68) Method local68 = Static58.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static34.aClass34_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method493();
			Static4.aClass4_8 = Static86.method1550(Static79.anInt2102, Static21.anInt918, Static103.aCanvas1);
			this.method491();
			Static59.aClass29_1 = Static91.method1584();
			Static59.aClass29_1.method1590();
			while (Static10.aLong82 == 0L || Static85.method1534() < Static10.aLong82) {
				Static20.anInt898 = Static59.aClass29_1.method1589(Static68.anInt1946, Static20.anInt901);
				for (@Pc(112) int local112 = 0; local112 < Static20.anInt898; local112++) {
					this.method489();
				}
				this.method486();
			}
		} catch (@Pc(139) Exception local139) {
			Static10.method1681(null, local139);
			this.method481("crash");
		}
		this.method476();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	protected abstract void method475();

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	private synchronized void method476() {
		if (Static31.aBoolean53) {
			return;
		}
		Static31.aBoolean53 = true;
		try {
			Static103.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method483();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static63.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static34.aClass34_4 != null) {
			try {
				Static34.aClass34_4.method1253();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method475();
	}

	@OriginalMember(owner = "client!kd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static6.anApplet_Sub1_1 == this && !Static31.aBoolean53) {
			Static10.aLong82 = Static85.method1534() + 4000L;
		}
	}

	@OriginalMember(owner = "client!kd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
	protected final boolean method480() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.endsWith("jagex.com")) {
			return true;
		} else if (local8.endsWith("runescape.com")) {
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
				this.method481("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method481(@OriginalArg(1) String arg0) {
		if (this.aBoolean25) {
			return;
		}
		this.aBoolean25 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static6.anApplet_Sub1_1 == this && !Static31.aBoolean53) {
			Static10.aLong82 = 0L;
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	protected abstract void method482();

	@OriginalMember(owner = "client!kd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static87.aBoolean136 = false;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	protected abstract void method483();

	@OriginalMember(owner = "client!kd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static6.anApplet_Sub1_1 != this || Static31.aBoolean53) {
			return;
		}
		Static80.aBoolean119 = true;
		if (Static58.aString7 != null && Static58.aString7.startsWith("1.5") && Static85.method1534() - Static6.aLong9 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static21.anInt918 <= local28.width && local28.height >= Static79.anInt2102) {
				Static112.aBoolean160 = true;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static6.anApplet_Sub1_1 == this && !Static31.aBoolean53) {
			Static10.aLong82 = Static85.method1534();
			Static72.method1367(5000L);
			Static67.aClass34_6 = null;
			this.method476();
		}
	}

	@OriginalMember(owner = "client!kd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static87.aBoolean136 = true;
		Static80.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!kd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static63.aFrame1 == null) {
			return Static34.aClass34_4 == null || Static34.aClass34_4.anApplet1 == this ? super.getDocumentBase() : Static34.aClass34_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIIII)V")
	protected final void method484(@OriginalArg(4) int arg0) {
		try {
			if (Static6.anApplet_Sub1_1 != null) {
				this.method481("alreadyloaded");
				return;
			}
			Static21.anInt918 = 765;
			Static68.anInt1942 = 435;
			Static79.anInt2102 = 503;
			Static6.anApplet_Sub1_1 = this;
			if (Static34.aClass34_4 == null) {
				Static67.aClass34_6 = Static34.aClass34_4 = new Class34(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
			}
			Static34.aClass34_4.method1262(1, this);
		} catch (@Pc(43) Exception local43) {
			Static10.method1681(null, local43);
			this.method481("crash");
		}
	}

	@OriginalMember(owner = "client!kd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	private void method486() {
		@Pc(10) long local10 = Static85.method1534();
		@Pc(14) long local14 = Static55.aLongArray2[Static57.anInt1783];
		Static55.aLongArray2[Static57.anInt1783] = local10;
		if (local14 != 0L && local14 < local10) {
			@Pc(38) int local38 = (int) (local10 - local14);
			Static87.anInt2290 = ((local38 >> 1) + 32000) / local38;
		}
		Static57.anInt1783 = Static57.anInt1783 + 1 & 0x1F;
		if (Static69.anInt2810++ > 50) {
			Static69.anInt2810 -= 50;
			Static80.aBoolean119 = true;
			Static103.aCanvas1.setSize(Static21.anInt918, Static79.anInt2102);
			Static103.aCanvas1.setVisible(true);
			if (Static63.aFrame1 == null) {
				Static103.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(83) Insets local83 = Static63.aFrame1.getInsets();
				Static103.aCanvas1.setLocation(local83.left, local83.top);
			}
		}
		this.method494();
	}

	@OriginalMember(owner = "client!kd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static63.aFrame1 == null) {
			return Static34.aClass34_4 == null || Static34.aClass34_4.anApplet1 == this ? super.getAppletContext() : Static34.aClass34_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	private void method489() {
		@Pc(6) long local6 = Static85.method1534();
		@Pc(10) long local10 = Static112.aLongArray7[Static103.anInt2616];
		@Pc(19) boolean local19;
		if (local10 == 0L || local6 <= local10) {
			local19 = false;
		} else {
			local19 = true;
		}
		Static112.aLongArray7[Static103.anInt2616] = local6;
		Static103.anInt2616 = Static103.anInt2616 + 1 & 0x1F;
		synchronized (this) {
			Static43.aBoolean73 = Static87.aBoolean136;
		}
		this.method482();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;IIIILjava/net/InetAddress;II)V")
	protected final void method490(@OriginalArg(0) String arg0, @OriginalArg(4) int arg1, @OriginalArg(5) InetAddress arg2) {
		try {
			Static68.anInt1942 = 435;
			Static21.anInt918 = 765;
			Static6.anApplet_Sub1_1 = this;
			Static79.anInt2102 = 503;
			Static63.aFrame1 = new Frame();
			Static63.aFrame1.setTitle("Jagex");
			Static63.aFrame1.setResizable(false);
			Static63.aFrame1.addWindowListener(this);
			Static63.aFrame1.setVisible(true);
			Static63.aFrame1.toFront();
			@Pc(36) Insets local36 = Static63.aFrame1.getInsets();
			Static63.aFrame1.setSize(local36.right + local36.left + 765, local36.bottom + local36.top + 503);
			Static67.aClass34_6 = Static34.aClass34_4 = new Class34(true, null, arg2, arg1, arg0, 13);
			Static34.aClass34_4.method1262(1, this);
		} catch (@Pc(73) Exception local73) {
			Static10.method1681(null, local73);
		}
	}

	@OriginalMember(owner = "client!kd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static63.aFrame1 == null) {
			return Static34.aClass34_4 == null || Static34.aClass34_4.anApplet1 == this ? super.getCodeBase() : Static34.aClass34_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
	protected abstract void method491();

	@OriginalMember(owner = "client!kd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!kd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static63.aFrame1 == null) {
			return Static34.aClass34_4 == null || Static34.aClass34_4.anApplet1 == this ? super.getParameter(arg0) : Static34.aClass34_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	protected final synchronized void method493() {
		@Pc(9) Container local9;
		if (Static63.aFrame1 == null) {
			local9 = Static34.aClass34_4.anApplet1;
		} else {
			local9 = Static63.aFrame1;
		}
		if (Static103.aCanvas1 != null) {
			Static103.aCanvas1.removeFocusListener(this);
			local9.remove(Static103.aCanvas1);
		}
		Static103.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static103.aCanvas1);
		Static103.aCanvas1.setSize(Static21.anInt918, Static79.anInt2102);
		Static103.aCanvas1.setVisible(true);
		if (Static63.aFrame1 == null) {
			Static103.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static63.aFrame1.getInsets();
			Static103.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static103.aCanvas1.addFocusListener(this);
		Static103.aCanvas1.requestFocus();
		Static80.aBoolean119 = true;
		Static112.aBoolean160 = false;
		Static6.aLong9 = Static85.method1534();
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	protected abstract void method494();

	@OriginalMember(owner = "client!kd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
