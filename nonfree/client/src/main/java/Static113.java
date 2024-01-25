import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static113 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[Lclient!xa;")
	public static Class4[] aClass4Array2;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILclient!ba;Lclient!vg;I)V")
	public static void method1763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) Class330 arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			arg3.method7489(arg2.M(), arg2.K(), arg2.LA(), arg0, arg4, arg2.EA(), arg2.ZA(), arg1, arg2.ha(), arg2.DA());
		}
	}
}
