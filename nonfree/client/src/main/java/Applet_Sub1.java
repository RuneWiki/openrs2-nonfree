import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!oc", name = "A", descriptor = "Z")
	private boolean aBoolean21 = false;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	protected abstract void method357();

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	private void method358() {
		@Pc(1) long local1 = System.currentTimeMillis();
		@Pc(9) long local9 = Static35.aLongArray8[Static78.anInt2155];
		Static35.aLongArray8[Static78.anInt2155] = local1;
		if (local9 != 0L && local9 < local1) {
			@Pc(31) int local31 = (int) (local1 - local9);
			Static27.anInt814 = ((local31 >> 1) + 32000) / local31;
		}
		Static78.anInt2155 = Static78.anInt2155 + 1 & 0x1F;
		if (Static68.anInt1995++ > 50) {
			Static68.anInt1995 -= 50;
			Static5.aBoolean2 = true;
			Static7.aCanvas1.setSize(Static21.anInt2665, Static27.anInt812);
			Static7.aCanvas1.setVisible(true);
			if (Static72.aFrame1 == null) {
				Static7.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static72.aFrame1.getInsets();
				Static7.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method369();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method359(@OriginalArg(0) String arg0) {
		if (this.aBoolean21) {
			return;
		}
		this.aBoolean21 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!oc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static49.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!oc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!oc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static62.anApplet_Sub1_1 == this && !Static99.aBoolean125) {
			Static27.aLong19 = 0L;
		}
	}

	@OriginalMember(owner = "client!oc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static72.aFrame1 == null) {
			return Static61.aClass12_3 == null || Static61.aClass12_3.anApplet1 == this ? super.getDocumentBase() : Static61.aClass12_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
	protected final void method361(@OriginalArg(2) int arg0) {
		try {
			if (Static62.anApplet_Sub1_1 == null) {
				Static16.anInt471 = 418;
				Static62.anApplet_Sub1_1 = this;
				Static27.anInt812 = 503;
				Static21.anInt2665 = 765;
				if (Static61.aClass12_3 == null) {
					Static20.aClass12_2 = Static61.aClass12_3 = new Class12(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static61.aClass12_3.method324(this, 1);
			} else {
				this.method359("alreadyloaded");
			}
		} catch (@Pc(47) Exception local47) {
			Static108.method2075(local47, null);
			this.method359("crash");
		}
	}

	@OriginalMember(owner = "client!oc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	private void method362() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Static9.aLongArray2[Static42.anInt1204];
		@Pc(28) boolean local28;
		if (local9 == 0L || local9 >= local5) {
			local28 = false;
		} else {
			local28 = true;
		}
		Static9.aLongArray2[Static42.anInt1204] = local5;
		Static42.anInt1204 = Static42.anInt1204 + 1 & 0x1F;
		synchronized (this) {
			Static87.aBoolean104 = Static49.aBoolean71;
		}
		this.method357();
	}

	@OriginalMember(owner = "client!oc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static72.aFrame1 == null) {
			return Static61.aClass12_3 == null || Static61.aClass12_3.anApplet1 == this ? super.getParameter(arg0) : Static61.aClass12_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	protected abstract void method364();

	@OriginalMember(owner = "client!oc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static72.aFrame1 == null) {
			return Static61.aClass12_3 == null || Static61.aClass12_3.anApplet1 == this ? super.getAppletContext() : Static61.aClass12_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static72.aFrame1 == null) {
			return Static61.aClass12_3 == null || Static61.aClass12_3.anApplet1 == this ? super.getCodeBase() : Static61.aClass12_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	private synchronized void method366() {
		if (Static99.aBoolean125) {
			return;
		}
		Static99.aBoolean125 = true;
		try {
			Static7.aCanvas1.removeFocusListener(this);
		} catch (@Pc(17) Exception local17) {
		}
		try {
			this.method371();
		} catch (@Pc(22) Exception local22) {
		}
		if (Static72.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		if (Static61.aClass12_3 != null) {
			try {
				Static61.aClass12_3.method326();
			} catch (@Pc(36) Exception local36) {
			}
		}
		this.method373();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;IILjava/net/InetAddress;IIBI)V")
	protected final void method367(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) InetAddress arg2) {
		try {
			Static21.anInt2665 = 765;
			Static27.anInt812 = 503;
			Static16.anInt471 = 418;
			Static62.anApplet_Sub1_1 = this;
			Static72.aFrame1 = new Frame();
			Static72.aFrame1.setTitle("Jagex");
			Static72.aFrame1.setResizable(false);
			Static72.aFrame1.addWindowListener(this);
			Static72.aFrame1.setVisible(true);
			Static72.aFrame1.toFront();
			@Pc(33) Insets local33 = Static72.aFrame1.getInsets();
			Static72.aFrame1.setSize(local33.left + local33.right + 765, local33.top + 503 + local33.bottom);
			Static20.aClass12_2 = Static61.aClass12_3 = new Class12(true, null, arg2, arg1, arg0, 12);
			Static61.aClass12_3.method324(this, 1);
		} catch (@Pc(70) Exception local70) {
			Static108.method2075(local70, null);
		}
	}

	@OriginalMember(owner = "client!oc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static14.aString6 != null) {
				@Pc(10) String local10 = Static14.aString6.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static14.aString1;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method359("wrongjava");
						return;
					}
					Static69.anInt2013 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static14.aString1 == null || Static14.aString1.equals("1.4.2"))) {
					this.method359("wrongjava");
					return;
				}
			}
			this.method375();
			Static17.aClass51_11 = Static72.method1484(Static21.anInt2665, Static27.anInt812, Static7.aCanvas1);
			this.method364();
			Static95.aClass9_1 = Static37.method804();
			Static95.aClass9_1.method811();
			while (Static27.aLong19 == 0L || Static27.aLong19 > System.currentTimeMillis()) {
				Static20.anInt578 = Static95.aClass9_1.method812(Static69.anInt2013, Static1.anInt5);
				for (@Pc(91) int local91 = 0; local91 < Static20.anInt578; local91++) {
					this.method362();
				}
				this.method358();
			}
		} catch (@Pc(117) Exception local117) {
			Static108.method2075(local117, null);
			this.method359("crash");
		}
		this.method366();
	}

	@OriginalMember(owner = "client!oc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static62.anApplet_Sub1_1 == this && !Static99.aBoolean125) {
			Static27.aLong19 = System.currentTimeMillis();
			Static51.method1782(5000L);
			Static20.aClass12_2 = null;
			this.method366();
		}
	}

	@OriginalMember(owner = "client!oc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static62.anApplet_Sub1_1 != this || Static99.aBoolean125) {
			return;
		}
		Static5.aBoolean2 = true;
		if (Static14.aString1 == null || !Static14.aString1.startsWith("1.5") || System.currentTimeMillis() - Static50.aLong37 <= 1000L) {
			return;
		}
		@Pc(27) Rectangle local27 = arg0.getClipBounds();
		if (local27 == null) {
			System.out.println("Rect: null");
		} else {
			System.out.println("Rect: " + local27.x + "," + local27.y + "," + local27.width + "," + local27.height);
		}
		if (local27 == null || local27.width >= Static21.anInt2665 && Static27.anInt812 <= local27.height) {
			Static18.aBoolean24 = true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	protected abstract void method369();

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	protected abstract void method371();

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Z")
	protected final boolean method372() {
		@Pc(4) String local4 = this.getDocumentBase().getHost().toLowerCase();
		if (local4.endsWith("jagex.com")) {
			return true;
		} else if (local4.endsWith("runescape.com")) {
			return true;
		} else if (local4.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local4.length() > 0 && local4.charAt(local4.length() - 1) >= '0' && local4.charAt(local4.length() - 1) <= '9') {
				local4 = local4.substring(0, local4.length() - 1);
			}
			if (local4.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method359("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static62.anApplet_Sub1_1 == this && !Static99.aBoolean125) {
			Static27.aLong19 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!oc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static49.aBoolean71 = true;
		Static5.aBoolean2 = true;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	protected abstract void method373();

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	protected final synchronized void method375() {
		System.out.println("addcanvas");
		@Pc(18) Container local18;
		if (Static72.aFrame1 == null) {
			local18 = Static61.aClass12_3.anApplet1;
		} else {
			local18 = Static72.aFrame1;
		}
		if (Static7.aCanvas1 != null) {
			Static7.aCanvas1.removeFocusListener(this);
			local18.remove(Static7.aCanvas1);
		}
		Static7.aCanvas1 = new Canvas_Sub1(this);
		local18.add(Static7.aCanvas1);
		Static7.aCanvas1.setSize(Static21.anInt2665, Static27.anInt812);
		Static7.aCanvas1.setVisible(true);
		if (Static72.aFrame1 == null) {
			Static7.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(57) Insets local57 = Static72.aFrame1.getInsets();
			Static7.aCanvas1.setLocation(local57.left, local57.top);
		}
		Static7.aCanvas1.addFocusListener(this);
		Static7.aCanvas1.requestFocus();
		Static5.aBoolean2 = true;
		Static18.aBoolean24 = false;
		Static50.aLong37 = System.currentTimeMillis();
	}
}
