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

@OriginalClass("client!ig")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V")
	protected final void method531(@OriginalArg(1) int arg0) {
		try {
			if (Static165.anApplet_Sub1_1 == null) {
				Static203.anInt4148 = 503;
				Static165.anApplet_Sub1_1 = this;
				Static133.anInt2649 = 495;
				Static41.anInt876 = 765;
				if (Static47.aClass47_1 == null) {
					Static189.aClass47_4 = Static47.aClass47_1 = new Class47(false, this, arg0, null, 0);
				}
				Static47.aClass47_1.method1363(this, 1);
			} else {
				Static29.anInt607++;
				if (Static29.anInt607 >= 3) {
					this.method538("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static208.method1860(null, local59);
			this.method538("crash");
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	private void method532() {
		@Pc(2) long local2 = Static210.method3307();
		@Pc(10) long local10 = Static185.aLongArray8[Static203.anInt4150];
		Static185.aLongArray8[Static203.anInt4150] = local2;
		Static203.anInt4150 = Static203.anInt4150 + 1 & 0x1F;
		if (local10 != 0L && local10 < local2) {
			@Pc(41) int local41 = (int) (local2 - local10);
			Static28.anInt581 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static119.anInt2421++ > 50) {
			Static198.aBoolean182 = true;
			Static119.anInt2421 -= 50;
			Static211.aCanvas1.setSize(Static41.anInt876, Static203.anInt4148);
			Static211.aCanvas1.setVisible(true);
			if (Static88.aFrame1 == null) {
				Static211.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(80) Insets local80 = Static88.aFrame1.getInsets();
				Static211.aCanvas1.setLocation(local80.left, local80.top);
			}
		}
		this.method537();
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Z")
	protected final boolean method533() {
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
				this.method538("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static88.aFrame1 == null) {
			return Static47.aClass47_1 == null || Static47.aClass47_1.anApplet1 == this ? super.getCodeBase() : Static47.aClass47_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static88.aFrame1 == null) {
			return Static47.aClass47_1 == null || Static47.aClass47_1.anApplet1 == this ? super.getDocumentBase() : Static47.aClass47_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	protected abstract void method534();

	@OriginalMember(owner = "client!ig", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZB)V")
	private void method535(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static196.aBoolean175) {
				return;
			}
			Static196.aBoolean175 = true;
		}
		if (Static47.aClass47_1.anApplet1 != null) {
			Static47.aClass47_1.anApplet1.destroy();
		}
		if (Static211.aCanvas1 != null) {
			try {
				Static211.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static88.aFrame1 == null) {
					local35 = Static47.aClass47_1.anApplet1;
				} else {
					local35 = Static88.aFrame1;
				}
				local35.remove(Static211.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method542();
		} catch (@Pc(50) Exception local50) {
		}
		if (Static47.aClass47_1 != null) {
			try {
				Static47.aClass47_1.method1364();
			} catch (@Pc(62) Exception local62) {
			}
		}
		this.method543();
		if (Static88.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(72) Throwable local72) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ig", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static88.aFrame1 == null) {
			return Static47.aClass47_1 == null || Static47.aClass47_1.anApplet1 == this ? super.getAppletContext() : Static47.aClass47_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	protected abstract void method537();

	@OriginalMember(owner = "client!ig", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static165.anApplet_Sub1_1 == this && !Static196.aBoolean175) {
			Static160.aLong100 = Static210.method3307();
			Static119.method1720(5000L);
			Static189.aClass47_4 = null;
			this.method535(false);
		}
	}

	@OriginalMember(owner = "client!ig", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static165.anApplet_Sub1_1 == this && !Static196.aBoolean175) {
			Static160.aLong100 = Static210.method3307() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method538(@OriginalArg(0) String arg0) {
		if (this.aBoolean37) {
			return;
		}
		this.aBoolean37 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ig", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static165.anApplet_Sub1_1 == this && !Static196.aBoolean175) {
			Static160.aLong100 = 0L;
		}
	}

	@OriginalMember(owner = "client!ig", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static165.anApplet_Sub1_1 != this || Static196.aBoolean175) {
			return;
		}
		Static198.aBoolean182 = true;
		if (Static94.aString4 == null || !Static94.aString4.startsWith("1.5") || Static210.method3307() - Static14.aLong12 <= 1000L) {
			return;
		}
		@Pc(28) Rectangle local28 = arg0.getClipBounds();
		@Pc(43) boolean local43;
		if (local28 == null || local28.width >= Static41.anInt876 && local28.height >= Static203.anInt4148) {
			local43 = true;
		} else {
			local43 = false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
	private synchronized void method539() {
		@Pc(17) Container local17;
		if (Static88.aFrame1 == null) {
			local17 = Static47.aClass47_1.anApplet1;
		} else {
			local17 = Static88.aFrame1;
		}
		if (Static211.aCanvas1 != null) {
			Static211.aCanvas1.removeFocusListener(this);
			local17.remove(Static211.aCanvas1);
		}
		Static211.aCanvas1 = new Canvas_Sub1(this);
		local17.add(Static211.aCanvas1);
		Static211.aCanvas1.setSize(Static41.anInt876, Static203.anInt4148);
		Static211.aCanvas1.setVisible(true);
		if (Static88.aFrame1 == null) {
			Static211.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(57) Insets local57 = Static88.aFrame1.getInsets();
			Static211.aCanvas1.setLocation(local57.left, local57.top);
		}
		Static211.aCanvas1.addFocusListener(this);
		Static211.aCanvas1.requestFocus();
		Static198.aBoolean182 = true;
		Static14.aLong12 = Static210.method3307();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIILjava/lang/String;IB)V")
	protected final void method540(@OriginalArg(1) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static133.anInt2649 = 495;
			Static203.anInt4148 = 503;
			Static165.anApplet_Sub1_1 = this;
			Static41.anInt876 = 765;
			Static88.aFrame1 = new Frame();
			Static88.aFrame1.setTitle("Jagex");
			Static88.aFrame1.setResizable(false);
			Static88.aFrame1.addWindowListener(this);
			Static88.aFrame1.setVisible(true);
			Static88.aFrame1.toFront();
			@Pc(38) Insets local38 = Static88.aFrame1.getInsets();
			Static88.aFrame1.setSize(local38.right + local38.left + 765, local38.bottom + local38.top + 503);
			Static189.aClass47_4 = Static47.aClass47_1 = new Class47(true, null, arg0, arg1, 24);
			Static47.aClass47_1.method1363(this, 1);
		} catch (@Pc(74) Exception local74) {
			Static208.method1860(null, local74);
		}
	}

	@OriginalMember(owner = "client!ig", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ig", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	protected abstract void method542();

	@OriginalMember(owner = "client!ig", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static94.aString2 != null) {
				@Pc(10) String local10 = Static94.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static94.aString4;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method538("wrongjava");
						return;
					}
					Static131.anInt2560 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static94.aString4 == null || Static94.aString4.equals("1.4.2"))) {
					this.method538("wrongjava");
					return;
				}
			}
			if (Static47.aClass47_1.anApplet1 != null) {
				@Pc(68) Method local68 = Static94.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static47.aClass47_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method539();
			Static190.aClass22_1 = Static11.method256(Static41.anInt876, Static211.aCanvas1, Static203.anInt4148);
			this.method534();
			Static9.aClass1_1 = Static129.method1820();
			while (Static160.aLong100 == 0L || Static160.aLong100 > Static210.method3307()) {
				Static98.anInt2021 = Static9.aClass1_1.method1310(Static131.anInt2560, Static1.anInt1795);
				for (@Pc(109) int local109 = 0; local109 < Static98.anInt2021; local109++) {
					this.method545();
				}
				this.method532();
				Static176.method2728(Static47.aClass47_1, Static211.aCanvas1);
			}
		} catch (@Pc(138) Exception local138) {
			Static208.method1860(null, local138);
			this.method538("crash");
		}
		this.method535(true);
	}

	@OriginalMember(owner = "client!ig", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static6.aBoolean9 = false;
	}

	@OriginalMember(owner = "client!ig", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ig", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
	protected abstract void method543();

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
	protected abstract void method544();

	@OriginalMember(owner = "client!ig", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static88.aFrame1 == null) {
			return Static47.aClass47_1 == null || Static47.aClass47_1.anApplet1 == this ? super.getParameter(arg0) : Static47.aClass47_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V")
	private void method545() {
		@Pc(3) long local3 = Static211.aLongArray10[Static105.anInt2107];
		@Pc(12) long local12 = Static210.method3307();
		Static211.aLongArray10[Static105.anInt2107] = local12;
		@Pc(27) boolean local27;
		if (local3 == 0L || local12 <= local3) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static105.anInt2107 = Static105.anInt2107 + 1 & 0x1F;
		synchronized (this) {
			Static68.aBoolean84 = Static6.aBoolean9;
		}
		this.method544();
	}

	@OriginalMember(owner = "client!ig", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static6.aBoolean9 = true;
		Static198.aBoolean182 = true;
	}
}
