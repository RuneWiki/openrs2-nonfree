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

@OriginalClass("client!io")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Z")
	private boolean aBoolean114 = false;

	static {
		new Class119("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!io", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static446.anApplet_Sub1_1 == this && !Static412.aBoolean743) {
			Static3.aLong174 = 0L;
		}
	}

	@OriginalMember(owner = "client!io", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static411.aFrame2 == null) {
			return Static183.aClass83_2 == null || Static183.aClass83_2.anApplet1 == this ? super.getParameter(arg0) : Static183.aClass83_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static411.aFrame2 == null) {
			return Static183.aClass83_2 == null || Static183.aClass83_2.anApplet1 == this ? super.getAppletContext() : Static183.aClass83_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static411.aFrame2 == null) {
			return Static183.aClass83_2 == null || Static183.aClass83_2.anApplet1 == this ? super.getDocumentBase() : Static183.aClass83_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	protected abstract void method943();

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	private void method944() {
		@Pc(6) long local6 = Static27.method359();
		@Pc(10) long local10 = Static153.aLongArray5[Static398.anInt3313];
		Static153.aLongArray5[Static398.anInt3313] = local6;
		Static398.anInt3313 = Static398.anInt3313 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(36) int local36 = (int) (local6 - local10);
			Static37.anInt673 = ((local36 >> 1) + 32000) / local36;
		}
		if (Static219.anInt3925++ > 50) {
			Static388.aBoolean709 = true;
			Static219.anInt3925 -= 50;
			Static392.aCanvas5.setSize(Static69.anInt1304, Static338.anInt5777);
			Static392.aCanvas5.setVisible(true);
			if (Static411.aFrame2 != null && Static90.aFrame1 == null) {
				@Pc(77) Insets local77 = Static411.aFrame2.getInsets();
				Static392.aCanvas5.setLocation(Static335.anInt5705 + local77.left, local77.top - -Static51.anInt869);
			} else {
				Static392.aCanvas5.setLocation(Static335.anInt5705, Static51.anInt869);
			}
		}
		this.method943();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method945(@OriginalArg(1) String arg0) {
		if (this.aBoolean113) {
			return;
		}
		this.aBoolean113 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static461.method3101(Static183.aClass83_2.anApplet1, "loggedout");
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)V")
	private void method946(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static412.aBoolean743) {
				return;
			}
			Static412.aBoolean743 = true;
		}
		if (Static183.aClass83_2.anApplet1 != null) {
			Static183.aClass83_2.anApplet1.destroy();
		}
		try {
			this.method949();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean114) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean114 = false;
		}
		Static314.method4251();
		@Pc(56) Class232 local56 = Static183.aClass83_2.method1874(Static446.anApplet_Sub1_1.getClass());
		while (local56.anInt6402 == 0) {
			Static223.method4582(100L);
		}
		if (Static392.aCanvas5 != null) {
			try {
				Static392.aCanvas5.removeFocusListener(this);
				Static392.aCanvas5.getParent().remove(Static392.aCanvas5);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static183.aClass83_2 != null) {
			try {
				Static183.aClass83_2.method1863();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method950();
		if (Static411.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!io", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label112: {
				if (Static117.aString29 != null) {
					@Pc(10) String local10 = Static117.aString29.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static117.aString28;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method945("wrongjava");
							break label112;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static117.aString28 == null || Static117.aString28.equals("1.4.2"))) {
						this.method945("wrongjava");
						break label112;
					}
				}
				@Pc(71) int local71;
				if (Static117.aString28 != null && Static117.aString28.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static117.aString28.length()) {
						@Pc(79) char local79 = Static117.aString28.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local71++;
						local73 = local73 * 10 + local79 - 48;
					}
					if (local73 >= 5) {
						Static399.aBoolean731 = true;
					}
				}
				if (Static183.aClass83_2.anApplet1 != null) {
					@Pc(114) Method local114 = Static117.aMethod2;
					if (local114 != null) {
						try {
							local114.invoke(Static183.aClass83_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static311.method4233();
				Static261.method3691();
				this.method957();
				this.method947();
				this.method958();
				Static36.aClass37_3 = Static368.method4887();
				this.method947();
				while (Static3.aLong174 == 0L || Static3.aLong174 > Static27.method359()) {
					Static418.anInt7122 = Static36.aClass37_3.method4753(Static32.anInt526);
					for (local71 = 0; local71 < Static418.anInt7122; local71++) {
						this.method956();
					}
					this.method944();
					Static55.method975(Static392.aCanvas5, Static183.aClass83_2);
				}
			}
		} catch (@Pc(193) Throwable local193) {
			Static55.method972(local193, this.method953());
			this.method945("crash");
		}
		this.method946(true);
	}

	@OriginalMember(owner = "client!io", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static446.anApplet_Sub1_1 != this || Static412.aBoolean743) {
			return;
		}
		Static388.aBoolean709 = true;
		if (Static399.aBoolean731 && Static27.method359() - Static293.aLong154 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static187.anInt3236 && Static285.anInt5014 <= local24.height) {
				Static325.aBoolean631 = true;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!io", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static446.anApplet_Sub1_1 == this && !Static412.aBoolean743) {
			Static3.aLong174 = Static27.method359() + 4000L;
		}
	}

	@OriginalMember(owner = "client!io", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static446.anApplet_Sub1_1 == this && !Static412.aBoolean743) {
			Static3.aLong174 = Static27.method359();
			Static223.method4582(5000L);
			Static440.aClass83_5 = null;
			this.method946(false);
		}
	}

	@OriginalMember(owner = "client!io", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static411.aFrame2 == null) {
			return Static183.aClass83_2 == null || Static183.aClass83_2.anApplet1 == this ? super.getCodeBase() : Static183.aClass83_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!io", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static348.aBoolean679 = true;
		Static388.aBoolean709 = true;
	}

	@OriginalMember(owner = "client!io", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
	public final void method947() {
		if (this.aBoolean114) {
			return;
		}
		try {
			@Pc(14) Class232 local14 = Static183.aClass83_2.method1858(Static446.anApplet_Sub1_1.getClass());
			while (local14.anInt6402 == 0) {
				Static223.method4582(100L);
			}
			if (local14.anObject8 != null) {
				throw (Throwable) local14.anObject8;
			}
			jagmisc.init();
			this.aBoolean114 = true;
			Static36.aClass37_3 = Static368.method4887();
		} catch (@Pc(39) Throwable local39) {
		}
	}

	@OriginalMember(owner = "client!io", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Z")
	protected final boolean method948() {
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
				this.method945("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V")
	protected abstract void method949();

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	protected abstract void method950();

	@OriginalMember(owner = "client!io", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static348.aBoolean679 = false;
	}

	@OriginalMember(owner = "client!io", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!io", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
	protected abstract void method952();

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)Ljava/lang/String;")
	protected String method953() {
		return null;
	}

	@OriginalMember(owner = "client!io", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZIIIIILjava/lang/String;)V")
	protected final void method954(@OriginalArg(5) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static51.anInt869 = 0;
			Static338.anInt5777 = 768;
			Static285.anInt5014 = 768;
			Static335.anInt5705 = 0;
			Static446.anApplet_Sub1_1 = this;
			Static69.anInt1304 = 1024;
			Static187.anInt3236 = 1024;
			Static259.anInt4686 = 596;
			Static411.aFrame2 = new Frame();
			Static411.aFrame2.setTitle("Jagex");
			Static411.aFrame2.setResizable(true);
			Static411.aFrame2.addWindowListener(this);
			Static411.aFrame2.setVisible(true);
			Static411.aFrame2.toFront();
			@Pc(48) Insets local48 = Static411.aFrame2.getInsets();
			Static411.aFrame2.setSize(local48.right + local48.left + Static187.anInt3236, local48.bottom + Static285.anInt5014 + local48.top);
			Static440.aClass83_5 = Static183.aClass83_2 = new Class83(null, arg0, arg1, 30);
			@Pc(80) Class232 local80 = Static183.aClass83_2.method1865(this, 1);
			while (local80.anInt6402 == 0) {
				Static223.method4582(10L);
			}
		} catch (@Pc(93) Exception local93) {
			Static55.method972(local93, null);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	protected final void method955(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static446.anApplet_Sub1_1 == null) {
				Static335.anInt5705 = 0;
				Static338.anInt5777 = arg1;
				Static285.anInt5014 = arg1;
				Static446.anApplet_Sub1_1 = this;
				Static51.anInt869 = 0;
				Static259.anInt4686 = 596;
				Static69.anInt1304 = arg2;
				Static187.anInt3236 = arg2;
				if (Static183.aClass83_2 == null) {
					Static440.aClass83_5 = Static183.aClass83_2 = new Class83(this, arg0, null, 0);
				}
				@Pc(60) Class232 local60 = Static183.aClass83_2.method1865(this, 1);
				while (local60.anInt6402 == 0) {
					Static223.method4582(10L);
				}
			} else {
				Static87.anInt6712++;
				if (Static87.anInt6712 >= 3) {
					this.method945("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(70) Throwable local70) {
			Static55.method972(local70, null);
			this.method945("crash");
		}
	}

	@OriginalMember(owner = "client!io", name = "e", descriptor = "(I)V")
	private void method956() {
		@Pc(12) long local12 = Static27.method359();
		@Pc(16) long local16 = Static213.aLongArray2[Static214.anInt3819];
		Static213.aLongArray2[Static214.anInt3819] = local12;
		Static214.anInt3819 = Static214.anInt3819 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local16 == 0L || local12 <= local16) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static138.aBoolean285 = Static348.aBoolean679;
		}
		this.method952();
	}

	@OriginalMember(owner = "client!io", name = "f", descriptor = "(I)V")
	public final synchronized void method957() {
		if (Static392.aCanvas5 != null) {
			Static392.aCanvas5.removeFocusListener(this);
			Static392.aCanvas5.getParent().remove(Static392.aCanvas5);
		}
		@Pc(21) Container local21;
		if (Static90.aFrame1 != null) {
			local21 = Static90.aFrame1;
		} else if (Static411.aFrame2 == null) {
			local21 = Static183.aClass83_2.anApplet1;
		} else {
			local21 = Static411.aFrame2;
		}
		local21.setLayout(null);
		Static392.aCanvas5 = new Canvas_Sub1(this);
		local21.add(Static392.aCanvas5);
		Static392.aCanvas5.setSize(Static69.anInt1304, Static338.anInt5777);
		Static392.aCanvas5.setVisible(true);
		if (Static411.aFrame2 == local21) {
			@Pc(54) Insets local54 = Static411.aFrame2.getInsets();
			Static392.aCanvas5.setLocation(local54.left + Static335.anInt5705, Static51.anInt869 + local54.top);
		} else {
			Static392.aCanvas5.setLocation(Static335.anInt5705, Static51.anInt869);
		}
		Static392.aCanvas5.addFocusListener(this);
		Static392.aCanvas5.requestFocus();
		Static348.aBoolean679 = true;
		Static138.aBoolean285 = true;
		Static388.aBoolean709 = true;
		Static325.aBoolean631 = false;
		Static293.aLong154 = Static27.method359();
	}

	@OriginalMember(owner = "client!io", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!io", name = "g", descriptor = "(I)V")
	protected abstract void method958();

	@OriginalMember(owner = "client!io", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
