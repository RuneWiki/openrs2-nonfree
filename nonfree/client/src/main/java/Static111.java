import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "I")
	public static int anInt2327;

	@OriginalMember(owner = "client!lf", name = "Eb", descriptor = "Lclient!mb;")
	public static Class65 aClass65_6;

	@OriginalMember(owner = "client!lf", name = "Lb", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_865 = Static161.method2452("Loading sprites )2 ");

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lclient!dc;")
	public static Class20 aClass20_862 = aClass20_865;

	@OriginalMember(owner = "client!lf", name = "ub", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_863 = Static161.method2452("Sorry invited players only)3");

	@OriginalMember(owner = "client!lf", name = "Cb", descriptor = "Lclient!dc;")
	public static Class20 aClass20_864 = aClass20_863;

	@OriginalMember(owner = "client!lf", name = "Sb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_866 = Static161.method2452(")3)3)3");

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
	public static void method1766() {
		Static1.aClass8_3.method233();
		Static120.aClass84_16.method2335();
		Static17.aClass8_7.method233();
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public static void method1767() {
		if (Static82.aClass37_1 != null) {
			@Pc(8) Class37 local8 = Static82.aClass37_1;
			synchronized (Static82.aClass37_1) {
				Static82.aClass37_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BJ)Lclient!dc;")
	public static Class20 method1770(@OriginalArg(1) long arg0) {
		Static153.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static153.aCalendar2.get(7);
		@Pc(22) int local22 = Static153.aCalendar2.get(5);
		@Pc(26) int local26 = Static153.aCalendar2.get(2);
		@Pc(30) int local30 = Static153.aCalendar2.get(1);
		@Pc(34) int local34 = Static153.aCalendar2.get(11);
		@Pc(38) int local38 = Static153.aCalendar2.get(12);
		@Pc(42) int local42 = Static153.aCalendar2.get(13);
		return Static70.method1166(new Class20[] { Static127.aClass20Array23[local13 - 1], Static113.aClass20_880, Static132.method2805(local22 / 10), Static132.method2805(local22 % 10), Static31.aClass20_247, Static191.aClass20Array30[local26], Static31.aClass20_247, Static132.method2805(local30), Static141.aClass20_1112, Static132.method2805(local34 / 10), Static132.method2805(local34 % 10), Static196.aClass20_1441, Static132.method2805(local38 / 10), Static132.method2805(local38 % 10), Static196.aClass20_1441, Static132.method2805(local42 / 10), Static132.method2805(local42 % 10), Static126.aClass20_319 });
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public static void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt333; local12++) {
			@Pc(18) Class43 local18 = local7.aClass43Array1[local12];
			if ((local18.aLong102 >> 29 & 0x3L) == 2L && local18.anInt1811 == arg1 && local18.anInt1816 == arg2) {
				Static191.method2851(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
	public static void method1783() {
		@Pc(9) int local9 = Static128.anInt2673 * 128 + 64;
		@Pc(15) int local15 = Static35.anInt759 * 128 + 64;
		@Pc(23) int local23 = Static128.method1999(anInt2327, local15, local9) - Static56.anInt1166;
		if (Static104.anInt2182 < local9) {
			Static104.anInt2182 += Static86.anInt1894 * (local9 - Static104.anInt2182) / 1000 + Static113.anInt2372;
			if (Static104.anInt2182 > local9) {
				Static104.anInt2182 = local9;
			}
		}
		if (Static4.anInt109 < local15) {
			Static4.anInt109 += Static86.anInt1894 * (local15 - Static4.anInt109) / 1000 + Static113.anInt2372;
			if (local15 < Static4.anInt109) {
				Static4.anInt109 = local15;
			}
		}
		if (local15 < Static4.anInt109) {
			Static4.anInt109 -= Static113.anInt2372 + Static86.anInt1894 * (Static4.anInt109 - local15) / 1000;
			if (Static4.anInt109 < local15) {
				Static4.anInt109 = local15;
			}
		}
		local15 = Static93.anInt3208 * 128 + 64;
		if (Static104.anInt2182 > local9) {
			Static104.anInt2182 -= Static113.anInt2372 + Static86.anInt1894 * (Static104.anInt2182 - local9) / 1000;
			if (Static104.anInt2182 < local9) {
				Static104.anInt2182 = local9;
			}
		}
		if (local23 > Static146.anInt3026) {
			Static146.anInt3026 += Static113.anInt2372 + Static86.anInt1894 * (local23 - Static146.anInt3026) / 1000;
			if (Static146.anInt3026 > local23) {
				Static146.anInt3026 = local23;
			}
		}
		if (local23 < Static146.anInt3026) {
			Static146.anInt3026 -= Static113.anInt2372 + Static86.anInt1894 * (Static146.anInt3026 - local23) / 1000;
			if (local23 > Static146.anInt3026) {
				Static146.anInt3026 = local23;
			}
		}
		local9 = Static133.anInt2776 * 128 + 64;
		local23 = Static128.method1999(anInt2327, local15, local9) - Static135.anInt2827;
		@Pc(188) int local188 = local15 - Static4.anInt109;
		@Pc(193) int local193 = local9 - Static104.anInt2182;
		@Pc(198) int local198 = local23 - Static146.anInt3026;
		@Pc(209) int local209 = (int) Math.sqrt((double) (local193 * local193 + local188 * local188));
		@Pc(220) int local220 = (int) (Math.atan2((double) local198, (double) local209) * 325.949D) & 0x7FF;
		@Pc(231) int local231 = (int) (Math.atan2((double) local188, (double) local193) * -325.949D) & 0x7FF;
		if (local220 < 128) {
			local220 = 128;
		}
		@Pc(241) int local241 = local231 - Static23.anInt398;
		if (local241 > 1024) {
			local241 -= 2048;
		}
		if (local220 > 383) {
			local220 = 383;
		}
		if (Static80.anInt1806 < local220) {
			Static80.anInt1806 += Static98.anInt2108 + (local220 - Static80.anInt1806) * Static170.anInt3425 / 1000;
			if (Static80.anInt1806 > local220) {
				Static80.anInt1806 = local220;
			}
		}
		if (local241 < -1024) {
			local241 += 2048;
		}
		if (local241 > 0) {
			Static23.anInt398 += Static98.anInt2108 + local241 * Static170.anInt3425 / 1000;
			Static23.anInt398 &= 0x7FF;
		}
		if (local241 < 0) {
			Static23.anInt398 -= Static98.anInt2108 + -local241 * Static170.anInt3425 / 1000;
			Static23.anInt398 &= 0x7FF;
		}
		@Pc(334) int local334 = local231 - Static23.anInt398;
		if (local220 < Static80.anInt1806) {
			Static80.anInt1806 -= Static98.anInt2108 + Static170.anInt3425 * (Static80.anInt1806 - local220) / 1000;
			if (local220 > Static80.anInt1806) {
				Static80.anInt1806 = local220;
			}
		}
		if (local334 > 1024) {
			local334 -= 2048;
		}
		if (local334 < -1024) {
			local334 += 2048;
		}
		if (local334 < 0 && local241 > 0 || local334 > 0 && local241 < 0) {
			Static23.anInt398 = local231;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!ce;)Lclient!tb;")
	public static Class54_Sub4 method1784(@OriginalArg(1) Class5_Sub6 arg0) {
		return new Class54_Sub4(arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3075(), arg0.method3072(), arg0.method3062());
	}
}
