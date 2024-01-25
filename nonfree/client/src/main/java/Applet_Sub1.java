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

@OriginalClass("client!up")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!up", name = "h", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Z")
	private boolean aBoolean122 = false;

	static {
		new Class45("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!up", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static306.aFrame2 == null) {
			return Static473.aClass229_14 == null || Static473.aClass229_14.anApplet1 == this ? super.getCodeBase() : Static473.aClass229_14.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!up", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static261.aBoolean377 = true;
		Static221.aBoolean338 = true;
	}

	@OriginalMember(owner = "client!up", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	protected abstract void method1549();

	@OriginalMember(owner = "client!up", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static521.anApplet_Sub1_1 == this && !Static285.aBoolean413) {
			Static74.aLong44 = Static110.method2222() + 4000L;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Z")
	protected final boolean method1550() {
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
				this.method1553("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static521.anApplet_Sub1_1 == this && !Static285.aBoolean413) {
			Static74.aLong44 = 0L;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Ljava/lang/String;")
	public String method1551() {
		return null;
	}

	@OriginalMember(owner = "client!up", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!up", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static306.aFrame2 == null) {
			return Static473.aClass229_14 == null || Static473.aClass229_14.anApplet1 == this ? super.getAppletContext() : Static473.aClass229_14.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Z")
	protected final boolean method1552() {
		return Static259.method4668("jaclib");
	}

	@OriginalMember(owner = "client!up", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method1553(@OriginalArg(1) String arg0) {
		if (this.aBoolean121) {
			return;
		}
		this.aBoolean121 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static558.method7782("loggedout", Static473.aClass229_14.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!up", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!up", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static306.aFrame2 == null) {
			return Static473.aClass229_14 == null || Static473.aClass229_14.anApplet1 == this ? super.getDocumentBase() : Static473.aClass229_14.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	private void method1555() {
		@Pc(11) long local11 = Static110.method2222();
		@Pc(15) long local15 = Static109.aLongArray10[Static544.anInt7852];
		Static109.aLongArray10[Static544.anInt7852] = local11;
		Static544.anInt7852 = Static544.anInt7852 + 1 & 0x1F;
		if (local15 != 0L && local11 > local15) {
			@Pc(39) int local39 = (int) (local11 - local15);
			Static10.anInt280 = ((local39 >> 1) + 32000) / local39;
		}
		if (Static304.anInt5905++ > 50) {
			Static304.anInt5905 -= 50;
			Static221.aBoolean338 = true;
			Static312.aCanvas12.setSize(Static70.anInt1753, Static508.anInt8910);
			Static312.aCanvas12.setVisible(true);
			if (Static306.aFrame2 != null && Static189.aFrame1 == null) {
				@Pc(76) Insets local76 = Static306.aFrame2.getInsets();
				Static312.aCanvas12.setLocation(Static410.anInt7609 + local76.left, local76.top - -Static466.anInt8038);
			} else {
				Static312.aCanvas12.setLocation(Static410.anInt7609, Static466.anInt8038);
			}
		}
		this.method1560();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIII)V")
	protected final void method1556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			if (Static521.anApplet_Sub1_1 == null) {
				Static508.anInt8910 = arg2;
				Static199.anInt1460 = arg2;
				Static70.anInt1753 = arg1;
				Static204.anInt4066 = arg1;
				Static453.anInt7916 = 605;
				Static521.anApplet_Sub1_1 = this;
				Static466.anInt8038 = 0;
				Static410.anInt7609 = 0;
				if (Static473.aClass229_14 == null) {
					Static461.aClass229_16 = Static473.aClass229_14 = new Class229(this, arg0, null, 0);
				}
				@Pc(66) Class311 local66 = Static473.aClass229_14.method6060(1, this);
				while (local66.anInt9169 == 0) {
					Static265.method3147(10L);
				}
			} else {
				Static251.anInt4893++;
				if (Static251.anInt4893 >= 3) {
					this.method1553("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(79) Throwable local79) {
			Static25.method773(local79, null);
			this.method1553("crash");
		}
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
	protected abstract void method1557();

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
	public final synchronized void method1558() {
		if (Static312.aCanvas12 != null) {
			Static312.aCanvas12.removeFocusListener(this);
			Static312.aCanvas12.getParent().remove(Static312.aCanvas12);
		}
		@Pc(21) Container local21;
		if (Static189.aFrame1 != null) {
			local21 = Static189.aFrame1;
		} else if (Static306.aFrame2 == null) {
			local21 = Static473.aClass229_14.anApplet1;
		} else {
			local21 = Static306.aFrame2;
		}
		local21.setLayout(null);
		Static312.aCanvas12 = new Canvas_Sub1(this);
		local21.add(Static312.aCanvas12);
		Static312.aCanvas12.setSize(Static70.anInt1753, Static508.anInt8910);
		Static312.aCanvas12.setVisible(true);
		if (Static306.aFrame2 == local21) {
			@Pc(54) Insets local54 = Static306.aFrame2.getInsets();
			Static312.aCanvas12.setLocation(Static410.anInt7609 + local54.left, local54.top + Static466.anInt8038);
		} else {
			Static312.aCanvas12.setLocation(Static410.anInt7609, Static466.anInt8038);
		}
		Static312.aCanvas12.addFocusListener(this);
		Static312.aCanvas12.requestFocus();
		Static87.aBoolean160 = true;
		Static261.aBoolean377 = true;
		Static221.aBoolean338 = true;
		Static73.aBoolean145 = false;
		Static472.aLong225 = Static110.method2222();
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)V")
	protected abstract void method1559();

	@OriginalMember(owner = "client!up", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!up", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!up", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static521.anApplet_Sub1_1 == this && !Static285.aBoolean413) {
			Static74.aLong44 = Static110.method2222();
			Static265.method3147(5000L);
			Static461.aClass229_16 = null;
			this.method1561(false);
		}
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)V")
	protected abstract void method1560();

	@OriginalMember(owner = "client!up", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!up", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static306.aFrame2 == null) {
			return Static473.aClass229_14 == null || Static473.aClass229_14.anApplet1 == this ? super.getParameter(arg0) : Static473.aClass229_14.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
	private void method1561(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static285.aBoolean413) {
				return;
			}
			Static285.aBoolean413 = true;
		}
		if (Static473.aClass229_14.anApplet1 != null) {
			Static473.aClass229_14.anApplet1.destroy();
		}
		try {
			this.method1559();
		} catch (@Pc(31) Exception local31) {
		}
		if (this.aBoolean122) {
			try {
				jagmisc.quit();
			} catch (@Pc(37) Throwable local37) {
			}
			this.aBoolean122 = false;
		}
		Static300.method5315();
		Static113.method2232();
		if (Static312.aCanvas12 != null) {
			try {
				Static312.aCanvas12.removeFocusListener(this);
				Static312.aCanvas12.getParent().remove(Static312.aCanvas12);
			} catch (@Pc(57) Exception local57) {
			}
		}
		if (Static473.aClass229_14 != null) {
			try {
				Static473.aClass229_14.method6065();
			} catch (@Pc(65) Exception local65) {
			}
		}
		this.method1549();
		if (Static306.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(79) Throwable local79) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!up", name = "h", descriptor = "(I)V")
	private void method1562() {
		@Pc(6) long local6 = Static110.method2222();
		@Pc(10) long local10 = Static54.aLongArray8[Static67.anInt1738];
		Static54.aLongArray8[Static67.anInt1738] = local6;
		@Pc(27) boolean local27;
		if (local10 == 0L || local10 >= local6) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static67.anInt1738 = Static67.anInt1738 + 1 & 0x1F;
		synchronized (this) {
			Static87.aBoolean160 = Static261.aBoolean377;
		}
		this.method1564();
	}

	@OriginalMember(owner = "client!up", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static261.aBoolean377 = false;
	}

	@OriginalMember(owner = "client!up", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label112: {
				if (Static380.aString168 != null) {
					@Pc(10) String local10 = Static380.aString168.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static380.aString172;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1553("wrongjava");
							break label112;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static380.aString172 == null || Static380.aString172.equals("1.4.2"))) {
						this.method1553("wrongjava");
						break label112;
					}
				}
				@Pc(71) int local71;
				if (Static380.aString172 != null && Static380.aString172.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (local71 < Static380.aString172.length()) {
						@Pc(79) char local79 = Static380.aString172.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local71++;
						local73 = local79 + local73 * 10 - 48;
					}
					if (local73 >= 5) {
						Static89.aBoolean171 = true;
					}
				}
				if (Static473.aClass229_14.anApplet1 != null) {
					@Pc(114) Method local114 = Static380.aMethod1;
					if (local114 != null) {
						try {
							local114.invoke(Static473.aClass229_14.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static51.method1410();
				Static40.method1126();
				this.method1558();
				this.method1557();
				Static230.aClass93_1 = Static329.method5610();
				while (Static74.aLong44 == 0L || Static110.method2222() < Static74.aLong44) {
					Static86.anInt1928 = Static230.aClass93_1.method7552(Static198.aLong104);
					for (local71 = 0; local71 < Static86.anInt1928; local71++) {
						this.method1562();
					}
					this.method1555();
					Static31.method7358(Static473.aClass229_14, Static312.aCanvas12);
				}
			}
		} catch (@Pc(185) Throwable local185) {
			Static25.method773(local185, this.method1551());
			this.method1553("crash");
		}
		this.method1561(true);
	}

	@OriginalMember(owner = "client!up", name = "i", descriptor = "(I)Z")
	public final boolean method1563() {
		return Static259.method4668("jagmisc");
	}

	@OriginalMember(owner = "client!up", name = "j", descriptor = "(I)V")
	protected abstract void method1564();

	@OriginalMember(owner = "client!up", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static521.anApplet_Sub1_1 != this || Static285.aBoolean413) {
			return;
		}
		Static221.aBoolean338 = true;
		if (Static89.aBoolean171 && Static110.method2222() - Static472.aLong225 > 1000L) {
			@Pc(24) Rectangle local24 = arg0.getClipBounds();
			if (local24 == null || local24.width >= Static204.anInt4066 && local24.height >= Static199.anInt1460) {
				Static73.aBoolean145 = true;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZLjava/lang/String;IIZI)V")
	protected final void method1565(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		try {
			Static466.anInt8038 = 0;
			Static453.anInt7916 = 605;
			Static70.anInt1753 = 1024;
			Static204.anInt4066 = 1024;
			Static410.anInt7609 = 0;
			Static521.anApplet_Sub1_1 = this;
			Static508.anInt8910 = 768;
			Static199.anInt1460 = 768;
			Static306.aFrame2 = new Frame();
			Static306.aFrame2.setTitle("Jagex");
			Static306.aFrame2.setResizable(true);
			Static306.aFrame2.addWindowListener(this);
			Static306.aFrame2.setVisible(true);
			Static306.aFrame2.toFront();
			@Pc(44) Insets local44 = Static306.aFrame2.getInsets();
			Static306.aFrame2.setSize(local44.left + Static204.anInt4066 + local44.right, local44.top + Static199.anInt1460 - -local44.bottom);
			Static461.aClass229_16 = Static473.aClass229_14 = new Class229(null, arg0, arg1, 32);
			@Pc(77) Class311 local77 = Static473.aClass229_14.method6060(1, this);
			while (local77.anInt9169 == 0) {
				Static265.method3147(10L);
			}
		} catch (@Pc(87) Exception local87) {
			Static25.method773(local87, null);
		}
	}
}
