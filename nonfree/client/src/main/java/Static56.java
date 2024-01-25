import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
	public static int anInt1345;

	@OriginalMember(owner = "client!cr", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_12 = new Class21("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!cr", name = "O", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_13 = new Class21("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
	public static int anInt1346 = 0;

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "[I")
	public static final int[] anIntArray85 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
	public static String[] method1232(@OriginalArg(0) String[] arg0) {
		@Pc(16) String[] local16 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local16[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local16[local18] = local16[local18] + arg0[local18];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)I")
	public static int method1234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static398.aByteArrayArrayArray17[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static398.aByteArrayArrayArray17[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!uc;ZI)V")
	public static void method1235(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) Class231 local9 = arg0.method5306();
		if (arg0.anInt6549 == 0) {
			arg0.anInt6551 = 0;
			Static254.anInt4910 = -1;
			Static360.anInt6286 = 0;
			return;
		}
		if (arg0.anInt6505 != -1 && arg0.anInt6496 == 0) {
			@Pc(37) Class130 local37 = Static143.aClass85_1.method2406(arg0.anInt6505);
			if (arg0.anInt6550 > 0 && local37.anInt3948 == 0) {
				arg0.anInt6551++;
				Static360.anInt6286 = 0;
				Static254.anInt4910 = -1;
				return;
			}
			if (arg0.anInt6550 <= 0 && local37.anInt3950 == 0) {
				Static360.anInt6286 = 0;
				arg0.anInt6551++;
				Static254.anInt4910 = -1;
				return;
			}
		}
		@Pc(103) Class130 local103;
		@Pc(89) Class149 local89;
		if (arg0.anInt6515 != -1 && Static277.anInt2834 >= arg0.anInt6517) {
			local89 = Static193.aClass186_1.method4462(arg0.anInt6515);
			if (local89.aBoolean297 && local89.anInt4573 != -1) {
				local103 = Static143.aClass85_1.method2406(local89.anInt4573);
				if (arg0.anInt6550 > 0 && local103.anInt3948 == 0) {
					Static360.anInt6286 = 0;
					Static254.anInt4910 = -1;
					arg0.anInt6551++;
					return;
				}
				if (arg0.anInt6550 <= 0 && local103.anInt3950 == 0) {
					Static254.anInt4910 = -1;
					Static360.anInt6286 = 0;
					arg0.anInt6551++;
					return;
				}
			}
		}
		if (arg0.anInt6515 != -1 && arg0.anInt6517 <= Static277.anInt2834) {
			local89 = Static193.aClass186_1.method4462(arg0.anInt6515);
			if (local89.aBoolean297 && local89.anInt4573 != -1) {
				local103 = Static143.aClass85_1.method2406(local89.anInt4573);
				if (arg0.anInt6550 > 0 && local103.anInt3948 == 0) {
					arg0.anInt6551++;
					Static360.anInt6286 = 0;
					Static254.anInt4910 = -1;
					return;
				}
				if (arg0.anInt6550 <= 0 && local103.anInt3950 == 0) {
					arg0.anInt6551++;
					Static360.anInt6286 = 0;
					Static254.anInt4910 = -1;
					return;
				}
			}
		}
		@Pc(227) int local227 = arg0.anInt7514;
		@Pc(230) int local230 = arg0.anInt7515;
		@Pc(246) int local246 = arg0.anIntArray523[arg0.anInt6549 - 1] * 128 + arg0.method5302() * 64;
		@Pc(263) int local263 = arg0.anIntArray524[arg0.anInt6549 - 1] * 128 + arg0.method5302() * 64;
		if (local246 > local227) {
			if (local230 < local263) {
				arg0.method5301(10240);
			} else if (local230 > local263) {
				arg0.method5301(14336);
			} else {
				arg0.method5301(12288);
			}
		} else if (local227 > local246) {
			if (local230 < local263) {
				arg0.method5301(6144);
			} else if (local263 < local230) {
				arg0.method5301(2048);
			} else {
				arg0.method5301(4096);
			}
		} else if (local263 > local230) {
			arg0.method5301(8192);
		} else if (local263 < local230) {
			arg0.method5301(0);
		}
		@Pc(357) byte local357 = arg0.aByteArray87[arg0.anInt6549 - 1];
		if (!arg1 && (local246 - local227 > 256 || local246 - local227 < -256 || local263 - local230 > 256 || local263 - local230 < -256)) {
			arg0.anInt7515 = local263;
			arg0.anInt7514 = local246;
			arg0.method5297(arg0.anInt6511, false);
			Static360.anInt6286 = 0;
			if (arg0.anInt6550 > 0) {
				arg0.anInt6550--;
			}
			arg0.anInt6549--;
			Static254.anInt4910 = -1;
			return;
		}
		@Pc(419) int local419 = 4;
		@Pc(421) boolean local421 = true;
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			local421 = ((Class11_Sub5_Sub2_Sub2) arg0).aClass241_1.aBoolean518;
		}
		@Pc(439) int local439;
		if (local421) {
			local439 = arg0.anInt6511 - arg0.aClass102_7.anInt3248;
			if (local439 != 0 && arg0.anInt6495 == -1 && arg0.anInt6530 != 0) {
				local419 = 2;
			}
			if (!arg1 && arg0.anInt6549 > 2) {
				local419 = 6;
			}
			if (!arg1 && arg0.anInt6549 > 3) {
				local419 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt6549 > 1) {
				local419 = 6;
			}
			if (!arg1 && arg0.anInt6549 > 2) {
				local419 = 8;
			}
		}
		if (arg0.anInt6551 > 0 && arg0.anInt6549 > 1) {
			arg0.anInt6551--;
			local419 = 8;
		}
		if (local357 == 2) {
			local419 <<= 0x1;
		} else if (local357 == 0) {
			local419 >>= 0x1;
		}
		Static360.anInt6286 = 0;
		if (local9.anInt6406 != -1) {
			local419 <<= 0x7;
			if (arg0.anInt6549 == 1) {
				local439 = arg0.anInt6552 * arg0.anInt6552;
				@Pc(564) int local564 = (local246 < arg0.anInt7514 ? arg0.anInt7514 - local246 : -arg0.anInt7514 + local246) << 7;
				@Pc(582) int local582 = (local263 < arg0.anInt7515 ? arg0.anInt7515 - local263 : -arg0.anInt7515 + local263) << 7;
				@Pc(589) int local589 = local564 <= local582 ? local582 : local564;
				@Pc(596) int local596 = local589 * 2 * local9.anInt6406;
				if (local439 > local596) {
					arg0.anInt6552 /= 2;
				} else if (local439 / 2 > local589) {
					arg0.anInt6552 -= local9.anInt6406;
					if (arg0.anInt6552 < 0) {
						arg0.anInt6552 = 0;
					}
				} else if (arg0.anInt6552 < local419) {
					arg0.anInt6552 += local9.anInt6406;
					if (arg0.anInt6552 > local419) {
						arg0.anInt6552 = local419;
					}
				}
			} else if (local419 > arg0.anInt6552) {
				arg0.anInt6552 += local9.anInt6406;
				if (arg0.anInt6552 > local419) {
					arg0.anInt6552 = local419;
				}
			} else if (arg0.anInt6552 > 0) {
				arg0.anInt6552 -= local9.anInt6406;
				if (arg0.anInt6552 < 0) {
					arg0.anInt6552 = 0;
				}
			}
			local419 = arg0.anInt6552 >> 7;
			if (local419 < 1) {
				local419 = 1;
			}
		}
		if (local227 == local246 && local230 == local263) {
			Static254.anInt4910 = -1;
		} else {
			if (local246 > local227) {
				Static360.anInt6286 |= 0x4;
				arg0.anInt7514 += local419;
				if (arg0.anInt7514 > local246) {
					arg0.anInt7514 = local246;
				}
			} else if (local246 < local227) {
				Static360.anInt6286 |= 0x8;
				arg0.anInt7514 -= local419;
				if (local246 > arg0.anInt7514) {
					arg0.anInt7514 = local246;
				}
			}
			if (local263 > local230) {
				Static360.anInt6286 |= 0x1;
				arg0.anInt7515 += local419;
				if (local263 < arg0.anInt7515) {
					arg0.anInt7515 = local263;
				}
			} else if (local230 > local263) {
				arg0.anInt7515 -= local419;
				Static360.anInt6286 |= 0x2;
				if (local263 > arg0.anInt7515) {
					arg0.anInt7515 = local263;
				}
			}
			if (local419 < 8) {
				Static254.anInt4910 = local357;
			} else {
				Static254.anInt4910 = 2;
			}
		}
		if (local246 == arg0.anInt7514 && arg0.anInt7515 == local263) {
			if (arg0.anInt6550 > 0) {
				arg0.anInt6550--;
			}
			arg0.anInt6549--;
		}
	}
}
