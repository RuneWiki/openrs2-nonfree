import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
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

@OriginalClass("client!ma")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!ma", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static92.aFrame1 == null) {
			return Static120.aClass7_4 == null || Static120.aClass7_4.anApplet1 == this ? super.getParameter(arg0) : Static120.aClass7_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	protected final synchronized void method433() {
		@Pc(6) Container local6;
		if (Static92.aFrame1 == null) {
			local6 = Static120.aClass7_4.anApplet1;
		} else {
			local6 = Static92.aFrame1;
		}
		if (Static104.aCanvas1 != null) {
			Static104.aCanvas1.removeFocusListener(this);
			local6.remove(Static104.aCanvas1);
		}
		Static104.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static104.aCanvas1);
		Static104.aCanvas1.setSize(Static70.anInt710, Static4.anInt200);
		Static104.aCanvas1.setVisible(true);
		if (Static92.aFrame1 == null) {
			Static104.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static92.aFrame1.getInsets();
			Static104.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static104.aCanvas1.addFocusListener(this);
		Static104.aCanvas1.requestFocus();
		Static98.aBoolean107 = true;
		Static85.aBoolean93 = false;
		Static127.aLong128 = Static54.method1236();
	}

	@OriginalMember(owner = "client!ma", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	protected abstract void method434();

	@OriginalMember(owner = "client!ma", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static4.anApplet_Sub1_1 != this || Static54.aBoolean69) {
			return;
		}
		Static98.aBoolean107 = true;
		if (Static7.aString2 != null && Static7.aString2.startsWith("1.5") && Static54.method1236() - Static127.aLong128 > 1000L) {
			@Pc(29) Rectangle local29 = arg0.getClipBounds();
			if (local29 == null || local29.width >= Static70.anInt710 && local29.height >= Static4.anInt200) {
				Static85.aBoolean93 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	private void method435() {
		@Pc(15) long local15 = Static114.aLongArray9[Static75.anInt2096];
		@Pc(18) long local18 = Static54.method1236();
		Static114.aLongArray9[Static75.anInt2096] = local18;
		Static75.anInt2096 = Static75.anInt2096 + 1 & 0x1F;
		if (local15 != 0L && local15 < local18) {
			@Pc(48) int local48 = (int) (local18 - local15);
			Static54.anInt1752 = ((local48 >> 1) + 32000) / local48;
		}
		if (Static117.anInt2755++ > 50) {
			Static98.aBoolean107 = true;
			Static117.anInt2755 -= 50;
			Static104.aCanvas1.setSize(Static70.anInt710, Static4.anInt200);
			Static104.aCanvas1.setVisible(true);
			if (Static92.aFrame1 == null) {
				Static104.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(89) Insets local89 = Static92.aFrame1.getInsets();
				Static104.aCanvas1.setLocation(local89.left, local89.top);
			}
		}
		this.method448();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method436(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static4.anApplet_Sub1_1 = this;
			Static70.anInt710 = 765;
			Static4.anInt200 = 503;
			Static134.anInt2950 = 470;
			Static92.aFrame1 = new Frame();
			Static92.aFrame1.setTitle("Jagex");
			Static92.aFrame1.setResizable(false);
			Static92.aFrame1.addWindowListener(this);
			Static92.aFrame1.setVisible(true);
			Static92.aFrame1.toFront();
			@Pc(32) Insets local32 = Static92.aFrame1.getInsets();
			Static92.aFrame1.setSize(local32.right + local32.left + 765, local32.top + 503 - -local32.bottom);
			Static19.aClass7_2 = Static120.aClass7_4 = new Class7(true, null, arg0, arg1, 16);
			Static120.aClass7_4.method285(this, 1);
		} catch (@Pc(72) Exception local72) {
			Static93.method1709(local72, null);
		}
	}

	@OriginalMember(owner = "client!ma", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static92.aFrame1 == null) {
			return Static120.aClass7_4 == null || Static120.aClass7_4.anApplet1 == this ? super.getCodeBase() : Static120.aClass7_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZIII)V")
	protected final void method437(@OriginalArg(4) int arg0) {
		try {
			if (Static4.anApplet_Sub1_1 == null) {
				Static4.anApplet_Sub1_1 = this;
				Static134.anInt2950 = 470;
				Static70.anInt710 = 765;
				Static4.anInt200 = 503;
				if (Static120.aClass7_4 == null) {
					Static19.aClass7_2 = Static120.aClass7_4 = new Class7(false, this, arg0, null, 0);
				}
				Static120.aClass7_4.method285(this, 1);
			} else {
				Static1.anInt78++;
				if (Static1.anInt78 >= 3) {
					this.method445("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static93.method1709(local59, null);
			this.method445("crash");
		}
	}

	@OriginalMember(owner = "client!ma", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static119.aBoolean116 = true;
		Static98.aBoolean107 = true;
	}

	@OriginalMember(owner = "client!ma", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static92.aFrame1 == null) {
			return Static120.aClass7_4 == null || Static120.aClass7_4.anApplet1 == this ? super.getDocumentBase() : Static120.aClass7_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static4.anApplet_Sub1_1 == this && !Static54.aBoolean69) {
			Static32.aLong35 = Static54.method1236();
			Static13.method399(5000L);
			Static19.aClass7_2 = null;
			this.method444();
		}
	}

	@OriginalMember(owner = "client!ma", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static119.aBoolean116 = false;
	}

	@OriginalMember(owner = "client!ma", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ma", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static4.anApplet_Sub1_1 == this && !Static54.aBoolean69) {
			Static32.aLong35 = 0L;
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	protected abstract void method438();

	@OriginalMember(owner = "client!ma", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static7.aString3 != null) {
				@Pc(10) String local10 = Static7.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static7.aString2;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method445("wrongjava");
						return;
					}
					Static43.anInt1378 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static7.aString2 == null || Static7.aString2.equals("1.4.2"))) {
					this.method445("wrongjava");
					return;
				}
			}
			if (Static120.aClass7_4.anApplet1 != null) {
				@Pc(67) Method local67 = Static7.aMethod1;
				if (local67 != null) {
					try {
						local67.invoke(Static120.aClass7_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(82) Throwable local82) {
					}
				}
			}
			this.method433();
			Static3.aClass6_1 = Static36.method650(Static104.aCanvas1, Static70.anInt710, Static4.anInt200);
			this.method442();
			Static15.aClass10_62 = Static85.method1539();
			while (Static32.aLong35 == 0L || Static54.method1236() < Static32.aLong35) {
				Static67.anInt1720 = Static15.aClass10_62.method543(Static49.anInt1511, Static43.anInt1378);
				for (@Pc(108) int local108 = 0; local108 < Static67.anInt1720; local108++) {
					this.method440();
				}
				this.method435();
				Static93.method1708(Static104.aCanvas1, Static120.aClass7_4);
			}
		} catch (@Pc(141) Exception local141) {
			Static93.method1709(local141, null);
			this.method445("crash");
		}
		this.method444();
	}

	@OriginalMember(owner = "client!ma", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	private void method440() {
		@Pc(10) long local10 = Static54.method1236();
		@Pc(14) long local14 = Static90.aLongArray7[Static81.anInt2191];
		@Pc(31) boolean local31;
		if (local14 == 0L || local10 <= local14) {
			local31 = false;
		} else {
			local31 = true;
		}
		Static90.aLongArray7[Static81.anInt2191] = local10;
		Static81.anInt2191 = Static81.anInt2191 + 1 & 0x1F;
		synchronized (this) {
			Static16.aBoolean20 = Static119.aBoolean116;
		}
		this.method446();
	}

	@OriginalMember(owner = "client!ma", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static92.aFrame1 == null) {
			return Static120.aClass7_4 == null || Static120.aClass7_4.anApplet1 == this ? super.getAppletContext() : Static120.aClass7_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ma", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static4.anApplet_Sub1_1 == this && !Static54.aBoolean69) {
			Static32.aLong35 = Static54.method1236() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	protected abstract void method442();

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	private synchronized void method444() {
		if (Static54.aBoolean69) {
			return;
		}
		Static54.aBoolean69 = true;
		try {
			Static104.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method434();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static92.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static120.aClass7_4 != null) {
			try {
				Static120.aClass7_4.method278();
			} catch (@Pc(34) Exception local34) {
			}
		}
		this.method438();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method445(@OriginalArg(1) String arg0) {
		if (this.aBoolean23) {
			return;
		}
		this.aBoolean23 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V")
	protected abstract void method446();

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)Z")
	protected final boolean method447() {
		@Pc(12) String local12 = this.getDocumentBase().getHost().toLowerCase();
		if (local12.equals("jagex.com") || local12.endsWith(".jagex.com")) {
			return true;
		} else if (local12.equals("runescape.com") || local12.endsWith(".runescape.com")) {
			return true;
		} else if (local12.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local12.length() > 0 && local12.charAt(local12.length() - 1) >= '0' && local12.charAt(local12.length() - 1) <= '9') {
				local12 = local12.substring(0, local12.length() - 1);
			}
			if (local12.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method445("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
	protected abstract void method448();

	@OriginalMember(owner = "client!ma", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
