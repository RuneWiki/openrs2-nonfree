import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!op", name = "o", descriptor = "Lclient!bd;")
	public static Class18 aClass18_4;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	public static int anInt4510;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	public static int anInt4506 = 0;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "[Lclient!qa;")
	public static final Class163[] aClass163Array1 = new Class163[16];

	@OriginalMember(owner = "client!op", name = "r", descriptor = "F")
	public static float aFloat69 = 0.0F;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	public static int anInt4514 = 0;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString263 = "slide:";

	@OriginalMember(owner = "client!op", name = "B", descriptor = "[I")
	public static final int[] anIntArray323 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!op", name = "E", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILclient!mb;Lclient!mb;)V")
	public static void method3960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub3 arg3, @OriginalArg(4) Class25_Sub3 arg4) {
		if (Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static168.method3164(arg0, arg1, arg2);
		}
		Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2].aClass25_Sub3_2 = arg3;
		Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2].aClass25_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method3961() {
		if (Static226.anInt4439 != 2) {
			try {
				Static367.method4779("tbrefresh", Static334.aClient1);
			} catch (@Pc(16) Throwable local16) {
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIBII)V")
	public static void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(79) int local79 = ((arg2 << 1) - 3) * local25;
		@Pc(85) int local85 = local55;
		@Pc(91) int local91 = local51 * (arg2 - 1);
		@Pc(113) int local113;
		@Pc(122) int local122;
		if (arg4 >= Static314.anInt6018 && arg4 <= Static334.anInt6315) {
			local113 = Static133.method5819(Static80.anInt4809, arg0 + arg3, Static184.anInt6250);
			local122 = Static133.method5819(Static80.anInt4809, arg0 - arg3, Static184.anInt6250);
			Static247.method3552(arg1, local122, Static332.anIntArrayArray56[arg4], local113);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local85;
					local38 += local63;
					local63 += local55;
					local7++;
					local85 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local85;
				local63 += local55;
				local7++;
				local85 += local55;
			}
			local38 += -local91;
			local47 += -local79;
			local79 -= local51;
			local9--;
			local91 -= local51;
			local113 = arg4 - local9;
			local122 = local9 + arg4;
			if (local122 >= Static314.anInt6018 && local113 <= Static334.anInt6315) {
				@Pc(218) int local218 = Static133.method5819(Static80.anInt4809, local7 + arg0, Static184.anInt6250);
				@Pc(226) int local226 = Static133.method5819(Static80.anInt4809, arg0 - local7, Static184.anInt6250);
				if (Static314.anInt6018 <= local113) {
					Static247.method3552(arg1, local226, Static332.anIntArrayArray56[local113], local218);
				}
				if (Static334.anInt6315 >= local122) {
					Static247.method3552(arg1, local226, Static332.anIntArrayArray56[local122], local218);
				}
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3964(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub1 local8 = new Class5_Sub1(arg0);
		@Pc(12) int local12 = local8.method1832();
		@Pc(21) int local21 = local8.method1826();
		if (local21 < 0 || Static90.anInt4334 != 0 && Static90.anInt4334 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local8.method1860(local43, local21);
			return local43;
		} else {
			@Pc(55) int local55 = local8.method1826();
			if (local55 < 0 || Static90.anInt4334 != 0 && Static90.anInt4334 < local55) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local55];
			if (local12 == 1) {
				Static351.method5787(local72, local55, arg0, local21);
			} else {
				Static297.aClass111_1.method3011(local72, local8);
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!en;Lclient!ra;)V")
	public static void method3965(@OriginalArg(1) Class59 arg0, @OriginalArg(2) Class170 arg1) {
		if (Static85.aBoolean133) {
			return;
		}
		arg0.method4823(0);
		Static288.aClass54_16 = arg0.method4872(Static360.method915(arg1, Static61.anInt1428));
		Static288.aClass54_16.method5569((Static17.anInt5991 - Static288.aClass54_16.method5560()) / 2, (Static246.anInt4801 - Static288.aClass54_16.method5576()) / 2);
		Static60.aClass54_3 = arg0.method4872(Static360.method915(arg1, Static232.anInt4543));
		Static60.aClass54_3.method5569((Static17.anInt5991 - Static60.aClass54_3.method5560()) / 2, 18);
		Static85.aBoolean133 = true;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(III)V")
	public static void method3966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static138.aClass51ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass25_Sub2_1 != null) {
			local7.aClass25_Sub2_1 = null;
		}
		if (local7.aClass25_Sub2_2 != null) {
			local7.aClass25_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	public static void method3967() {
		@Pc(12) Class66 local12 = Static177.aClass66_38;
		synchronized (Static177.aClass66_38) {
			Static177.aClass66_38.method1942();
		}
		local12 = Static162.aClass66_58;
		synchronized (Static162.aClass66_58) {
			Static162.aClass66_58.method1942();
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!lj;Lclient!dn;)V")
	public static void method3968(@OriginalArg(0) Class64 arg0, @OriginalArg(1) Class51 arg1) {
		if (!arg1.aBoolean94) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort15;
		@Pc(9) short local9 = arg1.aShort16;
		@Pc(12) byte local12 = arg1.aByte13;
		@Pc(15) byte local15 = arg1.aByte9;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class51[][] local31 = Static138.aClass51ArrayArrayArray1[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static93.aClass3Array1 == Static130.aClass3Array2) {
			local40 = Static267.anIntArrayArray40[local6][local9];
			Static98.aClass59_3.method4863(Static262.aClass3Array3[0].method5639(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static98.aClass59_3.method4859(3000.0F, local58 * 1.5F);
		@Pc(621) Class63_Sub3 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class51 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class63_Sub3 local382;
		@Pc(413) int local413;
		@Pc(416) Class25_Sub2 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean92) {
			if (Static176.aBoolean128) {
				if (local12 > 0) {
					local91 = Static138.aClass51ArrayArrayArray1[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean94) {
						return;
					}
				}
				if (local6 <= Static210.anInt5625 && local6 > Static266.anInt5098) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean94 && (local91.aBoolean92 || (arg1.aByte12 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static210.anInt5625 && local6 < Static271.anInt5206 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean94 && (local91.aBoolean92 || (arg1.aByte12 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static103.anInt2249 && local9 > Static233.anInt4557) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean94 && (local91.aBoolean92 || (arg1.aByte12 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static103.anInt2249 && local9 < Static166.anInt3360 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean94 && (local91.aBoolean92 || (arg1.aByte12 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static176.aBoolean128 = true;
			}
			arg1.aBoolean92 = false;
			if (arg1.aClass51_1 != null) {
				local91 = arg1.aClass51_1;
				Static98.aClass59_3.method4859(3000.0F, (201.5F - (float) (local91.aByte9 + 1) * 50.0F) * 1.5F);
				if (!Static189.method3465(local91.aByte9, local6, local9)) {
					Static130.aClass3Array2[local91.aByte9].method5630(local6, local9);
				}
				@Pc(254) Class25_Sub2 local254 = local91.aClass25_Sub2_1;
				if (local254 != null) {
					if (Static65.aBoolean130) {
						if ((local254.anInt4336 & arg1.aShort14) == 0) {
							Static331.method5535(arg0, local12, local6, local9);
						} else {
							Static289.method4917(arg0, local254.anInt4336, local15, local6, local9);
						}
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					local254.method5590(Static98.aClass59_3);
				}
				for (@Pc(291) Class103 local291 = local91.aClass103_1; local291 != null; local291 = local291.aClass103_2) {
					@Pc(295) Class25_Sub1 local295 = local291.aClass25_Sub1_1;
					if (local295 != null) {
						if (Static65.aBoolean130) {
							Static331.method5535(arg0, local12, local6, local9);
							Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
						}
						local295.method5590(Static98.aClass59_3);
					}
				}
				Static98.aClass59_3.method4859(3000.0F, local58 * 1.5F);
			}
			local335 = !Static189.method3465(local15, local6, local9);
			if (local335) {
				Static130.aClass3Array2[local15].method5630(local6, local9);
				@Pc(346) Class25_Sub4 local346 = arg1.aClass25_Sub4_1;
				if (local346 != null && local346.aBoolean276) {
					if (local346.aBoolean277) {
						Static98.aClass59_3.method4859(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					local382 = local346.method5590(Static98.aClass59_3);
					if (local382 != null) {
						local382.aClass25_1 = local346;
						local382.anInt2771 = local12;
						local382.anInt2768 = local6;
						local382.anInt2772 = local9;
						Static161.aClass24_1.method620(local382);
					}
					if (local346.aBoolean277) {
						Static98.aClass59_3.method4859(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass25_Sub2_1;
			@Pc(419) Class25_Sub3 local419 = arg1.aClass25_Sub3_2;
			if (local416 != null || local419 != null) {
				if (Static210.anInt5625 == local6) {
					local411++;
				} else if (Static210.anInt5625 < local6) {
					local411 += 2;
				}
				if (Static103.anInt2249 == local9) {
					local411 += 3;
				} else if (Static103.anInt2249 > local9) {
					local411 += 6;
				}
				local413 = Static296.anIntArray436[local411];
				arg1.aShort14 = Static158.aShortArray35[local411];
			}
			if (local416 != null) {
				if ((local416.anInt4336 & Static8.anIntArray5[local411]) == 0) {
					arg1.aByte10 = 0;
				} else if (local416.anInt4336 == 16) {
					arg1.aByte10 = 3;
					arg1.aByte14 = Static281.aByteArray76[local411];
					arg1.aByte11 = (byte) (3 - arg1.aByte14);
				} else if (local416.anInt4336 == 32) {
					arg1.aByte10 = 6;
					arg1.aByte14 = Static248.aByteArray69[local411];
					arg1.aByte11 = (byte) (6 - arg1.aByte14);
				} else if (local416.anInt4336 == 64) {
					arg1.aByte10 = 12;
					arg1.aByte14 = Static28.aByteArray5[local411];
					arg1.aByte11 = (byte) (12 - arg1.aByte14);
				} else {
					arg1.aByte10 = 9;
					arg1.aByte14 = Static283.aByteArray77[local411];
					arg1.aByte11 = (byte) (9 - arg1.aByte14);
				}
				if ((local416.anInt4336 & local413) != 0 && !Static276.method4706(local15, local6, local9, local416.anInt4336)) {
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					@Pc(568) Class63_Sub3 local568 = local416.method5590(Static98.aClass59_3);
					if (local568 != null) {
						local568.aClass25_1 = local416;
						local568.anInt2771 = local12;
						local568.anInt2768 = local6;
						local568.anInt2772 = local9;
						Static161.aClass24_1.method620(local568);
					}
				}
				@Pc(589) Class25_Sub2 local589 = arg1.aClass25_Sub2_2;
				if (local589 != null && (local589.anInt4336 & local413) != 0 && !Static276.method4706(local15, local6, local9, local589.anInt4336)) {
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					local621 = local589.method5590(Static98.aClass59_3);
					if (local621 != null) {
						local621.aClass25_1 = local589;
						local621.anInt2771 = local12;
						local621.anInt2768 = local6;
						local621.anInt2772 = local9;
						Static161.aClass24_1.method620(local621);
					}
				}
			}
			if (local419 != null && !Static65.method1811(local15, local6, local9, local419.method5547())) {
				@Pc(652) Class25_Sub3 local652 = arg1.aClass25_Sub3_1;
				Static98.aClass59_3.method4859(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt6237 & local413) != 0) {
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					local621 = local419.method5590(Static98.aClass59_3);
					if (local621 != null) {
						local621.aClass25_1 = local419;
						local621.anInt2771 = local12;
						local621.anInt2768 = local6;
						local621.anInt2772 = local9;
						Static161.aClass24_1.method620(local621);
					}
				} else if (local419.anInt6237 == 256) {
					local711 = local419.anInt6241 - Static10.anInt345;
					local716 = local419.anInt6244 - Static21.anInt6206;
					local719 = local419.anInt6242;
					if (local719 == 1 || local719 == 2) {
						local728 = -local711;
					} else {
						local728 = local711;
					}
					if (local719 == 2 || local719 == 3) {
						local740 = -local716;
					} else {
						local740 = local716;
					}
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					@Pc(764) Class63_Sub3 local764;
					if (local740 < local728) {
						local764 = local419.method5590(Static98.aClass59_3);
						if (local764 != null) {
							local764.aClass25_1 = local419;
							local764.anInt2771 = local12;
							local764.anInt2768 = local6;
							local764.anInt2772 = local9;
							Static161.aClass24_1.method620(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5590(Static98.aClass59_3);
						if (local764 != null) {
							local764.aClass25_1 = local652;
							local764.anInt2771 = local12;
							local764.anInt2768 = local6;
							local764.anInt2772 = local9;
							Static161.aClass24_1.method620(local764);
						}
					}
				}
				Static98.aClass59_3.method4859(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class25_Sub4 local819 = arg1.aClass25_Sub4_1;
				if (local819 != null && !local819.aBoolean276) {
					if (local819.aBoolean277) {
						Static98.aClass59_3.method4859(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					local621 = local819.method5590(Static98.aClass59_3);
					if (local621 != null) {
						local621.aClass25_1 = local819;
						local621.anInt2771 = local12;
						local621.anInt2768 = local6;
						local621.anInt2772 = local9;
						Static161.aClass24_1.method620(local621);
					}
					if (local819.aBoolean277) {
						Static98.aClass59_3.method4859(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class25_Sub5 local885 = arg1.aClass25_Sub5_1;
				if (local885 != null && !local885.aBoolean470) {
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					@Pc(908) Class63_Sub3 local908 = local885.method5590(Static98.aClass59_3);
					if (local908 != null) {
						local908.aClass25_1 = local885;
						local908.anInt2771 = local12;
						local908.anInt2768 = local6;
						local908.anInt2772 = local9;
						Static161.aClass24_1.method620(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte12;
			if (local929 != 0) {
				@Pc(946) Class51 local946;
				if (local6 < Static210.anInt5625 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean94) {
						Static134.aClass28_1.method5715(local946);
					}
				}
				if (local9 < Static103.anInt2249 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean94) {
						Static134.aClass28_1.method5715(local946);
					}
				}
				if (local6 > Static210.anInt5625 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean94) {
						Static134.aClass28_1.method5715(local946);
					}
				}
				if (local9 > Static103.anInt2249 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean94) {
						Static134.aClass28_1.method5715(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class25_Sub2 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class103 local1035;
		if (arg1.aByte10 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass103_1; local1035 != null; local1035 = local1035.aClass103_2) {
				if (local1035.aClass25_Sub1_1.anInt5776 != Static22.anInt574 && (local1035.anInt3088 & arg1.aByte10) == arg1.aByte14) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass25_Sub2_1;
				if (!Static276.method4706(local15, local6, local9, local1062.anInt4336)) {
					if (Static65.aBoolean130) {
						label687: {
							if (local1062.anInt4336 >= 16) {
								local1079 = local6 - Static210.anInt5625;
								local1083 = local9 - Static103.anInt2249;
								if (local1062.anInt4336 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static248.anInt4822) {
										Static331.method5535(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt4336 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static12.anInt378 && local9 < Static248.anInt4822) {
										Static331.method5535(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt4336 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static12.anInt378 && local9 > 0) {
										Static331.method5535(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt4336 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static331.method5535(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static331.method5535(arg0, local12, local6, local9);
						}
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					@Pc(1197) Class63_Sub3 local1197 = local1062.method5590(Static98.aClass59_3);
					if (local1197 != null) {
						local1197.aClass25_1 = local1062;
						local1197.anInt2771 = local12;
						local1197.anInt2768 = local6;
						local1197.anInt2772 = local9;
						Static161.aClass24_1.method620(local1197);
					}
				}
				arg1.aByte10 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean93) {
			try {
				arg1.aBoolean93 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass103_1; local1035 != null; local1035 = local1035.aClass103_2) {
					@Pc(1233) Class25_Sub1 local1233 = local1035.aClass25_Sub1_1;
					if (local1233.anInt5776 != Static22.anInt574) {
						for (local1079 = local1233.aShort76; local1079 <= local1233.aShort73; local1079++) {
							for (local1083 = local1233.aShort75; local1083 <= local1233.aShort74; local1083++) {
								@Pc(1251) Class51 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean92) {
									arg1.aBoolean93 = true;
									continue label630;
								}
								if (local1251.aByte10 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort76) {
										local711++;
									}
									if (local1079 < local1233.aShort73) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort75) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort74) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte10) == arg1.aByte11) {
										arg1.aBoolean93 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static210.anInt5625 - local1233.aShort76;
						local1314 = local1233.aShort73 - Static210.anInt5625;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static103.anInt2249 - local1233.aShort75;
						local716 = local1233.aShort74 - Static103.anInt2249;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass25_Sub1Array2[local40] = local1233;
						arg0.anIntArray110[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class25_Sub1 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass25_Sub1Array2[local1083];
						if (local1365.anInt5776 != Static22.anInt574) {
							local711 = arg0.anIntArray110[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt5769 - Static10.anInt345;
								local719 = local1365.anInt5773 - Static21.anInt6206;
								local728 = arg0.aClass25_Sub1Array2[local1079].anInt5769 - Static10.anInt345;
								local740 = arg0.aClass25_Sub1Array2[local1079].anInt5773 - Static21.anInt6206;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass25_Sub1Array2[local1079];
					local1365.anInt5776 = Static22.anInt574;
					if (!Static118.method2318(local15, local1365.aShort76, local1365.aShort73, local1365.aShort75, local1365.aShort74, local1365.method5096())) {
						if (Static65.aBoolean130) {
							if (local1365.aByte61 == 0) {
								Static137.method2180(arg0, local12, local1365.aShort76, local1365.aShort75, local1365.aShort73, local1365.aShort74);
							} else {
								Static331.method5535(arg0, local12, local6, local9);
								local711 = local6 - Static210.anInt5625;
								local716 = local9 - Static103.anInt2249;
								if (local1365.aByte61 == 2) {
									if (local716 > -local711) {
										Static2.method6(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static2.method6(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static2.method6(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static2.method6(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
						}
						local621 = local1365.method5590(Static98.aClass59_3);
						if (local621 != null) {
							local621.aClass25_1 = local1365;
							local621.anInt2771 = local12;
							local621.anInt2768 = local1365.aShort76;
							local621.anInt2772 = local1365.aShort75;
							Static161.aClass24_1.method620(local621);
						}
					}
					for (local711 = local1365.aShort76; local711 <= local1365.aShort73; local711++) {
						for (local716 = local1365.aShort75; local716 <= local1365.aShort74; local716++) {
							@Pc(1590) Class51 local1590 = local31[local711][local716];
							if (local1590.aByte10 != 0) {
								Static134.aClass28_1.method5715(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean94) {
								Static134.aClass28_1.method5715(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean93) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean93 = false;
			}
		}
		if (arg1.aClass21_1 != null) {
			if (arg1.aByte15 == (byte) (Static112.anInt2423 & 0xFF)) {
				@Pc(1645) Class21 local1645 = arg1.aClass21_1;
				local411 = Static130.aClass3Array2[local12].method5638(local6, local9);
				if (local12 < 3) {
					local413 = Static130.aClass3Array2[local12].method5638(local6, local9) - Static130.aClass3Array2[local12 + 1].method5638(local6, local9);
				} else {
					local413 = 1024;
				}
				Static108.aClass112_1.method3592(local21, local411, local27, arg0.anIntArray109);
				local1079 = arg0.anIntArray109[2];
				Static108.aClass112_1.method3592(local21, local411 - local413, local27, arg0.anIntArray109);
				local1083 = arg0.anIntArray109[2];
				local1314 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1314 = local1083;
					local711 = local1079;
				}
				local1314 -= 91;
				local711 += 91;
				if (local1314 < local711 - 1597) {
					local1314 = local711 - 1597;
				}
				local1645.anInt553 = local1314;
				local1645.anInt554 = local711;
				local1645.aBoolean41 = true;
				Static98.aClass59_3.method4868(local1645);
			} else {
				arg1.aClass21_1 = null;
			}
		}
		if (!arg1.aBoolean94) {
			return;
		}
		if (arg1.aByte10 != 0) {
			return;
		}
		if (local6 <= Static210.anInt5625 && local6 > Static266.anInt5098) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean94) {
				return;
			}
		}
		if (local6 >= Static210.anInt5625 && local6 < Static271.anInt5206 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean94) {
				return;
			}
		}
		if (local9 <= Static103.anInt2249 && local9 > Static233.anInt4557) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean94) {
				return;
			}
		}
		if (local9 >= Static103.anInt2249 && local9 < Static166.anInt3360 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean94) {
				return;
			}
		}
		arg1.aBoolean94 = false;
		Static319.anInt6052--;
		@Pc(1839) Class25_Sub5 local1839 = arg1.aClass25_Sub5_1;
		if (local1839 != null && local1839.aBoolean470) {
			if (Static65.aBoolean130) {
				Static331.method5535(arg0, local12, local6, local9);
				Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
			}
			@Pc(1862) Class63_Sub3 local1862 = local1839.method5590(Static98.aClass59_3);
			if (local1862 != null) {
				local1862.aClass25_1 = local1839;
				local1862.anInt2771 = local12;
				local1862.anInt2768 = local6;
				local1862.anInt2772 = local9;
				Static161.aClass24_1.method620(local1862);
			}
		}
		if (arg1.aShort14 != 0) {
			@Pc(1886) Class25_Sub3 local1886 = arg1.aClass25_Sub3_2;
			if (local1886 != null && !Static65.method1811(local15, local6, local9, local1886.method5547())) {
				if ((local1886.anInt6237 & arg1.aShort14) != 0) {
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					local382 = local1886.method5590(Static98.aClass59_3);
					if (local382 != null) {
						local382.aClass25_1 = local1886;
						local382.anInt2771 = local12;
						local382.anInt2768 = local6;
						local382.anInt2772 = local9;
						Static161.aClass24_1.method620(local382);
					}
				} else if (local1886.anInt6237 == 256) {
					local413 = local1886.anInt6241 - Static10.anInt345;
					local1079 = local1886.anInt6244 - Static21.anInt6206;
					local1083 = local1886.anInt6242;
					if (local1083 == 1 || local1083 == 2) {
						local1314 = -local413;
					} else {
						local1314 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static65.aBoolean130) {
						Static331.method5535(arg0, local12, local6, local9);
						Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
					}
					@Pc(1996) Class25_Sub3 local1996 = arg1.aClass25_Sub3_1;
					@Pc(2004) Class63_Sub3 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5590(Static98.aClass59_3);
						if (local2004 != null) {
							local2004.aClass25_1 = local1886;
							local2004.anInt2771 = local12;
							local2004.anInt2768 = local6;
							local2004.anInt2772 = local9;
							Static161.aClass24_1.method620(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5590(Static98.aClass59_3);
						if (local2004 != null) {
							local2004.aClass25_1 = local1996;
							local2004.anInt2771 = local12;
							local2004.anInt2768 = local6;
							local2004.anInt2772 = local9;
							Static161.aClass24_1.method620(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass25_Sub2_1;
			local416 = arg1.aClass25_Sub2_2;
			@Pc(2089) Class63_Sub3 local2089;
			if (local416 != null && (local416.anInt4336 & arg1.aShort14) != 0 && !Static276.method4706(local15, local6, local9, local416.anInt4336)) {
				if (Static65.aBoolean130) {
					Static289.method4917(arg0, local416.anInt4336, local12, local6, local9);
					Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
				}
				local2089 = local416.method5590(Static98.aClass59_3);
				if (local2089 != null) {
					local2089.aClass25_1 = local416;
					local2089.anInt2771 = local12;
					local2089.anInt2768 = local6;
					local2089.anInt2772 = local9;
					Static161.aClass24_1.method620(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt4336 & arg1.aShort14) != 0 && !Static276.method4706(local15, local6, local9, local1062.anInt4336)) {
				if (Static65.aBoolean130) {
					Static289.method4917(arg0, local1062.anInt4336, local12, local6, local9);
					Static98.aClass59_3.method4885(arg0.anInt1945, arg0.aClass5_Sub13_Sub1Array2);
				}
				local2089 = local1062.method5590(Static98.aClass59_3);
				if (local2089 != null) {
					local2089.aClass25_1 = local1062;
					local2089.anInt2771 = local12;
					local2089.anInt2768 = local6;
					local2089.anInt2772 = local9;
					Static161.aClass24_1.method620(local2089);
				}
			}
		}
		@Pc(2175) Class51 local2175;
		if (local12 < Static248.anInt4820 - 1) {
			local2175 = Static138.aClass51ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean94) {
				Static134.aClass28_1.method5710(local2175);
			}
		}
		if (local6 < Static210.anInt5625) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean94) {
				Static134.aClass28_1.method5715(local2175);
			}
		}
		if (local9 < Static103.anInt2249) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean94) {
				Static134.aClass28_1.method5715(local2175);
			}
		}
		if (local6 > Static210.anInt5625) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean94) {
				Static134.aClass28_1.method5715(local2175);
			}
		}
		if (local9 > Static103.anInt2249) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean94) {
				Static134.aClass28_1.method5715(local2175);
			}
		}
	}
}
