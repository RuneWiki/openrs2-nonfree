import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!he;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "[I")
	public static int[] anIntArray46;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!v;")
	public static Class62 aClass62_219 = Static45.method753(" Sekunde(Xn(Y \u001c1bertragen)3");

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt566 = 0;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!v;")
	private static Class62 aClass62_230 = Static45.method753("M");

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_220 = aClass62_230;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!v;")
	private static Class62 aClass62_221 = Static45.method753("Checking for updates )2 ");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_222 = Static45.method753("::noclip");

	@OriginalMember(owner = "client!d", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_223 = Static45.method753("Ihre Ignorieren)2Liste ist voll)1 Sie k\u001c1nnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!d", name = "T", descriptor = "Lclient!v;")
	private static Class62 aClass62_231 = Static45.method753("Too many connections from your address)3");

	@OriginalMember(owner = "client!d", name = "s", descriptor = "Lclient!v;")
	public static Class62 aClass62_224 = aClass62_231;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "I")
	public static int anInt569 = 0;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "I")
	public static int anInt574 = 0;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "J")
	public static long aLong19 = 0L;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Lclient!v;")
	public static Class62 aClass62_225 = Static45.method753("Handel akzeptieren");

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public static int anInt575 = -1;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "Lclient!v;")
	public static Class62 aClass62_226 = aClass62_221;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	public static int anInt580 = 0;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "Lclient!v;")
	private static Class62 aClass62_227 = Static45.method753("Remove");

	@OriginalMember(owner = "client!d", name = "P", descriptor = "Lclient!v;")
	public static Class62 aClass62_228 = Static45.method753("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_229 = Static45.method753("Unerwartete Antwort vom Anmelde)2Server: ");

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	public static final int anInt581 = 0;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "Lclient!v;")
	public static Class62 aClass62_232 = aClass62_227;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method372() {
		Static44.aClass34_15.method762();
		Static9.aClass34_24.method762();
		Static13.aClass34_5.method762();
		Static37.aClass34_13.method762();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method376(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static104.aClass18_1);
		arg0.addMouseMotionListener(Static104.aClass18_1);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;Lclient!jc;)V")
	public static void method378(@OriginalArg(1) Component arg0, @OriginalArg(2) Class35 arg1) {
		try {
			@Pc(8) Class14_Sub1 local8 = (Class14_Sub1) Class.forName("Class14_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local8.method1365(arg1, 2048);
			Static86.aClass14_1 = local8;
		} catch (@Pc(20) Throwable local20) {
			try {
				Static86.aClass14_1 = new Class14_Sub1_Sub1(arg1, arg0);
			} catch (@Pc(28) Throwable local28) {
				if (Static47.aString8.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static86.aClass14_1 = new Class14_Sub2();
						return;
					} catch (@Pc(39) Throwable local39) {
					}
				}
				Static86.aClass14_1 = new Class14(8000);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public static void method380() {
		anIntArray46 = null;
		aClass62_221 = null;
		aClass62_224 = null;
		aClass30_1 = null;
		aClass62_228 = null;
		aClass62_222 = null;
		aClass62_232 = null;
		aClass62_219 = null;
		aClass62_230 = null;
		aClass62_220 = null;
		aClass62_225 = null;
		aClass62_226 = null;
		aClass62_229 = null;
		aClass62_231 = null;
		aClass62_227 = null;
		aClass62_223 = null;
	}
}
