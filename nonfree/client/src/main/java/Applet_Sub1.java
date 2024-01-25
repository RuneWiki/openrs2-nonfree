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

@OriginalClass("client!ju")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "Z")
	private boolean aBoolean107 = false;

	static {
		new Class67(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!ju", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static370.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	private void method1260() {
		@Pc(6) long local6 = Static12.method647();
		@Pc(10) long local10 = Static477.aLongArray27[Static109.anInt2396];
		Static477.aLongArray27[Static109.anInt2396] = local6;
		Static109.anInt2396 = Static109.anInt2396 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local10 == 0L || local6 <= local10) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static530.aBoolean675 = Static339.aBoolean364;
		}
		this.method1265();
	}

	@OriginalMember(owner = "client!ju", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static107.aFrame1 == null) {
			return Static370.anApplet1 == null || Static370.anApplet1 == this ? super.getDocumentBase() : Static370.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Z")
	protected final boolean method1261() {
		return Static140.method2462("jaclib");
	}

	@OriginalMember(owner = "client!ju", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static391.anApplet_Sub1_1 == this && !Static3.aBoolean14) {
			Static191.aLong106 = 0L;
		}
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)Z")
	protected final boolean method1262() {
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
				this.method1267("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
	private void method1263() {
		@Pc(6) long local6 = Static12.method647();
		@Pc(10) long local10 = Static37.aLongArray2[Static155.anInt3160];
		Static37.aLongArray2[Static155.anInt3160] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(33) int local33 = (int) (local6 - local10);
			Static111.anInt8371 = ((local33 >> 1) + 32000) / local33;
		}
		Static155.anInt3160 = Static155.anInt3160 + 1 & 0x1F;
		if (Static197.anInt4463++ > 50) {
			Static2.aBoolean13 = true;
			Static197.anInt4463 -= 50;
			Static549.aCanvas15.setSize(Static480.anInt8652, Static412.anInt7547);
			Static549.aCanvas15.setVisible(true);
			if (Static107.aFrame1 != null && Static258.aFrame2 == null) {
				@Pc(80) Insets local80 = Static107.aFrame1.getInsets();
				Static549.aCanvas15.setLocation(local80.left + Static493.anInt9484, local80.top + Static531.anInt9232);
			} else {
				Static549.aCanvas15.setLocation(Static493.anInt9484, Static531.anInt9232);
			}
		}
		this.method1269();
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	public final synchronized void method1264() {
		if (Static549.aCanvas15 != null) {
			Static549.aCanvas15.removeFocusListener(this);
			Static549.aCanvas15.getParent().remove(Static549.aCanvas15);
		}
		@Pc(20) Container local20;
		if (Static258.aFrame2 != null) {
			local20 = Static258.aFrame2;
		} else if (Static107.aFrame1 != null) {
			local20 = Static107.aFrame1;
		} else if (Static370.anApplet1 == null) {
			local20 = Static391.anApplet_Sub1_1;
		} else {
			local20 = Static370.anApplet1;
		}
		local20.setLayout(null);
		Static549.aCanvas15 = new Canvas_Sub1(this);
		local20.add(Static549.aCanvas15);
		Static549.aCanvas15.setSize(Static480.anInt8652, Static412.anInt7547);
		Static549.aCanvas15.setVisible(true);
		if (local20 == Static107.aFrame1) {
			@Pc(65) Insets local65 = Static107.aFrame1.getInsets();
			Static549.aCanvas15.setLocation(Static493.anInt9484 + local65.left, Static531.anInt9232 + local65.top);
		} else {
			Static549.aCanvas15.setLocation(Static493.anInt9484, Static531.anInt9232);
		}
		Static549.aCanvas15.addFocusListener(this);
		Static549.aCanvas15.requestFocus();
		Static530.aBoolean675 = true;
		Static339.aBoolean364 = true;
		Static2.aBoolean13 = true;
		Static340.aBoolean409 = false;
		Static17.aLong105 = Static12.method647();
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(B)V")
	protected abstract void method1265();

	@OriginalMember(owner = "client!ju", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static107.aFrame1 == null) {
			return Static370.anApplet1 == null || Static370.anApplet1 == this ? super.getAppletContext() : Static370.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIILjava/lang/String;IB)V")
	protected final void method1266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (Static391.anApplet_Sub1_1 == null) {
				Static493.anInt9484 = 0;
				Static531.anApplet2 = Static370.anApplet1;
				Static531.anInt9232 = 0;
				Static412.anInt7547 = arg0;
				Static211.anInt4645 = arg0;
				Static480.anInt8652 = arg2;
				Static265.anInt5511 = arg2;
				Static199.anInt4472 = 611;
				Static391.anApplet_Sub1_1 = this;
				Static35.aClass285_3 = Static401.aClass285_11 = new Class285(arg1, arg3, 32, Static370.anApplet1 != null);
				@Pc(73) Class212 local73 = Static401.aClass285_11.method7050(1, this);
				while (local73.anInt6547 == 0) {
					Static327.method5231(10L);
				}
			} else {
				Static533.anInt6729++;
				if (Static533.anInt6729 >= 3) {
					this.method1267("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(86) Throwable local86) {
			Static2.method220(local86, null);
			this.method1267("crash");
		}
	}

	@OriginalMember(owner = "client!ju", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static472.aString77 != null) {
					@Pc(10) String local10 = Static472.aString77.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(41) String local41 = Static472.aString74;
						if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
							this.method1267("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static472.aString74 == null || Static472.aString74.equals("1.4.2"))) {
						this.method1267("wrongjava");
						break label107;
					}
				}
				@Pc(71) int local71;
				if (Static472.aString74 != null && Static472.aString74.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static472.aString74.length()) {
						@Pc(79) char local79 = Static472.aString74.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local71++;
						local73 = local73 * 10 + local79 - 48;
					}
					if (local73 >= 5) {
						Static120.aBoolean192 = true;
					}
				}
				if (Static370.anApplet1 != null) {
					@Pc(113) Method local113 = Static472.aMethod1;
					if (local113 != null) {
						try {
							local113.invoke(Static370.anApplet1, Boolean.TRUE);
						} catch (@Pc(127) Throwable local127) {
						}
					}
				}
				Static80.method1629();
				Static51.method1079();
				this.method1264();
				this.method1278();
				Static148.aClass95_1 = Static414.method6214();
				while (Static191.aLong106 == 0L || Static12.method647() < Static191.aLong106) {
					Static104.anInt2323 = Static148.aClass95_1.method6525(Static107.aLong73);
					for (local71 = 0; local71 < Static104.anInt2323; local71++) {
						this.method1260();
					}
					this.method1263();
					Static57.method1161(Static401.aClass285_11, Static549.aCanvas15);
				}
			}
		} catch (@Pc(183) Throwable local183) {
			Static2.method220(local183, this.method1268());
			this.method1267("crash");
		}
		this.method1272(true);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1267(@OriginalArg(0) String arg0) {
		if (this.aBoolean107) {
			return;
		}
		this.aBoolean107 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static562.method7815("loggedout", Static370.anApplet1);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1268() {
		return null;
	}

	@OriginalMember(owner = "client!ju", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static391.anApplet_Sub1_1 == this && !Static3.aBoolean14) {
			Static191.aLong106 = Static12.method647() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ju", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static107.aFrame1 == null) {
			return Static370.anApplet1 == null || Static370.anApplet1 == this ? super.getCodeBase() : Static370.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static391.anApplet_Sub1_1 != this || Static3.aBoolean14) {
			return;
		}
		Static2.aBoolean13 = true;
		if (Static120.aBoolean192 && Static12.method647() - Static17.aLong105 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static265.anInt5511 && Static211.anInt4645 <= local26.height) {
				Static340.aBoolean409 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static339.aBoolean364 = true;
		Static2.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
	protected abstract void method1269();

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIZLjava/lang/String;I)V")
	protected final void method1270(@OriginalArg(6) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static412.anInt7547 = 768;
			Static211.anInt4645 = 768;
			Static531.anApplet2 = null;
			Static493.anInt9484 = 0;
			Static391.anApplet_Sub1_1 = this;
			Static531.anInt9232 = 0;
			Static199.anInt4472 = 611;
			Static480.anInt8652 = 1024;
			Static265.anInt5511 = 1024;
			Static107.aFrame1 = new Frame();
			Static107.aFrame1.setTitle("Jagex");
			Static107.aFrame1.setResizable(true);
			Static107.aFrame1.addWindowListener(this);
			Static107.aFrame1.setVisible(true);
			Static107.aFrame1.toFront();
			@Pc(40) Insets local40 = Static107.aFrame1.getInsets();
			Static107.aFrame1.setSize(local40.right + Static265.anInt5511 + local40.left, local40.bottom + Static211.anInt4645 + local40.top);
			Static35.aClass285_3 = Static401.aClass285_11 = new Class285(arg1, arg0, 32, true);
			@Pc(73) Class212 local73 = Static401.aClass285_11.method7050(1, this);
			while (local73.anInt6547 == 0) {
				Static327.method5231(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static2.method220(local86, null);
		}
	}

	@OriginalMember(owner = "client!ju", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static391.anApplet_Sub1_1 == this && !Static3.aBoolean14) {
			Static191.aLong106 = Static12.method647();
			Static327.method5231(5000L);
			Static35.aClass285_3 = null;
			this.method1272(false);
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZB)V")
	private void method1272(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static3.aBoolean14) {
				return;
			}
			Static3.aBoolean14 = true;
		}
		if (Static370.anApplet1 != null) {
			Static370.anApplet1.destroy();
		}
		try {
			this.method1274();
		} catch (@Pc(29) Exception local29) {
		}
		if (this.aBoolean106) {
			try {
				jagmisc.quit();
			} catch (@Pc(35) Throwable local35) {
			}
			this.aBoolean106 = false;
		}
		Static354.method5569();
		Static280.method4812();
		if (Static549.aCanvas15 != null) {
			try {
				Static549.aCanvas15.removeFocusListener(this);
				Static549.aCanvas15.getParent().remove(Static549.aCanvas15);
			} catch (@Pc(59) Exception local59) {
			}
		}
		if (Static401.aClass285_11 != null) {
			try {
				Static401.aClass285_11.method7045();
			} catch (@Pc(67) Exception local67) {
			}
		}
		this.method1273();
		if (Static107.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(77) Throwable local77) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ju", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(Z)V")
	protected abstract void method1273();

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
	protected abstract void method1274();

	@OriginalMember(owner = "client!ju", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static107.aFrame1 == null) {
			return Static370.anApplet1 == null || Static370.anApplet1 == this ? super.getParameter(arg0) : Static370.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ju", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(Z)Z")
	public final boolean method1275() {
		return Static140.method2462("jagmisc");
	}

	@OriginalMember(owner = "client!ju", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ju", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static339.aBoolean364 = false;
	}

	@OriginalMember(owner = "client!ju", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "(B)V")
	protected abstract void method1278();
}
