import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString84 = null;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[8];

	@OriginalMember(owner = "client!of", name = "l", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method6070() {
		Static226.aClass183_27 = new Class183();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
	public static int method6073() {
		return 19;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fc;[III[II)Lclient!od;")
	public static Class93_Sub3 method6074(@OriginalArg(0) Class15_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg0.method5443(Static379.aClass261_10, Static302.aClass200_11)) {
			@Pc(21) int[] local21 = new int[arg3 * arg2];
			for (local23 = 0; local23 < arg2; local23++) {
				local34 = local23 * arg3 + arg4[local23];
				for (local36 = 0; local36 < arg1[local23]; local36++) {
					local21[local34++] = -16777216;
				}
			}
			return new Class93_Sub3(arg0, arg3, arg2, local21);
		}
		@Pc(66) byte[] local66 = new byte[arg3 * arg2];
		for (local23 = 0; local23 < arg2; local23++) {
			local34 = arg3 * local23 + arg4[local23];
			for (local36 = 0; local36 < arg1[local23]; local36++) {
				local66[local34++] = -1;
			}
		}
		return new Class93_Sub3(arg0, arg3, arg2, local66);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method6076(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = Static455.anInt8611;
		@Pc(17) int[] local17 = Static492.anIntArray589;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local5; local21++) {
			@Pc(28) Class2_Sub2_Sub1_Sub1 local28 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local17[local21]];
			if (local28 != null && local28 != Static443.aClass2_Sub2_Sub1_Sub1_2 && local28.aString23 != null && local28.aString23.equalsIgnoreCase(arg1)) {
				local19 = true;
				@Pc(62) Class3_Sub9 local62;
				if (arg0 == 1) {
					local62 = Static587.method8316(Static187.aClass40_2, Static571.aClass230_108);
					local62.aClass3_Sub7_Sub1_1.method6502(0);
					local62.aClass3_Sub7_Sub1_1.method6528(local17[local21]);
					Static230.method3933(local62);
				} else if (arg0 == 4) {
					local62 = Static587.method8316(Static187.aClass40_2, Static198.aClass230_46);
					local62.aClass3_Sub7_Sub1_1.method6503(0);
					local62.aClass3_Sub7_Sub1_1.method6527(local17[local21]);
					Static230.method3933(local62);
				} else if (arg0 == 5) {
					local62 = Static587.method8316(Static187.aClass40_2, Static226.aClass230_50);
					local62.aClass3_Sub7_Sub1_1.method6556(local17[local21]);
					local62.aClass3_Sub7_Sub1_1.method6502(0);
					Static230.method3933(local62);
				} else if (arg0 == 6) {
					local62 = Static587.method8316(Static187.aClass40_2, Static488.aClass230_20);
					local62.aClass3_Sub7_Sub1_1.method6502(0);
					local62.aClass3_Sub7_Sub1_1.method6537(local17[local21]);
					Static230.method3933(local62);
				} else if (arg0 == 7) {
					local62 = Static587.method8316(Static187.aClass40_2, Static466.aClass230_82);
					local62.aClass3_Sub7_Sub1_1.method6528(local17[local21]);
					local62.aClass3_Sub7_Sub1_1.method6546(0);
					Static230.method3933(local62);
				}
				break;
			}
		}
		if (!local19) {
			Static477.method7310(Static139.aClass101_20.method2841(Static126.anInt2904) + arg1);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method6077(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static360.anInt1763++;
		Static257.anInt5517 = 0;
		@Pc(14) int local14;
		@Pc(17) int local17;
		for (@Pc(7) int local7 = Static216.anInt4414; local7 < Static264.anInt8587; local7++) {
			@Pc(12) Class125[][] local12 = Static580.aClass125ArrayArrayArray3[local7];
			for (local14 = Static10.anInt363; local14 < Static251.anInt5429; local14++) {
				for (local17 = Static123.anInt2876; local17 < Static341.anInt6986; local17++) {
					@Pc(24) Class125 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static331.aBooleanArrayArray3[local14 + Static403.anInt7929 - Static342.anInt6991][local17 + Static403.anInt7929 - Static484.anInt9030] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean273 = true;
							local24.aBoolean271 = true;
							if (local24.aClass302_1 == null) {
								local24.aBoolean272 = false;
							} else {
								local24.aBoolean272 = true;
							}
							Static257.anInt5517++;
						} else {
							local24.aBoolean273 = false;
							local24.aBoolean271 = false;
							local24.aByte32 = 0;
							if (local14 >= Static342.anInt6991 - 16 && local14 <= Static342.anInt6991 + 16 && local17 >= Static484.anInt9030 - 16 && local17 <= Static484.anInt9030 + 16 && (local24.aClass2_Sub4_1 != null || local24.aClass2_Sub4_2 != null || local24.aClass2_Sub3_2 != null || local24.aClass2_Sub3_1 != null || local24.aClass2_Sub1_1 != null || local24.aClass302_1 != null)) {
								Static415.aClass89_1.method3868(local24);
							}
						}
					}
				}
			}
		}
		for (@Pc(140) int local140 = Static216.anInt4414; local140 < Static264.anInt8587; local140++) {
			if (Static338.aClass15_11.method5289() && local140 >= arg2 && arg1 != null) {
				local14 = Static331.aBooleanArrayArray3.length;
				if (Static10.anInt363 + Static331.aBooleanArrayArray3.length > Static223.anInt4520) {
					local14 -= Static10.anInt363 + Static331.aBooleanArrayArray3.length - Static223.anInt4520;
				}
				local17 = Static331.aBooleanArrayArray3[0].length;
				if (Static123.anInt2876 + Static331.aBooleanArrayArray3[0].length > Static416.anInt10065) {
					local17 -= Static123.anInt2876 + Static331.aBooleanArrayArray3[0].length - Static416.anInt10065;
				}
				@Pc(193) int local193 = Static187.anInt3745;
				while (true) {
					if (local193 >= local14) {
						Static415.aClass89_1.method3866(true, Static224.aClass4Array3[local140], local140);
						break;
					}
					@Pc(200) int local200 = local193 + Static10.anInt363 - Static187.anInt3745;
					for (@Pc(202) int local202 = Static1.anInt63; local202 < local17; local202++) {
						Static281.aBooleanArrayArray2[local193][local202] = false;
						if (Static331.aBooleanArrayArray3[local193][local202]) {
							@Pc(221) int local221 = local202 + Static123.anInt2876 - Static1.anInt63;
							for (@Pc(223) int local223 = local140; local223 >= 0; local223--) {
								if (Static580.aClass125ArrayArrayArray3[local223][local200][local221] != null && Static580.aClass125ArrayArrayArray3[local223][local200][local221].aByte36 == local140) {
									Static281.aBooleanArrayArray2[local193][local202] = Static580.aClass125ArrayArrayArray3[local223][local200][local221].aBoolean273;
									break;
								}
							}
						}
					}
					local193++;
				}
			} else {
				Static415.aClass89_1.method3866(false, Static224.aClass4Array3[local140], local140);
			}
			Static415.aClass89_1.method3864();
		}
		if (!Static419.method6738(true)) {
			Static419.method6738(false);
		}
	}
}
