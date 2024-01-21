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

@OriginalClass("client!rc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method445(@OriginalArg(0) String arg0) {
		if (this.aBoolean36) {
			return;
		}
		this.aBoolean36 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_self");
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZIII)V")
	protected final void method446(@OriginalArg(0) int arg0) {
		try {
			if (Static155.anApplet_Sub1_1 == null) {
				Static2.anInt84 = 489;
				Static86.anInt1783 = 503;
				Static155.anApplet_Sub1_1 = this;
				Static182.anInt4068 = 765;
				if (Static58.aClass61_1 == null) {
					Static75.aClass61_2 = Static58.aClass61_1 = new Class61(false, this, arg0, null, 0);
				}
				Static58.aClass61_1.method1792(1, this);
			} else {
				Static42.anInt956++;
				if (Static42.anInt956 >= 3) {
					this.method445("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(57) Exception local57) {
			Static67.method1005(local57, null);
			this.method445("crash");
		}
	}

	@OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static155.anApplet_Sub1_1 == this && !Static99.aBoolean85) {
			Static6.aLong6 = Static86.method1251();
			Static135.method2059(5000L);
			Static75.aClass61_2 = null;
			this.method460(false);
		}
	}

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static180.aBoolean159 = false;
	}

	@OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static155.anApplet_Sub1_1 != this || Static99.aBoolean85) {
			return;
		}
		Static180.aBoolean158 = true;
		if (Static117.aString3 != null && Static117.aString3.startsWith("1.5") && Static86.method1251() - Static74.aLong122 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static182.anInt4068 && local30.height >= Static86.anInt1783) {
				Static19.aBoolean27 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	protected abstract void method450();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILjava/lang/String;BI)V")
	protected final void method451(@OriginalArg(1) int arg0, @OriginalArg(4) String arg1) {
		try {
			Static182.anInt4068 = 765;
			Static155.anApplet_Sub1_1 = this;
			Static2.anInt84 = 489;
			Static86.anInt1783 = 503;
			Static29.aFrame1 = new Frame();
			Static29.aFrame1.setTitle("Jagex");
			Static29.aFrame1.setResizable(false);
			Static29.aFrame1.addWindowListener(this);
			Static29.aFrame1.setVisible(true);
			Static29.aFrame1.toFront();
			@Pc(42) Insets local42 = Static29.aFrame1.getInsets();
			Static29.aFrame1.setSize(local42.right + local42.left + 765, 503 - (-local42.top - local42.bottom));
			Static75.aClass61_2 = Static58.aClass61_1 = new Class61(true, null, arg0, arg1, 23);
			Static58.aClass61_1.method1792(1, this);
		} catch (@Pc(78) Exception local78) {
			Static67.method1005(local78, null);
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static29.aFrame1 == null) {
			return Static58.aClass61_1 == null || Static58.aClass61_1.anApplet1 == this ? super.getParameter(arg0) : Static58.aClass61_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static155.anApplet_Sub1_1 == this && !Static99.aBoolean85) {
			Static6.aLong6 = 0L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	protected abstract void method453();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	private void method454() {
		@Pc(4) long local4 = Static86.method1251();
		@Pc(8) long local8 = Static42.aLongArray2[Static102.anInt2132];
		Static42.aLongArray2[Static102.anInt2132] = local4;
		@Pc(25) boolean local25;
		if (local8 == 0L || local4 <= local8) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static102.anInt2132 = Static102.anInt2132 + 1 & 0x1F;
		synchronized (this) {
			Static122.aBoolean105 = Static180.aBoolean159;
		}
		this.method453();
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	protected abstract void method455();

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static180.aBoolean159 = true;
		Static180.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static29.aFrame1 == null) {
			return Static58.aClass61_1 == null || Static58.aClass61_1.anApplet1 == this ? super.getCodeBase() : Static58.aClass61_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	protected abstract void method457();

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V")
	private void method458() {
		@Pc(12) long local12 = Static86.method1251();
		@Pc(16) long local16 = Static7.aLongArray1[Static169.anInt1027];
		Static7.aLongArray1[Static169.anInt1027] = local12;
		Static169.anInt1027 = Static169.anInt1027 + 1 & 0x1F;
		if (local16 != 0L && local16 < local12) {
			@Pc(42) int local42 = (int) (local12 - local16);
			Static125.anInt2696 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static122.anInt2668++ > 50) {
			Static180.aBoolean158 = true;
			Static122.anInt2668 -= 50;
			Static146.aCanvas1.setSize(Static182.anInt4068, Static86.anInt1783);
			Static146.aCanvas1.setVisible(true);
			if (Static29.aFrame1 == null) {
				Static146.aCanvas1.setLocation(0, 0);
			} else {
				@Pc(81) Insets local81 = Static29.aFrame1.getInsets();
				Static146.aCanvas1.setLocation(local81.left, local81.top);
			}
		}
		this.method450();
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)V")
	protected final synchronized void method459() {
		@Pc(9) Container local9;
		if (Static29.aFrame1 == null) {
			local9 = Static58.aClass61_1.anApplet1;
		} else {
			local9 = Static29.aFrame1;
		}
		if (Static146.aCanvas1 != null) {
			Static146.aCanvas1.removeFocusListener(this);
			local9.remove(Static146.aCanvas1);
		}
		Static146.aCanvas1 = new Canvas_Sub1(this);
		local9.add(Static146.aCanvas1);
		Static146.aCanvas1.setSize(Static182.anInt4068, Static86.anInt1783);
		Static146.aCanvas1.setVisible(true);
		if (Static29.aFrame1 == null) {
			Static146.aCanvas1.setLocation(0, 0);
		} else {
			@Pc(47) Insets local47 = Static29.aFrame1.getInsets();
			Static146.aCanvas1.setLocation(local47.left, local47.top);
		}
		Static146.aCanvas1.addFocusListener(this);
		Static146.aCanvas1.requestFocus();
		Static180.aBoolean158 = true;
		Static19.aBoolean27 = false;
		Static74.aLong122 = Static86.method1251();
	}

	@OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static29.aFrame1 == null) {
			return Static58.aClass61_1 == null || Static58.aClass61_1.anApplet1 == this ? super.getDocumentBase() : Static58.aClass61_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ)V")
	private void method460(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static99.aBoolean85) {
				return;
			}
			Static99.aBoolean85 = true;
		}
		if (Static58.aClass61_1.anApplet1 != null) {
			Static58.aClass61_1.anApplet1.destroy();
		}
		if (Static146.aCanvas1 != null) {
			try {
				Static146.aCanvas1.removeFocusListener(this);
				@Pc(35) Container local35;
				if (Static29.aFrame1 == null) {
					local35 = Static58.aClass61_1.anApplet1;
				} else {
					local35 = Static29.aFrame1;
				}
				local35.remove(Static146.aCanvas1);
			} catch (@Pc(44) Exception local44) {
			}
		}
		try {
			this.method455();
		} catch (@Pc(50) Exception local50) {
		}
		if (Static58.aClass61_1 != null) {
			try {
				Static58.aClass61_1.method1784();
			} catch (@Pc(57) Exception local57) {
			}
		}
		this.method457();
		if (Static29.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(72) Throwable local72) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static29.aFrame1 == null) {
			return Static58.aClass61_1 == null || Static58.aClass61_1.anApplet1 == this ? super.getAppletContext() : Static58.aClass61_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Z")
	protected final boolean method461() {
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
				this.method445("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static117.aString4 != null) {
				@Pc(10) String local10 = Static117.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static117.aString3;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method445("wrongjava");
						return;
					}
					Static31.anInt748 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static117.aString3 == null || Static117.aString3.equals("1.4.2"))) {
					this.method445("wrongjava");
					return;
				}
			}
			if (Static58.aClass61_1.anApplet1 != null) {
				@Pc(69) Method local69 = Static117.aMethod1;
				if (local69 != null) {
					try {
						local69.invoke(Static58.aClass61_1.anApplet1, Boolean.TRUE);
					} catch (@Pc(84) Throwable local84) {
					}
				}
			}
			this.method459();
			Static60.aClass32_1 = Static137.method2076(Static86.anInt1783, Static146.aCanvas1, Static182.anInt4068);
			this.method463();
			Static92.aClass20_2 = Static177.method2836();
			while (Static6.aLong6 == 0L || Static6.aLong6 > Static86.method1251()) {
				Static6.anInt211 = Static92.aClass20_2.method1229(Static60.anInt1332, Static31.anInt748);
				for (@Pc(110) int local110 = 0; local110 < Static6.anInt211; local110++) {
					this.method454();
				}
				this.method458();
				Static126.method1862(Static146.aCanvas1, Static58.aClass61_1);
			}
		} catch (@Pc(147) Exception local147) {
			Static67.method1005(local147, null);
			this.method445("crash");
		}
		this.method460(true);
	}

	@OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static155.anApplet_Sub1_1 == this && !Static99.aBoolean85) {
			Static6.aLong6 = Static86.method1251() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	protected abstract void method463();
}
