import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt2744;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!gj;")
	public static Class31 aClass31_65;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public static int anInt2746 = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public static void method2656() {
		Static30.aClass26_1 = new Class26(8);
		Static49.anInt1102 = 0;
		for (@Pc(17) Class55_Sub7 local17 = (Class55_Sub7) Static28.aClass67_3.method2098(); local17 != null; local17 = (Class55_Sub7) Static28.aClass67_3.method2104()) {
			local17.method4024();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLclient!fj;Z)V")
	public static void method2657(@OriginalArg(1) Class62_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class180 local9 = arg0.method4775();
		if (arg0.anInt5372 == 0) {
			Static75.anInt1603 = -1;
			arg0.anInt5366 = 0;
			Static260.anInt5269 = 0;
			return;
		}
		if (arg0.anInt5322 != -1 && arg0.anInt5345 == 0) {
			@Pc(35) Class107 local35 = Static212.method3773(arg0.anInt5322);
			if (arg0.anInt5367 > 0 && local35.anInt3290 == 0) {
				Static75.anInt1603 = -1;
				Static260.anInt5269 = 0;
				arg0.anInt5366++;
				return;
			}
			if (arg0.anInt5367 <= 0 && local35.anInt3280 == 0) {
				Static260.anInt5269 = 0;
				Static75.anInt1603 = -1;
				arg0.anInt5366++;
				return;
			}
		}
		if (arg0.anInt5321 != -1 && arg0.anInt5357 <= Static212.anInt4090) {
			@Pc(89) Class215 local89 = Static44.method1076(arg0.anInt5321);
			if (local89.aBoolean621 && local89.anInt6968 != -1) {
				@Pc(102) Class107 local102 = Static212.method3773(local89.anInt6968);
				if (arg0.anInt5367 > 0 && local102.anInt3290 == 0) {
					Static75.anInt1603 = -1;
					Static260.anInt5269 = 0;
					arg0.anInt5366++;
					return;
				}
				if (arg0.anInt5367 <= 0 && local102.anInt3280 == 0) {
					Static75.anInt1603 = -1;
					arg0.anInt5366++;
					Static260.anInt5269 = 0;
					return;
				}
			}
		}
		@Pc(148) int local148 = arg0.anInt5289;
		@Pc(151) int local151 = arg0.anInt5280;
		@Pc(167) int local167 = arg0.anIntArray397[arg0.anInt5372 - 1] * 128 + arg0.method4777() * 64;
		@Pc(183) int local183 = arg0.anIntArray396[arg0.anInt5372 - 1] * 128 + arg0.method4777() * 64;
		if (!arg1 && (local167 - local148 > 256 || local167 - local148 < -256 || local183 - local151 > 256 || local183 - local151 < -256)) {
			Static75.anInt1603 = -1;
			arg0.anInt5289 = local167;
			Static260.anInt5269 = 0;
			arg0.anInt5280 = local183;
			return;
		}
		if (local167 <= local148) {
			if (local167 < local148) {
				if (local183 > local151) {
					arg0.method4776(6144);
				} else if (local151 <= local183) {
					arg0.method4776(4096);
				} else {
					arg0.method4776(2048);
				}
			} else if (local183 > local151) {
				arg0.method4776(8192);
			} else if (local151 > local183) {
				arg0.method4776(0);
			}
		} else if (local151 < local183) {
			arg0.method4776(10240);
		} else if (local151 > local183) {
			arg0.method4776(14336);
		} else {
			arg0.method4776(12288);
		}
		@Pc(304) int local304 = 4;
		@Pc(306) boolean local306 = true;
		if (arg0 instanceof Class62_Sub1_Sub2_Sub1) {
			local306 = ((Class62_Sub1_Sub2_Sub1) arg0).aClass186_1.aBoolean530;
		}
		if (local306) {
			@Pc(344) int local344 = arg0.anInt5353 - arg0.aClass110_7.anInt3429;
			if (local344 != 0 && arg0.anInt5292 == -1 && arg0.anInt5294 != 0) {
				local304 = 2;
			}
			if (!arg1 && arg0.anInt5372 > 2) {
				local304 = 6;
			}
			if (!arg1 && arg0.anInt5372 > 3) {
				local304 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5372 > 1) {
				local304 = 6;
			}
			if (!arg1 && arg0.anInt5372 > 2) {
				local304 = 8;
			}
		}
		if (arg0.anInt5366 > 0 && arg0.anInt5372 > 1) {
			local304 = 8;
			arg0.anInt5366--;
		}
		@Pc(406) byte local406 = arg0.aByteArray60[arg0.anInt5372 - 1];
		if (local406 == 2) {
			local304 <<= 0x1;
		} else if (local406 == 0) {
			local304 >>= 0x1;
		}
		Static260.anInt5269 = 0;
		if (local9.anInt5733 != -1) {
			local304 <<= 0x7;
			if (arg0.anInt5372 == 1) {
				@Pc(492) int local492 = arg0.anInt5369 * arg0.anInt5369;
				@Pc(510) int local510 = (arg0.anInt5289 <= local167 ? local167 - arg0.anInt5289 : -local167 + arg0.anInt5289) << 7;
				@Pc(532) int local532 = (arg0.anInt5280 <= local183 ? local183 - arg0.anInt5280 : arg0.anInt5280 + -local183) << 7;
				@Pc(539) int local539 = local532 >= local510 ? local532 : local510;
				@Pc(546) int local546 = local9.anInt5733 * 2 * local539;
				if (local546 < local492) {
					arg0.anInt5369 /= 2;
				} else if (local539 < local492 / 2) {
					arg0.anInt5369 -= local9.anInt5733;
					if (arg0.anInt5369 < 0) {
						arg0.anInt5369 = 0;
					}
				} else if (arg0.anInt5369 < local304) {
					arg0.anInt5369 += local9.anInt5733;
					if (arg0.anInt5369 > local304) {
						arg0.anInt5369 = local304;
					}
				}
			} else if (arg0.anInt5369 < local304) {
				arg0.anInt5369 += local9.anInt5733;
				if (local304 < arg0.anInt5369) {
					arg0.anInt5369 = local304;
				}
			} else if (arg0.anInt5369 > 0) {
				arg0.anInt5369 -= local9.anInt5733;
				if (arg0.anInt5369 < 0) {
					arg0.anInt5369 = 0;
				}
			}
			local304 = arg0.anInt5369 >> 7;
			if (local304 < 1) {
				local304 = 1;
			}
		}
		if (local167 > local148) {
			Static260.anInt5269 |= 0x4;
			arg0.anInt5289 += local304;
			if (arg0.anInt5289 > local167) {
				arg0.anInt5289 = local167;
			}
		} else if (local148 > local167) {
			arg0.anInt5289 -= local304;
			Static260.anInt5269 |= 0x8;
			if (arg0.anInt5289 < local167) {
				arg0.anInt5289 = local167;
			}
		}
		if (local151 < local183) {
			arg0.anInt5280 += local304;
			Static260.anInt5269 |= 0x1;
			if (arg0.anInt5280 > local183) {
				arg0.anInt5280 = local183;
			}
		} else if (local183 < local151) {
			arg0.anInt5280 -= local304;
			Static260.anInt5269 |= 0x2;
			if (local183 > arg0.anInt5280) {
				arg0.anInt5280 = local183;
			}
		}
		if (arg0.anInt5289 == local167 && arg0.anInt5280 == local183) {
			if (arg0.anInt5367 > 0) {
				arg0.anInt5367--;
			}
			arg0.anInt5372--;
		}
		if (local304 < 8) {
			Static75.anInt1603 = local406;
		} else {
			Static75.anInt1603 = 2;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V")
	public static void method2661(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class2 local15 = Static179.aClass199_18.method5747(); local15 != null; local15 = Static179.aClass199_18.method5753()) {
			if ((long) arg0 == (local15.aLong213 >> 48 & 0xFFFFL)) {
				local15.method5945();
			}
		}
	}
}
