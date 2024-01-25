import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static105 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static int anInt1964 = 0;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt1967 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!sf;Lclient!sf;I)V")
	public static void method1694(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class6 arg1) {
		if (arg0.aClass6_283 != null) {
			arg0.method7849();
		}
		arg0.aClass6_284 = arg1;
		arg0.aClass6_283 = arg1.aClass6_283;
		arg0.aClass6_283.aClass6_284 = arg0;
		arg0.aClass6_284.aClass6_283 = arg0;
	}
}
