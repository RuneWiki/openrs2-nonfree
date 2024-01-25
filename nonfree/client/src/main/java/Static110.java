import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public static int anInt1951;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
	public static int anInt1953;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	public static int anInt1958;

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_54 = new Class163(41, 4);

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "S")
	public static short aShort20 = 256;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "[Lclient!vs;")
	public static final Class3_Sub3_Sub17[] aClass3_Sub3_Sub17Array2 = new Class3_Sub3_Sub17[14];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	public static void method1805(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3 local16 = Static228.aClass140_25.method3486(); local16 != null; local16 = Static228.aClass140_25.method3485()) {
			if ((local16.aLong248 >> 48 & 0xFFFFL) == (long) arg0) {
				local16.method6288();
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	public static void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0 != Static148.anInt2687) {
			Static401.anIntArray419 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static401.anIntArray419[local9] = (local9 << 12) / arg0;
			}
			Static37.anInt628 = arg0 * 32;
			Static225.anInt3793 = arg0 - 1;
			Static148.anInt2687 = arg0;
		}
		if (Static140.anInt2503 == arg1) {
			return;
		}
		if (arg1 == Static148.anInt2687) {
			Static317.anIntArray337 = Static401.anIntArray419;
		} else {
			Static317.anIntArray337 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static317.anIntArray337[local9] = (local9 << 12) / arg1;
			}
		}
		Static140.anInt2503 = arg1;
		Static165.anInt2326 = arg1 - 1;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)I")
	public static int method1807(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(42) int local42 = (arg0 & 0x7F) * 96 >> 7;
			if (local42 < 2) {
				local42 = 2;
			} else if (local42 > 126) {
				local42 = 126;
			}
			return (arg0 & 0xFF80) + local42;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZLclient!wj;Z)V")
	public static void method1808(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub6 arg1) {
		@Pc(9) Class142 local9 = arg1.method6189();
		if (arg1.anInt7644 == 0) {
			arg1.anInt7642 = 0;
			Static369.anInt6267 = 0;
			Static158.anInt2917 = -1;
			return;
		}
		if (arg1.anInt7612 != -1 && arg1.anInt7624 == 0) {
			@Pc(37) Class261 local37 = Static444.aClass59_3.method1552(arg1.anInt7612);
			if (arg1.anInt7641 > 0 && local37.anInt7420 == 0) {
				Static369.anInt6267 = 0;
				arg1.anInt7642++;
				Static158.anInt2917 = -1;
				return;
			}
			if (arg1.anInt7641 <= 0 && local37.anInt7404 == 0) {
				arg1.anInt7642++;
				Static369.anInt6267 = 0;
				Static158.anInt2917 = -1;
				return;
			}
		}
		@Pc(105) Class261 local105;
		@Pc(92) Class52 local92;
		if (arg1.anInt7596 != -1 && arg1.anInt7590 <= Static172.anInt3107) {
			local92 = Static387.aClass201_2.method4775(arg1.anInt7596);
			if (local92.aBoolean92 && local92.anInt1397 != -1) {
				local105 = Static444.aClass59_3.method1552(local92.anInt1397);
				if (arg1.anInt7641 > 0 && local105.anInt7420 == 0) {
					arg1.anInt7642++;
					Static158.anInt2917 = -1;
					Static369.anInt6267 = 0;
					return;
				}
				if (arg1.anInt7641 <= 0 && local105.anInt7404 == 0) {
					Static369.anInt6267 = 0;
					Static158.anInt2917 = -1;
					arg1.anInt7642++;
					return;
				}
			}
		}
		if (arg1.anInt7596 != -1 && Static172.anInt3107 >= arg1.anInt7590) {
			local92 = Static387.aClass201_2.method4775(arg1.anInt7596);
			if (local92.aBoolean92 && local92.anInt1397 != -1) {
				local105 = Static444.aClass59_3.method1552(local92.anInt1397);
				if (arg1.anInt7641 > 0 && local105.anInt7420 == 0) {
					arg1.anInt7642++;
					Static158.anInt2917 = -1;
					Static369.anInt6267 = 0;
					return;
				}
				if (arg1.anInt7641 <= 0 && local105.anInt7404 == 0) {
					arg1.anInt7642++;
					Static158.anInt2917 = -1;
					Static369.anInt6267 = 0;
					return;
				}
			}
		}
		@Pc(221) int local221 = arg1.anInt7560;
		@Pc(224) int local224 = arg1.anInt7557;
		@Pc(241) int local241 = arg1.anIntArray510[arg1.anInt7644 - 1] * 128 + arg1.method6204() * 64;
		@Pc(257) int local257 = arg1.anIntArray509[arg1.anInt7644 - 1] * 128 + arg1.method6204() * 64;
		if (local241 > local221) {
			if (local257 > local224) {
				arg1.method6198(10240);
			} else if (local257 >= local224) {
				arg1.method6198(12288);
			} else {
				arg1.method6198(14336);
			}
		} else if (local221 > local241) {
			if (local224 < local257) {
				arg1.method6198(6144);
			} else if (local224 <= local257) {
				arg1.method6198(4096);
			} else {
				arg1.method6198(2048);
			}
		} else if (local224 < local257) {
			arg1.method6198(8192);
		} else if (local257 < local224) {
			arg1.method6198(0);
		}
		@Pc(351) byte local351 = arg1.aByteArray122[arg1.anInt7644 - 1];
		if (!arg0 && (local241 - local221 > 256 || local241 - local221 < -256 || local257 - local224 > 256 || local257 - local224 < -256)) {
			arg1.anInt7557 = local257;
			arg1.anInt7560 = local241;
			arg1.method6200(arg1.anInt7625, false);
			Static158.anInt2917 = -1;
			if (arg1.anInt7641 > 0) {
				arg1.anInt7641--;
			}
			arg1.anInt7644--;
			Static369.anInt6267 = 0;
			return;
		}
		@Pc(418) int local418 = 4;
		@Pc(420) boolean local420 = true;
		if (arg1 instanceof Class1_Sub2_Sub6_Sub1) {
			local420 = ((Class1_Sub2_Sub6_Sub1) arg1).aClass158_1.aBoolean328;
		}
		@Pc(437) int local437;
		if (local420) {
			local437 = arg1.anInt7625 - arg1.aClass234_7.anInt6541;
			if (local437 != 0 && arg1.anInt7580 == -1 && arg1.anInt7618 != 0) {
				local418 = 2;
			}
			if (!arg0 && arg1.anInt7644 > 2) {
				local418 = 6;
			}
			if (!arg0 && arg1.anInt7644 > 3) {
				local418 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt7644 > 1) {
				local418 = 6;
			}
			if (!arg0 && arg1.anInt7644 > 2) {
				local418 = 8;
			}
		}
		if (arg1.anInt7642 > 0 && arg1.anInt7644 > 1) {
			arg1.anInt7642--;
			local418 = 8;
		}
		if (local351 == 2) {
			local418 <<= 0x1;
		} else if (local351 == 0) {
			local418 >>= 0x1;
		}
		if (local9.anInt4196 != -1) {
			local418 <<= 0x7;
			if (arg1.anInt7644 == 1) {
				local437 = arg1.anInt7643 * arg1.anInt7643;
				@Pc(559) int local559 = (local241 >= arg1.anInt7560 ? local241 - arg1.anInt7560 : arg1.anInt7560 - local241) << 7;
				@Pc(580) int local580 = (arg1.anInt7557 > local257 ? arg1.anInt7557 - local257 : -arg1.anInt7557 + local257) << 7;
				@Pc(591) int local591 = local559 > local580 ? local559 : local580;
				@Pc(598) int local598 = local9.anInt4196 * 2 * local591;
				if (local598 < local437) {
					arg1.anInt7643 /= 2;
				} else if (local437 / 2 > local591) {
					arg1.anInt7643 -= local9.anInt4196;
					if (arg1.anInt7643 < 0) {
						arg1.anInt7643 = 0;
					}
				} else if (local418 > arg1.anInt7643) {
					arg1.anInt7643 += local9.anInt4196;
					if (local418 < arg1.anInt7643) {
						arg1.anInt7643 = local418;
					}
				}
			} else if (arg1.anInt7643 < local418) {
				arg1.anInt7643 += local9.anInt4196;
				if (arg1.anInt7643 > local418) {
					arg1.anInt7643 = local418;
				}
			} else if (arg1.anInt7643 > 0) {
				arg1.anInt7643 -= local9.anInt4196;
				if (arg1.anInt7643 < 0) {
					arg1.anInt7643 = 0;
				}
			}
			local418 = arg1.anInt7643 >> 7;
			if (local418 < 1) {
				local418 = 1;
			}
		}
		Static369.anInt6267 = 0;
		if (local221 == local241 && local224 == local257) {
			Static158.anInt2917 = -1;
		} else {
			if (local221 < local241) {
				Static369.anInt6267 |= 0x4;
				arg1.anInt7560 += local418;
				if (arg1.anInt7560 > local241) {
					arg1.anInt7560 = local241;
				}
			} else if (local241 < local221) {
				Static369.anInt6267 |= 0x8;
				arg1.anInt7560 -= local418;
				if (arg1.anInt7560 < local241) {
					arg1.anInt7560 = local241;
				}
			}
			if (local418 < 8) {
				Static158.anInt2917 = local351;
			} else {
				Static158.anInt2917 = 2;
			}
			if (local257 > local224) {
				Static369.anInt6267 |= 0x1;
				arg1.anInt7557 += local418;
				if (arg1.anInt7557 > local257) {
					arg1.anInt7557 = local257;
				}
			} else if (local224 > local257) {
				Static369.anInt6267 |= 0x2;
				arg1.anInt7557 -= local418;
				if (local257 > arg1.anInt7557) {
					arg1.anInt7557 = local257;
				}
			}
		}
		if (arg1.anInt7560 == local241 && arg1.anInt7557 == local257) {
			if (arg1.anInt7641 > 0) {
				arg1.anInt7641--;
			}
			arg1.anInt7644--;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)Z")
	public static boolean method1810(@OriginalArg(0) int arg0) {
		Static124.aBoolean177 = true;
		Static179.anInt3324 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
