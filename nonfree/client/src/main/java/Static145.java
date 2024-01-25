import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt3195;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public static int anInt3193 = 0;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "Lclient!h;")
	public static final Class125 aClass125_16 = new Class125(8);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZBLclient!be;)V")
	public static void method2869(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class30_Sub1_Sub1 arg1) {
		@Pc(9) Class166 local9 = arg1.method3602();
		if (arg1.anInt4201 == 0) {
			Static77.anInt1792 = -1;
			Static115.anInt2673 = 0;
			arg1.anInt4202 = 0;
			return;
		}
		if (arg1.anInt4138 != -1 && arg1.anInt4178 == 0) {
			@Pc(40) Class64 local40 = Static47.aClass41_1.method911(arg1.anInt4138);
			if (arg1.anInt4203 > 0 && local40.anInt1967 == 0) {
				Static115.anInt2673 = 0;
				arg1.anInt4202++;
				Static77.anInt1792 = -1;
				return;
			}
			if (arg1.anInt4203 <= 0 && local40.anInt1975 == 0) {
				Static115.anInt2673 = 0;
				arg1.anInt4202++;
				Static77.anInt1792 = -1;
				return;
			}
		}
		@Pc(114) Class64 local114;
		@Pc(101) Class50 local101;
		if (arg1.anInt4157 != -1 && arg1.anInt4172 <= Static409.anInt7683) {
			local101 = Static82.aClass212_2.method5063(arg1.anInt4157);
			if (local101.aBoolean101 && local101.anInt1432 != -1) {
				local114 = Static47.aClass41_1.method911(local101.anInt1432);
				if (arg1.anInt4203 > 0 && local114.anInt1967 == 0) {
					Static77.anInt1792 = -1;
					Static115.anInt2673 = 0;
					arg1.anInt4202++;
					return;
				}
				if (arg1.anInt4203 <= 0 && local114.anInt1975 == 0) {
					arg1.anInt4202++;
					Static115.anInt2673 = 0;
					Static77.anInt1792 = -1;
					return;
				}
			}
		}
		if (arg1.anInt4157 != -1 && Static409.anInt7683 >= arg1.anInt4172) {
			local101 = Static82.aClass212_2.method5063(arg1.anInt4157);
			if (local101.aBoolean101 && local101.anInt1432 != -1) {
				local114 = Static47.aClass41_1.method911(local101.anInt1432);
				if (arg1.anInt4203 > 0 && local114.anInt1967 == 0) {
					arg1.anInt4202++;
					Static115.anInt2673 = 0;
					Static77.anInt1792 = -1;
					return;
				}
				if (arg1.anInt4203 <= 0 && local114.anInt1975 == 0) {
					Static77.anInt1792 = -1;
					arg1.anInt4202++;
					Static115.anInt2673 = 0;
					return;
				}
			}
		}
		@Pc(228) int local228 = arg1.anInt9418;
		@Pc(231) int local231 = arg1.anInt9416;
		@Pc(247) int local247 = arg1.anIntArray316[arg1.anInt4201 - 1] * 128 + arg1.method3591() * 64;
		@Pc(267) int local267 = arg1.anIntArray317[arg1.anInt4201 - 1] * 128 + arg1.method3591() * 64;
		if (local228 >= local247) {
			if (local228 > local247) {
				if (local231 < local267) {
					arg1.method3601(6144);
				} else if (local267 >= local231) {
					arg1.method3601(4096);
				} else {
					arg1.method3601(2048);
				}
			} else if (local231 < local267) {
				arg1.method3601(8192);
			} else if (local231 > local267) {
				arg1.method3601(0);
			}
		} else if (local267 > local231) {
			arg1.method3601(10240);
		} else if (local267 >= local231) {
			arg1.method3601(12288);
		} else {
			arg1.method3601(14336);
		}
		@Pc(361) byte local361 = arg1.aByteArray49[arg1.anInt4201 - 1];
		if (!arg0 && (local247 - local228 > 256 || local247 - local228 < -256 || local267 - local231 > 256 || local267 - local231 < -256)) {
			arg1.anInt9416 = local267;
			arg1.anInt9418 = local247;
			arg1.method3594(false, arg1.lb);
			arg1.anInt4201--;
			Static115.anInt2673 = 0;
			Static77.anInt1792 = -1;
			if (arg1.anInt4203 > 0) {
				arg1.anInt4203--;
			}
			return;
		}
		@Pc(428) int local428 = 4;
		@Pc(430) boolean local430 = true;
		if (arg1 instanceof Class30_Sub1_Sub1_Sub2) {
			local430 = ((Class30_Sub1_Sub1_Sub2) arg1).aClass130_1.aBoolean332;
		}
		@Pc(448) int local448;
		if (local430) {
			local448 = arg1.lb - arg1.aClass221_7.anInt6446;
			if (local448 != 0 && arg1.anInt4135 == -1 && arg1.anInt4199 != 0) {
				local428 = 2;
			}
			if (!arg0 && arg1.anInt4201 > 2) {
				local428 = 6;
			}
			if (!arg0 && arg1.anInt4201 > 3) {
				local428 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt4201 > 1) {
				local428 = 6;
			}
			if (!arg0 && arg1.anInt4201 > 2) {
				local428 = 8;
			}
		}
		if (arg1.anInt4202 > 0 && arg1.anInt4201 > 1) {
			local428 = 8;
			arg1.anInt4202--;
		}
		if (local361 == 2) {
			local428 <<= 0x1;
		} else if (local361 == 0) {
			local428 >>= 0x1;
		}
		if (local9.anInt4976 != -1) {
			local428 <<= 0x7;
			if (arg1.anInt4201 == 1) {
				local448 = arg1.anInt4200 * arg1.anInt4200;
				@Pc(578) int local578 = (local247 >= arg1.anInt9418 ? local247 - arg1.anInt9418 : -local247 + arg1.anInt9418) << 7;
				@Pc(600) int local600 = (local267 < arg1.anInt9416 ? arg1.anInt9416 - local267 : local267 + -arg1.anInt9416) << 7;
				@Pc(607) int local607 = local600 < local578 ? local578 : local600;
				@Pc(614) int local614 = local607 * local9.anInt4976 * 2;
				if (local614 < local448) {
					arg1.anInt4200 /= 2;
				} else if (local607 < local448 / 2) {
					arg1.anInt4200 -= local9.anInt4976;
					if (arg1.anInt4200 < 0) {
						arg1.anInt4200 = 0;
					}
				} else if (local428 > arg1.anInt4200) {
					arg1.anInt4200 += local9.anInt4976;
					if (local428 < arg1.anInt4200) {
						arg1.anInt4200 = local428;
					}
				}
			} else if (local428 > arg1.anInt4200) {
				arg1.anInt4200 += local9.anInt4976;
				if (arg1.anInt4200 > local428) {
					arg1.anInt4200 = local428;
				}
			} else if (arg1.anInt4200 > 0) {
				arg1.anInt4200 -= local9.anInt4976;
				if (arg1.anInt4200 < 0) {
					arg1.anInt4200 = 0;
				}
			}
			local428 = arg1.anInt4200 >> 7;
			if (local428 < 1) {
				local428 = 1;
			}
		}
		Static115.anInt2673 = 0;
		if (local228 == local247 && local267 == local231) {
			Static77.anInt1792 = -1;
		} else {
			if (local247 > local228) {
				Static115.anInt2673 |= 0x4;
				arg1.anInt9418 += local428;
				if (local247 < arg1.anInt9418) {
					arg1.anInt9418 = local247;
				}
			} else if (local247 < local228) {
				Static115.anInt2673 |= 0x8;
				arg1.anInt9418 -= local428;
				if (arg1.anInt9418 < local247) {
					arg1.anInt9418 = local247;
				}
			}
			if (local267 > local231) {
				Static115.anInt2673 |= 0x1;
				arg1.anInt9416 += local428;
				if (local267 < arg1.anInt9416) {
					arg1.anInt9416 = local267;
				}
			} else if (local267 < local231) {
				Static115.anInt2673 |= 0x2;
				arg1.anInt9416 -= local428;
				if (local267 > arg1.anInt9416) {
					arg1.anInt9416 = local267;
				}
			}
			if (local428 >= 8) {
				Static77.anInt1792 = 2;
			} else {
				Static77.anInt1792 = local361;
			}
		}
		if (local247 != arg1.anInt9418 || arg1.anInt9416 != local267) {
			return;
		}
		arg1.anInt4201--;
		if (arg1.anInt4203 > 0) {
			arg1.anInt4203--;
			return;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIF[FBII)V")
	public static void method2870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg1 - arg4;
		@Pc(9) int local9 = arg8 - arg7;
		@Pc(13) int local13 = arg3 - arg2;
		@Pc(38) float local38 = (float) local9 * arg6[2] + arg6[1] * (float) local5 + arg6[0] * (float) local13;
		@Pc(59) float local59 = arg6[5] * (float) local9 + (float) local13 * arg6[3] + arg6[4] * (float) local5;
		@Pc(80) float local80 = (float) local5 * arg6[7] + (float) local13 * arg6[6] + arg6[8] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg5 + 0.5F;
		@Pc(139) float local139;
		if (arg0 == 1) {
			local139 = local111;
			local111 = -local124;
			local124 = local139;
		} else if (arg0 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg0 == 3) {
			local139 = local111;
			local111 = local124;
			local124 = -local139;
		}
		Static42.aFloat8 = local111;
		Static96.aFloat57 = local124;
	}
}
