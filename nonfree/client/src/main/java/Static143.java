import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "Lclient!tl;")
	public static final Class285 aClass285_3 = new Class285("LOCAL", 4);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	public static void method2852() {
		if (Static165.aBoolean315) {
			return;
		}
		Static333.method5318(Static284.aClass37ArrayArrayArray3);
		if (Static141.aClass37ArrayArrayArray2 != null) {
			Static333.method5318(Static141.aClass37ArrayArrayArray2);
		}
		Static165.aBoolean315 = true;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
	public static int method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static51.aByteArrayArray28 == null ? 0 : Static51.aByteArrayArray28[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!iaa;IIIB)V")
	public static void method2854(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.anInt4480 == -1 && arg1.anIntArray332 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		if (arg1.anInt4478 < arg4) {
			local16 = arg4 - arg1.anInt4478;
		} else if (arg4 < arg1.anInt4479) {
			local16 = arg1.anInt4479 - arg4;
		}
		@Pc(58) int local58 = Static208.aClass12_Sub10_Sub1_1.anInt2222 * arg1.anInt4476 >> 8;
		if (arg2 > arg1.anInt4485) {
			local16 += arg2 - arg1.anInt4485;
		} else if (arg2 < arg1.anInt4475) {
			local16 += arg1.anInt4475 - arg2;
		}
		if (arg1.anInt4481 == 0 || local16 - 64 > arg1.anInt4481 || Static208.aClass12_Sub10_Sub1_1.anInt2222 == 0 || arg1.anInt4477 != arg3) {
			if (arg1.aClass12_Sub13_Sub4_3 != null) {
				Static328.aClass12_Sub13_Sub1_1.method2443(arg1.aClass12_Sub13_Sub4_3);
				arg1.aClass12_Sub13_Sub4_3 = null;
			}
			if (arg1.aClass12_Sub13_Sub4_2 != null) {
				Static328.aClass12_Sub13_Sub1_1.method2443(arg1.aClass12_Sub13_Sub4_2);
				arg1.aClass12_Sub13_Sub4_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(147) int local147 = (arg1.anInt4481 - local16) * local58 / arg1.anInt4481;
		if (arg1.aClass12_Sub13_Sub4_3 != null) {
			arg1.aClass12_Sub13_Sub4_3.method7710(local147);
		} else if (arg1.anInt4480 >= 0) {
			@Pc(173) Class116 local173 = Static553.method3274(Static85.aClass16_17, arg1.anInt4480, 0);
			if (local173 != null) {
				@Pc(180) Class12_Sub29_Sub1 local180 = local173.method3273().method4348(Static130.aClass144_1);
				@Pc(185) Class12_Sub13_Sub4 local185 = Static560.method7701(local180, local147);
				local185.method7711(-1);
				Static328.aClass12_Sub13_Sub1_1.method2445(local185);
				arg1.aClass12_Sub13_Sub4_3 = local185;
			}
		}
		if (arg1.aClass12_Sub13_Sub4_2 != null) {
			arg1.aClass12_Sub13_Sub4_2.method7710(local147);
			if (!arg1.aClass12_Sub13_Sub4_2.method7970()) {
				arg1.aClass12_Sub13_Sub4_2 = null;
			}
		} else if (arg1.anIntArray332 != null && (arg1.anInt4486 -= arg0) <= 0) {
			@Pc(234) int local234 = (int) (Math.random() * (double) arg1.anIntArray332.length);
			@Pc(242) Class116 local242 = Static553.method3274(Static85.aClass16_17, arg1.anIntArray332[local234], 0);
			if (local242 != null) {
				@Pc(249) Class12_Sub29_Sub1 local249 = local242.method3273().method4348(Static130.aClass144_1);
				@Pc(254) Class12_Sub13_Sub4 local254 = Static560.method7701(local249, local147);
				local254.method7711(0);
				Static328.aClass12_Sub13_Sub1_1.method2445(local254);
				arg1.anInt4486 = arg1.anInt4484 + (int) ((double) (arg1.anInt4487 - arg1.anInt4484) * Math.random());
				arg1.aClass12_Sub13_Sub4_2 = local254;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BILclient!mc;)I")
	public static int method2855(@OriginalArg(1) int arg0, @OriginalArg(2) Class198 arg1) {
		if (!Static67.method1529(arg1).method5777(arg0) && arg1.anObjectArray17 == null) {
			return -1;
		} else if (arg1.anIntArray401 == null || arg0 >= arg1.anIntArray401.length) {
			return -1;
		} else {
			return arg1.anIntArray401[arg0];
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2856(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(28) String local28 = Static458.method6893(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static167.anInt3850; local33++) {
			@Pc(39) String local39 = Static205.aStringArray24[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static458.method6893(local39);
			if (local39 != null && local39.equals(local28)) {
				Static167.anInt3850--;
				for (@Pc(65) int local65 = local33; local65 < Static167.anInt3850; local65++) {
					Static205.aStringArray24[local65] = Static205.aStringArray24[local65 + 1];
					Static251.aStringArray28[local65] = Static251.aStringArray28[local65 + 1];
					Static462.anIntArray626[local65] = Static462.anIntArray626[local65 + 1];
					Static385.aStringArray58[local65] = Static385.aStringArray58[local65 + 1];
					Static8.anIntArray15[local65] = Static8.anIntArray15[local65 + 1];
					Static525.aBooleanArray47[local65] = Static525.aBooleanArray47[local65 + 1];
				}
				Static395.anInt7445 = Static413.anInt7729;
				Static332.method5312(Static372.aClass77_65);
				Static383.aClass12_Sub8_Sub2_1.method5214(Static201.method3811(arg0));
				Static383.aClass12_Sub8_Sub2_1.method5180(arg0);
				return;
			}
		}
	}
}
