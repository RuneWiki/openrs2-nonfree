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

@OriginalClass("client!qj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!qj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V")
	protected final void method820(@OriginalArg(4) int arg0) {
		try {
			if (Static93.anApplet_Sub1_1 == null) {
				Static26.anInt476 = 765;
				Static350.anInt4382 = 765;
				Static93.anApplet_Sub1_1 = this;
				Static325.anInt2764 = 0;
				Static119.anInt2297 = 561;
				Static204.anInt6778 = 0;
				Static321.anInt6388 = 503;
				Static132.anInt6775 = 503;
				if (Static197.aClass215_5 == null) {
					Static123.aClass215_7 = Static197.aClass215_5 = new Class215(this, arg0, null, 0);
				}
				@Pc(65) Class193 local65 = Static197.aClass215_5.method5654(this, 1);
				while (local65.anInt5986 == 0) {
					Static163.method2863(10L);
				}
			} else {
				Static323.anInt6730++;
				if (Static323.anInt6730 >= 3) {
					this.method836("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(75) Exception local75) {
			Static268.method4816(null, local75);
			this.method836("crash");
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Z")
	protected final boolean method825() {
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
				this.method836("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static93.anApplet_Sub1_1 == this && !Static9.aBoolean14) {
			Static272.aLong145 = Static292.method5114() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	private void method826() {
		@Pc(6) long local6 = Static292.method5114();
		@Pc(10) long local10 = Static51.aLongArray4[Static239.anInt2817];
		Static51.aLongArray4[Static239.anInt2817] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local6 <= local10) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static239.anInt2817 = Static239.anInt2817 + 1 & 0x1F;
		synchronized (this) {
			Static167.aBoolean266 = Static264.aBoolean454;
		}
		this.method828();
	}

	@OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static93.anApplet_Sub1_1 != this || Static9.aBoolean14) {
			return;
		}
		Static306.aBoolean506 = true;
		if (Static82.aBoolean110 && Static292.method5114() - Static67.aLong32 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static350.anInt4382 <= local24.width && Static132.anInt6775 <= local24.height) {
				Static337.aBoolean537 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static333.aFrame2 == null) {
			return Static197.aClass215_5 == null || Static197.aClass215_5.anApplet1 == this ? super.getCodeBase() : Static197.aClass215_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	protected abstract void method828();

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZIIIILjava/lang/String;)V")
	protected final void method829(@OriginalArg(1) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static325.anInt2764 = 0;
			Static119.anInt2297 = 561;
			Static321.anInt6388 = 768;
			Static132.anInt6775 = 768;
			Static93.anApplet_Sub1_1 = this;
			Static26.anInt476 = 1024;
			Static350.anInt4382 = 1024;
			Static204.anInt6778 = 0;
			Static333.aFrame2 = new Frame();
			Static333.aFrame2.setTitle("Jagex");
			Static333.aFrame2.setResizable(true);
			Static333.aFrame2.addWindowListener(this);
			Static333.aFrame2.setVisible(true);
			Static333.aFrame2.toFront();
			@Pc(38) Insets local38 = Static333.aFrame2.getInsets();
			Static333.aFrame2.setSize(Static350.anInt4382 + local38.left + local38.right, local38.bottom + Static132.anInt6775 + local38.top);
			Static123.aClass215_7 = Static197.aClass215_5 = new Class215(null, arg0, arg1, 29);
			@Pc(72) Class193 local72 = Static197.aClass215_5.method5654(this, 1);
			while (local72.anInt5986 == 0) {
				Static163.method2863(10L);
			}
		} catch (@Pc(82) Exception local82) {
			Static268.method4816(null, local82);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZZ)V")
	private void method830(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static9.aBoolean14) {
				return;
			}
			Static9.aBoolean14 = true;
		}
		if (Static197.aClass215_5.anApplet1 != null) {
			Static197.aClass215_5.anApplet1.destroy();
		}
		try {
			this.method834();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean65) {
			try {
				jagmisc.quit();
			} catch (@Pc(46) Throwable local46) {
			}
			this.aBoolean65 = false;
		}
		@Pc(55) Class193 local55 = Static197.aClass215_5.method5665(Static93.anApplet_Sub1_1.getClass());
		while (local55.anInt5986 == 0) {
			Static163.method2863(100L);
		}
		if (Static235.aCanvas6 != null) {
			try {
				Static235.aCanvas6.removeFocusListener(this);
				Static235.aCanvas6.getParent().remove(Static235.aCanvas6);
			} catch (@Pc(74) Exception local74) {
			}
		}
		if (Static197.aClass215_5 != null) {
			try {
				Static197.aClass215_5.method5664();
			} catch (@Pc(82) Exception local82) {
			}
		}
		this.method841();
		if (Static333.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(92) Throwable local92) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public final synchronized void method831() {
		if (Static235.aCanvas6 != null) {
			Static235.aCanvas6.removeFocusListener(this);
			Static235.aCanvas6.getParent().remove(Static235.aCanvas6);
		}
		@Pc(18) Container local18;
		if (Static291.aFrame1 != null) {
			local18 = Static291.aFrame1;
		} else if (Static333.aFrame2 == null) {
			local18 = Static197.aClass215_5.anApplet1;
		} else {
			local18 = Static333.aFrame2;
		}
		local18.setLayout(null);
		Static235.aCanvas6 = new Canvas_Sub1(this);
		local18.add(Static235.aCanvas6);
		Static235.aCanvas6.setSize(Static26.anInt476, Static321.anInt6388);
		Static235.aCanvas6.setVisible(true);
		if (local18 == Static333.aFrame2) {
			@Pc(60) Insets local60 = Static333.aFrame2.getInsets();
			Static235.aCanvas6.setLocation(local60.left + Static204.anInt6778, Static325.anInt2764 + local60.top);
		} else {
			Static235.aCanvas6.setLocation(Static204.anInt6778, Static325.anInt2764);
		}
		Static235.aCanvas6.addFocusListener(this);
		Static235.aCanvas6.requestFocus();
		Static264.aBoolean454 = true;
		Static167.aBoolean266 = true;
		Static306.aBoolean506 = true;
		Static337.aBoolean537 = false;
		Static67.aLong32 = Static292.method5114();
	}

	@OriginalMember(owner = "client!qj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static333.aFrame2 == null) {
			return Static197.aClass215_5 == null || Static197.aClass215_5.anApplet1 == this ? super.getDocumentBase() : Static197.aClass215_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
	protected abstract void method833();

	@OriginalMember(owner = "client!qj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static264.aBoolean454 = false;
	}

	@OriginalMember(owner = "client!qj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static333.aFrame2 == null) {
			return Static197.aClass215_5 == null || Static197.aClass215_5.anApplet1 == this ? super.getParameter(arg0) : Static197.aClass215_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	protected abstract void method834();

	@OriginalMember(owner = "client!qj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method836(@OriginalArg(0) String arg0) {
		if (this.aBoolean66) {
			return;
		}
		this.aBoolean66 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static367.method3947(Static197.aClass215_5.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static333.aFrame2 == null) {
			return Static197.aClass215_5 == null || Static197.aClass215_5.anApplet1 == this ? super.getAppletContext() : Static197.aClass215_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static264.aBoolean454 = true;
		Static306.aBoolean506 = true;
	}

	@OriginalMember(owner = "client!qj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static93.anApplet_Sub1_1 == this && !Static9.aBoolean14) {
			Static272.aLong145 = Static292.method5114();
			Static163.method2863(5000L);
			Static123.aClass215_7 = null;
			this.method830(false);
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V")
	public final void method837() {
		if (this.aBoolean65) {
			return;
		}
		try {
			@Pc(18) Class193 local18 = Static197.aClass215_5.method5656(Static93.anApplet_Sub1_1.getClass());
			while (local18.anInt5986 == 0) {
				Static163.method2863(100L);
			}
			if (local18.anObject7 != null) {
				throw (Throwable) local18.anObject7;
			}
			jagmisc.init();
			this.aBoolean65 = true;
			Static25.aClass11_1 = Static55.method1102();
		} catch (@Pc(43) Throwable local43) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
	protected abstract void method838();

	@OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
	private void method840() {
		@Pc(6) long local6 = Static292.method5114();
		@Pc(10) long local10 = Static69.aLongArray5[Static13.anInt209];
		Static69.aLongArray5[Static13.anInt209] = local6;
		Static13.anInt209 = Static13.anInt209 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(43) int local43 = (int) (local6 - local10);
			Static79.anInt6704 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static153.anInt3148++ > 50) {
			Static153.anInt3148 -= 50;
			Static306.aBoolean506 = true;
			Static235.aCanvas6.setSize(Static26.anInt476, Static321.anInt6388);
			Static235.aCanvas6.setVisible(true);
			if (Static333.aFrame2 != null && Static291.aFrame1 == null) {
				@Pc(80) Insets local80 = Static333.aFrame2.getInsets();
				Static235.aCanvas6.setLocation(local80.left + Static204.anInt6778, Static325.anInt2764 + local80.top);
			} else {
				Static235.aCanvas6.setLocation(Static204.anInt6778, Static325.anInt2764);
			}
		}
		this.method833();
	}

	@OriginalMember(owner = "client!qj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static93.anApplet_Sub1_1 == this && !Static9.aBoolean14) {
			Static272.aLong145 = 0L;
		}
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label110: {
				if (Static343.aString263 != null) {
					@Pc(10) String local10 = Static343.aString263.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static343.aString267;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method836("wrongjava");
							break label110;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static343.aString267 == null || Static343.aString267.equals("1.4.2"))) {
						this.method836("wrongjava");
						break label110;
					}
				}
				@Pc(70) int local70;
				if (Static343.aString267 != null && Static343.aString267.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Static343.aString267.length()) {
						@Pc(78) char local78 = Static343.aString267.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local72 * 10 + local78 - 48;
					}
					if (local72 >= 5) {
						Static82.aBoolean110 = true;
					}
				}
				if (Static197.aClass215_5.anApplet1 != null) {
					@Pc(109) Method local109 = Static343.aMethod1;
					if (local109 != null) {
						try {
							local109.invoke(Static197.aClass215_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(124) Throwable local124) {
						}
					}
				}
				Static67.method1211();
				Static10.method160();
				this.method831();
				this.method838();
				Static25.aClass11_1 = Static55.method1102();
				this.method837();
				while (Static272.aLong145 == 0L || Static272.aLong145 > Static292.method5114()) {
					Static44.anInt1167 = Static25.aClass11_1.method5105(Static131.anInt2596);
					for (local70 = 0; local70 < Static44.anInt1167; local70++) {
						this.method826();
					}
					this.method840();
					if (Static126.anInt2452 == 1) {
						Static163.method2863(5L);
					}
					Static158.method2800(Static235.aCanvas6, Static197.aClass215_5);
				}
			}
		} catch (@Pc(193) Exception local193) {
			Static268.method4816(null, local193);
			this.method836("crash");
		}
		this.method830(true);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
	protected abstract void method841();
}
