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

@OriginalClass("client!om")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	public final synchronized void method731() {
		if (Static91.aCanvas2 != null) {
			Static91.aCanvas2.removeFocusListener(this);
			Static91.aCanvas2.getParent().remove(Static91.aCanvas2);
		}
		@Pc(20) Container local20;
		if (Static33.aFrame1 != null) {
			local20 = Static33.aFrame1;
		} else if (Static138.aFrame2 == null) {
			local20 = Static259.aClass177_2.anApplet1;
		} else {
			local20 = Static138.aFrame2;
		}
		local20.setLayout(null);
		Static91.aCanvas2 = new Canvas_Sub1(this);
		local20.add(Static91.aCanvas2);
		Static91.aCanvas2.setSize(Static192.anInt3532, Static40.anInt597);
		Static91.aCanvas2.setVisible(true);
		if (Static138.aFrame2 == local20) {
			@Pc(54) Insets local54 = Static138.aFrame2.getInsets();
			Static91.aCanvas2.setLocation(Static232.anInt4198 + local54.left, Static351.anInt5682 + local54.top);
		} else {
			Static91.aCanvas2.setLocation(Static232.anInt4198, Static351.anInt5682);
		}
		Static91.aCanvas2.addFocusListener(this);
		Static91.aCanvas2.requestFocus();
		Static397.aBoolean556 = true;
		Static187.aBoolean331 = true;
		Static69.aBoolean128 = true;
		Static68.aBoolean126 = false;
		Static440.aLong109 = Static183.method2674();
	}

	@OriginalMember(owner = "client!om", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static187.aBoolean331 = false;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	protected abstract void method733();

	@OriginalMember(owner = "client!om", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static265.anApplet_Sub1_1 != this || Static34.aBoolean78) {
			return;
		}
		Static69.aBoolean128 = true;
		if (Static247.aBoolean408 && Static183.method2674() - Static440.aLong109 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static342.anInt5549 && local24.height >= Static455.anInt7239) {
				Static68.aBoolean126 = true;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static187.aBoolean331 = true;
		Static69.aBoolean128 = true;
	}

	@OriginalMember(owner = "client!om", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static138.aFrame2 == null) {
			return Static259.aClass177_2 == null || Static259.aClass177_2.anApplet1 == this ? super.getCodeBase() : Static259.aClass177_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!om", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static265.anApplet_Sub1_1 == this && !Static34.aBoolean78) {
			Static224.aLong131 = Static183.method2674();
			Static331.method4343(5000L);
			Static457.aClass177_5 = null;
			this.method743(false);
		}
	}

	@OriginalMember(owner = "client!om", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static138.aFrame2 == null) {
			return Static259.aClass177_2 == null || Static259.aClass177_2.anApplet1 == this ? super.getParameter(arg0) : Static259.aClass177_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!om", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static289.aString50 != null) {
					@Pc(10) String local10 = Static289.aString50.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(22) String local22 = Static289.aString49;
						if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
							this.method744("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static289.aString49 == null || Static289.aString49.equals("1.4.2"))) {
						this.method744("wrongjava");
						break label111;
					}
				}
				@Pc(70) int local70;
				if (Static289.aString49 != null && Static289.aString49.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static289.aString49.length() > local70) {
						@Pc(78) char local78 = Static289.aString49.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local72 * 10 + local78 - 48;
					}
					if (local72 >= 5) {
						Static247.aBoolean408 = true;
					}
				}
				if (Static259.aClass177_2.anApplet1 != null) {
					@Pc(111) Method local111 = Static289.aMethod2;
					if (local111 != null) {
						try {
							local111.invoke(Static259.aClass177_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static410.method5245();
				Static281.method3759();
				this.method731();
				this.method739();
				this.method738();
				Static78.aClass20_3 = Static200.method2867();
				this.method739();
				while (Static224.aLong131 == 0L || Static183.method2674() < Static224.aLong131) {
					Static55.anInt872 = Static78.aClass20_3.method3401(Static388.anInt6818);
					for (local70 = 0; local70 < Static55.anInt872; local70++) {
						this.method736();
					}
					this.method746();
					Static286.method3789(Static91.aCanvas2, Static259.aClass177_2);
				}
			}
		} catch (@Pc(182) Throwable local182) {
			Static338.method4409(local182, this.method749());
			this.method744("crash");
		}
		this.method743(true);
	}

	@OriginalMember(owner = "client!om", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	private void method736() {
		@Pc(6) long local6 = Static183.method2674();
		@Pc(10) long local10 = Static41.aLongArray1[Static23.anInt351];
		Static41.aLongArray1[Static23.anInt351] = local6;
		@Pc(33) boolean local33;
		if (local10 == 0L || local6 <= local10) {
			local33 = false;
		} else {
			local33 = true;
		}
		Static23.anInt351 = Static23.anInt351 + 1 & 0x1F;
		synchronized (this) {
			Static397.aBoolean556 = Static187.aBoolean331;
		}
		this.method747();
	}

	@OriginalMember(owner = "client!om", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static138.aFrame2 == null) {
			return Static259.aClass177_2 == null || Static259.aClass177_2.anApplet1 == this ? super.getAppletContext() : Static259.aClass177_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!om", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	protected abstract void method738();

	@OriginalMember(owner = "client!om", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static138.aFrame2 == null) {
			return Static259.aClass177_2 == null || Static259.aClass177_2.anApplet1 == this ? super.getDocumentBase() : Static259.aClass177_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!om", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static265.anApplet_Sub1_1 == this && !Static34.aBoolean78) {
			Static224.aLong131 = 0L;
		}
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	public final void method739() {
		if (this.aBoolean112) {
			return;
		}
		try {
			@Pc(18) Class253 local18 = Static259.aClass177_2.method3833(Static265.anApplet_Sub1_1.getClass());
			while (local18.anInt6669 == 0) {
				Static331.method4343(100L);
			}
			if (local18.anObject9 != null) {
				throw (Throwable) local18.anObject9;
			}
			jagmisc.init();
			this.aBoolean112 = true;
			Static78.aClass20_3 = Static200.method2867();
		} catch (@Pc(43) Throwable local43) {
		}
	}

	@OriginalMember(owner = "client!om", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	protected abstract void method740();

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	protected abstract void method741();

	@OriginalMember(owner = "client!om", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	protected final void method742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static265.anApplet_Sub1_1 == null) {
				Static265.anApplet_Sub1_1 = this;
				Static286.anInt4795 = 601;
				Static232.anInt4198 = 0;
				Static192.anInt3532 = arg1;
				Static342.anInt5549 = arg1;
				Static351.anInt5682 = 0;
				Static40.anInt597 = arg0;
				Static455.anInt7239 = arg0;
				if (Static259.aClass177_2 == null) {
					Static457.aClass177_5 = Static259.aClass177_2 = new Class177(this, arg2, null, 0);
				}
				@Pc(65) Class253 local65 = Static259.aClass177_2.method3840(this, 1);
				while (local65.anInt6669 == 0) {
					Static331.method4343(10L);
				}
			} else {
				Static407.anInt6526++;
				if (Static407.anInt6526 >= 3) {
					this.method744("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(75) Throwable local75) {
			Static338.method4409(local75, null);
			this.method744("crash");
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
	private void method743(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static34.aBoolean78) {
				return;
			}
			Static34.aBoolean78 = true;
		}
		if (Static259.aClass177_2.anApplet1 != null) {
			Static259.aClass177_2.anApplet1.destroy();
		}
		try {
			this.method741();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean112) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean112 = false;
		}
		Static280.method3758();
		@Pc(61) Class253 local61 = Static259.aClass177_2.method3846(Static265.anApplet_Sub1_1.getClass());
		while (local61.anInt6669 == 0) {
			Static331.method4343(100L);
		}
		if (Static91.aCanvas2 != null) {
			try {
				Static91.aCanvas2.removeFocusListener(this);
				Static91.aCanvas2.getParent().remove(Static91.aCanvas2);
			} catch (@Pc(83) Exception local83) {
			}
		}
		if (Static259.aClass177_2 != null) {
			try {
				Static259.aClass177_2.method3829();
			} catch (@Pc(91) Exception local91) {
			}
		}
		this.method733();
		if (Static138.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(101) Throwable local101) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method744(@OriginalArg(1) String arg0) {
		if (this.aBoolean111) {
			return;
		}
		this.aBoolean111 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static466.method42("loggedout", Static259.aClass177_2.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!om", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static265.anApplet_Sub1_1 == this && !Static34.aBoolean78) {
			Static224.aLong131 = Static183.method2674() + 4000L;
		}
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)Z")
	protected final boolean method745() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.equals("jagex.com") || local13.endsWith(".jagex.com")) {
			return true;
		} else if (local13.equals("runescape.com") || local13.endsWith(".runescape.com")) {
			return true;
		} else if (local13.equals("stellardawn.com") || local13.endsWith(".stellardawn.com")) {
			return true;
		} else if (local13.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local13.length() > 0 && local13.charAt(local13.length() - 1) >= '0' && local13.charAt(local13.length() - 1) <= '9') {
				local13 = local13.substring(0, local13.length() - 1);
			}
			if (local13.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method744("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V")
	private void method746() {
		@Pc(14) long local14 = Static183.method2674();
		@Pc(18) long local18 = Static153.aLongArray3[Static25.anInt361];
		Static153.aLongArray3[Static25.anInt361] = local14;
		Static25.anInt361 = Static25.anInt361 + 1 & 0x1F;
		if (local18 != 0L && local18 < local14) {
			@Pc(42) int local42 = (int) (local14 - local18);
			Static218.anInt3991 = ((local42 >> 1) + 32000) / local42;
		}
		if (Static33.anInt499++ > 50) {
			Static69.aBoolean128 = true;
			Static33.anInt499 -= 50;
			Static91.aCanvas2.setSize(Static192.anInt3532, Static40.anInt597);
			Static91.aCanvas2.setVisible(true);
			if (Static138.aFrame2 != null && Static33.aFrame1 == null) {
				@Pc(79) Insets local79 = Static138.aFrame2.getInsets();
				Static91.aCanvas2.setLocation(local79.left + Static232.anInt4198, Static351.anInt5682 + local79.top);
			} else {
				Static91.aCanvas2.setLocation(Static232.anInt4198, Static351.anInt5682);
			}
		}
		this.method740();
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(B)V")
	protected abstract void method747();

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLjava/lang/String;IZIIII)V")
	protected final void method748(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static286.anInt4795 = 601;
			Static265.anApplet_Sub1_1 = this;
			Static232.anInt4198 = 0;
			Static192.anInt3532 = 1024;
			Static342.anInt5549 = 1024;
			Static351.anInt5682 = 0;
			Static40.anInt597 = 768;
			Static455.anInt7239 = 768;
			Static138.aFrame2 = new Frame();
			Static138.aFrame2.setTitle("Jagex");
			Static138.aFrame2.setResizable(true);
			Static138.aFrame2.addWindowListener(this);
			Static138.aFrame2.setVisible(true);
			Static138.aFrame2.toFront();
			@Pc(47) Insets local47 = Static138.aFrame2.getInsets();
			Static138.aFrame2.setSize(local47.left + Static342.anInt5549 + local47.right, local47.bottom + local47.top + Static455.anInt7239);
			Static457.aClass177_5 = Static259.aClass177_2 = new Class177(null, arg1, arg0, 30);
			@Pc(79) Class253 local79 = Static259.aClass177_2.method3840(this, 1);
			while (local79.anInt6669 == 0) {
				Static331.method4343(10L);
			}
		} catch (@Pc(92) Exception local92) {
			Static338.method4409(local92, null);
		}
	}

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(B)Ljava/lang/String;")
	public String method749() {
		return null;
	}
}
