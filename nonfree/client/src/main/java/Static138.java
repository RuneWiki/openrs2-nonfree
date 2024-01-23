import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
	public static int anInt3181;

	@OriginalMember(owner = "client!ng", name = "Q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_603 = Static199.method3560("event_opbase");

	@OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
	public static int anInt3182 = 0;

	@OriginalMember(owner = "client!ng", name = "W", descriptor = "Lclient!qe;")
	private static Class78 aClass78_604 = Static199.method3560("Close");

	@OriginalMember(owner = "client!ng", name = "X", descriptor = "[I")
	public static int[] anIntArray527 = new int[32];

	@OriginalMember(owner = "client!ng", name = "ab", descriptor = "Lclient!qe;")
	public static Class78 aClass78_605 = aClass78_604;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	public static void method2504() {
		Static125.anInt1641 = 0;
		Static3.anInt99 = 0;
		Static210.method3684();
		Static132.method2413();
		Static199.method3564();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static3.anInt99; local22++) {
			local28 = Static156.anIntArray597[local22];
			if (Static95.aClass5_Sub2_Sub1Array1[local28].anInt1826 != Static123.anInt2808) {
				if (Static95.aClass5_Sub2_Sub1Array1[local28].aClass2_Sub3_Sub9_1.method1062()) {
					Static67.method664(Static95.aClass5_Sub2_Sub1Array1[local28]);
				}
				Static95.aClass5_Sub2_Sub1Array1[local28].aClass2_Sub3_Sub9_1 = null;
				Static95.aClass5_Sub2_Sub1Array1[local28] = null;
			}
		}
		if (Static139.aClass2_Sub23_Sub1_4.anInt2703 != Static145.anInt3288) {
			throw new RuntimeException("gnp1 pos:" + Static139.aClass2_Sub23_Sub1_4.anInt2703 + " psize:" + Static145.anInt3288);
		}
		for (local28 = 0; local28 < Static50.anInt908; local28++) {
			if (Static95.aClass5_Sub2_Sub1Array1[Static79.anIntArray286[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static50.anInt908);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static111.anInt2448 = -1;
			Static7.anInt214 = -1;
			return;
		}
		@Pc(33) int local33 = Static208.method3667(arg1, Static137.anInt3136, arg2) - arg3;
		@Pc(37) int local37 = arg1 - Static39.anInt727;
		@Pc(41) int local41 = local33 - Static107.anInt2348;
		@Pc(45) int local45 = arg2 - Static71.anInt1394;
		@Pc(49) int local49 = Class77.anIntArray631[Static15.anInt335];
		@Pc(53) int local53 = Class77.anIntArray631[anInt3181];
		@Pc(57) int local57 = Class77.anIntArray632[anInt3181];
		@Pc(61) int local61 = Class77.anIntArray632[Static15.anInt335];
		@Pc(71) int local71 = local45 * local53 + local57 * local37 >> 16;
		@Pc(82) int local82 = local57 * local45 - local53 * local37 >> 16;
		@Pc(84) int local84 = local71;
		@Pc(95) int local95 = local61 * local41 - local82 * local49 >> 16;
		@Pc(106) int local106 = local41 * local49 + local61 * local82 >> 16;
		if (local106 < 50) {
			Static7.anInt214 = -1;
			Static111.anInt2448 = -1;
		} else {
			Static111.anInt2448 = (local95 << 9) / local106 + arg0;
			Static7.anInt214 = (local84 << 9) / local106 + arg4;
		}
	}
}
