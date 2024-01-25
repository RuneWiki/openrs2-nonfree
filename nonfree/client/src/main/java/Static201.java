import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!ng;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	public static int anInt4146;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray107 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBILclient!fa;)V")
	public static void method3772(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub1_Sub2_Sub1 arg2) {
		if ((arg0 & 0x400) != 0) {
			arg2.anInt4912 = Static127.aClass4_Sub11_Sub1_3.method3440();
			arg2.anInt4974 = Static127.aClass4_Sub11_Sub1_3.method3451();
			arg2.anInt4938 = Static127.aClass4_Sub11_Sub1_3.method3451();
			arg2.anInt4925 = Static127.aClass4_Sub11_Sub1_3.method3451();
			arg2.anInt4958 = Static127.aClass4_Sub11_Sub1_3.method3401() + Static199.anInt4137;
			arg2.anInt4922 = Static127.aClass4_Sub11_Sub1_3.method3415() + Static199.anInt4137;
			arg2.anInt4962 = Static127.aClass4_Sub11_Sub1_3.method3451();
			arg2.anInt4981 = 0;
			arg2.anInt4987 = 1;
		}
		@Pc(70) int local70;
		@Pc(81) int local81;
		@Pc(114) int local114;
		@Pc(229) int local229;
		if ((arg0 & 0x100) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3401();
			if (local70 == 65535) {
				local70 = -1;
			}
			local81 = Static127.aClass4_Sub11_Sub1_3.method3418();
			@Pc(83) boolean local83 = true;
			@Pc(111) Class14 local111;
			if (local70 != -1 && arg2.anInt4972 != -1) {
				@Pc(98) Class5 local98;
				if (arg2.anInt4972 == local70) {
					local98 = Static116.method2427(local70);
					if (local98.aBoolean11 && local98.anInt101 != -1) {
						local111 = Static225.method4042(local98.anInt101);
						local114 = local111.anInt351;
						if (local114 == 0) {
							local83 = false;
						} else if (local114 == 1) {
							local83 = true;
						} else if (local114 == 2) {
							arg2.anInt4959 = 0;
							local83 = false;
						}
					}
				} else {
					local98 = Static116.method2427(local70);
					@Pc(149) Class5 local149 = Static116.method2427(arg2.anInt4972);
					if (local98.anInt101 != -1 && local149.anInt101 != -1) {
						@Pc(164) Class14 local164 = Static225.method4042(local98.anInt101);
						@Pc(169) Class14 local169 = Static225.method4042(local149.anInt101);
						if (local169.anInt344 > local164.anInt344) {
							local83 = false;
						}
					}
				}
			}
			if (local83) {
				arg2.anInt4971 = 0;
				arg2.anInt4972 = local70;
				arg2.anInt4919 = (local81 & 0xFFFF) + Static199.anInt4137;
				arg2.anInt4980 = 1;
				arg2.anInt4949 = 0;
				arg2.anInt4943 = local81 >> 16;
				if (arg2.anInt4919 > Static199.anInt4137) {
					arg2.anInt4971 = -1;
				}
				if (arg2.anInt4972 != -1 && arg2.anInt4919 == Static199.anInt4137) {
					local229 = Static116.method2427(arg2.anInt4972).anInt101;
					if (local229 != -1) {
						local111 = Static225.method4042(local229);
						if (local111 != null && local111.anIntArray12 != null) {
							Static167.method3265(arg2.anInt6701, arg2.anInt6702, 0, arg2 == Static158.aClass8_Sub1_Sub2_Sub1_1, local111);
						}
					}
				}
			}
		}
		if ((arg0 & 0x8) != 0) {
			arg2.anInt4942 = Static127.aClass4_Sub11_Sub1_3.method3412();
			arg2.anInt4915 = Static127.aClass4_Sub11_Sub1_3.method3401();
		}
		if ((arg0 & 0x4) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3451();
			@Pc(287) byte[] local287 = new byte[local70];
			@Pc(292) Class4_Sub11 local292 = new Class4_Sub11(local287);
			Static127.aClass4_Sub11_Sub1_3.method3414(local287, local70);
			Static1.aClass4_Sub11Array2[arg1] = local292;
			arg2.method2083(local292);
		}
		if ((arg0 & 0x2) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3457();
			local81 = Static127.aClass4_Sub11_Sub1_3.method3453();
			arg2.method4342(local81, Static199.anInt4137, local70);
			arg2.anInt4973 = Static199.anInt4137 + 300;
			arg2.anInt4960 = Static127.aClass4_Sub11_Sub1_3.method3451();
		}
		if ((arg0 & 0x1000) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3415();
			arg2.anInt4965 = Static127.aClass4_Sub11_Sub1_3.method3413();
			arg2.anInt4977 = Static127.aClass4_Sub11_Sub1_3.method3413();
			arg2.aBoolean370 = (local70 & 0x8000) != 0;
			arg2.lb = local70 & 0x7FFF;
			arg2.anInt4970 = arg2.anInt4965 + Static199.anInt4137 + arg2.lb;
		}
		if ((arg0 & 0x10) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3412();
			if (local70 == 65535) {
				local70 = -1;
			}
			local81 = Static127.aClass4_Sub11_Sub1_3.method3413();
			Static3.method116(arg2, local81, local70);
		}
		if ((arg0 & 0x1) != 0) {
			arg2.aString55 = Static127.aClass4_Sub11_Sub1_3.method3446();
			if (arg2.aString55.charAt(0) == '~') {
				arg2.aString55 = arg2.aString55.substring(1);
				Static69.method1646(arg2.method2093(), 2, 0, arg2.aString55, arg2.method2092());
			} else if (arg2 == Static158.aClass8_Sub1_Sub2_Sub1_1) {
				Static69.method1646(arg2.method2093(), 2, 0, arg2.aString55, arg2.method2092());
			}
			arg2.anInt4933 = 0;
			arg2.anInt4956 = 0;
			arg2.anInt4931 = 150;
		}
		if ((arg0 & 0x200) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3453();
			@Pc(485) int[] local485 = new int[local70];
			@Pc(488) int[] local488 = new int[local70];
			@Pc(491) int[] local491 = new int[local70];
			for (@Pc(493) int local493 = 0; local493 < local70; local493++) {
				local114 = Static127.aClass4_Sub11_Sub1_3.method3415();
				if (local114 == 65535) {
					local114 = -1;
				}
				local485[local493] = local114;
				local488[local493] = Static127.aClass4_Sub11_Sub1_3.method3440();
				local491[local493] = Static127.aClass4_Sub11_Sub1_3.method3460();
			}
			Static158.method3079(local488, local485, local491, arg2);
		}
		if ((arg0 & 0x80) != 0) {
			arg2.anInt4964 = Static127.aClass4_Sub11_Sub1_3.method3460();
			if (arg2.anInt4964 == 65535) {
				arg2.anInt4964 = -1;
			}
		}
		if ((arg0 & 0x40) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3412();
			local81 = Static127.aClass4_Sub11_Sub1_3.method3451();
			@Pc(571) int local571 = Static127.aClass4_Sub11_Sub1_3.method3440();
			local229 = Static127.aClass4_Sub11_Sub1_3.anInt3768;
			@Pc(582) boolean local582 = (local70 & 0x8000) != 0;
			if (arg2.aString24 != null && arg2.aClass33_1 != null) {
				@Pc(590) boolean local590 = false;
				if (local81 <= 1) {
					if (!local582 && (Static230.aBoolean459 && !Static321.aBoolean363 || Static162.aBoolean273)) {
						local590 = true;
					} else if (Static343.method5479(arg2.aString24)) {
						local590 = true;
					}
				}
				if (!local590 && Static234.anInt4720 == 0) {
					Static42.aClass4_Sub11_5.anInt3768 = 0;
					Static127.aClass4_Sub11_Sub1_3.method3456(local571, Static42.aClass4_Sub11_5.aByteArray55);
					Static42.aClass4_Sub11_5.anInt3768 = 0;
					@Pc(634) int local634 = -1;
					@Pc(653) String local653;
					if (local582) {
						local70 &= 0x7FFF;
						@Pc(644) Class65 local644 = Static24.method399(Static42.aClass4_Sub11_5);
						local634 = local644.anInt2395;
						local653 = local644.aClass4_Sub4_Sub16_1.method4699(Static42.aClass4_Sub11_5);
					} else {
						local653 = Static341.method236(Static107.method5414(Static172.method3323(Static42.aClass4_Sub11_5)));
					}
					arg2.aString55 = local653.trim();
					arg2.anInt4933 = local70 >> 8;
					arg2.anInt4931 = 150;
					arg2.anInt4956 = local70 & 0xFF;
					@Pc(696) int local696;
					if (local81 == 1 || local81 == 2) {
						local696 = local582 ? 17 : 1;
					} else {
						local696 = local582 ? 17 : 2;
					}
					if (local81 == 2) {
						Static271.method4637(local696, null, local653, "<img=1>" + arg2.method2093(), local634, "<img=1>" + arg2.method2092(), 0);
					} else if (local81 == 1) {
						Static271.method4637(local696, null, local653, "<img=0>" + arg2.method2093(), local634, "<img=0>" + arg2.method2092(), 0);
					} else {
						Static271.method4637(local696, null, local653, arg2.method2093(), local634, arg2.method2092(), 0);
					}
				}
			}
			Static127.aClass4_Sub11_Sub1_3.anInt3768 = local229 + local571;
		}
		if ((arg0 & 0x800) != 0) {
			local70 = Static127.aClass4_Sub11_Sub1_3.method3457();
			local81 = Static127.aClass4_Sub11_Sub1_3.method3440();
			arg2.method4342(local81, Static199.anInt4137, local70);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!fa;I)V")
	public static void method3773(@OriginalArg(0) Class8_Sub1_Sub2_Sub1 arg0) {
		if (Static105.anInt2645 >= 400 || Static158.aClass8_Sub1_Sub2_Sub1_1 == arg0) {
			return;
		}
		@Pc(41) String local41;
		@Pc(89) int local89;
		if (arg0.anInt2375 == 0) {
			@Pc(45) boolean local45 = true;
			if (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2345 != -1 && arg0.anInt2345 != -1) {
				@Pc(68) int local68 = arg0.anInt2346 >= Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346 ? arg0.anInt2346 : Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346;
				@Pc(79) int local79 = arg0.anInt2345 <= Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2345 ? arg0.anInt2345 : Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2345;
				local89 = local79 + local68 * 10 / 100 + 5;
				@Pc(96) int local96 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346 - arg0.anInt2346;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local89 < local96) {
					local45 = false;
				}
			}
			@Pc(123) String local123 = Static330.anInt6312 == 1 ? Static7.aClass159_10.method4311(Static180.anInt3835) : Static55.aClass159_81.method4311(Static180.anInt3835);
			if (arg0.anInt2373 <= arg0.anInt2346) {
				local41 = arg0.method2092() + (local45 ? Static239.method4230(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346, arg0.anInt2346) : "<col=ffffff>") + " (" + local123 + arg0.anInt2346 + ")";
			} else {
				local41 = arg0.method2092() + (local45 ? Static239.method4230(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346, arg0.anInt2346) : "<col=ffffff>") + " (" + local123 + arg0.anInt2346 + "+" + (arg0.anInt2373 - arg0.anInt2346) + ")";
			}
		} else {
			local41 = arg0.method2092() + " (" + Static349.aClass159_360.method4311(Static180.anInt3835) + arg0.anInt2375 + ")";
		}
		if (!Static344.aBoolean219) {
			for (@Pc(203) int local203 = 7; local203 >= 0; local203--) {
				if (Static330.aStringArray76[local203] != null) {
					@Pc(211) short local211 = 0;
					if (Static330.anInt6312 == 0 && Static330.aStringArray76[local203].equalsIgnoreCase(Static52.aClass159_79.method4311(Static180.anInt3835))) {
						if (arg0.anInt2346 > Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346) {
							local211 = 2000;
						}
						if (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2361 != 0 && arg0.anInt2361 != 0) {
							if (arg0.anInt2361 == Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2361) {
								local211 = 2000;
							} else {
								local211 = 0;
							}
						}
					} else if (Static119.aBooleanArray15[local203]) {
						local211 = 2000;
					}
					@Pc(275) short local275 = (short) (local211 + Static183.aShortArray48[local203]);
					local89 = Static30.anIntArray40[local203] == -1 ? Static207.anInt4330 : Static30.anIntArray40[local203];
					Static138.method2617((long) arg0.anInt4916, "<col=ffffff>" + local41, local275, local89, Static330.aStringArray76[local203], 0, 0);
				}
			}
		} else if ((Static48.anInt1288 & 0x8) != 0) {
			Static138.method2617((long) arg0.anInt4916, Static194.aString36 + " -> <col=ffffff>" + local41, 22, Static169.anInt3596, Static171.aString34, 0, 0);
		}
		for (@Pc(349) Class4_Sub39 local349 = (Class4_Sub39) Static58.aClass116_7.method3270(); local349 != null; local349 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			if (local349.anInt5716 == 57) {
				local349.aString59 = "<col=ffffff>" + local41;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BII)V")
	public static void method3774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(0, 15);
		local8.method4908();
		local8.anInt5705 = arg0;
		local8.anInt5703 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
	public static void method3776() {
		if (Static357.anInt6821 == -1) {
			return;
		}
		@Pc(11) int local11 = Static258.aClass127_1.method3588();
		@Pc(15) int local15 = Static258.aClass127_1.method3595();
		if (Static138.aClass4_Sub28_2 != null) {
			local11 = Static138.aClass4_Sub28_2.method5555();
			local15 = Static138.aClass4_Sub28_2.method5559();
		}
		Static55.method1172(0, Static24.anInt496, local15, 0, 0, local11, Static357.anInt6821, Static23.anInt465, 0);
		if (Static173.aClass21_8 != null) {
			Static193.method3858(local11, local15);
		}
	}
}
