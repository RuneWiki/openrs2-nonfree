import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_84 = new Class37(64);

	@OriginalMember(owner = "client!qr", name = "M", descriptor = "Ljava/lang/String;")
	public static final String aString200 = "glow2:";

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBIIIIII)V")
	public static void method4534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 >= Static60.anInt1399 && arg6 <= Static138.anInt6334 && Static41.anInt1131 <= arg5 && arg3 <= Static165.anInt3409) {
			Static308.method5236(arg6, arg2, arg0, arg4, arg3, arg1, arg5);
		} else {
			Static232.method4187(arg2, arg0, arg6, arg4, arg1, arg3, arg5);
		}
	}
}
