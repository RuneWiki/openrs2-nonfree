import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lv", name = "J", descriptor = "Lclient!ol;")
	public static final Class245 aClass245_2 = new Class245();

	@OriginalMember(owner = "client!lv", name = "M", descriptor = "[I")
	public static final int[] anIntArray428 = new int[5];

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIIZI)V")
	public static void method5195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static208.anInt4309 || arg2 < Static55.anInt1303) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static535.anInt9696 > arg4) {
			arg4 = Static535.anInt9696;
			local24 = false;
		} else if (Static35.anInt993 < arg4) {
			arg4 = Static35.anInt993;
			local24 = false;
		} else {
			local24 = true;
		}
		@Pc(40) boolean local40;
		if (Static535.anInt9696 > arg3) {
			local40 = false;
			arg3 = Static535.anInt9696;
		} else if (Static35.anInt993 >= arg3) {
			local40 = true;
		} else {
			arg3 = Static35.anInt993;
			local40 = false;
		}
		if (Static55.anInt1303 > arg0) {
			arg0 = Static55.anInt1303;
		} else {
			Static426.method6794(arg3, Static333.anIntArrayArray56[arg0++], arg4, arg1);
		}
		if (Static208.anInt4309 < arg2) {
			arg2 = Static208.anInt4309;
		} else {
			Static426.method6794(arg3, Static333.anIntArrayArray56[arg2--], arg4, arg1);
		}
		@Pc(93) int local93;
		if (local24 && local40) {
			for (local93 = arg0; local93 <= arg2; local93++) {
				@Pc(98) int[] local98 = Static333.anIntArrayArray56[local93];
				local98[arg4] = local98[arg3] = arg1;
			}
		} else if (local24) {
			for (local93 = arg0; local93 <= arg2; local93++) {
				Static333.anIntArrayArray56[local93][arg4] = arg1;
			}
		} else if (local40) {
			for (local93 = arg0; local93 <= arg2; local93++) {
				Static333.anIntArrayArray56[local93][arg3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLclient!wk;I)V")
	public static void method5196(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub2_Sub1 arg1) {
		@Pc(7) Class171 local7 = arg1.method6316();
		if (arg1.anInt7660 == 0) {
			Static46.anInt1149 = 0;
			arg1.anInt7658 = 0;
			Static89.anInt2254 = -1;
			return;
		}
		if (arg1.anInt7651 != -1 && arg1.anInt7584 == 0) {
			@Pc(33) Class174 local33 = Static532.aClass157_2.method3734(arg1.anInt7651);
			if (arg1.anInt7659 > 0 && local33.anInt5487 == 0) {
				Static89.anInt2254 = -1;
				Static46.anInt1149 = 0;
				arg1.anInt7658++;
				return;
			}
			if (arg1.anInt7659 <= 0 && local33.anInt5496 == 0) {
				Static89.anInt2254 = -1;
				Static46.anInt1149 = 0;
				arg1.anInt7658++;
				return;
			}
		}
		@Pc(100) Class174 local100;
		@Pc(87) Class77 local87;
		if (arg1.anInt7621 != -1 && Static129.anInt10429 >= arg1.anInt7618) {
			local87 = Static107.aClass303_1.method7476(arg1.anInt7621);
			if (local87.aBoolean197 && local87.anInt2573 != -1) {
				local100 = Static532.aClass157_2.method3734(local87.anInt2573);
				if (arg1.anInt7659 > 0 && local100.anInt5487 == 0) {
					Static46.anInt1149 = 0;
					arg1.anInt7658++;
					Static89.anInt2254 = -1;
					return;
				}
				if (arg1.anInt7659 <= 0 && local100.anInt5496 == 0) {
					arg1.anInt7658++;
					Static89.anInt2254 = -1;
					Static46.anInt1149 = 0;
					return;
				}
			}
		}
		if (arg1.anInt7621 != -1 && arg1.anInt7618 <= Static129.anInt10429) {
			local87 = Static107.aClass303_1.method7476(arg1.anInt7621);
			if (local87.aBoolean197 && local87.anInt2573 != -1) {
				local100 = Static532.aClass157_2.method3734(local87.anInt2573);
				if (arg1.anInt7659 > 0 && local100.anInt5487 == 0) {
					arg1.anInt7658++;
					Static46.anInt1149 = 0;
					Static89.anInt2254 = -1;
					return;
				}
				if (arg1.anInt7659 <= 0 && local100.anInt5496 == 0) {
					Static46.anInt1149 = 0;
					arg1.anInt7658++;
					Static89.anInt2254 = -1;
					return;
				}
			}
		}
		@Pc(210) int local210 = arg1.anInt9398;
		@Pc(213) int local213 = arg1.anInt9396;
		@Pc(230) int local230 = arg1.anIntArray487[arg1.anInt7660 - 1] * 512 + arg1.method6311() * 256;
		@Pc(248) int local248 = arg1.anIntArray488[arg1.anInt7660 - 1] * 512 + arg1.method6311() * 256;
		if (local230 <= local210) {
			if (local210 > local230) {
				if (local213 < local248) {
					arg1.method6309(6144);
				} else if (local213 > local248) {
					arg1.method6309(2048);
				} else {
					arg1.method6309(4096);
				}
			} else if (local248 > local213) {
				arg1.method6309(8192);
			} else if (local248 < local213) {
				arg1.method6309(0);
			}
		} else if (local213 < local248) {
			arg1.method6309(10240);
		} else if (local213 <= local248) {
			arg1.method6309(12288);
		} else {
			arg1.method6309(14336);
		}
		@Pc(339) byte local339 = arg1.aByteArray85[arg1.anInt7660 - 1];
		if (!arg0 && (local230 - local210 > 1024 || local230 - local210 < -1024 || local248 - local213 > 1024 || local248 - local213 < -1024)) {
			arg1.anInt9396 = local248;
			arg1.anInt9398 = local230;
			arg1.method6301(arg1.anInt7592, false);
			Static89.anInt2254 = -1;
			arg1.anInt7660--;
			if (arg1.anInt7659 > 0) {
				arg1.anInt7659--;
			}
			Static46.anInt1149 = 0;
			return;
		}
		@Pc(403) int local403 = 16;
		@Pc(405) boolean local405 = true;
		if (arg1 instanceof Class2_Sub2_Sub1_Sub2) {
			local405 = ((Class2_Sub2_Sub1_Sub2) arg1).aClass169_1.aBoolean423;
		}
		@Pc(423) int local423;
		if (local405) {
			local423 = arg1.anInt7592 - arg1.aClass358_7.anInt10350;
			if (local423 != 0 && arg1.anInt7634 == -1 && arg1.anInt7591 != 0) {
				local403 = 8;
			}
			if (!arg0 && arg1.anInt7660 > 2) {
				local403 = 24;
			}
			if (!arg0 && arg1.anInt7660 > 3) {
				local403 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt7660 > 1) {
				local403 = 24;
			}
			if (!arg0 && arg1.anInt7660 > 2) {
				local403 = 32;
			}
		}
		if (arg1.anInt7658 > 0 && arg1.anInt7660 > 1) {
			local403 = 32;
			arg1.anInt7658--;
		}
		if (local339 == 2) {
			local403 <<= 0x1;
		} else if (local339 == 0) {
			local403 >>= 0x1;
		}
		Static46.anInt1149 = 0;
		if (local7.anInt5100 != -1) {
			local403 <<= 0x9;
			if (arg1.anInt7660 == 1) {
				local423 = arg1.anInt7657 * arg1.anInt7657;
				@Pc(552) int local552 = (local230 < arg1.anInt9398 ? arg1.anInt9398 - local230 : local230 - arg1.anInt9398) << 9;
				@Pc(574) int local574 = (arg1.anInt9396 <= local248 ? local248 - arg1.anInt9396 : -local248 + arg1.anInt9396) << 9;
				@Pc(585) int local585 = local552 <= local574 ? local574 : local552;
				@Pc(592) int local592 = local585 * local7.anInt5100 * 2;
				if (local592 < local423) {
					arg1.anInt7657 /= 2;
				} else if (local423 / 2 > local585) {
					arg1.anInt7657 -= local7.anInt5100;
					if (arg1.anInt7657 < 0) {
						arg1.anInt7657 = 0;
					}
				} else if (arg1.anInt7657 < local403) {
					arg1.anInt7657 += local7.anInt5100;
					if (local403 < arg1.anInt7657) {
						arg1.anInt7657 = local403;
					}
				}
			} else if (local403 > arg1.anInt7657) {
				arg1.anInt7657 += local7.anInt5100;
				if (arg1.anInt7657 > local403) {
					arg1.anInt7657 = local403;
				}
			} else if (arg1.anInt7657 > 0) {
				arg1.anInt7657 -= local7.anInt5100;
				if (arg1.anInt7657 < 0) {
					arg1.anInt7657 = 0;
				}
			}
			local403 = arg1.anInt7657 >> 9;
			if (local403 < 1) {
				local403 = 1;
			}
		}
		if (local230 == local210 && local248 == local213) {
			Static89.anInt2254 = -1;
		} else {
			if (local210 < local230) {
				arg1.anInt9398 += local403;
				Static46.anInt1149 |= 0x4;
				if (local230 < arg1.anInt9398) {
					arg1.anInt9398 = local230;
				}
			} else if (local230 < local210) {
				Static46.anInt1149 |= 0x8;
				arg1.anInt9398 -= local403;
				if (local230 > arg1.anInt9398) {
					arg1.anInt9398 = local230;
				}
			}
			if (local403 >= 32) {
				Static89.anInt2254 = 2;
			} else {
				Static89.anInt2254 = local339;
			}
			if (local213 < local248) {
				Static46.anInt1149 |= 0x1;
				arg1.anInt9396 += local403;
				if (arg1.anInt9396 > local248) {
					arg1.anInt9396 = local248;
				}
			} else if (local248 < local213) {
				Static46.anInt1149 |= 0x2;
				arg1.anInt9396 -= local403;
				if (arg1.anInt9396 < local248) {
					arg1.anInt9396 = local248;
				}
			}
		}
		if (local230 == arg1.anInt9398 && arg1.anInt9396 == local248) {
			if (arg1.anInt7659 > 0) {
				arg1.anInt7659--;
			}
			arg1.anInt7660--;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)Z")
	public static boolean method5197(@OriginalArg(1) int arg0) {
		Static445.anInt8469 = arg0 + 1 & 0xFFFF;
		Static104.aBoolean189 = true;
		return true;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIII)V")
	public static void method5199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static343.anIntArrayArray58 != null) {
			Static343.anIntArrayArray58[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static171.aShortArrayArray6 != null) {
			Static171.aShortArrayArray6[arg0][arg1] = (short) arg3;
		}
		if (Static67.aByteArrayArray32 != null) {
			Static67.aByteArrayArray32[arg0][arg1] = (byte) arg4;
		}
	}
}
