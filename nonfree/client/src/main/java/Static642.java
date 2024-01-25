import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public static int anInt9853 = -1;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_145 = new Class349(56, -1);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_191 = new Class225(24, -2);

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt9855 = 0;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
	public static boolean aBoolean840 = false;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
	public static void method8685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static172.anInt2988; local7++) {
			@Pc(13) Rectangle local13 = Class11_Sub12.aRectangleArray1[local7];
			if (arg1 < local13.width + local13.x && local13.x < arg3 + arg1 && local13.height + local13.y > arg2 && arg2 + arg0 > local13.y) {
				Static537.aBooleanArray25[local7] = true;
			}
		}
		Static5.method72(arg0 + arg2, arg2, arg1 + arg3, arg1);
	}
}
