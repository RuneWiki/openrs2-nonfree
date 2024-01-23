import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "Lclient!cg;")
	public static Class22 aClass22_26;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt1341 = -1;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt1347 = 0;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "S")
	public static short aShort11 = 32767;

	@OriginalMember(owner = "client!ed", name = "K", descriptor = "[I")
	public static int[] anIntArray130 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public static void method1142() {
		while (true) {
			if (Static256.aClass4_Sub24_Sub1_3.method3127(Static31.anInt653) >= 27) {
				@Pc(24) int local24 = Static256.aClass4_Sub24_Sub1_3.method3132(15);
				if (local24 != 32767) {
					@Pc(29) boolean local29 = false;
					if (Static260.aClass13_Sub5_Sub2Array114[local24] == null) {
						local29 = true;
						Static260.aClass13_Sub5_Sub2Array114[local24] = new Class13_Sub5_Sub2();
					}
					@Pc(47) Class13_Sub5_Sub2 local47 = Static260.aClass13_Sub5_Sub2Array114[local24];
					Static123.anIntArray214[Static99.anInt1950++] = local24;
					local47.anInt5329 = Static50.anInt1118;
					if (local47.aClass185_1 != null && local47.aClass185_1.method4663()) {
						Static65.method4576(local47);
					}
					@Pc(76) int local76 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
					if (local76 == 1) {
						Static148.anIntArray237[Static291.anInt5649++] = local24;
					}
					@Pc(94) int local94 = Static219.anIntArray348[Static256.aClass4_Sub24_Sub1_3.method3132(3)];
					if (local29) {
						local47.anInt5266 = local47.anInt5261 = local94;
					}
					@Pc(107) int local107 = Static256.aClass4_Sub24_Sub1_3.method3132(5);
					if (local107 > 15) {
						local107 -= 32;
					}
					@Pc(117) int local117 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
					@Pc(122) int local122 = Static256.aClass4_Sub24_Sub1_3.method3132(5);
					if (local122 > 15) {
						local122 -= 32;
					}
					local47.method4230(Static22.method458(Static256.aClass4_Sub24_Sub1_3.method3132(14)));
					local47.method4217(local47.aClass185_1.anInt5803);
					local47.anInt5290 = local47.aClass185_1.anInt5788;
					if (local47.anInt5290 == 0) {
						local47.anInt5261 = 0;
					}
					local47.anInt5275 = local47.aClass185_1.anInt5790;
					local47.method4221(local117 == 1, Static72.aClass13_Sub5_Sub1_1.anIntArray418[0] + local107, local47.method4219(), Static72.aClass13_Sub5_Sub1_1.anIntArray411[0] + local122);
					if (local47.aClass185_1.method4663()) {
						Static276.method4340(local47.anIntArray411[0], local47.anIntArray418[0], 0, null, Static222.anInt4467, local47, null);
					}
					continue;
				}
			}
			Static256.aClass4_Sub24_Sub1_3.method3129();
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
	public static void method1144() {
		while (true) {
			@Pc(11) Class4_Sub9 local11 = (Class4_Sub9) Static95.aClass17_15.method617();
			if (local11 == null) {
				return;
			}
			@Pc(37) Class13_Sub5 local37;
			@Pc(26) int local26;
			if (local11.anInt1067 < 0) {
				local26 = -local11.anInt1067 - 1;
				if (Static169.anInt3387 == local26) {
					local37 = Static72.aClass13_Sub5_Sub1_1;
				} else {
					local37 = Static100.aClass13_Sub5_Sub1Array1[local26];
				}
			} else {
				local26 = local11.anInt1067 - 1;
				local37 = Static260.aClass13_Sub5_Sub2Array114[local26];
			}
			if (local37 != null) {
				@Pc(61) Class73 local61 = Static296.method4591(local11.anInt1064);
				if (Static222.anInt4467 >= 3) {
				}
				@Pc(77) int local77;
				@Pc(80) int local80;
				if (local11.anInt1058 == 1 || local11.anInt1058 == 3) {
					local77 = local61.anInt2253;
					local80 = local61.anInt2259;
				} else {
					local77 = local61.anInt2259;
					local80 = local61.anInt2253;
				}
				@Pc(98) int local98 = local11.anInt1062 + (local77 + 1 >> 1);
				@Pc(105) int local105 = local11.anInt1062 + (local77 >> 1);
				@Pc(114) int local114 = (local80 + 1 >> 1) + local11.anInt1057;
				@Pc(122) int local122 = local11.anInt1057 + (local80 >> 1);
				@Pc(126) int[][] local126 = Static154.anIntArrayArrayArray5[Static222.anInt4467];
				@Pc(153) int local153 = local126[local98][local122] + local126[local105][local122] + local126[local105][local114] + local126[local98][local114] >> 2;
				@Pc(155) Class13 local155 = null;
				@Pc(160) int local160 = Static230.anIntArray374[local11.anInt1068];
				if (local160 == 0) {
					@Pc(225) Class181 local225 = Static71.method1220(Static222.anInt4467, local11.anInt1062, local11.anInt1057);
					if (local225 != null) {
						local155 = local225.aClass13_9;
					}
				} else if (local160 == 1) {
					@Pc(175) Class35 local175 = Static307.method4712(Static222.anInt4467, local11.anInt1062, local11.anInt1057);
					if (local175 != null) {
						local155 = local175.aClass13_2;
					}
				} else if (local160 == 2) {
					@Pc(211) Class99 local211 = Static101.method1682(Static222.anInt4467, local11.anInt1062, local11.anInt1057);
					if (local211 != null) {
						local155 = local211.aClass13_4;
					}
				} else if (local160 == 3) {
					@Pc(196) Class67 local196 = Static19.method424(Static222.anInt4467, local11.anInt1062, local11.anInt1057);
					if (local196 != null) {
						local155 = local196.aClass13_3;
					}
				}
				if (local155 != null) {
					Static211.method3083(local11.anInt1053 + 1, local160, local11.anInt1059 + 1, local11.anInt1062, local11.anInt1057, 0, Static222.anInt4467, -1, 0);
					local37.anInt5264 = Static50.anInt1118 + local11.anInt1059;
					@Pc(262) int local262 = local11.anInt1060;
					local37.anInt5321 = local11.anInt1062 * 128 + local77 * 64;
					@Pc(276) int local276 = local11.anInt1065;
					local37.anObject7 = local155;
					@Pc(282) int local282 = local11.anInt1063;
					@Pc(285) int local285 = local11.anInt1055;
					local37.anInt5288 = local80 * 64 + local11.anInt1057 * 128;
					@Pc(301) int local301;
					if (local285 > local276) {
						local301 = local285;
						local285 = local276;
						local276 = local301;
					}
					local37.anInt5317 = local285 + local11.anInt1062;
					local37.anInt5263 = local153;
					if (local282 < local262) {
						local301 = local262;
						local262 = local282;
						local282 = local301;
					}
					local37.anInt5276 = local262 + local11.anInt1057;
					local37.anInt5270 = local11.anInt1053 + Static50.anInt1118;
					local37.anInt5323 = local11.anInt1062 + local276;
					local37.anInt5311 = local282 + local11.anInt1057;
				}
			}
		}
	}
}
