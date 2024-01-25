import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static447 {

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!mj;")
	public static Class238 aClass238_13;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_195 = new Class381(27, 1);

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt7320 = -2;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIBI)V")
	public static void method6378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static230.anInt3962 <= arg4 - arg1 && Static463.anInt7530 >= arg1 + arg4 && arg3 - arg1 >= Static573.anInt8986 && arg3 + arg1 <= Static319.anInt5445) {
			Static318.method4872(arg3, arg4, arg0, arg2, arg1, arg5);
		} else {
			Static109.method8574(arg4, arg2, arg0, arg3, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)[Lclient!jk;")
	public static Class189[] method6379() {
		return new Class189[] { Static512.aClass189_11, Static33.aClass189_1, Static411.aClass189_10 };
	}
}
