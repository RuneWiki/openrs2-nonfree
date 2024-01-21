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

@OriginalClass("client!li")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILjava/lang/String;ZI)V")
	protected final void method488(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static91.anApplet_Sub1_1 = this;
			Static101.anInt2163 = 765;
			Static197.anInt3852 = 498;
			Static90.anInt1933 = 503;
			Static116.aFrame1 = new Frame();
			Static116.aFrame1.setTitle("Jagex");
			Static116.aFrame1.setResizable(false);
			Static116.aFrame1.addWindowListener(this);
			Static116.aFrame1.setVisible(true);
			Static116.aFrame1.toFront();
			@Pc(28) Insets local28 = Static116.aFrame1.getInsets();
			Static116.aFrame1.setSize(local28.right + local28.left + 765, local28.bottom + (503 - -local28.top));
			Static155.aClass12_4 = Static8.aClass12_1 = new Class12(true, null, arg0, arg1, 26);
			Static8.aClass12_1.method297(1, this);
		} catch (@Pc(64) Exception local64) {
			Static51.method890(local64, null);
		}
	}

	@OriginalMember(owner = "client!li", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static91.anApplet_Sub1_1 == this && !Static4.aBoolean4) {
			Static53.aLong64 = 0L;
		}
	}

	@OriginalMember(owner = "client!li", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean13 = false;
	}

	@OriginalMember(owner = "client!li", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean13 = true;
		Static169.aBoolean150 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	protected abstract void method489();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	protected abstract void method490();

	@OriginalMember(owner = "client!li", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static116.aFrame1 == null) {
			return Static8.aClass12_1 == null || Static8.aClass12_1.anApplet1 == this ? super.getDocumentBase() : Static8.aClass12_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static116.aFrame1 == null) {
			return Static8.aClass12_1 == null || Static8.aClass12_1.anApplet1 == this ? super.getAppletContext() : Static8.aClass12_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static91.anApplet_Sub1_1 == this && !Static4.aBoolean4) {
			Static53.aLong64 = Static188.method2822() + 4000L;
		}
	}

	@OriginalMember(owner = "client!li", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static116.aFrame1 == null) {
			return Static8.aClass12_1 == null || Static8.aClass12_1.anApplet1 == this ? super.getParameter(arg0) : Static8.aClass12_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	private void method491() {
		@Pc(6) long local6 = Static188.method2822();
		@Pc(10) long local10 = Static73.aLongArray19[Static74.anInt1610];
		Static73.aLongArray19[Static74.anInt1610] = local6;
		Static74.anInt1610 = Static74.anInt1610 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(36) int local36 = (int) (local6 - local10);
			Static2.anInt21 = ((local36 >> 1) + 32000) / local36;
		}
		if (Static53.anInt1122++ > 50) {
			Static169.aBoolean150 = true;
			Static53.anInt1122 -= 50;
			Static198.aCanvas1.setSize(Static101.anInt2163, Static90.anInt1933);
			Static198.aCanvas1.setVisible(true);
			if (Static116.aFrame1 == null) {
				Static198.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static116.aFrame1.getInsets();
				Static198.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method501();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	private void method492(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static4.aBoolean4) {
				return;
			}
			Static4.aBoolean4 = true;
		}
		if (Static8.aClass12_1.anApplet1 != null) {
			Static8.aClass12_1.anApplet1.destroy();
		}
		if (Static198.aCanvas1 != null) {
			try {
				Static198.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static116.aFrame1 == null) {
					local35 = Static8.aClass12_1.anApplet1;
				} else {
					local35 = Static116.aFrame1;
				}
				local35.remove(Static198.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method495();
		} catch (@Pc(50) Exception local50) {
		}
		if (Static8.aClass12_1 != null) {
			try {
				Static8.aClass12_1.method292();
			} catch (@Pc(57) Exception local57) {
			}
		}
		this.method489();
		if (Static116.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(67) Throwable local67) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!li", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
	protected abstract void method494();

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
	protected abstract void method495();

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
	private void method497() {
		@Pc(11) long local11 = Static188.method2822();
		@Pc(15) long local15 = Static53.aLongArray12[Static27.anInt498];
		Static53.aLongArray12[Static27.anInt498] = local11;
		Static27.anInt498 = Static27.anInt498 + 1 & 0x1F;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		synchronized (this) {
			Static197.aBoolean175 = Static14.aBoolean13;
		}
		this.method490();
	}

	@OriginalMember(owner = "client!li", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static91.anApplet_Sub1_1 == this && !Static4.aBoolean4) {
			Static53.aLong64 = Static188.method2822();
			Static210.method739(5000L);
			Static155.aClass12_4 = null;
			this.method492(false);
		}
	}

	@OriginalMember(owner = "client!li", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!li", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static116.aFrame1 == null) {
			return Static8.aClass12_1 == null || Static8.aClass12_1.anApplet1 == this ? super.getCodeBase() : Static8.aClass12_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	private synchronized void method498() {
		@Pc(10) Container local10;
		if (Static116.aFrame1 == null) {
			local10 = Static8.aClass12_1.anApplet1;
		} else {
			local10 = Static116.aFrame1;
		}
		if (Static198.aCanvas1 != null) {
			Static198.aCanvas1.removeFocusListener(this);
			local10.remove(Static198.aCanvas1);
		}
		Static198.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static198.aCanvas1);
		Static198.aCanvas1.setSize(Static101.anInt2163, Static90.anInt1933);
		Static198.aCanvas1.setVisible(true);
		if (Static116.aFrame1 == null) {
			Static198.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static116.aFrame1.getInsets();
			Static198.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static198.aCanvas1.addFocusListener(this);
		Static198.aCanvas1.requestFocus();
		Static169.aBoolean150 = true;
		Static84.aLong105 = Static188.method2822();
	}

	@OriginalMember(owner = "client!li", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)V")
	protected abstract void method501();

	@OriginalMember(owner = "client!li", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V")
	protected final void method503(@OriginalArg(2) int arg0) {
		try {
			if (Static91.anApplet_Sub1_1 == null) {
				Static90.anInt1933 = 503;
				Static101.anInt2163 = 765;
				Static91.anApplet_Sub1_1 = this;
				Static197.anInt3852 = 498;
				if (Static8.aClass12_1 == null) {
					Static155.aClass12_4 = Static8.aClass12_1 = new Class12(false, this, arg0, null, 0);
				}
				Static8.aClass12_1.method297(1, this);
			} else {
				Static113.anInt2394++;
				if (Static113.anInt2394 >= 3) {
					this.method507("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(67) Exception local67) {
			Static51.method890(local67, null);
			this.method507("crash");
		}
	}

	@OriginalMember(owner = "client!li", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(Z)Z")
	protected final boolean method505() {
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
				this.method507("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!li", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method507(@OriginalArg(1) String arg0) {
		if (this.aBoolean40) {
			return;
		}
		this.aBoolean40 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static19.aString2 != null) {
				@Pc(10) String local10 = Static19.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static19.aString1;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method507("wrongjava");
						return;
					}
					Static80.anInt1800 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static19.aString1 == null || Static19.aString1.equals("1.4.2"))) {
					this.method507("wrongjava");
					return;
				}
			}
			if (Static8.aClass12_1.anApplet1 != null) {
				@Pc(67) Method local67 = Static19.aMethod1;
				if (local67 != null) {
					try {
						local67.invoke(Static8.aClass12_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method498();
			Static197.aClass24_1 = Static135.method2102(Static198.aCanvas1, Static101.anInt2163, Static90.anInt1933);
			this.method494();
			Static52.aClass7_1 = Static59.method1013();
			while (Static53.aLong64 == 0L || Static53.aLong64 > Static188.method2822()) {
				Static128.anInt2678 = Static52.aClass7_1.method1024(Static184.anInt3696, Static80.anInt1800);
				for (@Pc(108) int local108 = 0; local108 < Static128.anInt2678; local108++) {
					this.method497();
				}
				this.method491();
				Static172.method2766(Static198.aCanvas1, Static8.aClass12_1);
			}
		} catch (@Pc(137) Exception local137) {
			Static51.method890(local137, null);
			this.method507("crash");
		}
		this.method492(true);
	}

	@OriginalMember(owner = "client!li", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static91.anApplet_Sub1_1 != this || Static4.aBoolean4) {
			return;
		}
		Static169.aBoolean150 = true;
		if (Static19.aString1 == null || !Static19.aString1.startsWith("1.5") || Static188.method2822() - Static84.aLong105 <= 1000L) {
			return;
		}
		@Pc(30) Rectangle local30 = arg0.getClipBounds();
		@Pc(41) boolean local41;
		if (local30 == null || local30.width >= Static101.anInt2163 && local30.height >= Static90.anInt1933) {
			local41 = true;
		} else {
			local41 = false;
		}
	}

	@OriginalMember(owner = "client!li", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
