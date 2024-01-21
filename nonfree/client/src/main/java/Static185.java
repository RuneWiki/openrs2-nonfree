import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1081 = Static181.method2795("glow3:");

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1078 = aClass83_1081;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1079 = Static181.method2795("cookieprefix");

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1080 = Static181.method2795("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public static int anInt3724 = 1;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1082 = aClass83_1081;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1083 = Static181.method2795("p12_full");

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1084 = Static181.method2795("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "J")
	public static long aLong128 = 0L;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	public static int anInt3725 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!qe;BLclient!qe;Lclient!eh;)Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 method2830(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(8) int local8 = arg2.method870(arg1);
		@Pc(19) int local19 = arg2.method875(local8, arg0);
		return Static58.method1119(local8, local19, arg2);
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)Lclient!m;")
	public static Class41 method2832() {
		try {
			return (Class41) Class.forName("Class41_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class41_Sub1();
		}
	}
}
