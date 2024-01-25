import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
	public static void method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static32.anIntArrayArray3 != null) {
			Static32.anIntArrayArray3[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static392.aShortArrayArray14 != null) {
			Static392.aShortArrayArray14[arg0][arg1] = (short) arg3;
		}
		if (Static50.aByteArrayArray2 != null) {
			Static50.aByteArrayArray2[arg0][arg1] = (byte) arg4;
		}
	}
}
