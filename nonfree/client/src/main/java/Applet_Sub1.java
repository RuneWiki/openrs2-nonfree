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

@OriginalClass("client!nv")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!nv", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static253.anApplet3 = arg0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1673(@OriginalArg(1) String arg0) {
		if (this.aBoolean134) {
			return;
		}
		this.aBoolean134 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static603.method4977("loggedout", Static253.anApplet3);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
	protected final void method1674(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static582.anInt10234 = 1024;
			Static3.anInt172 = 1024;
			Static329.anApplet_Sub1_1 = this;
			Static426.anInt8255 = 0;
			Static142.anInt3266 = 615;
			Static294.anInt10217 = 768;
			Static232.anInt4725 = 768;
			Static524.anInt9579 = 0;
			Static586.anApplet4 = null;
			Static531.aFrame1 = new Frame();
			Static531.aFrame1.setTitle("Jagex");
			Static531.aFrame1.setResizable(true);
			Static531.aFrame1.addWindowListener(this);
			Static531.aFrame1.setVisible(true);
			Static531.aFrame1.toFront();
			@Pc(48) Insets local48 = Static531.aFrame1.getInsets();
			Static531.aFrame1.setSize(local48.right + local48.left + Static3.anInt172, local48.bottom + Static232.anInt4725 + local48.top);
			Static594.aClass326_6 = Static480.aClass326_3 = new Class326(arg1, arg0, 35, true);
			@Pc(80) Class66 local80 = Static480.aClass326_3.method7795(this, 1);
			while (local80.anInt2308 == 0) {
				Static1.method125(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static468.method7192(null, local92);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	protected abstract void method1675();

	@OriginalMember(owner = "client!nv", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static329.anApplet_Sub1_1 == this && !Static494.aBoolean704) {
			Static373.aLong187 = Static376.method6088();
			Static1.method125(5000L);
			Static594.aClass326_6 = null;
			this.method1678(false);
		}
	}

	@OriginalMember(owner = "client!nv", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
	public final boolean method1677() {
		return Static68.method1703("jagmisc");
	}

	@OriginalMember(owner = "client!nv", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static530.aString121 != null) {
				@Pc(10) String local10 = Static530.aString121.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static530.aString123;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1673("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static530.aString123 == null || Static530.aString123.equals("1.4.2"))) {
					this.method1673("wrongjava");
					return;
				}
			}
			if (Static530.aString123 != null && Static530.aString123.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static530.aString123.length()) {
					@Pc(79) char local79 = Static530.aString123.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local79 + local73 * 10 - '0';
					local71++;
				}
				if (local73 >= 5) {
					Static417.aBoolean670 = true;
				}
			}
			@Pc(110) Applet local110 = Static329.anApplet_Sub1_1;
			if (Static253.anApplet3 != null) {
				local110 = Static253.anApplet3;
			}
			@Pc(116) Method local116 = Static530.aMethod1;
			if (local116 != null) {
				try {
					local116.invoke(local110, Boolean.TRUE);
				} catch (@Pc(130) Throwable local130) {
				}
			}
			Static397.method6331();
			Static157.method3008();
			this.method1679();
			this.method1681();
			Static592.aClass12_1 = Static77.method1777();
			while (Static373.aLong187 == 0L || Static376.method6088() < Static373.aLong187) {
				Static479.anInt8967 = Static592.aClass12_1.method2857(Static205.aLong118);
				for (@Pc(153) int local153 = 0; local153 < Static479.anInt8967; local153++) {
					this.method1684();
				}
				this.method1689();
				Static462.method7090(Static480.aClass326_3, Static545.aCanvas14);
			}
		} catch (@Pc(186) ThreadDeath local186) {
			throw local186;
		} catch (@Pc(189) Throwable local189) {
			Static468.method7192(this.method1687(), local189);
			this.method1673("crash");
		} finally {
			@Pc(205) Object local205 = null;
			this.method1678(true);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BZ)V")
	private void method1678(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static494.aBoolean704) {
				return;
			}
			Static494.aBoolean704 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static253.anApplet3 != null) {
			Static253.anApplet3.destroy();
		}
		try {
			this.method1688();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean135) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean135 = false;
		}
		Static328.method5680();
		Static327.method5677();
		if (Static545.aCanvas14 != null) {
			try {
				Static545.aCanvas14.removeFocusListener(this);
				Static545.aCanvas14.getParent().remove(Static545.aCanvas14);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static480.aClass326_3 != null) {
			try {
				Static480.aClass326_3.method7784();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1690();
		if (Static531.aFrame1 != null) {
			Static531.aFrame1.setVisible(false);
			Static531.aFrame1.dispose();
			Static531.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public synchronized void method1679() {
		if (Static545.aCanvas14 != null) {
			Static545.aCanvas14.removeFocusListener(this);
			Static545.aCanvas14.getParent().setBackground(Color.black);
			Static545.aCanvas14.getParent().remove(Static545.aCanvas14);
		}
		@Pc(20) Container local20;
		if (Static578.aFrame2 != null) {
			local20 = Static578.aFrame2;
		} else if (Static531.aFrame1 != null) {
			local20 = Static531.aFrame1;
		} else if (Static253.anApplet3 == null) {
			local20 = Static329.anApplet_Sub1_1;
		} else {
			local20 = Static253.anApplet3;
		}
		local20.setLayout(null);
		Static545.aCanvas14 = new Canvas_Sub1(this);
		local20.add(Static545.aCanvas14);
		Static545.aCanvas14.setSize(Static582.anInt10234, Static294.anInt10217);
		Static545.aCanvas14.setVisible(true);
		if (local20 == Static531.aFrame1) {
			@Pc(58) Insets local58 = Static531.aFrame1.getInsets();
			Static545.aCanvas14.setLocation(Static524.anInt9579 + local58.left, local58.top - -Static426.anInt8255);
		} else {
			Static545.aCanvas14.setLocation(Static524.anInt9579, Static426.anInt8255);
		}
		Static545.aCanvas14.addFocusListener(this);
		Static545.aCanvas14.requestFocus();
		Static14.aBoolean36 = true;
		Static62.aBoolean115 = true;
		Static344.aBoolean590 = true;
		Static346.aBoolean595 = false;
		Static518.aLong235 = Static376.method6088();
	}

	@OriginalMember(owner = "client!nv", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
	public final boolean method1680() {
		return Static68.method1703("jaclib");
	}

	@OriginalMember(owner = "client!nv", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
	protected abstract void method1681();

	@OriginalMember(owner = "client!nv", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
	protected final boolean method1682() {
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
				this.method1673("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static329.anApplet_Sub1_1 == this && !Static494.aBoolean704) {
			Static373.aLong187 = 0L;
		}
	}

	@OriginalMember(owner = "client!nv", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
	protected abstract void method1683();

	@OriginalMember(owner = "client!nv", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(Z)V")
	private void method1684() {
		@Pc(6) long local6 = Static376.method6088();
		@Pc(10) long local10 = Static118.aLongArray17[Static461.anInt8650];
		Static118.aLongArray17[Static461.anInt8650] = local6;
		Static461.anInt8650 = Static461.anInt8650 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local10 == 0L || local6 <= local10) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static62.aBoolean115 = Static14.aBoolean36;
		}
		this.method1675();
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBILjava/lang/String;III)V")
	protected final void method1685(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static329.anApplet_Sub1_1 == null) {
				Static582.anInt10234 = arg3;
				Static3.anInt172 = arg3;
				Static142.anInt3266 = 615;
				Static586.anApplet4 = Static253.anApplet3;
				Static524.anInt9579 = 0;
				Static294.anInt10217 = arg0;
				Static232.anInt4725 = arg0;
				Static329.anApplet_Sub1_1 = this;
				Static426.anInt8255 = 0;
				Static594.aClass326_6 = Static480.aClass326_3 = new Class326(arg2, arg1, 35, Static253.anApplet3 != null);
				@Pc(74) Class66 local74 = Static480.aClass326_3.method7795(this, 1);
				while (local74.anInt2308 == 0) {
					Static1.method125(10L);
				}
			} else {
				Static295.anInt6020++;
				if (Static295.anInt6020 >= 3) {
					this.method1673("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(84) Throwable local84) {
			Static468.method7192(null, local84);
			this.method1673("crash");
		}
	}

	@OriginalMember(owner = "client!nv", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static531.aFrame1 == null) {
			return Static253.anApplet3 == null || Static253.anApplet3 == this ? super.getParameter(arg0) : Static253.anApplet3.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!nv", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static531.aFrame1 == null) {
			return Static253.anApplet3 == null || Static253.anApplet3 == this ? super.getCodeBase() : Static253.anApplet3.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static531.aFrame1 == null) {
			return Static253.anApplet3 == null || Static253.anApplet3 == this ? super.getDocumentBase() : Static253.anApplet3.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1687() {
		return null;
	}

	@OriginalMember(owner = "client!nv", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static329.anApplet_Sub1_1 != this || Static494.aBoolean704) {
			return;
		}
		Static344.aBoolean590 = true;
		if (Static417.aBoolean670 && Static376.method6088() - Static518.aLong235 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static3.anInt172 <= local26.width && Static232.anInt4725 <= local26.height) {
				Static346.aBoolean595 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static531.aFrame1 == null) {
			return Static253.anApplet3 == null || Static253.anApplet3 == this ? super.getAppletContext() : Static253.anApplet3.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nv", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!nv", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static329.anApplet_Sub1_1 == this && !Static494.aBoolean704) {
			Static373.aLong187 = Static376.method6088() + 4000L;
		}
	}

	@OriginalMember(owner = "client!nv", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean36 = true;
		Static344.aBoolean590 = true;
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
	protected abstract void method1688();

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
	private void method1689() {
		@Pc(6) long local6 = Static376.method6088();
		@Pc(10) long local10 = Static142.aLongArray8[Static150.anInt3342];
		Static142.aLongArray8[Static150.anInt3342] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(30) int local30 = (int) (local6 - local10);
			Static156.anInt10168 = ((local30 >> 1) + 32000) / local30;
		}
		Static150.anInt3342 = Static150.anInt3342 + 1 & 0x1F;
		if (Static581.anInt10230++ > 50) {
			Static344.aBoolean590 = true;
			Static581.anInt10230 -= 50;
			Static545.aCanvas14.setSize(Static582.anInt10234, Static294.anInt10217);
			Static545.aCanvas14.setVisible(true);
			if (Static531.aFrame1 != null && Static578.aFrame2 == null) {
				@Pc(79) Insets local79 = Static531.aFrame1.getInsets();
				Static545.aCanvas14.setLocation(local79.left + Static524.anInt9579, local79.top + Static426.anInt8255);
			} else {
				Static545.aCanvas14.setLocation(Static524.anInt9579, Static426.anInt8255);
			}
		}
		this.method1683();
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
	protected abstract void method1690();

	@OriginalMember(owner = "client!nv", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}
}
