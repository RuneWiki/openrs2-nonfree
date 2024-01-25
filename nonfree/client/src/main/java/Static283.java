import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V")
	public static void method5887() {
		if (Static244.anIntArray44 != null) {
			return;
		}
		Static244.anIntArray44 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
			@Pc(40) float local40 = ((float) (local27 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(49) float local49 = (float) (local27 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(51) int local51 = 0; local51 < 128; local51++) {
				@Pc(58) float local58 = (float) local51 / 128.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(68) float local68 = local40 / 60.0F;
				@Pc(71) int local71 = (int) local68;
				@Pc(75) int local75 = local71 % 6;
				@Pc(81) float local81 = (float) -local71 + local68;
				@Pc(88) float local88 = (1.0F - local49) * local58;
				@Pc(97) float local97 = local58 * (1.0F - local49 * local81);
				@Pc(107) float local107 = (1.0F - (1.0F - local81) * local49) * local58;
				if (local75 == 0) {
					local64 = local88;
					local60 = local58;
					local62 = local107;
				} else if (local75 == 1) {
					local60 = local97;
					local62 = local58;
					local64 = local88;
				} else if (local75 == 2) {
					local62 = local58;
					local60 = local88;
					local64 = local107;
				} else if (local75 == 3) {
					local62 = local97;
					local64 = local58;
					local60 = local88;
				} else if (local75 == 4) {
					local62 = local88;
					local64 = local58;
					local60 = local107;
				} else if (local75 == 5) {
					local62 = local88;
					local60 = local58;
					local64 = local97;
				}
				local60 = (float) Math.pow((double) local60, local23);
				local62 = (float) Math.pow((double) local62, local23);
				local64 = (float) Math.pow((double) local64, local23);
				@Pc(200) int local200 = (int) (local60 * 256.0F);
				@Pc(205) int local205 = (int) (local62 * 256.0F);
				@Pc(210) int local210 = (int) (local64 * 256.0F);
				@Pc(222) int local222 = (local205 << 8) + (local200 << 16) + local210 - 16777216;
				Static244.anIntArray44[local25++] = local222;
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!jg;ZI)V")
	public static void method5888(@OriginalArg(0) Class11_Sub1_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class164 local9 = arg0.method2640();
		if (arg0.anInt3342 == 0) {
			arg0.anInt3345 = 0;
			Static63.anInt978 = -1;
			Static150.anInt4703 = 0;
			return;
		}
		if (arg0.anInt3302 != -1 && arg0.anInt3337 == 0) {
			@Pc(41) Class64 local41 = Static402.aClass37_2.method665(arg0.anInt3302);
			if (arg0.anInt3344 > 0 && local41.anInt1197 == 0) {
				Static63.anInt978 = -1;
				arg0.anInt3345++;
				Static150.anInt4703 = 0;
				return;
			}
			if (arg0.anInt3344 <= 0 && local41.anInt1189 == 0) {
				arg0.anInt3345++;
				Static63.anInt978 = -1;
				Static150.anInt4703 = 0;
				return;
			}
		}
		@Pc(106) Class64 local106;
		@Pc(93) Class121 local93;
		if (arg0.anInt3266 != -1 && arg0.anInt3285 <= Static98.anInt1304) {
			local93 = Static46.aClass123_5.method2677(arg0.anInt3266);
			if (local93.aBoolean319 && local93.anInt3204 != -1) {
				local106 = Static402.aClass37_2.method665(local93.anInt3204);
				if (arg0.anInt3344 > 0 && local106.anInt1197 == 0) {
					arg0.anInt3345++;
					Static63.anInt978 = -1;
					Static150.anInt4703 = 0;
					return;
				}
				if (arg0.anInt3344 <= 0 && local106.anInt1189 == 0) {
					arg0.anInt3345++;
					Static63.anInt978 = -1;
					Static150.anInt4703 = 0;
					return;
				}
			}
		}
		if (arg0.anInt3266 != -1 && Static98.anInt1304 >= arg0.anInt3285) {
			local93 = Static46.aClass123_5.method2677(arg0.anInt3266);
			if (local93.aBoolean319 && local93.anInt3204 != -1) {
				local106 = Static402.aClass37_2.method665(local93.anInt3204);
				if (arg0.anInt3344 > 0 && local106.anInt1197 == 0) {
					arg0.anInt3345++;
					Static63.anInt978 = -1;
					Static150.anInt4703 = 0;
					return;
				}
				if (arg0.anInt3344 <= 0 && local106.anInt1189 == 0) {
					Static150.anInt4703 = 0;
					arg0.anInt3345++;
					Static63.anInt978 = -1;
					return;
				}
			}
		}
		@Pc(226) int local226 = arg0.anInt6428;
		@Pc(229) int local229 = arg0.anInt6430;
		@Pc(246) int local246 = arg0.anIntArray246[arg0.anInt3342 - 1] * 128 + arg0.method2635() * 64;
		@Pc(263) int local263 = arg0.anIntArray247[arg0.anInt3342 - 1] * 128 + arg0.method2635() * 64;
		if (local226 < local246) {
			if (local263 > local229) {
				arg0.method2631(10240);
			} else if (local263 >= local229) {
				arg0.method2631(12288);
			} else {
				arg0.method2631(14336);
			}
		} else if (local246 < local226) {
			if (local229 < local263) {
				arg0.method2631(6144);
			} else if (local263 >= local229) {
				arg0.method2631(4096);
			} else {
				arg0.method2631(2048);
			}
		} else if (local263 > local229) {
			arg0.method2631(8192);
		} else if (local229 > local263) {
			arg0.method2631(0);
		}
		@Pc(345) byte local345 = arg0.aByteArray35[arg0.anInt3342 - 1];
		if (!arg1 && (local246 - local226 > 256 || local246 - local226 < -256 || local263 - local229 > 256 || local263 - local229 < -256)) {
			arg0.anInt6430 = local263;
			arg0.anInt6428 = local246;
			arg0.method2642(arg0.anInt3282, false);
			if (arg0.anInt3344 > 0) {
				arg0.anInt3344--;
			}
			arg0.anInt3342--;
			Static63.anInt978 = -1;
			Static150.anInt4703 = 0;
			return;
		}
		@Pc(410) int local410 = 4;
		@Pc(412) boolean local412 = true;
		if (arg0 instanceof Class11_Sub1_Sub3_Sub1) {
			local412 = ((Class11_Sub1_Sub3_Sub1) arg0).aClass272_1.aBoolean637;
		}
		@Pc(450) int local450;
		if (local412) {
			local450 = arg0.anInt3282 - arg0.aClass41_7.anInt774;
			if (local450 != 0 && arg0.anInt3318 == -1 && arg0.anInt3297 != 0) {
				local410 = 2;
			}
			if (!arg1 && arg0.anInt3342 > 2) {
				local410 = 6;
			}
			if (!arg1 && arg0.anInt3342 > 3) {
				local410 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt3342 > 1) {
				local410 = 6;
			}
			if (!arg1 && arg0.anInt3342 > 2) {
				local410 = 8;
			}
		}
		if (arg0.anInt3345 > 0 && arg0.anInt3342 > 1) {
			arg0.anInt3345--;
			local410 = 8;
		}
		if (local345 == 2) {
			local410 <<= 0x1;
		} else if (local345 == 0) {
			local410 >>= 0x1;
		}
		Static150.anInt4703 = 0;
		if (local9.anInt4622 != -1) {
			local410 <<= 0x7;
			if (arg0.anInt3342 == 1) {
				local450 = arg0.anInt3343 * arg0.anInt3343;
				@Pc(561) int local561 = (arg0.anInt6428 <= local246 ? local246 - arg0.anInt6428 : arg0.anInt6428 - local246) << 7;
				@Pc(579) int local579 = (arg0.anInt6430 <= local263 ? local263 - arg0.anInt6430 : -local263 + arg0.anInt6430) << 7;
				@Pc(590) int local590 = local579 >= local561 ? local579 : local561;
				@Pc(597) int local597 = local9.anInt4622 * 2 * local590;
				if (local597 < local450) {
					arg0.anInt3343 /= 2;
				} else if (local590 < local450 / 2) {
					arg0.anInt3343 -= local9.anInt4622;
					if (arg0.anInt3343 < 0) {
						arg0.anInt3343 = 0;
					}
				} else if (local410 > arg0.anInt3343) {
					arg0.anInt3343 += local9.anInt4622;
					if (local410 < arg0.anInt3343) {
						arg0.anInt3343 = local410;
					}
				}
			} else if (arg0.anInt3343 < local410) {
				arg0.anInt3343 += local9.anInt4622;
				if (arg0.anInt3343 > local410) {
					arg0.anInt3343 = local410;
				}
			} else if (arg0.anInt3343 > 0) {
				arg0.anInt3343 -= local9.anInt4622;
				if (arg0.anInt3343 < 0) {
					arg0.anInt3343 = 0;
				}
			}
			local410 = arg0.anInt3343 >> 7;
			if (local410 < 1) {
				local410 = 1;
			}
		}
		if (local226 == local246 && local263 == local229) {
			Static63.anInt978 = -1;
		} else {
			if (local226 < local246) {
				Static150.anInt4703 |= 0x4;
				arg0.anInt6428 += local410;
				if (local246 < arg0.anInt6428) {
					arg0.anInt6428 = local246;
				}
			} else if (local226 > local246) {
				Static150.anInt4703 |= 0x8;
				arg0.anInt6428 -= local410;
				if (arg0.anInt6428 < local246) {
					arg0.anInt6428 = local246;
				}
			}
			if (local410 < 8) {
				Static63.anInt978 = local345;
			} else {
				Static63.anInt978 = 2;
			}
			if (local263 > local229) {
				Static150.anInt4703 |= 0x1;
				arg0.anInt6430 += local410;
				if (local263 < arg0.anInt6430) {
					arg0.anInt6430 = local263;
				}
			} else if (local229 > local263) {
				Static150.anInt4703 |= 0x2;
				arg0.anInt6430 -= local410;
				if (local263 > arg0.anInt6430) {
					arg0.anInt6430 = local263;
				}
			}
		}
		if (local246 == arg0.anInt6428 && local263 == arg0.anInt6430) {
			if (arg0.anInt3344 > 0) {
				arg0.anInt3344--;
			}
			arg0.anInt3342--;
		}
	}
}
