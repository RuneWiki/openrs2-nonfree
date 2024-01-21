import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_34;

	@OriginalMember(owner = "client!g", name = "yb", descriptor = "I")
	public static int anInt970;

	@OriginalMember(owner = "client!g", name = "Nb", descriptor = "[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
	public static int anInt966 = 0;

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_452 = Static56.method972("Login limit exceeded)3");

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_451 = aClass5_452;

	@OriginalMember(owner = "client!g", name = "sb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_453 = Static56.method972("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!g", name = "vb", descriptor = "[Lclient!ae;")
	public static Class5[] aClass5Array8 = new Class5[200];

	@OriginalMember(owner = "client!g", name = "Bb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_455 = Static56.method972("Take");

	@OriginalMember(owner = "client!g", name = "xb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_454 = aClass5_455;

	@OriginalMember(owner = "client!g", name = "zb", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!g", name = "Db", descriptor = "Lclient!ae;")
	public static Class5 aClass5_456 = aClass5_453;

	@OriginalMember(owner = "client!g", name = "Eb", descriptor = "I")
	public static int anInt974 = -1;

	@OriginalMember(owner = "client!g", name = "Pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_457 = Static56.method972("@gr3@");

	@OriginalMember(owner = "client!g", name = "Sb", descriptor = "I")
	public static volatile int anInt983 = -1;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(Z)Lclient!jd;")
	public static Class38 method669() {
		try {
			return (Class38) Class.forName("Class38_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
	public static void method670() {
		aClass5_453 = null;
		aClass5Array8 = null;
		aClass5_456 = null;
		aClass5_454 = null;
		aClass3_Sub1_Sub2_Sub3Array4 = null;
		aClass5_457 = null;
		aClass5_451 = null;
		aClass5_455 = null;
		aClass11_Sub1_34 = null;
		aClass5_452 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!q;II)V")
	public static void method671(@OriginalArg(1) Class3_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 * arg2 + arg1 * arg1;
		if (local11 <= 4225 || local11 >= 90000) {
			Static57.method1003(arg2, arg0, arg1);
			return;
		}
		@Pc(30) int local30 = Static78.anInt1951 + Static51.anInt2380 & 0x7FF;
		@Pc(34) int local34 = Static107.anIntArray343[local30];
		@Pc(42) int local42 = local34 * 256 / (Static69.anInt1824 + 256);
		@Pc(46) int local46 = Static107.anIntArray357[local30];
		@Pc(54) int local54 = local46 * 256 / (Static69.anInt1824 + 256);
		@Pc(65) int local65 = arg2 * local54 - arg1 * local42 >> 16;
		@Pc(76) int local76 = arg2 * local42 + local54 * arg1 >> 16;
		@Pc(82) double local82 = Math.atan2((double) local76, (double) local65);
		@Pc(88) int local88 = (int) (Math.sin(local82) * 63.0D);
		@Pc(94) int local94 = (int) (Math.cos(local82) * 57.0D);
		Static27.aClass3_Sub1_Sub2_Sub3_2.method1453(local88 + 94 + 4 - 10, -local94 + 83 + -20, local82);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)V")
	public static void method672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		@Pc(12) Class3_Sub1_Sub5 local12 = (Class3_Sub1_Sub5) Static47.aClass21_7.method459(local6);
		if (local12 != null) {
			Static48.aClass56_2.method1542(local12);
		}
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
	public static void method673() {
		@Pc(9) int local9 = Static37.anInt1017 * 128 + 64;
		@Pc(15) int local15 = Static42.anInt1187 * 128 + 64;
		@Pc(25) int local25 = Static15.method358(local9, Static12.anInt480, local15) - Static74.anInt1896;
		if (Static89.anInt2280 < local15) {
			Static89.anInt2280 += (local15 - Static89.anInt2280) * Static70.anInt1830 / 1000 + Static50.anInt1365;
			if (Static89.anInt2280 > local15) {
				Static89.anInt2280 = local15;
			}
		}
		if (local25 > Static85.anInt2111) {
			Static85.anInt2111 += Static50.anInt1365 + (local25 - Static85.anInt2111) * Static70.anInt1830 / 1000;
			if (Static85.anInt2111 > local25) {
				Static85.anInt2111 = local25;
			}
		}
		if (Static89.anInt2280 > local15) {
			Static89.anInt2280 -= Static70.anInt1830 * (Static89.anInt2280 - local15) / 1000 + Static50.anInt1365;
			if (local15 > Static89.anInt2280) {
				Static89.anInt2280 = local15;
			}
		}
		if (Static85.anInt2111 > local25) {
			Static85.anInt2111 -= Static70.anInt1830 * (Static85.anInt2111 - local25) / 1000 + Static50.anInt1365;
			if (local25 > Static85.anInt2111) {
				Static85.anInt2111 = local25;
			}
		}
		if (Static60.anInt2989 < local9) {
			Static60.anInt2989 += Static50.anInt1365 + Static70.anInt1830 * (local9 - Static60.anInt2989) / 1000;
			if (Static60.anInt2989 > local9) {
				Static60.anInt2989 = local9;
			}
		}
		if (local9 < Static60.anInt2989) {
			Static60.anInt2989 -= Static50.anInt1365 + Static70.anInt1830 * (Static60.anInt2989 - local9) / 1000;
			if (Static60.anInt2989 < local9) {
				Static60.anInt2989 = local9;
			}
		}
		local15 = Static91.anInt2351 * 128 + 64;
		local9 = Static112.anInt2930 * 128 + 64;
		local25 = Static15.method358(local9, Static12.anInt480, local15) - Static33.anInt930;
		@Pc(197) int local197 = local9 - Static60.anInt2989;
		@Pc(202) int local202 = local15 - Static89.anInt2280;
		@Pc(206) int local206 = local25 - Static85.anInt2111;
		@Pc(217) int local217 = (int) Math.sqrt((double) (local197 * local197 + local202 * local202));
		@Pc(228) int local228 = (int) (Math.atan2((double) local206, (double) local217) * 325.949D) & 0x7FF;
		@Pc(239) int local239 = (int) (Math.atan2((double) local202, (double) local197) * -325.949D) & 0x7FF;
		if (local228 < 128) {
			local228 = 128;
		}
		@Pc(248) int local248 = local239 - Static68.anInt1577;
		if (local248 > 1024) {
			local248 -= 2048;
		}
		if (local228 > 383) {
			local228 = 383;
		}
		if (local248 < -1024) {
			local248 += 2048;
		}
		if (local228 > Static70.anInt1827) {
			Static70.anInt1827 += Static95.anInt2467 + (local228 - Static70.anInt1827) * Static48.anInt1321 / 1000;
			if (Static70.anInt1827 > local228) {
				Static70.anInt1827 = local228;
			}
		}
		if (Static70.anInt1827 > local228) {
			Static70.anInt1827 -= Static95.anInt2467 + Static48.anInt1321 * (Static70.anInt1827 - local228) / 1000;
			if (local228 > Static70.anInt1827) {
				Static70.anInt1827 = local228;
			}
		}
		if (local248 > 0) {
			Static68.anInt1577 += Static95.anInt2467 + local248 * Static48.anInt1321 / 1000;
			Static68.anInt1577 &= 0x7FF;
		}
		if (local248 < 0) {
			Static68.anInt1577 -= Static95.anInt2467 + -local248 * Static48.anInt1321 / 1000;
			Static68.anInt1577 &= 0x7FF;
		}
		@Pc(359) int local359 = local239 - Static68.anInt1577;
		if (local359 > 1024) {
			local359 -= 2048;
		}
		if (local359 < -1024) {
			local359 += 2048;
		}
		if (local359 < 0 && local248 > 0 || local359 > 0 && local248 < 0) {
			Static68.anInt1577 = local239;
		}
	}
}
