import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int anInt2941;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt2937 = 0;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "[Lclient!dl;")
	public static final Class1_Sub1_Sub8[] aClass1_Sub1_Sub8Array5 = new Class1_Sub1_Sub8[14];

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	public static int anInt2945 = -1;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZILclient!ou;)V")
	public static void method2164(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class30_Sub1_Sub1 arg1) {
		@Pc(9) Class212 local9 = arg1.method948();
		if (arg1.anInt1314 == 0) {
			arg1.anInt1316 = 0;
			Static285.anInt5407 = 0;
			Static115.anInt2565 = -1;
			return;
		}
		if (arg1.anInt1303 != -1 && arg1.anInt1271 == 0) {
			@Pc(39) Class235 local39 = Static107.aClass239_1.method5420(arg1.anInt1303);
			if (arg1.anInt1315 > 0 && local39.anInt6851 == 0) {
				Static115.anInt2565 = -1;
				Static285.anInt5407 = 0;
				arg1.anInt1316++;
				return;
			}
			if (arg1.anInt1315 <= 0 && local39.anInt6850 == 0) {
				Static115.anInt2565 = -1;
				arg1.anInt1316++;
				Static285.anInt5407 = 0;
				return;
			}
		}
		@Pc(111) Class235 local111;
		@Pc(97) Class223 local97;
		if (arg1.anInt1279 != -1 && Static187.anInt3975 >= arg1.anInt1256) {
			local97 = Static145.aClass63_1.method1524(arg1.anInt1279);
			if (local97.aBoolean420 && local97.anInt6642 != -1) {
				local111 = Static107.aClass239_1.method5420(local97.anInt6642);
				if (arg1.anInt1315 > 0 && local111.anInt6851 == 0) {
					arg1.anInt1316++;
					Static115.anInt2565 = -1;
					Static285.anInt5407 = 0;
					return;
				}
				if (arg1.anInt1315 <= 0 && local111.anInt6850 == 0) {
					arg1.anInt1316++;
					Static285.anInt5407 = 0;
					Static115.anInt2565 = -1;
					return;
				}
			}
		}
		if (arg1.anInt1279 != -1 && Static187.anInt3975 >= arg1.anInt1256) {
			local97 = Static145.aClass63_1.method1524(arg1.anInt1279);
			if (local97.aBoolean420 && local97.anInt6642 != -1) {
				local111 = Static107.aClass239_1.method5420(local97.anInt6642);
				if (arg1.anInt1315 > 0 && local111.anInt6851 == 0) {
					arg1.anInt1316++;
					Static115.anInt2565 = -1;
					Static285.anInt5407 = 0;
					return;
				}
				if (arg1.anInt1315 <= 0 && local111.anInt6850 == 0) {
					Static115.anInt2565 = -1;
					Static285.anInt5407 = 0;
					arg1.anInt1316++;
					return;
				}
			}
		}
		@Pc(222) int local222 = arg1.anInt7490;
		@Pc(225) int local225 = arg1.anInt7488;
		@Pc(242) int local242 = arg1.anIntArray130[arg1.anInt1314 - 1] * 128 + arg1.method944() * 64;
		@Pc(258) int local258 = arg1.anIntArray129[arg1.anInt1314 - 1] * 128 + arg1.method944() * 64;
		if (local222 < local242) {
			if (local258 > local225) {
				arg1.method941(10240);
			} else if (local258 >= local225) {
				arg1.method941(12288);
			} else {
				arg1.method941(14336);
			}
		} else if (local222 <= local242) {
			if (local258 > local225) {
				arg1.method941(8192);
			} else if (local258 < local225) {
				arg1.method941(0);
			}
		} else if (local225 < local258) {
			arg1.method941(6144);
		} else if (local225 <= local258) {
			arg1.method941(4096);
		} else {
			arg1.method941(2048);
		}
		@Pc(349) byte local349 = arg1.aByteArray13[arg1.anInt1314 - 1];
		if (!arg0 && (local242 - local222 > 256 || local242 - local222 < -256 || local258 - local225 > 256 || local258 - local225 < -256)) {
			arg1.anInt7488 = local258;
			arg1.anInt7490 = local242;
			arg1.method943(false, arg1.anInt1277);
			arg1.anInt1314--;
			if (arg1.anInt1315 > 0) {
				arg1.anInt1315--;
			}
			Static285.anInt5407 = 0;
			Static115.anInt2565 = -1;
			return;
		}
		@Pc(414) int local414 = 4;
		@Pc(416) boolean local416 = true;
		if (arg1 instanceof Class30_Sub1_Sub1_Sub1) {
			local416 = ((Class30_Sub1_Sub1_Sub1) arg1).aClass11_1.aBoolean10;
		}
		@Pc(434) int local434;
		if (local416) {
			local434 = arg1.anInt1277 - arg1.aClass15_7.anInt391;
			if (local434 != 0 && arg1.anInt1243 == -1 && arg1.anInt1302 != 0) {
				local414 = 2;
			}
			if (!arg0 && arg1.anInt1314 > 2) {
				local414 = 6;
			}
			if (!arg0 && arg1.anInt1314 > 3) {
				local414 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt1314 > 1) {
				local414 = 6;
			}
			if (!arg0 && arg1.anInt1314 > 2) {
				local414 = 8;
			}
		}
		if (arg1.anInt1316 > 0 && arg1.anInt1314 > 1) {
			local414 = 8;
			arg1.anInt1316--;
		}
		if (local349 == 2) {
			local414 <<= 0x1;
		} else if (local349 == 0) {
			local414 >>= 0x1;
		}
		if (local9.anInt6265 != -1) {
			local414 <<= 0x7;
			if (arg1.anInt1314 == 1) {
				local434 = arg1.anInt1317 * arg1.anInt1317;
				@Pc(607) int local607 = (arg1.anInt7490 <= local242 ? local242 - arg1.anInt7490 : arg1.anInt7490 - local242) << 7;
				@Pc(629) int local629 = (arg1.anInt7488 > local258 ? arg1.anInt7488 - local258 : local258 + -arg1.anInt7488) << 7;
				@Pc(640) int local640 = local607 <= local629 ? local629 : local607;
				@Pc(647) int local647 = local640 * local9.anInt6265 * 2;
				if (local647 < local434) {
					arg1.anInt1317 /= 2;
				} else if (local640 < local434 / 2) {
					arg1.anInt1317 -= local9.anInt6265;
					if (arg1.anInt1317 < 0) {
						arg1.anInt1317 = 0;
					}
				} else if (arg1.anInt1317 < local414) {
					arg1.anInt1317 += local9.anInt6265;
					if (local414 < arg1.anInt1317) {
						arg1.anInt1317 = local414;
					}
				}
			} else if (local414 > arg1.anInt1317) {
				arg1.anInt1317 += local9.anInt6265;
				if (local414 < arg1.anInt1317) {
					arg1.anInt1317 = local414;
				}
			} else if (arg1.anInt1317 > 0) {
				arg1.anInt1317 -= local9.anInt6265;
				if (arg1.anInt1317 < 0) {
					arg1.anInt1317 = 0;
				}
			}
			local414 = arg1.anInt1317 >> 7;
			if (local414 < 1) {
				local414 = 1;
			}
		}
		Static285.anInt5407 = 0;
		if (local222 == local242 && local225 == local258) {
			Static115.anInt2565 = -1;
		} else {
			if (local242 > local222) {
				arg1.anInt7490 += local414;
				Static285.anInt5407 |= 0x4;
				if (arg1.anInt7490 > local242) {
					arg1.anInt7490 = local242;
				}
			} else if (local242 < local222) {
				arg1.anInt7490 -= local414;
				Static285.anInt5407 |= 0x8;
				if (local242 > arg1.anInt7490) {
					arg1.anInt7490 = local242;
				}
			}
			if (local414 >= 8) {
				Static115.anInt2565 = 2;
			} else {
				Static115.anInt2565 = local349;
			}
			if (local258 > local225) {
				arg1.anInt7488 += local414;
				Static285.anInt5407 |= 0x1;
				if (local258 < arg1.anInt7488) {
					arg1.anInt7488 = local258;
				}
			} else if (local258 < local225) {
				arg1.anInt7488 -= local414;
				Static285.anInt5407 |= 0x2;
				if (local258 > arg1.anInt7488) {
					arg1.anInt7488 = local258;
				}
			}
		}
		if (local242 == arg1.anInt7490 && arg1.anInt7488 == local258) {
			if (arg1.anInt1315 > 0) {
				arg1.anInt1315--;
			}
			arg1.anInt1314--;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z")
	public static boolean method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static140.method2263(arg0, arg1) | (arg1 & 0x2000) != 0 | Static289.method4247(arg1, arg0)) & Static350.method4972(arg1, arg0);
	}
}
