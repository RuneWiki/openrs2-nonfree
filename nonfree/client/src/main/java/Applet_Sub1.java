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

@OriginalClass("client!hh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	protected abstract void method852();

	@OriginalMember(owner = "client!hh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public final synchronized void method853() {
		if (Static101.aCanvas8 != null) {
			Static101.aCanvas8.removeFocusListener(this);
			Static101.aCanvas8.getParent().remove(Static101.aCanvas8);
		}
		@Pc(18) Container local18;
		if (Static315.aFrame2 != null) {
			local18 = Static315.aFrame2;
		} else if (Static350.aFrame3 == null) {
			local18 = Static212.aClass120_3.anApplet1;
		} else {
			local18 = Static350.aFrame3;
		}
		local18.setLayout(null);
		Static101.aCanvas8 = new Canvas_Sub1(this);
		local18.add(Static101.aCanvas8);
		Static101.aCanvas8.setSize(Static202.anInt4258, Static38.anInt832);
		Static101.aCanvas8.setVisible(true);
		if (Static350.aFrame3 == local18) {
			@Pc(54) Insets local54 = Static350.aFrame3.getInsets();
			Static101.aCanvas8.setLocation(local54.left + Static23.anInt411, local54.top - -Static74.anInt1655);
		} else {
			Static101.aCanvas8.setLocation(Static23.anInt411, Static74.anInt1655);
		}
		Static101.aCanvas8.addFocusListener(this);
		Static101.aCanvas8.requestFocus();
		Static120.aBoolean228 = true;
		Static317.aBoolean551 = true;
		Static350.aBoolean592 = true;
		Static189.aBoolean338 = false;
		Static308.aLong253 = Static274.method4763();
	}

	@OriginalMember(owner = "client!hh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static280.anApplet_Sub1_1 == this && !Static126.aBoolean237) {
			Static67.aLong56 = Static274.method4763() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	protected abstract void method855();

	@OriginalMember(owner = "client!hh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static280.anApplet_Sub1_1 == this && !Static126.aBoolean237) {
			Static67.aLong56 = Static274.method4763();
			Static270.method5481(5000L);
			Static81.aClass120_1 = null;
			this.method863(false);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	protected abstract void method856();

	@OriginalMember(owner = "client!hh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static172.aString127 != null) {
					@Pc(10) String local10 = Static172.aString127.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static172.aString131;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method864("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static172.aString131 == null || Static172.aString131.equals("1.4.2"))) {
						this.method864("wrongjava");
						break label111;
					}
				}
				@Pc(70) int local70;
				if (Static172.aString131 != null && Static172.aString131.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static172.aString131.length() > local70) {
						@Pc(78) char local78 = Static172.aString131.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local72 * 10 + local78 - 48;
					}
					if (local72 >= 5) {
						Static92.aBoolean178 = true;
					}
				}
				if (Static212.aClass120_3.anApplet1 != null) {
					@Pc(111) Method local111 = Static172.aMethod1;
					if (local111 != null) {
						try {
							local111.invoke(Static212.aClass120_3.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static72.method1359();
				this.method853();
				this.method852();
				Static258.aClass129_1 = Static337.method4918();
				this.method865();
				while (Static67.aLong56 == 0L || Static67.aLong56 > Static274.method4763()) {
					Static314.anInt3129 = Static258.aClass129_1.method5342(Static312.anInt2706);
					for (local70 = 0; local70 < Static314.anInt3129; local70++) {
						this.method867();
					}
					this.method857();
					Static48.method914(Static212.aClass120_3, Static101.aCanvas8);
				}
			}
		} catch (@Pc(183) Exception local183) {
			Static103.method2841(local183, null);
			this.method864("crash");
		}
		this.method863(true);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	private void method857() {
		@Pc(6) long local6 = Static274.method4763();
		@Pc(10) long local10 = Static318.aLongArray7[Static2.anInt5071];
		Static318.aLongArray7[Static2.anInt5071] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static173.anInt3835 = ((local32 >> 1) + 32000) / local32;
		}
		Static2.anInt5071 = Static2.anInt5071 + 1 & 0x1F;
		if (Static257.anInt5295++ > 50) {
			Static350.aBoolean592 = true;
			Static257.anInt5295 -= 50;
			Static101.aCanvas8.setSize(Static202.anInt4258, Static38.anInt832);
			Static101.aCanvas8.setVisible(true);
			if (Static350.aFrame3 != null && Static315.aFrame2 == null) {
				@Pc(81) Insets local81 = Static350.aFrame3.getInsets();
				Static101.aCanvas8.setLocation(local81.left + Static23.anInt411, Static74.anInt1655 + local81.top);
			} else {
				Static101.aCanvas8.setLocation(Static23.anInt411, Static74.anInt1655);
			}
		}
		this.method855();
	}

	@OriginalMember(owner = "client!hh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static280.anApplet_Sub1_1 == this && !Static126.aBoolean237) {
			Static67.aLong56 = 0L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	protected abstract void method858();

	@OriginalMember(owner = "client!hh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static280.anApplet_Sub1_1 != this || Static126.aBoolean237) {
			return;
		}
		Static350.aBoolean592 = true;
		if (Static92.aBoolean178 && Static274.method4763() - Static308.aLong253 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static193.anInt4171 && local26.height >= Static135.anInt3077) {
				Static189.aBoolean338 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static350.aFrame3 == null) {
			return Static212.aClass120_3 == null || Static212.aClass120_3.anApplet1 == this ? super.getParameter(arg0) : Static212.aClass120_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static120.aBoolean228 = false;
	}

	@OriginalMember(owner = "client!hh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static350.aFrame3 == null) {
			return Static212.aClass120_3 == null || Static212.aClass120_3.anApplet1 == this ? super.getAppletContext() : Static212.aClass120_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;IIIIZZI)V")
	protected final void method861(@OriginalArg(0) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static23.anInt411 = 0;
			Static74.anInt1655 = 0;
			Static38.anInt832 = 768;
			Static135.anInt3077 = 768;
			Static161.anInt3637 = 559;
			Static202.anInt4258 = 1024;
			Static193.anInt4171 = 1024;
			Static280.anApplet_Sub1_1 = this;
			Static350.aFrame3 = new Frame();
			Static350.aFrame3.setTitle("Jagex");
			Static350.aFrame3.setResizable(true);
			Static350.aFrame3.addWindowListener(this);
			Static350.aFrame3.setVisible(true);
			Static350.aFrame3.toFront();
			@Pc(42) Insets local42 = Static350.aFrame3.getInsets();
			Static350.aFrame3.setSize(local42.right + Static193.anInt4171 + local42.left, local42.bottom + local42.top + Static135.anInt3077);
			Static81.aClass120_1 = Static212.aClass120_3 = new Class120(null, arg1, arg0, 29);
			@Pc(74) Class51 local74 = Static212.aClass120_3.method3232(this, 1);
			while (local74.anInt1229 == 0) {
				Static270.method5481(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static103.method2841(local87, null);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIBI)V")
	protected final void method862(@OriginalArg(4) int arg0) {
		try {
			if (Static280.anApplet_Sub1_1 == null) {
				Static161.anInt3637 = 559;
				Static74.anInt1655 = 0;
				Static38.anInt832 = 503;
				Static135.anInt3077 = 503;
				Static280.anApplet_Sub1_1 = this;
				Static202.anInt4258 = 765;
				Static193.anInt4171 = 765;
				Static23.anInt411 = 0;
				if (Static212.aClass120_3 == null) {
					Static81.aClass120_1 = Static212.aClass120_3 = new Class120(this, arg0, null, 0);
				}
				@Pc(64) Class51 local64 = Static212.aClass120_3.method3232(this, 1);
				while (local64.anInt1229 == 0) {
					Static270.method5481(10L);
				}
			} else {
				Static303.anInt3066++;
				if (Static303.anInt3066 >= 3) {
					this.method864("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Exception local74) {
			Static103.method2841(local74, null);
			this.method864("crash");
		}
	}

	@OriginalMember(owner = "client!hh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	private void method863(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static126.aBoolean237) {
				return;
			}
			Static126.aBoolean237 = true;
		}
		if (Static212.aClass120_3.anApplet1 != null) {
			Static212.aClass120_3.anApplet1.destroy();
		}
		try {
			this.method869();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean72) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean72 = false;
		}
		@Pc(56) Class51 local56 = Static212.aClass120_3.method3238(Static280.anApplet_Sub1_1.getClass());
		while (local56.anInt1229 == 0) {
			Static270.method5481(100L);
		}
		if (Static101.aCanvas8 != null) {
			try {
				Static101.aCanvas8.removeFocusListener(this);
				Static101.aCanvas8.getParent().remove(Static101.aCanvas8);
			} catch (@Pc(80) Exception local80) {
			}
		}
		if (Static212.aClass120_3 != null) {
			try {
				Static212.aClass120_3.method3233();
			} catch (@Pc(88) Exception local88) {
			}
		}
		this.method858();
		if (Static350.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(98) Throwable local98) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method864(@OriginalArg(0) String arg0) {
		if (this.aBoolean73) {
			return;
		}
		this.aBoolean73 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static369.method5674(Static212.aClass120_3.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static350.aFrame3 == null) {
			return Static212.aClass120_3 == null || Static212.aClass120_3.anApplet1 == this ? super.getCodeBase() : Static212.aClass120_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public final void method865() {
		if (this.aBoolean72) {
			return;
		}
		try {
			@Pc(20) Class51 local20 = Static212.aClass120_3.method3239(Static280.anApplet_Sub1_1.getClass());
			while (local20.anInt1229 == 0) {
				Static270.method5481(100L);
			}
			if (local20.anObject1 != null) {
				throw (Throwable) local20.anObject1;
			}
			jagmisc.init();
			this.aBoolean72 = true;
			Static258.aClass129_1 = Static337.method4918();
		} catch (@Pc(48) Throwable local48) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static350.aFrame3 == null) {
			return Static212.aClass120_3 == null || Static212.aClass120_3.anApplet1 == this ? super.getDocumentBase() : Static212.aClass120_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static120.aBoolean228 = true;
		Static350.aBoolean592 = true;
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
	private void method867() {
		@Pc(6) long local6 = Static274.method4763();
		@Pc(10) long local10 = Static161.aLongArray2[Static190.anInt4115];
		Static161.aLongArray2[Static190.anInt4115] = local6;
		Static190.anInt4115 = Static190.anInt4115 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local6 <= local10) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static317.aBoolean551 = Static120.aBoolean228;
		}
		this.method856();
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Z")
	protected final boolean method868() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.equals("stellardawn.com") || local16.endsWith(".stellardawn.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method864("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
	protected abstract void method869();

	@OriginalMember(owner = "client!hh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}
}
