import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_847 = Static33.method650("invback");

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static int anInt1510 = 0;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!oa;")
	private static Class56 aClass56_848 = Static33.method650("Trade)4compete");

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt1511 = 0;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub2Array32 = new Class3_Sub1_Sub1_Sub2[1000];

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "Lclient!oa;")
	public static Class56 aClass56_849 = aClass56_848;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!oa;")
	public static Class56 aClass56_850 = Static33.method650("null");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!fa;)V")
	public static void method987(@OriginalArg(1) Class3_Sub6 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt958 == 0) {
			local5 = Static116.aClass14_1.method436(arg0.anInt942, arg0.anInt943, arg0.anInt954);
		}
		@Pc(22) int local22 = -1;
		if (arg0.anInt958 == 1) {
			local5 = Static116.aClass14_1.method411(arg0.anInt942, arg0.anInt943, arg0.anInt954);
		}
		if (arg0.anInt958 == 2) {
			local5 = Static116.aClass14_1.method446(arg0.anInt942, arg0.anInt943, arg0.anInt954);
		}
		if (arg0.anInt958 == 3) {
			local5 = Static116.aClass14_1.method419(arg0.anInt942, arg0.anInt943, arg0.anInt954);
		}
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		if (local5 != 0) {
			local22 = local5 >> 14 & 0x7FFF;
			@Pc(87) int local87 = Static116.aClass14_1.method429(arg0.anInt942, arg0.anInt943, arg0.anInt954, local5);
			local67 = local87 & 0x1F;
			local69 = local87 >> 6 & 0x3;
		}
		arg0.anInt959 = local22;
		arg0.anInt946 = local67;
		arg0.anInt957 = local69;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method988() {
		aClass56_850 = null;
		aClass56_849 = null;
		aClass56_847 = null;
		aClass56_848 = null;
		aClass3_Sub1_Sub1_Sub2Array32 = null;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
	public static void method994() {
		@Pc(22) int local22;
		for (@Pc(12) int local12 = -1; local12 < Static110.anInt2767; local12++) {
			if (local12 == -1) {
				local22 = 2047;
			} else {
				local22 = Static54.anIntArray108[local12];
			}
			@Pc(30) Class3_Sub1_Sub2_Sub4_Sub1 local30 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local22];
			if (local30 != null && local30.anInt3150 > 0) {
				local30.anInt3150--;
				if (local30.anInt3150 == 0) {
					local30.aClass56_1729 = null;
				}
			}
		}
		for (local22 = 0; local22 < Static109.anInt1678; local22++) {
			@Pc(63) int local63 = Static75.anIntArray176[local22];
			@Pc(67) Class3_Sub1_Sub2_Sub4_Sub2 local67 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local63];
			if (local67 != null && local67.anInt3150 > 0) {
				local67.anInt3150--;
				if (local67.anInt3150 == 0) {
					local67.aClass56_1729 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Z")
	public static boolean method995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
	public static int method998(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}
}
