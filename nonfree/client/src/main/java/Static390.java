import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_95 = new Class11(5, 6);

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_64 = new Class160(8);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!vc;IILclient!de;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5659(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static350.aClass63_8 = arg0;
		Static34.anInt730 = arg1;
		Static347.aClass44_4 = arg3;
		Static31.aBoolean56 = Static350.aClass63_8.method1990() > 0;
		Static322.anInt5531 = arg4 >> Static333.anInt5694;
		Static314.anInt5359 = arg6 >> Static333.anInt5694;
		Static203.anInt3750 = arg4;
		Static64.anInt1275 = arg6;
		Static149.anInt6259 = arg5;
		Static351.anInt6590 = Static322.anInt5531 - Static309.anInt5190;
		if (Static351.anInt6590 < 0) {
			Static185.anInt3482 = -Static351.anInt6590;
			Static351.anInt6590 = 0;
		} else {
			Static185.anInt3482 = 0;
		}
		client.lb = Static314.anInt5359 - Static309.anInt5190;
		if (client.lb < 0) {
			Static271.anInt4712 = -client.lb;
			client.lb = 0;
		} else {
			Static271.anInt4712 = 0;
		}
		Static292.anInt5075 = Static322.anInt5531 + Static309.anInt5190;
		if (Static292.anInt5075 > Static12.anInt312) {
			Static292.anInt5075 = Static12.anInt312;
		}
		Static333.anInt5691 = Static314.anInt5359 + Static309.anInt5190;
		if (Static333.anInt5691 > Static341.anInt5833) {
			Static333.anInt5691 = Static341.anInt5833;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static309.anInt5190 + Static309.anInt5190 + 2; local74++) {
			for (local77 = 0; local77 < Static309.anInt5190 + Static309.anInt5190 + 2; local77++) {
				local84 = Static322.anInt5531 + local74 - Static309.anInt5190;
				local90 = Static314.anInt5359 + local77 - Static309.anInt5190;
				if (local84 >= 0 && local90 >= 0 && local84 < Static12.anInt312 && local90 < Static341.anInt5833) {
					@Pc(104) int local104 = local84 << Static333.anInt5694;
					@Pc(108) int local108 = local90 << Static333.anInt5694;
					@Pc(120) int local120 = Static90.aClass107Array1[Static90.aClass107Array1.length - 1].method4685(local84, local90) - 1000;
					@Pc(140) int local140 = Static94.aClass107Array2 == null ? Static90.aClass107Array1[0].method4685(local84, local90) + Static180.anInt6489 : Static94.aClass107Array2[0].method4685(local84, local90) + Static180.anInt6489;
					Static360.aBooleanArrayArray7[local74][local77] = Static350.aClass63_8.method1983(local104, local120, local108, local104, local140, local108);
				} else {
					Static360.aBooleanArrayArray7[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static309.anInt5190 + Static309.anInt5190 + 1; local77++) {
			for (local84 = 0; local84 < Static309.anInt5190 + Static309.anInt5190 + 1; local84++) {
				Static199.aBooleanArrayArray4[local77][local84] = Static360.aBooleanArrayArray7[local77][local84] || Static360.aBooleanArrayArray7[local77 + 1][local84] || Static360.aBooleanArrayArray7[local77][local84 + 1] || Static360.aBooleanArrayArray7[local77 + 1][local84 + 1];
			}
		}
		Static243.anIntArray842 = arg8;
		Static125.anIntArray532 = arg9;
		Static162.anIntArray621 = arg10;
		Static171.anIntArray645 = arg11;
		Static345.anIntArray1356 = arg12;
		Static110.method2276();
		Static57.method3260();
		for (@Pc(256) Class10_Sub3 local256 = (Class10_Sub3) Static200.aClass154_6.method3479(); local256 != null; local256 = (Class10_Sub3) Static200.aClass154_6.method3483()) {
			local256.method4605();
			Static13.method259(local256);
		}
		if (Static31.aBoolean56) {
			for (local90 = 0; local90 < Static104.anInt2157; local90++) {
				Static386.aClass2_Sub17_Sub1Array3[local90].method1936(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static350.aClass63_8.method2042(0);
			if (Static305.aClass29_1 == null || Static305.aClass29_1 instanceof Class29_Sub1) {
				Static305.aClass29_1 = new Class29_Sub2();
			}
		} else if (Static305.aClass29_1 == null || Static305.aClass29_1 instanceof Class29_Sub2) {
			Static305.aClass29_1 = new Class29_Sub1();
		}
		Static305.aClass29_1.method4190(arg2);
		Static305.aClass29_1.method4188();
		if (Static232.aClass251ArrayArrayArray2 != null) {
			Static184.method3175(true);
			Static305.aClass29_1.method4194(22);
			Static246.method3933(arg2, null, 0, (byte) 0, arg15, arg16);
			Static305.aClass29_1.method4188();
			Static305.aClass29_1.method4194(23);
			Static184.method3175(false);
		}
		Static246.method3933(arg2, arg7, arg13, arg14, arg15, arg16);
		Static305.aClass29_1.method4188();
		Static305.aClass29_1.method4184();
		Static305.aClass29_1.method4188();
		if (arg2 > 1) {
			Static350.aClass63_8.method2044(0);
		}
		Static350.aClass63_8.method2011(0, null);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!wg;Z)V")
	public static void method5662(@OriginalArg(1) Class1_Sub5_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static285.anInt4946 >= 400) {
			return;
		}
		@Pc(12) Class133 local12 = arg0.aClass133_1;
		if (local12.anIntArray653 != null) {
			local12 = local12.method3094(Static321.aClass211_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean262) {
			return;
		}
		@Pc(34) String local34 = local12.aString36;
		if (local12.anInt3364 != 0) {
			@Pc(52) String local52 = Static275.aClass150_3 == Static119.aClass150_1 ? Static5.aClass32_3.method701(Static107.anInt2498) : Static79.aClass32_70.method701(Static107.anInt2498);
			local34 = local34 + Static324.method4798(local12.anInt3364, Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300) + " (" + local52 + local12.anInt3364 + ")";
		}
		if (!Static110.aBoolean180) {
			if (!arg1) {
				@Pc(144) String[] local144 = local12.aStringArray81;
				if (Static386.aBoolean469) {
					local144 = Static100.method1949(local144);
				}
				@Pc(154) int local154;
				if (local144 != null) {
					for (local154 = 4; local154 >= 0; local154--) {
						if (local144[local154] != null && (Static195.aClass150_2 != Static275.aClass150_3 || !local144[local154].equalsIgnoreCase(Static258.aClass32_66.method701(Static107.anInt2498)))) {
							@Pc(174) byte local174 = 0;
							@Pc(176) int local176 = Static181.anInt6176;
							if (local154 == 0) {
								local174 = 8;
							}
							if (local154 == 1) {
								local174 = 9;
							}
							if (local154 == 2) {
								local174 = 50;
							}
							if (local154 == 3) {
								local174 = 30;
							}
							if (local154 == 4) {
								local174 = 46;
							}
							if (local154 == local12.anInt3341) {
								local176 = local12.anInt3339;
							}
							if (local12.anInt3362 == local154) {
								local176 = local12.anInt3369;
							}
							Static137.method4192(false, "<col=ffff00>" + local34, true, local144[local154], 0, (long) arg0.anInt6413, local174, 0, -1, local176);
						}
					}
				}
				if (Static195.aClass150_2 == Static275.aClass150_3 && local144 != null) {
					for (local154 = 4; local154 >= 0; local154--) {
						if (local144[local154] != null && local144[local154].equalsIgnoreCase(Static258.aClass32_66.method701(Static107.anInt2498))) {
							@Pc(271) short local271 = 0;
							if (local12.anInt3364 > Static206.aClass1_Sub5_Sub1_Sub1_1.anInt2300) {
								local271 = 2000;
							}
							@Pc(284) short local284 = 0;
							if (local154 == 0) {
								local284 = 8;
							}
							if (local154 == 1) {
								local284 = 9;
							}
							if (local154 == 2) {
								local284 = 50;
							}
							if (local154 == 3) {
								local284 = 30;
							}
							if (local154 == 4) {
								local284 = 46;
							}
							if (local284 != 0) {
								local284 += local271;
							}
							Static137.method4192(false, "<col=ffff00>" + local34, true, local144[local154], 0, (long) arg0.anInt6413, local284, 0, -1, local12.anInt3370);
						}
					}
				}
			}
			Static137.method4192(arg1, "<col=ffff00>" + local34, true, Static298.aClass32_80.method701(Static107.anInt2498), 0, (long) arg0.anInt6413, 1011, 0, -1, Static316.anInt5408);
		} else if (!arg1) {
			@Pc(89) Class144 local89 = Static317.anInt5417 == -1 ? null : Static261.aClass125_2.method2922(Static317.anInt5417);
			if ((Static33.anInt698 & 0x2) != 0) {
				if (local89 == null || local12.method3090(Static317.anInt5417, local89.anInt3627) != local89.anInt3627) {
					Static137.method4192(false, Static217.aString47 + " -> <col=ffff00>" + local34, true, Static391.aString68, 0, (long) arg0.anInt6413, 18, 0, -1, Static345.anInt6624);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBII)V")
	public static void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg3, 4);
		local8.method864();
		local8.anInt1028 = arg0;
		local8.anInt1027 = arg1;
		local8.anInt1037 = arg2;
	}
}
