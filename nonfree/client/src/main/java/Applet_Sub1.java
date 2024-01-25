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

@OriginalClass("client!qf")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!qf", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static533.anApplet4 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static498.anApplet_Sub1_1 == this && !Static497.aBoolean624) {
			Static3.aLong5 = Static587.method7753();
			Static374.method5521(5000L);
			Static547.aClass221_12 = null;
			this.method1622(false);
		}
	}

	@OriginalMember(owner = "client!qf", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	protected abstract void method1612();

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1613() {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZBILjava/lang/String;I)V")
	protected final void method1614(@OriginalArg(2) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static498.anApplet_Sub1_1 = this;
			Static515.anInt3451 = 620;
			Static447.anInt7372 = 768;
			Static224.anInt4385 = 768;
			Static212.anInt4225 = 0;
			Static318.anInt5754 = 1024;
			Static56.anInt1315 = 1024;
			Static233.anApplet3 = null;
			Static26.anInt8939 = 0;
			Static92.aFrame1 = new Frame();
			Static92.aFrame1.setTitle("Jagex");
			Static92.aFrame1.setResizable(true);
			Static92.aFrame1.addWindowListener(this);
			Static92.aFrame1.setVisible(true);
			Static92.aFrame1.toFront();
			@Pc(40) Insets local40 = Static92.aFrame1.getInsets();
			Static92.aFrame1.setSize(local40.left + Static56.anInt1315 + local40.right, local40.top + Static224.anInt4385 + local40.bottom);
			Static547.aClass221_12 = Static409.aClass221_6 = new Class221(arg0, arg1, 35, true);
			@Pc(73) Class192 local73 = Static409.aClass221_6.method5198(1, this);
			while (local73.anInt5186 == 0) {
				Static374.method5521(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static379.method5607(null, local88);
		}
	}

	@OriginalMember(owner = "client!qf", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static498.anApplet_Sub1_1 == this && !Static497.aBoolean624) {
			Static3.aLong5 = 0L;
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)Z")
	public final boolean method1616() {
		return Static557.method7419("jagmisc");
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	protected abstract void method1618();

	@OriginalMember(owner = "client!qf", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static498.anApplet_Sub1_1 == this && !Static497.aBoolean624) {
			Static3.aLong5 = Static587.method7753() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)Z")
	public final boolean method1619() {
		return Static557.method7419("jaclib");
	}

	@OriginalMember(owner = "client!qf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static498.anApplet_Sub1_1 != this || Static497.aBoolean624) {
			return;
		}
		Static63.aBoolean141 = true;
		if (Static175.aBoolean272 && Static587.method7753() - Static206.aLong119 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static56.anInt1315 && local26.height >= Static224.anInt4385) {
				Static582.aBoolean724 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static570.aBoolean712 = true;
		Static63.aBoolean141 = true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZ)V")
	private void method1622(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static497.aBoolean624) {
				return;
			}
			Static497.aBoolean624 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static533.anApplet4 != null) {
			Static533.anApplet4.destroy();
		}
		try {
			this.method1628();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean153) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean153 = false;
		}
		Static401.method5839();
		Static86.method1946();
		if (Static347.aCanvas9 != null) {
			try {
				Static347.aCanvas9.removeFocusListener(this);
				Static347.aCanvas9.getParent().remove(Static347.aCanvas9);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static409.aClass221_6 != null) {
			try {
				Static409.aClass221_6.method5205();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1632();
		if (Static92.aFrame1 != null) {
			Static92.aFrame1.setVisible(false);
			Static92.aFrame1.dispose();
			Static92.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
	protected abstract void method1623();

	@OriginalMember(owner = "client!qf", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static92.aFrame1 == null) {
			return Static533.anApplet4 == null || Static533.anApplet4 == this ? super.getParameter(arg0) : Static533.anApplet4.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
	private void method1625() {
		@Pc(6) long local6 = Static587.method7753();
		@Pc(10) long local10 = Static115.aLongArray7[Static506.anInt8041];
		Static115.aLongArray7[Static506.anInt8041] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static506.anInt8041 = Static506.anInt8041 + 1 & 0x1F;
		synchronized (this) {
			Static538.aBoolean658 = Static570.aBoolean712;
		}
		this.method1623();
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V")
	public synchronized void method1626() {
		if (Static347.aCanvas9 != null) {
			Static347.aCanvas9.removeFocusListener(this);
			Static347.aCanvas9.getParent().setBackground(Color.black);
			Static347.aCanvas9.getParent().remove(Static347.aCanvas9);
		}
		@Pc(30) Container local30;
		if (Static311.aFrame2 != null) {
			local30 = Static311.aFrame2;
		} else if (Static92.aFrame1 != null) {
			local30 = Static92.aFrame1;
		} else if (Static533.anApplet4 == null) {
			local30 = Static498.anApplet_Sub1_1;
		} else {
			local30 = Static533.anApplet4;
		}
		local30.setLayout(null);
		Static347.aCanvas9 = new Canvas_Sub1(this);
		local30.add(Static347.aCanvas9);
		Static347.aCanvas9.setSize(Static318.anInt5754, Static447.anInt7372);
		Static347.aCanvas9.setVisible(true);
		if (Static92.aFrame1 == local30) {
			@Pc(77) Insets local77 = Static92.aFrame1.getInsets();
			Static347.aCanvas9.setLocation(Static26.anInt8939 + local77.left, Static212.anInt4225 + local77.top);
		} else {
			Static347.aCanvas9.setLocation(Static26.anInt8939, Static212.anInt4225);
		}
		Static347.aCanvas9.addFocusListener(this);
		Static347.aCanvas9.requestFocus();
		Static570.aBoolean712 = true;
		Static538.aBoolean658 = true;
		Static63.aBoolean141 = true;
		Static582.aBoolean724 = false;
		Static206.aLong119 = Static587.method7753();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	private void method1627() {
		@Pc(13) long local13 = Static587.method7753();
		@Pc(17) long local17 = Static134.aLongArray9[Static229.anInt4405];
		Static134.aLongArray9[Static229.anInt4405] = local13;
		Static229.anInt4405 = Static229.anInt4405 + 1 & 0x1F;
		if (local17 != 0L && local13 > local17) {
			@Pc(45) int local45 = (int) (local13 - local17);
			Static306.anInt5563 = ((local45 >> 1) + 32000) / local45;
		}
		if (Static70.anInt9329++ > 50) {
			Static70.anInt9329 -= 50;
			Static63.aBoolean141 = true;
			Static347.aCanvas9.setSize(Static318.anInt5754, Static447.anInt7372);
			Static347.aCanvas9.setVisible(true);
			if (Static92.aFrame1 != null && Static311.aFrame2 == null) {
				@Pc(80) Insets local80 = Static92.aFrame1.getInsets();
				Static347.aCanvas9.setLocation(local80.left + Static26.anInt8939, local80.top - -Static212.anInt4225);
			} else {
				Static347.aCanvas9.setLocation(Static26.anInt8939, Static212.anInt4225);
			}
		}
		this.method1612();
	}

	@OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static342.aString81 != null) {
				@Pc(10) String local10 = Static342.aString81.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static342.aString86;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1630("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static342.aString86 == null || Static342.aString86.equals("1.4.2"))) {
					this.method1630("wrongjava");
					return;
				}
			}
			if (Static342.aString86 != null && Static342.aString86.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static342.aString86.length()) {
					@Pc(78) char local78 = Static342.aString86.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local78 + local72 * 10 - 48;
				}
				if (local72 >= 5) {
					Static175.aBoolean272 = true;
				}
			}
			@Pc(108) Applet local108 = Static498.anApplet_Sub1_1;
			if (Static533.anApplet4 != null) {
				local108 = Static533.anApplet4;
			}
			@Pc(114) Method local114 = Static342.aMethod1;
			if (local114 != null) {
				try {
					local114.invoke(local108, Boolean.TRUE);
				} catch (@Pc(128) Throwable local128) {
				}
			}
			Static265.method4350();
			Static5.method99();
			this.method1626();
			this.method1618();
			Static270.aClass77_1 = Static4.method61();
			while (Static3.aLong5 == 0L || Static587.method7753() < Static3.aLong5) {
				Static164.anInt3287 = Static270.aClass77_1.method7576(Static383.aLong187);
				for (@Pc(151) int local151 = 0; local151 < Static164.anInt3287; local151++) {
					this.method1625();
				}
				this.method1627();
				Static194.method3307(Static347.aCanvas9, Static409.aClass221_6);
			}
		} catch (@Pc(178) ThreadDeath local178) {
			throw local178;
		} catch (@Pc(181) Throwable local181) {
			Static379.method5607(this.method1613(), local181);
			this.method1630("crash");
		} finally {
			@Pc(197) Object local197 = null;
			this.method1622(true);
		}
	}

	@OriginalMember(owner = "client!qf", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static92.aFrame1 == null) {
			return Static533.anApplet4 == null || Static533.anApplet4 == this ? super.getAppletContext() : Static533.anApplet4.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static570.aBoolean712 = false;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	protected abstract void method1628();

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method1629(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static498.anApplet_Sub1_1 == null) {
				Static515.anInt3451 = 620;
				Static233.anApplet3 = Static533.anApplet4;
				Static212.anInt4225 = 0;
				Static26.anInt8939 = 0;
				Static447.anInt7372 = arg2;
				Static224.anInt4385 = arg2;
				Static318.anInt5754 = arg1;
				Static56.anInt1315 = arg1;
				Static498.anApplet_Sub1_1 = this;
				Static547.aClass221_12 = Static409.aClass221_6 = new Class221(arg3, arg0, 35, Static533.anApplet4 != null);
				@Pc(70) Class192 local70 = Static409.aClass221_6.method5198(1, this);
				while (local70.anInt5186 == 0) {
					Static374.method5521(10L);
				}
			} else {
				Static92.anInt2290++;
				if (Static92.anInt2290 >= 3) {
					this.method1630("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(83) Throwable local83) {
			Static379.method5607(null, local83);
			this.method1630("crash");
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1630(@OriginalArg(0) String arg0) {
		if (this.aBoolean154) {
			return;
		}
		this.aBoolean154 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static605.method6792("loggedout", Static533.anApplet4);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!qf", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(B)Z")
	protected final boolean method1631() {
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
				this.method1630("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static92.aFrame1 == null) {
			return Static533.anApplet4 == null || Static533.anApplet4 == this ? super.getDocumentBase() : Static533.anApplet4.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
	protected abstract void method1632();

	@OriginalMember(owner = "client!qf", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static92.aFrame1 == null) {
			return Static533.anApplet4 == null || Static533.anApplet4 == this ? super.getCodeBase() : Static533.anApplet4.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
