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

@OriginalClass("client!qi")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "Z")
	private boolean aBoolean76 = false;

	static {
		new Class106("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!qi", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static194.anApplet_Sub1_1 == this && !Static364.aBoolean510) {
			Static257.aLong43 = Static183.method3462() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	protected abstract void method1044();

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
	protected abstract void method1045();

	@OriginalMember(owner = "client!qi", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qi", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static194.anApplet_Sub1_1 == this && !Static364.aBoolean510) {
			Static257.aLong43 = 0L;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	protected abstract void method1047();

	@OriginalMember(owner = "client!qi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static39.aFrame2 == null) {
			return Static227.aClass75_5 == null || Static227.aClass75_5.anApplet1 == this ? super.getCodeBase() : Static227.aClass75_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public final void method1049() {
		if (this.aBoolean74) {
			return;
		}
		try {
			@Pc(18) Class121 local18 = Static227.aClass75_5.method2360(Static194.anApplet_Sub1_1.getClass());
			while (local18.anInt3693 == 0) {
				Static135.method2737(100L);
			}
			if (local18.anObject2 != null) {
				throw (Throwable) local18.anObject2;
			}
			jagmisc.init();
			this.aBoolean74 = true;
			Static224.aClass115_1 = Static35.method883();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	private void method1050() {
		@Pc(6) long local6 = Static183.method3462();
		@Pc(10) long local10 = Static20.aLongArray2[Static72.anInt1642];
		Static20.aLongArray2[Static72.anInt1642] = local6;
		Static72.anInt1642 = Static72.anInt1642 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static45.anInt1172 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static230.anInt1973++ > 50) {
			Static230.anInt1973 -= 50;
			Static237.aBoolean198 = true;
			Static174.aCanvas3.setSize(Static213.anInt4274, Static130.anInt2825);
			Static174.aCanvas3.setVisible(true);
			if (Static39.aFrame2 != null && Static31.aFrame1 == null) {
				@Pc(77) Insets local77 = Static39.aFrame2.getInsets();
				Static174.aCanvas3.setLocation(Static87.anInt1924 + local77.left, local77.top - -Static100.anInt2305);
			} else {
				Static174.aCanvas3.setLocation(Static87.anInt1924, Static100.anInt2305);
			}
		}
		this.method1044();
	}

	@OriginalMember(owner = "client!qi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BZ)V")
	private void method1051(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static364.aBoolean510) {
				return;
			}
			Static364.aBoolean510 = true;
		}
		if (Static227.aClass75_5.anApplet1 != null) {
			Static227.aClass75_5.anApplet1.destroy();
		}
		try {
			this.method1058();
		} catch (@Pc(37) Exception local37) {
		}
		if (this.aBoolean74) {
			try {
				jagmisc.quit();
			} catch (@Pc(43) Throwable local43) {
			}
			this.aBoolean74 = false;
		}
		@Pc(52) Class121 local52 = Static227.aClass75_5.method2364(Static194.anApplet_Sub1_1.getClass());
		while (local52.anInt3693 == 0) {
			Static135.method2737(100L);
		}
		if (Static174.aCanvas3 != null) {
			try {
				Static174.aCanvas3.removeFocusListener(this);
				Static174.aCanvas3.getParent().remove(Static174.aCanvas3);
			} catch (@Pc(71) Exception local71) {
			}
		}
		if (Static227.aClass75_5 != null) {
			try {
				Static227.aClass75_5.method2354();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method1045();
		if (Static39.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V")
	private void method1052() {
		@Pc(11) long local11 = Static183.method3462();
		@Pc(15) long local15 = Static230.aLongArray4[Static84.anInt1872];
		Static230.aLongArray4[Static84.anInt1872] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static84.anInt1872 = Static84.anInt1872 + 1 & 0x1F;
		synchronized (this) {
			Static177.aBoolean275 = Static268.aBoolean400;
		}
		this.method1055();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public final synchronized void method1053() {
		if (Static174.aCanvas3 != null) {
			Static174.aCanvas3.removeFocusListener(this);
			Static174.aCanvas3.getParent().remove(Static174.aCanvas3);
		}
		@Pc(21) Container local21;
		if (Static31.aFrame1 != null) {
			local21 = Static31.aFrame1;
		} else if (Static39.aFrame2 == null) {
			local21 = Static227.aClass75_5.anApplet1;
		} else {
			local21 = Static39.aFrame2;
		}
		local21.setLayout(null);
		Static174.aCanvas3 = new Canvas_Sub1(this);
		local21.add(Static174.aCanvas3);
		Static174.aCanvas3.setSize(Static213.anInt4274, Static130.anInt2825);
		Static174.aCanvas3.setVisible(true);
		if (Static39.aFrame2 == local21) {
			@Pc(54) Insets local54 = Static39.aFrame2.getInsets();
			Static174.aCanvas3.setLocation(Static87.anInt1924 + local54.left, Static100.anInt2305 + local54.top);
		} else {
			Static174.aCanvas3.setLocation(Static87.anInt1924, Static100.anInt2305);
		}
		Static174.aCanvas3.addFocusListener(this);
		Static174.aCanvas3.requestFocus();
		Static177.aBoolean275 = true;
		Static268.aBoolean400 = true;
		Static237.aBoolean198 = true;
		Static108.aBoolean177 = false;
		Static50.aLong46 = Static183.method3462();
	}

	@OriginalMember(owner = "client!qi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static39.aFrame2 == null) {
			return Static227.aClass75_5 == null || Static227.aClass75_5.anApplet1 == this ? super.getAppletContext() : Static227.aClass75_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static194.anApplet_Sub1_1 != this || Static364.aBoolean510) {
			return;
		}
		Static237.aBoolean198 = true;
		if (Static136.aBoolean381 && Static183.method3462() - Static50.aLong46 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static210.anInt4185 && Static281.anInt5472 <= local26.height) {
				Static108.aBoolean177 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)Z")
	protected final boolean method1054() {
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
				this.method1059("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static268.aBoolean400 = true;
		Static237.aBoolean198 = true;
	}

	@OriginalMember(owner = "client!qi", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static194.anApplet_Sub1_1 == this && !Static364.aBoolean510) {
			Static257.aLong43 = Static183.method3462();
			Static135.method2737(5000L);
			Static33.aClass75_1 = null;
			this.method1051(false);
		}
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(B)V")
	protected abstract void method1055();

	@OriginalMember(owner = "client!qi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static39.aFrame2 == null) {
			return Static227.aClass75_5 == null || Static227.aClass75_5.anApplet1 == this ? super.getDocumentBase() : Static227.aClass75_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBZLjava/lang/String;IIII)V")
	protected final void method1056(@OriginalArg(3) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static130.anInt2825 = 768;
			Static281.anInt5472 = 768;
			Static100.anInt2305 = 0;
			Static87.anInt1924 = 0;
			Static184.anInt3731 = 571;
			Static194.anApplet_Sub1_1 = this;
			Static213.anInt4274 = 1024;
			Static210.anInt4185 = 1024;
			Static39.aFrame2 = new Frame();
			Static39.aFrame2.setTitle("Jagex");
			Static39.aFrame2.setResizable(true);
			Static39.aFrame2.addWindowListener(this);
			Static39.aFrame2.setVisible(true);
			Static39.aFrame2.toFront();
			@Pc(38) Insets local38 = Static39.aFrame2.getInsets();
			Static39.aFrame2.setSize(local38.left + Static210.anInt4185 + local38.right, local38.bottom + local38.top + Static281.anInt5472);
			Static33.aClass75_1 = Static227.aClass75_5 = new Class75(null, arg1, arg0, 29);
			@Pc(70) Class121 local70 = Static227.aClass75_5.method2366(1, this);
			while (local70.anInt3693 == 0) {
				Static135.method2737(10L);
			}
		} catch (@Pc(83) Exception local83) {
			Static119.method2541(null, local83);
		}
	}

	@OriginalMember(owner = "client!qi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static39.aFrame2 == null) {
			return Static227.aClass75_5 == null || Static227.aClass75_5.anApplet1 == this ? super.getParameter(arg0) : Static227.aClass75_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static111.aString17 != null) {
					@Pc(10) String local10 = Static111.aString17.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(40) String local40 = Static111.aString16;
						if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
							this.method1059("wrongjava");
							break label108;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static111.aString16 == null || Static111.aString16.equals("1.4.2"))) {
						this.method1059("wrongjava");
						break label108;
					}
				}
				@Pc(70) int local70;
				if (Static111.aString16 != null && Static111.aString16.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static111.aString16.length() > local70) {
						@Pc(78) char local78 = Static111.aString16.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local72 * 10 + local78 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Static136.aBoolean381 = true;
					}
				}
				if (Static227.aClass75_5.anApplet1 != null) {
					@Pc(118) Method local118 = Static111.aMethod1;
					if (local118 != null) {
						try {
							local118.invoke(Static227.aClass75_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(133) Throwable local133) {
						}
					}
				}
				Static359.method5942();
				Static254.method4766();
				this.method1053();
				this.method1047();
				Static224.aClass115_1 = Static35.method883();
				this.method1049();
				while (Static257.aLong43 == 0L || Static257.aLong43 > Static183.method3462()) {
					Static152.anInt3171 = Static224.aClass115_1.method4522(Static156.anInt3218);
					for (local70 = 0; local70 < Static152.anInt3171; local70++) {
						this.method1052();
					}
					this.method1050();
					Static214.method3975(Static227.aClass75_5, Static174.aCanvas3);
				}
			}
		} catch (@Pc(196) Exception local196) {
			Static119.method2541(null, local196);
			this.method1059("crash");
		}
		this.method1051(true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	protected final void method1057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static194.anApplet_Sub1_1 == null) {
				Static213.anInt4274 = arg1;
				Static210.anInt4185 = arg1;
				Static130.anInt2825 = arg2;
				Static281.anInt5472 = arg2;
				Static100.anInt2305 = 0;
				Static87.anInt1924 = 0;
				Static184.anInt3731 = 571;
				Static194.anApplet_Sub1_1 = this;
				if (Static227.aClass75_5 == null) {
					Static33.aClass75_1 = Static227.aClass75_5 = new Class75(this, arg0, null, 0);
				}
				@Pc(60) Class121 local60 = Static227.aClass75_5.method2366(1, this);
				while (local60.anInt3693 == 0) {
					Static135.method2737(10L);
				}
			} else {
				Static263.anInt5199++;
				if (Static263.anInt5199 >= 3) {
					this.method1059("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(70) Exception local70) {
			Static119.method2541(null, local70);
			this.method1059("crash");
		}
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)V")
	protected abstract void method1058();

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1059(@OriginalArg(1) String arg0) {
		if (this.aBoolean76) {
			return;
		}
		this.aBoolean76 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static381.method4930(Static227.aClass75_5.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static268.aBoolean400 = false;
	}
}
