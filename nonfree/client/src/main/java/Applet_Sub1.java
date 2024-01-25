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

@OriginalClass("client!dg")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public final synchronized void method969() {
		if (Static412.aCanvas7 != null) {
			Static412.aCanvas7.removeFocusListener(this);
			Static412.aCanvas7.getParent().remove(Static412.aCanvas7);
		}
		@Pc(21) Container local21;
		if (Static95.aFrame1 != null) {
			local21 = Static95.aFrame1;
		} else if (Static451.aFrame2 == null) {
			local21 = Static171.aClass159_1.anApplet1;
		} else {
			local21 = Static451.aFrame2;
		}
		local21.setLayout(null);
		Static412.aCanvas7 = new Canvas_Sub1(this);
		local21.add(Static412.aCanvas7);
		Static412.aCanvas7.setSize(Static90.anInt1891, Static340.anInt5756);
		Static412.aCanvas7.setVisible(true);
		if (Static451.aFrame2 == local21) {
			@Pc(59) Insets local59 = Static451.aFrame2.getInsets();
			Static412.aCanvas7.setLocation(Static399.anInt6748 + local59.left, Static350.anInt5988 + local59.top);
		} else {
			Static412.aCanvas7.setLocation(Static399.anInt6748, Static350.anInt5988);
		}
		Static412.aCanvas7.addFocusListener(this);
		Static412.aCanvas7.requestFocus();
		Static82.aBoolean114 = true;
		Static451.aBoolean497 = true;
		Static108.aBoolean137 = true;
		Static444.aBoolean492 = false;
		Static333.aLong197 = Static220.method3314();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZIIIIZLjava/lang/String;)V")
	protected final void method970(@OriginalArg(4) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static90.anInt1891 = 1024;
			Static370.anInt6388 = 1024;
			Static294.anApplet_Sub1_27 = this;
			Static411.anInt6881 = 597;
			Static350.anInt5988 = 0;
			Static340.anInt5756 = 768;
			Static299.anInt4635 = 768;
			Static399.anInt6748 = 0;
			Static451.aFrame2 = new Frame();
			Static451.aFrame2.setTitle("Jagex");
			Static451.aFrame2.setResizable(true);
			Static451.aFrame2.addWindowListener(this);
			Static451.aFrame2.setVisible(true);
			Static451.aFrame2.toFront();
			@Pc(38) Insets local38 = Static451.aFrame2.getInsets();
			Static451.aFrame2.setSize(local38.right + local38.left + Static370.anInt6388, local38.bottom + local38.top + Static299.anInt4635);
			Static418.aClass159_5 = Static171.aClass159_1 = new Class159(null, arg0, arg1, 30);
			@Pc(70) Class270 local70 = Static171.aClass159_1.method3496(1, this);
			while (local70.anInt7548 == 0) {
				Static328.method5696(10L);
			}
		} catch (@Pc(80) Exception local80) {
			Static432.method5720(null, local80);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	protected final void method971(@OriginalArg(0) String arg0) {
		if (this.aBoolean66) {
			return;
		}
		this.aBoolean66 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static464.method2259(Static171.aClass159_1.anApplet1, "loggedout");
		} catch (@Pc(32) Throwable local32) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)Z")
	protected final boolean method972() {
		@Pc(15) String local15 = this.getDocumentBase().getHost().toLowerCase();
		if (local15.equals("jagex.com") || local15.endsWith(".jagex.com")) {
			return true;
		} else if (local15.equals("runescape.com") || local15.endsWith(".runescape.com")) {
			return true;
		} else if (local15.equals("stellardawn.com") || local15.endsWith(".stellardawn.com")) {
			return true;
		} else if (local15.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local15.length() > 0 && local15.charAt(local15.length() - 1) >= '0' && local15.charAt(local15.length() - 1) <= '9') {
				local15 = local15.substring(0, local15.length() - 1);
			}
			if (local15.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method971("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	private void method973() {
		@Pc(6) long local6 = Static220.method3314();
		@Pc(10) long local10 = Static104.aLongArray3[Static399.anInt6747];
		Static104.aLongArray3[Static399.anInt6747] = local6;
		Static399.anInt6747 = Static399.anInt6747 + 1 & 0x1F;
		@Pc(33) boolean local33;
		if (local10 == 0L || local10 >= local6) {
			local33 = false;
		} else {
			local33 = true;
		}
		synchronized (this) {
			Static451.aBoolean497 = Static82.aBoolean114;
		}
		this.method978();
	}

	@OriginalMember(owner = "client!dg", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBIII)V")
	protected final void method974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static294.anApplet_Sub1_27 == null) {
				Static399.anInt6748 = 0;
				Static350.anInt5988 = 0;
				Static90.anInt1891 = arg1;
				Static370.anInt6388 = arg1;
				Static340.anInt5756 = arg2;
				Static299.anInt4635 = arg2;
				Static294.anApplet_Sub1_27 = this;
				Static411.anInt6881 = 597;
				if (Static171.aClass159_1 == null) {
					Static418.aClass159_5 = Static171.aClass159_1 = new Class159(this, arg0, null, 0);
				}
				@Pc(66) Class270 local66 = Static171.aClass159_1.method3496(1, this);
				while (local66.anInt7548 == 0) {
					Static328.method5696(10L);
				}
			} else {
				Static319.anInt5498++;
				if (Static319.anInt5498 >= 3) {
					this.method971("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Throwable local76) {
			Static432.method5720(null, local76);
			this.method971("crash");
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	private void method975() {
		@Pc(6) long local6 = Static220.method3314();
		@Pc(10) long local10 = Static245.aLongArray5[Static122.anInt2502];
		Static245.aLongArray5[Static122.anInt2502] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(31) int local31 = (int) (local6 - local10);
			Static273.anInt4775 = ((local31 >> 1) + 32000) / local31;
		}
		Static122.anInt2502 = Static122.anInt2502 + 1 & 0x1F;
		if (Static373.anInt6411++ > 50) {
			Static108.aBoolean137 = true;
			Static373.anInt6411 -= 50;
			Static412.aCanvas7.setSize(Static90.anInt1891, Static340.anInt5756);
			Static412.aCanvas7.setVisible(true);
			if (Static451.aFrame2 != null && Static95.aFrame1 == null) {
				@Pc(85) Insets local85 = Static451.aFrame2.getInsets();
				Static412.aCanvas7.setLocation(local85.left + Static399.anInt6748, local85.top - -Static350.anInt5988);
			} else {
				Static412.aCanvas7.setLocation(Static399.anInt6748, Static350.anInt5988);
			}
		}
		this.method982();
	}

	@OriginalMember(owner = "client!dg", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static294.anApplet_Sub1_27 == this && !Static178.aBoolean236) {
			Static241.aLong143 = Static220.method3314() + 4000L;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)V")
	private void method976(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static178.aBoolean236) {
				return;
			}
			Static178.aBoolean236 = true;
		}
		if (Static171.aClass159_1.anApplet1 != null) {
			Static171.aClass159_1.anApplet1.destroy();
		}
		try {
			this.method977();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean65) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean65 = false;
		}
		Static408.method5374();
		@Pc(51) Class270 local51 = Static171.aClass159_1.method3524(Static294.anApplet_Sub1_27.getClass());
		while (local51.anInt7548 == 0) {
			Static328.method5696(100L);
		}
		if (Static412.aCanvas7 != null) {
			try {
				Static412.aCanvas7.removeFocusListener(this);
				Static412.aCanvas7.getParent().remove(Static412.aCanvas7);
			} catch (@Pc(73) Exception local73) {
			}
		}
		if (Static171.aClass159_1 != null) {
			try {
				Static171.aClass159_1.method3501();
			} catch (@Pc(83) Exception local83) {
			}
		}
		this.method979();
		if (Static451.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(93) Throwable local93) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	protected abstract void method977();

	@OriginalMember(owner = "client!dg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static82.aBoolean114 = false;
	}

	@OriginalMember(owner = "client!dg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static294.anApplet_Sub1_27 != this || Static178.aBoolean236) {
			return;
		}
		Static108.aBoolean137 = true;
		if (Static343.aBoolean376 && Static220.method3314() - Static333.aLong197 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static370.anInt6388 <= local26.width && Static299.anInt4635 <= local26.height) {
				Static444.aBoolean492 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static451.aFrame2 == null) {
			return Static171.aClass159_1 == null || Static171.aClass159_1.anApplet1 == this ? super.getParameter(arg0) : Static171.aClass159_1.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static294.anApplet_Sub1_27 == this && !Static178.aBoolean236) {
			Static241.aLong143 = Static220.method3314();
			Static328.method5696(5000L);
			Static418.aClass159_5 = null;
			this.method976(false);
		}
	}

	@OriginalMember(owner = "client!dg", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static451.aFrame2 == null) {
			return Static171.aClass159_1 == null || Static171.aClass159_1.anApplet1 == this ? super.getDocumentBase() : Static171.aClass159_1.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static294.anApplet_Sub1_27 == this && !Static178.aBoolean236) {
			Static241.aLong143 = 0L;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	protected abstract void method978();

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V")
	protected abstract void method979();

	@OriginalMember(owner = "client!dg", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)Ljava/lang/String;")
	protected String method980() {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static451.aFrame2 == null) {
			return Static171.aClass159_1 == null || Static171.aClass159_1.anApplet1 == this ? super.getCodeBase() : Static171.aClass159_1.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	public final void method981() {
		if (this.aBoolean65) {
			return;
		}
		try {
			@Pc(22) Class270 local22 = Static171.aClass159_1.method3499(Static294.anApplet_Sub1_27.getClass());
			while (local22.anInt7548 == 0) {
				Static328.method5696(100L);
			}
			if (local22.anObject9 != null) {
				throw (Throwable) local22.anObject9;
			}
			jagmisc.init();
			this.aBoolean65 = true;
			Static312.aClass51_2 = Static26.method339();
		} catch (@Pc(50) Throwable local50) {
		}
	}

	@OriginalMember(owner = "client!dg", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static451.aFrame2 == null) {
			return Static171.aClass159_1 == null || Static171.aClass159_1.anApplet1 == this ? super.getAppletContext() : Static171.aClass159_1.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
	protected abstract void method982();

	@OriginalMember(owner = "client!dg", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!dg", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static240.aString39 != null) {
					@Pc(10) String local10 = Static240.aString39.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(41) String local41 = Static240.aString45;
						if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
							this.method971("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static240.aString45 == null || Static240.aString45.equals("1.4.2"))) {
						this.method971("wrongjava");
						break label107;
					}
				}
				@Pc(71) int local71;
				if (Static240.aString45 != null && Static240.aString45.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (Static240.aString45.length() > local71) {
						@Pc(79) char local79 = Static240.aString45.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local73 = local73 * 10 + local79 - '0';
						local71++;
					}
					if (local73 >= 5) {
						Static343.aBoolean376 = true;
					}
				}
				if (Static171.aClass159_1.anApplet1 != null) {
					@Pc(119) Method local119 = Static240.aMethod2;
					if (local119 != null) {
						try {
							local119.invoke(Static171.aClass159_1.anApplet1, Boolean.TRUE);
						} catch (@Pc(134) Throwable local134) {
						}
					}
				}
				Static456.method6050();
				Static223.method3365();
				this.method969();
				this.method981();
				this.method986();
				Static312.aClass51_2 = Static26.method339();
				this.method981();
				while (Static241.aLong143 == 0L || Static220.method3314() < Static241.aLong143) {
					Static389.anInt6612 = Static312.aClass51_2.method4764(Static4.anInt5772);
					for (local71 = 0; local71 < Static389.anInt6612; local71++) {
						this.method973();
					}
					this.method975();
					Static34.method476(Static171.aClass159_1, Static412.aCanvas7);
				}
			}
		} catch (@Pc(194) Throwable local194) {
			Static432.method5720(this.method980(), local194);
			this.method971("crash");
		}
		this.method976(true);
	}

	@OriginalMember(owner = "client!dg", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static82.aBoolean114 = true;
		Static108.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	protected abstract void method986();
}
