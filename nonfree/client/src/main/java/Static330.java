import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_102 = new Class239(103, 11);

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_55 = new Class243(7, 7);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBLjava/lang/String;)I")
	public static int method3992(@OriginalArg(2) String arg0) {
		return Static523.method7571(arg0, 16);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIBII)V")
	public static void method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static528.anInt9120; local7++) {
			@Pc(13) Rectangle local13 = Class96.aRectangleArray1[local7];
			if (arg1 < local13.x + local13.width && arg1 + arg2 > local13.x && arg3 < local13.y + local13.height && local13.y < arg0 + arg3) {
				Static368.aBooleanArray32[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public static void method3998() {
		Static491.aBoolean575 = true;
	}
}
