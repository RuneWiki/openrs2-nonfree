import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "[S")
	public static final short[] aShortArray1 = new short[] { 8, 11, 23, 60, 19, 45, 15, 17 };

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "[Lclient!tp;")
	public static final Class233[] aClass233Array1 = new Class233[8];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qa;II)Z")
	public static boolean method50(@OriginalArg(0) Class26 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static81.anInt1950 - 104) / 2;
		@Pc(17) int local17 = (Static171.anInt3288 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static330.method4706(local29, local25, local21, arg1)) {
						local40 = local29;
						if (Static173.method2713(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static248.method3821(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(83) int[] local83 = new int[262144];
		for (local29 = 0; local29 < local83.length; local29++) {
			local83[local29] = -16777216;
		}
		client.lb = arg0.method2257(local83, 512, 512, 512);
		Static253.method3879();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D)) - 238)) - 10 | 0xFF000000;
		@Pc(154) int local154 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x9016FF00) << 16;
		@Pc(173) int local173 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(177) boolean[][] local177 = new boolean[Static114.anInt2326][Static114.anInt2326];
		@Pc(183) int local183;
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(266) int local266;
		@Pc(273) int local273;
		@Pc(277) int local277;
		@Pc(300) int local300;
		for (@Pc(179) int local179 = local11; local179 < local11 + 104; local179 += Static114.anInt2326) {
			for (local183 = local17; local183 < local17 + 104; local183 += Static114.anInt2326) {
				arg0.pa(0, 0, Static114.anInt2326 * 4, Static114.anInt2326 * 4);
				arg0.M(-16777216);
				for (local200 = arg1; local200 <= 3; local200++) {
					for (local204 = 0; local204 < Static114.anInt2326; local204++) {
						for (local208 = 0; local208 < Static114.anInt2326; local208++) {
							local177[local204][local208] = Static330.method4706(local200, local183 + local208, local179 - -local204, arg1);
						}
					}
					Static72.aClass106Array4[local200].method5484(local179, local183, local179 + Static114.anInt2326, Static114.anInt2326 + local183, local177);
					if (!Static137.aBoolean234) {
						for (local208 = -4; local208 < Static114.anInt2326; local208++) {
							for (local266 = -4; local266 < Static114.anInt2326; local266++) {
								local273 = local179 + local208;
								local277 = local266 + local183;
								if (local273 >= local11 && local277 >= local17 && Static330.method4706(local200, local277, local273, arg1)) {
									local300 = local200;
									if (Static173.method2713(local277, local273)) {
										local300 = local200 - 1;
									}
									if (local300 >= 0) {
										Static323.method4624((Static114.anInt2326 - local266) * 4 - 4, local208 * 4, local154, local273, local40, local277, local300, arg0);
									}
								}
							}
						}
					}
				}
				if (Static137.aBoolean234) {
					@Pc(353) Class37 local353 = Static332.aClass37Array1[arg1];
					for (local208 = 0; local208 < Static114.anInt2326; local208++) {
						for (local266 = 0; local266 < Static114.anInt2326; local266++) {
							local273 = local179 + local208;
							local277 = local266 + local183;
							local300 = local353.anIntArrayArray6[local273 - local353.anInt1438][local277 - local353.anInt1447];
							if ((local300 & 0x40240000) != 0) {
								arg0.method2245(4, local208 * 4, (Static114.anInt2326 - local266) * 4 - 4, 4, -1713569622);
							} else if ((local300 & 0x800000) != 0) {
								arg0.method2237(-1713569622, 4, (Static114.anInt2326 - local266) * 4 - 4, local208 * 4);
							} else if ((local300 & 0x2000000) != 0) {
								arg0.method2277((Static114.anInt2326 - local266) * 4 - 4, -1713569622, 4, local208 * 4 + 3);
							} else if ((local300 & 0x8000000) != 0) {
								arg0.method2237(-1713569622, 4, (Static114.anInt2326 - local266) * 4 + 3 - 4, local208 * 4);
							} else if ((local300 & 0x20000000) != 0) {
								arg0.method2277((Static114.anInt2326 - local266) * 4 - 4, -1713569622, 4, local208 * 4);
							}
						}
					}
				}
				arg0.NA(0, 0, Static114.anInt2326 * 4, Static114.anInt2326 * 4, local173, 2);
				client.lb.W((local179 - local11) * 4 + 48, -(Static114.anInt2326 * 4) + -((-local17 + local183) * 4) + 464, Static114.anInt2326 * 4, Static114.anInt2326 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.M(-16777215);
		Static8.method183();
		Static158.anInt3121 = 0;
		Static281.aClass265_40.method6003();
		if (!Static137.aBoolean234) {
			for (local183 = local11; local183 < local11 + 104; local183++) {
				for (local200 = local17; local200 < local17 + 104; local200++) {
					for (local204 = arg1; local204 <= arg1 + 1 && local204 <= 3; local204++) {
						if (Static330.method4706(local204, local200, local183, arg1)) {
							@Pc(623) Interface9 local623 = (Interface9) Static325.method4667(local204, local183, local200);
							if (local623 == null) {
								local623 = (Interface9) Static80.method1405(local204, local183, local200, np.class);
							}
							if (local623 == null) {
								local623 = (Interface9) Static334.method4742(local204, local183, local200);
							}
							if (local623 == null) {
								local623 = (Interface9) Static242.method3661(local204, local183, local200);
							}
							if (local623 != null) {
								@Pc(664) Class250 local664 = Static406.aClass150_3.method3508(local623.method5901());
								if (!local664.aBoolean606 || Static67.aBoolean153) {
									local273 = local664.anInt7192;
									if (local664.anIntArray479 != null) {
										for (local277 = 0; local277 < local664.anIntArray479.length; local277++) {
											if (local664.anIntArray479[local277] != -1) {
												@Pc(694) Class250 local694 = Static406.aClass150_3.method3508(local664.anIntArray479[local277]);
												if (local694.anInt7192 >= 0) {
													local273 = local694.anInt7192;
												}
											}
										}
									}
									if (local273 >= 0) {
										@Pc(713) boolean local713 = false;
										if (local273 >= 0) {
											@Pc(720) Class83 local720 = Static304.aClass173_4.method4022(local273);
											if (local720 != null && local720.aBoolean199) {
												local713 = true;
											}
										}
										local300 = local183;
										@Pc(731) int local731 = local200;
										if (local713) {
											@Pc(738) int[][] local738 = Static332.aClass37Array1[local204].anIntArrayArray6;
											@Pc(743) int local743 = Static332.aClass37Array1[local204].anInt1438;
											@Pc(748) int local748 = Static332.aClass37Array1[local204].anInt1447;
											for (@Pc(750) int local750 = 0; local750 < 10; local750++) {
												@Pc(757) int local757 = (int) (Math.random() * 4.0D);
												if (local757 == 0 && local11 < local300 && local183 - 3 < local300 && (local738[local300 - local743 - 1][local731 - local748] & 0x2C0108) == 0) {
													local300--;
												}
												if (local757 == 1 && local300 < local11 + 104 - 1 && local300 < local183 + 3 && (local738[local300 + 1 - local743][local731 - local748] & 0x2C0180) == 0) {
													local300++;
												}
												if (local757 == 2 && local17 < local731 && local731 > local200 - 3 && (local738[local300 - local743][local731 - local748 - 1] & 0x2C0102) == 0) {
													local731--;
												}
												if (local757 == 3 && local17 + 104 - 1 > local731 && local200 + 3 > local731 && (local738[local300 - local743][local731 + 1 - local748] & 0x2C0120) == 0) {
													local731++;
												}
											}
										}
										Static356.anIntArray422[Static158.anInt3121] = local664.anInt7160;
										Static277.anIntArray342[Static158.anInt3121] = local300;
										Static161.anIntArray209[Static158.anInt3121] = local731;
										Static158.anInt3121++;
									}
								}
							}
						}
					}
				}
			}
			if (Static269.aClass201_3 != null) {
				Static102.aClass188_33.anInt5309 = 1;
				Static304.aClass173_4.method4017(1024, 64);
				for (local200 = 0; local200 < Static269.aClass201_3.anInt5614; local200++) {
					local204 = Static269.aClass201_3.anIntArray368[local200];
					if (Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92 == local204 >> 28) {
						local208 = (local204 >> 14 & 0x3FFF) - Static173.anInt3340;
						local266 = (local204 & 0x3FFF) - Static379.anInt6721;
						if (local208 >= 0 && local208 < Static81.anInt1950 && local266 >= 0 && Static171.anInt3288 > local266) {
							Static281.aClass265_40.method5999(new Class2_Sub16(local200));
						} else {
							@Pc(1012) Class83 local1012 = Static304.aClass173_4.method4022(Static269.aClass201_3.anIntArray369[local200]);
							if (local1012.anIntArray133 != null && local1012.anInt2333 + local208 >= 0 && local208 + local1012.anInt2305 < Static81.anInt1950 && local1012.anInt2317 + local266 >= 0 && Static171.anInt3288 > local266 + local1012.anInt2308) {
								Static281.aClass265_40.method5999(new Class2_Sub16(local200));
							}
						}
					}
				}
				Static304.aClass173_4.method4017(128, 64);
				Static102.aClass188_33.anInt5309 = 2;
				Static102.aClass188_33.method4293();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)Lclient!gv;")
	public static Class4_Sub4 method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub4_1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)I")
	public static int method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg3;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!qa;IIB)V")
	public static void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2.pa(arg1, arg3, arg1 + arg4, arg3 - -arg0);
		arg2.method2245(arg0, arg1, arg3, arg4, -16777216);
		if (Static430.anInt7475 < 100) {
			return;
		}
		@Pc(39) float local39 = (float) Static169.anInt3160 / (float) Static169.anInt3168;
		@Pc(41) int local41 = arg4;
		@Pc(43) int local43 = arg0;
		if (local39 < 1.0F) {
			local43 = (int) ((float) arg4 * local39);
		} else {
			local41 = (int) ((float) arg0 / local39);
		}
		@Pc(70) int local70 = arg3 + (arg0 - local43) / 2;
		@Pc(79) int local79 = arg1 + (arg4 - local41) / 2;
		if (Static271.aClass76_12 == null || arg4 != Static271.aClass76_12.UA() || Static271.aClass76_12.qa() != arg0) {
			Static169.method2541(Static169.anInt3161, Static169.anInt3160 + Static169.anInt3159, Static169.anInt3161 + Static169.anInt3168, Static169.anInt3159, local79, local70, local41 + local79, local70 - -local43);
			Static169.method2561(arg2);
			Static271.aClass76_12 = arg2.method2244(local79, local70, local41, local43, false);
		}
		Static271.aClass76_12.method6088(local79, local70);
		@Pc(131) int local131 = Static44.anInt1163 * local41 / Static169.anInt3168;
		@Pc(137) int local137 = Static228.anInt1861 * local43 / Static169.anInt3160;
		@Pc(146) int local146 = local79 + local41 * Static125.anInt2469 / Static169.anInt3168;
		@Pc(159) int local159 = local70 + local43 - local43 * Static419.anInt7321 / Static169.anInt3160 - local137;
		@Pc(161) int local161 = -1996554240;
		if (Static389.aClass209_2 == Static107.aClass209_1) {
			local161 = -1996488705;
		}
		arg2.NA(local146, local159, local131, local137, local161, 1);
		arg2.method2247(local146, local159, local131, local137, local161, 0);
		if (Static176.anInt3420 <= 0) {
			return;
		}
		@Pc(197) int local197;
		if (Static303.anInt5385 <= 50) {
			local197 = Static303.anInt5385 * 5;
		} else {
			local197 = (100 - Static303.anInt5385) * 5;
		}
		for (@Pc(211) Class2_Sub38 local211 = (Class2_Sub38) Static169.aClass265_27.method6005(); local211 != null; local211 = (Class2_Sub38) Static169.aClass265_27.method6001()) {
			@Pc(219) Class83 local219 = Static169.aClass173_3.method4022(local211.anInt6772);
			if (Static291.method4267(local219)) {
				@Pc(246) int local246;
				@Pc(258) int local258;
				if (Static401.anInt6978 == local211.anInt6772) {
					local246 = local79 + local211.anInt6767 * local41 / Static169.anInt3168;
					local258 = local70 + (Static169.anInt3160 - local211.anInt6760) * local43 / Static169.anInt3160;
					arg2.method2245(4, local246 - 2, local258 + -2, 4, local197 << 24 | 0xFFFF00);
				} else if (Static167.anInt3227 != -1 && Static167.anInt3227 == local219.anInt2313) {
					local246 = local79 + local41 * local211.anInt6767 / Static169.anInt3168;
					local258 = local70 + local43 * (Static169.anInt3160 - local211.anInt6760) / Static169.anInt3160;
					arg2.method2245(4, local246 - 2, local258 + -2, 4, local197 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
