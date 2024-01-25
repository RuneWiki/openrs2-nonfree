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

@OriginalClass("client!ot")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	protected abstract void method1720();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIZII)V")
	protected final void method1721(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static213.anApplet_Sub1_1 == null) {
				Static145.anInt3327 = 0;
				Static12.anInt658 = 0;
				Static213.anApplet_Sub1_1 = this;
				Static543.anInt9405 = 609;
				Static90.anInt2326 = arg0;
				Static547.anInt9471 = arg0;
				Static290.anInt6867 = arg2;
				Static60.anInt1681 = arg2;
				if (Static91.aClass182_2 == null) {
					Static125.aClass182_5 = Static91.aClass182_2 = new Class182(this, arg1, null, 0);
				}
				@Pc(67) Class243 local67 = Static91.aClass182_2.method4799(1, this);
				while (local67.anInt6905 == 0) {
					Static505.method7295(10L);
				}
			} else {
				Static415.anInt9340++;
				if (Static415.anInt9340 >= 3) {
					this.method1730("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(77) Throwable local77) {
			Static41.method1359(local77, null);
			this.method1730("crash");
		}
	}

	@OriginalMember(owner = "client!ot", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIIIILjava/lang/String;II)V")
	protected final void method1722(@OriginalArg(5) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static90.anInt2326 = 768;
			Static547.anInt9471 = 768;
			Static12.anInt658 = 0;
			Static145.anInt3327 = 0;
			Static290.anInt6867 = 1024;
			Static60.anInt1681 = 1024;
			Static213.anApplet_Sub1_1 = this;
			Static543.anInt9405 = 609;
			Static543.aFrame2 = new Frame();
			Static543.aFrame2.setTitle("Jagex");
			Static543.aFrame2.setResizable(true);
			Static543.aFrame2.addWindowListener(this);
			Static543.aFrame2.setVisible(true);
			Static543.aFrame2.toFront();
			@Pc(38) Insets local38 = Static543.aFrame2.getInsets();
			Static543.aFrame2.setSize(local38.right + local38.left + Static60.anInt1681, local38.bottom + Static547.anInt9471 + local38.top);
			Static125.aClass182_5 = Static91.aClass182_2 = new Class182(null, arg1, arg0, 32);
			@Pc(72) Class243 local72 = Static91.aClass182_2.method4799(1, this);
			while (local72.anInt6905 == 0) {
				Static505.method7295(10L);
			}
		} catch (@Pc(85) Exception local85) {
			Static41.method1359(local85, null);
		}
	}

	@OriginalMember(owner = "client!ot", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static543.aFrame2 == null) {
			return Static91.aClass182_2 == null || Static91.aClass182_2.anApplet1 == this ? super.getParameter(arg0) : Static91.aClass182_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ot", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public final synchronized void method1724() {
		if (Static78.aCanvas7 != null) {
			Static78.aCanvas7.removeFocusListener(this);
			Static78.aCanvas7.getParent().remove(Static78.aCanvas7);
		}
		@Pc(16) Container local16;
		if (Static478.aFrame1 != null) {
			local16 = Static478.aFrame1;
		} else if (Static543.aFrame2 == null) {
			local16 = Static91.aClass182_2.anApplet1;
		} else {
			local16 = Static543.aFrame2;
		}
		local16.setLayout(null);
		Static78.aCanvas7 = new Canvas_Sub1(this);
		local16.add(Static78.aCanvas7);
		Static78.aCanvas7.setSize(Static290.anInt6867, Static90.anInt2326);
		Static78.aCanvas7.setVisible(true);
		if (local16 == Static543.aFrame2) {
			@Pc(55) Insets local55 = Static543.aFrame2.getInsets();
			Static78.aCanvas7.setLocation(local55.left + Static145.anInt3327, Static12.anInt658 + local55.top);
		} else {
			Static78.aCanvas7.setLocation(Static145.anInt3327, Static12.anInt658);
		}
		Static78.aCanvas7.addFocusListener(this);
		Static78.aCanvas7.requestFocus();
		Static109.aBoolean177 = true;
		Static147.aBoolean207 = true;
		Static412.aBoolean476 = true;
		Static317.aBoolean412 = false;
		Static448.aLong197 = Static93.method2172();
	}

	@OriginalMember(owner = "client!ot", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static543.aFrame2 == null) {
			return Static91.aClass182_2 == null || Static91.aClass182_2.anApplet1 == this ? super.getAppletContext() : Static91.aClass182_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)V")
	private void method1725(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static375.aBoolean434) {
				return;
			}
			Static375.aBoolean434 = true;
		}
		if (Static91.aClass182_2.anApplet1 != null) {
			Static91.aClass182_2.anApplet1.destroy();
		}
		try {
			this.method1729();
		} catch (@Pc(37) Exception local37) {
		}
		if (this.aBoolean131) {
			try {
				jagmisc.quit();
			} catch (@Pc(43) Throwable local43) {
			}
			this.aBoolean131 = false;
		}
		Static431.method6346();
		Static325.method5489();
		if (Static78.aCanvas7 != null) {
			try {
				Static78.aCanvas7.removeFocusListener(this);
				Static78.aCanvas7.getParent().remove(Static78.aCanvas7);
			} catch (@Pc(63) Exception local63) {
			}
		}
		if (Static91.aClass182_2 != null) {
			try {
				Static91.aClass182_2.method4794();
			} catch (@Pc(73) Exception local73) {
			}
		}
		this.method1735();
		if (Static543.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(83) Throwable local83) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
	private void method1726() {
		@Pc(6) long local6 = Static93.method2172();
		@Pc(10) long local10 = Static444.aLongArray14[Static191.anInt8076];
		Static444.aLongArray14[Static191.anInt8076] = local6;
		@Pc(29) boolean local29;
		if (local10 == 0L || local6 <= local10) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static191.anInt8076 = Static191.anInt8076 + 1 & 0x1F;
		synchronized (this) {
			Static109.aBoolean177 = Static147.aBoolean207;
		}
		this.method1720();
	}

	@OriginalMember(owner = "client!ot", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static543.aFrame2 == null) {
			return Static91.aClass182_2 == null || Static91.aClass182_2.anApplet1 == this ? super.getDocumentBase() : Static91.aClass182_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)Z")
	protected final boolean method1728() {
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
				this.method1730("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
	protected abstract void method1729();

	@OriginalMember(owner = "client!ot", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1730(@OriginalArg(1) String arg0) {
		if (this.aBoolean132) {
			return;
		}
		this.aBoolean132 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static554.method4839(Static91.aClass182_2.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ot", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static283.aString52 != null) {
					@Pc(6) String local6 = Static283.aString52.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static283.aString49;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method1730("wrongjava");
							break label107;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static283.aString49 == null || Static283.aString49.equals("1.4.2"))) {
						this.method1730("wrongjava");
						break label107;
					}
				}
				@Pc(66) int local66;
				if (Static283.aString49 != null && Static283.aString49.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (Static283.aString49.length() > local66) {
						@Pc(74) char local74 = Static283.aString49.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local68 = local68 * 10 + local74 - 48;
						local66++;
					}
					if (local68 >= 5) {
						Static302.aBoolean398 = true;
					}
				}
				if (Static91.aClass182_2.anApplet1 != null) {
					@Pc(107) Method local107 = Static283.aMethod1;
					if (local107 != null) {
						try {
							local107.invoke(Static91.aClass182_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(122) Throwable local122) {
						}
					}
				}
				Static95.method2184();
				Static394.method5923();
				this.method1724();
				this.method1734();
				Static106.aClass125_1 = Static462.method6788();
				while (Static318.aLong158 == 0L || Static93.method2172() < Static318.aLong158) {
					Static182.anInt3917 = Static106.aClass125_1.method5260(Static441.aLong195);
					for (local66 = 0; local66 < Static182.anInt3917; local66++) {
						this.method1726();
					}
					this.method1736();
					Static168.method3281(Static91.aClass182_2, Static78.aCanvas7);
				}
			}
		} catch (@Pc(180) Throwable local180) {
			Static41.method1359(local180, this.method1732());
			this.method1730("crash");
		}
		this.method1725(true);
	}

	@OriginalMember(owner = "client!ot", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static213.anApplet_Sub1_1 != this || Static375.aBoolean434) {
			return;
		}
		Static412.aBoolean476 = true;
		if (Static302.aBoolean398 && Static93.method2172() - Static448.aLong197 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static60.anInt1681 && Static547.anInt9471 <= local24.height) {
				Static317.aBoolean412 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)Z")
	public final boolean method1731() {
		return Static531.method7565("jagmisc");
	}

	@OriginalMember(owner = "client!ot", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static213.anApplet_Sub1_1 == this && !Static375.aBoolean434) {
			Static318.aLong158 = Static93.method2172() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ot", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static213.anApplet_Sub1_1 == this && !Static375.aBoolean434) {
			Static318.aLong158 = Static93.method2172();
			Static505.method7295(5000L);
			Static125.aClass182_5 = null;
			this.method1725(false);
		}
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1732() {
		return null;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)V")
	protected abstract void method1733();

	@OriginalMember(owner = "client!ot", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "(B)V")
	protected abstract void method1734();

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(Z)V")
	protected abstract void method1735();

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "(B)V")
	private void method1736() {
		@Pc(6) long local6 = Static93.method2172();
		@Pc(10) long local10 = Static528.aLongArray15[Static268.anInt5186];
		Static528.aLongArray15[Static268.anInt5186] = local6;
		Static268.anInt5186 = Static268.anInt5186 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static193.anInt4053 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static376.anInt6601++ > 50) {
			Static376.anInt6601 -= 50;
			Static412.aBoolean476 = true;
			Static78.aCanvas7.setSize(Static290.anInt6867, Static90.anInt2326);
			Static78.aCanvas7.setVisible(true);
			if (Static543.aFrame2 != null && Static478.aFrame1 == null) {
				@Pc(80) Insets local80 = Static543.aFrame2.getInsets();
				Static78.aCanvas7.setLocation(local80.left + Static145.anInt3327, Static12.anInt658 + local80.top);
			} else {
				Static78.aCanvas7.setLocation(Static145.anInt3327, Static12.anInt658);
			}
		}
		this.method1733();
	}

	@OriginalMember(owner = "client!ot", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static147.aBoolean207 = true;
		Static412.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!ot", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)Z")
	protected final boolean method1738() {
		return Static531.method7565("jaclib");
	}

	@OriginalMember(owner = "client!ot", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static147.aBoolean207 = false;
	}

	@OriginalMember(owner = "client!ot", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static213.anApplet_Sub1_1 == this && !Static375.aBoolean434) {
			Static318.aLong158 = 0L;
		}
	}

	@OriginalMember(owner = "client!ot", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static543.aFrame2 == null) {
			return Static91.aClass182_2 == null || Static91.aClass182_2.anApplet1 == this ? super.getCodeBase() : Static91.aClass182_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}
}
