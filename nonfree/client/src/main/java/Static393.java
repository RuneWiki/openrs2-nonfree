import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public static int anInt6567 = 0;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt6568 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method5204(@OriginalArg(0) Class49 arg0) {
		@Pc(7) int local7 = Static237.anInt4550;
		@Pc(17) int local17 = Static19.anInt5290;
		@Pc(19) int local19 = Static296.anInt5305;
		@Pc(21) int local21 = Static372.anInt2931;
		arg0.method4480(local7, local19, -10660793, local17, local21);
		arg0.method4480(local7 + 1, local19 - 2, -16777216, local17 + 1, 16);
		arg0.method4415(local21 - 19, local17 + 18, local19 - 2, local7 + 1, -16777216);
		Static114.aClass116_1.method4814(local7 + 3, Static360.aClass209_156.method4562(Static388.anInt6533), -1, local17 + 14, -10660793);
		@Pc(80) int local80 = Static109.aClass1_2.method702();
		@Pc(84) int local84 = Static109.aClass1_2.method698();
		@Pc(86) int local86 = 0;
		for (@Pc(91) Class2_Sub22 local91 = (Class2_Sub22) Static248.aClass14_35.method309(); local91 != null; local91 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			@Pc(106) int local106 = (Static373.anInt4900 - local86 - 1) * 16 + local17 + 31;
			@Pc(108) short local108 = -1;
			if (local80 > local7 && local19 + local7 > local80 && local106 - 13 < local84 && local106 + 3 > local84 && local91.aBoolean281) {
				local108 = -256;
			}
			@Pc(145) int[] local145 = null;
			if (Static16.method324(local91.anInt3716)) {
				local145 = Static318.aClass144_6.method3265((int) local91.aLong114).anIntArray81;
			} else if (local91.anInt3720 != -1) {
				local145 = Static318.aClass144_6.method3265(local91.anInt3720).anIntArray81;
			} else if (Static387.method5124(local91.anInt3716)) {
				@Pc(218) Class3_Sub2_Sub1_Sub1 local218 = Static174.aClass3_Sub2_Sub1_Sub1Array1[(int) local91.aLong114];
				if (local218 != null) {
					@Pc(223) Class65 local223 = local218.aClass65_1;
					if (local223.anIntArray155 != null) {
						local223 = local223.method1710(Static344.aClass108_1);
					}
					if (local223 != null) {
						local145 = local223.anIntArray158;
					}
				}
			} else if (Static429.method5145(local91.anInt3716)) {
				@Pc(190) Class134 local190;
				if (local91.anInt3716 == 1006) {
					local190 = Static118.aClass165_2.method3799((int) local91.aLong114);
				} else {
					local190 = Static118.aClass165_2.method3799((int) (local91.aLong114 >>> 32 & 0x7FFFFFFFL));
				}
				if (local190.anIntArray322 != null) {
					local190 = local190.method2969(Static344.aClass108_1);
				}
				if (local190 != null) {
					local145 = local190.anIntArray323;
				}
			}
			@Pc(249) String local249 = Static398.method5260(local91);
			if (local145 != null) {
				local249 = local249 + Static336.method4687(local145);
			}
			Static114.aClass116_1.method4807(local106, Static89.anIntArray160, Static90.aClass17Array3, local249, local7 + 3, local108);
			local86++;
			if (local91.aBoolean282) {
				Static31.aClass17_4.method5767(Static172.aClass58_5.method1340(local249) + local7 + 5, local106 + -12);
			}
		}
		Static138.method2345(Static296.anInt5305, Static372.anInt2931, Static19.anInt5290, Static237.anInt4550);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIFI[FIIIFI)V")
	public static void method5205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg1 - arg6;
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(17) int local17 = arg7 - arg5;
		@Pc(38) float local38 = arg4[0] * (float) local17 + arg4[1] * (float) local5 + arg4[2] * (float) local9;
		@Pc(59) float local59 = (float) local17 * arg4[3] + (float) local5 * arg4[4] + (float) local9 * arg4[5];
		@Pc(80) float local80 = (float) local17 * arg4[6] + (float) local5 * arg4[7] + arg4[8] * (float) local9;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local91 *= arg8;
		}
		@Pc(105) float local105 = arg2 + local59 + 0.5F;
		@Pc(110) float local110;
		if (arg9 == 1) {
			local110 = local91;
			local91 = -local105;
			local105 = local110;
		} else if (arg9 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg9 == 3) {
			local110 = local91;
			local91 = local105;
			local105 = -local110;
		}
		Static434.aFloat102 = local91;
		Static54.aFloat17 = local105;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method5207() {
		Static15.method315(false);
		Static139.anInt2953 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static248.aByteArrayArray36.length; local16++) {
			if (Static86.anIntArray372[local16] != -1 && Static248.aByteArrayArray36[local16] == null) {
				Static248.aByteArrayArray36[local16] = Static368.aClass160_73.method3696(0, Static86.anIntArray372[local16]);
				if (Static248.aByteArrayArray36[local16] == null) {
					local14 = false;
					Static139.anInt2953++;
				}
			}
			if (Static98.anIntArray183[local16] != -1 && Static129.aByteArrayArray22[local16] == null) {
				Static129.aByteArrayArray22[local16] = Static368.aClass160_73.method3701(0, Static182.anIntArrayArray34[local16], Static98.anIntArray183[local16]);
				if (Static129.aByteArrayArray22[local16] == null) {
					local14 = false;
					Static139.anInt2953++;
				}
			}
			if (Static142.anIntArray270[local16] != -1 && Static428.aByteArrayArray59[local16] == null) {
				Static428.aByteArrayArray59[local16] = Static368.aClass160_73.method3696(0, Static142.anIntArray270[local16]);
				if (Static428.aByteArrayArray59[local16] == null) {
					Static139.anInt2953++;
					local14 = false;
				}
			}
			if (Static182.anIntArray313[local16] != -1 && Static423.aByteArrayArray64[local16] == null) {
				Static423.aByteArrayArray64[local16] = Static368.aClass160_73.method3696(0, Static182.anIntArray313[local16]);
				if (Static423.aByteArrayArray64[local16] == null) {
					local14 = false;
					Static139.anInt2953++;
				}
			}
			if (Static300.anIntArray434 != null && Static450.aByteArrayArray63[local16] == null && Static300.anIntArray434[local16] != -1) {
				Static450.aByteArrayArray63[local16] = Static368.aClass160_73.method3701(0, Static182.anIntArrayArray34[local16], Static300.anIntArray434[local16]);
				if (Static450.aByteArrayArray63[local16] == null) {
					Static139.anInt2953++;
					local14 = false;
				}
			}
		}
		if (Static322.aClass153_3 == null) {
			if (Static389.aClass2_Sub5_Sub12_3 == null || !Static323.aClass160_64.method3712(Static389.aClass2_Sub5_Sub12_3.aString51 + "_staticelements")) {
				Static322.aClass153_3 = new Class153(0);
			} else if (Static323.aClass160_64.method3709(Static389.aClass2_Sub5_Sub12_3.aString51 + "_staticelements")) {
				Static322.aClass153_3 = Static149.method2453(Static389.aClass2_Sub5_Sub12_3.aString51 + "_staticelements", Static333.aBoolean406, Static323.aClass160_64);
			} else {
				local14 = false;
				Static139.anInt2953++;
			}
		}
		if (!local14) {
			Static416.anInt6986 = 1;
			return;
		}
		local14 = true;
		Static11.anInt282 = 0;
		@Pc(269) int local269;
		@Pc(279) int local279;
		for (@Pc(250) int local250 = 0; local250 < Static248.aByteArrayArray36.length; local250++) {
			@Pc(256) byte[] local256 = Static129.aByteArrayArray22[local250];
			if (local256 != null) {
				local269 = (Static334.anIntArray494[local250] >> 8) * 64 - Static48.anInt962;
				local279 = (Static334.anIntArray494[local250] & 0xFF) * 64 - Static324.anInt5624;
				if (Static402.anInt6692 != 0) {
					local269 = 10;
					local279 = 10;
				}
				local14 &= Static451.method5831(local269, local279, Static379.anInt6422, Static229.anInt4427, local256);
			}
			local256 = Static423.aByteArrayArray64[local250];
			if (local256 != null) {
				local269 = (Static334.anIntArray494[local250] >> 8) * 64 - Static48.anInt962;
				local279 = (Static334.anIntArray494[local250] & 0xFF) * 64 - Static324.anInt5624;
				if (Static402.anInt6692 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local14 &= Static451.method5831(local269, local279, Static379.anInt6422, Static229.anInt4427, local256);
			}
		}
		if (!local14) {
			Static416.anInt6986 = 2;
			return;
		}
		if (Static416.anInt6986 != 0) {
			Static452.method5851(Static368.aClass116_4, true, Static99.aClass209_54.method4562(Static388.anInt6533) + "<br>(100%)");
		}
		Static112.method2026();
		Static372.method2347();
		@Pc(377) boolean local377 = false;
		if (Static33.aClass49_1.method4442() && Static12.aClass79_Sub1_1.aBoolean354) {
			for (local269 = 0; local269 < Static248.aByteArrayArray36.length; local269++) {
				if (Static423.aByteArrayArray64[local269] != null || Static428.aByteArrayArray59[local269] != null) {
					local377 = true;
					break;
				}
			}
		}
		if (Static12.aClass79_Sub1_1.aBoolean362) {
			local269 = Static421.anIntArray598[Static435.anInt7180];
		} else {
			local269 = Static64.anIntArray125[Static435.anInt7180];
		}
		if (Static33.aClass49_1.method4439()) {
			local269++;
		}
		Static138.method2346(Static229.anInt4427, Static379.anInt6422, local269, local377, Static33.aClass49_1.method4433() > 0);
		for (local279 = 0; local279 < 4; local279++) {
			Static194.aClass70Array1[local279].method1797();
		}
		Static364.method4968();
		Static386.method5102(false);
		Static105.method1944();
		Static441.aClass242_2 = null;
		Static112.method2026();
		System.gc();
		Static15.method315(true);
		Static305.method4333();
		Static381.anInt6276 = Static12.aClass79_Sub1_1.method3960(Static399.anInt6653);
		Static324.aBoolean399 = Static7.anInt219 >= 96;
		Static398.aBoolean449 = Static12.aClass79_Sub1_1.aBoolean354;
		Static158.aBoolean247 = Static12.aClass79_Sub1_1.method3959(Static399.anInt6653);
		Static329.aBoolean401 = !Static12.aClass79_Sub1_1.aBoolean365;
		Static175.anInt3463 = Static12.aClass79_Sub1_1.method3966(Static399.anInt6653) ? -1 : Static427.anInt7117;
		Static100.aBoolean169 = Static399.anInt6653 == 1 || Static12.aClass79_Sub1_1.aBoolean351;
		Static65.aBoolean90 = Static12.aClass79_Sub1_1.aBoolean352;
		Static55.aClass23_Sub1_1 = new Class23_Sub1(4, Static229.anInt4427, Static379.anInt6422, false);
		if (Static402.anInt6692 == 0) {
			Static401.method5279(Static55.aClass23_Sub1_1, Static248.aByteArrayArray36);
		} else {
			Static359.method4893(Static248.aByteArrayArray36, Static55.aClass23_Sub1_1);
		}
		Static167.method2725(Static229.anInt4427 >> 4, Static379.anInt6422 >> 4);
		Static415.method5521();
		if (local377) {
			Static423.method5843(true);
			Static347.aClass23_Sub1_2 = new Class23_Sub1(1, Static229.anInt4427, Static379.anInt6422, true);
			if (Static402.anInt6692 == 0) {
				Static401.method5279(Static347.aClass23_Sub1_2, Static428.aByteArrayArray59);
				Static15.method315(true);
			} else {
				Static359.method4893(Static428.aByteArrayArray59, Static347.aClass23_Sub1_2);
				Static15.method315(true);
			}
			Static347.aClass23_Sub1_2.method4074(Static55.aClass23_Sub1_1.anIntArrayArrayArray9[0]);
			Static347.aClass23_Sub1_2.method4075(Static33.aClass49_1, null, null);
			Static423.method5843(false);
		}
		Static55.aClass23_Sub1_1.method4075(Static33.aClass49_1, Static194.aClass70Array1, local377 ? Static347.aClass23_Sub1_2.anIntArrayArrayArray9 : null);
		if (Static402.anInt6692 == 0) {
			Static15.method315(true);
			Static275.method4059(Static55.aClass23_Sub1_1, Static129.aByteArrayArray22);
			if (Static450.aByteArrayArray63 != null) {
				Static8.method203();
			}
		} else {
			Static15.method315(true);
			Static386.method5101(Static55.aClass23_Sub1_1, Static129.aByteArrayArray22);
		}
		Static372.method2347();
		Static15.method315(true);
		Static55.aClass23_Sub1_1.method4079(local377 ? Static440.aClass64Array3[0] : null, null, Static33.aClass49_1);
		Static55.aClass23_Sub1_1.method4090(Static33.aClass49_1);
		Static15.method315(true);
		if (local377) {
			Static423.method5843(true);
			Static15.method315(true);
			if (Static402.anInt6692 == 0) {
				Static275.method4059(Static347.aClass23_Sub1_2, Static423.aByteArrayArray64);
			} else {
				Static386.method5101(Static347.aClass23_Sub1_2, Static423.aByteArrayArray64);
			}
			Static372.method2347();
			Static15.method315(true);
			Static347.aClass23_Sub1_2.method4079(null, Static263.aClass64Array2[0], Static33.aClass49_1);
			Static347.aClass23_Sub1_2.method4090(Static33.aClass49_1);
			Static15.method315(true);
			Static423.method5843(false);
		}
		Static387.method5128();
		@Pc(714) int local714 = Static55.aClass23_Sub1_1.anInt5085;
		if (local714 > Static383.anInt6436) {
			local714 = Static383.anInt6436;
		}
		if (local714 < Static383.anInt6436 - 1) {
			local714 = Static383.anInt6436 - 1;
		}
		if (Static12.aClass79_Sub1_1.method3966(Static399.anInt6653)) {
			Static206.method3257(0);
		} else {
			Static206.method3257(local714);
		}
		@Pc(750) int local750;
		@Pc(754) int local754;
		for (@Pc(746) int local746 = 0; local746 < 4; local746++) {
			for (local750 = 0; local750 < Static229.anInt4427; local750++) {
				for (local754 = 0; local754 < Static379.anInt6422; local754++) {
					Static181.method2904(local746, local754, local750);
				}
			}
		}
		Static391.method3870();
		Static112.method2026();
		Static92.method2436();
		Static372.method2347();
		Static23.aBoolean27 = false;
		Static334.method4663();
		if (Static149.aFrame4 != null && Static34.aClass34_2 != null && Static162.anInt3250 == 25) {
			Static159.method2586(Static254.aClass54_68);
			Static424.aClass2_Sub23_Sub2_1.method5506(1057001181);
		}
		if (Static402.anInt6692 == 0) {
			local750 = (Static455.anInt5548 - (Static229.anInt4427 >> 4)) / 8;
			local754 = (Static455.anInt5548 + (Static229.anInt4427 >> 4)) / 8;
			@Pc(839) int local839 = (Static376.anInt6396 - (Static379.anInt6422 >> 4)) / 8;
			@Pc(847) int local847 = ((Static379.anInt6422 >> 4) + Static376.anInt6396) / 8;
			for (@Pc(851) int local851 = local750 - 1; local851 <= local754 + 1; local851++) {
				for (@Pc(857) int local857 = local839 - 1; local857 <= local847 + 1; local857++) {
					if (local851 < local750 || local754 < local851 || local839 > local857 || local847 < local857) {
						Static368.aClass160_73.method3725("m" + local851 + "_" + local857);
						Static368.aClass160_73.method3725("l" + local851 + "_" + local857);
					}
				}
			}
		}
		if (Static162.anInt3250 == 28) {
			Static365.method4986(10);
		} else {
			Static365.method4986(30);
			if (Static34.aClass34_2 != null) {
				Static159.method2586(Static331.aClass54_82);
			}
		}
		Static322.method4527();
		Static112.method2026();
		Static136.method2313();
	}
}
