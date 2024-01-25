import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
	public static int anInt6050;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
	public static int anInt6051;

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
	public static int anInt6054;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Lclient!wb;")
	public static final Class243 aClass243_28 = new Class243(512);

	@OriginalMember(owner = "client!sr", name = "F", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_95 = new Class183(17, -1);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!gn;ZI)V")
	public static void method5288(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class227 local9 = arg0.method4799();
		if (arg0.anInt5432 == 0) {
			Static263.anInt5015 = 0;
			Static209.anInt4255 = -1;
			arg0.anInt5429 = 0;
			return;
		}
		if (arg0.anInt5366 != -1 && arg0.anInt5405 == 0) {
			@Pc(36) Class102 local36 = Static333.aClass50_2.method1175(arg0.anInt5366);
			if (arg0.anInt5431 > 0 && local36.anInt2983 == 0) {
				arg0.anInt5429++;
				Static263.anInt5015 = 0;
				Static209.anInt4255 = -1;
				return;
			}
			if (arg0.anInt5431 <= 0 && local36.anInt2988 == 0) {
				Static263.anInt5015 = 0;
				Static209.anInt4255 = -1;
				arg0.anInt5429++;
				return;
			}
		}
		if (arg0.anInt5396 != -1 && Static339.anInt6265 >= arg0.anInt5390) {
			@Pc(90) Class182 local90 = Static153.aClass116_1.method2791(arg0.anInt5396);
			if (local90.aBoolean374 && local90.anInt5101 != -1) {
				@Pc(103) Class102 local103 = Static333.aClass50_2.method1175(local90.anInt5101);
				if (arg0.anInt5431 > 0 && local103.anInt2983 == 0) {
					arg0.anInt5429++;
					Static209.anInt4255 = -1;
					Static263.anInt5015 = 0;
					return;
				}
				if (arg0.anInt5431 <= 0 && local103.anInt2988 == 0) {
					Static263.anInt5015 = 0;
					Static209.anInt4255 = -1;
					arg0.anInt5429++;
					return;
				}
			}
		}
		@Pc(143) int local143 = arg0.anInt6800;
		@Pc(146) int local146 = arg0.anInt6798;
		@Pc(162) int local162 = arg0.anIntArray466[arg0.anInt5432 - 1] * 128 + arg0.method4792() * 64;
		@Pc(178) int local178 = arg0.anIntArray465[arg0.anInt5432 - 1] * 128 + arg0.method4792() * 64;
		if (local143 < local162) {
			if (local146 < local178) {
				arg0.method4793(10240);
			} else if (local146 > local178) {
				arg0.method4793(14336);
			} else {
				arg0.method4793(12288);
			}
		} else if (local162 < local143) {
			if (local146 < local178) {
				arg0.method4793(6144);
			} else if (local146 > local178) {
				arg0.method4793(2048);
			} else {
				arg0.method4793(4096);
			}
		} else if (local178 > local146) {
			arg0.method4793(8192);
		} else if (local146 > local178) {
			arg0.method4793(0);
		}
		@Pc(268) byte local268 = arg0.aByteArray78[arg0.anInt5432 - 1];
		if (!arg1 && (local162 - local143 > 256 || local162 - local143 < -256 || local178 - local146 > 256 || local178 - local146 < -256)) {
			arg0.anInt6798 = local178;
			arg0.anInt6800 = local162;
			arg0.method4796(arg0.anInt5368);
			arg0.anInt5432--;
			if (arg0.anInt5431 > 0) {
				arg0.anInt5431--;
			}
			Static263.anInt5015 = 0;
			Static209.anInt4255 = -1;
			return;
		}
		@Pc(327) int local327 = 4;
		@Pc(329) boolean local329 = true;
		if (arg0 instanceof Class1_Sub2_Sub1_Sub2) {
			local329 = ((Class1_Sub2_Sub1_Sub2) arg0).aClass197_1.aBoolean406;
		}
		@Pc(346) int local346;
		if (local329) {
			local346 = arg0.anInt5368 - arg0.aClass217_7.anInt6273;
			if (local346 != 0 && arg0.anInt5418 == -1 && arg0.anInt5426 != 0) {
				local327 = 2;
			}
			if (!arg1 && arg0.anInt5432 > 2) {
				local327 = 6;
			}
			if (!arg1 && arg0.anInt5432 > 3) {
				local327 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5432 > 1) {
				local327 = 6;
			}
			if (!arg1 && arg0.anInt5432 > 2) {
				local327 = 8;
			}
		}
		if (arg0.anInt5429 > 0 && arg0.anInt5432 > 1) {
			local327 = 8;
			arg0.anInt5429--;
		}
		if (local268 == 2) {
			local327 <<= 0x1;
		} else if (local268 == 0) {
			local327 >>= 0x1;
		}
		if (local9.anInt6466 != -1) {
			local327 <<= 0x7;
			if (arg0.anInt5432 == 1) {
				local346 = arg0.anInt5430 * arg0.anInt5430;
				@Pc(515) int local515 = (local162 < arg0.anInt6800 ? arg0.anInt6800 - local162 : -arg0.anInt6800 + local162) << 7;
				@Pc(537) int local537 = (arg0.anInt6798 <= local178 ? local178 - arg0.anInt6798 : arg0.anInt6798 + -local178) << 7;
				@Pc(544) int local544 = local515 <= local537 ? local537 : local515;
				@Pc(551) int local551 = local544 * 2 * local9.anInt6466;
				if (local346 > local551) {
					arg0.anInt5430 /= 2;
				} else if (local346 / 2 > local544) {
					arg0.anInt5430 -= local9.anInt6466;
					if (arg0.anInt5430 < 0) {
						arg0.anInt5430 = 0;
					}
				} else if (arg0.anInt5430 < local327) {
					arg0.anInt5430 += local9.anInt6466;
					if (arg0.anInt5430 > local327) {
						arg0.anInt5430 = local327;
					}
				}
			} else if (local327 > arg0.anInt5430) {
				arg0.anInt5430 += local9.anInt6466;
				if (local327 < arg0.anInt5430) {
					arg0.anInt5430 = local327;
				}
			} else if (arg0.anInt5430 > 0) {
				arg0.anInt5430 -= local9.anInt6466;
				if (arg0.anInt5430 < 0) {
					arg0.anInt5430 = 0;
				}
			}
			local327 = arg0.anInt5430 >> 7;
			if (local327 < 1) {
				local327 = 1;
			}
		}
		Static263.anInt5015 = 0;
		if (local162 > local143) {
			Static263.anInt5015 |= 0x4;
			arg0.anInt6800 += local327;
			if (local162 < arg0.anInt6800) {
				arg0.anInt6800 = local162;
			}
		} else if (local162 < local143) {
			arg0.anInt6800 -= local327;
			Static263.anInt5015 |= 0x8;
			if (arg0.anInt6800 < local162) {
				arg0.anInt6800 = local162;
			}
		}
		if (local178 > local146) {
			Static263.anInt5015 |= 0x1;
			arg0.anInt6798 += local327;
			if (arg0.anInt6798 > local178) {
				arg0.anInt6798 = local178;
			}
		} else if (local178 < local146) {
			arg0.anInt6798 -= local327;
			Static263.anInt5015 |= 0x2;
			if (arg0.anInt6798 < local178) {
				arg0.anInt6798 = local178;
			}
		}
		if (local162 == arg0.anInt6800 && local178 == arg0.anInt6798) {
			arg0.anInt5432--;
			if (arg0.anInt5431 > 0) {
				arg0.anInt5431--;
			}
		}
		if (local327 >= 8) {
			Static209.anInt4255 = 2;
		} else {
			Static209.anInt4255 = local268;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIZIFIII)[I")
	public static int[] method5289(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub1_Sub13 local10 = new Class2_Sub1_Sub13();
		local10.anInt2811 = 4;
		local10.anInt2813 = 8;
		local10.anInt2802 = (int) (arg0 * 4096.0F);
		local10.anInt2807 = 8;
		local10.aBoolean195 = true;
		local10.anInt2808 = 35;
		local10.method6067();
		Static262.method4488(2048, 1);
		local10.method2252(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)Lclient!df;")
	public static Class2_Sub7_Sub2 method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class2_Sub7_Sub2 local20 = (Class2_Sub7_Sub2) Static115.aClass243_9.method5967((long) arg0 << 32 | (long) arg1);
		if (local20 == null) {
			local20 = new Class2_Sub7_Sub2(arg0, arg1);
			Static115.aClass243_9.method5968(local20.aLong213, local20);
		}
		return local20;
	}
}
