import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "[[Ljava/lang/String;")
	public static String[][] aStringArrayArray1 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZLjava/lang/String;)[B")
	public static byte[] method6932(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(28) int local28 = local6 + 3 & 0xFFFFFFFC;
		@Pc(34) int local34 = local28 / 4 * 3;
		if (local6 <= local28 - 2 || Static307.method4790(arg0.charAt(local28 - 2)) == -1) {
			local34 -= 2;
		} else if (local28 - 1 >= local6 || Static307.method4790(arg0.charAt(local28 - 1)) == -1) {
			local34--;
		}
		@Pc(83) byte[] local83 = new byte[local34];
		Static5.method9224(0, arg0, local83);
		return local83;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	public static void method6933() {
		Static492.method6897(Static577.aClass5_Sub19_25.aClass17_Sub20_1.method6783(), true);
		@Pc(19) int local19 = (Static315.anInt5380 >> 3) + (Static141.anInt2764 >> 12);
		@Pc(27) int local27 = (Static290.anInt5128 >> 3) + (Static282.anInt5025 >> 12);
		Static324.anInt5529 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 = 0;
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method4085(8, 8);
		Static547.anIntArray496 = new int[18];
		Static311.aByteArrayArray14 = new byte[18][];
		Static429.aByteArrayArray16 = new byte[18][];
		Static61.anIntArray66 = new int[18];
		Static135.aByteArrayArray7 = new byte[18][];
		Static56.aByteArrayArray1 = new byte[18][];
		Static378.aByteArrayArray15 = new byte[18][];
		Static123.anIntArray121 = new int[18];
		Static404.anIntArray406 = new int[18];
		Static75.anIntArray68 = new int[18];
		Static572.anIntArray520 = new int[18];
		Static387.anIntArrayArray42 = new int[18][4];
		@Pc(78) int local78 = 0;
		@Pc(97) int local97;
		for (@Pc(87) int local87 = (local19 - (Static271.anInt4910 >> 4)) / 8; local87 <= ((Static271.anInt4910 >> 4) + local19) / 8; local87++) {
			for (local97 = (local27 - (Static613.anInt9909 >> 4)) / 8; local97 <= ((Static613.anInt9909 >> 4) + local27) / 8; local97++) {
				@Pc(106) int local106 = (local87 << 8) + local97;
				Static75.anIntArray68[local78] = local106;
				Static123.anIntArray121[local78] = Static495.aClass126_12.method3067("m" + local87 + "_" + local97);
				Static404.anIntArray406[local78] = Static495.aClass126_12.method3067("l" + local87 + "_" + local97);
				Static547.anIntArray496[local78] = Static495.aClass126_12.method3067("n" + local87 + "_" + local97);
				Static61.anIntArray66[local78] = Static495.aClass126_12.method3067("um" + local87 + "_" + local97);
				Static572.anIntArray520[local78] = Static495.aClass126_12.method3067("ul" + local87 + "_" + local97);
				if (Static547.anIntArray496[local78] == -1) {
					Static123.anIntArray121[local78] = -1;
					Static404.anIntArray406[local78] = -1;
					Static61.anIntArray66[local78] = -1;
					Static572.anIntArray520[local78] = -1;
				}
				local78++;
			}
		}
		for (local97 = local78; local97 < Static547.anIntArray496.length; local97++) {
			Static547.anIntArray496[local97] = -1;
			Static123.anIntArray121[local97] = -1;
			Static404.anIntArray406[local97] = -1;
			Static61.anIntArray66[local97] = -1;
			Static572.anIntArray520[local97] = -1;
		}
		if (333 != 333) {
			aStringArrayArray1 = null;
		}
		@Pc(310) byte local310;
		if (Static652.anInt10664 == 3) {
			local310 = 4;
		} else if (Static652.anInt10664 == 9) {
			local310 = 10;
		} else if (Static652.anInt10664 == 7) {
			local310 = 8;
		} else {
			throw new RuntimeException("");
		}
		Static372.method5546(local19, false, local310, local27);
	}
}
