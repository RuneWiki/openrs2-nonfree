import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	protected abstract void method401();

	@OriginalMember(owner = "client!me", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
	@Override
	public final AppletContext getAppletContext() {
		if (Static38.aCanvas_Sub1_1 == null) {
			return Static51.aClass51_2 == null || Static51.aClass51_2.anApplet2 == this ? super.getAppletContext() : Static51.aClass51_2.anApplet2.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	private void method402() {
		@Pc(1) long local1 = System.currentTimeMillis();
		@Pc(9) long local9 = Static90.aLongArray6[Static11.anInt509];
		Static90.aLongArray6[Static11.anInt509] = local1;
		@Pc(24) boolean local24;
		if (local9 == 0L || local1 <= local9) {
			local24 = false;
		} else {
			local24 = true;
		}
		Static11.anInt509 = Static11.anInt509 + 1 & 0x1F;
		synchronized (this) {
			Static34.aBoolean72 = Static99.aBoolean142;
		}
		this.method416();
	}

	@OriginalMember(owner = "client!me", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		if (Static69.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			this.paint(arg0);
		}
	}

	@OriginalMember(owner = "client!me", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static38.aCanvas_Sub1_1 == null) {
			return Static51.aClass51_2 == null || Static51.aClass51_2.anApplet2 == this ? super.getParameter(arg0) : Static51.aClass51_2.anApplet2.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		try {
			if (Static84.aString3 != null) {
				@Pc(10) String local10 = Static84.aString3.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(24) String local24 = Static84.aString1;
					if (local24.equals("1.1") || local24.startsWith("1.1.") || local24.equals("1.2") || local24.startsWith("1.2.")) {
						this.method410("wrongjava");
						return;
					}
					Static59.anInt2041 = 5;
				}
			}
			Static11.aClass9_6 = Static44.method1061(Static70.method1381(), Static95.anInt2571, Static76.anInt2255);
			Static70.method1381().addFocusListener(this);
			Static70.method1381().requestFocus();
			this.method418();
			Static21.aClass7_1 = Static12.method368();
			while (Static2.aLong4 == 0L || System.currentTimeMillis() < Static2.aLong4) {
				@Pc(75) int local75 = Static21.aClass7_1.method473(Static50.anInt473, Static59.anInt2041);
				for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
					this.method402();
				}
				this.method409();
			}
		} catch (@Pc(105) Exception local105) {
			Static57.method1692(null, local105);
			this.method410("crash");
		}
		this.method407();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	protected abstract void method403();

	@OriginalMember(owner = "client!me", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Static99.aBoolean142 = true;
		Static49.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjava/lang/String;BLjava/net/InetAddress;II)V")
	protected final void method404(@OriginalArg(3) String arg0, @OriginalArg(5) InetAddress arg1, @OriginalArg(6) int arg2) {
		try {
			Static69.anApplet_Sub1_1 = this;
			Static74.anInt2236 = 403;
			Static76.anInt2255 = 765;
			Static95.anInt2571 = 503;
			Static38.aCanvas_Sub1_1 = new Canvas_Sub1(this, Static76.anInt2255, Static95.anInt2571);
			Static28.aFont1 = new Font("Helvetica", 1, 13);
			Static80.aFontMetrics2 = Static38.aCanvas_Sub1_1.getFontMetrics(Static28.aFont1);
			Static106.aClass51_4 = Static51.aClass51_2 = new Class51(true, null, arg1, arg2, arg0, 12);
			Static18.aGraphics1 = Static70.method1381().getGraphics();
			Static51.aClass51_2.method1467(1, this);
		} catch (@Pc(58) Exception local58) {
			Static57.method1692(null, local58);
		}
	}

	@OriginalMember(owner = "client!me", name = "start", descriptor = "()V")
	@Override
	public final void start() {
		if (Static69.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static2.aLong4 = 0L;
		}
	}

	@OriginalMember(owner = "client!me", name = "getDocumentBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getDocumentBase() {
		if (Static38.aCanvas_Sub1_1 == null) {
			return Static51.aClass51_2 == null || Static51.aClass51_2.anApplet2 == this ? super.getDocumentBase() : Static51.aClass51_2.anApplet2.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZIII)V")
	protected final void method406(@OriginalArg(3) int arg0) {
		try {
			if (Static69.anApplet_Sub1_1 == null) {
				Static69.anApplet_Sub1_1 = this;
				Static76.anInt2255 = 765;
				Static95.anInt2571 = 503;
				Static74.anInt2236 = 403;
				if (Static51.aClass51_2 == null) {
					Static106.aClass51_4 = Static51.aClass51_2 = new Class51(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static28.aFont1 = new Font("Helvetica", 1, 13);
				Static80.aFontMetrics2 = Static70.method1381().getFontMetrics(Static28.aFont1);
				while (true) {
					Static18.aGraphics1 = Static70.method1381().getGraphics();
					if (Static18.aGraphics1 != null) {
						Static51.aClass51_2.method1467(1, this);
						return;
					}
					try {
						Static70.method1381().repaint();
					} catch (@Pc(71) Exception local71) {
					}
					Static91.method1548(100L);
				}
			} else {
				this.method410("alreadyloaded");
			}
		} catch (@Pc(84) Exception local84) {
			Static57.method1692(null, local84);
			this.method410("crash");
		}
	}

	@OriginalMember(owner = "client!me", name = "destroy", descriptor = "()V")
	@Override
	public final void destroy() {
		if (Static69.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static2.aLong4 = System.currentTimeMillis();
			Static91.method1548(5000L);
			Static106.aClass51_4 = null;
			this.method407();
		}
	}

	@OriginalMember(owner = "client!me", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
	@Override
	public final URL getCodeBase() {
		if (Static38.aCanvas_Sub1_1 == null) {
			return Static51.aClass51_2 == null || Static51.aClass51_2.anApplet2 == this ? super.getCodeBase() : Static51.aClass51_2.anApplet2.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	private synchronized void method407() {
		if (Static56.aBoolean98) {
			return;
		}
		Static56.aBoolean98 = true;
		try {
			Static70.method1381().removeFocusListener(this);
		} catch (@Pc(14) Exception local14) {
		}
		try {
			this.method413();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static38.aCanvas_Sub1_1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static51.aClass51_2 != null) {
			try {
				Static51.aClass51_2.method1472();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method401();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)Z")
	protected final boolean method408() {
		@Pc(8) String local8 = this.getDocumentBase().getHost().toLowerCase();
		if (local8.endsWith("jagex.com")) {
			return true;
		} else if (local8.endsWith("runescape.com")) {
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
				this.method410("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (Static69.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static49.aBoolean143 = true;
			if (Static18.aGraphics1 == null) {
				Static18.aGraphics1 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	private void method409() {
		@Pc(7) long local7 = Static17.aLongArray3[Static10.anInt369];
		@Pc(9) long local9 = System.currentTimeMillis();
		Static17.aLongArray3[Static10.anInt369] = local9;
		if (local7 != 0L && local7 < local9) {
			@Pc(29) int local29 = (int) (local9 - local7);
			Static39.anInt1459 = ((local29 >> 1) + 32000) / local29;
		}
		Static10.anInt369 = Static10.anInt369 + 1 & 0x1F;
		this.method403();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;)V")
	protected final void method410(@OriginalArg(1) String arg0) {
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!me", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	protected abstract void method413();

	@OriginalMember(owner = "client!me", name = "stop", descriptor = "()V")
	@Override
	public final void stop() {
		if (Static69.anApplet_Sub1_1 == this && !Static56.aBoolean98) {
			Static2.aLong4 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!me", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Static99.aBoolean142 = false;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	protected abstract void method416();

	@OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
	protected abstract void method418();
}
