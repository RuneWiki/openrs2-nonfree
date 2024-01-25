import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!ci;")
	public static Class38 aClass38_39;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
	public static final int[] anIntArray286 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public static void method3318() {
		if (Static328.anInt5873 == 0) {
			return;
		}
		try {
			if (++Static186.anInt3782 > 2000) {
				if (Static172.aClass13_1 != null) {
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
				}
				if (Static44.anInt1000 >= 1) {
					Static328.anInt5873 = 0;
					Static266.anInt5058 = -5;
					return;
				}
				Static44.anInt1000++;
				Static186.anInt3782 = 0;
				Static328.anInt5873 = 1;
				Static256.aClass9_5.aBoolean2 = !Static256.aClass9_5.aBoolean2;
			}
			if (Static328.anInt5873 == 1) {
				Static213.aClass87_5 = Static390.aClass255_5.method5825(Static256.aClass9_5.aString1, Static256.aClass9_5.method74());
				Static328.anInt5873 = 2;
			}
			if (Static328.anInt5873 == 2) {
				if (Static213.aClass87_5.anInt2679 == 2) {
					throw new IOException();
				}
				if (Static213.aClass87_5.anInt2679 != 1) {
					return;
				}
				Static172.aClass13_1 = Static139.method2565((Socket) Static213.aClass87_5.anObject3);
				Static213.aClass87_5 = null;
				Static172.aClass13_1.method177(Static457.aClass4_Sub20_Sub1_5.anInt5526, Static457.aClass4_Sub20_Sub1_5.aByteArray77);
				Static328.anInt5873 = 4;
			}
			@Pc(134) int local134;
			if (Static328.anInt5873 == 4) {
				if (!Static172.aClass13_1.method179(1)) {
					return;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
				local134 = Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF;
				if (local134 != 21) {
					Static328.anInt5873 = 0;
					Static266.anInt5058 = local134;
					Static172.aClass13_1.method172();
					Static172.aClass13_1 = null;
					return;
				}
				Static328.anInt5873 = 5;
			}
			if (Static328.anInt5873 == 5) {
				if (!Static172.aClass13_1.method179(1)) {
					return;
				}
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, 1);
				Static208.aStringArray18 = new String[Static196.aClass4_Sub20_Sub1_4.aByteArray77[0] & 0xFF];
				Static328.anInt5873 = 6;
			}
			if (Static328.anInt5873 == 6 && Static172.aClass13_1.method179(Static208.aStringArray18.length * 8)) {
				Static196.aClass4_Sub20_Sub1_4.anInt5526 = 0;
				Static172.aClass13_1.method180(Static196.aClass4_Sub20_Sub1_4.aByteArray77, 0, Static208.aStringArray18.length * 8);
				for (local134 = 0; local134 < Static208.aStringArray18.length; local134++) {
					Static208.aStringArray18[local134] = Static30.method446(Static196.aClass4_Sub20_Sub1_4.method4603());
				}
				Static266.anInt5058 = 21;
				Static328.anInt5873 = 0;
				Static172.aClass13_1.method172();
				Static172.aClass13_1 = null;
			}
		} catch (@Pc(232) IOException local232) {
			if (Static172.aClass13_1 != null) {
				Static172.aClass13_1.method172();
				Static172.aClass13_1 = null;
			}
			if (Static44.anInt1000 < 1) {
				Static328.anInt5873 = 1;
				Static256.aClass9_5.aBoolean2 = !Static256.aClass9_5.aBoolean2;
				Static44.anInt1000++;
				Static186.anInt3782 = 0;
			} else {
				Static266.anInt5058 = -4;
				Static328.anInt5873 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIZ)V")
	public static void method3319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg0 == Static245.anInt4783 && arg1 == Static462.anInt7854 && (Static238.anInt4697 == Static59.anInt1472 || Static157.aClass185_Sub1_1.method4639(Static192.anInt3828))) {
			return;
		}
		Static238.anInt4697 = Static59.anInt1472;
		Static462.anInt7854 = arg1;
		Static245.anInt4783 = arg0;
		if (Static157.aClass185_Sub1_1.method4639(Static192.anInt3828)) {
			Static238.anInt4697 = 0;
		}
		Static382.method3540(arg2);
		Static122.method2305(true, Static330.aClass18_3, Static299.aClass21_87.method362(Static168.anInt3290));
		@Pc(62) int local62 = Static426.anInt7325;
		@Pc(64) int local64 = Static72.anInt1776;
		Static426.anInt7325 = (Static245.anInt4783 - (Static193.anInt3853 >> 4)) * 8;
		Static72.anInt1776 = (Static462.anInt7854 - (Static301.anInt5585 >> 4)) * 8;
		Static130.aClass4_Sub1_Sub18_1 = Static425.method3278(Static245.anInt4783 * 8, Static462.anInt7854 * 8);
		Static311.aClass189_3 = null;
		@Pc(96) int local96 = Static426.anInt7325 - local62;
		@Pc(101) int local101 = Static72.anInt1776 - local64;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(186) int local186;
		@Pc(285) int local285;
		if (arg2 == 10) {
			for (local285 = 0; local285 < Static328.anInt5871; local285++) {
				@Pc(291) Class4_Sub44 local291 = Static154.aClass4_Sub44Array1[local285];
				if (local291 != null) {
					@Pc(296) Class11_Sub5_Sub2_Sub2 local296 = local291.aClass11_Sub5_Sub2_Sub2_2;
					for (local122 = 0; local122 < 10; local122++) {
						local296.anIntArray523[local122] -= local96;
						local296.anIntArray524[local122] -= local101;
					}
					local296.anInt7514 -= local96 * 128;
					local296.anInt7515 -= local101 * 128;
				}
			}
		} else {
			@Pc(106) boolean local106 = false;
			Static77.anInt1870 = 0;
			@Pc(114) int local114 = (Static193.anInt3853 - 1) * 128;
			local120 = (Static301.anInt5585 - 1) * 128;
			for (local122 = 0; local122 < Static328.anInt5871; local122++) {
				@Pc(128) Class4_Sub44 local128 = Static154.aClass4_Sub44Array1[local122];
				if (local128 != null) {
					@Pc(133) Class11_Sub5_Sub2_Sub2 local133 = local128.aClass11_Sub5_Sub2_Sub2_2;
					local133.anInt7514 -= local96 * 128;
					local133.anInt7515 -= local101 * 128;
					if (local133.anInt7514 >= 0 && local133.anInt7514 <= local114 && local133.anInt7515 >= 0 && local133.anInt7515 <= local120) {
						@Pc(184) boolean local184 = true;
						for (local186 = 0; local186 < 10; local186++) {
							local133.anIntArray523[local186] -= local96;
							local133.anIntArray524[local186] -= local101;
							if (local133.anIntArray523[local186] < 0 || Static193.anInt3853 <= local133.anIntArray523[local186] || local133.anIntArray524[local186] < 0 || local133.anIntArray524[local186] >= Static301.anInt5585) {
								local184 = false;
							}
						}
						if (local184) {
							Static2.anIntArray1[Static77.anInt1870++] = local133.anInt6518;
						} else {
							local133.method5311(null);
							local128.method6330();
							local106 = true;
						}
					} else {
						local133.method5311(null);
						local128.method6330();
						local106 = true;
					}
				}
			}
			if (local106) {
				Static328.anInt5871 = Static80.aClass96_8.method2807();
				Static80.aClass96_8.method2800(Static154.aClass4_Sub44Array1);
			}
		}
		for (local285 = 0; local285 < 2048; local285++) {
			@Pc(354) Class11_Sub5_Sub2_Sub1 local354 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local285];
			if (local354 != null) {
				for (local120 = 0; local120 < 10; local120++) {
					local354.anIntArray523[local120] -= local96;
					local354.anIntArray524[local120] -= local101;
				}
				local354.anInt7514 -= local96 * 128;
				local354.anInt7515 -= local101 * 128;
			}
		}
		@Pc(404) Class51[] local404 = Static209.aClass51Array1;
		for (local120 = 0; local120 < local404.length; local120++) {
			@Pc(412) Class51 local412 = local404[local120];
			if (local412 != null) {
				local412.anInt1748 -= local101 * 128;
				local412.anInt1746 -= local96 * 128;
			}
		}
		for (@Pc(444) Class4_Sub36 local444 = (Class4_Sub36) Static190.aClass91_25.method2584(); local444 != null; local444 = (Class4_Sub36) Static190.aClass91_25.method2586()) {
			local444.anInt6592 -= local96;
			local444.anInt6587 -= local101;
			if (Static227.anInt4510 != 4 && (local444.anInt6592 < 0 || local444.anInt6587 < 0 || Static193.anInt3853 <= local444.anInt6592 || Static301.anInt5585 <= local444.anInt6587)) {
				local444.method6330();
			}
		}
		if (Static227.anInt4510 != 4) {
			for (@Pc(501) Class4_Sub47 local501 = (Class4_Sub47) Static377.aClass96_31.method2798(); local501 != null; local501 = (Class4_Sub47) Static377.aClass96_31.method2796()) {
				@Pc(509) int local509 = (int) (local501.aLong228 & 0x3FFFL);
				@Pc(514) int local514 = local509 - Static426.anInt7325;
				local186 = (int) (local501.aLong228 >> 14 & 0x3FFFL);
				@Pc(527) int local527 = local186 - Static72.anInt1776;
				if (local514 < 0 || local527 < 0 || Static193.anInt3853 <= local514 || Static301.anInt5585 <= local527) {
					local501.method6330();
				}
			}
		}
		if (Static38.anInt906 != 0) {
			Static184.anInt3729 -= local101;
			Static38.anInt906 -= local96;
		}
		Static368.method5234();
		if (arg2 != 10) {
			Static108.anInt2350 -= local101 * 128;
			Static372.anInt6454 -= local101;
			Static285.anInt5311 -= local101;
			Static242.anInt4727 -= local96;
			Static235.anInt4645 -= local96 * 128;
			Static111.anInt2407 -= local96;
			if (Math.abs(local96) > Static193.anInt3853 || Math.abs(local101) > Static301.anInt5585) {
				Static94.method1834();
			}
		} else if (Static275.anInt5173 == 4) {
			Static233.anInt4616 -= local101 * 128;
			Static3.anInt1340 -= local96 * 128;
			Static53.anInt4623 -= local96 * 128;
			Static373.anInt6559 -= local101 * 128;
		} else {
			Static275.anInt5173 = 1;
		}
		Static402.method5649();
		Static391.method5497();
		Static325.aClass91_36.method2582();
		Static354.aClass91_42.method2582();
		Static412.aClass273_5.method6243();
		Static450.method3491();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!qa;BI)V")
	public static void method3321(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg0 < 0 || Static371.anInt6435 == 0 || Static168.anInt3287 == 0) {
			return;
		}
		arg1.b(Static131.anInt2068, Static321.anInt5401, Static371.anInt6435, Static168.anInt3287);
		arg1.w(Static6.anInt67, Static125.anInt2599, Static371.anInt6435, Static168.anInt3287);
		@Pc(41) Class72 local41 = arg1.method2103();
		local41.IA(Static193.anInt3857, Static324.anInt5814, Static237.anInt4687, Static346.anInt6105, Static341.anInt6022, Static315.anInt5144);
		arg1.method2064(local41);
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(82) int local82;
		@Pc(90) int local90;
		@Pc(99) int local99;
		@Pc(114) int[] local114;
		@Pc(145) int local145;
		@Pc(154) int local154;
		if (Static267.aClass14Array2 != null) {
			@Pc(56) int local56 = -1;
			@Pc(58) int local58 = -1;
			local61 = arg1.na();
			local70 = (arg2 - Static131.anInt2068) * local61 / Static371.anInt6435;
			local79 = (arg0 - Static321.anInt5401) * local61 / Static168.anInt3287;
			local82 = arg1.sa();
			local90 = (arg2 - Static131.anInt2068) * local82 / Static371.anInt6435;
			local99 = local82 * (arg0 - Static321.anInt5401) / Static168.anInt3287;
			local114 = new int[] { local70, local79, local61 };
			local41.M(local114);
			@Pc(132) int[] local132 = new int[] { local90, local99, local82 };
			local41.M(local132);
			@Pc(137) float local137 = 0.0F;
			local145 = local132[0] - local114[0];
			local154 = local132[1] - local114[1];
			@Pc(163) int local163 = local132[2] - local114[2];
			while (local137 < 1.0F) {
				@Pc(176) int local176 = (int) ((float) local114[0] + (float) local145 * local137);
				@Pc(180) int local180 = local176 >> 7;
				@Pc(191) int local191 = (int) ((float) local114[2] + local137 * (float) local163);
				@Pc(195) int local195 = local191 >> 7;
				if (local180 > 0 && local195 > 0 && Static193.anInt3853 > local180 && Static301.anInt5585 > local195) {
					@Pc(222) int local222 = Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100;
					if (local222 < 3 && (Static398.aByteArrayArrayArray17[1][local180][local195] & 0x2) != 0) {
						local222++;
					}
					if ((float) Static267.aClass14Array2[local222].R(local176, local191) < (float) local154 * local137 + (float) local114[1]) {
						local56 = (Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() - 1 << 6) + local176 >> 7;
						local58 = local191 + (Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() - 1 << 6) >> 7;
						break;
					}
				}
				local137 = (float) ((double) local137 + 0.01D);
			}
			if (local56 != -1 && local58 != -1) {
				if (Static449.aBoolean564 && (Static353.anInt6237 & 0x40) != 0) {
					@Pc(344) Class240 local344 = Static231.method3929(Static383.anInt6696, Static344.anInt6075);
					if (local344 == null) {
						Static294.method4500();
					} else {
						Static12.method4708(49, 0L, local56, false, true, Static281.anInt5275, " ->", Static198.aString26, -1, local58);
					}
				} else {
					if (Static323.aClass235_5 == Static332.aClass235_6) {
						Static12.method4708(45, 0L, local56, false, true, -1, "", Static134.aClass21_35.method362(Static168.anInt3290), -1, local58);
					}
					Static12.method4708(21, 0L, local56, false, true, Static87.anInt1988, "", Static424.aString76, -1, local58);
				}
			}
		}
		@Pc(364) Class273 local364 = Static224.aClass273_1;
		for (@Pc(374) Class71_Sub3 local374 = (Class71_Sub3) local364.method6246(); local374 != null; local374 = (Class71_Sub3) local364.method6249()) {
			if ((Static435.aBoolean545 || local374.anInt5028 == Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100) && local374.method4261(arg2, arg0, arg1)) {
				@Pc(506) int local506;
				@Pc(518) int local518;
				if (local374.aClass11_1 instanceof Class11_Sub5_Sub2_Sub1) {
					@Pc(398) Class11_Sub5_Sub2_Sub1 local398 = (Class11_Sub5_Sub2_Sub1) local374.aClass11_1;
					local70 = local398.method5302();
					if ((local70 & 0x1) == 0 && (local398.anInt7514 & 0x7F) == 0 && (local398.anInt7515 & 0x7F) == 0 || (local70 & 0x1) == 1 && (local398.anInt7514 & 0x7F) == 64 && (local398.anInt7515 & 0x7F) == 64) {
						local79 = local398.anInt7514 - (local398.method5302() - 1 << 6);
						local82 = local398.anInt7515 - (local398.method5302() - 1 << 6);
						for (local90 = 0; local90 < Static77.anInt1870; local90++) {
							@Pc(480) Class4_Sub44 local480 = (Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local90]);
							if (local480 != null) {
								@Pc(485) Class11_Sub5_Sub2_Sub2 local485 = local480.aClass11_Sub5_Sub2_Sub2_2;
								if (Static277.anInt2834 != local485.anInt6548 && local485.aBoolean477) {
									local506 = local485.anInt7514 - (local485.aClass241_1.anInt7007 - 1 << 6);
									local518 = local485.anInt7515 - (local485.aClass241_1.anInt7007 - 1 << 6);
									if (local79 <= local506 && local485.aClass241_1.anInt7007 <= local398.method5302() - (local506 - local79 >> 7) && local82 <= local518 && local485.aClass241_1.anInt7007 <= local398.method5302() - (local518 - local82 >> 7)) {
										Static104.method1972(local485, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local374.anInt5028);
										local485.anInt6548 = Static277.anInt2834;
									}
								}
							}
						}
						local99 = Static402.anInt7091;
						local114 = Static144.anIntArray244;
						for (local506 = 0; local506 < local99; local506++) {
							@Pc(600) Class11_Sub5_Sub2_Sub1 local600 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local114[local506]];
							if (local600 != null && local600.anInt6548 != Static277.anInt2834 && local398 != local600 && local600.aBoolean477) {
								local145 = local600.anInt7514 - (local600.method5302() - 1 << 6);
								local154 = local600.anInt7515 - (local600.method5302() - 1 << 6);
								if (local145 >= local79 && local600.method5302() <= local398.method5302() - (local145 - local79 >> 7) && local154 >= local82 && local600.method5302() <= local398.method5302() - (local154 - local82 >> 7)) {
									Static199.method175(Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local374.anInt5028, local600);
									local600.anInt6548 = Static277.anInt2834;
								}
							}
						}
					}
					if (local398.anInt6548 == Static277.anInt2834) {
						continue;
					}
					Static199.method175(Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local374.anInt5028, local398);
					local398.anInt6548 = Static277.anInt2834;
				}
				@Pc(858) int local858;
				if (local374.aClass11_1 instanceof Class11_Sub5_Sub2_Sub2) {
					@Pc(746) Class11_Sub5_Sub2_Sub2 local746 = (Class11_Sub5_Sub2_Sub2) local374.aClass11_1;
					if (local746.aClass241_1 != null) {
						if ((local746.aClass241_1.anInt7007 & 0x1) == 0 && (local746.anInt7514 & 0x7F) == 0 && (local746.anInt7515 & 0x7F) == 0 || (local746.aClass241_1.anInt7007 & 0x1) == 1 && (local746.anInt7514 & 0x7F) == 64 && (local746.anInt7515 & 0x7F) == 64) {
							local70 = local746.anInt7514 - (local746.aClass241_1.anInt7007 - 1 << 6);
							local79 = local746.anInt7515 - (local746.aClass241_1.anInt7007 - 1 << 6);
							for (local82 = 0; local82 < Static77.anInt1870; local82++) {
								@Pc(829) Class4_Sub44 local829 = (Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local82]);
								if (local829 != null) {
									@Pc(834) Class11_Sub5_Sub2_Sub2 local834 = local829.aClass11_Sub5_Sub2_Sub2_2;
									if (Static277.anInt2834 != local834.anInt6548 && local834 != local746 && local834.aBoolean477) {
										local858 = local834.anInt7514 - (local834.aClass241_1.anInt7007 - 1 << 6);
										local506 = local834.anInt7515 - (local834.aClass241_1.anInt7007 - 1 << 6);
										if (local858 >= local70 && local746.aClass241_1.anInt7007 - (local858 - local70 >> 7) >= local834.aClass241_1.anInt7007 && local506 >= local79 && local834.aClass241_1.anInt7007 <= local746.aClass241_1.anInt7007 - (local506 - local79 >> 7)) {
											Static104.method1972(local834, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local374.anInt5028);
											local834.anInt6548 = Static277.anInt2834;
										}
									}
								}
							}
							local90 = Static402.anInt7091;
							@Pc(939) int[] local939 = Static144.anIntArray244;
							for (local858 = 0; local858 < local90; local858++) {
								@Pc(949) Class11_Sub5_Sub2_Sub1 local949 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local939[local858]];
								if (local949 != null && local949.anInt6548 != Static277.anInt2834 && local949.aBoolean477) {
									local518 = local949.anInt7514 - (local949.method5302() - 1 << 6);
									local145 = local949.anInt7515 - (local949.method5302() - 1 << 6);
									if (local518 >= local70 && local949.method5302() <= local746.aClass241_1.anInt7007 - (local518 - local70 >> 7) && local145 >= local79 && local949.method5302() <= local746.aClass241_1.anInt7007 - (local145 - local79 >> 7)) {
										Static199.method175(Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local374.anInt5028, local949);
										local949.anInt6548 = Static277.anInt2834;
									}
								}
							}
						}
						if (local746.anInt6548 == Static277.anInt2834) {
							continue;
						}
						Static104.method1972(local746, local374.anInt5028 != Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100);
						local746.anInt6548 = Static277.anInt2834;
					}
				}
				if (local374.aClass11_1 instanceof Class11_Sub4_Sub1) {
					local61 = local374.anInt5032 + Static426.anInt7325;
					local70 = Static72.anInt1776 + local374.anInt5029;
					@Pc(1098) Class4_Sub47 local1098 = (Class4_Sub47) Static377.aClass96_31.method2797((long) (local61 | local374.anInt5028 << 28 | local70 << 14));
					if (local1098 != null) {
						for (@Pc(1106) Class4_Sub42 local1106 = (Class4_Sub42) local1098.aClass91_54.method2577(); local1106 != null; local1106 = (Class4_Sub42) local1098.aClass91_54.method2581()) {
							@Pc(1114) Class274 local1114 = Static139.aClass193_1.method4650(local1106.anInt7301);
							if (!Static449.aBoolean564) {
								if (Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local374.anInt5028) {
									@Pc(1124) String[] local1124 = local1114.aStringArray37;
									for (local858 = 4; local858 >= 0; local858--) {
										if (local1124 != null && local1124[local858] != null) {
											@Pc(1136) byte local1136 = 0;
											local518 = Static51.anInt1208;
											if (local858 == 0) {
												local1136 = 20;
											}
											if (local858 == 1) {
												local1136 = 48;
											}
											if (local858 == 2) {
												local1136 = 8;
											}
											if (local858 == 3) {
												local1136 = 46;
											}
											if (local858 == 4) {
												local1136 = 47;
											}
											if (local858 == local1114.anInt7900) {
												local518 = local1114.anInt7905;
											}
											if (local858 == local1114.anInt7882) {
												local518 = local1114.anInt7912;
											}
											Static12.method4708(local1136, (long) local1106.anInt7301, local374.anInt5032, false, true, local518, "<col=ff9040>" + local1114.aString82, local1124[local858], -1, local374.anInt5029);
										}
									}
								}
								Static12.method4708(1010, (long) local1106.anInt7301, local374.anInt5032, local374.anInt5028 != Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100, true, Static268.anInt5105, "<col=ff9040>" + local1114.aString82, Static143.aClass21_37.method362(Static168.anInt3290), -1, local374.anInt5029);
							} else if (Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local374.anInt5028) {
								@Pc(1274) Class176 local1274 = Static352.anInt6231 == -1 ? null : Static203.aClass202_1.method4864(Static352.anInt6231);
								if ((Static353.anInt6237 & 0x1) != 0 && (local1274 == null || local1114.method6251(Static352.anInt6231, local1274.anInt5158) != local1274.anInt5158)) {
									Static12.method4708(18, (long) local1106.anInt7301, local374.anInt5032, false, true, Static281.anInt5275, Static168.aString24 + " -> <col=ff9040>" + local1114.aString82, Static198.aString26, -1, local374.anInt5029);
								}
							}
						}
					}
				}
				if (local374.aClass11_1 instanceof Interface12) {
					@Pc(1335) Interface12 local1335 = (Interface12) local374.aClass11_1;
					@Pc(1342) Class139 local1342 = Static146.aClass228_1.method5203(local1335.method6320());
					if (local1342.anIntArray344 != null) {
						local1342 = local1342.method3751(Static67.aClass224_1);
					}
					if (local1342 != null) {
						if (!Static449.aBoolean564) {
							if (Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local374.anInt5028) {
								@Pc(1438) String[] local1438 = local1342.aStringArray19;
								if (local1438 != null) {
									for (local82 = 4; local82 >= 0; local82--) {
										if (local1438[local82] != null) {
											@Pc(1450) short local1450 = 0;
											local99 = Static51.anInt1208;
											if (local82 == 0) {
												local1450 = 57;
											}
											if (local82 == 1) {
												local1450 = 23;
											}
											if (local82 == 2) {
												local1450 = 25;
											}
											if (local82 == 3) {
												local1450 = 15;
											}
											if (local82 == 4) {
												local1450 = 1012;
											}
											if (local1342.anInt4394 == local82) {
												local99 = local1342.anInt4381;
											}
											if (local1342.anInt4371 == local82) {
												local99 = local1342.anInt4378;
											}
											Static12.method4708(local1450, Static247.method4079(local374.anInt5029, local1335, local374.anInt5032), local374.anInt5032, false, true, local99, "<col=00ffff>" + local1342.aString33, local1438[local82], -1, local374.anInt5029);
										}
									}
								}
							}
							Static12.method4708(1007, (long) local1342.anInt4366, local374.anInt5032, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 != local374.anInt5028, true, Static268.anInt5105, "<col=00ffff>" + local1342.aString33, Static143.aClass21_37.method362(Static168.anInt3290), -1, local374.anInt5029);
						} else if (Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local374.anInt5028) {
							@Pc(1372) Class176 local1372 = Static352.anInt6231 == -1 ? null : Static203.aClass202_1.method4864(Static352.anInt6231);
							if ((Static353.anInt6237 & 0x4) != 0 && (local1372 == null || local1342.method3756(Static352.anInt6231, local1372.anInt5158) != local1372.anInt5158)) {
								Static12.method4708(13, Static247.method4079(local374.anInt5029, local1335, local374.anInt5032), local374.anInt5032, false, true, Static281.anInt5275, Static168.aString24 + " -> <col=00ffff>" + local1342.aString33, Static198.aString26, -1, local374.anInt5029);
							}
						}
					}
				}
			}
		}
	}
}
