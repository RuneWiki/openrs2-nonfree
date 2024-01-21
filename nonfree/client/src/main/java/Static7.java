import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	public static int anInt280;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Lclient!ad;")
	private static Class4 aClass4_129 = Static75.method1216("scroll:");

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_128 = aClass4_129;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[Lclient!sd;")
	public static Class3_Sub1_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub1_Sub2Array1 = new Class3_Sub1_Sub1_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!bb;")
	public static Class8 aClass8_3 = new Class8(30);

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!dd;")
	public static Class20 aClass20_1 = new Class20();

	@OriginalMember(owner = "client!b", name = "t", descriptor = "J")
	public static long aLong7 = 0L;

	@OriginalMember(owner = "client!b", name = "v", descriptor = "Lclient!ad;")
	private static Class4 aClass4_130 = Static75.method1216("Loaded wordpack");

	@OriginalMember(owner = "client!b", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_131 = Static75.method1216("System)2Update in: ");

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Lclient!ad;")
	private static Class4 aClass4_134 = Static75.method1216("Loaded input handler");

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_132 = aClass4_134;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!ad;")
	public static Class4 aClass4_133 = Static75.method1216("redstone2");

	@OriginalMember(owner = "client!b", name = "z", descriptor = "I")
	public static int anInt278 = 0;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "I")
	public static int anInt279 = 0;

	@OriginalMember(owner = "client!b", name = "C", descriptor = "Lclient!ad;")
	public static Class4 aClass4_135 = aClass4_130;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	public static int anInt281 = 256;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "Lclient!ad;")
	private static Class4 aClass4_136 = Static75.method1216("purple:");

	@OriginalMember(owner = "client!b", name = "G", descriptor = "Lclient!ad;")
	public static Class4 aClass4_137 = aClass4_136;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method169() {
		aClass4_133 = null;
		aClass4_135 = null;
		aClass4_134 = null;
		aClass20_1 = null;
		aClass3_Sub1_Sub1_Sub1_Sub2Array1 = null;
		aClass4_131 = null;
		aClass4_132 = null;
		aClass4_130 = null;
		aClass4_136 = null;
		aClass4_137 = null;
		aClass4_128 = null;
		aClass8_3 = null;
		aClass4_129 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method170() {
		Static34.method709();
		Static51.method869();
		Static64.method1093();
		Static95.method1499();
		Static54.method895();
		Static22.method301();
		Static90.method1913();
		Static56.method943();
		Static111.method1899();
		Static56.method938();
		Static73.method1180();
		Static68.method1113();
		((Class44) Static99.anInterface2_1).method966();
		Static87.aClass8_19.method198();
		Static35.aClass64_Sub1_3.method1641();
		Static42.aClass64_Sub1_9.method1641();
		Static74.aClass64_Sub1_17.method1641();
		Static96.aClass64_Sub1_15.method1641();
		Static20.aClass64_Sub1_1.method1641();
		Static94.aClass64_Sub1_18.method1641();
		Static67.aClass64_Sub1_13.method1641();
		Static31.aClass64_Sub1_8.method1641();
		Static74.aClass64_Sub1_16.method1641();
		Static67.aClass64_Sub1_12.method1641();
		Static110.aClass64_Sub1_20.method1641();
		Static96.aClass64_Sub1_14.method1641();
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method171() {
		if (Static112.anInt2829 == 0) {
			return;
		}
		@Pc(10) Class3_Sub1_Sub4_Sub4 local10 = Static71.aClass3_Sub1_Sub4_Sub4_2;
		@Pc(12) int local12 = 0;
		if (Static11.anInt2850 != 0) {
			local12 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static83.aClass4Array15[local21] != null) {
				@Pc(31) int local31 = Static42.anIntArray157[local21];
				@Pc(35) Class4 local35 = Static100.aClass4Array18[local21];
				@Pc(37) byte local37 = 0;
				if (local35 != null && local35.method132(Static93.aClass4_1336)) {
					local37 = 1;
					local35 = local35.method137(5);
				}
				if (local35 != null && local35.method132(Static75.aClass4_996)) {
					local37 = 2;
					local35 = local35.method137(5);
				}
				@Pc(94) int local94;
				if ((local31 == 3 || local31 == 7) && (local31 == 7 || Static55.anInt1391 == 0 || Static55.anInt1391 == 1 && Static111.method1898(local35))) {
					local94 = 329 - local12 * 13;
					local12++;
					local10.method1866(Static45.aClass4_586, 4, local94, 0);
					local10.method1866(Static45.aClass4_586, 4, local94 - 1, 65535);
					@Pc(117) int local117 = local10.method1859(Static45.aClass4_586) + 4;
					local117 += local10.method1864(32);
					if (local37 == 1) {
						Static100.aClass3_Sub1_Sub4_Sub3Array5[0].method1771(local117, local94 - 12);
						local117 += 14;
					}
					if (local37 == 2) {
						Static100.aClass3_Sub1_Sub4_Sub3Array5[1].method1771(local117, local94 - 12);
						local117 += 14;
					}
					local10.method1866(Static60.method1012(new Class4[] { local35, Static4.aClass4_104, Static83.aClass4Array15[local21] }), local117, local94, 0);
					local10.method1866(Static60.method1012(new Class4[] { local35, Static4.aClass4_104, Static83.aClass4Array15[local21] }), local117, local94 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
				if (local31 == 5 && Static55.anInt1391 < 2) {
					local94 = 329 - local12 * 13;
					local10.method1866(Static83.aClass4Array15[local21], 4, local94, 0);
					local10.method1866(Static83.aClass4Array15[local21], 4, local94 - 1, 65535);
					local12++;
					if (local12 >= 5) {
						return;
					}
				}
				if (local31 == 6 && Static55.anInt1391 < 2) {
					local94 = 329 - local12 * 13;
					local12++;
					local10.method1866(Static60.method1012(new Class4[] { Static82.aClass4_1075, Static23.aClass4_260, local35, Static4.aClass4_104, Static83.aClass4Array15[local21] }), 4, local94, 0);
					local10.method1866(Static60.method1012(new Class4[] { Static82.aClass4_1075, Static23.aClass4_260, local35, Static4.aClass4_104, Static83.aClass4Array15[local21] }), 4, local94 - 1, 65535);
					if (local12 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V")
	public static void method172(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static29.anInt905; local7++) {
			@Pc(17) int local17 = (Static24.anIntArray40[local7] << 14) + 536870912;
			@Pc(23) Class3_Sub1_Sub1_Sub1_Sub1 local23 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static24.anIntArray40[local7]];
			if (local23 != null && local23.method1552() && local23.aClass3_Sub1_Sub17_1.aBoolean213 == arg0 && local23.aClass3_Sub1_Sub17_1.method1685()) {
				@Pc(52) int local52 = local23.anInt2342 >> 7;
				@Pc(57) int local57 = local23.anInt2348 >> 7;
				if (local52 >= 0 && local52 < 104 && local57 >= 0 && local57 < 104) {
					if (local23.anInt2319 == 1 && (local23.anInt2342 & 0x7F) == 64 && (local23.anInt2348 & 0x7F) == 64) {
						if (Static30.anInt942 == Static29.anIntArrayArray4[local52][local57]) {
							continue;
						}
						Static29.anIntArrayArray4[local52][local57] = Static30.anInt942;
					}
					if (!local23.aClass3_Sub1_Sub17_1.aBoolean214) {
						local17 += Integer.MIN_VALUE;
					}
					Static38.aClass61_30.method1318(Static49.anInt1203, local23.anInt2342, local23.anInt2348, Static82.method1293((local23.anInt2319 - 1) * 64 + local23.anInt2342, Static49.anInt1203, local23.anInt2319 * 64 + local23.anInt2348 - 64), local23.anInt2319 * 64 - 4, local23, local23.anInt2293, local17, local23.aBoolean192);
				}
			}
		}
	}
}
