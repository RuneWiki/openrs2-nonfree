import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!id", name = "zc", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!id", name = "Ac", descriptor = "I")
	public static int anInt3583;

	@OriginalMember(owner = "client!id", name = "Qb", descriptor = "Lclient!pn;")
	public static final Class249 aClass249_3 = new Class249();

	@OriginalMember(owner = "client!id", name = "Bc", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!u;III)V")
	public static void method3068(@OriginalArg(0) Class6_Sub48 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static445.aClass275_162.aClass6_229) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt8335;
		@Pc(18) int local18 = arg0.anInt8336;
		@Pc(21) int local21 = arg0.anInt8333;
		@Pc(25) int local25 = (int) arg0.aLong215;
		@Pc(28) long local28 = arg0.aLong215;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(44) Class6_Sub28 local44;
		@Pc(61) Class29_Sub2_Sub1_Sub1 local61;
		if (local21 == 12) {
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				Static365.anInt6347 = arg2;
				Static137.anInt2438 = 0;
				Static327.anInt5869 = arg1;
				Static452.anInt7777 = 2;
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				Static136.method2051(Static262.aClass160_58);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method6011(local25);
				Static229.method3372(0, local61.method7008(), -2, local61.anIntArray660[0], 0, local61.method7008(), local61.anIntArray661[0], true);
			}
		}
		@Pc(109) Class29_Sub2_Sub1_Sub2 local109;
		if (local21 == 18) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static452.anInt7777 = 2;
				Static327.anInt5869 = arg1;
				Static137.anInt2438 = 0;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static119.aClass160_104);
				Static218.aClass6_Sub14_Sub2_1.method5980(local25);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 1003 || local21 == 1011 || local21 == 1001 || local21 == 1008 || local21 == 1007) {
			Static275.method3944(local25, local21, local15);
		}
		if (local21 == 23) {
			Static452.anInt7777 = 2;
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static137.anInt2438 = 0;
			Static136.method2051(Static579.aClass160_124);
			Static218.aClass6_Sub14_Sub2_1.method6011(local25);
			Static218.aClass6_Sub14_Sub2_1.method6011(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method6040(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method5980(local15 + Static218.anInt3718);
			Static317.method4926(local15, local18);
		}
		if (local21 == 3) {
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static452.anInt7777 = 2;
			Static136.method2051(Static1.aClass160_1);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static218.anInt3718 + local15);
			Static218.aClass6_Sub14_Sub2_1.method6011(local25);
			Static218.aClass6_Sub14_Sub2_1.method5997(Static167.anInt3048 + local18);
			Static317.method4926(local15, local18);
		}
		@Pc(299) Class97 local299;
		if (local21 == 4) {
			local299 = Static50.method681(local18, local15);
			if (local299 != null) {
				Static465.method6520();
				@Pc(306) Class6_Sub44 local306 = Static65.method862(local299);
				Static259.method3637(local299, local306.anInt7804, local306.method6471());
				Static516.aString112 = Static463.method7851(local299);
				if (Static516.aString112 == null) {
					Static516.aString112 = "Null";
				}
				Static474.aString98 = local299.aString36 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 47) {
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static452.anInt7777 = 2;
			Static327.anInt5869 = arg1;
			Static136.method2051(Static226.aClass160_45);
			Static218.aClass6_Sub14_Sub2_1.method5999(Static537.anInt9108);
			Static218.aClass6_Sub14_Sub2_1.method5997(local25);
			Static218.aClass6_Sub14_Sub2_1.method5999(local15 + Static218.anInt3718);
			Static218.aClass6_Sub14_Sub2_1.method6009(Static288.anInt4713);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static167.anInt3048 + local18);
			Static218.aClass6_Sub14_Sub2_1.method6011(Static443.anInt7698);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static317.method4926(local15, local18);
		}
		if (local21 == 6) {
			Static327.anInt5869 = arg1;
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static452.anInt7777 = 2;
			Static136.method2051(Static376.aClass160_91);
			Static218.aClass6_Sub14_Sub2_1.method5980(local15 + Static218.anInt3718);
			Static218.aClass6_Sub14_Sub2_1.method5980(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method6011(local25);
			Static317.method4926(local15, local18);
		}
		if (local21 == 51) {
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				Static452.anInt7777 = 2;
				Static365.anInt6347 = arg2;
				Static327.anInt5869 = arg1;
				Static137.anInt2438 = 0;
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				Static136.method2051(Static471.aClass160_109);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5999(local25);
				Static229.method3372(0, local61.method7008(), -2, local61.anIntArray660[0], 0, local61.method7008(), local61.anIntArray661[0], true);
			}
		}
		if (local21 == 48) {
			local299 = Static50.method681(local18, local15);
			if (local299 != null) {
				Static169.method2644(local299);
			}
		}
		if (local21 == 2) {
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static452.anInt7777 = 2;
			Static137.anInt2438 = 0;
			Static136.method2051(Static40.aClass160_17);
			Static218.aClass6_Sub14_Sub2_1.method5997(local25);
			Static218.aClass6_Sub14_Sub2_1.method5997(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method5980(local15 + Static218.anInt3718);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static317.method4926(local15, local18);
		}
		if (local21 == 44) {
			Static452.anInt7777 = 2;
			Static327.anInt5869 = arg1;
			Static365.anInt6347 = arg2;
			Static137.anInt2438 = 0;
			Static136.method2051(Static229.aClass160_46);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static167.anInt3048 + local18);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static218.anInt3718 + local15);
			Static218.aClass6_Sub14_Sub2_1.method5999((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static476.method6636(local28, local15, local18);
		}
		if (local21 == 46) {
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static452.anInt7777 = 1;
			Static137.anInt2438 = 0;
			Static136.method2051(Static413.aClass160_96);
			Static218.aClass6_Sub14_Sub2_1.method5995(Static288.anInt4713);
			Static218.aClass6_Sub14_Sub2_1.method6011(Static218.anInt3718 + local15);
			Static218.aClass6_Sub14_Sub2_1.method5999(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method5999(Static537.anInt9108);
			Static218.aClass6_Sub14_Sub2_1.method5997(Static443.anInt7698);
			Static229.method3372(0, 1, -4, local18, 0, 1, local15, true);
		}
		if (local21 == 20) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static327.anInt5869 = arg1;
				Static137.anInt2438 = 0;
				Static452.anInt7777 = 2;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static526.aClass160_114);
				Static218.aClass6_Sub14_Sub2_1.method5995(Static288.anInt4713);
				Static218.aClass6_Sub14_Sub2_1.method5980(local25);
				Static218.aClass6_Sub14_Sub2_1.method5980(Static443.anInt7698);
				Static218.aClass6_Sub14_Sub2_1.method5980(Static537.anInt9108);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 59) {
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static452.anInt7777 = 2;
			Static137.anInt2438 = 0;
			Static136.method2051(Static238.aClass160_53);
			Static218.aClass6_Sub14_Sub2_1.method5999(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method5980(local25);
			Static218.aClass6_Sub14_Sub2_1.method5997(Static218.anInt3718 + local15);
			Static317.method4926(local15, local18);
		}
		if (local21 == 50) {
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static452.anInt7777 = 2;
			Static137.anInt2438 = 0;
			Static136.method2051(Static526.aClass160_114);
			Static218.aClass6_Sub14_Sub2_1.method5995(Static288.anInt4713);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8541);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static443.anInt7698);
			Static218.aClass6_Sub14_Sub2_1.method5980(Static537.anInt9108);
			Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
		}
		if (local21 == 21) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static327.anInt5869 = arg1;
				Static452.anInt7777 = 2;
				Static137.anInt2438 = 0;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static160.aClass160_42);
				Static218.aClass6_Sub14_Sub2_1.method5997(local25);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 57) {
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				Static365.anInt6347 = arg2;
				Static137.anInt2438 = 0;
				Static327.anInt5869 = arg1;
				Static452.anInt7777 = 2;
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				Static136.method2051(Static277.aClass160_60);
				Static218.aClass6_Sub14_Sub2_1.method5980(Static537.anInt9108);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method6001(Static288.anInt4713);
				Static218.aClass6_Sub14_Sub2_1.method5999(Static443.anInt7698);
				Static218.aClass6_Sub14_Sub2_1.method5997(local25);
				Static229.method3372(0, local61.method7008(), -2, local61.anIntArray660[0], 0, local61.method7008(), local61.anIntArray661[0], true);
			}
		}
		if (local21 == 8) {
			Static365.anInt6347 = arg2;
			Static137.anInt2438 = 0;
			Static452.anInt7777 = 2;
			Static327.anInt5869 = arg1;
			Static136.method2051(Static108.aClass160_32);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method5980(local15 + Static218.anInt3718);
			Static218.aClass6_Sub14_Sub2_1.method5980((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static218.aClass6_Sub14_Sub2_1.method5999(local18 + Static167.anInt3048);
			Static476.method6636(local28, local15, local18);
		}
		if (local21 == 19) {
			if (Static231.anInt3930 > 0 && Static539.aClass88_1.method6348(82) && Static539.aClass88_1.method6348(81)) {
				Static169.method2642(Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, Static167.anInt3048 + local18, Static218.anInt3718 - -local15);
			} else {
				Static137.anInt2438 = 0;
				Static327.anInt5869 = arg1;
				Static452.anInt7777 = 1;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static517.aClass160_112);
				Static218.aClass6_Sub14_Sub2_1.method5997(Static218.anInt3718 + local15);
				Static218.aClass6_Sub14_Sub2_1.method6011(local18 + Static167.anInt3048);
			}
		}
		if (local21 == 30) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static327.anInt5869 = arg1;
				Static137.anInt2438 = 0;
				Static365.anInt6347 = arg2;
				Static452.anInt7777 = 2;
				Static136.method2051(Static432.aClass160_107);
				Static218.aClass6_Sub14_Sub2_1.method5980(local25);
				Static218.aClass6_Sub14_Sub2_1.method6040(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 11) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static452.anInt7777 = 2;
				Static137.anInt2438 = 0;
				Static327.anInt5869 = arg1;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static439.aClass160_103);
				Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method6011(local25);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 1012) {
			Static327.anInt5869 = arg1;
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static452.anInt7777 = 2;
			Static136.method2051(Static569.aClass160_122);
			Static218.aClass6_Sub14_Sub2_1.method5999(Static167.anInt3048 + local18);
			Static218.aClass6_Sub14_Sub2_1.method5997(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static218.aClass6_Sub14_Sub2_1.method5997(local15 + Static218.anInt3718);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static476.method6636(local28, local15, local18);
		}
		if (local21 == 22 || local21 == 1009) {
			Static344.method5185(local25, local15, arg0.aString104, local18);
		}
		if (local21 == 49) {
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				Static365.anInt6347 = arg2;
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				Static137.anInt2438 = 0;
				Static452.anInt7777 = 2;
				Static327.anInt5869 = arg1;
				Static136.method2051(Static346.aClass160_79);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5999(local25);
				Static229.method3372(0, local61.method7008(), -2, local61.anIntArray660[0], 0, local61.method7008(), local61.anIntArray661[0], true);
			}
		}
		if (local21 == 25) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static327.anInt5869 = arg1;
				Static452.anInt7777 = 2;
				Static137.anInt2438 = 0;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static276.aClass160_59);
				Static218.aClass6_Sub14_Sub2_1.method5999(local25);
				Static218.aClass6_Sub14_Sub2_1.method6040(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 16) {
			Static137.anInt2438 = 0;
			Static327.anInt5869 = arg1;
			Static452.anInt7777 = 2;
			Static365.anInt6347 = arg2;
			Static136.method2051(Static445.aClass160_105);
			Static218.aClass6_Sub14_Sub2_1.method5990(Static288.anInt4713);
			Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static218.aClass6_Sub14_Sub2_1.method5999(Static443.anInt7698);
			Static218.aClass6_Sub14_Sub2_1.method6011(Static218.anInt3718 + local15);
			Static218.aClass6_Sub14_Sub2_1.method5980(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method6011(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static218.aClass6_Sub14_Sub2_1.method5999(Static537.anInt9108);
			Static476.method6636(local28, local15, local18);
		}
		if (local21 == 1006) {
			Static452.anInt7777 = 2;
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static136.method2051(Static359.aClass160_82);
			Static218.aClass6_Sub14_Sub2_1.method5999(local25);
		}
		if (local21 == 13) {
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				Static365.anInt6347 = arg2;
				Static137.anInt2438 = 0;
				Static327.anInt5869 = arg1;
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				Static452.anInt7777 = 2;
				Static136.method2051(Static40.aClass160_18);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5999(local25);
				Static229.method3372(0, local61.method7008(), -2, local61.anIntArray660[0], 0, local61.method7008(), local61.anIntArray661[0], true);
			}
		}
		if (local21 == 58) {
			if (Static231.anInt3930 > 0 && Static539.aClass88_1.method6348(82) && Static539.aClass88_1.method6348(81)) {
				Static169.method2642(Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, Static167.anInt3048 + local18, Static218.anInt3718 - -local15);
			} else {
				Static401.method5877(local15, local25, local18);
				if (local25 == 1) {
					Static218.aClass6_Sub14_Sub2_1.method6035(-1);
					Static218.aClass6_Sub14_Sub2_1.method6035(-1);
					Static218.aClass6_Sub14_Sub2_1.method5999((int) Static399.aFloat167);
					Static218.aClass6_Sub14_Sub2_1.method6035(57);
					Static218.aClass6_Sub14_Sub2_1.method6035(Static574.anInt6272);
					Static218.aClass6_Sub14_Sub2_1.method6035(Static291.anInt4749);
					Static218.aClass6_Sub14_Sub2_1.method6035(89);
					Static218.aClass6_Sub14_Sub2_1.method5999(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222);
					Static218.aClass6_Sub14_Sub2_1.method5999(Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218);
					Static218.aClass6_Sub14_Sub2_1.method6035(63);
				} else {
					Static327.anInt5869 = arg1;
					Static365.anInt6347 = arg2;
					Static137.anInt2438 = 0;
					Static452.anInt7777 = 1;
				}
				Static229.method3372(0, 1, -4, local18, 0, 1, local15, true);
			}
		}
		if (local21 == 45) {
			Static452.anInt7777 = 2;
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static136.method2051(Static430.aClass160_71);
			Static218.aClass6_Sub14_Sub2_1.method5997((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static218.aClass6_Sub14_Sub2_1.method5999(local15 + Static218.anInt3718);
			Static218.aClass6_Sub14_Sub2_1.method5997(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static476.method6636(local28, local15, local18);
		}
		if (local21 == 9) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static137.anInt2438 = 0;
				Static452.anInt7777 = 2;
				Static365.anInt6347 = arg2;
				Static327.anInt5869 = arg1;
				Static136.method2051(Static541.aClass160_119);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5997(local25);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 17) {
			Static365.anInt6347 = arg2;
			Static327.anInt5869 = arg1;
			Static137.anInt2438 = 0;
			Static452.anInt7777 = 2;
			Static136.method2051(Static13.aClass160_10);
			Static218.aClass6_Sub14_Sub2_1.method5997(local18 + Static167.anInt3048);
			Static218.aClass6_Sub14_Sub2_1.method5997(Static218.anInt3718 + local15);
			Static218.aClass6_Sub14_Sub2_1.method6011((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static218.aClass6_Sub14_Sub2_1.method5992(Static539.aClass88_1.method6348(82) ? 1 : 0);
			Static476.method6636(local28, local15, local18);
		}
		if (local21 == 5 && Static473.aClass97_13 == null) {
			Static310.method4790(local15, local18);
			Static473.aClass97_13 = Static50.method681(local18, local15);
			Static390.method5794(Static473.aClass97_13);
		}
		if (local21 == 1004) {
			Static365.anInt6347 = arg2;
			Static452.anInt7777 = 2;
			Static327.anInt5869 = arg1;
			Static137.anInt2438 = 0;
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				@Pc(1922) Class257 local1922 = local61.aClass257_1;
				if (local1922.anIntArray571 != null) {
					local1922 = local1922.method5935(Static505.aClass30_1);
				}
				if (local1922 != null) {
					Static136.method2051(Static67.aClass160_22);
					Static218.aClass6_Sub14_Sub2_1.method5999(local1922.anInt7151);
				}
			}
		}
		if (local21 == 1010) {
			Static137.anInt2438 = 0;
			Static365.anInt6347 = arg2;
			Static452.anInt7777 = 2;
			Static327.anInt5869 = arg1;
			Static136.method2051(Static279.aClass160_61);
			Static218.aClass6_Sub14_Sub2_1.method5999(local25);
		}
		if (local21 == 60) {
			local44 = (Class6_Sub28) Static31.aClass212_1.method5106((long) local25);
			if (local44 != null) {
				local61 = local44.aClass29_Sub2_Sub1_Sub1_2;
				Static137.anInt2438 = 0;
				Static452.anInt7777 = 2;
				Static327.anInt5869 = arg1;
				Static365.anInt6347 = arg2;
				Static136.method2051(Static79.aClass160_27);
				Static218.aClass6_Sub14_Sub2_1.method6004(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5997(local25);
				Static229.method3372(0, local61.method7008(), -2, local61.anIntArray660[0], 0, local61.method7008(), local61.anIntArray661[0], true);
			}
		}
		if (local21 == 10) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static365.anInt6347 = arg2;
				Static137.anInt2438 = 0;
				Static327.anInt5869 = arg1;
				Static452.anInt7777 = 2;
				Static136.method2051(Static89.aClass160_28);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5997(local25);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (local21 == 15) {
			local109 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local25];
			if (local109 != null) {
				Static327.anInt5869 = arg1;
				Static365.anInt6347 = arg2;
				Static137.anInt2438 = 0;
				Static452.anInt7777 = 2;
				Static136.method2051(Static47.aClass160_121);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static539.aClass88_1.method6348(82) ? 1 : 0);
				Static218.aClass6_Sub14_Sub2_1.method5997(local25);
				Static229.method3372(0, local109.method7008(), -2, local109.anIntArray660[0], 0, local109.method7008(), local109.anIntArray661[0], true);
			}
		}
		if (Static492.aBoolean560) {
			Static465.method6520();
		}
		if (Static226.aClass97_6 != null && Static546.anInt9213 == 0) {
			Static390.method5794(Static226.aClass97_6);
		}
	}
}
