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
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!hj", name = "providesignlink", descriptor = "(Lclient!qg;)V")
	public static void providesignlink(@OriginalArg(0) Class83 arg0) {
		Static111.aClass83_2 = arg0;
		Static5.aClass83_1 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!hj", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static50.anApplet_Sub1_3 == this && !Static44.aBoolean63) {
			Static33.aLong21 = 0L;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	protected abstract void method585();

	@OriginalMember(owner = "client!hj", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean135 = false;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	private void method587() {
		@Pc(2) long local2 = Static182.method2903();
		@Pc(6) long local6 = Static44.aLongArray3[Static90.anInt2226];
		@Pc(23) boolean local23;
		if (local6 == 0L || local2 <= local6) {
			local23 = false;
		} else {
			local23 = true;
		}
		Static44.aLongArray3[Static90.anInt2226] = local2;
		Static90.anInt2226 = Static90.anInt2226 + 1 & 0x1F;
		synchronized (this) {
			Static157.aBoolean228 = Static104.aBoolean135;
		}
		this.method599();
	}

	@OriginalMember(owner = "client!hj", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static50.anApplet_Sub1_3 == this && !Static44.aBoolean63) {
			Static33.aLong21 = Static182.method2903() + 4000L;
		}
	}

	@OriginalMember(owner = "client!hj", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static177.aFrame1 == null) {
			return Static111.aClass83_2 == null || Static111.aClass83_2.anApplet1 == this ? super.getCodeBase() : Static111.aClass83_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
	private synchronized void method588() {
		@Pc(10) Container local10;
		if (Static177.aFrame1 == null) {
			local10 = Static111.aClass83_2.anApplet1;
		} else {
			local10 = Static177.aFrame1;
		}
		if (Static139.aCanvas1 != null) {
			Static139.aCanvas1.removeFocusListener(this);
			local10.remove(Static139.aCanvas1);
		}
		Static139.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static139.aCanvas1);
		Static139.aCanvas1.setSize(Static197.anInt4442, Static130.anInt3906);
		Static139.aCanvas1.setVisible(true);
		if (Static177.aFrame1 == null) {
			Static139.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(53) Insets local53 = Static177.aFrame1.getInsets();
			Static139.aCanvas1.setLocation(local53.left, local53.top);
		}
		Static139.aCanvas1.addFocusListener(this);
		Static139.aCanvas1.requestFocus();
		Static48.aBoolean70 = true;
		Static102.aLong74 = Static182.method2903();
	}

	@OriginalMember(owner = "client!hj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static50.anApplet_Sub1_3 != this || Static44.aBoolean63) {
			return;
		}
		Static48.aBoolean70 = true;
		if (Static162.aString5 == null || !Static162.aString5.startsWith("1.5") || Static182.method2903() - Static102.aLong74 <= 1000L) {
			return;
		}
		@Pc(28) Rectangle local28 = arg0.getClipBounds();
		@Pc(43) boolean local43;
		if (local28 == null || local28.width >= Static197.anInt4442 && Static130.anInt3906 <= local28.height) {
			local43 = true;
		} else {
			local43 = false;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	protected final void method589(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static197.anInt4442 = 765;
			Static50.anApplet_Sub1_3 = this;
			Static130.anInt3906 = 503;
			Static199.anInt4467 = 500;
			Static177.aFrame1 = new Frame();
			Static177.aFrame1.setTitle("Jagex");
			Static177.aFrame1.setResizable(false);
			Static177.aFrame1.addWindowListener(this);
			Static177.aFrame1.setVisible(true);
			Static177.aFrame1.toFront();
			@Pc(37) Insets local37 = Static177.aFrame1.getInsets();
			Static177.aFrame1.setSize(local37.right + local37.left + 765, local37.bottom + 503 - -local37.top);
			Static5.aClass83_1 = Static111.aClass83_2 = new Class83(true, null, arg0, arg1, 27);
			Static111.aClass83_2.method2618(this, 1);
		} catch (@Pc(75) Exception local75) {
			Static196.method3064(null, local75);
		}
	}

	@OriginalMember(owner = "client!hj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static177.aFrame1 == null) {
			return Static111.aClass83_2 == null || Static111.aClass83_2.anApplet1 == this ? super.getAppletContext() : Static111.aClass83_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	protected abstract void method590();

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V")
	private void method591(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static44.aBoolean63) {
				return;
			}
			Static44.aBoolean63 = true;
		}
		if (Static111.aClass83_2.anApplet1 != null) {
			Static111.aClass83_2.anApplet1.destroy();
		}
		if (Static139.aCanvas1 != null) {
			try {
				Static139.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static177.aFrame1 == null) {
					local35 = Static111.aClass83_2.anApplet1;
				} else {
					local35 = Static177.aFrame1;
				}
				local35.remove(Static139.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method594();
		} catch (@Pc(52) Exception local52) {
		}
		if (Static111.aClass83_2 != null) {
			try {
				Static111.aClass83_2.method2620();
			} catch (@Pc(59) Exception local59) {
			}
		}
		this.method585();
		if (Static177.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(73) Throwable local73) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method592(@OriginalArg(1) String arg0) {
		if (this.aBoolean39) {
			return;
		}
		this.aBoolean39 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!hj", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	private void method593() {
		@Pc(6) long local6 = Static182.method2903();
		@Pc(10) long local10 = Static78.aLongArray5[Static102.anInt2489];
		Static78.aLongArray5[Static102.anInt2489] = local6;
		Static102.anInt2489 = Static102.anInt2489 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(38) int local38 = (int) (local6 - local10);
			Static12.anInt393 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static76.anInt782++ > 50) {
			Static76.anInt782 -= 50;
			Static48.aBoolean70 = true;
			Static139.aCanvas1.setSize(Static197.anInt4442, Static130.anInt3906);
			Static139.aCanvas1.setVisible(true);
			if (Static177.aFrame1 == null) {
				Static139.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(71) Insets local71 = Static177.aFrame1.getInsets();
				Static139.aCanvas1.setLocation(local71.left, local71.top);
			}
		}
		this.method595();
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	protected abstract void method594();

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	protected abstract void method595();

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Z")
	protected final boolean method596() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
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
				this.method592("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!hj", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static177.aFrame1 == null) {
			return Static111.aClass83_2 == null || Static111.aClass83_2.anApplet1 == this ? super.getParameter(arg0) : Static111.aClass83_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static162.aString6 != null) {
				@Pc(10) String local10 = Static162.aString6.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static162.aString5;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method592("wrongjava");
						return;
					}
					Static115.anInt3996 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static162.aString5 == null || Static162.aString5.equals("1.4.2"))) {
					this.method592("wrongjava");
					return;
				}
			}
			if (Static111.aClass83_2.anApplet1 != null) {
				@Pc(69) Method local69 = Static162.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static111.aClass83_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method588();
			Static178.aClass22_1 = Static158.method2566(Static197.anInt4442, Static139.aCanvas1, Static130.anInt3906);
			this.method590();
			Static128.aClass21_1 = Static173.method2810();
			while (Static33.aLong21 == 0L || Static33.aLong21 > Static182.method2903()) {
				Static138.anInt3208 = Static128.aClass21_1.method2630(Static115.anInt3996, Static148.anInt3353);
				for (@Pc(110) int local110 = 0; local110 < Static138.anInt3208; local110++) {
					this.method587();
				}
				this.method593();
				Static134.method2138(Static139.aCanvas1, Static111.aClass83_2);
			}
		} catch (@Pc(143) Exception local143) {
			Static196.method3064(null, local143);
			this.method592("crash");
		}
		this.method591(true);
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(B)V")
	protected abstract void method599();

	@OriginalMember(owner = "client!hj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static104.aBoolean135 = true;
		Static48.aBoolean70 = true;
	}

	@OriginalMember(owner = "client!hj", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static50.anApplet_Sub1_3 == this && !Static44.aBoolean63) {
			Static33.aLong21 = Static182.method2903();
			Static19.method344(5000L);
			Static5.aClass83_1 = null;
			this.method591(false);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIII)V")
	protected final void method600(@OriginalArg(2) int arg0) {
		try {
			if (Static50.anApplet_Sub1_3 == null) {
				Static197.anInt4442 = 765;
				Static50.anApplet_Sub1_3 = this;
				Static130.anInt3906 = 503;
				Static199.anInt4467 = 500;
				if (Static111.aClass83_2 == null) {
					Static5.aClass83_1 = Static111.aClass83_2 = new Class83(false, this, arg0, null, 0);
				}
				Static111.aClass83_2.method2618(this, 1);
			} else {
				Static7.anInt320++;
				if (Static7.anInt320 >= 3) {
					this.method592("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static196.method3064(null, local59);
			this.method592("crash");
		}
	}

	@OriginalMember(owner = "client!hj", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static177.aFrame1 == null) {
			return Static111.aClass83_2 == null || Static111.aClass83_2.anApplet1 == this ? super.getDocumentBase() : Static111.aClass83_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hj", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
