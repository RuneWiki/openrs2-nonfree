import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	public static int anInt155;

	@OriginalMember(owner = "client!aga", name = "D", descriptor = "Lclient!fia;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!aga", name = "E", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!aga", name = "F", descriptor = "I")
	public static int anInt158;

	@OriginalMember(owner = "client!aga", name = "G", descriptor = "[B")
	public static byte[] aByteArray2;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIII)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static303.anInt9951 <= arg3 && Static408.anInt6951 >= arg2 && Static255.anInt4818 <= arg1 && Static658.anInt10079 >= arg4) {
			Static557.method7625(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static133.method2280(arg1, arg0, arg4, arg2, arg3);
		}
	}
}
