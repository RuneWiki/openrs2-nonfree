import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array3;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_303 = Static181.method2795("scrollen:");

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_304 = Static181.method2795("Feb");

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_305 = Static181.method2795("Jan");

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_306 = Static181.method2795("AUS");

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_307 = Static181.method2795("Nov");

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_308 = Static181.method2795("Dec");

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
	public static boolean aBoolean53 = true;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_309 = Static181.method2795("Mar");

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_310 = Static181.method2795("Jun");

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_311 = Static181.method2795("May");

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_312 = Static181.method2795("Aug");

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_313 = Static181.method2795("Apr");

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
	public static int anInt976 = 0;

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_314 = Static181.method2795("null");

	@OriginalMember(owner = "client!dj", name = "I", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_316 = Static181.method2795("Jul");

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_317 = Static181.method2795("Sep");

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_315 = Static181.method2795("Oct");

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "[Lclient!qe;")
	public static final Class83[] aClass83Array20 = new Class83[] { aClass83_305, aClass83_304, aClass83_309, aClass83_313, aClass83_311, aClass83_310, aClass83_316, aClass83_312, aClass83_317, aClass83_315, aClass83_307, aClass83_308 };

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!ae;I)V")
	public static void method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2) {
		if (Static170.anInt3526 != 0 && Static170.anInt3526 != 3) {
			return;
		}
		@Pc(19) int local19 = arg0 - arg2.anInt157 / 2;
		@Pc(25) int local25 = Static124.anInt2528 + Static210.anInt4184 & 0x7FF;
		@Pc(32) int local32 = arg1 - arg2.anInt100 / 2;
		@Pc(36) int local36 = Class16.anIntArray39[local25];
		@Pc(40) int local40 = Class16.anIntArray44[local25];
		@Pc(48) int local48 = local40 * (Static59.anInt1449 + 256) >> 8;
		@Pc(56) int local56 = (Static59.anInt1449 + 256) * local36 >> 8;
		@Pc(66) int local66 = local32 * local48 + local19 * local56 >> 11;
		@Pc(77) int local77 = local32 * local56 - local48 * local19 >> 11;
		@Pc(84) int local84 = local66 + Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7;
		@Pc(91) int local91 = Static54.aClass24_Sub4_Sub1_1.anInt3349 - local77 >> 7;
		@Pc(111) boolean local111 = Static166.method2576(1, local84, 0, local91, true, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
		if (!local111) {
			return;
		}
		Static69.aClass2_Sub3_Sub1_2.method247(local19);
		Static69.aClass2_Sub3_Sub1_2.method247(local32);
		Static69.aClass2_Sub3_Sub1_2.method239(Static210.anInt4184);
		Static69.aClass2_Sub3_Sub1_2.method247(57);
		Static69.aClass2_Sub3_Sub1_2.method247(Static124.anInt2528);
		Static69.aClass2_Sub3_Sub1_2.method247(Static59.anInt1449);
		Static69.aClass2_Sub3_Sub1_2.method247(89);
		Static69.aClass2_Sub3_Sub1_2.method239(Static54.aClass24_Sub4_Sub1_1.anInt3316);
		Static69.aClass2_Sub3_Sub1_2.method239(Static54.aClass24_Sub4_Sub1_1.anInt3349);
		Static69.aClass2_Sub3_Sub1_2.method247(Static104.anInt2413);
		Static69.aClass2_Sub3_Sub1_2.method247(63);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!eh;I)V")
	public static void method765(@OriginalArg(0) Class28 arg0) {
		Static52.aClass28_59 = arg0;
		Static17.anInt497 = Static52.aClass28_59.method846(4);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!dh;)V")
	public static void method766(@OriginalArg(1) Class2_Sub9 arg0) {
		arg0.aBoolean153 = false;
		if (arg0.aClass2_Sub6_5 != null) {
			arg0.aClass2_Sub6_5.anInt607 = 0;
		}
		for (@Pc(23) Class2_Sub9 local23 = arg0.method2468(); local23 != null; local23 = arg0.method2470()) {
			method766(local23);
		}
	}
}
