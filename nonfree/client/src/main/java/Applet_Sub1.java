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

@OriginalClass("client!oaa")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!oaa", name = "v", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!oaa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static124.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIILjava/lang/String;ZI)V")
	protected final void method1489(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static261.anApplet2 = null;
			Static270.anInt4747 = 0;
			Static179.anInt3523 = 649;
			Static312.anInt5191 = 1024;
			Static512.anInt8242 = 1024;
			Static95.anApplet_Sub1_1 = this;
			Static222.anInt4196 = 768;
			Static203.anInt3986 = 768;
			Static282.anInt4895 = 0;
			Static380.aFrame2 = new Frame();
			Static380.aFrame2.setTitle("Jagex");
			Static380.aFrame2.setResizable(true);
			Static380.aFrame2.addWindowListener(this);
			Static380.aFrame2.setVisible(true);
			Static380.aFrame2.toFront();
			@Pc(40) Insets local40 = Static380.aFrame2.getInsets();
			Static380.aFrame2.setSize(local40.right + Static512.anInt8242 + local40.left, local40.bottom + local40.top + Static203.anInt3986);
			Static264.aClass291_3 = Static247.aClass291_1 = new Class291(arg0, arg1, 37, true);
			@Pc(75) Class81 local75 = Static247.aClass291_1.method7136(this, 1);
			while (local75.anInt2532 == 0) {
				Static373.method5403(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static503.method7153((String) null, local88);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static95.anApplet_Sub1_1 != this || Static442.aBoolean514) {
			return;
		}
		Static476.aBoolean599 = true;
		if (Static619.aBoolean813 && Static524.method7320() - Static385.aLong198 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static512.anInt8242 <= local24.width && local24.height >= Static203.anInt3986) {
				Static619.aBoolean814 = true;
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1490() {
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	protected abstract void method1491();

	@OriginalMember(owner = "client!oaa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static163.aBoolean250 = true;
		Static476.aBoolean599 = true;
	}

	@OriginalMember(owner = "client!oaa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static163.aBoolean250 = false;
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
	private void method1492() {
		@Pc(8) long local8 = Static524.method7320();
		@Pc(12) long local12 = Static320.aLongArray27[Static245.anInt4475];
		Static320.aLongArray27[Static245.anInt4475] = local8;
		Static245.anInt4475 = Static245.anInt4475 + 1 & 0x1F;
		if (local12 != 0L && local8 > local12) {
			@Pc(42) int local42 = (int) (local8 - local12);
			Static403.anInt6411 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static138.anInt2778++ > 50) {
			Static138.anInt2778 -= 50;
			Static476.aBoolean599 = true;
			Static126.aCanvas6.setSize(Static312.anInt5191, Static222.anInt4196);
			Static126.aCanvas6.setVisible(true);
			if (Static380.aFrame2 != null && Static442.aFrame3 == null) {
				@Pc(84) Insets local84 = Static380.aFrame2.getInsets();
				Static126.aCanvas6.setLocation(Static282.anInt4895 + local84.left, local84.top + Static270.anInt4747);
			} else {
				Static126.aCanvas6.setLocation(Static282.anInt4895, Static270.anInt4747);
			}
		}
		this.method1498();
	}

	@OriginalMember(owner = "client!oaa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static380.aFrame2 == null) {
			return Static124.anApplet1 == null || Static124.anApplet1 == this ? super.getCodeBase() : Static124.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)Z")
	public final boolean method1493() {
		return Static379.method5472("jagtheora");
	}

	@OriginalMember(owner = "client!oaa", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static95.anApplet_Sub1_1 == this && !Static442.aBoolean514) {
			Static104.aLong57 = Static524.method7320() + 4000L;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static380.aFrame2 == null) {
			return Static124.anApplet1 == null || Static124.anApplet1 == this ? super.getDocumentBase() : Static124.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)V")
	private void method1494() {
		@Pc(13) long local13 = Static524.method7320();
		@Pc(17) long local17 = Static137.aLongArray3[Static321.anInt5372];
		Static137.aLongArray3[Static321.anInt5372] = local13;
		@Pc(32) boolean local32;
		if (local17 == 0L || local17 >= local13) {
			local32 = false;
		} else {
			local32 = true;
		}
		Static321.anInt5372 = Static321.anInt5372 + 1 & 0x1F;
		synchronized (this) {
			Static633.aBoolean766 = Static163.aBoolean250;
		}
		this.method1496();
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V")
	protected abstract void method1496();

	@OriginalMember(owner = "client!oaa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static380.aFrame2 == null) {
			return Static124.anApplet1 == null || Static124.anApplet1 == this ? super.getAppletContext() : Static124.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
	protected final void method1497(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static95.anApplet_Sub1_1 == null) {
				Static312.anInt5191 = arg0;
				Static512.anInt8242 = arg0;
				Static179.anInt3523 = 649;
				Static95.anApplet_Sub1_1 = this;
				Static270.anInt4747 = 0;
				Static282.anInt4895 = 0;
				Static261.anApplet2 = Static124.anApplet1;
				Static222.anInt4196 = arg3;
				Static203.anInt3986 = arg3;
				Static264.aClass291_3 = Static247.aClass291_1 = new Class291(arg2, arg1, 37, Static124.anApplet1 != null);
				@Pc(70) Class81 local70 = Static247.aClass291_1.method7136(this, 1);
				while (local70.anInt2532 == 0) {
					Static373.method5403(10L);
				}
			} else {
				Static291.anInt4945++;
				if (Static291.anInt4945 >= 3) {
					this.method1508("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(87) Throwable local87) {
			Static503.method7153((String) null, local87);
			this.method1508("crash");
		}
	}

	@OriginalMember(owner = "client!oaa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)V")
	protected abstract void method1498();

	@OriginalMember(owner = "client!oaa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(B)V")
	public synchronized void method1499() {
		if (Static126.aCanvas6 != null) {
			Static126.aCanvas6.removeFocusListener(this);
			Static126.aCanvas6.getParent().setBackground(Color.black);
			Static126.aCanvas6.getParent().remove(Static126.aCanvas6);
		}
		@Pc(26) Container local26;
		if (Static442.aFrame3 != null) {
			local26 = Static442.aFrame3;
		} else if (Static380.aFrame2 != null) {
			local26 = Static380.aFrame2;
		} else if (Static124.anApplet1 == null) {
			local26 = Static95.anApplet_Sub1_1;
		} else {
			local26 = Static124.anApplet1;
		}
		local26.setLayout((LayoutManager) null);
		Static126.aCanvas6 = new Canvas_Sub1(this);
		local26.add(Static126.aCanvas6);
		Static126.aCanvas6.setSize(Static312.anInt5191, Static222.anInt4196);
		Static126.aCanvas6.setVisible(true);
		if (local26 == Static380.aFrame2) {
			@Pc(63) Insets local63 = Static380.aFrame2.getInsets();
			Static126.aCanvas6.setLocation(local63.left + Static282.anInt4895, local63.top - -Static270.anInt4747);
		} else {
			Static126.aCanvas6.setLocation(Static282.anInt4895, Static270.anInt4747);
		}
		Static126.aCanvas6.addFocusListener(this);
		Static126.aCanvas6.requestFocus();
		Static163.aBoolean250 = true;
		Static633.aBoolean766 = true;
		Static476.aBoolean599 = true;
		Static619.aBoolean814 = false;
		Static385.aLong198 = Static524.method7320();
	}

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)Z")
	public final boolean method1500() {
		return Static379.method5472("jagmisc");
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZI)V")
	private void method1501(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static442.aBoolean514) {
				return;
			}
			Static442.aBoolean514 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static124.anApplet1 != null) {
			Static124.anApplet1.destroy();
		}
		try {
			this.method1491();
		} catch (@Pc(41) Exception local41) {
		}
		if (this.aBoolean119) {
			try {
				jagmisc.quit();
			} catch (@Pc(47) Throwable local47) {
			}
			this.aBoolean119 = false;
		}
		Static612.method8676();
		Static653.method9046();
		if (Static126.aCanvas6 != null) {
			try {
				Static126.aCanvas6.removeFocusListener(this);
				Static126.aCanvas6.getParent().remove(Static126.aCanvas6);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (Static247.aClass291_1 != null) {
			try {
				Static247.aClass291_1.method7129();
			} catch (@Pc(75) Exception local75) {
			}
		}
		this.method1509();
		if (Static380.aFrame2 != null) {
			Static380.aFrame2.setVisible(false);
			Static380.aFrame2.dispose();
			Static380.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)Z")
	protected final boolean method1502() {
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
				this.method1508("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static95.anApplet_Sub1_1 == this && !Static442.aBoolean514) {
			Static104.aLong57 = 0L;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static497.aString96 != null) {
				@Pc(10) String local10 = Static497.aString96.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static497.aString93;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method1508("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static497.aString93 == null || Static497.aString93.equals("1.4.2"))) {
					this.method1508("wrongjava");
					return;
				}
			}
			if (Static497.aString93 != null && Static497.aString93.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (Static497.aString93.length() > local70) {
					@Pc(78) char local78 = Static497.aString93.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local78 + local72 * 10 - 48;
				}
				if (local72 >= 5) {
					Static619.aBoolean813 = true;
				}
			}
			@Pc(108) Applet local108 = Static95.anApplet_Sub1_1;
			if (Static124.anApplet1 != null) {
				local108 = Static124.anApplet1;
			}
			@Pc(114) Method local114 = Static497.aMethod1;
			if (local114 != null) {
				try {
					local114.invoke(local108, Boolean.TRUE);
				} catch (@Pc(128) Throwable local128) {
				}
			}
			Static587.method8280();
			Static460.method6708();
			this.method1499();
			this.method1504();
			Static210.aClass102_2 = Static58.method1276();
			while (Static104.aLong57 == 0L || Static524.method7320() < Static104.aLong57) {
				Static430.anInt6865 = Static210.aClass102_2.method8793(Static399.aLong204);
				for (@Pc(151) int local151 = 0; local151 < Static430.anInt6865; local151++) {
					this.method1494();
				}
				this.method1492();
				Static95.method1728(Static126.aCanvas6, Static247.aClass291_1);
			}
		} catch (@Pc(182) ThreadDeath local182) {
			throw local182;
		} catch (@Pc(185) Throwable local185) {
			Static503.method7153(this.method1490(), local185);
			this.method1508("crash");
		} finally {
			@Pc(201) Object local201 = null;
			this.method1501(true);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static95.anApplet_Sub1_1 == this && !Static442.aBoolean514) {
			Static104.aLong57 = Static524.method7320();
			Static373.method5403(5000L);
			Static264.aClass291_3 = null;
			this.method1501(false);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "(I)V")
	protected abstract void method1504();

	@OriginalMember(owner = "client!oaa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static380.aFrame2 == null) {
			return Static124.anApplet1 == null || Static124.anApplet1 == this ? super.getParameter(arg0) : Static124.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)Z")
	public final boolean method1506() {
		return Static379.method5472("jaclib");
	}

	@OriginalMember(owner = "client!oaa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!oaa", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1508(@OriginalArg(1) String arg0) {
		if (this.aBoolean120) {
			return;
		}
		this.aBoolean120 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static686.method8109(Static124.anApplet1, "loggedout");
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(B)V")
	protected abstract void method1509();
}
