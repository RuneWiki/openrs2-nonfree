import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public static int anInt6840;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_89 = new Class306("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!dc;Z)V")
	public static void method5724(@OriginalArg(1) Class49_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class230 local9 = arg0.method3799();
		if (arg0.anInt4338 == 0) {
			Static76.anInt1386 = -1;
			arg0.anInt4337 = 0;
			Static471.anInt7902 = 0;
			return;
		}
		if (arg0.anInt4297 != -1 && arg0.anInt4316 == 0) {
			@Pc(36) Class199 local36 = Static182.aClass218_1.method5221(arg0.anInt4297);
			if (arg0.anInt4339 > 0 && local36.anInt5741 == 0) {
				arg0.anInt4337++;
				Static76.anInt1386 = -1;
				Static471.anInt7902 = 0;
				return;
			}
			if (arg0.anInt4339 <= 0 && local36.anInt5736 == 0) {
				Static471.anInt7902 = 0;
				Static76.anInt1386 = -1;
				arg0.anInt4337++;
				return;
			}
		}
		@Pc(111) Class199 local111;
		@Pc(97) Class52 local97;
		if (arg0.anInt4307 != -1 && Static436.anInt6850 >= arg0.anInt4298) {
			local97 = Static489.aClass194_2.method4810(arg0.anInt4307);
			if (local97.aBoolean84 && local97.anInt1342 != -1) {
				local111 = Static182.aClass218_1.method5221(local97.anInt1342);
				if (arg0.anInt4339 > 0 && local111.anInt5741 == 0) {
					arg0.anInt4337++;
					Static76.anInt1386 = -1;
					Static471.anInt7902 = 0;
					return;
				}
				if (arg0.anInt4339 <= 0 && local111.anInt5736 == 0) {
					Static76.anInt1386 = -1;
					Static471.anInt7902 = 0;
					arg0.anInt4337++;
					return;
				}
			}
		}
		if (arg0.anInt4307 != -1 && arg0.anInt4298 <= Static436.anInt6850) {
			local97 = Static489.aClass194_2.method4810(arg0.anInt4307);
			if (local97.aBoolean84 && local97.anInt1342 != -1) {
				local111 = Static182.aClass218_1.method5221(local97.anInt1342);
				if (arg0.anInt4339 > 0 && local111.anInt5741 == 0) {
					arg0.anInt4337++;
					Static471.anInt7902 = 0;
					Static76.anInt1386 = -1;
					return;
				}
				if (arg0.anInt4339 <= 0 && local111.anInt5736 == 0) {
					Static76.anInt1386 = -1;
					arg0.anInt4337++;
					Static471.anInt7902 = 0;
					return;
				}
			}
		}
		@Pc(228) int local228 = arg0.anInt7137;
		@Pc(231) int local231 = arg0.anInt7141;
		@Pc(248) int local248 = arg0.anIntArray428[arg0.anInt4338 - 1] * 512 + arg0.method3788() * 256;
		@Pc(264) int local264 = arg0.anIntArray427[arg0.anInt4338 - 1] * 512 + arg0.method3788() * 256;
		if (local248 <= local228) {
			if (local228 > local248) {
				if (local231 < local264) {
					arg0.method3783(6144);
				} else if (local231 <= local264) {
					arg0.method3783(4096);
				} else {
					arg0.method3783(2048);
				}
			} else if (local231 < local264) {
				arg0.method3783(8192);
			} else if (local264 < local231) {
				arg0.method3783(0);
			}
		} else if (local264 > local231) {
			arg0.method3783(10240);
		} else if (local231 <= local264) {
			arg0.method3783(12288);
		} else {
			arg0.method3783(14336);
		}
		@Pc(354) byte local354 = arg0.aByteArray64[arg0.anInt4338 - 1];
		if (!arg1 && (local248 - local228 > 1024 || local248 - local228 < -1024 || local264 - local231 > 1024 || local264 - local231 < -1024)) {
			arg0.anInt7137 = local248;
			arg0.anInt7141 = local264;
			arg0.method3784(arg0.anInt4330, false);
			Static76.anInt1386 = -1;
			arg0.anInt4338--;
			if (arg0.anInt4339 > 0) {
				arg0.anInt4339--;
			}
			Static471.anInt7902 = 0;
			return;
		}
		@Pc(422) int local422 = 16;
		@Pc(424) boolean local424 = true;
		if (arg0 instanceof Class49_Sub2_Sub2_Sub2) {
			local424 = ((Class49_Sub2_Sub2_Sub2) arg0).aClass196_1.aBoolean415;
		}
		@Pc(442) int local442;
		if (local424) {
			local442 = arg0.anInt4330 - arg0.aClass143_7.anInt4120;
			if (local442 != 0 && arg0.anInt4323 == -1 && arg0.anInt4270 != 0) {
				local422 = 8;
			}
			if (!arg1 && arg0.anInt4338 > 2) {
				local422 = 24;
			}
			if (!arg1 && arg0.anInt4338 > 3) {
				local422 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt4338 > 1) {
				local422 = 24;
			}
			if (!arg1 && arg0.anInt4338 > 2) {
				local422 = 32;
			}
		}
		if (arg0.anInt4337 > 0 && arg0.anInt4338 > 1) {
			local422 = 32;
			arg0.anInt4337--;
		}
		if (local354 == 2) {
			local422 <<= 0x1;
		} else if (local354 == 0) {
			local422 >>= 0x1;
		}
		Static471.anInt7902 = 0;
		if (local9.anInt6399 != -1) {
			local422 <<= 0x9;
			if (arg0.anInt4338 == 1) {
				local442 = arg0.anInt4336 * arg0.anInt4336;
				@Pc(621) int local621 = (local248 < arg0.anInt7137 ? arg0.anInt7137 - local248 : local248 - arg0.anInt7137) << 9;
				@Pc(643) int local643 = (local264 < arg0.anInt7141 ? arg0.anInt7141 - local264 : -arg0.anInt7141 + local264) << 9;
				@Pc(650) int local650 = local621 > local643 ? local621 : local643;
				@Pc(657) int local657 = local9.anInt6399 * 2 * local650;
				if (local442 > local657) {
					arg0.anInt4336 /= 2;
				} else if (local442 / 2 > local650) {
					arg0.anInt4336 -= local9.anInt6399;
					if (arg0.anInt4336 < 0) {
						arg0.anInt4336 = 0;
					}
				} else if (local422 > arg0.anInt4336) {
					arg0.anInt4336 += local9.anInt6399;
					if (local422 < arg0.anInt4336) {
						arg0.anInt4336 = local422;
					}
				}
			} else if (arg0.anInt4336 < local422) {
				arg0.anInt4336 += local9.anInt6399;
				if (arg0.anInt4336 > local422) {
					arg0.anInt4336 = local422;
				}
			} else if (arg0.anInt4336 > 0) {
				arg0.anInt4336 -= local9.anInt6399;
				if (arg0.anInt4336 < 0) {
					arg0.anInt4336 = 0;
				}
			}
			local422 = arg0.anInt4336 >> 9;
			if (local422 < 1) {
				local422 = 1;
			}
		}
		if (local228 == local248 && local231 == local264) {
			Static76.anInt1386 = -1;
		} else {
			if (local228 < local248) {
				Static471.anInt7902 |= 0x4;
				arg0.anInt7137 += local422;
				if (local248 < arg0.anInt7137) {
					arg0.anInt7137 = local248;
				}
			} else if (local228 > local248) {
				arg0.anInt7137 -= local422;
				Static471.anInt7902 |= 0x8;
				if (arg0.anInt7137 < local248) {
					arg0.anInt7137 = local248;
				}
			}
			if (local422 >= 32) {
				Static76.anInt1386 = 2;
			} else {
				Static76.anInt1386 = local354;
			}
			if (local231 < local264) {
				arg0.anInt7141 += local422;
				Static471.anInt7902 |= 0x1;
				if (arg0.anInt7141 > local264) {
					arg0.anInt7141 = local264;
				}
			} else if (local231 > local264) {
				Static471.anInt7902 |= 0x2;
				arg0.anInt7141 -= local422;
				if (local264 > arg0.anInt7141) {
					arg0.anInt7141 = local264;
				}
			}
		}
		if (local248 == arg0.anInt7137 && local264 == arg0.anInt7141) {
			if (arg0.anInt4339 > 0) {
				arg0.anInt4339--;
			}
			arg0.anInt4338--;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIBLclient!kr;)Lclient!pe;")
	public static Class232 method5725(@OriginalArg(0) int arg0, @OriginalArg(3) Class171 arg1) {
		@Pc(9) byte[] local9 = arg1.method4339(arg0, 0);
		return local9 == null ? null : new Class232(local9);
	}
}
