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

@OriginalClass("client!ak")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!ak", name = "K", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!ak", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static649.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	private void method1579(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static609.aBoolean728) {
				return;
			}
			Static609.aBoolean728 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static649.anApplet2 != null) {
			Static649.anApplet2.destroy();
		}
		try {
			this.method1589();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean97) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean97 = false;
		}
		Static12.method233();
		Static251.method1892();
		if (Static17.aCanvas1 != null) {
			try {
				Static17.aCanvas1.removeFocusListener(this);
				Static17.aCanvas1.getParent().remove(Static17.aCanvas1);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static239.aClass207_2 != null) {
			try {
				Static239.aClass207_2.method4570();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1596();
		if (Static280.aFrame10 != null) {
			Static280.aFrame10.setVisible(false);
			Static280.aFrame10.dispose();
			Static280.aFrame10 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ak", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	protected abstract void method1580();

	@OriginalMember(owner = "client!ak", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static333.anApplet_Sub1_1 != this || Static609.aBoolean728) {
			return;
		}
		Static172.aBoolean223 = true;
		if (Static227.aBoolean266 && Static429.method5935() - Static491.aLong228 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static553.anInt8551 <= local26.width && local26.height >= Static599.anInt9215) {
				Static121.aBoolean154 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static280.aFrame10 == null) {
			return Static649.anApplet2 == null || Static649.anApplet2 == this ? super.getCodeBase() : Static649.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static640.aBoolean782 = false;
	}

	@OriginalMember(owner = "client!ak", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static332.aString67 != null) {
				@Pc(10) String local10 = Static332.aString67.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static332.aString66;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method1586("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static332.aString66 == null || Static332.aString66.equals("1.4.2"))) {
					this.method1586("wrongjava");
					return;
				}
			}
			if (Static332.aString66 != null && Static332.aString66.startsWith("1.")) {
				@Pc(69) int local69 = 2;
				@Pc(71) int local71 = 0;
				while (Static332.aString66.length() > local69) {
					@Pc(77) char local77 = Static332.aString66.charAt(local69);
					if (local77 < '0' || local77 > '9') {
						break;
					}
					local69++;
					local71 = local77 + local71 * 10 - 48;
				}
				if (local71 >= 5) {
					Static227.aBoolean266 = true;
				}
			}
			@Pc(114) Applet local114 = Static333.anApplet_Sub1_1;
			if (Static649.anApplet2 != null) {
				local114 = Static649.anApplet2;
			}
			@Pc(120) Method local120 = Static332.aMethod1;
			if (local120 != null) {
				try {
					local120.invoke(local114, Boolean.TRUE);
				} catch (@Pc(134) Throwable local134) {
				}
			}
			Static319.method4406();
			Static95.method1940();
			this.method1597();
			this.method1580();
			Static572.aClass41_1 = Static528.method7110();
			while (Static142.aLong153 == 0L || Static142.aLong153 > Static429.method5935()) {
				Static120.anInt2275 = Static572.aClass41_1.method6917(Static194.aLong106);
				for (@Pc(157) int local157 = 0; local157 < Static120.anInt2275; local157++) {
					this.method1583();
				}
				this.method1587();
				Static446.method6127(Static17.aCanvas1, Static239.aClass207_2);
			}
		} catch (@Pc(194) ThreadDeath local194) {
			throw local194;
		} catch (@Pc(197) Throwable local197) {
			Static357.method4765(local197, this.method1594());
			this.method1586("crash");
		} finally {
			@Pc(213) Object local213 = null;
			this.method1579(true);
		}
	}

	@OriginalMember(owner = "client!ak", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	private void method1583() {
		@Pc(6) long local6 = Static429.method5935();
		@Pc(10) long local10 = Class21.lb[Static144.anInt2622];
		Class21.lb[Static144.anInt2622] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local10 >= local6) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static144.anInt2622 = Static144.anInt2622 + 1 & 0x1F;
		synchronized (this) {
			Static175.aBoolean230 = Static640.aBoolean782;
		}
		this.method1592();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/String;ZIIB)V")
	protected final void method1584(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static435.anInt6854 = 0;
			Static134.anApplet1 = null;
			Static483.anInt7606 = 648;
			Static333.anApplet_Sub1_1 = this;
			Static632.anInt9867 = 1024;
			Static553.anInt8551 = 1024;
			Static661.anInt9530 = 0;
			Static357.anInt5421 = 768;
			Static599.anInt9215 = 768;
			Static280.aFrame10 = new Frame();
			Static280.aFrame10.setTitle("Jagex");
			Static280.aFrame10.setResizable(true);
			Static280.aFrame10.addWindowListener(this);
			Static280.aFrame10.setVisible(true);
			Static280.aFrame10.toFront();
			@Pc(48) Insets local48 = Static280.aFrame10.getInsets();
			Static280.aFrame10.setSize(Static553.anInt8551 + local48.left + local48.right, local48.bottom + Static599.anInt9215 - -local48.top);
			Static524.aClass207_4 = Static239.aClass207_2 = new Class207(arg0, arg1, 37, true);
			@Pc(82) Class281 local82 = Static239.aClass207_2.method4587(1, this);
			while (local82.anInt7338 == 0) {
				Static491.method6679(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static357.method4765(local92, (String) null);
		}
	}

	@OriginalMember(owner = "client!ak", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static333.anApplet_Sub1_1 == this && !Static609.aBoolean728) {
			Static142.aLong153 = Static429.method5935();
			Static491.method6679(5000L);
			Static524.aClass207_4 = null;
			this.method1579(false);
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)Z")
	public final boolean method1585() {
		return Static678.method8984("jagmisc");
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1586(@OriginalArg(0) String arg0) {
		if (this.aBoolean96) {
			return;
		}
		this.aBoolean96 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static684.method6376("loggedout", Static649.anApplet2);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!ak", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V")
	private void method1587() {
		@Pc(6) long local6 = Static429.method5935();
		@Pc(10) long local10 = Static148.aLongArray3[Static554.anInt8293];
		Static148.aLongArray3[Static554.anInt8293] = local6;
		Static554.anInt8293 = Static554.anInt8293 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(44) int local44 = (int) (local6 - local10);
			Static555.anInt8559 = ((local44 >> 1) + 32000) / local44;
		}
		if (Static435.anInt6852++ > 50) {
			Static435.anInt6852 -= 50;
			Static172.aBoolean223 = true;
			Static17.aCanvas1.setSize(Static632.anInt9867, Static357.anInt5421);
			Static17.aCanvas1.setVisible(true);
			if (Static280.aFrame10 != null && Static407.aFrame5 == null) {
				@Pc(80) Insets local80 = Static280.aFrame10.getInsets();
				Static17.aCanvas1.setLocation(local80.left + Static661.anInt9530, Static435.anInt6854 + local80.top);
			} else {
				Static17.aCanvas1.setLocation(Static661.anInt9530, Static435.anInt6854);
			}
		}
		this.method1598();
	}

	@OriginalMember(owner = "client!ak", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static640.aBoolean782 = true;
		Static172.aBoolean223 = true;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z")
	protected final boolean method1588() {
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
				this.method1586("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static333.anApplet_Sub1_1 == this && !Static609.aBoolean728) {
			Static142.aLong153 = 0L;
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	protected abstract void method1589();

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z")
	public final boolean method1590() {
		return Static678.method8984("jagtheora");
	}

	@OriginalMember(owner = "client!ak", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static333.anApplet_Sub1_1 == this && !Static609.aBoolean728) {
			Static142.aLong153 = Static429.method5935() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ak", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static280.aFrame10 == null) {
			return Static649.anApplet2 == null || Static649.anApplet2 == this ? super.getParameter(arg0) : Static649.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	protected final void method1591(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static333.anApplet_Sub1_1 == null) {
				Static435.anInt6854 = 0;
				Static483.anInt7606 = 648;
				Static661.anInt9530 = 0;
				Static632.anInt9867 = arg0;
				Static553.anInt8551 = arg0;
				Static134.anApplet1 = Static649.anApplet2;
				Static333.anApplet_Sub1_1 = this;
				Static357.anInt5421 = arg2;
				Static599.anInt9215 = arg2;
				Static524.aClass207_4 = Static239.aClass207_2 = new Class207(arg3, arg1, 37, Static649.anApplet2 != null);
				@Pc(74) Class281 local74 = Static239.aClass207_2.method4587(1, this);
				while (local74.anInt7338 == 0) {
					Static491.method6679(10L);
				}
			} else {
				Static542.anInt8396++;
				if (Static542.anInt8396 >= 3) {
					this.method1586("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(84) Throwable local84) {
			Static357.method4765(local84, (String) null);
			this.method1586("crash");
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
	protected abstract void method1592();

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z")
	public final boolean method1593() {
		return Static678.method8984("jaclib");
	}

	@OriginalMember(owner = "client!ak", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static280.aFrame10 == null) {
			return Static649.anApplet2 == null || Static649.anApplet2 == this ? super.getDocumentBase() : Static649.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method1594() {
		return null;
	}

	@OriginalMember(owner = "client!ak", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ak", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static280.aFrame10 == null) {
			return Static649.anApplet2 == null || Static649.anApplet2 == this ? super.getAppletContext() : Static649.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V")
	protected abstract void method1596();

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
	public synchronized void method1597() {
		if (Static17.aCanvas1 != null) {
			Static17.aCanvas1.removeFocusListener(this);
			Static17.aCanvas1.getParent().setBackground(Color.black);
			Static17.aCanvas1.getParent().remove(Static17.aCanvas1);
		}
		@Pc(22) Container local22;
		if (Static407.aFrame5 != null) {
			local22 = Static407.aFrame5;
		} else if (Static280.aFrame10 != null) {
			local22 = Static280.aFrame10;
		} else if (Static649.anApplet2 == null) {
			local22 = Static333.anApplet_Sub1_1;
		} else {
			local22 = Static649.anApplet2;
		}
		local22.setLayout((LayoutManager) null);
		Static17.aCanvas1 = new Canvas_Sub1(this);
		local22.add(Static17.aCanvas1);
		Static17.aCanvas1.setSize(Static632.anInt9867, Static357.anInt5421);
		Static17.aCanvas1.setVisible(true);
		if (Static280.aFrame10 == local22) {
			@Pc(71) Insets local71 = Static280.aFrame10.getInsets();
			Static17.aCanvas1.setLocation(Static661.anInt9530 + local71.left, Static435.anInt6854 + local71.top);
		} else {
			Static17.aCanvas1.setLocation(Static661.anInt9530, Static435.anInt6854);
		}
		Static17.aCanvas1.addFocusListener(this);
		Static17.aCanvas1.requestFocus();
		Static640.aBoolean782 = true;
		Static175.aBoolean230 = true;
		Static172.aBoolean223 = true;
		Static121.aBoolean154 = false;
		Static491.aLong228 = Static429.method5935();
	}

	@OriginalMember(owner = "client!ak", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "(I)V")
	protected abstract void method1598();

	@OriginalMember(owner = "client!ak", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}
}
