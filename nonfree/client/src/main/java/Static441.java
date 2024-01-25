import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_89 = new Class70(78, 8);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "[I")
	public static int[] anIntArray644 = new int[2];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fa;Ljava/awt/Canvas;Lclient!pu;BII)Lclient!r;")
	public static synchronized Class134 method6960(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return Static17.method167(arg1, arg0);
		} else if (arg4 == 2) {
			return Static264.method3790(arg1, arg0);
		} else if (arg4 == 1) {
			return Static512.method7121(arg1, arg3, arg0);
		} else if (arg4 == 5) {
			return Static29.method350(arg0, arg1, arg3, arg2);
		} else if (arg4 == 3) {
			return Static599.method1652(arg2, arg0, arg1, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
