import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!sr;")
	public static final Class296 aClass296_6 = new Class296();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)V")
	public static void method6343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(5, arg1);
		local8.method3256();
		local8.anInt3740 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIBIII)V")
	public static void method6345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(14) int local14 = arg4 + arg5;
		for (@Pc(16) int local16 = arg5; local16 < local14; local16++) {
			Static264.method4006(arg0, arg2, arg3, Static155.anIntArrayArray32[local16]);
		}
		@Pc(38) int local38 = arg4 + arg3;
		@Pc(43) int local43 = arg0 - arg4;
		for (@Pc(49) int local49 = arg1; local49 > local10; local49--) {
			Static264.method4006(arg0, arg2, arg3, Static155.anIntArrayArray32[local49]);
		}
		for (@Pc(69) int local69 = local14; local69 <= local10; local69++) {
			@Pc(75) int[] local75 = Static155.anIntArrayArray32[local69];
			Static264.method4006(local38, arg2, arg3, local75);
			Static264.method4006(arg0, arg2, local43, local75);
		}
	}
}
