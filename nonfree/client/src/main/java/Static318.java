import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static318 {

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "F")
	public static float aFloat172;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_75 = new Class44(60, -1);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(CZ)Z")
	public static boolean method4553(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V")
	public static void method4554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static399.aClass167_Sub1_1.anInt5565 != 0 && arg4 != 0 && Static18.anInt404 < 50 && arg1 != -1) {
			Static148.aClass9Array1[Static18.anInt404++] = new Class9((byte) 1, arg1, arg4, arg0, arg2, arg3);
		}
	}
}
