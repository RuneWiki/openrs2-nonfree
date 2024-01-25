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

@OriginalClass("client!td")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!td", name = "J", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!td", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static590.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method1117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static170.anApplet_Sub1_1 == null) {
				Static499.anInt4149 = arg3;
				Static38.anInt603 = arg3;
				Static281.anInt4923 = 0;
				Static130.anInt2566 = arg0;
				Static493.anInt8493 = arg0;
				Static272.anInt4785 = 0;
				Static312.anInt5341 = 618;
				Static139.anApplet1 = Static590.anApplet2;
				Static170.anApplet_Sub1_1 = this;
				Static342.aClass109_10 = Static362.aClass109_5 = new Class109(arg1, arg2, 35, Static590.anApplet2 != null);
				@Pc(68) Class260 local68 = Static362.aClass109_5.method2177(this, 1);
				while (local68.anInt7041 == 0) {
					Static391.method5400(10L);
				}
			} else {
				Static541.anInt9061++;
				if (Static541.anInt9061 >= 3) {
					this.method1119("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Throwable local78) {
			Static345.method4708(local78, null);
			this.method1119("crash");
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Z")
	public final boolean method1118() {
		return Static342.method4694("jagmisc");
	}

	@OriginalMember(owner = "client!td", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static170.anApplet_Sub1_1 != this || Static477.aBoolean617) {
			return;
		}
		Static573.aBoolean741 = true;
		if (Static164.aBoolean703 && Static413.method5668() - Static293.aLong156 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static493.anInt8493 <= local24.width && local24.height >= Static38.anInt603) {
				Static292.aBoolean411 = true;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1119(@OriginalArg(1) String arg0) {
		if (this.aBoolean102) {
			return;
		}
		this.aBoolean102 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static602.method2417(Static590.anApplet2, "loggedout");
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!td", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static224.aBoolean577 = true;
		Static573.aBoolean741 = true;
	}

	@OriginalMember(owner = "client!td", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static224.aBoolean577 = false;
	}

	@OriginalMember(owner = "client!td", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
	private void method1120() {
		@Pc(6) long local6 = Static413.method5668();
		@Pc(14) long local14 = Static99.aLongArray18[Static474.anInt8990];
		Static99.aLongArray18[Static474.anInt8990] = local6;
		if (local14 != 0L && local14 < local6) {
			@Pc(34) int local34 = (int) (local6 - local14);
			Static163.anInt2947 = ((local34 >> 1) + 32000) / local34;
		}
		Static474.anInt8990 = Static474.anInt8990 + 1 & 0x1F;
		if (Static576.anInt9489++ > 50) {
			Static576.anInt9489 -= 50;
			Static573.aBoolean741 = true;
			Static499.aCanvas9.setSize(Static130.anInt2566, Static499.anInt4149);
			Static499.aCanvas9.setVisible(true);
			if (Static142.aFrame1 != null && Static264.aFrame2 == null) {
				@Pc(84) Insets local84 = Static142.aFrame1.getInsets();
				Static499.aCanvas9.setLocation(local84.left + Static281.anInt4923, Static272.anInt4785 + local84.top);
			} else {
				Static499.aCanvas9.setLocation(Static281.anInt4923, Static272.anInt4785);
			}
		}
		this.method1126();
	}

	@OriginalMember(owner = "client!td", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static142.aFrame1 == null) {
			return Static590.anApplet2 == null || Static590.anApplet2 == this ? super.getParameter(arg0) : Static590.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Z")
	protected final boolean method1122() {
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
				this.method1119("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)Z")
	public final boolean method1123() {
		return Static342.method4694("jaclib");
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method1124() {
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	private void method1125(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static477.aBoolean617) {
				return;
			}
			Static477.aBoolean617 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static590.anApplet2 != null) {
			Static590.anApplet2.destroy();
		}
		try {
			this.method1129();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean101) {
			try {
				jagmisc.quit();
			} catch (@Pc(48) Throwable local48) {
			}
			this.aBoolean101 = false;
		}
		Static289.method4086();
		Static32.method429();
		if (Static499.aCanvas9 != null) {
			try {
				Static499.aCanvas9.removeFocusListener(this);
				Static499.aCanvas9.getParent().remove(Static499.aCanvas9);
			} catch (@Pc(68) Exception local68) {
			}
		}
		if (Static362.aClass109_5 != null) {
			try {
				Static362.aClass109_5.method2172();
			} catch (@Pc(76) Exception local76) {
			}
		}
		this.method1127();
		if (Static142.aFrame1 != null) {
			Static142.aFrame1.setVisible(false);
			Static142.aFrame1.dispose();
			Static142.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!td", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static170.anApplet_Sub1_1 == this && !Static477.aBoolean617) {
			Static447.aLong237 = 0L;
		}
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	protected abstract void method1126();

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	protected abstract void method1127();

	@OriginalMember(owner = "client!td", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static142.aFrame1 == null) {
			return Static590.anApplet2 == null || Static590.anApplet2 == this ? super.getCodeBase() : Static590.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
	protected abstract void method1128();

	@OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
	protected abstract void method1129();

	@OriginalMember(owner = "client!td", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	private void method1130() {
		@Pc(10) long local10 = Static413.method5668();
		@Pc(14) long local14 = Static242.aLongArray14[Static294.anInt5059];
		Static242.aLongArray14[Static294.anInt5059] = local10;
		@Pc(29) boolean local29;
		if (local14 == 0L || local14 >= local10) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static294.anInt5059 = Static294.anInt5059 + 1 & 0x1F;
		synchronized (this) {
			Static161.aBoolean224 = Static224.aBoolean577;
		}
		this.method1128();
	}

	@OriginalMember(owner = "client!td", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static142.aFrame1 == null) {
			return Static590.anApplet2 == null || Static590.anApplet2 == this ? super.getDocumentBase() : Static590.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static170.anApplet_Sub1_1 == this && !Static477.aBoolean617) {
			Static447.aLong237 = Static413.method5668() + 4000L;
		}
	}

	@OriginalMember(owner = "client!td", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static170.anApplet_Sub1_1 == this && !Static477.aBoolean617) {
			Static447.aLong237 = Static413.method5668();
			Static391.method5400(5000L);
			Static342.aClass109_10 = null;
			this.method1125(false);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIIIILjava/lang/String;)V")
	protected final void method1131(@OriginalArg(1) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static170.anApplet_Sub1_1 = this;
			Static130.anInt2566 = 1024;
			Static493.anInt8493 = 1024;
			Static499.anInt4149 = 768;
			Static38.anInt603 = 768;
			Static139.anApplet1 = null;
			Static312.anInt5341 = 618;
			Static272.anInt4785 = 0;
			Static281.anInt4923 = 0;
			Static142.aFrame1 = new Frame();
			Static142.aFrame1.setTitle("Jagex");
			Static142.aFrame1.setResizable(true);
			Static142.aFrame1.addWindowListener(this);
			Static142.aFrame1.setVisible(true);
			Static142.aFrame1.toFront();
			@Pc(48) Insets local48 = Static142.aFrame1.getInsets();
			Static142.aFrame1.setSize(Static493.anInt8493 + local48.left + local48.right, Static38.anInt603 - (-local48.top - local48.bottom));
			Static342.aClass109_10 = Static362.aClass109_5 = new Class109(arg0, arg1, 35, true);
			@Pc(82) Class260 local82 = Static362.aClass109_5.method2177(this, 1);
			while (local82.anInt7041 == 0) {
				Static391.method5400(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static345.method4708(local92, null);
		}
	}

	@OriginalMember(owner = "client!td", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static142.aFrame1 == null) {
			return Static590.anApplet2 == null || Static590.anApplet2 == this ? super.getAppletContext() : Static590.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!td", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
	public synchronized void method1132() {
		if (Static499.aCanvas9 != null) {
			Static499.aCanvas9.removeFocusListener(this);
			Static499.aCanvas9.getParent().setBackground(Color.black);
			Static499.aCanvas9.getParent().remove(Static499.aCanvas9);
		}
		@Pc(22) Container local22;
		if (Static264.aFrame2 != null) {
			local22 = Static264.aFrame2;
		} else if (Static142.aFrame1 != null) {
			local22 = Static142.aFrame1;
		} else if (Static590.anApplet2 == null) {
			local22 = Static170.anApplet_Sub1_1;
		} else {
			local22 = Static590.anApplet2;
		}
		local22.setLayout(null);
		Static499.aCanvas9 = new Canvas_Sub1(this);
		local22.add(Static499.aCanvas9);
		Static499.aCanvas9.setSize(Static130.anInt2566, Static499.anInt4149);
		Static499.aCanvas9.setVisible(true);
		if (local22 == Static142.aFrame1) {
			@Pc(75) Insets local75 = Static142.aFrame1.getInsets();
			Static499.aCanvas9.setLocation(local75.left + Static281.anInt4923, local75.top - -Static272.anInt4785);
		} else {
			Static499.aCanvas9.setLocation(Static281.anInt4923, Static272.anInt4785);
		}
		Static499.aCanvas9.addFocusListener(this);
		Static499.aCanvas9.requestFocus();
		Static224.aBoolean577 = true;
		Static161.aBoolean224 = true;
		Static573.aBoolean741 = true;
		Static292.aBoolean411 = false;
		Static293.aLong156 = Static413.method5668();
	}

	@OriginalMember(owner = "client!td", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!td", name = "k", descriptor = "(I)V")
	protected abstract void method1133();

	@OriginalMember(owner = "client!td", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!td", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static148.aString20 != null) {
				@Pc(10) String local10 = Static148.aString20.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static148.aString22;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1119("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static148.aString22 == null || Static148.aString22.equals("1.4.2"))) {
					this.method1119("wrongjava");
					return;
				}
			}
			if (Static148.aString22 != null && Static148.aString22.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (Static148.aString22.length() > local70) {
					@Pc(78) char local78 = Static148.aString22.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local72 = local78 + local72 * 10 - 48;
					local70++;
				}
				if (local72 >= 5) {
					Static164.aBoolean703 = true;
				}
			}
			@Pc(108) Applet local108 = Static170.anApplet_Sub1_1;
			if (Static590.anApplet2 != null) {
				local108 = Static590.anApplet2;
			}
			@Pc(114) Method local114 = Static148.aMethod2;
			if (local114 != null) {
				try {
					local114.invoke(local108, Boolean.TRUE);
				} catch (@Pc(128) Throwable local128) {
				}
			}
			Static371.method4991();
			Static47.method718();
			this.method1132();
			this.method1133();
			Static327.aClass45_1 = Static519.method7215();
			while (Static447.aLong237 == 0L || Static413.method5668() < Static447.aLong237) {
				Static205.anInt9211 = Static327.aClass45_1.method7471(Static241.aLong131);
				for (@Pc(151) int local151 = 0; local151 < Static205.anInt9211; local151++) {
					this.method1130();
				}
				this.method1120();
				Static448.method6207(Static362.aClass109_5, Static499.aCanvas9);
			}
		} catch (@Pc(182) ThreadDeath local182) {
			throw local182;
		} catch (@Pc(185) Throwable local185) {
			Static345.method4708(local185, this.method1124());
			this.method1119("crash");
		} finally {
			@Pc(201) Object local201 = null;
			this.method1125(true);
		}
	}
}
