import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
	public static int anInt1820 = 0;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "Lclient!kh;")
	private static Class60 aClass60_568 = Static200.method3116("Continue");

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_569 = Static200.method3116("Tue");

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!kh;")
	private static Class60 aClass60_570 = Static200.method3116("Sun");

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_576 = Static200.method3116("Mon");

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_579 = Static200.method3116("Wed");

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lclient!kh;")
	private static Class60 aClass60_575 = Static200.method3116("Thu");

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_573 = Static200.method3116("Fri");

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_572 = Static200.method3116("Sat");

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array12 = new Class60[] { aClass60_570, aClass60_576, aClass60_569, aClass60_579, aClass60_575, aClass60_573, aClass60_572 };

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_571 = aClass60_568;

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "[S")
	public static short[] aShortArray24 = new short[] { 47, 32, 29, 6, 13, 48, 4, 16 };

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_577 = Static200.method3116("flash2:");

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_574 = aClass60_577;

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_578 = Static200.method3116("(U0a )2 via: ");

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_580 = aClass60_577;

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
	public static int anInt1831 = -1;

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_581 = Static200.method3116("null");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Lclient!pj;")
	public static Class1_Sub1_Sub21 method1343(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub21 local10 = (Class1_Sub1_Sub21) Static116.aClass39_14.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static72.aClass7_14.method3242(Static139.method2385(arg0), Static107.method1853(arg0));
		local10 = new Class1_Sub1_Sub21();
		if (local32 != null) {
			local10.method2619(new Class1_Sub9(local32));
		}
		local10.method2621();
		Static116.aClass39_14.method1152((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!kh;Lclient!kh;Lclient!ai;)[Lclient!ch;")
	public static Class1_Sub1_Sub6[] method1344(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(10) int local10 = arg2.method3222(arg1);
		@Pc(21) int local21 = arg2.method3240(arg0, local10);
		return Static30.method549(local21, arg2, local10);
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method1345() {
		@Pc(17) int local17;
		if (Static18.anInt464 > 0) {
			for (local17 = 0; local17 < 256; local17++) {
				if (Static18.anInt464 > 768) {
					Static122.anIntArray342[local17] = Static176.method574(1024 - Static18.anInt464, Static73.anIntArray209[local17], Static162.anIntArray648[local17]);
				} else if (Static18.anInt464 > 256) {
					Static122.anIntArray342[local17] = Static162.anIntArray648[local17];
				} else {
					Static122.anIntArray342[local17] = Static176.method574(256 - Static18.anInt464, Static162.anIntArray648[local17], Static73.anIntArray209[local17]);
				}
			}
		} else if (Static208.anInt4446 > 0) {
			for (local17 = 0; local17 < 256; local17++) {
				if (Static208.anInt4446 > 768) {
					Static122.anIntArray342[local17] = Static176.method574(1024 - Static208.anInt4446, Static73.anIntArray209[local17], Static171.anIntArray486[local17]);
				} else if (Static208.anInt4446 > 256) {
					Static122.anIntArray342[local17] = Static171.anIntArray486[local17];
				} else {
					Static122.anIntArray342[local17] = Static176.method574(256 - Static208.anInt4446, Static171.anIntArray486[local17], Static73.anIntArray209[local17]);
				}
			}
		} else {
			for (local17 = 0; local17 < 256; local17++) {
				Static122.anIntArray342[local17] = Static73.anIntArray209[local17];
			}
		}
		@Pc(163) int local163 = Static7.aClass1_Sub1_Sub6_Sub1_1.anInt2839 * 9;
		local17 = 0;
		@Pc(167) int local167 = 0;
		@Pc(184) int local184;
		@Pc(194) int local194;
		@Pc(207) int local207;
		@Pc(202) int local202;
		@Pc(214) int local214;
		@Pc(218) int local218;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			local184 = (256 - local169) * Static45.anIntArray142[local169] / 256 + 22;
			if (local184 < 0) {
				local184 = 0;
			}
			local17 += local184;
			for (local194 = local184; local194 < 128; local194++) {
				local202 = Static7.aClass1_Sub1_Sub6_Sub1_1.anIntArray366[local163++];
				local207 = Static89.anIntArray243[local17++];
				if (local207 == 0) {
					Static82.aClass1_Sub1_Sub6_Sub1_3.anIntArray366[local167++] = local202;
				} else {
					local214 = local207;
					local218 = 256 - local207;
					local207 = Static122.anIntArray342[local207];
					Static82.aClass1_Sub1_Sub6_Sub1_3.anIntArray366[local167++] = (local214 * (local207 & 0xFF00) + local218 * (local202 & 0xFF00) & 0xFF0000) + (local214 * (local207 & 0xFF00FF) + (local202 & 0xFF00FF) * local218 & 0xFF00FF00) >> 8;
				}
			}
			for (local207 = 0; local207 < local184; local207++) {
				Static82.aClass1_Sub1_Sub6_Sub1_3.anIntArray366[local167++] = Static7.aClass1_Sub1_Sub6_Sub1_1.anIntArray366[local163++];
			}
			local163 += Static7.aClass1_Sub1_Sub6_Sub1_1.anInt2839 - 128;
		}
		local167 = 0;
		Static82.aClass1_Sub1_Sub6_Sub1_3.method2166(0, 9);
		local17 = 0;
		local163 = Static7.aClass1_Sub1_Sub6_Sub1_1.anInt2839 * 9 + 128;
		for (local184 = 1; local184 < 255; local184++) {
			local194 = Static45.anIntArray142[local184] * (256 - local184) / 256 + 22;
			if (local194 < 0) {
				local194 = 0;
			}
			for (local207 = 0; local207 < local194; local207++) {
				@Pc(350) int local350 = local167++;
				local163--;
				Static95.aClass1_Sub1_Sub6_Sub1_5.anIntArray366[local350] = Static7.aClass1_Sub1_Sub6_Sub1_1.anIntArray366[local163];
			}
			for (local202 = local194; local202 < 128; local202++) {
				local214 = Static89.anIntArray243[local17++];
				local163--;
				local218 = Static7.aClass1_Sub1_Sub6_Sub1_1.anIntArray366[local163];
				if (local214 == 0) {
					Static95.aClass1_Sub1_Sub6_Sub1_5.anIntArray366[local167++] = local218;
				} else {
					@Pc(395) int local395 = local214;
					@Pc(400) int local400 = 256 - local214;
					local214 = Static122.anIntArray342[local214];
					Static95.aClass1_Sub1_Sub6_Sub1_5.anIntArray366[local167++] = (local395 * (local214 & 0xFF00) + local400 * (local218 & 0xFF00) & 0xFF0000) + (local395 * (local214 & 0xFF00FF) + (local400 * (local218 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local17 += local194;
			local163 += Static7.aClass1_Sub1_Sub6_Sub1_1.anInt2839 + 128;
		}
		Static95.aClass1_Sub1_Sub6_Sub1_5.method2166(637, 9);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(BI)Lclient!gb;")
	public static Class1_Sub1_Sub7 method1346(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub7 local10 = (Class1_Sub1_Sub7) Static204.aClass39_25.method1161((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static93.aClass7_17.method3242(3, arg0);
		local10 = new Class1_Sub1_Sub7();
		if (local22 != null) {
			local10.method1117(new Class1_Sub9(local22));
		}
		Static204.aClass39_25.method1152((long) arg0, local10);
		return local10;
	}
}
