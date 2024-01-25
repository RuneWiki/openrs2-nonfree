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

@OriginalClass("client!we")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	protected abstract void method941();

	@OriginalMember(owner = "client!we", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosing(@OriginalArg(0) WindowEvent arg0) {
		this.destroy();
	}

	@OriginalMember(owner = "client!we", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!we", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static168.aFrame2 == null) {
			return Static202.aClass10_3 == null || Static202.aClass10_3.anApplet1 == this ? super.getAppletContext() : Static202.aClass10_3.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static137.aBoolean152 = false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public final void method942() {
		if (this.aBoolean76) {
			return;
		}
		try {
			@Pc(22) Class60 local22 = Static202.aClass10_3.method317(Static80.anApplet_Sub1_2.getClass());
			while (local22.anInt1838 == 0) {
				Static105.method2138(100L);
			}
			if (local22.anObject2 != null) {
				throw (Throwable) local22.anObject2;
			}
			jagmisc.init();
			this.aBoolean76 = true;
			Static263.aClass126_1 = Static278.method4732();
		} catch (@Pc(50) Throwable local50) {
		}
	}

	@OriginalMember(owner = "client!we", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowClosed(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public final synchronized void method943() {
		if (Static243.aCanvas3 != null) {
			Static243.aCanvas3.removeFocusListener(this);
			Static243.aCanvas3.getParent().remove(Static243.aCanvas3);
		}
		@Pc(20) Container local20;
		if (Static30.aFrame1 != null) {
			local20 = Static30.aFrame1;
		} else if (Static168.aFrame2 == null) {
			local20 = Static202.aClass10_3.anApplet1;
		} else {
			local20 = Static168.aFrame2;
		}
		local20.setLayout(null);
		Static243.aCanvas3 = new Canvas_Sub1(this);
		local20.add(Static243.aCanvas3);
		Static243.aCanvas3.setSize(Static17.anInt5991, Static246.anInt4801);
		Static243.aCanvas3.setVisible(true);
		if (local20 == Static168.aFrame2) {
			@Pc(54) Insets local54 = Static168.aFrame2.getInsets();
			Static243.aCanvas3.setLocation(local54.left + Static269.anInt5158, local54.top - -Static312.anInt5960);
		} else {
			Static243.aCanvas3.setLocation(Static269.anInt5158, Static312.anInt5960);
		}
		Static243.aCanvas3.addFocusListener(this);
		Static243.aCanvas3.requestFocus();
		Static252.aBoolean378 = true;
		Static137.aBoolean152 = true;
		Static303.aBoolean433 = true;
		Static283.aBoolean413 = false;
		Static34.aLong28 = Static284.method4783();
	}

	@OriginalMember(owner = "client!we", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static80.anApplet_Sub1_2 == this && !Static199.aBoolean272) {
			Static153.aLong116 = Static284.method4783();
			Static105.method2138(5000L);
			Static213.aClass10_4 = null;
			this.method951(false);
		}
	}

	@OriginalMember(owner = "client!we", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static80.anApplet_Sub1_2 == this && !Static199.aBoolean272) {
			Static153.aLong116 = Static284.method4783() + 4000L;
		}
	}

	@OriginalMember(owner = "client!we", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static168.aFrame2 == null) {
			return Static202.aClass10_3 == null || Static202.aClass10_3.anApplet1 == this ? super.getCodeBase() : Static202.aClass10_3.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIII)V")
	protected final void method945(@OriginalArg(1) int arg0) {
		try {
			if (Static80.anApplet_Sub1_2 == null) {
				Static80.anApplet_Sub1_2 = this;
				Static30.anInt822 = 560;
				Static312.anInt5960 = 0;
				Static17.anInt5991 = 765;
				Static9.anInt307 = 765;
				Static246.anInt4801 = 503;
				Static275.anInt5385 = 503;
				Static269.anInt5158 = 0;
				if (Static202.aClass10_3 == null) {
					Static213.aClass10_4 = Static202.aClass10_3 = new Class10(this, arg0, null, 0);
				}
				@Pc(66) Class60 local66 = Static202.aClass10_3.method316(1, this);
				while (local66.anInt1838 == 0) {
					Static105.method2138(10L);
				}
			} else {
				Static157.anInt1352++;
				if (Static157.anInt1352 >= 3) {
					this.method959("alreadyloaded");
				} else {
					this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				}
			}
		} catch (@Pc(76) Exception local76) {
			Static113.method2252(local76, null);
			this.method959("crash");
		}
	}

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			label113: {
				if (Static11.aString20 != null) {
					@Pc(10) String local10 = Static11.aString20.toLowerCase();
					if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
						@Pc(23) String local23 = Static11.aString19;
						if (local23.equals("1.1") || local23.startsWith("1.1.") || local23.equals("1.2") || local23.startsWith("1.2.")) {
							this.method959("wrongjava");
							break label113;
						}
					} else if (local10.indexOf("ibm") != -1 && (Static11.aString19 == null || Static11.aString19.equals("1.4.2"))) {
						this.method959("wrongjava");
						break label113;
					}
				}
				@Pc(70) int local70;
				if (Static11.aString19 != null && Static11.aString19.startsWith("1.")) {
					local70 = 2;
					@Pc(72) int local72 = 0;
					while (Static11.aString19.length() > local70) {
						@Pc(78) char local78 = Static11.aString19.charAt(local70);
						if (local78 < '0' || local78 > '9') {
							break;
						}
						local70++;
						local72 = local72 * 10 + local78 - 48;
					}
					if (local72 >= 5) {
						Static9.aBoolean10 = true;
					}
				}
				if (Static202.aClass10_3.anApplet1 != null) {
					@Pc(116) Method local116 = Static11.aMethod1;
					if (local116 != null) {
						try {
							local116.invoke(Static202.aClass10_3.anApplet1, Boolean.TRUE);
						} catch (@Pc(131) Throwable local131) {
						}
					}
				}
				Static93.method1988();
				this.method943();
				this.method946();
				Static263.aClass126_1 = Static278.method4732();
				this.method942();
				while (Static153.aLong116 == 0L || Static153.aLong116 > Static284.method4783()) {
					Static45.anInt1176 = Static263.aClass126_1.method5255(Static44.anInt3898);
					for (local70 = 0; local70 < Static45.anInt1176; local70++) {
						this.method955();
					}
					this.method956();
					Static105.method2138(1L);
					Static2.method4(Static202.aClass10_3, Static243.aCanvas3);
				}
			}
		} catch (@Pc(195) Exception local195) {
			Static113.method2252(local195, null);
			this.method959("crash");
		}
		this.method951(true);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	protected abstract void method946();

	@OriginalMember(owner = "client!we", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowOpened(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeiconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	protected abstract void method947();

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Z")
	protected final boolean method948() {
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
				this.method959("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowDeactivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)V")
	private void method951(@OriginalArg(1) boolean arg0) {
		synchronized (this) {
			if (Static199.aBoolean272) {
				return;
			}
			Static199.aBoolean272 = true;
		}
		if (Static202.aClass10_3.anApplet1 != null) {
			Static202.aClass10_3.anApplet1.destroy();
		}
		try {
			this.method960();
		} catch (@Pc(33) Exception local33) {
		}
		if (this.aBoolean76) {
			try {
				jagmisc.quit();
			} catch (@Pc(39) Throwable local39) {
			}
			this.aBoolean76 = false;
		}
		@Pc(50) Class60 local50 = Static202.aClass10_3.method331(Static80.anApplet_Sub1_2.getClass());
		while (local50.anInt1838 == 0) {
			Static105.method2138(100L);
		}
		if (Static243.aCanvas3 != null) {
			try {
				Static243.aCanvas3.removeFocusListener(this);
				Static243.aCanvas3.getParent().remove(Static243.aCanvas3);
			} catch (@Pc(72) Exception local72) {
			}
		}
		if (Static202.aClass10_3 != null) {
			try {
				Static202.aClass10_3.method332();
			} catch (@Pc(80) Exception local80) {
			}
		}
		this.method947();
		if (Static168.aFrame2 != null) {
			try {
				System.exit(0);
			} catch (@Pc(94) Throwable local94) {
			}
		}
		System.out.println("Shutdown complete - clean:" + arg0);
	}

	@OriginalMember(owner = "client!we", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static168.aFrame2 == null) {
			return Static202.aClass10_3 == null || Static202.aClass10_3.anApplet1 == this ? super.getParameter(arg0) : Static202.aClass10_3.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	protected abstract void method952();

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
	private void method955() {
		@Pc(6) long local6 = Static284.method4783();
		@Pc(14) long local14 = Static253.aLongArray7[Static217.anInt4323];
		Static253.aLongArray7[Static217.anInt4323] = local6;
		Static217.anInt4323 = Static217.anInt4323 + 1 & 0x1F;
		@Pc(39) boolean local39;
		if (local14 == 0L || local14 >= local6) {
			local39 = false;
		} else {
			local39 = true;
		}
		synchronized (this) {
			Static252.aBoolean378 = Static137.aBoolean152;
		}
		this.method941();
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	private void method956() {
		@Pc(10) long local10 = Static284.method4783();
		@Pc(14) long local14 = Static264.aLongArray5[Static96.anInt4807];
		Static264.aLongArray5[Static96.anInt4807] = local10;
		Static96.anInt4807 = Static96.anInt4807 + 1 & 0x1F;
		if (local14 != 0L && local14 < local10) {
			@Pc(38) int local38 = (int) (local10 - local14);
			Static236.anInt4586 = ((local38 >> 1) + 32000) / local38;
		}
		if (Static229.anInt4495++ > 50) {
			Static303.aBoolean433 = true;
			Static229.anInt4495 -= 50;
			Static243.aCanvas3.setSize(Static17.anInt5991, Static246.anInt4801);
			Static243.aCanvas3.setVisible(true);
			if (Static168.aFrame2 != null && Static30.aFrame1 == null) {
				@Pc(75) Insets local75 = Static168.aFrame2.getInsets();
				Static243.aCanvas3.setLocation(Static269.anInt5158 + local75.left, local75.top - -Static312.anInt5960);
			} else {
				Static243.aCanvas3.setLocation(Static269.anInt5158, Static312.anInt5960);
			}
		}
		this.method952();
	}

	@OriginalMember(owner = "client!we", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static137.aBoolean152 = true;
		Static303.aBoolean433 = true;
	}

	@OriginalMember(owner = "client!we", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowIconified(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final synchronized void paint(@OriginalArg(0) Graphics arg0) {
		if (Static80.anApplet_Sub1_2 != this || Static199.aBoolean272) {
			return;
		}
		Static303.aBoolean433 = true;
		if (Static9.aBoolean10 && Static284.method4783() - Static34.aLong28 > 1000L) {
			@Pc(26) Rectangle local26 = arg0.getClipBounds();
			if (local26 == null || local26.width >= Static9.anInt307 && Static275.anInt5385 <= local26.height) {
				Static283.aBoolean413 = true;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V")
	protected final void method958(@OriginalArg(5) int arg0, @OriginalArg(7) String arg1) {
		try {
			Static80.anApplet_Sub1_2 = this;
			Static30.anInt822 = 560;
			Static312.anInt5960 = 0;
			Static17.anInt5991 = 1024;
			Static9.anInt307 = 1024;
			Static246.anInt4801 = 768;
			Static275.anInt5385 = 768;
			Static269.anInt5158 = 0;
			Static168.aFrame2 = new Frame();
			Static168.aFrame2.setTitle("Jagex");
			Static168.aFrame2.setResizable(true);
			Static168.aFrame2.addWindowListener(this);
			Static168.aFrame2.setVisible(true);
			Static168.aFrame2.toFront();
			@Pc(43) Insets local43 = Static168.aFrame2.getInsets();
			Static168.aFrame2.setSize(Static9.anInt307 + local43.left + local43.right, Static275.anInt5385 + local43.top - -local43.bottom);
			Static213.aClass10_4 = Static202.aClass10_3 = new Class10(null, arg0, arg1, 29);
			@Pc(76) Class60 local76 = Static202.aClass10_3.method316(1, this);
			while (local76.anInt1838 == 0) {
				Static105.method2138(10L);
			}
		} catch (@Pc(86) Exception local86) {
			Static113.method2252(local86, null);
		}
	}

	@OriginalMember(owner = "client!we", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V")
	@Override
	public final void windowActivated(@OriginalArg(0) WindowEvent arg0) {
	}

	@OriginalMember(owner = "client!we", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static80.anApplet_Sub1_2 == this && !Static199.aBoolean272) {
			Static153.aLong116 = 0L;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)V")
	protected final void method959(@OriginalArg(0) String arg0) {
		if (this.aBoolean75) {
			return;
		}
		this.aBoolean75 = true;
		System.out.println("error_game_" + arg0);
		try {
			Static367.method4779("loggedout", Static202.aClass10_3.anApplet1);
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"), "_top");
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(I)V")
	protected abstract void method960();

	@OriginalMember(owner = "client!we", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static168.aFrame2 == null) {
			return Static202.aClass10_3 == null || Static202.aClass10_3.anApplet1 == this ? super.getDocumentBase() : Static202.aClass10_3.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}
}
