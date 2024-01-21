import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ha", name = "mb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_37;

	@OriginalMember(owner = "client!ha", name = "ob", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1692 = Static69.method1153("@cr1@");

	@OriginalMember(owner = "client!ha", name = "cb", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!ha", name = "db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1693 = Static69.method1153("::fpsoff");

	@OriginalMember(owner = "client!ha", name = "fb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1694 = Static69.method1153("null");

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1695 = Static69.method1153("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ha", name = "ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1696 = Static69.method1153("Side panel redrawn");

	@OriginalMember(owner = "client!ha", name = "jb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1697 = Static69.method1153("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ha", name = "lb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1698 = aClass64_1695;

	@OriginalMember(owner = "client!ha", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray33 = new int[104][104];

	@OriginalMember(owner = "client!ha", name = "pb", descriptor = "I")
	public static int anInt2677 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIILclient!tb;)V")
	public static void method1908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub15 arg3) {
		if (Static48.anInt2603 >= 400) {
			return;
		}
		if (arg3.anIntArray339 != null) {
			arg3 = arg3.method1648();
		}
		if (arg3 == null || !arg3.aBoolean141) {
			return;
		}
		@Pc(31) Class64 local31 = arg3.aClass64_1477;
		if (arg3.anInt2318 != 0) {
			local31 = Static82.method1383(new Class64[] { local31, Static21.method417(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2429, arg3.anInt2318), Static62.aClass64_912, Static87.aClass64_1267, Static12.method1395(arg3.anInt2318), Static69.aClass64_972 });
		}
		if (Static121.anInt2872 == 1) {
			Static2.method63(arg0, Static82.method1383(new Class64[] { Static13.aClass64_304, Static55.aClass64_1815, local31 }), arg2, 30, Static95.aClass64_1380, arg1);
		} else if (!Static103.aBoolean143) {
			@Pc(107) Class64[] local107 = arg3.aClass64Array17;
			if (Static86.aBoolean122) {
				local107 = Static23.method457(local107);
			}
			@Pc(117) int local117;
			if (local107 != null) {
				for (local117 = 4; local117 >= 0; local117--) {
					if (local107[local117] != null && !local107[local117].method1501(Static13.aClass64_307)) {
						@Pc(136) byte local136 = 0;
						if (local117 == 0) {
							local136 = 35;
						}
						if (local117 == 1) {
							local136 = 49;
						}
						if (local117 == 2) {
							local136 = 20;
						}
						if (local117 == 3) {
							local136 = 47;
						}
						if (local117 == 4) {
							local136 = 54;
						}
						Static2.method63(arg0, Static82.method1383(new Class64[] { Static2.aClass64_80, local31 }), arg2, local136, local107[local117], arg1);
					}
				}
			}
			if (local107 != null) {
				for (local117 = 4; local117 >= 0; local117--) {
					if (local107[local117] != null && local107[local117].method1501(Static13.aClass64_307)) {
						@Pc(207) short local207 = 0;
						@Pc(209) int local209 = 0;
						if (arg3.anInt2318 > Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2429) {
							local207 = 2000;
						}
						if (local117 == 0) {
							local209 = local207 + 35;
						}
						if (local117 == 1) {
							local209 = local207 + 49;
						}
						if (local117 == 2) {
							local209 = local207 + 20;
						}
						if (local117 == 3) {
							local209 = local207 + 47;
						}
						if (local117 == 4) {
							local209 = local207 + 54;
						}
						Static2.method63(arg0, Static82.method1383(new Class64[] { Static2.aClass64_80, local31 }), arg2, local209, local107[local117], arg1);
					}
				}
			}
			Static2.method63(arg0, Static82.method1383(new Class64[] { Static2.aClass64_80, local31 }), arg2, 1005, Static102.aClass64_1480, arg1);
		} else if ((Static18.anInt582 & 0x2) == 2) {
			Static2.method63(arg0, Static82.method1383(new Class64[] { Static27.aClass64_579, Static55.aClass64_1815, local31 }), arg2, 32, Static98.aClass64_1399, arg1);
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	public static void method1909() {
		aClass64_1693 = null;
		anIntArray389 = null;
		aClass64_1692 = null;
		aClass64_1697 = null;
		aClass37_37 = null;
		aClass64_1694 = null;
		aClass64_1696 = null;
		anIntArrayArray33 = null;
		aClass64_1698 = null;
		aClass64_1695 = null;
	}
}
