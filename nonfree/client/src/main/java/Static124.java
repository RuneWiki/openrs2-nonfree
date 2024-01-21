import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1739 = Static118.method2249("New User");

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "Lclient!v;")
	public static final Class91 aClass91_11 = new Class91();

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt3083 = -1;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1740 = aClass65_1739;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
	public static int anInt3084 = 0;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1741 = null;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[Lclient!nd;")
	public static final Class60_Sub1[] aClass60_Sub1Array1 = new Class60_Sub1[256];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = arg4 - arg3;
		@Pc(10) int local10 = arg1 + arg3;
		@Pc(22) int local22 = arg3 + arg5;
		@Pc(27) int local27 = arg0 - arg3;
		for (@Pc(29) int local29 = arg1; local29 < local10; local29++) {
			Static51.method893(arg2, Static40.anIntArrayArray11[local29], arg0, arg5);
		}
		for (@Pc(49) int local49 = arg4; local49 > local6; local49--) {
			Static51.method893(arg2, Static40.anIntArrayArray11[local49], arg0, arg5);
		}
		for (@Pc(69) int local69 = local10; local69 <= local6; local69++) {
			@Pc(75) int[] local75 = Static40.anIntArrayArray11[local69];
			Static51.method893(arg2, local75, local22, arg5);
			Static51.method893(arg2, local75, arg0, local27);
		}
	}
}
