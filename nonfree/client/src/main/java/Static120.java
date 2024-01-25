import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(IZIIII)V")
	public static void method2066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg3 - arg2;
		@Pc(22) int local22 = arg4 - arg1;
		if (local18 == 0) {
			if (local22 != 0) {
				Static94.method1278(arg4, arg0, arg2, arg1);
			}
		} else if (local22 == 0) {
			Static585.method8054(arg3, arg1, arg0, arg2);
		} else {
			@Pc(56) int local56 = (local22 << 12) / local18;
			@Pc(65) int local65 = arg1 - (local56 * arg2 >> 12);
			@Pc(82) int local82;
			@Pc(80) int local80;
			if (Static85.anInt1313 > arg2) {
				local80 = (Static85.anInt1313 * local56 >> 12) + local65;
				local82 = Static85.anInt1313;
			} else if (arg2 <= Static316.anInt6313) {
				local80 = arg1;
				local82 = arg2;
			} else {
				local80 = (local56 * Static316.anInt6313 >> 12) + local65;
				local82 = Static316.anInt6313;
			}
			@Pc(123) int local123;
			@Pc(121) int local121;
			if (Static85.anInt1313 > arg3) {
				local121 = local65 + (local56 * Static85.anInt1313 >> 12);
				local123 = Static85.anInt1313;
			} else if (arg3 > Static316.anInt6313) {
				local121 = local65 + (local56 * Static316.anInt6313 >> 12);
				local123 = Static316.anInt6313;
			} else {
				local123 = arg3;
				local121 = arg4;
			}
			if (local80 < Static280.anInt5114) {
				local80 = Static280.anInt5114;
				local82 = (Static280.anInt5114 - local65 << 12) / local56;
			} else if (Static356.anInt6028 < local80) {
				local80 = Static356.anInt6028;
				local82 = (Static356.anInt6028 - local65 << 12) / local56;
			}
			if (local121 < Static280.anInt5114) {
				local123 = (Static280.anInt5114 - local65 << 12) / local56;
				local121 = Static280.anInt5114;
			} else if (local121 > Static356.anInt6028) {
				local123 = (Static356.anInt6028 - local65 << 12) / local56;
				local121 = Static356.anInt6028;
			}
			Static396.method5961(local121, arg0, local82, local80, local123);
		}
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(II)V")
	public static void method2068(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(6, (long) arg0);
		local9.method627();
	}
}
