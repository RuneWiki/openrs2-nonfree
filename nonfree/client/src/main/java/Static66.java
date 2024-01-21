import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!le", name = "eb", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!le", name = "mb", descriptor = "I")
	public static int anInt1525;

	@OriginalMember(owner = "client!le", name = "nb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_24;

	@OriginalMember(owner = "client!le", name = "pb", descriptor = "Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 aClass1_Sub1_Sub5_Sub3_12;

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_949 = Static69.method1153("@cr2@");

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "Lclient!dd;")
	public static Class19 aClass19_54 = new Class19(64);

	@OriginalMember(owner = "client!le", name = "db", descriptor = "I")
	public static final int anInt1519 = 0;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_950 = Static69.method1153("(Z");

	@OriginalMember(owner = "client!le", name = "lb", descriptor = "[I")
	public static int[] anIntArray235 = new int[2000];

	@OriginalMember(owner = "client!le", name = "ob", descriptor = "Lclient!rd;")
	private static Class64 aClass64_951 = Static69.method1153("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!le", name = "qb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_952 = Static69.method1153("scrollen:");

	@OriginalMember(owner = "client!le", name = "rb", descriptor = "I")
	public static int anInt1526 = 0;

	@OriginalMember(owner = "client!le", name = "sb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_953 = aClass64_951;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
	public static void method1125() {
		aClass64_949 = null;
		aClass64_953 = null;
		anIntArray235 = null;
		aClass64_950 = null;
		aClass1_Sub1_Sub5_Sub3_12 = null;
		aClass19_54 = null;
		aClass64_952 = null;
		aClass64_951 = null;
		anIntArray234 = null;
		aClass37_24 = null;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
	public static void method1126() {
		Static90.aClass19_21.method416();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!p;)V")
	public static void method1129(@OriginalArg(1) Class1_Sub9 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt1877 == 0) {
			local5 = Static82.aClass68_1.method1785(arg0.anInt1887, arg0.anInt1890, arg0.anInt1882);
		}
		if (arg0.anInt1877 == 1) {
			local5 = Static82.aClass68_1.method1752(arg0.anInt1887, arg0.anInt1890, arg0.anInt1882);
		}
		@Pc(35) int local35 = -1;
		if (arg0.anInt1877 == 2) {
			local5 = Static82.aClass68_1.method1779(arg0.anInt1887, arg0.anInt1890, arg0.anInt1882);
		}
		@Pc(57) int local57 = 0;
		if (arg0.anInt1877 == 3) {
			local5 = Static82.aClass68_1.method1786(arg0.anInt1887, arg0.anInt1890, arg0.anInt1882);
		}
		@Pc(74) int local74 = 0;
		if (local5 != 0) {
			local35 = local5 >> 14 & 0x7FFF;
			@Pc(95) int local95 = Static82.aClass68_1.method1760(arg0.anInt1887, arg0.anInt1890, arg0.anInt1882, local5);
			local74 = local95 & 0x1F;
			local57 = local95 >> 6 & 0x3;
		}
		arg0.anInt1886 = local74;
		arg0.anInt1892 = local35;
		arg0.anInt1879 = local57;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
	public static void method1130() {
		if (Static21.anInt649 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (anInt1526 != 0) {
			local15 = 1;
		}
		for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
			if (Static120.aClass64Array19[local24] != null) {
				@Pc(34) int local34 = Static22.anIntArray85[local24];
				@Pc(38) Class64 local38 = Static22.aClass64Array8[local24];
				if (local38 != null && local38.method1479(Static41.aClass64_1692)) {
					local38 = local38.method1481(5);
				}
				if (local38 != null && local38.method1479(aClass64_949)) {
					local38 = local38.method1481(5);
				}
				if ((local34 == 3 || local34 == 7) && (local34 == 7 || Static108.anInt2556 == 0 || Static108.anInt2556 == 1 && Static19.method394(local38))) {
					@Pc(96) int local96 = 329 - local15 * 13;
					local15++;
					if (Static81.anInt1404 > 4 && Static63.anInt1474 - 4 > local96 - 10 && Static63.anInt1474 - 4 <= local96 + 3) {
						@Pc(151) int local151 = Static3.aClass1_Sub1_Sub5_Sub1_1.method654(Static82.method1383(new Class64[] { Static58.aClass64_820, Static84.aClass64_1226, local38, Static120.aClass64Array19[local24] })) + 25;
						if (local151 > 450) {
							local151 = 450;
						}
						if (local151 + 4 > Static81.anInt1404) {
							if (Static46.anInt1085 >= 1) {
								Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local38 }), 0, 2017, Static68.aClass64_962, 0);
							}
							Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local38 }), 0, 2002, Static113.aClass64_1114, 0);
							Static2.method63(0, Static82.method1383(new Class64[] { Static106.aClass64_1610, local38 }), 0, 2007, Static42.aClass64_616, 0);
						}
					}
					if (local15 >= 5) {
						return;
					}
				}
				if ((local34 == 5 || local34 == 6) && Static108.anInt2556 < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}
}
