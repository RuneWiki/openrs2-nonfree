import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eha", name = "f", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_33 = new Class274(99, 8);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIII)V")
	public static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static320.anInt5804; local1++) {
			@Pc(6) Rectangle local6 = Class2_Sub5_Sub21.aRectangleArray2[local1];
			if (arg1 < local6.width + local6.x && local6.x < arg1 + arg0 && arg3 < local6.height + local6.y && arg3 + arg2 > local6.y) {
				Static618.aBooleanArray50[local1] = true;
			}
		}
		Static233.method3884(arg3 + arg2, arg3, arg1, arg0 + arg1);
	}
}
