import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static274 {

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt5325;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int anInt5326;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public static void method4879(@OriginalArg(1) int arg0) {
		Static253.anInt5163 = -1;
		if (arg0 == 37) {
			Static269.aFloat25 = 3.0F;
		} else if (arg0 == 50) {
			Static269.aFloat25 = 4.0F;
		} else if (arg0 == 75) {
			Static269.aFloat25 = 6.0F;
		} else if (arg0 == 100) {
			Static269.aFloat25 = 8.0F;
		} else if (arg0 == 200) {
			Static269.aFloat25 = 16.0F;
		}
		Static253.anInt5163 = -1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)V")
	public static void method4880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == arg3) {
			Static92.method1929(arg0, arg2, arg1, arg4);
		} else if (arg1 - arg4 >= Static93.anInt5014 && Static122.anInt1360 >= arg1 + arg4 && Static131.anInt2843 <= arg2 - arg3 && Static38.anInt945 >= arg2 + arg3) {
			Static311.method5137(arg0, arg4, arg2, arg1, arg3);
		} else {
			Static50.method1207(arg4, arg0, arg3, arg1, arg2);
		}
	}
}
