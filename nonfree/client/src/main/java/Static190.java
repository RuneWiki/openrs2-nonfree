import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
	public static int anInt6232;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "[I")
	public static int[] anIntArray481;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_195 = new Class157(15, 8);

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	public static int anInt6227 = 0;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "[Lclient!al;")
	public static final Class10[] aClass10Array5 = new Class10[29];

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[200];

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	public static int anInt6229 = 1;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_20 = new Class143(11, 15);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)Lclient!on;")
	public static Class120_Sub1 method5232(@OriginalArg(1) int arg0) {
		return Static122.aBoolean255 && Static129.anInt2764 <= arg0 && arg0 <= Static317.anInt6258 ? Static279.aClass120_Sub1Array5[arg0 - Static129.anInt2764] : null;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	public static void method5238() {
		@Pc(9) int local9 = Static132.anInt2841 * 128 + 64;
		@Pc(15) int local15 = Static243.anInt5174 * 128 + 64;
		@Pc(24) int local24 = Static97.method1899(Static291.anInt5263, local15, local9) - Static20.anInt317;
		if (Static241.anInt5137 >= 100) {
			Static166.anInt3804 = Static132.anInt2841 * 128 + 64;
			Static51.anInt879 = Static243.anInt5174 * 128 + 64;
			Static23.anInt356 = Static97.method1899(Static291.anInt5263, Static51.anInt879, Static166.anInt3804) - Static20.anInt317;
		} else {
			if (Static166.anInt3804 < local9) {
				Static166.anInt3804 += Static241.anInt5137 * (local9 - Static166.anInt3804) / 1000 + Static354.anInt6770;
				if (Static166.anInt3804 > local9) {
					Static166.anInt3804 = local9;
				}
			}
			if (Static166.anInt3804 > local9) {
				Static166.anInt3804 -= Static354.anInt6770 + (Static166.anInt3804 - local9) * Static241.anInt5137 / 1000;
				if (Static166.anInt3804 < local9) {
					Static166.anInt3804 = local9;
				}
			}
			if (Static23.anInt356 < local24) {
				Static23.anInt356 += Static354.anInt6770 + (local24 - Static23.anInt356) * Static241.anInt5137 / 1000;
				if (Static23.anInt356 > local24) {
					Static23.anInt356 = local24;
				}
			}
			if (Static51.anInt879 < local15) {
				Static51.anInt879 += Static241.anInt5137 * (local15 - Static51.anInt879) / 1000 + Static354.anInt6770;
				if (local15 < Static51.anInt879) {
					Static51.anInt879 = local15;
				}
			}
			if (Static23.anInt356 > local24) {
				Static23.anInt356 -= Static354.anInt6770 + (Static23.anInt356 - local24) * Static241.anInt5137 / 1000;
				if (Static23.anInt356 < local24) {
					Static23.anInt356 = local24;
				}
			}
			if (local15 < Static51.anInt879) {
				Static51.anInt879 -= Static354.anInt6770 + Static241.anInt5137 * (Static51.anInt879 - local15) / 1000;
				if (Static51.anInt879 < local15) {
					Static51.anInt879 = local15;
				}
			}
		}
		local9 = Static236.anInt929 * 128 + 64;
		local15 = Static87.anInt1642 * 128 + 64;
		local24 = Static97.method1899(Static291.anInt5263, local15, local9) - Static234.anInt5027;
		@Pc(231) int local231 = local9 - Static166.anInt3804;
		@Pc(236) int local236 = local24 - Static23.anInt356;
		@Pc(241) int local241 = local15 - Static51.anInt879;
		@Pc(253) int local253 = (int) Math.sqrt((double) (local231 * local231 + local241 * local241));
		@Pc(264) int local264 = (int) (Math.atan2((double) local236, (double) local253) * 2607.5945876176133D) & 0x3FFF;
		@Pc(282) int local282 = (int) (-2607.5945876176133D * Math.atan2((double) local231, (double) local241)) & 0x3FFF;
		if (local264 < 1024) {
			local264 = 1024;
		}
		if (local264 > 3072) {
			local264 = 3072;
		}
		if (local264 > Static168.anInt3820) {
			Static168.anInt3820 += Static309.anInt6122 + (local264 - Static168.anInt3820 >> 3) * Static133.anInt2845 / 1000 << 3;
			if (local264 < Static168.anInt3820) {
				Static168.anInt3820 = local264;
			}
		}
		if (local264 < Static168.anInt3820) {
			Static168.anInt3820 -= Static309.anInt6122 + (Static168.anInt3820 - local264 >> 3) * Static133.anInt2845 / 1000 << 3;
			if (Static168.anInt3820 < local264) {
				Static168.anInt3820 = local264;
			}
		}
		@Pc(360) int local360 = local282 - Static195.anInt4286;
		if (local360 > 8192) {
			local360 -= 16384;
		}
		if (local360 < -8192) {
			local360 += 16384;
		}
		local360 >>= 0x3;
		if (local360 > 0) {
			Static195.anInt4286 += local360 * Static133.anInt2845 / 1000 + Static309.anInt6122 << 3;
			Static195.anInt4286 &= 0x3FFF;
		}
		if (local360 < 0) {
			Static195.anInt4286 -= Static309.anInt6122 + Static133.anInt2845 * -local360 / 1000 << 3;
			Static195.anInt4286 &= 0x3FFF;
		}
		@Pc(422) int local422 = local282 - Static195.anInt4286;
		if (local422 > 8192) {
			local422 -= 16384;
		}
		if (local422 < -8192) {
			local422 += 16384;
		}
		if (local422 < 0 && local360 > 0 || local422 > 0 && local360 < 0) {
			Static195.anInt4286 = local282;
		}
		Static234.anInt5031 = 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V")
	public static void method5239(@OriginalArg(1) byte arg0) {
		if (Static332.aByteArrayArrayArray12 == null) {
			Static332.aByteArrayArrayArray12 = new byte[4][Static66.anInt1177][Static12.anInt213];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static66.anInt1177; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static12.anInt213; local27++) {
					Static332.aByteArrayArrayArray12[local19][local23][local27] = arg0;
				}
			}
		}
	}
}
