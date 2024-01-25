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

@OriginalClass("client!ko")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Ljava/lang/String;")
	public String method1510() {
		return null;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public final synchronized void method1511() {
		if (Static301.aCanvas11 != null) {
			Static301.aCanvas11.removeFocusListener(this);
			Static301.aCanvas11.getParent().remove(Static301.aCanvas11);
		}
		@Pc(18) Container local18;
		if (Static241.aFrame25 != null) {
			local18 = Static241.aFrame25;
		} else if (Static308.aFrame17 == null) {
			local18 = Static375.aClass71_3.anApplet1;
		} else {
			local18 = Static308.aFrame17;
		}
		local18.setLayout(null);
		Static301.aCanvas11 = new Canvas_Sub1(this);
		local18.add(Static301.aCanvas11);
		Static301.aCanvas11.setSize(Static169.anInt3893, Static127.anInt2936);
		Static301.aCanvas11.setVisible(true);
		if (Static308.aFrame17 == local18) {
			@Pc(60) Insets local60 = Static308.aFrame17.getInsets();
			Static301.aCanvas11.setLocation(local60.left + Static37.anInt7517, Static193.anInt4312 + local60.top);
		} else {
			Static301.aCanvas11.setLocation(Static37.anInt7517, Static193.anInt4312);
		}
		Static301.aCanvas11.addFocusListener(this);
		Static301.aCanvas11.requestFocus();
		Static38.aBoolean44 = true;
		Static319.aBoolean460 = true;
		Static117.aBoolean219 = true;
		Static288.aBoolean427 = false;
		Static183.aLong112 = Static76.method1679();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZBIIILjava/lang/String;I)V")
	protected final void method1512(@OriginalArg(4) int arg0, @OriginalArg(6) String arg1) {
		try {
			Static193.anInt4312 = 0;
			Static505.anInt9096 = 606;
			Static218.anApplet_Sub1_1 = this;
			Static127.anInt2936 = 768;
			Static121.anInt2757 = 768;
			Static37.anInt7517 = 0;
			Static169.anInt3893 = 1024;
			Static352.anInt6601 = 1024;
			Static308.aFrame17 = new Frame();
			Static308.aFrame17.setTitle("Jagex");
			Static308.aFrame17.setResizable(true);
			Static308.aFrame17.addWindowListener(this);
			Static308.aFrame17.setVisible(true);
			Static308.aFrame17.toFront();
			@Pc(48) Insets local48 = Static308.aFrame17.getInsets();
			Static308.aFrame17.setSize(Static352.anInt6601 + local48.left + local48.right, local48.bottom + Static121.anInt2757 - -local48.top);
			Static239.aClass71_2 = Static375.aClass71_3 = new Class71(null, arg0, arg1, 32);
			@Pc(81) Class55 local81 = Static375.aClass71_3.method1988(this, 1);
			while (local81.anInt1481 == 0) {
				Static17.method388(10L);
			}
		} catch (@Pc(94) Exception local94) {
			Static508.method7541(local94, null);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z")
	protected final boolean method1513() {
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
				this.method1526("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static218.anApplet_Sub1_1 != this || Static504.aBoolean644) {
			return;
		}
		Static117.aBoolean219 = true;
		if (Static53.aBoolean99 && Static76.method1679() - Static183.aLong112 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static352.anInt6601 <= local25.width && Static121.anInt2757 <= local25.height) {
				Static288.aBoolean427 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static319.aBoolean460 = false;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	protected abstract void method1514();

	@OriginalMember(owner = "client!ko", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static308.aFrame17 == null) {
			return Static375.aClass71_3 == null || Static375.aClass71_3.anApplet1 == this ? super.getParameter(arg0) : Static375.aClass71_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)V")
	protected abstract void method1516();

	@OriginalMember(owner = "client!ko", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static308.aFrame17 == null) {
			return Static375.aClass71_3 == null || Static375.aClass71_3.anApplet1 == this ? super.getDocumentBase() : Static375.aClass71_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label111: {
				if (Static92.aString15 != null) {
					@Pc(10) String local10 = Static92.aString15.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static92.aString20;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method1526("wrongjava");
							break label111;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static92.aString20 == null || Static92.aString20.equals("1.4.2"))) {
						this.method1526("wrongjava");
						break label111;
					}
				}
				@Pc(70) int local70;
				if (Static92.aString20 != null && Static92.aString20.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static92.aString20.length() > local70) {
						@Pc(78) char local78 = Static92.aString20.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local72 = local72 * 10 + local78 - '0';
						local70++;
					}
					if (local72 >= 5) {
						Static53.aBoolean99 = true;
					}
				}
				if (Static375.aClass71_3.anApplet1 != null) {
					@Pc(114) Method local114 = Static92.aMethod2;
					if (local114 != null) {
						try {
							local114.invoke(Static375.aClass71_3.anApplet1, Boolean.TRUE);
						} catch (@Pc(129) Throwable local129) {
						}
					}
				}
				Static113.method2342();
				Static29.method554();
				this.method1511();
				this.method1514();
				Static30.aClass89_2 = Static477.method7162();
				while (Static17.aLong6 == 0L || Static76.method1679() < Static17.aLong6) {
					Static306.anInt5967 = Static30.aClass89_2.method6697(Static242.aLong131);
					for (local70 = 0; local70 < Static306.anInt5967; local70++) {
						this.method1522();
					}
					this.method1527();
					Static148.method5739(Static301.aCanvas11, Static375.aClass71_3);
				}
			}
		} catch (@Pc(181) Throwable local181) {
			Static508.method7541(local181, this.method1510());
			this.method1526("crash");
		}
		this.method1523(true);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)Z")
	public final boolean method1518() {
		return Static222.method4058("jagmisc");
	}

	@OriginalMember(owner = "client!ko", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIZI)V")
	protected final void method1519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (Static218.anApplet_Sub1_1 == null) {
				Static218.anApplet_Sub1_1 = this;
				Static505.anInt9096 = 606;
				Static127.anInt2936 = arg2;
				Static121.anInt2757 = arg2;
				Static169.anInt3893 = arg1;
				Static352.anInt6601 = arg1;
				Static193.anInt4312 = 0;
				Static37.anInt7517 = 0;
				if (Static375.aClass71_3 == null) {
					Static239.aClass71_2 = Static375.aClass71_3 = new Class71(this, arg0, null, 0);
				}
				@Pc(66) Class55 local66 = Static375.aClass71_3.method1988(this, 1);
				while (local66.anInt1481 == 0) {
					Static17.method388(10L);
				}
			} else {
				Static336.anInt6443++;
				if (Static336.anInt6443 >= 3) {
					this.method1526("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Throwable local76) {
			Static508.method7541(local76, null);
			this.method1526("crash");
		}
	}

	@OriginalMember(owner = "client!ko", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!ko", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static218.anApplet_Sub1_1 == this && !Static504.aBoolean644) {
			Static17.aLong6 = Static76.method1679() + 4000L;
		}
	}

	@OriginalMember(owner = "client!ko", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static218.anApplet_Sub1_1 == this && !Static504.aBoolean644) {
			Static17.aLong6 = Static76.method1679();
			Static17.method388(5000L);
			Static239.aClass71_2 = null;
			this.method1523(false);
		}
	}

	@OriginalMember(owner = "client!ko", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	protected abstract void method1520();

	@OriginalMember(owner = "client!ko", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Z")
	protected final boolean method1521() {
		return Static222.method4058("jaclib");
	}

	@OriginalMember(owner = "client!ko", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
	private void method1522() {
		@Pc(6) long local6 = Static76.method1679();
		@Pc(10) long local10 = Static63.aLongArray18[Static327.anInt6160];
		Static63.aLongArray18[Static327.anInt6160] = local6;
		Static327.anInt6160 = Static327.anInt6160 + 1 & 0x1F;
		@Pc(30) boolean local30;
		if (local10 == (long) 0 || local6 <= local10) {
			local30 = false;
		} else {
			local30 = true;
		}
		synchronized (this) {
			Static38.aBoolean44 = Static319.aBoolean460;
		}
		this.method1525();
	}

	@OriginalMember(owner = "client!ko", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static308.aFrame17 == null) {
			return Static375.aClass71_3 == null || Static375.aClass71_3.anApplet1 == this ? super.getAppletContext() : Static375.aClass71_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
	private void method1523(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static504.aBoolean644) {
				return;
			}
			Static504.aBoolean644 = true;
		}
		if (Static375.aClass71_3.anApplet1 != null) {
			Static375.aClass71_3.anApplet1.destroy();
		}
		try {
			this.method1520();
		} catch (@Pc(37) Exception local37) {
		}
		if (this.aBoolean119) {
			try {
				jagmisc.quit();
			} catch (@Pc(43) Throwable local43) {
			}
			this.aBoolean119 = false;
		}
		Static229.method4111();
		Static249.method4283();
		if (Static301.aCanvas11 != null) {
			try {
				Static301.aCanvas11.removeFocusListener(this);
				Static301.aCanvas11.getParent().remove(Static301.aCanvas11);
			} catch (@Pc(63) Exception local63) {
			}
		}
		if (Static375.aClass71_3 != null) {
			try {
				Static375.aClass71_3.method1984();
			} catch (@Pc(71) Exception local71) {
			}
		}
		this.method1516();
		if (Static308.aFrame17 != null) {
			try {
				System.exit(0);
			} catch (@Pc(81) Throwable local81) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!ko", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static308.aFrame17 == null) {
			return Static375.aClass71_3 == null || Static375.aClass71_3.anApplet1 == this ? super.getCodeBase() : Static375.aClass71_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static218.anApplet_Sub1_1 == this && !Static504.aBoolean644) {
			Static17.aLong6 = 0L;
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
	protected abstract void method1525();

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)V")
	protected final void method1526(@OriginalArg(1) String arg0) {
		if (this.aBoolean118) {
			return;
		}
		this.aBoolean118 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static549.method683(Static375.aClass71_3.anApplet1, "loggedout");
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
	private void method1527() {
		@Pc(8) long local8 = Static76.method1679();
		@Pc(12) long local12 = Static488.aLongArray20[Static506.anInt9106];
		Static488.aLongArray20[Static506.anInt9106] = local8;
		Static506.anInt9106 = Static506.anInt9106 + 1 & 0x1F;
		if (local12 != 0L && local12 < local8) {
			@Pc(38) int local38 = (int) (local8 - local12);
			Static159.anInt3566 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static432.anInt7992++ > 50) {
			Static432.anInt7992 -= 50;
			Static117.aBoolean219 = true;
			Static301.aCanvas11.setSize(Static169.anInt3893, Static127.anInt2936);
			Static301.aCanvas11.setVisible(true);
			if (Static308.aFrame17 != null && Static241.aFrame25 == null) {
				@Pc(73) Insets local73 = Static308.aFrame17.getInsets();
				Static301.aCanvas11.setLocation(local73.left + Static37.anInt7517, Static193.anInt4312 + local73.top);
			} else {
				Static301.aCanvas11.setLocation(Static37.anInt7517, Static193.anInt4312);
			}
		}
		this.method1528();
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V")
	protected abstract void method1528();

	@OriginalMember(owner = "client!ko", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static319.aBoolean460 = true;
		Static117.aBoolean219 = true;
	}
}
