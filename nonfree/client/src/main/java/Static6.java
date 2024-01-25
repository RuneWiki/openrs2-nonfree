import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "[B")
	public static byte[] aByteArray3;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "[I")
	public static final int[] anIntArray29 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public static int anInt274 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!aq;I)V")
	public static void method247(@OriginalArg(0) Class12 arg0) {
		if (Static180.anInt3888 == arg0.anInt422) {
			Static223.aBooleanArray28[arg0.anInt451] = true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ki;ZB)V")
	public static void method248(@OriginalArg(0) Class17_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class123 local9 = arg0.method4319();
		if (arg0.anInt4893 == 0) {
			Static126.anInt2822 = -1;
			Static318.anInt6132 = 0;
			arg0.anInt4887 = 0;
			return;
		}
		if (arg0.anInt4830 != -1 && arg0.anInt4856 == 0) {
			@Pc(46) Class24 local46 = Static110.method5411(arg0.anInt4830);
			if (arg0.anInt4897 > 0 && local46.anInt1046 == 0) {
				arg0.anInt4887++;
				Static318.anInt6132 = 0;
				Static126.anInt2822 = -1;
				return;
			}
			if (arg0.anInt4897 <= 0 && local46.anInt1035 == 0) {
				Static126.anInt2822 = -1;
				Static318.anInt6132 = 0;
				arg0.anInt4887++;
				return;
			}
		}
		if (arg0.anInt4884 != -1 && arg0.anInt4845 <= Static5.anInt208) {
			@Pc(101) Class67 local101 = Static265.method5633(arg0.anInt4884);
			if (local101.aBoolean193 && local101.anInt2088 != -1) {
				@Pc(113) Class24 local113 = Static110.method5411(local101.anInt2088);
				if (arg0.anInt4897 > 0 && local113.anInt1046 == 0) {
					Static318.anInt6132 = 0;
					arg0.anInt4887++;
					Static126.anInt2822 = -1;
					return;
				}
				if (arg0.anInt4897 <= 0 && local113.anInt1035 == 0) {
					arg0.anInt4887++;
					Static126.anInt2822 = -1;
					Static318.anInt6132 = 0;
					return;
				}
			}
		}
		@Pc(153) int local153 = arg0.anInt5109;
		@Pc(156) int local156 = arg0.anInt5108;
		@Pc(172) int local172 = arg0.anIntArray438[arg0.anInt4893 - 1] * 128 + arg0.method4318() * 64;
		@Pc(189) int local189 = arg0.anIntArray439[arg0.anInt4893 - 1] * 128 + arg0.method4318() * 64;
		if (!arg1 && (local172 - local153 > 256 || local172 - local153 < -256 || local189 - local156 > 256 || local189 - local156 < -256)) {
			arg0.anInt5108 = local189;
			arg0.anInt5109 = local172;
			Static126.anInt2822 = -1;
			Static318.anInt6132 = 0;
			return;
		}
		if (local172 <= local153) {
			if (local153 <= local172) {
				if (local189 > local156) {
					arg0.method4320(8192);
				} else if (local156 > local189) {
					arg0.method4320(0);
				}
			} else if (local189 > local156) {
				arg0.method4320(6144);
			} else if (local189 >= local156) {
				arg0.method4320(4096);
			} else {
				arg0.method4320(2048);
			}
		} else if (local156 < local189) {
			arg0.method4320(10240);
		} else if (local156 > local189) {
			arg0.method4320(14336);
		} else {
			arg0.method4320(12288);
		}
		@Pc(315) int local315 = 4;
		@Pc(317) boolean local317 = true;
		if (arg0 instanceof Class17_Sub1_Sub1_Sub2) {
			local317 = ((Class17_Sub1_Sub1_Sub2) arg0).aClass213_1.aBoolean638;
		}
		if (local317) {
			@Pc(335) int local335 = arg0.anInt4819 - arg0.aClass135_7.anInt4073;
			if (local335 != 0 && arg0.anInt4829 == -1 && arg0.anInt4848 != 0) {
				local315 = 2;
			}
			if (!arg1 && arg0.anInt4893 > 2) {
				local315 = 6;
			}
			if (!arg1 && arg0.anInt4893 > 3) {
				local315 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4893 > 1) {
				local315 = 6;
			}
			if (!arg1 && arg0.anInt4893 > 2) {
				local315 = 8;
			}
		}
		if (arg0.anInt4887 > 0 && arg0.anInt4893 > 1) {
			arg0.anInt4887--;
			local315 = 8;
		}
		@Pc(412) byte local412 = arg0.aByteArray78[arg0.anInt4893 - 1];
		if (local412 == 2) {
			local315 <<= 0x1;
		} else if (local412 == 0) {
			local315 >>= 0x1;
		}
		Static318.anInt6132 = 0;
		if (local9.anInt3669 != -1) {
			local315 <<= 0x7;
			if (arg0.anInt4893 == 1) {
				@Pc(499) int local499 = arg0.anInt4888 * arg0.anInt4888;
				@Pc(517) int local517 = (arg0.anInt5109 <= local172 ? local172 - arg0.anInt5109 : arg0.anInt5109 + -local172) << 7;
				@Pc(535) int local535 = (arg0.anInt5108 > local189 ? arg0.anInt5108 - local189 : local189 + -arg0.anInt5108) << 7;
				@Pc(542) int local542 = local535 >= local517 ? local535 : local517;
				@Pc(549) int local549 = local9.anInt3669 * 2 * local542;
				if (local499 > local549) {
					arg0.anInt4888 /= 2;
				} else if (local499 / 2 > local542) {
					arg0.anInt4888 -= local9.anInt3669;
					if (arg0.anInt4888 < 0) {
						arg0.anInt4888 = 0;
					}
				} else if (arg0.anInt4888 < local315) {
					arg0.anInt4888 += local9.anInt3669;
					if (arg0.anInt4888 > local315) {
						arg0.anInt4888 = local315;
					}
				}
			} else if (local315 > arg0.anInt4888) {
				arg0.anInt4888 += local9.anInt3669;
				if (local315 < arg0.anInt4888) {
					arg0.anInt4888 = local315;
				}
			} else if (arg0.anInt4888 > 0) {
				arg0.anInt4888 -= local9.anInt3669;
				if (arg0.anInt4888 < 0) {
					arg0.anInt4888 = 0;
				}
			}
			local315 = arg0.anInt4888 >> 7;
			if (local315 < 1) {
				local315 = 1;
			}
		}
		if (local153 < local172) {
			Static318.anInt6132 |= 0x4;
			arg0.anInt5109 += local315;
			if (arg0.anInt5109 > local172) {
				arg0.anInt5109 = local172;
			}
		} else if (local153 > local172) {
			Static318.anInt6132 |= 0x8;
			arg0.anInt5109 -= local315;
			if (local172 > arg0.anInt5109) {
				arg0.anInt5109 = local172;
			}
		}
		if (local189 > local156) {
			arg0.anInt5108 += local315;
			Static318.anInt6132 |= 0x1;
			if (local189 < arg0.anInt5108) {
				arg0.anInt5108 = local189;
			}
		} else if (local156 > local189) {
			Static318.anInt6132 |= 0x2;
			arg0.anInt5108 -= local315;
			if (local189 > arg0.anInt5108) {
				arg0.anInt5108 = local189;
			}
		}
		if (local315 >= 8) {
			Static126.anInt2822 = 2;
		} else {
			Static126.anInt2822 = local412;
		}
		if (arg0.anInt5109 == local172 && local189 == arg0.anInt5108) {
			if (arg0.anInt4897 > 0) {
				arg0.anInt4897--;
			}
			arg0.anInt4893--;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
	public static void method250(@OriginalArg(0) boolean arg0) {
		@Pc(9) byte local9;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local11 = Static8.aByteArrayArray21;
			local9 = 1;
		} else {
			local9 = 4;
			local11 = Static345.aByteArrayArray25;
		}
		@Pc(20) int local20 = local11.length;
		@Pc(36) int local36;
		@Pc(49) int local49;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(26) int[] local26 = null;
			@Pc(30) byte[] local30 = local11[local22];
			local36 = Static222.anIntArray416[local22] >> 8;
			@Pc(42) int local42 = Static222.anIntArray416[local22] & 0xFF;
			local49 = local36 * 64 - Static234.anInt4783;
			@Pc(56) int local56 = local42 * 64 - Static32.anInt2224;
			if (local30 != null) {
				Static63.method4863();
				local26 = Static169.method3381(Static234.anInt4783, local30, Static29.aClass71Array1, local9, local56, local49, Static32.anInt2224, Static208.aClass32_11, arg0);
			}
			if (!arg0 && local36 == Static224.anInt4654 / 8 && local42 == Static124.anInt2811 / 8) {
				if (local26 == null) {
					Static127.aClass212_1 = null;
				} else {
					Static127.aClass212_1 = Static357.method3872(local26[3], local26[2], local26[0], local26[1]);
					Static176.anInt3801 = local26[4];
				}
			}
		}
		for (@Pc(123) int local123 = 0; local123 < local20; local123++) {
			@Pc(136) int local136 = (Static222.anIntArray416[local123] >> 8) * 64 - Static234.anInt4783;
			local36 = (Static222.anIntArray416[local123] & 0xFF) * 64 - Static32.anInt2224;
			@Pc(151) byte[] local151 = local11[local123];
			if (local151 == null && Static124.anInt2811 < 800) {
				Static63.method4863();
				for (local49 = 0; local49 < local9; local49++) {
					Static64.method1566(local36, 64, local49, local136, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
	public static void method251() {
		Static74.method1709();
		Static37.aClass165ArrayArray1 = null;
		Static153.aClass114_1 = null;
		Static324.aClass32_14 = null;
		Static307.aClass114_4 = null;
		Static176.aClass114_2 = null;
	}
}
