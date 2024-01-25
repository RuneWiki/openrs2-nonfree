import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
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

@OriginalClass("client!kr")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!kr", name = "y", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!kr", name = "H", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!kr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	private void method727() {
		@Pc(6) long local6 = Static245.method4300();
		@Pc(10) long local10 = Static110.aLongArray2[Static5.anInt98];
		Static110.aLongArray2[Static5.anInt98] = local6;
		@Pc(25) boolean local25;
		if (local10 == 0L || local10 >= local6) {
			local25 = false;
		} else {
			local25 = true;
		}
		Static5.anInt98 = Static5.anInt98 + 1 & 0x1F;
		synchronized (this) {
			Static68.aBoolean298 = Static214.aBoolean293;
		}
		this.method735();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method728(@OriginalArg(0) String arg0) {
		if (this.aBoolean66) {
			return;
		}
		this.aBoolean66 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static365.method3241(Static308.aClass206_5.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	protected abstract void method729();

	@OriginalMember(owner = "client!kr", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
	protected abstract void method730();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	private void method731() {
		@Pc(6) long local6 = Static245.method4300();
		@Pc(10) long local10 = Static283.aLongArray8[Static175.anInt3293];
		Static283.aLongArray8[Static175.anInt3293] = local6;
		Static175.anInt3293 = Static175.anInt3293 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(42) int local42 = (int) (local6 - local10);
			Static118.anInt2258 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static192.anInt3646++ > 50) {
			Static192.anInt3646 -= 50;
			Static308.aBoolean391 = true;
			Static354.aCanvas5.setSize(Static209.anInt3815, Static94.anInt1731);
			Static354.aCanvas5.setVisible(true);
			if (Static95.aFrame2 != null && Static90.aFrame1 == null) {
				@Pc(83) Insets local83 = Static95.aFrame2.getInsets();
				Static354.aCanvas5.setLocation(Static271.anInt5038 + local83.left, Static57.anInt1098 + local83.top);
			} else {
				Static354.aCanvas5.setLocation(Static271.anInt5038, Static57.anInt1098);
			}
		}
		this.method744();
	}

	@OriginalMember(owner = "client!kr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static46.anApplet_Sub1_1 == this && !Static237.aBoolean308) {
			Static95.aLong58 = Static245.method4300();
			Static278.method5283(5000L);
			Static292.aClass206_4 = null;
			this.method739(false);
		}
	}

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V")
	public final synchronized void method733() {
		if (Static354.aCanvas5 != null) {
			Static354.aCanvas5.removeFocusListener(this);
			Static354.aCanvas5.getParent().remove(Static354.aCanvas5);
		}
		@Pc(23) Container local23;
		if (Static90.aFrame1 != null) {
			local23 = Static90.aFrame1;
		} else if (Static95.aFrame2 == null) {
			local23 = Static308.aClass206_5.anApplet1;
		} else {
			local23 = Static95.aFrame2;
		}
		local23.setLayout(null);
		Static354.aCanvas5 = new Canvas_Sub1(this);
		local23.add(Static354.aCanvas5);
		Static354.aCanvas5.setSize(Static209.anInt3815, Static94.anInt1731);
		Static354.aCanvas5.setVisible(true);
		if (local23 == Static95.aFrame2) {
			@Pc(65) Insets local65 = Static95.aFrame2.getInsets();
			Static354.aCanvas5.setLocation(Static271.anInt5038 + local65.left, Static57.anInt1098 + local65.top);
		} else {
			Static354.aCanvas5.setLocation(Static271.anInt5038, Static57.anInt1098);
		}
		Static354.aCanvas5.addFocusListener(this);
		Static354.aCanvas5.requestFocus();
		Static214.aBoolean293 = true;
		Static68.aBoolean298 = true;
		Static308.aBoolean391 = true;
		Static182.aBoolean246 = false;
		Static175.aLong115 = Static245.method4300();
	}

	@OriginalMember(owner = "client!kr", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static46.anApplet_Sub1_1 == this && !Static237.aBoolean308) {
			Static95.aLong58 = Static245.method4300() + 4000L;
		}
	}

	@OriginalMember(owner = "client!kr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static95.aFrame2 == null) {
			return Static308.aClass206_5 == null || Static308.aClass206_5.anApplet1 == this ? super.getCodeBase() : Static308.aClass206_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static46.anApplet_Sub1_1 == this && !Static237.aBoolean308) {
			Static95.aLong58 = 0L;
		}
	}

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)V")
	protected abstract void method735();

	@OriginalMember(owner = "client!kr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static214.aBoolean293 = false;
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
	public final void method737() {
		if (this.aBoolean65) {
			return;
		}
		try {
			@Pc(14) Class196 local14 = Static308.aClass206_5.method5511(Static46.anApplet_Sub1_1.getClass());
			while (local14.anInt5851 == 0) {
				Static278.method5283(100L);
			}
			if (local14.anObject8 != null) {
				throw (Throwable) local14.anObject8;
			}
			jagmisc.init();
			this.aBoolean65 = true;
			Static98.aClass10_1 = Static6.method124();
		} catch (@Pc(39) Throwable local39) {
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIZ)V")
	protected final void method738(@OriginalArg(2) int arg0) {
		try {
			if (Static46.anApplet_Sub1_1 == null) {
				Static29.anInt565 = 558;
				Static209.anInt3815 = 765;
				Static92.anInt1689 = 765;
				Static94.anInt1731 = 503;
				Static99.anInt6127 = 503;
				Static46.anApplet_Sub1_1 = this;
				Static271.anInt5038 = 0;
				Static57.anInt1098 = 0;
				if (Static308.aClass206_5 == null) {
					Static292.aClass206_4 = Static308.aClass206_5 = new Class206(this, arg0, null, 0);
				}
				@Pc(71) Class196 local71 = Static308.aClass206_5.method5526(this, 1);
				while (local71.anInt5851 == 0) {
					Static278.method5283(10L);
				}
			} else {
				Static102.anInt5264++;
				if (Static102.anInt5264 >= 3) {
					this.method728("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(84) Exception local84) {
			Static346.method5707(null, local84);
			this.method728("crash");
		}
	}

	@OriginalMember(owner = "client!kr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static95.aFrame2 == null) {
			return Static308.aClass206_5 == null || Static308.aClass206_5.anApplet1 == this ? super.getAppletContext() : Static308.aClass206_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static214.aBoolean293 = true;
		Static308.aBoolean391 = true;
	}

	@OriginalMember(owner = "client!kr", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static332.aString292 != null) {
					@Pc(6) String local6 = Static332.aString292.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(37) String local37 = Static332.aString293;
						if (local37.equals("1.1") || local37.startsWith("1.1.") || local37.equals("1.2") || local37.startsWith("1.2.")) {
							this.method728("wrongjava");
							break label107;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static332.aString293 == null || Static332.aString293.equals("1.4.2"))) {
						this.method728("wrongjava");
						break label107;
					}
				}
				@Pc(67) int local67;
				if (Static332.aString293 != null && Static332.aString293.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (Static332.aString293.length() > local67) {
						@Pc(75) char local75 = Static332.aString293.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local69 = local69 * 10 + local75 - 48;
						local67++;
					}
					if (local69 >= 5) {
						Static30.aBoolean41 = true;
					}
				}
				if (Static308.aClass206_5.anApplet1 != null) {
					@Pc(115) Method local115 = Static332.aMethod1;
					if (local115 != null) {
						try {
							local115.invoke(Static308.aClass206_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(130) Throwable local130) {
						}
					}
				}
				Static80.method5173();
				this.method733();
				this.method742();
				Static98.aClass10_1 = Static6.method124();
				this.method737();
				while (Static95.aLong58 == 0L || Static245.method4300() < Static95.aLong58) {
					Static253.anInt4716 = Static98.aClass10_1.method3295(Static28.anInt542);
					for (local67 = 0; local67 < Static253.anInt4716; local67++) {
						this.method727();
					}
					this.method731();
					Static189.method3562(Static354.aCanvas5, Static308.aClass206_5);
				}
			}
		} catch (@Pc(187) Exception local187) {
			Static346.method5707(null, local187);
			this.method728("crash");
		}
		this.method739(true);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZI)V")
	private void method739(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static237.aBoolean308) {
				return;
			}
			Static237.aBoolean308 = true;
		}
		if (Static308.aClass206_5.anApplet1 != null) {
			Static308.aClass206_5.anApplet1.destroy();
		}
		try {
			this.method729();
		} catch (@Pc(39) Exception local39) {
		}
		if (this.aBoolean65) {
			try {
				jagmisc.quit();
			} catch (@Pc(45) Throwable local45) {
			}
			this.aBoolean65 = false;
		}
		@Pc(54) Class196 local54 = Static308.aClass206_5.method5533(Static46.anApplet_Sub1_1.getClass());
		while (local54.anInt5851 == 0) {
			Static278.method5283(100L);
		}
		if (Static354.aCanvas5 != null) {
			try {
				Static354.aCanvas5.removeFocusListener(this);
				Static354.aCanvas5.getParent().remove(Static354.aCanvas5);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Static308.aClass206_5 != null) {
			try {
				Static308.aClass206_5.method5512();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method730();
		if (Static95.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;IIIZZI)V")
	protected final void method740(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static57.anInt1098 = 0;
			Static209.anInt3815 = 1024;
			Static92.anInt1689 = 1024;
			Static46.anApplet_Sub1_1 = this;
			Static29.anInt565 = 558;
			Static94.anInt1731 = 768;
			Static99.anInt6127 = 768;
			Static271.anInt5038 = 0;
			Static95.aFrame2 = new Frame();
			Static95.aFrame2.setTitle("Jagex");
			Static95.aFrame2.setResizable(true);
			Static95.aFrame2.addWindowListener(this);
			Static95.aFrame2.setVisible(true);
			Static95.aFrame2.toFront();
			@Pc(38) Insets local38 = Static95.aFrame2.getInsets();
			Static95.aFrame2.setSize(Static92.anInt1689 + local38.left + local38.right, local38.bottom + Static99.anInt6127 + local38.top);
			Static292.aClass206_4 = Static308.aClass206_5 = new Class206(null, arg1, arg0, 29);
			@Pc(70) Class196 local70 = Static308.aClass206_5.method5526(this, 1);
			while (local70.anInt5851 == 0) {
				Static278.method5283(10L);
			}
		} catch (@Pc(80) Exception local80) {
			Static346.method5707(null, local80);
		}
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z")
	protected final boolean method741() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
			return true;
		} else if (local8.equals("stellardawn.com") || local8.endsWith(".stellardawn.com")) {
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
				this.method728("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static95.aFrame2 == null) {
			return Static308.aClass206_5 == null || Static308.aClass206_5.anApplet1 == this ? super.getDocumentBase() : Static308.aClass206_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static46.anApplet_Sub1_1 != this || Static237.aBoolean308) {
			return;
		}
		Static308.aBoolean391 = true;
		if (Static30.aBoolean41 && Static245.method4300() - Static175.aLong115 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static92.anInt1689 && local26.height >= Static99.anInt6127) {
				Static182.aBoolean246 = true;
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V")
	protected abstract void method742();

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "(I)V")
	protected abstract void method744();

	@OriginalMember(owner = "client!kr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static95.aFrame2 == null) {
			return Static308.aClass206_5 == null || Static308.aClass206_5.anApplet1 == this ? super.getParameter(arg0) : Static308.aClass206_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!kr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}
}
