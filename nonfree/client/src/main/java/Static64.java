import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "I")
	public static int anInt1727;

	@OriginalMember(owner = "client!cda", name = "J", descriptor = "Lclient!rea;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!cda", name = "r", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_6 = new Class323(16);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!vl;Z)V")
	public static void method1473(@OriginalArg(1) Class16_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class291 local7 = arg0.method7007();
		if (arg0.anInt8133 == 0) {
			arg0.anInt8136 = 0;
			Static135.anInt2905 = -1;
			Static363.anInt6280 = 0;
			return;
		}
		if (arg0.anInt8049 != -1 && arg0.lb == 0) {
			@Pc(32) Class228 local32 = Static479.aClass308_2.method7075(arg0.anInt8049);
			if (arg0.anInt8135 > 0 && local32.anInt6222 == 0) {
				arg0.anInt8136++;
				Static135.anInt2905 = -1;
				Static363.anInt6280 = 0;
				return;
			}
			if (arg0.anInt8135 <= 0 && local32.anInt6221 == 0) {
				arg0.anInt8136++;
				Static363.anInt6280 = 0;
				Static135.anInt2905 = -1;
				return;
			}
		}
		@Pc(105) Class228 local105;
		@Pc(91) Class354 local91;
		if (arg0.anInt8053 != -1 && arg0.anInt8108 <= Static389.anInt6694) {
			local91 = Static546.aClass263_1.method6113(arg0.anInt8053);
			if (local91.aBoolean712 && local91.anInt9829 != -1) {
				local105 = Static479.aClass308_2.method7075(local91.anInt9829);
				if (arg0.anInt8135 > 0 && local105.anInt6222 == 0) {
					Static135.anInt2905 = -1;
					arg0.anInt8136++;
					Static363.anInt6280 = 0;
					return;
				}
				if (arg0.anInt8135 <= 0 && local105.anInt6221 == 0) {
					Static363.anInt6280 = 0;
					Static135.anInt2905 = -1;
					arg0.anInt8136++;
					return;
				}
			}
		}
		if (arg0.anInt8053 != -1 && arg0.anInt8108 <= Static389.anInt6694) {
			local91 = Static546.aClass263_1.method6113(arg0.anInt8053);
			if (local91.aBoolean712 && local91.anInt9829 != -1) {
				local105 = Static479.aClass308_2.method7075(local91.anInt9829);
				if (arg0.anInt8135 > 0 && local105.anInt6222 == 0) {
					arg0.anInt8136++;
					Static135.anInt2905 = -1;
					Static363.anInt6280 = 0;
					return;
				}
				if (arg0.anInt8135 <= 0 && local105.anInt6221 == 0) {
					Static363.anInt6280 = 0;
					Static135.anInt2905 = -1;
					arg0.anInt8136++;
					return;
				}
			}
		}
		@Pc(213) int local213 = arg0.anInt8037;
		@Pc(216) int local216 = arg0.anInt8034;
		@Pc(232) int local232 = arg0.anIntArray595[arg0.anInt8133 - 1] * 512 + arg0.method6999() * 256;
		@Pc(248) int local248 = arg0.anIntArray594[arg0.anInt8133 - 1] * 512 + arg0.method6999() * 256;
		if (local213 < local232) {
			if (local248 > local216) {
				arg0.method7003(10240);
			} else if (local216 <= local248) {
				arg0.method7003(12288);
			} else {
				arg0.method7003(14336);
			}
		} else if (local213 <= local232) {
			if (local248 > local216) {
				arg0.method7003(8192);
			} else if (local216 > local248) {
				arg0.method7003(0);
			}
		} else if (local216 < local248) {
			arg0.method7003(6144);
		} else if (local216 <= local248) {
			arg0.method7003(4096);
		} else {
			arg0.method7003(2048);
		}
		@Pc(343) byte local343 = arg0.aByteArray85[arg0.anInt8133 - 1];
		if (!arg1 && (local232 - local213 > 1024 || local232 - local213 < -1024 || local248 - local216 > 1024 || local248 - local216 < -1024)) {
			arg0.anInt8037 = local232;
			arg0.anInt8034 = local248;
			arg0.method7000(false, arg0.anInt8080);
			Static363.anInt6280 = 0;
			if (arg0.anInt8135 > 0) {
				arg0.anInt8135--;
			}
			Static135.anInt2905 = -1;
			arg0.anInt8133--;
			return;
		}
		@Pc(408) int local408 = 16;
		@Pc(410) boolean local410 = true;
		if (arg0 instanceof Class16_Sub1_Sub1_Sub3_Sub1) {
			local410 = ((Class16_Sub1_Sub1_Sub3_Sub1) arg0).aClass113_1.aBoolean253;
		}
		@Pc(427) int local427;
		if (local410) {
			local427 = arg0.anInt8080 - arg0.aClass111_7.anInt3149;
			if (local427 != 0 && arg0.anInt8100 == -1 && arg0.anInt8130 != 0) {
				local408 = 8;
			}
			if (!arg1 && arg0.anInt8133 > 2) {
				local408 = 24;
			}
			if (!arg1 && arg0.anInt8133 > 3) {
				local408 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt8133 > 1) {
				local408 = 24;
			}
			if (!arg1 && arg0.anInt8133 > 2) {
				local408 = 32;
			}
		}
		if (arg0.anInt8136 > 0 && arg0.anInt8133 > 1) {
			arg0.anInt8136--;
			local408 = 32;
		}
		if (local343 == 2) {
			local408 <<= 0x1;
		} else if (local343 == 0) {
			local408 >>= 0x1;
		}
		if (local7.anInt7629 != -1) {
			local408 <<= 0x9;
			if (arg0.anInt8133 == 1) {
				local427 = arg0.anInt8134 * arg0.anInt8134;
				@Pc(550) int local550 = (local232 < arg0.anInt8037 ? arg0.anInt8037 - local232 : local232 + -arg0.anInt8037) << 9;
				@Pc(568) int local568 = (local248 >= arg0.anInt8034 ? local248 - arg0.anInt8034 : -local248 + arg0.anInt8034) << 9;
				@Pc(575) int local575 = local550 <= local568 ? local568 : local550;
				@Pc(582) int local582 = local575 * local7.anInt7629 * 2;
				if (local427 > local582) {
					arg0.anInt8134 /= 2;
				} else if (local575 < local427 / 2) {
					arg0.anInt8134 -= local7.anInt7629;
					if (arg0.anInt8134 < 0) {
						arg0.anInt8134 = 0;
					}
				} else if (local408 > arg0.anInt8134) {
					arg0.anInt8134 += local7.anInt7629;
					if (arg0.anInt8134 > local408) {
						arg0.anInt8134 = local408;
					}
				}
			} else if (arg0.anInt8134 < local408) {
				arg0.anInt8134 += local7.anInt7629;
				if (arg0.anInt8134 > local408) {
					arg0.anInt8134 = local408;
				}
			} else if (arg0.anInt8134 > 0) {
				arg0.anInt8134 -= local7.anInt7629;
				if (arg0.anInt8134 < 0) {
					arg0.anInt8134 = 0;
				}
			}
			local408 = arg0.anInt8134 >> 9;
			if (local408 < 1) {
				local408 = 1;
			}
		}
		Static363.anInt6280 = 0;
		if (local232 == local213 && local248 == local216) {
			Static135.anInt2905 = -1;
		} else {
			if (local232 > local213) {
				arg0.anInt8037 += local408;
				Static363.anInt6280 |= 0x4;
				if (local232 < arg0.anInt8037) {
					arg0.anInt8037 = local232;
				}
			} else if (local213 > local232) {
				arg0.anInt8037 -= local408;
				Static363.anInt6280 |= 0x8;
				if (local232 > arg0.anInt8037) {
					arg0.anInt8037 = local232;
				}
			}
			if (local248 > local216) {
				arg0.anInt8034 += local408;
				Static363.anInt6280 |= 0x1;
				if (local248 < arg0.anInt8034) {
					arg0.anInt8034 = local248;
				}
			} else if (local216 > local248) {
				arg0.anInt8034 -= local408;
				Static363.anInt6280 |= 0x2;
				if (local248 > arg0.anInt8034) {
					arg0.anInt8034 = local248;
				}
			}
			if (local408 < 32) {
				Static135.anInt2905 = local343;
			} else {
				Static135.anInt2905 = 2;
			}
		}
		if (local232 != arg0.anInt8037 || arg0.anInt8034 != local248) {
			return;
		}
		arg0.anInt8133--;
		if (arg0.anInt8135 > 0) {
			arg0.anInt8135--;
			return;
		}
	}
}
