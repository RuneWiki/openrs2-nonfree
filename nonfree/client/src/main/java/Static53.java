import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "[I")
	public static final int[] anIntArray45 = new int[14];

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	public static int anInt975 = 0;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
	public static void method826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static223.anIntArrayArray91 != null) {
			Static223.anIntArrayArray91[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static106.aByteArrayArray14 != null) {
			Static106.aByteArrayArray14[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static132.aByteArrayArray16 != null) {
			Static132.aByteArrayArray16[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public static void method827(@OriginalArg(1) int arg0) {
		Static63.anInt1127 = arg0;
		Static23.aClass167_7.method3390();
	}
}
