import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "[Lclient!cia;")
	public static Class53[] aClass53Array1;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	public static int anInt3131;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static70.aBoolean94 = true;
		Static397.aBoolean513 = Static568.aClass82_14.method6131() > 0;
		Static120.aBoolean206 = true;
		Static281.anInt5392 = arg1 >> Static485.anInt8241;
		Static394.anInt7055 = arg3 >> Static485.anInt8241;
		Static540.anInt9068 = arg1;
		Static536.anInt9043 = arg3;
		Static486.anInt8250 = arg2;
		Static451.anInt7672 = Static281.anInt5392 - Static361.anInt6683;
		if (Static451.anInt7672 < 0) {
			Static326.anInt6209 = -Static451.anInt7672;
			Static451.anInt7672 = 0;
		} else {
			Static326.anInt6209 = 0;
		}
		Static584.anInt9489 = Static394.anInt7055 - Static361.anInt6683;
		if (Static584.anInt9489 < 0) {
			Static137.anInt2837 = -Static584.anInt9489;
			Static584.anInt9489 = 0;
		} else {
			Static137.anInt2837 = 0;
		}
		Static244.anInt4815 = Static281.anInt5392 + Static361.anInt6683;
		if (Static244.anInt4815 > Static573.anInt6750) {
			Static244.anInt4815 = Static573.anInt6750;
		}
		Static307.anInt5985 = Static394.anInt7055 + Static361.anInt6683;
		if (Static307.anInt5985 > Static547.anInt9143) {
			Static307.anInt5985 = Static547.anInt9143;
		}
		@Pc(72) boolean[][] local72 = Static140.aBooleanArrayArray2;
		@Pc(74) boolean[][] local74 = Static642.aBooleanArrayArray7;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static120.aBoolean206) {
			for (local78 = 0; local78 < Static361.anInt6683 + Static361.anInt6683 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static361.anInt6683 + Static361.anInt6683 + 2; local85++) {
					if (local85 > 1) {
						Static549.anIntArray573[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static281.anInt5392 + local78 - Static361.anInt6683;
					@Pc(109) int local109 = Static394.anInt7055 + local85 - Static361.anInt6683;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static573.anInt6750 && local109 < Static547.anInt9143) {
						local123 = local103 << Static485.anInt8241;
						@Pc(127) int local127 = local109 << Static485.anInt8241;
						@Pc(144) int local144 = Static518.aClass91Array2[Static518.aClass91Array2.length - 1].method7724(local109, local103) - (0x3E8 << Static485.anInt8241 - 7);
						@Pc(166) int local166 = Static485.aClass91Array1 == null ? Static518.aClass91Array2[0].method7724(local109, local103) + Static188.anInt3555 : Static485.aClass91Array1[0].method7724(local109, local103) + Static188.anInt3555;
						local83 = arg15 >= 0 ? Static568.aClass82_14.r(local123, local144, local127, local123, local166, local127, arg15) : Static568.aClass82_14.JA(local123, local144, local127, local123, local166, local127);
						Static642.aBooleanArrayArray7[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static642.aBooleanArrayArray7[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static549.anIntArray573[local85 - 1] & Static549.anIntArray573[local85] & local81 & local83;
						Static140.aBooleanArrayArray2[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static549.anIntArray573[Static361.anInt6683 + Static361.anInt6683] = local81;
				Static549.anIntArray573[Static361.anInt6683 + Static361.anInt6683 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static70.aBoolean94 = false;
			} else {
				Static29.anIntArray34 = arg5;
				Static317.anIntArray335 = arg6;
				Static611.anIntArray633 = arg7;
				Static12.anIntArray25 = arg8;
				Static336.anIntArray345 = arg9;
				Static63.method1055(arg10, Static568.aClass82_14);
			}
		} else {
			if (Static9.aBooleanArrayArray1 == null) {
				Static9.aBooleanArrayArray1 = new boolean[Static573.anInt6750 + Static573.anInt6750 + 1][Static547.anInt9143 + Static573.anInt6750 + 1];
			}
			for (local78 = 0; local78 < Static9.aBooleanArrayArray1.length; local78++) {
				for (local81 = 0; local81 < Static9.aBooleanArrayArray1[0].length; local81++) {
					Static9.aBooleanArrayArray1[local78][local81] = true;
				}
			}
			Static642.aBooleanArrayArray7 = Static9.aBooleanArrayArray1;
			Static140.aBooleanArrayArray2 = Static9.aBooleanArrayArray1;
			Static451.anInt7672 = 0;
			Static584.anInt9489 = 0;
			Static244.anInt4815 = Static573.anInt6750;
			Static307.anInt5985 = Static547.anInt9143;
			Static70.aBoolean94 = false;
		}
		Static314.method5247(Static568.aClass82_14);
		if (!Static460.aClass47_3.aBoolean83) {
			@Pc(349) Class139 local349 = Static460.aClass47_3.aClass139_1;
			for (@Pc(354) Class9_Sub10 local354 = (Class9_Sub10) local349.method3198(); local354 != null; local354 = (Class9_Sub10) local349.method3205()) {
				local354.method8593();
				Static139.method2379(local354);
			}
		}
		if (Static397.aBoolean513) {
			for (local78 = 0; local78 < Static162.anInt3228; local78++) {
				Static209.aClass339Array1[local78].method8103(arg0, arg14);
			}
		}
		if (Static302.aBoolean437) {
			Static616.anIntArray638 = Static568.aClass82_14.Y();
			Static568.aClass82_14.K(Static90.anIntArray527);
			local78 = (Static90.anIntArray527[2] - Static90.anIntArray527[0]) / Static376.anInt10191;
			for (local81 = 0; local81 < Static376.anInt10191 - 1; local81++) {
				Static127.anIntArray170[local81] = local78 * (local81 + 1) + Static48.anIntArray589[local81];
			}
			for (local83 = 0; local83 < Static70.aClass301Array1.length; local83++) {
				Static70.aClass301Array1[local83].method7372();
			}
		}
		if (Static126.aClass351ArrayArrayArray1 != null) {
			if (Static302.aBoolean437) {
				Static14.method243(0);
			}
			Static623.method8471(true);
			Static568.aClass82_14.ra(-1, 1583160, 40, 127);
			Static138.method2373(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static302.aBoolean437) {
				Static439.method7993();
			}
			Static568.aClass82_14.pa();
			Static623.method8471(false);
		}
		Static138.method2373(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static302.aBoolean437) {
			for (local78 = 0; local78 < Static603.anInt9778; local78++) {
				Static412.aBooleanArrayArrayArray2[local78] = Static38.aBooleanArrayArrayArray1[local78];
			}
			Static14.method243(0);
			for (local81 = 0; local81 < Static70.aClass301Array1.length; local81++) {
				Static70.aClass301Array1[local81].method7372();
			}
		}
		if (Static302.aBoolean437) {
			Static439.method7993();
			for (local78 = 0; local78 < Static603.anInt9778; local78++) {
				Static38.aBooleanArrayArrayArray1[local78] = Static412.aBooleanArrayArrayArray2[local78];
			}
			if (Static67.anInt1336 == 2) {
				@Pc(543) int local543;
				if (Static24.aLongArray1[0] < Static24.aLongArray1[1]) {
					if (Static127.anIntArray170[0] + Static48.anIntArray589[0] > Static90.anIntArray527[0]) {
						local543 = Static48.anIntArray589[0]++;
					}
				} else if (Static24.aLongArray1[0] > Static24.aLongArray1[1] && Static127.anIntArray170[0] + Static48.anIntArray589[0] < Static90.anIntArray527[2]) {
					local543 = Static48.anIntArray589[0]--;
				}
			}
		}
		if (!Static120.aBoolean206) {
			Static140.aBooleanArrayArray2 = local72;
			Static642.aBooleanArrayArray7 = local74;
		}
		Static205.method7242();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[[[BI[I[I[IIZII[I[IBIZII)V")
	public static void method2716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int[] arg9, @OriginalArg(12) int[] arg10, @OriginalArg(13) byte arg11, @OriginalArg(14) int arg12, @OriginalArg(15) boolean arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15) {
		if (Static424.anInt7715 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static366.aClass82_11.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static424.anInt7715 == 1) {
			local33 = (int) ((double) local29 * (double) Static15.anInt239 / (double) Static606.anInt9796);
			local31 = (int) ((double) Static15.anInt239 * (double) local25 / (double) Static606.anInt9796);
		}
		if (!Static334.aBoolean462) {
			if (Static424.anInt7715 == 1) {
				Static13.method238();
			}
			@Pc(73) int local73 = arg0 - Static196.anInt3667;
			@Pc(78) int local78 = arg15 - Static259.anInt5051;
			@Pc(82) int local82 = arg1 - Static70.anInt1418;
			@Pc(104) int local104 = (int) ((Static328.aDouble13 * (double) local82 + Static114.aDouble3 * (double) local78 + Static509.aDouble17 * (double) local73) * (double) local31 / (double) arg8);
			@Pc(126) int local126 = (int) ((double) local33 * (Static208.aDouble6 * (double) local78 + Static184.aDouble5 * (double) local73 + (double) local82 * Static350.aDouble14) / (double) arg8);
			@Pc(141) double local141 = Static109.aDouble2 * (double) local82 + (double) local73 * Static374.aDouble12 + Static498.aDouble19 * (double) local78;
			@Pc(148) int local148 = Static50.anInt989 + local104 - Static73.anInt1442;
			@Pc(155) int local155 = Static374.anInt6012 + local126 - Static130.anInt2758;
			@Pc(159) int local159 = Static456.anInt7760 + local148;
			@Pc(164) int local164 = local155 + Static15.anInt239;
			if (local148 >= 0 && local155 >= 0 && Static646.anInt4677 >= local159 && local164 <= Static606.anInt9796 || Static424.anInt7715 == 2) {
				Static520.anInt8806 = local148;
				if (Static424.anInt7715 == 2) {
					Static24.aDouble1 = -local141;
				}
				Static2.anInt5 = local155;
			} else if (local159 > 0 && local164 > 0 && local148 < Static646.anInt4677 && Static606.anInt9796 > local155) {
				@Pc(211) int local211 = local148 - Static50.anInt989;
				@Pc(216) int local216 = local155 - Static374.anInt6012;
				@Pc(218) int local218 = 0;
				@Pc(220) int local220 = 0;
				@Pc(222) int local222 = 0;
				@Pc(224) int local224 = 0;
				@Pc(226) double local226 = 0.0D;
				if (Static424.anInt7715 == 0) {
					local226 = local141 + Static24.aDouble1;
					local220 = local216;
					local218 = local211;
				} else if (Static424.anInt7715 == 1) {
					local222 = local211 / Static557.anInt9256;
					local224 = local216 / Static126.anInt2688;
					local218 = local222 * Static557.anInt9256;
					local220 = Static126.anInt2688 * local224;
					local226 = (Static24.aDouble1 + local141) * (double) (local211 * local218 + local220 * local216) / (double) (local216 * local216 + local211 * local211);
				}
				local226 = -local226;
				@Pc(289) int local289 = 0;
				@Pc(291) int local291 = 0;
				@Pc(293) int local293 = 0;
				@Pc(295) int local295 = 0;
				@Pc(297) int local297 = 0;
				@Pc(299) int local299 = 0;
				@Pc(303) int local303;
				@Pc(308) int local308;
				@Pc(310) int local310;
				@Pc(324) int local324;
				if (local218 >= 0) {
					local303 = 0;
					local308 = Static646.anInt4677 - local218;
					local310 = local308;
					if (Static424.anInt7715 == 1) {
						local293 = Static492.anInt8358 - local222;
						local297 = local222;
					}
					local324 = local218;
				} else {
					local310 = 0;
					local308 = local218 + Static646.anInt4677;
					local303 = -local218;
					if (Static424.anInt7715 == 1) {
						local293 = 0;
						local297 = -local222;
					}
					local324 = local303;
				}
				@Pc(352) int local352;
				@Pc(357) int local357;
				@Pc(379) int local379;
				@Pc(359) int local359;
				@Pc(377) int local377;
				if (local220 >= 0) {
					local352 = 0;
					local357 = Static606.anInt9796 - local220;
					local359 = local220;
					if (Static424.anInt7715 == 1) {
						local289 = Static515.anInt8713 - local224;
						local295 = 0;
						local291 = local224;
						local299 = local289;
					}
					local377 = 0;
					local379 = local357;
				} else {
					local352 = -local220;
					local357 = local220 + Static606.anInt9796;
					local379 = 0;
					local359 = local352;
					if (Static424.anInt7715 == 1) {
						local289 = 0;
						local291 = -local224;
						local295 = local291;
						local299 = Static515.anInt8713 + local224;
					}
					local377 = local352;
				}
				@Pc(414) Class139 local414 = Static172.aClass47_1.aClass139_1;
				@Pc(428) int local428;
				for (@Pc(419) Class9_Sub10 local419 = (Class9_Sub10) local414.method3198(); local419 != null; local419 = (Class9_Sub10) local414.method3205()) {
					@Pc(424) Class9_Sub5[] local424 = local419.aClass9_Sub5Array1;
					@Pc(426) boolean local426 = true;
					for (local428 = 0; local428 < local424.length; local428++) {
						@Pc(434) Class9_Sub5 local434 = local424[local428];
						@Pc(437) int local437 = local434.anInt5910;
						@Pc(440) int local440 = local434.anInt5909;
						@Pc(443) int local443 = local434.anInt5912;
						@Pc(446) int local446 = local434.anInt5911;
						@Pc(453) int local453;
						local434.anInt5909 = local453 = local440 - local220;
						@Pc(460) int local460;
						local434.anInt5912 = local460 = local443 - local218;
						@Pc(464) int local464 = local434.anInt5913;
						@Pc(470) int local470;
						local434.anInt5911 = local470 = local446 - local220;
						@Pc(477) int local477;
						local434.anInt5910 = local477 = local437 - local218;
						if (local426) {
							@Pc(490) int local490 = (local477 < local460 ? local477 : local460) - local464;
							if (Static646.anInt4677 >= local490) {
								@Pc(503) int local503 = (local453 >= local470 ? local470 : local453) - local464;
								if (Static606.anInt9796 >= local503) {
									@Pc(516) int local516 = (local460 > local477 ? local460 : local477) + local464;
									if (local516 >= 0) {
										@Pc(527) int local527 = local464 + (local453 >= local470 ? local453 : local470);
										if (local527 >= 0) {
											local426 = false;
										}
									}
								}
							}
						}
					}
					if (local426) {
						local419.method8593();
						Static139.method2379(local419);
					}
				}
				if (Static424.anInt7715 == 0) {
					Static366.aClass82_11.method6141(Static115.anInterface7_2);
				}
				Static366.aClass82_11.F(-local218, -local220);
				Static366.aClass82_11.b(local303, local352, local308, local357, local226);
				Static159.method2763(Static24.aDouble1 + local226);
				Static124.aDouble4 = Static24.aDouble1 + local226;
				if (Static424.anInt7715 == 1) {
					Static458.anInt7787 = local17 - Static73.anInt1442 - local218;
					Static23.anInt339 = local33;
					Static269.anInt5260 = local31;
					Static183.anInt3464 = local21 - Static130.anInt2758 - local220;
					Static366.aClass82_11.DA(Static458.anInt7787, Static183.anInt3464, Static269.anInt5260, Static23.anInt339);
				} else {
					Static269.anInt5260 = local31;
					Static183.anInt3464 = Static374.anInt6012 + local21 - Static130.anInt2758 - local220;
					Static458.anInt7787 = local17 + Static50.anInt989 - local218 - Static73.anInt1442;
					Static23.anInt339 = local33;
					Static366.aClass82_11.DA(Static458.anInt7787, Static183.anInt3464, Static269.anInt5260, Static23.anInt339);
				}
				Static260.method4361(Static172.aClass47_1);
				if (local359 > 0) {
					Static366.aClass82_11.KA(0, local379, Static646.anInt4677, local359 + local379);
					Static366.aClass82_11.ya();
					Static366.aClass82_11.GA(Static489.anInt8327);
					method2715(arg14, arg0, arg15, arg1, arg2, arg4, arg5, arg9, arg10, arg6, arg3, arg11, arg7, arg12, arg13, arg8, 1, false);
				}
				if (local324 > 0) {
					Static366.aClass82_11.KA(local310, local377, local324 + local310, local357 + local377);
					Static366.aClass82_11.ya();
					Static366.aClass82_11.GA(Static489.anInt8327);
					method2715(arg14, arg0, arg15, arg1, arg2, arg4, arg5, arg9, arg10, arg6, arg3, arg11, arg7, arg12, arg13, arg8, 1, false);
				}
				Static366.aClass82_11.la();
				Static270.method4508();
				if (Static424.anInt7715 == 0) {
					Static366.aClass82_11.method6167();
				}
				Static24.aDouble1 += local226;
				Static130.anInt2758 += local220;
				Static73.anInt1442 += local218;
				Static520.anInt8806 = Static50.anInt989 + local104 - Static73.anInt1442;
				Static2.anInt5 = local126 + Static374.anInt6012 - Static130.anInt2758;
				if (Static424.anInt7715 == 1) {
					Static229.anInt4626 += local224;
					Static38.anInt732 += local222;
					for (@Pc(766) int local766 = 0; local766 < Static515.anInt8713; local766++) {
						@Pc(778) int local778 = Static459.method6825(Static515.anInt8713, local766 + Static229.anInt4626) * Static492.anInt8358;
						for (local428 = 0; local428 < Static492.anInt8358; local428++) {
							@Pc(791) int local791 = local778 + Static459.method6825(Static492.anInt8358, local428 + Static38.anInt732);
							@Pc(827) boolean local827 = local289 <= local766 && local291 + local289 > local766 || local295 <= local766 && local766 < local299 + local295 && local428 >= local293 && local428 < local297 + local293;
							Static494.anInterface7Array1[local791].method8436(local428 * Static557.anInt9256, Static126.anInt2688 * local766, Static557.anInt9256, Static126.anInt2688, local827);
						}
					}
				}
			} else {
				Static334.aBoolean462 = true;
			}
		}
		if (Static334.aBoolean462) {
			Static130.anInt2758 = 0;
			Static520.anInt8806 = Static50.anInt989;
			Static259.anInt5051 = arg15;
			Static24.aDouble1 = 0.0D;
			Static196.anInt3667 = arg0;
			Static73.anInt1442 = 0;
			Static70.anInt1418 = arg1;
			Static2.anInt5 = Static374.anInt6012;
			if (Static424.anInt7715 == 0) {
				Static366.aClass82_11.method6141(Static115.anInterface7_2);
			}
			Static366.aClass82_11.la();
			Static366.aClass82_11.ya();
			Static366.aClass82_11.GA(Static489.anInt8327);
			Static376.aClass31_44.method7919(Static196.anInt3667, Static259.anInt5051, Static70.anInt1418, Static495.anInt8393, Static107.anInt2177, Static16.anInt245);
			Static366.aClass82_11.method6160(Static376.aClass31_44);
			if (Static424.anInt7715 == 1) {
				Static23.anInt339 = local33;
				Static269.anInt5260 = local31;
				Static458.anInt7787 = local17;
				Static183.anInt3464 = local21;
				Static366.aClass82_11.DA(Static458.anInt7787, Static183.anInt3464, Static269.anInt5260, Static23.anInt339);
			} else {
				Static183.anInt3464 = local21 + Static374.anInt6012;
				Static269.anInt5260 = local31;
				Static458.anInt7787 = Static50.anInt989 + local17;
				Static23.anInt339 = local33;
				Static366.aClass82_11.DA(Static458.anInt7787, Static183.anInt3464, Static269.anInt5260, Static23.anInt339);
			}
			Static124.aDouble4 = 0.0D;
			Static172.aClass47_1.method1162();
			Static260.method4361(Static172.aClass47_1);
			method2715(arg14, arg0, arg15, arg1, arg2, arg4, arg5, arg9, arg10, arg6, arg3, arg11, arg7, arg12, arg13, arg8, 1, false);
			Static270.method4508();
			Static334.aBoolean462 = false;
			if (Static424.anInt7715 == 0) {
				Static366.aClass82_11.method6167();
			}
			if (Static424.anInt7715 == 1) {
				Static170.method2827();
			}
		}
		if (Static424.anInt7715 == 0) {
			Static115.anInterface7_2.method8435(Static520.anInt8806, Static2.anInt5, Static456.anInt7760, Static15.anInt239, 0, 0);
		}
		Static624.anInt9972++;
		Static159.method2763(Static24.aDouble1);
		Static298.aDouble9 = Static24.aDouble1;
		if (Static424.anInt7715 == 0 || Static424.anInt7715 == 2) {
			if (Static424.anInt7715 == 2) {
				Static366.aClass82_11.GA(Static489.anInt8327);
				Static366.aClass82_11.ya();
			}
			Static485.anInt8242 = local31;
			Static202.anInt3744 = local33;
			Static350.anInt6508 = Static374.anInt6012 + local21 - Static130.anInt2758 - Static2.anInt5;
			Static184.anInt3507 = Static50.anInt989 + local17 - Static520.anInt8806 - Static73.anInt1442;
			Static366.aClass82_11.DA(Static184.anInt3507, Static350.anInt6508, Static485.anInt8242, Static202.anInt3744);
		} else if (Static424.anInt7715 == 1) {
			Static202.anInt3744 = local33;
			Static485.anInt8242 = local31;
			Static350.anInt6508 = local21 - Static130.anInt2758;
			Static184.anInt3507 = local17 - Static73.anInt1442;
			Static366.aClass82_11.DA(Static184.anInt3507, Static350.anInt6508, Static485.anInt8242, Static202.anInt3744);
			Static366.aClass82_11.KA(Static520.anInt8806, Static2.anInt5, Static520.anInt8806 + Static456.anInt7760, Static2.anInt5 + Static15.anInt239);
		}
		method2715(arg14, arg0, arg15, arg1, arg2, arg4, arg5, arg9, arg10, arg6, arg3, arg11, arg7, arg12, arg13, arg8, Static424.anInt7715 == 2 ? 0 : 2, Static424.anInt7715 == 1);
		Static366.aClass82_11.la();
		Static366.aClass82_11.DA(local17, local21, local25, local29);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
	public static boolean method2717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static153.method2724(arg0, arg1) & Static108.method1801(arg0, arg1);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)I")
	public static int method2718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static602.anIntArray619[arg1 & 0x3] : Static249.anIntArray271[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI[BI)[B")
	public static byte[] method2720(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(18) byte[] local18;
		if (arg0 > 0) {
			local18 = new byte[arg2];
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local18[local20] = arg1[arg0 + local20];
			}
		} else {
			local18 = arg1;
		}
		@Pc(42) Class226 local42 = new Class226();
		local42.method5780();
		local42.method5776(local18, (long) (arg2 * 8));
		@Pc(56) byte[] local56 = new byte[64];
		local42.method5778(local56);
		return local56;
	}
}
