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

@OriginalClass("client!efa")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!efa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static639.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Z")
	protected final boolean method1791() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.equals("stellardawn.com") || local13.endsWith(".stellardawn.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1796("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static556.anApplet_Sub1_1 == this && !Static164.aBoolean273) {
			Static271.aLong139 = Static547.method7619() + 4000L;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	protected final void method1792(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) String arg3) {
		try {
			if (Static556.anApplet_Sub1_1 == null) {
				Static79.anInt1140 = arg1;
				Static89.anInt2047 = arg1;
				Static556.anApplet_Sub1_1 = this;
				Static591.anInt9708 = 647;
				Static47.anInt693 = 0;
				Static32.anInt510 = arg0;
				Static255.anInt4665 = arg0;
				Static22.anApplet1 = Static639.anApplet2;
				Static67.anInt1003 = 0;
				Static53.aClass268_1 = Static570.aClass268_5 = new Class268(arg2, arg3, 37, Static639.anApplet2 != null);
				@Pc(72) Class331 local72 = Static570.aClass268_5.method6340(this, 1);
				while (local72.anInt9108 == 0) {
					Static579.method8004(10L);
				}
			} else {
				Static455.anInt7738++;
				if (Static455.anInt7738 >= 3) {
					this.method1796("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static234.method3615(local82, (String) null);
			this.method1796("crash");
		}
	}

	@OriginalMember(owner = "client!efa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)Z")
	public final boolean method1793() {
		return Static278.method4508("jagtheora");
	}

	@OriginalMember(owner = "client!efa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static147.aFrame1 == null) {
			return Static639.anApplet2 == null || Static639.anApplet2 == this ? super.getCodeBase() : Static639.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!efa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static147.aFrame1 == null) {
			return Static639.anApplet2 == null || Static639.anApplet2 == this ? super.getDocumentBase() : Static639.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1794() {
		return null;
	}

	@OriginalMember(owner = "client!efa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static147.aFrame1 == null) {
			return Static639.anApplet2 == null || Static639.anApplet2 == this ? super.getAppletContext() : Static639.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
	protected abstract void method1795();

	@OriginalMember(owner = "client!efa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!efa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static642.aBoolean889 = false;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1796(@OriginalArg(1) String arg0) {
		if (this.aBoolean182) {
			return;
		}
		this.aBoolean182 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static682.method3657("loggedout", Static639.anApplet2);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!efa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static147.aFrame1 == null) {
			return Static639.anApplet2 == null || Static639.anApplet2 == this ? super.getParameter(arg0) : Static639.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!efa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBIILjava/lang/String;IIZ)V")
	protected final void method1797(@OriginalArg(0) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static79.anInt1140 = 768;
			Static89.anInt2047 = 768;
			Static22.anApplet1 = null;
			Static591.anInt9708 = 647;
			Static556.anApplet_Sub1_1 = this;
			Static32.anInt510 = 1024;
			Static255.anInt4665 = 1024;
			Static47.anInt693 = 0;
			Static67.anInt1003 = 0;
			Static147.aFrame1 = new Frame();
			Static147.aFrame1.setTitle("Jagex");
			Static147.aFrame1.setResizable(true);
			Static147.aFrame1.addWindowListener(this);
			Static147.aFrame1.setVisible(true);
			Static147.aFrame1.toFront();
			@Pc(40) Insets local40 = Static147.aFrame1.getInsets();
			Static147.aFrame1.setSize(local40.left + Static255.anInt4665 + local40.right, local40.bottom + local40.top + Static89.anInt2047);
			Static53.aClass268_1 = Static570.aClass268_5 = new Class268(arg0, arg1, 37, true);
			@Pc(78) Class331 local78 = Static570.aClass268_5.method6340(this, 1);
			while (local78.anInt9108 == 0) {
				Static579.method8004(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static234.method3615(local88, (String) null);
		}
	}

	@OriginalMember(owner = "client!efa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)Z")
	public final boolean method1798() {
		return Static278.method4508("jaclib");
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V")
	protected abstract void method1799();

	@OriginalMember(owner = "client!efa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static429.aString71 != null) {
				@Pc(10) String local10 = Static429.aString71.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static429.aString66;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method1796("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static429.aString66 == null || Static429.aString66.equals("1.4.2"))) {
					this.method1796("wrongjava");
					return;
				}
			}
			if (Static429.aString66 != null && Static429.aString66.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static429.aString66.length()) {
					@Pc(78) char local78 = Static429.aString66.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local78 + local72 * 10 - 48;
				}
				if (local72 >= 5) {
					Static511.aBoolean730 = true;
				}
			}
			@Pc(109) Applet local109 = Static556.anApplet_Sub1_1;
			if (Static639.anApplet2 != null) {
				local109 = Static639.anApplet2;
			}
			@Pc(115) Method local115 = Static429.aMethod2;
			if (local115 != null) {
				try {
					local115.invoke(local109, Boolean.TRUE);
				} catch (@Pc(129) Throwable local129) {
				}
			}
			Static99.method1956();
			Static495.method7093();
			this.method1806();
			this.method1804();
			Static282.aClass23_1 = Static439.method6411();
			while (Static271.aLong139 == 0L || Static547.method7619() < Static271.aLong139) {
				Static385.anInt6876 = Static282.aClass23_1.method6164(Static660.aLong302);
				for (@Pc(152) int local152 = 0; local152 < Static385.anInt6876; local152++) {
					this.method1807();
				}
				this.method1805();
				Static673.method8995(Static141.aCanvas7, Static570.aClass268_5);
			}
		} catch (@Pc(183) ThreadDeath local183) {
			throw local183;
		} catch (@Pc(186) Throwable local186) {
			Static234.method3615(local186, this.method1794());
			this.method1796("crash");
		} finally {
			@Pc(202) Object local202 = null;
			this.method1801(true);
		}
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(B)Z")
	public final boolean method1800() {
		return Static278.method4508("jagmisc");
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IZ)V")
	private void method1801(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static164.aBoolean273) {
				return;
			}
			Static164.aBoolean273 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static639.anApplet2 != null) {
			Static639.anApplet2.destroy();
		}
		try {
			this.method1799();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean184) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean184 = false;
		}
		Static539.method7540();
		Static95.method5783();
		if (Static141.aCanvas7 != null) {
			try {
				Static141.aCanvas7.removeFocusListener(this);
				Static141.aCanvas7.getParent().remove(Static141.aCanvas7);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static570.aClass268_5 != null) {
			try {
				Static570.aClass268_5.method6339();
			} catch (@Pc(77) Exception local77) {
			}
		}
		this.method1809();
		if (Static147.aFrame1 != null) {
			Static147.aFrame1.setVisible(false);
			Static147.aFrame1.dispose();
			Static147.aFrame1 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!efa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static642.aBoolean889 = true;
		Static113.aBoolean216 = true;
	}

	@OriginalMember(owner = "client!efa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!efa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!efa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)V")
	protected abstract void method1802();

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "(B)V")
	protected abstract void method1804();

	@OriginalMember(owner = "client!efa", name = "e", descriptor = "(I)V")
	private void method1805() {
		@Pc(11) long local11 = Static547.method7619();
		@Pc(15) long local15 = Static118.aLongArray5[Static345.anInt6330];
		Static118.aLongArray5[Static345.anInt6330] = local11;
		if (local15 != 0L && local11 > local15) {
			@Pc(32) int local32 = (int) (local11 - local15);
			Static457.anInt7750 = ((local32 >> 1) + 32000) / local32;
		}
		Static345.anInt6330 = Static345.anInt6330 + 1 & 0x1F;
		if (Static374.anInt6728++ > 50) {
			Static113.aBoolean216 = true;
			Static374.anInt6728 -= 50;
			Static141.aCanvas7.setSize(Static32.anInt510, Static79.anInt1140);
			Static141.aCanvas7.setVisible(true);
			if (Static147.aFrame1 != null && Static625.aFrame3 == null) {
				@Pc(79) Insets local79 = Static147.aFrame1.getInsets();
				Static141.aCanvas7.setLocation(Static67.anInt1003 + local79.left, local79.top - -Static47.anInt693);
			} else {
				Static141.aCanvas7.setLocation(Static67.anInt1003, Static47.anInt693);
			}
		}
		this.method1802();
	}

	@OriginalMember(owner = "client!efa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static556.anApplet_Sub1_1 != this || Static164.aBoolean273) {
			return;
		}
		Static113.aBoolean216 = true;
		if (Static511.aBoolean730 && Static547.method7619() - Static481.aLong226 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static255.anInt4665 <= local24.width && local24.height >= Static89.anInt2047) {
				Static46.aBoolean50 = true;
			}
		}
	}

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "(I)V")
	public synchronized void method1806() {
		if (Static141.aCanvas7 != null) {
			Static141.aCanvas7.removeFocusListener(this);
			Static141.aCanvas7.getParent().setBackground(Color.black);
			Static141.aCanvas7.getParent().remove(Static141.aCanvas7);
		}
		@Pc(24) Container local24;
		if (Static625.aFrame3 != null) {
			local24 = Static625.aFrame3;
		} else if (Static147.aFrame1 != null) {
			local24 = Static147.aFrame1;
		} else if (Static639.anApplet2 == null) {
			local24 = Static556.anApplet_Sub1_1;
		} else {
			local24 = Static639.anApplet2;
		}
		local24.setLayout((LayoutManager) null);
		Static141.aCanvas7 = new Canvas_Sub1(this);
		local24.add(Static141.aCanvas7);
		Static141.aCanvas7.setSize(Static32.anInt510, Static79.anInt1140);
		Static141.aCanvas7.setVisible(true);
		if (Static147.aFrame1 == local24) {
			@Pc(58) Insets local58 = Static147.aFrame1.getInsets();
			Static141.aCanvas7.setLocation(local58.left + Static67.anInt1003, Static47.anInt693 + local58.top);
		} else {
			Static141.aCanvas7.setLocation(Static67.anInt1003, Static47.anInt693);
		}
		Static141.aCanvas7.addFocusListener(this);
		Static141.aCanvas7.requestFocus();
		Static391.aBoolean602 = true;
		Static642.aBoolean889 = true;
		Static113.aBoolean216 = true;
		Static46.aBoolean50 = false;
		Static481.aLong226 = Static547.method7619();
	}

	@OriginalMember(owner = "client!efa", name = "f", descriptor = "(B)V")
	private void method1807() {
		@Pc(8) long local8 = Static547.method7619();
		@Pc(12) long local12 = Static141.aLongArray6[Static277.anInt5375];
		Static141.aLongArray6[Static277.anInt5375] = local8;
		@Pc(35) boolean local35;
		if (local12 == 0L || local12 >= local8) {
			local35 = false;
		} else {
			local35 = true;
		}
		Static277.anInt5375 = Static277.anInt5375 + 1 & 0x1F;
		synchronized (this) {
			Static391.aBoolean602 = Static642.aBoolean889;
		}
		this.method1795();
	}

	@OriginalMember(owner = "client!efa", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static556.anApplet_Sub1_1 == this && !Static164.aBoolean273) {
			Static271.aLong139 = Static547.method7619();
			Static579.method8004(5000L);
			Static53.aClass268_1 = null;
			this.method1801(false);
		}
	}

	@OriginalMember(owner = "client!efa", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static556.anApplet_Sub1_1 == this && !Static164.aBoolean273) {
			Static271.aLong139 = 0L;
		}
	}

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "(I)V")
	protected abstract void method1809();
}
