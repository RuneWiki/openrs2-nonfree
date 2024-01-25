import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static164 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public static int anInt3824;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	public static int anInt3826;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_35 = new Class77(64, 7);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIII)V")
	public static void method3353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static251.anInt5168 && Static341.anInt6481 >= arg4 && arg1 >= Static507.anInt9124 && arg2 <= Static234.anInt4897) {
			Static531.method7864(arg3, arg0, arg4, arg1, arg2);
		} else {
			Static533.method7881(arg0, arg4, arg2, arg1, arg3);
		}
	}
}
