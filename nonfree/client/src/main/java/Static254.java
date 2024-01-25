import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
	public static int anInt3989;

	@OriginalMember(owner = "client!ht", name = "P", descriptor = "[I")
	public static final int[] anIntArray298 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method3594(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub44 local10 = (Class2_Sub44) Static426.aClass218_29.method5095((long) arg0, 0);
		if (local10 != null) {
			@Pc(23) Class2_Sub12_Sub3 local23 = local10.aClass156_Sub1_1.method3414();
			if (local23 != null) {
				@Pc(30) double local30 = local10.aClass156_Sub1_1.method3411();
				if (local30 >= (double) local23.method4448() && local30 <= (double) local23.method4447()) {
					return local23.method4446();
				}
			}
		}
		return null;
	}
}
