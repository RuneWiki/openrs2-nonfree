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

@OriginalClass("client!au")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!au", name = "r", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!au", name = "H", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!au", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static339.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static353.anApplet_Sub1_1 == this && !Static404.aBoolean461) {
			Static466.aLong294 = Static15.method380();
			Static26.method592(5000L);
			Static114.aClass92_1 = null;
			this.method1353(false);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	protected abstract void method1346();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1347(@OriginalArg(0) String arg0) {
		if (this.aBoolean110) {
			return;
		}
		this.aBoolean110 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static680.method795(Static339.anApplet2, "loggedout");
		} catch (@Pc(26) Throwable local26) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(46) Exception local46) {
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Z")
	public final boolean method1348() {
		return Static634.method5642("jaclib");
	}

	@OriginalMember(owner = "client!au", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static641.aBoolean731 = false;
	}

	@OriginalMember(owner = "client!au", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!au", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static572.aFrame2 == null) {
			return Static339.anApplet2 == null || Static339.anApplet2 == this ? super.getAppletContext() : Static339.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z")
	protected final boolean method1351() {
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
				this.method1347("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static572.aFrame2 == null) {
			return Static339.anApplet2 == null || Static339.anApplet2 == this ? super.getDocumentBase() : Static339.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZILjava/lang/String;IIIII)V")
	protected final void method1352(@OriginalArg(2) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static640.anInt10686 = 0;
			Static525.anInt8304 = 645;
			Static531.anInt8327 = 1024;
			Static190.anInt3438 = 1024;
			Static60.anApplet1 = null;
			Static13.anInt306 = 768;
			Static674.anInt10898 = 768;
			Static462.anInt7379 = 0;
			Static353.anApplet_Sub1_1 = this;
			Static572.aFrame2 = new Frame();
			Static572.aFrame2.setTitle("Jagex");
			Static572.aFrame2.setResizable(true);
			Static572.aFrame2.addWindowListener(this);
			Static572.aFrame2.setVisible(true);
			Static572.aFrame2.toFront();
			@Pc(48) Insets local48 = Static572.aFrame2.getInsets();
			Static572.aFrame2.setSize(Static190.anInt3438 + local48.left + local48.right, local48.bottom + local48.top + Static674.anInt10898);
			Static114.aClass92_1 = Static566.aClass92_6 = new Class92(arg1, arg0, 37, true);
			@Pc(81) Class338 local81 = Static566.aClass92_6.method1871(this, 1);
			while (local81.anInt9321 == 0) {
				Static26.method592(10L);
			}
		} catch (@Pc(91) Exception local91) {
			Static456.method6140((String) null, local91);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BZ)V")
	private void method1353(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static404.aBoolean461) {
				return;
			}
			Static404.aBoolean461 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static339.anApplet2 != null) {
			Static339.anApplet2.destroy();
		}
		try {
			this.method1346();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean111) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean111 = false;
		}
		Static496.method6515();
		Static76.method1304();
		if (Static330.aCanvas5 != null) {
			try {
				Static330.aCanvas5.removeFocusListener(this);
				Static330.aCanvas5.getParent().remove(Static330.aCanvas5);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static566.aClass92_6 != null) {
			try {
				Static566.aClass92_6.method1882();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1354();
		if (Static572.aFrame2 != null) {
			Static572.aFrame2.setVisible(false);
			Static572.aFrame2.dispose();
			Static572.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!au", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static353.anApplet_Sub1_1 != this || Static404.aBoolean461) {
			return;
		}
		Static384.aBoolean449 = true;
		if (Static290.aBoolean324 && Static15.method380() - Static124.aLong63 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static190.anInt3438 <= local25.width && local25.height >= Static674.anInt10898) {
				Static65.aBoolean91 = true;
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!au", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!au", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static572.aFrame2 == null) {
			return Static339.anApplet2 == null || Static339.anApplet2 == this ? super.getParameter(arg0) : Static339.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	protected abstract void method1354();

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
	protected abstract void method1355();

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
	protected abstract void method1356();

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(I)Z")
	public final boolean method1357() {
		return Static634.method5642("jagmisc");
	}

	@OriginalMember(owner = "client!au", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!au", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static641.aBoolean731 = true;
		Static384.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIZILjava/lang/String;I)V")
	protected final void method1358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		try {
			if (Static353.anApplet_Sub1_1 == null) {
				Static640.anInt10686 = 0;
				Static462.anInt7379 = 0;
				Static525.anInt8304 = 645;
				Static13.anInt306 = arg2;
				Static674.anInt10898 = arg2;
				Static60.anApplet1 = Static339.anApplet2;
				Static353.anApplet_Sub1_1 = this;
				Static531.anInt8327 = arg0;
				Static190.anInt3438 = arg0;
				Static114.aClass92_1 = Static566.aClass92_6 = new Class92(arg1, arg3, 37, Static339.anApplet2 != null);
				@Pc(68) Class338 local68 = Static566.aClass92_6.method1871(this, 1);
				while (local68.anInt9321 == 0) {
					Static26.method592(10L);
				}
			} else {
				Static153.anInt2833++;
				if (Static153.anInt2833 >= 3) {
					this.method1347("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static456.method6140((String) null, local81);
			this.method1347("crash");
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V")
	protected abstract void method1359();

	@OriginalMember(owner = "client!au", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(B)Z")
	public final boolean method1360() {
		return Static634.method5642("jagtheora");
	}

	@OriginalMember(owner = "client!au", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static572.aFrame2 == null) {
			return Static339.anApplet2 == null || Static339.anApplet2 == this ? super.getCodeBase() : Static339.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!au", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!au", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static126.aString38 != null) {
				@Pc(10) String local10 = Static126.aString38.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static126.aString40;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1347("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static126.aString40 == null || Static126.aString40.equals("1.4.2"))) {
					this.method1347("wrongjava");
					return;
				}
			}
			if (Static126.aString40 != null && Static126.aString40.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static126.aString40.length()) {
					@Pc(79) char local79 = Static126.aString40.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local73 * 10 + local79 - 48;
				}
				if (local73 >= 5) {
					Static290.aBoolean324 = true;
				}
			}
			@Pc(111) Applet local111 = Static353.anApplet_Sub1_1;
			if (Static339.anApplet2 != null) {
				local111 = Static339.anApplet2;
			}
			@Pc(117) Method local117 = Static126.aMethod1;
			if (local117 != null) {
				try {
					local117.invoke(local111, Boolean.TRUE);
				} catch (@Pc(131) Throwable local131) {
				}
			}
			Static582.method7717();
			Static34.method718();
			this.method1364();
			this.method1356();
			Static152.aClass12_12 = Static310.method4467();
			while (Static466.aLong294 == 0L || Static15.method380() < Static466.aLong294) {
				Static435.anInt7103 = Static152.aClass12_12.method8269(Static53.aLong37);
				for (@Pc(154) int local154 = 0; local154 < Static435.anInt7103; local154++) {
					this.method1362();
				}
				this.method1363();
				Static8.method116(Static330.aCanvas5, Static566.aClass92_6);
			}
		} catch (@Pc(187) ThreadDeath local187) {
			throw local187;
		} catch (@Pc(190) Throwable local190) {
			Static456.method6140(this.method1361(), local190);
			this.method1347("crash");
		} finally {
			@Pc(206) Object local206 = null;
			this.method1353(true);
		}
	}

	@OriginalMember(owner = "client!au", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method1361() {
		return null;
	}

	@OriginalMember(owner = "client!au", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!au", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static353.anApplet_Sub1_1 == this && !Static404.aBoolean461) {
			Static466.aLong294 = 0L;
		}
	}

	@OriginalMember(owner = "client!au", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static353.anApplet_Sub1_1 == this && !Static404.aBoolean461) {
			Static466.aLong294 = Static15.method380() + 4000L;
		}
	}

	@OriginalMember(owner = "client!au", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(B)V")
	private void method1362() {
		@Pc(6) long local6 = Static15.method380();
		@Pc(10) long local10 = Static344.aLongArray12[Static9.anInt122];
		Static344.aLongArray12[Static9.anInt122] = local6;
		Static9.anInt122 = Static9.anInt122 + 1 & 0x1F;
		@Pc(34) boolean local34;
		if (local10 == 0L || local6 <= local10) {
			local34 = false;
		} else {
			local34 = true;
		}
		synchronized (this) {
			Static584.aBoolean658 = Static641.aBoolean731;
		}
		this.method1355();
	}

	@OriginalMember(owner = "client!au", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!au", name = "g", descriptor = "(I)V")
	private void method1363() {
		@Pc(6) long local6 = Static15.method380();
		@Pc(10) long local10 = Static32.aLongArray1[Static600.anInt9809];
		Static32.aLongArray1[Static600.anInt9809] = local6;
		Static600.anInt9809 = Static600.anInt9809 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static451.anInt7260 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static219.anInt3807++ > 50) {
			Static384.aBoolean449 = true;
			Static219.anInt3807 -= 50;
			Static330.aCanvas5.setSize(Static531.anInt8327, Static13.anInt306);
			Static330.aCanvas5.setVisible(true);
			if (Static572.aFrame2 != null && Static438.aFrame1 == null) {
				@Pc(75) Insets local75 = Static572.aFrame2.getInsets();
				Static330.aCanvas5.setLocation(local75.left + Static462.anInt7379, Static640.anInt10686 + local75.top);
			} else {
				Static330.aCanvas5.setLocation(Static462.anInt7379, Static640.anInt10686);
			}
		}
		this.method1359();
	}

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(B)V")
	public synchronized void method1364() {
		if (Static330.aCanvas5 != null) {
			Static330.aCanvas5.removeFocusListener(this);
			Static330.aCanvas5.getParent().setBackground(Color.black);
			Static330.aCanvas5.getParent().remove(Static330.aCanvas5);
		}
		@Pc(24) Container local24;
		if (Static438.aFrame1 != null) {
			local24 = Static438.aFrame1;
		} else if (Static572.aFrame2 != null) {
			local24 = Static572.aFrame2;
		} else if (Static339.anApplet2 == null) {
			local24 = Static353.anApplet_Sub1_1;
		} else {
			local24 = Static339.anApplet2;
		}
		local24.setLayout((LayoutManager) null);
		Static330.aCanvas5 = new Canvas_Sub1(this);
		local24.add(Static330.aCanvas5);
		Static330.aCanvas5.setSize(Static531.anInt8327, Static13.anInt306);
		Static330.aCanvas5.setVisible(true);
		if (local24 == Static572.aFrame2) {
			@Pc(69) Insets local69 = Static572.aFrame2.getInsets();
			Static330.aCanvas5.setLocation(Static462.anInt7379 + local69.left, local69.top + Static640.anInt10686);
		} else {
			Static330.aCanvas5.setLocation(Static462.anInt7379, Static640.anInt10686);
		}
		Static330.aCanvas5.addFocusListener(this);
		Static330.aCanvas5.requestFocus();
		Static584.aBoolean658 = true;
		Static641.aBoolean731 = true;
		Static384.aBoolean449 = true;
		Static65.aBoolean91 = false;
		Static124.aLong63 = Static15.method380();
	}
}
