import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "[Lclient!ov;")
	public static Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_26 = new Class337(95, 10);

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "Lclient!ln;")
	public static final Class216 aClass216_4 = new Class216(13, 0, 1, 0);

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
	public static int anInt1667 = 765;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIII)I")
	public static int method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(8) int local8 = arg3;
			arg3 = arg5;
			arg5 = local8;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg2;
		} else if (local20 == 1) {
			return 7 + 1 - arg0 - arg3;
		} else if (local20 == 2) {
			return 7 + 1 - arg2 - arg5;
		} else {
			return arg0;
		}
	}
}
