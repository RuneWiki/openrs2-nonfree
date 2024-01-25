import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_36 = new Class123(13, -2);

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "Lclient!pca;")
	public static Class251 aClass251_2 = null;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_18 = new Class287(32, 7);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIIIII)V")
	public static void method1111(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static429.anInt7994 = arg0;
		Static448.anInt10232 = arg3;
		Static512.anInt8854 = arg2;
		Static557.anInt6113 = arg4;
		Static524.anInt9196 = arg5;
		if (arg1 && Static524.anInt9196 >= 100) {
			Static418.anInt7466 = Static512.anInt8854 * 512 + 256;
			Static407.anInt7345 = Static429.anInt7994 * 512 + 256;
			Static335.anInt6057 = Static78.method3298(Static407.anInt7345, Static594.anInt10310, Static418.anInt7466) - Static448.anInt10232;
		}
		Static481.anInt8356 = -1;
		Static357.anInt6345 = -1;
		Static188.anInt4080 = 2;
	}
}
