import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "J")
	public static long aLong247;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
	public static int anInt8052;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
	public static final int[] anIntArray447 = new int[1];

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
	public static int anInt8060 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public static void method6846() {
		Static440.method6585(false);
		Static392.anInt6775 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static373.aByteArrayArray15.length; local14++) {
			if (Static640.anIntArray588[local14] != -1 && Static373.aByteArrayArray15[local14] == null) {
				Static373.aByteArrayArray15[local14] = Static570.aClass50_162.method916(0, Static640.anIntArray588[local14]);
				if (Static373.aByteArrayArray15[local14] == null) {
					Static392.anInt6775++;
					local12 = false;
				}
			}
			if (Static235.anIntArray236[local14] != -1 && Static155.aByteArrayArray8[local14] == null) {
				Static155.aByteArrayArray8[local14] = Static570.aClass50_162.method908(Static636.anIntArrayArray87[local14], 0, Static235.anIntArray236[local14]);
				if (Static155.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static392.anInt6775++;
				}
			}
			if (Static517.anIntArray477[local14] != -1 && Static620.aByteArrayArray22[local14] == null) {
				Static620.aByteArrayArray22[local14] = Static570.aClass50_162.method916(0, Static517.anIntArray477[local14]);
				if (Static620.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static392.anInt6775++;
				}
			}
			if (Static286.anIntArray263[local14] != -1 && Static336.aByteArrayArray11[local14] == null) {
				Static336.aByteArrayArray11[local14] = Static570.aClass50_162.method916(0, Static286.anIntArray263[local14]);
				if (Static336.aByteArrayArray11[local14] == null) {
					Static392.anInt6775++;
					local12 = false;
				}
			}
			if (Static655.anIntArray596 != null && Static490.aByteArrayArray19[local14] == null && Static655.anIntArray596[local14] != -1) {
				Static490.aByteArrayArray19[local14] = Static570.aClass50_162.method908(Static636.anIntArrayArray87[local14], 0, Static655.anIntArray596[local14]);
				if (Static490.aByteArrayArray19[local14] == null) {
					Static392.anInt6775++;
					local12 = false;
				}
			}
		}
		if (Static652.aClass79_3 == null) {
			if (Static415.aClass5_Sub2_Sub18_3 == null || !Static418.aClass50_119.method899(Static415.aClass5_Sub2_Sub18_3.aString75 + "_staticelements")) {
				Static652.aClass79_3 = new Class79(0);
			} else if (Static418.aClass50_119.method922(Static415.aClass5_Sub2_Sub18_3.aString75 + "_staticelements")) {
				Static652.aClass79_3 = Static546.method7534(Static581.aBoolean701, Static415.aClass5_Sub2_Sub18_3.aString75 + "_staticelements", Static418.aClass50_119);
			} else {
				Static392.anInt6775++;
				local12 = false;
			}
		}
		if (!local12) {
			Static260.anInt4118 = 1;
			return;
		}
		local12 = true;
		Static3.anInt23 = 0;
		@Pc(269) int local269;
		@Pc(280) int local280;
		for (@Pc(250) int local250 = 0; local250 < Static373.aByteArrayArray15.length; local250++) {
			@Pc(256) byte[] local256 = Static155.aByteArrayArray8[local250];
			if (local256 != null) {
				local269 = (Static249.anIntArray245[local250] >> 8) * 64 - Static454.anInt7910;
				local280 = (Static249.anIntArray245[local250] & 0xFF) * 64 - Static48.anInt750;
				if (Static566.anInt9293 != 0) {
					local280 = 10;
					local269 = 10;
				}
				local12 &= Static190.method2750(local269, local280, local256, Static64.anInt1015, Static124.anInt2150);
			}
			local256 = Static336.aByteArrayArray11[local250];
			if (local256 != null) {
				local269 = (Static249.anIntArray245[local250] >> 8) * 64 - Static454.anInt7910;
				local280 = (Static249.anIntArray245[local250] & 0xFF) * 64 - Static48.anInt750;
				if (Static566.anInt9293 != 0) {
					local280 = 10;
					local269 = 10;
				}
				local12 &= Static190.method2750(local269, local280, local256, Static64.anInt1015, Static124.anInt2150);
			}
		}
		if (!local12) {
			Static260.anInt4118 = 2;
			return;
		}
		if (Static260.anInt4118 != 0) {
			Static193.method2763(Static364.aClass198_8, Static5.aClass72_1, Static563.aClass143_13, true, Static49.aClass42_12.method730(Static259.anInt4113) + "<br>(100%)");
		}
		Static491.method7177();
		Static422.method6420();
		Static203.method2845();
		@Pc(384) boolean local384 = false;
		if (Static563.aClass143_13.method6208() && Static655.aClass5_Sub36_29.aClass2_Sub8_1.method3768() == 2) {
			for (local269 = 0; local269 < Static373.aByteArrayArray15.length; local269++) {
				if (Static336.aByteArrayArray11[local269] != null || Static620.aByteArrayArray22[local269] != null) {
					local384 = true;
					break;
				}
			}
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub24_1.method7984() == 1) {
			local269 = Static30.anIntArray32[Static515.anInt3720];
		} else {
			local269 = Static325.anIntArray316[Static515.anInt3720];
		}
		if (Static563.aClass143_13.method6240()) {
			local269++;
		}
		Static30.method396(Static563.aClass143_13, Static102.anInt1809, Static124.anInt2150, Static64.anInt1015, local269, local384, Static563.aClass143_13.method6237() > 0);
		Static354.method5245(Static90.anInt1507);
		if (Static90.anInt1507 == 0) {
			Static352.method5235((Class72) null);
		} else {
			Static352.method5235(Static383.aClass72_10);
		}
		for (local280 = 0; local280 < 4; local280++) {
			Static137.aClass234Array1[local280].method5453();
		}
		Static44.method611();
		Static99.method1647(false);
		Static237.method3381();
		Static493.aBoolean612 = false;
		Static366.aClass116_2 = null;
		Static491.method7177();
		System.gc();
		Static440.method6585(true);
		Static132.method2018();
		Static661.anInt10337 = Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269();
		Static599.aBoolean717 = Static126.anInt2180 >= 96;
		Static574.aBoolean682 = Static655.aClass5_Sub36_29.aClass2_Sub8_1.method3768() == 2;
		Static489.aBoolean608 = Static655.aClass5_Sub36_29.aClass2_Sub16_1.method6973() == 1;
		Static595.anInt9703 = Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 1 ? -1 : Static326.anInt5965;
		Static162.aBoolean577 = Static655.aClass5_Sub36_29.aClass2_Sub4_1.method2242() == 1;
		Static34.aBoolean19 = Static655.aClass5_Sub36_29.aClass2_Sub10_1.method3819() == 1;
		Static652.aClass34_Sub1_2 = new Class34_Sub1(4, Static124.anInt2150, Static64.anInt1015, false);
		if (Static566.anInt9293 == 0) {
			Static28.method378(Static373.aByteArrayArray15, Static652.aClass34_Sub1_2);
		} else {
			Static664.method8677(Static652.aClass34_Sub1_2, Static373.aByteArrayArray15);
		}
		Static570.method7812(Static124.anInt2150 >> 4, Static64.anInt1015 >> 4);
		Static194.method8417();
		if (local384) {
			Static249.method3525(true);
			Static330.aClass34_Sub1_1 = new Class34_Sub1(1, Static124.anInt2150, Static64.anInt1015, true);
			if (Static566.anInt9293 == 0) {
				Static28.method378(Static620.aByteArrayArray22, Static330.aClass34_Sub1_1);
				Static440.method6585(true);
			} else {
				Static664.method8677(Static330.aClass34_Sub1_1, Static620.aByteArrayArray22);
				Static440.method6585(true);
			}
			Static330.aClass34_Sub1_1.method528(Static652.aClass34_Sub1_2.anIntArrayArrayArray2[0]);
			Static330.aClass34_Sub1_1.method527((Class234[]) null, Static563.aClass143_13, (int[][][]) null);
			Static249.method3525(false);
		}
		Static652.aClass34_Sub1_2.method527(Static137.aClass234Array1, Static563.aClass143_13, local384 ? Static330.aClass34_Sub1_1.anIntArrayArrayArray2 : null);
		if (Static566.anInt9293 == 0) {
			Static440.method6585(true);
			Static44.method616(Static652.aClass34_Sub1_2, Static155.aByteArrayArray8);
			if (Static490.aByteArrayArray19 != null) {
				Static6.method143();
			}
		} else {
			Static440.method6585(true);
			Static130.method2009(Static652.aClass34_Sub1_2, Static155.aByteArrayArray8);
		}
		Static422.method6420();
		if (Static126.anInt2180 < 96) {
			Static379.method5102();
		}
		Static440.method6585(true);
		Static652.aClass34_Sub1_2.method534((Class88) null, local384 ? Static176.aClass88Array1[0] : null, Static563.aClass143_13);
		Static652.aClass34_Sub1_2.method539(false, Static563.aClass143_13);
		Static440.method6585(true);
		if (local384) {
			Static249.method3525(true);
			Static440.method6585(true);
			if (Static566.anInt9293 == 0) {
				Static44.method616(Static330.aClass34_Sub1_1, Static336.aByteArrayArray11);
			} else {
				Static130.method2009(Static330.aClass34_Sub1_1, Static336.aByteArrayArray11);
			}
			Static422.method6420();
			Static440.method6585(true);
			Static330.aClass34_Sub1_1.method534(Static230.aClass88Array2[0], (Class88) null, Static563.aClass143_13);
			Static330.aClass34_Sub1_1.method539(true, Static563.aClass143_13);
			Static440.method6585(true);
			Static249.method3525(false);
		}
		Static263.method3707();
		@Pc(763) int local763 = Static652.aClass34_Sub1_2.anInt577;
		if (Static458.anInt7955 < local763) {
			local763 = Static458.anInt7955;
		}
		if (Static458.anInt7955 - 1 > local763) {
			local763 = Static458.anInt7955 - 1;
		}
		if (Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 0) {
			Static475.method7018(local763);
		} else {
			Static475.method7018(0);
		}
		@Pc(794) int local794;
		@Pc(798) int local798;
		for (@Pc(790) int local790 = 0; local790 < 4; local790++) {
			for (local794 = 0; local794 < Static124.anInt2150; local794++) {
				for (local798 = 0; local798 < Static64.anInt1015; local798++) {
					Static57.method857(local794, local798, local790);
				}
			}
		}
		Static494.method7191();
		Static491.method7177();
		Static383.method5625();
		Static422.method6420();
		Static636.method8436();
		@Pc(851) Class5_Sub16 local851;
		if (Static634.aFrame5 != null && Static537.aClass240_34 != null && Static539.anInt8853 == 11) {
			local851 = Static455.method6717(Static331.aClass187_60, Static16.aClass332_8);
			local851.aClass5_Sub15_Sub2_1.method3679(1057001181);
			Static479.method7038(local851);
		}
		if (Static566.anInt9293 == 0) {
			local794 = (Static216.anInt3459 - (Static124.anInt2150 >> 4)) / 8;
			local798 = (Static216.anInt3459 + (Static124.anInt2150 >> 4)) / 8;
			@Pc(891) int local891 = (Static544.anInt8919 - (Static64.anInt1015 >> 4)) / 8;
			@Pc(899) int local899 = (Static544.anInt8919 + (Static64.anInt1015 >> 4)) / 8;
			for (@Pc(903) int local903 = local794 - 1; local903 <= local798 + 1; local903++) {
				for (@Pc(909) int local909 = local891 - 1; local909 <= local899 + 1; local909++) {
					if (local794 > local903 || local798 < local903 || local909 < local891 || local909 > local899) {
						Static570.aClass50_162.method904("m" + local903 + "_" + local909);
						Static570.aClass50_162.method904("l" + local903 + "_" + local909);
					}
				}
			}
		}
		if (Static539.anInt8853 == 4) {
			Static42.method560(3);
		} else if (Static539.anInt8853 == 8) {
			Static42.method560(7);
		} else {
			Static42.method560(10);
			if (Static537.aClass240_34 != null) {
				local851 = Static455.method6717(Static216.aClass187_46, Static16.aClass332_8);
				Static479.method7038(local851);
			}
		}
		Static430.method7437();
		Static491.method7177();
		Static661.method8631();
		Static677.aBoolean794 = true;
		if (Static360.aBoolean457) {
			Static611.method8213("Took: " + (Static124.method1947() - Static307.aLong157) + "ms");
			Static360.aBoolean457 = false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)I")
	public static int method6848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static498.anIntArrayArray67 == null ? 0 : Static498.anIntArrayArray67[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZ)V")
	public static void method6850(@OriginalArg(0) int arg0) {
		if (!Static175.method2576(arg0)) {
			return;
		}
		@Pc(12) Class394[] local12 = Static227.aClass394ArrayArray2[arg0];
		for (@Pc(19) int local19 = 0; local19 < local12.length; local19++) {
			@Pc(24) Class394 local24 = local12[local19];
			if (local24 != null) {
				local24.anInt10535 = 1;
				local24.anInt10534 = 0;
				local24.anInt10447 = 0;
			}
		}
	}
}
