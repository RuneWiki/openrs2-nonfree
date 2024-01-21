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
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!ce", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	protected abstract void method487();

	@OriginalMember(owner = "client!ce", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static91.anApplet_Sub1_1 == this && !Static79.aBoolean107) {
			Static89.aLong86 = Static1.method3() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ce", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static91.anApplet_Sub1_1 == this && !Static79.aBoolean107) {
			Static89.aLong86 = Static1.method3();
			Static58.method1193(5000L);
			Static13.aClass20_2 = null;
			this.method507();
		}
	}

	@OriginalMember(owner = "client!ce", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static91.anApplet_Sub1_1 != this || Static79.aBoolean107) {
			return;
		}
		Static52.aBoolean74 = true;
		if (Static25.aString1 != null && Static25.aString1.startsWith("1.5") && Static1.method3() - Static49.aLong58 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static88.anInt3261 && Static9.anInt419 <= local28.height) {
				Static99.aBoolean132 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	private void method489() {
		@Pc(11) long local11 = Static1.method3();
		@Pc(15) long local15 = Static28.aLongArray2[Static78.anInt2247];
		Static28.aLongArray2[Static78.anInt2247] = local11;
		Static78.anInt2247 = Static78.anInt2247 + 1 & 0x1F;
		synchronized (this) {
			Static57.aBoolean78 = Static57.aBoolean77;
		}
		@Pc(52) boolean local52;
		if (local15 == 0L || local15 >= local11) {
			local52 = false;
		} else {
			local52 = true;
		}
		this.method487();
	}

	@OriginalMember(owner = "client!ce", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static13.aFrame2 == null) {
			return Static102.aClass20_4 == null || Static102.aClass20_4.anApplet1 == this ? super.getDocumentBase() : Static102.aClass20_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIBI)V")
	protected final void method490(@OriginalArg(1) int arg0) {
		try {
			if (Static91.anApplet_Sub1_1 == null) {
				Static46.anInt3209 = 439;
				Static9.anInt419 = 503;
				Static88.anInt3261 = 765;
				Static91.anApplet_Sub1_1 = this;
				if (Static102.aClass20_4 == null) {
					Static13.aClass20_2 = Static102.aClass20_4 = new Class20(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static102.aClass20_4.method728(1, this);
			} else {
				this.method506("alreadyloaded");
			}
		} catch (@Pc(51) Exception local51) {
			Static15.method544(null, local51);
			this.method506("crash");
		}
	}

	@OriginalMember(owner = "client!ce", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	protected final synchronized void method492() {
		@Pc(10) Container local10;
		if (Static13.aFrame2 == null) {
			local10 = Static102.aClass20_4.anApplet1;
		} else {
			local10 = Static13.aFrame2;
		}
		if (Static32.aCanvas1 != null) {
			Static32.aCanvas1.removeFocusListener(this);
			local10.remove(Static32.aCanvas1);
		}
		Static32.aCanvas1 = new Canvas_Sub1(this);
		local10.add(Static32.aCanvas1);
		Static32.aCanvas1.setSize(Static88.anInt3261, Static9.anInt419);
		Static32.aCanvas1.setVisible(true);
		if (Static13.aFrame2 == null) {
			Static32.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static13.aFrame2.getInsets();
			Static32.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static32.aCanvas1.addFocusListener(this);
		Static32.aCanvas1.requestFocus();
		Static52.aBoolean74 = true;
		Static99.aBoolean132 = false;
		Static49.aLong58 = Static1.method3();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	protected abstract void method493();

	@OriginalMember(owner = "client!ce", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static25.aString4 != null) {
				@Pc(10) String local10 = Static25.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static25.aString1;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method506("wrongjava");
						return;
					}
					Static78.anInt2243 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static25.aString1 == null || Static25.aString1.equals("1.4.2"))) {
					this.method506("wrongjava");
					return;
				}
			}
			if (Static102.aClass20_4.anApplet1 != null) {
				@Pc(68) Method local68 = Static25.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static102.aClass20_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method492();
			Static33.aClass21_9 = Static68.method1376(Static9.anInt419, Static88.anInt3261, Static32.aCanvas1);
			this.method498();
			Static8.aClass19_1 = Static95.method1835();
			Static8.aClass19_1.method1168();
			while (Static89.aLong86 == 0L || Static1.method3() < Static89.aLong86) {
				Static64.anInt1916 = Static8.aClass19_1.method1163(Static106.anInt2343, Static78.anInt2243);
				for (@Pc(112) int local112 = 0; local112 < Static64.anInt1916; local112++) {
					this.method489();
				}
				this.method509();
			}
		} catch (@Pc(141) Exception local141) {
			Static15.method544(null, local141);
			this.method506("crash");
		}
		this.method507();
	}

	@OriginalMember(owner = "client!ce", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static13.aFrame2 == null) {
			return Static102.aClass20_4 == null || Static102.aClass20_4.anApplet1 == this ? super.getParameter(arg0) : Static102.aClass20_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/net/InetAddress;IIILjava/lang/String;II)V")
	protected final void method495(@OriginalArg(1) InetAddress arg0, @OriginalArg(4) int arg1, @OriginalArg(5) String arg2) {
		try {
			Static91.anApplet_Sub1_1 = this;
			Static88.anInt3261 = 765;
			Static9.anInt419 = 503;
			Static46.anInt3209 = 439;
			Static13.aFrame2 = new Frame();
			Static13.aFrame2.setTitle("Jagex");
			Static13.aFrame2.setResizable(false);
			Static13.aFrame2.addWindowListener(this);
			Static13.aFrame2.setVisible(true);
			Static13.aFrame2.toFront();
			@Pc(37) Insets local37 = Static13.aFrame2.getInsets();
			Static13.aFrame2.setSize(local37.right + local37.left + 765, local37.top - -local37.bottom + 503);
			Static13.aClass20_2 = Static102.aClass20_4 = new Class20(true, null, arg0, arg1, arg2, 13);
			Static102.aClass20_4.method728(1, this);
		} catch (@Pc(77) Exception local77) {
			Static15.method544(null, local77);
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Z")
	protected final boolean method496() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.endsWith("jagex.com")) {
			return true;
		} else if (local8.endsWith("runescape.com")) {
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
				this.method506("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)V")
	protected abstract void method498();

	@OriginalMember(owner = "client!ce", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static57.aBoolean77 = true;
		Static52.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!ce", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static13.aFrame2 == null) {
			return Static102.aClass20_4 == null || Static102.aClass20_4.anApplet1 == this ? super.getAppletContext() : Static102.aClass20_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static57.aBoolean77 = false;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(Z)V")
	protected abstract void method504();

	@OriginalMember(owner = "client!ce", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static13.aFrame2 == null) {
			return Static102.aClass20_4 == null || Static102.aClass20_4.anApplet1 == this ? super.getCodeBase() : Static102.aClass20_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static91.anApplet_Sub1_1 == this && !Static79.aBoolean107) {
			Static89.aLong86 = 0L;
		}
	}

	@OriginalMember(owner = "client!ce", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method506(@OriginalArg(1) String arg0) {
		if (this.aBoolean34) {
			return;
		}
		this.aBoolean34 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ce", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V")
	private synchronized void method507() {
		if (Static79.aBoolean107) {
			return;
		}
		Static79.aBoolean107 = true;
		try {
			Static32.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method508();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static13.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static102.aClass20_4 != null) {
			try {
				Static102.aClass20_4.method729();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method493();
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
	protected abstract void method508();

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)V")
	private void method509() {
		@Pc(11) long local11 = Static1.method3();
		@Pc(15) long local15 = Static49.aLongArray4[Static26.anInt2138];
		Static49.aLongArray4[Static26.anInt2138] = local11;
		Static26.anInt2138 = Static26.anInt2138 + 1 & 0x1F;
		if (local15 != 0L && local11 > local15) {
			@Pc(41) int local41 = (int) (local11 - local15);
			Static20.anInt949 = ((local41 >> 1) + 32000) / local41;
		}
		if (Static98.anInt2837++ > 50) {
			Static52.aBoolean74 = true;
			Static98.anInt2837 -= 50;
			Static32.aCanvas1.setSize(Static88.anInt3261, Static9.anInt419);
			Static32.aCanvas1.setVisible(true);
			if (Static13.aFrame2 == null) {
				Static32.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(76) Insets local76 = Static13.aFrame2.getInsets();
				Static32.aCanvas1.setLocation(local76.left, local76.top);
			}
		}
		this.method504();
	}
}
