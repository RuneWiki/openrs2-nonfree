import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static437 {

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Lclient!gga;")
	public static Class124 aClass124_88;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public static int anInt7948 = 0;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIII)V")
	public static void method7112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static457.anInt8209 && arg4 <= Static407.anInt7583 && Static427.anInt7845 <= arg0 && Static631.anInt10922 >= arg2) {
			Static199.method3823(arg1, arg0, arg2, arg3, arg4);
		} else {
			Static209.method3955(arg1, arg0, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)V")
	public static void method7115() {
		if (Static117.aBoolean145) {
			return;
		}
		Static308.method5062(Static242.aClass291ArrayArrayArray3);
		if (Static46.aClass291ArrayArrayArray1 != null) {
			Static308.method5062(Static46.aClass291ArrayArrayArray1);
		}
		Static117.aBoolean145 = true;
	}
}
