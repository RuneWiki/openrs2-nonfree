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

@OriginalClass("client!he")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!he", name = "providesignlink", descriptor = "(Lclient!la;)V")
	public static void providesignlink(@OriginalArg(0) Class102 arg0) {
		Static164.aClass102_2 = arg0;
		Static204.aClass102_3 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	protected abstract void method778();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	protected abstract void method780();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZ)V")
	private void method781(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static80.aBoolean122) {
				return;
			}
			Static80.aBoolean122 = true;
		}
		if (Static164.aClass102_2.anApplet1 != null) {
			Static164.aClass102_2.anApplet1.destroy();
		}
		try {
			this.method778();
		} catch (@Pc(34) Exception local34) {
		}
		if (this.aBoolean75) {
			try {
				jagmisc.quit();
			} catch (@Pc(40) Throwable local40) {
			}
			this.aBoolean75 = false;
		}
		Static164.aClass102_2.method2875(Static272.anApplet_Sub1_1.getClass());
		if (Static227.aCanvas1 != null) {
			try {
				Static227.aCanvas1.removeFocusListener(this);
				Static227.aCanvas1.getParent().remove(Static227.aCanvas1);
			} catch (@Pc(61) Exception local61) {
			}
		}
		if (Static164.aClass102_2 != null) {
			try {
				Static164.aClass102_2.method2876();
			} catch (@Pc(69) Exception local69) {
			}
		}
		this.method787();
		if (Static72.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(78) Throwable local78) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!he", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static272.anApplet_Sub1_1 == this && !Static80.aBoolean122) {
			Static80.aLong69 = Static221.method3670();
			Static138.method2475(5000L);
			Static204.aClass102_3 = null;
			this.method781(false);
		}
	}

	@OriginalMember(owner = "client!he", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static272.anApplet_Sub1_1 == this && !Static80.aBoolean122) {
			Static80.aLong69 = Static221.method3670() + 4000L;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
	protected final boolean method782() {
		@Pc(6) String local6 = this.getDocumentBase().getHost().toLowerCase();
		if (local6.equals("jagex.com") || local6.endsWith(".jagex.com")) {
			return true;
		} else if (local6.equals("runescape.com") || local6.endsWith(".runescape.com")) {
			return true;
		} else if (local6.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local6.length() > 0 && local6.charAt(local6.length() - 1) >= '0' && local6.charAt(local6.length() - 1) <= '9') {
				local6 = local6.substring(0, local6.length() - 1);
			}
			if (local6.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method795("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static256.aBoolean332 = false;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	protected abstract void method783();

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
	private void method784() {
		@Pc(3) long local3 = Static297.aLongArray10[Static305.anInt5903];
		@Pc(10) long local10 = Static221.method3670();
		Static297.aLongArray10[Static305.anInt5903] = local10;
		Static305.anInt5903 = Static305.anInt5903 + 1 & 0x1F;
		if (local3 != 0L && local3 < local10) {
			@Pc(37) int local37 = (int) (local10 - local3);
			Static107.anInt2458 = ((local37 >> 1) + 32000) / local37;
		}
		if (Static206.anInt4290++ > 50) {
			Static218.aBoolean298 = true;
			Static206.anInt4290 -= 50;
			Static227.aCanvas1.setSize(Static60.anInt1510, Static120.anInt2649);
			Static227.aCanvas1.setVisible(true);
			if (Static72.aFrame1 != null && Static127.aFrame2 == null) {
				@Pc(84) Insets local84 = Static72.aFrame1.getInsets();
				Static227.aCanvas1.setLocation(local84.left + Static237.anInt4772, Static14.anInt276 + local84.top);
			} else {
				Static227.aCanvas1.setLocation(Static237.anInt4772, Static14.anInt276);
			}
		}
		this.method780();
	}

	@OriginalMember(owner = "client!he", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static72.aFrame1 == null) {
			return Static164.aClass102_2 == null || Static164.aClass102_2.anApplet1 == this ? super.getAppletContext() : Static164.aClass102_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static256.aBoolean332 = true;
		Static218.aBoolean298 = true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIIII)V")
	protected final void method785(@OriginalArg(3) int arg0) {
		try {
			if (Static272.anApplet_Sub1_1 != null) {
				Static87.anInt2021++;
				if (Static87.anInt2021 >= 3) {
					this.method795("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static120.anInt2649 = 503;
			Static237.anInt4775 = 503;
			Static60.anInt1510 = 765;
			Static32.anInt875 = 765;
			Static183.anInt3941 = 1553;
			Static272.anApplet_Sub1_1 = this;
			Static14.anInt276 = 0;
			Static237.anInt4772 = 0;
			@Pc(53) String local53 = this.getParameter("openwinjs");
			if (local53 != null && local53.equals("1")) {
				Static206.aBoolean291 = true;
			} else {
				Static206.aBoolean291 = false;
			}
			if (Static164.aClass102_2 == null) {
				Static204.aClass102_3 = Static164.aClass102_2 = new Class102(this, arg0, null, 0);
			}
			@Pc(83) Class111 local83 = Static164.aClass102_2.method2893(1, this);
			while (local83.anInt3788 == 0) {
				Static138.method2475(10L);
			}
			Static184.aThread3 = (Thread) local83.anObject4;
		} catch (@Pc(97) Exception local97) {
			Static183.method3240(local97, null);
			this.method795("crash");
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	private void method786() {
		@Pc(2) long local2 = Static221.method3670();
		@Pc(18) long local18 = Static166.aLongArray5[Static95.anInt2288];
		Static166.aLongArray5[Static95.anInt2288] = local2;
		if (local18 != 0L && local2 <= local18) {
		}
		Static95.anInt2288 = Static95.anInt2288 + 1 & 0x1F;
		synchronized (this) {
			Static72.aBoolean116 = Static256.aBoolean332;
		}
		this.method783();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	protected abstract void method787();

	@OriginalMember(owner = "client!he", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	protected abstract void method788();

	@OriginalMember(owner = "client!he", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static272.anApplet_Sub1_1 != this || Static80.aBoolean122) {
			return;
		}
		Static218.aBoolean298 = true;
		if (Static155.aBoolean238 && !Static116.aBoolean184 && Static221.method3670() - Static123.aLong90 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static32.anInt875 && Static237.anInt4775 <= local27.height) {
				Static269.aBoolean351 = true;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static158.aString118 != null) {
				@Pc(10) String local10 = Static158.aString118.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static158.aString119;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method795("wrongjava");
						return;
					}
					Static234.anInt4707 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static158.aString119 == null || Static158.aString119.equals("1.4.2"))) {
					this.method795("wrongjava");
					return;
				}
			}
			@Pc(72) int local72;
			if (Static158.aString119 != null && Static158.aString119.startsWith("1.")) {
				local72 = 2;
				@Pc(74) int local74 = 0;
				while (Static158.aString119.length() > local72) {
					@Pc(82) char local82 = Static158.aString119.charAt(local72);
					if (local82 < '0' || local82 > '9') {
						break;
					}
					local74 = local74 * 10 + local82 - 48;
					local72++;
				}
				if (local74 >= 5) {
					Static155.aBoolean238 = true;
				}
			}
			if (Static164.aClass102_2.anApplet1 != null) {
				@Pc(118) Method local118 = Static158.aMethod2;
				if (local118 != null) {
					try {
						local118.invoke(Static164.aClass102_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(133) Throwable local133) {
					}
				}
			}
			Static241.method3861();
			this.method792();
			Static179.aClass3_1 = Static255.method4022(Static120.anInt2649, Static60.anInt1510, Static227.aCanvas1);
			this.method788();
			Static101.aClass16_1 = Static204.method3466();
			this.method793();
			while (Static80.aLong69 == 0L || Static80.aLong69 > Static221.method3670()) {
				Static14.anInt277 = Static101.aClass16_1.method4236(Static140.anInt3087, Static234.anInt4707);
				for (local72 = 0; local72 < Static14.anInt277; local72++) {
					this.method786();
				}
				this.method784();
				Static21.method369(Static227.aCanvas1, Static164.aClass102_2);
			}
		} catch (@Pc(194) Exception local194) {
			Static183.method3240(local194, null);
			this.method795("crash");
		}
		this.method781(true);
	}

	@OriginalMember(owner = "client!he", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static72.aFrame1 == null) {
			return Static164.aClass102_2 == null || Static164.aClass102_2.anApplet1 == this ? super.getParameter(arg0) : Static164.aClass102_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZIIILjava/lang/String;I)V")
	protected final void method791(@OriginalArg(1) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static237.anInt4772 = 0;
			Static183.anInt3941 = 553;
			Static272.anApplet_Sub1_1 = this;
			Static14.anInt276 = 0;
			Static120.anInt2649 = 768;
			Static237.anInt4775 = 768;
			Static60.anInt1510 = 1024;
			Static32.anInt875 = 1024;
			Static72.aFrame1 = new Frame();
			Static72.aFrame1.setTitle("Jagex");
			Static72.aFrame1.setResizable(true);
			Static72.aFrame1.addWindowListener(this);
			Static72.aFrame1.setVisible(true);
			Static72.aFrame1.toFront();
			@Pc(38) Insets local38 = Static72.aFrame1.getInsets();
			Static72.aFrame1.setSize(local38.left + Static32.anInt875 + local38.right, local38.bottom + Static237.anInt4775 + local38.top);
			Static204.aClass102_3 = Static164.aClass102_2 = new Class102(null, arg0, arg1, 29);
			@Pc(70) Class111 local70 = Static164.aClass102_2.method2893(1, this);
			while (local70.anInt3788 == 0) {
				Static138.method2475(10L);
			}
			Static184.aThread3 = (Thread) local70.anObject4;
		} catch (@Pc(85) Exception local85) {
			Static183.method3240(local85, null);
		}
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
	public final synchronized void method792() {
		if (Static227.aCanvas1 != null) {
			Static227.aCanvas1.removeFocusListener(this);
			Static227.aCanvas1.getParent().remove(Static227.aCanvas1);
		}
		@Pc(20) Container local20;
		if (Static127.aFrame2 != null) {
			local20 = Static127.aFrame2;
		} else if (Static72.aFrame1 == null) {
			local20 = Static164.aClass102_2.anApplet1;
		} else {
			local20 = Static72.aFrame1;
		}
		local20.setLayout(null);
		Static227.aCanvas1 = new Canvas_Sub1(this);
		local20.add(Static227.aCanvas1);
		Static227.aCanvas1.setSize(Static60.anInt1510, Static120.anInt2649);
		Static227.aCanvas1.setVisible(true);
		if (Static72.aFrame1 == local20) {
			@Pc(62) Insets local62 = Static72.aFrame1.getInsets();
			Static227.aCanvas1.setLocation(local62.left + Static237.anInt4772, local62.top + Static14.anInt276);
		} else {
			Static227.aCanvas1.setLocation(Static237.anInt4772, Static14.anInt276);
		}
		Static227.aCanvas1.addFocusListener(this);
		Static227.aCanvas1.requestFocus();
		Static256.aBoolean332 = true;
		Static72.aBoolean116 = true;
		Static218.aBoolean298 = true;
		Static269.aBoolean351 = false;
		Static123.aLong90 = Static221.method3670();
	}

	@OriginalMember(owner = "client!he", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static272.anApplet_Sub1_1 == this && !Static80.aBoolean122) {
			Static80.aLong69 = 0L;
		}
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)V")
	public final void method793() {
		if (this.aBoolean75) {
			return;
		}
		try {
			@Pc(21) Class111 local21 = Static164.aClass102_2.method2884(Static272.anApplet_Sub1_1.getClass());
			while (local21.anInt3788 == 0) {
				Static138.method2475(100L);
			}
			if (local21.anObject4 != null) {
				throw (Throwable) local21.anObject4;
			}
			jagmisc.init();
			this.aBoolean75 = true;
			Static101.aClass16_1 = Static204.method3466();
		} catch (@Pc(47) Throwable local47) {
		}
	}

	@OriginalMember(owner = "client!he", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!he", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static72.aFrame1 == null) {
			return Static164.aClass102_2 == null || Static164.aClass102_2.anApplet1 == this ? super.getDocumentBase() : Static164.aClass102_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!he", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method795(@OriginalArg(1) String arg0) {
		if (this.aBoolean74) {
			return;
		}
		this.aBoolean74 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static322.method2907(Static164.aClass102_2.anApplet1, "loggedout");
		} catch (@Pc(36) Throwable local36) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!he", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!he", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static72.aFrame1 == null) {
			return Static164.aClass102_2 == null || Static164.aClass102_2.anApplet1 == this ? super.getCodeBase() : Static164.aClass102_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}
}
