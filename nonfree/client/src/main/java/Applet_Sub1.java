import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.InetAddress;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_102 = Static12.method257("(U3");

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_103 = Static12.method257("Existing User");

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!o;")
	public static Class40 aClass40_106 = Static12.method257("Friends");

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!o;")
	public static Class40 aClass40_104 = Static12.method257("This computers address has been blocked");

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt375 = 0;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	public static int anInt390 = 0;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!o;")
	public static Class40 aClass40_105 = Static12.method257("Imported maps");

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!o;")
	public static Class40 aClass40_107 = Static12.method257(" days ago");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_101 = Static12.method257("mapmarker");

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "Lclient!o;")
	public static Class40 aClass40_108 = Static12.method257("Message @whi@");

	@OriginalMember(owner = "client!nb", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 3)
	@Override
	public final AppletContext getAppletContext() {
		if (Static97.aCanvas_Sub1_1 == null) {
			return Static91.aClass7_2 == null || Static91.aClass7_2.anApplet1 == this ? super.getAppletContext() : Static91.aClass7_2.anApplet1.getAppletContext();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 19)
	private synchronized void method323() {
		if (Class2_Sub2_Sub12_Sub3.aBoolean116) {
			return;
		}
		Class2_Sub2_Sub12_Sub3.aBoolean116 = true;
		try {
			Static7.method185().removeFocusListener(this);
		} catch (@Pc(19) Exception local19) {
		}
		try {
			this.method334();
		} catch (@Pc(24) Exception local24) {
		}
		if (Static97.aCanvas_Sub1_1 != null) {
			try {
				System.exit(0);
			} catch (@Pc(30) Throwable local30) {
			}
		}
		if (Static91.aClass7_2 != null) {
			try {
				Static91.aClass7_2.method203();
			} catch (@Pc(38) Exception local38) {
			}
		}
		this.method332();
	}

	@OriginalMember(owner = "client!nb", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 106)
	@Override
	public final String getParameter(@OriginalArg(0) String arg0) {
		if (Static97.aCanvas_Sub1_1 == null) {
			return Static91.aClass7_2 == null || Static91.aClass7_2.anApplet1 == this ? super.getParameter(arg0) : Static91.aClass7_2.anApplet1.getParameter(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 122)
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
		Class2_Sub2.aBoolean183 = true;
		Class1.aBoolean1 = true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIII)V", line = 131)
	protected final void method326(@OriginalArg(0) int arg0) {
		try {
			if (Class60.anApplet_Sub1_1 == null) {
				Static77.anInt1991 = 765;
				Static40.anInt1849 = 410;
				Static70.anInt2154 = 503;
				Class60.anApplet_Sub1_1 = this;
				if (Static91.aClass7_2 == null) {
					Static38.aClass7_4 = Static91.aClass7_2 = new Class7(false, this, InetAddress.getByName(this.getCodeBase().getHost()), arg0, null, 0);
				}
				Static91.aClass7_2.method207(1, this);
			} else {
				this.method333("alreadyloaded");
			}
		} catch (@Pc(50) Exception local50) {
			Static36.method727(null, local50);
			this.method333("crash");
		}
	}

	@OriginalMember(owner = "client!nb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 162)
	@Override
	public final void paint(@OriginalArg(0) Graphics arg0) {
		if (Class60.anApplet_Sub1_1 == this && !Class2_Sub2_Sub12_Sub3.aBoolean116) {
			Class1.aBoolean1 = true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "run", descriptor = "()V", line = 177)
	@Override
	public final void run() {
		try {
			if (Static8.aString4 != null) {
				@Pc(10) String local10 = Static8.aString4.toLowerCase();
				if (local10.indexOf("sun") != -1 || local10.indexOf("apple") != -1) {
					@Pc(22) String local22 = Static8.aString1;
					if (local22.equals("1.1") || local22.startsWith("1.1.") || local22.equals("1.2") || local22.startsWith("1.2.")) {
						this.method333("wrongjava");
						return;
					}
					Class35.anInt1552 = 5;
				} else if (local10.indexOf("ibm") != -1 && (Static8.aString1 == null || Static8.aString1.equals("1.4.2"))) {
					this.method333("wrongjava");
					return;
				}
			}
			while (true) {
				Static23.aGraphics1 = Static7.method185().getGraphics();
				if (Static23.aGraphics1 != null) {
					Static27.aClass45_14 = Static75.method1351(Static77.anInt1991, Static7.method185(), Static70.anInt2154);
					Static7.method185().addFocusListener(this);
					Static7.method185().requestFocus();
					this.method327();
					Static79.aClass18_1 = Static51.method1539();
					Static79.aClass18_1.method1280();
					while (Class2_Sub2_Sub12_Sub6.aLong132 == 0L || System.currentTimeMillis() < Class2_Sub2_Sub12_Sub6.aLong132) {
						Static22.anInt587 = Static79.aClass18_1.method1274(Class37.anInt1660, Class35.anInt1552);
						for (@Pc(112) int local112 = 0; local112 < Static22.anInt587; local112++) {
							this.method328();
						}
						this.method336();
					}
					break;
				}
				try {
					Static7.method185().repaint();
				} catch (@Pc(74) Exception local74) {
				}
				Static86.method1494(100L);
			}
		} catch (@Pc(136) Exception local136) {
			Static36.method727(null, local136);
			this.method333("crash");
		}
		this.method323();
	}

	@OriginalMember(owner = "client!nb", name = "start", descriptor = "()V", line = 264)
	@Override
	public final void start() {
		if (Class60.anApplet_Sub1_1 == this && !Class2_Sub2_Sub12_Sub3.aBoolean116) {
			Class2_Sub2_Sub12_Sub6.aLong132 = 0L;
		}
	}

	@OriginalMember(owner = "client!nb", name = "destroy", descriptor = "()V", line = 275)
	@Override
	public final void destroy() {
		if (Class60.anApplet_Sub1_1 == this && !Class2_Sub2_Sub12_Sub3.aBoolean116) {
			Class2_Sub2_Sub12_Sub6.aLong132 = System.currentTimeMillis();
			Static86.method1494(5000L);
			Static38.aClass7_4 = null;
			this.method323();
		}
	}

	@OriginalMember(owner = "client!nb", name = "stop", descriptor = "()V", line = 295)
	@Override
	public final void stop() {
		if (Class60.anApplet_Sub1_1 == this && !Class2_Sub2_Sub12_Sub3.aBoolean116) {
			Class2_Sub2_Sub12_Sub6.aLong132 = System.currentTimeMillis() + 4000L;
		}
	}

	@OriginalMember(owner = "client!nb", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 307)
	@Override
	public final URL getCodeBase() {
		if (Static97.aCanvas_Sub1_1 == null) {
			return Static91.aClass7_2 == null || Static91.aClass7_2.anApplet1 == this ? super.getCodeBase() : Static91.aClass7_2.anApplet1.getCodeBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 337)
	@Override
	public final void update(@OriginalArg(0) Graphics arg0) {
		this.paint(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 346)
	private void method328() {
		@Pc(5) long local5 = System.currentTimeMillis();
		@Pc(9) long local9 = Class2_Sub12.aLongArray6[Static28.anInt723];
		Class2_Sub12.aLongArray6[Static28.anInt723] = local5;
		@Pc(22) boolean local22;
		if (local9 == 0L || local9 >= local5) {
			local22 = false;
		} else {
			local22 = true;
		}
		Static28.anInt723 = Static28.anInt723 + 1 & 0x1F;
		synchronized (this) {
			Static89.aBoolean174 = Class2_Sub2.aBoolean183;
		}
		this.method329();
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)Z", line = 379)
	protected final boolean method331() {
		@Pc(13) String local13 = this.getDocumentBase().getHost().toLowerCase();
		if (local13.endsWith("jagex.com")) {
			return true;
		} else if (local13.endsWith("runescape.com")) {
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
				this.method333("invalidhost");
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)V", line = 417)
	protected final void method333(@OriginalArg(1) String arg0) {
		System.out.println("error_game_" + arg0);
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg0 + ".ws"));
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!nb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 434)
	@Override
	public final void focusLost(@OriginalArg(0) FocusEvent arg0) {
		Class2_Sub2.aBoolean183 = false;
	}

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V", line = 498)
	private void method336() {
		@Pc(3) long local3 = Class54.aLongArray5[Static99.anInt2498];
		@Pc(13) long local13 = System.currentTimeMillis();
		Class54.aLongArray5[Static99.anInt2498] = local13;
		if (local3 != 0L && local13 > local3) {
			@Pc(33) int local33 = (int) (local13 - local3);
			Class2_Sub11.anInt1695 = ((local33 >> 1) + 32000) / local33;
		}
		Static99.anInt2498 = Static99.anInt2498 + 1 & 0x1F;
		this.method330();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;ILjava/net/InetAddress;BIII)V", line = 741)
	protected final void method339(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) InetAddress arg2) {
		try {
			Static70.anInt2154 = 503;
			Static40.anInt1849 = 410;
			Static77.anInt1991 = 765;
			Class60.anApplet_Sub1_1 = this;
			Static97.aCanvas_Sub1_1 = new Canvas_Sub1(this, Static77.anInt1991, Static70.anInt2154);
			Static38.aClass7_4 = Static91.aClass7_2 = new Class7(true, null, arg2, arg1, arg0, 12);
			Static91.aClass7_2.method207(1, this);
		} catch (@Pc(43) Exception local43) {
			Static36.method727(null, local43);
		}
	}

	@OriginalMember(owner = "client!nb", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 777)
	@Override
	public final URL getDocumentBase() {
		if (Static97.aCanvas_Sub1_1 == null) {
			return Static91.aClass7_2 == null || Static91.aClass7_2.anApplet1 == this ? super.getDocumentBase() : Static91.aClass7_2.anApplet1.getDocumentBase();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	protected abstract void method327();

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	protected abstract void method329();

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	protected abstract void method330();

	@OriginalMember(owner = "client!nb", name = "init", descriptor = "()V")
	public abstract void init();

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
	protected abstract void method332();

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	protected abstract void method334();
}
