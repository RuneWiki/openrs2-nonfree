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

@OriginalClass("client!jp")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!jp", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static270.anApplet5 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V")
	protected abstract void method1195();

	@OriginalMember(owner = "client!jp", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;IIIBI)V")
	protected final void method1196(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (Static3.anApplet_Sub1_1 == null) {
				Static438.anInt7403 = arg3;
				Static374.anInt6594 = arg3;
				Static552.anInt9135 = 0;
				Static649.anInt10495 = 0;
				Static363.anInt6412 = 640;
				Static3.anApplet_Sub1_1 = this;
				Static401.anApplet6 = Static270.anApplet5;
				Static254.anInt4283 = arg2;
				Static489.anInt8353 = arg2;
				Static612.aClass192_5 = Static214.aClass192_1 = new Class192(arg0, arg1, 37, Static270.anApplet5 != null);
				@Pc(72) Class330 local72 = Static214.aClass192_1.method4334(this, 1);
				while (local72.anInt9132 == 0) {
					Static452.method7478(10L);
				}
			} else {
				Static111.anInt1761++;
				if (Static111.anInt1761 >= 3) {
					this.method1204("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(85) Throwable local85) {
			Static280.method4194((String) null, local85);
			this.method1204("crash");
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public synchronized void method1197() {
		if (Static181.aCanvas3 != null) {
			Static181.aCanvas3.removeFocusListener(this);
			Static181.aCanvas3.getParent().setBackground(Color.black);
			Static181.aCanvas3.getParent().remove(Static181.aCanvas3);
		}
		@Pc(22) Container local22;
		if (Static630.aFrame3 != null) {
			local22 = Static630.aFrame3;
		} else if (Static510.aFrame2 != null) {
			local22 = Static510.aFrame2;
		} else if (Static270.anApplet5 == null) {
			local22 = Static3.anApplet_Sub1_1;
		} else {
			local22 = Static270.anApplet5;
		}
		local22.setLayout((LayoutManager) null);
		Static181.aCanvas3 = new Canvas_Sub1(this);
		local22.add(Static181.aCanvas3);
		Static181.aCanvas3.setSize(Static254.anInt4283, Static438.anInt7403);
		Static181.aCanvas3.setVisible(true);
		if (local22 == Static510.aFrame2) {
			@Pc(73) Insets local73 = Static510.aFrame2.getInsets();
			Static181.aCanvas3.setLocation(local73.left + Static552.anInt9135, local73.top - -Static649.anInt10495);
		} else {
			Static181.aCanvas3.setLocation(Static552.anInt9135, Static649.anInt10495);
		}
		Static181.aCanvas3.addFocusListener(this);
		Static181.aCanvas3.requestFocus();
		Static504.aBoolean705 = true;
		Static292.aBoolean386 = true;
		Static267.aBoolean362 = true;
		Static636.aBoolean832 = false;
		Static525.aLong231 = Static205.method3179();
	}

	@OriginalMember(owner = "client!jp", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static3.anApplet_Sub1_1 == this && !Static65.aBoolean73) {
			Static80.aLong40 = Static205.method3179() + 4000L;
		}
	}

	@OriginalMember(owner = "client!jp", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static295.aString77 != null) {
				@Pc(10) String local10 = Static295.aString77.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(42) String local42 = Static295.aString73;
					if (local42.equals("1.1") || local42.startsWith("1.1.") || local42.equals("1.2") || local42.startsWith("1.2.")) {
						this.method1204("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static295.aString73 == null || Static295.aString73.equals("1.4.2"))) {
					this.method1204("wrongjava");
					return;
				}
			}
			if (Static295.aString73 != null && Static295.aString73.startsWith("1.")) {
				@Pc(72) int local72 = 2;
				@Pc(74) int local74 = 0;
				while (local72 < Static295.aString73.length()) {
					@Pc(80) char local80 = Static295.aString73.charAt(local72);
					if (local80 < '0' || local80 > '9') {
						break;
					}
					local74 = local74 * 10 + local80 - 48;
					local72++;
				}
				if (local74 >= 5) {
					Static580.aBoolean825 = true;
				}
			}
			@Pc(116) Applet local116 = Static3.anApplet_Sub1_1;
			if (Static270.anApplet5 != null) {
				local116 = Static270.anApplet5;
			}
			@Pc(122) Method local122 = Static295.aMethod2;
			if (local122 != null) {
				try {
					local122.invoke(local116, Boolean.TRUE);
				} catch (@Pc(136) Throwable local136) {
				}
			}
			Static287.method4290();
			Static374.method5830();
			this.method1197();
			this.method1202();
			Static228.aClass145_1 = Static437.method6510();
			while (Static80.aLong40 == 0L || Static80.aLong40 > Static205.method3179()) {
				Static93.anInt1498 = Static228.aClass145_1.method8782(Static120.aLong269);
				for (@Pc(159) int local159 = 0; local159 < Static93.anInt1498; local159++) {
					this.method1206();
				}
				this.method1203();
				Static235.method3626(Static214.aClass192_1, Static181.aCanvas3);
			}
		} catch (@Pc(190) ThreadDeath local190) {
			throw local190;
		} catch (@Pc(193) Throwable local193) {
			Static280.method4194(this.method1207(), local193);
			this.method1204("crash");
		} finally {
			@Pc(209) Object local209 = null;
			this.method1211(true);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;ZIIIII)V")
	protected final void method1198(@OriginalArg(1) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static363.anInt6412 = 640;
			Static649.anInt10495 = 0;
			Static438.anInt7403 = 768;
			Static374.anInt6594 = 768;
			Static401.anApplet6 = null;
			Static3.anApplet_Sub1_1 = this;
			Static552.anInt9135 = 0;
			Static254.anInt4283 = 1024;
			Static489.anInt8353 = 1024;
			Static510.aFrame2 = new Frame();
			Static510.aFrame2.setTitle("Jagex");
			Static510.aFrame2.setResizable(true);
			Static510.aFrame2.addWindowListener(this);
			Static510.aFrame2.setVisible(true);
			Static510.aFrame2.toFront();
			@Pc(40) Insets local40 = Static510.aFrame2.getInsets();
			Static510.aFrame2.setSize(Static489.anInt8353 + local40.left + local40.right, local40.top + Static374.anInt6594 + local40.bottom);
			Static612.aClass192_5 = Static214.aClass192_1 = new Class192(arg1, arg0, 37, true);
			@Pc(77) Class330 local77 = Static214.aClass192_1.method4334(this, 1);
			while (local77.anInt9132 == 0) {
				Static452.method7478(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static280.method4194((String) null, local87);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	protected abstract void method1199();

	@OriginalMember(owner = "client!jp", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	protected abstract void method1200();

	@OriginalMember(owner = "client!jp", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!jp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static504.aBoolean705 = true;
		Static267.aBoolean362 = true;
	}

	@OriginalMember(owner = "client!jp", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static510.aFrame2 == null) {
			return Static270.anApplet5 == null || Static270.anApplet5 == this ? super.getCodeBase() : Static270.anApplet5.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)Z")
	public final boolean method1201() {
		return Static190.method673("jagtheora");
	}

	@OriginalMember(owner = "client!jp", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
	protected abstract void method1202();

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	private void method1203() {
		@Pc(6) long local6 = Static205.method3179();
		@Pc(10) long local10 = Static544.aLongArray15[Static464.anInt7860];
		Static544.aLongArray15[Static464.anInt7860] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(31) int local31 = (int) (local6 - local10);
			Static33.anInt623 = ((local31 >> 1) + 32000) / local31;
		}
		Static464.anInt7860 = Static464.anInt7860 + 1 & 0x1F;
		if (Static433.anInt7306++ > 50) {
			Static267.aBoolean362 = true;
			Static433.anInt7306 -= 50;
			Static181.aCanvas3.setSize(Static254.anInt4283, Static438.anInt7403);
			Static181.aCanvas3.setVisible(true);
			if (Static510.aFrame2 != null && Static630.aFrame3 == null) {
				@Pc(80) Insets local80 = Static510.aFrame2.getInsets();
				Static181.aCanvas3.setLocation(Static552.anInt9135 + local80.left, Static649.anInt10495 + local80.top);
			} else {
				Static181.aCanvas3.setLocation(Static552.anInt9135, Static649.anInt10495);
			}
		}
		this.method1212();
	}

	@OriginalMember(owner = "client!jp", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static510.aFrame2 == null) {
			return Static270.anApplet5 == null || Static270.anApplet5 == this ? super.getAppletContext() : Static270.anApplet5.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1204(@OriginalArg(1) String arg0) {
		if (this.aBoolean92) {
			return;
		}
		this.aBoolean92 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static652.method1918("loggedout", Static270.anApplet5);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)Z")
	protected final boolean method1205() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.equals("stellardawn.com") || local16.endsWith(".stellardawn.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1204("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "(I)V")
	private void method1206() {
		@Pc(6) long local6 = Static205.method3179();
		@Pc(10) long local10 = Static324.aLongArray12[Static247.anInt4163];
		Static324.aLongArray12[Static247.anInt4163] = local6;
		@Pc(23) boolean local23;
		if (local10 == 0L || local10 >= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static247.anInt4163 = Static247.anInt4163 + 1 & 0x1F;
		synchronized (this) {
			Static292.aBoolean386 = Static504.aBoolean705;
		}
		this.method1199();
	}

	@OriginalMember(owner = "client!jp", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method1207() {
		return null;
	}

	@OriginalMember(owner = "client!jp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static3.anApplet_Sub1_1 != this || Static65.aBoolean73) {
			return;
		}
		Static267.aBoolean362 = true;
		if (Static580.aBoolean825 && Static205.method3179() - Static525.aLong231 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || local23.width >= Static489.anInt8353 && local23.height >= Static374.anInt6594) {
				Static636.aBoolean832 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)Z")
	public final boolean method1209() {
		return Static190.method673("jagmisc");
	}

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "(I)Z")
	public final boolean method1210() {
		return Static190.method673("jaclib");
	}

	@OriginalMember(owner = "client!jp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static504.aBoolean705 = false;
	}

	@OriginalMember(owner = "client!jp", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!jp", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static3.anApplet_Sub1_1 == this && !Static65.aBoolean73) {
			Static80.aLong40 = Static205.method3179();
			Static452.method7478(5000L);
			Static612.aClass192_5 = null;
			this.method1211(false);
		}
	}

	@OriginalMember(owner = "client!jp", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static510.aFrame2 == null) {
			return Static270.anApplet5 == null || Static270.anApplet5 == this ? super.getParameter(arg0) : Static270.anApplet5.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZ)V")
	private void method1211(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static65.aBoolean73) {
				return;
			}
			Static65.aBoolean73 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static270.anApplet5 != null) {
			Static270.anApplet5.destroy();
		}
		try {
			this.method1195();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean93) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean93 = false;
		}
		Static212.method3223();
		Static291.method4300();
		if (Static181.aCanvas3 != null) {
			try {
				Static181.aCanvas3.removeFocusListener(this);
				Static181.aCanvas3.getParent().remove(Static181.aCanvas3);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static214.aClass192_1 != null) {
			try {
				Static214.aClass192_1.method4326();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1200();
		if (Static510.aFrame2 != null) {
			Static510.aFrame2.setVisible(false);
			Static510.aFrame2.dispose();
			Static510.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!jp", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static510.aFrame2 == null) {
			return Static270.anApplet5 == null || Static270.anApplet5 == this ? super.getDocumentBase() : Static270.anApplet5.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "(B)V")
	protected abstract void method1212();

	@OriginalMember(owner = "client!jp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static3.anApplet_Sub1_1 == this && !Static65.aBoolean73) {
			Static80.aLong40 = 0L;
		}
	}
}
