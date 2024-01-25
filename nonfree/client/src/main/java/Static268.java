import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public static int anInt4680;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!ui;")
	public static Class230 aClass230_64;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[2048];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method4133() {
		Static41.method630(false);
		Static330.anInt5518 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static306.aByteArrayArray18.length; local14++) {
			if (Static114.anIntArray260[local14] != -1 && Static306.aByteArrayArray18[local14] == null) {
				Static306.aByteArrayArray18[local14] = Static25.aClass230_5.method4985(0, Static114.anIntArray260[local14]);
				if (Static306.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static330.anInt5518++;
				}
			}
			if (Static313.anIntArray627[local14] != -1 && Static166.aByteArrayArray13[local14] == null) {
				Static166.aByteArrayArray13[local14] = Static25.aClass230_5.method4978(Static313.anIntArray627[local14], Static50.anIntArrayArray14[local14], 0);
				if (Static166.aByteArrayArray13[local14] == null) {
					Static330.anInt5518++;
					local12 = false;
				}
			}
			if (Static68.anIntArray183[local14] != -1 && Static393.aByteArrayArray23[local14] == null) {
				Static393.aByteArrayArray23[local14] = Static25.aClass230_5.method4985(0, Static68.anIntArray183[local14]);
				if (Static393.aByteArrayArray23[local14] == null) {
					Static330.anInt5518++;
					local12 = false;
				}
			}
			if (Static320.anIntArray634[local14] != -1 && Static46.aByteArrayArray2[local14] == null) {
				Static46.aByteArrayArray2[local14] = Static25.aClass230_5.method4985(0, Static320.anIntArray634[local14]);
				if (Static46.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static330.anInt5518++;
				}
			}
			if (Static180.anIntArray378 != null && Static50.aByteArrayArray3[local14] == null && Static180.anIntArray378[local14] != -1) {
				Static50.aByteArrayArray3[local14] = Static25.aClass230_5.method4978(Static180.anIntArray378[local14], Static50.anIntArrayArray14[local14], 0);
				if (Static50.aByteArrayArray3[local14] == null) {
					Static330.anInt5518++;
					local12 = false;
				}
			}
		}
		if (Static208.aClass93_3 == null) {
			if (Static286.aClass1_Sub6_Sub4_3 == null || !Static314.aClass230_70.method4953(Static286.aClass1_Sub6_Sub4_3.aString15 + "_staticelements")) {
				Static208.aClass93_3 = new Class93(0);
			} else if (Static314.aClass230_70.method4958(Static286.aClass1_Sub6_Sub4_3.aString15 + "_staticelements")) {
				Static208.aClass93_3 = Static314.method4648(Static286.aClass1_Sub6_Sub4_3.aString15 + "_staticelements", Static104.aBoolean157, Static314.aClass230_70);
			} else {
				local12 = false;
				Static330.anInt5518++;
			}
		}
		if (!local12) {
			Static334.anInt5568 = 1;
			return;
		}
		Static164.anInt2966 = 0;
		local12 = true;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static306.aByteArrayArray18.length; local251++) {
			@Pc(257) byte[] local257 = Static166.aByteArrayArray13[local251];
			if (local257 != null) {
				local270 = (Static223.anIntArray480[local251] >> 8) * 64 - Static256.anInt4410;
				local281 = (Static223.anIntArray480[local251] & 0xFF) * 64 - Static293.anInt5053;
				if (Static53.aBoolean97) {
					local270 = 10;
					local281 = 10;
				}
				local12 &= Static372.method1265(local270, local281, local257, Static92.anInt1675, Static262.anInt6340);
			}
			local257 = Static46.aByteArrayArray2[local251];
			if (local257 != null) {
				local270 = (Static223.anIntArray480[local251] >> 8) * 64 - Static256.anInt4410;
				local281 = (Static223.anIntArray480[local251] & 0xFF) * 64 - Static293.anInt5053;
				if (Static53.aBoolean97) {
					local281 = 10;
					local270 = 10;
				}
				local12 &= Static372.method1265(local270, local281, local257, Static92.anInt1675, Static262.anInt6340);
			}
		}
		if (!local12) {
			Static334.anInt5568 = 2;
			return;
		}
		if (Static334.anInt5568 != 0) {
			Static62.method1008(Static125.aClass169_112.method3680(Static48.anInt952) + "<br>(100%)", Static334.aClass137_7, true);
		}
		Static44.method683();
		Static81.method1214();
		@Pc(382) boolean local382 = false;
		if (Static66.aClass164_2.method5379() && Static188.aClass135_Sub1_1.aBoolean324) {
			for (local270 = 0; local270 < Static306.aByteArrayArray18.length; local270++) {
				if (Static46.aByteArrayArray2[local270] != null || Static393.aByteArrayArray23[local270] != null) {
					local382 = true;
					break;
				}
			}
		}
		if (Static188.aClass135_Sub1_1.aBoolean317) {
			local270 = Static65.anIntArray158[Static56.anInt1154];
		} else {
			local270 = Static222.anIntArray552[Static56.anInt1154];
		}
		if (Static66.aClass164_2.method5309()) {
			local270++;
		}
		Static131.method1920(Static92.anInt1675, Static262.anInt6340, local270, local382, Static66.aClass164_2.method5337() > 0);
		for (local281 = 0; local281 < 4; local281++) {
			Static257.aClass222Array1[local281].method4831();
		}
		Static358.method4971();
		Static269.method785(false);
		Static286.method4346();
		Static44.method683();
		System.gc();
		Static41.method630(true);
		Static373.method5217();
		Static393.anInt6410 = Static188.aClass135_Sub1_1.anInt3384;
		Static380.aBoolean566 = !Static188.aClass135_Sub1_1.aBoolean320;
		Static54.aBoolean103 = Static188.aClass135_Sub1_1.aBoolean324;
		Static309.aBoolean495 = Static294.anInt5063 >= 96;
		Static155.aBoolean244 = Static188.aClass135_Sub1_1.aBoolean332;
		Static105.anInt1862 = Static188.aClass135_Sub1_1.method2747(Static25.anInt394) ? -1 : Static35.anInt678;
		Static153.aBoolean242 = Static25.anInt394 == 1 || Static188.aClass135_Sub1_1.aBoolean330;
		Static48.aClass115_Sub1_2 = new Class115_Sub1(4, Static92.anInt1675, Static262.anInt6340, false);
		if (!Static53.aBoolean97) {
			Static61.method1005(Static306.aByteArrayArray18, Static48.aClass115_Sub1_2);
		}
		if (Static53.aBoolean97) {
			Static182.method2611(Static306.aByteArrayArray18, Static48.aClass115_Sub1_2);
		}
		Static40.method628(Static92.anInt1675 >> 4, Static262.anInt6340 >> 4);
		Static40.method625();
		if (local382) {
			Static390.method5529(true);
			Static16.aClass115_Sub1_1 = new Class115_Sub1(1, Static92.anInt1675, Static262.anInt6340, true);
			if (!Static53.aBoolean97) {
				Static61.method1005(Static393.aByteArrayArray23, Static16.aClass115_Sub1_1);
				Static41.method630(true);
			}
			if (Static53.aBoolean97) {
				Static182.method2611(Static393.aByteArrayArray23, Static16.aClass115_Sub1_1);
				Static41.method630(true);
			}
			Static16.aClass115_Sub1_1.method2457(Static48.aClass115_Sub1_2.anIntArrayArrayArray2[0]);
			Static16.aClass115_Sub1_1.method2456(Static66.aClass164_2, null, null);
			Static390.method5529(false);
		}
		Static48.aClass115_Sub1_2.method2456(Static66.aClass164_2, Static257.aClass222Array1, local382 ? Static16.aClass115_Sub1_1.anIntArrayArrayArray2 : null);
		if (!Static53.aBoolean97) {
			Static41.method630(true);
			Static147.method2203(Static48.aClass115_Sub1_2, Static166.aByteArrayArray13);
			if (Static50.aByteArrayArray3 != null) {
				Static256.method3910();
			}
		}
		if (Static53.aBoolean97) {
			Static41.method630(true);
			Static388.method5516(Static48.aClass115_Sub1_2, Static166.aByteArrayArray13);
		}
		Static81.method1214();
		Static41.method630(true);
		Static48.aClass115_Sub1_2.method2451(local382 ? Static77.aClass42Array2[0] : null, Static66.aClass164_2, null);
		Static48.aClass115_Sub1_2.method2466(Static66.aClass164_2);
		Static41.method630(true);
		if (local382) {
			Static390.method5529(true);
			Static41.method630(true);
			if (!Static53.aBoolean97) {
				Static147.method2203(Static16.aClass115_Sub1_1, Static46.aByteArrayArray2);
			}
			if (Static53.aBoolean97) {
				Static388.method5516(Static16.aClass115_Sub1_1, Static46.aByteArrayArray2);
			}
			Static81.method1214();
			Static41.method630(true);
			Static16.aClass115_Sub1_1.method2451(null, Static66.aClass164_2, Static239.aClass42Array4[0]);
			Static16.aClass115_Sub1_1.method2466(Static66.aClass164_2);
			Static41.method630(true);
			Static390.method5529(false);
		}
		Static328.method4757();
		@Pc(700) int local700 = Static48.aClass115_Sub1_2.anInt3011;
		if (Static122.anInt2188 < local700) {
			local700 = Static122.anInt2188;
		}
		if (Static122.anInt2188 - 1 > local700) {
			local700 = Static122.anInt2188 - 1;
		}
		if (Static188.aClass135_Sub1_1.method2747(Static25.anInt394)) {
			Static85.method1267(0);
		} else {
			Static85.method1267(local700);
		}
		@Pc(735) int local735;
		@Pc(739) int local739;
		for (@Pc(731) int local731 = 0; local731 < 4; local731++) {
			for (local735 = 0; local735 < Static92.anInt1675; local735++) {
				for (local739 = 0; local739 < Static262.anInt6340; local739++) {
					Static80.method1208(local731, local735, local739);
				}
			}
		}
		Static49.method3048();
		Static44.method683();
		Static232.method621();
		Static81.method1214();
		Static385.aBoolean579 = false;
		Static73.method1166();
		if (Static142.aFrame2 != null && Static6.aClass130_1 != null && Static142.anInt2665 == 25) {
			Static177.method1119(Static89.aClass48_54);
			Static209.aClass1_Sub33_Sub2_2.method5142(1057001181);
		}
		if (!Static53.aBoolean97) {
			local735 = (Static275.anInt4800 - (Static92.anInt1675 >> 4)) / 8;
			local739 = ((Static92.anInt1675 >> 4) + Static275.anInt4800) / 8;
			@Pc(822) int local822 = (Static35.anInt682 - (Static262.anInt6340 >> 4)) / 8;
			@Pc(830) int local830 = ((Static262.anInt6340 >> 4) + Static35.anInt682) / 8;
			for (@Pc(834) int local834 = local735 - 1; local834 <= local739 + 1; local834++) {
				for (@Pc(840) int local840 = local822 - 1; local840 <= local830 + 1; local840++) {
					if (local735 > local834 || local834 > local739 || local840 < local822 || local830 < local840) {
						Static25.aClass230_5.method4979("m" + local834 + "_" + local840);
						Static25.aClass230_5.method4979("l" + local834 + "_" + local840);
					}
				}
			}
		}
		if (Static142.anInt2665 == 28) {
			Static212.method2974(10);
		} else {
			Static212.method2974(30);
			if (Static6.aClass130_1 != null) {
				Static177.method1119(Static142.aClass48_88);
			}
		}
		Static207.method2948();
		Static44.method683();
		Static252.method3889();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)I")
	public static int method4134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static361.anIntArray694[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZZI)Lclient!ui;")
	public static Class230 method4135(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class38 local5 = null;
		if (Static143.aClass192_4 != null) {
			local5 = new Class38(arg0, Static143.aClass192_4, Static329.aClass192Array2[arg0], 1000000);
		}
		Static104.aClass56_Sub1Array1[arg0] = Static170.aClass168_1.method3677(local5, arg0, Static62.aClass38_1);
		if (arg2) {
			Static104.aClass56_Sub1Array1[arg0].method3296();
		}
		return new Class230(Static104.aClass56_Sub1Array1[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)I")
	public static int method4136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!sk;Z)V")
	public static void method4137(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(13) int local13 = 0;
		if (Static366.anInt5883 < arg1.anInt2336) {
			Static208.method2954(arg1);
		} else if (arg1.anInt2347 >= Static366.anInt5883) {
			Static218.method3199(arg1);
		} else {
			Static166.method2989(false, arg1);
			local13 = Static89.anInt1645;
			local7 = Static341.anInt5632;
		}
		if (arg1.anInt6080 < 128 || arg1.anInt6077 < 128 || arg1.anInt6080 >= Static92.anInt1675 * 128 - 128 || Static262.anInt6340 * 128 - 128 <= arg1.anInt6077) {
			arg1.anInt2338 = -1;
			arg1.anInt2336 = 0;
			local7 = -1;
			local13 = 0;
			arg1.anInt2347 = 0;
			arg1.anInt2333 = -1;
			arg1.anInt6080 = arg1.anIntArray296[0] * 128 + arg1.method1877() * 64;
			arg1.anInt6077 = arg1.anIntArray295[0] * 128 + arg1.method1877() * 64;
			arg1.method1888();
		}
		if (Static321.aClass25_Sub1_Sub1_Sub1_2 == arg1 && (arg1.anInt6080 < 1536 || arg1.anInt6077 < 1536 || Static92.anInt1675 * 128 - 1536 <= arg1.anInt6080 || (Static262.anInt6340 - 12) * 128 <= arg1.anInt6077)) {
			arg1.anInt2338 = -1;
			local13 = 0;
			arg1.anInt2336 = 0;
			local7 = -1;
			arg1.anInt2333 = -1;
			arg1.anInt2347 = 0;
			arg1.anInt6080 = arg1.anIntArray296[0] * 128 + arg1.method1877() * 64;
			arg1.anInt6077 = arg1.anIntArray295[0] * 128 + arg1.method1877() * 64;
			arg1.method1888();
		}
		@Pc(207) int local207 = Static17.method191(arg1);
		Static279.method4279(local13, arg1, local207, local7);
		Static370.method5192(arg1);
	}
}
