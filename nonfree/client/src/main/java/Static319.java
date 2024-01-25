import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_199 = new Class221("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public static int anInt5628 = 0;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	public static int anInt5631 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4935(@OriginalArg(0) String arg0) {
		return Static3.method83(arg0, 10);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static355.method5388(Static313.anInt5542, arg0, Static345.anInt6084);
		@Pc(22) int local22 = Static355.method5388(Static313.anInt5542, arg5, Static345.anInt6084);
		@Pc(28) int local28 = Static355.method5388(Static332.anInt5823, arg3, Static202.anInt3722);
		@Pc(34) int local34 = Static355.method5388(Static332.anInt5823, arg2, Static202.anInt3722);
		@Pc(42) int local42 = Static355.method5388(Static313.anInt5542, arg6 + arg0, Static345.anInt6084);
		@Pc(51) int local51 = Static355.method5388(Static313.anInt5542, arg5 - arg6, Static345.anInt6084);
		for (@Pc(53) int local53 = local16; local53 < local42; local53++) {
			Static264.method4096(Static267.anIntArrayArray38[local53], arg4, local34, local28);
		}
		for (@Pc(69) int local69 = local22; local69 > local51; local69--) {
			Static264.method4096(Static267.anIntArrayArray38[local69], arg4, local34, local28);
		}
		@Pc(92) int local92 = Static355.method5388(Static332.anInt5823, arg3 + arg6, Static202.anInt3722);
		@Pc(101) int local101 = Static355.method5388(Static332.anInt5823, arg2 - arg6, Static202.anInt3722);
		for (@Pc(103) int local103 = local42; local103 <= local51; local103++) {
			@Pc(109) int[] local109 = Static267.anIntArrayArray38[local103];
			Static264.method4096(local109, arg4, local92, local28);
			Static264.method4096(local109, arg1, local101, local92);
			Static264.method4096(local109, arg4, local34, local101);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4937(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + Static379.method1121(arg0.charAt(local17)) - local10;
		}
		return local10;
	}
}
