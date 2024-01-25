import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lk", name = "T", descriptor = "[Lclient!s;")
	public static Class40[] aClass40Array2;

	@OriginalMember(owner = "client!lk", name = "U", descriptor = "Lclient!hu;")
	public static Class44 aClass44_18;

	@OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
	public static int anInt5730;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII)V")
	public static void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static616.method8512(arg0);
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg0 - arg4;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(26) int local26 = arg0;
		@Pc(29) int local29 = -arg0;
		@Pc(31) int local31 = local20;
		@Pc(34) int local34 = -local20;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static267.anIntArrayArray20[arg3];
		@Pc(47) int local47 = arg2 - local20;
		Static260.method3979(arg5, arg2 - arg0, local42, local47);
		@Pc(62) int local62 = local20 + arg2;
		Static260.method3979(arg1, local47, local42, local62);
		Static260.method3979(arg5, local62, local42, arg0 + arg2);
		while (local26 > local15) {
			local36 += 2;
			local38 += 2;
			local34 += local38;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static23.anIntArray36[local31] = local15;
				local31--;
				local34 -= local31 << 1;
			}
			local15++;
			@Pc(119) int[] local119;
			@Pc(126) int[] local126;
			@Pc(130) int local130;
			@Pc(135) int local135;
			@Pc(177) int local177;
			@Pc(182) int local182;
			@Pc(186) int local186;
			if (local29 >= 0) {
				local26--;
				if (local20 <= local26) {
					local119 = Static267.anIntArrayArray20[local26 + arg3];
					local126 = Static267.anIntArrayArray20[arg3 - local26];
					local130 = local15 + arg2;
					local135 = arg2 - local15;
					Static260.method3979(arg5, local135, local119, local130);
					Static260.method3979(arg5, local135, local126, local130);
				} else {
					local119 = Static267.anIntArrayArray20[arg3 + local26];
					local126 = Static267.anIntArrayArray20[arg3 - local26];
					local130 = Static23.anIntArray36[local26];
					local135 = arg2 + local15;
					local177 = arg2 - local15;
					local182 = arg2 + local130;
					local186 = arg2 - local130;
					Static260.method3979(arg5, local177, local119, local186);
					Static260.method3979(arg1, local186, local119, local182);
					Static260.method3979(arg5, local182, local119, local135);
					Static260.method3979(arg5, local177, local126, local186);
					Static260.method3979(arg1, local186, local126, local182);
					Static260.method3979(arg5, local182, local126, local135);
				}
				local29 -= local26 << 1;
			}
			local119 = Static267.anIntArrayArray20[arg3 + local15];
			local126 = Static267.anIntArrayArray20[arg3 - local15];
			local130 = local26 + arg2;
			local135 = arg2 - local26;
			if (local20 > local15) {
				local177 = local31 < local15 ? Static23.anIntArray36[local15] : local31;
				local182 = arg2 + local177;
				local186 = arg2 - local177;
				Static260.method3979(arg5, local135, local119, local186);
				Static260.method3979(arg1, local186, local119, local182);
				Static260.method3979(arg5, local182, local119, local130);
				Static260.method3979(arg5, local135, local126, local186);
				Static260.method3979(arg1, local186, local126, local182);
				Static260.method3979(arg5, local182, local126, local130);
			} else {
				Static260.method3979(arg5, local135, local119, local130);
				Static260.method3979(arg5, local135, local126, local130);
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)V")
	public static void method5102() {
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_2, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_1, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, 2);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub16_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub25_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub5_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub13_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub26_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub29_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub14_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub11_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub23_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub28_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub6_2, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub4_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub20_1, 0);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub27_1, 0);
		Static358.method6960();
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub19_1, 1);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub24_1, 3);
		Static246.method3759();
		Static571.method8044();
		Static9.aBoolean5 = true;
	}
}
