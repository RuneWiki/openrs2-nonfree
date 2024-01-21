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

@OriginalClass("client!lc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!lc", name = "C", descriptor = "Z")
	private boolean aBoolean33 = false;

	@OriginalMember(owner = "client!lc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static64.aBoolean128 = false;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	protected abstract void method275();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method276(@OriginalArg(1) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static88.anInt2284 = 765;
			Static13.anInt237 = 503;
			Static103.anApplet_Sub1_1 = this;
			Static130.anInt3005 = 467;
			Static21.aFrame1 = new Frame();
			Static21.aFrame1.setTitle("Jagex");
			Static21.aFrame1.setResizable(false);
			Static21.aFrame1.addWindowListener(this);
			Static21.aFrame1.setVisible(true);
			Static21.aFrame1.toFront();
			@Pc(32) Insets local32 = Static21.aFrame1.getInsets();
			Static21.aFrame1.setSize(local32.left + local32.right + 765, local32.bottom + local32.top + 503);
			Static134.aClass59_2 = Static129.aClass59_5 = new Class59(true, null, arg0, arg1, 16);
			Static129.aClass59_5.method1638(1, this);
		} catch (@Pc(69) Exception local69) {
			Static92.method1662(local69, null);
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static64.aBoolean128 = true;
		Static7.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	private void method278() {
		@Pc(8) long local8 = Static125.method2075();
		@Pc(12) long local12 = Static31.aLongArray4[Static96.anInt2438];
		Static31.aLongArray4[Static96.anInt2438] = local8;
		@Pc(29) boolean local29;
		if (local12 == 0L || local8 <= local12) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static96.anInt2438 = Static96.anInt2438 + 1 & 0x1F;
		synchronized (this) {
			Static116.aBoolean223 = Static64.aBoolean128;
		}
		this.method281();
	}

	@OriginalMember(owner = "client!lc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!lc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!lc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static103.anApplet_Sub1_1 == this && !Static130.aBoolean244) {
			Static50.aLong36 = Static125.method2075();
			Static85.method1582(5000L);
			Static134.aClass59_2 = null;
			this.method294();
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static21.aFrame1 == null) {
			return Static129.aClass59_5 == null || Static129.aClass59_5.anApplet1 == this ? super.getAppletContext() : Static129.aClass59_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	protected abstract void method281();

	@OriginalMember(owner = "client!lc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static103.anApplet_Sub1_1 != this || Static130.aBoolean244) {
			return;
		}
		Static7.aBoolean20 = true;
		if (Static91.aString3 != null && Static91.aString3.startsWith("1.5") && Static125.method2075() - Static117.aLong77 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || Static88.anInt2284 <= local29.width && local29.height >= Static13.anInt237) {
				Static127.aBoolean242 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
	protected final void method282(@OriginalArg(0) int arg0) {
		try {
			if (Static103.anApplet_Sub1_1 == null) {
				Static13.anInt237 = 503;
				Static130.anInt3005 = 467;
				Static88.anInt2284 = 765;
				Static103.anApplet_Sub1_1 = this;
				if (Static129.aClass59_5 == null) {
					Static134.aClass59_2 = Static129.aClass59_5 = new Class59(false, this, arg0, null, 0);
				}
				Static129.aClass59_5.method1638(1, this);
			} else {
				Static56.anInt1479++;
				if (Static56.anInt1479 >= 3) {
					this.method295("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static92.method1662(local59, null);
			this.method295("crash");
		}
	}

	@OriginalMember(owner = "client!lc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static103.anApplet_Sub1_1 == this && !Static130.aBoolean244) {
			Static50.aLong36 = 0L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	protected abstract void method284();

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	protected abstract void method285();

	@OriginalMember(owner = "client!lc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	protected abstract void method286();

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static91.aString4 != null) {
				@Pc(10) String local10 = Static91.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static91.aString3;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method295("wrongjava");
						return;
					}
					Static41.anInt1095 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static91.aString3 == null || Static91.aString3.equals("1.4.2"))) {
					this.method295("wrongjava");
					return;
				}
			}
			if (Static129.aClass59_5.anApplet1 != null) {
				@Pc(69) Method local69 = Static91.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static129.aClass59_5.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method292();
			Static65.aClass7_1 = Static93.method1732(Static13.anInt237, Static80.aCanvas1, Static88.anInt2284);
			this.method286();
			Static103.aClass14_1 = Static45.method813();
			while (Static50.aLong36 == 0L || Static125.method2075() < Static50.aLong36) {
				Static21.anInt647 = Static103.aClass14_1.method892(Static77.anInt2028, Static41.anInt1095);
				for (@Pc(110) int local110 = 0; local110 < Static21.anInt647; local110++) {
					this.method278();
				}
				this.method290();
				Static49.method884(Static80.aCanvas1, Static129.aClass59_5);
			}
		} catch (@Pc(141) Exception local141) {
			Static92.method1662(local141, null);
			this.method295("crash");
		}
		this.method294();
	}

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z")
	protected final boolean method287() {
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
				this.method295("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static21.aFrame1 == null) {
			return Static129.aClass59_5 == null || Static129.aClass59_5.anApplet1 == this ? super.getParameter(arg0) : Static129.aClass59_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	private void method290() {
		@Pc(7) long local7 = Static30.aLongArray3[Static112.anInt2613];
		@Pc(10) long local10 = Static125.method2075();
		Static30.aLongArray3[Static112.anInt2613] = local10;
		Static112.anInt2613 = Static112.anInt2613 + 1 & 0x1F;
		if (local7 != 0L && local7 < local10) {
			@Pc(37) int local37 = (int) (local10 - local7);
			Static63.anInt399 = ((local37 >> 1) + 32000) / local37;
		}
		if (Static130.anInt2997++ > 50) {
			Static130.anInt2997 -= 50;
			Static7.aBoolean20 = true;
			Static80.aCanvas1.setSize(Static88.anInt2284, Static13.anInt237);
			Static80.aCanvas1.setVisible(true);
			if (Static21.aFrame1 == null) {
				Static80.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static21.aFrame1.getInsets();
				Static80.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method284();
	}

	@OriginalMember(owner = "client!lc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static21.aFrame1 == null) {
			return Static129.aClass59_5 == null || Static129.aClass59_5.anApplet1 == this ? super.getDocumentBase() : Static129.aClass59_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V")
	protected final synchronized void method292() {
		@Pc(9) Container local9;
		if (Static21.aFrame1 == null) {
			local9 = Static129.aClass59_5.anApplet1;
		} else {
			local9 = Static21.aFrame1;
		}
		if (Static80.aCanvas1 != null) {
			Static80.aCanvas1.removeFocusListener(this);
			local9.remove(Static80.aCanvas1);
		}
		Static80.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static80.aCanvas1);
		Static80.aCanvas1.setSize(Static88.anInt2284, Static13.anInt237);
		Static80.aCanvas1.setVisible(true);
		if (Static21.aFrame1 == null) {
			Static80.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(47) Insets local47 = Static21.aFrame1.getInsets();
			Static80.aCanvas1.setLocation(local47.left, local47.top);
		}
		Static80.aCanvas1.addFocusListener(this);
		Static80.aCanvas1.requestFocus();
		Static7.aBoolean20 = true;
		Static127.aBoolean242 = false;
		Static117.aLong77 = Static125.method2075();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	private synchronized void method294() {
		if (Static130.aBoolean244) {
			return;
		}
		Static130.aBoolean244 = true;
		try {
			Static80.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method275();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static21.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static129.aClass59_5 != null) {
			try {
				Static129.aClass59_5.method1642();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method285();
	}

	@OriginalMember(owner = "client!lc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static103.anApplet_Sub1_1 == this && !Static130.aBoolean244) {
			Static50.aLong36 = Static125.method2075() + 4000L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static21.aFrame1 == null) {
			return Static129.aClass59_5 == null || Static129.aClass59_5.anApplet1 == this ? super.getCodeBase() : Static129.aClass59_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method295(@OriginalArg(1) String arg0) {
		if (this.aBoolean33) {
			return;
		}
		this.aBoolean33 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(45) Exception local45) {
		}
	}
}
