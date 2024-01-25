import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	public static int anInt10552;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[I")
	public static final int[] anIntArray680 = new int[8];

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	public static int anInt10549 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IJ)V")
	public static void method8792(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static213.anInt4833 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
		@Pc(15) int local15 = Static568.anInt10190 + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
		if (Static21.anInt398 - local10 < -2000 || Static21.anInt398 - local10 > 2000 || Static468.anInt8821 - local15 < -2000 || Static468.anInt8821 - local15 > 2000) {
			Static468.anInt8821 = local15;
			Static21.anInt398 = local10;
		}
		@Pc(57) int local57;
		@Pc(65) int local65;
		if (local10 != Static21.anInt398) {
			local57 = local10 - Static21.anInt398;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local57 > local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local57 < local65) {
				local65 = local57;
			}
			Static21.anInt398 += local65;
		}
		Static72.aFloat68 += Static485.aFloat196 * (float) arg0 / 6.0F;
		if (Static468.anInt8821 != local15) {
			local57 = local15 - Static468.anInt8821;
			local65 = (int) ((long) local57 * arg0 / 320L);
			if (local57 > 0) {
				if (local65 == 0) {
					local65 = 1;
				} else if (local57 < local65) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = -1;
			} else if (local57 > local65) {
				local65 = local57;
			}
			Static468.anInt8821 += local65;
		}
		Static305.aFloat154 += Static351.aFloat157 * (float) arg0 / 6.0F;
		Static182.method3782();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZIII)V")
	public static void method8794(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) long local19 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		@Pc(25) Class2_Sub24 local25 = (Class2_Sub24) Static538.aClass99_84.method3056(local19);
		if (local25 == null) {
			local25 = new Class2_Sub24();
			Static538.aClass99_84.method3059(local19, local25);
		}
		if (local25.anIntArray263.length <= arg2) {
			@Pc(46) int[] local46 = new int[arg2 + 1];
			@Pc(51) int[] local51 = new int[arg2 + 1];
			for (@Pc(53) int local53 = 0; local53 < local25.anIntArray263.length; local53++) {
				local46[local53] = local25.anIntArray263[local53];
				local51[local53] = local25.anIntArray264[local53];
			}
			for (@Pc(83) int local83 = local25.anIntArray263.length; local83 < arg2; local83++) {
				local46[local83] = -1;
				local51[local83] = 0;
			}
			local25.anIntArray263 = local46;
			local25.anIntArray264 = local51;
		}
		local25.anIntArray263[arg2] = arg4;
		local25.anIntArray264[arg2] = arg3;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIBLclient!ha;)Lclient!ka;")
	public static Class166 method8795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class20 arg5) {
		@Pc(11) long local11 = (long) arg4;
		@Pc(17) Class166 local17 = (Class166) Static205.aClass169_28.method5002(local11);
		if (local17 == null) {
			@Pc(27) Class32 local27 = Static630.method9136(Static363.aClass157_188, arg4);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt1677 < 13) {
				local27.method1592();
			}
			local17 = arg5.method7228(local27, 2055, Static432.anInt8068, 64, 768);
			Static205.aClass169_28.method5001(local17, local11);
		}
		local17 = local17.method6684((byte) 2, 2055, true);
		if (arg3 != 0) {
			local17.a(arg3);
		}
		if (arg1 != 0) {
			local17.FA(arg1);
		}
		if (arg2 != 0) {
			local17.VA(arg2);
		}
		if (arg0 != 0) {
			local17.H(0, arg0, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method8796() {
		Static612.method8946(false);
		Static60.anInt2005 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static123.aByteArrayArray10.length; local14++) {
			if (Static9.anIntArray11[local14] != -1 && Static123.aByteArrayArray10[local14] == null) {
				Static123.aByteArrayArray10[local14] = Static316.aClass157_158.method4564(Static9.anIntArray11[local14], 0);
				if (Static123.aByteArrayArray10[local14] == null) {
					local12 = false;
					Static60.anInt2005++;
				}
			}
			if (Static300.anIntArray106[local14] != -1 && Static557.aByteArrayArray24[local14] == null) {
				Static557.aByteArrayArray24[local14] = Static316.aClass157_158.method4547(Static300.anIntArray106[local14], 0, Static296.anIntArrayArray31[local14]);
				if (Static557.aByteArrayArray24[local14] == null) {
					Static60.anInt2005++;
					local12 = false;
				}
			}
			if (Static619.anIntArray701[local14] != -1 && Static377.aByteArrayArray17[local14] == null) {
				Static377.aByteArrayArray17[local14] = Static316.aClass157_158.method4564(Static619.anIntArray701[local14], 0);
				if (Static377.aByteArrayArray17[local14] == null) {
					Static60.anInt2005++;
					local12 = false;
				}
			}
			if (Static475.anIntArray654[local14] != -1 && Static268.aByteArrayArray14[local14] == null) {
				Static268.aByteArrayArray14[local14] = Static316.aClass157_158.method4564(Static475.anIntArray654[local14], 0);
				if (Static268.aByteArrayArray14[local14] == null) {
					local12 = false;
					Static60.anInt2005++;
				}
			}
			if (Static8.anIntArray10 != null && Static85.aByteArrayArray5[local14] == null && Static8.anIntArray10[local14] != -1) {
				Static85.aByteArrayArray5[local14] = Static316.aClass157_158.method4547(Static8.anIntArray10[local14], 0, Static296.anIntArrayArray31[local14]);
				if (Static85.aByteArrayArray5[local14] == null) {
					local12 = false;
					Static60.anInt2005++;
				}
			}
		}
		if (Static563.aClass333_3 == null) {
			if (Static350.aClass2_Sub6_Sub4_3 == null || !Static474.aClass157_237.method4554(Static350.aClass2_Sub6_Sub4_3.aString22 + "_staticelements")) {
				Static563.aClass333_3 = new Class333(0);
			} else if (Static474.aClass157_237.method4567(Static350.aClass2_Sub6_Sub4_3.aString22 + "_staticelements")) {
				Static563.aClass333_3 = Static641.method9217(Static474.aClass157_237, Static350.aClass2_Sub6_Sub4_3.aString22 + "_staticelements", Static378.aBoolean238);
			} else {
				local12 = false;
				Static60.anInt2005++;
			}
		}
		if (!local12) {
			Static234.anInt5126 = 1;
			return;
		}
		local12 = true;
		Static405.anInt7686 = 0;
		@Pc(268) int local268;
		@Pc(278) int local278;
		for (@Pc(250) int local250 = 0; local250 < Static123.aByteArrayArray10.length; local250++) {
			@Pc(256) byte[] local256 = Static557.aByteArrayArray24[local250];
			if (local256 != null) {
				local268 = (Static431.anIntArray533[local250] >> 8) * 64 - Static84.anInt2565;
				local278 = (Static431.anIntArray533[local250] & 0xFF) * 64 - Static32.anInt723;
				if (Static69.anInt2216 != 0) {
					local278 = 10;
					local268 = 10;
				}
				local12 &= Static562.method8434(Static47.anInt1794, local268, Static209.anInt4742, local278, local256);
			}
			local256 = Static268.aByteArrayArray14[local250];
			if (local256 != null) {
				local268 = (Static431.anIntArray533[local250] >> 8) * 64 - Static84.anInt2565;
				local278 = (Static431.anIntArray533[local250] & 0xFF) * 64 - Static32.anInt723;
				if (Static69.anInt2216 != 0) {
					local278 = 10;
					local268 = 10;
				}
				local12 &= Static562.method8434(Static47.anInt1794, local268, Static209.anInt4742, local278, local256);
			}
		}
		if (!local12) {
			Static234.anInt5126 = 2;
			return;
		}
		if (Static234.anInt5126 != 0) {
			Static151.method3426(true, Static300.aClass68_4, Static58.aClass239_18, Static588.aClass351_14.method8691(Static476.anInt8915) + "<br>(100%)", Static186.aClass20_4);
		}
		Static293.method5263();
		Static261.method4784();
		Static26.method656();
		@Pc(382) boolean local382 = false;
		if (Static186.aClass20_4.method7242() && Static74.aClass2_Sub13_5.aClass14_Sub25_1.method8177() == 2) {
			for (local268 = 0; local268 < Static123.aByteArrayArray10.length; local268++) {
				if (Static268.aByteArrayArray14[local268] != null || Static377.aByteArrayArray17[local268] != null) {
					local382 = true;
					break;
				}
			}
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub23_1.method7808() == 1) {
			local268 = Static585.anIntArray666[Static245.anInt5279];
		} else {
			local268 = Static194.anIntArray225[Static245.anInt5279];
		}
		if (Static186.aClass20_4.method7273()) {
			local268++;
		}
		Static308.method5451(Static186.aClass20_4, Static506.anInt9329, Static47.anInt1794, Static209.anInt4742, local268, local382, Static186.aClass20_4.method7307() > 0);
		Static474.method7454(Static275.anInt5875);
		if (Static275.anInt5875 == 0) {
			Static57.method1823(null);
		} else {
			Static57.method1823(Static529.aClass68_10);
		}
		for (local278 = 0; local278 < 4; local278++) {
			Static55.aClass104Array3[local278].method3255();
		}
		Static255.method4693();
		Static200.method4041(false);
		Static626.method1570();
		Static566.aClass376_1 = null;
		Static448.aBoolean598 = false;
		Static293.method5263();
		System.gc();
		Static612.method8946(true);
		Static234.method4438();
		Static615.anInt10769 = Static74.aClass2_Sub13_5.aClass14_Sub15_1.method5864();
		Static622.aBoolean738 = Static514.anInt9425 >= 96;
		Static161.aBoolean556 = Static74.aClass2_Sub13_5.aClass14_Sub25_1.method8177() == 2;
		Static456.aBoolean482 = Static74.aClass2_Sub13_5.aClass14_Sub8_1.method3544() == 1;
		Static546.anInt9790 = Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 1 ? -1 : Static425.anInt8001;
		Static197.aBoolean334 = Static74.aClass2_Sub13_5.aClass14_Sub17_1.method5998() == 1;
		Static247.aBoolean534 = Static74.aClass2_Sub13_5.aClass14_Sub4_1.method2491() == 1;
		Static113.aClass322_Sub1_1 = new Class322_Sub1(4, Static47.anInt1794, Static209.anInt4742, false);
		if (Static69.anInt2216 == 0) {
			Static40.method1356(Static113.aClass322_Sub1_1, Static123.aByteArrayArray10);
		} else {
			Static244.method4517(Static113.aClass322_Sub1_1, Static123.aByteArrayArray10);
		}
		Static354.method6012(Static47.anInt1794 >> 4, Static209.anInt4742 >> 4);
		Static328.method5639();
		if (local382) {
			Static533.method8023(true);
			Static429.aClass322_Sub1_2 = new Class322_Sub1(1, Static47.anInt1794, Static209.anInt4742, true);
			if (Static69.anInt2216 == 0) {
				Static40.method1356(Static429.aClass322_Sub1_2, Static377.aByteArrayArray17);
				Static612.method8946(true);
			} else {
				Static244.method4517(Static429.aClass322_Sub1_2, Static377.aByteArrayArray17);
				Static612.method8946(true);
			}
			Static429.aClass322_Sub1_2.method8696(Static113.aClass322_Sub1_1.anIntArrayArrayArray19[0]);
			Static429.aClass322_Sub1_2.method8702(Static186.aClass20_4, null, null);
			Static533.method8023(false);
		}
		Static113.aClass322_Sub1_1.method8702(Static186.aClass20_4, local382 ? Static429.aClass322_Sub1_2.anIntArrayArrayArray19 : null, Static55.aClass104Array3);
		if (Static69.anInt2216 == 0) {
			Static612.method8946(true);
			Static370.method6244(Static557.aByteArrayArray24, Static113.aClass322_Sub1_1);
			if (Static85.aByteArrayArray5 != null) {
				Static326.method5608();
			}
		} else {
			Static612.method8946(true);
			Static229.method4397(Static557.aByteArrayArray24, Static113.aClass322_Sub1_1);
		}
		Static261.method4784();
		if (Static514.anInt9425 < 96) {
			Static307.method5437();
		}
		Static612.method8946(true);
		Static113.aClass322_Sub1_1.method8697(null, local382 ? Static103.aClass65Array3[0] : null, Static186.aClass20_4);
		Static113.aClass322_Sub1_1.method8714(false, Static186.aClass20_4);
		Static612.method8946(true);
		if (local382) {
			Static533.method8023(true);
			Static612.method8946(true);
			if (Static69.anInt2216 == 0) {
				Static370.method6244(Static268.aByteArrayArray14, Static429.aClass322_Sub1_2);
			} else {
				Static229.method4397(Static268.aByteArrayArray14, Static429.aClass322_Sub1_2);
			}
			Static261.method4784();
			Static612.method8946(true);
			Static429.aClass322_Sub1_2.method8697(Static40.aClass65Array2[0], null, Static186.aClass20_4);
			Static429.aClass322_Sub1_2.method8714(true, Static186.aClass20_4);
			Static612.method8946(true);
			Static533.method8023(false);
		}
		Static85.method2423();
		@Pc(771) int local771 = Static113.aClass322_Sub1_1.anInt10435;
		if (Static12.anInt172 < local771) {
			local771 = Static12.anInt172;
		}
		if (Static12.anInt172 - 1 > local771) {
			local771 = Static12.anInt172 - 1;
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 0) {
			Static315.method5493(local771);
		} else {
			Static315.method5493(0);
		}
		@Pc(813) int local813;
		@Pc(817) int local817;
		for (@Pc(809) int local809 = 0; local809 < 4; local809++) {
			for (local813 = 0; local813 < Static47.anInt1794; local813++) {
				for (local817 = 0; local817 < Static209.anInt4742; local817++) {
					Static483.method7529(local817, local813, local809);
				}
			}
		}
		Static297.method5315();
		Static293.method5263();
		Static152.method3429();
		Static261.method4784();
		Static21.method593();
		@Pc(866) Class2_Sub52 local866;
		if (Static255.aFrame2 != null && Static272.aClass116_1 != null && Static529.anInt9623 == 11) {
			local866 = Static130.method3019(Static93.aClass94_23, Static361.aClass183_1);
			local866.aClass2_Sub11_Sub2_7.method8387(1057001181);
			Static96.method2563(local866);
		}
		if (Static69.anInt2216 == 0) {
			local813 = (Static199.anInt8568 - (Static47.anInt1794 >> 4)) / 8;
			local817 = (Static199.anInt8568 + (Static47.anInt1794 >> 4)) / 8;
			@Pc(906) int local906 = (Static93.anInt2688 - (Static209.anInt4742 >> 4)) / 8;
			@Pc(914) int local914 = ((Static209.anInt4742 >> 4) + Static93.anInt2688) / 8;
			for (@Pc(918) int local918 = local813 - 1; local918 <= local817 + 1; local918++) {
				for (@Pc(924) int local924 = local906 - 1; local924 <= local914 + 1; local924++) {
					if (local813 > local918 || local817 < local918 || local924 < local906 || local914 < local924) {
						Static316.aClass157_158.method4563("m" + local918 + "_" + local924);
						Static316.aClass157_158.method4563("l" + local918 + "_" + local924);
					}
				}
			}
		}
		if (Static529.anInt9623 == 4) {
			Static66.method8375(3);
		} else if (Static529.anInt9623 == 8) {
			Static66.method8375(7);
		} else {
			Static66.method8375(10);
			if (Static272.aClass116_1 != null) {
				local866 = Static130.method3019(Static115.aClass94_25, Static361.aClass183_1);
				Static96.method2563(local866);
			}
		}
		Static2.method3963();
		Static293.method5263();
		Static335.method5742();
		Static240.aBoolean380 = true;
		if (Static628.aBoolean745) {
			Static300.method2224("Took: " + (Static277.method5091() - Static32.aLong22) + "ms");
			Static628.aBoolean745 = false;
		}
	}
}
