import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "Lclient!gga;")
	public static Class124 aClass124_15;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_15 = new Class341(13, -1);

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "[I")
	public static final int[] anIntArray61 = new int[1];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIBI)I")
	public static int method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg0;
		@Pc(28) int local28 = Static503.method7458(local17, local7);
		@Pc(37) int local37 = Static503.method7458(local17, local7 + 1);
		@Pc(44) int local44 = Static503.method7458(local17 + 1, local7);
		@Pc(53) int local53 = Static503.method7458(local17 + 1, local7 - -1);
		@Pc(60) int local60 = Static362.method8403(local28, arg1, local37, local13);
		@Pc(76) int local76 = Static362.method8403(local44, arg1, local53, local13);
		return Static362.method8403(local60, arg1, local76, local23);
	}
}
