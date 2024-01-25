import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static550 {

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "Lclient!nd;")
	public static Class238 aClass238_250;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	public static int anInt8852;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "[I")
	public static final int[] anIntArray658 = new int[32];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB)I")
	public static int method7585(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	public static void method7586() {
		Static582.anInt9501 = 200;
		Static132.anInt2866 = (int) ((double) Static456.anInt7428 * 34.46D);
		Static132.anInt2866 <<= 0x2;
		if (Static141.aClass13_27.method8152()) {
			Static132.anInt2866 += 512;
		}
		Static560.method7863(false);
	}
}
