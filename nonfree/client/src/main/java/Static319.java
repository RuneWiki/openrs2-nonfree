import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	public static int anInt5443;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!be;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public static int anInt5444 = 0;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_76 = new Class244(27, 8);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)I")
	public static int method4840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg0 & 0x3;
		if (local17 == 0) {
			return arg1;
		} else if (local17 == 1) {
			return arg2;
		} else if (local17 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!bj;Z)V")
	public static void method4841(@OriginalArg(1) Class28_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class36 local9 = arg0.method4014();
		if (arg0.anInt4378 == 0) {
			Static366.anInt4859 = 0;
			Static385.anInt6435 = -1;
			arg0.anInt4376 = 0;
			return;
		}
		if (arg0.anInt4314 != -1 && arg0.anInt4327 == 0) {
			@Pc(40) Class177 local40 = Static176.aClass43_2.method930(arg0.anInt4314);
			if (arg0.anInt4375 > 0 && local40.anInt4517 == 0) {
				Static385.anInt6435 = -1;
				Static366.anInt4859 = 0;
				arg0.anInt4376++;
				return;
			}
			if (arg0.anInt4375 <= 0 && local40.anInt4510 == 0) {
				arg0.anInt4376++;
				Static366.anInt4859 = 0;
				Static385.anInt6435 = -1;
				return;
			}
		}
		if (arg0.anInt4367 != -1 && Static76.anInt1617 >= arg0.anInt4329) {
			@Pc(98) Class125 local98 = Static224.aClass203_2.method4559(arg0.anInt4367);
			if (local98.aBoolean236 && local98.anInt3050 != -1) {
				@Pc(112) Class177 local112 = Static176.aClass43_2.method930(local98.anInt3050);
				if (arg0.anInt4375 > 0 && local112.anInt4517 == 0) {
					Static385.anInt6435 = -1;
					Static366.anInt4859 = 0;
					arg0.anInt4376++;
					return;
				}
				if (arg0.anInt4375 <= 0 && local112.anInt4510 == 0) {
					Static366.anInt4859 = 0;
					arg0.anInt4376++;
					Static385.anInt6435 = -1;
					return;
				}
			}
		}
		@Pc(158) int local158 = arg0.anInt5774;
		@Pc(161) int local161 = arg0.anInt5766;
		@Pc(178) int local178 = arg0.anIntArray491[arg0.anInt4378 - 1] * 128 + arg0.method4009() * 64;
		@Pc(195) int local195 = arg0.anIntArray490[arg0.anInt4378 - 1] * 128 + arg0.method4009() * 64;
		if (local158 < local178) {
			if (local161 < local195) {
				arg0.method4010(10240);
			} else if (local161 <= local195) {
				arg0.method4010(12288);
			} else {
				arg0.method4010(14336);
			}
		} else if (local178 >= local158) {
			if (local195 > local161) {
				arg0.method4010(8192);
			} else if (local195 < local161) {
				arg0.method4010(0);
			}
		} else if (local195 > local161) {
			arg0.method4010(6144);
		} else if (local161 > local195) {
			arg0.method4010(2048);
		} else {
			arg0.method4010(4096);
		}
		@Pc(289) byte local289 = arg0.aByteArray56[arg0.anInt4378 - 1];
		if (!arg1 && (local178 - local158 > 256 || local178 - local158 < -256 || local195 - local161 > 256 || local195 - local161 < -256)) {
			arg0.anInt5766 = local195;
			arg0.anInt5774 = local178;
			arg0.method4005(arg0.anInt4340);
			Static366.anInt4859 = 0;
			if (arg0.anInt4375 > 0) {
				arg0.anInt4375--;
			}
			Static385.anInt6435 = -1;
			arg0.anInt4378--;
			return;
		}
		@Pc(358) int local358 = 4;
		@Pc(360) boolean local360 = true;
		if (arg0 instanceof Class28_Sub1_Sub1_Sub1) {
			local360 = ((Class28_Sub1_Sub1_Sub1) arg0).aClass61_1.aBoolean105;
		}
		@Pc(378) int local378;
		if (local360) {
			local378 = arg0.anInt4340 - arg0.aClass251_7.anInt6475;
			if (local378 != 0 && arg0.anInt4347 == -1 && arg0.anInt4345 != 0) {
				local358 = 2;
			}
			if (!arg1 && arg0.anInt4378 > 2) {
				local358 = 6;
			}
			if (!arg1 && arg0.anInt4378 > 3) {
				local358 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4378 > 1) {
				local358 = 6;
			}
			if (!arg1 && arg0.anInt4378 > 2) {
				local358 = 8;
			}
		}
		if (arg0.anInt4376 > 0 && arg0.anInt4378 > 1) {
			arg0.anInt4376--;
			local358 = 8;
		}
		if (local289 == 2) {
			local358 <<= 0x1;
		} else if (local289 == 0) {
			local358 >>= 0x1;
		}
		Static366.anInt4859 = 0;
		if (local9.anInt687 != -1) {
			local358 <<= 0x7;
			if (arg0.anInt4378 == 1) {
				local378 = arg0.anInt4377 * arg0.anInt4377;
				@Pc(512) int local512 = (arg0.anInt5774 <= local178 ? local178 - arg0.anInt5774 : -local178 + arg0.anInt5774) << 7;
				@Pc(530) int local530 = (local195 >= arg0.anInt5766 ? local195 - arg0.anInt5766 : -local195 + arg0.anInt5766) << 7;
				@Pc(541) int local541 = local512 > local530 ? local512 : local530;
				@Pc(548) int local548 = local541 * 2 * local9.anInt687;
				if (local378 > local548) {
					arg0.anInt4377 /= 2;
				} else if (local378 / 2 > local541) {
					arg0.anInt4377 -= local9.anInt687;
					if (arg0.anInt4377 < 0) {
						arg0.anInt4377 = 0;
					}
				} else if (arg0.anInt4377 < local358) {
					arg0.anInt4377 += local9.anInt687;
					if (arg0.anInt4377 > local358) {
						arg0.anInt4377 = local358;
					}
				}
			} else if (arg0.anInt4377 < local358) {
				arg0.anInt4377 += local9.anInt687;
				if (local358 < arg0.anInt4377) {
					arg0.anInt4377 = local358;
				}
			} else if (arg0.anInt4377 > 0) {
				arg0.anInt4377 -= local9.anInt687;
				if (arg0.anInt4377 < 0) {
					arg0.anInt4377 = 0;
				}
			}
			local358 = arg0.anInt4377 >> 7;
			if (local358 < 1) {
				local358 = 1;
			}
		}
		if (local158 < local178) {
			arg0.anInt5774 += local358;
			Static366.anInt4859 |= 0x4;
			if (local178 < arg0.anInt5774) {
				arg0.anInt5774 = local178;
			}
		} else if (local158 > local178) {
			Static366.anInt4859 |= 0x8;
			arg0.anInt5774 -= local358;
			if (arg0.anInt5774 < local178) {
				arg0.anInt5774 = local178;
			}
		}
		if (local195 > local161) {
			Static366.anInt4859 |= 0x1;
			arg0.anInt5766 += local358;
			if (local195 < arg0.anInt5766) {
				arg0.anInt5766 = local195;
			}
		} else if (local195 < local161) {
			arg0.anInt5766 -= local358;
			Static366.anInt4859 |= 0x2;
			if (local195 > arg0.anInt5766) {
				arg0.anInt5766 = local195;
			}
		}
		if (local358 >= 8) {
			Static385.anInt6435 = 2;
		} else {
			Static385.anInt6435 = local289;
		}
		if (local178 != arg0.anInt5774 || local195 != arg0.anInt5766) {
			return;
		}
		arg0.anInt4378--;
		if (arg0.anInt4375 > 0) {
			arg0.anInt4375--;
			return;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public static void method4842() {
		Static292.aClass44_31.method952();
		Static347.aClass162_10.method3733();
		Static146.aClass162_7.method3733();
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
	public static void method4844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass28_Sub2_2 != null) {
			local7.aClass28_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II[BI)I")
	public static int method4846(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = local7 >>> 8 ^ Class16.anIntArray22[(arg1[local9] ^ local7) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
	public static void method4847(@OriginalArg(1) boolean arg0) {
		for (@Pc(16) Class3_Sub10 local16 = (Class3_Sub10) Static142.aClass138_17.method3051(); local16 != null; local16 = (Class3_Sub10) Static142.aClass138_17.method3050()) {
			if (local16.aClass3_Sub8_Sub1_2 != null) {
				Static137.aClass3_Sub8_Sub2_2.method1712(local16.aClass3_Sub8_Sub1_2);
				local16.aClass3_Sub8_Sub1_2 = null;
			}
			if (local16.aClass3_Sub8_Sub1_1 != null) {
				Static137.aClass3_Sub8_Sub2_2.method1712(local16.aClass3_Sub8_Sub1_1);
				local16.aClass3_Sub8_Sub1_1 = null;
			}
			local16.method5700();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(57) Class3_Sub10 local57 = (Class3_Sub10) Static185.aClass138_23.method3051(); local57 != null; local57 = (Class3_Sub10) Static185.aClass138_23.method3050()) {
			if (local57.aClass3_Sub8_Sub1_2 != null) {
				Static137.aClass3_Sub8_Sub2_2.method1712(local57.aClass3_Sub8_Sub1_2);
				local57.aClass3_Sub8_Sub1_2 = null;
			}
			local57.method5700();
		}
		for (@Pc(86) Class3_Sub10 local86 = (Class3_Sub10) Static332.aClass44_32.method950(); local86 != null; local86 = (Class3_Sub10) Static332.aClass44_32.method949()) {
			if (local86.aClass3_Sub8_Sub1_2 != null) {
				Static137.aClass3_Sub8_Sub2_2.method1712(local86.aClass3_Sub8_Sub1_2);
				local86.aClass3_Sub8_Sub1_2 = null;
			}
			local86.method5700();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZIIZ)Lclient!jn;")
	public static Class3_Sub22 method4848(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class3_Sub22 local12 = new Class3_Sub22();
		local12.anInt3027 = arg3;
		local12.anInt3029 = arg0;
		Static29.aClass44_26.method948((long) arg2, local12);
		Static236.method3901(arg0);
		@Pc(31) Class62 local31 = Static115.method1862(arg2);
		if (local31 != null) {
			Static158.method2441(local31);
		}
		if (Static53.aClass62_2 != null) {
			Static158.method2441(Static53.aClass62_2);
			Static53.aClass62_2 = null;
		}
		Static308.method4743();
		if (local31 != null) {
			Static54.method993(!arg1, local31);
		}
		if (!arg1) {
			Static124.method2008(arg0);
		}
		if (!arg1 && Static68.anInt1346 != -1) {
			Static244.method3984(Static68.anInt1346, 1);
		}
		return local12;
	}
}
