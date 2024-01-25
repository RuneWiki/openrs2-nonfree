import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!dj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!dj", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static617.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Z")
	public final boolean method1046() {
		return Static550.method7576("jaclib");
	}

	@OriginalMember(owner = "client!dj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static202.aFrame2 == null) {
			return Static617.anApplet2 == null || Static617.anApplet2 == this ? super.getAppletContext() : Static617.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static204.aBoolean247 = false;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Z")
	public final boolean method1048() {
		return Static550.method7576("jagtheora");
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	private void method1049() {
		@Pc(6) long local6 = Static476.method6413();
		@Pc(10) long local10 = Static573.aLongArray48[Static641.anInt10325];
		Static573.aLongArray48[Static641.anInt10325] = local6;
		Static641.anInt10325 = Static641.anInt10325 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local6 <= local10) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static223.aBoolean258 = Static204.aBoolean247;
		}
		this.method1054();
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method1051() {
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
	protected abstract void method1052();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZI)V")
	private void method1053(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static424.aBoolean494) {
				return;
			}
			Static424.aBoolean494 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static617.anApplet2 != null) {
			Static617.anApplet2.destroy();
		}
		try {
			this.method1062();
		} catch (@Pc(46) Exception local46) {
		}
		if (this.aBoolean104) {
			try {
				jagmisc.quit();
			} catch (@Pc(52) Throwable local52) {
			}
			this.aBoolean104 = false;
		}
		Static400.method5446();
		Static537.method7409();
		if (Static504.aCanvas11 != null) {
			try {
				Static504.aCanvas11.removeFocusListener(this);
				Static504.aCanvas11.getParent().remove(Static504.aCanvas11);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static452.aClass226_6 != null) {
			try {
				Static452.aClass226_6.method4853();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1057();
		if (Static202.aFrame2 != null) {
			Static202.aFrame2.setVisible(false);
			Static202.aFrame2.dispose();
			Static202.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
	protected abstract void method1054();

	@OriginalMember(owner = "client!dj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static202.aFrame2 == null) {
			return Static617.anApplet2 == null || Static617.anApplet2 == this ? super.getCodeBase() : Static617.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static204.aBoolean247 = true;
		Static377.aBoolean430 = true;
	}

	@OriginalMember(owner = "client!dj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static263.anApplet_Sub1_1 == this && !Static424.aBoolean494) {
			Static298.aLong132 = 0L;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method1055(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static263.anApplet_Sub1_1 == null) {
				Static641.anInt10326 = 631;
				Static263.anApplet_Sub1_1 = this;
				Static322.anApplet1 = Static617.anApplet2;
				Static223.anInt3639 = 0;
				Static153.anInt2747 = arg0;
				Static236.anInt3828 = arg0;
				Static394.anInt6214 = 0;
				Static511.anInt8548 = arg3;
				Static550.anInt9024 = arg3;
				Static252.aClass226_3 = Static452.aClass226_6 = new Class226(arg2, arg1, 37, Static617.anApplet2 != null);
				@Pc(72) Class108 local72 = Static452.aClass226_6.method4842(this, 1);
				while (local72.anInt2766 == 0) {
					Static444.method6061(10L);
				}
			} else {
				Static561.anInt9171++;
				if (Static561.anInt9171 >= 3) {
					this.method1063("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static163.method2447(local82, null);
			this.method1063("crash");
		}
	}

	@OriginalMember(owner = "client!dj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(B)V")
	public synchronized void method1056() {
		if (Static504.aCanvas11 != null) {
			Static504.aCanvas11.removeFocusListener(this);
			Static504.aCanvas11.getParent().setBackground(Color.black);
			Static504.aCanvas11.getParent().remove(Static504.aCanvas11);
		}
		@Pc(24) Container local24;
		if (Static298.aFrame3 != null) {
			local24 = Static298.aFrame3;
		} else if (Static202.aFrame2 != null) {
			local24 = Static202.aFrame2;
		} else if (Static617.anApplet2 == null) {
			local24 = Static263.anApplet_Sub1_1;
		} else {
			local24 = Static617.anApplet2;
		}
		local24.setLayout(null);
		Static504.aCanvas11 = new Canvas_Sub1(this);
		local24.add(Static504.aCanvas11);
		Static504.aCanvas11.setSize(Static511.anInt8548, Static153.anInt2747);
		Static504.aCanvas11.setVisible(true);
		if (local24 == Static202.aFrame2) {
			@Pc(68) Insets local68 = Static202.aFrame2.getInsets();
			Static504.aCanvas11.setLocation(local68.left + Static394.anInt6214, Static223.anInt3639 + local68.top);
		} else {
			Static504.aCanvas11.setLocation(Static394.anInt6214, Static223.anInt3639);
		}
		Static504.aCanvas11.addFocusListener(this);
		Static504.aCanvas11.requestFocus();
		Static223.aBoolean258 = true;
		Static204.aBoolean247 = true;
		Static377.aBoolean430 = true;
		Static241.aBoolean279 = false;
		Static140.aLong72 = Static476.method6413();
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(B)V")
	protected abstract void method1057();

	@OriginalMember(owner = "client!dj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static263.anApplet_Sub1_1 != this || Static424.aBoolean494) {
			return;
		}
		Static377.aBoolean430 = true;
		if (Static332.aBoolean373 && Static476.method6413() - Static140.aLong72 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static550.anInt9024 <= local24.width && Static236.anInt3828 <= local24.height) {
				Static241.aBoolean279 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZIILjava/lang/String;ZIII)V")
	protected final void method1058(@OriginalArg(3) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static511.anInt8548 = 1024;
			Static550.anInt9024 = 1024;
			Static223.anInt3639 = 0;
			Static641.anInt10326 = 631;
			Static263.anApplet_Sub1_1 = this;
			Static322.anApplet1 = null;
			Static394.anInt6214 = 0;
			Static153.anInt2747 = 768;
			Static236.anInt3828 = 768;
			Static202.aFrame2 = new Frame();
			Static202.aFrame2.setTitle("Jagex");
			Static202.aFrame2.setResizable(true);
			Static202.aFrame2.addWindowListener(this);
			Static202.aFrame2.setVisible(true);
			Static202.aFrame2.toFront();
			@Pc(44) Insets local44 = Static202.aFrame2.getInsets();
			Static202.aFrame2.setSize(local44.right + Static550.anInt9024 + local44.left, Static236.anInt3828 - (-local44.top - local44.bottom));
			Static252.aClass226_3 = Static452.aClass226_6 = new Class226(arg1, arg0, 37, true);
			@Pc(77) Class108 local77 = Static452.aClass226_6.method4842(this, 1);
			while (local77.anInt2766 == 0) {
				Static444.method6061(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static163.method2447(local90, null);
		}
	}

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "(B)V")
	protected abstract void method1059();

	@OriginalMember(owner = "client!dj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!dj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static263.anApplet_Sub1_1 == this && !Static424.aBoolean494) {
			Static298.aLong132 = Static476.method6413() + 4000L;
		}
	}

	@OriginalMember(owner = "client!dj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static202.aFrame2 == null) {
			return Static617.anApplet2 == null || Static617.anApplet2 == this ? super.getParameter(arg0) : Static617.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "(B)V")
	private void method1060() {
		@Pc(6) long local6 = Static476.method6413();
		@Pc(10) long local10 = Static636.aLongArray56[Static11.anInt143];
		Static636.aLongArray56[Static11.anInt143] = local6;
		Static11.anInt143 = Static11.anInt143 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(43) int local43 = (int) (local6 - local10);
			Static70.anInt1230 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static562.anInt9175++ > 50) {
			Static562.anInt9175 -= 50;
			Static377.aBoolean430 = true;
			Static504.aCanvas11.setSize(Static511.anInt8548, Static153.anInt2747);
			Static504.aCanvas11.setVisible(true);
			if (Static202.aFrame2 != null && Static298.aFrame3 == null) {
				@Pc(78) Insets local78 = Static202.aFrame2.getInsets();
				Static504.aCanvas11.setLocation(Static394.anInt6214 + local78.left, Static223.anInt3639 + local78.top);
			} else {
				Static504.aCanvas11.setLocation(Static394.anInt6214, Static223.anInt3639);
			}
		}
		this.method1059();
	}

	@OriginalMember(owner = "client!dj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static202.aFrame2 == null) {
			return Static617.anApplet2 == null || Static617.anApplet2 == this ? super.getDocumentBase() : Static617.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static359.aString71 != null) {
				@Pc(10) String local10 = Static359.aString71.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static359.aString70;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1063("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static359.aString70 == null || Static359.aString70.equals("1.4.2"))) {
					this.method1063("wrongjava");
					return;
				}
			}
			if (Static359.aString70 != null && Static359.aString70.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static359.aString70.length()) {
					@Pc(79) char local79 = Static359.aString70.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local73 * 10 + local79 - 48;
					local71++;
				}
				if (local73 >= 5) {
					Static332.aBoolean373 = true;
				}
			}
			@Pc(115) Applet local115 = Static263.anApplet_Sub1_1;
			if (Static617.anApplet2 != null) {
				local115 = Static617.anApplet2;
			}
			@Pc(121) Method local121 = Static359.aMethod1;
			if (local121 != null) {
				try {
					local121.invoke(local115, Boolean.TRUE);
				} catch (@Pc(135) Throwable local135) {
				}
			}
			Static535.method7389();
			Static397.method5414();
			this.method1056();
			this.method1052();
			Static374.aClass99_1 = Static571.method7828();
			while (Static298.aLong132 == 0L || Static298.aLong132 > Static476.method6413()) {
				Static275.anInt4393 = Static374.aClass99_1.method6864(Static36.aLong28);
				for (@Pc(158) int local158 = 0; local158 < Static275.anInt4393; local158++) {
					this.method1049();
				}
				this.method1060();
				Static284.method3923(Static504.aCanvas11, Static452.aClass226_6);
			}
		} catch (@Pc(191) ThreadDeath local191) {
			throw local191;
		} catch (@Pc(194) Throwable local194) {
			Static163.method2447(local194, this.method1051());
			this.method1063("crash");
		} finally {
			@Pc(210) Object local210 = null;
			this.method1053(true);
		}
	}

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "(B)Z")
	public final boolean method1061() {
		return Static550.method7576("jagmisc");
	}

	@OriginalMember(owner = "client!dj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
	protected abstract void method1062();

	@OriginalMember(owner = "client!dj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static263.anApplet_Sub1_1 == this && !Static424.aBoolean494) {
			Static298.aLong132 = Static476.method6413();
			Static444.method6061(5000L);
			Static252.aClass226_3 = null;
			this.method1053(false);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1063(@OriginalArg(0) String arg0) {
		if (this.aBoolean103) {
			return;
		}
		this.aBoolean103 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static651.method4296("loggedout", Static617.anApplet2);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!dj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Z")
	protected final boolean method1064() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.equals("stellardawn.com") || local8.endsWith(".stellardawn.com")) {
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
				this.method1063("invalidhost");
				return false;
			}
		}
	}
}
