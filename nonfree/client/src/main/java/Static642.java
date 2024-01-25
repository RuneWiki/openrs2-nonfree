import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vm", name = "qb", descriptor = "I")
	public static int anInt10461;

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "[I")
	public static int[] anIntArray595;

	@OriginalMember(owner = "client!vm", name = "Dc", descriptor = "[I")
	public static int[] anIntArray596;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public static void method8872() {
		Static179.method3125(false);
		Static574.anInt8997 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static56.aByteArrayArray1.length; local16++) {
			if (Static123.anIntArray121[local16] != -1 && Static56.aByteArrayArray1[local16] == null) {
				Static56.aByteArrayArray1[local16] = Static495.aClass126_12.method3086(0, Static123.anIntArray121[local16]);
				if (Static56.aByteArrayArray1[local16] == null) {
					local14 = false;
					Static574.anInt8997++;
				}
			}
			if (Static404.anIntArray406[local16] != -1 && Static429.aByteArrayArray16[local16] == null) {
				Static429.aByteArrayArray16[local16] = Static495.aClass126_12.method3076(Static404.anIntArray406[local16], Static387.anIntArrayArray42[local16], 0);
				if (Static429.aByteArrayArray16[local16] == null) {
					local14 = false;
					Static574.anInt8997++;
				}
			}
			if (Static61.anIntArray66[local16] != -1 && Static135.aByteArrayArray7[local16] == null) {
				Static135.aByteArrayArray7[local16] = Static495.aClass126_12.method3086(0, Static61.anIntArray66[local16]);
				if (Static135.aByteArrayArray7[local16] == null) {
					local14 = false;
					Static574.anInt8997++;
				}
			}
			if (Static572.anIntArray520[local16] != -1 && Static378.aByteArrayArray15[local16] == null) {
				Static378.aByteArrayArray15[local16] = Static495.aClass126_12.method3086(0, Static572.anIntArray520[local16]);
				if (Static378.aByteArrayArray15[local16] == null) {
					Static574.anInt8997++;
					local14 = false;
				}
			}
			if (Static547.anIntArray496 != null && Static311.aByteArrayArray14[local16] == null && Static547.anIntArray496[local16] != -1) {
				Static311.aByteArrayArray14[local16] = Static495.aClass126_12.method3076(Static547.anIntArray496[local16], Static387.anIntArrayArray42[local16], 0);
				if (Static311.aByteArrayArray14[local16] == null) {
					local14 = false;
					Static574.anInt8997++;
				}
			}
		}
		if (Static311.aClass396_3 == null) {
			if (Static396.aClass5_Sub1_Sub16_3 == null || !Static460.aClass126_211.method3075(Static396.aClass5_Sub1_Sub16_3.aString88 + "_staticelements")) {
				Static311.aClass396_3 = new Class396(0);
			} else if (Static460.aClass126_211.method3074(Static396.aClass5_Sub1_Sub16_3.aString88 + "_staticelements")) {
				Static311.aClass396_3 = Static501.method6965(Static460.aClass126_211, Static504.aBoolean543, Static396.aClass5_Sub1_Sub16_3.aString88 + "_staticelements");
			} else {
				local14 = false;
				Static574.anInt8997++;
			}
		}
		if (!local14) {
			Static184.anInt3435 = 1;
			return;
		}
		Static119.anInt1944 = 0;
		local14 = true;
		@Pc(315) int local315;
		@Pc(326) int local326;
		for (@Pc(296) int local296 = 0; local296 < Static56.aByteArrayArray1.length; local296++) {
			@Pc(302) byte[] local302 = Static429.aByteArrayArray16[local296];
			if (local302 != null) {
				local315 = (Static75.anIntArray68[local296] >> 8) * 64 - Static315.anInt5380;
				local326 = (Static75.anIntArray68[local296] & 0xFF) * 64 - Static290.anInt5128;
				if (Static139.anInt2749 != 0) {
					local315 = 10;
					local326 = 10;
				}
				local14 &= Static144.method2624(local315, local302, Static613.anInt9909, local326, Static271.anInt4910);
			}
			local302 = Static378.aByteArrayArray15[local296];
			if (local302 != null) {
				local315 = (Static75.anIntArray68[local296] >> 8) * 64 - Static315.anInt5380;
				local326 = (Static75.anIntArray68[local296] & 0xFF) * 64 - Static290.anInt5128;
				if (Static139.anInt2749 != 0) {
					local315 = 10;
					local326 = 10;
				}
				local14 &= Static144.method2624(local315, local302, Static613.anInt9909, local326, Static271.anInt4910);
			}
		}
		if (!local14) {
			Static184.anInt3435 = 2;
			return;
		}
		if (Static184.anInt3435 != 0) {
			Static636.method8809(true, Static273.aClass100_6, Static85.aClass196_38, Static184.aClass131_13.method3168(Static375.anInt7800) + "<br>(100%)", Static414.aClass70_6);
		}
		Static455.method6423();
		Static109.method8573();
		Static43.method773();
		@Pc(443) boolean local443 = false;
		if (Static273.aClass100_6.method8631() && Static577.aClass5_Sub19_25.aClass17_Sub10_1.method3380() == 2) {
			for (local315 = 0; local315 < Static56.aByteArrayArray1.length; local315++) {
				if (Static378.aByteArrayArray15[local315] != null || Static135.aByteArrayArray7[local315] != null) {
					local443 = true;
					break;
				}
			}
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub28_1.method9098() == 1) {
			local315 = Static403.anIntArray391[Static632.anInt10347];
		} else {
			local315 = Static403.anIntArray392[Static632.anInt10347];
		}
		if (Static273.aClass100_6.method8632()) {
			local315++;
		}
		Static302.method4724(Static273.aClass100_6, Static184.anInt3434, Static271.anInt4910, Static613.anInt9909, local315, local443, Static273.aClass100_6.method8635() > 0);
		Static660.method9071(Static383.anInt6452);
		if (Static383.anInt6452 == 0) {
			Static72.method1170((Class70) null);
		} else {
			Static72.method1170(Static510.aClass70_11);
		}
		for (local326 = 0; local326 < 4; local326++) {
			Static553.aClass169Array1[local326].method3869();
		}
		Static418.method6136();
		Static98.method1524(false);
		Static271.method4450();
		Static572.aClass173_1 = null;
		Static134.aBoolean151 = false;
		Static455.method6423();
		System.gc();
		Static179.method3125(true);
		Static644.method8888();
		Static560.anInt8808 = Static577.aClass5_Sub19_25.aClass17_Sub3_1.method430();
		Static450.aBoolean498 = Static21.anInt299 >= 96;
		Static130.aBoolean147 = Static577.aClass5_Sub19_25.aClass17_Sub10_1.method3380() == 2;
		Static3.aBoolean1 = Static577.aClass5_Sub19_25.aClass17_Sub23_1.method7699() == 1;
		Static460.anInt7446 = Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 1 ? -1 : Static8.anInt112;
		Static428.aBoolean476 = Static577.aClass5_Sub19_25.aClass17_Sub7_1.method1654() == 1;
		Static399.aBoolean444 = Static577.aClass5_Sub19_25.aClass17_Sub21_1.method6983() == 1;
		Static168.aClass137_Sub1_1 = new Class137_Sub1(4, Static271.anInt4910, Static613.anInt9909, false);
		if (Static139.anInt2749 == 0) {
			Static572.method7698(Static56.aByteArrayArray1, Static168.aClass137_Sub1_1);
		} else {
			Static614.method8445(Static168.aClass137_Sub1_1, 52, Static56.aByteArrayArray1);
		}
		Static15.method222(Static271.anInt4910 >> 4, Static613.anInt9909 >> 4);
		Static231.method3636();
		if (local443) {
			Static130.method1928(true);
			Static442.aClass137_Sub1_2 = new Class137_Sub1(1, Static271.anInt4910, Static613.anInt9909, true);
			if (Static139.anInt2749 == 0) {
				Static572.method7698(Static135.aByteArrayArray7, Static442.aClass137_Sub1_2);
				Static179.method3125(true);
			} else {
				Static614.method8445(Static442.aClass137_Sub1_2, 75, Static135.aByteArrayArray7);
				Static179.method3125(true);
			}
			Static442.aClass137_Sub1_2.method6460(Static168.aClass137_Sub1_1.anIntArrayArrayArray16[0]);
			Static442.aClass137_Sub1_2.method6452((Class169[]) null, Static273.aClass100_6, (int[][][]) null);
			Static130.method1928(false);
		}
		Static168.aClass137_Sub1_1.method6452(Static553.aClass169Array1, Static273.aClass100_6, local443 ? Static442.aClass137_Sub1_2.anIntArrayArrayArray16 : null);
		if (Static139.anInt2749 == 0) {
			Static179.method3125(true);
			Static498.method6946(Static429.aByteArrayArray16, Static168.aClass137_Sub1_1);
			if (Static311.aByteArrayArray14 != null) {
				Static482.method6782();
			}
		} else {
			Static179.method3125(true);
			Static250.method4089(Static168.aClass137_Sub1_1, Static429.aByteArrayArray16);
		}
		Static109.method8573();
		if (Static21.anInt299 < 96) {
			Static222.method3531();
		}
		Static179.method3125(true);
		Static168.aClass137_Sub1_1.method6455((Class84) null, local443 ? Static77.aClass84Array1[0] : null, Static273.aClass100_6, 0);
		Static168.aClass137_Sub1_1.method6464(Static273.aClass100_6, false);
		Static179.method3125(true);
		if (local443) {
			Static130.method1928(true);
			Static179.method3125(true);
			if (Static139.anInt2749 == 0) {
				Static498.method6946(Static378.aByteArrayArray15, Static442.aClass137_Sub1_2);
			} else {
				Static250.method4089(Static442.aClass137_Sub1_2, Static378.aByteArrayArray15);
			}
			Static109.method8573();
			Static179.method3125(true);
			Static442.aClass137_Sub1_2.method6455(Static668.aClass84Array4[0], (Class84) null, Static273.aClass100_6, 0);
			Static442.aClass137_Sub1_2.method6464(Static273.aClass100_6, true);
			Static179.method3125(true);
			Static130.method1928(false);
		}
		Static107.method1613();
		@Pc(888) int local888 = Static168.aClass137_Sub1_1.anInt7418;
		if (Static324.anInt5529 < local888) {
			local888 = Static324.anInt5529;
		}
		if (local888 < Static324.anInt5529 - 1) {
			local888 = Static324.anInt5529 - 1;
		}
		if (Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 0) {
			Static671.method9113(local888);
		} else {
			Static671.method9113(0);
		}
		@Pc(929) int local929;
		@Pc(933) int local933;
		for (@Pc(923) int local923 = 0; local923 < 4; local923++) {
			for (local929 = 0; local929 < Static271.anInt4910; local929++) {
				for (local933 = 0; local933 < Static613.anInt9909; local933++) {
					Static549.method7494(local929, local923, local933);
				}
			}
		}
		Static635.method8807();
		Static455.method6423();
		Static62.method1064();
		Static109.method8573();
		Static210.method3403();
		@Pc(1006) Class5_Sub41 local1006;
		if (Static207.aFrame2 != null && Static4.aClass389_17.aClass50_2 != null && Static652.anInt10664 == 12) {
			local1006 = Static647.method8905(Static420.aClass381_184, Static4.aClass389_17.aClass393_2);
			local1006.aClass5_Sub36_Sub2_1.method7287(1057001181);
			Static4.aClass389_17.method9079(local1006);
		}
		if (Static139.anInt2749 == 0) {
			local929 = (Static549.anInt8709 - (Static271.anInt4910 >> 4)) / 8;
			local933 = (Static549.anInt8709 + (Static271.anInt4910 >> 4)) / 8;
			@Pc(1045) int local1045 = (Static228.anInt3937 - (Static613.anInt9909 >> 4)) / 8;
			@Pc(1053) int local1053 = ((Static613.anInt9909 >> 4) + Static228.anInt3937) / 8;
			for (@Pc(1057) int local1057 = local929 - 1; local1057 <= local933 + 1; local1057++) {
				for (@Pc(1063) int local1063 = local1045 - 1; local1063 <= local1053 + 1; local1063++) {
					if (local1057 < local929 || local1057 > local933 || local1063 < local1045 || local1053 < local1063) {
						Static495.aClass126_12.method3079("m" + local1057 + "_" + local1063);
						Static495.aClass126_12.method3079("l" + local1057 + "_" + local1063);
					}
				}
			}
		}
		if (Static652.anInt10664 == 4) {
			Static411.method6060(3, -3);
		} else if (Static652.anInt10664 == 8) {
			Static411.method6060(7, -3);
		} else if (Static652.anInt10664 == 10) {
			Static411.method6060(9, -3);
		} else {
			Static411.method6060(11, -3);
			if (Static4.aClass389_17.aClass50_2 != null) {
				local1006 = Static647.method8905(Static579.aClass381_241, Static4.aClass389_17.aClass393_2);
				Static4.aClass389_17.method9079(local1006);
			}
		}
		Static547.method7482();
		Static455.method6423();
		Static61.method1058();
		Static597.aBoolean675 = true;
		if (Static144.aBoolean214) {
			Static239.method3794("Took: " + (Static480.method6763() - Static67.aLong45) + "ms");
			Static144.aBoolean214 = false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[I[I)V")
	public static void method8881(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static447.anIntArray435 = null;
			Static107.aByteArrayArrayArray6 = null;
			Static511.anIntArray546 = null;
			return;
		}
		Static511.anIntArray546 = arg0;
		Static447.anIntArray435 = new int[arg0.length];
		Static107.aByteArrayArrayArray6 = new byte[arg0.length][][];
		for (@Pc(38) int local38 = 0; local38 < Static511.anIntArray546.length; local38++) {
			Static107.aByteArrayArrayArray6[local38] = new byte[arg1[local38]][];
		}
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	public static void method8882() {
		if (Static417.aByteArray79 != null) {
			Static116.method7453(Static623.anInt9970);
		} else if (Static564.anInt8912 == -1) {
			Static394.method5796(Static514.aString92, Static357.aString67, Static623.anInt9970);
		} else {
			Static369.method5505(Static623.anInt9970);
		}
	}
}
