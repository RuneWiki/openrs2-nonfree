import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!de", name = "z", descriptor = "I")
	public static int anInt1110;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!og;")
	public static final Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!de", name = "t", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!de", name = "u", descriptor = "[I")
	public static final int[] anIntArray147 = new int[14];

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_23 = new Class77(42, -1);

	@OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
	public static final int[] anIntArray148 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!de", name = "y", descriptor = "[I")
	public static int[] anIntArray149 = new int[2];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ms;III)V")
	public static void method1042(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static214.anInt3952 = arg1;
		Static390.anInt6703 = arg2;
		Static392.aClass155_39 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!es;IZ)V")
	public static void method1044(@OriginalArg(0) Class12_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class170 local9 = arg0.method4711();
		if (arg0.anInt5380 == 0) {
			arg0.anInt5377 = 0;
			Static253.anInt5659 = -1;
			Static106.anInt2066 = 0;
			return;
		}
		if (arg0.anInt5371 != -1 && arg0.anInt5357 == 0) {
			@Pc(42) Class189 local42 = Static351.aClass175_3.method4107(arg0.anInt5371);
			if (arg0.anInt5378 > 0 && local42.anInt5156 == 0) {
				Static253.anInt5659 = -1;
				arg0.anInt5377++;
				Static106.anInt2066 = 0;
				return;
			}
			if (arg0.anInt5378 <= 0 && local42.anInt5167 == 0) {
				arg0.anInt5377++;
				Static253.anInt5659 = -1;
				Static106.anInt2066 = 0;
				return;
			}
		}
		if (arg0.anInt5330 != -1 && arg0.anInt5367 <= Static295.anInt5281) {
			@Pc(104) Class220 local104 = Static168.aClass74_1.method1772(arg0.anInt5330);
			if (local104.aBoolean455 && local104.anInt6020 != -1) {
				@Pc(118) Class189 local118 = Static351.aClass175_3.method4107(local104.anInt6020);
				if (arg0.anInt5378 > 0 && local118.anInt5156 == 0) {
					Static253.anInt5659 = -1;
					Static106.anInt2066 = 0;
					arg0.anInt5377++;
					return;
				}
				if (arg0.anInt5378 <= 0 && local118.anInt5167 == 0) {
					arg0.anInt5377++;
					Static106.anInt2066 = 0;
					Static253.anInt5659 = -1;
					return;
				}
			}
		}
		@Pc(164) int local164 = arg0.anInt6328;
		@Pc(167) int local167 = arg0.anInt6317;
		@Pc(184) int local184 = arg0.anIntArray659[arg0.anInt5380 - 1] * 128 + arg0.method4706() * 64;
		@Pc(200) int local200 = arg0.anIntArray658[arg0.anInt5380 - 1] * 128 + arg0.method4706() * 64;
		if (local184 > local164) {
			if (local200 > local167) {
				arg0.method4697(10240);
			} else if (local200 >= local167) {
				arg0.method4697(12288);
			} else {
				arg0.method4697(14336);
			}
		} else if (local164 > local184) {
			if (local200 > local167) {
				arg0.method4697(6144);
			} else if (local200 < local167) {
				arg0.method4697(2048);
			} else {
				arg0.method4697(4096);
			}
		} else if (local200 > local167) {
			arg0.method4697(8192);
		} else if (local167 > local200) {
			arg0.method4697(0);
		}
		@Pc(296) byte local296 = arg0.aByteArray84[arg0.anInt5380 - 1];
		if (!arg1 && (local184 - local164 > 256 || local184 - local164 < -256 || local200 - local167 > 256 || local200 - local167 < -256)) {
			arg0.anInt6317 = local200;
			arg0.anInt6328 = local184;
			arg0.method4703(arg0.anInt5328);
			Static253.anInt5659 = -1;
			Static106.anInt2066 = 0;
			arg0.anInt5380--;
			if (arg0.anInt5378 > 0) {
				arg0.anInt5378--;
			}
			return;
		}
		@Pc(355) int local355 = 4;
		@Pc(357) boolean local357 = true;
		if (arg0 instanceof Class12_Sub1_Sub2_Sub1) {
			local357 = ((Class12_Sub1_Sub2_Sub1) arg0).aClass240_1.aBoolean480;
		}
		@Pc(375) int local375;
		if (local357) {
			local375 = arg0.anInt5328 - arg0.aClass32_7.anInt740;
			if (local375 != 0 && arg0.anInt5345 == -1 && arg0.anInt5317 != 0) {
				local355 = 2;
			}
			if (!arg1 && arg0.anInt5380 > 2) {
				local355 = 6;
			}
			if (!arg1 && arg0.anInt5380 > 3) {
				local355 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5380 > 1) {
				local355 = 6;
			}
			if (!arg1 && arg0.anInt5380 > 2) {
				local355 = 8;
			}
		}
		if (arg0.anInt5377 > 0 && arg0.anInt5380 > 1) {
			arg0.anInt5377--;
			local355 = 8;
		}
		if (local296 == 2) {
			local355 <<= 0x1;
		} else if (local296 == 0) {
			local355 >>= 0x1;
		}
		Static106.anInt2066 = 0;
		if (local9.anInt4539 != -1) {
			local355 <<= 0x7;
			if (arg0.anInt5380 == 1) {
				local375 = arg0.anInt5379 * arg0.anInt5379;
				@Pc(507) int local507 = (arg0.anInt6328 <= local184 ? local184 - arg0.anInt6328 : arg0.anInt6328 - local184) << 7;
				@Pc(529) int local529 = (arg0.anInt6317 <= local200 ? local200 - arg0.anInt6317 : -local200 + arg0.anInt6317) << 7;
				@Pc(540) int local540 = local529 >= local507 ? local529 : local507;
				@Pc(547) int local547 = local540 * 2 * local9.anInt4539;
				if (local375 > local547) {
					arg0.anInt5379 /= 2;
				} else if (local375 / 2 > local540) {
					arg0.anInt5379 -= local9.anInt4539;
					if (arg0.anInt5379 < 0) {
						arg0.anInt5379 = 0;
					}
				} else if (local355 > arg0.anInt5379) {
					arg0.anInt5379 += local9.anInt4539;
					if (local355 < arg0.anInt5379) {
						arg0.anInt5379 = local355;
					}
				}
			} else if (arg0.anInt5379 < local355) {
				arg0.anInt5379 += local9.anInt4539;
				if (local355 < arg0.anInt5379) {
					arg0.anInt5379 = local355;
				}
			} else if (arg0.anInt5379 > 0) {
				arg0.anInt5379 -= local9.anInt4539;
				if (arg0.anInt5379 < 0) {
					arg0.anInt5379 = 0;
				}
			}
			local355 = arg0.anInt5379 >> 7;
			if (local355 < 1) {
				local355 = 1;
			}
		}
		if (local184 > local164) {
			arg0.anInt6328 += local355;
			Static106.anInt2066 |= 0x4;
			if (local184 < arg0.anInt6328) {
				arg0.anInt6328 = local184;
			}
		} else if (local164 > local184) {
			Static106.anInt2066 |= 0x8;
			arg0.anInt6328 -= local355;
			if (local184 > arg0.anInt6328) {
				arg0.anInt6328 = local184;
			}
		}
		if (local167 < local200) {
			arg0.anInt6317 += local355;
			Static106.anInt2066 |= 0x1;
			if (arg0.anInt6317 > local200) {
				arg0.anInt6317 = local200;
			}
		} else if (local200 < local167) {
			arg0.anInt6317 -= local355;
			Static106.anInt2066 |= 0x2;
			if (local200 > arg0.anInt6317) {
				arg0.anInt6317 = local200;
			}
		}
		if (local355 >= 8) {
			Static253.anInt5659 = 2;
		} else {
			Static253.anInt5659 = local296;
		}
		if (arg0.anInt6328 != local184 || arg0.anInt6317 != local200) {
			return;
		}
		arg0.anInt5380--;
		if (arg0.anInt5378 > 0) {
			arg0.anInt5378--;
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BIIIIZ)V")
	public static void method1045(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static297.aClass227ArrayArrayArray7 == null) {
			Static304.aClass82_4.method4486(arg3, arg0, arg1, -16777216, arg2);
		} else if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >= 0 && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 < Static392.anInt6751 * 128 && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >= 0 && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 < Static307.anInt5484 * 128) {
			Static47.anInt936++;
			if (Static267.aClass12_Sub1_Sub2_Sub2_1 != null && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 - (Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() - 1) * 64 >> 7 == Static292.anInt5161 && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 + 64 - Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() * 64 >> 7 == Static204.anInt3770) {
				Static292.anInt5161 = -1;
				Static204.anInt3770 = -1;
				Static305.method2102();
			}
			Static365.method2195();
			if (!arg4) {
				Static82.method1456();
			}
			Static235.method3840();
			Static365.method2199(arg0, arg2, true, arg3, arg1);
			@Pc(116) int local116 = Static244.anInt1026;
			@Pc(118) int local118 = Static143.anInt2605;
			@Pc(120) int local120 = Static233.anInt4272;
			@Pc(122) int local122 = Static108.anInt2142;
			@Pc(130) int local130;
			@Pc(167) int local167;
			if (Static283.anInt5017 == 1) {
				local130 = (int) Static295.aFloat73;
				if (local130 < Static369.anInt6437 >> 8) {
					local130 = Static369.anInt6437 >> 8;
				}
				if (Static57.aBooleanArray108[4] && local130 < Static318.anIntArray570[4] + 128) {
					local130 = Static318.anIntArray570[4] + 128;
				}
				local167 = (int) Static18.aFloat8 + Static303.anInt5443 & 0x3FFF;
				Static355.method5389(Static301.anInt5428, local122, Static243.anInt4394, local130, local167, Static18.method508(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317, Static331.anInt5804, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328) - 50, (local130 >> 3) * 3 + 600);
			} else if (Static283.anInt5017 == 4) {
				local130 = (int) Static295.aFloat73;
				if (local130 < Static369.anInt6437 >> 8) {
					local130 = Static369.anInt6437 >> 8;
				}
				if (Static57.aBooleanArray108[4] && Static318.anIntArray570[4] + 128 > local130) {
					local130 = Static318.anIntArray570[4] + 128;
				}
				local167 = (int) Static18.aFloat8 & 0x3FFF;
				Static355.method5389(Static301.anInt5428, local122, Static243.anInt4394, local130, local167, Static18.method508(Static290.anInt5133, Static331.anInt5804, Static332.anInt5822) - 50, 600 - -((local130 >> 3) * 3));
			} else if (Static283.anInt5017 == 5) {
				Static249.method3986(local122);
			}
			local130 = Static160.anInt2915;
			local167 = Static71.anInt1354;
			@Pc(267) int local267 = Static22.anInt547;
			@Pc(269) int local269 = Static278.anInt1556;
			@Pc(271) int local271 = Static392.anInt6749;
			@Pc(315) int local315;
			for (@Pc(273) int local273 = 0; local273 < 5; local273++) {
				if (Static57.aBooleanArray108[local273]) {
					local315 = (int) ((double) -Static289.anIntArray633[local273] + Math.random() * (double) (Static289.anIntArray633[local273] * 2 + 1) + Math.sin((double) Static359.anIntArray761[local273] / 100.0D * (double) Static84.anIntArray214[local273]) * (double) Static318.anIntArray570[local273]);
					if (local273 == 1) {
						Static71.anInt1354 += local315;
					}
					if (local273 == 3) {
						Static392.anInt6749 = local315 + Static392.anInt6749 & 0x3FFF;
					}
					if (local273 == 2) {
						Static22.anInt547 += local315;
					}
					if (local273 == 0) {
						Static160.anInt2915 += local315;
					}
					if (local273 == 4) {
						Static278.anInt1556 += local315;
						if (Static278.anInt1556 < 1024) {
							Static278.anInt1556 = 1024;
						} else if (Static278.anInt1556 > 3072) {
							Static278.anInt1556 = 3072;
						}
					}
				}
			}
			if (Static160.anInt2915 < 0) {
				Static160.anInt2915 = 0;
			}
			if ((Static166.anInt2967 << 7) - 1 < Static160.anInt2915) {
				Static160.anInt2915 = (Static166.anInt2967 << 7) - 1;
			}
			if (Static22.anInt547 < 0) {
				Static22.anInt547 = 0;
			}
			if ((Static244.anInt1024 << 7) - 1 < Static22.anInt547) {
				Static22.anInt547 = (Static244.anInt1024 << 7) - 1;
			}
			Static221.method3732();
			Static94.method4860();
			Static304.aClass82_4.method4477(local118, local120, local118 + local116, local120 - -local122);
			Static304.aClass82_4.method4458();
			local315 = Static327.anInt5764;
			if (Static250.aClass248_1 == null) {
				Static304.aClass82_4.method4481(local315);
			} else {
				Static250.aClass248_1.method5714(local122, local120, Static278.anInt1556, local118, Static392.anInt6749, Static304.aClass82_4, Static208.anInt3857 << 3, local116, local315);
			}
			Static209.method3549();
			Static280.aClass54_2.method4792(Static160.anInt2915, Static71.anInt1354, Static22.anInt547, -Static278.anInt1556 & 0x3FFF, -Static392.anInt6749 & 0x3FFF, -Static315.anInt5585 & 0x3FFF);
			Static304.aClass82_4.method4533(Static280.aClass54_2);
			Static304.aClass82_4.method4506(local116 / 2 + local118, local122 / 2 + local120, Static30.anInt684 << 1, Static30.anInt684 << 1);
			Static11.method3589(local116 / 2 + local118, local120 + local122 / 2, Static30.anInt684 << 1, Static30.anInt684 << 1);
			Static30.method730(Static22.anInt547, Static71.anInt1354, Static160.anInt2915, -Static278.anInt1556 & 0x3FFF, -Static392.anInt6749 & 0x3FFF, -Static315.anInt5585 & 0x3FFF);
			@Pc(535) byte local535 = Static292.method4434() == 2 ? (byte) Static47.anInt936 : 1;
			Static213.method3602(Static304.aClass82_4, Static295.anInt5281, Static126.anInt2390, Static280.aClass54_2, Static160.anInt2915, Static71.anInt1354, Static22.anInt547, Static75.aByteArrayArrayArray5, Static227.anIntArray515, Static323.anIntArray696, Static186.anIntArray763, anIntArray149, Static305.anIntArray250, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 + 1, local535, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 >> 7, Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 >> 7, !Static364.aBoolean379);
			Static209.method3549();
			if (Static344.anInt6327 == 30) {
				Static39.method837(local118, local120, local122, local116);
				Static194.method3168(local118, local116, local122, local120);
				Static257.method5609(local118, local122, local116, local120);
				Static253.method4970(local116, local120, local118, local122);
			}
			Static354.method5365();
			Static71.anInt1354 = local167;
			Static22.anInt547 = local267;
			Static160.anInt2915 = local130;
			Static392.anInt6749 = local271;
			Static278.anInt1556 = local269;
			if (Static8.aBoolean11 && Static93.aClass23_1.method646() == 0) {
				Static8.aBoolean11 = false;
			}
			if (Static8.aBoolean11) {
				Static304.aClass82_4.method4486(local122, local116, local118, -16777216, local120);
				Static104.method1846(Static246.aClass13_4, Static303.aClass221_182.method5229(Static189.anInt5185), false);
			}
		} else {
			Static304.aClass82_4.method4486(arg3, arg0, arg1, -16777216, arg2);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static138.method2407(arg8)) {
			Static41.method891(Static228.aClass155ArrayArray1[arg8], -1, arg3, arg2, arg7, arg4, arg6, arg0, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method1047() {
		if (Static358.aClass1_9 == null) {
			return;
		}
		if (Static358.aClass1_9.anInt2 == 1) {
			Static358.aClass1_9 = null;
			return;
		}
		if (Static358.aClass1_9.anInt2 == 2) {
			Static38.method819(2, Static287.aString46, Static332.aClass53_5);
			Static358.aClass1_9 = null;
			return;
		}
	}
}
