import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!da;")
	public static Class34 aClass34_7;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "Lclient!ofa;")
	public static Class240 aClass240_3;

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
	public static int anInt6963;

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "[I")
	public static final int[] anIntArray333 = new int[16];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIB)Z")
	public static boolean method5818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static211.aBoolean331 || !Static260.aBoolean441) {
			return false;
		} else if (Static8.anInt519 < 100) {
			return false;
		} else if (Static267.method4826(arg0, arg1, arg2)) {
			@Pc(34) int local34 = arg2 << Static606.anInt10280;
			@Pc(38) int local38 = arg1 << Static606.anInt10280;
			if (Static406.method6366(Static148.aClass245Array1[arg0].method7583(arg1, arg2), Static190.anInt4138, arg3, Static190.anInt4138, local38, local34)) {
				Static528.anInt9204++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)Z")
	public static boolean method5819() {
		if (Static296.aBoolean473) {
			try {
				Static651.method5913("showVideoAd", Static635.anApplet2);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
