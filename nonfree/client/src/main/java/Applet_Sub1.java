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

@OriginalClass("client!qu")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!qu", name = "D", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!qu", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static195.anApplet4 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1140() {
		return null;
	}

	@OriginalMember(owner = "client!qu", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static414.anApplet_Sub1_1 == this && !Static453.aBoolean606) {
			Static18.aLong107 = Static362.method5133() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qu", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static414.anApplet_Sub1_1 == this && !Static453.aBoolean606) {
			Static18.aLong107 = 0L;
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	private void method1141() {
		@Pc(6) long local6 = Static362.method5133();
		@Pc(10) long local10 = Static242.aLongArray11[Static226.anInt3306];
		Static242.aLongArray11[Static226.anInt3306] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static112.anInt1993 = ((local34 >> 1) + 32000) / local34;
		}
		Static226.anInt3306 = Static226.anInt3306 + 1 & 0x1F;
		if (Static353.anInt6037++ > 50) {
			Static199.aBoolean208 = true;
			Static353.anInt6037 -= 50;
			Static9.aCanvas1.setSize(Static172.anInt2621, Static187.anInt8962);
			Static9.aCanvas1.setVisible(true);
			if (Static223.aFrame2 != null && Static43.aFrame1 == null) {
				@Pc(78) Insets local78 = Static223.aFrame2.getInsets();
				Static9.aCanvas1.setLocation(Static8.anInt227 + local78.left, Static107.anInt1866 + local78.top);
			} else {
				Static9.aCanvas1.setLocation(Static8.anInt227, Static107.anInt1866);
			}
		}
		this.method1152();
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)Z")
	public final boolean method1142() {
		return Static560.method7324("jaclib");
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method1143(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static414.anApplet_Sub1_1 == null) {
				Static172.anInt2621 = arg2;
				Static441.anInt7086 = arg2;
				Static18.anApplet3 = Static195.anApplet4;
				Static414.anApplet_Sub1_1 = this;
				Static8.anInt227 = 0;
				Static187.anInt8962 = arg1;
				Static222.anInt3250 = arg1;
				Static281.anInt4824 = 627;
				Static107.anInt1866 = 0;
				Static172.aClass99_3 = Static169.aClass99_2 = new Class99(arg3, arg0, 35, Static195.anApplet4 != null);
				@Pc(66) Class5 local66 = Static169.aClass99_2.method1787(this, 1);
				while (local66.anInt151 == 0) {
					Static263.method3671(10L);
				}
			} else {
				Static374.anInt6280++;
				if (Static374.anInt6280 >= 3) {
					this.method1148("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(79) Throwable local79) {
			Static357.method5094(local79, null);
			this.method1148("crash");
		}
	}

	@OriginalMember(owner = "client!qu", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static223.aFrame2 == null) {
			return Static195.anApplet4 == null || Static195.anApplet4 == this ? super.getParameter(arg0) : Static195.anApplet4.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	private void method1144() {
		@Pc(11) long local11 = Static362.method5133();
		@Pc(15) long local15 = Static127.aLongArray5[Static361.anInt6118];
		Static127.aLongArray5[Static361.anInt6118] = local11;
		@Pc(30) boolean local30;
		if (local15 == 0L || local15 >= local11) {
			local30 = false;
		} else {
			local30 = true;
		}
		Static361.anInt6118 = Static361.anInt6118 + 1 & 0x1F;
		synchronized (this) {
			Static287.aBoolean374 = Static528.aBoolean714;
		}
		this.method1156();
	}

	@OriginalMember(owner = "client!qu", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static223.aFrame2 == null) {
			return Static195.anApplet4 == null || Static195.anApplet4 == this ? super.getDocumentBase() : Static195.anApplet4.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V")
	public synchronized void method1146() {
		if (Static9.aCanvas1 != null) {
			Static9.aCanvas1.removeFocusListener(this);
			Static9.aCanvas1.getParent().setBackground(Color.black);
			Static9.aCanvas1.getParent().remove(Static9.aCanvas1);
		}
		@Pc(22) Container local22;
		if (Static43.aFrame1 != null) {
			local22 = Static43.aFrame1;
		} else if (Static223.aFrame2 != null) {
			local22 = Static223.aFrame2;
		} else if (Static195.anApplet4 == null) {
			local22 = Static414.anApplet_Sub1_1;
		} else {
			local22 = Static195.anApplet4;
		}
		local22.setLayout(null);
		Static9.aCanvas1 = new Canvas_Sub1(this);
		local22.add(Static9.aCanvas1);
		Static9.aCanvas1.setSize(Static172.anInt2621, Static187.anInt8962);
		Static9.aCanvas1.setVisible(true);
		if (local22 == Static223.aFrame2) {
			@Pc(76) Insets local76 = Static223.aFrame2.getInsets();
			Static9.aCanvas1.setLocation(Static8.anInt227 + local76.left, local76.top - -Static107.anInt1866);
		} else {
			Static9.aCanvas1.setLocation(Static8.anInt227, Static107.anInt1866);
		}
		Static9.aCanvas1.addFocusListener(this);
		Static9.aCanvas1.requestFocus();
		Static287.aBoolean374 = true;
		Static528.aBoolean714 = true;
		Static199.aBoolean208 = true;
		Static382.aBoolean500 = false;
		Static313.aLong142 = Static362.method5133();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(B)Z")
	protected final boolean method1147() {
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
				this.method1148("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static223.aFrame2 == null) {
			return Static195.anApplet4 == null || Static195.anApplet4 == this ? super.getAppletContext() : Static195.anApplet4.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1148(@OriginalArg(1) String arg0) {
		if (this.aBoolean75) {
			return;
		}
		this.aBoolean75 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static597.method3394("loggedout", Static195.anApplet4);
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!qu", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static414.anApplet_Sub1_1 == this && !Static453.aBoolean606) {
			Static18.aLong107 = Static362.method5133();
			Static263.method3671(5000L);
			Static172.aClass99_3 = null;
			this.method1158(false);
		}
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(B)V")
	protected abstract void method1149();

	@OriginalMember(owner = "client!qu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static528.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIILjava/lang/String;IIZI)V")
	protected final void method1151(@OriginalArg(3) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static8.anInt227 = 0;
			Static107.anInt1866 = 0;
			Static281.anInt4824 = 627;
			Static414.anApplet_Sub1_1 = this;
			Static172.anInt2621 = 1024;
			Static441.anInt7086 = 1024;
			Static18.anApplet3 = null;
			Static187.anInt8962 = 768;
			Static222.anInt3250 = 768;
			Static223.aFrame2 = new Frame();
			Static223.aFrame2.setTitle("Jagex");
			Static223.aFrame2.setResizable(true);
			Static223.aFrame2.addWindowListener(this);
			Static223.aFrame2.setVisible(true);
			Static223.aFrame2.toFront();
			@Pc(44) Insets local44 = Static223.aFrame2.getInsets();
			Static223.aFrame2.setSize(local44.right + local44.left + Static441.anInt7086, Static222.anInt3250 - -local44.top + local44.bottom);
			Static172.aClass99_3 = Static169.aClass99_2 = new Class99(arg1, arg0, 35, true);
			@Pc(82) Class5 local82 = Static169.aClass99_2.method1787(this, 1);
			while (local82.anInt151 == 0) {
				Static263.method3671(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static357.method5094(local95, null);
		}
	}

	@OriginalMember(owner = "client!qu", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static223.aFrame2 == null) {
			return Static195.anApplet4 == null || Static195.anApplet4 == this ? super.getCodeBase() : Static195.anApplet4.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qu", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
	protected abstract void method1152();

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)Z")
	public final boolean method1153() {
		return Static560.method7324("jagmisc");
	}

	@OriginalMember(owner = "client!qu", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Z)V")
	protected abstract void method1154();

	@OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static132.aString32 != null) {
				@Pc(10) String local10 = Static132.aString32.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static132.aString26;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method1148("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static132.aString26 == null || Static132.aString26.equals("1.4.2"))) {
					this.method1148("wrongjava");
					return;
				}
			}
			if (Static132.aString26 != null && Static132.aString26.startsWith("1.")) {
				@Pc(69) int local69 = 2;
				@Pc(71) int local71 = 0;
				while (Static132.aString26.length() > local69) {
					@Pc(77) char local77 = Static132.aString26.charAt(local69);
					if (local77 < '0' || local77 > '9') {
						break;
					}
					local71 = local77 + local71 * 10 - 48;
					local69++;
				}
				if (local71 >= 5) {
					Static222.aBoolean233 = true;
				}
			}
			@Pc(105) Applet local105 = Static414.anApplet_Sub1_1;
			if (Static195.anApplet4 != null) {
				local105 = Static195.anApplet4;
			}
			@Pc(111) Method local111 = Static132.aMethod2;
			if (local111 != null) {
				try {
					local111.invoke(local105, Boolean.TRUE);
				} catch (@Pc(125) Throwable local125) {
				}
			}
			Static109.method1599();
			Static101.method1528();
			this.method1146();
			this.method1149();
			Static190.aClass19_1 = Static565.method7385();
			while (Static18.aLong107 == 0L || Static18.aLong107 > Static362.method5133()) {
				Static206.anInt3014 = Static190.aClass19_1.method7652(Static219.aLong96);
				for (@Pc(148) int local148 = 0; local148 < Static206.anInt3014; local148++) {
					this.method1144();
				}
				this.method1141();
				Static202.method2530(Static9.aCanvas1, Static169.aClass99_2);
			}
		} catch (@Pc(175) ThreadDeath local175) {
			throw local175;
		} catch (@Pc(178) Throwable local178) {
			Static357.method5094(local178, this.method1140());
			this.method1148("crash");
		} finally {
			@Pc(194) Object local194 = null;
			this.method1158(true);
		}
	}

	@OriginalMember(owner = "client!qu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static528.aBoolean714 = true;
		Static199.aBoolean208 = true;
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(B)V")
	protected abstract void method1156();

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
	protected abstract void method1157();

	@OriginalMember(owner = "client!qu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static414.anApplet_Sub1_1 != this || Static453.aBoolean606) {
			return;
		}
		Static199.aBoolean208 = true;
		if (Static222.aBoolean233 && Static362.method5133() - Static313.aLong142 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static441.anInt7086 && local24.height >= Static222.anInt3250) {
				Static382.aBoolean500 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V")
	private void method1158(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static453.aBoolean606) {
				return;
			}
			Static453.aBoolean606 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static195.anApplet4 != null) {
			Static195.anApplet4.destroy();
		}
		try {
			this.method1154();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean76) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean76 = false;
		}
		Static356.method5081();
		Static45.method802();
		if (Static9.aCanvas1 != null) {
			try {
				Static9.aCanvas1.removeFocusListener(this);
				Static9.aCanvas1.getParent().remove(Static9.aCanvas1);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static169.aClass99_2 != null) {
			try {
				Static169.aClass99_2.method1778();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method1157();
		if (Static223.aFrame2 != null) {
			Static223.aFrame2.setVisible(false);
			Static223.aFrame2.dispose();
			Static223.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qu", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}
}
