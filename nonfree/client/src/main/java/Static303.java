import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_155 = new Class151("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLclient!me;B)V")
	public static void method3968(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20_Sub3_Sub3 arg1) {
		@Pc(9) Class51 local9 = arg1.method4676();
		if (arg1.anInt6088 == 0) {
			Static339.anInt5513 = -1;
			Static213.anInt3439 = 0;
			arg1.anInt6086 = 0;
			return;
		}
		if (arg1.anInt6051 != -1 && arg1.anInt6040 == 0) {
			@Pc(37) Class171 local37 = Static152.aClass213_1.method4410(arg1.anInt6051);
			if (arg1.anInt6087 > 0 && local37.anInt4260 == 0) {
				Static339.anInt5513 = -1;
				arg1.anInt6086++;
				Static213.anInt3439 = 0;
				return;
			}
			if (arg1.anInt6087 <= 0 && local37.anInt4259 == 0) {
				Static213.anInt3439 = 0;
				arg1.anInt6086++;
				Static339.anInt5513 = -1;
				return;
			}
		}
		@Pc(113) Class171 local113;
		@Pc(99) Class14 local99;
		if (arg1.anInt6014 != -1 && arg1.anInt6015 <= Static368.anInt6250) {
			local99 = Static44.aClass190_2.method4005(arg1.anInt6014);
			if (local99.aBoolean27 && local99.anInt325 != -1) {
				local113 = Static152.aClass213_1.method4410(local99.anInt325);
				if (arg1.anInt6087 > 0 && local113.anInt4260 == 0) {
					Static213.anInt3439 = 0;
					Static339.anInt5513 = -1;
					arg1.anInt6086++;
					return;
				}
				if (arg1.anInt6087 <= 0 && local113.anInt4259 == 0) {
					arg1.anInt6086++;
					Static339.anInt5513 = -1;
					Static213.anInt3439 = 0;
					return;
				}
			}
		}
		if (arg1.anInt6014 != -1 && Static368.anInt6250 >= arg1.anInt6015) {
			local99 = Static44.aClass190_2.method4005(arg1.anInt6014);
			if (local99.aBoolean27 && local99.anInt325 != -1) {
				local113 = Static152.aClass213_1.method4410(local99.anInt325);
				if (arg1.anInt6087 > 0 && local113.anInt4260 == 0) {
					arg1.anInt6086++;
					Static213.anInt3439 = 0;
					Static339.anInt5513 = -1;
					return;
				}
				if (arg1.anInt6087 <= 0 && local113.anInt4259 == 0) {
					arg1.anInt6086++;
					Static213.anInt3439 = 0;
					Static339.anInt5513 = -1;
					return;
				}
			}
		}
		@Pc(229) int local229 = arg1.anInt6613;
		@Pc(232) int local232 = arg1.anInt6616;
		@Pc(248) int local248 = arg1.anIntArray370[arg1.anInt6088 - 1] * 128 + arg1.method4678() * 64;
		@Pc(265) int local265 = arg1.anIntArray369[arg1.anInt6088 - 1] * 128 + arg1.method4678() * 64;
		if (local229 < local248) {
			if (local265 > local232) {
				arg1.method4685(10240);
			} else if (local265 < local232) {
				arg1.method4685(14336);
			} else {
				arg1.method4685(12288);
			}
		} else if (local248 < local229) {
			if (local232 < local265) {
				arg1.method4685(6144);
			} else if (local265 >= local232) {
				arg1.method4685(4096);
			} else {
				arg1.method4685(2048);
			}
		} else if (local232 < local265) {
			arg1.method4685(8192);
		} else if (local232 > local265) {
			arg1.method4685(0);
		}
		@Pc(372) byte local372 = arg1.aByteArray67[arg1.anInt6088 - 1];
		if (!arg0 && (local248 - local229 > 256 || local248 - local229 < -256 || local265 - local232 > 256 || local265 - local232 < -256)) {
			arg1.anInt6616 = local265;
			arg1.anInt6613 = local248;
			arg1.method4686(arg1.anInt6010);
			arg1.anInt6088--;
			Static339.anInt5513 = -1;
			Static213.anInt3439 = 0;
			if (arg1.anInt6087 > 0) {
				arg1.anInt6087--;
			}
			return;
		}
		@Pc(435) int local435 = 4;
		@Pc(437) boolean local437 = true;
		if (arg1 instanceof Class20_Sub3_Sub3_Sub2) {
			local437 = ((Class20_Sub3_Sub3_Sub2) arg1).aClass246_1.aBoolean557;
		}
		@Pc(472) int local472;
		if (local437) {
			local472 = arg1.anInt6010 - arg1.aClass145_7.anInt3594;
			if (local472 != 0 && arg1.anInt6012 == -1 && arg1.anInt6082 != 0) {
				local435 = 2;
			}
			if (!arg0 && arg1.anInt6088 > 2) {
				local435 = 6;
			}
			if (!arg0 && arg1.anInt6088 > 3) {
				local435 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6088 > 1) {
				local435 = 6;
			}
			if (!arg0 && arg1.anInt6088 > 2) {
				local435 = 8;
			}
		}
		if (arg1.anInt6086 > 0 && arg1.anInt6088 > 1) {
			local435 = 8;
			arg1.anInt6086--;
		}
		if (local372 == 2) {
			local435 <<= 0x1;
		} else if (local372 == 0) {
			local435 >>= 0x1;
		}
		if (local9.anInt1309 != -1) {
			local435 <<= 0x7;
			if (arg1.anInt6088 == 1) {
				local472 = arg1.anInt6085 * arg1.anInt6085;
				@Pc(571) int local571 = (arg1.anInt6613 <= local248 ? local248 - arg1.anInt6613 : arg1.anInt6613 + -local248) << 7;
				@Pc(588) int local588 = (arg1.anInt6616 <= local265 ? local265 - arg1.anInt6616 : arg1.anInt6616 - local265) << 7;
				@Pc(595) int local595 = local571 <= local588 ? local588 : local571;
				@Pc(602) int local602 = local595 * 2 * local9.anInt1309;
				if (local472 > local602) {
					arg1.anInt6085 /= 2;
				} else if (local472 / 2 > local595) {
					arg1.anInt6085 -= local9.anInt1309;
					if (arg1.anInt6085 < 0) {
						arg1.anInt6085 = 0;
					}
				} else if (local435 > arg1.anInt6085) {
					arg1.anInt6085 += local9.anInt1309;
					if (local435 < arg1.anInt6085) {
						arg1.anInt6085 = local435;
					}
				}
			} else if (arg1.anInt6085 < local435) {
				arg1.anInt6085 += local9.anInt1309;
				if (local435 < arg1.anInt6085) {
					arg1.anInt6085 = local435;
				}
			} else if (arg1.anInt6085 > 0) {
				arg1.anInt6085 -= local9.anInt1309;
				if (arg1.anInt6085 < 0) {
					arg1.anInt6085 = 0;
				}
			}
			local435 = arg1.anInt6085 >> 7;
			if (local435 < 1) {
				local435 = 1;
			}
		}
		Static213.anInt3439 = 0;
		if (local248 > local229) {
			Static213.anInt3439 |= 0x4;
			arg1.anInt6613 += local435;
			if (arg1.anInt6613 > local248) {
				arg1.anInt6613 = local248;
			}
		} else if (local229 > local248) {
			Static213.anInt3439 |= 0x8;
			arg1.anInt6613 -= local435;
			if (arg1.anInt6613 < local248) {
				arg1.anInt6613 = local248;
			}
		}
		if (local232 < local265) {
			arg1.anInt6616 += local435;
			Static213.anInt3439 |= 0x1;
			if (local265 < arg1.anInt6616) {
				arg1.anInt6616 = local265;
			}
		} else if (local232 > local265) {
			arg1.anInt6616 -= local435;
			Static213.anInt3439 |= 0x2;
			if (local265 > arg1.anInt6616) {
				arg1.anInt6616 = local265;
			}
		}
		if (arg1.anInt6613 == local248 && local265 == arg1.anInt6616) {
			if (arg1.anInt6087 > 0) {
				arg1.anInt6087--;
			}
			arg1.anInt6088--;
		}
		if (local435 < 8) {
			Static339.anInt5513 = local372;
		} else {
			Static339.anInt5513 = 2;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method3969() {
		if (Static250.anIntArray40 != null) {
			return;
		}
		Static250.anIntArray40 = new int[65536];
		@Pc(28) double local28 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
			@Pc(46) float local46 = ((float) (local32 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(55) float local55 = (float) (local32 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(57) int local57 = 0; local57 < 128; local57++) {
				@Pc(64) float local64 = (float) local57 / 128.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(70) float local70 = 0.0F;
				@Pc(74) float local74 = local46 / 60.0F;
				@Pc(77) int local77 = (int) local74;
				@Pc(81) int local81 = local77 % 6;
				@Pc(86) float local86 = local74 - (float) local77;
				@Pc(92) float local92 = local64 * (1.0F - local55);
				@Pc(101) float local101 = local64 * (1.0F - local55 * local86);
				@Pc(112) float local112 = (1.0F - local55 * (1.0F - local86)) * local64;
				if (local81 == 0) {
					local70 = local92;
					local68 = local112;
					local66 = local64;
				} else if (local81 == 1) {
					local70 = local92;
					local68 = local64;
					local66 = local101;
				} else if (local81 == 2) {
					local70 = local112;
					local68 = local64;
					local66 = local92;
				} else if (local81 == 3) {
					local70 = local64;
					local68 = local101;
					local66 = local92;
				} else if (local81 == 4) {
					local66 = local112;
					local70 = local64;
					local68 = local92;
				} else if (local81 == 5) {
					local66 = local64;
					local68 = local92;
					local70 = local101;
				}
				local66 = (float) Math.pow((double) local66, local28);
				local68 = (float) Math.pow((double) local68, local28);
				local70 = (float) Math.pow((double) local70, local28);
				@Pc(207) int local207 = (int) (local66 * 256.0F);
				@Pc(212) int local212 = (int) (local68 * 256.0F);
				@Pc(217) int local217 = (int) (local70 * 256.0F);
				@Pc(230) int local230 = local217 + (local207 << 16) + (local212 << 8) - 16777216;
				Static250.anIntArray40[local30++] = local230;
			}
		}
	}
}
