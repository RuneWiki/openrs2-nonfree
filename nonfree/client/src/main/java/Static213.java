import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!wo;")
	public static Class216 aClass216_72;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
	public static int anInt4560;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Lclient!eh;")
	public static Class55 aClass55_1;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
	public static int anInt4559 = 0;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public static void method4102() {
		@Pc(14) int local14 = Static301.anInt5960 * 128 + 64;
		@Pc(20) int local20 = Static354.anInt6757 * 128 + 64;
		@Pc(28) int local28 = Static94.method2022(local20, local14, Static242.anInt6745) - Static41.anInt1307;
		if (Static355.anInt6783 >= 100) {
			Static64.anInt1797 = Static354.anInt6757 * 128 + 64;
			Static320.anInt5326 = Static301.anInt5960 * 128 + 64;
			Static95.anInt2319 = Static94.method2022(Static64.anInt1797, Static320.anInt5326, Static242.anInt6745) - Static41.anInt1307;
		} else {
			if (local14 > Static320.anInt5326) {
				Static320.anInt5326 += Static271.anInt5526 + (local14 - Static320.anInt5326) * Static355.anInt6783 / 1000;
				if (local14 < Static320.anInt5326) {
					Static320.anInt5326 = local14;
				}
			}
			if (Static320.anInt5326 > local14) {
				Static320.anInt5326 -= (Static320.anInt5326 - local14) * Static355.anInt6783 / 1000 + Static271.anInt5526;
				if (Static320.anInt5326 < local14) {
					Static320.anInt5326 = local14;
				}
			}
			if (Static95.anInt2319 < local28) {
				Static95.anInt2319 += Static271.anInt5526 + (local28 - Static95.anInt2319) * Static355.anInt6783 / 1000;
				if (local28 < Static95.anInt2319) {
					Static95.anInt2319 = local28;
				}
			}
			if (local20 > Static64.anInt1797) {
				Static64.anInt1797 += Static271.anInt5526 + Static355.anInt6783 * (local20 - Static64.anInt1797) / 1000;
				if (local20 < Static64.anInt1797) {
					Static64.anInt1797 = local20;
				}
			}
			if (local28 < Static95.anInt2319) {
				Static95.anInt2319 -= Static271.anInt5526 + (Static95.anInt2319 - local28) * Static355.anInt6783 / 1000;
				if (local28 > Static95.anInt2319) {
					Static95.anInt2319 = local28;
				}
			}
			if (local20 < Static64.anInt1797) {
				Static64.anInt1797 -= Static355.anInt6783 * (Static64.anInt1797 - local20) / 1000 + Static271.anInt5526;
				if (Static64.anInt1797 < local20) {
					Static64.anInt1797 = local20;
				}
			}
		}
		local20 = Static219.anInt4615 * 128 + 64;
		local14 = Static107.anInt2549 * 128 + 64;
		local28 = Static94.method2022(local20, local14, Static242.anInt6745) - Static121.anInt2760;
		@Pc(237) int local237 = local14 - Static320.anInt5326;
		@Pc(242) int local242 = local28 - Static95.anInt2319;
		@Pc(247) int local247 = local20 - Static64.anInt1797;
		@Pc(258) int local258 = (int) Math.sqrt((double) (local237 * local237 + local247 * local247));
		@Pc(269) int local269 = (int) (Math.atan2((double) local242, (double) local258) * 2607.5945876176133D) & 0x3FFF;
		@Pc(280) int local280 = (int) (Math.atan2((double) local237, (double) local247) * -2607.5945876176133D) & 0x3FFF;
		if (local269 < 1024) {
			local269 = 1024;
		}
		if (local269 > 3072) {
			local269 = 3072;
		}
		if (Static179.anInt3884 < local269) {
			Static179.anInt3884 += Static330.anInt6322 * (local269 - Static179.anInt3884 >> 3) / 1000 + Static44.anInt1404 << 3;
			if (local269 < Static179.anInt3884) {
				Static179.anInt3884 = local269;
			}
		}
		if (Static179.anInt3884 > local269) {
			Static179.anInt3884 -= Static44.anInt1404 + Static330.anInt6322 * (Static179.anInt3884 - local269 >> 3) / 1000 << 3;
			if (Static179.anInt3884 < local269) {
				Static179.anInt3884 = local269;
			}
		}
		@Pc(359) int local359 = local280 - Static18.anInt555;
		if (local359 > 8192) {
			local359 -= 16384;
		}
		if (local359 < -8192) {
			local359 += 16384;
		}
		local359 >>= 0x3;
		if (local359 > 0) {
			Static18.anInt555 += local359 * Static330.anInt6322 / 1000 + Static44.anInt1404 << 3;
			Static18.anInt555 &= 0x3FFF;
		}
		if (local359 < 0) {
			Static18.anInt555 -= Static330.anInt6322 * -local359 / 1000 + Static44.anInt1404 << 3;
			Static18.anInt555 &= 0x3FFF;
		}
		@Pc(417) int local417 = local280 - Static18.anInt555;
		if (local417 > 8192) {
			local417 -= 16384;
		}
		if (local417 < -8192) {
			local417 += 16384;
		}
		if (local417 < 0 && local359 > 0 || local417 > 0 && local359 < 0) {
			Static18.anInt555 = local280;
		}
		Static121.anInt2762 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!wo;Lclient!wo;Z)V")
	public static void method4104(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1) {
		Static348.aClass216_97 = arg0;
		Static195.aClass216_66 = arg1;
		Static195.aClass216_66.method5675(36);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!nd;ZILclient!uo;)V")
	public static void method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class141 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class32 arg4) {
		@Pc(8) Class151 local8 = Static195.method3774(arg2.anInt4287);
		if (local8.anInt4613 == -1) {
			return;
		}
		if (arg2.aBoolean408) {
			@Pc(26) int local26 = arg3 + arg2.anInt4267;
			arg3 = local26 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(42) Class5 local42 = local8.method4146(arg3, arg2.aBoolean404, arg4);
		if (local42 == null) {
			return;
		}
		@Pc(48) int local48 = arg2.anInt4297;
		@Pc(51) int local51 = arg2.anInt4256;
		if ((arg3 & 0x1) == 1) {
			local48 = arg2.anInt4256;
			local51 = arg2.anInt4297;
		}
		@Pc(67) int local67 = local42.method3632();
		@Pc(70) int local70 = local42.method3630();
		if (local8.aBoolean434) {
			local70 = local51 * 4;
			local67 = local48 * 4;
		}
		if (local8.anInt4611 == 0) {
			local42.method3633(arg0, arg1 + 4 - local51 * 4, local67, local70);
		} else {
			local42.method3634(arg0, arg1 + 4 - local51 * 4, local67, local70, 1, local8.anInt4611 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public static void method4108(@OriginalArg(0) int arg0) {
		if (arg0 == 37) {
			Static79.aFloat50 = 3.0F;
		} else if (arg0 == 50) {
			Static79.aFloat50 = 4.0F;
		} else if (arg0 == 75) {
			Static79.aFloat50 = 6.0F;
		} else if (arg0 == 100) {
			Static79.aFloat50 = 8.0F;
		} else if (arg0 == 200) {
			Static79.aFloat50 = 16.0F;
		}
		Static68.anInt1821 = -1;
		Static68.anInt1821 = -1;
	}
}
