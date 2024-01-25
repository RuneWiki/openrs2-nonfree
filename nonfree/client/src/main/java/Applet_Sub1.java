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

@OriginalClass("client!uaa")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "Z")
	private boolean aBoolean64 = false;

	@OriginalMember(owner = "client!uaa", name = "n", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!uaa", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static189.anApplet4 = arg0;
	}

	@OriginalMember(owner = "client!uaa", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uaa", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static2.anApplet_Sub1_1 == this && !Static246.aBoolean264) {
			Static73.aLong43 = 0L;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)Z")
	protected final boolean method833() {
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
				this.method838("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!uaa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static2.anApplet_Sub1_1 != this || Static246.aBoolean264) {
			return;
		}
		Static506.aBoolean578 = true;
		if (Static364.aBoolean437 && Static137.method2058() - Static516.aLong222 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || Static544.anInt9196 <= local23.width && local23.height >= Static371.anInt6408) {
				Static350.aBoolean422 = true;
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
	private void method834() {
		@Pc(11) long local11 = Static137.method2058();
		@Pc(15) long local15 = Static146.aLongArray8[Static227.anInt3847];
		Static146.aLongArray8[Static227.anInt3847] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static227.anInt3847 = Static227.anInt3847 + 1 & 0x1F;
		synchronized (this) {
			Static241.aBoolean259 = Static446.aBoolean528;
		}
		this.method839();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
	public final synchronized void method835() {
		if (Static34.aCanvas15 != null) {
			Static34.aCanvas15.removeFocusListener(this);
			Static34.aCanvas15.getParent().remove(Static34.aCanvas15);
		}
		@Pc(18) Container local18;
		if (Static147.aFrame1 != null) {
			local18 = Static147.aFrame1;
		} else if (Static183.aFrame2 != null) {
			local18 = Static183.aFrame2;
		} else if (Static189.anApplet4 == null) {
			local18 = Static2.anApplet_Sub1_1;
		} else {
			local18 = Static189.anApplet4;
		}
		local18.setLayout(null);
		Static34.aCanvas15 = new Canvas_Sub1(this);
		local18.add(Static34.aCanvas15);
		Static34.aCanvas15.setSize(Static502.anInt8364, Static476.anInt8045);
		Static34.aCanvas15.setVisible(true);
		if (local18 == Static183.aFrame2) {
			@Pc(59) Insets local59 = Static183.aFrame2.getInsets();
			Static34.aCanvas15.setLocation(local59.left + Static411.anInt7204, local59.top - -Static141.anInt2538);
		} else {
			Static34.aCanvas15.setLocation(Static411.anInt7204, Static141.anInt2538);
		}
		Static34.aCanvas15.addFocusListener(this);
		Static34.aCanvas15.requestFocus();
		Static446.aBoolean528 = true;
		Static241.aBoolean259 = true;
		Static506.aBoolean578 = true;
		Static350.aBoolean422 = false;
		Static516.aLong222 = Static137.method2058();
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(Z)V")
	protected abstract void method836();

	@OriginalMember(owner = "client!uaa", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static446.aBoolean528 = true;
		Static506.aBoolean578 = true;
	}

	@OriginalMember(owner = "client!uaa", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static2.anApplet_Sub1_1 == this && !Static246.aBoolean264) {
			Static73.aLong43 = Static137.method2058();
			Static149.method2211(5000L);
			Static307.aClass57_5 = null;
			this.method845(false);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uaa", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static183.aFrame2 == null) {
			return Static189.anApplet4 == null || Static189.anApplet4 == this ? super.getParameter(arg0) : Static189.anApplet4.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static2.anApplet_Sub1_1 == this && !Static246.aBoolean264) {
			Static73.aLong43 = Static137.method2058() + 4000L;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method838(@OriginalArg(1) String arg0) {
		if (this.aBoolean63) {
			return;
		}
		this.aBoolean63 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static587.method3349(Static189.anApplet4, "loggedout");
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)V")
	protected abstract void method839();

	@OriginalMember(owner = "client!uaa", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static70.aString14 != null) {
				@Pc(10) String local10 = Static70.aString14.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static70.aString19;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method838("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static70.aString19 == null || Static70.aString19.equals("1.4.2"))) {
					this.method838("wrongjava");
					return;
				}
			}
			if (Static70.aString19 != null && Static70.aString19.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (Static70.aString19.length() > local71) {
					@Pc(79) char local79 = Static70.aString19.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local79 + local73 * 10 - 48;
				}
				if (local73 >= 5) {
					Static364.aBoolean437 = true;
				}
			}
			@Pc(114) Applet local114 = Static2.anApplet_Sub1_1;
			if (Static189.anApplet4 != null) {
				local114 = Static189.anApplet4;
			}
			@Pc(120) Method local120 = Static70.aMethod2;
			if (local120 != null) {
				try {
					local120.invoke(local114, Boolean.TRUE);
				} catch (@Pc(134) Throwable local134) {
				}
			}
			Static216.method3181();
			Static101.method1652();
			this.method835();
			this.method836();
			Static483.aClass119_1 = Static57.method753();
			while (Static73.aLong43 == 0L || Static137.method2058() < Static73.aLong43) {
				Static415.anInt7330 = Static483.aClass119_1.method4148(Static457.aLong117);
				for (@Pc(157) int local157 = 0; local157 < Static415.anInt7330; local157++) {
					this.method834();
				}
				this.method847();
				Static534.method7438(Static34.aCanvas15, Static152.aClass57_4);
			}
		} catch (@Pc(188) ThreadDeath local188) {
			throw local188;
		} catch (@Pc(191) Throwable local191) {
			Static169.method2641(this.method841(), local191);
			this.method838("crash");
		} finally {
			@Pc(207) Object local207 = null;
			this.method845(true);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static446.aBoolean528 = false;
	}

	@OriginalMember(owner = "client!uaa", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIBIILjava/lang/String;I)V")
	protected final void method840(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) String arg2, @OriginalArg(6) int arg3) {
		try {
			if (Static2.anApplet_Sub1_1 == null) {
				Static502.anInt8364 = arg1;
				Static544.anInt9196 = arg1;
				Static141.anInt2538 = 0;
				Static411.anInt7204 = 0;
				Static397.anInt330 = 613;
				Static158.anApplet3 = Static189.anApplet4;
				Static2.anApplet_Sub1_1 = this;
				Static476.anInt8045 = arg3;
				Static371.anInt6408 = arg3;
				Static307.aClass57_5 = Static152.aClass57_4 = new Class57(arg0, arg2, 34, Static189.anApplet4 != null);
				@Pc(74) Class278 local74 = Static152.aClass57_4.method916(1, this);
				while (local74.anInt7757 == 0) {
					Static149.method2211(10L);
				}
			} else {
				Static353.anInt6223++;
				if (Static353.anInt6223 >= 3) {
					this.method838("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(87) Throwable local87) {
			Static169.method2641(null, local87);
			this.method838("crash");
		}
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method841() {
		return null;
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)Z")
	public final boolean method842() {
		return Static69.method889("jagmisc");
	}

	@OriginalMember(owner = "client!uaa", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uaa", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static183.aFrame2 == null) {
			return Static189.anApplet4 == null || Static189.anApplet4 == this ? super.getDocumentBase() : Static189.anApplet4.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(Z)V")
	protected abstract void method844();

	@OriginalMember(owner = "client!uaa", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static183.aFrame2 == null) {
			return Static189.anApplet4 == null || Static189.anApplet4 == this ? super.getCodeBase() : Static189.anApplet4.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BZ)V")
	private void method845(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static246.aBoolean264) {
				return;
			}
			Static246.aBoolean264 = true;
		}
		if (Static189.anApplet4 != null) {
			Static189.anApplet4.destroy();
		}
		try {
			this.method844();
		} catch (@Pc(29) Exception local29) {
		}
		if (this.aBoolean64) {
			try {
				jagmisc.quit();
			} catch (@Pc(35) Throwable local35) {
			}
			this.aBoolean64 = false;
		}
		Static211.method3134();
		Static249.method3548();
		if (Static34.aCanvas15 != null) {
			try {
				Static34.aCanvas15.removeFocusListener(this);
				Static34.aCanvas15.getParent().remove(Static34.aCanvas15);
			} catch (@Pc(59) Exception local59) {
			}
		}
		if (Static152.aClass57_4 != null) {
			try {
				Static152.aClass57_4.method918();
			} catch (@Pc(67) Exception local67) {
			}
		}
		this.method851();
		if (Static183.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(77) Throwable local77) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)V")
	protected abstract void method846();

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "(Z)V")
	private void method847() {
		@Pc(6) long local6 = Static137.method2058();
		@Pc(10) long local10 = Static74.aLongArray2[Static548.anInt9230];
		Static74.aLongArray2[Static548.anInt9230] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static443.anInt7696 = ((local32 >> 1) + 32000) / local32;
		}
		Static548.anInt9230 = Static548.anInt9230 + 1 & 0x1F;
		if (Static287.anInt9625++ > 50) {
			Static506.aBoolean578 = true;
			Static287.anInt9625 -= 50;
			Static34.aCanvas15.setSize(Static502.anInt8364, Static476.anInt8045);
			Static34.aCanvas15.setVisible(true);
			if (Static183.aFrame2 != null && Static147.aFrame1 == null) {
				@Pc(81) Insets local81 = Static183.aFrame2.getInsets();
				Static34.aCanvas15.setLocation(Static411.anInt7204 + local81.left, local81.top + Static141.anInt2538);
			} else {
				Static34.aCanvas15.setLocation(Static411.anInt7204, Static141.anInt2538);
			}
		}
		this.method846();
	}

	@OriginalMember(owner = "client!uaa", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!uaa", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static183.aFrame2 == null) {
			return Static189.anApplet4 == null || Static189.anApplet4 == this ? super.getAppletContext() : Static189.anApplet4.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZZIIIILjava/lang/String;I)V")
	protected final void method850(@OriginalArg(3) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static158.anApplet3 = null;
			Static411.anInt7204 = 0;
			Static2.anApplet_Sub1_1 = this;
			Static476.anInt8045 = 768;
			Static371.anInt6408 = 768;
			Static397.anInt330 = 613;
			Static141.anInt2538 = 0;
			Static502.anInt8364 = 1024;
			Static544.anInt9196 = 1024;
			Static183.aFrame2 = new Frame();
			Static183.aFrame2.setTitle("Jagex");
			Static183.aFrame2.setResizable(true);
			Static183.aFrame2.addWindowListener(this);
			Static183.aFrame2.setVisible(true);
			Static183.aFrame2.toFront();
			@Pc(44) Insets local44 = Static183.aFrame2.getInsets();
			Static183.aFrame2.setSize(local44.right + Static544.anInt9196 + local44.left, local44.top + Static371.anInt6408 + local44.bottom);
			Static307.aClass57_5 = Static152.aClass57_4 = new Class57(arg0, arg1, 34, true);
			@Pc(77) Class278 local77 = Static152.aClass57_4.method916(1, this);
			while (local77.anInt7757 == 0) {
				Static149.method2211(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static169.method2641(null, local90);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
	protected abstract void method851();

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Z")
	public final boolean method852() {
		return Static69.method889("jaclib");
	}

	@OriginalMember(owner = "client!uaa", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
