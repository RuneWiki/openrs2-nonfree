import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "[Lclient!om;")
	public static Class57_Sub1_Sub1_Sub1[] aClass57_Sub1_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!um;")
	public static final Class244 aClass244_16 = new Class244();

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
	public static int anInt3600 = 0;

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
	public static int anInt3604 = 16777215;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIBIII)I")
	public static int method2971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(6) int local6 = arg5;
			arg5 = arg2;
			arg2 = local6;
		}
		@Pc(18) int local18 = arg0 & 0x3;
		if (local18 == 0) {
			return arg3;
		} else if (local18 == 1) {
			return 1 + 7 - arg5 - arg4;
		} else if (local18 == 2) {
			return 7 + 1 - arg3 - arg2;
		} else {
			return arg4;
		}
	}
}
