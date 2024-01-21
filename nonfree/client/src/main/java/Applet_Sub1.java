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

@OriginalClass("client!ua")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method525(@OriginalArg(1) String arg0) {
		if (this.aBoolean26) {
			return;
		}
		this.aBoolean26 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static24.aFrame1 == null) {
			return Static45.aClass45_1 == null || Static45.aClass45_1.anApplet1 == this ? super.getDocumentBase() : Static45.aClass45_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static177.anApplet_Sub1_1 == this && !Static181.aBoolean174) {
			Static105.aLong98 = Static108.method1828();
			Static50.method901(5000L);
			Static90.aClass45_3 = null;
			this.method538();
		}
	}

	@OriginalMember(owner = "client!ua", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIBII)V")
	protected final void method527(@OriginalArg(3) int arg0) {
		try {
			if (Static177.anApplet_Sub1_1 == null) {
				Static4.anInt66 = 484;
				Static121.anInt2515 = 765;
				Static177.anApplet_Sub1_1 = this;
				Static124.anInt2737 = 503;
				if (Static45.aClass45_1 == null) {
					Static90.aClass45_3 = Static45.aClass45_1 = new Class45(false, this, arg0, null, 0);
				}
				Static45.aClass45_1.method1479(this, 1);
			} else {
				Static174.anInt3783++;
				if (Static174.anInt3783 >= 3) {
					this.method525("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(63) Exception local63) {
			Static8.method1789(null, local63);
			this.method525("crash");
		}
	}

	@OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static89.aString2 != null) {
				@Pc(10) String local10 = Static89.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static89.aString3;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method525("wrongjava");
						return;
					}
					Static79.anInt4045 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static89.aString3 == null || Static89.aString3.equals("1.4.2"))) {
					this.method525("wrongjava");
					return;
				}
			}
			if (Static45.aClass45_1.anApplet1 != null) {
				@Pc(69) Method local69 = Static89.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static45.aClass45_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method528();
			Static62.aClass24_1 = Static77.method1250(Static124.anInt2737, Static121.anInt2515, Static5.aCanvas1);
			this.method541();
			Static128.aClass54_1 = Static129.method2184();
			while (Static105.aLong98 == 0L || Static105.aLong98 > Static108.method1828()) {
				Static105.anInt2196 = Static128.aClass54_1.method2770(Static123.anInt2729, Static79.anInt4045);
				for (@Pc(110) int local110 = 0; local110 < Static105.anInt2196; local110++) {
					this.method535();
				}
				this.method539();
				Static132.method2219(Static45.aClass45_1, Static5.aCanvas1);
			}
		} catch (@Pc(143) Exception local143) {
			Static8.method1789(null, local143);
			this.method525("crash");
		}
		this.method538();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	protected final synchronized void method528() {
		@Pc(14) Container local14;
		if (Static24.aFrame1 == null) {
			local14 = Static45.aClass45_1.anApplet1;
		} else {
			local14 = Static24.aFrame1;
		}
		if (Static5.aCanvas1 != null) {
			Static5.aCanvas1.removeFocusListener(this);
			local14.remove(Static5.aCanvas1);
		}
		Static5.aCanvas1 = new Canvas_Sub1(this);
		local14.add(Static5.aCanvas1);
		Static5.aCanvas1.setSize(Static121.anInt2515, Static124.anInt2737);
		Static5.aCanvas1.setVisible(true);
		if (Static24.aFrame1 == null) {
			Static5.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static24.aFrame1.getInsets();
			Static5.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static5.aCanvas1.addFocusListener(this);
		Static5.aCanvas1.requestFocus();
		Static74.aBoolean68 = true;
		Static153.aBoolean140 = false;
		Static1.aLong1 = Static108.method1828();
	}

	@OriginalMember(owner = "client!ua", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static24.aFrame1 == null) {
			return Static45.aClass45_1 == null || Static45.aClass45_1.anApplet1 == this ? super.getParameter(arg0) : Static45.aClass45_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	protected abstract void method529();

	@OriginalMember(owner = "client!ua", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean12 = true;
		Static74.aBoolean68 = true;
	}

	@OriginalMember(owner = "client!ua", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)Z")
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
				this.method525("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	protected abstract void method534();

	@OriginalMember(owner = "client!ua", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ua", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(Z)V")
	private void method535() {
		@Pc(6) long local6 = Static108.method1828();
		@Pc(10) long local10 = Static145.aLongArray18[Static87.anInt2930];
		Static145.aLongArray18[Static87.anInt2930] = local6;
		@Pc(23) boolean local23;
		if (local10 == 0L || local6 <= local10) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static87.anInt2930 = Static87.anInt2930 + 1 & 0x1F;
		synchronized (this) {
			Static181.aBoolean173 = Static14.aBoolean12;
		}
		this.method537();
	}

	@OriginalMember(owner = "client!ua", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static177.anApplet_Sub1_1 != this || Static181.aBoolean174) {
			return;
		}
		Static74.aBoolean68 = true;
		if (Static89.aString3 != null && Static89.aString3.startsWith("1.5") && Static108.method1828() - Static1.aLong1 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static121.anInt2515 && Static124.anInt2737 <= local27.height) {
				Static153.aBoolean140 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method536(@OriginalArg(2) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static121.anInt2515 = 765;
			Static124.anInt2737 = 503;
			Static177.anApplet_Sub1_1 = this;
			Static4.anInt66 = 484;
			Static24.aFrame1 = new Frame();
			Static24.aFrame1.setTitle("Jagex");
			Static24.aFrame1.setResizable(false);
			Static24.aFrame1.addWindowListener(this);
			Static24.aFrame1.setVisible(true);
			Static24.aFrame1.toFront();
			@Pc(36) Insets local36 = Static24.aFrame1.getInsets();
			Static24.aFrame1.setSize(local36.left + local36.right + 765, local36.bottom + 503 - -local36.top);
			Static90.aClass45_3 = Static45.aClass45_1 = new Class45(true, null, arg1, arg0, 16);
			Static45.aClass45_1.method1479(this, 1);
		} catch (@Pc(72) Exception local72) {
			Static8.method1789(null, local72);
		}
	}

	@OriginalMember(owner = "client!ua", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	protected abstract void method537();

	@OriginalMember(owner = "client!ua", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	private synchronized void method538() {
		if (Static181.aBoolean174) {
			return;
		}
		Static181.aBoolean174 = true;
		try {
			Static5.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method529();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static24.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static45.aClass45_1 != null) {
			try {
				Static45.aClass45_1.method1485();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method540();
	}

	@OriginalMember(owner = "client!ua", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static177.anApplet_Sub1_1 == this && !Static181.aBoolean174) {
			Static105.aLong98 = 0L;
		}
	}

	@OriginalMember(owner = "client!ua", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static177.anApplet_Sub1_1 == this && !Static181.aBoolean174) {
			Static105.aLong98 = Static108.method1828() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ua", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static24.aFrame1 == null) {
			return Static45.aClass45_1 == null || Static45.aClass45_1.anApplet1 == this ? super.getAppletContext() : Static45.aClass45_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static24.aFrame1 == null) {
			return Static45.aClass45_1 == null || Static45.aClass45_1.anApplet1 == this ? super.getCodeBase() : Static45.aClass45_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean12 = false;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	private void method539() {
		@Pc(6) long local6 = Static108.method1828();
		@Pc(18) long local18 = Static86.aLongArray20[Static77.anInt1625];
		Static86.aLongArray20[Static77.anInt1625] = local6;
		if (local18 != 0L && local6 > local18) {
			@Pc(40) int local40 = (int) (local6 - local18);
			Static131.anInt3731 = ((local40 >> 1) + 32000) / local40;
		}
		Static77.anInt1625 = Static77.anInt1625 + 1 & 0x1F;
		if (Static18.anInt384++ > 50) {
			Static18.anInt384 -= 50;
			Static74.aBoolean68 = true;
			Static5.aCanvas1.setSize(Static121.anInt2515, Static124.anInt2737);
			Static5.aCanvas1.setVisible(true);
			if (Static24.aFrame1 == null) {
				Static5.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(88) Insets local88 = Static24.aFrame1.getInsets();
				Static5.aCanvas1.setLocation(local88.left, local88.top);
			}
		}
		this.method534();
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V")
	protected abstract void method540();

	@OriginalMember(owner = "client!ua", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	protected abstract void method541();
}
