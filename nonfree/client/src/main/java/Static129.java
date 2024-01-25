import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!o;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Lclient!in;")
	public static final Class169 aClass169_69 = new Class169(1, -1);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLclient!fm;)V")
	public static void method2324(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class15_Sub3_Sub3_Sub1 arg1) {
		@Pc(9) Class248 local9 = arg1.method3673();
		if (arg1.anInt4039 == 0) {
			Static670.anInt7886 = -1;
			Static553.anInt9679 = 0;
			arg1.anInt4040 = 0;
			return;
		}
		if (arg1.anInt3985 != -1 && arg1.anInt4030 == 0) {
			@Pc(33) Class178 local33 = Static354.aClass40_2.method1123(arg1.anInt3985);
			if (arg1.anInt4038 > 0 && local33.anInt5143 == 0) {
				Static553.anInt9679 = 0;
				arg1.anInt4040++;
				Static670.anInt7886 = -1;
				return;
			}
			if (arg1.anInt4038 <= 0 && local33.anInt5134 == 0) {
				arg1.anInt4040++;
				Static670.anInt7886 = -1;
				Static553.anInt9679 = 0;
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < arg1.aClass358Array3.length; local72++) {
			if (arg1.aClass358Array3[local72].anInt10525 != -1 && Static62.anInt1184 >= arg1.aClass358Array3[local72].anInt10521) {
				@Pc(97) Class336 local97 = Static391.aClass319_1.method8041(arg1.aClass358Array3[local72].anInt10525);
				if (local97.aBoolean711 && local97.anInt9651 != -1) {
					@Pc(111) Class178 local111 = Static354.aClass40_2.method1123(local97.anInt9651);
					if (arg1.anInt4038 > 0 && local111.anInt5143 == 0) {
						Static670.anInt7886 = -1;
						arg1.anInt4040++;
						Static553.anInt9679 = 0;
						return;
					}
					if (arg1.anInt4038 <= 0 && local111.anInt5134 == 0) {
						arg1.anInt4040++;
						Static670.anInt7886 = -1;
						Static553.anInt9679 = 0;
						return;
					}
				}
			}
		}
		@Pc(164) int local164 = arg1.anInt11022;
		@Pc(167) int local167 = arg1.anInt11024;
		@Pc(183) int local183 = arg1.anIntArray189[arg1.anInt4039 - 1] * 512 + arg1.method3690() * 256;
		@Pc(199) int local199 = arg1.anIntArray188[arg1.anInt4039 - 1] * 512 + arg1.method3690() * 256;
		if (local164 >= local183) {
			if (local183 >= local164) {
				if (local167 < local199) {
					arg1.method3681(8192);
				} else if (local199 < local167) {
					arg1.method3681(0);
				}
			} else if (local167 < local199) {
				arg1.method3681(6144);
			} else if (local199 < local167) {
				arg1.method3681(2048);
			} else {
				arg1.method3681(4096);
			}
		} else if (local199 > local167) {
			arg1.method3681(10240);
		} else if (local199 < local167) {
			arg1.method3681(14336);
		} else {
			arg1.method3681(12288);
		}
		@Pc(285) byte local285 = arg1.aByteArray33[arg1.anInt4039 - 1];
		if (!arg0 && (local183 - local164 > 1024 || local183 - local164 < -1024 || local199 - local167 > 1024 || local199 - local167 < -1024)) {
			arg1.anInt11024 = local199;
			arg1.anInt11022 = local183;
			arg1.method3686(arg1.anInt3993, false);
			arg1.anInt4039--;
			if (arg1.anInt4038 > 0) {
				arg1.anInt4038--;
			}
			Static553.anInt9679 = 0;
			Static670.anInt7886 = -1;
			return;
		}
		@Pc(358) int local358 = 16;
		@Pc(360) boolean local360 = true;
		if (arg1 instanceof Class15_Sub3_Sub3_Sub1_Sub2) {
			local360 = ((Class15_Sub3_Sub3_Sub1_Sub2) arg1).aClass312_1.aBoolean659;
		}
		@Pc(400) int local400;
		if (local360) {
			local400 = arg1.anInt3993 - arg1.aClass106_7.anInt3524;
			if (local400 != 0 && arg1.anInt3979 == -1 && arg1.anInt4024 != 0) {
				local358 = 8;
			}
			if (!arg0 && arg1.anInt4039 > 2) {
				local358 = 24;
			}
			if (!arg0 && arg1.anInt4039 > 3) {
				local358 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt4039 > 1) {
				local358 = 24;
			}
			if (!arg0 && arg1.anInt4039 > 2) {
				local358 = 32;
			}
		}
		if (arg1.anInt4040 > 0 && arg1.anInt4039 > 1) {
			arg1.anInt4040--;
			local358 = 32;
		}
		if (local285 == 2) {
			local358 <<= 0x1;
		} else if (local285 == 0) {
			local358 >>= 0x1;
		}
		Static553.anInt9679 = 0;
		if (local9.anInt7471 != -1) {
			local358 <<= 0x9;
			if (arg1.anInt4039 == 1) {
				local400 = arg1.anInt4037 * arg1.anInt4037;
				@Pc(511) int local511 = (arg1.anInt11022 > local183 ? arg1.anInt11022 - local183 : -arg1.anInt11022 + local183) << 9;
				@Pc(532) int local532 = (local199 >= arg1.anInt11024 ? local199 - arg1.anInt11024 : -local199 + arg1.anInt11024) << 9;
				@Pc(539) int local539 = local532 < local511 ? local511 : local532;
				@Pc(546) int local546 = local539 * local9.anInt7471 * 2;
				if (local400 > local546) {
					arg1.anInt4037 /= 2;
				} else if (local400 / 2 > local539) {
					arg1.anInt4037 -= local9.anInt7471;
					if (arg1.anInt4037 < 0) {
						arg1.anInt4037 = 0;
					}
				} else if (local358 > arg1.anInt4037) {
					arg1.anInt4037 += local9.anInt7471;
					if (arg1.anInt4037 > local358) {
						arg1.anInt4037 = local358;
					}
				}
			} else if (arg1.anInt4037 < local358) {
				arg1.anInt4037 += local9.anInt7471;
				if (arg1.anInt4037 > local358) {
					arg1.anInt4037 = local358;
				}
			} else if (arg1.anInt4037 > 0) {
				arg1.anInt4037 -= local9.anInt7471;
				if (arg1.anInt4037 < 0) {
					arg1.anInt4037 = 0;
				}
			}
			local358 = arg1.anInt4037 >> 9;
			if (local358 < 1) {
				local358 = 1;
			}
		}
		if (local164 == local183 && local167 == local199) {
			Static670.anInt7886 = -1;
		} else {
			if (local183 > local164) {
				Static553.anInt9679 |= 0x4;
				arg1.anInt11022 += local358;
				if (arg1.anInt11022 > local183) {
					arg1.anInt11022 = local183;
				}
			} else if (local183 < local164) {
				arg1.anInt11022 -= local358;
				Static553.anInt9679 |= 0x8;
				if (arg1.anInt11022 < local183) {
					arg1.anInt11022 = local183;
				}
			}
			if (local358 < 32) {
				Static670.anInt7886 = local285;
			} else {
				Static670.anInt7886 = 2;
			}
			if (local199 > local167) {
				Static553.anInt9679 |= 0x1;
				arg1.anInt11024 += local358;
				if (local199 < arg1.anInt11024) {
					arg1.anInt11024 = local199;
				}
			} else if (local199 < local167) {
				arg1.anInt11024 -= local358;
				Static553.anInt9679 |= 0x2;
				if (arg1.anInt11024 < local199) {
					arg1.anInt11024 = local199;
				}
			}
		}
		if (arg1.anInt11022 == local183 && local199 == arg1.anInt11024) {
			if (arg1.anInt4038 > 0) {
				arg1.anInt4038--;
			}
			arg1.anInt4039--;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZFFF)F")
	public static float method2325(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 * (arg0 - arg2) + arg2;
	}
}
