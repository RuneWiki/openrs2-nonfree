import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!v", name = "s", descriptor = "I")
	public static int anInt2618;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!na;")
	private static Class53 aClass53_1314 = Static109.method1737("Examine");

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[I")
	public static int[] anIntArray372 = new int[1000];

	@OriginalMember(owner = "client!v", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray17 = new boolean[5];

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Lclient!na;")
	private static Class53 aClass53_1315 = Static109.method1737("Connection lost");

	@OriginalMember(owner = "client!v", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1316 = aClass53_1314;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_1317 = Static109.method1737("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_1318 = aClass53_1315;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "Lclient!na;")
	public static Class53 aClass53_1319 = Static109.method1737("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!v", name = "D", descriptor = "Lclient!fa;")
	public static Class3_Sub7_Sub1 aClass3_Sub7_Sub1_3 = new Class3_Sub7_Sub1(5000);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	public static void method1818() {
		aClass3_Sub7_Sub1_3 = null;
		aClass53_1315 = null;
		aClass53_1317 = null;
		aClass53_1319 = null;
		aBooleanArray17 = null;
		aClass53_1316 = null;
		aClass53_1318 = null;
		aClass53_1314 = null;
		anIntArray372 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
	public static void method1819() {
		Static87.aClass27_33.method1540();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)I")
	public static int method1820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static102.method1671(local3, local17);
		@Pc(35) int local35 = Static102.method1671(local3 + 1, local17);
		@Pc(42) int local42 = Static102.method1671(local3, local17 + 1);
		@Pc(51) int local51 = Static102.method1671(local3 + 1, local17 - -1);
		@Pc(58) int local58 = Static5.method114(local35, local28, arg2, local23);
		@Pc(70) int local70 = Static5.method114(local51, local42, arg2, local23);
		return Static5.method114(local70, local58, arg2, local13);
	}
}
