import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_133 = new Class12(17, -1);

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
	public static final boolean aBoolean569 = false;

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "Z")
	public static boolean aBoolean570 = false;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BZLclient!wk;)V")
	public static void method3943(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class25_Sub5_Sub1 arg1) {
		@Pc(9) Class236 local9 = arg1.method3428();
		if (arg1.anInt4314 == 0) {
			Static289.anInt5060 = 0;
			arg1.anInt4315 = 0;
			Static428.anInt7227 = -1;
			return;
		}
		if (arg1.anInt4270 != -1 && arg1.anInt4235 == 0) {
			@Pc(39) Class177 local39 = Static174.aClass254_1.method5670(arg1.anInt4270);
			if (arg1.anInt4316 > 0 && local39.anInt5042 == 0) {
				Static428.anInt7227 = -1;
				Static289.anInt5060 = 0;
				arg1.anInt4315++;
				return;
			}
			if (arg1.anInt4316 <= 0 && local39.anInt5036 == 0) {
				Static289.anInt5060 = 0;
				Static428.anInt7227 = -1;
				arg1.anInt4315++;
				return;
			}
		}
		@Pc(105) Class177 local105;
		@Pc(92) Class130 local92;
		if (arg1.anInt4283 != -1 && arg1.anInt4261 <= Static236.anInt4213) {
			local92 = Static88.aClass69_1.method1553(arg1.anInt4283);
			if (local92.aBoolean410 && local92.anInt3576 != -1) {
				local105 = Static174.aClass254_1.method5670(local92.anInt3576);
				if (arg1.anInt4316 > 0 && local105.anInt5042 == 0) {
					arg1.anInt4315++;
					Static428.anInt7227 = -1;
					Static289.anInt5060 = 0;
					return;
				}
				if (arg1.anInt4316 <= 0 && local105.anInt5036 == 0) {
					arg1.anInt4315++;
					Static428.anInt7227 = -1;
					Static289.anInt5060 = 0;
					return;
				}
			}
		}
		if (arg1.anInt4283 != -1 && Static236.anInt4213 >= arg1.anInt4261) {
			local92 = Static88.aClass69_1.method1553(arg1.anInt4283);
			if (local92.aBoolean410 && local92.anInt3576 != -1) {
				local105 = Static174.aClass254_1.method5670(local92.anInt3576);
				if (arg1.anInt4316 > 0 && local105.anInt5042 == 0) {
					arg1.anInt4315++;
					Static289.anInt5060 = 0;
					Static428.anInt7227 = -1;
					return;
				}
				if (arg1.anInt4316 <= 0 && local105.anInt5036 == 0) {
					arg1.anInt4315++;
					Static428.anInt7227 = -1;
					Static289.anInt5060 = 0;
					return;
				}
			}
		}
		@Pc(220) int local220 = arg1.anInt5518;
		@Pc(223) int local223 = arg1.anInt5514;
		@Pc(240) int local240 = arg1.anIntArray283[arg1.anInt4314 - 1] * 128 + arg1.method3427() * 64;
		@Pc(259) int local259 = arg1.anIntArray284[arg1.anInt4314 - 1] * 128 + arg1.method3427() * 64;
		if (local220 >= local240) {
			if (local220 > local240) {
				if (local223 < local259) {
					arg1.method3416(6144);
				} else if (local223 > local259) {
					arg1.method3416(2048);
				} else {
					arg1.method3416(4096);
				}
			} else if (local223 < local259) {
				arg1.method3416(8192);
			} else if (local223 > local259) {
				arg1.method3416(0);
			}
		} else if (local259 > local223) {
			arg1.method3416(10240);
		} else if (local259 >= local223) {
			arg1.method3416(12288);
		} else {
			arg1.method3416(14336);
		}
		@Pc(355) byte local355 = arg1.aByteArray51[arg1.anInt4314 - 1];
		if (!arg0 && (local240 - local220 > 256 || local240 - local220 < -256 || local259 - local223 > 256 || local259 - local223 < -256)) {
			arg1.anInt5518 = local240;
			arg1.anInt5514 = local259;
			arg1.method3435(arg1.anInt4269);
			Static428.anInt7227 = -1;
			Static289.anInt5060 = 0;
			arg1.anInt4314--;
			if (arg1.anInt4316 > 0) {
				arg1.anInt4316--;
			}
			return;
		}
		@Pc(425) int local425 = 4;
		@Pc(427) boolean local427 = true;
		if (arg1 instanceof Class25_Sub5_Sub1_Sub1) {
			local427 = ((Class25_Sub5_Sub1_Sub1) arg1).aClass54_1.aBoolean151;
		}
		@Pc(462) int local462;
		if (local427) {
			local462 = arg1.anInt4269 - arg1.aClass265_7.anInt7384;
			if (local462 != 0 && arg1.anInt4238 == -1 && arg1.anInt4274 != 0) {
				local425 = 2;
			}
			if (!arg0 && arg1.anInt4314 > 2) {
				local425 = 6;
			}
			if (!arg0 && arg1.anInt4314 > 3) {
				local425 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt4314 > 1) {
				local425 = 6;
			}
			if (!arg0 && arg1.anInt4314 > 2) {
				local425 = 8;
			}
		}
		if (arg1.anInt4315 > 0 && arg1.anInt4314 > 1) {
			arg1.anInt4315--;
			local425 = 8;
		}
		if (local355 == 2) {
			local425 <<= 0x1;
		} else if (local355 == 0) {
			local425 >>= 0x1;
		}
		Static289.anInt5060 = 0;
		if (local9.anInt6473 != -1) {
			local425 <<= 0x7;
			if (arg1.anInt4314 == 1) {
				local462 = arg1.anInt4313 * arg1.anInt4313;
				@Pc(581) int local581 = (arg1.anInt5518 > local240 ? arg1.anInt5518 - local240 : -arg1.anInt5518 + local240) << 7;
				@Pc(602) int local602 = (arg1.anInt5514 <= local259 ? local259 - arg1.anInt5514 : arg1.anInt5514 - local259) << 7;
				@Pc(609) int local609 = local581 <= local602 ? local602 : local581;
				@Pc(616) int local616 = local609 * local9.anInt6473 * 2;
				if (local616 < local462) {
					arg1.anInt4313 /= 2;
				} else if (local462 / 2 > local609) {
					arg1.anInt4313 -= local9.anInt6473;
					if (arg1.anInt4313 < 0) {
						arg1.anInt4313 = 0;
					}
				} else if (local425 > arg1.anInt4313) {
					arg1.anInt4313 += local9.anInt6473;
					if (arg1.anInt4313 > local425) {
						arg1.anInt4313 = local425;
					}
				}
			} else if (arg1.anInt4313 < local425) {
				arg1.anInt4313 += local9.anInt6473;
				if (local425 < arg1.anInt4313) {
					arg1.anInt4313 = local425;
				}
			} else if (arg1.anInt4313 > 0) {
				arg1.anInt4313 -= local9.anInt6473;
				if (arg1.anInt4313 < 0) {
					arg1.anInt4313 = 0;
				}
			}
			local425 = arg1.anInt4313 >> 7;
			if (local425 < 1) {
				local425 = 1;
			}
		}
		if (local240 > local220) {
			arg1.anInt5518 += local425;
			Static289.anInt5060 |= 0x4;
			if (local240 < arg1.anInt5518) {
				arg1.anInt5518 = local240;
			}
		} else if (local240 < local220) {
			Static289.anInt5060 |= 0x8;
			arg1.anInt5518 -= local425;
			if (local240 > arg1.anInt5518) {
				arg1.anInt5518 = local240;
			}
		}
		if (local223 < local259) {
			Static289.anInt5060 |= 0x1;
			arg1.anInt5514 += local425;
			if (arg1.anInt5514 > local259) {
				arg1.anInt5514 = local259;
			}
		} else if (local223 > local259) {
			Static289.anInt5060 |= 0x2;
			arg1.anInt5514 -= local425;
			if (local259 > arg1.anInt5514) {
				arg1.anInt5514 = local259;
			}
		}
		if (arg1.anInt5518 == local240 && arg1.anInt5514 == local259) {
			if (arg1.anInt4316 > 0) {
				arg1.anInt4316--;
			}
			arg1.anInt4314--;
		}
		if (local425 >= 8) {
			Static428.anInt7227 = 2;
		} else {
			Static428.anInt7227 = local355;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public static void method3944() {
		Static417.aClass6Array14 = null;
		Static428.aClass6Array15 = null;
		Static204.aClass6_34 = null;
		Static361.aClass6Array13 = null;
		Static80.aClass76_1 = null;
		Static352.aClass6Array11 = null;
		Static359.aClass6Array12 = null;
		Static39.aClass6Array2 = null;
		Static108.aClass6Array6 = null;
		Static28.aClass6Array1 = null;
		Static204.aClass6Array9 = null;
		Static144.aClass6Array8 = null;
		Static121.aClass76_2 = null;
		Static79.aClass6Array4 = null;
		Static437.aClass76_4 = null;
		Static231.aClass6Array10 = null;
		Static17.aClass6_5 = null;
		Static94.aClass6Array5 = null;
	}
}
