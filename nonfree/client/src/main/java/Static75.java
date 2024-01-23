import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString92 = "M";

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
	public static int anInt1605 = 0;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "[I")
	public static int[] anIntArray153 = new int[8];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method1308() {
		Static187.aClass1_Sub11_Sub1_2.method2699();
		@Pc(13) int local13 = Static187.aClass1_Sub11_Sub1_2.method2701(8);
		@Pc(18) int local18;
		if (local13 < Static233.anInt4582) {
			for (local18 = local13; local18 < Static233.anInt4582; local18++) {
				Static59.anIntArray358[Static68.anInt1450++] = Static281.anIntArray464[local18];
			}
		}
		if (local13 > Static233.anInt4582) {
			throw new RuntimeException("gnpov1");
		}
		Static233.anInt4582 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(69) int local69 = Static281.anIntArray464[local18];
			@Pc(73) Class14_Sub2_Sub2 local73 = Static254.aClass14_Sub2_Sub2Array1[local69];
			@Pc(78) int local78 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
			if (local78 == 0) {
				Static281.anIntArray464[Static233.anInt4582++] = local69;
				local73.anInt4645 = Static237.anInt4710;
			} else {
				@Pc(102) int local102 = Static187.aClass1_Sub11_Sub1_2.method2701(2);
				if (local102 == 0) {
					Static281.anIntArray464[Static233.anInt4582++] = local69;
					local73.anInt4645 = Static237.anInt4710;
					Static226.anIntArray399[Static1.anInt4241++] = local69;
				} else {
					@Pc(150) int local150;
					@Pc(160) int local160;
					if (local102 == 1) {
						Static281.anIntArray464[Static233.anInt4582++] = local69;
						local73.anInt4645 = Static237.anInt4710;
						local150 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
						local73.method3655(local150, 1);
						local160 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
						if (local160 == 1) {
							Static226.anIntArray399[Static1.anInt4241++] = local69;
						}
					} else if (local102 == 2) {
						Static281.anIntArray464[Static233.anInt4582++] = local69;
						local73.anInt4645 = Static237.anInt4710;
						if (Static187.aClass1_Sub11_Sub1_2.method2701(1) == 1) {
							local150 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
							local73.method3655(local150, 2);
							local160 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
							local73.method3655(local160, 2);
						} else {
							local150 = Static187.aClass1_Sub11_Sub1_2.method2701(3);
							local73.method3655(local150, 0);
						}
						local150 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
						if (local150 == 1) {
							Static226.anIntArray399[Static1.anInt4241++] = local69;
						}
					} else if (local102 == 3) {
						Static59.anIntArray358[Static68.anInt1450++] = local69;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBII)V")
	public static void method1309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static270.anInt5273; local15++) {
			if (Static55.anIntArray127[local15] + Static189.anIntArray351[local15] > arg3 && Static55.anIntArray127[local15] < arg3 + arg0 && Static215.anIntArray382[local15] + Static62.anIntArray136[local15] > arg2 && Static62.anIntArray136[local15] < arg1 + arg2) {
				Static272.aBooleanArray50[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method1310() {
		for (@Pc(7) int local7 = 0; local7 < Static103.anInt2427; local7++) {
			@Pc(22) int local22 = Static192.anIntArray355[local7]--;
			if (Static192.anIntArray355[local7] >= -10) {
				@Pc(101) Class169 local101 = Static59.aClass169Array5[local7];
				if (local101 == null) {
					local101 = Static310.method4228(Static68.aClass91_56, Static252.anIntArray439[local7], 0);
					if (local101 == null) {
						continue;
					}
					Static192.anIntArray355[local7] += local101.method4231();
					Static59.aClass169Array5[local7] = local101;
				}
				if (Static192.anIntArray355[local7] < 0) {
					@Pc(226) int local226;
					if (Static256.anIntArray443[local7] == 0) {
						local226 = Static127.anInt2836 * Static23.anIntArray57[local7] >> 8;
					} else {
						@Pc(145) int local145 = (Static256.anIntArray443[local7] & 0xFF) * 128;
						@Pc(153) int local153 = Static256.anIntArray443[local7] >> 16 & 0xFF;
						@Pc(163) int local163 = local153 * 128 + 64 - Static197.aClass14_Sub2_Sub1_2.anInt4680;
						@Pc(171) int local171 = Static256.anIntArray443[local7] >> 8 & 0xFF;
						if (local163 < 0) {
							local163 = -local163;
						}
						@Pc(186) int local186 = local171 * 128 + 64 - Static197.aClass14_Sub2_Sub1_2.anInt4630;
						if (local186 < 0) {
							local186 = -local186;
						}
						@Pc(198) int local198 = local186 + local163 - 128;
						if (local198 > local145) {
							Static192.anIntArray355[local7] = -100;
							continue;
						}
						if (local198 < 0) {
							local198 = 0;
						}
						local226 = Static23.anIntArray57[local7] * (local145 - local198) * Static119.anInt2761 / local145 >> 8;
					}
					if (local226 > 0) {
						@Pc(243) Class1_Sub10_Sub1 local243 = local101.method4229().method546(Static20.aClass143_1);
						@Pc(248) Class1_Sub5_Sub1 local248 = Static301.method1163(local243, local226);
						local248.method1182(Static30.anIntArray298[local7] - 1);
						Static141.aClass1_Sub5_Sub4_1.method4376(local248);
					}
					Static192.anIntArray355[local7] = -100;
				}
			} else {
				Static103.anInt2427--;
				for (@Pc(36) int local36 = local7; local36 < Static103.anInt2427; local36++) {
					Static252.anIntArray439[local36] = Static252.anIntArray439[local36 + 1];
					Static59.aClass169Array5[local36] = Static59.aClass169Array5[local36 + 1];
					Static30.anIntArray298[local36] = Static30.anIntArray298[local36 + 1];
					Static192.anIntArray355[local36] = Static192.anIntArray355[local36 + 1];
					Static256.anIntArray443[local36] = Static256.anIntArray443[local36 + 1];
					Static23.anIntArray57[local36] = Static23.anIntArray57[local36 + 1];
				}
				local7--;
			}
		}
		if (Static142.aBoolean225 && !Static7.method1806()) {
			if (Static184.anInt3815 != 0 && Static270.anInt5276 != -1) {
				Static236.method3627(Static197.aClass91_152, Static270.anInt5276, Static184.anInt3815);
			}
			Static142.aBoolean225 = false;
		} else if (Static184.anInt3815 != 0 && Static270.anInt5276 != -1 && !Static7.method1806()) {
			Static283.aClass1_Sub11_Sub1_3.method2697(122);
			Static283.aClass1_Sub11_Sub1_3.method2659(Static270.anInt5276);
			Static270.anInt5276 = -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Lclient!id;")
	public static Class67 method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class67 local14 = local7.aClass67_1;
			local7.aClass67_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)I")
	public static int method1313(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static89.method1558(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)I")
	public static int method1314(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
