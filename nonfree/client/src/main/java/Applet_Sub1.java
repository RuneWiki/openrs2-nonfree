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

@OriginalClass("client!r")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public final synchronized void method756() {
		if (Static339.aCanvas7 != null) {
			Static339.aCanvas7.removeFocusListener(this);
			Static339.aCanvas7.getParent().remove(Static339.aCanvas7);
		}
		@Pc(18) Container local18;
		if (Static150.aFrame5 != null) {
			local18 = Static150.aFrame5;
		} else if (Static149.aFrame4 == null) {
			local18 = Static43.aClass59_5.anApplet1;
		} else {
			local18 = Static149.aFrame4;
		}
		local18.setLayout(null);
		Static339.aCanvas7 = new Canvas_Sub1(this);
		local18.add(Static339.aCanvas7);
		Static339.aCanvas7.setSize(Static86.anInt4394, Static395.anInt6582);
		Static339.aCanvas7.setVisible(true);
		if (local18 == Static149.aFrame4) {
			@Pc(60) Insets local60 = Static149.aFrame4.getInsets();
			Static339.aCanvas7.setLocation(Static434.anInt7172 + local60.left, Static11.anInt287 + local60.top);
		} else {
			Static339.aCanvas7.setLocation(Static434.anInt7172, Static11.anInt287);
		}
		Static339.aCanvas7.addFocusListener(this);
		Static339.aCanvas7.requestFocus();
		Static8.aBoolean8 = true;
		Static416.aBoolean462 = true;
		Static404.aBoolean456 = true;
		Static432.aBoolean475 = false;
		Static248.aLong127 = Static21.method458();
	}

	@OriginalMember(owner = "client!r", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static149.aFrame4 == null) {
			return Static43.aClass59_5 == null || Static43.aClass59_5.anApplet1 == this ? super.getCodeBase() : Static43.aClass59_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static416.aBoolean462 = false;
	}

	@OriginalMember(owner = "client!r", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!r", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	protected abstract void method761();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZII)V")
	protected final void method762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static261.anApplet_Sub1_1 == null) {
				Static395.anInt6582 = arg2;
				Static6.anInt215 = arg2;
				Static11.anInt287 = 0;
				Static64.anInt1456 = 591;
				Static434.anInt7172 = 0;
				Static86.anInt4394 = arg1;
				Static15.anInt349 = arg1;
				Static261.anApplet_Sub1_1 = this;
				if (Static43.aClass59_5 == null) {
					Static325.aClass59_7 = Static43.aClass59_5 = new Class59(this, arg0, null, 0);
				}
				@Pc(67) Class138 local67 = Static43.aClass59_5.method1372(this, 1);
				while (local67.anInt3723 == 0) {
					Static81.method1477(10L);
				}
			} else {
				Static275.anInt5054++;
				if (Static275.anInt5054 >= 3) {
					this.method768("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static361.method4904(local80, null);
			this.method768("crash");
		}
	}

	@OriginalMember(owner = "client!r", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static416.aBoolean462 = true;
		Static404.aBoolean456 = true;
	}

	@OriginalMember(owner = "client!r", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static261.anApplet_Sub1_1 != this || Static194.aBoolean283) {
			return;
		}
		Static404.aBoolean456 = true;
		if (Static249.aBoolean339 && Static21.method458() - Static248.aLong127 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static15.anInt349 <= local26.width && local26.height >= Static6.anInt215) {
				Static432.aBoolean475 = true;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static149.aFrame4 == null) {
			return Static43.aClass59_5 == null || Static43.aClass59_5.anApplet1 == this ? super.getDocumentBase() : Static43.aClass59_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!r", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!r", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static149.aFrame4 == null) {
			return Static43.aClass59_5 == null || Static43.aClass59_5.anApplet1 == this ? super.getParameter(arg0) : Static43.aClass59_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	protected abstract void method764();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZB)V")
	private void method765(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static194.aBoolean283) {
				return;
			}
			Static194.aBoolean283 = true;
		}
		if (Static43.aClass59_5.anApplet1 != null) {
			Static43.aClass59_5.anApplet1.destroy();
		}
		try {
			this.method766();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean49) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean49 = false;
		}
		@Pc(48) Class138 local48 = Static43.aClass59_5.method1377(Static261.anApplet_Sub1_1.getClass());
		while (local48.anInt3723 == 0) {
			Static81.method1477(100L);
		}
		if (Static339.aCanvas7 != null) {
			try {
				Static339.aCanvas7.removeFocusListener(this);
				Static339.aCanvas7.getParent().remove(Static339.aCanvas7);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static43.aClass59_5 != null) {
			try {
				Static43.aClass59_5.method1351();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method777();
		if (Static149.aFrame4 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!r", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static73.aString14 != null) {
					@Pc(6) String local6 = Static73.aString14.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static73.aString16;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method768("wrongjava");
							break label108;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static73.aString16 == null || Static73.aString16.equals("1.4.2"))) {
						this.method768("wrongjava");
						break label108;
					}
				}
				@Pc(66) int local66;
				if (Static73.aString16 != null && Static73.aString16.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (local66 < Static73.aString16.length()) {
						@Pc(74) char local74 = Static73.aString16.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local66++;
						local68 = local74 + local68 * 10 - 48;
					}
					if (local68 >= 5) {
						Static249.aBoolean339 = true;
					}
				}
				if (Static43.aClass59_5.anApplet1 != null) {
					@Pc(111) Method local111 = Static73.aMethod1;
					if (local111 != null) {
						try {
							local111.invoke(Static43.aClass59_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static77.method1432();
				Static230.method3599();
				this.method756();
				this.method761();
				Static94.aClass26_1 = Static276.method4066();
				this.method773();
				while (Static220.aLong119 == 0L || Static220.aLong119 > Static21.method458()) {
					Static322.anInt5617 = Static94.aClass26_1.method5215(Static216.anInt6006);
					for (local66 = 0; local66 < Static322.anInt5617; local66++) {
						this.method770();
					}
					this.method769();
					Static295.method4252(Static43.aClass59_5, Static339.aCanvas7);
				}
			}
		} catch (@Pc(189) Throwable local189) {
			Static361.method4904(local189, this.method776());
			this.method768("crash");
		}
		this.method765(true);
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	protected abstract void method766();

	@OriginalMember(owner = "client!r", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static261.anApplet_Sub1_1 == this && !Static194.aBoolean283) {
			Static220.aLong119 = Static21.method458() + 4000L;
		}
	}

	@OriginalMember(owner = "client!r", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static261.anApplet_Sub1_1 == this && !Static194.aBoolean283) {
			Static220.aLong119 = 0L;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method768(@OriginalArg(1) String arg0) {
		if (this.aBoolean50) {
			return;
		}
		this.aBoolean50 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static463.method4344("loggedout", Static43.aClass59_5.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	private void method769() {
		@Pc(6) long local6 = Static21.method458();
		@Pc(10) long local10 = Static36.aLongArray2[Static384.anInt6447];
		Static36.aLongArray2[Static384.anInt6447] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static411.anInt6851 = ((local28 >> 1) + 32000) / local28;
		}
		Static384.anInt6447 = Static384.anInt6447 + 1 & 0x1F;
		if (Static347.anInt5925++ > 50) {
			Static347.anInt5925 -= 50;
			Static404.aBoolean456 = true;
			Static339.aCanvas7.setSize(Static86.anInt4394, Static395.anInt6582);
			Static339.aCanvas7.setVisible(true);
			if (Static149.aFrame4 != null && Static150.aFrame5 == null) {
				@Pc(75) Insets local75 = Static149.aFrame4.getInsets();
				Static339.aCanvas7.setLocation(local75.left + Static434.anInt7172, Static11.anInt287 + local75.top);
			} else {
				Static339.aCanvas7.setLocation(Static434.anInt7172, Static11.anInt287);
			}
		}
		this.method774();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	private void method770() {
		@Pc(6) long local6 = Static21.method458();
		@Pc(10) long local10 = Static47.aLongArray3[Static39.anInt727];
		Static47.aLongArray3[Static39.anInt727] = local6;
		@Pc(23) boolean local23;
		if (local10 == 0L || local10 >= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static39.anInt727 = Static39.anInt727 + 1 & 0x1F;
		synchronized (this) {
			Static8.aBoolean8 = Static416.aBoolean462;
		}
		this.method764();
	}

	@OriginalMember(owner = "client!r", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjava/lang/String;IIIIII)V")
	protected final void method772(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static86.anInt4394 = 1024;
			Static15.anInt349 = 1024;
			Static64.anInt1456 = 591;
			Static11.anInt287 = 0;
			Static261.anApplet_Sub1_1 = this;
			Static434.anInt7172 = 0;
			Static395.anInt6582 = 768;
			Static6.anInt215 = 768;
			Static149.aFrame4 = new Frame();
			Static149.aFrame4.setTitle("Jagex");
			Static149.aFrame4.setResizable(true);
			Static149.aFrame4.addWindowListener(this);
			Static149.aFrame4.setVisible(true);
			Static149.aFrame4.toFront();
			@Pc(42) Insets local42 = Static149.aFrame4.getInsets();
			Static149.aFrame4.setSize(local42.right + local42.left + Static15.anInt349, local42.bottom + local42.top + Static6.anInt215);
			Static325.aClass59_7 = Static43.aClass59_5 = new Class59(null, arg1, arg0, 30);
			@Pc(74) Class138 local74 = Static43.aClass59_5.method1372(this, 1);
			while (local74.anInt3723 == 0) {
				Static81.method1477(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static361.method4904(local95, null);
		}
	}

	@OriginalMember(owner = "client!r", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static149.aFrame4 == null) {
			return Static43.aClass59_5 == null || Static43.aClass59_5.anApplet1 == this ? super.getAppletContext() : Static43.aClass59_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public final void method773() {
		if (this.aBoolean49) {
			return;
		}
		try {
			@Pc(18) Class138 local18 = Static43.aClass59_5.method1360(Static261.anApplet_Sub1_1.getClass());
			while (local18.anInt3723 == 0) {
				Static81.method1477(100L);
			}
			if (local18.anObject7 != null) {
				throw (Throwable) local18.anObject7;
			}
			jagmisc.init();
			this.aBoolean49 = true;
			Static94.aClass26_1 = Static276.method4066();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	protected abstract void method774();

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)Z")
	protected final boolean method775() {
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
				this.method768("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Ljava/lang/String;")
	protected String method776() {
		return null;
	}

	@OriginalMember(owner = "client!r", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static261.anApplet_Sub1_1 == this && !Static194.aBoolean283) {
			Static220.aLong119 = Static21.method458();
			Static81.method1477(5000L);
			Static325.aClass59_7 = null;
			this.method765(false);
		}
	}

	@OriginalMember(owner = "client!r", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	protected abstract void method777();
}
