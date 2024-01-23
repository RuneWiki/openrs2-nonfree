import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
	public static int anInt65;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "Lclient!bi;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!dh;")
	public static Class33 aClass33_1 = new Class33(4);

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString2 = "Loading...";

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "[I")
	public static int[] anIntArray5 = new int[1000];

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public static void method41() {
		for (@Pc(7) int local7 = 0; local7 < Static142.anInt2925; local7++) {
			@Pc(14) Class90 local14 = Static261.method3955(local7);
			if (local14 != null && local14.anInt2807 == 0) {
				Static136.anIntArray250[local7] = 0;
				Static221.anIntArray393[local7] = 0;
			}
		}
		Static140.aClass97_12 = new Class97(16);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method42() {
		anIntArray5 = null;
		aString2 = null;
		aClass4_Sub2_Sub1_1 = null;
		aClass33_1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!ge;Lclient!ge;ZB)I")
	public static int method43(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub1 arg1, @OriginalArg(2) Class53_Sub1 arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 == 1) {
			@Pc(11) int local11 = arg1.anInt1771;
			@Pc(14) int local14 = arg2.anInt1771;
			if (!arg3) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg0 == 2) {
			return Static181.method1756(Static139.anInt2870, arg2.method1380().aString148, arg1.method1380().aString148);
		} else if (arg0 == 3) {
			if (arg1.aString48.equals("-")) {
				if (arg2.aString48.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString48.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static181.method1756(Static139.anInt2870, arg2.aString48, arg1.aString48);
			}
		} else if (arg0 == 4) {
			return arg1.method1370() ? (arg2.method1370() ? 0 : 1) : (arg2.method1370() ? -1 : 0);
		} else if (arg0 == 5) {
			return arg1.method1371() ? (arg2.method1371() ? 0 : 1) : (arg2.method1371() ? -1 : 0);
		} else if (arg0 == 6) {
			return arg1.method1377() ? (arg2.method1377() ? 0 : 1) : arg2.method1377() ? -1 : 0;
		} else if (arg0 == 7) {
			return arg1.method1378() ? (arg2.method1378() ? 0 : 1) : (arg2.method1378() ? -1 : 0);
		} else {
			return arg1.anInt1775 - arg2.anInt1775;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBIIII)V")
	public static void method44(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static142.method2311(arg0, Static141.anInt2889, Static171.anInt3392);
		@Pc(17) int local17 = Static142.method2311(arg4, Static141.anInt2889, Static171.anInt3392);
		@Pc(23) int local23 = Static142.method2311(arg1, Static154.anInt3126, Static211.anInt4200);
		@Pc(37) int local37 = Static142.method2311(arg3, Static154.anInt3126, Static211.anInt4200);
		for (@Pc(39) int local39 = local11; local39 <= local17; local39++) {
			Static129.method2127(local37, local23, arg2, Static234.anIntArrayArray40[local39]);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)V")
	public static void method45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg6 - arg5;
		@Pc(19) int local19 = arg6 * arg6;
		@Pc(24) int local24 = arg2 - arg5;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local24 * local24;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local32 << 1;
		@Pc(48) int local48 = local19 << 1;
		@Pc(52) int local52 = arg2 << 1;
		@Pc(62) int local62 = local19 * (1 - local52) + local40;
		@Pc(66) int local66 = local36 << 1;
		@Pc(75) int local75 = local28 - local48 * (local52 - 1);
		@Pc(79) int local79 = local24 << 1;
		@Pc(88) int local88 = (1 - local79) * local32 + local66;
		@Pc(97) int local97 = local36 - local44 * (local79 - 1);
		@Pc(101) int local101 = local19 << 2;
		@Pc(105) int local105 = local28 << 2;
		@Pc(109) int local109 = local32 << 2;
		@Pc(113) int local113 = local40 * 3;
		@Pc(117) int local117 = local36 << 2;
		@Pc(123) int local123 = (local52 - 3) * local48;
		@Pc(127) int local127 = local66 * 3;
		@Pc(129) int local129 = local105;
		@Pc(135) int local135 = local101 * (arg2 - 1);
		@Pc(141) int local141 = local44 * (local79 - 3);
		@Pc(143) int local143 = local117;
		@Pc(147) int[] local147 = Static234.anIntArrayArray40[arg1];
		@Pc(153) int local153 = (local24 - 1) * local109;
		Static129.method2127(arg0 - local15, arg0 + -arg6, arg3, local147);
		Static129.method2127(local15 + arg0, arg0 - local15, arg4, local147);
		Static129.method2127(arg0 + arg6, local15 + arg0, arg3, local147);
		while (local7 > 0) {
			if (local62 < 0) {
				while (local62 < 0) {
					local75 += local129;
					local62 += local113;
					local113 += local105;
					local9++;
					local129 += local105;
				}
			}
			@Pc(224) boolean local224 = local24 >= local7;
			local7--;
			if (local224) {
				if (local88 < 0) {
					while (local88 < 0) {
						local11++;
						local88 += local127;
						local127 += local117;
						local97 += local143;
						local143 += local117;
					}
				}
				if (local97 < 0) {
					local11++;
					local97 += local143;
					local143 += local117;
					local88 += local127;
					local127 += local117;
				}
				local97 += -local141;
				local88 += -local153;
				local153 -= local109;
				local141 -= local109;
			}
			@Pc(296) int local296 = arg1 - local7;
			if (local75 < 0) {
				local62 += local113;
				local9++;
				local113 += local105;
				local75 += local129;
				local129 += local105;
			}
			local75 += -local123;
			@Pc(327) int local327 = local9 + arg0;
			local62 += -local135;
			local135 -= local101;
			@Pc(340) int local340 = arg0 - local9;
			@Pc(345) int local345 = arg1 + local7;
			if (local224) {
				@Pc(351) int local351 = arg0 + local11;
				@Pc(356) int local356 = arg0 - local11;
				Static129.method2127(local356, local340, arg3, Static234.anIntArrayArray40[local296]);
				Static129.method2127(local351, local356, arg4, Static234.anIntArrayArray40[local296]);
				Static129.method2127(local327, local351, arg3, Static234.anIntArrayArray40[local296]);
				Static129.method2127(local356, local340, arg3, Static234.anIntArrayArray40[local345]);
				Static129.method2127(local351, local356, arg4, Static234.anIntArrayArray40[local345]);
				Static129.method2127(local327, local351, arg3, Static234.anIntArrayArray40[local345]);
			} else {
				Static129.method2127(local327, local340, arg3, Static234.anIntArrayArray40[local296]);
				Static129.method2127(local327, local340, arg3, Static234.anIntArrayArray40[local345]);
			}
			local123 -= local101;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIILclient!lc;Z)V")
	public static void method46(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class98 arg2) {
		Static147.aBoolean197 = false;
		Static57.anInt1137 = 2;
		Static125.aClass98_78 = arg2;
		Static297.anInt5500 = arg1;
		Static42.anInt863 = 1;
		Static217.anInt4316 = arg0;
		Static150.anInt3042 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIIII)V")
	public static void method47(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class4_Sub23 local12;
		for (local12 = (Class4_Sub23) Static47.aClass10_8.method190(); local12 != null; local12 = (Class4_Sub23) Static47.aClass10_8.method191()) {
			Static43.method4380(arg3, local12, arg2, arg0, arg1);
		}
		@Pc(41) byte local41;
		@Pc(46) Class72 local46;
		@Pc(152) int local152;
		for (local12 = (Class4_Sub23) Static118.aClass10_27.method190(); local12 != null; local12 = (Class4_Sub23) Static118.aClass10_27.method191()) {
			local41 = 1;
			local46 = local12.aClass12_Sub3_Sub1_1.method3361();
			if (local46.anInt2564 == local12.aClass12_Sub3_Sub1_1.anInt4127) {
				local41 = 0;
			} else if (local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2556 || local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2582 || local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2549 || local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2559) {
				local41 = 2;
			} else if (local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2566 || local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2569 || local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2550 || local12.aClass12_Sub3_Sub1_1.anInt4127 == local46.anInt2565) {
				local41 = 3;
			}
			if (local41 != local12.anInt3432) {
				local152 = Static170.method2677(local12.aClass12_Sub3_Sub1_1);
				if (local12.anInt3422 != local152) {
					if (local12.aClass4_Sub9_Sub1_3 != null) {
						Static219.aClass4_Sub9_Sub4_2.method1470(local12.aClass4_Sub9_Sub1_3);
						local12.aClass4_Sub9_Sub1_3 = null;
					}
					local12.anInt3422 = local152;
				}
				local12.anInt3432 = local41;
			}
			local12.anInt3418 = local12.aClass12_Sub3_Sub1_1.anInt4141;
			local12.anInt3419 = local12.aClass12_Sub3_Sub1_1.anInt4141 + local12.aClass12_Sub3_Sub1_1.method3375() * 64;
			local12.anInt3417 = local12.aClass12_Sub3_Sub1_1.anInt4113;
			local12.anInt3429 = local12.aClass12_Sub3_Sub1_1.anInt4113 + local12.aClass12_Sub3_Sub1_1.method3375() * 64;
			Static43.method4380(arg3, local12, arg2, arg0, arg1);
		}
		for (local12 = (Class4_Sub23) Static262.aClass97_22.method2363(); local12 != null; local12 = (Class4_Sub23) Static262.aClass97_22.method2367()) {
			local41 = 1;
			local46 = local12.aClass12_Sub3_Sub2_1.method3361();
			if (local46.anInt2564 == local12.aClass12_Sub3_Sub2_1.anInt4127) {
				local41 = 0;
			} else if (local46.anInt2556 == local12.aClass12_Sub3_Sub2_1.anInt4127 || local12.aClass12_Sub3_Sub2_1.anInt4127 == local46.anInt2582 || local46.anInt2549 == local12.aClass12_Sub3_Sub2_1.anInt4127 || local46.anInt2559 == local12.aClass12_Sub3_Sub2_1.anInt4127) {
				local41 = 2;
			} else if (local12.aClass12_Sub3_Sub2_1.anInt4127 == local46.anInt2566 || local12.aClass12_Sub3_Sub2_1.anInt4127 == local46.anInt2569 || local46.anInt2550 == local12.aClass12_Sub3_Sub2_1.anInt4127 || local46.anInt2565 == local12.aClass12_Sub3_Sub2_1.anInt4127) {
				local41 = 3;
			}
			if (local41 != local12.anInt3432) {
				local152 = Static147.method2370(local12.aClass12_Sub3_Sub2_1);
				if (local152 != local12.anInt3422) {
					if (local12.aClass4_Sub9_Sub1_3 != null) {
						Static219.aClass4_Sub9_Sub4_2.method1470(local12.aClass4_Sub9_Sub1_3);
						local12.aClass4_Sub9_Sub1_3 = null;
					}
					local12.anInt3422 = local152;
				}
				local12.anInt3432 = local41;
			}
			local12.anInt3418 = local12.aClass12_Sub3_Sub2_1.anInt4141;
			local12.anInt3419 = local12.aClass12_Sub3_Sub2_1.anInt4141 + local12.aClass12_Sub3_Sub2_1.method3375() * 64;
			local12.anInt3417 = local12.aClass12_Sub3_Sub2_1.anInt4113;
			local12.anInt3429 = local12.aClass12_Sub3_Sub2_1.anInt4113 + local12.aClass12_Sub3_Sub2_1.method3375() * 64;
			Static43.method4380(arg3, local12, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	public static void method48() {
		if (Static184.anInt3615 == 0) {
			return;
		}
		try {
			if (++Static177.anInt3486 > 1500) {
				if (Static259.aClass158_3 != null) {
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
				}
				if (Static192.anInt3794 >= 1) {
					Static184.anInt3615 = 0;
					Static254.anInt4785 = -5;
					return;
				}
				Static184.anInt3615 = 1;
				if (Static90.anInt1866 == Static173.anInt3426) {
					Static90.anInt1866 = Static28.anInt524;
				} else {
					Static90.anInt1866 = Static173.anInt3426;
				}
				Static177.anInt3486 = 0;
				Static192.anInt3794++;
			}
			if (Static184.anInt3615 == 1) {
				Static86.aClass123_2 = Static87.aClass164_2.method3941(Static145.aString98, Static90.anInt1866);
				Static184.anInt3615 = 2;
			}
			@Pc(126) int local126;
			if (Static184.anInt3615 == 2) {
				if (Static86.aClass123_2.anInt3791 == 2) {
					throw new IOException();
				}
				if (Static86.aClass123_2.anInt3791 != 1) {
					return;
				}
				Static259.aClass158_3 = new Class158((Socket) Static86.aClass123_2.anObject4, Static87.aClass164_2);
				Static86.aClass123_2 = null;
				Static259.aClass158_3.method3780(Static142.aClass4_Sub17_Sub1_3.aByteArray30, Static142.aClass4_Sub17_Sub1_3.anInt2400);
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				local126 = Static259.aClass158_3.method3777();
				if (Static83.aClass51_4 != null) {
					Static83.aClass51_4.method3280();
				}
				if (Static147.aClass51_3 != null) {
					Static147.aClass51_3.method3280();
				}
				if (local126 != 101) {
					Static254.anInt4785 = local126;
					Static184.anInt3615 = 0;
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
					return;
				}
				Static184.anInt3615 = 3;
			}
			if (Static184.anInt3615 == 3) {
				if (Static259.aClass158_3.method3774() >= 2) {
					local126 = Static259.aClass158_3.method3777() << 8 | Static259.aClass158_3.method3777();
					Static61.method953(local126);
					if (Static211.anInt4204 != -1) {
						Static184.anInt3615 = 0;
						Static259.aClass158_3.method3779();
						Static259.aClass158_3 = null;
						Static47.method748();
						return;
					}
					Static254.anInt4785 = 6;
					Static184.anInt3615 = 0;
					Static259.aClass158_3.method3779();
					Static259.aClass158_3 = null;
					return;
				}
				return;
			}
		} catch (@Pc(210) IOException local210) {
			if (Static259.aClass158_3 != null) {
				Static259.aClass158_3.method3779();
				Static259.aClass158_3 = null;
			}
			if (Static192.anInt3794 < 1) {
				if (Static90.anInt1866 == Static173.anInt3426) {
					Static90.anInt1866 = Static28.anInt524;
				} else {
					Static90.anInt1866 = Static173.anInt3426;
				}
				Static192.anInt3794++;
				Static184.anInt3615 = 1;
				Static177.anInt3486 = 0;
			} else {
				Static254.anInt4785 = -4;
				Static184.anInt3615 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!g;)V")
	public static void method50(@OriginalArg(1) Class12_Sub3 arg0) {
		@Pc(12) Class72 local12 = arg0.method3361();
		arg0.anInt4127 = local12.anInt2564;
		if (arg0.anInt4157 == 0) {
			arg0.anInt4164 = 0;
			return;
		}
		if (arg0.anInt4178 != -1 && arg0.anInt4119 == 0) {
			@Pc(40) Class141 local40 = Static296.method1376(arg0.anInt4178);
			if (arg0.anInt4189 > 0 && local40.anInt4366 == 0) {
				arg0.anInt4164++;
				return;
			}
			if (arg0.anInt4189 <= 0 && local40.anInt4361 == 0) {
				arg0.anInt4164++;
				return;
			}
		}
		if (arg0.anInt4125 != -1 && Static104.anInt2226 >= arg0.anInt4144) {
			@Pc(93) Class126 local93 = Static262.method3973(arg0.anInt4125);
			if (local93.aBoolean245 && local93.anInt3816 != -1) {
				@Pc(106) Class141 local106 = Static296.method1376(local93.anInt3816);
				if (arg0.anInt4189 > 0 && local106.anInt4366 == 0) {
					arg0.anInt4164++;
					return;
				}
				if (arg0.anInt4189 <= 0 && local106.anInt4361 == 0) {
					arg0.anInt4164++;
					return;
				}
			}
		}
		@Pc(140) int local140 = arg0.anInt4141;
		@Pc(143) int local143 = arg0.anInt4113;
		@Pc(159) int local159 = arg0.anIntArray376[arg0.anInt4157 - 1] * 128 + arg0.method3375() * 64;
		@Pc(176) int local176 = arg0.anIntArray379[arg0.anInt4157 - 1] * 128 + arg0.method3375() * 64;
		if (local159 - local140 > 256 || local159 - local140 < -256 || local176 - local143 > 256 || local176 - local143 < -256) {
			arg0.anInt4141 = local159;
			arg0.anInt4113 = local176;
			return;
		}
		if (local140 < local159) {
			if (local176 > local143) {
				arg0.anInt4136 = 1280;
			} else if (local143 > local176) {
				arg0.anInt4136 = 1792;
			} else {
				arg0.anInt4136 = 1536;
			}
		} else if (local140 > local159) {
			if (local176 > local143) {
				arg0.anInt4136 = 768;
			} else if (local176 < local143) {
				arg0.anInt4136 = 256;
			} else {
				arg0.anInt4136 = 512;
			}
		} else if (local176 > local143) {
			arg0.anInt4136 = 1024;
		} else if (local143 > local176) {
			arg0.anInt4136 = 0;
		}
		@Pc(301) int local301 = 4;
		@Pc(304) int local304 = local12.anInt2584;
		@Pc(312) int local312 = arg0.anInt4136 - arg0.anInt4121 & 0x7FF;
		@Pc(314) boolean local314 = true;
		if (local312 > 1024) {
			local312 -= 2048;
		}
		if (local312 >= -256 && local312 <= 256) {
			local304 = local12.anInt2583;
		} else if (local312 >= 256 && local312 < 768) {
			local304 = local12.anInt2560;
		} else if (local312 >= -768 && local312 <= -256) {
			local304 = local12.anInt2558;
		}
		@Pc(360) byte local360 = 1;
		if (local304 == -1) {
			local304 = local12.anInt2583;
		}
		arg0.anInt4127 = local304;
		if (arg0 instanceof Class12_Sub3_Sub1) {
			local314 = ((Class12_Sub3_Sub1) arg0).aClass175_1.aBoolean341;
		}
		if (local314) {
			if (arg0.anInt4121 != arg0.anInt4136 && arg0.anInt4184 == -1 && arg0.anInt4115 != 0) {
				local301 = 2;
			}
			if (arg0.anInt4157 > 2) {
				local301 = 6;
			}
			if (arg0.anInt4157 > 3) {
				local301 = 8;
			}
			if (arg0.anInt4164 > 0 && arg0.anInt4157 > 1) {
				arg0.anInt4164--;
				local301 = 8;
			}
		} else {
			if (arg0.anInt4157 > 1) {
				local301 = 6;
			}
			if (arg0.anInt4157 > 2) {
				local301 = 8;
			}
			if (arg0.anInt4164 > 0 && arg0.anInt4157 > 1) {
				arg0.anInt4164--;
				local301 = 8;
			}
		}
		if (arg0.aByteArray59[arg0.anInt4157 - 1] == 2) {
			local301 <<= 0x1;
			local360 = 2;
		} else if (arg0.aByteArray59[arg0.anInt4157 - 1] == 0) {
			local301 >>= 0x1;
			local360 = 0;
		}
		if (local301 < 8 || local12.anInt2556 == -1) {
			if (local12.anInt2566 != -1 && local360 == 0) {
				if (arg0.anInt4127 == local12.anInt2584 && local12.anInt2569 != -1) {
					arg0.anInt4127 = local12.anInt2569;
				} else if (arg0.anInt4127 == local12.anInt2558 && local12.anInt2565 != -1) {
					arg0.anInt4127 = local12.anInt2565;
				} else if (local12.anInt2560 == arg0.anInt4127 && local12.anInt2550 != -1) {
					arg0.anInt4127 = local12.anInt2550;
				} else {
					arg0.anInt4127 = local12.anInt2566;
				}
			}
		} else if (arg0.anInt4127 == local12.anInt2584 && local12.anInt2582 != -1) {
			arg0.anInt4127 = local12.anInt2582;
		} else if (arg0.anInt4127 == local12.anInt2558 && local12.anInt2559 != -1) {
			arg0.anInt4127 = local12.anInt2559;
		} else if (local12.anInt2560 == arg0.anInt4127 && local12.anInt2549 != -1) {
			arg0.anInt4127 = local12.anInt2549;
		} else {
			arg0.anInt4127 = local12.anInt2556;
		}
		if (local12.anInt2577 != -1) {
			local301 <<= 0x7;
			if (arg0.anInt4157 == 1) {
				@Pc(641) int local641 = arg0.anInt4114 * arg0.anInt4114;
				@Pc(658) int local658 = (local176 >= arg0.anInt4113 ? local176 - arg0.anInt4113 : arg0.anInt4113 - local176) << 7;
				@Pc(679) int local679 = (arg0.anInt4141 > local159 ? arg0.anInt4141 - local159 : local159 - arg0.anInt4141) << 7;
				@Pc(686) int local686 = local679 <= local658 ? local658 : local679;
				@Pc(693) int local693 = local12.anInt2577 * 2 * local686;
				if (local641 > local693) {
					arg0.anInt4114 /= 2;
				} else if (local686 < local641 / 2) {
					arg0.anInt4114 -= local12.anInt2577;
					if (arg0.anInt4114 < 0) {
						arg0.anInt4114 = 0;
					}
				} else if (local301 > arg0.anInt4114) {
					arg0.anInt4114 += local12.anInt2577;
					if (arg0.anInt4114 > local301) {
						arg0.anInt4114 = local301;
					}
				}
			} else if (local301 > arg0.anInt4114) {
				arg0.anInt4114 += local12.anInt2577;
				if (arg0.anInt4114 > local301) {
					arg0.anInt4114 = local301;
				}
			} else if (arg0.anInt4114 > 0) {
				arg0.anInt4114 -= local12.anInt2577;
				if (arg0.anInt4114 < 0) {
					arg0.anInt4114 = 0;
				}
			}
			local301 = arg0.anInt4114 >> 7;
			if (local301 < 1) {
				local301 = 1;
			}
		}
		if (local143 < local176) {
			arg0.anInt4113 += local301;
			if (local176 < arg0.anInt4113) {
				arg0.anInt4113 = local176;
			}
		} else if (local176 < local143) {
			arg0.anInt4113 -= local301;
			if (arg0.anInt4113 < local176) {
				arg0.anInt4113 = local176;
			}
		}
		if (local159 > local140) {
			arg0.anInt4141 += local301;
			if (local159 < arg0.anInt4141) {
				arg0.anInt4141 = local159;
			}
		} else if (local159 < local140) {
			arg0.anInt4141 -= local301;
			if (local159 > arg0.anInt4141) {
				arg0.anInt4141 = local159;
			}
		}
		if (local159 == arg0.anInt4141 && arg0.anInt4113 == local176) {
			if (arg0.anInt4189 > 0) {
				arg0.anInt4189--;
			}
			arg0.anInt4157--;
		}
	}
}
