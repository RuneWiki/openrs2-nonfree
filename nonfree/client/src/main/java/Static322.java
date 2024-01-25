import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public static int anInt5593;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	public static void method4381(@OriginalArg(1) int arg0) {
		Static229.method3437();
		@Pc(11) int local11 = Static20.aClass168_1.method3904(arg0).anInt4117;
		if (local11 == 0) {
			return;
		}
		@Pc(30) int local30 = Static85.aClass49_1.anIntArray99[arg0];
		if (local11 == 6) {
			Static43.anInt1143 = local30;
		}
		if (local11 == 5) {
			Static216.anInt4119 = local30;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4382(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class196[] local3 = Static331.aClass196Array41;
		for (@Pc(9) int local9 = 0; local9 < local3.length; local9++) {
			@Pc(15) Class196 local15 = local3[local9];
			if (local15 != null && local15.anInt5507 == 2) {
				Static193.method3090(arg0 >> 1, local15.anInt5504, local15.anInt5506 * 2, local15.anInt5500, arg3 >> 1, local15.anInt5508);
				if (Static196.anIntArray248[0] > -1 && Static253.anInt4787 % 20 < 10) {
					Static37.aClass8Array28[local15.anInt5502].method6001(arg1 + Static196.anIntArray248[0] - 12, arg2 + -28 - -Static196.anIntArray248[1]);
				}
			}
		}
	}
}
