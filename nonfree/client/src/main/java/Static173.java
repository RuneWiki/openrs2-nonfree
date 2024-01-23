import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!vc;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public static int anInt3981;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_689 = Static199.method3560("<)4col>");

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Lclient!qe;")
	private static Class78 aClass78_691 = Static199.method3560("Use");

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_690 = aClass78_691;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_692 = Static199.method3560(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_693 = Static199.method3560(" ");

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIII)V")
	public static void method3151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static208.anInt4610 < 100) {
			Static183.method3368();
		}
		Static217.method3759(arg2, arg1, arg2 + arg0, arg3 + arg1);
		@Pc(34) int local34;
		@Pc(45) int local45;
		if (Static208.anInt4610 < 100) {
			local34 = arg0 / 2 + arg2;
			local45 = arg1 + arg3 / 2 - 38;
			Static217.method3761(arg2, arg1, arg0, arg3, 0);
			Static217.method3751(local34 - 152, local45, 304, 34, 9179409);
			Static217.method3751(local34 - 151, local45 + 1, 302, 32, 0);
			Static217.method3761(local34 - 150, local45 + 2, Static208.anInt4610 * 3, 30, 9179409);
			Static217.method3761(Static208.anInt4610 * 3 + local34 - 150, local45 - -2, 300 - Static208.anInt4610 * 3, 30, 0);
			Static75.aClass2_Sub3_Sub7_1.method886(Static77.aClass78_368, local34, local45 + 20, 16777215, -1);
			return;
		}
		Static65.anInt1292 = (int) ((double) (arg0 * 2) / Static174.aDouble11);
		Static128.anInt2873 = Static223.anInt4831 - (int) ((double) arg3 / Static174.aDouble11);
		Static102.anInt2225 = (int) ((double) (arg3 * 2) / Static174.aDouble11);
		Static123.anInt2812 = Static32.anInt4049 - (int) ((double) arg0 / Static174.aDouble11);
		@Pc(152) int local152 = Static32.anInt4049 - (int) ((double) arg0 / Static174.aDouble11);
		local34 = Static223.anInt4831 - (int) ((double) arg3 / Static174.aDouble11);
		@Pc(169) int local169 = Static223.anInt4831 + (int) ((double) arg3 / Static174.aDouble11);
		local45 = (int) ((double) arg0 / Static174.aDouble11) + Static32.anInt4049;
		Static171.method3141(arg2, local169, local34, arg2 + arg0, local152, local45, arg1, arg3 + arg1);
		Static155.method2782(arg1, arg3 + arg1, local45, local34, local152, arg2 + arg0, local169, arg2);
		if (Static103.anInt2272 > 0) {
			Static103.anInt2272--;
		}
		if (!Static108.aBoolean95) {
			return;
		}
		@Pc(224) int local224 = arg0 + arg2 - 5;
		@Pc(230) int local230 = arg3 + arg1 - 8;
		@Pc(232) int local232 = 16776960;
		Static211.aClass2_Sub3_Sub7_3.method877(Static94.method1640(new Class78[] { Static162.aClass78_667, Static19.method268(Static180.anInt4191) }), local224, local230, 16776960, -1);
		@Pc(255) int local255 = local230 - 15;
		@Pc(257) Runtime local257 = Runtime.getRuntime();
		@Pc(267) int local267 = (int) ((local257.totalMemory() - local257.freeMemory()) / 1024L);
		if (local267 > 65536) {
			local232 = 16711680;
		}
		Static211.aClass2_Sub3_Sub7_3.method877(Static94.method1640(new Class78[] { Static36.aClass78_119, Static19.method268(local267), Static116.aClass78_554 }), local224, local255, local232, -1);
		local230 = local255 - 15;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([IBJI)Lclient!qe;")
	public static Class78 method3152(@OriginalArg(0) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		if (Static223.anInterface2_1 != null) {
			@Pc(12) Class78 local12 = Static223.anInterface2_1.method2462(arg1, arg2, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return arg2 == 5 ? Static103.method1785(arg1).method3048() : Static157.method2820(arg1);
	}
}
