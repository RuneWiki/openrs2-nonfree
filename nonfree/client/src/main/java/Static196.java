import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!pc;")
	public static Class77 aClass77_98;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1122 = Static181.method2795("Loading interfaces )2 ");

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1123 = aClass83_1122;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "[I")
	public static final int[] anIntArray376 = new int[1000];

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
	public static volatile int anInt3888 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZIIII)V")
	public static void method2941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static209.anInt4155 && arg2 <= Static36.anInt940 && arg3 >= Static147.anInt4074 && Static61.anInt1501 >= arg4) {
			Static162.method2973(arg3, arg0, arg4, arg2, arg1);
		} else {
			Static132.method2201(arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public static void method2942(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static49.aDouble10 = 3.0D;
		} else if (arg0 == 50) {
			Static49.aDouble10 = 4.0D;
		} else if (arg0 == 75) {
			Static49.aDouble10 = 6.0D;
		} else {
			Static49.aDouble10 = 8.0D;
		}
		Static121.anInt2748 = -1;
		Static121.anInt2748 = -1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	public static void method2943() {
		if (Static85.aClass27_1 != null) {
			@Pc(11) Class27 local11 = Static85.aClass27_1;
			synchronized (Static85.aClass27_1) {
				Static85.aClass27_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V")
	public static void method2944() {
		@Pc(9) int local9 = Static19.anInt544 * 128 + 64;
		@Pc(15) int local15 = Static109.anInt2540 * 128 + 64;
		@Pc(24) int local24 = Static177.method2711(local9, Static43.anInt1126, local15) - Static75.anInt1758;
		if (Static199.anInt3952 < local24) {
			Static199.anInt3952 += Static51.anInt1522 * (local24 - Static199.anInt3952) / 1000 + Static55.anInt1366;
			if (local24 < Static199.anInt3952) {
				Static199.anInt3952 = local24;
			}
		}
		if (local9 > Static21.anInt567) {
			Static21.anInt567 += (local9 - Static21.anInt567) * Static51.anInt1522 / 1000 + Static55.anInt1366;
			if (Static21.anInt567 > local9) {
				Static21.anInt567 = local9;
			}
		}
		if (local15 > Static174.anInt3596) {
			Static174.anInt3596 += Static51.anInt1522 * (local15 - Static174.anInt3596) / 1000 + Static55.anInt1366;
			if (local15 < Static174.anInt3596) {
				Static174.anInt3596 = local15;
			}
		}
		if (local15 < Static174.anInt3596) {
			Static174.anInt3596 -= Static55.anInt1366 + Static51.anInt1522 * (Static174.anInt3596 - local15) / 1000;
			if (local15 > Static174.anInt3596) {
				Static174.anInt3596 = local15;
			}
		}
		if (Static199.anInt3952 > local24) {
			Static199.anInt3952 -= Static55.anInt1366 + (Static199.anInt3952 - local24) * Static51.anInt1522 / 1000;
			if (local24 > Static199.anInt3952) {
				Static199.anInt3952 = local24;
			}
		}
		local15 = Static156.anInt4248 * 128 + 64;
		if (local9 < Static21.anInt567) {
			Static21.anInt567 -= Static55.anInt1366 + Static51.anInt1522 * (Static21.anInt567 - local9) / 1000;
			if (Static21.anInt567 < local9) {
				Static21.anInt567 = local9;
			}
		}
		local9 = Static22.anInt581 * 128 + 64;
		local24 = Static177.method2711(local9, Static43.anInt1126, local15) - Static129.anInt2828;
		@Pc(202) int local202 = local9 - Static21.anInt567;
		@Pc(207) int local207 = local15 - Static174.anInt3596;
		@Pc(212) int local212 = local24 - Static199.anInt3952;
		@Pc(223) int local223 = (int) Math.sqrt((double) (local202 * local202 + local207 * local207));
		@Pc(234) int local234 = (int) (Math.atan2((double) local212, (double) local223) * 325.949D) & 0x7FF;
		if (local234 < 128) {
			local234 = 128;
		}
		@Pc(252) int local252 = (int) (-325.949D * Math.atan2((double) local202, (double) local207)) & 0x7FF;
		if (local234 > 383) {
			local234 = 383;
		}
		if (Static18.anInt2017 < local234) {
			Static18.anInt2017 += Static170.anInt3527 + Static128.anInt2813 * (local234 - Static18.anInt2017) / 1000;
			if (local234 < Static18.anInt2017) {
				Static18.anInt2017 = local234;
			}
		}
		if (Static18.anInt2017 > local234) {
			Static18.anInt2017 -= Static128.anInt2813 * (Static18.anInt2017 - local234) / 1000 + Static170.anInt3527;
			if (local234 > Static18.anInt2017) {
				Static18.anInt2017 = local234;
			}
		}
		@Pc(311) int local311 = local252 - Static54.anInt1360;
		if (local311 > 1024) {
			local311 -= 2048;
		}
		if (local311 < -1024) {
			local311 += 2048;
		}
		if (local311 > 0) {
			Static54.anInt1360 += Static128.anInt2813 * local311 / 1000 + Static170.anInt3527;
			Static54.anInt1360 &= 0x7FF;
		}
		if (local311 < 0) {
			Static54.anInt1360 -= -local311 * Static128.anInt2813 / 1000 + Static170.anInt3527;
			Static54.anInt1360 &= 0x7FF;
		}
		@Pc(359) int local359 = local252 - Static54.anInt1360;
		if (local359 > 1024) {
			local359 -= 2048;
		}
		if (local359 < -1024) {
			local359 += 2048;
		}
		if (local359 < 0 && local311 > 0 || local359 > 0 && local311 < 0) {
			Static54.anInt1360 = local252;
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
	public static void method2945() {
		if (Static1.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static35.anIntArray72[219] = 42;
			Static35.anIntArray72[188] = 71;
			Static35.anIntArray72[222] = 59;
			Static35.anIntArray72[220] = 74;
			Static35.anIntArray72[190] = 72;
			Static35.anIntArray72[189] = 26;
			Static35.anIntArray72[192] = 58;
			Static35.anIntArray72[187] = 27;
			Static35.anIntArray72[186] = 57;
			Static35.anIntArray72[191] = 73;
			Static35.anIntArray72[223] = 28;
			Static35.anIntArray72[221] = 43;
			return;
		}
		if (Static1.aMethod2 == null) {
			Static35.anIntArray72[192] = 58;
			Static35.anIntArray72[222] = 59;
		} else {
			Static35.anIntArray72[192] = 28;
			Static35.anIntArray72[222] = 58;
			Static35.anIntArray72[520] = 59;
		}
		Static35.anIntArray72[91] = 42;
		Static35.anIntArray72[46] = 72;
		Static35.anIntArray72[59] = 57;
		Static35.anIntArray72[92] = 74;
		Static35.anIntArray72[45] = 26;
		Static35.anIntArray72[44] = 71;
		Static35.anIntArray72[93] = 43;
		Static35.anIntArray72[47] = 73;
		Static35.anIntArray72[61] = 27;
	}
}
