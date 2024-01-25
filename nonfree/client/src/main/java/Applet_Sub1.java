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

@OriginalClass("client!wk")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!wk", name = "C", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method840() {
		return null;
	}

	@OriginalMember(owner = "client!wk", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	protected abstract void method841();

	@OriginalMember(owner = "client!wk", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static393.aFrame2 == null) {
			return Static138.aClass194_2 == null || Static138.aClass194_2.anApplet1 == this ? super.getDocumentBase() : Static138.aClass194_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!wk", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static10.anApplet_Sub1_1 == this && !Static329.aBoolean415) {
			Static252.aLong212 = 0L;
		}
	}

	@OriginalMember(owner = "client!wk", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static10.anApplet_Sub1_1 == this && !Static329.aBoolean415) {
			Static252.aLong212 = Static432.method5870() + 4000L;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method842(@OriginalArg(0) String arg0) {
		if (this.aBoolean49) {
			return;
		}
		this.aBoolean49 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static471.method4356(Static138.aClass194_2.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!wk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	protected abstract void method843();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
	protected final boolean method846() {
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
				this.method842("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static307.aString52 != null) {
					@Pc(10) String local10 = Static307.aString52.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(42) String local42 = Static307.aString46;
						if (local42.equals("1.1") || local42.startsWith("1.1.") || local42.equals("1.2") || local42.startsWith("1.2.")) {
							this.method842("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static307.aString46 == null || Static307.aString46.equals("1.4.2"))) {
						this.method842("wrongjava");
						break label107;
					}
				}
				@Pc(72) int local72;
				if (Static307.aString46 != null && Static307.aString46.startsWith("1.")) {
					local72 = 2;
					@Pc(74) int local74 = 0;
					while (local72 < Static307.aString46.length()) {
						@Pc(80) char local80 = Static307.aString46.charAt(local72);
						if (local80 < '0' || local80 > '9') {
							break;
						}
						local74 = local74 * 10 + local80 - 48;
						local72++;
					}
					if (local74 >= 5) {
						Static429.aBoolean495 = true;
					}
				}
				if (Static138.aClass194_2.anApplet1 != null) {
					@Pc(115) Method local115 = Static307.aMethod1;
					if (local115 != null) {
						try {
							local115.invoke(Static138.aClass194_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(130) Throwable local130) {
						}
					}
				}
				Static366.method5129();
				Static231.method3122();
				this.method856();
				this.method852();
				this.method848();
				Static64.aClass99_1 = Static386.method5782();
				this.method852();
				while (Static252.aLong212 == 0L || Static432.method5870() < Static252.aLong212) {
					Static204.anInt3497 = Static64.aClass99_1.method5656(Static66.anInt1152);
					for (local72 = 0; local72 < Static204.anInt3497; local72++) {
						this.method857();
					}
					this.method850();
					Static191.method2758(Static138.aClass194_2, Static291.aCanvas6);
				}
			}
		} catch (@Pc(190) Throwable local190) {
			Static22.method402(local190, this.method840());
			this.method842("crash");
		}
		this.method854(true);
	}

	@OriginalMember(owner = "client!wk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static370.aBoolean443 = true;
		Static448.aBoolean509 = true;
	}

	@OriginalMember(owner = "client!wk", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!wk", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static10.anApplet_Sub1_1 == this && !Static329.aBoolean415) {
			Static252.aLong212 = Static432.method5870();
			Static167.method6157(5000L);
			Static243.aClass194_4 = null;
			this.method854(false);
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
	protected abstract void method848();

	@OriginalMember(owner = "client!wk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static370.aBoolean443 = false;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
	protected final void method849(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static10.anApplet_Sub1_1 == null) {
				Static344.anInt6105 = arg2;
				Static268.anInt4657 = arg2;
				Static49.anInt789 = arg0;
				Static119.anInt2042 = arg0;
				Static226.anInt3803 = 0;
				Static441.anInt7393 = 600;
				Static124.anInt2074 = 0;
				Static10.anApplet_Sub1_1 = this;
				if (Static138.aClass194_2 == null) {
					Static243.aClass194_4 = Static138.aClass194_2 = new Class194(this, arg1, null, 0);
				}
				@Pc(60) Class136 local60 = Static138.aClass194_2.method4393(this, 1);
				while (local60.anInt3418 == 0) {
					Static167.method6157(10L);
				}
			} else {
				Static157.anInt2856++;
				if (Static157.anInt2856 >= 3) {
					this.method842("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(73) Throwable local73) {
			Static22.method402(local73, null);
			this.method842("crash");
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)V")
	private void method850() {
		@Pc(6) long local6 = Static432.method5870();
		@Pc(10) long local10 = Static389.aLongArray5[Static157.anInt2857];
		Static389.aLongArray5[Static157.anInt2857] = local6;
		Static157.anInt2857 = Static157.anInt2857 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(33) int local33 = (int) (local6 - local10);
			Static431.anInt7307 = ((local33 >> 1) + 32000) / local33;
		}
		if (Static368.anInt7770++ > 50) {
			Static448.aBoolean509 = true;
			Static368.anInt7770 -= 50;
			Static291.aCanvas6.setSize(Static49.anInt789, Static344.anInt6105);
			Static291.aCanvas6.setVisible(true);
			if (Static393.aFrame2 != null && Static50.aFrame1 == null) {
				@Pc(72) Insets local72 = Static393.aFrame2.getInsets();
				Static291.aCanvas6.setLocation(Static124.anInt2074 + local72.left, local72.top + Static226.anInt3803);
			} else {
				Static291.aCanvas6.setLocation(Static124.anInt2074, Static226.anInt3803);
			}
		}
		this.method843();
	}

	@OriginalMember(owner = "client!wk", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static393.aFrame2 == null) {
			return Static138.aClass194_2 == null || Static138.aClass194_2.anApplet1 == this ? super.getAppletContext() : Static138.aClass194_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public final void method852() {
		if (this.aBoolean50) {
			return;
		}
		try {
			@Pc(14) Class136 local14 = Static138.aClass194_2.method4400(Static10.anApplet_Sub1_1.getClass());
			while (local14.anInt3418 == 0) {
				Static167.method6157(100L);
			}
			if (local14.anObject10 != null) {
				throw (Throwable) local14.anObject10;
			}
			jagmisc.init();
			this.aBoolean50 = true;
			Static64.aClass99_1 = Static386.method5782();
		} catch (@Pc(39) Throwable local39) {
		}
	}

	@OriginalMember(owner = "client!wk", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static393.aFrame2 == null) {
			return Static138.aClass194_2 == null || Static138.aClass194_2.anApplet1 == this ? super.getCodeBase() : Static138.aClass194_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
	protected abstract void method853();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZ)V")
	private void method854(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static329.aBoolean415) {
				return;
			}
			Static329.aBoolean415 = true;
		}
		if (Static138.aClass194_2.anApplet1 != null) {
			Static138.aClass194_2.anApplet1.destroy();
		}
		try {
			this.method853();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean50) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean50 = false;
		}
		Static60.method968();
		@Pc(59) Class136 local59 = Static138.aClass194_2.method4407(Static10.anApplet_Sub1_1.getClass());
		while (local59.anInt3418 == 0) {
			Static167.method6157(100L);
		}
		if (Static291.aCanvas6 != null) {
			try {
				Static291.aCanvas6.removeFocusListener(this);
				Static291.aCanvas6.getParent().remove(Static291.aCanvas6);
			} catch (@Pc(78) Exception local78) {
			}
		}
		if (Static138.aClass194_2 != null) {
			try {
				Static138.aClass194_2.method4413();
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.method841();
		if (Static393.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(96) Throwable local96) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!wk", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static393.aFrame2 == null) {
			return Static138.aClass194_2 == null || Static138.aClass194_2.anApplet1 == this ? super.getParameter(arg0) : Static138.aClass194_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIZILjava/lang/String;I)V")
	protected final void method855(@OriginalArg(1) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static226.anInt3803 = 0;
			Static10.anApplet_Sub1_1 = this;
			Static344.anInt6105 = 768;
			Static268.anInt4657 = 768;
			Static124.anInt2074 = 0;
			Static49.anInt789 = 1024;
			Static119.anInt2042 = 1024;
			Static441.anInt7393 = 600;
			Static393.aFrame2 = new Frame();
			Static393.aFrame2.setTitle("Jagex");
			Static393.aFrame2.setResizable(true);
			Static393.aFrame2.addWindowListener(this);
			Static393.aFrame2.setVisible(true);
			Static393.aFrame2.toFront();
			@Pc(38) Insets local38 = Static393.aFrame2.getInsets();
			Static393.aFrame2.setSize(local38.right + Static119.anInt2042 + local38.left, local38.bottom + local38.top + Static268.anInt4657);
			Static243.aClass194_4 = Static138.aClass194_2 = new Class194(null, arg0, arg1, 30);
			@Pc(71) Class136 local71 = Static138.aClass194_2.method4393(this, 1);
			while (local71.anInt3418 == 0) {
				Static167.method6157(10L);
			}
		} catch (@Pc(81) Exception local81) {
			Static22.method402(local81, null);
		}
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
	public final synchronized void method856() {
		if (Static291.aCanvas6 != null) {
			Static291.aCanvas6.removeFocusListener(this);
			Static291.aCanvas6.getParent().remove(Static291.aCanvas6);
		}
		@Pc(21) Container local21;
		if (Static50.aFrame1 != null) {
			local21 = Static50.aFrame1;
		} else if (Static393.aFrame2 == null) {
			local21 = Static138.aClass194_2.anApplet1;
		} else {
			local21 = Static393.aFrame2;
		}
		local21.setLayout(null);
		Static291.aCanvas6 = new Canvas_Sub1(this);
		local21.add(Static291.aCanvas6);
		Static291.aCanvas6.setSize(Static49.anInt789, Static344.anInt6105);
		Static291.aCanvas6.setVisible(true);
		if (local21 == Static393.aFrame2) {
			@Pc(60) Insets local60 = Static393.aFrame2.getInsets();
			Static291.aCanvas6.setLocation(Static124.anInt2074 + local60.left, Static226.anInt3803 + local60.top);
		} else {
			Static291.aCanvas6.setLocation(Static124.anInt2074, Static226.anInt3803);
		}
		Static291.aCanvas6.addFocusListener(this);
		Static291.aCanvas6.requestFocus();
		Static370.aBoolean443 = true;
		Static159.aBoolean182 = true;
		Static448.aBoolean509 = true;
		Static400.aBoolean463 = false;
		Static450.aLong400 = Static432.method5870();
	}

	@OriginalMember(owner = "client!wk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static10.anApplet_Sub1_1 != this || Static329.aBoolean415) {
			return;
		}
		Static448.aBoolean509 = true;
		if (Static429.aBoolean495 && Static432.method5870() - Static450.aLong400 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static119.anInt2042 && Static268.anInt4657 <= local26.height) {
				Static400.aBoolean463 = true;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
	private void method857() {
		@Pc(14) long local14 = Static432.method5870();
		@Pc(18) long local18 = Static277.aLongArray3[Static345.anInt6112];
		Static277.aLongArray3[Static345.anInt6112] = local14;
		@Pc(37) boolean local37;
		if (local18 == 0L || local18 >= local14) {
			local37 = false;
		} else {
			local37 = true;
		}
		Static345.anInt6112 = Static345.anInt6112 + 1 & 0x1F;
		synchronized (this) {
			Static159.aBoolean182 = Static370.aBoolean443;
		}
		this.method858();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	protected abstract void method858();
}
