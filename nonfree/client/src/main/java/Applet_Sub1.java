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

@OriginalClass("client!pq")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "Z")
	private boolean aBoolean79 = false;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1206() {
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)V")
	private void method1207(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static300.aBoolean405) {
				return;
			}
			Static300.aBoolean405 = true;
		}
		if (Static466.aClass102_4.anApplet1 != null) {
			Static466.aClass102_4.anApplet1.destroy();
		}
		try {
			this.method1217();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean79) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean79 = false;
		}
		Static79.method1344();
		Static150.method2373();
		if (Static105.aCanvas3 != null) {
			try {
				Static105.aCanvas3.removeFocusListener(this);
				Static105.aCanvas3.getParent().remove(Static105.aCanvas3);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static466.aClass102_4 != null) {
			try {
				Static466.aClass102_4.method2398();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1220();
		if (Static224.aFrame6 != null) {
			try {
				System.exit(0);
			} catch (@Pc(82) Throwable local82) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!pq", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	private void method1208() {
		@Pc(6) long local6 = Static60.method1119();
		@Pc(10) long local10 = Static80.aLongArray4[Static202.anInt3985];
		Static80.aLongArray4[Static202.anInt3985] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static477.anInt7966 = ((local32 >> 1) + 32000) / local32;
		}
		Static202.anInt3985 = Static202.anInt3985 + 1 & 0x1F;
		if (Static497.anInt8187++ > 50) {
			Static336.aBoolean435 = true;
			Static497.anInt8187 -= 50;
			Static105.aCanvas3.setSize(Static83.anInt1567, Static350.anInt6255);
			Static105.aCanvas3.setVisible(true);
			if (Static224.aFrame6 != null && Static193.aFrame8 == null) {
				@Pc(85) Insets local85 = Static224.aFrame6.getInsets();
				Static105.aCanvas3.setLocation(local85.left + Static81.anInt1466, local85.top + Static376.anInt6875);
			} else {
				Static105.aCanvas3.setLocation(Static81.anInt1466, Static376.anInt6875);
			}
		}
		this.method1222();
	}

	@OriginalMember(owner = "client!pq", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static363.anApplet_Sub1_1 == this && !Static300.aBoolean405) {
			Static188.aLong155 = Static60.method1119();
			Static209.method3565(5000L);
			Static52.aClass102_2 = null;
			this.method1207(false);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)Z")
	protected final boolean method1209() {
		return Static193.method6050("jaclib");
	}

	@OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static151.aString29 != null) {
					@Pc(10) String local10 = Static151.aString29.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(39) String local39 = Static151.aString24;
						if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
							this.method1223("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static151.aString24 == null || Static151.aString24.equals("1.4.2"))) {
						this.method1223("wrongjava");
						break label107;
					}
				}
				@Pc(69) int local69;
				if (Static151.aString24 != null && Static151.aString24.startsWith("1.")) {
					local69 = 2;
					@Pc(71) int local71 = 0;
					while (local69 < Static151.aString24.length()) {
						@Pc(77) char local77 = Static151.aString24.charAt(local69);
						if (local77 < '0' || local77 > '9') {
							break;
						}
						local71 = local71 * 10 + local77 - 48;
						local69++;
					}
					if (local71 >= 5) {
						Static424.aBoolean529 = true;
					}
				}
				if (Static466.aClass102_4.anApplet1 != null) {
					@Pc(113) Method local113 = Static151.aMethod2;
					if (local113 != null) {
						try {
							local113.invoke(Static466.aClass102_4.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static187.method2924();
				Static34.method786();
				this.method1218();
				this.method1215();
				Static404.aClass39_7 = Static80.method1380();
				while (Static188.aLong155 == 0L || Static60.method1119() < Static188.aLong155) {
					Static263.anInt5057 = Static404.aClass39_7.method4914(Static98.aLong345);
					for (local69 = 0; local69 < Static263.anInt5057; local69++) {
						this.method1219();
					}
					this.method1208();
					Static346.method5259(Static105.aCanvas3, Static466.aClass102_4);
				}
			}
		} catch (@Pc(184) Throwable local184) {
			Static234.method4051(local184, this.method1206());
			this.method1223("crash");
		}
		this.method1207(true);
	}

	@OriginalMember(owner = "client!pq", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
	public final boolean method1211() {
		return Static193.method6050("jagmisc");
	}

	@OriginalMember(owner = "client!pq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static328.aBoolean432 = true;
		Static336.aBoolean435 = true;
	}

	@OriginalMember(owner = "client!pq", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
	protected final void method1213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (Static363.anApplet_Sub1_1 != null) {
				Static315.anInt5799++;
				if (Static315.anInt5799 >= 3) {
					this.method1223("alreadyloaded");
					return;
				}
				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}
			Static363.anApplet_Sub1_1 = this;
			Static376.anInt6875 = 0;
			Static81.anInt1466 = 0;
			Static350.anInt6255 = arg0;
			Static128.anInt1835 = arg0;
			Static318.anInt5845 = 610;
			Static83.anInt1567 = arg2;
			Static399.anInt7190 = arg2;
			if (Static466.aClass102_4 == null) {
				Static52.aClass102_2 = Static466.aClass102_4 = new Class102(this, arg1, null, 0);
			}
			@Pc(60) Class157 local60 = Static466.aClass102_4.method2391(1, this);
			while (local60.anInt4742 == 0) {
				Static209.method3565(10L);
			}
		} catch (@Pc(70) Throwable local70) {
			Static234.method4051(local70, null);
			this.method1223("crash");
		}
	}

	@OriginalMember(owner = "client!pq", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIILjava/lang/String;IIBI)V")
	protected final void method1214(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static81.anInt1466 = 0;
			Static83.anInt1567 = 1024;
			Static399.anInt7190 = 1024;
			Static350.anInt6255 = 768;
			Static128.anInt1835 = 768;
			Static318.anInt5845 = 610;
			Static376.anInt6875 = 0;
			Static363.anApplet_Sub1_1 = this;
			Static224.aFrame6 = new Frame();
			Static224.aFrame6.setTitle("Jagex");
			Static224.aFrame6.setResizable(true);
			Static224.aFrame6.addWindowListener(this);
			Static224.aFrame6.setVisible(true);
			Static224.aFrame6.toFront();
			@Pc(42) Insets local42 = Static224.aFrame6.getInsets();
			Static224.aFrame6.setSize(local42.left + Static399.anInt7190 + local42.right, local42.bottom + local42.top + Static128.anInt1835);
			Static52.aClass102_2 = Static466.aClass102_4 = new Class102(null, arg0, arg1, 32);
			@Pc(76) Class157 local76 = Static466.aClass102_4.method2391(1, this);
			while (local76.anInt4742 == 0) {
				Static209.method3565(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static234.method4051(local89, null);
		}
	}

	@OriginalMember(owner = "client!pq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static363.anApplet_Sub1_1 == this && !Static300.aBoolean405) {
			Static188.aLong155 = 0L;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	protected abstract void method1215();

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
	protected abstract void method1216();

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V")
	protected abstract void method1217();

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)V")
	public final synchronized void method1218() {
		if (Static105.aCanvas3 != null) {
			Static105.aCanvas3.removeFocusListener(this);
			Static105.aCanvas3.getParent().remove(Static105.aCanvas3);
		}
		@Pc(21) Container local21;
		if (Static193.aFrame8 != null) {
			local21 = Static193.aFrame8;
		} else if (Static224.aFrame6 == null) {
			local21 = Static466.aClass102_4.anApplet1;
		} else {
			local21 = Static224.aFrame6;
		}
		local21.setLayout(null);
		Static105.aCanvas3 = new Canvas_Sub1(this);
		local21.add(Static105.aCanvas3);
		Static105.aCanvas3.setSize(Static83.anInt1567, Static350.anInt6255);
		Static105.aCanvas3.setVisible(true);
		if (local21 == Static224.aFrame6) {
			@Pc(54) Insets local54 = Static224.aFrame6.getInsets();
			Static105.aCanvas3.setLocation(local54.left + Static81.anInt1466, local54.top - -Static376.anInt6875);
		} else {
			Static105.aCanvas3.setLocation(Static81.anInt1466, Static376.anInt6875);
		}
		Static105.aCanvas3.addFocusListener(this);
		Static105.aCanvas3.requestFocus();
		Static297.aBoolean404 = true;
		Static328.aBoolean432 = true;
		Static336.aBoolean435 = true;
		Static194.aBoolean233 = false;
		Static304.aLong231 = Static60.method1119();
	}

	@OriginalMember(owner = "client!pq", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "(I)V")
	private void method1219() {
		@Pc(8) long local8 = Static60.method1119();
		@Pc(12) long local12 = Static119.aLongArray10[Static107.anInt2155];
		Static119.aLongArray10[Static107.anInt2155] = local8;
		Static107.anInt2155 = Static107.anInt2155 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local12 == 0L || local8 <= local12) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static297.aBoolean404 = Static328.aBoolean432;
		}
		this.method1216();
	}

	@OriginalMember(owner = "client!pq", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static224.aFrame6 == null) {
			return Static466.aClass102_4 == null || Static466.aClass102_4.anApplet1 == this ? super.getCodeBase() : Static466.aClass102_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!pq", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static224.aFrame6 == null) {
			return Static466.aClass102_4 == null || Static466.aClass102_4.anApplet1 == this ? super.getAppletContext() : Static466.aClass102_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static224.aFrame6 == null) {
			return Static466.aClass102_4 == null || Static466.aClass102_4.anApplet1 == this ? super.getParameter(arg0) : Static466.aClass102_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static363.anApplet_Sub1_1 != this || Static300.aBoolean405) {
			return;
		}
		Static336.aBoolean435 = true;
		if (Static424.aBoolean529 && Static60.method1119() - Static304.aLong231 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static399.anInt7190 <= local25.width && Static128.anInt1835 <= local25.height) {
				Static194.aBoolean233 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "(I)V")
	protected abstract void method1220();

	@OriginalMember(owner = "client!pq", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static224.aFrame6 == null) {
			return Static466.aClass102_4 == null || Static466.aClass102_4.anApplet1 == this ? super.getDocumentBase() : Static466.aClass102_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)Z")
	protected final boolean method1221() {
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
				this.method1223("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "(I)V")
	protected abstract void method1222();

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1223(@OriginalArg(1) String arg0) {
		if (this.aBoolean80) {
			return;
		}
		this.aBoolean80 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static557.method5219("loggedout", Static466.aClass102_4.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!pq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static328.aBoolean432 = false;
	}

	@OriginalMember(owner = "client!pq", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static363.anApplet_Sub1_1 == this && !Static300.aBoolean405) {
			Static188.aLong155 = Static60.method1119() + 4000L;
		}
	}
}
