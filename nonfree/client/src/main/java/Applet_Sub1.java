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

@OriginalClass("client!aba")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!aba", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static589.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static220.anApplet_Sub1_2 != this || Static507.aBoolean647) {
			return;
		}
		Static179.aBoolean276 = true;
		if (Static477.aBoolean627 && Static112.method2047() - Static430.aLong219 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static308.anInt6203 && Static507.anInt9504 <= local24.height) {
				Static364.aBoolean483 = true;
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)V")
	private void method1516(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static507.aBoolean647) {
				return;
			}
			Static507.aBoolean647 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static589.anApplet2 != null) {
			Static589.anApplet2.destroy();
		}
		try {
			this.method1517();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean142) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean142 = false;
		}
		Static379.method5895();
		Static587.method8192();
		if (Static201.aCanvas7 != null) {
			try {
				Static201.aCanvas7.removeFocusListener(this);
				Static201.aCanvas7.getParent().remove(Static201.aCanvas7);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static372.aClass366_5 != null) {
			try {
				Static372.aClass366_5.method8273();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1520();
		if (Static402.aFrame3 != null) {
			Static402.aFrame3.setVisible(false);
			Static402.aFrame3.dispose();
			Static402.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!aba", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
	protected abstract void method1517();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)Z")
	public final boolean method1518() {
		return Static188.method3095("jagmisc");
	}

	@OriginalMember(owner = "client!aba", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static3.aBoolean6 = true;
		Static179.aBoolean276 = true;
	}

	@OriginalMember(owner = "client!aba", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
	protected abstract void method1520();

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZIILjava/lang/String;IIII)V")
	protected final void method1521(@OriginalArg(3) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static165.anInt3435 = 624;
			Static533.anApplet1 = null;
			Static123.anInt9150 = 1024;
			Static308.anInt6203 = 1024;
			Static7.anInt723 = 0;
			Static220.anApplet_Sub1_2 = this;
			Static347.anInt6686 = 0;
			Static71.anInt1872 = 768;
			Static507.anInt9504 = 768;
			Static402.aFrame3 = new Frame();
			Static402.aFrame3.setTitle("Jagex");
			Static402.aFrame3.setResizable(true);
			Static402.aFrame3.addWindowListener(this);
			Static402.aFrame3.setVisible(true);
			Static402.aFrame3.toFront();
			@Pc(40) Insets local40 = Static402.aFrame3.getInsets();
			Static402.aFrame3.setSize(local40.right + Static308.anInt6203 + local40.left, local40.bottom + Static507.anInt9504 - -local40.top);
			Static501.aClass366_6 = Static372.aClass366_5 = new Class366(arg1, arg0, 35, true);
			@Pc(74) Class316 local74 = Static372.aClass366_5.method8285(this, 1);
			while (local74.anInt9478 == 0) {
				Static214.method3478(10L);
			}
		} catch (@Pc(84) Exception local84) {
			Static109.method2014(null, local84);
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(Z)Z")
	protected final boolean method1522() {
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
				this.method1530("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	private void method1523() {
		@Pc(6) long local6 = Static112.method2047();
		@Pc(10) long local10 = Static121.aLongArray4[Static109.anInt2516];
		Static121.aLongArray4[Static109.anInt2516] = local6;
		Static109.anInt2516 = Static109.anInt2516 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(35) int local35 = (int) (local6 - local10);
			Static90.anInt2299 = ((local35 >> 1) + 32000) / local35;
		}
		if (Static543.anInt9898++ > 50) {
			Static179.aBoolean276 = true;
			Static543.anInt9898 -= 50;
			Static201.aCanvas7.setSize(Static123.anInt9150, Static71.anInt1872);
			Static201.aCanvas7.setVisible(true);
			if (Static402.aFrame3 != null && Static514.aFrame2 == null) {
				@Pc(81) Insets local81 = Static402.aFrame3.getInsets();
				Static201.aCanvas7.setLocation(Static7.anInt723 + local81.left, local81.top + Static347.anInt6686);
			} else {
				Static201.aCanvas7.setLocation(Static7.anInt723, Static347.anInt6686);
			}
		}
		this.method1525();
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method1524() {
		return null;
	}

	@OriginalMember(owner = "client!aba", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static594.aString235 != null) {
				@Pc(10) String local10 = Static594.aString235.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static594.aString242;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1530("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static594.aString242 == null || Static594.aString242.equals("1.4.2"))) {
					this.method1530("wrongjava");
					return;
				}
			}
			if (Static594.aString242 != null && Static594.aString242.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static594.aString242.length()) {
					@Pc(79) char local79 = Static594.aString242.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local79 + local73 * 10 - 48;
				}
				if (local73 >= 5) {
					Static477.aBoolean627 = true;
				}
			}
			@Pc(114) Applet local114 = Static220.anApplet_Sub1_2;
			if (Static589.anApplet2 != null) {
				local114 = Static589.anApplet2;
			}
			@Pc(120) Method local120 = Static594.aMethod1;
			if (local120 != null) {
				try {
					local120.invoke(local114, Boolean.TRUE);
				} catch (@Pc(134) Throwable local134) {
				}
			}
			Static437.method6477();
			Static509.method7322();
			this.method1529();
			this.method1532();
			Static84.aClass13_1 = Static534.method7521();
			while (Static196.aLong110 == 0L || Static196.aLong110 > Static112.method2047()) {
				Static565.anInt5165 = Static84.aClass13_1.method7244(Static418.aLong231);
				for (@Pc(157) int local157 = 0; local157 < Static565.anInt5165; local157++) {
					this.method1528();
				}
				this.method1523();
				Static457.method6720(Static372.aClass366_5, Static201.aCanvas7);
			}
		} catch (@Pc(190) ThreadDeath local190) {
			throw local190;
		} catch (@Pc(193) Throwable local193) {
			Static109.method2014(this.method1524(), local193);
			this.method1530("crash");
		} finally {
			@Pc(209) Object local209 = null;
			this.method1516(true);
		}
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)V")
	protected abstract void method1525();

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(I)Z")
	public final boolean method1526() {
		return Static188.method3095("jaclib");
	}

	@OriginalMember(owner = "client!aba", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static402.aFrame3 == null) {
			return Static589.anApplet2 == null || Static589.anApplet2 == this ? super.getParameter(arg0) : Static589.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(I)V")
	protected abstract void method1527();

	@OriginalMember(owner = "client!aba", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static402.aFrame3 == null) {
			return Static589.anApplet2 == null || Static589.anApplet2 == this ? super.getAppletContext() : Static589.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static220.anApplet_Sub1_2 == this && !Static507.aBoolean647) {
			Static196.aLong110 = Static112.method2047() + 4000L;
		}
	}

	@OriginalMember(owner = "client!aba", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static220.anApplet_Sub1_2 == this && !Static507.aBoolean647) {
			Static196.aLong110 = Static112.method2047();
			Static214.method3478(5000L);
			Static501.aClass366_6 = null;
			this.method1516(false);
		}
	}

	@OriginalMember(owner = "client!aba", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(I)V")
	private void method1528() {
		@Pc(10) long local10 = Static112.method2047();
		@Pc(14) long local14 = Static226.aLongArray5[Static449.anInt8531];
		Static226.aLongArray5[Static449.anInt8531] = local10;
		@Pc(27) boolean local27;
		if (local14 == 0L || local10 <= local14) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static449.anInt8531 = Static449.anInt8531 + 1 & 0x1F;
		synchronized (this) {
			Static164.aBoolean245 = Static3.aBoolean6;
		}
		this.method1527();
	}

	@OriginalMember(owner = "client!aba", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(Z)V")
	public synchronized void method1529() {
		if (Static201.aCanvas7 != null) {
			Static201.aCanvas7.removeFocusListener(this);
			Static201.aCanvas7.getParent().setBackground(Color.black);
			Static201.aCanvas7.getParent().remove(Static201.aCanvas7);
		}
		@Pc(22) Container local22;
		if (Static514.aFrame2 != null) {
			local22 = Static514.aFrame2;
		} else if (Static402.aFrame3 != null) {
			local22 = Static402.aFrame3;
		} else if (Static589.anApplet2 == null) {
			local22 = Static220.anApplet_Sub1_2;
		} else {
			local22 = Static589.anApplet2;
		}
		local22.setLayout(null);
		Static201.aCanvas7 = new Canvas_Sub1(this);
		local22.add(Static201.aCanvas7);
		Static201.aCanvas7.setSize(Static123.anInt9150, Static71.anInt1872);
		Static201.aCanvas7.setVisible(true);
		if (Static402.aFrame3 == local22) {
			@Pc(63) Insets local63 = Static402.aFrame3.getInsets();
			Static201.aCanvas7.setLocation(Static7.anInt723 + local63.left, local63.top - -Static347.anInt6686);
		} else {
			Static201.aCanvas7.setLocation(Static7.anInt723, Static347.anInt6686);
		}
		Static201.aCanvas7.addFocusListener(this);
		Static201.aCanvas7.requestFocus();
		Static164.aBoolean245 = true;
		Static3.aBoolean6 = true;
		Static179.aBoolean276 = true;
		Static364.aBoolean483 = false;
		Static430.aLong219 = Static112.method2047();
	}

	@OriginalMember(owner = "client!aba", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static220.anApplet_Sub1_2 == this && !Static507.aBoolean647) {
			Static196.aLong110 = 0L;
		}
	}

	@OriginalMember(owner = "client!aba", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1530(@OriginalArg(1) String arg0) {
		if (this.aBoolean140) {
			return;
		}
		this.aBoolean140 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static597.method1279(Static589.anApplet2, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!aba", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IILjava/lang/String;IBII)V")
	protected final void method1531(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static220.anApplet_Sub1_2 == null) {
				Static165.anInt3435 = 624;
				Static71.anInt1872 = arg3;
				Static507.anInt9504 = arg3;
				Static220.anApplet_Sub1_2 = this;
				Static347.anInt6686 = 0;
				Static123.anInt9150 = arg2;
				Static308.anInt6203 = arg2;
				Static533.anApplet1 = Static589.anApplet2;
				Static7.anInt723 = 0;
				Static501.aClass366_6 = Static372.aClass366_5 = new Class366(arg0, arg1, 35, Static589.anApplet2 != null);
				@Pc(72) Class316 local72 = Static372.aClass366_5.method8285(this, 1);
				while (local72.anInt9478 == 0) {
					Static214.method3478(10L);
				}
			} else {
				Static117.anInt2702++;
				if (Static117.anInt2702 >= 3) {
					this.method1530("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static109.method2014(null, local82);
			this.method1530("crash");
		}
	}

	@OriginalMember(owner = "client!aba", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static402.aFrame3 == null) {
			return Static589.anApplet2 == null || Static589.anApplet2 == this ? super.getCodeBase() : Static589.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static3.aBoolean6 = false;
	}

	@OriginalMember(owner = "client!aba", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static402.aFrame3 == null) {
			return Static589.anApplet2 == null || Static589.anApplet2 == this ? super.getDocumentBase() : Static589.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
	protected abstract void method1532();

	@OriginalMember(owner = "client!aba", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
