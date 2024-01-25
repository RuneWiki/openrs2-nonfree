import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "Lclient!om;")
	public static Class246 aClass246_101;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public static final int anInt4103 = 1339;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Z")
	public static boolean aBoolean317 = false;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIZI)V")
	public static void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static591.anInt9382; local3++) {
			@Pc(9) Rectangle local9 = Class55_Sub2_Sub1.aRectangleArray1[local3];
			if (local9.width + local9.x > arg1 && arg3 + arg1 > local9.x && local9.height + local9.y > arg2 && local9.y < arg0 + arg2) {
				Static97.aBooleanArray4[local3] = true;
			}
		}
	}
}
