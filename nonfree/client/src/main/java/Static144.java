import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	public static int anInt2836;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString99 = "K";

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
	public static int anInt2844 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lclient!km;")
	public static Class102 method2292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass102_1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2293(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < Static222.anInt4329; local5++) {
			@Pc(18) Class22_Sub3_Sub2 local18 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local5]];
			if (local18 != null && local18.aString153 != null && local18.aString153.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static137.aClass1_Sub14_Sub1_6.method2661(177);
					Static137.aClass1_Sub14_Sub1_6.method2606(Static46.anIntArray79[local5]);
					Static137.aClass1_Sub14_Sub1_6.method2624(0);
				} else if (arg0 == 4) {
					Static137.aClass1_Sub14_Sub1_6.method2661(169);
					Static137.aClass1_Sub14_Sub1_6.method2642(Static46.anIntArray79[local5]);
					Static137.aClass1_Sub14_Sub1_6.method2639(0);
				} else if (arg0 == 5) {
					Static137.aClass1_Sub14_Sub1_6.method2661(186);
					Static137.aClass1_Sub14_Sub1_6.method2639(0);
					Static137.aClass1_Sub14_Sub1_6.method2642(Static46.anIntArray79[local5]);
				} else if (arg0 == 6) {
					Static137.aClass1_Sub14_Sub1_6.method2661(157);
					Static137.aClass1_Sub14_Sub1_6.method2642(Static46.anIntArray79[local5]);
					Static137.aClass1_Sub14_Sub1_6.method2624(0);
				} else if (arg0 == 7) {
					Static137.aClass1_Sub14_Sub1_6.method2661(59);
					Static137.aClass1_Sub14_Sub1_6.method2637(Static46.anIntArray79[local5]);
					Static137.aClass1_Sub14_Sub1_6.method2631(0);
				}
				local3 = true;
				break;
			}
		}
		if (!local3) {
			Static199.method3219(Static81.aString49 + arg1);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILclient!sb;)V")
	public static void method2294(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (Static2.aClass187_1 == null) {
			return;
		}
		try {
			Static2.aClass187_1.method4487(0L);
			Static2.aClass187_1.method4491(arg0, 24, arg1.aByteArray34);
		} catch (@Pc(17) Exception local17) {
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIZIZI)V")
	public static void method2296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static168.anInt5864++;
		if (Static229.aClass22_Sub3_Sub2_2 != null && Static229.aClass22_Sub3_Sub2_2.anInt4601 - (Static229.aClass22_Sub3_Sub2_2.method3660() - 1) * 64 >> 7 == Static62.anInt1244 && Static229.aClass22_Sub3_Sub2_2.anInt4623 - (Static229.aClass22_Sub3_Sub2_2.method3660() - 1) * 64 >> 7 == Static127.anInt2540) {
			Static263.aBoolean357 = false;
			Static62.anInt1244 = 0;
		}
		Static171.method2885();
		if (!arg2) {
			Static61.method1024();
		}
		Static112.method1808();
		if (Static291.aBoolean404) {
			Static159.method2694(arg0, arg3, true, arg1, arg4);
			arg3 = Static260.anInt5033;
			arg4 = Static279.anInt5297;
			arg0 = Static48.anInt929;
			arg1 = Static210.anInt4141;
		}
		Static149.anInt2995 = arg0;
		Static149.anInt2993 = arg1;
		@Pc(96) int local96;
		@Pc(93) int local93;
		if (Static101.anInt1895 == 1) {
			local93 = Static295.anInt5584 + (int) Static2.aFloat1 & 0x7FF;
			local96 = (int) Static15.aFloat2;
			if (local96 < Static215.anInt4230 / 256) {
				local96 = Static215.anInt4230 / 256;
			}
			if (Static104.aBooleanArray19[4] && local96 < Static221.anIntArray348[4] + 128) {
				local96 = Static221.anIntArray348[4] + 128;
			}
			Static136.method2201(Static142.anInt2794, arg3, Static216.anInt4233, local93, local96, Static104.method1648(Static295.anInt5586, Static229.aClass22_Sub3_Sub2_2.anInt4601, Static229.aClass22_Sub3_Sub2_2.anInt4623) - 50, local96 * 3 + 600);
		} else if (Static101.anInt1895 == 4) {
			local93 = (int) Static2.aFloat1 & 0x7FF;
			local96 = (int) Static15.aFloat2;
			if (Static215.anInt4230 / 256 > local96) {
				local96 = Static215.anInt4230 / 256;
			}
			if (Static104.aBooleanArray19[4] && local96 < Static221.anIntArray348[4] + 128) {
				local96 = Static221.anIntArray348[4] + 128;
			}
			Static136.method2201(Static142.anInt2794, arg3, Static216.anInt4233, local93, local96, Static104.method1648(Static295.anInt5586, Static97.anInt1806, Static258.anInt5019) - 50, local96 * 3 + 600);
		} else if (Static101.anInt1895 == 5) {
			Static56.method972(arg3);
		}
		local96 = Static243.anInt5653;
		local93 = Static141.anInt2760;
		@Pc(228) int local228 = Static105.anInt2016;
		@Pc(230) int local230 = Static262.anInt2349;
		@Pc(232) int local232 = Static140.anInt2757;
		@Pc(234) int local234;
		@Pc(276) int local276;
		for (local234 = 0; local234 < 5; local234++) {
			if (Static104.aBooleanArray19[local234]) {
				local276 = (int) (Math.random() * (double) (Static279.anIntArray488[local234] * 2 + 1) - (double) Static279.anIntArray488[local234] + Math.sin((double) Static204.anIntArray331[local234] / 100.0D * (double) Static236.anIntArray432[local234]) * (double) Static221.anIntArray348[local234]);
				if (local234 == 4) {
					Static140.anInt2757 += local276;
					if (Static140.anInt2757 < 128) {
						Static140.anInt2757 = 128;
					}
					if (Static140.anInt2757 > 383) {
						Static140.anInt2757 = 383;
					}
				}
				if (local234 == 0) {
					Static243.anInt5653 += local276;
				}
				if (local234 == 1) {
					Static141.anInt2760 += local276;
				}
				if (local234 == 3) {
					Static262.anInt2349 = Static262.anInt2349 + local276 & 0x7FF;
				}
				if (local234 == 2) {
					Static105.anInt2016 += local276;
				}
			}
		}
		Static9.method2422();
		@Pc(443) int local443;
		if (Static291.aBoolean404) {
			Static133.method2180(arg1, arg0, arg4 + arg1, arg0 + arg3);
			@Pc(400) float local400 = (float) Static262.anInt2349 * 0.17578125F;
			@Pc(405) float local405 = (float) Static140.anInt2757 * 0.17578125F;
			if (Static101.anInt1895 == 3) {
				local400 = Static123.aFloat28 * 360.0F / 6.2831855F;
				local405 = Static61.aFloat11 * 360.0F / 6.2831855F;
			}
			if (Static258.anInt5016 == 10) {
				local443 = Static142.method2261(Static105.anInt2016 >> 10, Static243.anInt5653 >> 10, Static287.anInt5449, Static147.anInt2946);
			} else {
				local443 = Static142.method2261(Static229.aClass22_Sub3_Sub2_2.anIntArray424[0] >> 3, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] >> 3, Static287.anInt5449, Static147.anInt2946);
			}
			if (Static112.anInt2219 >= 0) {
				Static291.method4315();
				@Pc(467) Class190 local467 = Static277.method4111(Static112.anInt2219, Static115.anInt2287, Static175.anInt3624, Static233.anInt4699);
				local467.method4565(Static167.anInt3494, arg1, arg0, arg4, arg3, Static140.anInt2757, Static262.anInt2349, local443);
			} else {
				Static291.method4316(local443);
			}
			Static291.method4307(arg1, arg0, arg4, arg3, arg1 + arg4 / 2, arg3 / 2 + arg0, local405, local400, Static164.anInt3456, Static164.anInt3456);
			Static40.method718(false);
			Static291.method4293();
			Static291.method4292(true);
			Static291.method4321(true);
		} else {
			Static41.method739(arg1, arg0, arg1 + arg4, arg3 + arg0);
			Static18.method310();
			if (Static112.anInt2219 < 0) {
				Static41.method730(arg1, arg0, arg4, arg3, 0);
			} else {
				@Pc(373) Class190 local373 = Static277.method4111(Static112.anInt2219, Static115.anInt2287, Static175.anInt3624, Static233.anInt4699);
				local373.method4562(Static167.anInt3494, arg1, arg0, arg4, arg3, Static140.anInt2757, Static262.anInt2349);
			}
		}
		if (Static108.aBoolean161 || Static64.anInt3058 < arg1 || Static64.anInt3058 >= arg4 + arg1 || Static268.anInt5935 < arg0 || Static268.anInt5935 >= arg0 + arg3) {
			Static281.aBoolean384 = false;
			Static31.aBoolean40 = true;
			Static57.anInt1123 = 0;
		} else {
			Static31.aBoolean40 = true;
			Static281.aBoolean384 = true;
			Static57.anInt1123 = 0;
			local234 = Static25.anInt487;
			local276 = Static187.anInt3768;
			Static34.anInt613 = (Static64.anInt3058 - arg1) * (local276 + -local234) / arg4 + local234;
			@Pc(564) int local564 = Static38.anInt768;
			local443 = Static56.anInt1120;
			Static152.anInt3139 = (Static268.anInt5935 - arg0) * (-local443 + local564) / arg3 + local443;
		}
		Static82.method1238();
		@Pc(590) byte local590 = Static140.method2232() == 2 ? (byte) Static168.anInt5864 : 1;
		if (Static291.aBoolean404) {
			Static294.method4364(Static37.anInt757, !Static244.aBoolean348);
			Static263.method3940(Static243.anInt5653, Static105.anInt2016, Static140.anInt2757, Static262.anInt2349, Static141.anInt2760);
			Static291.anInt5513 = Static37.anInt757;
			Static245.method1900(Static243.anInt5653, Static141.anInt2760, Static105.anInt2016, Static140.anInt2757, Static262.anInt2349, Static172.aByteArrayArrayArray2, Static101.anIntArray168, Static214.anIntArray338, Static137.anIntArray223, Static142.anIntArray232, Static242.anIntArray438, Static295.anInt5586 + 1, local590, Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7, Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7);
			Static218.aBoolean293 = true;
			Static294.method4365();
			Static263.method3940(0, 0, 0, 0, 0);
			Static82.method1238();
			Static86.method1274(arg1, arg0, arg4, Static164.anInt3456, Static164.anInt3456, arg3);
			Static165.method2790(Static164.anInt3456, arg4, Static164.anInt3456, arg3, arg1, arg0);
			Static212.method3360();
		} else {
			Static245.method1900(Static243.anInt5653, Static141.anInt2760, Static105.anInt2016, Static140.anInt2757, Static262.anInt2349, Static172.aByteArrayArrayArray2, Static101.anIntArray168, Static214.anIntArray338, Static137.anIntArray223, Static142.anIntArray232, Static242.anIntArray438, Static295.anInt5586 + 1, local590, Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7, Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7);
			Static82.method1238();
			Static212.method3360();
			Static86.method1274(arg1, arg0, arg4, 256, 256, arg3);
			Static165.method2790(256, arg4, 256, arg3, arg1, arg0);
		}
		((Class74_Sub1) Static18.anInterface1_1).method1653(Static147.anInt2946);
		Static305.method4551(arg4, arg3, arg0, arg1);
		Static141.anInt2760 = local93;
		Static262.anInt2349 = local230;
		Static105.anInt2016 = local228;
		Static243.anInt5653 = local96;
		Static140.anInt2757 = local232;
		if (Static193.aBoolean273 && Static272.aClass40_2.method864() == 0) {
			Static193.aBoolean273 = false;
		}
		if (Static193.aBoolean273) {
			if (Static291.aBoolean404) {
				Static133.method2176(arg1, arg0, arg4, arg3, 0);
			} else {
				Static41.method730(arg1, arg0, arg4, arg3, 0);
			}
			Static312.method4593(Static165.aString106, false);
		}
		if (!arg2 && !Static193.aBoolean273 && !Static108.aBoolean161 && Static64.anInt3058 >= arg1 && Static64.anInt3058 < arg1 + arg4 && arg0 <= Static268.anInt5935 && arg3 + arg0 > Static268.anInt5935) {
			Static90.method3642(Static268.anInt5935, arg0, arg1, arg4, arg3, Static64.anInt3058);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
	public static void method2297(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static291.aBoolean404 && arg0) {
			local11 = 1;
			local13 = Static254.aByteArrayArray14;
		} else {
			local11 = 4;
			local13 = Static156.aByteArrayArray10;
		}
		@Pc(22) int local22 = local13.length;
		@Pc(24) int local24;
		@Pc(45) int local45;
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(31) byte[] local31 = local13[local24];
			@Pc(37) int local37 = Static278.anIntArray487[local24] >> 8;
			@Pc(39) int[] local39 = null;
			local45 = Static278.anIntArray487[local24] & 0xFF;
			@Pc(52) int local52 = local37 * 64 - Static290.anInt5497;
			@Pc(59) int local59 = local45 * 64 - Static118.anInt2409;
			if (local31 != null) {
				Static82.method1238();
				local39 = Static129.method2026(local59, Static290.anInt5497, Static118.anInt2409, local52, local31, arg0, Static56.aClass122Array1);
			}
			if (!arg0 && local37 == Static305.anInt5793 / 8 && Static244.anInt4868 / 8 == local45) {
				if (local39 == null) {
					Static112.anInt2219 = -1;
				} else {
					Static112.anInt2219 = local39[0];
					Static167.anInt3494 = local39[4];
					Static175.anInt3624 = local39[2];
					Static115.anInt2287 = local39[1];
					Static233.anInt4699 = local39[3];
				}
			}
		}
		for (local24 = 0; local24 < local22; local24++) {
			@Pc(147) int local147 = (Static278.anIntArray487[local24] >> 8) * 64 - Static290.anInt5497;
			@Pc(157) int local157 = (Static278.anIntArray487[local24] & 0xFF) * 64 - Static118.anInt2409;
			@Pc(161) byte[] local161 = local13[local24];
			if (local161 == null && Static244.anInt4868 < 800) {
				Static82.method1238();
				for (local45 = 0; local45 < local11; local45++) {
					Static99.method1487(local45, local157, 64, local147, 64);
				}
			}
		}
	}
}
