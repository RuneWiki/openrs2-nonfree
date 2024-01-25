import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_96 = new Class92(77, 3);

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Z")
	public static final boolean aBoolean247 = false;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!eo;)V")
	public static void method2516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class68 arg2) {
		if (Static59.aBoolean111) {
			@Pc(19) Class235 local19 = Static418.anInt7212 == -1 ? null : Static294.aClass69_2.method1740(Static418.anInt7212);
			if (Static56.method1160(arg2).method3490() && (Static421.anInt4507 & 0x20) != 0 && (local19 == null || arg2.method1735(local19.anInt7023, Static418.anInt7212) != local19.anInt7023)) {
				Static112.method4934(arg2.anInt2177, 46, 0L, arg2.anInt2192, arg2.anInt2187, false, Static128.aString25 + " -> " + arg2.aString21, true, Static276.aString52, Static108.anInt3456);
			}
			return;
		}
		@Pc(81) String local81;
		for (@Pc(75) int local75 = 9; local75 >= 5; local75--) {
			local81 = Static412.method5538(local75, arg2);
			if (local81 != null) {
				Static112.method4934(arg2.anInt2177, 1008, (long) (local75 + 1), arg2.anInt2192, arg2.anInt2187, false, arg2.aString21, true, local81, Static62.method1211(local75, arg2));
			}
		}
		local81 = Static267.method4013(arg2);
		if (local81 != null) {
			Static112.method4934(arg2.anInt2177, 45, 0L, arg2.anInt2192, arg2.anInt2187, false, arg2.aString21, true, local81, arg2.anInt2171);
		}
		for (@Pc(142) int local142 = 4; local142 >= 0; local142--) {
			@Pc(148) String local148 = Static412.method5538(local142, arg2);
			if (local148 != null) {
				Static112.method4934(arg2.anInt2177, 18, (long) (local142 + 1), arg2.anInt2192, arg2.anInt2187, false, arg2.aString21, true, local148, Static62.method1211(local142, arg2));
			}
		}
		if (!Static56.method1160(arg2).method3488()) {
			return;
		}
		if (arg2.aString19 == null) {
			Static112.method4934(arg2.anInt2177, 3, 0L, arg2.anInt2192, arg2.anInt2187, false, "", true, Static378.aClass175_216.method4201(Static216.anInt4257), -1);
		} else {
			Static112.method4934(arg2.anInt2177, 3, 0L, arg2.anInt2192, arg2.anInt2187, false, "", true, arg2.aString19, -1);
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public static void method2518() {
		@Pc(9) int local9 = Static243.anInt4634 * 128 + 64;
		@Pc(15) int local15 = Static267.anInt5000 * 128 + 64;
		@Pc(24) int local24 = Static124.method2209(Static124.anInt2688, local9, local15) - Static54.anInt1294;
		if (Static223.anInt6306 < 100) {
			if (local9 > Static398.anInt6901) {
				Static398.anInt6901 += (local9 - Static398.anInt6901) * Static223.anInt6306 / 1000 + Static231.anInt4454;
				if (local9 < Static398.anInt6901) {
					Static398.anInt6901 = local9;
				}
			}
			if (Static398.anInt6901 > local9) {
				Static398.anInt6901 -= (Static398.anInt6901 - local9) * Static223.anInt6306 / 1000 + Static231.anInt4454;
				if (local9 > Static398.anInt6901) {
					Static398.anInt6901 = local9;
				}
			}
			if (local24 > Static422.anInt7281) {
				Static422.anInt7281 += Static223.anInt6306 * (local24 - Static422.anInt7281) / 1000 + Static231.anInt4454;
				if (local24 < Static422.anInt7281) {
					Static422.anInt7281 = local24;
				}
			}
			if (Static422.anInt7281 > local24) {
				Static422.anInt7281 -= Static231.anInt4454 + Static223.anInt6306 * (Static422.anInt7281 - local24) / 1000;
				if (local24 > Static422.anInt7281) {
					Static422.anInt7281 = local24;
				}
			}
			if (local15 > Static80.anInt1722) {
				Static80.anInt1722 += (local15 - Static80.anInt1722) * Static223.anInt6306 / 1000 + Static231.anInt4454;
				if (local15 < Static80.anInt1722) {
					Static80.anInt1722 = local15;
				}
			}
			if (Static80.anInt1722 > local15) {
				Static80.anInt1722 -= Static223.anInt6306 * (Static80.anInt1722 - local15) / 1000 + Static231.anInt4454;
				if (Static80.anInt1722 < local15) {
					Static80.anInt1722 = local15;
				}
			}
		} else {
			Static80.anInt1722 = Static267.anInt5000 * 128 + 64;
			Static398.anInt6901 = Static243.anInt4634 * 128 + 64;
			Static422.anInt7281 = Static124.method2209(Static124.anInt2688, Static398.anInt6901, Static80.anInt1722) - Static54.anInt1294;
		}
		local9 = Static400.anInt6966 * 128 + 64;
		local15 = Static283.anInt5199 * 128 + 64;
		local24 = Static124.method2209(Static124.anInt2688, local9, local15) - Static319.anInt5771;
		@Pc(222) int local222 = local9 - Static398.anInt6901;
		@Pc(226) int local226 = local24 - Static422.anInt7281;
		@Pc(230) int local230 = local15 - Static80.anInt1722;
		@Pc(241) int local241 = (int) Math.sqrt((double) (local222 * local222 + local230 * local230));
		@Pc(252) int local252 = (int) (Math.atan2((double) local226, (double) local241) * 2607.5945876176133D) & 0x3FFF;
		@Pc(263) int local263 = (int) (-2607.5945876176133D * Math.atan2((double) local222, (double) local230)) & 0x3FFF;
		if (local252 < 1024) {
			local252 = 1024;
		}
		if (local252 > 3072) {
			local252 = 3072;
		}
		if (Static141.anInt3177 < local252) {
			Static141.anInt3177 += (local252 - Static141.anInt3177 >> 3) * Static400.anInt6964 / 1000 + Static419.anInt7236 << 3;
			if (local252 < Static141.anInt3177) {
				Static141.anInt3177 = local252;
			}
		}
		if (Static141.anInt3177 > local252) {
			Static141.anInt3177 -= Static400.anInt6964 * (Static141.anInt3177 - local252 >> 3) / 1000 + Static419.anInt7236 << 3;
			if (local252 > Static141.anInt3177) {
				Static141.anInt3177 = local252;
			}
		}
		@Pc(332) int local332 = local263 - Static430.anInt7326;
		if (local332 > 8192) {
			local332 -= 16384;
		}
		if (local332 < -8192) {
			local332 += 16384;
		}
		local332 >>= 0x3;
		if (local332 > 0) {
			Static430.anInt7326 += Static419.anInt7236 + Static400.anInt6964 * local332 / 1000 << 3;
			Static430.anInt7326 &= 0x3FFF;
		}
		if (local332 < 0) {
			Static430.anInt7326 -= Static400.anInt6964 * -local332 / 1000 + Static419.anInt7236 << 3;
			Static430.anInt7326 &= 0x3FFF;
		}
		@Pc(385) int local385 = local263 - Static430.anInt7326;
		if (local385 > 8192) {
			local385 -= 16384;
		}
		if (local385 < -8192) {
			local385 += 16384;
		}
		Static285.anInt5234 = 0;
		if (local385 < 0 && local332 > 0 || local385 > 0 && local332 < 0) {
			Static430.anInt7326 = local263;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)Z")
	public static boolean method2519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static147.method2665(arg1, arg0) || Static247.method3788(arg0, arg1);
	}
}
