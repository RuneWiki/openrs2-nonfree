import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!te", name = "Eb", descriptor = "Lclient!pb;")
	public static Class41 aClass41_64;

	@OriginalMember(owner = "client!te", name = "Ob", descriptor = "I")
	public static int anInt2477;

	@OriginalMember(owner = "client!te", name = "Qb", descriptor = "Lclient!id;")
	public static Class1_Sub6 aClass1_Sub6_4;

	@OriginalMember(owner = "client!te", name = "Ub", descriptor = "Lclient!mc;")
	public static Class1_Sub2 aClass1_Sub2_4;

	@OriginalMember(owner = "client!te", name = "Vb", descriptor = "Lclient!jd;")
	public static Class37 aClass37_35;

	@OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
	public static int anInt2464 = 0;

	@OriginalMember(owner = "client!te", name = "Sb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1577 = Static69.method1153("Login");

	@OriginalMember(owner = "client!te", name = "ub", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1573 = aClass64_1577;

	@OriginalMember(owner = "client!te", name = "yb", descriptor = "[[B")
	public static byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!te", name = "zb", descriptor = "[I")
	public static int[] anIntArray362 = new int[128];

	@OriginalMember(owner = "client!te", name = "Ab", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1574 = Static69.method1153("This world is full)3");

	@OriginalMember(owner = "client!te", name = "Cb", descriptor = "I")
	public static int anInt2469 = -1;

	@OriginalMember(owner = "client!te", name = "Ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1575 = Static69.method1153("(U5");

	@OriginalMember(owner = "client!te", name = "Rb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1576 = Static69.method1153("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!te", name = "Wb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1578 = aClass64_1574;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	public static void method1719() {
		Static49.aClass1_Sub6_Sub1_1.method1877(240);
		if (Static101.anInt2274 != -1) {
			Static85.method2013(Static101.anInt2274);
			Static19.aBoolean41 = true;
			Static15.anInt468 = -1;
			Static84.aBoolean118 = true;
			Static101.anInt2274 = -1;
		}
		if (Static101.anInt2272 != -1) {
			Static85.method2013(Static101.anInt2272);
			Static116.aBoolean166 = true;
			Static15.anInt468 = -1;
			Static101.anInt2272 = -1;
		}
		if (Static27.anInt889 != -1) {
			Static85.method2013(Static27.anInt889);
			Static27.anInt889 = -1;
			Static10.method258(30);
		}
		if (Static45.anInt1077 != -1) {
			Static85.method2013(Static45.anInt1077);
			Static45.anInt1077 = -1;
		}
		if (Static95.anInt2177 != -1) {
			Static85.method2013(Static95.anInt2177);
			Static15.anInt468 = -1;
			Static95.anInt2177 = -1;
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
	public static void method1720() {
		Static101.aClass19_85.method416();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	public static void method1721(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static64.anInt1488; local7++) {
			@Pc(15) Class1_Sub1_Sub2_Sub1_Sub1 local15 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static13.anIntArray65[local7]];
			@Pc(24) int local24 = (Static13.anIntArray65[local7] << 14) + 536870912;
			if (local15 != null && local15.method1685() && local15.aClass1_Sub1_Sub15_1.aBoolean142 == arg0 && local15.aClass1_Sub1_Sub15_1.method1657()) {
				@Pc(53) int local53 = local15.anInt2412 >> 7;
				@Pc(58) int local58 = local15.anInt2375 >> 7;
				if (local58 >= 0 && local58 < 104 && local53 >= 0 && local53 < 104) {
					if (local15.anInt2395 == 1 && (local15.anInt2375 & 0x7F) == 64 && (local15.anInt2412 & 0x7F) == 64) {
						if (Static41.anIntArrayArray33[local58][local53] == Static89.anInt2034) {
							continue;
						}
						Static41.anIntArrayArray33[local58][local53] = Static89.anInt2034;
					}
					if (!local15.aClass1_Sub1_Sub15_1.aBoolean141) {
						local24 += Integer.MIN_VALUE;
					}
					Static82.aClass68_1.method1765(Static15.anInt463, local15.anInt2375, local15.anInt2412, Static114.method1996(Static15.anInt463, local15.anInt2395 * 64 + local15.anInt2375 - 64, (local15.anInt2395 - 1) * 64 + local15.anInt2412), local15.anInt2395 * 64 + 60 - 64, local15, local15.anInt2363, local24, local15.aBoolean146);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!pb;Lclient!rd;Lclient!rd;Z)Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 method1723(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) Class64 arg2) {
		@Pc(8) int local8 = arg0.method1066(arg1);
		@Pc(23) int local23 = arg0.method1050(arg2, local8);
		return Static46.method823(arg0, local23, local8);
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	public static void method1724() {
		anIntArray362 = null;
		aClass64_1578 = null;
		aClass64_1576 = null;
		aClass64_1577 = null;
		aClass37_35 = null;
		aClass64_1574 = null;
		aClass41_64 = null;
		aClass1_Sub6_4 = null;
		aByteArrayArray7 = null;
		aClass64_1575 = null;
		aClass1_Sub2_4 = null;
		aClass64_1573 = null;
	}
}
