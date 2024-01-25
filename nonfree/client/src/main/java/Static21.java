import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public static int anInt150 = 0;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public static int anInt152 = -1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I")
	public static int method156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static565.method7760(local17, local7);
		@Pc(35) int local35 = Static565.method7760(local17, local7 + 1);
		@Pc(42) int local42 = Static565.method7760(local17 + 1, local7);
		@Pc(51) int local51 = Static565.method7760(local17 + 1, local7 - -1);
		@Pc(58) int local58 = Static225.method3192(local35, local28, arg1, local13);
		@Pc(65) int local65 = Static225.method3192(local51, local42, arg1, local13);
		return Static225.method3192(local65, local58, arg1, local23);
	}
}
