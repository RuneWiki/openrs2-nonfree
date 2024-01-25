import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "Lclient!hm;")
	public static Class107 aClass107_8;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "[I")
	public static final int[] anIntArray249 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIII)V")
	public static void method2680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static205.anInt3787 = arg3;
		Static150.anInt4704 = arg0;
		Static319.anInt5270 = arg1;
		Static86.anInt7437 = arg2;
		Static57.anInt915 = arg4;
		if (Static57.anInt915 >= 100) {
			@Pc(34) int local34 = Static205.anInt3787 * 128 + 64;
			@Pc(40) int local40 = Static150.anInt4704 * 128 + 64;
			@Pc(48) int local48 = Static135.method1732(local34, local40, Static390.anInt6272) - Static86.anInt7437;
			@Pc(52) int local52 = local34 - Static386.anInt7155;
			@Pc(57) int local57 = local48 - Static375.anInt6055;
			@Pc(62) int local62 = local40 - Static80.anInt1106;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local62 * local62 + local52 * local52));
			Static129.anInt1972 = (int) (Math.atan2((double) local57, (double) local73) * 2607.5945876176133D) & 0x3FFF;
			Static398.anInt6386 = (int) (-2607.5945876176133D * Math.atan2((double) local52, (double) local62)) & 0x3FFF;
			Static39.anInt573 = 0;
			if (Static129.anInt1972 < 1024) {
				Static129.anInt1972 = 1024;
			}
			if (Static129.anInt1972 > 3072) {
				Static129.anInt1972 = 3072;
			}
		}
		Static139.anInt2147 = 2;
	}
}
