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

@OriginalClass("client!l")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!l", name = "V", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	protected abstract void method300();

	@OriginalMember(owner = "client!l", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!l", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static24.aString1 != null) {
				@Pc(10) String local10 = Static24.aString1.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(40) String local40 = Static24.aString2;
					if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
						this.method310("wrongjava");
						return;
					}
					Static56.anInt1426 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static24.aString2 == null || Static24.aString2.equals("1.4.2"))) {
					this.method310("wrongjava");
					return;
				}
			}
			if (Static28.aClass20_2.anApplet1 != null) {
				@Pc(68) Method local68 = Static24.aMethod1;
				if (local68 != null) {
					try {
						local68.invoke(Static28.aClass20_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(83) Throwable local83) {
					}
				}
			}
			this.method309();
			Static59.aClass6_1 = Static129.method1957(Static115.aCanvas1, Static32.anInt755, Static48.anInt1173);
			this.method306();
			Static101.aClass10_1 = Static105.method1708();
			while (Static96.aLong66 == 0L || Static78.method1296() < Static96.aLong66) {
				Static50.anInt1216 = Static101.aClass10_1.method1863(Static106.anInt2394, Static56.anInt1426);
				for (@Pc(109) int local109 = 0; local109 < Static50.anInt1216; local109++) {
					this.method304();
				}
				this.method317();
				Static79.method1303(Static28.aClass20_2, Static115.aCanvas1);
			}
		} catch (@Pc(140) Exception local140) {
			Static93.method1535(null, local140);
			this.method310("crash");
		}
		this.method312();
	}

	@OriginalMember(owner = "client!l", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static10.aFrame62 == null) {
			return Static28.aClass20_2 == null || Static28.aClass20_2.anApplet1 == this ? super.getParameter(arg0) : Static28.aClass20_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static4.anApplet_Sub1_3 == this && !Static59.aBoolean52) {
			Static96.aLong66 = 0L;
		}
	}

	@OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static2.aBoolean3 = true;
		Static43.aBoolean44 = true;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V")
	private void method304() {
		@Pc(7) long local7 = Static117.aLongArray7[Static89.anInt1979];
		@Pc(10) long local10 = Static78.method1296();
		@Pc(19) boolean local19;
		if (local7 == 0L || local10 <= local7) {
			local19 = false;
		} else {
			local19 = true;
		}
		Static117.aLongArray7[Static89.anInt1979] = local10;
		Static89.anInt1979 = Static89.anInt1979 + 1 & 0x1F;
		synchronized (this) {
			Static73.aBoolean61 = Static2.aBoolean3;
		}
		this.method307();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBIII)V")
	protected final void method305(@OriginalArg(3) int arg0) {
		try {
			if (Static4.anApplet_Sub1_3 == null) {
				Static32.anInt755 = 503;
				Static95.anInt2161 = 466;
				Static4.anApplet_Sub1_3 = this;
				Static48.anInt1173 = 765;
				if (Static28.aClass20_2 == null) {
					Static46.aClass20_4 = Static28.aClass20_2 = new Class20(false, this, arg0, null, 0);
				}
				Static28.aClass20_2.method374(1, this);
			} else {
				Static56.anInt1425++;
				if (Static56.anInt1425 >= 3) {
					this.method310("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(61) Exception local61) {
			Static93.method1535(null, local61);
			this.method310("crash");
		}
	}

	@OriginalMember(owner = "client!l", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static4.anApplet_Sub1_3 == this && !Static59.aBoolean52) {
			Static96.aLong66 = Static78.method1296() + 4000L;
		}
	}

	@OriginalMember(owner = "client!l", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	protected abstract void method306();

	@OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	protected abstract void method307();

	@OriginalMember(owner = "client!l", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static4.anApplet_Sub1_3 != this || Static59.aBoolean52) {
			return;
		}
		Static43.aBoolean44 = true;
		if (Static24.aString2 != null && Static24.aString2.startsWith("1.5") && Static78.method1296() - Static40.aLong29 > 1000L) {
			@Pc(28) Rectangle local28 = arg0.getClipBounds();
			if (local28 == null || local28.width >= Static48.anInt1173 && local28.height >= Static32.anInt755) {
				Static97.aBoolean89 = true;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static2.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
	protected final synchronized void method309() {
		@Pc(6) Container local6;
		if (Static10.aFrame62 == null) {
			local6 = Static28.aClass20_2.anApplet1;
		} else {
			local6 = Static10.aFrame62;
		}
		if (Static115.aCanvas1 != null) {
			Static115.aCanvas1.removeFocusListener(this);
			local6.remove(Static115.aCanvas1);
		}
		Static115.aCanvas1 = new Canvas_Sub1(this);
		local6.add(Static115.aCanvas1);
		Static115.aCanvas1.setSize(Static48.anInt1173, Static32.anInt755);
		Static115.aCanvas1.setVisible(true);
		if (Static10.aFrame62 == null) {
			Static115.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(43) Insets local43 = Static10.aFrame62.getInsets();
			Static115.aCanvas1.setLocation(local43.left, local43.top);
		}
		Static115.aCanvas1.addFocusListener(this);
		Static115.aCanvas1.requestFocus();
		Static43.aBoolean44 = true;
		Static97.aBoolean89 = false;
		Static40.aLong29 = Static78.method1296();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method310(@OriginalArg(0) String arg0) {
		if (this.aBoolean19) {
			return;
		}
		this.aBoolean19 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!l", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static4.anApplet_Sub1_3 == this && !Static59.aBoolean52) {
			Static96.aLong66 = Static78.method1296();
			Static81.method1325(5000L);
			Static46.aClass20_4 = null;
			this.method312();
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;BIIII)V")
	protected final void method311(@OriginalArg(1) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static4.anApplet_Sub1_3 = this;
			Static32.anInt755 = 503;
			Static48.anInt1173 = 765;
			Static95.anInt2161 = 466;
			Static10.aFrame62 = new Frame();
			Static10.aFrame62.setTitle("Jagex");
			Static10.aFrame62.setResizable(false);
			Static10.aFrame62.addWindowListener(this);
			Static10.aFrame62.setVisible(true);
			Static10.aFrame62.toFront();
			@Pc(28) Insets local28 = Static10.aFrame62.getInsets();
			Static10.aFrame62.setSize(local28.right + local28.left + 765, 503 - -local28.top + local28.bottom);
			Static46.aClass20_4 = Static28.aClass20_2 = new Class20(true, null, arg1, arg0, 16);
			Static28.aClass20_2.method374(1, this);
		} catch (@Pc(64) Exception local64) {
			Static93.method1535(null, local64);
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
	private synchronized void method312() {
		if (Static59.aBoolean52) {
			return;
		}
		Static59.aBoolean52 = true;
		try {
			Static115.aCanvas1.removeFocusListener(this);
		} catch (@Pc(18) Exception local18) {
		}
		try {
			this.method314();
		} catch (@Pc(23) Exception local23) {
		}
		if (Static10.aFrame62 != null) {
			try {
				System.exit(0);
			} catch (@Pc(29) Throwable local29) {
			}
		}
		if (Static28.aClass20_2 != null) {
			try {
				Static28.aClass20_2.method372();
			} catch (@Pc(39) Exception local39) {
			}
		}
		this.method300();
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)V")
	protected abstract void method313();

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
	protected abstract void method314();

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(B)Z")
	protected final boolean method315() {
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
				this.method310("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static10.aFrame62 == null) {
			return Static28.aClass20_2 == null || Static28.aClass20_2.anApplet1 == this ? super.getDocumentBase() : Static28.aClass20_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static10.aFrame62 == null) {
			return Static28.aClass20_2 == null || Static28.aClass20_2.anApplet1 == this ? super.getCodeBase() : Static28.aClass20_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!l", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static10.aFrame62 == null) {
			return Static28.aClass20_2 == null || Static28.aClass20_2.anApplet1 == this ? super.getAppletContext() : Static28.aClass20_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
	private void method317() {
		@Pc(8) long local8 = Static78.method1296();
		@Pc(12) long local12 = Static48.aLongArray2[Static42.anInt1048];
		Static48.aLongArray2[Static42.anInt1048] = local8;
		if (local12 != 0L && local8 > local12) {
			@Pc(32) int local32 = (int) (local8 - local12);
			Static103.anInt2349 = ((local32 >> 1) + 32000) / local32;
		}
		Static42.anInt1048 = Static42.anInt1048 + 1 & 0x1F;
		if (Static23.anInt1757++ > 50) {
			Static23.anInt1757 -= 50;
			Static43.aBoolean44 = true;
			Static115.aCanvas1.setSize(Static48.anInt1173, Static32.anInt755);
			Static115.aCanvas1.setVisible(true);
			if (Static10.aFrame62 == null) {
				Static115.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(72) Insets local72 = Static10.aFrame62.getInsets();
				Static115.aCanvas1.setLocation(local72.left, local72.top);
			}
		}
		this.method313();
	}

	@OriginalMember(owner = "client!l", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
