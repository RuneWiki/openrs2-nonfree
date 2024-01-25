import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "Lclient!ir;")
	public static Class100 aClass100_55;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public static int anInt2573;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIB)V")
	public static void method2093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static19.anInt533 <= arg3 - arg2 && arg2 + arg3 <= Static4.anInt75 && arg1 - arg2 >= Static236.anInt4721 && arg1 + arg2 <= Static73.anInt1425) {
			Static295.method5003(arg2, arg3, arg0, arg1);
		} else {
			Static29.method588(arg2, arg3, arg0, arg1);
		}
	}
}
