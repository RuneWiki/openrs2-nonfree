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

@OriginalClass("client!gu")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!gu", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static87.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	private void method1429() {
		@Pc(6) long local6 = Static174.method3502();
		@Pc(10) long local10 = Static111.aLongArray1[Static205.anInt4373];
		Static111.aLongArray1[Static205.anInt4373] = local6;
		@Pc(29) boolean local29;
		if (local10 == 0L || local6 <= local10) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static205.anInt4373 = Static205.anInt4373 + 1 & 0x1F;
		synchronized (this) {
			Static510.aBoolean503 = Static301.aBoolean432;
		}
		this.method1444();
	}

	@OriginalMember(owner = "client!gu", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static3.anApplet_Sub1_2 == this && !Static511.aBoolean681) {
			Static6.aLong9 = 0L;
		}
	}

	@OriginalMember(owner = "client!gu", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static3.anApplet_Sub1_2 == this && !Static511.aBoolean681) {
			Static6.aLong9 = Static174.method3502() + 4000L;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	protected abstract void method1430();

	@OriginalMember(owner = "client!gu", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V")
	public final synchronized void method1431() {
		if (Static38.aCanvas4 != null) {
			Static38.aCanvas4.removeFocusListener(this);
			Static38.aCanvas4.getParent().remove(Static38.aCanvas4);
		}
		@Pc(18) Container local18;
		if (Static345.aFrame2 != null) {
			local18 = Static345.aFrame2;
		} else if (Static138.aFrame1 != null) {
			local18 = Static138.aFrame1;
		} else if (Static87.anApplet1 == null) {
			local18 = Static3.anApplet_Sub1_2;
		} else {
			local18 = Static87.anApplet1;
		}
		local18.setLayout(null);
		Static38.aCanvas4 = new Canvas_Sub1(this);
		local18.add(Static38.aCanvas4);
		Static38.aCanvas4.setSize(Static228.anInt4744, Static180.anInt4051);
		Static38.aCanvas4.setVisible(true);
		if (Static138.aFrame1 == local18) {
			@Pc(65) Insets local65 = Static138.aFrame1.getInsets();
			Static38.aCanvas4.setLocation(Static341.anInt6334 + local65.left, Static423.anInt7841 + local65.top);
		} else {
			Static38.aCanvas4.setLocation(Static341.anInt6334, Static423.anInt7841);
		}
		Static38.aCanvas4.addFocusListener(this);
		Static38.aCanvas4.requestFocus();
		Static301.aBoolean432 = true;
		Static510.aBoolean503 = true;
		Static475.aBoolean646 = true;
		Static416.aBoolean570 = false;
		Static107.aLong55 = Static174.method3502();
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method1432() {
		return null;
	}

	@OriginalMember(owner = "client!gu", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static301.aBoolean432 = false;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
	protected abstract void method1433();

	@OriginalMember(owner = "client!gu", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	protected abstract void method1434();

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)Z")
	public final boolean method1435() {
		return Static234.method4121("jaclib");
	}

	@OriginalMember(owner = "client!gu", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZZ)V")
	private void method1436(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static511.aBoolean681) {
				return;
			}
			Static511.aBoolean681 = true;
		}
		if (Static87.anApplet1 != null) {
			Static87.anApplet1.destroy();
		}
		try {
			this.method1430();
		} catch (@Pc(29) Exception local29) {
		}
		if (this.aBoolean167) {
			try {
				jagmisc.quit();
			} catch (@Pc(42) Throwable local42) {
			}
			this.aBoolean167 = false;
		}
		Static411.method6418();
		Static105.method2179();
		if (Static38.aCanvas4 != null) {
			try {
				Static38.aCanvas4.removeFocusListener(this);
				Static38.aCanvas4.getParent().remove(Static38.aCanvas4);
			} catch (@Pc(62) Exception local62) {
			}
		}
		if (Static414.aClass246_5 != null) {
			try {
				Static414.aClass246_5.method6146();
			} catch (@Pc(70) Exception local70) {
			}
		}
		this.method1433();
		if (Static138.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(80) Throwable local80) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1437(@OriginalArg(1) String arg0) {
		if (this.aBoolean166) {
			return;
		}
		this.aBoolean166 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static590.method5698("loggedout", Static87.anApplet1);
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!gu", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static3.anApplet_Sub1_2 == this && !Static511.aBoolean681) {
			Static6.aLong9 = Static174.method3502();
			Static566.method8004(5000L);
			Static240.aClass246_4 = null;
			this.method1436(false);
		}
	}

	@OriginalMember(owner = "client!gu", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!gu", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static138.aFrame1 == null) {
			return Static87.anApplet1 == null || Static87.anApplet1 == this ? super.getParameter(arg0) : Static87.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static138.aFrame1 == null) {
			return Static87.anApplet1 == null || Static87.anApplet1 == this ? super.getCodeBase() : Static87.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static138.aFrame1 == null) {
			return Static87.anApplet1 == null || Static87.anApplet1 == this ? super.getAppletContext() : Static87.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static138.aFrame1 == null) {
			return Static87.anApplet1 == null || Static87.anApplet1 == this ? super.getDocumentBase() : Static87.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIIILjava/lang/String;I)V")
	protected final void method1440(@OriginalArg(3) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static414.anApplet2 = null;
			Static3.anApplet_Sub1_2 = this;
			Static180.anInt4051 = 768;
			Static345.anInt6685 = 768;
			Static228.anInt4744 = 1024;
			Static171.anInt3912 = 1024;
			Static423.anInt7841 = 0;
			Static382.anInt7177 = 612;
			Static341.anInt6334 = 0;
			Static138.aFrame1 = new Frame();
			Static138.aFrame1.setTitle("Jagex");
			Static138.aFrame1.setResizable(true);
			Static138.aFrame1.addWindowListener(this);
			Static138.aFrame1.setVisible(true);
			Static138.aFrame1.toFront();
			@Pc(40) Insets local40 = Static138.aFrame1.getInsets();
			Static138.aFrame1.setSize(Static171.anInt3912 + local40.left + local40.right, local40.top + Static345.anInt6685 - -local40.bottom);
			Static240.aClass246_4 = Static414.aClass246_5 = new Class246(arg0, arg1, 34, true);
			@Pc(74) Class280 local74 = Static414.aClass246_5.method6134(this, 1);
			while (local74.anInt8467 == 0) {
				Static566.method8004(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static5.method211(local87, null);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	protected final void method1441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) String arg3) {
		try {
			if (Static3.anApplet_Sub1_2 == null) {
				Static180.anInt4051 = arg1;
				Static345.anInt6685 = arg1;
				Static414.anApplet2 = Static87.anApplet1;
				Static341.anInt6334 = 0;
				Static423.anInt7841 = 0;
				Static3.anApplet_Sub1_2 = this;
				Static228.anInt4744 = arg2;
				Static171.anInt3912 = arg2;
				Static382.anInt7177 = 612;
				Static240.aClass246_4 = Static414.aClass246_5 = new Class246(arg0, arg3, 34, Static87.anApplet1 != null);
				@Pc(64) Class280 local64 = Static414.aClass246_5.method6134(this, 1);
				while (local64.anInt8467 == 0) {
					Static566.method8004(10L);
				}
			} else {
				Static210.anInt4421++;
				if (Static210.anInt4421 >= 3) {
					this.method1437("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static5.method211(local80, null);
			this.method1437("crash");
		}
	}

	@OriginalMember(owner = "client!gu", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static301.aBoolean432 = true;
		Static475.aBoolean646 = true;
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
	private void method1442() {
		@Pc(6) long local6 = Static174.method3502();
		@Pc(10) long local10 = Static179.aLongArray4[Static415.anInt7775];
		Static179.aLongArray4[Static415.anInt7775] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static56.anInt9395 = ((local28 >> 1) + 32000) / local28;
		}
		Static415.anInt7775 = Static415.anInt7775 + 1 & 0x1F;
		if (Static449.anInt8728++ > 50) {
			Static449.anInt8728 -= 50;
			Static475.aBoolean646 = true;
			Static38.aCanvas4.setSize(Static228.anInt4744, Static180.anInt4051);
			Static38.aCanvas4.setVisible(true);
			if (Static138.aFrame1 != null && Static345.aFrame2 == null) {
				@Pc(72) Insets local72 = Static138.aFrame1.getInsets();
				Static38.aCanvas4.setLocation(local72.left + Static341.anInt6334, local72.top - -Static423.anInt7841);
			} else {
				Static38.aCanvas4.setLocation(Static341.anInt6334, Static423.anInt7841);
			}
		}
		this.method1446();
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(B)V")
	protected abstract void method1444();

	@OriginalMember(owner = "client!gu", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!gu", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static3.anApplet_Sub1_2 != this || Static511.aBoolean681) {
			return;
		}
		Static475.aBoolean646 = true;
		if (Static186.aBoolean328 && Static174.method3502() - Static107.aLong55 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static171.anInt3912 && local26.height >= Static345.anInt6685) {
				Static416.aBoolean570 = true;
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static389.aString92 != null) {
				@Pc(10) String local10 = Static389.aString92.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static389.aString91;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1437("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static389.aString91 == null || Static389.aString91.equals("1.4.2"))) {
					this.method1437("wrongjava");
					return;
				}
			}
			if (Static389.aString91 != null && Static389.aString91.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static389.aString91.length()) {
					@Pc(78) char local78 = Static389.aString91.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local72 = local72 * 10 + local78 - 48;
					local70++;
				}
				if (local72 >= 5) {
					Static186.aBoolean328 = true;
				}
			}
			@Pc(117) Applet local117 = Static3.anApplet_Sub1_2;
			if (Static87.anApplet1 != null) {
				local117 = Static87.anApplet1;
			}
			@Pc(123) Method local123 = Static389.aMethod1;
			if (local123 != null) {
				try {
					local123.invoke(local117, Boolean.TRUE);
				} catch (@Pc(137) Throwable local137) {
				}
			}
			Static7.method510();
			Static291.method4786();
			this.method1431();
			this.method1434();
			Static360.aClass78_1 = Static556.method7931();
			while (Static6.aLong9 == 0L || Static174.method3502() < Static6.aLong9) {
				Static194.anInt4228 = Static360.aClass78_1.method6571(Static394.aLong167);
				for (@Pc(160) int local160 = 0; local160 < Static194.anInt4228; local160++) {
					this.method1429();
				}
				this.method1442();
				Static441.method6734(Static38.aCanvas4, Static414.aClass246_5);
			}
		} catch (@Pc(197) ThreadDeath local197) {
			throw local197;
		} catch (@Pc(200) Throwable local200) {
			Static5.method211(local200, this.method1432());
			this.method1437("crash");
		} finally {
			@Pc(216) Object local216 = null;
			this.method1436(true);
		}
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(B)Z")
	protected final boolean method1445() {
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
				this.method1437("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
	protected abstract void method1446();

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)Z")
	public final boolean method1447() {
		return Static234.method4121("jagmisc");
	}

	@OriginalMember(owner = "client!gu", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
