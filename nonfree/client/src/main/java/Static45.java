import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	public static int anInt842;

	@OriginalMember(owner = "client!cd", name = "Q", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[128][128];

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
	public static void method764() {
		if (!Static319.aBoolean366) {
			return;
		}
		while (true) {
			while (Static60.anInt1263 < Static412.aClass196_Sub1Array2.length) {
				@Pc(21) Class196_Sub1 local21 = Static412.aClass196_Sub1Array2[Static60.anInt1263];
				if (local21 != null && local21.anInt7429 == -1) {
					if (Static154.aClass1_Sub25_1 == null) {
						Static154.aClass1_Sub25_1 = Static311.aClass213_1.method5021(local21.aString62);
					}
					@Pc(44) int local44 = Static154.aClass1_Sub25_1.anInt4176;
					if (local44 == -1) {
						return;
					}
					Static60.anInt1263++;
					local21.anInt7429 = local44;
					Static154.aClass1_Sub25_1 = null;
				} else {
					Static60.anInt1263++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!pp;III)V")
	public static void method765(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static242.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt2244 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass1_Sub5Array2[arg0.anInt2244++] = Static110.aClass124Array2[local21 - 1].aClass1_Sub5_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt2244; local21 < 4; local21++) {
			arg0.aClass1_Sub5Array2[local21] = null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V")
	public static void method766() {
		Static447.method5990((long) Static403.anInt6978, Static276.aClass109_10);
		if (Static273.anInt4878 != -1) {
			Static192.method2935(Static273.anInt4878);
		}
		for (@Pc(18) int local18 = 0; local18 < Static262.anInt4661; local18++) {
			if (Static22.aBooleanArray12[local18]) {
				Static108.aBooleanArray7[local18] = true;
			}
			Static240.aBooleanArray15[local18] = Static22.aBooleanArray12[local18];
			Static22.aBooleanArray12[local18] = false;
		}
		Static212.anInt453 = Static403.anInt6978;
		if (Static276.aClass109_10.method4703()) {
			Static203.aBoolean253 = true;
		}
		if (Static273.anInt4878 != -1) {
			Static262.anInt4661 = 0;
			Static382.method5216();
		}
		Static276.aClass109_10.va();
		Static234.method3458(Static154.anInt2645);
		Static9.anInt248 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!qa;ILclient!tr;Lclient!ls;)Z")
	public static boolean method767(@OriginalArg(2) Class109 arg0, @OriginalArg(4) Class231 arg1, @OriginalArg(5) Class1_Sub28 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (arg1.anIntArray568 != null) {
			local7 = Static7.anInt2565 + (Static7.anInt2575 - Static7.anInt2565) * (arg2.anInt4277 + arg1.anInt6838 + -Static7.anInt2573) / (Static7.anInt2567 - Static7.anInt2573);
			local11 = Static7.anInt2574 - (Static7.anInt2574 - Static7.anInt2569) * (arg2.anInt4275 + arg1.anInt6859 + -Static7.anInt2571) / (Static7.anInt2572 - Static7.anInt2571);
			local21 = Static7.anInt2574 - (arg1.anInt6841 + arg2.anInt4275 - Static7.anInt2571) * (-Static7.anInt2569 + Static7.anInt2574) / (Static7.anInt2572 - Static7.anInt2571);
			local9 = (arg1.anInt6846 + arg2.anInt4277 - Static7.anInt2573) * (Static7.anInt2575 - Static7.anInt2565) / (Static7.anInt2567 - Static7.anInt2573) + Static7.anInt2565;
		}
		@Pc(113) Class80 local113 = null;
		@Pc(115) int local115 = 0;
		@Pc(117) int local117 = 0;
		@Pc(119) int local119 = 0;
		@Pc(121) int local121 = 0;
		if (arg1.anInt6847 != -1) {
			if (arg2.aBoolean284 && arg1.anInt6828 != -1) {
				local113 = arg1.method5364(true, arg0);
			} else {
				local113 = arg1.method5364(false, arg0);
			}
			if (local113 != null) {
				local115 = arg2.anInt4273 - (local113.ja() + 1 >> 1);
				if (local7 > local115) {
					local7 = local115;
				}
				local117 = arg2.anInt4273 + (local113.ja() + 1 >> 1);
				if (local9 < local117) {
					local9 = local117;
				}
				local119 = arg2.anInt4276 - (local113.JA() + 1 >> 1);
				if (local119 < local11) {
					local11 = local119;
				}
				local121 = arg2.anInt4276 + (local113.JA() + 1 >> 1);
				if (local21 < local121) {
					local21 = local121;
				}
			}
		}
		@Pc(221) Class207 local221 = null;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(284) int local284;
		@Pc(307) int local307;
		if (arg1.aString54 != null) {
			local221 = Static343.method4811(arg1.anInt6848);
			if (local221 != null) {
				local223 = Static40.aClass101_1.method1968(null, null, arg1.aString54, Static387.aStringArray51);
				local225 = arg2.anInt4276;
				if (local113 == null) {
					local225 -= local221.method4890() * local223 / 2;
				} else {
					local225 -= (local113.JA() >> 1) + local223 * local221.method4889();
				}
				for (local284 = 0; local284 < local223; local284++) {
					@Pc(290) String local290 = Static387.aStringArray51[local284];
					if (local223 - 1 > local284) {
						local290 = local290.substring(0, local290.length() - 4);
					}
					local307 = local221.method4887(local290);
					if (local307 > local227) {
						local227 = local307;
					}
				}
				local229 = arg2.anInt4273 - local227 / 2;
				local231 = arg2.anInt4273 + local227 / 2;
				if (local7 > local229) {
					local7 = local229;
				}
				local233 = local225;
				if (local9 < local231) {
					local9 = local231;
				}
				local235 = local223 * local221.method4889() + local225;
				if (local233 < local11) {
					local11 = local233;
				}
				if (local235 > local21) {
					local21 = local235;
				}
			}
		}
		if (Static7.anInt2565 > local9 || local7 > Static7.anInt2575 || local21 < Static7.anInt2569 || local11 > Static7.anInt2574) {
			return true;
		}
		@Pc(417) int local417;
		if (arg1.anIntArray568 != null) {
			@Pc(415) int[] local415 = new int[arg1.anIntArray568.length];
			for (local417 = 0; local417 < local415.length / 2; local417++) {
				local307 = arg2.anInt4277 + arg1.anIntArray568[local417 * 2];
				@Pc(441) int local441 = arg2.anInt4275 + arg1.anIntArray568[local417 * 2 + 1];
				local415[local417 * 2] = (local307 - Static7.anInt2573) * (Static7.anInt2575 - Static7.anInt2565) / (Static7.anInt2567 - Static7.anInt2573) + Static7.anInt2565;
				local415[local417 * 2 + 1] = Static7.anInt2574 - (local441 - Static7.anInt2571) * (Static7.anInt2574 + -Static7.anInt2569) / (Static7.anInt2572 - Static7.anInt2571);
			}
			Static252.method3712(arg0, local415, arg1.anInt6842);
			for (local307 = 0; local307 < local415.length / 2 - 1; local307++) {
				arg0.method4751(local415[(local307 + 1) * 2 + 1], local415[local307 * 2 + 1], local415[local307 * 2 + 2], arg1.anInt6851, local415[local307 * 2]);
			}
			arg0.method4751(local415[1], local415[local415.length - 1], local415[0], arg1.anInt6851, local415[local415.length - 2]);
		}
		if (local113 != null) {
			if (Static273.anInt4877 > 0 && (Static440.anInt7583 != -1 && Static440.anInt7583 == arg2.anInt4274 || Static66.anInt1356 != -1 && Static66.anInt1356 == arg1.anInt6858)) {
				if (Static397.anInt6910 > 50) {
					local284 = 200 - Static397.anInt6910 * 2;
				} else {
					local284 = Static397.anInt6910 * 2;
				}
				local417 = local284 << 24 | 0xFFFF00;
				arg0.method4753(local113.UA() / 2 + 7, arg2.anInt4273, arg2.anInt4276, local417);
				arg0.method4753(local113.UA() / 2 + 5, arg2.anInt4273, arg2.anInt4276, local417);
				arg0.method4753(local113.UA() / 2 + 3, arg2.anInt4273, arg2.anInt4276, local417);
				arg0.method4753(local113.UA() / 2 + 1, arg2.anInt4273, arg2.anInt4276, local417);
				arg0.method4753(local113.UA() / 2, arg2.anInt4273, arg2.anInt4276, local417);
			}
			local113.method6099(arg2.anInt4273 - (local113.ja() >> 1), arg2.anInt4276 + -(local113.JA() >> 1));
		}
		if (arg1.aString54 != null && local221 != null) {
			Static283.method4038(local223, arg2, local227, local225, arg1, arg0, local221);
		}
		if (arg1.anInt6847 != -1 || arg1.aString54 != null) {
			@Pc(726) Class1_Sub9 local726 = new Class1_Sub9(arg2);
			local726.anInt1771 = local235;
			local726.anInt1770 = local229;
			local726.anInt1774 = local233;
			local726.anInt1777 = local119;
			local726.anInt1769 = local231;
			local726.anInt1773 = local121;
			local726.anInt1776 = local117;
			local726.anInt1768 = local115;
			Static67.aClass266_12.method5998(local726);
		}
		return false;
	}
}
