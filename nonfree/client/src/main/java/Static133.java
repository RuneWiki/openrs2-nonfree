import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Lclient!ul;")
	public static Class246 aClass246_84;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "I")
	public static int anInt2664;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_90 = new Class107(111, 7);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIBII)V")
	public static void method2307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class83[] local3 = Static353.aClass83Array2;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class83 local11 = local3[local5];
			if (local11 != null && local11.anInt2462 == 2) {
				Static417.method5559(local11.anInt2463, local11.anInt2457, local11.anInt2461 * 2, local11.anInt2456, arg1 >> 1, arg0 >> 1);
				if (Static262.anIntArray406[0] > -1 && Static378.anInt4244 % 20 < 10) {
					Static141.aClass143Array3[local11.anInt2458].method5723(arg3 + Static262.anIntArray406[0] - 12, arg2 + -28 + Static262.anIntArray406[1]);
				}
			}
		}
	}
}
