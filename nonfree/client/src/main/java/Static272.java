import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)V")
	public static void method4009() {
		Static292.method4242();
		Static427.aClass93ArrayArray3 = null;
		Static48.aClass16_1 = null;
		Static201.aClass39_6 = null;
		Static442.aClass16_7 = null;
		Static459.aClass16_6 = null;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V")
	public static void method4010(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static209.aBooleanArray29[arg0]) {
			Static359.aClass246_194.method5503(arg0);
			Static437.aClass251ArrayArray2[arg0] = null;
			Static451.aClass251ArrayArray3[arg0] = null;
			Static209.aBooleanArray29[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZII)I")
	public static int method4011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIILclient!kk;IILclient!kk;III)V")
	public static void method4012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class31_Sub2_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class31_Sub2_Sub1 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method5983();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class143 local20 = (Class143) Static431.aClass134_56.method3266((long) local7);
		if (local20 == null) {
			@Pc(41) Class51[] local41 = Static461.method1446(Static345.aClass246_187, local7);
			if (local41 == null) {
				return;
			}
			local20 = Static415.aClass39_11.method4549(local41[0]);
			Static431.aClass134_56.method3263((long) local7, local20);
		}
		Static208.method3310(arg4.anInt7298, 0, arg4.aByte100, arg6 >> 1, arg4.anInt7300, arg5 >> 1, arg4.method5989() * 64);
		@Pc(87) int local87 = Static262.anIntArray406[0] + arg0 - 18;
		@Pc(97) int local97 = Static262.anIntArray406[1] + arg3 - 16 - 54;
		@Pc(105) int local105 = local87 + arg1 / 4 * 18;
		@Pc(113) int local113 = local97 + arg1 % 4 * 18;
		local20.method5723(local105, local113);
		if (arg2 == arg4) {
			Static415.aClass39_11.method4499(-256, local105 - 1, 18, local113 - 1, 18);
		}
		@Pc(135) Class4_Sub4 local135 = Static192.method2977();
		local135.anInt3332 = local113;
		local135.anInt3334 = local105;
		local135.anInt3337 = local105 + 16;
		local135.anInt3330 = local113 + 16;
		local135.aClass31_Sub2_Sub1_1 = arg2;
		Static228.aClass141_5.method3356(local135);
	}
}
