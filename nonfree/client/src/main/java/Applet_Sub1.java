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

@OriginalClass("client!ga")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ga", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static37.aFrame2 == null) {
			return Static111.aClass29_3 == null || Static111.aClass29_3.anApplet1 == this ? super.getDocumentBase() : Static111.aClass29_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static16.aBoolean21 = false;
	}

	@OriginalMember(owner = "client!ga", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	protected abstract void method453();

	@OriginalMember(owner = "client!ga", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ga", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static61.anApplet_Sub1_1 == this && !Static83.aBoolean96) {
			Static2.aLong65 = Static50.method959();
			Static23.method546(5000L);
			Static42.aClass29_4 = null;
			this.method462();
		}
	}

	@OriginalMember(owner = "client!ga", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	protected abstract void method454();

	@OriginalMember(owner = "client!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static61.anApplet_Sub1_1 != this || Static83.aBoolean96) {
			return;
		}
		Static73.aBoolean87 = true;
		if (Static43.aString1 != null && Static43.aString1.startsWith("1.5") && Static50.method959() - Static89.aLong77 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static19.anInt630 && Static26.anInt1438 <= local30.height) {
				Static54.aBoolean55 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	private void method455() {
		@Pc(3) long local3 = Static112.aLongArray8[Static48.anInt1368];
		@Pc(10) long local10 = Static50.method959();
		@Pc(25) boolean local25;
		if (local3 == 0L || local10 <= local3) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static112.aLongArray8[Static48.anInt1368] = local10;
		Static48.anInt1368 = Static48.anInt1368 + 1 & 0x1F;
		synchronized (this) {
			Static70.aBoolean74 = Static16.aBoolean21;
		}
		this.method464();
	}

	@OriginalMember(owner = "client!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static43.aString2 != null) {
				@Pc(10) String local10 = Static43.aString2.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(23) String local23 = Static43.aString1;
					if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
						this.method473("wrongjava");
						return;
					}
					Static93.anInt2253 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static43.aString1 == null || Static43.aString1.equals("1.4.2"))) {
					this.method473("wrongjava");
					return;
				}
			}
			if (Static111.aClass29_3.anApplet1 != null) {
				@Pc(70) Method local70 = Static43.aMethod1;
				if (local70 != null) {
					try {
						local70.invoke(Static111.aClass29_3.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method472();
			Static107.aClass7_78 = Static37.method463(Static19.anInt630, Static26.anInt1438, Static105.aCanvas1);
			this.method454();
			Static71.aClass4_1 = Static112.method1747();
			Static71.aClass4_1.method708();
			while (Static2.aLong65 == 0L || Static2.aLong65 > Static50.method959()) {
				Static105.anInt2400 = Static71.aClass4_1.method707(Static93.anInt2253, Static5.anInt208);
				for (@Pc(114) int local114 = 0; local114 < Static105.anInt2400; local114++) {
					this.method455();
				}
				this.method460();
			}
		} catch (@Pc(139) Exception local139) {
			Static93.method1558(null, local139);
			this.method473("crash");
		}
		this.method462();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;IZIIILjava/net/InetAddress;I)V")
	protected final void method457(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(6) InetAddress arg2) {
		try {
			Static61.anApplet_Sub1_1 = this;
			Static26.anInt1438 = 503;
			Static19.anInt630 = 765;
			Static39.anInt1027 = 448;
			Static37.aFrame2 = new Frame();
			Static37.aFrame2.setTitle("Jagex");
			Static37.aFrame2.setResizable(false);
			Static37.aFrame2.addWindowListener(this);
			Static37.aFrame2.setVisible(true);
			Static37.aFrame2.toFront();
			@Pc(32) Insets local32 = Static37.aFrame2.getInsets();
			Static37.aFrame2.setSize(local32.left + local32.right + 765, local32.top + 503 + local32.bottom);
			Static42.aClass29_4 = Static111.aClass29_3 = new Class29(true, null, arg2, arg1, arg0, 14);
			Static111.aClass29_3.method774(this, 1);
		} catch (@Pc(70) Exception local70) {
			Static93.method1558(null, local70);
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	protected abstract void method458();

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Z")
	protected final boolean method459() {
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
				this.method473("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	private void method460() {
		@Pc(6) long local6 = Static50.method959();
		@Pc(10) long local10 = Static85.aLongArray7[Static114.anInt2677];
		Static85.aLongArray7[Static114.anInt2677] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(36) int local36 = (int) (local6 - local10);
			Static69.anInt1698 = ((local36 >> 1) + 32000) / local36;
		}
		Static114.anInt2677 = Static114.anInt2677 + 1 & 0x1F;
		if (Static72.anInt1828++ > 50) {
			Static73.aBoolean87 = true;
			Static72.anInt1828 -= 50;
			Static105.aCanvas1.setSize(Static19.anInt630, Static26.anInt1438);
			Static105.aCanvas1.setVisible(true);
			if (Static37.aFrame2 == null) {
				Static105.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static37.aFrame2.getInsets();
				Static105.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method453();
	}

	@OriginalMember(owner = "client!ga", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static37.aFrame2 == null) {
			return Static111.aClass29_3 == null || Static111.aClass29_3.anApplet1 == this ? super.getCodeBase() : Static111.aClass29_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)V")
	private synchronized void method462() {
		if (Static83.aBoolean96) {
			return;
		}
		Static83.aBoolean96 = true;
		try {
			Static105.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method466();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static37.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static111.aClass29_3 != null) {
			try {
				Static111.aClass29_3.method782();
			} catch (@Pc(37) Exception local37) {
			}
		}
		this.method458();
	}

	@OriginalMember(owner = "client!ga", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static37.aFrame2 == null) {
			return Static111.aClass29_3 == null || Static111.aClass29_3.anApplet1 == this ? super.getParameter(arg0) : Static111.aClass29_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static16.aBoolean21 = true;
		Static73.aBoolean87 = true;
	}

	@OriginalMember(owner = "client!ga", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	protected abstract void method464();

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(Z)V")
	protected abstract void method466();

	@OriginalMember(owner = "client!ga", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static61.anApplet_Sub1_1 == this && !Static83.aBoolean96) {
			Static2.aLong65 = Static50.method959() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ga", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static37.aFrame2 == null) {
			return Static111.aClass29_3 == null || Static111.aClass29_3.anApplet1 == this ? super.getAppletContext() : Static111.aClass29_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZII)V")
	protected final void method471(@OriginalArg(4) int arg0) {
		try {
			if (Static61.anApplet_Sub1_1 == null) {
				Static19.anInt630 = 765;
				Static39.anInt1027 = 448;
				Static61.anApplet_Sub1_1 = this;
				Static26.anInt1438 = 503;
				if (Static111.aClass29_3 == null) {
					Static42.aClass29_4 = Static111.aClass29_3 = new Class29(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static111.aClass29_3.method774(this, 1);
			} else {
				Static82.anInt1997++;
				if (Static82.anInt1997 >= 3) {
					this.method473("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase());
				}
			}
		} catch (@Pc(62) Exception local62) {
			Static93.method1558(null, local62);
			this.method473("crash");
		}
	}

	@OriginalMember(owner = "client!ga", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static61.anApplet_Sub1_1 == this && !Static83.aBoolean96) {
			Static2.aLong65 = 0L;
		}
	}

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "(I)V")
	protected final synchronized void method472() {
		@Pc(15) Container local15;
		if (Static37.aFrame2 == null) {
			local15 = Static111.aClass29_3.anApplet1;
		} else {
			local15 = Static37.aFrame2;
		}
		if (Static105.aCanvas1 != null) {
			Static105.aCanvas1.removeFocusListener(this);
			local15.remove(Static105.aCanvas1);
		}
		Static105.aCanvas1 = new Canvas_Sub1(this);
		local15.add(Static105.aCanvas1);
		Static105.aCanvas1.setSize(Static19.anInt630, Static26.anInt1438);
		Static105.aCanvas1.setVisible(true);
		if (Static37.aFrame2 == null) {
			Static105.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(49) Insets local49 = Static37.aFrame2.getInsets();
			Static105.aCanvas1.setLocation(local49.left, local49.top);
		}
		Static105.aCanvas1.addFocusListener(this);
		Static105.aCanvas1.requestFocus();
		Static73.aBoolean87 = true;
		Static54.aBoolean55 = false;
		Static89.aLong77 = Static50.method959();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method473(@OriginalArg(0) String arg0) {
		if (this.aBoolean25) {
			return;
		}
		this.aBoolean25 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(41) Exception local41) {
		}
	}
}
