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

@OriginalClass("client!p")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!p", name = "N", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static70.aString4 != null) {
				@Pc(10) String local10 = Static70.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static70.aString5;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method527("wrongjava");
						return;
					}
					Static31.anInt815 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static70.aString5 == null || Static70.aString5.equals("1.4.2"))) {
					this.method527("wrongjava");
					return;
				}
			}
			if (Static32.aClass39_2.anApplet1 != null) {
				@Pc(71) Method local71 = Static70.aMethod2;
				if (local71 != null) {
					try {
						local71.invoke(Static32.aClass39_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(86) Throwable local86) {
					}
				}
			}
			this.method537();
			Static87.aClass30_1 = Static128.method2146(Static102.aCanvas1, Static43.anInt1008, Static147.anInt3307);
			this.method539();
			Static75.aClass69_1 = Static91.method1594();
			while (Static126.aLong136 == 0L || Static126.aLong136 > Static88.method1536()) {
				Static142.anInt3258 = Static75.aClass69_1.method2514(Static134.anInt3063, Static31.anInt815);
				for (@Pc(112) int local112 = 0; local112 < Static142.anInt3258; local112++) {
					this.method532();
				}
				this.method538();
				Static121.method2098(Static102.aCanvas1, Static32.aClass39_2);
			}
		} catch (@Pc(141) Exception local141) {
			Static29.method571(local141, null);
			this.method527("crash");
		}
		this.method526();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	protected abstract void method522();

	@OriginalMember(owner = "client!p", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static13.aBoolean22 = false;
	}

	@OriginalMember(owner = "client!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static90.aFrame1 == null) {
			return Static32.aClass39_2 == null || Static32.aClass39_2.anApplet1 == this ? super.getAppletContext() : Static32.aClass39_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
	protected final boolean method523() {
		@Pc(12) String local12 = this.getDocumentBase().getHost().toLowerCase();
		if (local12.equals("jagex.com") || local12.endsWith(".jagex.com")) {
			return true;
		} else if (local12.equals("runescape.com") || local12.endsWith(".runescape.com")) {
			return true;
		} else if (local12.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local12.length() > 0 && local12.charAt(local12.length() - 1) >= '0' && local12.charAt(local12.length() - 1) <= '9') {
				local12 = local12.substring(0, local12.length() - 1);
			}
			if (local12.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method527("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static90.aFrame1 == null) {
			return Static32.aClass39_2 == null || Static32.aClass39_2.anApplet1 == this ? super.getDocumentBase() : Static32.aClass39_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	protected abstract void method524();

	@OriginalMember(owner = "client!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	protected abstract void method525();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
	private synchronized void method526() {
		if (Static80.aBoolean116) {
			return;
		}
		Static80.aBoolean116 = true;
		try {
			Static102.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method525();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static90.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static32.aClass39_2 != null) {
			try {
				Static32.aClass39_2.method1229();
			} catch (@Pc(32) Exception local32) {
			}
		}
		this.method524();
	}

	@OriginalMember(owner = "client!p", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static141.anApplet_Sub1_1 == this && !Static80.aBoolean116) {
			Static126.aLong136 = Static88.method1536() + 4000L;
		}
	}

	@OriginalMember(owner = "client!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method527(@OriginalArg(1) String arg0) {
		if (this.aBoolean43) {
			return;
		}
		this.aBoolean43 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	private void method532() {
		@Pc(6) long local6 = Static88.method1536();
		@Pc(10) long local10 = Static137.aLongArray4[Static144.anInt3455];
		@Pc(19) boolean local19;
		if (local10 == 0L || local10 >= local6) {
			local19 = false;
		} else {
			local19 = true;
		}
		Static137.aLongArray4[Static144.anInt3455] = local6;
		Static144.anInt3455 = Static144.anInt3455 + 1 & 0x1F;
		synchronized (this) {
			Static153.aBoolean226 = Static13.aBoolean22;
		}
		this.method535();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
	protected final void method533(@OriginalArg(3) int arg0) {
		try {
			if (Static141.anApplet_Sub1_1 == null) {
				Static43.anInt1008 = 503;
				Static147.anInt3307 = 765;
				Static144.anInt3456 = 476;
				Static141.anApplet_Sub1_1 = this;
				if (Static32.aClass39_2 == null) {
					Static130.aClass39_3 = Static32.aClass39_2 = new Class39(false, this, arg0, null, 0);
				}
				Static32.aClass39_2.method1232(this, 1);
			} else {
				Static116.anInt2763++;
				if (Static116.anInt2763 >= 3) {
					this.method527("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(57) Exception local57) {
			Static29.method571(local57, null);
			this.method527("crash");
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	protected abstract void method535();

	@OriginalMember(owner = "client!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static141.anApplet_Sub1_1 != this || Static80.aBoolean116) {
			return;
		}
		Static135.aBoolean209 = true;
		if (Static70.aString5 != null && Static70.aString5.startsWith("1.5") && Static88.method1536() - Static98.aLong102 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static147.anInt3307 && local28.height >= Static43.anInt1008) {
				Static118.aBoolean270 = true;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method536(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static141.anApplet_Sub1_1 = this;
			Static144.anInt3456 = 476;
			Static147.anInt3307 = 765;
			Static43.anInt1008 = 503;
			Static90.aFrame1 = new Frame();
			Static90.aFrame1.setTitle("Jagex");
			Static90.aFrame1.setResizable(false);
			Static90.aFrame1.addWindowListener(this);
			Static90.aFrame1.setVisible(true);
			Static90.aFrame1.toFront();
			@Pc(36) Insets local36 = Static90.aFrame1.getInsets();
			Static90.aFrame1.setSize(local36.left + local36.right + 765, local36.bottom + local36.top + 503);
			Static130.aClass39_3 = Static32.aClass39_2 = new Class39(true, null, arg0, arg1, 16);
			Static32.aClass39_2.method1232(this, 1);
		} catch (@Pc(74) Exception local74) {
			Static29.method571(local74, null);
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	protected final synchronized void method537() {
		@Pc(5) Container local5;
		if (Static90.aFrame1 == null) {
			local5 = Static32.aClass39_2.anApplet1;
		} else {
			local5 = Static90.aFrame1;
		}
		if (Static102.aCanvas1 != null) {
			Static102.aCanvas1.removeFocusListener(this);
			local5.remove(Static102.aCanvas1);
		}
		Static102.aCanvas1 = new Canvas_Sub1(this);
		local5.add(Static102.aCanvas1);
		Static102.aCanvas1.setSize(Static147.anInt3307, Static43.anInt1008);
		Static102.aCanvas1.setVisible(true);
		if (Static90.aFrame1 == null) {
			Static102.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static90.aFrame1.getInsets();
			Static102.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static102.aCanvas1.addFocusListener(this);
		Static102.aCanvas1.requestFocus();
		Static135.aBoolean209 = true;
		Static118.aBoolean270 = false;
		Static98.aLong102 = Static88.method1536();
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	private void method538() {
		@Pc(12) long local12 = Static124.aLongArray3[Static181.anInt3976];
		@Pc(15) long local15 = Static88.method1536();
		Static124.aLongArray3[Static181.anInt3976] = local15;
		Static181.anInt3976 = Static181.anInt3976 + 1 & 0x1F;
		if (local12 != 0L && local12 < local15) {
			@Pc(41) int local41 = (int) (local15 - local12);
			Static4.anInt79 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static19.anInt512++ > 50) {
			Static19.anInt512 -= 50;
			Static135.aBoolean209 = true;
			Static102.aCanvas1.setSize(Static147.anInt3307, Static43.anInt1008);
			Static102.aCanvas1.setVisible(true);
			if (Static90.aFrame1 == null) {
				Static102.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(82) Insets local82 = Static90.aFrame1.getInsets();
				Static102.aCanvas1.setLocation(local82.left, local82.top);
			}
		}
		this.method522();
	}

	@OriginalMember(owner = "client!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static90.aFrame1 == null) {
			return Static32.aClass39_2 == null || Static32.aClass39_2.anApplet1 == this ? super.getParameter(arg0) : Static32.aClass39_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static141.anApplet_Sub1_1 == this && !Static80.aBoolean116) {
			Static126.aLong136 = 0L;
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
	protected abstract void method539();

	@OriginalMember(owner = "client!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static90.aFrame1 == null) {
			return Static32.aClass39_2 == null || Static32.aClass39_2.anApplet1 == this ? super.getCodeBase() : Static32.aClass39_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static13.aBoolean22 = true;
		Static135.aBoolean209 = true;
	}

	@OriginalMember(owner = "client!p", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static141.anApplet_Sub1_1 == this && !Static80.aBoolean116) {
			Static126.aLong136 = Static88.method1536();
			Static166.method2609(5000L);
			Static130.aClass39_3 = null;
			this.method526();
		}
	}
}
