import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_112 = new Class25(60, 8);

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_56 = new Class220(200);

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
	public static final int[] anIntArray618 = new int[1];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIBII)Z")
	public static boolean method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(27) int local27 = arg3; local27 <= arg4; local27++) {
			for (@Pc(31) int local31 = arg1; local31 <= arg2; local31++) {
				if (arg0 == Static91.anIntArrayArray20[local27][local31] && Static265.anIntArrayArray38[local27][local31] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIZIIII[IIILclient!ea;II[I)I")
	public static int method5877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class61 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				Static159.anIntArrayArray25[local12][local16] = 0;
				Static233.anIntArrayArray33[local12][local16] = 99999999;
			}
		}
		@Pc(60) boolean local60;
		if (arg7 == 1) {
			local60 = Static298.method4369(arg9, arg0, arg6, arg4, arg5, arg12, arg1, arg11, arg2, arg10);
		} else if (arg7 == 2) {
			local60 = Static55.method1032(arg4, arg5, arg11, arg0, arg9, arg10, arg12, arg1, arg2, arg6);
		} else {
			local60 = Static122.method1994(arg9, arg10, arg1, arg5, arg0, arg2, arg7, arg11, arg12, arg4, arg6);
		}
		@Pc(94) int local94 = arg5 - 64;
		@Pc(98) int local98 = arg1 - 64;
		@Pc(100) int local100 = Static327.anInt5539;
		@Pc(102) int local102 = Static211.anInt3670;
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (!local60) {
			if (!arg3) {
				return -1;
			}
			local108 = Integer.MAX_VALUE;
			local110 = Integer.MAX_VALUE;
			for (local117 = arg11 - 10; local117 <= arg11 + 10; local117++) {
				for (@Pc(124) int local124 = arg2 - 10; local124 <= arg2 + 10; local124++) {
					@Pc(131) int local131 = local117 - local94;
					@Pc(136) int local136 = local124 - local98;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static233.anIntArrayArray33[local131][local136] < 100) {
						@Pc(155) int local155 = 0;
						if (arg11 > local117) {
							local155 = arg11 - local117;
						} else if (local117 > arg0 + arg11 - 1) {
							local155 = local117 + 1 - arg11 - arg0;
						}
						@Pc(188) int local188 = 0;
						if (local124 < arg2) {
							local188 = arg2 - local124;
						} else if (local124 > arg2 + arg12 - 1) {
							local188 = local124 + 1 - arg2 - arg12;
						}
						@Pc(227) int local227 = local188 * local188 + local155 * local155;
						if (local108 > local227 || local227 == local108 && local110 > Static233.anIntArrayArray33[local131][local136]) {
							local100 = local117;
							local102 = local124;
							local108 = local227;
							local110 = Static233.anIntArrayArray33[local131][local136];
						}
					}
				}
			}
			if (local108 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local100 == arg5 && local102 == arg1) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static238.anIntArray367[0] = local100;
		local108 = local297 + 1;
		Static449.anIntArray635[0] = local102;
		@Pc(318) int local318;
		local110 = local318 = Static159.anIntArrayArray25[local100 - local94][local102 - local98];
		while (local100 != arg5 || arg1 != local102) {
			if (local318 != local110) {
				Static238.anIntArray367[local108] = local100;
				local318 = local110;
				Static449.anIntArray635[local108++] = local102;
			}
			if ((local110 & 0x1) != 0) {
				local102++;
			} else if ((local110 & 0x4) != 0) {
				local102--;
			}
			if ((local110 & 0x2) != 0) {
				local100++;
			} else if ((local110 & 0x8) != 0) {
				local100--;
			}
			local110 = Static159.anIntArrayArray25[local100 - local94][local102 - local98];
		}
		local117 = 0;
		while (local108-- > 0) {
			arg13[local117] = Static238.anIntArray367[local108];
			arg8[local117++] = Static449.anIntArray635[local108];
			if (local117 >= arg13.length) {
				break;
			}
		}
		return local117;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
	public static void method5878() {
		for (@Pc(12) int local12 = 0; local12 < Static117.anInt2050; local12++) {
			@Pc(18) Class197 local18 = Static127.aClass197Array1[local12];
			@Pc(20) boolean local20 = false;
			@Pc(124) int local124;
			if (local18.aClass6_Sub5_Sub4_3 == null) {
				local18.anInt4983--;
				if ((local18.aByte62 == 2 ? -1500 : -10) <= local18.anInt4983) {
					if (local18.aByte62 == 1 && local18.aClass109_1 == null) {
						local18.aClass109_1 = Static456.method2473(Static144.aClass158_30, local18.anInt4984, 0);
						if (local18.aClass109_1 == null) {
							continue;
						}
						local18.anInt4983 += local18.aClass109_1.method2475();
					} else if (local18.aByte62 == 2 && (local18.aClass6_Sub18_1 == null || local18.aClass6_Sub4_Sub1_1 == null)) {
						if (local18.aClass6_Sub18_1 == null) {
							local18.aClass6_Sub18_1 = Static184.method2885(Static340.aClass158_71, local18.anInt4984);
						}
						if (local18.aClass6_Sub18_1 == null) {
							continue;
						}
						if (local18.aClass6_Sub4_Sub1_1 == null) {
							local18.aClass6_Sub4_Sub1_1 = local18.aClass6_Sub18_1.method2888(new int[] { 22050 });
							if (local18.aClass6_Sub4_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local18.anInt4983 < 0) {
						if (local18.anInt4987 == 0) {
							local124 = Static8.aClass173_Sub1_1.anInt4406 * local18.anInt4985 >> 8;
						} else {
							@Pc(133) int local133 = local18.anInt4987 >> 24 & 0x3;
							if (Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93 == local133) {
								@Pc(148) int local148 = (local18.anInt4987 & 0xFF) << 7;
								@Pc(155) int local155 = local18.anInt4987 >> 16 & 0xFF;
								@Pc(165) int local165 = (local155 << 7) - (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 - 64);
								if (local165 < 0) {
									local165 = -local165;
								}
								@Pc(180) int local180 = local18.anInt4987 >> 8 & 0xFF;
								@Pc(189) int local189 = (local180 << 7) - (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 - 64);
								if (local189 < 0) {
									local189 = -local189;
								}
								@Pc(200) int local200 = local189 + local165 - 128;
								if (local200 > local148) {
									local18.anInt4983 = -99999;
									continue;
								}
								if (local200 < 0) {
									local200 = 0;
								}
								local124 = local18.anInt4985 * Static8.aClass173_Sub1_1.anInt4411 * (local148 - local200) / local148 >> 8;
							} else {
								local124 = 0;
							}
						}
						if (local124 > 0) {
							@Pc(245) Class6_Sub4_Sub1 local245 = null;
							if (local18.aByte62 == 1) {
								local245 = local18.aClass109_1.method2474().method2221(Static379.aClass213_1);
							} else if (local18.aByte62 == 2) {
								local245 = local18.aClass6_Sub4_Sub1_1;
							}
							@Pc(273) Class6_Sub5_Sub4 local273 = local18.aClass6_Sub5_Sub4_3 = Static460.method5761(local245, local124);
							local273.method5745(local18.anInt4986 - 1);
							Static371.aClass6_Sub5_Sub2_2.method2166(local273);
						}
					}
				} else {
					local20 = true;
				}
			} else if (!local18.aClass6_Sub5_Sub4_3.method5980()) {
				local20 = true;
			}
			if (local20) {
				Static117.anInt2050--;
				for (local124 = local12; local124 < Static117.anInt2050; local124++) {
					Static127.aClass197Array1[local124] = Static127.aClass197Array1[local124 + 1];
				}
				local12--;
			}
		}
		if (Static284.aBoolean341 && !Static12.method159()) {
			if (Static8.aClass173_Sub1_1.anInt4414 != 0 && Static75.anInt1505 != -1) {
				Static233.method3661(Static280.aClass158_63, Static8.aClass173_Sub1_1.anInt4414, Static75.anInt1505);
			}
			Static284.aBoolean341 = false;
		} else if (Static8.aClass173_Sub1_1.anInt4414 != 0 && Static75.anInt1505 != -1 && !Static12.method159()) {
			Static298.method4373(Static175.aClass25_47);
			Static449.aClass6_Sub15_Sub1_2.method3107(Static75.anInt1505);
			Static75.anInt1505 = -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qq;B)V")
	public static void method5879(@OriginalArg(0) Class28 arg0) {
		@Pc(7) int local7 = Static203.anInt3581;
		@Pc(17) int local17 = Static236.anInt4059;
		@Pc(19) int local19 = Static265.anInt4552;
		@Pc(23) int local23 = Static122.anInt2156 - 3;
		if (Static348.aClass12_16 == null || Static261.aClass12_13 == null) {
			if (Static76.aClass158_17.method3686(Static205.anInt1290) && Static76.aClass158_17.method3686(Static387.anInt6388)) {
				Static348.aClass12_16 = arg0.method3540(Static455.method1703(Static76.aClass158_17, Static205.anInt1290, 0));
				@Pc(68) Class77 local68 = Static455.method1703(Static76.aClass158_17, Static387.anInt6388, 0);
				Static261.aClass12_13 = arg0.method3540(local68);
				local68.method1709();
				Static327.aClass12_15 = arg0.method3540(local68);
			} else {
				arg0.method3559(local7, local17, local19, 20, Static319.anInt5197 | 255 - Static42.anInt909 << 24, 1);
			}
		}
		@Pc(96) int local96;
		@Pc(94) int local94;
		if (Static348.aClass12_16 != null && Static261.aClass12_13 != null) {
			local94 = (local19 - Static261.aClass12_13.method5672() * 2) / Static348.aClass12_16.method5672();
			for (local96 = 0; local96 < local94; local96++) {
				Static348.aClass12_16.method5665(Static261.aClass12_13.method5672() + local7 + Static348.aClass12_16.method5672() * local96, local17);
			}
			Static261.aClass12_13.method5665(local7, local17);
			Static327.aClass12_15.method5665(local7 + local19 - Static327.aClass12_15.method5672(), local17);
		}
		Static45.aClass92_1.method5638(Static159.anInt2856 | 0xFF000000, local17 + 14, local7 - -3, Static329.aClass231_95.method5138(Static382.anInt6289), -1);
		arg0.method3559(local7, local17 + 20, local19, local23 - 20, -Static42.anInt909 + 255 << 24 | Static319.anInt5197, 1);
		local94 = Static37.aClass71_26.method1618();
		local96 = Static37.aClass71_26.method1624();
		@Pc(175) int local175 = 0;
		@Pc(196) int local196;
		for (@Pc(180) Class6_Sub33 local180 = (Class6_Sub33) Static307.aClass88_23.method1882(); local180 != null; local180 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			local196 = (Static228.anInt3878 - local175 - 1) * 16 + local17 + 13 + 20;
			if (local94 > local7 && local19 + local7 > local94 && local96 > local196 - 13 && local196 + 4 > local96 && local180.aBoolean389) {
				arg0.method3559(local7, local196 - 12, local19, 16, 255 - Static141.anInt2561 << 24 | Static111.anInt1996, 1);
			}
			local175++;
		}
		if ((Static56.aClass12_1 == null || Static158.aClass12_9 == null || Static321.aClass12_14 == null) && Static76.aClass158_17.method3686(Static268.anInt4598) && Static76.aClass158_17.method3686(Static256.anInt4375) && Static76.aClass158_17.method3686(Static185.anInt4926)) {
			@Pc(272) Class77 local272 = Static455.method1703(Static76.aClass158_17, Static256.anInt4375, 0);
			Static158.aClass12_9 = arg0.method3540(local272);
			local272.method1709();
			Static141.aClass12_4 = arg0.method3540(local272);
			Static56.aClass12_1 = arg0.method3540(Static455.method1703(Static76.aClass158_17, Static268.anInt4598, 0));
			@Pc(297) Class77 local297 = Static455.method1703(Static76.aClass158_17, Static185.anInt4926, 0);
			Static321.aClass12_14 = arg0.method3540(local297);
			local297.method1709();
			Static148.aClass12_8 = arg0.method3540(local297);
		}
		@Pc(363) int local363;
		@Pc(328) int local328;
		if (Static56.aClass12_1 != null && Static158.aClass12_9 != null && Static321.aClass12_14 != null) {
			local196 = (local19 - Static321.aClass12_14.method5672() * 2) / Static56.aClass12_1.method5672();
			for (local328 = 0; local328 < local196; local328++) {
				Static56.aClass12_1.method5665(Static321.aClass12_14.method5672() + local7 + Static56.aClass12_1.method5672() * local328, -Static56.aClass12_1.method5664() + local17 + local23);
			}
			local363 = (local23 - Static321.aClass12_14.method5664() - 20) / Static158.aClass12_9.method5664();
			for (@Pc(365) int local365 = 0; local365 < local363; local365++) {
				Static158.aClass12_9.method5665(local7, local17 + local365 * Static158.aClass12_9.method5664() + 20);
				Static141.aClass12_4.method5665(local19 + local7 - Static141.aClass12_4.method5672(), local365 * Static158.aClass12_9.method5664() + 20 + local17);
			}
			Static321.aClass12_14.method5665(local7, local23 + local17 - Static321.aClass12_14.method5664());
			Static148.aClass12_8.method5665(local19 + local7 - Static321.aClass12_14.method5672(), -Static321.aClass12_14.method5664() + local17 + local23);
		}
		local175 = 0;
		for (@Pc(437) Class6_Sub33 local437 = (Class6_Sub33) Static307.aClass88_23.method1882(); local437 != null; local437 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
			local328 = (Static228.anInt3878 - local175 - 1) * 16 + local17 + 20 + 13;
			local363 = Static159.anInt2856 | 0xFF000000;
			if (local94 > local7 && local19 + local7 > local94 && local96 > local328 - 13 && local328 + 4 > local96 && local437.aBoolean389) {
				local363 = Static213.anInt3696 | 0xFF000000;
			}
			@Pc(493) int[] local493 = null;
			if (Static305.method4412(local437.anInt5954)) {
				local493 = Static354.aClass170_2.method3865((int) local437.aLong176).anIntArray48;
			} else if (local437.anInt5955 != -1) {
				local493 = Static354.aClass170_2.method3865(local437.anInt5955).anIntArray48;
			} else if (Static302.method4398(local437.anInt5954)) {
				@Pc(522) Class3_Sub3_Sub6_Sub2 local522 = Static450.aClass3_Sub3_Sub6_Sub2Array1[(int) local437.aLong176];
				if (local522 != null) {
					@Pc(527) Class17 local527 = local522.aClass17_1;
					if (local527.anIntArray26 != null) {
						local527 = local527.method288(Static71.aClass126_1);
					}
					if (local527 != null) {
						local493 = local527.anIntArray27;
					}
				}
			} else if (Static259.method3996(local437.anInt5954)) {
				@Pc(565) Class118 local565;
				if (local437.anInt5954 == 1009) {
					local565 = Static113.aClass127_2.method2820((int) local437.aLong176);
				} else {
					local565 = Static113.aClass127_2.method2820((int) (local437.aLong176 >>> 32 & 0x7FFFFFFFL));
				}
				if (local565.anIntArray273 != null) {
					local565 = local565.method2718(Static71.aClass126_1);
				}
				if (local565 != null) {
					local493 = local565.anIntArray272;
				}
			}
			@Pc(598) String local598 = Static33.method703(local437);
			if (local493 != null) {
				local598 = local598 + Static420.method5693(local493);
			}
			Static45.aClass92_1.method5644(local363, Static136.aClass12Array7, Static320.anIntArray466, local7 + 3, local328, local598);
			local175++;
			if (local437.aBoolean390) {
				Static228.aClass12_10.method5665(local7 + Static252.aClass201_5.method4452(local598) + 5, local328 - 12);
			}
		}
		Static200.method3165(Static122.anInt2156, Static203.anInt3581, Static236.anInt4059, Static265.anInt4552);
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
	public static int method5881() {
		if ((double) Static36.aFloat46 == 3.0D) {
			return 37;
		} else if ((double) Static36.aFloat46 == 4.0D) {
			return 50;
		} else if ((double) Static36.aFloat46 == 6.0D) {
			return 75;
		} else if ((double) Static36.aFloat46 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
