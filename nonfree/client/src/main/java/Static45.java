import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub9 aClass1_Sub2_Sub9_1;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "Z")
	public static boolean aBoolean75 = true;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "I")
	public static int anInt1287 = 0;

	@OriginalMember(owner = "client!df", name = "Ab", descriptor = "I")
	public static int anInt1322 = 0;

	@OriginalMember(owner = "client!df", name = "Mb", descriptor = "[I")
	public static int[] anIntArray136 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)I")
	public static int method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static126.aByteArrayArrayArray24[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static126.aByteArrayArrayArray24[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	public static void method990(@OriginalArg(0) boolean arg0) {
		Static219.aBoolean268 = arg0;
		@Pc(130) boolean local130;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(48) int local48;
		@Pc(179) int local179;
		@Pc(184) int local184;
		@Pc(197) int local197;
		if (!Static219.aBoolean268) {
			local17 = Static222.aClass1_Sub16_Sub1_3.method2663();
			local21 = Static222.aClass1_Sub16_Sub1_3.method2650();
			local26 = (Static5.anInt141 - Static222.aClass1_Sub16_Sub1_3.anInt3328) / 16;
			Static133.anIntArrayArray18 = new int[local26][4];
			for (local33 = 0; local33 < local26; local33++) {
				for (local38 = 0; local38 < 4; local38++) {
					Static133.anIntArrayArray18[local33][local38] = Static222.aClass1_Sub16_Sub1_3.method2616();
				}
			}
			local33 = Static222.aClass1_Sub16_Sub1_3.method2652();
			local38 = Static222.aClass1_Sub16_Sub1_3.method2650();
			local130 = Static258.method4394(Static222.aClass1_Sub16_Sub1_3.method2655());
			local48 = Static222.aClass1_Sub16_Sub1_3.method2613();
			Static99.anIntArray223 = new int[local26];
			Static209.aByteArrayArray104 = new byte[local26][];
			Static287.anIntArray603 = new int[local26];
			Static231.aByteArrayArray125 = new byte[local26][];
			Static230.anIntArray528 = new int[local26];
			Static105.aByteArrayArray138 = new byte[local26][];
			Static138.aByteArrayArray71 = new byte[local26][];
			Static160.anIntArray336 = new int[local26];
			Static126.aByteArrayArray64 = null;
			Static210.anIntArray473 = null;
			@Pc(447) boolean local447 = false;
			if ((local33 / 8 == 48 || local33 / 8 == 49) && local48 / 8 == 48) {
				local447 = true;
			}
			Static8.anIntArray449 = new int[local26];
			local26 = 0;
			if (local33 / 8 == 48 && local48 / 8 == 148) {
				local447 = true;
			}
			for (local179 = (local33 - 6) / 8; local179 <= (local33 + 6) / 8; local179++) {
				for (local184 = (local48 - 6) / 8; local184 <= (local48 + 6) / 8; local184++) {
					local197 = local184 + (local179 << 8);
					if (local447 && (local184 == 49 || local184 == 149 || local184 == 147 || local179 == 50 || local179 == 49 && local184 == 47)) {
						Static8.anIntArray449[local26] = local197;
						Static99.anIntArray223[local26] = -1;
						Static160.anIntArray336[local26] = -1;
						Static230.anIntArray528[local26] = -1;
						Static287.anIntArray603[local26] = -1;
					} else {
						Static8.anIntArray449[local26] = local197;
						Static99.anIntArray223[local26] = Static78.aClass83_47.method2322("m" + local179 + "_" + local184);
						Static160.anIntArray336[local26] = Static78.aClass83_47.method2322("l" + local179 + "_" + local184);
						Static230.anIntArray528[local26] = Static78.aClass83_47.method2322("um" + local179 + "_" + local184);
						Static287.anIntArray603[local26] = Static78.aClass83_47.method2322("ul" + local179 + "_" + local184);
					}
					local26++;
				}
			}
			Static32.method666(local130, false, local38, local21, local33, local17, local48);
			return;
		}
		local17 = Static222.aClass1_Sub16_Sub1_3.method2663();
		local21 = Static222.aClass1_Sub16_Sub1_3.method2652();
		Static222.aClass1_Sub16_Sub1_3.method2671();
		for (local26 = 0; local26 < 4; local26++) {
			for (local33 = 0; local33 < 13; local33++) {
				for (local38 = 0; local38 < 13; local38++) {
					local48 = Static222.aClass1_Sub16_Sub1_3.method2670(1);
					if (local48 == 1) {
						Static130.anIntArrayArrayArray13[local26][local33][local38] = Static222.aClass1_Sub16_Sub1_3.method2670(26);
					} else {
						Static130.anIntArrayArrayArray13[local26][local33][local38] = -1;
					}
				}
			}
		}
		Static222.aClass1_Sub16_Sub1_3.method2666();
		local26 = (Static5.anInt141 - Static222.aClass1_Sub16_Sub1_3.anInt3328) / 16;
		Static133.anIntArrayArray18 = new int[local26][4];
		for (local33 = 0; local33 < local26; local33++) {
			for (local38 = 0; local38 < 4; local38++) {
				Static133.anIntArrayArray18[local33][local38] = Static222.aClass1_Sub16_Sub1_3.method2646();
			}
		}
		local33 = Static222.aClass1_Sub16_Sub1_3.method2640();
		local130 = Static258.method4394(Static222.aClass1_Sub16_Sub1_3.method2663());
		local38 = Static222.aClass1_Sub16_Sub1_3.method2652();
		local48 = Static222.aClass1_Sub16_Sub1_3.method2640();
		Static209.aByteArrayArray104 = new byte[local26][];
		Static230.anIntArray528 = new int[local26];
		Static287.anIntArray603 = new int[local26];
		Static231.aByteArrayArray125 = new byte[local26][];
		Static210.anIntArray473 = null;
		Static138.aByteArrayArray71 = new byte[local26][];
		Static160.anIntArray336 = new int[local26];
		Static8.anIntArray449 = new int[local26];
		Static99.anIntArray223 = new int[local26];
		Static105.aByteArrayArray138 = new byte[local26][];
		Static126.aByteArrayArray64 = null;
		local26 = 0;
		for (@Pc(174) int local174 = 0; local174 < 4; local174++) {
			for (local179 = 0; local179 < 13; local179++) {
				for (local184 = 0; local184 < 13; local184++) {
					local197 = Static130.anIntArrayArrayArray13[local174][local179][local184];
					if (local197 != -1) {
						@Pc(208) int local208 = local197 >> 14 & 0x3FF;
						@Pc(214) int local214 = local197 >> 3 & 0x7FF;
						@Pc(225) int local225 = (local208 / 8 << 8) + (local214 / 8);
						@Pc(227) int local227;
						for (local227 = 0; local227 < local26; local227++) {
							if (local225 == Static8.anIntArray449[local227]) {
								local225 = -1;
								break;
							}
						}
						if (local225 != -1) {
							local227 = local225 >> 8 & 0xFF;
							Static8.anIntArray449[local26] = local225;
							@Pc(260) int local260 = local225 & 0xFF;
							Static99.anIntArray223[local26] = Static78.aClass83_47.method2322("m" + local227 + "_" + local260);
							Static160.anIntArray336[local26] = Static78.aClass83_47.method2322("l" + local227 + "_" + local260);
							Static230.anIntArray528[local26] = Static78.aClass83_47.method2322("um" + local227 + "_" + local260);
							Static287.anIntArray603[local26] = Static78.aClass83_47.method2322("ul" + local227 + "_" + local260);
							local26++;
						}
					}
				}
			}
		}
		Static32.method666(local130, false, local38, local33, local48, local17, local21);
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public static void method1005() {
		Static62.anInt1585 = 0;
		Static165.aLong133 = 0L;
		Static173.aClass115_1.anInt4252 = 0;
		Static76.aBoolean290 = true;
		Static73.aBoolean98 = true;
		Static197.method3555();
		Static270.anInt5842 = 0;
		Static74.anInt1835 = -1;
		Static179.anInt4031 = 0;
		Static80.anInt1911 = -1;
		Static254.anInt5398 = -1;
		Static81.aClass1_Sub16_Sub1_1.anInt3328 = 0;
		Static199.anInt4491 = -1;
		Static59.anInt1532 = 0;
		Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
		@Pc(3532) int local3532;
		for (local3532 = 0; local3532 < Static129.aClass81Array1.length; local3532++) {
			Static129.aClass81Array1[local3532] = null;
		}
		Static111.anInt2398 = 0;
		Static218.aBoolean267 = false;
		Static79.method1419(0);
		for (local3532 = 0; local3532 < 100; local3532++) {
			Static246.aStringArray30[local3532] = null;
		}
		Static52.anInt1401 = 0;
		Static125.aFloat97 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static266.anInt5789 = 0;
		Static52.anInt1393 = (int) (Math.random() * 100.0D) - 50;
		Static16.anInt453 = (int) (Math.random() * 30.0D) - 20;
		Static59.anInt1529 = (int) (Math.random() * 120.0D) - 60;
		Static272.anInt5854 = 0;
		Static16.aBoolean22 = false;
		Static140.anInt3223 = 0;
		Static33.anInt870 = -1;
		Static147.anInt3493 = 0;
		Static71.anInt1777 = 0;
		Static4.anInt139 = 0;
		Static23.anInt483 = (int) (Math.random() * 110.0D) - 55;
		Static111.anInt2392 = 0;
		Static136.anInt3074 = (int) (Math.random() * 80.0D) - 40;
		for (local3532 = 0; local3532 < 2048; local3532++) {
			Static271.aClass25_Sub1_Sub1Array1[local3532] = null;
			Static177.aClass1_Sub16Array1[local3532] = null;
		}
		for (local3532 = 0; local3532 < 32768; local3532++) {
			Static27.aClass25_Sub1_Sub2Array1[local3532] = null;
		}
		Static239.aClass25_Sub1_Sub1_2 = Static271.aClass25_Sub1_Sub1Array1[2047] = new Class25_Sub1_Sub1();
		Static293.aClass131_28.method3795();
		Static244.aClass131_24.method3795();
		if (Static240.aClass131ArrayArrayArray1 != null) {
			for (local3532 = 0; local3532 < 4; local3532++) {
				for (@Pc(3688) int local3688 = 0; local3688 < 104; local3688++) {
					for (@Pc(3693) int local3693 = 0; local3693 < 104; local3693++) {
						Static240.aClass131ArrayArrayArray1[local3532][local3688][local3693] = null;
					}
				}
			}
		}
		Static236.aClass131_17 = new Class131();
		Static218.anInt4881 = 0;
		Static180.anInt4068 = 0;
		Static113.method1834();
		Static191.method3401();
		Static257.anInt5593 = 0;
		Static295.anInt3204 = 0;
		Static254.anInt5407 = 0;
		Static243.anInt5324 = 0;
		Static20.anInt5569 = 0;
		Static251.anInt5457 = 0;
		Static289.anInt6096 = 0;
		Static180.anInt4076 = 0;
		Static158.anInt3653 = 0;
		Static178.anInt4008 = 0;
		for (local3532 = 0; local3532 < Static152.anIntArray325.length; local3532++) {
			Static152.anIntArray325[local3532] = -1;
		}
		if (Static194.anInt4389 != -1) {
			Static206.method3662(Static194.anInt4389);
		}
		for (@Pc(3774) Class1_Sub12 local3774 = (Class1_Sub12) Static147.aClass117_12.method3441(); local3774 != null; local3774 = (Class1_Sub12) Static147.aClass117_12.method3444()) {
			Static271.method4538(local3774, true);
		}
		Static194.anInt4389 = -1;
		Static147.aClass117_12 = new Class117(8);
		Static197.method3554();
		Static218.aBoolean267 = false;
		Static2.aClass116_16 = null;
		Static111.anInt2398 = 0;
		Static22.aClass147_1.method4167(-1, null, new int[] { 0, 0, 0, 0, 0 }, -1, false);
		for (local3532 = 0; local3532 < 8; local3532++) {
			Static122.aStringArray13[local3532] = null;
			Static148.aBooleanArray15[local3532] = false;
			Static204.anIntArray465[local3532] = -1;
		}
		Static216.method3790();
		Static202.aBoolean241 = true;
		for (local3532 = 0; local3532 < 100; local3532++) {
			Static165.aBooleanArray16[local3532] = true;
		}
		Static246.anInt5378 = 0;
		Static43.aString43 = null;
		Static79.aClass1_Sub29Array1 = null;
		for (local3532 = 0; local3532 < 6; local3532++) {
			Static136.aClass15Array1[local3532] = new Class15();
		}
		for (local3532 = 0; local3532 < 25; local3532++) {
			Static291.anIntArray607[local3532] = 0;
			Static240.anIntArray544[local3532] = 0;
			Static25.anIntArray53[local3532] = 0;
		}
		if (Static296.aBoolean335) {
			Static94.method4775();
		}
		Static173.anInt3933 = 0;
		Static37.aBoolean69 = true;
		Static172.aBoolean201 = false;
		Static2.aString184 = Static133.aString82;
		Static272.aShortArray89 = Static92.aShortArray44 = Static56.aShortArray40 = Static247.aShortArray85 = new short[256];
		Static244.method4192();
		Static236.aBoolean285 = false;
		Static156.method2883();
	}
}
