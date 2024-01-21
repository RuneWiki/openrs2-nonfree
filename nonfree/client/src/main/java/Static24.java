import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!eb", name = "hb", descriptor = "I")
	public static int anInt618;

	@OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
	public static int anInt620;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!eb", name = "bb", descriptor = "Lclient!ed;")
	public static Class2_Sub1_Sub6 aClass2_Sub1_Sub6_1 = null;

	@OriginalMember(owner = "client!eb", name = "cb", descriptor = "[I")
	public static int[] anIntArray43 = new int[5];

	@OriginalMember(owner = "client!eb", name = "ib", descriptor = "Lclient!kc;")
	private static Class36 aClass36_344 = Static14.method2017("Loaded wordpack");

	@OriginalMember(owner = "client!eb", name = "eb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_343 = aClass36_344;

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "Lclient!wd;")
	public static Class2_Sub12 aClass2_Sub12_2 = new Class2_Sub12(new byte[5000]);

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lclient!kc;")
	public static Class36 aClass36_345 = Static14.method2017("weiss:");

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIILclient!ac;)[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] method511(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3 arg2) {
		return Static14.method2024(arg2, arg1, arg0) ? Static114.method2076() : null;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V")
	public static void method515() {
		aLongArray3 = null;
		aClass2_Sub12_2 = null;
		aClass36_344 = null;
		aClass36_345 = null;
		aClass36_343 = null;
		aClass2_Sub1_Sub6_1 = null;
		aLongArray2 = null;
		anIntArray43 = null;
		aClass2_Sub1_Sub1_Sub3_3 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIII)V")
	public static void method518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static52.anInt1432 = -1;
			Static35.anInt935 = -1;
			return;
		}
		@Pc(39) int local39 = Static56.method1044(arg2, arg1, Static92.anInt2412) - arg0;
		@Pc(43) int local43 = arg2 - Static59.anInt1588;
		@Pc(47) int local47 = Static30.anIntArray105[Static96.anInt2559];
		@Pc(51) int local51 = Static30.anIntArray96[Static96.anInt2559];
		@Pc(55) int local55 = local39 - Static111.anInt2875;
		@Pc(59) int local59 = Static30.anIntArray105[Static51.anInt2603];
		@Pc(63) int local63 = arg1 - Static105.anInt2735;
		@Pc(67) int local67 = Static30.anIntArray96[Static51.anInt2603];
		@Pc(77) int local77 = local43 * local59 + local67 * local63 >> 16;
		@Pc(88) int local88 = local67 * local43 - local59 * local63 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(100) int local100 = local55 * local51 - local47 * local88 >> 16;
		@Pc(110) int local110 = local55 * local47 + local88 * local51 >> 16;
		if (local110 < 50) {
			Static35.anInt935 = -1;
			Static52.anInt1432 = -1;
		} else {
			Static52.anInt1432 = (local100 << 9) / local110 + 167;
			Static35.anInt935 = (local90 << 9) / local110 + 256;
		}
	}
}
