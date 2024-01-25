import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "[I")
	public static int[] anIntArray119 = new int[1];

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!ae;")
	public static final Class9 aClass9_1 = new Class9(0);

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!fo;")
	public static final Class91 aClass91_5 = new Class91(10, 5);

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_32 = new Class239(60, 19);

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_15 = new Class243(8, -1);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIB)Lclient!lh;")
	public static Class58 method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 32147369L ^ (long) arg5 * 97549L ^ (long) arg0 * 67481L ^ (long) arg1 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 76724863L;
		@Pc(44) Class58 local44 = (Class58) Static294.aClass231_46.method6228(local33);
		if (local44 == null) {
			local44 = Static525.aClass39_12.method6040(arg0, arg5, arg1, arg3, arg2, arg4);
			Static294.aClass231_46.method6232(local44, local33);
			return local44;
		} else {
			return local44;
		}
	}
}
