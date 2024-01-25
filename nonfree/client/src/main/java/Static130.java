import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!vp;")
	public static Class309 aClass309_5 = null;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_45 = new Class6(89, 2);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIBI)V")
	public static void method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(20) int local20 = arg3 - arg1;
		if (local10 == 0) {
			if (local20 != 0) {
				Static15.method803(arg1, arg4, arg0, arg3);
			}
		} else if (local20 == 0) {
			Static231.method6246(arg2, arg4, arg0, arg1);
		} else {
			@Pc(52) int local52 = (local20 << 12) / local10;
			@Pc(61) int local61 = arg1 - (arg0 * local52 >> 12);
			@Pc(74) int local74;
			@Pc(72) int local72;
			if (Static95.anInt2358 > arg2) {
				local72 = local61 + (local52 * Static95.anInt2358 >> 12);
				local74 = Static95.anInt2358;
			} else if (Static299.anInt4491 < arg2) {
				local72 = (local52 * Static299.anInt4491 >> 12) + local61;
				local74 = Static299.anInt4491;
			} else {
				local74 = arg2;
				local72 = arg3;
			}
			@Pc(107) int local107;
			@Pc(116) int local116;
			if (arg0 < Static95.anInt2358) {
				local107 = Static95.anInt2358;
				local116 = local61 + (Static95.anInt2358 * local52 >> 12);
			} else if (arg0 > Static299.anInt4491) {
				local107 = Static299.anInt4491;
				local116 = local61 + (local52 * Static299.anInt4491 >> 12);
			} else {
				local107 = arg0;
				local116 = arg1;
			}
			if (local116 < Static92.anInt2338) {
				local116 = Static92.anInt2338;
				local107 = (Static92.anInt2338 - local61 << 12) / local52;
			} else if (local116 > Static341.anInt6379) {
				local107 = (Static341.anInt6379 - local61 << 12) / local52;
				local116 = Static341.anInt6379;
			}
			if (Static92.anInt2338 > local72) {
				local74 = (Static92.anInt2338 - local61 << 12) / local52;
				local72 = Static92.anInt2338;
			} else if (local72 > Static341.anInt6379) {
				local74 = (Static341.anInt6379 - local61 << 12) / local52;
				local72 = Static341.anInt6379;
			}
			Static139.method2955(local116, local72, local107, arg4, local74);
		}
	}
}
