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

@OriginalClass("client!p")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!p", name = "H", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!p", name = "provideLoaderApplet", descriptor = "(Ljava/applet/Applet;)V")
	private static void provideLoaderApplet(@OriginalArg(0) Applet arg0) {
		Static249.anApplet1 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static547.aFrame2 == null) {
			return Static249.anApplet1 == null || Static249.anApplet1 == this ? super.getParameter(arg0) : Static249.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static340.anApplet_Sub1_1 != this || Static265.aBoolean364) {
			return;
		}
		Static136.aBoolean218 = true;
		if (Static101.aBoolean327 && Static8.method201() - Static289.aLong149 > 1000L) {
			@Pc(25) Rectangle local25 = arg0.getClipBounds();
			if (local25 == null || Static1.anInt9404 <= local25.width && Static120.anInt2852 <= local25.height) {
				Static355.aBoolean508 = true;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static547.aFrame2 == null) {
			return Static249.anApplet1 == null || Static249.anApplet1 == this ? super.getDocumentBase() : Static249.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static340.anApplet_Sub1_1 == this && !Static265.aBoolean364) {
			Static86.aLong51 = Static8.method201() + 4000L;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLjava/lang/String;)V")
	protected final void method1334(@OriginalArg(1) String arg0) {
		if (this.aBoolean88) {
			return;
		}
		this.aBoolean88 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static608.method4639(Static249.anApplet1, "loggedout");
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BIIIIILjava/lang/String;)V")
	protected final void method1335(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) String arg3) {
		try {
			if (Static340.anApplet_Sub1_1 == null) {
				Static309.anInt5674 = 0;
				Static240.anInt4852 = arg0;
				Static1.anInt9404 = arg0;
				Static196.anInt4059 = arg2;
				Static120.anInt2852 = arg2;
				Static340.anApplet_Sub1_1 = this;
				Static13.anInt7635 = 616;
				Static543.anInt8951 = 0;
				Static497.anApplet2 = Static249.anApplet1;
				Static115.aClass272_1 = Static352.aClass272_2 = new Class272(arg1, arg3, 35, Static249.anApplet1 != null);
				@Pc(64) Class331 local64 = Static352.aClass272_2.method6121(1, this);
				while (local64.anInt8818 == 0) {
					Static318.method4952(10L);
				}
			} else {
				Static428.anInt7468++;
				if (Static428.anInt7468 >= 3) {
					this.method1334("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(82) Throwable local82) {
			Static256.method4328(null, local82);
			this.method1334("crash");
		}
	}

	@OriginalMember(owner = "client!p", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Z")
	protected final boolean method1336() {
		@Pc(16) String local16 = this.getDocumentBase().getHost().toLowerCase();
		if (local16.equals("jagex.com") || local16.endsWith(".jagex.com")) {
			return true;
		} else if (local16.equals("runescape.com") || local16.endsWith(".runescape.com")) {
			return true;
		} else if (local16.equals("stellardawn.com") || local16.endsWith(".stellardawn.com")) {
			return true;
		} else if (local16.endsWith("127.0.0.1")) {
			return true;
		} else {
			while (local16.length() > 0 && local16.charAt(local16.length() - 1) >= '0' && local16.charAt(local16.length() - 1) <= '9') {
				local16 = local16.substring(0, local16.length() - 1);
			}
			if (local16.endsWith("192.168.1.")) {
				return true;
			} else {
				this.method1334("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	protected abstract void method1337();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	private void method1338() {
		@Pc(6) long local6 = Static8.method201();
		@Pc(10) long local10 = Static78.aLongArray4[Static400.anInt7010];
		Static78.aLongArray4[Static400.anInt7010] = local6;
		Static400.anInt7010 = Static400.anInt7010 + 1 & 0x1F;
		@Pc(29) boolean local29;
		if (local10 == 0L || local10 >= local6) {
			local29 = false;
		} else {
			local29 = true;
		}
		synchronized (this) {
			Static470.aBoolean53 = Static253.aBoolean349;
		}
		this.method1337();
	}

	@OriginalMember(owner = "client!p", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	protected abstract void method1339();

	@OriginalMember(owner = "client!p", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static340.anApplet_Sub1_1 == this && !Static265.aBoolean364) {
			Static86.aLong51 = Static8.method201();
			Static318.method4952(5000L);
			Static115.aClass272_1 = null;
			this.method1350(false);
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
	protected abstract void method1340();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Z")
	public final boolean method1341() {
		return Static511.method7084("jagmisc");
	}

	@OriginalMember(owner = "client!p", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static547.aFrame2 == null) {
			return Static249.anApplet1 == null || Static249.anApplet1 == this ? super.getCodeBase() : Static249.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)Z")
	public final boolean method1342() {
		return Static511.method7084("jaclib");
	}

	@OriginalMember(owner = "client!p", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static253.aBoolean349 = false;
	}

	@OriginalMember(owner = "client!p", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	protected abstract void method1343();

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	private void method1344() {
		@Pc(6) long local6 = Static8.method201();
		@Pc(10) long local10 = Static390.aLongArray12[Static79.anInt1672];
		Static390.aLongArray12[Static79.anInt1672] = local6;
		if (local10 != 0L && local10 < local6) {
			@Pc(30) int local30 = (int) (local6 - local10);
			Static367.anInt6478 = ((local30 >> 1) + 32000) / local30;
		}
		Static79.anInt1672 = Static79.anInt1672 + 1 & 0x1F;
		if (Static150.anInt3260++ > 50) {
			Static150.anInt3260 -= 50;
			Static136.aBoolean218 = true;
			Static32.aCanvas3.setSize(Static240.anInt4852, Static196.anInt4059);
			Static32.aCanvas3.setVisible(true);
			if (Static547.aFrame2 != null && Static15.aFrame1 == null) {
				@Pc(71) Insets local71 = Static547.aFrame2.getInsets();
				Static32.aCanvas3.setLocation(Static543.anInt8951 + local71.left, Static309.anInt5674 + local71.top);
			} else {
				Static32.aCanvas3.setLocation(Static543.anInt8951, Static309.anInt5674);
			}
		}
		this.method1346();
	}

	@OriginalMember(owner = "client!p", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static340.anApplet_Sub1_1 == this && !Static265.aBoolean364) {
			Static86.aLong51 = 0L;
		}
	}

	@OriginalMember(owner = "client!p", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static426.aString70 != null) {
				@Pc(10) String local10 = Static426.aString70.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static426.aString68;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method1334("wrongjava");
						return;
					}
				} else if (local10.indexOf("ibm") != -1 && (Static426.aString68 == null || Static426.aString68.equals("1.4.2"))) {
					this.method1334("wrongjava");
					return;
				}
			}
			if (Static426.aString68 != null && Static426.aString68.startsWith("1.")) {
				@Pc(71) int local71 = 2;
				@Pc(73) int local73 = 0;
				while (local71 < Static426.aString68.length()) {
					@Pc(79) char local79 = Static426.aString68.charAt(local71);
					if (local79 < '0' || local79 > '9') {
						break;
					}
					local71++;
					local73 = local73 * 10 + local79 - 48;
				}
				if (local73 >= 5) {
					Static101.aBoolean327 = true;
				}
			}
			@Pc(109) Applet local109 = Static340.anApplet_Sub1_1;
			if (Static249.anApplet1 != null) {
				local109 = Static249.anApplet1;
			}
			@Pc(115) Method local115 = Static426.aMethod2;
			if (local115 != null) {
				try {
					local115.invoke(local109, Boolean.TRUE);
				} catch (@Pc(129) Throwable local129) {
				}
			}
			Static550.method7451();
			Static288.method4678();
			this.method1345();
			this.method1339();
			Static25.aClass43_1 = Static59.method1230();
			while (Static86.aLong51 == 0L || Static8.method201() < Static86.aLong51) {
				Static352.anInt6257 = Static25.aClass43_1.method3562(Static164.aLong87);
				for (@Pc(152) int local152 = 0; local152 < Static352.anInt6257; local152++) {
					this.method1338();
				}
				this.method1344();
				Static416.method5972(Static32.aCanvas3, Static352.aClass272_2);
			}
		} catch (@Pc(185) ThreadDeath local185) {
			throw local185;
		} catch (@Pc(188) Throwable local188) {
			Static256.method4328(this.method1347(), local188);
			this.method1334("crash");
		} finally {
			@Pc(204) Object local204 = null;
			this.method1350(true);
		}
	}

	@OriginalMember(owner = "client!p", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public synchronized void method1345() {
		if (Static32.aCanvas3 != null) {
			Static32.aCanvas3.removeFocusListener(this);
			Static32.aCanvas3.getParent().setBackground(Color.black);
			Static32.aCanvas3.getParent().remove(Static32.aCanvas3);
		}
		@Pc(24) Container local24;
		if (Static15.aFrame1 != null) {
			local24 = Static15.aFrame1;
		} else if (Static547.aFrame2 != null) {
			local24 = Static547.aFrame2;
		} else if (Static249.anApplet1 == null) {
			local24 = Static340.anApplet_Sub1_1;
		} else {
			local24 = Static249.anApplet1;
		}
		local24.setLayout(null);
		Static32.aCanvas3 = new Canvas_Sub1(this);
		local24.add(Static32.aCanvas3);
		Static32.aCanvas3.setSize(Static240.anInt4852, Static196.anInt4059);
		Static32.aCanvas3.setVisible(true);
		if (local24 == Static547.aFrame2) {
			@Pc(75) Insets local75 = Static547.aFrame2.getInsets();
			Static32.aCanvas3.setLocation(Static543.anInt8951 + local75.left, Static309.anInt5674 + local75.top);
		} else {
			Static32.aCanvas3.setLocation(Static543.anInt8951, Static309.anInt5674);
		}
		Static32.aCanvas3.addFocusListener(this);
		Static32.aCanvas3.requestFocus();
		Static470.aBoolean53 = true;
		Static253.aBoolean349 = true;
		Static136.aBoolean218 = true;
		Static355.aBoolean508 = false;
		Static289.aLong149 = Static8.method201();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
	protected abstract void method1346();

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method1347() {
		return null;
	}

	@OriginalMember(owner = "client!p", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!p", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static547.aFrame2 == null) {
			return Static249.anApplet1 == null || Static249.anApplet1 == this ? super.getAppletContext() : Static249.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!p", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;IBIZIII)V")
	protected final void method1348(@OriginalArg(0) String arg0, @OriginalArg(7) int arg1) {
		try {
			Static196.anInt4059 = 768;
			Static120.anInt2852 = 768;
			Static543.anInt8951 = 0;
			Static309.anInt5674 = 0;
			Static13.anInt7635 = 616;
			Static340.anApplet_Sub1_1 = this;
			Static497.anApplet2 = null;
			Static240.anInt4852 = 1024;
			Static1.anInt9404 = 1024;
			Static547.aFrame2 = new Frame();
			Static547.aFrame2.setTitle("Jagex");
			Static547.aFrame2.setResizable(true);
			Static547.aFrame2.addWindowListener(this);
			Static547.aFrame2.setVisible(true);
			Static547.aFrame2.toFront();
			@Pc(44) Insets local44 = Static547.aFrame2.getInsets();
			Static547.aFrame2.setSize(local44.right + Static1.anInt9404 + local44.left, Static120.anInt2852 + local44.top - -local44.bottom);
			Static115.aClass272_1 = Static352.aClass272_2 = new Class272(arg1, arg0, 35, true);
			@Pc(78) Class331 local78 = Static352.aClass272_2.method6121(1, this);
			while (local78.anInt8818 == 0) {
				Static318.method4952(10L);
			}
		} catch (@Pc(88) Exception local88) {
			Static256.method4328(null, local88);
		}
	}

	@OriginalMember(owner = "client!p", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static253.aBoolean349 = true;
		Static136.aBoolean218 = true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V")
	private void method1350(@OriginalArg(0) boolean arg0) {
		synchronized (this) {
			if (Static265.aBoolean364) {
				return;
			}
			Static265.aBoolean364 = true;
		}
		System.out.println("Shutdown start - clean:" + arg0);
		if (Static249.anApplet1 != null) {
			Static249.anApplet1.destroy();
		}
		try {
			this.method1343();
		} catch (@Pc(38) Exception local38) {
		}
		if (this.aBoolean89) {
			try {
				jagmisc.quit();
			} catch (@Pc(44) Throwable local44) {
			}
			this.aBoolean89 = false;
		}
		Static184.method3376();
		Static457.method6449();
		if (Static32.aCanvas3 != null) {
			try {
				Static32.aCanvas3.removeFocusListener(this);
				Static32.aCanvas3.getParent().remove(Static32.aCanvas3);
			} catch (@Pc(64) Exception local64) {
			}
		}
		if (Static352.aClass272_2 != null) {
			try {
				Static352.aClass272_2.method6117();
			} catch (@Pc(72) Exception local72) {
			}
		}
		this.method1340();
		if (Static547.aFrame2 != null) {
			Static547.aFrame2.setVisible(false);
			Static547.aFrame2.dispose();
			Static547.aFrame2 = null;
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!p", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}
}
