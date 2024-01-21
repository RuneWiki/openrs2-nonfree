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

@OriginalClass("client!vc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!vc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	private synchronized void method462() {
		if (Static8.aBoolean18) {
			return;
		}
		Static8.aBoolean18 = true;
		try {
			Static91.aCanvas1.removeFocusListener(this);
		} catch (@Pc(17) Exception local17) {
		}
		try {
			this.method471();
		} catch (@Pc(22) Exception local22) {
		}
		if (Static174.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		if (Static29.aClass74_2 != null) {
			try {
				Static29.aClass74_2.method2483();
			} catch (@Pc(36) Exception local36) {
			}
		}
		this.method480();
	}

	@OriginalMember(owner = "client!vc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static181.anApplet_Sub1_1 == this && !Static8.aBoolean18) {
			Static35.aLong30 = Static47.method763() + 4000L;
		}
	}

	@OriginalMember(owner = "client!vc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static174.aFrame1 == null) {
			return Static29.aClass74_2 == null || Static29.aClass74_2.anApplet1 == this ? super.getCodeBase() : Static29.aClass74_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static174.aFrame1 == null) {
			return Static29.aClass74_2 == null || Static29.aClass74_2.anApplet1 == this ? super.getParameter(arg0) : Static29.aClass74_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	protected abstract void method466();

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	private void method467() {
		@Pc(7) long local7 = Static53.aLongArray3[Static166.anInt4087];
		@Pc(10) long local10 = Static47.method763();
		Static53.aLongArray3[Static166.anInt4087] = local10;
		@Pc(29) boolean local29;
		if (local7 == 0L || local10 <= local7) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static166.anInt4087 = Static166.anInt4087 + 1 & 0x1F;
		synchronized (this) {
			Static108.aBoolean94 = Static24.aBoolean36;
		}
		this.method476();
	}

	@OriginalMember(owner = "client!vc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static181.anApplet_Sub1_1 == this && !Static8.aBoolean18) {
			Static35.aLong30 = Static47.method763();
			Static35.method583(5000L);
			Static26.aClass74_1 = null;
			this.method462();
		}
	}

	@OriginalMember(owner = "client!vc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static143.aString3 != null) {
				@Pc(10) String local10 = Static143.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static143.aString2;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method474("wrongjava");
						return;
					}
					Static181.anInt4352 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static143.aString2 == null || Static143.aString2.equals("1.4.2"))) {
					this.method474("wrongjava");
					return;
				}
			}
			if (Static29.aClass74_2.anApplet1 != null) {
				@Pc(71) Method local71 = Static143.aMethod1;
				if (local71 != null) {
					try {
						local71.invoke(Static29.aClass74_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(86) Throwable local86) {
					}
				}
			}
			this.method481();
			Static138.aClass25_1 = Static115.method2045(Static91.aCanvas1, Static114.anInt2943, Static23.anInt699);
			this.method466();
			Static122.aClass7_2 = Static23.method396();
			while (Static35.aLong30 == 0L || Static47.method763() < Static35.aLong30) {
				Static89.anInt2376 = Static122.aClass7_2.method577(Static155.anInt3808, Static181.anInt4352);
				for (@Pc(112) int local112 = 0; local112 < Static89.anInt2376; local112++) {
					this.method467();
				}
				this.method468();
				Static47.method766(Static29.aClass74_2, Static91.aCanvas1);
			}
		} catch (@Pc(147) Exception local147) {
			Static153.method2616(null, local147);
			this.method474("crash");
		}
		this.method462();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	private void method468() {
		@Pc(6) long local6 = Static47.method763();
		@Pc(10) long local10 = Static123.aLongArray6[Static96.anInt2493];
		Static123.aLongArray6[Static96.anInt2493] = local6;
		Static96.anInt2493 = Static96.anInt2493 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(41) int local41 = (int) (local6 - local10);
			Static16.anInt498 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static87.anInt958++ > 50) {
			Static87.anInt958 -= 50;
			Static181.aBoolean217 = true;
			Static91.aCanvas1.setSize(Static23.anInt699, Static114.anInt2943);
			Static91.aCanvas1.setVisible(true);
			if (Static174.aFrame1 == null) {
				Static91.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static174.aFrame1.getInsets();
				Static91.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method478();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;ZIIIII)V")
	protected final void method469(@OriginalArg(0) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static114.anInt2943 = 503;
			Static101.anInt2575 = 478;
			Static181.anApplet_Sub1_1 = this;
			Static23.anInt699 = 765;
			Static174.aFrame1 = new Frame();
			Static174.aFrame1.setTitle("Jagex");
			Static174.aFrame1.setResizable(false);
			Static174.aFrame1.addWindowListener(this);
			Static174.aFrame1.setVisible(true);
			Static174.aFrame1.toFront();
			@Pc(28) Insets local28 = Static174.aFrame1.getInsets();
			Static174.aFrame1.setSize(local28.left + local28.right + 765, local28.top + 503 - -local28.bottom);
			Static26.aClass74_1 = Static29.aClass74_2 = new Class74(true, null, arg1, arg0, 16);
			Static29.aClass74_2.method2484(this, 1);
		} catch (@Pc(64) Exception local64) {
			Static153.method2616(null, local64);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Z")
	protected final boolean method470() {
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
				this.method474("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
	protected abstract void method471();

	@OriginalMember(owner = "client!vc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static24.aBoolean36 = true;
		Static181.aBoolean217 = true;
	}

	@OriginalMember(owner = "client!vc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static174.aFrame1 == null) {
			return Static29.aClass74_2 == null || Static29.aClass74_2.anApplet1 == this ? super.getDocumentBase() : Static29.aClass74_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method474(@OriginalArg(0) String arg0) {
		if (this.aBoolean41) {
			return;
		}
		this.aBoolean41 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!vc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	protected abstract void method476();

	@OriginalMember(owner = "client!vc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static181.anApplet_Sub1_1 == this && !Static8.aBoolean18) {
			Static35.aLong30 = 0L;
		}
	}

	@OriginalMember(owner = "client!vc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static174.aFrame1 == null) {
			return Static29.aClass74_2 == null || Static29.aClass74_2.anApplet1 == this ? super.getAppletContext() : Static29.aClass74_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
	protected abstract void method478();

	@OriginalMember(owner = "client!vc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static24.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!vc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static181.anApplet_Sub1_1 != this || Static8.aBoolean18) {
			return;
		}
		Static181.aBoolean217 = true;
		if (Static143.aString2 != null && Static143.aString2.startsWith("1.5") && Static47.method763() - Static96.aLong78 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static23.anInt699 && local30.height >= Static114.anInt2943) {
				Static62.aBoolean81 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZI)V")
	protected final void method479(@OriginalArg(0) int arg0) {
		try {
			if (Static181.anApplet_Sub1_1 == null) {
				Static23.anInt699 = 765;
				Static181.anApplet_Sub1_1 = this;
				Static101.anInt2575 = 478;
				Static114.anInt2943 = 503;
				if (Static29.aClass74_2 == null) {
					Static26.aClass74_1 = Static29.aClass74_2 = new Class74(false, this, arg0, null, 0);
				}
				Static29.aClass74_2.method2484(this, 1);
			} else {
				Static52.anInt1962++;
				if (Static52.anInt1962 >= 3) {
					this.method474("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(59) Exception local59) {
			Static153.method2616(null, local59);
			this.method474("crash");
		}
	}

	@OriginalMember(owner = "client!vc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)V")
	protected abstract void method480();

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	protected final synchronized void method481() {
		@Pc(16) Container local16;
		if (Static174.aFrame1 == null) {
			local16 = Static29.aClass74_2.anApplet1;
		} else {
			local16 = Static174.aFrame1;
		}
		if (Static91.aCanvas1 != null) {
			Static91.aCanvas1.removeFocusListener(this);
			local16.remove(Static91.aCanvas1);
		}
		Static91.aCanvas1 = new Canvas_Sub1(this);
		local16.add(Static91.aCanvas1);
		Static91.aCanvas1.setSize(Static23.anInt699, Static114.anInt2943);
		Static91.aCanvas1.setVisible(true);
		if (Static174.aFrame1 == null) {
			Static91.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(50) Insets local50 = Static174.aFrame1.getInsets();
			Static91.aCanvas1.setLocation(local50.left, local50.top);
		}
		Static91.aCanvas1.addFocusListener(this);
		Static91.aCanvas1.requestFocus();
		Static181.aBoolean217 = true;
		Static62.aBoolean81 = false;
		Static96.aLong78 = Static47.method763();
	}
}
