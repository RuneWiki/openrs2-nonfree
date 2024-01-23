import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Lclient!ni;")
	public static Class84 aClass84_5;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array6;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!jd;")
	public static Class61 aClass61_44 = new Class61(20);

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!sc;")
	public static Class107 aClass107_659 = Static231.method3737(": ");

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
	public static int anInt2435 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method1917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg6 - arg1;
		@Pc(20) int local20 = (arg5 - arg0 << 16) / local12;
		@Pc(25) int local25 = arg2 - arg4;
		@Pc(34) int local34 = (arg3 - arg7 << 16) / local25;
		Static57.method3707(local20, arg1, local34, arg0, arg4, arg2, arg6, arg7);
	}
}
