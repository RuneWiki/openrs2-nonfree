import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Lclient!kh;")
	public static Class29 aClass29_35;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Lclient!cd;")
	private static Class10 aClass10_810 = Static51.method932("Feb");

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!cd;")
	private static Class10 aClass10_811 = Static51.method932("Jun");

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[S")
	public static short[] aShortArray17 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!cd;")
	private static Class10 aClass10_823 = Static51.method932("Jan");

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!cd;")
	private static Class10 aClass10_814 = Static51.method932("Mar");

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!cd;")
	private static Class10 aClass10_813 = Static51.method932("Apr");

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!cd;")
	private static Class10 aClass10_816 = Static51.method932("May");

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Lclient!cd;")
	private static Class10 aClass10_818 = Static51.method932("Jul");

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!cd;")
	private static Class10 aClass10_812 = Static51.method932("Aug");

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!cd;")
	private static Class10 aClass10_817 = Static51.method932("Sep");

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!cd;")
	private static Class10 aClass10_815 = Static51.method932("Oct");

	@OriginalMember(owner = "client!k", name = "w", descriptor = "Lclient!cd;")
	private static Class10 aClass10_822 = Static51.method932("Nov");

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Lclient!cd;")
	private static Class10 aClass10_821 = Static51.method932("Dec");

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array15 = new Class10[] { aClass10_823, aClass10_810, aClass10_814, aClass10_813, aClass10_816, aClass10_811, aClass10_818, aClass10_812, aClass10_817, aClass10_815, aClass10_822, aClass10_821 };

	@OriginalMember(owner = "client!k", name = "l", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_819 = Static51.method932("Freie Welt");

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!cd;")
	private static Class10 aClass10_820 = Static51.method932(" from your friend list first)3");

	@OriginalMember(owner = "client!k", name = "A", descriptor = "Lclient!cf;")
	public static Class12 aClass12_6 = new Class12();

	@OriginalMember(owner = "client!k", name = "B", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_824 = aClass10_820;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1307() {
		@Pc(9) int local9;
		if (Static142.anInt3160 > 0) {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static142.anInt3160 > 768) {
					Static145.anIntArray280[local9] = Static27.method597(Static138.anIntArray328[local9], Static111.anIntArray258[local9], 1024 - Static142.anInt3160);
				} else if (Static142.anInt3160 <= 256) {
					Static145.anIntArray280[local9] = Static27.method597(Static111.anIntArray258[local9], Static138.anIntArray328[local9], 256 - Static142.anInt3160);
				} else {
					Static145.anIntArray280[local9] = Static138.anIntArray328[local9];
				}
			}
		} else if (Static131.anInt2908 <= 0) {
			for (local9 = 0; local9 < 256; local9++) {
				Static145.anIntArray280[local9] = Static111.anIntArray258[local9];
			}
		} else {
			for (local9 = 0; local9 < 256; local9++) {
				if (Static131.anInt2908 > 768) {
					Static145.anIntArray280[local9] = Static27.method597(Static32.anIntArray66[local9], Static111.anIntArray258[local9], 1024 - Static131.anInt2908);
				} else if (Static131.anInt2908 > 256) {
					Static145.anIntArray280[local9] = Static32.anIntArray66[local9];
				} else {
					Static145.anIntArray280[local9] = Static27.method597(Static111.anIntArray258[local9], Static32.anIntArray66[local9], 256 - Static131.anInt2908);
				}
			}
		}
		local9 = 0;
		@Pc(151) int local151 = Static163.aClass2_Sub1_Sub4_Sub2_42.anInt893 * 9;
		@Pc(153) int local153 = 0;
		@Pc(172) int local172;
		@Pc(185) int local185;
		@Pc(192) int local192;
		@Pc(198) int local198;
		@Pc(218) int local218;
		@Pc(216) int local216;
		for (@Pc(155) int local155 = 1; local155 < 255; local155++) {
			local172 = Static59.anIntArray168[local155] * (256 - local155) / 256 + 22;
			if (local172 < 0) {
				local172 = 0;
			}
			local9 += local172;
			for (local185 = local172; local185 < 128; local185++) {
				local192 = Static11.anIntArray368[local9++];
				local198 = Static163.aClass2_Sub1_Sub4_Sub2_42.anIntArray71[local151++];
				if (local192 == 0) {
					Static51.aClass2_Sub1_Sub4_Sub2_13.anIntArray71[local153++] = local198;
				} else {
					local216 = 256 - local192;
					local218 = local192;
					local192 = Static145.anIntArray280[local192];
					Static51.aClass2_Sub1_Sub4_Sub2_13.anIntArray71[local153++] = (local216 * (local198 & 0xFF00) + local218 * (local192 & 0xFF00) & 0xFF0000) + ((local198 & 0xFF00FF) * local216 + local218 * (local192 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local192 = 0; local192 < local172; local192++) {
				Static51.aClass2_Sub1_Sub4_Sub2_13.anIntArray71[local153++] = Static163.aClass2_Sub1_Sub4_Sub2_42.anIntArray71[local151++];
			}
			local151 += Static163.aClass2_Sub1_Sub4_Sub2_42.anInt893 - 128;
		}
		Static51.aClass2_Sub1_Sub4_Sub2_13.method716(0, 9);
		local151 = Static163.aClass2_Sub1_Sub4_Sub2_42.anInt893 * 9 + 128;
		local9 = 0;
		local153 = 0;
		for (local172 = 1; local172 < 255; local172++) {
			local185 = Static59.anIntArray168[local172] * (256 - local172) / 256 + 22;
			if (local185 < 0) {
				local185 = 0;
			}
			for (local192 = 0; local192 < local185; local192++) {
				@Pc(338) int local338 = local153++;
				local151--;
				Static123.aClass2_Sub1_Sub4_Sub2_31.anIntArray71[local338] = Static163.aClass2_Sub1_Sub4_Sub2_42.anIntArray71[local151];
			}
			for (local198 = local185; local198 < 128; local198++) {
				local218 = Static11.anIntArray368[local9++];
				local151--;
				local216 = Static163.aClass2_Sub1_Sub4_Sub2_42.anIntArray71[local151];
				if (local218 == 0) {
					Static123.aClass2_Sub1_Sub4_Sub2_31.anIntArray71[local153++] = local216;
				} else {
					@Pc(372) int local372 = local218;
					@Pc(377) int local377 = 256 - local218;
					local218 = Static145.anIntArray280[local218];
					Static123.aClass2_Sub1_Sub4_Sub2_31.anIntArray71[local153++] = ((local218 & 0xFF00FF) * local372 + (local216 & 0xFF00FF) * local377 & 0xFF00FF00) + (local377 * (local216 & 0xFF00) + local372 * (local218 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local151 += Static163.aClass2_Sub1_Sub4_Sub2_42.anInt893 + 128;
			local9 += local185;
		}
		Static123.aClass2_Sub1_Sub4_Sub2_31.method716(637, 9);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method1308(@OriginalArg(0) Class37 arg0) {
		Static4.aClass37_1 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!va;)Lclient!cd;")
	public static Class10 method1309(@OriginalArg(1) Class2_Sub11 arg0) {
		return Static175.method2694(arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method1310() {
		aClass12_6 = null;
		aClass10_818 = null;
		aClass10Array15 = null;
		aClass10_823 = null;
		aClass10_814 = null;
		aClass10_815 = null;
		aClass10_810 = null;
		aClass10_821 = null;
		aClass10_822 = null;
		aClass10_813 = null;
		aClass29_35 = null;
		aClass10_816 = null;
		aClass10_824 = null;
		aClass10_819 = null;
		aShortArray17 = null;
		aClass10_817 = null;
		aClass10_811 = null;
		aClass10_812 = null;
		aClass10_820 = null;
		aLongArray4 = null;
	}
}
