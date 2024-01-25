import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt2258 = 0;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[B[BIIIII)V")
	public static void method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(22) int local22 = -arg4; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg7++;
				arg2[local30] += arg3[arg1++];
				@Pc(42) int local42 = arg7++;
				arg2[local42] += arg3[arg1++];
				@Pc(54) int local54 = arg7++;
				arg2[local54] += arg3[arg1++];
				@Pc(66) int local66 = arg7++;
				arg2[local66] += arg3[arg1++];
			}
			for (@Pc(83) int local83 = local15; local83 < 0; local83++) {
				local30 = arg7++;
				arg2[local30] += arg3[arg1++];
			}
			arg7 += arg0;
			arg1 += arg6;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[I)V")
	public static void method1950(@OriginalArg(1) int[][] arg0) {
		Static569.anIntArrayArray54 = arg0;
	}
}
