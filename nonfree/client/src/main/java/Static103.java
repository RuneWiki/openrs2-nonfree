import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[Lclient!s;")
	public static Class65[] aClass65Array3;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_15 = new Class169(20);

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public static int anInt2856 = -1;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public static int anInt2857 = -1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void method2668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg0 < arg1) {
			for (local15 = arg0; local15 < arg1; local15++) {
				Static208.anIntArrayArray20[local15][arg2] = arg3;
			}
		} else {
			for (local15 = arg1; local15 < arg0; local15++) {
				Static208.anIntArrayArray20[local15][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZII)V")
	public static void method2669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static511.anInt9364; local7++) {
			@Pc(13) Rectangle local13 = Class272.aRectangleArray2[local7];
			if (arg2 < local13.width + local13.x && arg0 + arg2 > local13.x && arg1 < local13.height + local13.y && arg3 + arg1 > local13.y) {
				Static60.aBooleanArray9[local7] = true;
			}
		}
		Static113.method2842(arg2, arg2 + arg0, arg1, arg1 + arg3);
	}
}
