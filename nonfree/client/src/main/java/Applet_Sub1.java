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

@OriginalClass("client!un")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Lclient!h;")
	public static final Class89 aClass89_42 = new Class89(57, 12);

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!un", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 13)
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 20)
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 28)
	public final synchronized void method1381() {
		if (Static21.aCanvas1 != null) {
			Static21.aCanvas1.removeFocusListener(this);
			Static21.aCanvas1.getParent().remove(Static21.aCanvas1);
		}
		@Pc(18) Container local18;
		if (Static338.aFrame2 != null) {
			local18 = Static338.aFrame2;
		} else if (Static207.aFrame1 == null) {
			local18 = Static305.aClass152_5.anApplet1;
		} else {
			local18 = Static207.aFrame1;
		}
		local18.setLayout(null);
		Static21.aCanvas1 = new Canvas_Sub1(this);
		local18.add(Static21.aCanvas1);
		Static21.aCanvas1.setSize(Static231.anInt4656, Static161.anInt3295);
		Static21.aCanvas1.setVisible(true);
		if (local18 == Static207.aFrame1) {
			@Pc(54) Insets local54 = Static207.aFrame1.getInsets();
			Static21.aCanvas1.setLocation(local54.left + Class63.anInt1840, local54.top + Class53.anInt1644);
		} else {
			Static21.aCanvas1.setLocation(Class63.anInt1840, Class53.anInt1644);
		}
		Static21.aCanvas1.addFocusListener(this);
		Static21.aCanvas1.requestFocus();
		Class173_Sub4.aBoolean475 = true;
		Static225.aBoolean306 = true;
		Class2_Sub2_Sub16.aBoolean412 = true;
		Class89.aBoolean176 = false;
		Class39.aLong37 = Static190.method3686();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 142)
	public final void method1384() {
		if (this.aBoolean94) {
			return;
		}
		try {
			@Pc(21) Class32 local21 = Static305.aClass152_5.method3753(Class170.anApplet_Sub1_1.getClass());
			while (local21.anInt992 == 0) {
				Static214.method4024(100L);
			}
			if (local21.anObject2 != null) {
				throw (Throwable) local21.anObject2;
			}
			jagmisc.init();
			this.aBoolean94 = true;
			Static293.aClass5_1 = Static61.method1740();
		} catch (@Pc(46) Throwable local46) {
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZIILjava/lang/String;II)V", line = 173)
	protected final void method1385(@OriginalArg(5) String arg0, @OriginalArg(7) int arg1) {
		try {
			Class63.anInt1840 = 0;
			Class170.anApplet_Sub1_1 = this;
			Static254.anInt5105 = 578;
			Static231.anInt4656 = 1024;
			Static133.anInt2660 = 1024;
			Static161.anInt3295 = 768;
			Static166.anInt2316 = 768;
			Class53.anInt1644 = 0;
			Static207.aFrame1 = new Frame();
			Static207.aFrame1.setTitle("Jagex");
			Static207.aFrame1.setResizable(true);
			Static207.aFrame1.addWindowListener(this);
			Static207.aFrame1.setVisible(true);
			Static207.aFrame1.toFront();
			@Pc(48) Insets local48 = Static207.aFrame1.getInsets();
			Static207.aFrame1.setSize(local48.right + local48.left + Static133.anInt2660, local48.bottom + local48.top + Static166.anInt2316);
			Static366.aClass152_6 = Static305.aClass152_5 = new Class152(null, arg1, arg0, 29);
			@Pc(82) Class32 local82 = Static305.aClass152_5.method3770(1, this);
			while (local82.anInt992 == 0) {
				Static214.method4024(10L);
			}
		} catch (@Pc(95) Exception local95) {
			Static241.method6254(local95, null);
		}
	}

	@OriginalMember(owner = "client!un", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 218)
	@Override
	public final URL getCodeBase() {
		if (Static207.aFrame1 == null) {
			return Static305.aClass152_5 == null || Static305.aClass152_5.anApplet1 == this ? super.getCodeBase() : Static305.aClass152_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 234)
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)Z", line = 251)
	protected final boolean method1390() {
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
				this.method1394("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 285)
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static207.aFrame1 == null) {
			return Static305.aClass152_5 == null || Static305.aClass152_5.anApplet1 == this ? super.getParameter(arg0) : Static305.aClass152_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 302)
	private void method1392() {
		@Pc(11) long local11 = Static190.method3686();
		@Pc(15) long local15 = Class49_Sub3.aLongArray9[Static235.anInt4694];
		Class49_Sub3.aLongArray9[Static235.anInt4694] = local11;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		Static235.anInt4694 = Static235.anInt4694 + 1 & 0x1F;
		synchronized (this) {
			Static225.aBoolean306 = Class173_Sub4.aBoolean475;
		}
		this.method1386();
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 334)
	private void method1393() {
		@Pc(6) long local6 = Static190.method3686();
		@Pc(10) long local10 = Class2_Sub3_Sub10_Sub1.aLongArray12[Static72.anInt1737];
		Class2_Sub3_Sub10_Sub1.aLongArray12[Static72.anInt1737] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(29) int local29 = (int) (local6 - local10);
			Class2_Sub2_Sub1.anInt62 = ((local29 >> 1) + 32000) / local29;
		}
		Static72.anInt1737 = Static72.anInt1737 + 1 & 0x1F;
		if (Class148.anInt3757++ > 50) {
			Class2_Sub2_Sub16.aBoolean412 = true;
			Class148.anInt3757 -= 50;
			Static21.aCanvas1.setSize(Static231.anInt4656, Static161.anInt3295);
			Static21.aCanvas1.setVisible(true);
			if (Static207.aFrame1 != null && Static338.aFrame2 == null) {
				@Pc(76) Insets local76 = Static207.aFrame1.getInsets();
				Static21.aCanvas1.setLocation(local76.left + Class63.anInt1840, Class53.anInt1644 + local76.top);
			} else {
				Static21.aCanvas1.setLocation(Class63.anInt1840, Class53.anInt1644);
			}
		}
		this.method1387();
	}

	@OriginalMember(owner = "client!un", name = "destroy", descriptor = "()V", line = 379)
	@Override
	public final void destroy() {
		if (Class170.anApplet_Sub1_1 == this && !Class80.aBoolean167) {
			Class252.aLong231 = Static190.method3686();
			Static214.method4024(5000L);
			Static366.aClass152_6 = null;
			this.method1397(false);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILjava/lang/String;)V", line = 395)
	protected final void method1394(@OriginalArg(1) String arg0) {
		if (this.aBoolean95) {
			return;
		}
		this.aBoolean95 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static391.method4629(Static305.aClass152_5.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!un", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 420)
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 433)
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 441)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!un", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 467)
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 478)
	@Override
	public final URL getDocumentBase() {
		if (Static207.aFrame1 == null) {
			return Static305.aClass152_5 == null || Static305.aClass152_5.anApplet1 == this ? super.getDocumentBase() : Static305.aClass152_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)V", line = 496)
	protected final void method1396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Class170.anApplet_Sub1_1 == null) {
				Static161.anInt3295 = arg2;
				Static166.anInt2316 = arg2;
				Static254.anInt5105 = 578;
				Class63.anInt1840 = 0;
				Class170.anApplet_Sub1_1 = this;
				Class53.anInt1644 = 0;
				Static231.anInt4656 = arg0;
				Static133.anInt2660 = arg0;
				if (Static305.aClass152_5 == null) {
					Static366.aClass152_6 = Static305.aClass152_5 = new Class152(this, arg1, null, 0);
				}
				@Pc(66) Class32 local66 = Static305.aClass152_5.method3770(1, this);
				while (local66.anInt992 == 0) {
					Static214.method4024(10L);
				}
			} else {
				Class241.anInt7019++;
				if (Class241.anInt7019 >= 3) {
					this.method1394("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			Static241.method6254(local76, null);
			this.method1394("crash");
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BZ)V", line = 543)
	private void method1397(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Class80.aBoolean167) {
				return;
			}
			Class80.aBoolean167 = true;
		}
		if (Static305.aClass152_5.anApplet1 != null) {
			Static305.aClass152_5.anApplet1.destroy();
		}
		try {
			this.method1388();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean94) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean94 = false;
		}
		@Pc(48) Class32 local48 = Static305.aClass152_5.method3772(Class170.anApplet_Sub1_1.getClass());
		while (local48.anInt992 == 0) {
			Static214.method4024(100L);
		}
		if (Static21.aCanvas1 != null) {
			try {
				Static21.aCanvas1.removeFocusListener(this);
				Static21.aCanvas1.getParent().remove(Static21.aCanvas1);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (Static305.aClass152_5 != null) {
			try {
				Static305.aClass152_5.method3769();
			} catch (@Pc(75) Exception local75) {
			}
		}
		this.method1391();
		if (Static207.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(89) Throwable local89) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!un", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 622)
	@Override
	public final AppletContext getAppletContext() {
		if (Static207.aFrame1 == null) {
			return Static305.aClass152_5 == null || Static305.aClass152_5.anApplet1 == this ? super.getAppletContext() : Static305.aClass152_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 638)
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Class173_Sub4.aBoolean475 = false;
	}

	@OriginalMember(owner = "client!un", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 646)
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!un", name = "run", descriptor = "()V", line = 654)
	@Override
	public final void run() {
		try {
			label112: {
				if (Static200.aString33 != null) {
					@Pc(10) String local10 = Static200.aString33.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static200.aString34;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1394("wrongjava");
							break label112;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static200.aString34 == null || Static200.aString34.equals("1.4.2"))) {
						this.method1394("wrongjava");
						break label112;
					}
				}
				@Pc(70) int local70;
				if (Static200.aString34 != null && Static200.aString34.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (local70 < Static200.aString34.length()) {
						@Pc(78) char local78 = Static200.aString34.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local78 + local72 * 10 - 48;
						local70++;
					}
					if (local72 >= 5) {
						Class2_Sub3_Sub38.aBoolean473 = true;
					}
				}
				if (Static305.aClass152_5.anApplet1 != null) {
					@Pc(111) Method local111 = Static200.aMethod2;
					if (local111 != null) {
						try {
							local111.invoke(Static305.aClass152_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static53.method1622();
				Static56.method886();
				this.method1381();
				this.method1389();
				Static293.aClass5_1 = Static61.method1740();
				this.method1384();
				while (Class252.aLong231 == 0L || Static190.method3686() < Class252.aLong231) {
					Static10.anInt247 = Static293.aClass5_1.method4410(Class2_Sub6.anInt1105);
					for (local70 = 0; local70 < Static10.anInt247; local70++) {
						this.method1392();
					}
					this.method1393();
					Static260.method4877(Static305.aClass152_5, Static21.aCanvas1);
				}
			}
		} catch (@Pc(179) Exception local179) {
			Static241.method6254(local179, null);
			this.method1394("crash");
		}
		this.method1397(true);
	}

	@OriginalMember(owner = "client!un", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 770)
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Class173_Sub4.aBoolean475 = true;
		Class2_Sub2_Sub16.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!un", name = "start", descriptor = "()V", line = 788)
	@Override
	public final void start() {
		if (Class170.anApplet_Sub1_1 == this && !Class80.aBoolean167) {
			Class252.aLong231 = 0L;
		}
	}

	@OriginalMember(owner = "client!un", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 802)
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Class170.anApplet_Sub1_1 != this || Class80.aBoolean167) {
			return;
		}
		Class2_Sub2_Sub16.aBoolean412 = true;
		if (Class2_Sub3_Sub38.aBoolean473 && Static190.method3686() - Class39.aLong37 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static133.anInt2660 <= local26.width && Static166.anInt2316 <= local26.height) {
				Class89.aBoolean176 = true;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "stop", descriptor = "()V", line = 827)
	@Override
	public final void stop() {
		if (Class170.anApplet_Sub1_1 == this && !Class80.aBoolean167) {
			Class252.aLong231 = Static190.method3686() + 4000L;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	protected abstract void method1386();

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	protected abstract void method1387();

	@OriginalMember(owner = "client!un", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	protected abstract void method1388();

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
	protected abstract void method1389();

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	protected abstract void method1391();
}
