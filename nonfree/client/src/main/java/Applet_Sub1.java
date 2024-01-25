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

@OriginalClass("client!bg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!bg", name = "lb", descriptor = "I")
	private static int lb;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!bg", name = "N", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!bg", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static645.anApplet2 = arg0;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
	private void method1446(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static381.aBoolean498) {
				return;
			}
			Static381.aBoolean498 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static645.anApplet2 != null) {
			Static645.anApplet2.destroy();
		}
		try {
			this.method1455();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean130) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean130 = false;
		}
		Static480.method7120();
		Static390.method5817();
		if (Static68.aCanvas2 != null) {
			try {
				Static68.aCanvas2.removeFocusListener(this);
				Static68.aCanvas2.getParent().remove(Static68.aCanvas2);
			} catch (@Pc(66) Exception local66) {
			}
		}
		if (Static234.aClass333_5 != null) {
			try {
				Static234.aClass333_5.method8147();
			} catch (@Pc(74) Exception local74) {
			}
		}
		this.method1461();
		if (Static339.aFrame2 != null) {
			Static339.aFrame2.setVisible(false);
			Static339.aFrame2.dispose();
			Static339.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!bg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static339.aFrame2 == null) {
			return Static645.anApplet2 == null || Static645.anApplet2 == this ? super.getParameter(arg0) : Static645.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
	public final boolean method1447() {
		return Static160.method2605("jagtheora");
	}

	@OriginalMember(owner = "client!bg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static164.anApplet_Sub1_1 != this || Static381.aBoolean498) {
			return;
		}
		Static43.aBoolean92 = true;
		if (Static485.aBoolean536 && Static521.method7499() - Static10.aLong1 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static69.anInt1570 <= local26.width && local26.height >= Static572.anInt9840) {
				Static68.aBoolean120 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static452.aBoolean546 = true;
		Static43.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!bg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static452.aBoolean546 = false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Z")
	protected final boolean method1448() {
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
				this.method1449("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!bg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static339.aFrame2 == null) {
			return Static645.anApplet2 == null || Static645.anApplet2 == this ? super.getDocumentBase() : Static645.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1449(@OriginalArg(1) String arg0) {
		if (this.aBoolean128) {
			return;
		}
		this.aBoolean128 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static682.method5126("loggedout", Static645.anApplet2);
		} catch (@Pc(30) Throwable local30) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!bg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static164.anApplet_Sub1_1 == this && !Static381.aBoolean498) {
			Static267.aLong138 = Static521.method7499() + 4000L;
		}
	}

	@OriginalMember(owner = "client!bg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static339.aFrame2 == null) {
			return Static645.anApplet2 == null || Static645.anApplet2 == this ? super.getCodeBase() : Static645.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
	protected abstract void method1451();

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	protected abstract void method1452();

	@OriginalMember(owner = "client!bg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static164.anApplet_Sub1_1 == this && !Static381.aBoolean498) {
			Static267.aLong138 = Static521.method7499();
			Static20.method9254(5000L);
			Static640.aClass333_4 = null;
			this.method1446(false);
		}
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	private void method1453() {
		@Pc(8) long local8 = Static521.method7499();
		@Pc(12) long local12 = Static399.aLongArray16[Static607.anInt4028];
		Static399.aLongArray16[Static607.anInt4028] = local8;
		Static607.anInt4028 = Static607.anInt4028 + 1 & 0x1F;
		if (local12 != 0L && local8 > local12) {
			@Pc(40) int local40 = (int) (local8 - local12);
			Static12.anInt96 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static32.anInt9379++ > 50) {
			Static32.anInt9379 -= 50;
			Static43.aBoolean92 = true;
			Static68.aCanvas2.setSize(Static561.anInt9759, Static639.anInt10685);
			Static68.aCanvas2.setVisible(true);
			if (Static339.aFrame2 != null && Static628.aFrame3 == null) {
				@Pc(76) Insets local76 = Static339.aFrame2.getInsets();
				Static68.aCanvas2.setLocation(Static535.anInt9235 + local76.left, Static406.anInt7435 + local76.top);
			} else {
				Static68.aCanvas2.setLocation(Static535.anInt9235, Static406.anInt7435);
			}
		}
		this.method1464();
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Ljava/lang/String;")
	public String method1454() {
		return null;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	protected abstract void method1455();

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	protected final void method1456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		try {
			if (Static164.anApplet_Sub1_1 == null) {
				Static561.anInt9759 = arg2;
				Static69.anInt1570 = arg2;
				Static164.anApplet_Sub1_1 = this;
				Static516.anInt9038 = 650;
				Static535.anInt9235 = 0;
				Static282.anApplet1 = Static645.anApplet2;
				Static406.anInt7435 = 0;
				Static639.anInt10685 = arg0;
				Static572.anInt9840 = arg0;
				Static640.aClass333_4 = Static234.aClass333_5 = new Class333(arg1, arg3, 37, Static645.anApplet2 != null);
				@Pc(70) Class150 local70 = Static234.aClass333_5.method8151(1, this);
				while (local70.anInt4247 == 0) {
					Static20.method9254(10L);
				}
			} else {
				Static538.anInt9250++;
				if (Static538.anInt9250 >= 3) {
					this.method1449("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(80) Throwable local80) {
			Static524.method7532((String) null, local80);
			this.method1449("crash");
		}
	}

	@OriginalMember(owner = "client!bg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static339.aFrame2 == null) {
			return Static645.anApplet2 == null || Static645.anApplet2 == this ? super.getAppletContext() : Static645.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Z")
	public final boolean method1459() {
		return Static160.method2605("jagmisc");
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
	public synchronized void method1460() {
		if (Static68.aCanvas2 != null) {
			Static68.aCanvas2.removeFocusListener(this);
			Static68.aCanvas2.getParent().setBackground(Color.black);
			Static68.aCanvas2.getParent().remove(Static68.aCanvas2);
		}
		@Pc(26) Container local26;
		if (Static628.aFrame3 != null) {
			local26 = Static628.aFrame3;
		} else if (Static339.aFrame2 != null) {
			local26 = Static339.aFrame2;
		} else if (Static645.anApplet2 == null) {
			local26 = Static164.anApplet_Sub1_1;
		} else {
			local26 = Static645.anApplet2;
		}
		local26.setLayout((LayoutManager) null);
		Static68.aCanvas2 = new Canvas_Sub1(this);
		local26.add(Static68.aCanvas2);
		Static68.aCanvas2.setSize(Static561.anInt9759, Static639.anInt10685);
		Static68.aCanvas2.setVisible(true);
		if (Static339.aFrame2 == local26) {
			@Pc(68) Insets local68 = Static339.aFrame2.getInsets();
			Static68.aCanvas2.setLocation(local68.left + Static535.anInt9235, local68.top + Static406.anInt7435);
		} else {
			Static68.aCanvas2.setLocation(Static535.anInt9235, Static406.anInt7435);
		}
		Static68.aCanvas2.addFocusListener(this);
		Static68.aCanvas2.requestFocus();
		Static452.aBoolean546 = true;
		Static645.aBoolean743 = true;
		Static43.aBoolean92 = true;
		Static68.aBoolean120 = false;
		Static10.aLong1 = Static521.method7499();
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)V")
	protected abstract void method1461();

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(B)Z")
	public final boolean method1462() {
		return Static160.method2605("jaclib");
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZIIILjava/lang/String;II)V")
	protected final void method1463(@OriginalArg(4) int arg0, @OriginalArg(5) String arg1) {
		try {
			Static516.anInt9038 = 650;
			Static535.anInt9235 = 0;
			Static406.anInt7435 = 0;
			Static639.anInt10685 = 768;
			Static572.anInt9840 = 768;
			Static282.anApplet1 = null;
			Static164.anApplet_Sub1_1 = this;
			Static561.anInt9759 = 1024;
			Static69.anInt1570 = 1024;
			Static339.aFrame2 = new Frame();
			Static339.aFrame2.setTitle("Jagex");
			Static339.aFrame2.setResizable(true);
			Static339.aFrame2.addWindowListener(this);
			Static339.aFrame2.setVisible(true);
			Static339.aFrame2.toFront();
			@Pc(48) Insets local48 = Static339.aFrame2.getInsets();
			Static339.aFrame2.setSize(local48.right + Static69.anInt1570 + local48.left, local48.bottom + local48.top + Static572.anInt9840);
			Static640.aClass333_4 = Static234.aClass333_5 = new Class333(arg0, arg1, 37, true);
			@Pc(80) Class150 local80 = Static234.aClass333_5.method8151(1, this);
			while (local80.anInt4247 == 0) {
				Static20.method9254(10L);
			}
		} catch (@Pc(90) Exception local90) {
			Static524.method7532((String) null, local90);
		}
	}

	@OriginalMember(owner = "client!bg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!bg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!bg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static164.anApplet_Sub1_1 == this && !Static381.aBoolean498) {
			Static267.aLong138 = 0L;
		}
	}

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(B)V")
	protected abstract void method1464();

	@OriginalMember(owner = "client!bg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static565.aString94 != null) {
				@Pc(10) String local10 = Static565.aString94.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(39) String local39 = Static565.aString95;
					if (local39.equals("1.1") || local39.startsWith("1.1.") || local39.equals("1.2") || local39.startsWith("1.2.")) {
						this.method1449("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static565.aString95 == null || Static565.aString95.equals("1.4.2"))) {
					this.method1449("wrongjava");
					return;
				}
			}
			if (Static565.aString95 != null && Static565.aString95.startsWith("1.")) {
				@Pc(69) int local69 = 2;
				@Pc(71) int local71 = 0;
				while (Static565.aString95.length() > local69) {
					@Pc(77) char local77 = Static565.aString95.charAt(local69);
					if (local77 < '0' || local77 > '9') {
						break;
					}
					local71 = local77 + local71 * 10 - 48;
					local69++;
				}
				if (local71 >= 5) {
					Static485.aBoolean536 = true;
				}
			}
			@Pc(105) Applet local105 = Static164.anApplet_Sub1_1;
			if (Static645.anApplet2 != null) {
				local105 = Static645.anApplet2;
			}
			@Pc(111) Method local111 = Static565.aMethod1;
			if (local111 != null) {
				try {
					local111.invoke(local105, Boolean.TRUE);
				} catch (@Pc(125) Throwable local125) {
				}
			}
			Static185.method2943();
			Static324.method5105();
			this.method1460();
			this.method1452();
			Static8.aClass96_1 = Static581.method8290();
			while (Static267.aLong138 == 0L || Static267.aLong138 > Static521.method7499()) {
				Static643.anInt10753 = Static8.aClass96_1.method3592(Static616.aLong276);
				for (@Pc(148) int local148 = 0; local148 < Static643.anInt10753; local148++) {
					this.method1467();
				}
				this.method1453();
				Static447.method8527(Static234.aClass333_5, Static68.aCanvas2);
			}
		} catch (@Pc(183) ThreadDeath local183) {
			throw local183;
		} catch (@Pc(186) Throwable local186) {
			Static524.method7532(this.method1454(), local186);
			this.method1449("crash");
		} finally {
			@Pc(202) Object local202 = null;
			this.method1446(true);
		}
	}

	@OriginalMember(owner = "client!bg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(Z)V")
	private void method1467() {
		@Pc(6) long local6 = Static521.method7499();
		@Pc(10) long local10 = Static331.aLongArray13[Static145.anInt2783];
		Static331.aLongArray13[Static145.anInt2783] = local6;
		Static145.anInt2783 = Static145.anInt2783 + 1 & 0x1F;
		@Pc(41) boolean local41;
		if (local10 == 0L || local10 >= local6) {
			local41 = false;
		} else {
			local41 = true;
		}
		synchronized (this) {
			Static645.aBoolean743 = Static452.aBoolean546;
		}
		this.method1451();
	}
}
