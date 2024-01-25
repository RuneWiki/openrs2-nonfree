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

@OriginalClass("client!cr")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!cr", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static303.aFrame1 == null) {
			return Static403.aClass42_6 == null || Static403.aClass42_6.anApplet1 == this ? super.getCodeBase() : Static403.aClass42_6.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	protected abstract void method719();

	@OriginalMember(owner = "client!cr", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!cr", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static6.anApplet_Sub1_1 != this || Class47_Sub1_Sub1.lb) {
			return;
		}
		Static24.aBoolean22 = true;
		if (Static231.aBoolean322 && Static107.method1707() - Static453.aLong96 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static90.anInt1737 <= local26.width && Static356.anInt6526 <= local26.height) {
				Static334.aBoolean490 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static48.aString14 != null) {
					@Pc(10) String local10 = Static48.aString14.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static48.aString11;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method722("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static48.aString11 == null || Static48.aString11.equals("1.4.2"))) {
						this.method722("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Static48.aString11 != null && Static48.aString11.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static48.aString11.length() > local70) {
						@Pc(78) char local78 = Static48.aString11.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local78 + local72 * 10 - 48;
					}
					if (local72 >= 5) {
						Static231.aBoolean322 = true;
					}
				}
				if (Static403.aClass42_6.anApplet1 != null) {
					@Pc(114) Method local114 = Static48.aMethod2;
					if (local114 != null) {
						try {
							local114.invoke(Static403.aClass42_6.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static405.method5502();
				Static167.method2607();
				this.method725();
				this.method724();
				Static74.aClass158_1 = Static229.method3301();
				this.method728();
				while (Static196.aLong113 == 0L || Static107.method1707() < Static196.aLong113) {
					Static397.anInt7100 = Static74.aClass158_1.method5756(Static290.anInt4872);
					for (local70 = 0; local70 < Static397.anInt7100; local70++) {
						this.method738();
					}
					this.method735();
					Static13.method230(Static403.aClass42_6, Static159.aCanvas3);
				}
			}
		} catch (@Pc(190) Throwable local190) {
			Static101.method1630(this.method739(), local190);
			this.method722("crash");
		}
		this.method726(true);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
	protected abstract void method720();

	@OriginalMember(owner = "client!cr", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static6.anApplet_Sub1_1 == this && !Class47_Sub1_Sub1.lb) {
			Static196.aLong113 = Static107.method1707() + 4000L;
		}
	}

	@OriginalMember(owner = "client!cr", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static303.aFrame1 == null) {
			return Static403.aClass42_6 == null || Static403.aClass42_6.anApplet1 == this ? super.getDocumentBase() : Static403.aClass42_6.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!cr", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static303.aFrame1 == null) {
			return Static403.aClass42_6 == null || Static403.aClass42_6.anApplet1 == this ? super.getParameter(arg0) : Static403.aClass42_6.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method722(@OriginalArg(1) String arg0) {
		if (this.aBoolean71) {
			return;
		}
		this.aBoolean71 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static455.method622("loggedout", Static403.aClass42_6.anApplet1);
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!cr", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean17 = true;
		Static24.aBoolean22 = true;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	protected abstract void method724();

	@OriginalMember(owner = "client!cr", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)V")
	public final synchronized void method725() {
		if (Static159.aCanvas3 != null) {
			Static159.aCanvas3.removeFocusListener(this);
			Static159.aCanvas3.getParent().remove(Static159.aCanvas3);
		}
		@Pc(18) Container local18;
		if (Static432.aFrame2 != null) {
			local18 = Static432.aFrame2;
		} else if (Static303.aFrame1 == null) {
			local18 = Static403.aClass42_6.anApplet1;
		} else {
			local18 = Static303.aFrame1;
		}
		local18.setLayout(null);
		Static159.aCanvas3 = new Canvas_Sub1(this);
		local18.add(Static159.aCanvas3);
		Static159.aCanvas3.setSize(Static403.anInt7142, Static324.anInt5725);
		Static159.aCanvas3.setVisible(true);
		if (Static303.aFrame1 == local18) {
			@Pc(58) Insets local58 = Static303.aFrame1.getInsets();
			Static159.aCanvas3.setLocation(local58.left + Static128.anInt2407, local58.top + Static83.anInt4881);
		} else {
			Static159.aCanvas3.setLocation(Static128.anInt2407, Static83.anInt4881);
		}
		Static159.aCanvas3.addFocusListener(this);
		Static159.aCanvas3.requestFocus();
		Static135.aBoolean196 = true;
		Static14.aBoolean17 = true;
		Static24.aBoolean22 = true;
		Static334.aBoolean490 = false;
		Static453.aLong96 = Static107.method1707();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZB)V")
	private void method726(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Class47_Sub1_Sub1.lb) {
				return;
			}
			Class47_Sub1_Sub1.lb = true;
		}
		if (Static403.aClass42_6.anApplet1 != null) {
			Static403.aClass42_6.anApplet1.destroy();
		}
		try {
			this.method719();
		} catch (@Pc(41) Exception local41) {
		}
		if (this.aBoolean72) {
			try {
				jagmisc.quit();
			} catch (@Pc(47) Throwable local47) {
			}
			this.aBoolean72 = false;
		}
		@Pc(56) Class159 local56 = Static403.aClass42_6.method655(Static6.anApplet_Sub1_1.getClass());
		while (local56.anInt4271 == 0) {
			Static366.method5214(100L);
		}
		if (Static159.aCanvas3 != null) {
			try {
				Static159.aCanvas3.removeFocusListener(this);
				Static159.aCanvas3.getParent().remove(Static159.aCanvas3);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static403.aClass42_6 != null) {
			try {
				Static403.aClass42_6.method659();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method720();
		if (Static303.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!cr", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public final void method728() {
		if (this.aBoolean72) {
			return;
		}
		try {
			@Pc(22) Class159 local22 = Static403.aClass42_6.method646(Static6.anApplet_Sub1_1.getClass());
			while (local22.anInt4271 == 0) {
				Static366.method5214(100L);
			}
			if (local22.anObject8 != null) {
				throw (Throwable) local22.anObject8;
			}
			jagmisc.init();
			this.aBoolean72 = true;
			Static74.aClass158_1 = Static229.method3301();
		} catch (@Pc(47) Throwable local47) {
		}
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)Z")
	protected final boolean method729() {
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
				this.method722("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)V")
	protected abstract void method730();

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIZI)V")
	protected final void method731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static6.anApplet_Sub1_1 == null) {
				Static83.anInt4881 = 0;
				Static437.anInt7635 = 588;
				Static128.anInt2407 = 0;
				Static324.anInt5725 = arg0;
				Static356.anInt6526 = arg0;
				Static403.anInt7142 = arg1;
				Static90.anInt1737 = arg1;
				Static6.anApplet_Sub1_1 = this;
				if (Static403.aClass42_6 == null) {
					Static171.aClass42_4 = Static403.aClass42_6 = new Class42(this, arg2, null, 0);
				}
				@Pc(60) Class159 local60 = Static403.aClass42_6.method653(1, this);
				while (local60.anInt4271 == 0) {
					Static366.method5214(10L);
				}
			} else {
				Static29.anInt484++;
				if (Static29.anInt484 >= 3) {
					this.method722("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Throwable local76) {
			Static101.method1630(null, local76);
			this.method722("crash");
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;IZIIIIZ)V")
	protected final void method732(@OriginalArg(0) String arg0, @OriginalArg(5) int arg1) {
		try {
			Static324.anInt5725 = 768;
			Static356.anInt6526 = 768;
			Static403.anInt7142 = 1024;
			Static90.anInt1737 = 1024;
			Static83.anInt4881 = 0;
			Static128.anInt2407 = 0;
			Static6.anApplet_Sub1_1 = this;
			Static437.anInt7635 = 588;
			Static303.aFrame1 = new Frame();
			Static303.aFrame1.setTitle("Jagex");
			Static303.aFrame1.setResizable(true);
			Static303.aFrame1.addWindowListener(this);
			Static303.aFrame1.setVisible(true);
			Static303.aFrame1.toFront();
			@Pc(42) Insets local42 = Static303.aFrame1.getInsets();
			Static303.aFrame1.setSize(local42.right + local42.left + Static90.anInt1737, Static356.anInt6526 - (-local42.top - local42.bottom));
			Static171.aClass42_4 = Static403.aClass42_6 = new Class42(null, arg1, arg0, 30);
			@Pc(75) Class159 local75 = Static403.aClass42_6.method653(1, this);
			while (local75.anInt4271 == 0) {
				Static366.method5214(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static101.method1630(null, local88);
		}
	}

	@OriginalMember(owner = "client!cr", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static6.anApplet_Sub1_1 == this && !Class47_Sub1_Sub1.lb) {
			Static196.aLong113 = 0L;
		}
	}

	@OriginalMember(owner = "client!cr", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
	private void method735() {
		@Pc(6) long local6 = Static107.method1707();
		@Pc(10) long local10 = Static77.aLongArray2[Static444.anInt7692];
		Static77.aLongArray2[Static444.anInt7692] = local6;
		Static444.anInt7692 = Static444.anInt7692 + 1 & 0x1F;
		if (local10 != 0L && local6 > local10) {
			@Pc(45) int local45 = (int) (local6 - local10);
			Static270.anInt2352 = ((local45 >> 1) + 32000) / local45;
		}
		if (Static219.anInt3873++ > 50) {
			Static24.aBoolean22 = true;
			Static219.anInt3873 -= 50;
			Static159.aCanvas3.setSize(Static403.anInt7142, Static324.anInt5725);
			Static159.aCanvas3.setVisible(true);
			if (Static303.aFrame1 != null && Static432.aFrame2 == null) {
				@Pc(88) Insets local88 = Static303.aFrame1.getInsets();
				Static159.aCanvas3.setLocation(local88.left + Static128.anInt2407, local88.top - -Static83.anInt4881);
			} else {
				Static159.aCanvas3.setLocation(Static128.anInt2407, Static83.anInt4881);
			}
		}
		this.method736();
	}

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)V")
	protected abstract void method736();

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "(I)V")
	private void method738() {
		@Pc(14) long local14 = Static107.method1707();
		@Pc(18) long local18 = Static186.aLongArray4[Static427.anInt7226];
		Static186.aLongArray4[Static427.anInt7226] = local14;
		@Pc(35) boolean local35;
		if (local18 == 0L || local14 <= local18) {
			local35 = false;
		} else {
			local35 = true;
		}
		Static427.anInt7226 = Static427.anInt7226 + 1 & 0x1F;
		synchronized (this) {
			Static135.aBoolean196 = Static14.aBoolean17;
		}
		this.method730();
	}

	@OriginalMember(owner = "client!cr", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static6.anApplet_Sub1_1 == this && !Class47_Sub1_Sub1.lb) {
			Static196.aLong113 = Static107.method1707();
			Static366.method5214(5000L);
			Static171.aClass42_4 = null;
			this.method726(false);
		}
	}

	@OriginalMember(owner = "client!cr", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!cr", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!cr", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static14.aBoolean17 = false;
	}

	@OriginalMember(owner = "client!cr", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static303.aFrame1 == null) {
			return Static403.aClass42_6 == null || Static403.aClass42_6.anApplet1 == this ? super.getAppletContext() : Static403.aClass42_6.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "(I)Ljava/lang/String;")
	protected String method739() {
		return null;
	}
}
