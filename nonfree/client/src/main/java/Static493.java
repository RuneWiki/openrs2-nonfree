import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!bc;")
	public static Class24 aClass24_3;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public static int anInt8238 = 0;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I")
	public static int method6802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static186.anIntArray380[arg1 & 0x3] : Static138.anIntArray302[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!oa;I)V")
	public static void method6806(@OriginalArg(0) Class121 arg0) {
		@Pc(7) int local7 = Static83.anInt1402;
		@Pc(9) int local9 = Static377.anInt6491;
		@Pc(11) int local11 = Static353.anInt6216;
		@Pc(15) int local15 = Static519.anInt8950 - 3;
		if (Static476.aClass4_30 == null || Static240.aClass4_12 == null) {
			if (Static447.aClass251_141.method5859(Static348.anInt8716) && Static447.aClass251_141.method5859(Static399.anInt7041)) {
				Static476.aClass4_30 = arg0.method7157(Static589.method4745(Static447.aClass251_141, Static348.anInt8716, 0));
				@Pc(44) Class196 local44 = Static589.method4745(Static447.aClass251_141, Static399.anInt7041, 0);
				Static240.aClass4_12 = arg0.method7157(local44);
				local44.method4756();
				Static245.aClass4_13 = arg0.method7157(local44);
			} else {
				arg0.C(local7, local9, local11, 20, 255 - Static97.anInt1599 << 24 | Static513.anInt8679, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static476.aClass4_30 != null && Static240.aClass4_12 != null) {
			local88 = (local11 - Static240.aClass4_12.QA() * 2) / Static476.aClass4_30.QA();
			for (local90 = 0; local90 < local88; local90++) {
				Static476.aClass4_30.method6514(Static240.aClass4_12.QA() + local7 + local90 * Static476.aClass4_30.QA(), local9);
			}
			Static240.aClass4_12.method6514(local7, local9);
			Static245.aClass4_13.method6514(local11 + local7 - Static245.aClass4_13.QA(), local9);
		}
		Static408.aClass56_4.method7879(Static141.aClass104_69.method2145(Static470.anInt7957), local7 + 3, Static326.anInt5868 | 0xFF000000, local9 + 14, -1);
		arg0.C(local7, local9 + 20, local11, local15 - 20, Static513.anInt8679 | -Static97.anInt1599 + 255 << 24, 1);
		local88 = Static427.aClass134_1.method6093();
		local90 = Static427.aClass134_1.method6092();
		@Pc(170) int local170 = 0;
		@Pc(192) int local192;
		for (@Pc(175) Class6_Sub48 local175 = (Class6_Sub48) Static445.aClass275_162.method6366(); local175 != null; local175 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			local192 = (Static374.anInt6451 - local170 - 1) * 16 + local9 + 20 + 13;
			local170++;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local192 - 13 && local192 + 4 > local90 && local175.aBoolean573) {
				arg0.C(local7, local192 - 12, local11, 16, 255 - Static69.anInt1146 << 24 | Static103.anInt9555, 1);
			}
		}
		if ((Static231.aClass4_11 == null || Static1.aClass4_1 == null || Static404.aClass4_23 == null) && Static447.aClass251_141.method5859(Static217.anInt3711) && Static447.aClass251_141.method5859(Static291.anInt4752) && Static447.aClass251_141.method5859(Static443.anInt7704)) {
			@Pc(272) Class196 local272 = Static589.method4745(Static447.aClass251_141, Static291.anInt4752, 0);
			Static1.aClass4_1 = arg0.method7157(local272);
			local272.method4756();
			Static481.aClass4_31 = arg0.method7157(local272);
			Static231.aClass4_11 = arg0.method7157(Static589.method4745(Static447.aClass251_141, Static217.anInt3711, 0));
			@Pc(297) Class196 local297 = Static589.method4745(Static447.aClass251_141, Static443.anInt7704, 0);
			Static404.aClass4_23 = arg0.method7157(local297);
			local297.method4756();
			Static355.aClass4_20 = arg0.method7157(local297);
		}
		@Pc(363) int local363;
		@Pc(328) int local328;
		if (Static231.aClass4_11 != null && Static1.aClass4_1 != null && Static404.aClass4_23 != null) {
			local192 = (local11 - Static404.aClass4_23.QA() * 2) / Static231.aClass4_11.QA();
			for (local328 = 0; local328 < local192; local328++) {
				Static231.aClass4_11.method6514(Static404.aClass4_23.QA() + local7 + Static231.aClass4_11.QA() * local328, -Static231.aClass4_11.b() + local15 + local9);
			}
			local363 = (local15 - Static404.aClass4_23.b() - 20) / Static1.aClass4_1.b();
			for (@Pc(365) int local365 = 0; local365 < local363; local365++) {
				Static1.aClass4_1.method6514(local7, Static1.aClass4_1.b() * local365 + local9 + 20);
				Static481.aClass4_31.method6514(local11 + local7 - Static481.aClass4_31.QA(), local9 - -20 - -(local365 * Static1.aClass4_1.b()));
			}
			Static404.aClass4_23.method6514(local7, local9 + local15 - Static404.aClass4_23.b());
			Static355.aClass4_20.method6514(local7 + local11 - Static404.aClass4_23.QA(), local15 + local9 + -Static404.aClass4_23.b());
		}
		local170 = 0;
		for (@Pc(437) Class6_Sub48 local437 = (Class6_Sub48) Static445.aClass275_162.method6366(); local437 != null; local437 = (Class6_Sub48) Static445.aClass275_162.method6364()) {
			local328 = (Static374.anInt6451 - local170 - 1) * 16 + local9 + 13 + 20;
			local363 = Static326.anInt5868 | 0xFF000000;
			if (local7 < local88 && local11 + local7 > local88 && local90 > local328 - 13 && local90 < local328 + 4 && local437.aBoolean573) {
				local363 = Static388.anInt6923 | 0xFF000000;
			}
			@Pc(490) int[] local490 = null;
			if (Static557.method7618(local437.anInt8333)) {
				local490 = Static295.aClass256_2.method5924((int) local437.aLong215).anIntArray315;
			} else if (local437.anInt8334 != -1) {
				local490 = Static295.aClass256_2.method5924(local437.anInt8334).anIntArray315;
			} else if (Static197.method2979(local437.anInt8333)) {
				@Pc(516) Class6_Sub28 local516 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local437.aLong215);
				if (local516 != null) {
					@Pc(521) Class29_Sub2_Sub1_Sub1 local521 = local516.aClass29_Sub2_Sub1_Sub1_2;
					@Pc(524) Class257 local524 = local521.aClass257_1;
					if (local524.anIntArray571 != null) {
						local524 = local524.method5935(Static505.aClass30_1);
					}
					if (local524 != null) {
						local490 = local524.anIntArray572;
					}
				}
			} else if (Static90.method1435(local437.anInt8333)) {
				@Pc(558) Class313 local558;
				if (local437.anInt8333 == 1006) {
					local558 = Static260.aClass100_1.method2008((int) local437.aLong215);
				} else {
					local558 = Static260.aClass100_1.method2008((int) (local437.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local558.anIntArray650 != null) {
					local558 = local558.method6967(Static505.aClass30_1);
				}
				if (local558 != null) {
					local490 = local558.anIntArray654;
				}
			}
			@Pc(606) String local606 = Static568.method7783(local437);
			if (local490 != null) {
				local606 = local606 + Static334.method5111(local490);
			}
			Static408.aClass56_4.method7880(local7 + 3, local328, local606, Static379.anIntArray553, Static156.aClass4Array5, local363);
			if (local437.aBoolean572) {
				Static261.aClass4_14.method6514(local7 + Static338.aClass146_7.method3173(local606) + 5, local328 + -12);
			}
			local170++;
		}
		Static47.method7647(Static377.anInt6491, Static519.anInt8950, Static353.anInt6216, Static83.anInt1402);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)Z")
	public static boolean method6807(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
