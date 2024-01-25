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

@OriginalClass("client!pj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!pj", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static180.anApplet6 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILjava/lang/String;ZBIII)V")
	protected final void method1427(@OriginalArg(2) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static165.anInt2773 = 646;
			Static538.anApplet3 = null;
			Static114.anInt2051 = 0;
			Static131.anApplet_Sub1_1 = this;
			Static348.anInt5935 = 768;
			Static13.anInt10825 = 768;
			Static314.anInt5339 = 0;
			Static449.anInt7506 = 1024;
			Static338.anInt5825 = 1024;
			Static293.aFrame3 = new Frame();
			Static293.aFrame3.setTitle("Jagex");
			Static293.aFrame3.setResizable(true);
			Static293.aFrame3.addWindowListener(this);
			Static293.aFrame3.setVisible(true);
			Static293.aFrame3.toFront();
			@Pc(40) Insets local40 = Static293.aFrame3.getInsets();
			Static293.aFrame3.setSize(local40.right + local40.left + Static338.anInt5825, Static13.anInt10825 - (-local40.top - local40.bottom));
			Static49.aClass380_1 = Static569.aClass380_6 = new Class380(arg1, arg0, 37, true);
			@Pc(78) Class103 local78 = Static569.aClass380_6.method8815(this, 1);
			while (local78.anInt2541 == 0) {
				Static520.method7923(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static664.method9007(local88, (String) null);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	private void method1428() {
		@Pc(6) long local6 = Static566.method7936();
		@Pc(10) long local10 = Static106.aLongArray6[Static135.anInt2372];
		Static106.aLongArray6[Static135.anInt2372] = local6;
		Static135.anInt2372 = Static135.anInt2372 + 1 & 0x1F;
		@Pc(29) boolean local29;
		if (local10 == 0L || local6 <= local10) {
			local29 = false;
		} else {
			local29 = true;
		}
		synchronized (this) {
			Static247.aBoolean271 = Static222.aBoolean224;
		}
		this.method1431();
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	protected abstract void method1430();

	@OriginalMember(owner = "client!pj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static131.anApplet_Sub1_1 == this && !Static125.aBoolean135) {
			Static416.aLong209 = Static566.method7936();
			Static520.method7923(5000L);
			Static49.aClass380_1 = null;
			this.method1440(false);
		}
	}

	@OriginalMember(owner = "client!pj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	protected abstract void method1431();

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
	protected abstract void method1432();

	@OriginalMember(owner = "client!pj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static293.aFrame3 == null) {
			return Static180.anApplet6 == null || Static180.anApplet6 == this ? super.getCodeBase() : Static180.anApplet6.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static222.aBoolean224 = false;
	}

	@OriginalMember(owner = "client!pj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1433(@OriginalArg(1) String arg0) {
		if (this.aBoolean95) {
			return;
		}
		this.aBoolean95 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static683.method5174(Static180.anApplet6, "loggedout");
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)Ljava/lang/String;")
	public String method1434() {
		return null;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	protected final void method1435(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static131.anApplet_Sub1_1 == null) {
				Static131.anApplet_Sub1_1 = this;
				Static538.anApplet3 = Static180.anApplet6;
				Static165.anInt2773 = 646;
				Static348.anInt5935 = arg1;
				Static13.anInt10825 = arg1;
				Static449.anInt7506 = arg2;
				Static338.anInt5825 = arg2;
				Static314.anInt5339 = 0;
				Static114.anInt2051 = 0;
				Static49.aClass380_1 = Static569.aClass380_6 = new Class380(arg3, arg0, 37, Static180.anApplet6 != null);
				@Pc(64) Class103 local64 = Static569.aClass380_6.method8815(this, 1);
				while (local64.anInt2541 == 0) {
					Static520.method7923(10L);
				}
			} else {
				Static665.anInt10633++;
				if (Static665.anInt10633 >= 3) {
					this.method1433("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(77) Throwable local77) {
			Static664.method9007(local77, (String) null);
			this.method1433("crash");
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)Z")
	public final boolean method1436() {
		return Static272.method4009("jagtheora");
	}

	@OriginalMember(owner = "client!pj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
	private void method1437() {
		@Pc(6) long local6 = Static566.method7936();
		@Pc(10) long local10 = Static512.aLongArray21[Static553.anInt9286];
		Static512.aLongArray21[Static553.anInt9286] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static490.anInt8338 = ((local34 >> 1) + 32000) / local34;
		}
		Static553.anInt9286 = Static553.anInt9286 + 1 & 0x1F;
		if (Static50.anInt1040++ > 50) {
			Static312.aBoolean579 = true;
			Static50.anInt1040 -= 50;
			Static140.aCanvas1.setSize(Static449.anInt7506, Static348.anInt5935);
			Static140.aCanvas1.setVisible(true);
			if (Static293.aFrame3 != null && Static289.aFrame1 == null) {
				@Pc(75) Insets local75 = Static293.aFrame3.getInsets();
				Static140.aCanvas1.setLocation(local75.left + Static314.anInt5339, local75.top + Static114.anInt2051);
			} else {
				Static140.aCanvas1.setLocation(Static314.anInt5339, Static114.anInt2051);
			}
		}
		this.method1432();
	}

	@OriginalMember(owner = "client!pj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static647.aString145 != null) {
				@Pc(10) String local10 = Static647.aString145.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static647.aString148;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method1433("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static647.aString148 == null || Static647.aString148.equals("1.4.2"))) {
					this.method1433("wrongjava");
					return;
				}
			}
			if (Static647.aString148 != null && Static647.aString148.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (local70 < Static647.aString148.length()) {
					@Pc(78) char local78 = Static647.aString148.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local72 = local78 + local72 * 10 - 48;
					local70++;
				}
				if (local72 >= 5) {
					Static574.aBoolean683 = true;
				}
			}
			@Pc(112) Applet local112 = Static131.anApplet_Sub1_1;
			if (Static180.anApplet6 != null) {
				local112 = Static180.anApplet6;
			}
			@Pc(118) Method local118 = Static647.aMethod2;
			if (local118 != null) {
				try {
					local118.invoke(local112, Boolean.TRUE);
				} catch (@Pc(132) Throwable local132) {
				}
			}
			Static349.method5051();
			Static44.method933();
			this.method1438();
			this.method1430();
			Static678.aClass3_4 = Static26.method608();
			while (Static416.aLong209 == 0L || Static416.aLong209 > Static566.method7936()) {
				Static410.anInt7178 = Static678.aClass3_4.method6624(Static560.aLong44);
				for (@Pc(155) int local155 = 0; local155 < Static410.anInt7178; local155++) {
					this.method1428();
				}
				this.method1437();
				Static201.method7514(Static140.aCanvas1, Static569.aClass380_6);
			}
		} catch (@Pc(192) ThreadDeath local192) {
			throw local192;
		} catch (@Pc(195) Throwable local195) {
			Static664.method9007(local195, this.method1434());
			this.method1433("crash");
		} finally {
			@Pc(211) Object local211 = null;
			this.method1440(true);
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
	public synchronized void method1438() {
		if (Static140.aCanvas1 != null) {
			Static140.aCanvas1.removeFocusListener(this);
			Static140.aCanvas1.getParent().setBackground(Color.black);
			Static140.aCanvas1.getParent().remove(Static140.aCanvas1);
		}
		@Pc(31) Container local31;
		if (Static289.aFrame1 != null) {
			local31 = Static289.aFrame1;
		} else if (Static293.aFrame3 != null) {
			local31 = Static293.aFrame3;
		} else if (Static180.anApplet6 == null) {
			local31 = Static131.anApplet_Sub1_1;
		} else {
			local31 = Static180.anApplet6;
		}
		local31.setLayout((LayoutManager) null);
		Static140.aCanvas1 = new Canvas_Sub1(this);
		local31.add(Static140.aCanvas1);
		Static140.aCanvas1.setSize(Static449.anInt7506, Static348.anInt5935);
		Static140.aCanvas1.setVisible(true);
		if (Static293.aFrame3 == local31) {
			@Pc(68) Insets local68 = Static293.aFrame3.getInsets();
			Static140.aCanvas1.setLocation(Static314.anInt5339 + local68.left, Static114.anInt2051 + local68.top);
		} else {
			Static140.aCanvas1.setLocation(Static314.anInt5339, Static114.anInt2051);
		}
		Static140.aCanvas1.addFocusListener(this);
		Static140.aCanvas1.requestFocus();
		Static222.aBoolean224 = true;
		Static247.aBoolean271 = true;
		Static312.aBoolean579 = true;
		Static672.aBoolean724 = false;
		Static441.aLong218 = Static566.method7936();
	}

	@OriginalMember(owner = "client!pj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static131.anApplet_Sub1_1 == this && !Static125.aBoolean135) {
			Static416.aLong209 = Static566.method7936() + 4000L;
		}
	}

	@OriginalMember(owner = "client!pj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static131.anApplet_Sub1_1 != this || Static125.aBoolean135) {
			return;
		}
		Static312.aBoolean579 = true;
		if (Static574.aBoolean683 && Static566.method7936() - Static441.aLong218 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static338.anInt5825 && Static13.anInt10825 <= local26.height) {
				Static672.aBoolean724 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)Z")
	public final boolean method1439() {
		return Static272.method4009("jaclib");
	}

	@OriginalMember(owner = "client!pj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZ)V")
	private void method1440(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static125.aBoolean135) {
				return;
			}
			Static125.aBoolean135 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static180.anApplet6 != null) {
			Static180.anApplet6.destroy();
		}
		try {
			this.method1445();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean94) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean94 = false;
		}
		Static497.method7159();
		Static237.method3586();
		if (Static140.aCanvas1 != null) {
			try {
				Static140.aCanvas1.removeFocusListener(this);
				Static140.aCanvas1.getParent().remove(Static140.aCanvas1);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static569.aClass380_6 != null) {
			try {
				Static569.aClass380_6.method8816();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method1444();
		if (Static293.aFrame3 != null) {
			Static293.aFrame3.setVisible(false);
			Static293.aFrame3.dispose();
			Static293.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!pj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static222.aBoolean224 = true;
		Static312.aBoolean579 = true;
	}

	@OriginalMember(owner = "client!pj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static293.aFrame3 == null) {
			return Static180.anApplet6 == null || Static180.anApplet6 == this ? super.getAppletContext() : Static180.anApplet6.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
	protected final boolean method1441() {
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
				this.method1433("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)Z")
	public final boolean method1442() {
		return Static272.method4009("jagmisc");
	}

	@OriginalMember(owner = "client!pj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	protected abstract void method1444();

	@OriginalMember(owner = "client!pj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static293.aFrame3 == null) {
			return Static180.anApplet6 == null || Static180.anApplet6 == this ? super.getParameter(arg0) : Static180.anApplet6.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static293.aFrame3 == null) {
			return Static180.anApplet6 == null || Static180.anApplet6 == this ? super.getDocumentBase() : Static180.anApplet6.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static131.anApplet_Sub1_1 == this && !Static125.aBoolean135) {
			Static416.aLong209 = 0L;
		}
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V")
	protected abstract void method1445();
}
