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

@OriginalClass("client!fi")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!fi", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static285.anApplet5 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	protected abstract void method1245();

	@OriginalMember(owner = "client!fi", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	private void method1247() {
		@Pc(6) long local6 = Static124.method1947();
		@Pc(10) long local10 = Static437.aLongArray18[Static259.anInt4112];
		Static437.aLongArray18[Static259.anInt4112] = local6;
		Static259.anInt4112 = Static259.anInt4112 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local6 <= local10) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static324.aBoolean434 = Static373.aBoolean466;
		}
		this.method1256();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1248() {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static279.anApplet_Sub1_1 != this || Static97.aBoolean116) {
			return;
		}
		Static594.aBoolean710 = true;
		if (Static654.aBoolean731 && Static124.method1947() - Static116.aLong72 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static197.anInt3210 && local24.height >= Static267.anInt4239) {
				Static571.aBoolean679 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)Z")
	public final boolean method1249() {
		return Static374.method6479("jaclib");
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;IIZIIII)V")
	protected final void method1250(@OriginalArg(0) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static10.anInt176 = 0;
			Static151.anApplet6 = null;
			Static415.anInt7087 = 0;
			Static563.anInt9176 = 1024;
			Static197.anInt3210 = 1024;
			Static316.anInt8165 = 768;
			Static267.anInt4239 = 768;
			Static279.anApplet_Sub1_1 = this;
			Static293.anInt4548 = 644;
			Static634.aFrame5 = new Frame();
			Static634.aFrame5.setTitle("Jagex");
			Static634.aFrame5.setResizable(true);
			Static634.aFrame5.addWindowListener(this);
			Static634.aFrame5.setVisible(true);
			Static634.aFrame5.toFront();
			@Pc(45) Insets local45 = Static634.aFrame5.getInsets();
			Static634.aFrame5.setSize(Static197.anInt3210 + local45.left + local45.right, Static267.anInt4239 - (-local45.top - local45.bottom));
			Static317.aClass202_4 = Static150.aClass202_2 = new Class202(arg1, arg0, 37, true);
			@Pc(79) Class297 local79 = Static150.aClass202_2.method4737(this, 1);
			while (local79.anInt8459 == 0) {
				Static127.method1985(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static17.method268((String) null, local92);
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V")
	protected abstract void method1251();

	@OriginalMember(owner = "client!fi", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
	protected final boolean method1252() {
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
				this.method1255("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	protected abstract void method1253();

	@OriginalMember(owner = "client!fi", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1255(@OriginalArg(1) String arg0) {
		if (this.aBoolean90) {
			return;
		}
		this.aBoolean90 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static680.method2300("loggedout", Static285.anApplet5);
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!fi", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static279.anApplet_Sub1_1 == this && !Static97.aBoolean116) {
			Static504.aLong263 = Static124.method1947();
			Static127.method1985(5000L);
			Static317.aClass202_4 = null;
			this.method1259(false);
		}
	}

	@OriginalMember(owner = "client!fi", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static634.aFrame5 == null) {
			return Static285.anApplet5 == null || Static285.anApplet5 == this ? super.getCodeBase() : Static285.anApplet5.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	protected abstract void method1256();

	@OriginalMember(owner = "client!fi", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static279.anApplet_Sub1_1 == this && !Static97.aBoolean116) {
			Static504.aLong263 = 0L;
		}
	}

	@OriginalMember(owner = "client!fi", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static373.aBoolean466 = false;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	protected abstract void method1257();

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "(I)V")
	private void method1258() {
		@Pc(6) long local6 = Static124.method1947();
		@Pc(14) long local14 = Static389.aLongArray3[Static494.anInt8454];
		Static389.aLongArray3[Static494.anInt8454] = local6;
		Static494.anInt8454 = Static494.anInt8454 + 1 & 0x1F;
		if (local14 != 0L && local14 < local6) {
			@Pc(40) int local40 = (int) (local6 - local14);
			Static581.anInt9565 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static214.anInt3450++ > 50) {
			Static594.aBoolean710 = true;
			Static214.anInt3450 -= 50;
			Static105.aCanvas2.setSize(Static563.anInt9176, Static316.anInt8165);
			Static105.aCanvas2.setVisible(true);
			if (Static634.aFrame5 != null && Static518.aFrame4 == null) {
				@Pc(84) Insets local84 = Static634.aFrame5.getInsets();
				Static105.aCanvas2.setLocation(local84.left + Static10.anInt176, Static415.anInt7087 + local84.top);
			} else {
				Static105.aCanvas2.setLocation(Static10.anInt176, Static415.anInt7087);
			}
		}
		this.method1251();
	}

	@OriginalMember(owner = "client!fi", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static634.aFrame5 == null) {
			return Static285.anApplet5 == null || Static285.anApplet5 == this ? super.getDocumentBase() : Static285.anApplet5.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
	private void method1259(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static97.aBoolean116) {
				return;
			}
			Static97.aBoolean116 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static285.anApplet5 != null) {
			Static285.anApplet5.destroy();
		}
		try {
			this.method1257();
		} catch (@Pc(45) Exception local45) {
		}
		if (this.aBoolean91) {
			try {
				jagmisc.quit();
			} catch (@Pc(51) Throwable local51) {
			}
			this.aBoolean91 = false;
		}
		Static33.method428();
		Static43.method610();
		if (Static105.aCanvas2 != null) {
			try {
				Static105.aCanvas2.removeFocusListener(this);
				Static105.aCanvas2.getParent().remove(Static105.aCanvas2);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Static150.aClass202_2 != null) {
			try {
				Static150.aClass202_2.method4734();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method1253();
		if (Static634.aFrame5 != null) {
			Static634.aFrame5.setVisible(false);
			Static634.aFrame5.dispose();
			Static634.aFrame5 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!fi", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static634.aFrame5 == null) {
			return Static285.anApplet5 == null || Static285.anApplet5 == this ? super.getParameter(arg0) : Static285.anApplet5.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z")
	public final boolean method1260() {
		return Static374.method6479("jagtheora");
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;IBIIII)V")
	protected final void method1261(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (Static279.anApplet_Sub1_1 == null) {
				Static151.anApplet6 = Static285.anApplet5;
				Static293.anInt4548 = 644;
				Static316.anInt8165 = arg2;
				Static267.anInt4239 = arg2;
				Static279.anApplet_Sub1_1 = this;
				Static563.anInt9176 = arg3;
				Static197.anInt3210 = arg3;
				Static415.anInt7087 = 0;
				Static10.anInt176 = 0;
				Static317.aClass202_4 = Static150.aClass202_2 = new Class202(arg1, arg0, 37, Static285.anApplet5 != null);
				@Pc(70) Class297 local70 = Static150.aClass202_2.method4737(this, 1);
				while (local70.anInt8459 == 0) {
					Static127.method1985(10L);
				}
			} else {
				Static93.anInt1553++;
				if (Static93.anInt1553 >= 3) {
					this.method1255("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(83) Throwable local83) {
			Static17.method268((String) null, local83);
			this.method1255("crash");
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
	public final boolean method1262() {
		return Static374.method6479("jagmisc");
	}

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "(I)V")
	public synchronized void method1263() {
		if (Static105.aCanvas2 != null) {
			Static105.aCanvas2.removeFocusListener(this);
			Static105.aCanvas2.getParent().setBackground(Color.black);
			Static105.aCanvas2.getParent().remove(Static105.aCanvas2);
		}
		@Pc(22) Container local22;
		if (Static518.aFrame4 != null) {
			local22 = Static518.aFrame4;
		} else if (Static634.aFrame5 != null) {
			local22 = Static634.aFrame5;
		} else if (Static285.anApplet5 == null) {
			local22 = Static279.anApplet_Sub1_1;
		} else {
			local22 = Static285.anApplet5;
		}
		local22.setLayout((LayoutManager) null);
		Static105.aCanvas2 = new Canvas_Sub1(this);
		local22.add(Static105.aCanvas2);
		Static105.aCanvas2.setSize(Static563.anInt9176, Static316.anInt8165);
		Static105.aCanvas2.setVisible(true);
		if (local22 == Static634.aFrame5) {
			@Pc(62) Insets local62 = Static634.aFrame5.getInsets();
			Static105.aCanvas2.setLocation(Static10.anInt176 + local62.left, Static415.anInt7087 + local62.top);
		} else {
			Static105.aCanvas2.setLocation(Static10.anInt176, Static415.anInt7087);
		}
		Static105.aCanvas2.addFocusListener(this);
		Static105.aCanvas2.requestFocus();
		Static324.aBoolean434 = true;
		Static373.aBoolean466 = true;
		Static594.aBoolean710 = true;
		Static571.aBoolean679 = false;
		Static116.aLong72 = Static124.method1947();
	}

	@OriginalMember(owner = "client!fi", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static373.aBoolean466 = true;
		Static594.aBoolean710 = true;
	}

	@OriginalMember(owner = "client!fi", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static308.aString50 != null) {
				@Pc(10) String local10 = Static308.aString50.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static308.aString46;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method1255("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static308.aString46 == null || Static308.aString46.equals("1.4.2"))) {
					this.method1255("wrongjava");
					return;
				}
			}
			if (Static308.aString46 != null && Static308.aString46.startsWith("1.")) {
				@Pc(69) int local69 = 2;
				@Pc(71) int local71 = 0;
				while (local69 < Static308.aString46.length()) {
					@Pc(77) char local77 = Static308.aString46.charAt(local69);
					if (local77 < '0' || local77 > '9') {
						break;
					}
					local69++;
					local71 = local77 + local71 * 10 - 48;
				}
				if (local71 >= 5) {
					Static654.aBoolean731 = true;
				}
			}
			@Pc(110) Applet local110 = Static279.anApplet_Sub1_1;
			if (Static285.anApplet5 != null) {
				local110 = Static285.anApplet5;
			}
			@Pc(116) Method local116 = Static308.aMethod2;
			if (local116 != null) {
				try {
					local116.invoke(local110, Boolean.TRUE);
				} catch (@Pc(130) Throwable local130) {
				}
			}
			Static310.method4769();
			Static548.method7567();
			this.method1263();
			this.method1245();
			Static409.aClass13_1 = Static11.method176();
			while (Static504.aLong263 == 0L || Static504.aLong263 > Static124.method1947()) {
				Static117.anInt2044 = Static409.aClass13_1.method6674(Static420.aLong221);
				for (@Pc(153) int local153 = 0; local153 < Static117.anInt2044; local153++) {
					this.method1247();
				}
				this.method1258();
				Static366.method5464(Static150.aClass202_2, Static105.aCanvas2);
			}
		} catch (@Pc(184) ThreadDeath local184) {
			throw local184;
		} catch (@Pc(187) Throwable local187) {
			Static17.method268(this.method1248(), local187);
			this.method1255("crash");
		} finally {
			@Pc(203) Object local203 = null;
			this.method1259(true);
		}
	}

	@OriginalMember(owner = "client!fi", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static279.anApplet_Sub1_1 == this && !Static97.aBoolean116) {
			Static504.aLong263 = Static124.method1947() + 4000L;
		}
	}

	@OriginalMember(owner = "client!fi", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static634.aFrame5 == null) {
			return Static285.anApplet5 == null || Static285.anApplet5 == this ? super.getAppletContext() : Static285.anApplet5.getAppletContext();
		} else {
			return null;
		}
	}
}
