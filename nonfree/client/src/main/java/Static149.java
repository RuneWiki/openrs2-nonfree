import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!cb;")
	public static Class50 aClass50_41;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_7 = new Class74(12, 19);

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Lclient!si;")
	public static final Class323 aClass323_1 = new Class323();

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_3 = new Class307(14, 0, 4, 1);

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "J")
	public static final long aLong92 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
	public static void method2217(@OriginalArg(0) int arg0) {
		Static655.anIntArray597 = new int[arg0];
		Static571.anIntArray514 = new int[arg0];
		Static553.anIntArray494 = new int[arg0];
		Static196.anIntArray177 = new int[arg0];
		Static48.anIntArray53 = new int[arg0];
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!li;Z)V")
	public static void method2218(@OriginalArg(1) Class41_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class201 local7 = arg0.method7933();
		if (arg0.anInt9526 == 0) {
			Static652.anInt10280 = 0;
			Static194.anInt10095 = -1;
			arg0.anInt9523 = 0;
			return;
		}
		if (arg0.anInt9503 != -1 && arg0.anInt9463 == 0) {
			@Pc(34) Class65 local34 = Static459.aClass128_2.method2686(arg0.anInt9503);
			if (arg0.anInt9525 > 0 && local34.anInt1428 == 0) {
				Static194.anInt10095 = -1;
				arg0.anInt9523++;
				Static652.anInt10280 = 0;
				return;
			}
			if (arg0.anInt9525 <= 0 && local34.anInt1422 == 0) {
				Static194.anInt10095 = -1;
				arg0.anInt9523++;
				Static652.anInt10280 = 0;
				return;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < arg0.aClass329Array3.length; local79++) {
			if (arg0.aClass329Array3[local79].anInt9066 != -1 && Static421.anInt7434 >= arg0.aClass329Array3[local79].anInt9070) {
				@Pc(108) Class385 local108 = Static312.aClass179_1.method3798(arg0.aClass329Array3[local79].anInt9066);
				if (local108.aBoolean742 && local108.anInt10218 != -1) {
					@Pc(121) Class65 local121 = Static459.aClass128_2.method2686(local108.anInt10218);
					if (arg0.anInt9525 > 0 && local121.anInt1428 == 0) {
						Static194.anInt10095 = -1;
						arg0.anInt9523++;
						Static652.anInt10280 = 0;
						return;
					}
					if (arg0.anInt9525 <= 0 && local121.anInt1422 == 0) {
						Static652.anInt10280 = 0;
						arg0.anInt9523++;
						Static194.anInt10095 = -1;
						return;
					}
				}
			}
		}
		@Pc(177) int local177 = arg0.anInt10366;
		@Pc(180) int local180 = arg0.anInt10367;
		@Pc(196) int local196 = arg0.anIntArray528[arg0.anInt9526 - 1] * 512 + arg0.method7917() * 256;
		@Pc(213) int local213 = arg0.anIntArray527[arg0.anInt9526 - 1] * 512 + arg0.method7917() * 256;
		if (local196 > local177) {
			if (local213 > local180) {
				arg0.method7915(10240);
			} else if (local213 < local180) {
				arg0.method7915(14336);
			} else {
				arg0.method7915(12288);
			}
		} else if (local177 > local196) {
			if (local180 < local213) {
				arg0.method7915(6144);
			} else if (local213 >= local180) {
				arg0.method7915(4096);
			} else {
				arg0.method7915(2048);
			}
		} else if (local213 > local180) {
			arg0.method7915(8192);
		} else if (local213 < local180) {
			arg0.method7915(0);
		}
		@Pc(308) byte local308 = arg0.aByteArray90[arg0.anInt9526 - 1];
		if (!arg1 && (local196 - local177 > 1024 || local196 - local177 < -1024 || local213 - local180 > 1024 || local213 - local180 < -1024)) {
			arg0.anInt10366 = local196;
			arg0.anInt10367 = local213;
			arg0.method7925(false, arg0.anInt9460);
			if (arg0.anInt9525 > 0) {
				arg0.anInt9525--;
			}
			Static194.anInt10095 = -1;
			arg0.anInt9526--;
			Static652.anInt10280 = 0;
			return;
		}
		@Pc(379) int local379 = 16;
		@Pc(381) boolean local381 = true;
		if (arg0 instanceof Class41_Sub1_Sub1_Sub3_Sub1) {
			local381 = ((Class41_Sub1_Sub1_Sub3_Sub1) arg0).aClass311_1.aBoolean625;
		}
		@Pc(417) int local417;
		if (local381) {
			local417 = arg0.anInt9460 - arg0.aClass165_7.anInt3981;
			if (local417 != 0 && arg0.anInt9452 == -1 && arg0.anInt9474 != 0) {
				local379 = 8;
			}
			if (!arg1 && arg0.anInt9526 > 2) {
				local379 = 24;
			}
			if (!arg1 && arg0.anInt9526 > 3) {
				local379 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt9526 > 1) {
				local379 = 24;
			}
			if (!arg1 && arg0.anInt9526 > 2) {
				local379 = 32;
			}
		}
		if (arg0.anInt9523 > 0 && arg0.anInt9526 > 1) {
			arg0.anInt9523--;
			local379 = 32;
		}
		if (local308 == 2) {
			local379 <<= 0x1;
		} else if (local308 == 0) {
			local379 >>= 0x1;
		}
		if (local7.anInt4751 != -1) {
			local379 <<= 0x9;
			if (arg0.anInt9526 == 1) {
				local417 = arg0.anInt9524 * arg0.anInt9524;
				@Pc(563) int local563 = (local196 < arg0.anInt10366 ? arg0.anInt10366 - local196 : local196 - arg0.anInt10366) << 9;
				@Pc(585) int local585 = (local213 < arg0.anInt10367 ? arg0.anInt10367 - local213 : -arg0.anInt10367 + local213) << 9;
				@Pc(592) int local592 = local563 <= local585 ? local585 : local563;
				@Pc(599) int local599 = local592 * local7.anInt4751 * 2;
				if (local417 > local599) {
					arg0.anInt9524 /= 2;
				} else if (local592 < local417 / 2) {
					arg0.anInt9524 -= local7.anInt4751;
					if (arg0.anInt9524 < 0) {
						arg0.anInt9524 = 0;
					}
				} else if (arg0.anInt9524 < local379) {
					arg0.anInt9524 += local7.anInt4751;
					if (arg0.anInt9524 > local379) {
						arg0.anInt9524 = local379;
					}
				}
			} else if (local379 > arg0.anInt9524) {
				arg0.anInt9524 += local7.anInt4751;
				if (local379 < arg0.anInt9524) {
					arg0.anInt9524 = local379;
				}
			} else if (arg0.anInt9524 > 0) {
				arg0.anInt9524 -= local7.anInt4751;
				if (arg0.anInt9524 < 0) {
					arg0.anInt9524 = 0;
				}
			}
			local379 = arg0.anInt9524 >> 9;
			if (local379 < 1) {
				local379 = 1;
			}
		}
		Static652.anInt10280 = 0;
		if (local196 == local177 && local180 == local213) {
			Static194.anInt10095 = -1;
		} else {
			if (local177 < local196) {
				Static652.anInt10280 |= 0x4;
				arg0.anInt10366 += local379;
				if (local196 < arg0.anInt10366) {
					arg0.anInt10366 = local196;
				}
			} else if (local177 > local196) {
				arg0.anInt10366 -= local379;
				Static652.anInt10280 |= 0x8;
				if (local196 > arg0.anInt10366) {
					arg0.anInt10366 = local196;
				}
			}
			if (local180 < local213) {
				Static652.anInt10280 |= 0x1;
				arg0.anInt10367 += local379;
				if (local213 < arg0.anInt10367) {
					arg0.anInt10367 = local213;
				}
			} else if (local180 > local213) {
				Static652.anInt10280 |= 0x2;
				arg0.anInt10367 -= local379;
				if (local213 > arg0.anInt10367) {
					arg0.anInt10367 = local213;
				}
			}
			if (local379 < 32) {
				Static194.anInt10095 = local308;
			} else {
				Static194.anInt10095 = 2;
			}
		}
		if (arg0.anInt10366 == local196 && local213 == arg0.anInt10367) {
			if (arg0.anInt9525 > 0) {
				arg0.anInt9525--;
			}
			arg0.anInt9526--;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method2220() {
		for (@Pc(8) Class5_Sub2_Sub11 local8 = (Class5_Sub2_Sub11) Static614.aClass124_99.method2572(); local8 != null; local8 = (Class5_Sub2_Sub11) Static614.aClass124_99.method2569()) {
			@Pc(17) Class41_Sub1_Sub1_Sub2 local17 = local8.aClass41_Sub1_Sub1_Sub2_1;
			if (local17.aBoolean76) {
				local8.method8829();
				local17.method1088();
			} else if (local17.anInt1180 <= Static421.anInt7434) {
				local17.method1090(Static648.anInt10220);
				if (local17.aBoolean76) {
					local8.method8829();
				} else {
					Static213.method3080(local17, true);
				}
			}
		}
	}
}
