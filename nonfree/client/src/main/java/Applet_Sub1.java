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

@OriginalClass("client!oga")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!oga", name = "z", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!oga", name = "J", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!oga", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static107.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
	private void method1702() {
		@Pc(6) long local6 = Static48.method1203();
		@Pc(10) long local10 = Static292.aLongArray9[Static73.anInt9420];
		Static292.aLongArray9[Static73.anInt9420] = local6;
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static73.anInt9420 = Static73.anInt9420 + 1 & 0x1F;
		synchronized (this) {
			Static453.aBoolean526 = Static385.aBoolean467;
		}
		this.method1707();
	}

	@OriginalMember(owner = "client!oga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BZ)V")
	private void method1703(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static407.aBoolean498) {
				return;
			}
			Static407.aBoolean498 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static107.anApplet1 != null) {
			Static107.anApplet1.destroy();
		}
		try {
			this.method1710();
		} catch (@Pc(46) Exception local46) {
		}
		if (this.aBoolean170) {
			try {
				jagmisc.quit();
			} catch (@Pc(52) Throwable local52) {
			}
			this.aBoolean170 = false;
		}
		Static8.method104();
		Static360.method5384();
		if (Static150.aCanvas4 != null) {
			try {
				Static150.aCanvas4.removeFocusListener(this);
				Static150.aCanvas4.getParent().remove(Static150.aCanvas4);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static265.aClass286_3 != null) {
			try {
				Static265.aClass286_3.method6580();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1709();
		if (Static80.aFrame2 != null) {
			Static80.aFrame2.setVisible(false);
			Static80.aFrame2.dispose();
			Static80.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!oga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static253.anApplet_Sub1_1 == this && !Static407.aBoolean498) {
			Static129.aLong72 = Static48.method1203() + 4000L;
		}
	}

	@OriginalMember(owner = "client!oga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static385.aBoolean467 = true;
		Static201.aBoolean297 = true;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	private void method1704() {
		@Pc(12) long local12 = Static48.method1203();
		@Pc(16) long local16 = Static18.aLongArray1[Static348.anInt6054];
		Static18.aLongArray1[Static348.anInt6054] = local12;
		if (local16 != 0L && local16 < local12) {
			@Pc(33) int local33 = (int) (local12 - local16);
			Static91.anInt2244 = ((local33 >> 1) + 32000) / local33;
		}
		Static348.anInt6054 = Static348.anInt6054 + 1 & 0x1F;
		if (Static48.anInt1285++ > 50) {
			Static48.anInt1285 -= 50;
			Static201.aBoolean297 = true;
			Static150.aCanvas4.setSize(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
			Static150.aCanvas4.setVisible(true);
			if (Static80.aFrame2 != null && Static18.aFrame1 == null) {
				@Pc(74) Insets local74 = Static80.aFrame2.getInsets();
				Static150.aCanvas4.setLocation(Static1.anInt8341 + local74.left, local74.top - -Static500.anInt8002);
			} else {
				Static150.aCanvas4.setLocation(Static1.anInt8341, Static500.anInt8002);
			}
		}
		this.method1719();
	}

	@OriginalMember(owner = "client!oga", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!oga", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static465.aString69 != null) {
				@Pc(10) String local10 = Static465.aString69.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static465.aString66;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method1712("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static465.aString66 == null || Static465.aString66.equals("1.4.2"))) {
					this.method1712("wrongjava");
					return;
				}
			}
			if (Static465.aString66 != null && Static465.aString66.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static465.aString66.length()) {
					@Pc(78) char local78 = Static465.aString66.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local72 * 10 + local78 - 48;
				}
				if (local72 >= 5) {
					Static621.aBoolean731 = true;
				}
			}
			@Pc(117) Applet local117 = Static253.anApplet_Sub1_1;
			if (Static107.anApplet1 != null) {
				local117 = Static107.anApplet1;
			}
			@Pc(123) Method local123 = Static465.aMethod2;
			if (local123 != null) {
				try {
					local123.invoke(local117, Boolean.TRUE);
				} catch (@Pc(137) Throwable local137) {
				}
			}
			Static200.method3445();
			Static448.method6404();
			this.method1718();
			this.method1715();
			Static340.aClass64_1 = Static93.method1898();
			while (Static129.aLong72 == 0L || Static129.aLong72 > Static48.method1203()) {
				Static202.anInt3992 = Static340.aClass64_1.method6917(Static629.aLong268);
				for (@Pc(160) int local160 = 0; local160 < Static202.anInt3992; local160++) {
					this.method1702();
				}
				this.method1704();
				Static117.method5171(Static150.aCanvas4, Static265.aClass286_3);
			}
		} catch (@Pc(191) ThreadDeath local191) {
			throw local191;
		} catch (@Pc(194) Throwable local194) {
			Static25.method7457(local194, this.method1714());
			this.method1712("crash");
		} finally {
			@Pc(210) Object local210 = null;
			this.method1703(true);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	protected final void method1705(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) String arg3) {
		try {
			if (Static253.anApplet_Sub1_1 == null) {
				Static231.anApplet2 = Static107.anApplet1;
				Class16_Sub1_Sub5_Sub1.lb = arg1;
				Static334.anInt5861 = arg1;
				Static71.anInt1925 = arg2;
				Static16.anInt323 = arg2;
				Static375.anInt6456 = 638;
				Static500.anInt8002 = 0;
				Static1.anInt8341 = 0;
				Static253.anApplet_Sub1_1 = this;
				Static575.aClass286_4 = Static265.aClass286_3 = new Class286(arg0, arg3, 37, Static107.anApplet1 != null);
				@Pc(70) Class319 local70 = Static265.aClass286_3.method6575(1, this);
				while (local70.anInt8562 == 0) {
					Static440.method6322(10L);
				}
			} else {
				Static334.anInt5850++;
				if (Static334.anInt5850 >= 3) {
					this.method1712("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static25.method7457(local80, (String) null);
			this.method1712("crash");
		}
	}

	@OriginalMember(owner = "client!oga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static80.aFrame2 == null) {
			return Static107.anApplet1 == null || Static107.anApplet1 == this ? super.getDocumentBase() : Static107.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Z")
	public final boolean method1706() {
		return Static354.method5314("jagmisc");
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
	protected abstract void method1707();

	@OriginalMember(owner = "client!oga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)V")
	protected abstract void method1709();

	@OriginalMember(owner = "client!oga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!oga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static80.aFrame2 == null) {
			return Static107.anApplet1 == null || Static107.anApplet1 == this ? super.getParameter(arg0) : Static107.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static253.anApplet_Sub1_1 == this && !Static407.aBoolean498) {
			Static129.aLong72 = 0L;
		}
	}

	@OriginalMember(owner = "client!oga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(I)V")
	protected abstract void method1710();

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)Z")
	protected final boolean method1711() {
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
			} else {
				this.method1712("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static80.aFrame2 == null) {
			return Static107.anApplet1 == null || Static107.anApplet1 == this ? super.getCodeBase() : Static107.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static80.aFrame2 == null) {
			return Static107.anApplet1 == null || Static107.anApplet1 == this ? super.getAppletContext() : Static107.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1712(@OriginalArg(0) String arg0) {
		if (this.aBoolean169) {
			return;
		}
		this.aBoolean169 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static655.method4698("loggedout", Static107.anApplet1);
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!oga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static253.anApplet_Sub1_1 != this || Static407.aBoolean498) {
			return;
		}
		Static201.aBoolean297 = true;
		if (Static621.aBoolean731 && Static48.method1203() - Static30.aLong15 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static334.anInt5861 <= local24.width && Static16.anInt323 <= local24.height) {
				Static528.aBoolean262 = true;
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "(I)Z")
	public final boolean method1713() {
		return Static354.method5314("jagtheora");
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)Ljava/lang/String;")
	public String method1714() {
		return null;
	}

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "(B)V")
	protected abstract void method1715();

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "(I)Z")
	public final boolean method1716() {
		return Static354.method5314("jaclib");
	}

	@OriginalMember(owner = "client!oga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IBILjava/lang/String;IIIZ)V")
	protected final void method1717(@OriginalArg(3) String arg0, @OriginalArg(5) int arg1) {
		try {
			Class16_Sub1_Sub5_Sub1.lb = 1024;
			Static334.anInt5861 = 1024;
			Static1.anInt8341 = 0;
			Static500.anInt8002 = 0;
			Static375.anInt6456 = 638;
			Static71.anInt1925 = 768;
			Static16.anInt323 = 768;
			Static253.anApplet_Sub1_1 = this;
			Static231.anApplet2 = null;
			Static80.aFrame2 = new Frame();
			Static80.aFrame2.setTitle("Jagex");
			Static80.aFrame2.setResizable(true);
			Static80.aFrame2.addWindowListener(this);
			Static80.aFrame2.setVisible(true);
			Static80.aFrame2.toFront();
			@Pc(40) Insets local40 = Static80.aFrame2.getInsets();
			Static80.aFrame2.setSize(Static334.anInt5861 + local40.left + local40.right, local40.top + Static16.anInt323 - -local40.bottom);
			Static575.aClass286_4 = Static265.aClass286_3 = new Class286(arg1, arg0, 37, true);
			@Pc(83) Class319 local83 = Static265.aClass286_3.method6575(1, this);
			while (local83.anInt8562 == 0) {
				Static440.method6322(10L);
			}
		} catch (@Pc(93) Exception local93) {
			Static25.method7457(local93, (String) null);
		}
	}

	@OriginalMember(owner = "client!oga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static385.aBoolean467 = false;
	}

	@OriginalMember(owner = "client!oga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "(I)V")
	public synchronized void method1718() {
		if (Static150.aCanvas4 != null) {
			Static150.aCanvas4.removeFocusListener(this);
			Static150.aCanvas4.getParent().setBackground(Color.black);
			Static150.aCanvas4.getParent().remove(Static150.aCanvas4);
		}
		@Pc(22) Container local22;
		if (Static18.aFrame1 != null) {
			local22 = Static18.aFrame1;
		} else if (Static80.aFrame2 != null) {
			local22 = Static80.aFrame2;
		} else if (Static107.anApplet1 == null) {
			local22 = Static253.anApplet_Sub1_1;
		} else {
			local22 = Static107.anApplet1;
		}
		local22.setLayout((LayoutManager) null);
		Static150.aCanvas4 = new Canvas_Sub1(this);
		local22.add(Static150.aCanvas4);
		Static150.aCanvas4.setSize(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
		Static150.aCanvas4.setVisible(true);
		if (Static80.aFrame2 == local22) {
			@Pc(63) Insets local63 = Static80.aFrame2.getInsets();
			Static150.aCanvas4.setLocation(local63.left + Static1.anInt8341, Static500.anInt8002 + local63.top);
		} else {
			Static150.aCanvas4.setLocation(Static1.anInt8341, Static500.anInt8002);
		}
		Static150.aCanvas4.addFocusListener(this);
		Static150.aCanvas4.requestFocus();
		Static453.aBoolean526 = true;
		Static385.aBoolean467 = true;
		Static201.aBoolean297 = true;
		Static528.aBoolean262 = false;
		Static30.aLong15 = Static48.method1203();
	}

	@OriginalMember(owner = "client!oga", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static253.anApplet_Sub1_1 == this && !Static407.aBoolean498) {
			Static129.aLong72 = Static48.method1203();
			Static440.method6322(5000L);
			Static575.aClass286_4 = null;
			this.method1703(false);
		}
	}

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "(B)V")
	protected abstract void method1719();
}
