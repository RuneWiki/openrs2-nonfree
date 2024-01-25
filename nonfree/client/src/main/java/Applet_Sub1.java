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

@OriginalClass("client!te")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!te", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static242.aBoolean301 = true;
		Static169.aBoolean226 = true;
	}

	@OriginalMember(owner = "client!te", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static43.aFrame4 == null) {
			return Static24.aClass196_1 == null || Static24.aClass196_1.anApplet1 == this ? super.getParameter(arg0) : Static24.aClass196_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public final synchronized void method732() {
		if (Static391.aCanvas5 != null) {
			Static391.aCanvas5.removeFocusListener(this);
			Static391.aCanvas5.getParent().remove(Static391.aCanvas5);
		}
		@Pc(22) Container local22;
		if (Static276.aFrame5 != null) {
			local22 = Static276.aFrame5;
		} else if (Static43.aFrame4 == null) {
			local22 = Static24.aClass196_1.anApplet1;
		} else {
			local22 = Static43.aFrame4;
		}
		local22.setLayout(null);
		Static391.aCanvas5 = new Canvas_Sub1(this);
		local22.add(Static391.aCanvas5);
		Static391.aCanvas5.setSize(Static345.anInt5723, Static120.anInt2134);
		Static391.aCanvas5.setVisible(true);
		if (local22 == Static43.aFrame4) {
			@Pc(64) Insets local64 = Static43.aFrame4.getInsets();
			Static391.aCanvas5.setLocation(local64.left + Static111.anInt2080, local64.top - -Static456.anInt7657);
		} else {
			Static391.aCanvas5.setLocation(Static111.anInt2080, Static456.anInt7657);
		}
		Static391.aCanvas5.addFocusListener(this);
		Static391.aCanvas5.requestFocus();
		Static252.aBoolean308 = true;
		Static242.aBoolean301 = true;
		Static169.aBoolean226 = true;
		Static71.aBoolean510 = false;
		Static172.aLong87 = Static266.method3498();
	}

	@OriginalMember(owner = "client!te", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static242.aBoolean301 = false;
	}

	@OriginalMember(owner = "client!te", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static43.aFrame4 == null) {
			return Static24.aClass196_1 == null || Static24.aClass196_1.anApplet1 == this ? super.getDocumentBase() : Static24.aClass196_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static43.aFrame4 == null) {
			return Static24.aClass196_1 == null || Static24.aClass196_1.anApplet1 == this ? super.getCodeBase() : Static24.aClass196_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	private void method733() {
		@Pc(10) long local10 = Static266.method3498();
		@Pc(14) long local14 = Static29.aLongArray2[Static425.anInt7123];
		Static29.aLongArray2[Static425.anInt7123] = local10;
		@Pc(27) boolean local27;
		if (local14 == 0L || local14 >= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static425.anInt7123 = Static425.anInt7123 + 1 & 0x1F;
		synchronized (this) {
			Static252.aBoolean308 = Static242.aBoolean301;
		}
		this.method739();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	protected abstract void method734();

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Z")
	protected final boolean method735() {
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
				this.method745("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	private void method736() {
		@Pc(6) long local6 = Static266.method3498();
		@Pc(10) long local10 = Static333.aLongArray8[Static63.anInt5744];
		Static333.aLongArray8[Static63.anInt5744] = local6;
		if ((long) 0 != local10 && local10 < local6) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static418.anInt7060 = ((local28 >> 1) + 32000) / local28;
		}
		Static63.anInt5744 = Static63.anInt5744 + 1 & 0x1F;
		if (Static127.anInt2209++ > 50) {
			Static169.aBoolean226 = true;
			Static127.anInt2209 -= 50;
			Static391.aCanvas5.setSize(Static345.anInt5723, Static120.anInt2134);
			Static391.aCanvas5.setVisible(true);
			if (Static43.aFrame4 != null && Static276.aFrame5 == null) {
				@Pc(70) Insets local70 = Static43.aFrame4.getInsets();
				Static391.aCanvas5.setLocation(local70.left + Static111.anInt2080, local70.top + Static456.anInt7657);
			} else {
				Static391.aCanvas5.setLocation(Static111.anInt2080, Static456.anInt7657);
			}
		}
		this.method743();
	}

	@OriginalMember(owner = "client!te", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static43.aFrame4 == null) {
			return Static24.aClass196_1 == null || Static24.aClass196_1.anApplet1 == this ? super.getAppletContext() : Static24.aClass196_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Ljava/lang/String;")
	protected String method737() {
		return null;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public final void method738() {
		if (this.aBoolean56) {
			return;
		}
		try {
			@Pc(18) Class45 local18 = Static24.aClass196_1.method3912(Static187.anApplet_Sub1_1.getClass());
			while (local18.anInt1129 == 0) {
				Static435.method5777(100L);
			}
			if (local18.anObject5 != null) {
				throw (Throwable) local18.anObject5;
			}
			jagmisc.init();
			this.aBoolean56 = true;
			Static86.aClass61_1 = Static209.method2910();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!te", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	protected abstract void method739();

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	protected abstract void method740();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIZBIIILjava/lang/String;)V")
	protected final void method741(@OriginalArg(6) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static413.anInt6988 = 593;
			Static456.anInt7657 = 0;
			Static120.anInt2134 = 768;
			Static75.anInt1525 = 768;
			Static111.anInt2080 = 0;
			Static187.anApplet_Sub1_1 = this;
			Static345.anInt5723 = 1024;
			Static298.anInt4896 = 1024;
			Static43.aFrame4 = new Frame();
			Static43.aFrame4.setTitle("Jagex");
			Static43.aFrame4.setResizable(true);
			Static43.aFrame4.addWindowListener(this);
			Static43.aFrame4.setVisible(true);
			Static43.aFrame4.toFront();
			@Pc(44) Insets local44 = Static43.aFrame4.getInsets();
			Static43.aFrame4.setSize(local44.right + local44.left + Static298.anInt4896, local44.top + Static75.anInt1525 + local44.bottom);
			Static43.aClass196_6 = Static24.aClass196_1 = new Class196(null, arg0, arg1, 30);
			@Pc(76) Class45 local76 = Static24.aClass196_1.method3896(1, this);
			while (local76.anInt1129 == 0) {
				Static435.method5777(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static33.method448(local89, null);
		}
	}

	@OriginalMember(owner = "client!te", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static187.anApplet_Sub1_1 == this && !Static384.aBoolean431) {
			Static242.aLong115 = Static266.method3498();
			Static435.method5777(5000L);
			Static43.aClass196_6 = null;
			this.method742(false);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	private void method742(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static384.aBoolean431) {
				return;
			}
			Static384.aBoolean431 = true;
		}
		if (Static24.aClass196_1.anApplet1 != null) {
			Static24.aClass196_1.anApplet1.destroy();
		}
		try {
			this.method740();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean56) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean56 = false;
		}
		@Pc(48) Class45 local48 = Static24.aClass196_1.method3899(Static187.anApplet_Sub1_1.getClass());
		while (local48.anInt1129 == 0) {
			Static435.method5777(100L);
		}
		if (Static391.aCanvas5 != null) {
			try {
				Static391.aCanvas5.removeFocusListener(this);
				Static391.aCanvas5.getParent().remove(Static391.aCanvas5);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static24.aClass196_1 != null) {
			try {
				Static24.aClass196_1.method3916();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method734();
		if (Static43.aFrame4 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!te", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static187.anApplet_Sub1_1 == this && !Static384.aBoolean431) {
			Static242.aLong115 = Static266.method3498() + 4000L;
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	protected abstract void method743();

	@OriginalMember(owner = "client!te", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!te", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static300.aString45 != null) {
					@Pc(10) String local10 = Static300.aString45.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(22) String local22 = Static300.aString51;
						if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
							this.method745("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static300.aString51 == null || Static300.aString51.equals("1.4.2"))) {
						this.method745("wrongjava");
						break label111;
					}
				}
				@Pc(69) int local69;
				if (Static300.aString51 != null && Static300.aString51.startsWith("1.")) {
					local69 = 2;
					@Pc(71) int local71 = 0;
					while (local69 < Static300.aString51.length()) {
						@Pc(77) char local77 = Static300.aString51.charAt(local69);
						if (local77 < '0' || local77 > '9') {
							break;
						}
						local69++;
						local71 = local77 + local71 * 10 - 48;
					}
					if (local71 >= 5) {
						Static57.aBoolean60 = true;
					}
				}
				if (Static24.aClass196_1.anApplet1 != null) {
					@Pc(113) Method local113 = Static300.aMethod2;
					if (local113 != null) {
						try {
							local113.invoke(Static24.aClass196_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static413.method5616();
				Static49.method639();
				this.method732();
				this.method738();
				this.method748();
				Static86.aClass61_1 = Static209.method2910();
				this.method738();
				while (Static242.aLong115 == 0L || Static242.aLong115 > Static266.method3498()) {
					Static126.anInt2200 = Static86.aClass61_1.method4572(Static173.anInt3129);
					for (local69 = 0; local69 < Static126.anInt2200; local69++) {
						this.method733();
					}
					this.method736();
					Static403.method5319(Static24.aClass196_1, Static391.aCanvas5);
				}
			}
		} catch (@Pc(186) Throwable local186) {
			Static33.method448(local186, this.method737());
			this.method745("crash");
		}
		this.method742(true);
	}

	@OriginalMember(owner = "client!te", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static187.anApplet_Sub1_1 == this && !Static384.aBoolean431) {
			Static242.aLong115 = 0L;
		}
	}

	@OriginalMember(owner = "client!te", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method745(@OriginalArg(0) String arg0) {
		if (this.aBoolean55) {
			return;
		}
		this.aBoolean55 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static467.method6000("loggedout", Static24.aClass196_1.anApplet1);
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!te", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static187.anApplet_Sub1_1 != this || Static384.aBoolean431) {
			return;
		}
		Static169.aBoolean226 = true;
		if (Static57.aBoolean60 && Static266.method3498() - Static172.aLong87 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static298.anInt4896 <= local24.width && Static75.anInt1525 <= local24.height) {
				Static71.aBoolean510 = true;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIII)V")
	protected final void method747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static187.anApplet_Sub1_1 == null) {
				Static187.anApplet_Sub1_1 = this;
				Static120.anInt2134 = arg0;
				Static75.anInt1525 = arg0;
				Static413.anInt6988 = 593;
				Static456.anInt7657 = 0;
				Static111.anInt2080 = 0;
				Static345.anInt5723 = arg2;
				Static298.anInt4896 = arg2;
				if (Static24.aClass196_1 == null) {
					Static43.aClass196_6 = Static24.aClass196_1 = new Class196(this, arg1, null, 0);
				}
				@Pc(66) Class45 local66 = Static24.aClass196_1.method3896(1, this);
				while (local66.anInt1129 == 0) {
					Static435.method5777(10L);
				}
			} else {
				Static160.anInt4989++;
				if (Static160.anInt4989 >= 3) {
					this.method745("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(79) Throwable local79) {
			Static33.method448(local79, null);
			this.method745("crash");
		}
	}

	@OriginalMember(owner = "client!te", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!te", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
	protected abstract void method748();

	@OriginalMember(owner = "client!te", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
