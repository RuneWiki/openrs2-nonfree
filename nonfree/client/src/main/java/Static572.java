import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!sba", name = "O", descriptor = "I")
	public static int anInt9041;

	@OriginalMember(owner = "client!sba", name = "L", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_135 = new Class349(81, 12);

	@OriginalMember(owner = "client!sba", name = "T", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_172 = new Class225(22, -1);

	@OriginalMember(owner = "client!sba", name = "K", descriptor = "Lclient!rh;")
	public static final Class323 aClass323_5 = new Class323();

	@OriginalMember(owner = "client!sba", name = "D", descriptor = "[I")
	public static final int[] anIntArray659 = new int[5];

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(III)V")
	public static void method7965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static632.aClass311ArrayArrayArray3[0][arg1][arg2] != null && Static632.aClass311ArrayArrayArray3[0][arg1][arg2].aClass311_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static632.aClass311ArrayArrayArray3[local25][arg1][arg2] == null) {
				@Pc(47) Class311 local47 = Static632.aClass311ArrayArrayArray3[local25][arg1][arg2] = new Class311(local25);
				if (local23) {
					local47.aByte118++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIBIIIII)V")
	public static void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg2) {
			Static170.method2542(arg0, arg4, arg6, arg5, arg3, arg1);
		} else if (Static8.anInt99 <= arg4 - arg1 && Static14.anInt206 >= arg1 + arg4 && arg5 - arg2 >= Static617.anInt9501 && Static519.anInt8267 >= arg5 + arg2) {
			Static376.method5447(arg5, arg1, arg0, arg6, arg4, arg2, arg3);
		} else {
			Static578.method8063(arg0, arg4, arg1, arg5, arg2, arg3, arg6);
		}
	}
}
