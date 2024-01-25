import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "[I")
	public static int[] anIntArray132;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "Lclient!kn;")
	public static Class140 aClass140_2 = new Class140();

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "[I")
	public static final int[] anIntArray133 = new int[250];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Z")
	public static boolean method1913(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Z")
	public static boolean method1914() {
		if (Static348.aBoolean387) {
			try {
				Static471.method4680("showVideoAd", Static7.aClass93_1.anApplet1);
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBIIII)V")
	public static void method1916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 - arg1 >= Static3.anInt45 && Static112.anInt1900 >= arg1 + arg2 && arg4 - arg1 >= Static356.anInt5817 && Static3.anInt46 >= arg1 + arg4) {
			Static62.method990(arg2, arg4, arg0, arg3, arg5, arg1);
		} else {
			Static396.method5141(arg3, arg0, arg4, arg2, arg5, arg1);
		}
	}
}
