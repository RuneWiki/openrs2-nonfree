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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
	public static int[] anIntArray57 = new int[256];

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
	private boolean aBoolean20 = false;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(27) int local27 = local24;
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				if ((local27 & 0x1) == 1) {
					local27 = local27 >>> 1 ^ 0xEDB88320;
				} else {
					local27 >>>= 0x1;
				}
			}
			anIntArray57[local24] = local27;
		}
	}

	@OriginalMember(owner = "client!n", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static98.aBoolean115 = false;
	}

	@OriginalMember(owner = "client!n", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static104.aFrame1 == null) {
			return Static1.aClass55_1 == null || Static1.aClass55_1.anApplet1 == this ? super.getCodeBase() : Static1.aClass55_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	protected abstract void method363();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	protected final synchronized void method364() {
		System.out.println("addcanvas");
		@Pc(13) Container local13;
		if (Static104.aFrame1 == null) {
			local13 = Static1.aClass55_1.anApplet1;
		} else {
			local13 = Static104.aFrame1;
		}
		if (Static38.aCanvas1 != null) {
			Static38.aCanvas1.removeFocusListener(this);
			local13.remove(Static38.aCanvas1);
		}
		Static38.aCanvas1 = new Canvas_Sub1(this);
		local13.add(Static38.aCanvas1);
		Static38.aCanvas1.setSize(Static34.anInt1002, Static53.anInt1454);
		Static38.aCanvas1.setVisible(true);
		if (Static104.aFrame1 == null) {
			Static38.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(56) Insets local56 = Static104.aFrame1.getInsets();
			Static38.aCanvas1.setLocation(local56.left, local56.top);
		}
		Static38.aCanvas1.addFocusListener(this);
		Static38.aCanvas1.requestFocus();
		Static40.aBoolean51 = true;
		Static50.aBoolean67 = false;
		Static8.aLong10 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;IILjava/net/InetAddress;III)V")
	protected final void method365(@OriginalArg(1) String arg0, @OriginalArg(4) InetAddress arg1, @OriginalArg(5) int arg2) {
		try {
			Static53.anInt1454 = 503;
			Static96.anApplet_Sub1_1 = this;
			Static56.anInt1498 = 414;
			Static34.anInt1002 = 765;
			Static104.aFrame1 = new Frame();
			Static104.aFrame1.setTitle("Jagex");
			Static104.aFrame1.setResizable(false);
			Static104.aFrame1.addWindowListener(this);
			Static104.aFrame1.setVisible(true);
			Static104.aFrame1.toFront();
			@Pc(36) Insets local36 = Static104.aFrame1.getInsets();
			Static104.aFrame1.setSize(local36.right + local36.left + 765, 503 - -local36.top - -local36.bottom);
			Static76.aClass55_3 = Static1.aClass55_1 = new Class55(true, null, arg1, arg2, arg0, 12);
			Static1.aClass55_1.method1404(this, 1);
		} catch (@Pc(74) Exception local74) {
			Static99.method1580(null, local74);
		}
	}

	@OriginalMember(owner = "client!n", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static98.aBoolean115 = true;
		Static40.aBoolean51 = true;
	}

	@OriginalMember(owner = "client!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static96.anApplet_Sub1_1 != this || Static32.aBoolean45) {
			return;
		}
		Static40.aBoolean51 = true;
		if (Static86.aString4 == null || !Static86.aString4.startsWith("1.5") || System.currentTimeMillis() - Static8.aLong10 <= 1000L) {
			return;
		}
		@Pc(26) Rectangle local26 = arg0.getClipBounds();
		if (local26 == null) {
			System.out.println("Rect: null");
		} else {
			System.out.println("Rect: " + local26.x + "," + local26.y + "," + local26.width + "," + local26.height);
		}
		if (local26 == null || Static34.anInt1002 <= local26.width && Static53.anInt1454 <= local26.height) {
			Static50.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!n", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static96.anApplet_Sub1_1 == this && !Static32.aBoolean45) {
			Static38.aLong31 = 0L;
		}
	}

	@OriginalMember(owner = "client!n", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static96.anApplet_Sub1_1 == this && !Static32.aBoolean45) {
			Static38.aLong31 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!n", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method366(@OriginalArg(0) String arg0) {
		if (this.aBoolean20) {
			return;
		}
		this.aBoolean20 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!n", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	private void method367() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Static61.aLongArray5[Static51.anInt1424];
		@Pc(19) boolean local19;
		if ((long) 0 == local9 || local9 >= local5) {
			local19 = false;
		} else {
			local19 = true;
		}
		Static61.aLongArray5[Static51.anInt1424] = local5;
		Static51.anInt1424 = Static51.anInt1424 + 1 & 0x1F;
		synchronized (this) {
			Static58.aBoolean74 = Static98.aBoolean115;
		}
		this.method373();
	}

	@OriginalMember(owner = "client!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	protected abstract void method368();

	@OriginalMember(owner = "client!n", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!n", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static104.aFrame1 == null) {
			return Static1.aClass55_1 == null || Static1.aClass55_1.anApplet1 == this ? super.getParameter(arg0) : Static1.aClass55_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)Z")
	protected final boolean method370() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.endsWith("jagex.com")) {
			return true;
		} else if (local14.endsWith("runescape.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method366("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	protected abstract void method371();

	@OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static86.aString3 != null) {
				@Pc(10) String local10 = Static86.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(38) String local38 = Static86.aString4;
					if (local38.equals("1.1") || local38.startsWith("1.1.") || local38.equals("1.2") || local38.startsWith("1.2.")) {
						this.method366("wrongjava");
						return;
					}
					Static13.anInt385 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static86.aString4 == null || Static86.aString4.equals("1.4.2"))) {
					this.method366("wrongjava");
					return;
				}
			}
			this.method364();
			Static99.aClass15_38 = Static8.method166(Static38.aCanvas1, Static53.anInt1454, Static34.anInt1002);
			this.method371();
			Static57.aClass7_1 = Static78.method1238();
			Static57.aClass7_1.method242();
			while (Static38.aLong31 == 0L || System.currentTimeMillis() < Static38.aLong31) {
				Static48.anInt1335 = Static57.aClass7_1.method241(Static13.anInt385, Static6.anInt69);
				for (@Pc(89) int local89 = 0; local89 < Static48.anInt1335; local89++) {
					this.method367();
				}
				this.method377();
			}
		} catch (@Pc(111) Exception local111) {
			Static99.method1580(null, local111);
			this.method366("crash");
		}
		this.method376();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	protected final void method372(@OriginalArg(4) int arg0) {
		try {
			if (Static96.anApplet_Sub1_1 == null) {
				Static96.anApplet_Sub1_1 = this;
				Static56.anInt1498 = 414;
				Static34.anInt1002 = 765;
				Static53.anInt1454 = 503;
				if (Static1.aClass55_1 == null) {
					Static76.aClass55_3 = Static1.aClass55_1 = new Class55(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static1.aClass55_1.method1404(this, 1);
			} else {
				this.method366("alreadyloaded");
			}
		} catch (@Pc(49) Exception local49) {
			Static99.method1580(null, local49);
			this.method366("crash");
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	protected abstract void method373();

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	protected abstract void method374();

	@OriginalMember(owner = "client!n", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static104.aFrame1 == null) {
			return Static1.aClass55_1 == null || Static1.aClass55_1.anApplet1 == this ? super.getDocumentBase() : Static1.aClass55_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	private synchronized void method376() {
		if (Static32.aBoolean45) {
			return;
		}
		Static32.aBoolean45 = true;
		try {
			Static38.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method363();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static104.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static1.aClass55_1 != null) {
			try {
				Static1.aClass55_1.method1402();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method374();
	}

	@OriginalMember(owner = "client!n", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(B)V")
	private void method377() {
		@Pc(9) long local9 = System.currentTimeMillis();
		@Pc(13) long local13 = Static30.aLongArray3[Static47.anInt1301];
		Static30.aLongArray3[Static47.anInt1301] = local9;
		Static47.anInt1301 = Static47.anInt1301 + 1 & 0x1F;
		if (local13 != 0L && local13 < local9) {
			@Pc(39) int local39 = (int) (local9 - local13);
			Static51.anInt1423 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static8.anInt208++ > 50) {
			Static8.anInt208 -= 50;
			Static40.aBoolean51 = true;
			Static38.aCanvas1.setSize(Static34.anInt1002, Static53.anInt1454);
			Static38.aCanvas1.setVisible(true);
			if (Static104.aFrame1 == null) {
				Static38.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(78) Insets local78 = Static104.aFrame1.getInsets();
				Static38.aCanvas1.setLocation(local78.left, local78.top);
			}
		}
		this.method368();
	}

	@OriginalMember(owner = "client!n", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static104.aFrame1 == null) {
			return Static1.aClass55_1 == null || Static1.aClass55_1.anApplet1 == this ? super.getAppletContext() : Static1.aClass55_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static96.anApplet_Sub1_1 == this && !Static32.aBoolean45) {
			Static38.aLong31 = System.currentTimeMillis();
			Static93.method1123(5000L);
			Static76.aClass55_3 = null;
			this.method376();
		}
	}

	@OriginalMember(owner = "client!n", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
