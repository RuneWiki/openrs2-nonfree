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

@OriginalClass("client!qn")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!qn", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static132.aFrame2 == null) {
			return Static531.aClass283_6 == null || Static531.aClass283_6.anApplet1 == this ? super.getAppletContext() : Static531.aClass283_6.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static132.aFrame2 == null) {
			return Static531.aClass283_6 == null || Static531.aClass283_6.anApplet1 == this ? super.getDocumentBase() : Static531.aClass283_6.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public final synchronized void method1218() {
		if (Static517.aCanvas14 != null) {
			Static517.aCanvas14.removeFocusListener(this);
			Static517.aCanvas14.getParent().remove(Static517.aCanvas14);
		}
		@Pc(21) Container local21;
		if (Static36.aFrame1 != null) {
			local21 = Static36.aFrame1;
		} else if (Static132.aFrame2 == null) {
			local21 = Static531.aClass283_6.anApplet1;
		} else {
			local21 = Static132.aFrame2;
		}
		local21.setLayout(null);
		Static517.aCanvas14 = new Canvas_Sub1(this);
		local21.add(Static517.aCanvas14);
		Static517.aCanvas14.setSize(Static461.anInt8348, Static223.anInt3996);
		Static517.aCanvas14.setVisible(true);
		if (Static132.aFrame2 == local21) {
			@Pc(60) Insets local60 = Static132.aFrame2.getInsets();
			Static517.aCanvas14.setLocation(Static343.anInt6345 + local60.left, Static276.anInt5006 + local60.top);
		} else {
			Static517.aCanvas14.setLocation(Static343.anInt6345, Static276.anInt5006);
		}
		Static517.aCanvas14.addFocusListener(this);
		Static517.aCanvas14.requestFocus();
		Static73.aBoolean113 = true;
		Static186.aBoolean264 = true;
		Static96.aBoolean133 = true;
		Static120.aBoolean208 = false;
		Static411.aLong184 = Static143.method2502();
	}

	@OriginalMember(owner = "client!qn", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static482.aString183 != null) {
					@Pc(6) String local6 = Static482.aString183.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(37) String local37 = Static482.aString186;
						if (local37.equals("1.1") || local37.startsWith("1.1.") || local37.equals("1.2") || local37.startsWith("1.2.")) {
							this.method1230("wrongjava");
							break label108;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static482.aString186 == null || Static482.aString186.equals("1.4.2"))) {
						this.method1230("wrongjava");
						break label108;
					}
				}
				@Pc(67) int local67;
				if (Static482.aString186 != null && Static482.aString186.startsWith("1.")) {
					local67 = 2;
					@Pc(69) int local69 = 0;
					while (Static482.aString186.length() > local67) {
						@Pc(75) char local75 = Static482.aString186.charAt(local67);
						if (local75 < '0' || local75 > '9') {
							break;
						}
						local67++;
						local69 = local75 + local69 * 10 - 48;
					}
					if (local69 >= 5) {
						Static466.aBoolean605 = true;
					}
				}
				if (Static531.aClass283_6.anApplet1 != null) {
					@Pc(108) Method local108 = Static482.aMethod2;
					if (local108 != null) {
						try {
							local108.invoke(Static531.aClass283_6.anApplet1, Boolean.TRUE);
						} catch (@Pc(123) Throwable local123) {
						}
					}
				}
				Static315.method4852();
				Static280.method4434();
				this.method1218();
				this.method1232();
				Static306.aClass72_1 = Static338.method5343();
				while (Static238.aLong116 == 0L || Static238.aLong116 > Static143.method2502()) {
					Static113.anInt2307 = Static306.aClass72_1.method6798(Static179.aLong91);
					for (local67 = 0; local67 < Static113.anInt2307; local67++) {
						this.method1222();
					}
					this.method1233();
					Static497.method7322(Static531.aClass283_6, Static517.aCanvas14);
				}
			}
		} catch (@Pc(175) Throwable local175) {
			Static459.method6984(this.method1235(), local175);
			this.method1230("crash");
		}
		this.method1225(true);
	}

	@OriginalMember(owner = "client!qn", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	protected abstract void method1220();

	@OriginalMember(owner = "client!qn", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)Z")
	public final boolean method1221() {
		return Static467.method7030("jagmisc");
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	private void method1222() {
		@Pc(6) long local6 = Static143.method2502();
		@Pc(14) long local14 = Static518.aLongArray15[Static291.anInt5365];
		Static518.aLongArray15[Static291.anInt5365] = local6;
		@Pc(31) boolean local31;
		if (local14 == 0L || local6 <= local14) {
			local31 = false;
		} else {
			local31 = true;
		}
		Static291.anInt5365 = Static291.anInt5365 + 1 & 0x1F;
		synchronized (this) {
			Static186.aBoolean264 = Static73.aBoolean113;
		}
		this.method1234();
	}

	@OriginalMember(owner = "client!qn", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static12.anApplet_Sub1_1 == this && !Static431.aBoolean583) {
			Static238.aLong116 = Static143.method2502();
			Static379.method5233(5000L);
			Static348.aClass283_3 = null;
			this.method1225(false);
		}
	}

	@OriginalMember(owner = "client!qn", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static132.aFrame2 == null) {
			return Static531.aClass283_6 == null || Static531.aClass283_6.anApplet1 == this ? super.getCodeBase() : Static531.aClass283_6.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)Z")
	protected final boolean method1223() {
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
				this.method1230("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static73.aBoolean113 = true;
		Static96.aBoolean133 = true;
	}

	@OriginalMember(owner = "client!qn", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static12.anApplet_Sub1_1 == this && !Static431.aBoolean583) {
			Static238.aLong116 = 0L;
		}
	}

	@OriginalMember(owner = "client!qn", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V")
	private void method1225(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static431.aBoolean583) {
				return;
			}
			Static431.aBoolean583 = true;
		}
		if (Static531.aClass283_6.anApplet1 != null) {
			Static531.aClass283_6.anApplet1.destroy();
		}
		try {
			this.method1231();
		} catch (@Pc(37) Exception local37) {
		}
		if (this.aBoolean88) {
			try {
				jagmisc.quit();
			} catch (@Pc(43) Throwable local43) {
			}
			this.aBoolean88 = false;
		}
		Static508.method7435();
		Static58.method1080();
		if (Static517.aCanvas14 != null) {
			try {
				Static517.aCanvas14.removeFocusListener(this);
				Static517.aCanvas14.getParent().remove(Static517.aCanvas14);
			} catch (@Pc(63) Exception local63) {
			}
		}
		if (Static531.aClass283_6 != null) {
			try {
				Static531.aClass283_6.method7176();
			} catch (@Pc(71) Exception local71) {
			}
		}
		this.method1226();
		if (Static132.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(81) Throwable local81) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	protected abstract void method1226();

	@OriginalMember(owner = "client!qn", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static73.aBoolean113 = false;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)V")
	protected final void method1227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static12.anApplet_Sub1_1 == null) {
				Static343.anInt6345 = 0;
				Static12.anApplet_Sub1_1 = this;
				Static160.anInt2917 = 607;
				Static276.anInt5006 = 0;
				Static223.anInt3996 = arg2;
				Static116.anInt2331 = arg2;
				Static461.anInt8348 = arg0;
				Static400.anInt7591 = arg0;
				if (Static531.aClass283_6 == null) {
					Static348.aClass283_3 = Static531.aClass283_6 = new Class283(this, arg1, null, 0);
				}
				@Pc(60) Class20 local60 = Static531.aClass283_6.method7164(1, this);
				while (local60.anInt593 == 0) {
					Static379.method5233(10L);
				}
			} else {
				Static325.anInt5475++;
				if (Static325.anInt5475 >= 3) {
					this.method1230("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(70) Throwable local70) {
			Static459.method6984(null, local70);
			this.method1230("crash");
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIZLjava/lang/String;IIBI)V")
	protected final void method1228(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static461.anInt8348 = 1024;
			Static400.anInt7591 = 1024;
			Static223.anInt3996 = 768;
			Static116.anInt2331 = 768;
			Static276.anInt5006 = 0;
			Static160.anInt2917 = 607;
			Static343.anInt6345 = 0;
			Static12.anApplet_Sub1_1 = this;
			Static132.aFrame2 = new Frame();
			Static132.aFrame2.setTitle("Jagex");
			Static132.aFrame2.setResizable(true);
			Static132.aFrame2.addWindowListener(this);
			Static132.aFrame2.setVisible(true);
			Static132.aFrame2.toFront();
			@Pc(42) Insets local42 = Static132.aFrame2.getInsets();
			Static132.aFrame2.setSize(Static400.anInt7591 + local42.left + local42.right, local42.bottom + (Static116.anInt2331 - -local42.top));
			Static348.aClass283_3 = Static531.aClass283_6 = new Class283(null, arg0, arg1, 32);
			@Pc(75) Class20 local75 = Static531.aClass283_6.method7164(1, this);
			while (local75.anInt593 == 0) {
				Static379.method5233(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static459.method6984(null, local90);
		}
	}

	@OriginalMember(owner = "client!qn", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static132.aFrame2 == null) {
			return Static531.aClass283_6 == null || Static531.aClass283_6.anApplet1 == this ? super.getParameter(arg0) : Static531.aClass283_6.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static12.anApplet_Sub1_1 == this && !Static431.aBoolean583) {
			Static238.aLong116 = Static143.method2502() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1230(@OriginalArg(0) String arg0) {
		if (this.aBoolean87) {
			return;
		}
		this.aBoolean87 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static559.method6631("loggedout", Static531.aClass283_6.anApplet1);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
	protected abstract void method1231();

	@OriginalMember(owner = "client!qn", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static12.anApplet_Sub1_1 != this || Static431.aBoolean583) {
			return;
		}
		Static96.aBoolean133 = true;
		if (Static466.aBoolean605 && Static143.method2502() - Static411.aLong184 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static400.anInt7591 <= local26.width && Static116.anInt2331 <= local26.height) {
				Static120.aBoolean208 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V")
	protected abstract void method1232();

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
	private void method1233() {
		@Pc(6) long local6 = Static143.method2502();
		@Pc(10) long local10 = Static166.aLongArray8[Static398.anInt7590];
		Static166.aLongArray8[Static398.anInt7590] = local6;
		Static398.anInt7590 = Static398.anInt7590 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(34) int local34 = (int) (local6 - local10);
			Static441.anInt8032 = ((local34 >> 1) + 32000) / local34;
		}
		if (Static261.anInt4675++ > 50) {
			Static96.aBoolean133 = true;
			Static261.anInt4675 -= 50;
			Static517.aCanvas14.setSize(Static461.anInt8348, Static223.anInt3996);
			Static517.aCanvas14.setVisible(true);
			if (Static132.aFrame2 != null && Static36.aFrame1 == null) {
				@Pc(69) Insets local69 = Static132.aFrame2.getInsets();
				Static517.aCanvas14.setLocation(Static343.anInt6345 + local69.left, Static276.anInt5006 + local69.top);
			} else {
				Static517.aCanvas14.setLocation(Static343.anInt6345, Static276.anInt5006);
			}
		}
		this.method1220();
	}

	@OriginalMember(owner = "client!qn", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V")
	protected abstract void method1234();

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method1235() {
		return null;
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)Z")
	protected final boolean method1236() {
		return Static467.method7030("jaclib");
	}
}
