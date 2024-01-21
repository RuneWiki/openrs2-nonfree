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

@OriginalClass("client!rg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rg", name = "P", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!rg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static203.anApplet_Sub1_1 != this || Static37.aBoolean38) {
			return;
		}
		Static197.aBoolean180 = true;
		if (Static75.aString2 == null || !Static75.aString2.startsWith("1.5") || Static104.method1634() - Static195.aLong134 <= 1000L) {
			return;
		}
		@Pc(30) Rectangle local30 = arg0.getClipBounds();
		@Pc(41) boolean local41;
		if (local30 == null || Static169.anInt3579 <= local30.width && local30.height >= Static42.anInt4285) {
			local41 = true;
		} else {
			local41 = false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBIII)V")
	protected final void method508(@OriginalArg(4) int arg0) {
		try {
			if (Static203.anApplet_Sub1_1 == null) {
				Static145.anInt3128 = 496;
				Static203.anApplet_Sub1_1 = this;
				Static42.anInt4285 = 503;
				Static169.anInt3579 = 765;
				if (Static170.aClass41_3 == null) {
					Static33.aClass41_1 = Static170.aClass41_3 = new Class41(false, this, arg0, null, 0);
				}
				Static170.aClass41_3.method1044(this, 1);
			} else {
				Static59.anInt1231++;
				if (Static59.anInt1231 >= 3) {
					this.method510("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(58) Exception local58) {
			Static84.method2582(null, local58);
			this.method510("crash");
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	protected abstract void method509();

	@OriginalMember(owner = "client!rg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static145.aBoolean137 = true;
		Static197.aBoolean180 = true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method510(@OriginalArg(1) String arg0) {
		if (this.aBoolean28) {
			return;
		}
		this.aBoolean28 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!rg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static113.aFrame1 == null) {
			return Static170.aClass41_3 == null || Static170.aClass41_3.anApplet1 == this ? super.getParameter(arg0) : Static170.aClass41_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	private void method511() {
		@Pc(6) long local6 = Static104.method1634();
		@Pc(10) long local10 = Static184.aLongArray4[Static121.anInt2684];
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static184.aLongArray4[Static121.anInt2684] = local6;
		Static121.anInt2684 = Static121.anInt2684 + 1 & 0x1F;
		synchronized (this) {
			Static46.aBoolean47 = Static145.aBoolean137;
		}
		this.method513();
	}

	@OriginalMember(owner = "client!rg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static203.anApplet_Sub1_1 == this && !Static37.aBoolean38) {
			Static141.aLong58 = Static104.method1634();
			Static117.method1813(5000L);
			Static33.aClass41_1 = null;
			this.method518(false);
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	protected abstract void method512();

	@OriginalMember(owner = "client!rg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static145.aBoolean137 = false;
	}

	@OriginalMember(owner = "client!rg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static113.aFrame1 == null) {
			return Static170.aClass41_3 == null || Static170.aClass41_3.anApplet1 == this ? super.getDocumentBase() : Static170.aClass41_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static203.anApplet_Sub1_1 == this && !Static37.aBoolean38) {
			Static141.aLong58 = Static104.method1634() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static113.aFrame1 == null) {
			return Static170.aClass41_3 == null || Static170.aClass41_3.anApplet1 == this ? super.getAppletContext() : Static170.aClass41_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
	protected abstract void method513();

	@OriginalMember(owner = "client!rg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)Z")
	protected final boolean method514() {
		@Pc(4) String local4 = this.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method510("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	private synchronized void method515() {
		@Pc(6) Container local6;
		if (Static113.aFrame1 == null) {
			local6 = Static170.aClass41_3.anApplet1;
		} else {
			local6 = Static113.aFrame1;
		}
		if (Static139.aCanvas1 != null) {
			Static139.aCanvas1.removeFocusListener(this);
			local6.remove(Static139.aCanvas1);
		}
		Static139.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static139.aCanvas1);
		Static139.aCanvas1.setSize(Static169.anInt3579, Static42.anInt4285);
		Static139.aCanvas1.setVisible(true);
		if (Static113.aFrame1 == null) {
			Static139.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static113.aFrame1.getInsets();
			Static139.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static139.aCanvas1.addFocusListener(this);
		Static139.aCanvas1.requestFocus();
		Static197.aBoolean180 = true;
		Static195.aLong134 = Static104.method1634();
	}

	@OriginalMember(owner = "client!rg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static113.aFrame1 == null) {
			return Static170.aClass41_3 == null || Static170.aClass41_3.anApplet1 == this ? super.getCodeBase() : Static170.aClass41_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	private void method518(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static37.aBoolean38) {
				return;
			}
			Static37.aBoolean38 = true;
		}
		if (Static170.aClass41_3.anApplet1 != null) {
			Static170.aClass41_3.anApplet1.destroy();
		}
		if (Static139.aCanvas1 != null) {
			try {
				Static139.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static113.aFrame1 == null) {
					local35 = Static170.aClass41_3.anApplet1;
				} else {
					local35 = Static113.aFrame1;
				}
				local35.remove(Static139.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method509();
		} catch (@Pc(50) Exception local50) {
		}
		if (Static170.aClass41_3 != null) {
			try {
				Static170.aClass41_3.method1043();
			} catch (@Pc(57) Exception local57) {
			}
		}
		this.method512();
		if (Static113.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(69) Throwable local69) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!rg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static203.anApplet_Sub1_1 == this && !Static37.aBoolean38) {
			Static141.aLong58 = 0L;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	protected final void method519(@OriginalArg(1) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static42.anInt4285 = 503;
			Static169.anInt3579 = 765;
			Static203.anApplet_Sub1_1 = this;
			Static145.anInt3128 = 496;
			Static113.aFrame1 = new Frame();
			Static113.aFrame1.setTitle("Jagex");
			Static113.aFrame1.setResizable(false);
			Static113.aFrame1.addWindowListener(this);
			Static113.aFrame1.setVisible(true);
			Static113.aFrame1.toFront();
			@Pc(28) Insets local28 = Static113.aFrame1.getInsets();
			Static113.aFrame1.setSize(local28.left + local28.right + 765, local28.top + 503 - -local28.bottom);
			Static33.aClass41_1 = Static170.aClass41_3 = new Class41(true, null, arg0, arg1, 24);
			Static170.aClass41_3.method1044(this, 1);
		} catch (@Pc(72) Exception local72) {
			Static84.method2582(null, local72);
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)V")
	protected abstract void method520();

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
	protected abstract void method521();

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(B)V")
	private void method522() {
		@Pc(7) long local7 = Static99.aLongArray5[Static179.anInt3764];
		@Pc(10) long local10 = Static104.method1634();
		Static99.aLongArray5[Static179.anInt3764] = local10;
		if (local7 != 0L && local7 < local10) {
			@Pc(36) int local36 = (int) (local10 - local7);
			Static165.anInt3491 = ((local36 >> 1) + 32000) / local36;
		}
		Static179.anInt3764 = Static179.anInt3764 + 1 & 0x1F;
		if (Static85.anInt1781++ > 50) {
			Static85.anInt1781 -= 50;
			Static197.aBoolean180 = true;
			Static139.aCanvas1.setSize(Static169.anInt3579, Static42.anInt4285);
			Static139.aCanvas1.setVisible(true);
			if (Static113.aFrame1 == null) {
				Static139.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static113.aFrame1.getInsets();
				Static139.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method521();
	}

	@OriginalMember(owner = "client!rg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static75.aString4 != null) {
				@Pc(10) String local10 = Static75.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static75.aString2;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method510("wrongjava");
						return;
					}
					Static15.anInt356 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static75.aString2 == null || Static75.aString2.equals("1.4.2"))) {
					this.method510("wrongjava");
					return;
				}
			}
			if (Static170.aClass41_3.anApplet1 != null) {
				@Pc(69) Method local69 = Static75.aMethod2;
				if (local69 != null) {
					try {
						local69.invoke(Static170.aClass41_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method515();
			Static127.aClass46_1 = Static58.method798(Static169.anInt3579, Static42.anInt4285, Static139.aCanvas1);
			this.method520();
			Static138.aClass6_1 = Static204.method2970();
			while (Static141.aLong58 == 0L || Static141.aLong58 > Static104.method1634()) {
				Static30.anInt732 = Static138.aClass6_1.method1721(Static15.anInt356, Static39.anInt4450);
				for (@Pc(110) int local110 = 0; local110 < Static30.anInt732; local110++) {
					this.method511();
				}
				this.method522();
				Static40.method663(Static139.aCanvas1, Static170.aClass41_3);
			}
		} catch (@Pc(139) Exception local139) {
			Static84.method2582(null, local139);
			this.method510("crash");
		}
		this.method518(true);
	}
}
