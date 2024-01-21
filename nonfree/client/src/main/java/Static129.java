import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!ca;")
	public static Class14 aClass14_5;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_3;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!md;")
	public static Class54 aClass54_10 = new Class54(8);

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1052 = Static65.method1172("Connection lost)3");

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1051 = aClass46_1052;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1053 = Static65.method1172("title)3jpg");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public static void method2167() {
		aClass46_1053 = null;
		aClass54_10 = null;
		aClass46_1051 = null;
		aClass1_3 = null;
		aClass14_5 = null;
		aClass46_1052 = null;
		Class67.anIntArray340 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	public static void method2168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class59 local11 = Static148.aClass59ArrayArrayArray2[Static99.anInt2422][arg1][arg0];
		if (local11 == null) {
			Static154.aClass62_1.method1974(Static99.anInt2422, arg1, arg0);
			return;
		}
		@Pc(21) Class3_Sub2_Sub1_Sub7 local21 = null;
		@Pc(23) int local23 = -99999999;
		@Pc(28) Class3_Sub2_Sub1_Sub7 local28;
		for (local28 = (Class3_Sub2_Sub1_Sub7) local11.method1731(); local28 != null; local28 = (Class3_Sub2_Sub1_Sub7) local11.method1734()) {
			@Pc(36) Class3_Sub2_Sub14 local36 = Static146.method2432(local28.anInt3721);
			@Pc(39) int local39 = local36.anInt3327;
			if (local36.anInt3324 == 1) {
				local39 *= local28.anInt3718 + 1;
			}
			if (local23 < local39) {
				local21 = local28;
				local23 = local39;
			}
		}
		if (local21 == null) {
			Static154.aClass62_1.method1974(Static99.anInt2422, arg1, arg0);
			return;
		}
		@Pc(80) Class3_Sub2_Sub1_Sub7 local80 = null;
		@Pc(82) Class3_Sub2_Sub1_Sub7 local82 = null;
		local11.method1738(local21);
		@Pc(100) int local100 = arg1 + (arg0 << 7) + 1610612736;
		for (local28 = (Class3_Sub2_Sub1_Sub7) local11.method1731(); local28 != null; local28 = (Class3_Sub2_Sub1_Sub7) local11.method1734()) {
			if (local21.anInt3721 != local28.anInt3721) {
				if (local80 == null) {
					local80 = local28;
				}
				if (local28.anInt3721 != local80.anInt3721 && local82 == null) {
					local82 = local28;
				}
			}
		}
		Static154.aClass62_1.method2013(Static99.anInt2422, arg1, arg0, Static168.method2689(arg0 * 128 + 64, arg1 * 128 + 64, Static99.anInt2422), local21, local100, local80, local82);
	}
}
