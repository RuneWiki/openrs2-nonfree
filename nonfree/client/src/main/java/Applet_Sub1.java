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

@OriginalClass("client!w")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!w", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)Z")
	protected final boolean method788() {
		@Pc(4) String local4 = this.getDocumentBase().getHost().toLowerCase();
		if (local4.equals("jagex.com") || local4.endsWith(".jagex.com")) {
			return true;
		} else if (local4.equals("runescape.com") || local4.endsWith(".runescape.com")) {
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
				this.method790("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static97.aFrame106 == null) {
			return Static163.aClass16_5 == null || Static163.aClass16_5.anApplet1 == this ? super.getAppletContext() : Static163.aClass16_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static36.aString1 != null) {
				@Pc(10) String local10 = Static36.aString1.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static36.aString2;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method790("wrongjava");
						return;
					}
					Static186.anInt4112 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static36.aString2 == null || Static36.aString2.equals("1.4.2"))) {
					this.method790("wrongjava");
					return;
				}
			}
			if (Static163.aClass16_5.anApplet1 != null) {
				@Pc(70) Method local70 = Static36.aMethod2;
				if (local70 != null) {
					try {
						local70.invoke(Static163.aClass16_5.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method802();
			Static85.aClass14_1 = Static142.method2531(Static175.anInt3997, Static49.anInt1605, Static106.aCanvas1);
			this.method803();
			Static185.aClass68_1 = Static55.method1320();
			while (Static83.aLong77 == 0L || Static83.aLong77 > Static169.method2888()) {
				Static69.anInt1978 = Static185.aClass68_1.method2973(Static154.anInt3651, Static186.anInt4112);
				for (@Pc(111) int local111 = 0; local111 < Static69.anInt1978; local111++) {
					this.method804();
				}
				this.method795();
				Static45.method1185(Static163.aClass16_5, Static106.aCanvas1);
			}
		} catch (@Pc(148) Exception local148) {
			Static154.method2661(null, local148);
			this.method790("crash");
		}
		this.method797();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZII)V")
	protected final void method789(@OriginalArg(4) int arg0) {
		try {
			if (Static31.anApplet_Sub1_1 == null) {
				Static49.anInt1605 = 765;
				Static5.anInt150 = 487;
				Static175.anInt3997 = 503;
				Static31.anApplet_Sub1_1 = this;
				if (Static163.aClass16_5 == null) {
					Static182.aClass16_3 = Static163.aClass16_5 = new Class16(false, this, arg0, null, 0);
				}
				Static163.aClass16_5.method982(this, 1);
			} else {
				Static67.anInt1954++;
				if (Static67.anInt1954 >= 3) {
					this.method790("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(60) Exception local60) {
			Static154.method2661(null, local60);
			this.method790("crash");
		}
	}

	@OriginalMember(owner = "client!w", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static31.anApplet_Sub1_1 == this && !Static143.aBoolean273) {
			Static83.aLong77 = Static169.method2888() + 4000L;
		}
	}

	@OriginalMember(owner = "client!w", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method790(@OriginalArg(0) String arg0) {
		if (this.aBoolean60) {
			return;
		}
		this.aBoolean60 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	protected abstract void method792();

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	private void method795() {
		@Pc(12) long local12 = Static169.method2888();
		@Pc(16) long local16 = Static20.aLongArray2[Static169.anInt3955];
		Static20.aLongArray2[Static169.anInt3955] = local12;
		Static169.anInt3955 = Static169.anInt3955 + 1 & 0x1F;
		if (local16 != 0L && local16 < local12) {
			@Pc(46) int local46 = (int) (local12 - local16);
			Static62.anInt2605 = ((local46 >> 1) + 32000) / local46;
		}
		if (Static30.anInt1083++ > 50) {
			Static14.aBoolean44 = true;
			Static30.anInt1083 -= 50;
			Static106.aCanvas1.setSize(Static49.anInt1605, Static175.anInt3997);
			Static106.aCanvas1.setVisible(true);
			if (Static97.aFrame106 == null) {
				Static106.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(85) Insets local85 = Static97.aFrame106.getInsets();
				Static106.aCanvas1.setLocation(local85.left, local85.top);
			}
		}
		this.method798();
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
	protected abstract void method796();

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
	private synchronized void method797() {
		if (Static143.aBoolean273) {
			return;
		}
		Static143.aBoolean273 = true;
		try {
			Static106.aCanvas1.removeFocusListener(this);
		} catch (@Pc(21) Exception local21) {
		}
		try {
			this.method800();
		} catch (@Pc(26) Exception local26) {
		}
		if (Static97.aFrame106 != null) {
			try {
				System.exit(0);
			} catch (@Pc(32) Throwable local32) {
			}
		}
		if (Static163.aClass16_5 != null) {
			try {
				Static163.aClass16_5.method987();
			} catch (@Pc(40) Exception local40) {
			}
		}
		this.method792();
	}

	@OriginalMember(owner = "client!w", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!w", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static97.aFrame106 == null) {
			return Static163.aClass16_5 == null || Static163.aClass16_5.anApplet1 == this ? super.getDocumentBase() : Static163.aClass16_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	protected abstract void method798();

	@OriginalMember(owner = "client!w", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static97.aFrame106 == null) {
			return Static163.aClass16_5 == null || Static163.aClass16_5.anApplet1 == this ? super.getParameter(arg0) : Static163.aClass16_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	protected abstract void method800();

	@OriginalMember(owner = "client!w", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static31.anApplet_Sub1_1 == this && !Static143.aBoolean273) {
			Static83.aLong77 = Static169.method2888();
			Static181.method2982(5000L);
			Static182.aClass16_3 = null;
			this.method797();
		}
	}

	@OriginalMember(owner = "client!w", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!w", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static136.aBoolean260 = false;
	}

	@OriginalMember(owner = "client!w", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static97.aFrame106 == null) {
			return Static163.aClass16_5 == null || Static163.aClass16_5.anApplet1 == this ? super.getCodeBase() : Static163.aClass16_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!w", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static31.anApplet_Sub1_1 != this || Static143.aBoolean273) {
			return;
		}
		Static14.aBoolean44 = true;
		if (Static36.aString2 != null && Static36.aString2.startsWith("1.5") && Static169.method2888() - Static60.aLong62 > 1000L) {
			@Pc(27) Rectangle local27 = arg0.getClipBounds();
			if (local27 == null || local27.width >= Static49.anInt1605 && local27.height >= Static175.anInt3997) {
				Static24.aBoolean57 = true;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	protected final void method801(@OriginalArg(3) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static49.anInt1605 = 765;
			Static31.anApplet_Sub1_1 = this;
			Static175.anInt3997 = 503;
			Static5.anInt150 = 487;
			Static97.aFrame106 = new Frame();
			Static97.aFrame106.setTitle("Jagex");
			Static97.aFrame106.setResizable(false);
			Static97.aFrame106.addWindowListener(this);
			Static97.aFrame106.setVisible(true);
			Static97.aFrame106.toFront();
			@Pc(42) Insets local42 = Static97.aFrame106.getInsets();
			Static97.aFrame106.setSize(local42.left + local42.right + 765, local42.top + 503 + local42.bottom);
			Static182.aClass16_3 = Static163.aClass16_5 = new Class16(true, null, arg1, arg0, 16);
			Static163.aClass16_5.method982(this, 1);
		} catch (@Pc(78) Exception local78) {
			Static154.method2661(null, local78);
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	protected final synchronized void method802() {
		@Pc(9) Container local9;
		if (Static97.aFrame106 == null) {
			local9 = Static163.aClass16_5.anApplet1;
		} else {
			local9 = Static97.aFrame106;
		}
		if (Static106.aCanvas1 != null) {
			Static106.aCanvas1.removeFocusListener(this);
			local9.remove(Static106.aCanvas1);
		}
		Static106.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static106.aCanvas1);
		Static106.aCanvas1.setSize(Static49.anInt1605, Static175.anInt3997);
		Static106.aCanvas1.setVisible(true);
		if (Static97.aFrame106 == null) {
			Static106.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static97.aFrame106.getInsets();
			Static106.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static106.aCanvas1.addFocusListener(this);
		Static106.aCanvas1.requestFocus();
		Static14.aBoolean44 = true;
		Static24.aBoolean57 = false;
		Static60.aLong62 = Static169.method2888();
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)V")
	protected abstract void method803();

	@OriginalMember(owner = "client!w", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!w", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static31.anApplet_Sub1_1 == this && !Static143.aBoolean273) {
			Static83.aLong77 = 0L;
		}
	}

	@OriginalMember(owner = "client!w", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static136.aBoolean260 = true;
		Static14.aBoolean44 = true;
	}

	@OriginalMember(owner = "client!w", name = "i", descriptor = "(I)V")
	private void method804() {
		@Pc(6) long local6 = Static169.method2888();
		@Pc(10) long local10 = Static137.aLongArray7[Static115.anInt3077];
		@Pc(21) boolean local21;
		if (local10 == 0L || local10 >= local6) {
			local21 = false;
		} else {
			local21 = true;
		}
		Static137.aLongArray7[Static115.anInt3077] = local6;
		Static115.anInt3077 = Static115.anInt3077 + 1 & 0x1F;
		synchronized (this) {
			Static42.aBoolean96 = Static136.aBoolean260;
		}
		this.method796();
	}
}
