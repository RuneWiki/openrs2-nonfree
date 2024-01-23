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

@OriginalClass("client!ek")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!ek", name = "providesignlink", descriptor = "(Lclient!gj;)V")
	public static void providesignlink(@OriginalArg(0) Class41 arg0) {
		Static133.aClass41_2 = arg0;
		Static192.aClass41_3 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
	private void method452(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static152.aBoolean152) {
				return;
			}
			Static152.aBoolean152 = true;
		}
		if (Static133.aClass41_2.anApplet1 != null) {
			Static133.aClass41_2.anApplet1.destroy();
		}
		try {
			this.method453();
		} catch (@Pc(37) Exception local37) {
		}
		if (Static79.aCanvas2 != null) {
			try {
				Static79.aCanvas2.removeFocusListener(this);
				Static79.aCanvas2.getParent().remove(Static79.aCanvas2);
			} catch (@Pc(48) Exception local48) {
			}
		}
		if (Static133.aClass41_2 != null) {
			try {
				Static133.aClass41_2.method1261();
			} catch (@Pc(56) Exception local56) {
			}
		}
		this.method469();
		if (Static3.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(66) Throwable local66) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ek", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static177.aBoolean178 = true;
		Static205.aBoolean25 = true;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	protected abstract void method453();

	@OriginalMember(owner = "client!ek", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static3.aFrame1 == null) {
			return Static133.aClass41_2 == null || Static133.aClass41_2.anApplet1 == this ? super.getAppletContext() : Static133.aClass41_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static76.aString5 != null) {
				@Pc(10) String local10 = Static76.aString5.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static76.aString2;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method461("wrongjava");
						return;
					}
					Static120.anInt2807 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static76.aString2 == null || Static76.aString2.equals("1.4.2"))) {
					this.method461("wrongjava");
					return;
				}
			}
			if (Static133.aClass41_2.anApplet1 != null) {
				@Pc(70) Method local70 = Static76.aMethod1;
				if (local70 != null) {
					try {
						local70.invoke(Static133.aClass41_2.anApplet1, Boolean.TRUE);
					} catch (@Pc(85) Throwable local85) {
					}
				}
			}
			this.method457();
			Static160.aClass10_1 = Static95.method1667(Static30.anInt546, Static79.aCanvas2, Static134.anInt3131);
			this.method465();
			Static173.aClass4_1 = Static177.method3244();
			while (Static48.aLong32 == 0L || Static111.method1911() < Static48.aLong32) {
				Static132.anInt3001 = Static173.aClass4_1.method1605(Static58.anInt1023, Static120.anInt2807);
				for (@Pc(111) int local111 = 0; local111 < Static132.anInt3001; local111++) {
					this.method470();
				}
				this.method464();
				Static95.method1665(Static79.aCanvas2, Static133.aClass41_2);
			}
		} catch (@Pc(146) Exception local146) {
			Static139.method2127(local146, null);
			this.method461("crash");
		}
		this.method452(true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;IIIIB)V")
	protected final void method455(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		try {
			Static148.anApplet_Sub1_1 = this;
			Static134.anInt3131 = 765;
			Static79.anInt1729 = 501;
			Static30.anInt546 = 503;
			Static3.aFrame1 = new Frame();
			Static3.aFrame1.setTitle("Jagex");
			Static3.aFrame1.setResizable(false);
			Static3.aFrame1.addWindowListener(this);
			Static3.aFrame1.setVisible(true);
			Static3.aFrame1.toFront();
			@Pc(36) Insets local36 = Static3.aFrame1.getInsets();
			Static3.aFrame1.setSize(local36.left + local36.right + 765, local36.bottom + 503 - -local36.top);
			Static192.aClass41_3 = Static133.aClass41_2 = new Class41(true, null, arg1, arg0, 27);
			Static133.aClass41_2.method1259(1, this);
		} catch (@Pc(73) Exception local73) {
			Static139.method2127(local73, null);
		}
	}

	@OriginalMember(owner = "client!ek", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static3.aFrame1 == null) {
			return Static133.aClass41_2 == null || Static133.aClass41_2.anApplet1 == this ? super.getCodeBase() : Static133.aClass41_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static3.aFrame1 == null) {
			return Static133.aClass41_2 == null || Static133.aClass41_2.anApplet1 == this ? super.getDocumentBase() : Static133.aClass41_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	public final synchronized void method457() {
		if (Static79.aCanvas2 != null) {
			Static79.aCanvas2.removeFocusListener(this);
			Static79.aCanvas2.getParent().remove(Static79.aCanvas2);
		}
		if (Static23.aCanvas1 != null) {
			Static23.aCanvas1.getParent().remove(Static23.aCanvas1);
			Static23.aCanvas1 = null;
		}
		@Pc(27) Container local27;
		if (Static227.aFrame2 != null) {
			local27 = Static227.aFrame2;
		} else if (Static3.aFrame1 == null) {
			local27 = Static133.aClass41_2.anApplet1;
		} else {
			local27 = Static3.aFrame1;
		}
		local27.setLayout(null);
		@Pc(68) Insets local68;
		if (Static160.anInt3697 != 0) {
			Static23.aCanvas1 = new Canvas_Sub1(this);
			local27.add(Static23.aCanvas1);
			Static23.aCanvas1.setSize(Static134.anInt3131, Static160.anInt3697);
			Static23.aCanvas1.setVisible(true);
			if (local27 == Static3.aFrame1) {
				local68 = Static3.aFrame1.getInsets();
				Static23.aCanvas1.setLocation(local68.left, local68.top);
			} else {
				Static23.aCanvas1.setLocation(0, 0);
			}
		}
		Static79.aCanvas2 = new Canvas_Sub1(this);
		local27.add(Static79.aCanvas2);
		Static79.aCanvas2.setSize(Static134.anInt3131, Static30.anInt546);
		Static79.aCanvas2.setVisible(true);
		if (local27 == Static3.aFrame1) {
			local68 = Static3.aFrame1.getInsets();
			Static79.aCanvas2.setLocation(local68.left, local68.top + Static160.anInt3697);
		} else {
			Static79.aCanvas2.setLocation(0, Static160.anInt3697);
		}
		Static79.aCanvas2.addFocusListener(this);
		Static79.aCanvas2.requestFocus();
		Static130.aBoolean119 = true;
		Static177.aBoolean178 = true;
		Static205.aBoolean25 = true;
		Static196.aBoolean192 = false;
		Static147.aLong149 = Static111.method1911();
	}

	@OriginalMember(owner = "client!ek", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
	protected final boolean method458() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.equals("jagex.com") || local8.endsWith(".jagex.com")) {
			return true;
		} else if (local8.equals("runescape.com") || local8.endsWith(".runescape.com")) {
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
				this.method461("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
	protected abstract void method459();

	@OriginalMember(owner = "client!ek", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static148.anApplet_Sub1_1 == this && !Static152.aBoolean152) {
			Static48.aLong32 = 0L;
		}
	}

	@OriginalMember(owner = "client!ek", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static3.aFrame1 == null) {
			return Static133.aClass41_2 == null || Static133.aClass41_2.anApplet1 == this ? super.getParameter(arg0) : Static133.aClass41_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method461(@OriginalArg(1) String arg0) {
		if (this.aBoolean20) {
			return;
		}
		this.aBoolean20 = true;
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!ek", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static148.anApplet_Sub1_1 == this && !Static152.aBoolean152) {
			Static48.aLong32 = Static111.method1911() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V")
	protected abstract void method462();

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
	private void method464() {
		@Pc(14) long local14 = Static111.method1911();
		@Pc(18) long local18 = Static125.aLongArray5[Static20.anInt382];
		Static125.aLongArray5[Static20.anInt382] = local14;
		if (local18 != 0L && local18 < local14) {
			@Pc(40) int local40 = (int) (local14 - local18);
			Static180.anInt4191 = ((local40 >> 1) + 32000) / local40;
		}
		Static20.anInt382 = Static20.anInt382 + 1 & 0x1F;
		if (Static206.anInt4578++ > 50) {
			Static206.anInt4578 -= 50;
			Static205.aBoolean25 = true;
			Static79.aCanvas2.setSize(Static134.anInt3131, Static30.anInt546);
			Static79.aCanvas2.setVisible(true);
			if (Static3.aFrame1 != null && Static227.aFrame2 == null) {
				@Pc(89) Insets local89 = Static3.aFrame1.getInsets();
				Static79.aCanvas2.setLocation(local89.left, local89.top + Static160.anInt3697);
			} else {
				Static79.aCanvas2.setLocation(0, Static160.anInt3697);
			}
		}
		this.method459();
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
	protected abstract void method465();

	@OriginalMember(owner = "client!ek", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static148.anApplet_Sub1_1 != this || Static152.aBoolean152) {
			return;
		}
		Static205.aBoolean25 = true;
		if (Static76.aString2 != null && Static76.aString2.startsWith("1.5") && Static111.method1911() - Static147.aLong149 > 1000L) {
			@Pc(30) Rectangle local30 = arg0.getClipBounds();
			if (local30 == null || local30.width >= Static134.anInt3131 && local30.height >= Static30.anInt546) {
				Static196.aBoolean192 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static177.aBoolean178 = false;
	}

	@OriginalMember(owner = "client!ek", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIBI)V")
	protected final void method468(@OriginalArg(0) int arg0) {
		try {
			if (Static148.anApplet_Sub1_1 == null) {
				Static79.anInt1729 = 501;
				Static134.anInt3131 = 765;
				Static30.anInt546 = 503;
				Static148.anApplet_Sub1_1 = this;
				@Pc(40) String local40 = this.getParameter("openwinjs");
				@Pc(47) boolean local47;
				if (local40 != null && local40.equals("1")) {
					local47 = true;
				} else {
					local47 = false;
				}
				if (Static133.aClass41_2 == null) {
					Static192.aClass41_3 = Static133.aClass41_2 = new Class41(false, this, arg0, null, 0);
				}
				Static133.aClass41_2.method1259(1, this);
			} else {
				Static157.anInt3619++;
				if (Static157.anInt3619 >= 3) {
					this.method461("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(78) Exception local78) {
			Static139.method2127(local78, null);
			this.method461("crash");
		}
	}

	@OriginalMember(owner = "client!ek", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static148.anApplet_Sub1_1 == this && !Static152.aBoolean152) {
			Static48.aLong32 = Static111.method1911();
			Static156.method2805(5000L);
			Static192.aClass41_3 = null;
			this.method452(false);
		}
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
	protected abstract void method469();

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V")
	private void method470() {
		@Pc(7) long local7 = Static10.aLongArray2[Static13.anInt321];
		@Pc(12) long local12 = Static111.method1911();
		Static10.aLongArray2[Static13.anInt321] = local12;
		Static13.anInt321 = Static13.anInt321 + 1 & 0x1F;
		synchronized (this) {
			Static130.aBoolean119 = Static177.aBoolean178;
		}
		this.method462();
		@Pc(58) boolean local58;
		if (local7 == 0L || local7 >= local12) {
			local58 = false;
		} else {
			local58 = true;
		}
	}
}
