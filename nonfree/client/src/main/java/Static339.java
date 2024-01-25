import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	public static int anInt5744;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_168 = new Class107(33, 6);

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_46 = new Class134(8);

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[128][128];

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
	public static void method4785(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static201.aFloat56 = local7;
		Static142.aFloat89 = local11;
		if (Static345.anInt5797 == 2) {
			Static264.anInt4689 = 0;
			Static296.anInt5167 = local7;
			Static406.anInt6527 = local11;
		}
		Static363.method2948();
		Static84.aBoolean109 = true;
	}
}
