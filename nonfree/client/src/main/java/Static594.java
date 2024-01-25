import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
	public static int anInt9732 = 0;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIIIB)V")
	public static void method7943(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(12) Class205[] local12 = Static283.aClass205Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class205 local20 = local12[local14];
			if (local20 != null && local20.anInt5477 == 2) {
				Static186.method3169(local20.anInt5474, arg0 >> 1, local20.anInt5480 * 2, arg3 >> 1, local20.anInt5476, local20.anInt5481);
				if (Static22.anIntArray20[0] > -1 && Static506.anInt8251 % 20 < 10) {
					Static506.aClass14Array15[local20.anInt5471].method7680(arg2 + Static22.anIntArray20[0] - 12, arg1 + -28 + Static22.anIntArray20[1]);
				}
			}
		}
	}
}
