import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
	public static int anInt577;

	@OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
	public static int anInt587;

	@OriginalMember(owner = "client!ec", name = "nb", descriptor = "Lclient!ud;")
	public static Class5 aClass5_8;

	@OriginalMember(owner = "client!ec", name = "R", descriptor = "Lclient!o;")
	public static Class40 aClass40_157 = Static13.method257("No response from server");

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_158 = Static13.method257("Drop @lre@");

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_159 = Static13.method257("Enter object name");

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
	public static int anInt583 = 0;

	@OriginalMember(owner = "client!ec", name = "ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_160 = Static13.method257("M");

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "[I")
	public static int[] anIntArray103 = new int[4000];

	@OriginalMember(owner = "client!ec", name = "hb", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!ec", name = "ib", descriptor = "Lclient!o;")
	private static Class40 aClass40_161 = Static13.method257("Take");

	@OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_162 = Static13.method257("No reply from loginserver)3");

	@OriginalMember(owner = "client!ec", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_163 = aClass40_161;

	@OriginalMember(owner = "client!ec", name = "qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_164 = Static13.method257("::");

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V")
	public static void method474() {
		aClass40_162 = null;
		aClass5_8 = null;
		aClass40_161 = null;
		aClass40_160 = null;
		anIntArrayArray8 = null;
		aClass40_164 = null;
		aClass40_157 = null;
		anIntArray103 = null;
		aClass40_158 = null;
		aClass40_163 = null;
		aClass40_159 = null;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
	public static void method477() {
		Static56.aClass2_Sub3_Sub1_5.method1737();
		@Pc(13) int local13 = Static56.aClass2_Sub3_Sub1_5.method1743(8);
		if (Static73.anInt1800 > local13) {
			for (@Pc(18) int local18 = local13; local18 < Static73.anInt1800; local18++) {
				Static52.anIntArray258[Static13.anInt304++] = Static63.anIntArray326[local18];
			}
		}
		if (Static73.anInt1800 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static73.anInt1800 = 0;
		for (@Pc(62) int local62 = 0; local62 < local13; local62++) {
			@Pc(68) int local68 = Static63.anIntArray326[local62];
			@Pc(72) Class2_Sub2_Sub12_Sub1_Sub2 local72 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local68];
			@Pc(77) int local77 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
			if (local77 == 0) {
				Static63.anIntArray326[Static73.anInt1800++] = local68;
				local72.anInt2274 = Static107.anInt2511;
			} else {
				@Pc(97) int local97 = Static56.aClass2_Sub3_Sub1_5.method1743(2);
				if (local97 == 0) {
					Static63.anIntArray326[Static73.anInt1800++] = local68;
					local72.anInt2274 = Static107.anInt2511;
					Static98.anIntArray504[Static53.anInt1190++] = local68;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static63.anIntArray326[Static73.anInt1800++] = local68;
						local72.anInt2274 = Static107.anInt2511;
						local139 = Static56.aClass2_Sub3_Sub1_5.method1743(3);
						local72.method1547(local139, false);
						local149 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
						if (local149 == 1) {
							Static98.anIntArray504[Static53.anInt1190++] = local68;
						}
					} else if (local97 == 2) {
						Static63.anIntArray326[Static73.anInt1800++] = local68;
						local72.anInt2274 = Static107.anInt2511;
						local139 = Static56.aClass2_Sub3_Sub1_5.method1743(3);
						local72.method1547(local139, true);
						local149 = Static56.aClass2_Sub3_Sub1_5.method1743(3);
						local72.method1547(local149, true);
						@Pc(203) int local203 = Static56.aClass2_Sub3_Sub1_5.method1743(1);
						if (local203 == 1) {
							Static98.anIntArray504[Static53.anInt1190++] = local68;
						}
					} else if (local97 == 3) {
						Static52.anIntArray258[Static13.anInt304++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	public static void method480() {
		@Pc(3) int local3 = Static48.anInt1110;
		@Pc(9) int local9 = Static107.anInt2497;
		@Pc(11) int local11 = Static15.anInt1856;
		@Pc(18) int local18 = Static99.anInt120;
		Static26.method1612(local3, local9, local11, local18, 6116423);
		Static26.method1612(local3 + 1, local9 + 1, local11 - 2, 16, 0);
		Static26.method1607(local3 + 1, local9 + 18, local11 - 2, local18 - 19, 0);
		Static14.aClass2_Sub2_Sub2_Sub2_1.method575(Static74.aClass40_524, local3 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Static32.anInt742;
		@Pc(66) int local66 = Static100.anInt2394;
		if (Static1.anInt16 == 0) {
			local66 -= 4;
			local64 -= 4;
		}
		if (Static1.anInt16 == 1) {
			local66 -= 205;
			local64 -= 553;
		}
		if (Static1.anInt16 == 2) {
			local66 -= 357;
			local64 -= 17;
		}
		for (@Pc(84) int local84 = 0; local84 < Static34.anInt797; local84++) {
			@Pc(99) int local99 = (Static34.anInt797 - local84 - 1) * 15 + local9 + 31;
			@Pc(101) int local101 = 16777215;
			if (local64 > local3 && local64 < local3 + local11 && local66 > local99 - 13 && local99 + 3 > local66) {
				local101 = 16776960;
			}
			Static14.aClass2_Sub2_Sub2_Sub2_1.method574(Static18.aClass40Array8[local84], local3 + 3, local99, local101, true);
		}
	}
}
