import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public static int anInt10368;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_148 = new Class289(87, 2);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!oq;)V")
	public static void method8752(@OriginalArg(0) Class2_Sub1 arg0) {
		Static576.aClass132_15.H(arg0.anInt10006, arg0.anInt10004 + (arg0.method8444() >> 1), arg0.anInt10001, Static232.anIntArray224);
		arg0.anInt10005 = Static232.anIntArray224[0];
		arg0.anInt9996 = Static232.anIntArray224[1];
		arg0.anInt10007 = Static232.anIntArray224[2];
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method8753() {
		if (Static556.anInt9319 == 3) {
			Static143.method2106(4);
		} else if (Static556.anInt9319 == 7) {
			Static143.method2106(8);
		} else if (Static556.anInt9319 == 10) {
			Static143.method2106(11);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
	public static void method8754() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static542.aBooleanArray30[local7] = false;
		}
		Static520.anInt9404 = Static90.anInt1698;
		Static267.anInt4660 = Static672.anInt10375;
		Static367.anInt6283 = -1;
		Static407.anInt6820 = 5;
		Static514.anInt8545 = Static170.anInt2855;
		Static291.anInt4913 = Static23.anInt564;
		Static254.anInt4367 = Static598.anInt9788;
		Static589.anInt9655 = Static542.anInt9140;
		Static258.anInt4491 = -1;
		Static601.anInt9806 = -1;
		Static359.anInt6157 = 0;
		Static505.anInt8478 = -1;
		Static14.anInt433 = 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method8755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static410.method6168(arg1, arg3, arg0)) {
			return false;
		}
		@Pc(23) int local23 = Static631.anIntArray680[0];
		@Pc(27) int local27 = Static631.anIntArray680[1];
		@Pc(31) int local31 = Static631.anIntArray680[2];
		if (!Static410.method6168(arg4, arg5, arg8)) {
			return false;
		}
		@Pc(43) int local43 = Static631.anIntArray680[1];
		@Pc(47) int local47 = Static631.anIntArray680[0];
		@Pc(51) int local51 = Static631.anIntArray680[2];
		if (Static410.method6168(arg2, arg6, arg7)) {
			@Pc(63) int local63 = Static631.anIntArray680[1];
			@Pc(67) int local67 = Static631.anIntArray680[2];
			@Pc(71) int local71 = Static631.anIntArray680[0];
			return Static279.method4089(local51, local23, local67, local47, local27, local31, local43, local71, local63);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method8757() {
		@Pc(9) int local9 = Static667.anInt10667 * 512 + 256;
		@Pc(15) int local15 = Static400.anInt6733 * 512 + 256;
		@Pc(24) int local24 = Static284.method4118(local9, Static253.anInt4353, local15) - Static231.anInt3950;
		if (Static40.anInt8513 < 100) {
			if (Static23.anInt564 < local9) {
				Static23.anInt564 += Static445.anInt7486 + Static40.anInt8513 * (local9 - Static23.anInt564) / 1000;
				if (Static23.anInt564 > local9) {
					Static23.anInt564 = local9;
				}
			}
			if (Static23.anInt564 > local9) {
				Static23.anInt564 -= (Static23.anInt564 - local9) * Static40.anInt8513 / 1000 + Static445.anInt7486;
				if (local9 > Static23.anInt564) {
					Static23.anInt564 = local9;
				}
			}
			if (Static170.anInt2855 < local24) {
				Static170.anInt2855 += Static445.anInt7486 + Static40.anInt8513 * (local24 - Static170.anInt2855) / 1000;
				if (local24 < Static170.anInt2855) {
					Static170.anInt2855 = local24;
				}
			}
			if (Static542.anInt9140 < local15) {
				Static542.anInt9140 += Static40.anInt8513 * (local15 - Static542.anInt9140) / 1000 + Static445.anInt7486;
				if (local15 < Static542.anInt9140) {
					Static542.anInt9140 = local15;
				}
			}
			if (local24 < Static170.anInt2855) {
				Static170.anInt2855 -= Static40.anInt8513 * (Static170.anInt2855 - local24) / 1000 + Static445.anInt7486;
				if (Static170.anInt2855 < local24) {
					Static170.anInt2855 = local24;
				}
			}
			if (Static542.anInt9140 > local15) {
				Static542.anInt9140 -= Static445.anInt7486 + (Static542.anInt9140 - local15) * Static40.anInt8513 / 1000;
				if (Static542.anInt9140 < local15) {
					Static542.anInt9140 = local15;
				}
			}
		} else {
			Static542.anInt9140 = Static400.anInt6733 * 512 + 256;
			Static23.anInt564 = Static667.anInt10667 * 512 + 256;
			Static170.anInt2855 = Static284.method4118(Static23.anInt564, Static253.anInt4353, Static542.anInt9140) - Static231.anInt3950;
		}
		local15 = Static6.anInt223 * 512 + 256;
		local9 = Static250.anInt4333 * 512 + 256;
		local24 = Static284.method4118(local9, Static253.anInt4353, local15) - Static282.anInt4836;
		@Pc(235) int local235 = local9 - Static23.anInt564;
		@Pc(239) int local239 = local24 - Static170.anInt2855;
		@Pc(244) int local244 = local15 - Static542.anInt9140;
		@Pc(260) int local260 = (int) Math.sqrt((double) (local235 * local235 + local244 * local244));
		@Pc(271) int local271 = (int) (Math.atan2((double) local239, (double) local260) * 2607.5945876176133D) & 0x3FFF;
		if (local271 < 1024) {
			local271 = 1024;
		}
		@Pc(289) int local289 = (int) (Math.atan2((double) local235, (double) local244) * -2607.5945876176133D) & 0x3FFF;
		if (local271 > 3072) {
			local271 = 3072;
		}
		if (local271 > Static598.anInt9788) {
			Static598.anInt9788 += (local271 - Static598.anInt9788 >> 3) * Static359.anInt6157 / 1000 + Static14.anInt433 << 3;
			if (Static598.anInt9788 > local271) {
				Static598.anInt9788 = local271;
			}
		}
		if (local271 < Static598.anInt9788) {
			Static598.anInt9788 -= Static14.anInt433 + Static359.anInt6157 * (Static598.anInt9788 - local271 >> 3) / 1000 << 3;
			if (local271 > Static598.anInt9788) {
				Static598.anInt9788 = local271;
			}
		}
		@Pc(364) int local364 = local289 - Static672.anInt10375;
		if (local364 > 8192) {
			local364 -= 16384;
		}
		if (local364 < -8192) {
			local364 += 16384;
		}
		local364 >>= 0x3;
		if (local364 > 0) {
			Static672.anInt10375 += local364 * Static359.anInt6157 / 1000 + Static14.anInt433 << 3;
			Static672.anInt10375 &= 0x3FFF;
		}
		if (local364 < 0) {
			Static672.anInt10375 -= Static359.anInt6157 * -local364 / 1000 + Static14.anInt433 << 3;
			Static672.anInt10375 &= 0x3FFF;
		}
		@Pc(423) int local423 = local289 - Static672.anInt10375;
		if (local423 > 8192) {
			local423 -= 16384;
		}
		if (local423 < -8192) {
			local423 += 16384;
		}
		Static536.anInt8770 = 0;
		if (local423 < 0 && local364 > 0 || local423 > 0 && local364 < 0) {
			Static672.anInt10375 = local289;
		}
	}
}
