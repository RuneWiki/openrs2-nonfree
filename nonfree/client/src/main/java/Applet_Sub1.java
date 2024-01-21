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

@OriginalClass("client!qd")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!qd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static47.aString8 != null) {
				@Pc(10) String local10 = Static47.aString8.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static47.aString4;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method351("wrongjava");
						return;
					}
					Static69.anInt1905 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static47.aString4 == null || Static47.aString4.equals("1.4.2"))) {
					this.method351("wrongjava");
					return;
				}
			}
			this.method355();
			Static38.aClass9_22 = Static63.method1509(Static44.aCanvas1, Static24.anInt765, Static39.anInt1166);
			this.method350();
			Static109.aClass2_1 = Static99.method1657();
			Static109.aClass2_1.method1327();
			while (Static85.aLong69 == 0L || Static85.aLong69 > System.currentTimeMillis()) {
				Static6.anInt209 = Static109.aClass2_1.method1324(Static33.anInt1086, Static69.anInt1905);
				for (@Pc(92) int local92 = 0; local92 < Static6.anInt209; local92++) {
					this.method360();
				}
				this.method361();
			}
		} catch (@Pc(120) Exception local120) {
			Static72.method1184(null, local120);
			this.method351("crash");
		}
		this.method348();
	}

	@OriginalMember(owner = "client!qd", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static23.aFrame1 == null) {
			return Static2.aClass35_1 == null || Static2.aClass35_1.anApplet1 == this ? super.getParameter(arg0) : Static2.aClass35_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	protected abstract void method346();

	@OriginalMember(owner = "client!qd", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static23.aFrame1 == null) {
			return Static2.aClass35_1 == null || Static2.aClass35_1.anApplet1 == this ? super.getDocumentBase() : Static2.aClass35_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static23.aFrame1 == null) {
			return Static2.aClass35_1 == null || Static2.aClass35_1.anApplet1 == this ? super.getAppletContext() : Static2.aClass35_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	protected abstract void method347();

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	private synchronized void method348() {
		if (Static80.aBoolean128) {
			return;
		}
		Static80.aBoolean128 = true;
		try {
			Static44.aCanvas1.removeFocusListener(this);
		} catch (@Pc(13) Exception local13) {
		}
		try {
			this.method346();
		} catch (@Pc(18) Exception local18) {
		}
		if (Static23.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(24) Throwable local24) {
			}
		}
		if (Static2.aClass35_1 != null) {
			try {
				Static2.aClass35_1.method775();
			} catch (@Pc(36) Exception local36) {
			}
		}
		this.method357();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	protected abstract void method350();

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method351(@OriginalArg(1) String arg0) {
		if (this.aBoolean22) {
			return;
		}
		this.aBoolean22 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!qd", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static5.anApplet_Sub1_1 == this && !Static80.aBoolean128) {
			Static85.aLong69 = 0L;
		}
	}

	@OriginalMember(owner = "client!qd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static5.anApplet_Sub1_1 != this || Static80.aBoolean128) {
			return;
		}
		Static69.aBoolean112 = true;
		if (Static47.aString4 == null || !Static47.aString4.startsWith("1.5") || System.currentTimeMillis() - Static40.aLong34 <= 1000L) {
			return;
		}
		@Pc(29) Rectangle local29 = arg0.getClipBounds();
		if (local29 == null) {
			System.out.println("Rect: null");
		} else {
			System.out.println("Rect: " + local29.x + "," + local29.y + "," + local29.width + "," + local29.height);
		}
		if (local29 == null || Static39.anInt1166 <= local29.width && Static24.anInt765 <= local29.height) {
			Static4.aBoolean8 = true;
		}
	}

	@OriginalMember(owner = "client!qd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static29.aBoolean48 = true;
		Static69.aBoolean112 = true;
	}

	@OriginalMember(owner = "client!qd", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
	protected final void method353(@OriginalArg(3) int arg0) {
		try {
			if (Static5.anApplet_Sub1_1 == null) {
				Static5.anApplet_Sub1_1 = this;
				Static71.anInt1942 = 417;
				Static24.anInt765 = 503;
				Static39.anInt1166 = 765;
				if (Static2.aClass35_1 == null) {
					Static69.aClass35_3 = Static2.aClass35_1 = new Class35(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static2.aClass35_1.method770(1, this);
			} else {
				this.method351("alreadyloaded");
			}
		} catch (@Pc(47) Exception local47) {
			Static72.method1184(null, local47);
			this.method351("crash");
		}
	}

	@OriginalMember(owner = "client!qd", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qd", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static5.anApplet_Sub1_1 == this && !Static80.aBoolean128) {
			Static85.aLong69 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;IBLjava/net/InetAddress;IIII)V")
	protected final void method354(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) InetAddress arg2) {
		try {
			Static39.anInt1166 = 765;
			Static24.anInt765 = 503;
			Static71.anInt1942 = 417;
			Static5.anApplet_Sub1_1 = this;
			Static23.aFrame1 = new Frame();
			Static23.aFrame1.setTitle("Jagex");
			Static23.aFrame1.setResizable(false);
			Static23.aFrame1.addWindowListener(this);
			Static23.aFrame1.setVisible(true);
			Static23.aFrame1.toFront();
			@Pc(33) Insets local33 = Static23.aFrame1.getInsets();
			Static23.aFrame1.setSize(local33.left + local33.right + 765, local33.top + 503 + local33.bottom);
			Static69.aClass35_3 = Static2.aClass35_1 = new Class35(true, null, arg2, arg1, arg0, 12);
			Static2.aClass35_1.method770(1, this);
		} catch (@Pc(70) Exception local70) {
			Static72.method1184(null, local70);
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	protected final synchronized void method355() {
		System.out.println("addcanvas");
		@Pc(16) Container local16;
		if (Static23.aFrame1 == null) {
			local16 = Static2.aClass35_1.anApplet1;
		} else {
			local16 = Static23.aFrame1;
		}
		if (Static44.aCanvas1 != null) {
			Static44.aCanvas1.removeFocusListener(this);
			local16.remove(Static44.aCanvas1);
		}
		Static44.aCanvas1 = new Canvas_Sub1(this);
		local16.add(Static44.aCanvas1);
		Static44.aCanvas1.setSize(Static39.anInt1166, Static24.anInt765);
		Static44.aCanvas1.setVisible(true);
		if (Static23.aFrame1 == null) {
			Static44.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(50) Insets local50 = Static23.aFrame1.getInsets();
			Static44.aCanvas1.setLocation(local50.left, local50.top);
		}
		Static44.aCanvas1.addFocusListener(this);
		Static44.aCanvas1.requestFocus();
		Static69.aBoolean112 = true;
		Static4.aBoolean8 = false;
		Static40.aLong34 = System.currentTimeMillis();
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	protected abstract void method356();

	@OriginalMember(owner = "client!qd", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static29.aBoolean48 = false;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	protected abstract void method357();

	@OriginalMember(owner = "client!qd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Z")
	protected final boolean method358() {
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
				this.method351("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
	private void method360() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Static58.aLongArray18[Static7.anInt213];
		@Pc(22) boolean local22;
		if (local9 == 0L || local9 >= local5) {
			local22 = false;
		} else {
			local22 = true;
		}
		Static58.aLongArray18[Static7.anInt213] = local5;
		Static7.anInt213 = Static7.anInt213 + 1 & 0x1F;
		synchronized (this) {
			Static45.aBoolean75 = Static29.aBoolean48;
		}
		this.method347();
	}

	@OriginalMember(owner = "client!qd", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static23.aFrame1 == null) {
			return Static2.aClass35_1 == null || Static2.aClass35_1.anApplet1 == this ? super.getCodeBase() : Static2.aClass35_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
	private void method361() {
		@Pc(7) long local7 = Static63.aLongArray30[Static8.anInt282];
		@Pc(9) long local9 = System.currentTimeMillis();
		Static63.aLongArray30[Static8.anInt282] = local9;
		if (local7 != 0L && local9 > local7) {
			@Pc(31) int local31 = (int) (local9 - local7);
			Static100.anInt2469 = ((local31 >> 1) + 32000) / local31;
		}
		Static8.anInt282 = Static8.anInt282 + 1 & 0x1F;
		if (Static64.anInt1756++ > 50) {
			Static69.aBoolean112 = true;
			Static64.anInt1756 -= 50;
			Static44.aCanvas1.setSize(Static39.anInt1166, Static24.anInt765);
			Static44.aCanvas1.setVisible(true);
			if (Static23.aFrame1 == null) {
				Static44.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(73) Insets local73 = Static23.aFrame1.getInsets();
				Static44.aCanvas1.setLocation(local73.left, local73.top);
			}
		}
		this.method356();
	}

	@OriginalMember(owner = "client!qd", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static5.anApplet_Sub1_1 == this && !Static80.aBoolean128) {
			Static85.aLong69 = System.currentTimeMillis();
			Static24.method505(5000L);
			Static69.aClass35_3 = null;
			this.method348();
		}
	}
}
