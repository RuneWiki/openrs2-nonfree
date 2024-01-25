import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!xa;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	public static int anInt35;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_1 = new Class160(29, 7);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
	public static int method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static247.method3538(local17, local7);
		@Pc(35) int local35 = Static247.method3538(local17, local7 + 1);
		@Pc(42) int local42 = Static247.method3538(local17 + 1, local7);
		@Pc(51) int local51 = Static247.method3538(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static543.method7501(local28, local35, local13, arg0);
		@Pc(65) int local65 = Static543.method7501(local42, local51, local13, arg0);
		return Static543.method7501(local58, local65, local23, arg0);
	}
}
