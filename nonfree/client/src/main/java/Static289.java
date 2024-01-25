import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public static int anInt5436;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "Lclient!ja;")
	public static Class81 aClass81_6;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
	public static int anInt5439;

	@OriginalMember(owner = "client!sj", name = "y", descriptor = "Lclient!ja;")
	public static Class81 aClass81_7;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "[S")
	public static short[] aShortArray110 = new short[256];

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public static int anInt5440 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "()V")
	public static void method4941() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static321.aClass187ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static321.aClass187ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static310.anInt5828; local6++) {
					for (local9 = 0; local9 < Static163.anInt3084; local9++) {
						if (Static321.aClass187ArrayArrayArray3[local3][local6][local9] != null) {
							Static321.aClass187ArrayArrayArray3[local3][local6][local9].method4951();
						}
						Static321.aClass187ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static321.aClass187ArrayArrayArray3 = null;
		Static99.aClass106Array4 = null;
		if (Static287.aClass187ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static287.aClass187ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static310.anInt5828; local6++) {
					for (local9 = 0; local9 < Static163.anInt3084; local9++) {
						if (Static287.aClass187ArrayArrayArray2[local3][local6][local9] != null) {
							Static287.aClass187ArrayArrayArray2[local3][local6][local9].method4951();
						}
						Static287.aClass187ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static287.aClass187ArrayArrayArray2 = null;
		Static84.aClass106Array1 = null;
		Static39.aClass187ArrayArrayArray1 = null;
		Static203.aClass106Array3 = null;
		Static192.anInt3644 = 0;
		if (Static52.aClass151Array1 != null) {
			for (local3 = 0; local3 < Static192.anInt3644; local3++) {
				Static52.aClass151Array1[local3] = null;
			}
		}
		if (Static9.aClass44_Sub4Array1 != null) {
			for (local3 = 0; local3 < Static113.anInt2094; local3++) {
				Static9.aClass44_Sub4Array1[local3] = null;
			}
			Static113.anInt2094 = 0;
		}
		if (Static240.aClass6_Sub17_Sub1Array4 != null) {
			for (local3 = 0; local3 < Static105.anInt1943; local3++) {
				Static240.aClass6_Sub17_Sub1Array4[local3] = null;
			}
			for (local6 = 0; local6 < Static131.anInt2392; local6++) {
				for (local9 = 0; local9 < Static310.anInt5828; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static163.anInt3084; local160++) {
						Static174.anIntArrayArrayArray4[local6][local9][local160] = 0;
					}
				}
			}
			Static105.anInt1943 = 0;
		}
		Static90.anIntArrayArrayArray2 = null;
		Static348.method5740();
		Static66.aClass109_2.method2946();
		Static59.aClass155_1 = null;
		Static291.anIntArrayArray183 = null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ja;B)V")
	public static void method4942(@OriginalArg(0) Class81 arg0) {
		@Pc(12) int local12 = Static194.anInt3666;
		@Pc(14) int local14 = Static267.anInt4963;
		@Pc(16) int local16 = Static25.anInt507;
		@Pc(18) int local18 = Static320.anInt5930;
		arg0.method3017(local18, -10660793, local16, local12, local14);
		arg0.method3017(16, -16777216, local16 - 2, local12 + 1, local14 + 1);
		arg0.method3002(local14 + 18, -16777216, local12 + 1, local16 - 2, local18 + -19);
		Static309.aClass30_5.method5340(local14 + 14, -10660793, -1, Static150.aString121, local12 + 3);
		@Pc(72) int local72 = Static7.anInt149;
		@Pc(74) int local74 = Static79.anInt1449;
		@Pc(76) int local76 = 0;
		for (@Pc(81) Class6_Sub32 local81 = (Class6_Sub32) Static214.aClass211_24.method5594(); local81 != null; local81 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
			@Pc(96) int local96 = (Static256.anInt4749 - local76 - 1) * 16 + local14 + 31;
			@Pc(98) short local98 = -1;
			if (local12 < local72 && local72 < local12 + local16 && local96 - 13 < local74 && local74 < local96 + 3) {
				local98 = -256;
			}
			@Pc(125) int[] local125 = null;
			if (Static153.method3085(local81.anInt4932)) {
				local125 = Static211.method3762((int) local81.aLong156).anIntArray465;
			} else if (Static166.method3284(local81.anInt4932)) {
				@Pc(141) Class44_Sub4_Sub4_Sub2 local141 = Static239.aClass44_Sub4_Sub4_Sub2Array8[(int) local81.aLong156];
				if (local141 != null) {
					local125 = local141.aClass18_1.anIntArray38;
				}
			} else if (Static341.method5621(local81.anInt4932)) {
				if (local81.anInt4932 == 1004) {
					local125 = Static196.method3622((int) local81.aLong156).anIntArray163;
				} else {
					local125 = Static196.method3622((int) (local81.aLong156 >>> 32 & 0x7FFFFFFFL)).anIntArray163;
				}
			}
			@Pc(194) String local194 = Static196.method3623(local81);
			if (local125 != null) {
				local194 = local194 + Static276.method4748(local125);
			}
			local76++;
			Static309.aClass30_5.method5345(Static233.anIntArray489, local96, 0, Static291.aClass40Array35, local12 + 3, local98, local194);
		}
		Static164.method3247(Static320.anInt5930, Static267.anInt4963, Static194.anInt3666, Static25.anInt507);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method4943() {
		for (@Pc(8) int local8 = 0; local8 < Static339.anInt6188; local8++) {
			@Pc(14) Class93 local14 = Static324.method5381(local8);
			if (local14 != null && local14.anInt2267 == 0) {
				Static41.anIntArray720[local8] = 0;
				Static41.anIntArray721[local8] = 0;
			}
		}
		Static56.aClass108_19 = new Class108(16);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	public static void method4944(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local9 = 1;
			local11 = Static308.aByteArrayArray18;
		} else {
			local9 = 4;
			local11 = Static303.aByteArrayArray17;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(36) int local36;
		@Pc(49) int local49;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local11[local22];
			local36 = Static303.anIntArray647[local22] >> 8;
			@Pc(42) int local42 = Static303.anIntArray647[local22] & 0xFF;
			local49 = local36 * 64 - Static44.anInt881;
			@Pc(56) int local56 = local42 * 64 - Static300.anInt5672;
			if (local30 != null) {
				Static24.method359();
				local26 = Static256.method4367(local56, local9, aClass81_7, Static44.anInt881, Static334.aClass27Array1, Static300.anInt5672, arg0, local30, local49);
			}
			if (!arg0 && Static296.anInt5969 / 8 == local36 && Static154.anInt2914 / 8 == local42) {
				if (local26 == null) {
					Static309.aClass125_1 = null;
				} else {
					Static309.aClass125_1 = Static214.method3835(local26[0], local26[1], local26[2], local26[3]);
					Static177.anInt3319 = local26[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local20; local127++) {
			@Pc(140) int local140 = (Static303.anIntArray647[local127] >> 8) * 64 - Static44.anInt881;
			local36 = (Static303.anIntArray647[local127] & 0xFF) * 64 - Static300.anInt5672;
			@Pc(154) byte[] local154 = local11[local127];
			if (local154 == null && Static154.anInt2914 < 800) {
				Static24.method359();
				for (local49 = 0; local49 < local9; local49++) {
					Static106.method2159(local140, 64, local49, 64, local36);
				}
			}
		}
	}
}
