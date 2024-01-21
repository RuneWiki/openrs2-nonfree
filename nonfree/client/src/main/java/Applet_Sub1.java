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

@OriginalClass("client!eb")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!eb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	private void method406() {
		@Pc(12) long local12 = Static146.method2771();
		@Pc(16) long local16 = Static3.aLongArray1[Static172.anInt4637];
		Static3.aLongArray1[Static172.anInt4637] = local12;
		Static172.anInt4637 = Static172.anInt4637 + 1 & 0x1F;
		synchronized (this) {
			Static160.aBoolean195 = Static169.aBoolean206;
		}
		@Pc(49) boolean local49;
		if (local16 == 0L || local12 <= local16) {
			local49 = false;
		} else {
			local49 = true;
		}
		this.method411();
	}

	@OriginalMember(owner = "client!eb", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static59.anApplet_Sub1_2 == this && !Static42.aBoolean54) {
			Static3.aLong5 = Static146.method2771() + 4000L;
		}
	}

	@OriginalMember(owner = "client!eb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static82.aFrame1 == null) {
			return Static162.aClass53_4 == null || Static162.aClass53_4.anApplet1 == this ? super.getDocumentBase() : Static162.aClass53_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Z")
	protected final boolean method407() {
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
				this.method408("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static82.aFrame1 == null) {
			return Static162.aClass53_4 == null || Static162.aClass53_4.anApplet1 == this ? super.getParameter(arg0) : Static162.aClass53_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static169.aBoolean206 = false;
	}

	@OriginalMember(owner = "client!eb", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static82.aFrame1 == null) {
			return Static162.aClass53_4 == null || Static162.aClass53_4.anApplet1 == this ? super.getAppletContext() : Static162.aClass53_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method408(@OriginalArg(0) String arg0) {
		if (this.aBoolean23) {
			return;
		}
		this.aBoolean23 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIB)V")
	protected final void method409(@OriginalArg(2) int arg0) {
		try {
			if (Static59.anApplet_Sub1_2 == null) {
				Static101.anInt3026 = 503;
				Static152.anInt4190 = 765;
				Static172.anInt4635 = 474;
				Static59.anApplet_Sub1_2 = this;
				if (Static162.aClass53_4 == null) {
					Static97.aClass53_2 = Static162.aClass53_4 = new Class53(false, this, arg0, null, 0);
				}
				Static162.aClass53_4.method2271(this, 1);
			} else {
				Static2.anInt100++;
				if (Static2.anInt100 >= 3) {
					this.method408("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static15.method266(null, local61);
			this.method408("crash");
		}
	}

	@OriginalMember(owner = "client!eb", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static82.aFrame1 == null) {
			return Static162.aClass53_4 == null || Static162.aClass53_4.anApplet1 == this ? super.getCodeBase() : Static162.aClass53_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static112.aString5 != null) {
				@Pc(10) String local10 = Static112.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static112.aString4;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method408("wrongjava");
						return;
					}
					Static174.anInt4685 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static112.aString4 == null || Static112.aString4.equals("1.4.2"))) {
					this.method408("wrongjava");
					return;
				}
			}
			if (Static162.aClass53_4.anApplet1 != null) {
				@Pc(68) Method local68 = Static112.aMethod2;
				if (local68 != null) {
					try {
						local68.invoke(Static162.aClass53_4.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method421();
			Static52.aClass17_1 = Static36.method761(Static152.anInt4190, Static101.anInt3026, Static46.aCanvas38);
			this.method410();
			Static168.aClass50_1 = Static60.method1232();
			while (Static3.aLong5 == 0L || Static146.method2771() < Static3.aLong5) {
				Static107.anInt3145 = Static168.aClass50_1.method2979(Static174.anInt4685, Static83.anInt4748);
				for (@Pc(109) int local109 = 0; local109 < Static107.anInt3145; local109++) {
					this.method406();
				}
				this.method422();
				Static177.method3182(Static46.aCanvas38, Static162.aClass53_4);
			}
		} catch (@Pc(140) Exception local140) {
			Static15.method266(null, local140);
			this.method408("crash");
		}
		this.method420();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	protected abstract void method410();

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	protected abstract void method411();

	@OriginalMember(owner = "client!eb", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static59.anApplet_Sub1_2 == this && !Static42.aBoolean54) {
			Static3.aLong5 = 0L;
		}
	}

	@OriginalMember(owner = "client!eb", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;IIIIIB)V")
	protected final void method412(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		try {
			Static152.anInt4190 = 765;
			Static172.anInt4635 = 474;
			Static59.anApplet_Sub1_2 = this;
			Static101.anInt3026 = 503;
			Static82.aFrame1 = new Frame();
			Static82.aFrame1.setTitle("Jagex");
			Static82.aFrame1.setResizable(false);
			Static82.aFrame1.addWindowListener(this);
			Static82.aFrame1.setVisible(true);
			Static82.aFrame1.toFront();
			@Pc(32) Insets local32 = Static82.aFrame1.getInsets();
			Static82.aFrame1.setSize(local32.right + local32.left + 765, local32.bottom + local32.top + 503);
			Static97.aClass53_2 = Static162.aClass53_4 = new Class53(true, null, arg1, arg0, 16);
			Static162.aClass53_4.method2271(this, 1);
		} catch (@Pc(67) Exception local67) {
			Static15.method266(null, local67);
		}
	}

	@OriginalMember(owner = "client!eb", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static59.anApplet_Sub1_2 == this && !Static42.aBoolean54) {
			Static3.aLong5 = Static146.method2771();
			Static114.method2304(5000L);
			Static97.aClass53_2 = null;
			this.method420();
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	protected abstract void method415();

	@OriginalMember(owner = "client!eb", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
	protected abstract void method417();

	@OriginalMember(owner = "client!eb", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static59.anApplet_Sub1_2 != this || Static42.aBoolean54) {
			return;
		}
		Static10.aBoolean10 = true;
		if (Static112.aString4 != null && Static112.aString4.startsWith("1.5") && Static146.method2771() - Static109.aLong97 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || Static152.anInt4190 <= local28.width && local28.height >= Static101.anInt3026) {
				Static132.aBoolean162 = true;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static169.aBoolean206 = true;
		Static10.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!eb", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	protected abstract void method419();

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
	private synchronized void method420() {
		if (Static42.aBoolean54) {
			return;
		}
		Static42.aBoolean54 = true;
		try {
			Static46.aCanvas38.removeFocusListener(this);
		} catch (@Pc(16) Exception local16) {
		}
		try {
			this.method419();
		} catch (@Pc(21) Exception local21) {
		}
		if (Static82.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		if (Static162.aClass53_4 != null) {
			try {
				Static162.aClass53_4.method2277();
			} catch (@Pc(35) Exception local35) {
			}
		}
		this.method417();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	protected final synchronized void method421() {
		@Pc(5) Container local5;
		if (Static82.aFrame1 == null) {
			local5 = Static162.aClass53_4.anApplet1;
		} else {
			local5 = Static82.aFrame1;
		}
		if (Static46.aCanvas38 != null) {
			Static46.aCanvas38.removeFocusListener(this);
			local5.remove(Static46.aCanvas38);
		}
		Static46.aCanvas38 = new Canvas_Sub1(this);
		local5.add(Static46.aCanvas38);
		Static46.aCanvas38.setSize(Static152.anInt4190, Static101.anInt3026);
		Static46.aCanvas38.setVisible(true);
		if (Static82.aFrame1 == null) {
			Static46.aCanvas38.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static82.aFrame1.getInsets();
			Static46.aCanvas38.setLocation(local43.left, local43.top);
		}
		Static46.aCanvas38.addFocusListener(this);
		Static46.aCanvas38.requestFocus();
		Static10.aBoolean10 = true;
		Static132.aBoolean162 = false;
		Static109.aLong97 = Static146.method2771();
	}

	@OriginalMember(owner = "client!eb", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V")
	private void method422() {
		@Pc(3) long local3 = Static21.aLongArray2[Static135.anInt3817];
		@Pc(16) long local16 = Static146.method2771();
		Static21.aLongArray2[Static135.anInt3817] = local16;
		Static135.anInt3817 = Static135.anInt3817 + 1 & 0x1F;
		if (local3 != 0L && local3 < local16) {
			@Pc(42) int local42 = (int) (local16 - local3);
			Static35.anInt673 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static4.anInt151++ > 50) {
			Static10.aBoolean10 = true;
			Static4.anInt151 -= 50;
			Static46.aCanvas38.setSize(Static152.anInt4190, Static101.anInt3026);
			Static46.aCanvas38.setVisible(true);
			if (Static82.aFrame1 == null) {
				Static46.aCanvas38.setLocation(0, 0);
			} else {
				@Pc(83) Insets local83 = Static82.aFrame1.getInsets();
				Static46.aCanvas38.setLocation(local83.left, local83.top);
			}
		}
		this.method415();
	}
}
