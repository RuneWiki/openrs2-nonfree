import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!ps;")
	public static Class163 aClass163_10;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
	public static final int[] anIntArray272 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V")
	public static void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static60.anInt1399 && arg2 + arg0 <= Static138.anInt6334 && arg1 - arg0 >= Static41.anInt1131 && Static165.anInt3409 >= arg0 + arg1) {
			Static111.method1803(arg1, arg2, arg3, arg0);
		} else {
			Static174.method5040(arg0, arg3, arg2, arg1);
		}
	}
}
