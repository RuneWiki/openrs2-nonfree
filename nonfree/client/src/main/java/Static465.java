import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qm", name = "S", descriptor = "Lclient!hj;")
	public static final Class134 aClass134_4 = new Class134();

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static317.method5515(Static237.anInt5159, arg2, Static380.anInt7421);
		@Pc(17) int local17 = Static317.method5515(Static237.anInt5159, arg0, Static380.anInt7421);
		@Pc(23) int local23 = Static317.method5515(Static38.anInt823, arg5, Static161.anInt7734);
		@Pc(29) int local29 = Static317.method5515(Static38.anInt823, arg1, Static161.anInt7734);
		@Pc(37) int local37 = Static317.method5515(Static237.anInt5159, arg2 + arg4, Static380.anInt7421);
		@Pc(46) int local46 = Static317.method5515(Static237.anInt5159, arg0 - arg4, Static380.anInt7421);
		for (@Pc(52) int local52 = local11; local52 < local37; local52++) {
			Static280.method5108(local29, Static208.anIntArrayArray20[local52], local23, arg6);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static280.method5108(local29, Static208.anIntArrayArray20[local72], local23, arg6);
		}
		@Pc(94) int local94 = Static317.method5515(Static38.anInt823, arg5 + arg4, Static161.anInt7734);
		@Pc(103) int local103 = Static317.method5515(Static38.anInt823, arg1 - arg4, Static161.anInt7734);
		for (@Pc(105) int local105 = local37; local105 <= local46; local105++) {
			@Pc(111) int[] local111 = Static208.anIntArrayArray20[local105];
			Static280.method5108(local94, local111, local23, arg6);
			Static280.method5108(local103, local111, local94, arg3);
			Static280.method5108(local29, local111, local103, arg6);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	public static int method7210() {
		return Static66.anInt10075 == 1 ? Static114.anInt3048 : 0;
	}
}
