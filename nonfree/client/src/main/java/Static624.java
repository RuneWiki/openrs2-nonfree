import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "Lclient!bda;")
	public static Class31 aClass31_7;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "[Lclient!ud;")
	public static final Class2_Sub34[] aClass2_Sub34Array1 = new Class2_Sub34[2048];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method8449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 + arg3;
		@Pc(14) int local14 = arg4 - arg5;
		for (@Pc(16) int local16 = arg3; local16 < local9; local16++) {
			Static259.method4236(arg2, arg0, arg1, Static618.anIntArrayArray101[local16]);
		}
		for (@Pc(37) int local37 = arg4; local37 > local14; local37--) {
			Static259.method4236(arg2, arg0, arg1, Static618.anIntArrayArray101[local37]);
		}
		@Pc(56) int local56 = arg0 - arg5;
		@Pc(60) int local60 = arg5 + arg2;
		for (@Pc(62) int local62 = local9; local62 <= local14; local62++) {
			@Pc(68) int[] local68 = Static618.anIntArrayArray101[local62];
			Static259.method4236(arg2, local60, arg1, local68);
			Static259.method4236(local56, arg0, arg1, local68);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)Z")
	public static boolean method8450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static296.method4637(arg1, arg0) | (arg0 & 0x10000) != 0 || Static480.method6933(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static370.method5584(arg1, arg0);
		}
	}
}
