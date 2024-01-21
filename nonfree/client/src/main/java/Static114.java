import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!lh", name = "T", descriptor = "[Lclient!ii;")
	public static Class47[] aClass47Array2;

	@OriginalMember(owner = "client!lh", name = "bb", descriptor = "Lclient!pb;")
	public static Class71 aClass71_22;

	@OriginalMember(owner = "client!lh", name = "U", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_875 = Static151.method2243("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)Lclient!mb;")
	public static Class62 method1772(@OriginalArg(0) int arg0) {
		return Static87.aClass62Array53[arg0].method1878() <= 0 ? Static6.aClass62Array5[arg0] : Static169.method2460(new Class62[] { Static6.aClass62Array5[arg0], Static204.aClass62_1468, Static87.aClass62Array53[arg0] });
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(III)V")
	public static void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt3292; local12++) {
			@Pc(18) Class39 local18 = local7.aClass39Array2[local12];
			if ((local18.aLong54 >> 29 & 0x3L) == 2L && local18.anInt1480 == arg1 && local18.anInt1484 == arg2) {
				Static117.method1811(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(II)V")
	public static void method1774(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static164.aBoolean148) {
			Static184.method1386();
		} else if (arg0 != -1 && (arg0 != Static164.anInt3460 || !Static49.method747()) && Static95.anInt2134 != 0 && !Static164.aBoolean148) {
			Static173.method2525(Static63.aClass71_Sub1_5, Static95.anInt2134, arg0);
		}
		Static164.anInt3460 = arg0;
	}
}
