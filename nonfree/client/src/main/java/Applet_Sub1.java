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

@OriginalClass("client!bda")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!bda", name = "x", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!bda", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static31.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
	private void method1498() {
		@Pc(6) long local6 = Static158.method2936();
		@Pc(10) long local10 = Static339.aLongArray9[Static325.anInt5503];
		Static339.aLongArray9[Static325.anInt5503] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local6 <= local10) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static325.anInt5503 = Static325.anInt5503 + 1 & 0x1F;
		synchronized (this) {
			Static301.aBoolean389 = Static593.aBoolean766;
		}
		this.method1501();
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
	protected abstract void method1499();

	@OriginalMember(owner = "client!bda", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!bda", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
	private void method1500() {
		@Pc(8) long local8 = Static158.method2936();
		@Pc(12) long local12 = Static428.aLongArray14[Static451.anInt7503];
		Static428.aLongArray14[Static451.anInt7503] = local8;
		Static451.anInt7503 = Static451.anInt7503 + 1 & 0x1F;
		if (local12 != 0L && local12 < local8) {
			@Pc(36) int local36 = (int) (local8 - local12);
			Static286.anInt4910 = ((local36 >> 1) + 32000) / local36;
		}
		if (Static461.anInt7705++ > 50) {
			Static249.aBoolean332 = true;
			Static461.anInt7705 -= 50;
			Static387.aCanvas9.setSize(Static40.anInt758, Static308.anInt5171);
			Static387.aCanvas9.setVisible(true);
			if (Static203.aFrame3 != null && Static376.aFrame4 == null) {
				@Pc(80) Insets local80 = Static203.aFrame3.getInsets();
				Static387.aCanvas9.setLocation(Static322.anInt5444 + local80.left, Static486.anInt7950 + local80.top);
			} else {
				Static387.aCanvas9.setLocation(Static322.anInt5444, Static486.anInt7950);
			}
		}
		this.method1509();
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	protected abstract void method1501();

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	protected abstract void method1502();

	@OriginalMember(owner = "client!bda", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static593.aBoolean766 = false;
	}

	@OriginalMember(owner = "client!bda", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
	protected abstract void method1504();

	@OriginalMember(owner = "client!bda", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static203.aFrame3 == null) {
			return Static31.anApplet1 == null || Static31.anApplet1 == this ? super.getParameter(arg0) : Static31.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
	public synchronized void method1505() {
		if (Static387.aCanvas9 != null) {
			Static387.aCanvas9.removeFocusListener(this);
			Static387.aCanvas9.getParent().setBackground(Color.black);
			Static387.aCanvas9.getParent().remove(Static387.aCanvas9);
		}
		@Pc(22) Container local22;
		if (Static376.aFrame4 != null) {
			local22 = Static376.aFrame4;
		} else if (Static203.aFrame3 != null) {
			local22 = Static203.aFrame3;
		} else if (Static31.anApplet1 == null) {
			local22 = Static150.anApplet_Sub1_1;
		} else {
			local22 = Static31.anApplet1;
		}
		local22.setLayout(null);
		Static387.aCanvas9 = new Canvas_Sub1(this);
		local22.add(Static387.aCanvas9);
		Static387.aCanvas9.setSize(Static40.anInt758, Static308.anInt5171);
		Static387.aCanvas9.setVisible(true);
		if (local22 == Static203.aFrame3) {
			@Pc(69) Insets local69 = Static203.aFrame3.getInsets();
			Static387.aCanvas9.setLocation(local69.left + Static322.anInt5444, Static486.anInt7950 + local69.top);
		} else {
			Static387.aCanvas9.setLocation(Static322.anInt5444, Static486.anInt7950);
		}
		Static387.aCanvas9.addFocusListener(this);
		Static387.aCanvas9.requestFocus();
		Static593.aBoolean766 = true;
		Static301.aBoolean389 = true;
		Static249.aBoolean332 = true;
		Static532.aBoolean661 = false;
		Static127.aLong193 = Static158.method2936();
	}

	@OriginalMember(owner = "client!bda", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static150.anApplet_Sub1_1 != this || Static548.aBoolean670) {
			return;
		}
		Static249.aBoolean332 = true;
		if (Static531.aBoolean660 && Static158.method2936() - Static127.aLong193 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || Static308.anInt5172 <= local24.width && Static570.anInt9271 <= local24.height) {
				Static532.aBoolean661 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(B)Z")
	protected final boolean method1507() {
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
				this.method1515("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)Z")
	public final boolean method1508() {
		return Static10.method149("jagmisc");
	}

	@OriginalMember(owner = "client!bda", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static150.anApplet_Sub1_1 == this && !Static548.aBoolean670) {
			Static185.aLong101 = Static158.method2936() + 4000L;
		}
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(I)V")
	protected abstract void method1509();

	@OriginalMember(owner = "client!bda", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static203.aFrame3 == null) {
			return Static31.anApplet1 == null || Static31.anApplet1 == this ? super.getAppletContext() : Static31.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method1510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static150.anApplet_Sub1_1 == null) {
				Static486.anInt7950 = 0;
				Static151.anApplet2 = Static31.anApplet1;
				Static308.anInt5171 = arg0;
				Static570.anInt9271 = arg0;
				Static285.anInt4886 = 622;
				Static322.anInt5444 = 0;
				Static150.anApplet_Sub1_1 = this;
				Static40.anInt758 = arg1;
				Static308.anInt5172 = arg1;
				Static182.aClass258_2 = Static237.aClass258_3 = new Class258(arg3, arg2, 35, Static31.anApplet1 != null);
				@Pc(68) Class39 local68 = Static237.aClass258_3.method5881(this, 1);
				while (local68.anInt894 == 0) {
					Static589.method7892(10L);
				}
			} else {
				Static176.anInt3454++;
				if (Static176.anInt3454 >= 3) {
					this.method1515("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static172.method7826(local81, null);
			this.method1515("crash");
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZ)V")
	private void method1511(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static548.aBoolean670) {
				return;
			}
			Static548.aBoolean670 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static31.anApplet1 != null) {
			Static31.anApplet1.destroy();
		}
		try {
			this.method1502();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean131) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean131 = false;
		}
		Static388.method5741();
		Static392.method5755();
		if (Static387.aCanvas9 != null) {
			try {
				Static387.aCanvas9.removeFocusListener(this);
				Static387.aCanvas9.getParent().remove(Static387.aCanvas9);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static237.aClass258_3 != null) {
			try {
				Static237.aClass258_3.method5882();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1504();
		if (Static203.aFrame3 != null) {
			Static203.aFrame3.setVisible(false);
			Static203.aFrame3.dispose();
			Static203.aFrame3 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(B)Z")
	public final boolean method1512() {
		return Static10.method149("jaclib");
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/String;IIIBZII)V")
	protected final void method1513(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			Static322.anInt5444 = 0;
			Static308.anInt5171 = 768;
			Static570.anInt9271 = 768;
			Static486.anInt7950 = 0;
			Static285.anInt4886 = 622;
			Static150.anApplet_Sub1_1 = this;
			Static40.anInt758 = 1024;
			Static308.anInt5172 = 1024;
			Static151.anApplet2 = null;
			Static203.aFrame3 = new Frame();
			Static203.aFrame3.setTitle("Jagex");
			Static203.aFrame3.setResizable(true);
			Static203.aFrame3.addWindowListener(this);
			Static203.aFrame3.setVisible(true);
			Static203.aFrame3.toFront();
			@Pc(44) Insets local44 = Static203.aFrame3.getInsets();
			Static203.aFrame3.setSize(local44.right + local44.left + Static308.anInt5172, local44.bottom + Static570.anInt9271 - -local44.top);
			Static182.aClass258_2 = Static237.aClass258_3 = new Class258(arg1, arg0, 35, true);
			@Pc(83) Class39 local83 = Static237.aClass258_3.method5881(this, 1);
			while (local83.anInt894 == 0) {
				Static589.method7892(10L);
			}
		} catch (@Pc(96) Exception local96) {
			Static172.method7826(local96, null);
		}
	}

	@OriginalMember(owner = "client!bda", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static593.aBoolean766 = true;
		Static249.aBoolean332 = true;
	}

	@OriginalMember(owner = "client!bda", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static150.anApplet_Sub1_1 == this && !Static548.aBoolean670) {
			Static185.aLong101 = Static158.method2936();
			Static589.method7892(5000L);
			Static182.aClass258_2 = null;
			this.method1511(false);
		}
	}

	@OriginalMember(owner = "client!bda", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static203.aFrame3 == null) {
			return Static31.anApplet1 == null || Static31.anApplet1 == this ? super.getCodeBase() : Static31.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bda", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static203.aFrame3 == null) {
			return Static31.anApplet1 == null || Static31.anApplet1 == this ? super.getDocumentBase() : Static31.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bda", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static150.anApplet_Sub1_1 == this && !Static548.aBoolean670) {
			Static185.aLong101 = 0L;
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public String method1514() {
		return null;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1515(@OriginalArg(1) String arg0) {
		if (this.aBoolean130) {
			return;
		}
		this.aBoolean130 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static600.method2617("loggedout", Static31.anApplet1);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!bda", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!bda", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bda", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static408.aString55 != null) {
				@Pc(10) String local10 = Static408.aString55.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static408.aString56;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method1515("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static408.aString56 == null || Static408.aString56.equals("1.4.2"))) {
					this.method1515("wrongjava");
					return;
				}
			}
			if (Static408.aString56 != null && Static408.aString56.startsWith("1.")) {
				@Pc(70) int local70 = 2;
				@Pc(72) int local72 = 0;
				while (Static408.aString56.length() > local70) {
					@Pc(78) char local78 = Static408.aString56.charAt(local70);
					if (local78 < '0' || local78 > '9') {
						break;
					}
					local70++;
					local72 = local78 + local72 * 10 - 48;
				}
				if (local72 >= 5) {
					Static531.aBoolean660 = true;
				}
			}
			@Pc(108) Applet local108 = Static150.anApplet_Sub1_1;
			if (Static31.anApplet1 != null) {
				local108 = Static31.anApplet1;
			}
			@Pc(114) Method local114 = Static408.aMethod2;
			if (local114 != null) {
				try {
					local114.invoke(local108, Boolean.TRUE);
				} catch (@Pc(128) Throwable local128) {
				}
			}
			Static364.method575();
			Static354.method5253();
			this.method1505();
			this.method1499();
			Static229.aClass228_1 = Static196.method7554();
			while (Static185.aLong101 == 0L || Static185.aLong101 > Static158.method2936()) {
				Static102.anInt2078 = Static229.aClass228_1.method6037(Static461.aLong219);
				for (@Pc(151) int local151 = 0; local151 < Static102.anInt2078; local151++) {
					this.method1498();
				}
				this.method1500();
				Static366.method5365(Static387.aCanvas9, Static237.aClass258_3);
			}
		} catch (@Pc(184) ThreadDeath local184) {
			throw local184;
		} catch (@Pc(187) Throwable local187) {
			Static172.method7826(local187, this.method1514());
			this.method1515("crash");
		} finally {
			@Pc(203) Object local203 = null;
			this.method1511(true);
		}
	}
}
