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

@OriginalClass("client!si")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!si", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static212.aFrame1 == null) {
			return Static116.aClass21_4 == null || Static116.aClass21_4.anApplet1 == this ? super.getAppletContext() : Static116.aClass21_4.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static50.anApplet_Sub1_1 == this && !Static21.aBoolean22) {
			Static144.aLong106 = Static335.method5308();
			Static129.method2634(5000L);
			Static21.aClass21_1 = null;
			this.method1008(false);
		}
	}

	@OriginalMember(owner = "client!si", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!si", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static50.anApplet_Sub1_1 != this || Static21.aBoolean22) {
			return;
		}
		Static33.aBoolean54 = true;
		if (Static228.aBoolean340 && Static335.method5308() - Static118.aLong220 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static200.anInt3944 <= local25.width && local25.height >= Static276.anInt5460) {
				Static36.aBoolean79 = true;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public final void method1005() {
		if (this.aBoolean97) {
			return;
		}
		try {
			@Pc(18) Class99 local18 = Static116.aClass21_4.method369(Static50.anApplet_Sub1_1.getClass());
			while (local18.anInt2836 == 0) {
				Static129.method2634(100L);
			}
			if (local18.anObject2 != null) {
				throw (Throwable) local18.anObject2;
			}
			jagmisc.init();
			this.aBoolean97 = true;
			Static81.aClass34_1 = Static207.method3673();
		} catch (@Pc(48) Throwable local48) {
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
	protected abstract void method1006();

	@OriginalMember(owner = "client!si", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!si", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZ)V")
	private void method1008(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static21.aBoolean22) {
				return;
			}
			Static21.aBoolean22 = true;
		}
		if (Static116.aClass21_4.anApplet1 != null) {
			Static116.aClass21_4.anApplet1.destroy();
		}
		try {
			this.method1018();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean97) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean97 = false;
		}
		@Pc(48) Class99 local48 = Static116.aClass21_4.method388(Static50.anApplet_Sub1_1.getClass());
		while (local48.anInt2836 == 0) {
			Static129.method2634(100L);
		}
		if (Static269.aCanvas4 != null) {
			try {
				Static269.aCanvas4.removeFocusListener(this);
				Static269.aCanvas4.getParent().remove(Static269.aCanvas4);
			} catch (@Pc(76) Exception local76) {
			}
		}
		if (Static116.aClass21_4 != null) {
			try {
				Static116.aClass21_4.method391();
			} catch (@Pc(84) Exception local84) {
			}
		}
		this.method1020();
		if (Static212.aFrame1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!si", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	protected abstract void method1009();

	@OriginalMember(owner = "client!si", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static212.aFrame1 == null) {
			return Static116.aClass21_4 == null || Static116.aClass21_4.anApplet1 == this ? super.getDocumentBase() : Static116.aClass21_4.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static145.aBoolean240 = true;
		Static33.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!si", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!si", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static50.anApplet_Sub1_1 == this && !Static21.aBoolean22) {
			Static144.aLong106 = 0L;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZI)V")
	protected final void method1013(@OriginalArg(2) int arg0) {
		try {
			if (Static50.anApplet_Sub1_1 == null) {
				Static107.anInt1503 = 0;
				Static128.anInt2823 = 765;
				Static200.anInt3944 = 765;
				Static50.anApplet_Sub1_1 = this;
				Static314.anInt6029 = 0;
				Static214.anInt4266 = 503;
				Static276.anInt5460 = 503;
				Static88.anInt3955 = 555;
				if (Static116.aClass21_4 == null) {
					Static21.aClass21_1 = Static116.aClass21_4 = new Class21(this, arg0, null, 0);
				}
				@Pc(66) Class99 local66 = Static116.aClass21_4.method375(1, this);
				while (local66.anInt2836 == 0) {
					Static129.method2634(10L);
				}
			} else {
				Static230.anInt5934++;
				if (Static230.anInt5934 >= 3) {
					this.method1024("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			Static46.method1056(null, local76);
			this.method1024("crash");
		}
	}

	@OriginalMember(owner = "client!si", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static212.aFrame1 == null) {
			return Static116.aClass21_4 == null || Static116.aClass21_4.anApplet1 == this ? super.getCodeBase() : Static116.aClass21_4.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static212.aFrame1 == null) {
			return Static116.aClass21_4 == null || Static116.aClass21_4.anApplet1 == this ? super.getParameter(arg0) : Static116.aClass21_4.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
	public final synchronized void method1014() {
		if (Static269.aCanvas4 != null) {
			Static269.aCanvas4.removeFocusListener(this);
			Static269.aCanvas4.getParent().remove(Static269.aCanvas4);
		}
		@Pc(18) Container local18;
		if (Static342.aFrame2 != null) {
			local18 = Static342.aFrame2;
		} else if (Static212.aFrame1 == null) {
			local18 = Static116.aClass21_4.anApplet1;
		} else {
			local18 = Static212.aFrame1;
		}
		local18.setLayout(null);
		Static269.aCanvas4 = new Canvas_Sub1(this);
		local18.add(Static269.aCanvas4);
		Static269.aCanvas4.setSize(Static128.anInt2823, Static214.anInt4266);
		Static269.aCanvas4.setVisible(true);
		if (Static212.aFrame1 == local18) {
			@Pc(55) Insets local55 = Static212.aFrame1.getInsets();
			Static269.aCanvas4.setLocation(local55.left + Static107.anInt1503, Static314.anInt6029 + local55.top);
		} else {
			Static269.aCanvas4.setLocation(Static107.anInt1503, Static314.anInt6029);
		}
		Static269.aCanvas4.addFocusListener(this);
		Static269.aCanvas4.requestFocus();
		Static145.aBoolean240 = true;
		Static71.aBoolean130 = true;
		Static33.aBoolean54 = true;
		Static36.aBoolean79 = false;
		Static118.aLong220 = Static335.method5308();
	}

	@OriginalMember(owner = "client!si", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static50.anApplet_Sub1_1 == this && !Static21.aBoolean22) {
			Static144.aLong106 = Static335.method5308() + 4000L;
		}
	}

	@OriginalMember(owner = "client!si", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static145.aBoolean240 = false;
	}

	@OriginalMember(owner = "client!si", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static22.aString38 != null) {
					@Pc(10) String local10 = Static22.aString38.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(40) String local40 = Static22.aString36;
						if (local40.equals("1.1") || local40.startsWith("1.1.") || local40.equals("1.2") || local40.startsWith("1.2.")) {
							this.method1024("wrongjava");
							break label108;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static22.aString36 == null || Static22.aString36.equals("1.4.2"))) {
						this.method1024("wrongjava");
						break label108;
					}
				}
				@Pc(70) int local70;
				if (Static22.aString36 != null && Static22.aString36.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static22.aString36.length() > local70) {
						@Pc(78) char local78 = Static22.aString36.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local78 + local72 * 10 - 48;
					}
					if (local72 >= 5) {
						Static228.aBoolean340 = true;
					}
				}
				if (Static116.aClass21_4.anApplet1 != null) {
					@Pc(116) Method local116 = Static22.aMethod1;
					if (local116 != null) {
						try {
							local116.invoke(Static116.aClass21_4.anApplet1, Boolean.TRUE);
						} catch (@Pc(131) Throwable local131) {
						}
					}
				}
				Static194.method1512();
				this.method1014();
				this.method1009();
				Static81.aClass34_1 = Static207.method3673();
				this.method1005();
				while (Static144.aLong106 == 0L || Static335.method5308() < Static144.aLong106) {
					Static310.anInt5908 = Static81.aClass34_1.method5276(Static41.anInt1072);
					for (local70 = 0; local70 < Static310.anInt5908; local70++) {
						this.method1021();
					}
					this.method1016();
					Static304.method4915(Static269.aCanvas4, Static116.aClass21_4);
				}
			}
		} catch (@Pc(182) Exception local182) {
			Static46.method1056(null, local182);
			this.method1024("crash");
		}
		this.method1008(true);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIILjava/lang/String;ZIII)V")
	protected final void method1015(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static128.anInt2823 = 1024;
			Static200.anInt3944 = 1024;
			Static214.anInt4266 = 768;
			Static276.anInt5460 = 768;
			Static88.anInt3955 = 555;
			Static107.anInt1503 = 0;
			Static314.anInt6029 = 0;
			Static50.anApplet_Sub1_1 = this;
			Static212.aFrame1 = new Frame();
			Static212.aFrame1.setTitle("Jagex");
			Static212.aFrame1.setResizable(true);
			Static212.aFrame1.addWindowListener(this);
			Static212.aFrame1.setVisible(true);
			Static212.aFrame1.toFront();
			@Pc(43) Insets local43 = Static212.aFrame1.getInsets();
			Static212.aFrame1.setSize(Static200.anInt3944 + local43.left + local43.right, local43.top + Static276.anInt5460 - -local43.bottom);
			Static21.aClass21_1 = Static116.aClass21_4 = new Class21(null, arg0, arg1, 29);
			@Pc(78) Class99 local78 = Static116.aClass21_4.method375(1, this);
			while (local78.anInt2836 == 0) {
				Static129.method2634(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static46.method1056(null, local88);
		}
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	private void method1016() {
		@Pc(6) long local6 = Static335.method5308();
		@Pc(10) long local10 = Static93.aLongArray4[Static58.anInt1487];
		Static93.aLongArray4[Static58.anInt1487] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(32) int local32 = (int) (local6 - local10);
			Static5.anInt82 = ((local32 >> 1) + 32000) / local32;
		}
		Static58.anInt1487 = Static58.anInt1487 + 1 & 0x1F;
		if (Static140.anInt3042++ > 50) {
			Static33.aBoolean54 = true;
			Static140.anInt3042 -= 50;
			Static269.aCanvas4.setSize(Static128.anInt2823, Static214.anInt4266);
			Static269.aCanvas4.setVisible(true);
			if (Static212.aFrame1 != null && Static342.aFrame2 == null) {
				@Pc(81) Insets local81 = Static212.aFrame1.getInsets();
				Static269.aCanvas4.setLocation(local81.left + Static107.anInt1503, Static314.anInt6029 + local81.top);
			} else {
				Static269.aCanvas4.setLocation(Static107.anInt1503, Static314.anInt6029);
			}
		}
		this.method1017();
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
	protected abstract void method1017();

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
	protected abstract void method1018();

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(I)Z")
	protected final boolean method1019() {
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
				this.method1024("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(B)V")
	protected abstract void method1020();

	@OriginalMember(owner = "client!si", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(Z)V")
	private void method1021() {
		@Pc(6) long local6 = Static335.method5308();
		@Pc(10) long local10 = Static253.aLongArray7[Static108.anInt1317];
		Static253.aLongArray7[Static108.anInt1317] = local6;
		Static108.anInt1317 = Static108.anInt1317 + 1 & 0x1F;
		@Pc(36) boolean local36;
		if (local10 == 0L || local6 <= local10) {
			local36 = false;
		} else {
			local36 = true;
		}
		synchronized (this) {
			Static71.aBoolean130 = Static145.aBoolean240;
		}
		this.method1006();
	}

	@OriginalMember(owner = "client!si", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!si", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method1024(@OriginalArg(0) String arg0) {
		if (this.aBoolean98) {
			return;
		}
		this.aBoolean98 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static362.method3353("loggedout", Static116.aClass21_4.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!si", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}
}
