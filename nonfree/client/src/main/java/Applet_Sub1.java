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

@OriginalClass("client!cm")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "[Lclient!wp;")
	public static final Class273[] aClass273Array2 = new Class273[5];

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "Z")
	private boolean aBoolean83 = false;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass273Array2.length; local4++) {
			aClass273Array2[local4] = new Class273();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	private void method1108() {
		@Pc(16) long local16 = Static167.method2929();
		@Pc(20) long local20 = Static464.aLongArray8[Static9.anInt195];
		Static464.aLongArray8[Static9.anInt195] = local16;
		@Pc(39) boolean local39;
		if (local20 == 0L || local20 >= local16) {
			local39 = false;
		} else {
			local39 = true;
		}
		Static9.anInt195 = Static9.anInt195 + 1 & 0x1F;
		synchronized (this) {
			Static155.aBoolean211 = Static356.aBoolean464;
		}
		this.method1119();
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	protected abstract void method1109();

	@OriginalMember(owner = "client!cm", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static356.aBoolean464 = true;
		Static384.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	protected abstract void method1110();

	@OriginalMember(owner = "client!cm", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static258.anApplet_Sub1_4 != this || Static119.aBoolean171) {
			return;
		}
		Static384.aBoolean487 = true;
		if (Static444.aBoolean557 && Static167.method2929() - Static344.aLong178 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || Static448.anInt7687 <= local23.width && Static4.anInt50 <= local23.height) {
				Static84.aBoolean583 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!cm", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
	private void method1112() {
		@Pc(6) long local6 = Static167.method2929();
		@Pc(10) long local10 = Static271.aLongArray6[Static148.anInt6292];
		Static271.aLongArray6[Static148.anInt6292] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(27) int local27 = (int) (local6 - local10);
			Static286.anInt5318 = ((local27 >> 1) + 32000) / local27;
		}
		Static148.anInt6292 = Static148.anInt6292 + 1 & 0x1F;
		if (Static460.anInt7831++ > 50) {
			Static460.anInt7831 -= 50;
			Static384.aBoolean487 = true;
			Static409.aCanvas7.setSize(Static374.anInt6595, Static30.anInt518);
			Static409.aCanvas7.setVisible(true);
			if (Static97.aFrame1 != null && Static124.aFrame2 == null) {
				@Pc(71) Insets local71 = Static97.aFrame1.getInsets();
				Static409.aCanvas7.setLocation(local71.left + Static331.anInt5897, Static464.anInt7952 + local71.top);
			} else {
				Static409.aCanvas7.setLocation(Static331.anInt5897, Static464.anInt7952);
			}
		}
		this.method1109();
	}

	@OriginalMember(owner = "client!cm", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Z")
	protected final boolean method1113() {
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
				this.method1118("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)V")
	protected abstract void method1114();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1115() {
		return null;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBZIILjava/lang/String;II)V")
	protected final void method1116(@OriginalArg(0) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static30.anInt518 = 768;
			Static4.anInt50 = 768;
			Static331.anInt5897 = 0;
			Static202.anInt3962 = 604;
			Static374.anInt6595 = 1024;
			Static448.anInt7687 = 1024;
			Static258.anApplet_Sub1_4 = this;
			Static464.anInt7952 = 0;
			Static97.aFrame1 = new Frame();
			Static97.aFrame1.setTitle("Jagex");
			Static97.aFrame1.setResizable(true);
			Static97.aFrame1.addWindowListener(this);
			Static97.aFrame1.setVisible(true);
			Static97.aFrame1.toFront();
			@Pc(38) Insets local38 = Static97.aFrame1.getInsets();
			Static97.aFrame1.setSize(Static448.anInt7687 + local38.left + local38.right, Static4.anInt50 - -local38.top + local38.bottom);
			Static114.aClass255_2 = Static390.aClass255_5 = new Class255(null, arg0, arg1, 30);
			@Pc(76) Class87 local76 = Static390.aClass255_5.method5820(this, 1);
			while (local76.anInt2679 == 0) {
				Static77.method1653(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static417.method5814(local86, null);
		}
	}

	@OriginalMember(owner = "client!cm", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static419.aString69 != null) {
					@Pc(6) String local6 = Static419.aString69.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(18) String local18 = Static419.aString72;
						if (local18.equals("1.1") || local18.startsWith("1.1.") || local18.equals("1.2") || local18.startsWith("1.2.")) {
							this.method1118("wrongjava");
							break label113;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static419.aString72 == null || Static419.aString72.equals("1.4.2"))) {
						this.method1118("wrongjava");
						break label113;
					}
				}
				@Pc(66) int local66;
				if (Static419.aString72 != null && Static419.aString72.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (Static419.aString72.length() > local66) {
						@Pc(74) char local74 = Static419.aString72.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local68 = local74 + local68 * 10 - 48;
						local66++;
					}
					if (local68 >= 5) {
						Static444.aBoolean557 = true;
					}
				}
				if (Static390.aClass255_5.anApplet1 != null) {
					@Pc(111) Method local111 = Static419.aMethod2;
					if (local111 != null) {
						try {
							local111.invoke(Static390.aClass255_5.anApplet1, Boolean.TRUE);
						} catch (@Pc(126) Throwable local126) {
						}
					}
				}
				Static259.method4225();
				Static207.method3650();
				this.method1117();
				this.method1122();
				this.method1124();
				Static151.aClass89_1 = Static430.method5923();
				this.method1122();
				while (Static55.aLong33 == 0L || Static167.method2929() < Static55.aLong33) {
					Static143.anInt2937 = Static151.aClass89_1.method3423(Static461.anInt5546);
					for (local66 = 0; local66 < Static143.anInt2937; local66++) {
						this.method1108();
					}
					this.method1112();
					Static220.method3814(Static409.aCanvas7, Static390.aClass255_5);
				}
			}
		} catch (@Pc(182) Throwable local182) {
			Static417.method5814(local182, this.method1115());
			this.method1118("crash");
		}
		this.method1121(true);
	}

	@OriginalMember(owner = "client!cm", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static356.aBoolean464 = false;
	}

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)V")
	public final synchronized void method1117() {
		if (Static409.aCanvas7 != null) {
			Static409.aCanvas7.removeFocusListener(this);
			Static409.aCanvas7.getParent().remove(Static409.aCanvas7);
		}
		@Pc(21) Container local21;
		if (Static124.aFrame2 != null) {
			local21 = Static124.aFrame2;
		} else if (Static97.aFrame1 == null) {
			local21 = Static390.aClass255_5.anApplet1;
		} else {
			local21 = Static97.aFrame1;
		}
		local21.setLayout(null);
		Static409.aCanvas7 = new Canvas_Sub1(this);
		local21.add(Static409.aCanvas7);
		Static409.aCanvas7.setSize(Static374.anInt6595, Static30.anInt518);
		Static409.aCanvas7.setVisible(true);
		if (Static97.aFrame1 == local21) {
			@Pc(54) Insets local54 = Static97.aFrame1.getInsets();
			Static409.aCanvas7.setLocation(local54.left + Static331.anInt5897, Static464.anInt7952 + local54.top);
		} else {
			Static409.aCanvas7.setLocation(Static331.anInt5897, Static464.anInt7952);
		}
		Static409.aCanvas7.addFocusListener(this);
		Static409.aCanvas7.requestFocus();
		Static155.aBoolean211 = true;
		Static356.aBoolean464 = true;
		Static384.aBoolean487 = true;
		Static84.aBoolean583 = false;
		Static344.aLong178 = Static167.method2929();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1118(@OriginalArg(0) String arg0) {
		if (this.aBoolean84) {
			return;
		}
		this.aBoolean84 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static476.method5363(Static390.aClass255_5.anApplet1, "loggedout");
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V")
	protected abstract void method1119();

	@OriginalMember(owner = "client!cm", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
	private void method1121(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static119.aBoolean171) {
				return;
			}
			Static119.aBoolean171 = true;
		}
		if (Static390.aClass255_5.anApplet1 != null) {
			Static390.aClass255_5.anApplet1.destroy();
		}
		try {
			this.method1114();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean83) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean83 = false;
		}
		Static36.method524();
		@Pc(51) Class87 local51 = Static390.aClass255_5.method5827(Static258.anApplet_Sub1_4.getClass());
		while (local51.anInt2679 == 0) {
			Static77.method1653(100L);
		}
		if (Static409.aCanvas7 != null) {
			try {
				Static409.aCanvas7.removeFocusListener(this);
				Static409.aCanvas7.getParent().remove(Static409.aCanvas7);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Static390.aClass255_5 != null) {
			try {
				Static390.aClass255_5.method5835();
			} catch (@Pc(81) Exception local81) {
			}
		}
		this.method1110();
		if (Static97.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(97) Throwable local97) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!cm", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static97.aFrame1 == null) {
			return Static390.aClass255_5 == null || Static390.aClass255_5.anApplet1 == this ? super.getDocumentBase() : Static390.aClass255_5.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "(I)V")
	public final void method1122() {
		if (this.aBoolean83) {
			return;
		}
		try {
			@Pc(19) Class87 local19 = Static390.aClass255_5.method5845(Static258.anApplet_Sub1_4.getClass());
			while (local19.anInt2679 == 0) {
				Static77.method1653(100L);
			}
			if (local19.anObject3 != null) {
				throw (Throwable) local19.anObject3;
			}
			jagmisc.init();
			this.aBoolean83 = true;
			Static151.aClass89_1 = Static430.method5923();
		} catch (@Pc(49) Throwable local49) {
		}
	}

	@OriginalMember(owner = "client!cm", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static97.aFrame1 == null) {
			return Static390.aClass255_5 == null || Static390.aClass255_5.anApplet1 == this ? super.getParameter(arg0) : Static390.aClass255_5.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static258.anApplet_Sub1_4 == this && !Static119.aBoolean171) {
			Static55.aLong33 = Static167.method2929() + 4000L;
		}
	}

	@OriginalMember(owner = "client!cm", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static97.aFrame1 == null) {
			return Static390.aClass255_5 == null || Static390.aClass255_5.anApplet1 == this ? super.getCodeBase() : Static390.aClass255_5.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static97.aFrame1 == null) {
			return Static390.aClass255_5 == null || Static390.aClass255_5.anApplet1 == this ? super.getAppletContext() : Static390.aClass255_5.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static258.anApplet_Sub1_4 == this && !Static119.aBoolean171) {
			Static55.aLong33 = 0L;
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
	protected abstract void method1124();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIB)V")
	protected final void method1125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (Static258.anApplet_Sub1_4 == null) {
				Static464.anInt7952 = 0;
				Static30.anInt518 = arg0;
				Static4.anInt50 = arg0;
				Static331.anInt5897 = 0;
				Static258.anApplet_Sub1_4 = this;
				Static202.anInt3962 = 604;
				Static374.anInt6595 = arg2;
				Static448.anInt7687 = arg2;
				if (Static390.aClass255_5 == null) {
					Static114.aClass255_2 = Static390.aClass255_5 = new Class255(this, arg1, null, 0);
				}
				@Pc(62) Class87 local62 = Static390.aClass255_5.method5820(this, 1);
				while (local62.anInt2679 == 0) {
					Static77.method1653(10L);
				}
			} else {
				Static261.anInt4998++;
				if (Static261.anInt4998 >= 3) {
					this.method1118("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static417.method5814(local80, null);
			this.method1118("crash");
		}
	}

	@OriginalMember(owner = "client!cm", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static258.anApplet_Sub1_4 == this && !Static119.aBoolean171) {
			Static55.aLong33 = Static167.method2929();
			Static77.method1653(5000L);
			Static114.aClass255_2 = null;
			this.method1121(false);
		}
	}

	@OriginalMember(owner = "client!cm", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}
}
