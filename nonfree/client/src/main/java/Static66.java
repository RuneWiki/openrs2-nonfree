import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cfa", name = "I", descriptor = "Lclient!hu;")
	public static Class157 aClass157_2;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIII)V")
	public static void method1452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static463.anInt7418; local12++) {
			@Pc(18) Rectangle local18 = Class4_Sub5_Sub21.aRectangleArray2[local12];
			if (arg1 < local18.width + local18.x && arg1 + arg3 > local18.x && local18.height + local18.y > arg2 && local18.y < arg2 + arg0) {
				Static109.aBooleanArray4[local12] = true;
			}
		}
		Static100.method2025(arg2, arg3 + arg1, arg1, arg2 + arg0);
	}
}
