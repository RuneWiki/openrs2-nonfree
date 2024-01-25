import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	public static int anInt5424;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_251 = new Class22(55, 2);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIBII)Z")
	public static boolean method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static79.aByteArrayArrayArray2[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static79.aByteArrayArrayArray2[arg2][arg0][arg3] & 0x10) == 0) {
			return Static233.method3479(arg3, arg2, arg0) == arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	public static void method4165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static112.method2034(arg0)) {
			Static48.method790(arg1, Static297.aClass247ArrayArray2[arg0]);
		}
	}
}
