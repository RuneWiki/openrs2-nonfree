import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public static int anInt1087;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public static int anInt1092;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "Lclient!td;")
	public static Class84 aClass84_3;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_374 = Static177.method3050("Oct");

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_375 = Static177.method3050("Nov");

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_384 = Static177.method3050("Jan");

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_379 = Static177.method3050("Feb");

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_382 = Static177.method3050("Mar");

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_377 = Static177.method3050("Apr");

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_383 = Static177.method3050("May");

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_380 = Static177.method3050("Jun");

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_381 = Static177.method3050("Jul");

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_376 = Static177.method3050("Aug");

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_386 = Static177.method3050("Sep");

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_385 = Static177.method3050("Dec");

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array7 = new Class46[] { aClass46_384, aClass46_379, aClass46_382, aClass46_377, aClass46_383, aClass46_380, aClass46_381, aClass46_376, aClass46_386, aClass46_374, aClass46_375, aClass46_385 };

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_378 = Static177.method3050("");

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
	public static volatile int anInt1091 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public static void method735() {
		try {
			if (Static63.aClass87_2 == null) {
				Static63.aClass87_2 = new Class87(Static126.aClass76_4, Static69.method1482(new Class46[] { Static177.aClass46_1455, Static3.aClass46_45, Static117.aClass46_1055 }).method1676());
			} else {
				@Pc(40) byte[] local40 = Static63.aClass87_2.method2760();
				if (local40 != null) {
					@Pc(47) Class4_Sub11 local47 = new Class4_Sub11(local40);
					Static140.anInt3267 = local47.method1252();
					Static132.aClass19Array1 = new Class19[Static140.anInt3267];
					for (@Pc(56) int local56 = 0; local56 < Static140.anInt3267; local56++) {
						@Pc(66) Class19 local66 = Static132.aClass19Array1[local56] = new Class19();
						@Pc(70) int local70 = local47.method1252();
						local66.aBoolean39 = (local70 & 0x8000) != 0;
						local66.anInt761 = local70 & 0x7FFF;
						local66.aClass46_244 = local47.method1247();
						local66.anInt759 = local47.method1227();
						local66.anInt756 = local56;
						local66.anInt760 = Static49.method948(local66.aClass46_244);
					}
					Static87.method1726(0, Static132.aClass19Array1, Static176.anIntArray426, Static132.aClass19Array1.length - 1, Static148.anIntArray320);
					Static53.aBoolean64 = true;
					Static63.aClass87_2 = null;
				}
			}
		} catch (@Pc(127) Exception local127) {
			local127.printStackTrace();
			Static63.aClass87_2 = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	public static void method736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0 != Static134.anInt3188) {
			Static67.anIntArray170 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static67.anIntArray170[local9] = (local9 << 12) / arg0;
			}
			Static92.anInt2362 = arg0 == 64 ? 2048 : 4096;
			Static2.anInt80 = arg0 - 1;
			Static134.anInt3188 = arg0;
		}
		if (arg1 == Static61.anInt1639) {
			return;
		}
		Static148.anIntArray321 = new int[arg1];
		for (local9 = 0; local9 < arg1; local9++) {
			Static148.anIntArray321[local9] = (local9 << 12) / arg1;
		}
		Static5.anInt216 = arg1 - 1;
		Static61.anInt1639 = arg1;
	}
}
