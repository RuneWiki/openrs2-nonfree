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

@OriginalClass("client!qq")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!qq", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static115.aFrame3 == null) {
			return Static154.aClass123_2 == null || Static154.aClass123_2.anApplet1 == this ? super.getCodeBase() : Static154.aClass123_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qq", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
	private void method757() {
		@Pc(10) long local10 = Static101.method1805();
		@Pc(14) long local14 = Static134.aLongArray2[Static12.anInt219];
		Static134.aLongArray2[Static12.anInt219] = local10;
		@Pc(27) boolean local27;
		if (local14 == 0L || local10 <= local14) {
			local27 = false;
		} else {
			local27 = true;
		}
		Static12.anInt219 = Static12.anInt219 + 1 & 0x1F;
		synchronized (this) {
			Static174.aBoolean267 = Static131.aBoolean199;
		}
		this.method770();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	protected abstract void method758();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	public final void method759() {
		if (this.aBoolean82) {
			return;
		}
		try {
			@Pc(20) Class86 local20 = Static154.aClass123_2.method3268(Static16.anApplet_Sub1_1.getClass());
			while (local20.anInt2590 == 0) {
				Static215.method3855(100L);
			}
			if (local20.anObject2 != null) {
				throw (Throwable) local20.anObject2;
			}
			jagmisc.init();
			this.aBoolean82 = true;
			Static263.aClass139_1 = Static124.method3772();
		} catch (@Pc(45) Throwable local45) {
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZZ)V")
	private void method760(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static238.aBoolean350) {
				return;
			}
			Static238.aBoolean350 = true;
		}
		if (Static154.aClass123_2.anApplet1 != null) {
			Static154.aClass123_2.anApplet1.destroy();
		}
		try {
			this.method768();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean82) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean82 = false;
		}
		@Pc(48) Class86 local48 = Static154.aClass123_2.method3250(Static16.anApplet_Sub1_1.getClass());
		while (local48.anInt2590 == 0) {
			Static215.method3855(100L);
		}
		if (Static343.aCanvas5 != null) {
			try {
				Static343.aCanvas5.removeFocusListener(this);
				Static343.aCanvas5.getParent().remove(Static343.aCanvas5);
			} catch (@Pc(70) Exception local70) {
			}
		}
		if (Static154.aClass123_2 != null) {
			try {
				Static154.aClass123_2.method3243();
			} catch (@Pc(78) Exception local78) {
			}
		}
		this.method772();
		if (Static115.aFrame3 != null) {
			try {
				System.exit(0);
			} catch (@Pc(88) Throwable local88) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!qq", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static16.anApplet_Sub1_1 == this && !Static238.aBoolean350) {
			Static256.aLong150 = Static101.method1805() + 4000L;
		}
	}

	@OriginalMember(owner = "client!qq", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label108: {
				if (Static175.aString29 != null) {
					@Pc(6) String local6 = Static175.aString29.toLowerCase();
					if (local6.indexOf("sun") != -1 || local6.indexOf("apple") != -1) {
						@Pc(36) String local36 = Static175.aString31;
						if (local36.equals("1.1") || local36.startsWith("1.1.") || local36.equals("1.2") || local36.startsWith("1.2.")) {
							this.method767("wrongjava");
							break label108;
						}
					} else if (local6.indexOf("ibm") != -1 && (Static175.aString31 == null || Static175.aString31.equals("1.4.2"))) {
						this.method767("wrongjava");
						break label108;
					}
				}
				@Pc(66) int local66;
				if (Static175.aString31 != null && Static175.aString31.startsWith("1.")) {
					local66 = 2;
					@Pc(68) int local68 = 0;
					while (Static175.aString31.length() > local66) {
						@Pc(74) char local74 = Static175.aString31.charAt(local66);
						if (local74 < '0' || local74 > '9') {
							break;
						}
						local66++;
						local68 = local68 * 10 + local74 - 48;
					}
					if (local68 >= 5) {
						Static162.aBoolean256 = true;
					}
				}
				if (Static154.aClass123_2.anApplet1 != null) {
					@Pc(116) Method local116 = Static175.aMethod1;
					if (local116 != null) {
						try {
							local116.invoke(Static154.aClass123_2.anApplet1, Boolean.TRUE);
						} catch (@Pc(131) Throwable local131) {
						}
					}
				}
				Static391.method6122();
				Static127.method2223();
				this.method774();
				this.method769();
				Static263.aClass139_1 = Static124.method3772();
				this.method759();
				while (Static256.aLong150 == 0L || Static256.aLong150 > Static101.method1805()) {
					Static315.anInt5769 = Static263.aClass139_1.method4296(Static108.anInt2418);
					for (local66 = 0; local66 < Static315.anInt5769; local66++) {
						this.method757();
					}
					this.method766();
					Static132.method2299(Static154.aClass123_2, Static343.aCanvas5);
				}
			}
		} catch (@Pc(194) Exception local194) {
			Static346.method5531(local194, null);
			this.method767("crash");
		}
		this.method760(true);
	}

	@OriginalMember(owner = "client!qq", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static16.anApplet_Sub1_1 != this || Static238.aBoolean350) {
			return;
		}
		Static347.aBoolean459 = true;
		if (Static162.aBoolean256 && Static101.method1805() - Static272.aLong157 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || Static316.anInt5775 <= local26.width && local26.height >= Static72.anInt1616) {
				Static192.aBoolean287 = true;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static16.anApplet_Sub1_1 == this && !Static238.aBoolean350) {
			Static256.aLong150 = Static101.method1805();
			Static215.method3855(5000L);
			Static181.aClass123_3 = null;
			this.method760(false);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILjava/lang/String;ZZIIII)V")
	protected final void method762(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			Static274.anInt5134 = 574;
			Static16.anApplet_Sub1_1 = this;
			Static275.anInt6176 = 0;
			Static336.anInt6217 = 768;
			Static72.anInt1616 = 768;
			Static324.anInt5937 = 0;
			Static7.anInt157 = 1024;
			Static316.anInt5775 = 1024;
			Static115.aFrame3 = new Frame();
			Static115.aFrame3.setTitle("Jagex");
			Static115.aFrame3.setResizable(true);
			Static115.aFrame3.addWindowListener(this);
			Static115.aFrame3.setVisible(true);
			Static115.aFrame3.toFront();
			@Pc(38) Insets local38 = Static115.aFrame3.getInsets();
			Static115.aFrame3.setSize(Static316.anInt5775 + local38.left + local38.right, local38.top + Static72.anInt1616 + local38.bottom);
			Static181.aClass123_3 = Static154.aClass123_2 = new Class123(null, arg0, arg1, 29);
			@Pc(70) Class86 local70 = Static154.aClass123_2.method3251(1, this);
			while (local70.anInt2590 == 0) {
				Static215.method3855(10L);
			}
		} catch (@Pc(80) Exception local80) {
			Static346.method5531(local80, null);
		}
	}

	@OriginalMember(owner = "client!qq", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static131.aBoolean199 = true;
		Static347.aBoolean459 = true;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z")
	protected final boolean method764() {
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
				this.method767("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	protected final void method765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (Static16.anApplet_Sub1_1 == null) {
				Static274.anInt5134 = 574;
				Static275.anInt6176 = 0;
				Static336.anInt6217 = arg2;
				Static72.anInt1616 = arg2;
				Static324.anInt5937 = 0;
				Static7.anInt157 = arg1;
				Static316.anInt5775 = arg1;
				Static16.anApplet_Sub1_1 = this;
				if (Static154.aClass123_2 == null) {
					Static181.aClass123_3 = Static154.aClass123_2 = new Class123(this, arg0, null, 0);
				}
				@Pc(64) Class86 local64 = Static154.aClass123_2.method3251(1, this);
				while (local64.anInt2590 == 0) {
					Static215.method3855(10L);
				}
			} else {
				Static365.anInt6712++;
				if (Static365.anInt6712 >= 3) {
					this.method767("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(74) Exception local74) {
			Static346.method5531(local74, null);
			this.method767("crash");
		}
	}

	@OriginalMember(owner = "client!qq", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
	private void method766() {
		@Pc(6) long local6 = Static101.method1805();
		@Pc(10) long local10 = Static317.aLongArray8[Static222.anInt4436];
		Static317.aLongArray8[Static222.anInt4436] = local6;
		Static222.anInt4436 = Static222.anInt4436 + 1 & 0x1F;
		if (local10 != 0L && local10 < local6) {
			@Pc(38) int local38 = (int) (local6 - local10);
			Static147.anInt3136 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static340.anInt6290++ > 50) {
			Static340.anInt6290 -= 50;
			Static347.aBoolean459 = true;
			Static343.aCanvas5.setSize(Static7.anInt157, Static336.anInt6217);
			Static343.aCanvas5.setVisible(true);
			if (Static115.aFrame3 != null && Static33.aFrame2 == null) {
				@Pc(73) Insets local73 = Static115.aFrame3.getInsets();
				Static343.aCanvas5.setLocation(local73.left + Static324.anInt5937, local73.top - -Static275.anInt6176);
			} else {
				Static343.aCanvas5.setLocation(Static324.anInt5937, Static275.anInt6176);
			}
		}
		this.method758();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;B)V")
	protected final void method767(@OriginalArg(0) String arg0) {
		if (this.aBoolean83) {
			return;
		}
		this.aBoolean83 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static406.method5995(Static154.aClass123_2.anApplet1, "loggedout");
		} catch (@Pc(27) Throwable local27) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!qq", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
	protected abstract void method768();

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)V")
	protected abstract void method769();

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	protected abstract void method770();

	@OriginalMember(owner = "client!qq", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static16.anApplet_Sub1_1 == this && !Static238.aBoolean350) {
			Static256.aLong150 = 0L;
		}
	}

	@OriginalMember(owner = "client!qq", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!qq", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static131.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!qq", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!qq", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static115.aFrame3 == null) {
			return Static154.aClass123_2 == null || Static154.aClass123_2.anApplet1 == this ? super.getAppletContext() : Static154.aClass123_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(B)V")
	protected abstract void method772();

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(B)V")
	public final synchronized void method774() {
		if (Static343.aCanvas5 != null) {
			Static343.aCanvas5.removeFocusListener(this);
			Static343.aCanvas5.getParent().remove(Static343.aCanvas5);
		}
		@Pc(18) Container local18;
		if (Static33.aFrame2 != null) {
			local18 = Static33.aFrame2;
		} else if (Static115.aFrame3 == null) {
			local18 = Static154.aClass123_2.anApplet1;
		} else {
			local18 = Static115.aFrame3;
		}
		local18.setLayout(null);
		Static343.aCanvas5 = new Canvas_Sub1(this);
		local18.add(Static343.aCanvas5);
		Static343.aCanvas5.setSize(Static7.anInt157, Static336.anInt6217);
		Static343.aCanvas5.setVisible(true);
		if (local18 == Static115.aFrame3) {
			@Pc(60) Insets local60 = Static115.aFrame3.getInsets();
			Static343.aCanvas5.setLocation(local60.left + Static324.anInt5937, Static275.anInt6176 + local60.top);
		} else {
			Static343.aCanvas5.setLocation(Static324.anInt5937, Static275.anInt6176);
		}
		Static343.aCanvas5.addFocusListener(this);
		Static343.aCanvas5.requestFocus();
		Static131.aBoolean199 = true;
		Static174.aBoolean267 = true;
		Static347.aBoolean459 = true;
		Static192.aBoolean287 = false;
		Static272.aLong157 = Static101.method1805();
	}

	@OriginalMember(owner = "client!qq", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static115.aFrame3 == null) {
			return Static154.aClass123_2 == null || Static154.aClass123_2.anApplet1 == this ? super.getDocumentBase() : Static154.aClass123_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qq", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static115.aFrame3 == null) {
			return Static154.aClass123_2 == null || Static154.aClass123_2.anApplet1 == this ? super.getParameter(arg0) : Static154.aClass123_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qq", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}
}
