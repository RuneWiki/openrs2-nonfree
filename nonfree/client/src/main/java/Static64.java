import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public static int anInt1786;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean99 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!hc;I)V")
	public static void method1256(@OriginalArg(0) Class51 arg0) {
		Static227.aClass51_76 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lclient!vi;")
	public static Class144 method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class144 local14 = local7.aClass144_1;
			local7.aClass144_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mi;B)V")
	public static void method1258(@OriginalArg(0) Class9_Sub1 arg0) {
		@Pc(9) Class59 local9 = arg0.method207();
		arg0.anInt451 = local9.anInt2744;
		if (arg0.anInt453 == 0) {
			arg0.anInt429 = 0;
			return;
		}
		if (arg0.anInt443 != -1 && arg0.anInt399 == 0) {
			@Pc(39) Class49 local39 = Static131.method697(arg0.anInt443);
			if (arg0.anInt434 > 0 && local39.anInt2183 == 0) {
				arg0.anInt429++;
				return;
			}
			if (arg0.anInt434 <= 0 && local39.anInt2179 == 0) {
				arg0.anInt429++;
				return;
			}
		}
		if (arg0.anInt448 != -1 && Static156.anInt3722 >= arg0.anInt444) {
			@Pc(87) Class14 local87 = Static172.method2975(arg0.anInt448);
			if (local87.aBoolean33 && local87.anInt634 != -1) {
				@Pc(99) Class49 local99 = Static131.method697(local87.anInt634);
				if (arg0.anInt434 > 0 && local99.anInt2183 == 0) {
					arg0.anInt429++;
					return;
				}
				if (arg0.anInt434 <= 0 && local99.anInt2179 == 0) {
					arg0.anInt429++;
					return;
				}
			}
		}
		@Pc(137) int local137 = arg0.anInt427;
		@Pc(140) int local140 = arg0.anInt479;
		@Pc(157) int local157 = arg0.anIntArray43[arg0.anInt453 - 1] * 128 + arg0.method208() * 64;
		@Pc(173) int local173 = arg0.anIntArray41[arg0.anInt453 - 1] * 128 + arg0.method208() * 64;
		if (local157 - local137 > 256 || local157 - local137 < -256 || local173 - local140 > 256 || local173 - local140 < -256) {
			arg0.anInt427 = local157;
			arg0.anInt479 = local173;
			return;
		}
		if (local157 > local137) {
			if (local173 > local140) {
				arg0.anInt418 = 1280;
			} else if (local140 > local173) {
				arg0.anInt418 = 1792;
			} else {
				arg0.anInt418 = 1536;
			}
		} else if (local157 >= local137) {
			if (local140 < local173) {
				arg0.anInt418 = 1024;
			} else if (local140 > local173) {
				arg0.anInt418 = 0;
			}
		} else if (local140 < local173) {
			arg0.anInt418 = 768;
		} else if (local173 >= local140) {
			arg0.anInt418 = 512;
		} else {
			arg0.anInt418 = 256;
		}
		@Pc(288) int local288 = local9.anInt2755;
		@Pc(290) int local290 = 4;
		@Pc(298) int local298 = arg0.anInt418 - arg0.anInt419 & 0x7FF;
		@Pc(300) boolean local300 = true;
		if (local298 > 1024) {
			local298 -= 2048;
		}
		if (local298 >= -256 && local298 <= 256) {
			local288 = local9.anInt2747;
		} else if (local298 >= 256 && local298 < 768) {
			local288 = local9.anInt2737;
		} else if (local298 >= -768 && local298 <= -256) {
			local288 = local9.anInt2728;
		}
		if (local288 == -1) {
			local288 = local9.anInt2747;
		}
		arg0.anInt451 = local288;
		if (arg0 instanceof Class9_Sub1_Sub2) {
			local300 = ((Class9_Sub1_Sub2) arg0).aClass45_1.aBoolean120;
		}
		if (local300) {
			if (arg0.anInt418 != arg0.anInt419 && arg0.anInt423 == -1 && arg0.anInt404 != 0) {
				local290 = 2;
			}
			if (arg0.anInt453 > 2) {
				local290 = 6;
			}
			if (arg0.anInt453 > 3) {
				local290 = 8;
			}
			if (arg0.anInt429 > 0 && arg0.anInt453 > 1) {
				arg0.anInt429--;
				local290 = 8;
			}
		} else {
			if (arg0.anInt453 > 1) {
				local290 = 6;
			}
			if (arg0.anInt453 > 2) {
				local290 = 8;
			}
			if (arg0.anInt429 > 0 && arg0.anInt453 > 1) {
				arg0.anInt429--;
				local290 = 8;
			}
		}
		@Pc(449) byte local449 = 1;
		if (arg0.aByteArray5[arg0.anInt453 - 1] == 2) {
			local290 <<= 0x1;
			local449 = 2;
		} else if (arg0.aByteArray5[arg0.anInt453 - 1] == 0) {
			local290 >>= 0x1;
			local449 = 0;
		}
		if (local290 < 8 || local9.anInt2726 == -1) {
			if (local9.anInt2758 != -1 && local449 == 0) {
				if (local9.anInt2755 == arg0.anInt451 && local9.anInt2756 != -1) {
					arg0.anInt451 = local9.anInt2756;
				} else if (arg0.anInt451 == local9.anInt2728 && local9.anInt2739 != -1) {
					arg0.anInt451 = local9.anInt2739;
				} else if (local9.anInt2737 == arg0.anInt451 && local9.anInt2750 != -1) {
					arg0.anInt451 = local9.anInt2750;
				} else {
					arg0.anInt451 = local9.anInt2758;
				}
			}
		} else if (local9.anInt2755 == arg0.anInt451 && local9.anInt2729 != -1) {
			arg0.anInt451 = local9.anInt2729;
		} else if (arg0.anInt451 == local9.anInt2728 && local9.anInt2741 != -1) {
			arg0.anInt451 = local9.anInt2741;
		} else if (local9.anInt2737 == arg0.anInt451 && local9.anInt2725 != -1) {
			arg0.anInt451 = local9.anInt2725;
		} else {
			arg0.anInt451 = local9.anInt2726;
		}
		if (local9.anInt2735 != -1) {
			local290 <<= 0x7;
			if (arg0.anInt453 == 1) {
				@Pc(672) int local672 = arg0.anInt483 * arg0.anInt483;
				@Pc(693) int local693 = (arg0.anInt427 > local157 ? arg0.anInt427 - local157 : -arg0.anInt427 + local157) << 7;
				@Pc(714) int local714 = (local173 < arg0.anInt479 ? arg0.anInt479 - local173 : local173 - arg0.anInt479) << 7;
				@Pc(725) int local725 = local693 <= local714 ? local714 : local693;
				@Pc(732) int local732 = local9.anInt2735 * 2 * local725;
				if (local732 < local672) {
					arg0.anInt483 /= 2;
				} else if (local672 / 2 > local725) {
					arg0.anInt483 -= local9.anInt2735;
					if (arg0.anInt483 < 0) {
						arg0.anInt483 = 0;
					}
				} else if (arg0.anInt483 < local290) {
					arg0.anInt483 += local9.anInt2735;
					if (local290 < arg0.anInt483) {
						arg0.anInt483 = local290;
					}
				}
			} else if (arg0.anInt483 < local290) {
				arg0.anInt483 += local9.anInt2735;
				if (arg0.anInt483 > local290) {
					arg0.anInt483 = local290;
				}
			} else if (arg0.anInt483 > 0) {
				arg0.anInt483 -= local9.anInt2735;
				if (arg0.anInt483 < 0) {
					arg0.anInt483 = 0;
				}
			}
			local290 = arg0.anInt483 >> 7;
			if (local290 < 1) {
				local290 = 1;
			}
		}
		if (local140 < local173) {
			arg0.anInt479 += local290;
			if (local173 < arg0.anInt479) {
				arg0.anInt479 = local173;
			}
		} else if (local140 > local173) {
			arg0.anInt479 -= local290;
			if (arg0.anInt479 < local173) {
				arg0.anInt479 = local173;
			}
		}
		if (local137 < local157) {
			arg0.anInt427 += local290;
			if (local157 < arg0.anInt427) {
				arg0.anInt427 = local157;
			}
		} else if (local137 > local157) {
			arg0.anInt427 -= local290;
			if (local157 > arg0.anInt427) {
				arg0.anInt427 = local157;
			}
		}
		if (local157 != arg0.anInt427 || arg0.anInt479 != local173) {
			return;
		}
		arg0.anInt453--;
		if (arg0.anInt434 > 0) {
			arg0.anInt434--;
			return;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method1259() {
		if (Static90.aClass55_1 != null) {
			Static90.aClass55_1.method3219();
		}
		if (Static239.aClass55_2 != null) {
			Static239.aClass55_2.method3219();
		}
		Static203.method3395(Static69.aBoolean106);
		Static90.aClass55_1 = Static136.method2544(Static98.aCanvas1, Static38.aClass28_1, 22050, 0);
		Static90.aClass55_1.method3216(Static13.aClass1_Sub4_Sub2_2);
		Static239.aClass55_2 = Static136.method2544(Static98.aCanvas1, Static38.aClass28_1, 2048, 1);
		Static239.aClass55_2.method3216(Static24.aClass1_Sub4_Sub4_1);
	}
}
