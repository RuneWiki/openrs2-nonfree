import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	public static int anInt568 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)I")
	public static int method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg2 - 1 & arg1;
		@Pc(28) int local28 = Static374.method5173(local7, local17);
		@Pc(35) int local35 = Static374.method5173(local7 + 1, local17);
		@Pc(42) int local42 = Static374.method5173(local7, local17 + 1);
		@Pc(53) int local53 = Static374.method5173(local7 + 1, local17 + 1);
		@Pc(60) int local60 = Static161.method2810(local28, local13, local35, arg2);
		@Pc(67) int local67 = Static161.method2810(local42, local13, local53, arg2);
		return Static161.method2810(local60, local23, local67, arg2);
	}
}
