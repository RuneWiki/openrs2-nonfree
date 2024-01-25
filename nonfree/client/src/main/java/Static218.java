import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "Lclient!qn;")
	public static Class181 aClass181_1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg2 + arg5;
		@Pc(13) int local13 = arg6 - arg2;
		for (@Pc(15) int local15 = arg5; local15 < local9; local15++) {
			Static216.method2862(arg1, arg0, arg4, Static229.anIntArrayArray26[local15]);
		}
		for (@Pc(31) int local31 = arg6; local31 > local13; local31--) {
			Static216.method2862(arg1, arg0, arg4, Static229.anIntArrayArray26[local31]);
		}
		@Pc(54) int local54 = arg0 - arg2;
		@Pc(58) int local58 = arg2 + arg1;
		for (@Pc(72) int local72 = local9; local72 <= local13; local72++) {
			@Pc(78) int[] local78 = Static229.anIntArrayArray26[local72];
			Static216.method2862(arg1, local58, arg4, local78);
			Static216.method2862(local58, local54, arg3, local78);
			Static216.method2862(local54, arg0, arg4, local78);
		}
	}
}
