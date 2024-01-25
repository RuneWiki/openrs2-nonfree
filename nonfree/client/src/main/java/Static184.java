import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!ij;")
	public static Class93 aClass93_113;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_123 = new Class85("flash1:", "", "", "");

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)I")
	public static int method5032(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public static void method5033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) int local6 = 0; local6 < Static66.anInt5818; local6++) {
			@Pc(11) Rectangle local11 = Class4_Sub3_Sub2.aRectangleArray2[local6];
			if (local11.width + local11.x > arg0 && arg2 + arg0 > local11.x && local11.y + local11.height > arg3 && local11.y < arg3 + arg1) {
				Static287.aBooleanArray23[local6] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public static void method5035() {
		Static115.aClass109_26.method2858();
		Static37.aClass109_10.method2858();
	}
}
