import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!pia", name = "I", descriptor = "[Lclient!uv;")
	public static Class344[] aClass344Array1;

	@OriginalMember(owner = "client!pia", name = "J", descriptor = "I")
	public static int anInt7587;

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
	public static int anInt7572 = -1;

	@OriginalMember(owner = "client!pia", name = "m", descriptor = "[I")
	public static final int[] anIntArray455 = new int[8];

	@OriginalMember(owner = "client!pia", name = "n", descriptor = "Lclient!cj;")
	public static final Class54 aClass54_7 = new Class54();

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIZII)V")
	public static void method6607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg2; local7++) {
			Static82.method1400(arg4, arg1, arg0, Static71.anIntArrayArray5[local7]);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII)V")
	public static void method6611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static453.anInt7674; local3++) {
			@Pc(9) Rectangle local9 = Class18_Sub3.aRectangleArray1[local3];
			if (local9.x + local9.width > arg2 && arg2 + arg1 > local9.x && arg3 < local9.height + local9.y && arg3 + arg0 > local9.y) {
				Static356.aBooleanArray21[local3] = true;
			}
		}
		Static304.method7235(arg2 + arg1, arg0 + arg3, arg2, arg3);
	}
}
