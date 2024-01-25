import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!qj;")
	public static Class165 aClass165_97;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Lclient!qj;")
	public static Class165 aClass165_98;

	@OriginalMember(owner = "client!va", name = "U", descriptor = "Lclient!br;")
	public static final Class26 aClass26_31 = new Class26(512);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III[B)I")
	public static int method5447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg1; local17 < arg0; local17++) {
			local7 = local7 >>> 8 ^ Class196.anIntArray718[(local7 ^ arg2[local17]) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
	public static boolean method5448() {
		try {
			if (Static3.anInt77 == 2) {
				if (Static231.aClass1_Sub40_2 == null) {
					Static231.aClass1_Sub40_2 = Static369.method5489(Static77.aClass165_25, Static259.anInt5035, Static68.anInt1415);
					if (Static231.aClass1_Sub40_2 == null) {
						return false;
					}
				}
				if (Static111.aClass196_1 == null) {
					Static111.aClass196_1 = new Class196(Static156.aClass165_55, Static28.aClass165_9);
				}
				if (Static121.aClass1_Sub6_Sub1_2.method543(Static281.aClass165_84, Static111.aClass196_1, Static231.aClass1_Sub40_2)) {
					Static121.aClass1_Sub6_Sub1_2.method566();
					Static121.aClass1_Sub6_Sub1_2.method558(Static160.anInt3183);
					Static121.aClass1_Sub6_Sub1_2.method554(Static158.aBoolean276, Static231.aClass1_Sub40_2);
					Static231.aClass1_Sub40_2 = null;
					Static3.anInt77 = 0;
					Static111.aClass196_1 = null;
					Static77.aClass165_25 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static121.aClass1_Sub6_Sub1_2.method561();
			Static231.aClass1_Sub40_2 = null;
			Static77.aClass165_25 = null;
			Static111.aClass196_1 = null;
			Static3.anInt77 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(CB)Z")
	public static boolean method5450(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
	public static void method5451(@OriginalArg(0) boolean arg0) {
		Static108.aBoolean187 = arg0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(58) int local58;
		@Pc(73) int local73;
		@Pc(196) int local196;
		@Pc(200) int local200;
		if (!Static108.aBoolean187) {
			local21 = Static232.aClass1_Sub7_Sub1_4.method3101();
			local25 = Static232.aClass1_Sub7_Sub1_4.method3144();
			local29 = (Static230.anInt4529 - Static232.aClass1_Sub7_Sub1_4.anInt3368) / 16;
			Static50.anIntArrayArray5 = new int[local29][4];
			@Pc(396) int local396;
			for (local33 = 0; local33 < local29; local33++) {
				for (local396 = 0; local396 < 4; local396++) {
					Static50.anIntArrayArray5[local33][local396] = Static232.aClass1_Sub7_Sub1_4.method3125();
				}
			}
			local396 = Static232.aClass1_Sub7_Sub1_4.method3141();
			local46 = Static232.aClass1_Sub7_Sub1_4.method3147();
			local50 = Static232.aClass1_Sub7_Sub1_4.method3144();
			local58 = Static232.aClass1_Sub7_Sub1_4.method3100();
			@Pc(443) boolean local443 = Static232.aClass1_Sub7_Sub1_4.method3100() == 1;
			Static171.method3410(local58);
			Static299.anIntArray724 = new int[local29];
			Static16.anIntArray43 = new int[local29];
			Static80.anIntArray184 = new int[local29];
			Static63.anIntArray153 = null;
			Static269.anIntArray658 = new int[local29];
			Static58.anIntArray145 = new int[local29];
			Static346.aByteArrayArray21 = null;
			Static61.aByteArrayArray4 = new byte[local29][];
			Static343.aByteArrayArray17 = new byte[local29][];
			Static203.aByteArrayArray12 = new byte[local29][];
			Static28.aByteArrayArray2 = new byte[local29][];
			@Pc(479) boolean local479 = false;
			if ((local46 / 8 == 48 || local46 / 8 == 49) && (local50 / 8) == 48) {
				local479 = true;
			}
			if (local46 / 8 == 48 && local50 / 8 == 148) {
				local479 = true;
			}
			local29 = 0;
			for (local73 = (local46 - (Static48.anInt1107 >> 4)) / 8; local73 <= ((Static48.anInt1107 >> 4) + local46) / 8; local73++) {
				for (local196 = (local50 - (Static337.anInt6402 >> 4)) / 8; local196 <= (local50 + (Static337.anInt6402 >> 4)) / 8; local196++) {
					local200 = local196 + (local73 << 8);
					if (local479 && (local196 == 49 || local196 == 149 || local196 == 147 || local73 == 50 || local73 == 49 && local196 == 47)) {
						Static80.anIntArray184[local29] = local200;
						Static269.anIntArray658[local29] = -1;
						Static299.anIntArray724[local29] = -1;
						Static58.anIntArray145[local29] = -1;
						Static16.anIntArray43[local29] = -1;
					} else {
						Static80.anIntArray184[local29] = local200;
						Static269.anIntArray658[local29] = Static316.aClass165_94.method4502("m" + local73 + "_" + local196);
						Static299.anIntArray724[local29] = Static316.aClass165_94.method4502("l" + local73 + "_" + local196);
						Static58.anIntArray145[local29] = Static316.aClass165_94.method4502("um" + local73 + "_" + local196);
						Static16.anIntArray43[local29] = Static316.aClass165_94.method4502("ul" + local73 + "_" + local196);
					}
					local29++;
				}
			}
			Static291.method4961(false, local396, local21, local50, local46, local25, local443);
			return;
		}
		local21 = Static232.aClass1_Sub7_Sub1_4.method3141();
		local25 = Static232.aClass1_Sub7_Sub1_4.method3115();
		local29 = Static232.aClass1_Sub7_Sub1_4.method3101();
		local33 = Static232.aClass1_Sub7_Sub1_4.method3141();
		@Pc(42) boolean local42 = Static232.aClass1_Sub7_Sub1_4.method3112() == 1;
		local46 = Static232.aClass1_Sub7_Sub1_4.method3144();
		local50 = Static232.aClass1_Sub7_Sub1_4.method3115();
		Static171.method3410(local33);
		Static232.aClass1_Sub7_Sub1_4.method729();
		@Pc(62) int local62;
		@Pc(66) int local66;
		for (local58 = 0; local58 < 4; local58++) {
			for (local62 = 0; local62 < Static48.anInt1107 >> 3; local62++) {
				for (local66 = 0; local66 < Static337.anInt6402 >> 3; local66++) {
					local73 = Static232.aClass1_Sub7_Sub1_4.method733(1);
					if (local73 == 1) {
						Static21.anIntArrayArrayArray1[local58][local62][local66] = Static232.aClass1_Sub7_Sub1_4.method733(26);
					} else {
						Static21.anIntArrayArrayArray1[local58][local62][local66] = -1;
					}
				}
			}
		}
		Static232.aClass1_Sub7_Sub1_4.method727();
		local62 = (Static230.anInt4529 - Static232.aClass1_Sub7_Sub1_4.anInt3368) / 16;
		Static50.anIntArrayArray5 = new int[local62][4];
		for (local66 = 0; local66 < local62; local66++) {
			for (local73 = 0; local73 < 4; local73++) {
				Static50.anIntArrayArray5[local66][local73] = Static232.aClass1_Sub7_Sub1_4.method3125();
			}
		}
		Static80.anIntArray184 = new int[local62];
		Static346.aByteArrayArray21 = null;
		Static16.anIntArray43 = new int[local62];
		Static269.anIntArray658 = new int[local62];
		Static61.aByteArrayArray4 = new byte[local62][];
		Static203.aByteArrayArray12 = new byte[local62][];
		Static28.aByteArrayArray2 = new byte[local62][];
		Static63.anIntArray153 = null;
		Static299.anIntArray724 = new int[local62];
		Static58.anIntArray145 = new int[local62];
		Static343.aByteArrayArray17 = new byte[local62][];
		local62 = 0;
		for (local73 = 0; local73 < 4; local73++) {
			for (local196 = 0; local196 < Static48.anInt1107 >> 3; local196++) {
				for (local200 = 0; local200 < Static337.anInt6402 >> 3; local200++) {
					@Pc(210) int local210 = Static21.anIntArrayArrayArray1[local73][local196][local200];
					if (local210 != -1) {
						@Pc(220) int local220 = local210 >> 14 & 0x3FF;
						@Pc(226) int local226 = local210 >> 3 & 0x7FF;
						@Pc(236) int local236 = (local220 / 8 << 8) + local226 / 8;
						for (@Pc(238) int local238 = 0; local238 < local62; local238++) {
							if (Static80.anIntArray184[local238] == local236) {
								local236 = -1;
								break;
							}
						}
						if (local236 != -1) {
							Static80.anIntArray184[local62] = local236;
							@Pc(267) int local267 = local236 >> 8 & 0xFF;
							@Pc(271) int local271 = local236 & 0xFF;
							Static269.anIntArray658[local62] = Static316.aClass165_94.method4502("m" + local267 + "_" + local271);
							Static299.anIntArray724[local62] = Static316.aClass165_94.method4502("l" + local267 + "_" + local271);
							Static58.anIntArray145[local62] = Static316.aClass165_94.method4502("um" + local267 + "_" + local271);
							Static16.anIntArray43[local62] = Static316.aClass165_94.method4502("ul" + local267 + "_" + local271);
							local62++;
						}
					}
				}
			}
		}
		Static291.method4961(false, local21, local25, local50, local46, local29, local42);
	}
}
