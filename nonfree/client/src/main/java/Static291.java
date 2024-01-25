import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!t", name = "S", descriptor = "I")
	public static int anInt5656;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "[I")
	public static final int[] anIntArray712 = new int[25];

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Lclient!ok;")
	public static Class148 aClass148_1 = new Class148(8);

	@OriginalMember(owner = "client!t", name = "R", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString225 = "slide:";

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	public static int anInt5657 = 100;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
	public static void method4952() {
		@Pc(10) Class140 local10 = Static306.aClass140_155;
		synchronized (Static306.aClass140_155) {
			Static306.aClass140_155.method3824(5);
		}
		local10 = Static95.aClass140_53;
		synchronized (Static95.aClass140_53) {
			Static95.aClass140_53.method3824(5);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method4953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static89.aBoolean156) {
			return;
		}
		Static248.aClass1_Sub7_Sub1_2.method728(232);
		Static248.aClass1_Sub7_Sub1_2.method3098(arg0);
		Static248.aClass1_Sub7_Sub1_2.method3098(Static90.anInt1762);
		Static248.aClass1_Sub7_Sub1_2.method3128(Static99.anInt1953);
		Static248.aClass1_Sub7_Sub1_2.method3128(arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
	public static void method4955(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(11, arg0);
		local8.method167();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(CI)Z")
	public static boolean method4957(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(36) char[] local36 = Static273.aCharArray5;
			for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
				@Pc(44) char local44 = local36[local38];
				if (local44 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4958(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static34.method902(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static227.anInt4474; local17++) {
			@Pc(25) String local25 = Static34.method902(Static313.aStringArray44[local17]);
			if (local25 != null && local25.equals(local12)) {
				Static227.anInt4474--;
				for (@Pc(37) int local37 = local17; local37 < Static227.anInt4474; local37++) {
					Static313.aStringArray44[local37] = Static313.aStringArray44[local37 + 1];
					Static66.aStringArray6[local37] = Static66.aStringArray6[local37 + 1];
					Static310.aStringArray43[local37] = Static310.aStringArray43[local37 + 1];
					Static94.aStringArray12[local37] = Static94.aStringArray12[local37 + 1];
					Static140.aBooleanArray10[local37] = Static140.aBooleanArray10[local37 + 1];
				}
				Static152.anInt3055 = Static119.anInt2038;
				Static248.aClass1_Sub7_Sub1_2.method728(114);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg0));
				Static248.aClass1_Sub7_Sub1_2.method3124(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public static void method4959() {
		Static35.anInt880 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static93.anInt1792; local3++) {
			@Pc(8) Class210 local8 = Static263.aClass210Array2[local3];
			@Pc(12) int local12;
			if (Static69.anIntArray163 != null) {
				for (local12 = 0; local12 < Static69.anIntArray163.length; local12++) {
					if (Static69.anIntArray163[local12] != -1000000 && (local8.anInt6295 <= Static69.anIntArray163[local12] || local8.anInt6286 <= Static69.anIntArray163[local12]) && (local8.anInt6292 <= Static194.anIntArray473[local12] || local8.anInt6284 <= Static194.anIntArray473[local12]) && (local8.anInt6292 >= Static179.anIntArray431[local12] || local8.anInt6284 >= Static179.anIntArray431[local12]) && (local8.anInt6282 <= Static317.anIntArray764[local12] || local8.anInt6294 <= Static317.anIntArray764[local12]) && (local8.anInt6282 >= Static183.anIntArray448[local12] || local8.anInt6294 >= Static183.anIntArray448[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt6291 == 1) {
				local12 = local8.anInt6279 + Static346.anInt6451 - Static199.anInt4061;
				if (local12 >= 0 && local12 <= Static346.anInt6451 + Static346.anInt6451) {
					local110 = local8.anInt6289 + Static346.anInt6451 - Static268.anInt5167;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6277 + Static346.anInt6451 - Static268.anInt5167;
					if (local121 > Static346.anInt6451 + Static346.anInt6451) {
						local121 = Static346.anInt6451 + Static346.anInt6451;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static57.aBooleanArrayArray7[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static175.anInt3627 - local8.anInt6292;
						if (local153 > 32) {
							local8.anInt6293 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt6293 = 2;
							local153 = -local153;
						}
						local8.anInt6280 = (local8.anInt6282 - Static341.anInt2253 << 8) / local153;
						local8.anInt6287 = (local8.anInt6294 - Static341.anInt2253 << 8) / local153;
						local8.anInt6278 = (local8.anInt6295 - Static35.anInt877 << 8) / local153;
						local8.anInt6290 = (local8.anInt6286 - Static35.anInt877 << 8) / local153;
						Static69.aClass210Array1[Static35.anInt880++] = local8;
					}
				}
			} else if (local8.anInt6291 == 2) {
				local12 = local8.anInt6289 + Static346.anInt6451 - Static268.anInt5167;
				if (local12 >= 0 && local12 <= Static346.anInt6451 + Static346.anInt6451) {
					local110 = local8.anInt6279 + Static346.anInt6451 - Static199.anInt4061;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6276 + Static346.anInt6451 - Static199.anInt4061;
					if (local121 > Static346.anInt6451 + Static346.anInt6451) {
						local121 = Static346.anInt6451 + Static346.anInt6451;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static57.aBooleanArrayArray7[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static341.anInt2253 - local8.anInt6282;
						if (local153 > 32) {
							local8.anInt6293 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt6293 = 4;
							local153 = -local153;
						}
						local8.anInt6285 = (local8.anInt6292 - Static175.anInt3627 << 8) / local153;
						local8.anInt6283 = (local8.anInt6284 - Static175.anInt3627 << 8) / local153;
						local8.anInt6278 = (local8.anInt6295 - Static35.anInt877 << 8) / local153;
						local8.anInt6290 = (local8.anInt6286 - Static35.anInt877 << 8) / local153;
						Static69.aClass210Array1[Static35.anInt880++] = local8;
					}
				}
			} else if (local8.anInt6291 == 4) {
				local12 = local8.anInt6295 - Static35.anInt877;
				if (local12 > 128) {
					local110 = local8.anInt6289 + Static346.anInt6451 - Static268.anInt5167;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6277 + Static346.anInt6451 - Static268.anInt5167;
					if (local121 > Static346.anInt6451 + Static346.anInt6451) {
						local121 = Static346.anInt6451 + Static346.anInt6451;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt6279 + Static346.anInt6451 - Static199.anInt4061;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt6276 + Static346.anInt6451 - Static199.anInt4061;
						if (local153 > Static346.anInt6451 + Static346.anInt6451) {
							local153 = Static346.anInt6451 + Static346.anInt6451;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static57.aBooleanArrayArray7[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt6293 = 5;
							local8.anInt6285 = (local8.anInt6292 - Static175.anInt3627 << 8) / local12;
							local8.anInt6283 = (local8.anInt6284 - Static175.anInt3627 << 8) / local12;
							local8.anInt6280 = (local8.anInt6282 - Static341.anInt2253 << 8) / local12;
							local8.anInt6287 = (local8.anInt6294 - Static341.anInt2253 << 8) / local12;
							Static69.aClass210Array1[Static35.anInt880++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!qj;B)V")
	public static void method4960(@OriginalArg(0) Class165 arg0) {
		Static48.aClass165_20 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIIIBIIZ)V")
	public static void method4961(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg6 && arg4 == Static58.anInt1291 && arg3 == Static51.anInt5042 && (arg1 == Static47.anInt1095 || Static123.method2195())) {
			return;
		}
		Static58.anInt1291 = arg4;
		Static47.anInt1095 = arg1;
		Static51.anInt5042 = arg3;
		if (Static123.method2195()) {
			Static47.anInt1095 = 0;
		}
		if (arg0) {
			Static72.method1427(28);
		} else {
			Static72.method1427(25);
		}
		Static56.method1211(Static118.aString194, true, Static9.aClass13_1);
		@Pc(52) int local52 = Static182.anInt3775;
		@Pc(54) int local54 = Static161.anInt3315;
		Static182.anInt3775 = (Static58.anInt1291 - (Static48.anInt1107 >> 4)) * 8;
		Static161.anInt3315 = (Static51.anInt5042 - (Static337.anInt6402 >> 4)) * 8;
		Static144.aClass1_Sub1_Sub12_3 = Static342.method1967(Static58.anInt1291 * 8, Static51.anInt5042 * 8);
		Static97.aClass6_1 = null;
		@Pc(87) int local87 = Static182.anInt3775 - local52;
		@Pc(92) int local92 = Static161.anInt3315 - local54;
		@Pc(102) int local102;
		@Pc(110) int local110;
		if (arg0) {
			Static338.anInt6419 = 0;
			local102 = (Static48.anInt1107 - 1) * 128;
			@Pc(108) int local108 = (Static337.anInt6402 - 1) * 128;
			for (local110 = 0; local110 < 32768; local110++) {
				@Pc(116) Class5_Sub3_Sub3_Sub2 local116 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local110];
				if (local116 != null) {
					local116.anInt5047 -= local92 * 128;
					local116.anInt5050 -= local87 * 128;
					if (local116.anInt5050 >= 0 && local102 >= local116.anInt5050 && local116.anInt5047 >= 0 && local116.anInt5047 <= local108) {
						@Pc(157) boolean local157 = true;
						for (@Pc(159) int local159 = 0; local159 < 10; local159++) {
							local116.anIntArray638[local159] -= local87;
							local116.anIntArray637[local159] -= local92;
							if (local116.anIntArray638[local159] < 0 || Static48.anInt1107 <= local116.anIntArray638[local159] || local116.anIntArray637[local159] < 0 || local116.anIntArray637[local159] >= Static337.anInt6402) {
								local157 = false;
							}
						}
						if (local157) {
							Static25.anIntArray83[Static338.anInt6419++] = local110;
						} else {
							Static169.aClass5_Sub3_Sub3_Sub2Array2[local110].method4549(null);
							Static169.aClass5_Sub3_Sub3_Sub2Array2[local110] = null;
						}
					} else {
						Static169.aClass5_Sub3_Sub3_Sub2Array2[local110].method4549(null);
						Static169.aClass5_Sub3_Sub3_Sub2Array2[local110] = null;
					}
				}
			}
		} else {
			for (local102 = 0; local102 < 32768; local102++) {
				@Pc(265) Class5_Sub3_Sub3_Sub2 local265 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local102];
				if (local265 != null) {
					for (local110 = 0; local110 < 10; local110++) {
						local265.anIntArray638[local110] -= local87;
						local265.anIntArray637[local110] -= local92;
					}
					local265.anInt5050 -= local87 * 128;
					local265.anInt5047 -= local92 * 128;
				}
			}
		}
		for (local102 = 0; local102 < 2048; local102++) {
			@Pc(321) Class5_Sub3_Sub3_Sub1 local321 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local102];
			if (local321 != null) {
				for (local110 = 0; local110 < 10; local110++) {
					local321.anIntArray638[local110] -= local87;
					local321.anIntArray637[local110] -= local92;
				}
				local321.anInt5047 -= local92 * 128;
				local321.anInt5050 -= local87 * 128;
			}
		}
		Static285.anInt5511 = arg1;
		Static130.aClass5_Sub3_Sub3_Sub1_1.method3067(arg5, false, arg2, Static285.anInt5511);
		Static176.method3462(local92, local87);
		for (@Pc(385) Class1_Sub21 local385 = (Class1_Sub21) Static51.aClass195_44.method5029(); local385 != null; local385 = (Class1_Sub21) Static51.aClass195_44.method5021()) {
			local385.anInt3653 -= local92;
			local385.anInt3654 -= local87;
			if (local385.anInt3654 < 0 || local385.anInt3653 < 0 || local385.anInt3654 >= Static48.anInt1107 || local385.anInt3653 >= Static337.anInt6402) {
				local385.method5710();
			}
		}
		Static46.anInt1004 = 0;
		if (Static94.anInt1845 != 0) {
			Static94.anInt1845 -= local87;
			Static152.anInt3053 -= local92;
		}
		if (arg0) {
			Static132.anInt2569 -= local92;
			Static221.anInt4363 -= local87 * 128;
			Static93.anInt1786 -= local87;
			Static231.anInt4532 -= local92;
			Static164.anInt3425 -= local92 * 128;
			Static105.anInt2155 -= local87;
			if (Math.abs(local87) > Static48.anInt1107 || Math.abs(local92) > Static337.anInt6402) {
				Static190.method3667();
			}
		} else if (Static81.anInt1609 == 4) {
			Static339.anInt6426 -= local87 * 128;
			Static230.anInt4531 -= local92 * 128;
			Static140.anInt2779 -= local87 * 128;
			Static81.anInt1607 -= local92 * 128;
		} else {
			Static81.anInt1609 = 1;
		}
		Static198.method3732();
		Static227.method4127();
		Static294.aClass195_46.method5032();
		Static49.aClass195_6.method5032();
		Static350.aClass175_8.method4667();
		Static232.method5544();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!eb;ILclient!kq;)V")
	public static void method4962(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class110 arg2) {
		@Pc(17) Class1_Sub18 local17 = new Class1_Sub18();
		local17.anInt2722 = arg0.method3141();
		local17.anInt2723 = arg0.method3125();
		local17.aByteArrayArrayArray4 = new byte[local17.anInt2722][][];
		local17.aClass134Array2 = new Class134[local17.anInt2722];
		local17.anIntArray321 = new int[local17.anInt2722];
		local17.anIntArray320 = new int[local17.anInt2722];
		local17.anIntArray322 = new int[local17.anInt2722];
		local17.aClass134Array1 = new Class134[local17.anInt2722];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt2722; local59++) {
			try {
				@Pc(65) int local65 = arg0.method3141();
				@Pc(85) String local85;
				@Pc(89) String local89;
				@Pc(93) int local93;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local85 = arg0.method3134();
					local89 = arg0.method3134();
					local93 = 0;
					if (local65 == 1) {
						local93 = arg0.method3125();
					}
					local17.anIntArray320[local59] = local65;
					local17.anIntArray322[local59] = local93;
					local17.aClass134Array1[local59] = arg2.method3381(Static107.method2006(local85), local89);
				} else if (local65 == 3 || local65 == 4) {
					local85 = arg0.method3134();
					local89 = arg0.method3134();
					local93 = arg0.method3141();
					@Pc(96) String[] local96 = new String[local93];
					for (@Pc(98) int local98 = 0; local98 < local93; local98++) {
						local96[local98] = arg0.method3134();
					}
					@Pc(117) byte[][] local117 = new byte[local93][];
					@Pc(130) int local130;
					if (local65 == 3) {
						for (@Pc(124) int local124 = 0; local124 < local93; local124++) {
							local130 = arg0.method3125();
							local117[local124] = new byte[local130];
							arg0.method3139(local117[local124], local130);
						}
					}
					local17.anIntArray320[local59] = local65;
					@Pc(159) Class[] local159 = new Class[local93];
					for (local130 = 0; local130 < local93; local130++) {
						local159[local130] = Static107.method2006(local96[local130]);
					}
					local17.aClass134Array2[local59] = arg2.method3354(Static107.method2006(local85), local159, local89);
					local17.aByteArrayArrayArray4[local59] = local117;
				}
			} catch (@Pc(238) ClassNotFoundException local238) {
				local17.anIntArray321[local59] = -1;
			} catch (@Pc(245) SecurityException local245) {
				local17.anIntArray321[local59] = -2;
			} catch (@Pc(252) NullPointerException local252) {
				local17.anIntArray321[local59] = -3;
			} catch (@Pc(259) Exception local259) {
				local17.anIntArray321[local59] = -4;
			} catch (@Pc(266) Throwable local266) {
				local17.anIntArray321[local59] = -5;
			}
		}
		Static244.aClass195_42.method5018(local17);
	}
}
