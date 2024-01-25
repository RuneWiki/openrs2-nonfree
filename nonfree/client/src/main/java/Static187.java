import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
	public static int anInt3708;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public static int anInt3710;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Lclient!sm;")
	public static final Class5_Sub12_Sub2 aClass5_Sub12_Sub2_4 = new Class5_Sub12_Sub2(5000);

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	public static int anInt3707 = 0;

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
	public static int anInt3709 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIILclient!vg;)V")
	public static void method3350(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class201 arg2) {
		if (arg2.aByte70 == 0) {
			arg2.anInt6554 = arg2.anInt6525;
		} else if (arg2.aByte70 == 1) {
			arg2.anInt6554 = arg2.anInt6525 + (arg0 - arg2.anInt6505) / 2;
		} else if (arg2.aByte70 == 2) {
			arg2.anInt6554 = arg0 - arg2.anInt6505 - arg2.anInt6525;
		} else if (arg2.aByte70 == 3) {
			arg2.anInt6554 = arg0 * arg2.anInt6525 >> 14;
		} else if (arg2.aByte70 == 4) {
			arg2.anInt6554 = (arg0 - arg2.anInt6505) / 2 + (arg0 * arg2.anInt6525 >> 14);
		} else {
			arg2.anInt6554 = arg0 - (arg0 * arg2.anInt6525 >> 14) - arg2.anInt6505;
		}
		if (arg2.aByte72 == 0) {
			arg2.anInt6516 = arg2.anInt6489;
		} else if (arg2.aByte72 == 1) {
			arg2.anInt6516 = (arg1 - arg2.anInt6510) / 2 + arg2.anInt6489;
		} else if (arg2.aByte72 == 2) {
			arg2.anInt6516 = arg1 - arg2.anInt6489 - arg2.anInt6510;
		} else if (arg2.aByte72 == 3) {
			arg2.anInt6516 = arg1 * arg2.anInt6489 >> 14;
		} else if (arg2.aByte72 == 4) {
			arg2.anInt6516 = (arg1 - arg2.anInt6510) / 2 + (arg2.anInt6489 * arg1 >> 14);
		} else {
			arg2.anInt6516 = arg1 - arg2.anInt6510 - (arg1 * arg2.anInt6489 >> 14);
		}
		if (!Static346.aBoolean577 || Static45.method707(arg2).anInt6436 == 0 && arg2.anInt6559 != 0) {
			return;
		}
		if (arg2.anInt6554 < 0) {
			arg2.anInt6554 = 0;
		} else if (arg0 < arg2.anInt6554 + arg2.anInt6505) {
			arg2.anInt6554 = arg0 - arg2.anInt6505;
		}
		if (arg2.anInt6516 < 0) {
			arg2.anInt6516 = 0;
		} else if (arg1 < arg2.anInt6510 + arg2.anInt6516) {
			arg2.anInt6516 = arg1 - arg2.anInt6510;
			return;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZI)V")
	public static void method3351(@OriginalArg(0) boolean arg0) {
		Static258.aBoolean423 = arg0;
		Static35.aBoolean43 = !Static288.method5007();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!jq;BI)V")
	public static void method3352(@OriginalArg(0) Class4_Sub5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg0.anInt5390 > Static283.anInt5563) {
			Static171.method3125(arg0);
		} else if (Static283.anInt5563 > arg0.anInt5377) {
			Static234.method4162(false, arg0);
			local5 = Static178.anInt3535;
			local7 = Static261.anInt5123;
		} else {
			Static248.method4434(arg0);
		}
		if (arg0.anInt6631 < 128 || arg0.anInt6632 < 128 || Static22.anInt481 * 128 - 128 <= arg0.anInt6631 || (Static269.anInt5281 - 1) * 128 <= arg0.anInt6632) {
			arg0.anInt5383 = -1;
			arg0.anInt5398 = -1;
			arg0.anInt5390 = 0;
			arg0.anInt5377 = 0;
			arg0.anInt6631 = arg0.anIntArray523[0] * 128 + arg0.method4807() * 64;
			arg0.anInt6632 = arg0.anIntArray522[0] * 128 + arg0.method4807() * 64;
			arg0.method4806();
		}
		if (arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2 && (arg0.anInt6631 < 1536 || arg0.anInt6632 < 1536 || arg0.anInt6631 >= Static22.anInt481 * 128 - 1536 || Static269.anInt5281 * 128 - 1536 <= arg0.anInt6632)) {
			arg0.anInt5383 = -1;
			arg0.anInt5377 = 0;
			arg0.anInt5390 = 0;
			arg0.anInt5398 = -1;
			arg0.anInt6631 = arg0.anIntArray523[0] * 128 + arg0.method4807() * 64;
			arg0.anInt6632 = arg0.anIntArray522[0] * 128 + arg0.method4807() * 64;
			arg0.method4806();
		}
		@Pc(192) int local192 = Static181.method3306(arg0);
		Static261.method4606(local5, local7, arg0, local192);
		Static116.method2024(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ij;B)V")
	public static void method3353(@OriginalArg(0) Class93 arg0) {
		Static242.aClass93_89 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)Lclient!bh;")
	public static Class20 method3355(@OriginalArg(0) int arg0) {
		@Pc(15) Class20 local15 = (Class20) Static322.aClass109_8.method2857((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static242.aClass93_91.method2410(arg0, 35);
		local15 = new Class20();
		if (local25 != null) {
			local15.method441(new Class5_Sub12(local25));
		}
		local15.method439();
		Static322.aClass109_8.method2855((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static318.anIntArrayArrayArray10[arg0][local16][local20] == -Static197.anInt3912) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static8.aClass51Array1[arg0].method1856(arg1, arg3) + arg5;
			if (!Static72.method1326(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static72.method1326(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static72.method1326(local20, local151, local177)) {
				return false;
			} else if (Static72.method1326(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static14.method278(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static72.method1326(local16 + 1, Static8.aClass51Array1[arg0].method1856(arg1, arg3) + arg5, local20 + 1) && Static72.method1326(local16 + 128 - 1, Static8.aClass51Array1[arg0].method1856(arg1 + 1, arg3) + arg5, local20 + 1) && Static72.method1326(local16 + 128 - 1, Static8.aClass51Array1[arg0].method1856(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static72.method1326(local16 + 1, Static8.aClass51Array1[arg0].method1856(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
