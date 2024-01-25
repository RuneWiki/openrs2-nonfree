import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	public static int anInt6830;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	public static int anInt6831 = -1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
	public static void method5356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static283.anIntArrayArray32 != null) {
			Static283.anIntArrayArray32[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static376.aByteArrayArray26 != null) {
			Static376.aByteArrayArray26[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static152.aByteArrayArray13 != null) {
			Static152.aByteArrayArray13[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method5361(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static153.method3782(arg0.length - 1, arg0, arg1, 0);
	}
}
