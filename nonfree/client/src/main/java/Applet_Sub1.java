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

@OriginalClass("client!hp")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!hp", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static632.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)Z")
	public final boolean method1805() {
		return Static30.method575("jaclib");
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
	public final boolean method1806() {
		return Static30.method575("jagtheora");
	}

	@OriginalMember(owner = "client!hp", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hp", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	private void method1807() {
		@Pc(6) long local6 = Static444.method6719();
		@Pc(10) long local10 = Static229.aLongArray6[Static380.anInt7245];
		Static229.aLongArray6[Static380.anInt7245] = local6;
		Static380.anInt7245 = Static380.anInt7245 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local10 == 0L || local10 >= local6) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static386.aBoolean722 = Static144.aBoolean301;
		}
		this.method1819();
	}

	@OriginalMember(owner = "client!hp", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static36.anApplet_Sub1_1 == this && !Static325.aBoolean555) {
			Static523.aLong229 = Static444.method6719() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
	protected final void method1809(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static159.anInt3855 = 0;
			Static510.anInt8990 = 636;
			Static342.anInt6741 = 0;
			Static36.anApplet_Sub1_1 = this;
			Static114.anInt2970 = 1024;
			Static354.anInt6929 = 1024;
			Static228.anApplet1 = null;
			Static256.anInt5669 = 768;
			Static396.anInt7575 = 768;
			Static599.aFrame141 = new Frame();
			Static599.aFrame141.setTitle("Jagex");
			Static599.aFrame141.setResizable(true);
			Static599.aFrame141.addWindowListener(this);
			Static599.aFrame141.setVisible(true);
			Static599.aFrame141.toFront();
			@Pc(48) Insets local48 = Static599.aFrame141.getInsets();
			Static599.aFrame141.setSize(local48.left + Static354.anInt6929 + local48.right, local48.bottom + local48.top + Static396.anInt7575);
			Static49.aClass228_1 = Static379.aClass228_6 = new Class228(arg1, arg0, 37, true);
			@Pc(81) Class376 local81 = Static379.aClass228_6.method5938(1, this);
			while (local81.anInt10510 == 0) {
				Static500.method7308(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static544.method7724(null, local94);
		}
	}

	@OriginalMember(owner = "client!hp", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static372.aString76 != null) {
				@Pc(10) String local10 = Static372.aString76.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static372.aString83;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1823("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static372.aString83 == null || Static372.aString83.equals("1.4.2"))) {
					this.method1823("wrongjava");
					return;
				}
			}
			if (Static372.aString83 != null && Static372.aString83.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (Static372.aString83.length() > local71) {
					@Pc(79) char local79 = Static372.aString83.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local79 + local73 * 10 - 48;
				}
				if (local73 >= 5) {
					Static281.aBoolean534 = true;
				}
			}
			@Pc(115) Applet local115 = Static36.anApplet_Sub1_1;
			if (Static632.anApplet2 != null) {
				local115 = Static632.anApplet2;
			}
			@Pc(121) Method local121 = Static372.aMethod2;
			if (local121 != null) {
				try {
					local121.invoke(local115, Boolean.TRUE);
				} catch (@Pc(135) Throwable local135) {
				}
			}
			Static319.method5425();
			Static453.method6838();
			this.method1822();
			this.method1818();
			Static614.aClass116_1 = Static277.method4949();
			while (Static523.aLong229 == 0L || Static444.method6719() < Static523.aLong229) {
				Static145.anInt10356 = Static614.aClass116_1.method7961(Static258.aLong132);
				for (@Pc(158) int local158 = 0; local158 < Static145.anInt10356; local158++) {
					this.method1807();
				}
				this.method1817();
				Static231.method4411(Static379.aClass228_6, Static177.aCanvas10);
			}
		} catch (@Pc(191) ThreadDeath local191) {
			throw local191;
		} catch (@Pc(194) Throwable local194) {
			Static544.method7724(this.method1821(), local194);
			this.method1823("crash");
		} finally {
			@Pc(210) Object local210 = null;
			this.method1820(true);
		}
	}

	@OriginalMember(owner = "client!hp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	protected final void method1810(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static36.anApplet_Sub1_1 == null) {
				Static159.anInt3855 = 0;
				Static256.anInt5669 = arg3;
				Static396.anInt7575 = arg3;
				Static36.anApplet_Sub1_1 = this;
				Static510.anInt8990 = 636;
				Static114.anInt2970 = arg2;
				Static354.anInt6929 = arg2;
				Static228.anApplet1 = Static632.anApplet2;
				Static342.anInt6741 = 0;
				Static49.aClass228_1 = Static379.aClass228_6 = new Class228(arg0, arg1, 37, Static632.anApplet2 != null);
				@Pc(71) Class376 local71 = Static379.aClass228_6.method5938(1, this);
				while (local71.anInt10510 == 0) {
					Static500.method7308(10L);
				}
			} else {
				Static436.anInt6728++;
				if (Static436.anInt6728 >= 3) {
					this.method1823("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(86) Throwable local86) {
			Static544.method7724(null, local86);
			this.method1823("crash");
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)Z")
	public final boolean method1811() {
		return Static30.method575("jagmisc");
	}

	@OriginalMember(owner = "client!hp", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static599.aFrame141 == null) {
			return Static632.anApplet2 == null || Static632.anApplet2 == this ? super.getAppletContext() : Static632.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)Z")
	protected final boolean method1812() {
		@Pc(14) String local14 = this.getDocumentBase().getHost().toLowerCase();
		if (local14.equals("jagex.com") || local14.endsWith(".jagex.com")) {
			return true;
		} else if (local14.equals("runescape.com") || local14.endsWith(".runescape.com")) {
			return true;
		} else if (local14.equals("stellardawn.com") || local14.endsWith(".stellardawn.com")) {
			return true;
		} else if (local14.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local14.length() > 0 && local14.charAt(local14.length() - 1) >= '0' && local14.charAt(local14.length() - 1) <= '9') {
				local14 = local14.substring(0, local14.length() - 1);
			}
			if (local14.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1823("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
	protected abstract void method1813();

	@OriginalMember(owner = "client!hp", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static599.aFrame141 == null) {
			return Static632.anApplet2 == null || Static632.anApplet2 == this ? super.getDocumentBase() : Static632.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hp", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(Z)V")
	protected abstract void method1815();

	@OriginalMember(owner = "client!hp", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static144.aBoolean301 = true;
		Static70.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(Z)V")
	protected abstract void method1816();

	@OriginalMember(owner = "client!hp", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static599.aFrame141 == null) {
			return Static632.anApplet2 == null || Static632.anApplet2 == this ? super.getParameter(arg0) : Static632.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static36.anApplet_Sub1_1 == this && !Static325.aBoolean555) {
			Static523.aLong229 = Static444.method6719();
			Static500.method7308(5000L);
			Static49.aClass228_1 = null;
			this.method1820(false);
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
	private void method1817() {
		@Pc(10) long local10 = Static444.method6719();
		@Pc(14) long local14 = Static148.aLongArray3[Static344.anInt6768];
		Static148.aLongArray3[Static344.anInt6768] = local10;
		if (local14 != 0L && local14 < local10) {
			@Pc(34) int local34 = (int) (local10 - local14);
			Static83.anInt6968 = ((local34 >> 1) + 32000) / local34;
		}
		Static344.anInt6768 = Static344.anInt6768 + 1 & 0x1F;
		if (Static268.anInt5784++ > 50) {
			Static268.anInt5784 -= 50;
			Static70.aBoolean147 = true;
			Static177.aCanvas10.setSize(Static114.anInt2970, Static256.anInt5669);
			Static177.aCanvas10.setVisible(true);
			if (Static599.aFrame141 != null && Static385.aFrame149 == null) {
				@Pc(75) Insets local75 = Static599.aFrame141.getInsets();
				Static177.aCanvas10.setLocation(local75.left + Static342.anInt6741, local75.top + Static159.anInt3855);
			} else {
				Static177.aCanvas10.setLocation(Static342.anInt6741, Static159.anInt3855);
			}
		}
		this.method1816();
	}

	@OriginalMember(owner = "client!hp", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static599.aFrame141 == null) {
			return Static632.anApplet2 == null || Static632.anApplet2 == this ? super.getCodeBase() : Static632.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static36.anApplet_Sub1_1 == this && !Static325.aBoolean555) {
			Static523.aLong229 = 0L;
		}
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
	protected abstract void method1818();

	@OriginalMember(owner = "client!hp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static36.anApplet_Sub1_1 != this || Static325.aBoolean555) {
			return;
		}
		Static70.aBoolean147 = true;
		if (Static281.aBoolean534 && Static444.method6719() - Static557.aLong245 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static354.anInt6929 && local24.height >= Static396.anInt7575) {
				Static360.aBoolean606 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static144.aBoolean301 = false;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(B)V")
	protected abstract void method1819();

	@OriginalMember(owner = "client!hp", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	private void method1820(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static325.aBoolean555) {
				return;
			}
			Static325.aBoolean555 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static632.anApplet2 != null) {
			Static632.anApplet2.destroy();
		}
		try {
			this.method1815();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean156) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean156 = false;
		}
		Static549.method7732();
		Static94.method2466();
		if (Static177.aCanvas10 != null) {
			try {
				Static177.aCanvas10.removeFocusListener(this);
				Static177.aCanvas10.getParent().remove(Static177.aCanvas10);
			} catch (@Pc(68) Exception local68) {
			}
		}
		if (Static379.aClass228_6 != null) {
			try {
				Static379.aClass228_6.method5929();
			} catch (@Pc(76) Exception local76) {
			}
		}
		this.method1813();
		if (Static599.aFrame141 != null) {
			Static599.aFrame141.setVisible(false);
			Static599.aFrame141.dispose();
			Static599.aFrame141 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method1821() {
		return null;
	}

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(Z)V")
	public synchronized void method1822() {
		if (Static177.aCanvas10 != null) {
			Static177.aCanvas10.removeFocusListener(this);
			Static177.aCanvas10.getParent().setBackground(Color.black);
			Static177.aCanvas10.getParent().remove(Static177.aCanvas10);
		}
		@Pc(26) Container local26;
		if (Static385.aFrame149 != null) {
			local26 = Static385.aFrame149;
		} else if (Static599.aFrame141 != null) {
			local26 = Static599.aFrame141;
		} else if (Static632.anApplet2 == null) {
			local26 = Static36.anApplet_Sub1_1;
		} else {
			local26 = Static632.anApplet2;
		}
		local26.setLayout(null);
		Static177.aCanvas10 = new Canvas_Sub1(this);
		local26.add(Static177.aCanvas10);
		Static177.aCanvas10.setSize(Static114.anInt2970, Static256.anInt5669);
		Static177.aCanvas10.setVisible(true);
		if (Static599.aFrame141 == local26) {
			@Pc(63) Insets local63 = Static599.aFrame141.getInsets();
			Static177.aCanvas10.setLocation(local63.left + Static342.anInt6741, Static159.anInt3855 + local63.top);
		} else {
			Static177.aCanvas10.setLocation(Static342.anInt6741, Static159.anInt3855);
		}
		Static177.aCanvas10.addFocusListener(this);
		Static177.aCanvas10.requestFocus();
		Static386.aBoolean722 = true;
		Static144.aBoolean301 = true;
		Static70.aBoolean147 = true;
		Static360.aBoolean606 = false;
		Static557.aLong245 = Static444.method6719();
	}

	@OriginalMember(owner = "client!hp", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1823(@OriginalArg(1) String arg0) {
		if (this.aBoolean157) {
			return;
		}
		this.aBoolean157 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static653.method5390("loggedout", Static632.anApplet2);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}
}
