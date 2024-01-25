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

@OriginalClass("client!rc")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static28.aBoolean50 = true;
		Static153.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!rc", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
	protected abstract void method1089();

	@OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static92.anApplet_Sub1_1 != this || Static137.aBoolean235) {
			return;
		}
		Static153.aBoolean263 = true;
		if (Static276.aBoolean429 && Static208.method3182() - Static418.aLong212 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static203.anInt3944 && local24.height >= Static13.anInt316) {
				Static396.aBoolean587 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	protected final void method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (Static92.anApplet_Sub1_1 == null) {
				Static9.anInt280 = 585;
				Static216.anInt4171 = arg0;
				Static13.anInt316 = arg0;
				Static92.anApplet_Sub1_1 = this;
				Static96.anInt2175 = arg2;
				Static203.anInt3944 = arg2;
				Static442.anInt7733 = 0;
				Static128.anInt2522 = 0;
				if (Static303.aClass131_4 == null) {
					Static32.aClass131_1 = Static303.aClass131_4 = new Class131(this, arg1, null, 0);
				}
				@Pc(68) Class128 local68 = Static303.aClass131_4.method3045(1, this);
				while (local68.anInt3727 == 0) {
					Static443.method5991(10L);
				}
			} else {
				Static23.anInt493++;
				if (Static23.anInt493 >= 3) {
					this.method1093("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static80.method1410(local81, null);
			this.method1093("crash");
		}
	}

	@OriginalMember(owner = "client!rc", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static373.aFrame2 == null) {
			return Static303.aClass131_4 == null || Static303.aClass131_4.anApplet1 == this ? super.getCodeBase() : Static303.aClass131_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
	protected abstract void method1091();

	@OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static28.aBoolean50 = false;
	}

	@OriginalMember(owner = "client!rc", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static373.aFrame2 == null) {
			return Static303.aClass131_4 == null || Static303.aClass131_4.anApplet1 == this ? super.getParameter(arg0) : Static303.aClass131_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static373.aFrame2 == null) {
			return Static303.aClass131_4 == null || Static303.aClass131_4.anApplet1 == this ? super.getDocumentBase() : Static303.aClass131_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method1093(@OriginalArg(0) String arg0) {
		if (this.aBoolean119) {
			return;
		}
		this.aBoolean119 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static461.method3590(Static303.aClass131_4.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)V")
	private void method1094(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static137.aBoolean235) {
				return;
			}
			Static137.aBoolean235 = true;
		}
		if (Static303.aClass131_4.anApplet1 != null) {
			Static303.aClass131_4.anApplet1.destroy();
		}
		try {
			this.method1102();
		} catch (@Pc(41) Exception local41) {
		}
		if (this.aBoolean120) {
			try {
				jagmisc.quit();
			} catch (@Pc(47) Throwable local47) {
			}
			this.aBoolean120 = false;
		}
		@Pc(56) Class128 local56 = Static303.aClass131_4.method3047(Static92.anApplet_Sub1_1.getClass());
		while (local56.anInt3727 == 0) {
			Static443.method5991(100L);
		}
		if (Static118.aCanvas3 != null) {
			try {
				Static118.aCanvas3.removeFocusListener(this);
				Static118.aCanvas3.getParent().remove(Static118.aCanvas3);
			} catch (@Pc(75) Exception local75) {
			}
		}
		if (Static303.aClass131_4 != null) {
			try {
				Static303.aClass131_4.method3056();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method1096();
		if (Static373.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!rc", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static373.aFrame2 == null) {
			return Static303.aClass131_4 == null || Static303.aClass131_4.anApplet1 == this ? super.getAppletContext() : Static303.aClass131_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V")
	protected abstract void method1096();

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	private void method1097() {
		@Pc(6) long local6 = Static208.method3182();
		@Pc(10) long local10 = Static130.aLongArray2[Static255.anInt4807];
		Static130.aLongArray2[Static255.anInt4807] = local6;
		Static255.anInt4807 = Static255.anInt4807 + 1 & 0x1F;
		@Pc(35) boolean local35;
		if (local10 == 0L || local10 >= local6) {
			local35 = false;
		} else {
			local35 = true;
		}
		synchronized (this) {
			Static30.aBoolean591 = Static28.aBoolean50;
		}
		this.method1098();
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
	protected abstract void method1098();

	@OriginalMember(owner = "client!rc", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static197.aString28 != null) {
					@Pc(10) String local10 = Static197.aString28.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(39) String local39 = Static197.aString30;
						if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
							this.method1093("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static197.aString30 == null || Static197.aString30.equals("1.4.2"))) {
						this.method1093("wrongjava");
						break label107;
					}
				}
				@Pc(69) int local69;
				if (Static197.aString30 != null && Static197.aString30.startsWith("1.")) {
					local69 = 2;
					@Pc(71) int local71 = 0;
					while (local69 < Static197.aString30.length()) {
						@Pc(77) char local77 = Static197.aString30.charAt(local69);
						if (local77 < '0' || local77 > '9') {
							break;
						}
						local71 = local71 * 10 + local77 - 48;
						local69++;
					}
					if (local71 >= 5) {
						Static276.aBoolean429 = true;
					}
				}
				if (Static303.aClass131_4.anApplet1 != null) {
					@Pc(110) Method local110 = Static197.aMethod2;
					if (local110 != null) {
						try {
							local110.invoke(Static303.aClass131_4.anApplet1, Boolean.TRUE);
						} catch (@Pc(125) Throwable local125) {
						}
					}
				}
				Static163.method2595();
				Static331.method4710();
				this.method1099();
				this.method1091();
				Static256.aClass59_1 = Static28.method386();
				this.method1106();
				while (Static240.aLong134 == 0L || Static208.method3182() < Static240.aLong134) {
					Static351.anInt6168 = Static256.aClass59_1.method4362(Static260.anInt4845);
					for (local69 = 0; local69 < Static351.anInt6168; local69++) {
						this.method1097();
					}
					this.method1105();
					Static293.method4556(Static303.aClass131_4, Static118.aCanvas3);
				}
			}
		} catch (@Pc(182) Throwable local182) {
			Static80.method1410(local182, null);
			this.method1093("crash");
		}
		this.method1094(true);
	}

	@OriginalMember(owner = "client!rc", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static92.anApplet_Sub1_1 == this && !Static137.aBoolean235) {
			Static240.aLong134 = 0L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)V")
	public final synchronized void method1099() {
		if (Static118.aCanvas3 != null) {
			Static118.aCanvas3.removeFocusListener(this);
			Static118.aCanvas3.getParent().remove(Static118.aCanvas3);
		}
		@Pc(25) Container local25;
		if (Static140.aFrame12 != null) {
			local25 = Static140.aFrame12;
		} else if (Static373.aFrame2 == null) {
			local25 = Static303.aClass131_4.anApplet1;
		} else {
			local25 = Static373.aFrame2;
		}
		local25.setLayout(null);
		Static118.aCanvas3 = new Canvas_Sub1(this);
		local25.add(Static118.aCanvas3);
		Static118.aCanvas3.setSize(Static96.anInt2175, Static216.anInt4171);
		Static118.aCanvas3.setVisible(true);
		if (Static373.aFrame2 == local25) {
			@Pc(64) Insets local64 = Static373.aFrame2.getInsets();
			Static118.aCanvas3.setLocation(Static128.anInt2522 + local64.left, local64.top + Static442.anInt7733);
		} else {
			Static118.aCanvas3.setLocation(Static128.anInt2522, Static442.anInt7733);
		}
		Static118.aCanvas3.addFocusListener(this);
		Static118.aCanvas3.requestFocus();
		Static28.aBoolean50 = true;
		Static30.aBoolean591 = true;
		Static153.aBoolean263 = true;
		Static396.aBoolean587 = false;
		Static418.aLong212 = Static208.method3182();
	}

	@OriginalMember(owner = "client!rc", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(B)V")
	protected abstract void method1102();

	@OriginalMember(owner = "client!rc", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static92.anApplet_Sub1_1 == this && !Static137.aBoolean235) {
			Static240.aLong134 = Static208.method3182() + 4000L;
		}
	}

	@OriginalMember(owner = "client!rc", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static92.anApplet_Sub1_1 == this && !Static137.aBoolean235) {
			Static240.aLong134 = Static208.method3182();
			Static443.method5991(5000L);
			Static32.aClass131_1 = null;
			this.method1094(false);
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)Z")
	protected final boolean method1103() {
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
				this.method1093("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)V")
	private void method1105() {
		@Pc(12) long local12 = Static208.method3182();
		@Pc(16) long local16 = Static348.aLongArray7[Static253.anInt4799];
		Static348.aLongArray7[Static253.anInt4799] = local12;
		Static253.anInt4799 = Static253.anInt4799 + 1 & 0x1F;
		if (local16 != 0L && local16 < local12) {
			@Pc(43) int local43 = (int) (local12 - local16);
			Static335.anInt1514 = ((local43 >> 1) + 32000) / local43;
		}
		if (Static391.anInt6870++ > 50) {
			Static391.anInt6870 -= 50;
			Static153.aBoolean263 = true;
			Static118.aCanvas3.setSize(Static96.anInt2175, Static216.anInt4171);
			Static118.aCanvas3.setVisible(true);
			if (Static373.aFrame2 != null && Static140.aFrame12 == null) {
				@Pc(86) Insets local86 = Static373.aFrame2.getInsets();
				Static118.aCanvas3.setLocation(Static128.anInt2522 + local86.left, Static442.anInt7733 + local86.top);
			} else {
				Static118.aCanvas3.setLocation(Static128.anInt2522, Static442.anInt7733);
			}
		}
		this.method1089();
	}

	@OriginalMember(owner = "client!rc", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public final void method1106() {
		if (this.aBoolean120) {
			return;
		}
		try {
			@Pc(18) Class128 local18 = Static303.aClass131_4.method3060(Static92.anApplet_Sub1_1.getClass());
			while (local18.anInt3727 == 0) {
				Static443.method5991(100L);
			}
			if (local18.anObject4 != null) {
				throw (Throwable) local18.anObject4;
			}
			jagmisc.init();
			this.aBoolean120 = true;
			Static256.aClass59_1 = Static28.method386();
		} catch (@Pc(43) Throwable local43) {
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZIILjava/lang/String;III)V")
	protected final void method1108(@OriginalArg(4) String arg0, @OriginalArg(6) int arg1) {
		try {
			Static128.anInt2522 = 0;
			Static96.anInt2175 = 1024;
			Static203.anInt3944 = 1024;
			Static442.anInt7733 = 0;
			Static9.anInt280 = 585;
			Static92.anApplet_Sub1_1 = this;
			Static216.anInt4171 = 768;
			Static13.anInt316 = 768;
			Static373.aFrame2 = new Frame();
			Static373.aFrame2.setTitle("Jagex");
			Static373.aFrame2.setResizable(true);
			Static373.aFrame2.addWindowListener(this);
			Static373.aFrame2.setVisible(true);
			Static373.aFrame2.toFront();
			@Pc(43) Insets local43 = Static373.aFrame2.getInsets();
			Static373.aFrame2.setSize(local43.left + Static203.anInt3944 + local43.right, local43.top + Static13.anInt316 - -local43.bottom);
			Static32.aClass131_1 = Static303.aClass131_4 = new Class131(null, arg1, arg0, 30);
			@Pc(76) Class128 local76 = Static303.aClass131_4.method3045(1, this);
			while (local76.anInt3727 == 0) {
				Static443.method5991(10L);
			}
		} catch (@Pc(89) Exception local89) {
			Static80.method1410(local89, null);
		}
	}
}
