import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
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

@OriginalClass("client!n")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!n", name = "providesignlink", descriptor = "(Lclient!ej;)V")
	public static void providesignlink(@OriginalArg(0) Class34 arg0) {
		Static117.aClass34_2 = arg0;
		Static192.aClass34_4 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static53.aString2 != null) {
				@Pc(10) String local10 = Static53.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static53.aString4;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method656("wrongjava");
						return;
					}
					Static55.anInt1393 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static53.aString4 == null || Static53.aString4.equals("1.4.2"))) {
					this.method656("wrongjava");
					return;
				}
			}
			if (Static117.aClass34_2.anApplet1 != null) {
				@Pc(70) Method local70 = Static53.aMethod1;
				if (local70 != null) {
					try {
						local70.invoke(Static117.aClass34_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method665();
			Static42.aClass23_1 = Static94.method1578(Static158.anInt3484, Static180.anInt4990, Static203.aCanvas3);
			this.method670();
			Static213.aClass2_1 = Static67.method1226();
			while (Static228.aLong176 == 0L || Static209.method3309() < Static228.aLong176) {
				Static147.anInt3166 = Static213.aClass2_1.method2858(Static55.anInt1393, Static191.anInt4239);
				for (@Pc(111) int local111 = 0; local111 < Static147.anInt3166; local111++) {
					this.method653();
				}
				this.method668();
				Static69.method1242(Static203.aCanvas3, Static117.aClass34_2);
			}
		} catch (@Pc(146) Exception local146) {
			Static81.method1384(local146, null);
			this.method656("crash");
		}
		this.method669(true);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	private void method653() {
		@Pc(6) long local6 = Static209.method3309();
		@Pc(10) long local10 = Static64.aLongArray3[Static227.anInt4915];
		@Pc(19) boolean local19;
		if (local10 == 0L || local10 >= local6) {
			local19 = false;
		} else {
			local19 = true;
		}
		Static64.aLongArray3[Static227.anInt4915] = local6;
		Static227.anInt4915 = Static227.anInt4915 + 1 & 0x1F;
		synchronized (this) {
			Static194.aBoolean377 = Static40.aBoolean82;
		}
		this.method662();
	}

	@OriginalMember(owner = "client!n", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	protected abstract void method654();

	@OriginalMember(owner = "client!n", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static125.aFrame2 == null) {
			return Static117.aClass34_2 == null || Static117.aClass34_2.anApplet1 == this ? super.getAppletContext() : Static117.aClass34_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Z")
	protected final boolean method655() {
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
				this.method656("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method656(@OriginalArg(1) String arg0) {
		if (this.aBoolean61) {
			return;
		}
		this.aBoolean61 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!n", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static39.anApplet_Sub1_1 == this && !Static209.aBoolean397) {
			Static228.aLong176 = 0L;
		}
	}

	@OriginalMember(owner = "client!n", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static39.anApplet_Sub1_1 == this && !Static209.aBoolean397) {
			Static228.aLong176 = Static209.method3309() + 4000L;
		}
	}

	@OriginalMember(owner = "client!n", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static40.aBoolean82 = true;
		Static129.aBoolean235 = true;
	}

	@OriginalMember(owner = "client!n", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static125.aFrame2 == null) {
			return Static117.aClass34_2 == null || Static117.aClass34_2.anApplet1 == this ? super.getParameter(arg0) : Static117.aClass34_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static40.aBoolean82 = false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method660(@OriginalArg(5) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static18.anInt379 = 0;
			Static180.anInt4990 = 503;
			Static209.anInt4462 = 503;
			Static158.anInt3484 = 765;
			Static154.anInt3388 = 765;
			Static146.anInt3165 = 507;
			Static196.anInt4302 = 0;
			Static39.anApplet_Sub1_1 = this;
			Static125.aFrame2 = new Frame();
			Static125.aFrame2.setTitle("Jagex");
			Static125.aFrame2.setResizable(true);
			Static125.aFrame2.addWindowListener(this);
			Static125.aFrame2.setVisible(true);
			Static125.aFrame2.toFront();
			@Pc(42) Insets local42 = Static125.aFrame2.getInsets();
			Static125.aFrame2.setSize(local42.left + Static154.anInt3388 + local42.right, local42.bottom + local42.top + Static209.anInt4462);
			Static192.aClass34_4 = Static117.aClass34_2 = new Class34(true, null, arg1, arg0, 27);
			Static117.aClass34_2.method1068(1, this);
		} catch (@Pc(77) Exception local77) {
			Static81.method1384(local77, null);
		}
	}

	@OriginalMember(owner = "client!n", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static39.anApplet_Sub1_1 != this || Static209.aBoolean397) {
			return;
		}
		Static129.aBoolean235 = true;
		if (Static53.aString4 != null && Static53.aString4.startsWith("1.5") && Static209.method3309() - Static77.aLong60 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static154.anInt3388 <= local28.width && local28.height >= Static209.anInt4462) {
				Static91.aBoolean180 = true;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	protected abstract void method662();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	protected final void method663(@OriginalArg(0) int arg0) {
		try {
			if (Static39.anApplet_Sub1_1 == null) {
				Static146.anInt3165 = 507;
				Static158.anInt3484 = 765;
				Static154.anInt3388 = 765;
				Static39.anApplet_Sub1_1 = this;
				Static18.anInt379 = 0;
				Static180.anInt4990 = 503;
				Static209.anInt4462 = 503;
				Static196.anInt4302 = 0;
				@Pc(44) String local44 = this.getParameter("openwinjs");
				@Pc(51) boolean local51;
				if (local44 != null && local44.equals("1")) {
					local51 = true;
				} else {
					local51 = false;
				}
				if (Static117.aClass34_2 == null) {
					Static192.aClass34_4 = Static117.aClass34_2 = new Class34(false, this, arg0, null, 0);
				}
				Static117.aClass34_2.method1068(1, this);
			} else {
				Static147.anInt3168++;
				if (Static147.anInt3168 >= 3) {
					this.method656("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(75) Exception local75) {
			Static81.method1384(local75, null);
			this.method656("crash");
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	protected abstract void method664();

	@OriginalMember(owner = "client!n", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static125.aFrame2 == null) {
			return Static117.aClass34_2 == null || Static117.aClass34_2.anApplet1 == this ? super.getDocumentBase() : Static117.aClass34_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	public final synchronized void method665() {
		if (Static203.aCanvas3 != null) {
			Static203.aCanvas3.removeFocusListener(this);
			Static203.aCanvas3.getParent().remove(Static203.aCanvas3);
		}
		@Pc(22) Container local22;
		if (Static34.aFrame1 != null) {
			local22 = Static34.aFrame1;
		} else if (Static125.aFrame2 == null) {
			local22 = Static117.aClass34_2.anApplet1;
		} else {
			local22 = Static125.aFrame2;
		}
		local22.setLayout(null);
		Static203.aCanvas3 = new Canvas_Sub1(this);
		local22.add(Static203.aCanvas3);
		Static203.aCanvas3.setSize(Static158.anInt3484, Static180.anInt4990);
		Static203.aCanvas3.setVisible(true);
		if (local22 == Static125.aFrame2) {
			@Pc(58) Insets local58 = Static125.aFrame2.getInsets();
			Static203.aCanvas3.setLocation(local58.left + Static18.anInt379, local58.top - -Static196.anInt4302);
		} else {
			Static203.aCanvas3.setLocation(Static18.anInt379, Static196.anInt4302);
		}
		Static203.aCanvas3.addFocusListener(this);
		Static203.aCanvas3.requestFocus();
		Static40.aBoolean82 = true;
		Static129.aBoolean235 = true;
		Static194.aBoolean377 = true;
		Static91.aBoolean180 = false;
		Static77.aLong60 = Static209.method3309();
	}

	@OriginalMember(owner = "client!n", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	protected abstract void method667();

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)V")
	private void method668() {
		@Pc(8) long local8 = Static209.method3309();
		@Pc(19) long local19 = Static231.aLongArray8[Static114.anInt2520];
		Static231.aLongArray8[Static114.anInt2520] = local8;
		Static114.anInt2520 = Static114.anInt2520 + 1 & 0x1F;
		if (local19 != 0L && local19 < local8) {
			@Pc(45) int local45 = (int) (local8 - local19);
			Static124.anInt2696 = ((local45 >> 1) + 32000) / local45;
		}
		if (Static106.anInt2333++ > 50) {
			Static106.anInt2333 -= 50;
			Static129.aBoolean235 = true;
			Static203.aCanvas3.setSize(Static158.anInt3484, Static180.anInt4990);
			Static203.aCanvas3.setVisible(true);
			if (Static125.aFrame2 != null && Static34.aFrame1 == null) {
				@Pc(88) Insets local88 = Static125.aFrame2.getInsets();
				Static203.aCanvas3.setLocation(Static18.anInt379 + local88.left, local88.top - -Static196.anInt4302);
			} else {
				Static203.aCanvas3.setLocation(Static18.anInt379, Static196.anInt4302);
			}
		}
		this.method654();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZZ)V")
	private void method669(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static209.aBoolean397) {
				return;
			}
			Static209.aBoolean397 = true;
		}
		if (Static117.aClass34_2.anApplet1 != null) {
			Static117.aClass34_2.anApplet1.destroy();
		}
		try {
			this.method667();
		} catch (@Pc(31) Exception local31) {
		}
		if (Static203.aCanvas3 != null) {
			try {
				Static203.aCanvas3.removeFocusListener(this);
				Static203.aCanvas3.getParent().remove(Static203.aCanvas3);
			} catch (@Pc(42) Exception local42) {
			}
		}
		if (Static117.aClass34_2 != null) {
			try {
				Static117.aClass34_2.method1064();
			} catch (@Pc(50) Exception local50) {
			}
		}
		this.method664();
		if (Static125.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(60) Throwable local60) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
	protected abstract void method670();

	@OriginalMember(owner = "client!n", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!n", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static125.aFrame2 == null) {
			return Static117.aClass34_2 == null || Static117.aClass34_2.anApplet1 == this ? super.getCodeBase() : Static117.aClass34_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!n", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!n", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!n", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static39.anApplet_Sub1_1 == this && !Static209.aBoolean397) {
			Static228.aLong176 = Static209.method3309();
			Static148.method2431(5000L);
			Static192.aClass34_4 = null;
			this.method669(false);
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
}
