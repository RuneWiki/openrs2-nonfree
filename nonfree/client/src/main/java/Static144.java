import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!iq", name = "P", descriptor = "I")
	public static int anInt3086;

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_23 = new Class180();

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
	public static int anInt3084 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method2740(@OriginalArg(0) Class2_Sub11 arg0) {
		if (arg0.aClass2_Sub5_5 != null) {
			arg0.aClass2_Sub5_5.anInt298 = 0;
		}
		arg0.aBoolean521 = false;
		for (@Pc(24) Class2_Sub11 local24 = arg0.method4948(); local24 != null; local24 = arg0.method4947()) {
			method2740(local24);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIII)V")
	public static void method2759(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg4;
		@Pc(14) int local14 = arg5 - arg2;
		for (@Pc(20) int local20 = arg4; local20 < local9; local20++) {
			Static115.method2278(Static364.anIntArrayArray57[local20], arg1, arg0, arg3);
		}
		@Pc(44) int local44 = arg2 + arg3;
		for (@Pc(46) int local46 = arg5; local46 > local14; local46--) {
			Static115.method2278(Static364.anIntArrayArray57[local46], arg1, arg0, arg3);
		}
		@Pc(71) int local71 = arg1 - arg2;
		for (@Pc(73) int local73 = local9; local73 <= local14; local73++) {
			@Pc(79) int[] local79 = Static364.anIntArrayArray57[local73];
			Static115.method2278(local79, local44, arg0, arg3);
			Static115.method2278(local79, arg1, arg0, local71);
		}
	}
}
