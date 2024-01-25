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

@OriginalClass("client!df")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!df", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static637.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	protected abstract void method1444();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	private void method1445(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static52.aBoolean63) {
				return;
			}
			Static52.aBoolean63 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static637.anApplet2 != null) {
			Static637.anApplet2.destroy();
		}
		try {
			this.method1458();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean96) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable local48) {
			}
			this.aBoolean96 = false;
		}
		Static399.method6588();
		Static212.method4018();
		if (Static641.aCanvas13 != null) {
			try {
				Static641.aCanvas13.removeFocusListener(this);
				Static641.aCanvas13.getParent().remove(Static641.aCanvas13);
			} catch (@Pc(68) Exception local68) {
			}
		}
		if (Static96.aClass48_5 != null) {
			try {
				Static96.aClass48_5.method1324();
			} catch (@Pc(76) Exception local76) {
			}
		}
		this.method1444();
		if (Static46.aFrame1 != null) {
			Static46.aFrame1.setVisible(false);
			Static46.aFrame1.dispose();
			Static46.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!df", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static46.aFrame1 == null) {
			return Static637.anApplet2 == null || Static637.anApplet2 == this ? super.getCodeBase() : Static637.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1448(@OriginalArg(0) String arg0) {
		if (this.aBoolean98) {
			return;
		}
		this.aBoolean98 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static675.method1325(Static637.anApplet2, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;IZII)V")
	protected final void method1449(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static172.anApplet_Sub1_1 = this;
			Static318.anApplet1 = null;
			Static309.anInt5584 = 0;
			Static17.anInt8637 = 0;
			Static19.anInt352 = 768;
			Static360.anInt6884 = 768;
			Static67.anInt1288 = 643;
			Static406.anInt7570 = 1024;
			Static97.anInt1735 = 1024;
			Static46.aFrame1 = new Frame();
			Static46.aFrame1.setTitle("Jagex");
			Static46.aFrame1.setResizable(true);
			Static46.aFrame1.addWindowListener(this);
			Static46.aFrame1.setVisible(true);
			Static46.aFrame1.toFront();
			@Pc(44) Insets local44 = Static46.aFrame1.getInsets();
			Static46.aFrame1.setSize(local44.right + local44.left + Static97.anInt1735, local44.bottom + Static360.anInt6884 - -local44.top);
			Static222.aClass48_4 = Static96.aClass48_5 = new Class48(arg0, arg1, 37, true);
			@Pc(84) Class268 local84 = Static96.aClass48_5.method1317(1, this);
			while (local84.anInt8008 == 0) {
				Static650.method9565(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static165.method3319(local94, (String) null);
		}
	}

	@OriginalMember(owner = "client!df", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
	protected final boolean method1450() {
		@Pc(15) String local15 = this.getDocumentBase().getHost().toLowerCase();
		if (local15.equals("jagex.com") || local15.endsWith(".jagex.com")) {
			return true;
		} else if (local15.equals("runescape.com") || local15.endsWith(".runescape.com")) {
			return true;
		} else if (local15.equals("stellardawn.com") || local15.endsWith(".stellardawn.com")) {
			return true;
		} else if (local15.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local15.length() > 0 && local15.charAt(local15.length() - 1) >= '0' && local15.charAt(local15.length() - 1) <= '9') {
				local15 = local15.substring(0, local15.length() - 1);
			}
			if (local15.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1448("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method1451(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static172.anApplet_Sub1_1 == null) {
				Static318.anApplet1 = Static637.anApplet2;
				Static67.anInt1288 = 643;
				Static406.anInt7570 = arg3;
				Static97.anInt1735 = arg3;
				Static17.anInt8637 = 0;
				Static172.anApplet_Sub1_1 = this;
				Static19.anInt352 = arg0;
				Static360.anInt6884 = arg0;
				Static309.anInt5584 = 0;
				Static222.aClass48_4 = Static96.aClass48_5 = new Class48(arg2, arg1, 37, Static637.anApplet2 != null);
				@Pc(72) Class268 local72 = Static96.aClass48_5.method1317(1, this);
				while (local72.anInt8008 == 0) {
					Static650.method9565(10L);
				}
			} else {
				Static153.anInt3387++;
				if (Static153.anInt3387 >= 3) {
					this.method1448("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(85) Throwable local85) {
			Static165.method3319(local85, (String) null);
			this.method1448("crash");
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	protected abstract void method1452();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Z")
	public final boolean method1453() {
		return Static91.method1580("jagmisc");
	}

	@OriginalMember(owner = "client!df", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static46.aFrame1 == null) {
			return Static637.anApplet2 == null || Static637.anApplet2 == this ? super.getAppletContext() : Static637.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
	public final boolean method1454() {
		return Static91.method1580("jagtheora");
	}

	@OriginalMember(owner = "client!df", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static219.aBoolean352 = true;
		Static328.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!df", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static172.anApplet_Sub1_1 == this && !Static52.aBoolean63) {
			Static146.aLong304 = Static99.method1701() + 4000L;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	public synchronized void method1455() {
		if (Static641.aCanvas13 != null) {
			Static641.aCanvas13.removeFocusListener(this);
			Static641.aCanvas13.getParent().setBackground(Color.black);
			Static641.aCanvas13.getParent().remove(Static641.aCanvas13);
		}
		@Pc(22) Container local22;
		if (Static102.aFrame2 != null) {
			local22 = Static102.aFrame2;
		} else if (Static46.aFrame1 != null) {
			local22 = Static46.aFrame1;
		} else if (Static637.anApplet2 == null) {
			local22 = Static172.anApplet_Sub1_1;
		} else {
			local22 = Static637.anApplet2;
		}
		local22.setLayout((LayoutManager) null);
		Static641.aCanvas13 = new Canvas_Sub1(this);
		local22.add(Static641.aCanvas13);
		Static641.aCanvas13.setSize(Static406.anInt7570, Static19.anInt352);
		Static641.aCanvas13.setVisible(true);
		if (local22 == Static46.aFrame1) {
			@Pc(63) Insets local63 = Static46.aFrame1.getInsets();
			Static641.aCanvas13.setLocation(Static17.anInt8637 + local63.left, local63.top + Static309.anInt5584);
		} else {
			Static641.aCanvas13.setLocation(Static17.anInt8637, Static309.anInt5584);
		}
		Static641.aCanvas13.addFocusListener(this);
		Static641.aCanvas13.requestFocus();
		Static494.aBoolean638 = true;
		Static219.aBoolean352 = true;
		Static328.aBoolean442 = true;
		Static397.aBoolean791 = false;
		Static285.aLong143 = Static99.method1701();
	}

	@OriginalMember(owner = "client!df", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!df", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static46.aFrame1 == null) {
			return Static637.anApplet2 == null || Static637.anApplet2 == this ? super.getParameter(arg0) : Static637.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	private void method1456() {
		@Pc(6) long local6 = Static99.method1701();
		@Pc(14) long local14 = Static154.aLongArray8[Static475.anInt8504];
		Static154.aLongArray8[Static475.anInt8504] = local6;
		Static475.anInt8504 = Static475.anInt8504 + 1 & 0x1F;
		@Pc(37) boolean local37;
		if (local14 == 0L || local6 <= local14) {
			local37 = false;
		} else {
			local37 = true;
		}
		synchronized (this) {
			Static494.aBoolean638 = Static219.aBoolean352;
		}
		this.method1452();
	}

	@OriginalMember(owner = "client!df", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static172.anApplet_Sub1_1 != this || Static52.aBoolean63) {
			return;
		}
		Static328.aBoolean442 = true;
		if (Static486.aBoolean634 && Static99.method1701() - Static285.aLong143 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || local23.width >= Static97.anInt1735 && Static360.anInt6884 <= local23.height) {
				Static397.aBoolean791 = true;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	protected abstract void method1458();

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)V")
	protected abstract void method1459();

	@OriginalMember(owner = "client!df", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!df", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(Z)Z")
	public final boolean method1460() {
		return Static91.method1580("jaclib");
	}

	@OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static72.aString14 != null) {
				@Pc(10) String local10 = Static72.aString14.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static72.aString15;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method1448("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static72.aString15 == null || Static72.aString15.equals("1.4.2"))) {
					this.method1448("wrongjava");
					return;
				}
			}
			if (Static72.aString15 != null && Static72.aString15.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static72.aString15.length()) {
					@Pc(79) char local79 = Static72.aString15.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local73 * 10 + local79 - 48;
				}
				if (local73 >= 5) {
					Static486.aBoolean634 = true;
				}
			}
			@Pc(110) Applet local110 = Static172.anApplet_Sub1_1;
			if (Static637.anApplet2 != null) {
				local110 = Static637.anApplet2;
			}
			@Pc(116) Method local116 = Static72.aMethod1;
			if (local116 != null) {
				try {
					local116.invoke(local110, Boolean.TRUE);
				} catch (@Pc(130) Throwable local130) {
				}
			}
			Static204.method7274();
			Static511.method7947();
			this.method1455();
			this.method1461();
			Static596.aClass98_1 = Static17.method7638();
			while (Static146.aLong304 == 0L || Static99.method1701() < Static146.aLong304) {
				Static470.anInt5390 = Static596.aClass98_1.method9615(Static423.aLong213);
				for (@Pc(153) int local153 = 0; local153 < Static470.anInt5390; local153++) {
					this.method1456();
				}
				this.method1462();
				Static490.method7749(Static96.aClass48_5, Static641.aCanvas13);
			}
		} catch (@Pc(182) ThreadDeath local182) {
			throw local182;
		} catch (@Pc(185) Throwable local185) {
			Static165.method3319(local185, this.method1463());
			this.method1448("crash");
		} finally {
			@Pc(201) Object local201 = null;
			this.method1445(true);
		}
	}

	@OriginalMember(owner = "client!df", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static46.aFrame1 == null) {
			return Static637.anApplet2 == null || Static637.anApplet2 == this ? super.getDocumentBase() : Static637.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!df", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!df", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!df", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static219.aBoolean352 = false;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	protected abstract void method1461();

	@OriginalMember(owner = "client!df", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static172.anApplet_Sub1_1 == this && !Static52.aBoolean63) {
			Static146.aLong304 = Static99.method1701();
			Static650.method9565(5000L);
			Static222.aClass48_4 = null;
			this.method1445(false);
		}
	}

	@OriginalMember(owner = "client!df", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
	private void method1462() {
		@Pc(6) long local6 = Static99.method1701();
		@Pc(10) long local10 = Static57.aLongArray2[Static619.anInt10803];
		Static57.aLongArray2[Static619.anInt10803] = local6;
		Static619.anInt10803 = Static619.anInt10803 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(36) int local36 = (int) (local6 - local10);
			Static645.anInt10074 = ((local36 >> 1) + 32000) / local36;
		}
		if (Static155.anInt3411++ > 50) {
			Static328.aBoolean442 = true;
			Static155.anInt3411 -= 50;
			Static641.aCanvas13.setSize(Static406.anInt7570, Static19.anInt352);
			Static641.aCanvas13.setVisible(true);
			if (Static46.aFrame1 != null && Static102.aFrame2 == null) {
				@Pc(80) Insets local80 = Static46.aFrame1.getInsets();
				Static641.aCanvas13.setLocation(Static17.anInt8637 + local80.left, Static309.anInt5584 + local80.top);
			} else {
				Static641.aCanvas13.setLocation(Static17.anInt8637, Static309.anInt5584);
			}
		}
		this.method1459();
	}

	@OriginalMember(owner = "client!df", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static172.anApplet_Sub1_1 == this && !Static52.aBoolean63) {
			Static146.aLong304 = 0L;
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method1463() {
		return null;
	}

	@OriginalMember(owner = "client!df", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}
}
