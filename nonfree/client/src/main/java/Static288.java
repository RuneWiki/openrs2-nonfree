import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "F")
	public static float aFloat80 = 0.25F;

	@OriginalMember(owner = "client!ol", name = "N", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ol", name = "O", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_101 = new Class254(52, -1);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZILclient!ir;)V")
	public static void method3961(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class47_Sub1_Sub5 arg1) {
		@Pc(9) Class231 local9 = arg1.method4327();
		if (arg1.anInt5421 == 0) {
			arg1.anInt5419 = 0;
			Static105.anInt2074 = -1;
			Static437.anInt7634 = 0;
			return;
		}
		if (arg1.anInt5348 != -1 && arg1.anInt5370 == 0) {
			@Pc(36) Class58 local36 = Static322.aClass45_5.method690(arg1.anInt5348);
			if (arg1.anInt5420 > 0 && local36.anInt1437 == 0) {
				arg1.anInt5419++;
				Static105.anInt2074 = -1;
				Static437.anInt7634 = 0;
				return;
			}
			if (arg1.anInt5420 <= 0 && local36.anInt1430 == 0) {
				Static437.anInt7634 = 0;
				Static105.anInt2074 = -1;
				arg1.anInt5419++;
				return;
			}
		}
		@Pc(107) Class58 local107;
		@Pc(93) Class166 local93;
		if (arg1.anInt5381 != -1 && Static123.anInt2333 >= arg1.anInt5412) {
			local93 = Static294.aClass125_2.method2961(arg1.anInt5381);
			if (local93.aBoolean344 && local93.anInt4334 != -1) {
				local107 = Static322.aClass45_5.method690(local93.anInt4334);
				if (arg1.anInt5420 > 0 && local107.anInt1437 == 0) {
					arg1.anInt5419++;
					Static437.anInt7634 = 0;
					Static105.anInt2074 = -1;
					return;
				}
				if (arg1.anInt5420 <= 0 && local107.anInt1430 == 0) {
					Static105.anInt2074 = -1;
					arg1.anInt5419++;
					Static437.anInt7634 = 0;
					return;
				}
			}
		}
		if (arg1.anInt5381 != -1 && arg1.anInt5412 <= Static123.anInt2333) {
			local93 = Static294.aClass125_2.method2961(arg1.anInt5381);
			if (local93.aBoolean344 && local93.anInt4334 != -1) {
				local107 = Static322.aClass45_5.method690(local93.anInt4334);
				if (arg1.anInt5420 > 0 && local107.anInt1437 == 0) {
					Static105.anInt2074 = -1;
					arg1.anInt5419++;
					Static437.anInt7634 = 0;
					return;
				}
				if (arg1.anInt5420 <= 0 && local107.anInt1430 == 0) {
					Static105.anInt2074 = -1;
					arg1.anInt5419++;
					Static437.anInt7634 = 0;
					return;
				}
			}
		}
		@Pc(226) int local226 = arg1.anInt7060;
		@Pc(229) int local229 = arg1.anInt7066;
		@Pc(248) int local248 = arg1.anIntArray407[arg1.anInt5421 - 1] * 128 + arg1.method4317() * 64;
		@Pc(267) int local267 = arg1.anIntArray408[arg1.anInt5421 - 1] * 128 + arg1.method4317() * 64;
		if (local248 > local226) {
			if (local267 > local229) {
				arg1.method4321(10240);
			} else if (local229 <= local267) {
				arg1.method4321(12288);
			} else {
				arg1.method4321(14336);
			}
		} else if (local226 > local248) {
			if (local229 < local267) {
				arg1.method4321(6144);
			} else if (local229 > local267) {
				arg1.method4321(2048);
			} else {
				arg1.method4321(4096);
			}
		} else if (local229 < local267) {
			arg1.method4321(8192);
		} else if (local229 > local267) {
			arg1.method4321(0);
		}
		@Pc(371) byte local371 = arg1.aByteArray63[arg1.anInt5421 - 1];
		if (!arg0 && (local248 - local226 > 256 || local248 - local226 < -256 || local267 - local229 > 256 || local267 - local229 < -256)) {
			arg1.anInt7060 = local248;
			arg1.anInt7066 = local267;
			arg1.method4320(arg1.anInt5379);
			arg1.anInt5421--;
			if (arg1.anInt5420 > 0) {
				arg1.anInt5420--;
			}
			Static437.anInt7634 = 0;
			Static105.anInt2074 = -1;
			return;
		}
		@Pc(436) int local436 = 4;
		@Pc(438) boolean local438 = true;
		if (arg1 instanceof Class47_Sub1_Sub5_Sub1) {
			local438 = ((Class47_Sub1_Sub5_Sub1) arg1).aClass196_1.aBoolean445;
		}
		@Pc(456) int local456;
		if (local438) {
			local456 = arg1.anInt5379 - arg1.aClass134_7.anInt3621;
			if (local456 != 0 && arg1.anInt5378 == -1 && arg1.anInt5404 != 0) {
				local436 = 2;
			}
			if (!arg0 && arg1.anInt5421 > 2) {
				local436 = 6;
			}
			if (!arg0 && arg1.anInt5421 > 3) {
				local436 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt5421 > 1) {
				local436 = 6;
			}
			if (!arg0 && arg1.anInt5421 > 2) {
				local436 = 8;
			}
		}
		if (arg1.anInt5419 > 0 && arg1.anInt5421 > 1) {
			local436 = 8;
			arg1.anInt5419--;
		}
		if (local371 == 2) {
			local436 <<= 0x1;
		} else if (local371 == 0) {
			local436 >>= 0x1;
		}
		Static437.anInt7634 = 0;
		if (local9.anInt6978 != -1) {
			local436 <<= 0x7;
			if (arg1.anInt5421 == 1) {
				local456 = arg1.anInt5418 * arg1.anInt5418;
				@Pc(596) int local596 = (local248 < arg1.anInt7060 ? arg1.anInt7060 - local248 : -arg1.anInt7060 + local248) << 7;
				@Pc(614) int local614 = (local267 < arg1.anInt7066 ? arg1.anInt7066 - local267 : -arg1.anInt7066 + local267) << 7;
				@Pc(621) int local621 = local596 <= local614 ? local614 : local596;
				@Pc(628) int local628 = local621 * 2 * local9.anInt6978;
				if (local628 < local456) {
					arg1.anInt5418 /= 2;
				} else if (local456 / 2 > local621) {
					arg1.anInt5418 -= local9.anInt6978;
					if (arg1.anInt5418 < 0) {
						arg1.anInt5418 = 0;
					}
				} else if (arg1.anInt5418 < local436) {
					arg1.anInt5418 += local9.anInt6978;
					if (local436 < arg1.anInt5418) {
						arg1.anInt5418 = local436;
					}
				}
			} else if (arg1.anInt5418 < local436) {
				arg1.anInt5418 += local9.anInt6978;
				if (arg1.anInt5418 > local436) {
					arg1.anInt5418 = local436;
				}
			} else if (arg1.anInt5418 > 0) {
				arg1.anInt5418 -= local9.anInt6978;
				if (arg1.anInt5418 < 0) {
					arg1.anInt5418 = 0;
				}
			}
			local436 = arg1.anInt5418 >> 7;
			if (local436 < 1) {
				local436 = 1;
			}
		}
		if (local226 < local248) {
			Static437.anInt7634 |= 0x4;
			arg1.anInt7060 += local436;
			if (arg1.anInt7060 > local248) {
				arg1.anInt7060 = local248;
			}
		} else if (local226 > local248) {
			Static437.anInt7634 |= 0x8;
			arg1.anInt7060 -= local436;
			if (arg1.anInt7060 < local248) {
				arg1.anInt7060 = local248;
			}
		}
		if (local229 < local267) {
			Static437.anInt7634 |= 0x1;
			arg1.anInt7066 += local436;
			if (arg1.anInt7066 > local267) {
				arg1.anInt7066 = local267;
			}
		} else if (local267 < local229) {
			arg1.anInt7066 -= local436;
			Static437.anInt7634 |= 0x2;
			if (local267 > arg1.anInt7066) {
				arg1.anInt7066 = local267;
			}
		}
		if (local436 < 8) {
			Static105.anInt2074 = local371;
		} else {
			Static105.anInt2074 = 2;
		}
		if (arg1.anInt7060 == local248 && local267 == arg1.anInt7066) {
			if (arg1.anInt5420 > 0) {
				arg1.anInt5420--;
			}
			arg1.anInt5421--;
		}
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public static void method3962() {
		Static398.aClass1_Sub5_Sub4_4.method4484();
		Static289.aClass109_67 = null;
		Static25.anInt424 = 1;
	}
}
