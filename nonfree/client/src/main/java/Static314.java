import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public static int anInt5418;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
	public static int anInt5422;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public static int anInt5415 = -1;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "[I")
	public static final int[] anIntArray496 = new int[8];

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Lclient!gu;")
	public static final Class96 aClass96_33 = new Class96(32);

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
	public static final int[] anIntArray497 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I[[BLclient!js;)V")
	private static void method4464(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class14_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt3467; local7++) {
			Static435.method5771();
			for (@Pc(18) int local18 = 0; local18 < Static195.anInt3537 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static118.anInt2419 >> 3; local22++) {
					@Pc(32) int local32 = Static411.anIntArrayArrayArray14[local7][local18][local22];
					if (local32 != -1) {
						@Pc(42) int local42 = local32 >> 24 & 0x3;
						if (!arg1.aBoolean210 || local42 == 0) {
							@Pc(53) int local53 = local32 >> 1 & 0x3;
							@Pc(59) int local59 = local32 >> 14 & 0x3FF;
							@Pc(65) int local65 = local32 >> 3 & 0x7FF;
							@Pc(75) int local75 = (local59 / 8 << 8) + local65 / 8;
							for (@Pc(77) int local77 = 0; local77 < Static266.anIntArray627.length; local77++) {
								if (Static266.anIntArray627[local77] == local75 && arg0[local77] != null) {
									arg1.method3005(local42, Static415.aClass39_11, (local65 & 0x7) * 8, local7, local18 * 8, local22 * 8, (local59 & 0x7) * 8, Static125.aClass188Array1, local53, arg0[local77]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIBI)I")
	public static int method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZIZ)V")
	public static void method4466(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static415.aClass39_11 = Static459.method4522(Static378.anInterface4_9, arg1, Static77.aClass180_1, Static155.aCanvas4, Static38.aClass135_Sub1_1.anInt5108 * 2);
		} else {
			if (arg0) {
				Static415.aClass39_11 = Static459.method4522(Static378.anInterface4_9, 0, Static77.aClass180_1, Static155.aCanvas4, 0);
				Static415.aClass39_11.p(0);
				@Pc(36) Class151 local36 = Static41.method755(Static295.anInt5134, Static319.aClass246_127);
				@Pc(45) Class71 local45 = Static415.aClass39_11.method4564(local36, Static461.method1446(Static345.aClass246_187, Static295.anInt5134));
				Static18.method3000(true, Static343.aClass7_150.method331(Static341.anInt5770), local45);
				Static415.aClass39_11.method4558();
				Static55.method5709();
				Static415.aClass39_11.method4523();
			}
			try {
				Static415.aClass39_11 = Static459.method4522(Static378.anInterface4_9, arg1, Static77.aClass180_1, Static155.aCanvas4, Static38.aClass135_Sub1_1.anInt5108 * 2);
				if (Static415.aClass39_11.method4552()) {
					@Pc(76) boolean local76 = true;
					try {
						local76 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(88) Throwable local88) {
					}
					@Pc(94) Class1_Sub41 local94;
					if (local76) {
						local94 = Static415.aClass39_11.method4544(146800640);
					} else {
						local94 = Static415.aClass39_11.method4544(104857600);
					}
					Static415.aClass39_11.method4503(local94);
				}
			} catch (@Pc(104) Throwable local104) {
				arg1 = 0;
				Static415.aClass39_11 = Static459.method4522(Static378.anInterface4_9, 0, Static77.aClass180_1, Static155.aCanvas4, 0);
			}
		}
		Static143.anInt2766 = arg1;
		Static459.method4541();
		if (!Static415.aClass39_11.method4525()) {
			Static276.anInt4868 = 1;
		}
		Static415.aClass39_11.method4543(Static276.anInt4868);
		Static415.aClass39_11.method4531(0);
		Static415.aClass39_11.MA(8);
		Static260.aClass33_4 = Static415.aClass39_11.method4512();
		Static115.aClass33_2 = Static415.aClass39_11.method4512();
		Static14.method384();
		Static415.aClass39_11.method4510(!Static38.aClass135_Sub1_1.aBoolean353);
		if (Static415.aClass39_11.method4557()) {
			Static341.method4807(Static38.aClass135_Sub1_1.aBoolean359);
		}
		Static357.method4897(Static415.aClass39_11, Static195.anInt3537 >> 3, Static118.anInt2419 >> 3);
		Static355.method4889();
		Static77.aBoolean102 = false;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public static void method4467() {
		Static166.method2655(false);
		Static361.anInt5958 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static390.aByteArrayArray18.length; local14++) {
			if (Static111.anIntArray183[local14] != -1 && Static390.aByteArrayArray18[local14] == null) {
				Static390.aByteArrayArray18[local14] = Static334.aClass246_179.method5477(Static111.anIntArray183[local14], 0);
				if (Static390.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static361.anInt5958++;
				}
			}
			if (Static431.anIntArray632[local14] != -1 && Static407.aByteArrayArray20[local14] == null) {
				Static407.aByteArrayArray20[local14] = Static334.aClass246_179.method5495(Static431.anIntArray632[local14], 0, Static44.anIntArrayArray7[local14]);
				if (Static407.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static361.anInt5958++;
				}
			}
			if (Static18.anIntArray306[local14] != -1 && Static136.aByteArrayArray6[local14] == null) {
				Static136.aByteArrayArray6[local14] = Static334.aClass246_179.method5477(Static18.anIntArray306[local14], 0);
				if (Static136.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static361.anInt5958++;
				}
			}
			if (Static181.anIntArray293[local14] != -1 && Static175.aByteArrayArray8[local14] == null) {
				Static175.aByteArrayArray8[local14] = Static334.aClass246_179.method5477(Static181.anIntArray293[local14], 0);
				if (Static175.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static361.anInt5958++;
				}
			}
			if (Static92.anIntArray162 != null && Static72.aByteArrayArray3[local14] == null && Static92.anIntArray162[local14] != -1) {
				Static72.aByteArrayArray3[local14] = Static334.aClass246_179.method5495(Static92.anIntArray162[local14], 0, Static44.anIntArrayArray7[local14]);
				if (Static72.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static361.anInt5958++;
				}
			}
		}
		if (Static236.aClass45_3 == null) {
			if (Static62.aClass1_Sub2_Sub11_3 == null || !Static86.aClass246_54.method5488(Static62.aClass1_Sub2_Sub11_3.aString55 + "_staticelements")) {
				Static236.aClass45_3 = new Class45(0);
			} else if (Static86.aClass246_54.method5500(Static62.aClass1_Sub2_Sub11_3.aString55 + "_staticelements")) {
				Static236.aClass45_3 = Static413.method5643(Static86.aClass246_54, Static62.aClass1_Sub2_Sub11_3.aString55 + "_staticelements", Static232.aBoolean297);
			} else {
				Static361.anInt5958++;
				local12 = false;
			}
		}
		if (!local12) {
			Static407.anInt6565 = 1;
			return;
		}
		Static378.anInt4252 = 0;
		local12 = true;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(246) int local246 = 0; local246 < Static390.aByteArrayArray18.length; local246++) {
			@Pc(252) byte[] local252 = Static407.aByteArrayArray20[local246];
			if (local252 != null) {
				local265 = (Static266.anIntArray627[local246] >> 8) * 64 - Static165.anInt3049;
				local276 = (Static266.anIntArray627[local246] & 0xFF) * 64 - Static345.anInt5799;
				if (Static23.anInt5194 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local12 &= Static259.method3863(local252, local265, local276, Static195.anInt3537, Static118.anInt2419);
			}
			local252 = Static175.aByteArrayArray8[local246];
			if (local252 != null) {
				local265 = (Static266.anIntArray627[local246] >> 8) * 64 - Static165.anInt3049;
				local276 = (Static266.anIntArray627[local246] & 0xFF) * 64 - Static345.anInt5799;
				if (Static23.anInt5194 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local12 &= Static259.method3863(local252, local265, local276, Static195.anInt3537, Static118.anInt2419);
			}
		}
		if (!local12) {
			Static407.anInt6565 = 2;
			return;
		}
		if (Static407.anInt6565 != 0) {
			Static18.method3000(true, Static343.aClass7_150.method331(Static341.anInt5770) + "<br>(100%)", Static312.aClass71_7);
		}
		Static435.method5771();
		Static67.method1324();
		@Pc(371) boolean local371 = false;
		if (Static415.aClass39_11.method4542() && Static38.aClass135_Sub1_1.aBoolean366) {
			for (local265 = 0; local265 < Static390.aByteArrayArray18.length; local265++) {
				if (Static175.aByteArrayArray8[local265] != null || Static136.aByteArrayArray6[local265] != null) {
					local371 = true;
					break;
				}
			}
		}
		if (Static38.aClass135_Sub1_1.aBoolean360) {
			local265 = Static407.anIntArray601[Static347.anInt5822];
		} else {
			local265 = Static265.anIntArray409[Static347.anInt5822];
		}
		if (Static415.aClass39_11.method4559()) {
			local265++;
		}
		Static46.method820(Static195.anInt3537, Static118.anInt2419, local265, local371, Static415.aClass39_11.method4520() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static125.aClass188Array1[local276].method4320();
		}
		Static171.method2754();
		Static245.method3716(false);
		Static48.method870();
		Static432.aClass171_1 = null;
		Static435.method5771();
		System.gc();
		Static166.method2655(true);
		Static202.method3276();
		Static202.anInt3867 = Static38.aClass135_Sub1_1.method4236(Static143.anInt2766);
		Static8.aBoolean11 = Static79.anInt1766 >= 96;
		Static291.aBoolean351 = Static38.aClass135_Sub1_1.aBoolean366;
		Static106.aBoolean491 = Static38.aClass135_Sub1_1.method4237(Static143.anInt2766);
		Static137.aBoolean165 = !Static38.aClass135_Sub1_1.aBoolean354;
		Static129.anInt3958 = Static38.aClass135_Sub1_1.method4244(Static143.anInt2766) ? -1 : Static170.anInt3116;
		Static363.aBoolean203 = Static143.anInt2766 == 1 || Static38.aClass135_Sub1_1.aBoolean358;
		Static132.aBoolean160 = Static38.aClass135_Sub1_1.aBoolean357;
		Static74.aClass14_Sub1_3 = new Class14_Sub1(4, Static195.anInt3537, Static118.anInt2419, false);
		if (Static23.anInt5194 == 0) {
			Static261.method3876(Static74.aClass14_Sub1_3, Static390.aByteArrayArray18);
		} else {
			Static173.method2781(Static74.aClass14_Sub1_3, Static390.aByteArrayArray18);
		}
		Static24.method549(Static195.anInt3537 >> 4, Static118.anInt2419 >> 4);
		Static191.method2972();
		if (local371) {
			Static211.method3342(true);
			Static204.aClass14_Sub1_4 = new Class14_Sub1(1, Static195.anInt3537, Static118.anInt2419, true);
			if (Static23.anInt5194 == 0) {
				Static261.method3876(Static204.aClass14_Sub1_4, Static136.aByteArrayArray6);
				Static166.method2655(true);
			} else {
				Static173.method2781(Static204.aClass14_Sub1_4, Static136.aByteArrayArray6);
				Static166.method2655(true);
			}
			Static204.aClass14_Sub1_4.method2989(Static74.aClass14_Sub1_3.anIntArrayArrayArray4[0]);
			Static204.aClass14_Sub1_4.method2998(null, Static415.aClass39_11, null);
			Static211.method3342(false);
		}
		Static74.aClass14_Sub1_3.method2998(Static125.aClass188Array1, Static415.aClass39_11, local371 ? Static204.aClass14_Sub1_4.anIntArrayArrayArray4 : null);
		if (Static23.anInt5194 == 0) {
			Static166.method2655(true);
			Static69.method1401(Static407.aByteArrayArray20, Static74.aClass14_Sub1_3);
			if (Static72.aByteArrayArray3 != null) {
				Static62.method1296();
			}
		} else {
			Static166.method2655(true);
			method4464(Static407.aByteArrayArray20, Static74.aClass14_Sub1_3);
		}
		Static67.method1324();
		Static166.method2655(true);
		Static74.aClass14_Sub1_3.method2995(null, Static415.aClass39_11, local371 ? Static277.aClass149Array3[0] : null);
		Static74.aClass14_Sub1_3.method3007(Static415.aClass39_11);
		Static166.method2655(true);
		if (local371) {
			Static211.method3342(true);
			Static166.method2655(true);
			if (Static23.anInt5194 == 0) {
				Static69.method1401(Static175.aByteArrayArray8, Static204.aClass14_Sub1_4);
			} else {
				method4464(Static175.aByteArrayArray8, Static204.aClass14_Sub1_4);
			}
			Static67.method1324();
			Static166.method2655(true);
			Static204.aClass14_Sub1_4.method2995(Static269.aClass149Array2[0], Static415.aClass39_11, null);
			Static204.aClass14_Sub1_4.method3007(Static415.aClass39_11);
			Static166.method2655(true);
			Static211.method3342(false);
		}
		Static144.method2394();
		@Pc(709) int local709 = Static74.aClass14_Sub1_3.anInt3482;
		if (local709 > Static357.anInt5881) {
			local709 = Static357.anInt5881;
		}
		if (local709 < Static357.anInt5881 - 1) {
			local709 = Static357.anInt5881 - 1;
		}
		if (Static38.aClass135_Sub1_1.method4244(Static143.anInt2766)) {
			Static420.method5606(0);
		} else {
			Static420.method5606(local709);
		}
		@Pc(740) int local740;
		@Pc(744) int local744;
		for (@Pc(736) int local736 = 0; local736 < 4; local736++) {
			for (local740 = 0; local740 < Static195.anInt3537; local740++) {
				for (local744 = 0; local744 < Static118.anInt2419; local744++) {
					Static150.method2455(local744, local736, local740);
				}
			}
		}
		Static99.method1780();
		Static435.method5771();
		Static140.method2344();
		Static67.method1324();
		Static195.aBoolean221 = false;
		Static313.method4459();
		if (Static285.aFrame4 != null && Static82.aClass229_1 != null && Static342.anInt5771 == 10) {
			Static193.method2984(Static285.aClass179_57);
			Static92.aClass1_Sub5_Sub1_1.method5417(1057001181);
		}
		if (Static23.anInt5194 == 0) {
			local740 = (Static307.anInt5295 - (Static195.anInt3537 >> 4)) / 8;
			local744 = (Static307.anInt5295 + (Static195.anInt3537 >> 4)) / 8;
			@Pc(826) int local826 = (Static303.anInt5255 - (Static118.anInt2419 >> 4)) / 8;
			@Pc(834) int local834 = ((Static118.anInt2419 >> 4) + Static303.anInt5255) / 8;
			for (@Pc(838) int local838 = local740 - 1; local838 <= local744 + 1; local838++) {
				for (@Pc(844) int local844 = local826 - 1; local844 <= local834 + 1; local844++) {
					if (local740 > local838 || local838 > local744 || local844 < local826 || local844 > local834) {
						Static334.aClass246_179.method5482("m" + local838 + "_" + local844);
						Static334.aClass246_179.method5482("l" + local838 + "_" + local844);
					}
				}
			}
		}
		if (Static342.anInt5771 == 3) {
			Static193.method2987(2);
		} else if (Static342.anInt5771 == 7) {
			Static193.method2987(6);
		} else {
			Static193.method2987(9);
			if (Static82.aClass229_1 != null) {
				Static193.method2984(Static385.aClass179_80);
			}
		}
		Static368.method5051();
		Static435.method5771();
		Static320.method5063();
	}
}
