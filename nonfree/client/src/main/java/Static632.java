import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static632 {

	@OriginalMember(owner = "client!wga", name = "O", descriptor = "Lclient!pga;")
	public static Class32 aClass32_41;

	@OriginalMember(owner = "client!wga", name = "H", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_185 = new Class268(18, 2);

	@OriginalMember(owner = "client!wga", name = "L", descriptor = "Z")
	public static boolean aBoolean692 = false;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIBZI)V")
	public static void method8764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static542.anInt9328 = arg2;
		Static16.anInt283 = arg0;
		Static551.anInt9406 = arg3;
		Static447.anInt8023 = arg5;
		Static636.anInt10648 = arg1;
		if (arg4 && Static551.anInt9406 >= 100) {
			Static580.anInt9662 = Static636.anInt10648 * 512 + 256;
			Static524.anInt9123 = Static16.anInt283 * 512 + 256;
			Static428.anInt7788 = Static138.method2248(Static580.anInt9662, Static175.anInt3636, Static524.anInt9123) - Static542.anInt9328;
		}
		Static334.anInt6354 = 2;
		Static624.anInt10280 = -1;
		Static160.anInt3352 = -1;
	}
}
