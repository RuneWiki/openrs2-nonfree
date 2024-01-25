import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[F")
	public static final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public static int anInt7247 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!kj;ZB)V")
	public static void method5817(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class101 local9 = arg0.method6218();
		if (arg0.anInt7707 == 0) {
			Static107.anInt1820 = 0;
			arg0.anInt7708 = 0;
			Static287.anInt5147 = -1;
			return;
		}
		if (arg0.anInt7665 != -1 && arg0.anInt7662 == 0) {
			@Pc(37) Class109 local37 = Static37.aClass80_1.method1879(arg0.anInt7665);
			if (arg0.anInt7705 > 0 && local37.anInt2789 == 0) {
				Static287.anInt5147 = -1;
				Static107.anInt1820 = 0;
				arg0.anInt7708++;
				return;
			}
			if (arg0.anInt7705 <= 0 && local37.anInt2790 == 0) {
				Static287.anInt5147 = -1;
				Static107.anInt1820 = 0;
				arg0.anInt7708++;
				return;
			}
		}
		@Pc(108) Class109 local108;
		@Pc(95) Class139 local95;
		if (arg0.anInt7667 != -1 && arg0.anInt7645 <= Static277.anInt5022) {
			local95 = Static399.aClass100_2.method2197(arg0.anInt7667);
			if (local95.aBoolean228 && local95.anInt3448 != -1) {
				local108 = Static37.aClass80_1.method1879(local95.anInt3448);
				if (arg0.anInt7705 > 0 && local108.anInt2789 == 0) {
					Static107.anInt1820 = 0;
					arg0.anInt7708++;
					Static287.anInt5147 = -1;
					return;
				}
				if (arg0.anInt7705 <= 0 && local108.anInt2790 == 0) {
					arg0.anInt7708++;
					Static287.anInt5147 = -1;
					Static107.anInt1820 = 0;
					return;
				}
			}
		}
		if (arg0.anInt7667 != -1 && arg0.anInt7645 <= Static277.anInt5022) {
			local95 = Static399.aClass100_2.method2197(arg0.anInt7667);
			if (local95.aBoolean228 && local95.anInt3448 != -1) {
				local108 = Static37.aClass80_1.method1879(local95.anInt3448);
				if (arg0.anInt7705 > 0 && local108.anInt2789 == 0) {
					Static287.anInt5147 = -1;
					Static107.anInt1820 = 0;
					arg0.anInt7708++;
					return;
				}
				if (arg0.anInt7705 <= 0 && local108.anInt2790 == 0) {
					Static287.anInt5147 = -1;
					Static107.anInt1820 = 0;
					arg0.anInt7708++;
					return;
				}
			}
		}
		@Pc(229) int local229 = arg0.anInt7626;
		@Pc(232) int local232 = arg0.anInt7622;
		@Pc(249) int local249 = arg0.anIntArray632[arg0.anInt7707 - 1] * 128 + arg0.method6215() * 64;
		@Pc(268) int local268 = arg0.anIntArray633[arg0.anInt7707 - 1] * 128 + arg0.method6215() * 64;
		if (local229 < local249) {
			if (local232 < local268) {
				arg0.method6227(10240);
			} else if (local232 > local268) {
				arg0.method6227(14336);
			} else {
				arg0.method6227(12288);
			}
		} else if (local249 < local229) {
			if (local268 > local232) {
				arg0.method6227(6144);
			} else if (local232 <= local268) {
				arg0.method6227(4096);
			} else {
				arg0.method6227(2048);
			}
		} else if (local232 < local268) {
			arg0.method6227(8192);
		} else if (local232 > local268) {
			arg0.method6227(0);
		}
		@Pc(358) byte local358 = arg0.aByteArray96[arg0.anInt7707 - 1];
		if (!arg1 && (local249 - local229 > 256 || local249 - local229 < -256 || local268 - local232 > 256 || local268 - local232 < -256)) {
			arg0.anInt7626 = local249;
			arg0.anInt7622 = local268;
			arg0.method6225(false, arg0.anInt7672);
			Static287.anInt5147 = -1;
			if (arg0.anInt7705 > 0) {
				arg0.anInt7705--;
			}
			Static107.anInt1820 = 0;
			arg0.anInt7707--;
			return;
		}
		@Pc(425) int local425 = 4;
		@Pc(427) boolean local427 = true;
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			local427 = ((Class11_Sub5_Sub2_Sub2) arg0).aClass82_1.aBoolean112;
		}
		@Pc(444) int local444;
		if (local427) {
			local444 = arg0.anInt7672 - arg0.aClass23_7.anInt483;
			if (local444 != 0 && arg0.anInt7656 == -1 && arg0.anInt7673 != 0) {
				local425 = 2;
			}
			if (!arg1 && arg0.anInt7707 > 2) {
				local425 = 6;
			}
			if (!arg1 && arg0.anInt7707 > 3) {
				local425 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt7707 > 1) {
				local425 = 6;
			}
			if (!arg1 && arg0.anInt7707 > 2) {
				local425 = 8;
			}
		}
		if (arg0.anInt7708 > 0 && arg0.anInt7707 > 1) {
			arg0.anInt7708--;
			local425 = 8;
		}
		if (local358 == 2) {
			local425 <<= 0x1;
		} else if (local358 == 0) {
			local425 >>= 0x1;
		}
		Static107.anInt1820 = 0;
		if (local9.anInt2613 != -1) {
			local425 <<= 0x7;
			if (arg0.anInt7707 == 1) {
				local444 = arg0.anInt7706 * arg0.anInt7706;
				@Pc(576) int local576 = (arg0.anInt7626 <= local249 ? local249 - arg0.anInt7626 : -local249 + arg0.anInt7626) << 7;
				@Pc(598) int local598 = (local268 < arg0.anInt7622 ? arg0.anInt7622 - local268 : local268 + -arg0.anInt7622) << 7;
				@Pc(605) int local605 = local576 <= local598 ? local598 : local576;
				@Pc(612) int local612 = local9.anInt2613 * 2 * local605;
				if (local612 < local444) {
					arg0.anInt7706 /= 2;
				} else if (local444 / 2 > local605) {
					arg0.anInt7706 -= local9.anInt2613;
					if (arg0.anInt7706 < 0) {
						arg0.anInt7706 = 0;
					}
				} else if (arg0.anInt7706 < local425) {
					arg0.anInt7706 += local9.anInt2613;
					if (arg0.anInt7706 > local425) {
						arg0.anInt7706 = local425;
					}
				}
			} else if (arg0.anInt7706 < local425) {
				arg0.anInt7706 += local9.anInt2613;
				if (local425 < arg0.anInt7706) {
					arg0.anInt7706 = local425;
				}
			} else if (arg0.anInt7706 > 0) {
				arg0.anInt7706 -= local9.anInt2613;
				if (arg0.anInt7706 < 0) {
					arg0.anInt7706 = 0;
				}
			}
			local425 = arg0.anInt7706 >> 7;
			if (local425 < 1) {
				local425 = 1;
			}
		}
		if (local229 == local249 && local232 == local268) {
			Static287.anInt5147 = -1;
		} else {
			if (local229 < local249) {
				Static107.anInt1820 |= 0x4;
				arg0.anInt7626 += local425;
				if (arg0.anInt7626 > local249) {
					arg0.anInt7626 = local249;
				}
			} else if (local249 < local229) {
				arg0.anInt7626 -= local425;
				Static107.anInt1820 |= 0x8;
				if (arg0.anInt7626 < local249) {
					arg0.anInt7626 = local249;
				}
			}
			if (local232 < local268) {
				arg0.anInt7622 += local425;
				Static107.anInt1820 |= 0x1;
				if (arg0.anInt7622 > local268) {
					arg0.anInt7622 = local268;
				}
			} else if (local232 > local268) {
				arg0.anInt7622 -= local425;
				Static107.anInt1820 |= 0x2;
				if (local268 > arg0.anInt7622) {
					arg0.anInt7622 = local268;
				}
			}
			if (local425 < 8) {
				Static287.anInt5147 = local358;
			} else {
				Static287.anInt5147 = 2;
			}
		}
		if (arg0.anInt7626 == local249 && arg0.anInt7622 == local268) {
			if (arg0.anInt7705 > 0) {
				arg0.anInt7705--;
			}
			arg0.anInt7707--;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!mn;)V")
	public static void method5819(@OriginalArg(1) Class171 arg0) {
		Static192.anInt3359 = arg0.method3668("titlebg");
		Static72.anInt1217 = arg0.method3668("logo");
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(CI)Z")
	public static boolean method5820(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
