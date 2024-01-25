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

@OriginalClass("client!mr")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!mr", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static42.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!mr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	protected abstract void method1345();

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	protected final void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) String arg3) {
		try {
			if (Static4.anApplet_Sub1_5 == null) {
				Static380.anInt1859 = 639;
				Static44.anInt873 = 0;
				Static312.anInt5970 = 0;
				Static356.anInt6630 = arg2;
				Static539.anInt9304 = arg2;
				Static4.anApplet_Sub1_5 = this;
				Static321.anInt6137 = arg1;
				Static26.anInt535 = arg1;
				Static554.anApplet3 = Static42.anApplet1;
				Static413.aClass112_5 = Static529.aClass112_6 = new Class112(arg0, arg3, 37, Static42.anApplet1 != null);
				@Pc(64) Class328 local64 = Static529.aClass112_6.method3237(this, 1);
				while (local64.anInt9389 == 0) {
					Static179.method3254(10L);
				}
			} else {
				Static75.anInt1539++;
				if (Static75.anInt1539 >= 3) {
					this.method1359("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static619.method8645(local80, (String) null);
			this.method1359("crash");
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	private void method1347() {
		@Pc(6) long local6 = Static32.method595();
		@Pc(10) long local10 = Static294.aLongArray11[Static76.anInt1540];
		Static294.aLongArray11[Static76.anInt1540] = local6;
		Static76.anInt1540 = Static76.anInt1540 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local10 == 0L || local10 >= local6) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static399.aBoolean503 = Static271.aBoolean365;
		}
		this.method1355();
	}

	@OriginalMember(owner = "client!mr", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static4.anApplet_Sub1_5 == this && !Static273.aBoolean368) {
			Static52.aLong30 = Static32.method595() + 4000L;
		}
	}

	@OriginalMember(owner = "client!mr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static271.aBoolean365 = true;
		Static362.aBoolean440 = true;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Ljava/lang/String;")
	public String method1348() {
		return null;
	}

	@OriginalMember(owner = "client!mr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static70.aFrame3 == null) {
			return Static42.anApplet1 == null || Static42.anApplet1 == this ? super.getDocumentBase() : Static42.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZI)V")
	private void method1349(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static273.aBoolean368) {
				return;
			}
			Static273.aBoolean368 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static42.anApplet1 != null) {
			Static42.anApplet1.destroy();
		}
		try {
			this.method1345();
		} catch (@Pc(43) Exception local43) {
		}
		if (this.aBoolean107) {
			try {
				jagmisc.quit();
			} catch (@Pc(49) Throwable local49) {
			}
			this.aBoolean107 = false;
		}
		Static24.method369();
		Static605.method8490();
		if (Static271.aCanvas6 != null) {
			try {
				Static271.aCanvas6.removeFocusListener(this);
				Static271.aCanvas6.getParent().remove(Static271.aCanvas6);
			} catch (@Pc(69) Exception local69) {
			}
		}
		if (Static529.aClass112_6 != null) {
			try {
				Static529.aClass112_6.method3239();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method1351();
		if (Static70.aFrame3 != null) {
			Static70.aFrame3.setVisible(false);
			Static70.aFrame3.dispose();
			Static70.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
	private void method1350() {
		@Pc(6) long local6 = Static32.method595();
		@Pc(10) long local10 = Static234.aLongArray4[Static30.anInt4468];
		Static234.aLongArray4[Static30.anInt4468] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(30) int local30 = (int) (local6 - local10);
			Static340.anInt6735 = ((local30 >> 1) + 32000) / local30;
		}
		Static30.anInt4468 = Static30.anInt4468 + 1 & 0x1F;
		if (Static485.anInt8403++ > 50) {
			Static485.anInt8403 -= 50;
			Static362.aBoolean440 = true;
			Static271.aCanvas6.setSize(Static321.anInt6137, Static356.anInt6630);
			Static271.aCanvas6.setVisible(true);
			if (Static70.aFrame3 != null && Static476.aFrame6 == null) {
				@Pc(73) Insets local73 = Static70.aFrame3.getInsets();
				Static271.aCanvas6.setLocation(local73.left + Static312.anInt5970, local73.top + Static44.anInt873);
			} else {
				Static271.aCanvas6.setLocation(Static312.anInt5970, Static44.anInt873);
			}
		}
		this.method1356();
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
	protected abstract void method1351();

	@OriginalMember(owner = "client!mr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z")
	public final boolean method1352() {
		return Static96.method1571("jaclib");
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	public synchronized void method1353() {
		if (Static271.aCanvas6 != null) {
			Static271.aCanvas6.removeFocusListener(this);
			Static271.aCanvas6.getParent().setBackground(Color.black);
			Static271.aCanvas6.getParent().remove(Static271.aCanvas6);
		}
		@Pc(26) Container local26;
		if (Static476.aFrame6 != null) {
			local26 = Static476.aFrame6;
		} else if (Static70.aFrame3 != null) {
			local26 = Static70.aFrame3;
		} else if (Static42.anApplet1 == null) {
			local26 = Static4.anApplet_Sub1_5;
		} else {
			local26 = Static42.anApplet1;
		}
		local26.setLayout((LayoutManager) null);
		Static271.aCanvas6 = new Canvas_Sub1(this);
		local26.add(Static271.aCanvas6);
		Static271.aCanvas6.setSize(Static321.anInt6137, Static356.anInt6630);
		Static271.aCanvas6.setVisible(true);
		if (local26 == Static70.aFrame3) {
			@Pc(70) Insets local70 = Static70.aFrame3.getInsets();
			Static271.aCanvas6.setLocation(Static312.anInt5970 + local70.left, Static44.anInt873 + local70.top);
		} else {
			Static271.aCanvas6.setLocation(Static312.anInt5970, Static44.anInt873);
		}
		Static271.aCanvas6.addFocusListener(this);
		Static271.aCanvas6.requestFocus();
		Static271.aBoolean365 = true;
		Static399.aBoolean503 = true;
		Static362.aBoolean440 = true;
		Static359.aBoolean437 = false;
		Static294.aLong150 = Static32.method595();
	}

	@OriginalMember(owner = "client!mr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static70.aFrame3 == null) {
			return Static42.anApplet1 == null || Static42.anApplet1 == this ? super.getAppletContext() : Static42.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "(I)V")
	protected abstract void method1355();

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "(I)V")
	protected abstract void method1356();

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)Z")
	public final boolean method1357() {
		return Static96.method1571("jagtheora");
	}

	@OriginalMember(owner = "client!mr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!mr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static177.aString43 != null) {
				@Pc(10) String local10 = Static177.aString43.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static177.aString46;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1359("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static177.aString46 == null || Static177.aString46.equals("1.4.2"))) {
					this.method1359("wrongjava");
					return;
				}
			}
			if (Static177.aString46 != null && Static177.aString46.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static177.aString46.length()) {
					@Pc(79) char local79 = Static177.aString46.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local79 + local73 * 10 - 48;
				}
				if (local73 >= 5) {
					Static632.aBoolean692 = true;
				}
			}
			@Pc(115) Applet local115 = Static4.anApplet_Sub1_5;
			if (Static42.anApplet1 != null) {
				local115 = Static42.anApplet1;
			}
			@Pc(121) Method local121 = Static177.aMethod2;
			if (local121 != null) {
				try {
					local121.invoke(local115, Boolean.TRUE);
				} catch (@Pc(135) Throwable local135) {
				}
			}
			Static467.method7093();
			Static180.method3295();
			this.method1353();
			this.method1360();
			Static125.aClass85_147 = Static144.method2334();
			while (Static52.aLong30 == 0L || Static32.method595() < Static52.aLong30) {
				Static183.anInt3776 = Static125.aClass85_147.method8294(Static128.aLong70);
				for (@Pc(158) int local158 = 0; local158 < Static183.anInt3776; local158++) {
					this.method1347();
				}
				this.method1350();
				Static258.method4613(Static529.aClass112_6, Static271.aCanvas6);
			}
		} catch (@Pc(195) ThreadDeath local195) {
			throw local195;
		} catch (@Pc(198) Throwable local198) {
			Static619.method8645(local198, this.method1348());
			this.method1359("crash");
		} finally {
			@Pc(214) Object local214 = null;
			this.method1349(true);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method1359(@OriginalArg(0) String arg0) {
		if (this.aBoolean108) {
			return;
		}
		this.aBoolean108 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static654.method5164(Static42.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "(I)V")
	protected abstract void method1360();

	@OriginalMember(owner = "client!mr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static70.aFrame3 == null) {
			return Static42.anApplet1 == null || Static42.anApplet1 == this ? super.getCodeBase() : Static42.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static4.anApplet_Sub1_5 == this && !Static273.aBoolean368) {
			Static52.aLong30 = 0L;
		}
	}

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "(I)Z")
	public final boolean method1361() {
		return Static96.method1571("jagmisc");
	}

	@OriginalMember(owner = "client!mr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!mr", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static4.anApplet_Sub1_5 == this && !Static273.aBoolean368) {
			Static52.aLong30 = Static32.method595();
			Static179.method3254(5000L);
			Static413.aClass112_5 = null;
			this.method1349(false);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIIIILjava/lang/String;IZ)V")
	protected final void method1362(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static312.anInt5970 = 0;
			Static380.anInt1859 = 639;
			Static321.anInt6137 = 1024;
			Static26.anInt535 = 1024;
			Static356.anInt6630 = 768;
			Static539.anInt9304 = 768;
			Static44.anInt873 = 0;
			Static554.anApplet3 = null;
			Static4.anApplet_Sub1_5 = this;
			Static70.aFrame3 = new Frame();
			Static70.aFrame3.setTitle("Jagex");
			Static70.aFrame3.setResizable(true);
			Static70.aFrame3.addWindowListener(this);
			Static70.aFrame3.setVisible(true);
			Static70.aFrame3.toFront();
			@Pc(40) Insets local40 = Static70.aFrame3.getInsets();
			Static70.aFrame3.setSize(Static26.anInt535 + local40.left + local40.right, local40.top + Static539.anInt9304 + local40.bottom);
			Static413.aClass112_5 = Static529.aClass112_6 = new Class112(arg0, arg1, 37, true);
			@Pc(72) Class328 local72 = Static529.aClass112_6.method3237(this, 1);
			while (local72.anInt9389 == 0) {
				Static179.method3254(10L);
			}
		} catch (@Pc(84) Exception local84) {
			Static619.method8645(local84, (String) null);
		}
	}

	@OriginalMember(owner = "client!mr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static271.aBoolean365 = false;
	}

	@OriginalMember(owner = "client!mr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static70.aFrame3 == null) {
			return Static42.anApplet1 == null || Static42.anApplet1 == this ? super.getParameter(arg0) : Static42.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static4.anApplet_Sub1_5 != this || Static273.aBoolean368) {
			return;
		}
		Static362.aBoolean440 = true;
		if (Static632.aBoolean692 && Static32.method595() - Static294.aLong150 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static26.anInt535 && local26.height >= Static539.anInt9304) {
				Static359.aBoolean437 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(B)Z")
	protected final boolean method1363() {
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
				this.method1359("invalidhost");
				return false;
			}
		}
	}
}
