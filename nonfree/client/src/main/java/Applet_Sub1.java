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

@OriginalClass("client!ll")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ll", name = "A", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public final void method794() {
		if (this.aBoolean49) {
			return;
		}
		try {
			@Pc(17) Class207 local17 = Static353.aClass42_5.method981(Static145.anApplet_Sub1_1.getClass());
			while (local17.anInt6346 == 0) {
				Static134.method2241(100L);
			}
			if (local17.anObject7 != null) {
				throw (Throwable) local17.anObject7;
			}
			jagmisc.init();
			this.aBoolean49 = true;
			Static316.aClass70_1 = Static306.method5146();
		} catch (@Pc(42) Throwable local42) {
		}
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	protected abstract void method795();

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
	protected abstract void method796();

	@OriginalMember(owner = "client!ll", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	protected abstract void method797();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method798(@OriginalArg(0) String arg0) {
		if (this.aBoolean48) {
			return;
		}
		this.aBoolean48 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static361.method2055("loggedout", Static353.aClass42_5.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!ll", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static176.aFrame4 == null) {
			return Static353.aClass42_5 == null || Static353.aClass42_5.anApplet1 == this ? super.getParameter(arg0) : Static353.aClass42_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static176.aFrame4 == null) {
			return Static353.aClass42_5 == null || Static353.aClass42_5.anApplet1 == this ? super.getDocumentBase() : Static353.aClass42_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static145.anApplet_Sub1_1 == this && !Static79.aBoolean346) {
			Static145.aLong106 = Static53.method898();
			Static134.method2241(5000L);
			Static13.aClass42_1 = null;
			this.method807(false);
		}
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
	public final synchronized void method800() {
		if (Static295.aCanvas4 != null) {
			Static295.aCanvas4.removeFocusListener(this);
			Static295.aCanvas4.getParent().remove(Static295.aCanvas4);
		}
		@Pc(22) Container local22;
		if (Static67.aFrame1 != null) {
			local22 = Static67.aFrame1;
		} else if (Static176.aFrame4 == null) {
			local22 = Static353.aClass42_5.anApplet1;
		} else {
			local22 = Static176.aFrame4;
		}
		local22.setLayout(null);
		Static295.aCanvas4 = new Canvas_Sub1(this);
		local22.add(Static295.aCanvas4);
		Static295.aCanvas4.setSize(Static298.anInt5944, Static171.anInt3583);
		Static295.aCanvas4.setVisible(true);
		if (local22 == Static176.aFrame4) {
			@Pc(64) Insets local64 = Static176.aFrame4.getInsets();
			Static295.aCanvas4.setLocation(Static34.anInt781 + local64.left, local64.top - -Static264.anInt5293);
		} else {
			Static295.aCanvas4.setLocation(Static34.anInt781, Static264.anInt5293);
		}
		Static295.aCanvas4.addFocusListener(this);
		Static295.aCanvas4.requestFocus();
		Static135.aBoolean157 = true;
		Static113.aBoolean433 = true;
		Static266.aBoolean335 = true;
		Static319.aBoolean423 = false;
		Static300.aLong186 = Static53.method898();
	}

	@OriginalMember(owner = "client!ll", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static113.aBoolean433 = true;
		Static266.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "(I)V")
	protected abstract void method801();

	@OriginalMember(owner = "client!ll", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static145.anApplet_Sub1_1 == this && !Static79.aBoolean346) {
			Static145.aLong106 = Static53.method898() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ll", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static145.anApplet_Sub1_1 != this || Static79.aBoolean346) {
			return;
		}
		Static266.aBoolean335 = true;
		if (Static49.aBoolean53 && Static53.method898() - Static300.aLong186 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static56.anInt1236 && local26.height >= Static165.anInt3205) {
				Static319.aBoolean423 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "(I)V")
	private void method802() {
		@Pc(11) long local11 = Static53.method898();
		@Pc(15) long local15 = Static68.aLongArray3[Static341.anInt6648];
		Static68.aLongArray3[Static341.anInt6648] = local11;
		if (local15 != 0L && local11 > local15) {
			@Pc(36) int local36 = (int) (local11 - local15);
			Static115.anInt2445 = ((local36 >> 1) + 32000) / local36;
		}
		Static341.anInt6648 = Static341.anInt6648 + 1 & 0x1F;
		if (Static253.anInt4998++ > 50) {
			Static253.anInt4998 -= 50;
			Static266.aBoolean335 = true;
			Static295.aCanvas4.setSize(Static298.anInt5944, Static171.anInt3583);
			Static295.aCanvas4.setVisible(true);
			if (Static176.aFrame4 != null && Static67.aFrame1 == null) {
				@Pc(86) Insets local86 = Static176.aFrame4.getInsets();
				Static295.aCanvas4.setLocation(local86.left + Static34.anInt781, local86.top + Static264.anInt5293);
			} else {
				Static295.aCanvas4.setLocation(Static34.anInt781, Static264.anInt5293);
			}
		}
		this.method797();
	}

	@OriginalMember(owner = "client!ll", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZILjava/lang/String;III)V")
	protected final void method803(@OriginalArg(3) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static34.anInt781 = 0;
			Static9.anInt231 = 556;
			Static171.anInt3583 = 768;
			Static165.anInt3205 = 768;
			Static298.anInt5944 = 1024;
			Static56.anInt1236 = 1024;
			Static145.anApplet_Sub1_1 = this;
			Static264.anInt5293 = 0;
			Static176.aFrame4 = new Frame();
			Static176.aFrame4.setTitle("Jagex");
			Static176.aFrame4.setResizable(true);
			Static176.aFrame4.addWindowListener(this);
			Static176.aFrame4.setVisible(true);
			Static176.aFrame4.toFront();
			@Pc(38) Insets local38 = Static176.aFrame4.getInsets();
			Static176.aFrame4.setSize(local38.right + local38.left + Static56.anInt1236, local38.bottom + local38.top + Static165.anInt3205);
			Static13.aClass42_1 = Static353.aClass42_5 = new Class42(null, arg0, arg1, 29);
			@Pc(74) Class207 local74 = Static353.aClass42_5.method972(this, 1);
			while (local74.anInt6346 == 0) {
				Static134.method2241(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static69.method1091(null, local86);
		}
	}

	@OriginalMember(owner = "client!ll", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static176.aFrame4 == null) {
			return Static353.aClass42_5 == null || Static353.aClass42_5.anApplet1 == this ? super.getCodeBase() : Static353.aClass42_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ll", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "(I)V")
	protected abstract void method805();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V")
	protected final void method806(@OriginalArg(2) int arg0) {
		try {
			if (Static145.anApplet_Sub1_1 == null) {
				Static34.anInt781 = 0;
				Static264.anInt5293 = 0;
				Static298.anInt5944 = 765;
				Static56.anInt1236 = 765;
				Static171.anInt3583 = 503;
				Static165.anInt3205 = 503;
				Static145.anApplet_Sub1_1 = this;
				Static9.anInt231 = 556;
				if (Static353.aClass42_5 == null) {
					Static13.aClass42_1 = Static353.aClass42_5 = new Class42(this, arg0, null, 0);
				}
				@Pc(60) Class207 local60 = Static353.aClass42_5.method972(this, 1);
				while (local60.anInt6346 == 0) {
					Static134.method2241(10L);
				}
			} else {
				Static163.anInt3185++;
				if (Static163.anInt3185 >= 3) {
					this.method798("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(73) Exception local73) {
			Static69.method1091(null, local73);
			this.method798("crash");
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)V")
	private void method807(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static79.aBoolean346) {
				return;
			}
			Static79.aBoolean346 = true;
		}
		if (Static353.aClass42_5.anApplet1 != null) {
			Static353.aClass42_5.anApplet1.destroy();
		}
		try {
			this.method801();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean49) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean49 = false;
		}
		@Pc(48) Class207 local48 = Static353.aClass42_5.method980(Static145.anApplet_Sub1_1.getClass());
		while (local48.anInt6346 == 0) {
			Static134.method2241(100L);
		}
		if (Static295.aCanvas4 != null) {
			try {
				Static295.aCanvas4.removeFocusListener(this);
				Static295.aCanvas4.getParent().remove(Static295.aCanvas4);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static353.aClass42_5 != null) {
			try {
				Static353.aClass42_5.method963();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method796();
		if (Static176.aFrame4 != null) {
			try {
				System.exit(0);
			} catch (@Pc(90) Throwable local90) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "(I)V")
	private void method808() {
		@Pc(6) long local6 = Static53.method898();
		@Pc(10) long local10 = Static160.aLongArray5[Static164.anInt6259];
		Static160.aLongArray5[Static164.anInt6259] = local6;
		Static164.anInt6259 = Static164.anInt6259 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local10 >= local6) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static135.aBoolean157 = Static113.aBoolean433;
		}
		this.method795();
	}

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "(I)Z")
	protected final boolean method809() {
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
				this.method798("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static145.anApplet_Sub1_1 == this && !Static79.aBoolean346) {
			Static145.aLong106 = 0L;
		}
	}

	@OriginalMember(owner = "client!ll", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ll", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static176.aFrame4 == null) {
			return Static353.aClass42_5 == null || Static353.aClass42_5.anApplet1 == this ? super.getAppletContext() : Static353.aClass42_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static113.aBoolean433 = false;
	}

	@OriginalMember(owner = "client!ll", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static59.aString43 != null) {
					@Pc(6) String local6 = Static59.aString43.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(20) String local20 = Static59.aString39;
						if (local20.equals("1.1") || local20.startsWith("1.1.") || local20.equals("1.2") || local20.startsWith("1.2.")) {
							this.method798("wrongjava");
							break label111;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static59.aString39 == null || Static59.aString39.equals("1.4.2"))) {
						this.method798("wrongjava");
						break label111;
					}
				}
				@Pc(67) int local67;
				if (Static59.aString39 != null && Static59.aString39.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (local67 < Static59.aString39.length()) {
						@Pc(75) char local75 = Static59.aString39.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local69 = local69 * 10 + local75 - 48;
						local67++;
					}
					if (local69 >= 5) {
						Static49.aBoolean53 = true;
					}
				}
				if (Static353.aClass42_5.anApplet1 != null) {
					@Pc(108) Method local108 = Static59.aMethod1;
					if (local108 != null) {
						try {
							local108.invoke(Static353.aClass42_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(123) Throwable local123) {
						}
					}
				}
				Static263.method4431();
				this.method800();
				this.method805();
				Static316.aClass70_1 = Static306.method5146();
				this.method794();
				while (Static145.aLong106 == 0L || Static145.aLong106 > Static53.method898()) {
					Static295.anInt5866 = Static316.aClass70_1.method5397(Static251.anInt4977);
					for (local67 = 0; local67 < Static295.anInt5866; local67++) {
						this.method808();
					}
					this.method802();
					Static237.method4027(Static353.aClass42_5, Static295.aCanvas4);
				}
			}
		} catch (@Pc(180) Exception local180) {
			Static69.method1091(null, local180);
			this.method798("crash");
		}
		this.method807(true);
	}

	@OriginalMember(owner = "client!ll", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
