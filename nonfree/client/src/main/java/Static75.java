import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_13;

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_940 = Static28.method504("(U2");

	@OriginalMember(owner = "client!me", name = "z", descriptor = "Lclient!ja;")
	private static Class39 aClass39_941 = Static28.method504(" more options");

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	public static int anInt1794 = -1;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "[I")
	public static int[] anIntArray197 = new int[128];

	@OriginalMember(owner = "client!me", name = "D", descriptor = "Lclient!ja;")
	public static Class39 aClass39_942 = Static28.method504("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!ja;")
	public static Class39 aClass39_943 = aClass39_941;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "Lclient!ja;")
	private static Class39 aClass39_944 = Static28.method504("Members only world");

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Lclient!ja;")
	private static Class39 aClass39_945 = Static28.method504("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!me", name = "J", descriptor = "Lclient!ja;")
	public static Class39 aClass39_946 = aClass39_945;

	@OriginalMember(owner = "client!me", name = "L", descriptor = "I")
	public static int anInt1796 = 0;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "Lclient!ja;")
	public static Class39 aClass39_947 = aClass39_944;

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	public static int anInt1797 = 0;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
	public static int anInt1799 = 0;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	public static int anInt1800 = 0;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	public static void method1225() {
		aClass39_944 = null;
		aClass39_946 = null;
		aClass39_941 = null;
		aClass39_947 = null;
		aClass39_942 = null;
		aClass39_945 = null;
		aClass39_943 = null;
		aClass20_Sub1_13 = null;
		anIntArray197 = null;
		aClass39_940 = null;
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public static void method1226() {
		for (@Pc(12) int local12 = 0; local12 < Static125.anInt3122; local12++) {
			@Pc(18) int local18 = Static68.anIntArray193[local12]--;
			if (Static68.anIntArray193[local12] >= -10) {
				@Pc(87) Class62 local87 = Static14.aClass62Array1[local12];
				if (local87 == null) {
					local87 = Static136.method1653(aClass20_Sub1_13, Static31.anIntArray91[local12], 0);
					if (local87 == null) {
						continue;
					}
					Static68.anIntArray193[local12] += local87.method1652();
					Static14.aClass62Array1[local12] = local87;
				}
				if (Static68.anIntArray193[local12] < 0) {
					@Pc(124) int local124;
					if (Static30.anIntArray87[local12] == 0) {
						local124 = Static70.anInt1731;
					} else {
						@Pc(134) int local134 = Static30.anIntArray87[local12] >> 16 & 0xFF;
						@Pc(142) int local142 = (Static30.anIntArray87[local12] & 0xFF) * 128;
						@Pc(150) int local150 = Static30.anIntArray87[local12] >> 8 & 0xFF;
						@Pc(159) int local159 = local150 * 128 + 64 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641;
						if (local159 < 0) {
							local159 = -local159;
						}
						@Pc(173) int local173 = local134 * 128 + 64 - Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643;
						if (local173 < 0) {
							local173 = -local173;
						}
						@Pc(184) int local184 = local173 + local159 - 128;
						if (local184 > local142) {
							Static68.anIntArray193[local12] = -100;
							continue;
						}
						if (local184 < 0) {
							local184 = 0;
						}
						local124 = (local142 - local184) * Static72.anInt794 / local142;
					}
					if (local124 > 0) {
						@Pc(216) Class4_Sub6_Sub1 local216 = local87.method1651().method1145(Static83.aClass52_1);
						@Pc(221) Class4_Sub1_Sub4 local221 = Static135.method1556(local216, local124);
						local221.method1558(Static84.anIntArray221[local12] - 1);
						Static85.aClass4_Sub1_Sub2_2.method360(local221);
					}
					Static68.anIntArray193[local12] = -100;
				}
			} else {
				Static125.anInt3122--;
				for (@Pc(34) int local34 = local12; local34 < Static125.anInt3122; local34++) {
					Static31.anIntArray91[local34] = Static31.anIntArray91[local34 + 1];
					Static14.aClass62Array1[local34] = Static14.aClass62Array1[local34 + 1];
					Static84.anIntArray221[local34] = Static84.anIntArray221[local34 + 1];
					Static68.anIntArray193[local34] = Static68.anIntArray193[local34 + 1];
					Static30.anIntArray87[local34] = Static30.anIntArray87[local34 + 1];
				}
				local12--;
			}
		}
		if (Static50.aBoolean69 && !Static5.method1912()) {
			if (Static116.anInt2896 != 0 && Static19.anInt518 != -1) {
				Static72.method528(Static116.anInt2896, Static29.aClass20_Sub1_3, 0, Static19.anInt518);
			}
			Static50.aBoolean69 = false;
		}
	}
}
