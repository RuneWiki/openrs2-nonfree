import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "Lclient!oj;")
	public static Class84 aClass84_30 = new Class84(64);

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1145 = Static186.method3527("Mem:");

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	public static int method2810(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class111 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class111(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static56.aClass1_Sub11ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static56.aClass1_Sub11ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub11(local14, arg1, arg2);
				}
			}
			Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass111_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class111(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static56.aClass1_Sub11ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static56.aClass1_Sub11ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub11(local14, arg1, arg2);
				}
			}
			Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass111_1 = local12;
		} else {
			@Pc(134) Class98 local134 = new Class98(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static56.aClass1_Sub11ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static56.aClass1_Sub11ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub11(local14, arg1, arg2);
				}
			}
			Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2].aClass98_1 = local134;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!gj;I)V")
	public static void method2814(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt3060 && arg0 != -1) {
			@Pc(14) Class110 local14 = Static200.method3204(arg0);
			@Pc(17) int local17 = local14.anInt4014;
			if (local17 == 1) {
				arg1.anInt3052 = 0;
				arg1.anInt3020 = 0;
				arg1.anInt3046 = 0;
				arg1.anInt3014 = arg2;
				Static80.method1140(arg1.anInt3046, arg1.anInt3008, arg1.anInt3022, Static230.aClass20_Sub3_Sub1_3 == arg1, local14);
			}
			if (local17 == 2) {
				arg1.anInt3020 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt3060 == -1 || Static200.method3204(arg0).anInt4012 >= Static200.method3204(arg1.anInt3060).anInt4012) {
			arg1.anInt3020 = 0;
			arg1.anInt3014 = arg2;
			arg1.anInt3052 = 0;
			arg1.anInt3060 = arg0;
			arg1.anInt3046 = 0;
			arg1.anInt3009 = arg1.anInt3041;
			if (arg1.anInt3060 != -1) {
				Static80.method1140(arg1.anInt3046, arg1.anInt3008, arg1.anInt3022, arg1 == Static230.aClass20_Sub3_Sub1_3, Static200.method3204(arg1.anInt3060));
			}
		}
	}
}
