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

@OriginalClass("client!th")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!th", name = "H", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!th", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static109.anApplet_Sub1_11 == this && !Static86.aBoolean81) {
			Static131.aLong173 = Static70.method1106();
			Static155.method2675(5000L);
			Static42.aClass36_2 = null;
			this.method424();
		}
	}

	@OriginalMember(owner = "client!th", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	protected abstract void method421();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method423(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static172.anInt4038 = 765;
			Static174.anInt4037 = 503;
			Static139.anInt3255 = 477;
			Static109.anApplet_Sub1_11 = this;
			Static24.aFrame1 = new Frame();
			Static24.aFrame1.setTitle("Jagex");
			Static24.aFrame1.setResizable(false);
			Static24.aFrame1.addWindowListener(this);
			Static24.aFrame1.setVisible(true);
			Static24.aFrame1.toFront();
			@Pc(28) Insets local28 = Static24.aFrame1.getInsets();
			Static24.aFrame1.setSize(local28.left + local28.right + 765, local28.top + 503 + local28.bottom);
			Static42.aClass36_2 = Static107.aClass36_4 = new Class36(true, null, arg0, arg1, 16);
			Static107.aClass36_4.method1109(1, this);
		} catch (@Pc(65) Exception local65) {
			Static97.method1572(local65, null);
		}
	}

	@OriginalMember(owner = "client!th", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static109.anApplet_Sub1_11 == this && !Static86.aBoolean81) {
			Static131.aLong173 = 0L;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	private synchronized void method424() {
		if (Static86.aBoolean81) {
			return;
		}
		Static86.aBoolean81 = true;
		try {
			Static121.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method434();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static24.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		if (Static107.aClass36_4 != null) {
			try {
				Static107.aClass36_4.method1112();
			} catch (@Pc(36) Exception local36) {
			}
		}
		this.method435();
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	protected abstract void method425();

	@OriginalMember(owner = "client!th", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static109.anApplet_Sub1_11 != this || Static86.aBoolean81) {
			return;
		}
		Static76.aBoolean67 = true;
		if (Static71.aString3 != null && Static71.aString3.startsWith("1.5") && Static70.method1106() - Static59.aLong84 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static172.anInt4038 && Static174.anInt4037 <= local30.height) {
				Static9.aBoolean5 = true;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static24.aFrame1 == null) {
			return Static107.aClass36_4 == null || Static107.aClass36_4.anApplet1 == this ? super.getCodeBase() : Static107.aClass36_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method430(@OriginalArg(0) String arg0) {
		if (this.aBoolean25) {
			return;
		}
		this.aBoolean25 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!th", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static24.aFrame1 == null) {
			return Static107.aClass36_4 == null || Static107.aClass36_4.anApplet1 == this ? super.getParameter(arg0) : Static107.aClass36_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	private void method431() {
		@Pc(6) long local6 = Static70.method1106();
		@Pc(18) long local18 = Static76.aLongArray2[Static20.anInt514];
		Static76.aLongArray2[Static20.anInt514] = local6;
		if (local18 != 0L && local6 > local18) {
			@Pc(37) int local37 = (int) (local6 - local18);
			Static129.anInt4161 = ((local37 >> 1) + 32000) / local37;
		}
		Static20.anInt514 = Static20.anInt514 + 1 & 0x1F;
		if (Static135.anInt3135++ > 50) {
			Static135.anInt3135 -= 50;
			Static76.aBoolean67 = true;
			Static121.aCanvas1.setSize(Static172.anInt4038, Static174.anInt4037);
			Static121.aCanvas1.setVisible(true);
			if (Static24.aFrame1 == null) {
				Static121.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static24.aFrame1.getInsets();
				Static121.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method421();
	}

	@OriginalMember(owner = "client!th", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static109.anApplet_Sub1_11 == this && !Static86.aBoolean81) {
			Static131.aLong173 = Static70.method1106() + 4000L;
		}
	}

	@OriginalMember(owner = "client!th", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V")
	protected abstract void method432();

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
	protected final synchronized void method433() {
		@Pc(9) Container local9;
		if (Static24.aFrame1 == null) {
			local9 = Static107.aClass36_4.anApplet1;
		} else {
			local9 = Static24.aFrame1;
		}
		if (Static121.aCanvas1 != null) {
			Static121.aCanvas1.removeFocusListener(this);
			local9.remove(Static121.aCanvas1);
		}
		Static121.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static121.aCanvas1);
		Static121.aCanvas1.setSize(Static172.anInt4038, Static174.anInt4037);
		Static121.aCanvas1.setVisible(true);
		if (Static24.aFrame1 == null) {
			Static121.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static24.aFrame1.getInsets();
			Static121.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static121.aCanvas1.addFocusListener(this);
		Static121.aCanvas1.requestFocus();
		Static76.aBoolean67 = true;
		Static9.aBoolean5 = false;
		Static59.aLong84 = Static70.method1106();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	protected abstract void method434();

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
	protected abstract void method435();

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)Z")
	protected final boolean method436() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method430("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static24.aFrame1 == null) {
			return Static107.aClass36_4 == null || Static107.aClass36_4.anApplet1 == this ? super.getAppletContext() : Static107.aClass36_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static154.aBoolean145 = true;
		Static76.aBoolean67 = true;
	}

	@OriginalMember(owner = "client!th", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static24.aFrame1 == null) {
			return Static107.aClass36_4 == null || Static107.aClass36_4.anApplet1 == this ? super.getDocumentBase() : Static107.aClass36_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V")
	protected final void method437(@OriginalArg(3) int arg0) {
		try {
			if (Static109.anApplet_Sub1_11 == null) {
				Static174.anInt4037 = 503;
				Static172.anInt4038 = 765;
				Static139.anInt3255 = 477;
				Static109.anApplet_Sub1_11 = this;
				if (Static107.aClass36_4 == null) {
					Static42.aClass36_2 = Static107.aClass36_4 = new Class36(false, this, arg0, null, 0);
				}
				Static107.aClass36_4.method1109(1, this);
			} else {
				Static159.anInt3757++;
				if (Static159.anInt3757 >= 3) {
					this.method430("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static97.method1572(local59, null);
			this.method430("crash");
		}
	}

	@OriginalMember(owner = "client!th", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!th", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static71.aString4 != null) {
				@Pc(10) String local10 = Static71.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static71.aString3;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method430("wrongjava");
						return;
					}
					Static16.anInt436 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static71.aString3 == null || Static71.aString3.equals("1.4.2"))) {
					this.method430("wrongjava");
					return;
				}
			}
			if (Static107.aClass36_4.anApplet1 != null) {
				@Pc(68) Method local68 = Static71.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static107.aClass36_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method433();
			Static168.aClass67_1 = Static146.method2707(Static121.aCanvas1, Static172.anInt4038, Static174.anInt4037);
			this.method425();
			Static158.aClass5_1 = Static96.method1566();
			while (Static131.aLong173 == 0L || Static70.method1106() < Static131.aLong173) {
				Static52.anInt1434 = Static158.aClass5_1.method931(Static16.anInt436, Static29.anInt745);
				for (@Pc(109) int local109 = 0; local109 < Static52.anInt1434; local109++) {
					this.method438();
				}
				this.method431();
				Static77.method1233(Static121.aCanvas1, Static107.aClass36_4);
			}
		} catch (@Pc(142) Exception local142) {
			Static97.method1572(local142, null);
			this.method430("crash");
		}
		this.method424();
	}

	@OriginalMember(owner = "client!th", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static154.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!th", name = "i", descriptor = "(I)V")
	private void method438() {
		@Pc(4) long local4 = Static70.method1106();
		@Pc(12) long local12 = Static102.aLongArray4[Static77.anInt1913];
		@Pc(25) boolean local25;
		if (local12 == 0L || local4 <= local12) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static102.aLongArray4[Static77.anInt1913] = local4;
		Static77.anInt1913 = Static77.anInt1913 + 1 & 0x1F;
		synchronized (this) {
			Static84.aBoolean80 = Static154.aBoolean145;
		}
		this.method432();
	}

	@OriginalMember(owner = "client!th", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!th", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!th", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
