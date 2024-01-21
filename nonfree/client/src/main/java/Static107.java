import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "Lclient!l;")
	public static Class37 aClass37_4;

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "Lclient!td;")
	public static Class54 aClass54_34;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1341 = Static87.method1648("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1337 = aClass27_1341;

	@OriginalMember(owner = "client!wb", name = "kb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1343 = Static87.method1648("Loaded config");

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1338 = aClass27_1343;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1342 = Static87.method1648("Hidden");

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1339 = aClass27_1342;

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1340 = Static87.method1648(" x");

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
	public static int anInt2765 = 256;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
	public static int anInt2771 = 0;

	@OriginalMember(owner = "client!wb", name = "pb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1344 = Static87.method1648("Lade Texturen )2 ");

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	public static void method1896() {
		Static11.aClass7_5.method684();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static96.aLongArray9[local17] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static70.aLongArray10[local29] = 0L;
		}
		Static70.anInt1832 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	public static void method1897() {
		Static64.aClass21_20.method663();
		Static66.aClass21_23.method663();
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)Z")
	public static boolean method1898() {
		@Pc(5) Class53 local5 = Static15.aClass53_1;
		synchronized (Static15.aClass53_1) {
			if (Static3.anInt95 == Static65.anInt1666) {
				return false;
			} else {
				Static85.anInt2305 = Static15.anIntArray54[Static65.anInt1666];
				Static28.anInt751 = Static70.anIntArray308[Static65.anInt1666];
				Static65.anInt1666 = Static65.anInt1666 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
	public static void method1899() {
		aClass27_1339 = null;
		aClass27_1340 = null;
		aClass27_1342 = null;
		aClass27_1343 = null;
		aClass27_1341 = null;
		aClass27_1344 = null;
		aClass54_34 = null;
		aClass27_1337 = null;
		aClass37_4 = null;
		aClass27_1338 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
	public static void method1900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg4 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg3 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg5;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local16 != 0) {
			local29 = Static21.anIntArray96[local16];
			local33 = Static21.anIntArray99[local16];
			local44 = local29 * 0 - local33 * arg5 >> 16;
			local22 = local33 * 0 + local29 * arg5 >> 16;
			local20 = local44;
		}
		if (local10 != 0) {
			local33 = Static21.anIntArray99[local10];
			local29 = Static21.anIntArray96[local10];
			local44 = local29 * 0 + local22 * local33 >> 16;
			local22 = local29 * local22 - local33 * 0 >> 16;
			local18 = local44;
		}
		Static108.anInt2777 = arg2 - local18;
		Static75.anInt2122 = arg0 - local20;
		Static86.anInt2328 = arg4;
		Static45.anInt371 = arg1 - local22;
		Static81.anInt2195 = arg3;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
	public static void method1901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static76.aClass3_Sub3_Sub2_Sub4Array6[0].method1332(arg2, arg0);
		Static76.aClass3_Sub3_Sub2_Sub4Array6[1].method1332(arg2, arg0 + arg1 - 16);
		@Pc(28) int local28 = arg1 * (arg1 - 32) / arg4;
		if (local28 < 8) {
			local28 = 8;
		}
		Static95.method1322(arg2, arg0 + 16, 16, arg1 - 32, Static28.anInt752);
		@Pc(56) int local56 = arg3 * (arg1 - local28 - 32) / (arg4 - arg1);
		Static95.method1322(arg2, local56 + arg0 + 16, 16, local28, Static39.anInt986);
		Static95.method1316(arg2, arg0 + local56 + 16, local28, Static109.anInt2070);
		Static95.method1316(arg2 + 1, arg0 + 16 + local56, local28, Static109.anInt2070);
		Static95.method1326(arg2, arg0 + local56 + 16, 16, Static109.anInt2070);
		Static95.method1326(arg2, local56 + arg0 + 17, 16, Static109.anInt2070);
		Static95.method1316(arg2 + 15, local56 + 16 + arg0, local28, Static36.anInt873);
		Static95.method1316(arg2 + 14, arg0 + 17 + local56, local28 - 1, Static36.anInt873);
		Static95.method1326(arg2, arg0 + local56 + local28 + 15, 16, Static36.anInt873);
		Static95.method1326(arg2 + 1, arg0 - -14 - (-local56 + -local28), 15, Static36.anInt873);
	}
}
