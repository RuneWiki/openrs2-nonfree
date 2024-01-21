import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!j", name = "r", descriptor = "[S")
	public static short[] aShortArray20;

	@OriginalMember(owner = "client!j", name = "f", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_752 = Static177.method3050("Jan");

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_754 = Static177.method3050("Feb");

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_761 = Static177.method3050("Mar");

	@OriginalMember(owner = "client!j", name = "q", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_762 = Static177.method3050("Apr");

	@OriginalMember(owner = "client!j", name = "n", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_759 = Static177.method3050("May");

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_755 = Static177.method3050("Jun");

	@OriginalMember(owner = "client!j", name = "d", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_751 = Static177.method3050("Jul");

	@OriginalMember(owner = "client!j", name = "u", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_764 = Static177.method3050("Aug");

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_760 = Static177.method3050("Sep");

	@OriginalMember(owner = "client!j", name = "s", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_763 = Static177.method3050("Oct");

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_758 = Static177.method3050("Nov");

	@OriginalMember(owner = "client!j", name = "k", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_757 = Static177.method3050("Dec");

	@OriginalMember(owner = "client!j", name = "c", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array13 = new Class46[] { aClass46_752, aClass46_754, aClass46_761, aClass46_762, aClass46_759, aClass46_755, aClass46_751, aClass46_764, aClass46_760, aClass46_763, aClass46_758, aClass46_757 };

	@OriginalMember(owner = "client!j", name = "e", descriptor = "I")
	public static int anInt1991 = 0;

	@OriginalMember(owner = "client!j", name = "g", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_753 = Static177.method3050("Lade Texturen )2 ");

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_756 = Static177.method3050("Cabbage");

	@OriginalMember(owner = "client!j", name = "m", descriptor = "J")
	public static long aLong71 = 0L;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "[I")
	public static final int[] anIntArray198 = new int[5];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
	public static int method1589() {
		@Pc(5) int local5 = Static106.method1998(Static119.anInt2886, Static73.anInt1873, Static135.anInt3214);
		return local5 - Static111.anInt2724 >= 800 || (Static53.aByteArrayArrayArray2[Static73.anInt1873][Static119.anInt2886 >> 7][Static135.anInt3214 >> 7] & 0x4) == 0 ? 3 : Static73.anInt1873;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method1591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass24_1 != null && local7.aClass24_1.aLong36 == arg3) {
			return true;
		} else if (local7.aClass65_1 != null && local7.aClass65_1.aLong107 == arg3) {
			return true;
		} else if (local7.aClass17_1 != null && local7.aClass17_1.aLong19 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt1040; local46++) {
				if (local7.aClass86Array1[local46].aLong129 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
