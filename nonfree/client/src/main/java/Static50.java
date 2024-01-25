import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	public static int anInt1005 = 0;

	@OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!raa;)I")
	public static int method842(@OriginalArg(0) int arg0, @OriginalArg(2) Class295 arg1) {
		if (!Static75.method1286(arg1).method6705(arg0) && arg1.anObjectArray21 == null) {
			return -1;
		} else if (arg1.anIntArray448 == null || arg1.anIntArray448.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray448[arg0];
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIBII)V")
	public static void method843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static275.anInt4919 && Static529.anInt9089 >= arg1 && arg2 >= Static554.anInt9362 && arg3 <= Static62.anInt1300) {
			Static291.method4570(arg3, arg4, arg1, arg2, arg0);
		} else {
			Static312.method8954(arg4, arg1, arg0, arg3, arg2);
		}
	}
}
