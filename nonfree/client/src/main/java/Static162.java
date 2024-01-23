import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "Lclient!nk;")
	public static Class121 aClass121_77;

	@OriginalMember(owner = "client!lk", name = "lb", descriptor = "Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public static int anInt3171 = 0;

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString180 = "Close";

	@OriginalMember(owner = "client!lk", name = "X", descriptor = "[I")
	public static int[] anIntArray274 = new int[128];

	@OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
	public static int anInt3211 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V")
	public static void method2780(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Static94.anInt3434;
		@Pc(7) int local7 = Static93.anInt1895;
		@Pc(9) int local9 = Static233.anInt4252;
		@Pc(11) int local11 = Static306.anInt5420;
		@Pc(13) int local13 = Static277.anInt4987;
		@Pc(20) int local20 = (int) Static49.aFloat32 + Static23.anInt403 & 0x7FF;
		@Pc(31) int local31 = (int) Static278.aFloat154;
		if (local31 < Static277.anInt4986 / 256) {
			local31 = Static277.anInt4986 / 256;
		}
		if (Static197.aBooleanArray15[4] && Static100.anIntArray174[4] + 128 > local31) {
			local31 = Static100.anIntArray174[4] + 128;
		}
		Static75.method1473(local31 * 3 + 600, Static69.method4275(Static90.aClass15_Sub5_Sub2_2.anInt5557, Static65.anInt1300, Static90.aClass15_Sub5_Sub2_2.anInt5559) + -50, local31, local20, Static31.anInt551, Static183.anInt3495, arg0);
		if (local5 == Static94.anInt3434 && local11 == Static306.anInt5420 && local9 == Static233.anInt4252 && local13 == Static277.anInt4987 && local7 == Static93.anInt1895) {
			Static167.anInt3292 = 1;
			return;
		}
		Static155.anInt3076 = 10;
		Static73.anInt1539 = 10;
		Static84.anInt1665 = 10;
		Static71.anInt1521 = 10;
		if (local9 < Static233.anInt4252) {
			local9 += Static84.anInt1665 * (Static233.anInt4252 - local9) / 1000 + Static73.anInt1539;
			if (Static233.anInt4252 > local9) {
				Static233.anInt4252 = local9;
			}
		}
		if (local13 < Static277.anInt4987) {
			local13 += Static155.anInt3076 * (Static277.anInt4987 - local13) / 1000 + Static71.anInt1521;
			if (local13 < Static277.anInt4987) {
				Static277.anInt4987 = local13;
			}
		}
		if (Static233.anInt4252 < local9) {
			local9 -= Static73.anInt1539 + Static84.anInt1665 * (local9 - Static233.anInt4252) / 1000;
			if (local9 > Static233.anInt4252) {
				Static233.anInt4252 = local9;
			}
		}
		if (local13 > Static277.anInt4987) {
			local13 -= Static71.anInt1521 + (local13 - Static277.anInt4987) * Static155.anInt3076 / 1000;
			if (local13 > Static277.anInt4987) {
				Static277.anInt4987 = local13;
			}
		}
		if (local11 < Static306.anInt5420) {
			local11 += Static73.anInt1539 + Static84.anInt1665 * (Static306.anInt5420 - local11) / 1000;
			if (Static306.anInt5420 > local11) {
				Static306.anInt5420 = local11;
			}
		}
		if (local11 > Static306.anInt5420) {
			local11 -= Static73.anInt1539 + (local11 - Static306.anInt5420) * Static84.anInt1665 / 1000;
			if (Static306.anInt5420 < local11) {
				Static306.anInt5420 = local11;
			}
		}
		if (local5 < Static94.anInt3434) {
			local5 += Static73.anInt1539 + Static84.anInt1665 * (Static94.anInt3434 - local5) / 1000;
			if (local5 < Static94.anInt3434) {
				Static94.anInt3434 = local5;
			}
		}
		if (local5 > Static94.anInt3434) {
			local5 -= Static73.anInt1539 + Static84.anInt1665 * (local5 - Static94.anInt3434) / 1000;
			if (Static94.anInt3434 < local5) {
				Static94.anInt3434 = local5;
			}
		}
		@Pc(349) int local349 = Static93.anInt1895 - local7;
		if (local349 > 1024) {
			local349 -= 2048;
		}
		if (local349 < -1024) {
			local349 += 2048;
		}
		if (local349 > 0) {
			local7 += Static155.anInt3076 * local349 / 1000 + Static71.anInt1521;
			local7 &= 0x7FF;
		}
		if (local349 < 0) {
			local7 -= -local349 * Static155.anInt3076 / 1000 + Static71.anInt1521;
			local7 &= 0x7FF;
		}
		@Pc(398) int local398 = Static93.anInt1895 - local7;
		if (local398 > 1024) {
			local398 -= 2048;
		}
		if (local398 < -1024) {
			local398 += 2048;
		}
		if (local398 >= 0 || local349 <= 0 || local398 > 0 && local349 < 0) {
			Static93.anInt1895 = local7;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBIII)V")
	public static void method2782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static156.aBoolean211) {
			Static119.method2138(arg3, arg0, arg3 + arg2, arg1 + arg0);
			Static119.method2129(arg3, arg0, arg2, arg1, 0);
		} else {
			Static25.method401(arg3, arg0, arg2 + arg3, arg1 + arg0);
			Static25.method385(arg3, arg0, arg2, arg1, 0);
		}
		if (Static155.anInt3037 < 100) {
			return;
		}
		@Pc(52) float local52 = (float) Static109.anInt4231 / (float) Static109.anInt4234;
		@Pc(54) int local54 = arg2;
		@Pc(56) int local56 = arg1;
		if (local52 < 1.0F) {
			local56 = (int) (local52 * (float) arg2);
		} else {
			local54 = (int) ((float) arg1 / local52);
		}
		if (Static18.aClass1_Sub2_Sub1_5 == null || Static18.aClass1_Sub2_Sub1_5.anInt4444 != arg2 || arg1 != Static18.aClass1_Sub2_Sub1_5.anInt4454) {
			@Pc(95) Class1_Sub2_Sub1_Sub2 local95 = new Class1_Sub2_Sub1_Sub2(arg2, arg1);
			Static25.method388(local95.anIntArray391, arg2, arg1);
			if (Static109.aClass1_Sub2_Sub21_3.anInt5083 != -1) {
				Static25.method385(0, 0, arg2, arg1, Static109.aClass1_Sub2_Sub21_3.anInt5083);
			}
			Static109.method3596(0, 0, Static109.anInt4234, Static109.anInt4231, 0, 0, local54, local56);
			Static109.method3582();
			if (Static156.aBoolean211) {
				Static18.aClass1_Sub2_Sub1_5 = new Class1_Sub2_Sub1_Sub1(local95);
			} else {
				Static18.aClass1_Sub2_Sub1_5 = local95;
			}
			if (Static156.aBoolean211) {
				Static25.anIntArray27 = null;
			} else {
				Static94.aClass58_3.method2968();
			}
		}
		@Pc(152) int local152 = arg0 + (arg1 - local56) / 2;
		@Pc(161) int local161 = arg3 + (arg2 - local54) / 2;
		Static18.aClass1_Sub2_Sub1_5.method3845(local161, local152);
		@Pc(174) int local174 = local161 + local54 * Static170.anInt3348 / Static109.anInt4234;
		@Pc(180) int local180 = Static36.anInt677 * local54 / Static109.anInt4234;
		@Pc(182) int local182 = 16711680;
		@Pc(191) int local191 = local152 + Static71.anInt1517 * local56 / Static109.anInt4231;
		if (Static118.anInt2486 == 1) {
			local182 = 16777215;
		}
		@Pc(203) int local203 = Static208.anInt3971 * local56 / Static109.anInt4231;
		if (Static156.aBoolean211) {
			Static119.method2122(local174, local191, local180, local203, local182, 128);
			Static119.method2135(local174, local191, local180, local203, local182);
		} else {
			Static25.method397(local174, local191, local180, local203, local182, 128);
			Static25.method402(local174, local191, local180, local203, local182);
		}
		if (Static124.anInt5509 <= 0) {
			return;
		}
		@Pc(246) int local246;
		if (Static200.anInt3847 <= 50) {
			local246 = Static200.anInt3847 * 5;
		} else {
			local246 = (100 - Static200.anInt3847) * 5;
		}
		for (@Pc(260) Class1_Sub2_Sub12 local260 = (Class1_Sub2_Sub12) Static109.aClass170_9.method4212(); local260 != null; local260 = (Class1_Sub2_Sub12) Static109.aClass170_9.method4207()) {
			@Pc(268) Class175 local268 = Static210.method3349(local260.anInt3591);
			if (Static245.method3878(local268)) {
				@Pc(296) int local296;
				@Pc(305) int local305;
				if (Static45.anInt929 == local260.anInt3591) {
					local296 = local54 * local260.anInt3598 / Static109.anInt4234 + local161;
					local305 = local260.anInt3593 * local56 / Static109.anInt4231 + local152;
					if (Static156.aBoolean211) {
						Static119.method2122(local296 - 2, local305 + -2, 4, 4, 16776960, local246);
					} else {
						Static25.method397(local296 - 2, local305 + -2, 4, 4, 16776960, local246);
					}
				} else if (Static27.anInt483 != -1 && local268.anInt5011 == Static27.anInt483) {
					local296 = local260.anInt3598 * local54 / Static109.anInt4234 + local161;
					local305 = local152 + local56 * local260.anInt3593 / Static109.anInt4231;
					if (Static156.aBoolean211) {
						Static119.method2122(local296 - 2, local305 + -2, 4, 4, 16776960, local246);
					} else {
						Static25.method397(local296 - 2, local305 - 2, 4, 4, 16776960, local246);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static85.method1597(arg0)) {
			Static37.method684(Static274.aClass66ArrayArray1[arg0], -1, arg5, arg1, arg2, arg4, arg3, arg6);
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	public static void method2793() {
		if (Static300.aClass28_2 != null) {
			Static300.aClass28_2.method4774();
		}
		if (Static248.aClass28_1 != null) {
			Static248.aClass28_1.method4774();
		}
		Static233.method3607(Static219.aBoolean281);
		Static300.aClass28_2 = Static146.method2490(22050, Static127.aCanvas1, 0, Static26.aClass154_1);
		Static300.aClass28_2.method4770(Static116.aClass1_Sub24_Sub4_1);
		Static248.aClass28_1 = Static146.method2490(2048, Static127.aCanvas1, 1, Static26.aClass154_1);
		Static248.aClass28_1.method4770(Static205.aClass1_Sub24_Sub3_1);
	}
}
