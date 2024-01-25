import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!o;")
	public static final Class169 aClass169_188 = new Class169("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	public static int anInt3667 = 1;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method2985() {
		Static68.aClass89_1 = new Class89(8);
		Static390.anInt6363 = 0;
		for (@Pc(17) Class41_Sub3 local17 = (Class41_Sub3) Static63.aClass208_8.method4661(); local17 != null; local17 = (Class41_Sub3) Static63.aClass208_8.method4663()) {
			local17.method2149();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZI)I")
	public static int method2987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static307.method4936(arg0 + 45365, arg1 + 91923, 4) + (Static307.method4936(arg0 + 10294, arg1 - -37821, 2) - 128 >> 1) + (Static307.method4936(arg0, arg1, 1) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLclient!sk;I)V")
	public static void method2989(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class25_Sub1_Sub1 arg1) {
		@Pc(9) Class8 local9 = arg1.method1880();
		if (arg1.anInt2381 == 0) {
			arg1.anInt2380 = 0;
			Static341.anInt5632 = -1;
			Static89.anInt1645 = 0;
			return;
		}
		if (arg1.anInt2333 != -1 && arg1.anInt2323 == 0) {
			@Pc(41) Class185 local41 = Static25.aClass67_1.method1227(arg1.anInt2333);
			if (arg1.anInt2379 > 0 && local41.anInt4797 == 0) {
				Static89.anInt1645 = 0;
				Static341.anInt5632 = -1;
				arg1.anInt2380++;
				return;
			}
			if (arg1.anInt2379 <= 0 && local41.anInt4804 == 0) {
				Static341.anInt5632 = -1;
				arg1.anInt2380++;
				Static89.anInt1645 = 0;
				return;
			}
		}
		if (arg1.anInt2338 != -1 && arg1.anInt2355 <= Static366.anInt5883) {
			@Pc(100) Class134 local100 = Static10.aClass246_1.method5429(arg1.anInt2338);
			if (local100.aBoolean297 && local100.anInt3346 != -1) {
				@Pc(114) Class185 local114 = Static25.aClass67_1.method1227(local100.anInt3346);
				if (arg1.anInt2379 > 0 && local114.anInt4797 == 0) {
					Static89.anInt1645 = 0;
					Static341.anInt5632 = -1;
					arg1.anInt2380++;
					return;
				}
				if (arg1.anInt2379 <= 0 && local114.anInt4804 == 0) {
					arg1.anInt2380++;
					Static341.anInt5632 = -1;
					Static89.anInt1645 = 0;
					return;
				}
			}
		}
		@Pc(157) int local157 = arg1.anInt6080;
		@Pc(160) int local160 = arg1.anInt6077;
		@Pc(177) int local177 = arg1.anIntArray296[arg1.anInt2381 - 1] * 128 + arg1.method1877() * 64;
		@Pc(193) int local193 = arg1.anIntArray295[arg1.anInt2381 - 1] * 128 + arg1.method1877() * 64;
		if (local157 >= local177) {
			if (local177 < local157) {
				if (local193 > local160) {
					arg1.method1889(6144);
				} else if (local160 <= local193) {
					arg1.method1889(4096);
				} else {
					arg1.method1889(2048);
				}
			} else if (local193 > local160) {
				arg1.method1889(8192);
			} else if (local193 < local160) {
				arg1.method1889(0);
			}
		} else if (local160 < local193) {
			arg1.method1889(10240);
		} else if (local193 >= local160) {
			arg1.method1889(12288);
		} else {
			arg1.method1889(14336);
		}
		@Pc(291) byte local291 = arg1.aByteArray40[arg1.anInt2381 - 1];
		if (!arg0 && (local177 - local157 > 256 || local177 - local157 < -256 || local193 - local160 > 256 || local193 - local160 < -256)) {
			arg1.anInt6080 = local177;
			arg1.anInt6077 = local193;
			arg1.method1891(arg1.anInt2352);
			Static341.anInt5632 = -1;
			arg1.anInt2381--;
			if (arg1.anInt2379 > 0) {
				arg1.anInt2379--;
			}
			Static89.anInt1645 = 0;
			return;
		}
		@Pc(355) int local355 = 4;
		@Pc(357) boolean local357 = true;
		if (arg1 instanceof Class25_Sub1_Sub1_Sub2) {
			local357 = ((Class25_Sub1_Sub1_Sub2) arg1).aClass59_1.aBoolean124;
		}
		@Pc(375) int local375;
		if (local357) {
			local375 = arg1.anInt2352 - arg1.aClass99_7.anInt2556;
			if (local375 != 0 && arg1.anInt2353 == -1 && arg1.anInt2341 != 0) {
				local355 = 2;
			}
			if (!arg0 && arg1.anInt2381 > 2) {
				local355 = 6;
			}
			if (!arg0 && arg1.anInt2381 > 3) {
				local355 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt2381 > 1) {
				local355 = 6;
			}
			if (!arg0 && arg1.anInt2381 > 2) {
				local355 = 8;
			}
		}
		if (arg1.anInt2380 > 0 && arg1.anInt2381 > 1) {
			local355 = 8;
			arg1.anInt2380--;
		}
		if (local291 == 2) {
			local355 <<= 0x1;
		} else if (local291 == 0) {
			local355 >>= 0x1;
		}
		if (local9.anInt157 != -1) {
			local355 <<= 0x7;
			if (arg1.anInt2381 == 1) {
				local375 = arg1.anInt2378 * arg1.anInt2378;
				@Pc(549) int local549 = (arg1.anInt6080 > local177 ? arg1.anInt6080 - local177 : -arg1.anInt6080 + local177) << 7;
				@Pc(570) int local570 = (local193 < arg1.anInt6077 ? arg1.anInt6077 - local193 : local193 - arg1.anInt6077) << 7;
				@Pc(577) int local577 = local570 >= local549 ? local570 : local549;
				@Pc(584) int local584 = local577 * 2 * local9.anInt157;
				if (local375 > local584) {
					arg1.anInt2378 /= 2;
				} else if (local577 < local375 / 2) {
					arg1.anInt2378 -= local9.anInt157;
					if (arg1.anInt2378 < 0) {
						arg1.anInt2378 = 0;
					}
				} else if (local355 > arg1.anInt2378) {
					arg1.anInt2378 += local9.anInt157;
					if (arg1.anInt2378 > local355) {
						arg1.anInt2378 = local355;
					}
				}
			} else if (arg1.anInt2378 < local355) {
				arg1.anInt2378 += local9.anInt157;
				if (local355 < arg1.anInt2378) {
					arg1.anInt2378 = local355;
				}
			} else if (arg1.anInt2378 > 0) {
				arg1.anInt2378 -= local9.anInt157;
				if (arg1.anInt2378 < 0) {
					arg1.anInt2378 = 0;
				}
			}
			local355 = arg1.anInt2378 >> 7;
			if (local355 < 1) {
				local355 = 1;
			}
		}
		Static89.anInt1645 = 0;
		if (local177 > local157) {
			Static89.anInt1645 |= 0x4;
			arg1.anInt6080 += local355;
			if (arg1.anInt6080 > local177) {
				arg1.anInt6080 = local177;
			}
		} else if (local157 > local177) {
			arg1.anInt6080 -= local355;
			Static89.anInt1645 |= 0x8;
			if (arg1.anInt6080 < local177) {
				arg1.anInt6080 = local177;
			}
		}
		if (local193 > local160) {
			arg1.anInt6077 += local355;
			Static89.anInt1645 |= 0x1;
			if (arg1.anInt6077 > local193) {
				arg1.anInt6077 = local193;
			}
		} else if (local193 < local160) {
			arg1.anInt6077 -= local355;
			Static89.anInt1645 |= 0x2;
			if (local193 > arg1.anInt6077) {
				arg1.anInt6077 = local193;
			}
		}
		if (local355 < 8) {
			Static341.anInt5632 = local291;
		} else {
			Static341.anInt5632 = 2;
		}
		if (local177 == arg1.anInt6080 && arg1.anInt6077 == local193) {
			if (arg1.anInt2379 > 0) {
				arg1.anInt2379--;
			}
			arg1.anInt2381--;
		}
	}
}
