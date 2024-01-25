import jagex3.jagmisc.jagmisc;
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

@OriginalClass("client!ss")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!ss", name = "y", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!ss", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static32.anApplet_Sub1_3 == this && !Static322.aBoolean600) {
			Static355.aLong216 = 0L;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public final void method992() {
		if (this.aBoolean132) {
			return;
		}
		try {
			@Pc(14) Class162 local14 = Static15.aClass143_1.method3905(Static32.anApplet_Sub1_3.getClass());
			while (local14.anInt4801 == 0) {
				Static190.method3690(100L);
			}
			if (local14.anObject5 != null) {
				throw (Throwable) local14.anObject5;
			}
			jagmisc.init();
			this.aBoolean132 = true;
			Static172.aClass62_1 = Static24.method665();
		} catch (@Pc(39) Throwable local39) {
		}
	}

	@OriginalMember(owner = "client!ss", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static32.anApplet_Sub1_3 != this || Static322.aBoolean600) {
			return;
		}
		Static262.aBoolean515 = true;
		if (Static234.aBoolean462 && Static162.method3252() - Static111.aLong85 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static170.anInt3645 && Static357.anInt4330 <= local24.height) {
				Static183.aBoolean367 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	protected abstract void method993();

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method995(@OriginalArg(0) String arg0) {
		if (this.aBoolean133) {
			return;
		}
		this.aBoolean133 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static359.method1280(Static15.aClass143_1.anApplet1, "loggedout");
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZLjava/lang/String;IIIII)V")
	protected final void method996(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		try {
			Static194.anInt4145 = 1024;
			Static170.anInt3645 = 1024;
			Static271.anInt5530 = 768;
			Static357.anInt4330 = 768;
			Static35.anInt1167 = 568;
			Static195.anInt4173 = 0;
			Static32.anApplet_Sub1_3 = this;
			Static98.anInt2364 = 0;
			Static84.aFrame1 = new Frame();
			Static84.aFrame1.setTitle("Jagex");
			Static84.aFrame1.setResizable(true);
			Static84.aFrame1.addWindowListener(this);
			Static84.aFrame1.setVisible(true);
			Static84.aFrame1.toFront();
			@Pc(44) Insets local44 = Static84.aFrame1.getInsets();
			Static84.aFrame1.setSize(local44.right + local44.left + Static170.anInt3645, local44.top + Static357.anInt4330 + local44.bottom);
			Static263.aClass143_5 = Static15.aClass143_1 = new Class143(null, arg0, arg1, 29);
			@Pc(78) Class162 local78 = Static15.aClass143_1.method3908(this, 1);
			while (local78.anInt4801 == 0) {
				Static190.method3690(10L);
			}
		} catch (@Pc(91) Exception local91) {
			Static109.method2355(null, local91);
		}
	}

	@OriginalMember(owner = "client!ss", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	protected abstract void method997();

	@OriginalMember(owner = "client!ss", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
	public final synchronized void method998() {
		if (Static349.aCanvas5 != null) {
			Static349.aCanvas5.removeFocusListener(this);
			Static349.aCanvas5.getParent().remove(Static349.aCanvas5);
		}
		@Pc(18) Container local18;
		if (Static197.aFrame2 != null) {
			local18 = Static197.aFrame2;
		} else if (Static84.aFrame1 == null) {
			local18 = Static15.aClass143_1.anApplet1;
		} else {
			local18 = Static84.aFrame1;
		}
		local18.setLayout(null);
		Static349.aCanvas5 = new Canvas_Sub1(this);
		local18.add(Static349.aCanvas5);
		Static349.aCanvas5.setSize(Static194.anInt4145, Static271.anInt5530);
		Static349.aCanvas5.setVisible(true);
		if (Static84.aFrame1 == local18) {
			@Pc(60) Insets local60 = Static84.aFrame1.getInsets();
			Static349.aCanvas5.setLocation(local60.left + Static98.anInt2364, local60.top + Static195.anInt4173);
		} else {
			Static349.aCanvas5.setLocation(Static98.anInt2364, Static195.anInt4173);
		}
		Static349.aCanvas5.addFocusListener(this);
		Static349.aCanvas5.requestFocus();
		Static179.aBoolean359 = true;
		Static145.aBoolean304 = true;
		Static262.aBoolean515 = true;
		Static183.aBoolean367 = false;
		Static111.aLong85 = Static162.method3252();
	}

	@OriginalMember(owner = "client!ss", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static84.aFrame1 == null) {
			return Static15.aClass143_1 == null || Static15.aClass143_1.anApplet1 == this ? super.getDocumentBase() : Static15.aClass143_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static145.aBoolean304 = true;
		Static262.aBoolean515 = true;
	}

	@OriginalMember(owner = "client!ss", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static84.aFrame1 == null) {
			return Static15.aClass143_1 == null || Static15.aClass143_1.anApplet1 == this ? super.getCodeBase() : Static15.aClass143_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	private void method999() {
		@Pc(6) long local6 = Static162.method3252();
		@Pc(10) long local10 = Static199.aLongArray6[Static41.anInt1301];
		Static199.aLongArray6[Static41.anInt1301] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local10 >= local6) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static41.anInt1301 = Static41.anInt1301 + 1 & 0x1F;
		synchronized (this) {
			Static179.aBoolean359 = Static145.aBoolean304;
		}
		this.method993();
	}

	@OriginalMember(owner = "client!ss", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static207.aString39 != null) {
					@Pc(10) String local10 = Static207.aString39.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(24) String local24 = Static207.aString40;
						if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
							this.method995("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static207.aString40 == null || Static207.aString40.equals("1.4.2"))) {
						this.method995("wrongjava");
						break label111;
					}
				}
				@Pc(72) int local72;
				if (Static207.aString40 != null && Static207.aString40.startsWith("1.")) {
					local72 = 2;
					@Pc(74) int local74 = 0;
					while (Static207.aString40.length() > local72) {
						@Pc(80) char local80 = Static207.aString40.charAt(local72);
						if (local80 < '0' || local80 > '9') {
							break;
						}
						local72++;
						local74 = local74 * 10 + local80 - 48;
					}
					if (local74 >= 5) {
						Static234.aBoolean462 = true;
					}
				}
				if (Static15.aClass143_1.anApplet1 != null) {
					@Pc(118) Method local118 = Static207.aMethod1;
					if (local118 != null) {
						try {
							local118.invoke(Static15.aClass143_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(133) Throwable local133) {
						}
					}
				}
				Static120.method2552();
				Static280.method4871();
				this.method998();
				this.method1011();
				Static172.aClass62_1 = Static24.method665();
				this.method992();
				while (Static355.aLong216 == 0L || Static355.aLong216 > Static162.method3252()) {
					Static3.anInt79 = Static172.aClass62_1.method3914(Static239.anInt4961);
					for (local72 = 0; local72 < Static3.anInt79; local72++) {
						this.method999();
					}
					this.method1001();
					Static62.method1535(Static349.aCanvas5, Static15.aClass143_1);
				}
			}
		} catch (@Pc(190) Exception local190) {
			Static109.method2355(null, local190);
			this.method995("crash");
		}
		this.method1003(true);
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V")
	private void method1001() {
		@Pc(13) long local13 = Static162.method3252();
		@Pc(17) long local17 = Static256.aLongArray8[Static297.anInt5823];
		Static256.aLongArray8[Static297.anInt5823] = local13;
		Static297.anInt5823 = Static297.anInt5823 + 1 & 0x1F;
		if (local17 != 0L && local17 < local13) {
			@Pc(43) int local43 = (int) (local13 - local17);
			Static24.anInt942 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static154.anInt3397++ > 50) {
			Static262.aBoolean515 = true;
			Static154.anInt3397 -= 50;
			Static349.aCanvas5.setSize(Static194.anInt4145, Static271.anInt5530);
			Static349.aCanvas5.setVisible(true);
			if (Static84.aFrame1 != null && Static197.aFrame2 == null) {
				@Pc(80) Insets local80 = Static84.aFrame1.getInsets();
				Static349.aCanvas5.setLocation(local80.left + Static98.anInt2364, Static195.anInt4173 + local80.top);
			} else {
				Static349.aCanvas5.setLocation(Static98.anInt2364, Static195.anInt4173);
			}
		}
		this.method1005();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIBII)V")
	protected final void method1002(@OriginalArg(4) int arg0) {
		try {
			if (Static32.anApplet_Sub1_3 == null) {
				Static35.anInt1167 = 568;
				Static271.anInt5530 = 503;
				Static357.anInt4330 = 503;
				Static195.anInt4173 = 0;
				Static98.anInt2364 = 0;
				Static32.anApplet_Sub1_3 = this;
				Static194.anInt4145 = 765;
				Static170.anInt3645 = 765;
				if (Static15.aClass143_1 == null) {
					Static263.aClass143_5 = Static15.aClass143_1 = new Class143(this, arg0, null, 0);
				}
				@Pc(67) Class162 local67 = Static15.aClass143_1.method3908(this, 1);
				while (local67.anInt4801 == 0) {
					Static190.method3690(10L);
				}
			} else {
				Static18.anInt559++;
				if (Static18.anInt559 >= 3) {
					this.method995("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Exception local80) {
			Static109.method2355(null, local80);
			this.method995("crash");
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZB)V")
	private void method1003(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static322.aBoolean600) {
				return;
			}
			Static322.aBoolean600 = true;
		}
		if (Static15.aClass143_1.anApplet1 != null) {
			Static15.aClass143_1.anApplet1.destroy();
		}
		try {
			this.method1007();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean132) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean132 = false;
		}
		@Pc(48) Class162 local48 = Static15.aClass143_1.method3890(Static32.anApplet_Sub1_3.getClass());
		while (local48.anInt4801 == 0) {
			Static190.method3690(100L);
		}
		if (Static349.aCanvas5 != null) {
			try {
				Static349.aCanvas5.removeFocusListener(this);
				Static349.aCanvas5.getParent().remove(Static349.aCanvas5);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (Static15.aClass143_1 != null) {
			try {
				Static15.aClass143_1.method3907();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method997();
		if (Static84.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ss", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static145.aBoolean304 = false;
	}

	@OriginalMember(owner = "client!ss", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ss", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static84.aFrame1 == null) {
			return Static15.aClass143_1 == null || Static15.aClass143_1.anApplet1 == this ? super.getParameter(arg0) : Static15.aClass143_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static84.aFrame1 == null) {
			return Static15.aClass143_1 == null || Static15.aClass143_1.anApplet1 == this ? super.getAppletContext() : Static15.aClass143_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static32.anApplet_Sub1_3 == this && !Static322.aBoolean600) {
			Static355.aLong216 = Static162.method3252() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "(I)V")
	protected abstract void method1005();

	@OriginalMember(owner = "client!ss", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)Z")
	protected final boolean method1006() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.equals("stellardawn.com") || local13.endsWith(".stellardawn.com")) {
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
				this.method995("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "(I)V")
	protected abstract void method1007();

	@OriginalMember(owner = "client!ss", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ss", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static32.anApplet_Sub1_3 == this && !Static322.aBoolean600) {
			Static355.aLong216 = Static162.method3252();
			Static190.method3690(5000L);
			Static263.aClass143_5 = null;
			this.method1003(false);
		}
	}

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
	protected abstract void method1011();
}
