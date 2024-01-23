import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "[Lclient!kg;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!nk;")
	public static Class121 aClass121_70;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public static int anInt2882 = 7759444;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public static int anInt2885 = 0;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString162 = "green:";

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZII[Lclient!ne;[B)V")
	public static void method2480(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class118[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg4);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method1354();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(41) int local41 = local18.method1362();
				if (local41 == 0) {
					break;
				}
				local37 += local41 - 1;
				@Pc(53) int local53 = local37 & 0x3F;
				@Pc(59) int local59 = local37 >> 6 & 0x3F;
				@Pc(63) int local63 = local37 >> 12;
				@Pc(67) int local67 = local18.method1378();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				@Pc(79) int local79 = arg0 + local53;
				@Pc(83) int local83 = arg2 + local59;
				if (local83 > 0 && local79 > 0 && local83 < 103 && local79 < 103) {
					@Pc(101) Class118 local101 = null;
					if (!arg1) {
						@Pc(105) int local105 = local63;
						if ((Static104.aByteArrayArrayArray3[1][local83][local79] & 0x2) == 2) {
							local105 = local63 - 1;
						}
						if (local105 >= 0) {
							local101 = arg3[local105];
						}
					}
					Static137.method2376(local63, arg1, local71, local63, local101, local20, local79, !arg1, local75, local83);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
	public static void method2482() {
		Static287.anInt5142 = -1;
		Static46.anInt943 = 0;
		Static232.aBoolean292 = false;
		Static219.anInt4059 = 0;
		Static197.anInt3809 = 1;
		Static308.anInt5497 = 0;
		Static201.anInt3864 = -3;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public static void method2483() {
		@Pc(9) int local9 = Static90.anInt1746 * 128 + 64;
		@Pc(15) int local15 = Static307.anInt5433 * 128 + 64;
		@Pc(24) int local24 = Static69.method4275(local15, Static65.anInt1300, local9) - Static288.anInt5161;
		if (Static84.anInt1665 < 100) {
			if (local15 > Static233.anInt4252) {
				Static233.anInt4252 += Static73.anInt1539 + (local15 - Static233.anInt4252) * Static84.anInt1665 / 1000;
				if (Static233.anInt4252 > local15) {
					Static233.anInt4252 = local15;
				}
			}
			if (Static306.anInt5420 < local24) {
				Static306.anInt5420 += (local24 - Static306.anInt5420) * Static84.anInt1665 / 1000 + Static73.anInt1539;
				if (local24 < Static306.anInt5420) {
					Static306.anInt5420 = local24;
				}
			}
			if (Static306.anInt5420 > local24) {
				Static306.anInt5420 -= Static73.anInt1539 + Static84.anInt1665 * (Static306.anInt5420 - local24) / 1000;
				if (Static306.anInt5420 < local24) {
					Static306.anInt5420 = local24;
				}
			}
			if (local15 < Static233.anInt4252) {
				Static233.anInt4252 -= (Static233.anInt4252 - local15) * Static84.anInt1665 / 1000 + Static73.anInt1539;
				if (local15 > Static233.anInt4252) {
					Static233.anInt4252 = local15;
				}
			}
			if (Static94.anInt3434 < local9) {
				Static94.anInt3434 += Static73.anInt1539 + (local9 - Static94.anInt3434) * Static84.anInt1665 / 1000;
				if (Static94.anInt3434 > local9) {
					Static94.anInt3434 = local9;
				}
			}
			if (local9 < Static94.anInt3434) {
				Static94.anInt3434 -= Static73.anInt1539 + (Static94.anInt3434 - local9) * Static84.anInt1665 / 1000;
				if (local9 > Static94.anInt3434) {
					Static94.anInt3434 = local9;
				}
			}
		} else {
			Static94.anInt3434 = Static90.anInt1746 * 128 + 64;
			Static233.anInt4252 = Static307.anInt5433 * 128 + 64;
			Static306.anInt5420 = Static69.method4275(Static233.anInt4252, Static65.anInt1300, Static94.anInt3434) - Static288.anInt5161;
		}
		local9 = Static139.anInt2808 * 128 + 64;
		local15 = Static268.anInt4883 * 128 + 64;
		local24 = Static69.method4275(local15, Static65.anInt1300, local9) - Static112.anInt2332;
		@Pc(228) int local228 = local9 - Static94.anInt3434;
		@Pc(233) int local233 = local15 - Static233.anInt4252;
		@Pc(238) int local238 = local24 - Static306.anInt5420;
		@Pc(249) int local249 = (int) Math.sqrt((double) (local228 * local228 + local233 * local233));
		@Pc(260) int local260 = (int) (Math.atan2((double) local238, (double) local249) * 325.949D) & 0x7FF;
		if (local260 < 128) {
			local260 = 128;
		}
		if (local260 > 383) {
			local260 = 383;
		}
		@Pc(287) int local287 = (int) (-325.949D * Math.atan2((double) local228, (double) local233)) & 0x7FF;
		@Pc(292) int local292 = local287 - Static93.anInt1895;
		if (local260 > Static277.anInt4987) {
			Static277.anInt4987 += Static71.anInt1521 + (local260 - Static277.anInt4987) * Static155.anInt3076 / 1000;
			if (Static277.anInt4987 > local260) {
				Static277.anInt4987 = local260;
			}
		}
		if (Static277.anInt4987 > local260) {
			Static277.anInt4987 -= Static155.anInt3076 * (Static277.anInt4987 - local260) / 1000 + Static71.anInt1521;
			if (Static277.anInt4987 < local260) {
				Static277.anInt4987 = local260;
			}
		}
		if (local292 > 1024) {
			local292 -= 2048;
		}
		if (local292 < -1024) {
			local292 += 2048;
		}
		if (local292 > 0) {
			Static93.anInt1895 += Static71.anInt1521 + Static155.anInt3076 * local292 / 1000;
			Static93.anInt1895 &= 0x7FF;
		}
		if (local292 < 0) {
			Static93.anInt1895 -= Static71.anInt1521 + Static155.anInt3076 * -local292 / 1000;
			Static93.anInt1895 &= 0x7FF;
		}
		@Pc(397) int local397 = local287 - Static93.anInt1895;
		if (local397 > 1024) {
			local397 -= 2048;
		}
		if (local397 < -1024) {
			local397 += 2048;
		}
		if (local397 < 0 && local292 > 0 || local397 > 0 && local292 < 0) {
			Static93.anInt1895 = local287;
		}
	}
}
