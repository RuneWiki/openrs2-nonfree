import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_96 = new Class362(32, -1);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIZII)Lclient!caa;")
	public static Class36 method3797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 67481L ^ (long) arg2 * 97549L ^ (long) arg1 * 475427L ^ (long) arg5 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg3 * 76724863L;
		@Pc(39) Class36 local39 = (Class36) Static128.aClass223_16.method5388(local33);
		if (local39 == null) {
			local39 = Static458.aClass44_13.method4970(arg0, arg2, arg1, arg5, arg4, arg3);
			Static128.aClass223_16.method5394(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)I")
	public static int method3798() {
		@Pc(7) int local7 = Static141.aClass96_23.method2634();
		if (Static256.aClass96Array1.length - 1 > local7) {
			Static141.aClass96_23 = Static256.aClass96Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!fa;)Lclient!r;")
	public static Class44 method3800(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface11 arg1) {
		return new Class44_Sub1(arg0, arg1);
	}
}
