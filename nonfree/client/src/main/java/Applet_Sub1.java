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

@OriginalClass("client!vh")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "Z")
	private boolean aBoolean93 = false;

	static {
		new Class158(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!vh", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static60.aBoolean106 = false;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	protected abstract void method1029();

	@OriginalMember(owner = "client!vh", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static60.aBoolean106 = true;
		Static274.aBoolean331 = true;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	protected abstract void method1030();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	protected final void method1031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static352.anApplet_Sub1_1 == null) {
				Static152.anInt3234 = arg2;
				Static134.anInt2979 = arg2;
				Static224.anInt7000 = 598;
				Static342.anInt6292 = arg1;
				Static270.anInt5255 = arg1;
				Static299.anInt1304 = 0;
				Static352.anApplet_Sub1_1 = this;
				Static8.anInt96 = 0;
				if (Static150.aClass183_3 == null) {
					Static58.aClass183_2 = Static150.aClass183_3 = new Class183(this, arg0, null, 0);
				}
				@Pc(66) Class157 local66 = Static150.aClass183_3.method4141(this, 1);
				while (local66.anInt4667 == 0) {
					Static289.method4249(10L);
				}
			} else {
				Static311.anInt5840++;
				if (Static311.anInt5840 >= 3) {
					this.method1041("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(81) Throwable local81) {
			Static247.method3669(null, local81);
			this.method1041("crash");
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Ljava/lang/String;")
	protected String method1032() {
		return null;
	}

	@OriginalMember(owner = "client!vh", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!vh", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static416.aFrame3 == null) {
			return Static150.aClass183_3 == null || Static150.aClass183_3.anApplet1 == this ? super.getAppletContext() : Static150.aClass183_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	protected abstract void method1033();

	@OriginalMember(owner = "client!vh", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label107: {
				if (Static282.aString42 != null) {
					@Pc(10) String local10 = Static282.aString42.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(41) String local41 = Static282.aString44;
						if (local41.equals("1.1") || local41.startsWith("1.1.") || local41.equals("1.2") || local41.startsWith("1.2.")) {
							this.method1041("wrongjava");
							break label107;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static282.aString44 == null || Static282.aString44.equals("1.4.2"))) {
						this.method1041("wrongjava");
						break label107;
					}
				}
				@Pc(71) int local71;
				if (Static282.aString44 != null && Static282.aString44.startsWith("1.")) {
					local71 = 2;
					@Pc(73) int local73 = 0;
					while (Static282.aString44.length() > local71) {
						@Pc(79) char local79 = Static282.aString44.charAt(local71);
						if (local79 < '0' || local79 > '9') {
							break;
						}
						local73 = local73 * 10 + local79 - 48;
						local71++;
					}
					if (local73 >= 5) {
						Static101.aBoolean155 = true;
					}
				}
				if (Static150.aClass183_3.anApplet1 != null) {
					@Pc(113) Method local113 = Static282.aMethod1;
					if (local113 != null) {
						try {
							local113.invoke(Static150.aClass183_3.anApplet1, Boolean.TRUE);
						} catch (@Pc(128) Throwable local128) {
						}
					}
				}
				Static423.method5738();
				Static187.method3080();
				this.method1034();
				this.method1043();
				this.method1030();
				Static311.aClass74_1 = Static5.method55();
				this.method1043();
				while (Static205.aLong114 == 0L || Static250.method3737() < Static205.aLong114) {
					Static383.anInt6986 = Static311.aClass74_1.method6075(Static14.anInt198);
					for (local71 = 0; local71 < Static383.anInt6986; local71++) {
						this.method1040();
					}
					this.method1044();
					Static193.method3128(Static443.aCanvas33, Static150.aClass183_3);
				}
			}
		} catch (@Pc(190) Throwable local190) {
			Static247.method3669(this.method1032(), local190);
			this.method1041("crash");
		}
		this.method1035(true);
	}

	@OriginalMember(owner = "client!vh", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static416.aFrame3 == null) {
			return Static150.aClass183_3 == null || Static150.aClass183_3.anApplet1 == this ? super.getDocumentBase() : Static150.aClass183_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	public final synchronized void method1034() {
		if (Static443.aCanvas33 != null) {
			Static443.aCanvas33.removeFocusListener(this);
			Static443.aCanvas33.getParent().remove(Static443.aCanvas33);
		}
		@Pc(16) Container local16;
		if (Static93.aFrame2 != null) {
			local16 = Static93.aFrame2;
		} else if (Static416.aFrame3 == null) {
			local16 = Static150.aClass183_3.anApplet1;
		} else {
			local16 = Static416.aFrame3;
		}
		local16.setLayout(null);
		Static443.aCanvas33 = new Canvas_Sub1(this);
		local16.add(Static443.aCanvas33);
		Static443.aCanvas33.setSize(Static152.anInt3234, Static342.anInt6292);
		Static443.aCanvas33.setVisible(true);
		if (local16 == Static416.aFrame3) {
			@Pc(55) Insets local55 = Static416.aFrame3.getInsets();
			Static443.aCanvas33.setLocation(Static8.anInt96 + local55.left, Static299.anInt1304 + local55.top);
		} else {
			Static443.aCanvas33.setLocation(Static8.anInt96, Static299.anInt1304);
		}
		Static443.aCanvas33.addFocusListener(this);
		Static443.aCanvas33.requestFocus();
		Static266.aBoolean321 = true;
		Static60.aBoolean106 = true;
		Static274.aBoolean331 = true;
		Static116.aBoolean168 = false;
		Static241.aLong128 = Static250.method3737();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
	private void method1035(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static185.aBoolean244) {
				return;
			}
			Static185.aBoolean244 = true;
		}
		if (Static150.aClass183_3.anApplet1 != null) {
			Static150.aClass183_3.anApplet1.destroy();
		}
		try {
			this.method1029();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean93) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean93 = false;
		}
		Static252.method3748();
		@Pc(51) Class157 local51 = Static150.aClass183_3.method4163(Static352.anApplet_Sub1_1.getClass());
		while (local51.anInt4667 == 0) {
			Static289.method4249(100L);
		}
		if (Static443.aCanvas33 != null) {
			try {
				Static443.aCanvas33.removeFocusListener(this);
				Static443.aCanvas33.getParent().remove(Static443.aCanvas33);
			} catch (@Pc(78) Exception local78) {
			}
		}
		if (Static150.aClass183_3 != null) {
			try {
				Static150.aClass183_3.method4142();
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.method1042();
		if (Static416.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(96) Throwable local96) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!vh", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!vh", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static416.aFrame3 == null) {
			return Static150.aClass183_3 == null || Static150.aClass183_3.anApplet1 == this ? super.getCodeBase() : Static150.aClass183_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static352.anApplet_Sub1_1 != this || Static185.aBoolean244) {
			return;
		}
		Static274.aBoolean331 = true;
		if (Static101.aBoolean155 && Static250.method3737() - Static241.aLong128 > 1000L) {
			@Pc(23) Rectangle local23 = arg0.getClipBounds();
			if (local23 == null || Static134.anInt2979 <= local23.width && local23.height >= Static270.anInt5255) {
				Static116.aBoolean168 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)Z")
	protected final boolean method1037() {
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
				this.method1041("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
	protected abstract void method1039();

	@OriginalMember(owner = "client!vh", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static352.anApplet_Sub1_1 == this && !Static185.aBoolean244) {
			Static205.aLong114 = 0L;
		}
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
	private void method1040() {
		@Pc(11) long local11 = Static250.method3737();
		@Pc(15) long local15 = Static17.aLongArray1[Static311.anInt5836];
		Static17.aLongArray1[Static311.anInt5836] = local11;
		Static311.anInt5836 = Static311.anInt5836 + 1 & 0x1F;
		@Pc(34) boolean local34;
		if (local15 == 0L || local15 >= local11) {
			local34 = false;
		} else {
			local34 = true;
		}
		synchronized (this) {
			Static266.aBoolean321 = Static60.aBoolean106;
		}
		this.method1039();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1041(@OriginalArg(1) String arg0) {
		if (this.aBoolean92) {
			return;
		}
		this.aBoolean92 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static466.method4995("loggedout", Static150.aClass183_3.anApplet1);
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!vh", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	protected abstract void method1042();

	@OriginalMember(owner = "client!vh", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)V")
	public final void method1043() {
		if (this.aBoolean93) {
			return;
		}
		try {
			@Pc(16) Class157 local16 = Static150.aClass183_3.method4139(Static352.anApplet_Sub1_1.getClass());
			while (local16.anInt4667 == 0) {
				Static289.method4249(100L);
			}
			if (local16.anObject13 != null) {
				throw (Throwable) local16.anObject13;
			}
			jagmisc.init();
			this.aBoolean93 = true;
			Static311.aClass74_1 = Static5.method55();
		} catch (@Pc(40) Throwable local40) {
		}
	}

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "(B)V")
	private void method1044() {
		@Pc(6) long local6 = Static250.method3737();
		@Pc(10) long local10 = Static221.aLongArray5[Static303.anInt5715];
		Static221.aLongArray5[Static303.anInt5715] = local6;
		Static303.anInt5715 = Static303.anInt5715 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(40) int local40 = (int) (local6 - local10);
			Static441.anInt7762 = ((local40 >> 1) + 32000) / local40;
		}
		if (Static304.anInt5721++ > 50) {
			Static304.anInt5721 -= 50;
			Static274.aBoolean331 = true;
			Static443.aCanvas33.setSize(Static152.anInt3234, Static342.anInt6292);
			Static443.aCanvas33.setVisible(true);
			if (Static416.aFrame3 != null && Static93.aFrame2 == null) {
				@Pc(83) Insets local83 = Static416.aFrame3.getInsets();
				Static443.aCanvas33.setLocation(local83.left + Static8.anInt96, Static299.anInt1304 + local83.top);
			} else {
				Static443.aCanvas33.setLocation(Static8.anInt96, Static299.anInt1304);
			}
		}
		this.method1033();
	}

	@OriginalMember(owner = "client!vh", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!vh", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static416.aFrame3 == null) {
			return Static150.aClass183_3 == null || Static150.aClass183_3.anApplet1 == this ? super.getParameter(arg0) : Static150.aClass183_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vh", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static352.anApplet_Sub1_1 == this && !Static185.aBoolean244) {
			Static205.aLong114 = Static250.method3737();
			Static289.method4249(5000L);
			Static58.aClass183_2 = null;
			this.method1035(false);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZILjava/lang/String;ZIIII)V")
	protected final void method1045(@OriginalArg(2) String arg0, @OriginalArg(4) int arg1) {
		try {
			Static352.anApplet_Sub1_1 = this;
			Static342.anInt6292 = 768;
			Static270.anInt5255 = 768;
			Static224.anInt7000 = 598;
			Static299.anInt1304 = 0;
			Static8.anInt96 = 0;
			Static152.anInt3234 = 1024;
			Static134.anInt2979 = 1024;
			Static416.aFrame3 = new Frame();
			Static416.aFrame3.setTitle("Jagex");
			Static416.aFrame3.setResizable(true);
			Static416.aFrame3.addWindowListener(this);
			Static416.aFrame3.setVisible(true);
			Static416.aFrame3.toFront();
			@Pc(38) Insets local38 = Static416.aFrame3.getInsets();
			Static416.aFrame3.setSize(local38.right + Static134.anInt2979 + local38.left, local38.bottom + Static270.anInt5255 + local38.top);
			Static58.aClass183_2 = Static150.aClass183_3 = new Class183(null, arg1, arg0, 30);
			@Pc(70) Class157 local70 = Static150.aClass183_3.method4141(this, 1);
			while (local70.anInt4667 == 0) {
				Static289.method4249(10L);
			}
		} catch (@Pc(80) Exception local80) {
			Static247.method3669(null, local80);
		}
	}

	@OriginalMember(owner = "client!vh", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static352.anApplet_Sub1_1 == this && !Static185.aBoolean244) {
			Static205.aLong114 = Static250.method3737() + 4000L;
		}
	}
}
