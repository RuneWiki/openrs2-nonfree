import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
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

@OriginalClass("client!sr")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!sr", name = "H", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!sr", name = "I", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!sr", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	public static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static412.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Z")
	protected final boolean method1535() {
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
				this.method1547("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
	protected abstract void method1536();

	@OriginalMember(owner = "client!sr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	protected abstract void method1537();

	@OriginalMember(owner = "client!sr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static208.aFrame4 == null) {
			return Static412.anApplet1 == null || Static412.anApplet1 == this ? super.getCodeBase() : Static412.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static227.aBoolean347 = true;
		Static327.aBoolean420 = true;
	}

	@OriginalMember(owner = "client!sr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static229.anApplet_Sub1_20 != this || Static532.aBoolean647) {
			return;
		}
		Static327.aBoolean420 = true;
		if (Static188.aBoolean319 && Static255.method4035() - Static310.aLong332 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || local25.width >= Static309.anInt5589 && local25.height >= Static20.anInt611) {
				Static270.aBoolean384 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)Ljava/lang/String;")
	public String method1539() {
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBIILjava/lang/String;II)V")
	protected final void method1541(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		try {
			if (Static229.anApplet_Sub1_20 == null) {
				Static377.anInt6644 = 0;
				Static568.anApplet2 = Static412.anApplet1;
				Static443.anInt7718 = arg3;
				Static309.anInt5589 = arg3;
				Static229.anApplet_Sub1_20 = this;
				Static393.anInt6807 = 0;
				Static300.anInt5516 = arg1;
				Static20.anInt611 = arg1;
				Static581.anInt9414 = 619;
				Static271.aClass114_5 = Static246.aClass114_10 = new Class114(arg0, arg2, 35, Static412.anApplet1 != null);
				@Pc(69) Class23 local69 = Static246.aClass114_10.method2498(this, 1);
				while (local69.anInt875 == 0) {
					Static423.method5918(10L);
				}
			} else {
				Static584.anInt9447++;
				if (Static584.anInt9447 >= 3) {
					this.method1547("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static259.method4059(null, local82);
			this.method1547("crash");
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	private void method1542() {
		@Pc(6) long local6 = Static255.method4035();
		@Pc(10) long local10 = Static560.aLongArray15[Static568.anInt9273];
		Static560.aLongArray15[Static568.anInt9273] = local6;
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		Static568.anInt9273 = Static568.anInt9273 + 1 & 0x1F;
		synchronized (this) {
			Static81.aBoolean154 = Static227.aBoolean347;
		}
		this.method1537();
	}

	@OriginalMember(owner = "client!sr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static229.anApplet_Sub1_20 == this && !Static532.aBoolean647) {
			Static139.aLong206 = Static255.method4035();
			Static423.method5918(5000L);
			Static271.aClass114_5 = null;
			this.method1545(false);
		}
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	public synchronized void method1543() {
		if (Static26.aCanvas3 != null) {
			Static26.aCanvas3.removeFocusListener(this);
			Static26.aCanvas3.getParent().setBackground(Color.black);
			Static26.aCanvas3.getParent().remove(Static26.aCanvas3);
		}
		@Pc(22) Container local22;
		if (Static255.aFrame3 != null) {
			local22 = Static255.aFrame3;
		} else if (Static208.aFrame4 != null) {
			local22 = Static208.aFrame4;
		} else if (Static412.anApplet1 == null) {
			local22 = Static229.anApplet_Sub1_20;
		} else {
			local22 = Static412.anApplet1;
		}
		local22.setLayout(null);
		Static26.aCanvas3 = new Canvas_Sub1(this);
		local22.add(Static26.aCanvas3);
		Static26.aCanvas3.setSize(Static443.anInt7718, Static300.anInt5516);
		Static26.aCanvas3.setVisible(true);
		if (Static208.aFrame4 == local22) {
			@Pc(75) Insets local75 = Static208.aFrame4.getInsets();
			Static26.aCanvas3.setLocation(Static393.anInt6807 + local75.left, Static377.anInt6644 + local75.top);
		} else {
			Static26.aCanvas3.setLocation(Static393.anInt6807, Static377.anInt6644);
		}
		Static26.aCanvas3.addFocusListener(this);
		Static26.aCanvas3.requestFocus();
		Static227.aBoolean347 = true;
		Static81.aBoolean154 = true;
		Static327.aBoolean420 = true;
		Static270.aBoolean384 = false;
		Static310.aLong332 = Static255.method4035();
	}

	@OriginalMember(owner = "client!sr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BZ)V")
	private void method1545(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static532.aBoolean647) {
				return;
			}
			Static532.aBoolean647 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static412.anApplet1 != null) {
			Static412.anApplet1.destroy();
		}
		try {
			this.method1550();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean144) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean144 = false;
		}
		Static223.method3673();
		Static471.method6666();
		if (Static26.aCanvas3 != null) {
			try {
				Static26.aCanvas3.removeFocusListener(this);
				Static26.aCanvas3.getParent().remove(Static26.aCanvas3);
			} catch (@Pc(71) Exception local71) {
			}
		}
		if (Static246.aClass114_10 != null) {
			try {
				Static246.aClass114_10.method2501();
			} catch (@Pc(79) Exception local79) {
			}
		}
		this.method1549();
		if (Static208.aFrame4 != null) {
			Static208.aFrame4.setVisible(false);
			Static208.aFrame4.dispose();
			Static208.aFrame4 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!sr", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static162.aString32 != null) {
				@Pc(10) String local10 = Static162.aString32.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(41) String local41 = Static162.aString30;
					if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
						this.method1547("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static162.aString30 == null || Static162.aString30.equals("1.4.2"))) {
					this.method1547("wrongjava");
					return;
				}
			}
			if (Static162.aString30 != null && Static162.aString30.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (Static162.aString30.length() > local71) {
					@Pc(79) char local79 = Static162.aString30.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local73 = local79 + local73 * 10 - 48;
					local71++;
				}
				if (local73 >= 5) {
					Static188.aBoolean319 = true;
				}
			}
			@Pc(109) Applet local109 = Static229.anApplet_Sub1_20;
			if (Static412.anApplet1 != null) {
				local109 = Static412.anApplet1;
			}
			@Pc(115) Method local115 = Static162.aMethod1;
			if (local115 != null) {
				try {
					local115.invoke(local109, Boolean.TRUE);
				} catch (@Pc(129) Throwable local129) {
				}
			}
			Static332.method4985();
			Static427.method5988();
			this.method1543();
			this.method1536();
			Static375.aClass92_1 = Static132.method2238();
			while (Static139.aLong206 == 0L || Static139.aLong206 > Static255.method4035()) {
				Static341.anInt6053 = Static375.aClass92_1.method4207(Static326.aLong252);
				for (@Pc(152) int local152 = 0; local152 < Static341.anInt6053; local152++) {
					this.method1542();
				}
				this.method1548();
				Static461.method6558(Static246.aClass114_10, Static26.aCanvas3);
			}
		} catch (@Pc(189) ThreadDeath local189) {
			throw local189;
		} catch (@Pc(192) Throwable local192) {
			Static259.method4059(this.method1539(), local192);
			this.method1547("crash");
		} finally {
			@Pc(208) Object local208 = null;
			this.method1545(true);
		}
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V")
	protected abstract void method1546();

	@OriginalMember(owner = "client!sr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static208.aFrame4 == null) {
			return Static412.anApplet1 == null || Static412.anApplet1 == this ? super.getDocumentBase() : Static412.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1547(@OriginalArg(0) String arg0) {
		if (this.aBoolean145) {
			return;
		}
		this.aBoolean145 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static602.method5582(Static412.anApplet1, "loggedout");
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!sr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!sr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static229.anApplet_Sub1_20 == this && !Static532.aBoolean647) {
			Static139.aLong206 = 0L;
		}
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V")
	private void method1548() {
		@Pc(6) long local6 = Static255.method4035();
		@Pc(10) long local10 = Static585.aLongArray16[Static540.anInt8891];
		Static585.aLongArray16[Static540.anInt8891] = local6;
		if (local10 != 0L && local6 > local10) {
			@Pc(28) int local28 = (int) (local6 - local10);
			Static259.anInt4764 = ((local28 >> 1) + 32000) / local28;
		}
		Static540.anInt8891 = Static540.anInt8891 + 1 & 0x1F;
		if (Static496.anInt8340++ > 50) {
			Static496.anInt8340 -= 50;
			Static327.aBoolean420 = true;
			Static26.aCanvas3.setSize(Static443.anInt7718, Static300.anInt5516);
			Static26.aCanvas3.setVisible(true);
			if (Static208.aFrame4 != null && Static255.aFrame3 == null) {
				@Pc(69) Insets local69 = Static208.aFrame4.getInsets();
				Static26.aCanvas3.setLocation(local69.left + Static393.anInt6807, local69.top - -Static377.anInt6644);
			} else {
				Static26.aCanvas3.setLocation(Static393.anInt6807, Static377.anInt6644);
			}
		}
		this.method1546();
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)V")
	protected abstract void method1549();

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
	protected abstract void method1550();

	@OriginalMember(owner = "client!sr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static208.aFrame4 == null) {
			return Static412.anApplet1 == null || Static412.anApplet1 == this ? super.getAppletContext() : Static412.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(B)Z")
	public final boolean method1551() {
		return Static293.method4616("jaclib");
	}

	@OriginalMember(owner = "client!sr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static208.aFrame4 == null) {
			return Static412.anApplet1 == null || Static412.anApplet1 == this ? super.getParameter(arg0) : Static412.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(B)Z")
	public final boolean method1552() {
		return Static293.method4616("jagmisc");
	}

	@OriginalMember(owner = "client!sr", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static229.anApplet_Sub1_20 == this && !Static532.aBoolean647) {
			Static139.aLong206 = Static255.method4035() + 4000L;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBILjava/lang/String;ZII)V")
	protected final void method1553(@OriginalArg(4) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static568.anApplet2 = null;
			Static581.anInt9414 = 619;
			Static377.anInt6644 = 0;
			Static300.anInt5516 = 768;
			Static20.anInt611 = 768;
			Static443.anInt7718 = 1024;
			Static309.anInt5589 = 1024;
			Static229.anApplet_Sub1_20 = this;
			Static393.anInt6807 = 0;
			Static208.aFrame4 = new Frame();
			Static208.aFrame4.setTitle("Jagex");
			Static208.aFrame4.setResizable(true);
			Static208.aFrame4.addWindowListener(this);
			Static208.aFrame4.setVisible(true);
			Static208.aFrame4.toFront();
			@Pc(50) Insets local50 = Static208.aFrame4.getInsets();
			Static208.aFrame4.setSize(Static309.anInt5589 + local50.left + local50.right, local50.bottom + local50.top + Static20.anInt611);
			Static271.aClass114_5 = Static246.aClass114_10 = new Class114(arg1, arg0, 35, true);
			@Pc(82) Class23 local82 = Static246.aClass114_10.method2498(this, 1);
			while (local82.anInt875 == 0) {
				Static423.method5918(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static259.method4059(null, local92);
		}
	}

	@OriginalMember(owner = "client!sr", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!sr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static227.aBoolean347 = false;
	}
}
