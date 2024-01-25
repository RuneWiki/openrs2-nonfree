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

@OriginalClass("client!nka")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!nka", name = "z", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!nka", name = "i", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!nka", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static214.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!nka", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Z)V")
	protected abstract void method1375();

	@OriginalMember(owner = "client!nka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static80.aBoolean148 = false;
	}

	@OriginalMember(owner = "client!nka", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!nka", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IIIILjava/lang/String;IB)V")
	protected final void method1376(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static273.anApplet_Sub1_1 == null) {
				Static295.anInt4558 = arg1;
				Static121.anInt2049 = arg1;
				Static477.anInt7668 = 0;
				Static251.anInt3953 = 0;
				Static151.anInt7983 = arg3;
				Static34.anInt8577 = arg3;
				Static273.anApplet_Sub1_1 = this;
				Static592.anInt9252 = 664;
				Static675.anApplet2 = Static214.anApplet1;
				Static29.aClass389_1 = Static135.aClass389_2 = new Class389(arg0, arg2, 37, Static214.anApplet1 != null);
				@Pc(81) Class163 local81 = Static135.aClass389_2.method9276(this, 1);
				while (local81.anInt3843 == 0) {
					Static570.method7907(10L);
				}
			} else {
				Static288.anInt4461++;
				if (Static288.anInt4461 >= 3) {
					this.method1379("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(96) Throwable local96) {
			Static329.method4572((String) null, local96);
			this.method1379("crash");
		}
	}

	@OriginalMember(owner = "client!nka", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static273.anApplet_Sub1_1 == this && !Static250.aBoolean347) {
			Static87.aLong55 = Static567.method7863();
			Static570.method7907(5000L);
			Static29.aClass389_1 = null;
			this.method1393(false);
		}
	}

	@OriginalMember(owner = "client!nka", name = "d", descriptor = "(I)V")
	protected abstract void method1377();

	@OriginalMember(owner = "client!nka", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1379(@OriginalArg(0) String arg0) {
		if (this.aBoolean177) {
			return;
		}
		this.aBoolean177 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static736.method7134(Static214.anApplet1, "loggedout");
		} catch (@Pc(39) Throwable local39) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(65) Exception local65) {
		}
	}

	@OriginalMember(owner = "client!nka", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static273.anApplet_Sub1_1 == this && !Static250.aBoolean347) {
			Static87.aLong55 = Static567.method7863() + 4000L;
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(B)V")
	private void method1380() {
		@Pc(6) long local6 = Static567.method7863();
		@Pc(10) long local10 = Static158.aLongArray21[Static539.anInt8519];
		Static158.aLongArray21[Static539.anInt8519] = local6;
		Static539.anInt8519 = Static539.anInt8519 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(42) int local42 = (int) (local6 - local10);
			Static162.anInt2752 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static669.anInt10397++ > 50) {
			Static616.aBoolean813 = true;
			Static669.anInt10397 -= 50;
			Static316.aCanvas1.setSize(Static151.anInt7983, Static295.anInt4558);
			Static316.aCanvas1.setVisible(true);
			if (Static516.aFrame2 != null && Static249.aFrame1 == null) {
				@Pc(91) Insets local91 = Static516.aFrame2.getInsets();
				Static316.aCanvas1.setLocation(local91.left + Static251.anInt3953, Static477.anInt7668 + local91.top);
			} else {
				Static316.aCanvas1.setLocation(Static251.anInt3953, Static477.anInt7668);
			}
		}
		this.method1377();
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(IIIIZILjava/lang/String;I)V")
	protected final void method1381(@OriginalArg(5) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static592.anInt9252 = 664;
			Static151.anInt7983 = 1024;
			Static34.anInt8577 = 1024;
			Static273.anApplet_Sub1_1 = this;
			Static675.anApplet2 = null;
			Static295.anInt4558 = 768;
			Static121.anInt2049 = 768;
			Static477.anInt7668 = 0;
			Static251.anInt3953 = 0;
			Static516.aFrame2 = new Frame();
			Static516.aFrame2.setTitle("Jagex");
			Static516.aFrame2.setResizable(true);
			Static516.aFrame2.addWindowListener(this);
			Static516.aFrame2.setVisible(true);
			Static516.aFrame2.toFront();
			@Pc(51) Insets local51 = Static516.aFrame2.getInsets();
			Static516.aFrame2.setSize(Static34.anInt8577 + local51.left + local51.right, Static121.anInt2049 + local51.top - -local51.bottom);
			Static29.aClass389_1 = Static135.aClass389_2 = new Class389(arg0, arg1, 37, true);
			@Pc(87) Class163 local87 = Static135.aClass389_2.method9276(this, 1);
			while (local87.anInt3843 == 0) {
				Static570.method7907(10L);
			}
		} catch (@Pc(104) Exception local104) {
			Static329.method4572((String) null, local104);
		}
	}

	@OriginalMember(owner = "client!nka", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static516.aFrame2 == null) {
			return Static214.anApplet1 == null || Static214.anApplet1 == this ? super.getParameter(arg0) : Static214.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nka", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static516.aFrame2 == null) {
			return Static214.anApplet1 == null || Static214.anApplet1 == this ? super.getAppletContext() : Static214.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nka", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static516.aFrame2 == null) {
			return Static214.anApplet1 == null || Static214.anApplet1 == this ? super.getCodeBase() : Static214.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nka", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static688.aString118 != null) {
				@Pc(10) String local10 = Static688.aString118.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(29) String local29 = Static688.aString121;
					if (local29.equals("1.1") || local29.startsWith("1.1.") || local29.equals("1.2") || local29.startsWith("1.2.")) {
						this.method1379("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static688.aString121 == null || Static688.aString121.equals("1.4.2"))) {
					this.method1379("wrongjava");
					return;
				}
			}
			if (Static688.aString121 != null && Static688.aString121.startsWith("1.")) {
				@Pc(114) int local114 = 2;
				@Pc(116) int local116 = 0;
				while (local114 < Static688.aString121.length()) {
					@Pc(124) char local124 = Static688.aString121.charAt(local114);
					if (local124 < '0' || local124 > '9') {
						break;
					}
					local114++;
					local116 = local116 * 10 + local124 - 48;
				}
				if (local116 >= 5) {
					Static265.aBoolean368 = true;
				}
			}
			@Pc(167) Applet local167 = Static273.anApplet_Sub1_1;
			if (Static214.anApplet1 != null) {
				local167 = Static214.anApplet1;
			}
			@Pc(173) Method local173 = Static688.aMethod1;
			if (local173 != null) {
				try {
					local173.invoke(local167, Boolean.TRUE);
				} catch (@Pc(187) Throwable local187) {
				}
			}
			Static418.method6116();
			Static471.method6760();
			this.method1382();
			this.method1387();
			Static66.aClass106_1 = Static201.method2851();
			while (Static87.aLong55 == 0L || Static87.aLong55 > Static567.method7863()) {
				Static175.anInt10797 = Static66.aClass106_1.method6182(Static589.aLong344);
				for (@Pc(212) int local212 = 0; local212 < Static175.anInt10797; local212++) {
					this.method1388();
				}
				this.method1380();
				Static540.method7564(Static316.aCanvas1, Static135.aClass389_2);
			}
		} catch (@Pc(251) ThreadDeath local251) {
			throw local251;
		} catch (@Pc(254) Throwable local254) {
			Static329.method4572(this.method1384(), local254);
			this.method1379("crash");
		} finally {
			@Pc(272) Object local272 = null;
			this.method1393(true);
		}
	}

	@OriginalMember(owner = "client!nka", name = "f", descriptor = "(I)V")
	public synchronized void method1382() {
		if (Static316.aCanvas1 != null) {
			Static316.aCanvas1.removeFocusListener(this);
			Static316.aCanvas1.getParent().setBackground(Color.black);
			Static316.aCanvas1.getParent().remove(Static316.aCanvas1);
		}
		@Pc(32) Container local32;
		if (Static249.aFrame1 != null) {
			local32 = Static249.aFrame1;
		} else if (Static516.aFrame2 != null) {
			local32 = Static516.aFrame2;
		} else if (Static214.anApplet1 == null) {
			local32 = Static273.anApplet_Sub1_1;
		} else {
			local32 = Static214.anApplet1;
		}
		local32.setLayout((LayoutManager) null);
		Static316.aCanvas1 = new Canvas_Sub1(this);
		local32.add(Static316.aCanvas1);
		Static316.aCanvas1.setSize(Static151.anInt7983, Static295.anInt4558);
		Static316.aCanvas1.setVisible(true);
		if (Static516.aFrame2 == local32) {
			@Pc(77) Insets local77 = Static516.aFrame2.getInsets();
			Static316.aCanvas1.setLocation(Static251.anInt3953 + local77.left, Static477.anInt7668 + local77.top);
		} else {
			Static316.aCanvas1.setLocation(Static251.anInt3953, Static477.anInt7668);
		}
		Static316.aCanvas1.addFocusListener(this);
		Static316.aCanvas1.requestFocus();
		Static80.aBoolean148 = true;
		Static344.aBoolean451 = true;
		Static616.aBoolean813 = true;
		Static57.aBoolean124 = false;
		Static680.aLong341 = Static567.method7863();
	}

	@OriginalMember(owner = "client!nka", name = "e", descriptor = "(I)Z")
	public final boolean method1383() {
		return Static548.method7659("jaclib");
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method1384() {
		return null;
	}

	@OriginalMember(owner = "client!nka", name = "j", descriptor = "(I)V")
	protected abstract void method1385();

	@OriginalMember(owner = "client!nka", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "b", descriptor = "(Z)V")
	protected abstract void method1386();

	@OriginalMember(owner = "client!nka", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static273.anApplet_Sub1_1 != this || Static250.aBoolean347) {
			return;
		}
		Static616.aBoolean813 = true;
		if (Static265.aBoolean368 && Static567.method7863() - Static680.aLong341 > 1000L) {
			@Pc(31) Rectangle local31 = arg0.getClipBounds();
			if (local31 == null || local31.width >= Static34.anInt8577 && local31.height >= Static121.anInt2049) {
				Static57.aBoolean124 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static80.aBoolean148 = true;
		Static616.aBoolean813 = true;
	}

	@OriginalMember(owner = "client!nka", name = "h", descriptor = "(I)V")
	protected abstract void method1387();

	@OriginalMember(owner = "client!nka", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static273.anApplet_Sub1_1 == this && !Static250.aBoolean347) {
			Static87.aLong55 = 0L;
		}
	}

	@OriginalMember(owner = "client!nka", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static516.aFrame2 == null) {
			return Static214.anApplet1 == null || Static214.anApplet1 == this ? super.getDocumentBase() : Static214.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nka", name = "g", descriptor = "(I)V")
	private void method1388() {
		@Pc(6) long local6 = Static567.method7863();
		@Pc(10) long local10 = Static593.aLongArray19[Static195.anInt3176];
		Static593.aLongArray19[Static195.anInt3176] = local6;
		Static195.anInt3176 = Static195.anInt3176 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local10 == 0L || local6 <= local10) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static344.aBoolean451 = Static80.aBoolean148;
		}
		this.method1386();
	}

	@OriginalMember(owner = "client!nka", name = "c", descriptor = "(I)Z")
	public final boolean method1389() {
		return Static548.method7659("jagtheora");
	}

	@OriginalMember(owner = "client!nka", name = "i", descriptor = "(I)Z")
	protected final boolean method1391() {
		@Pc(10) String local10 = this.getDocumentBase().getHost().toLowerCase();
		if (local10.equals("jagex.com") || local10.endsWith(".jagex.com")) {
			return true;
		} else if (local10.equals("runescape.com") || local10.endsWith(".runescape.com")) {
			return true;
		} else if (local10.equals("stellardawn.com") || local10.endsWith(".stellardawn.com")) {
			return true;
		} else if (local10.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local10.length() > 0 && local10.charAt(local10.length() - 1) >= '0' && local10.charAt(local10.length() - 1) <= '9') {
				local10 = local10.substring(0, local10.length() - 1);
			}
			if (local10.endsWith("192.168.1.")) {
				return true;
			}
			if (28748 != 28748) {
				Static429.aClass2_Sub23_Sub5_2 = null;
			}
			this.method1379("invalidhost");
			return false;
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(BZ)V")
	private void method1393(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static250.aBoolean347) {
				return;
			}
			Static250.aBoolean347 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static214.anApplet1 != null) {
			Static214.anApplet1.destroy();
		}
		try {
			this.method1385();
		} catch (@Pc(42) Exception local42) {
		}
		if (this.aBoolean178) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable local48) {
			}
			this.aBoolean178 = false;
		}
		Static178.method2623();
		Static659.method9032();
		if (Static316.aCanvas1 != null) {
			try {
				Static316.aCanvas1.removeFocusListener(this);
				Static316.aCanvas1.getParent().remove(Static316.aCanvas1);
			} catch (@Pc(78) Exception local78) {
			}
		}
		if (Static135.aClass389_2 != null) {
			try {
				Static135.aClass389_2.method9264();
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.method1375();
		if (Static516.aFrame2 != null) {
			Static516.aFrame2.setVisible(false);
			Static516.aFrame2.dispose();
			Static516.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!nka", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nka", name = "m", descriptor = "(I)Z")
	public final boolean method1395() {
		return Static548.method7659("jagmisc");
	}
}
