import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static680 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
	public static void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static503.anIntArrayArray38 != null) {
			Static503.anIntArrayArray38[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static141.aShortArrayArray7 != null) {
			Static141.aShortArrayArray7[arg0][arg1] = (short) arg3;
		}
		if (Static669.aByteArrayArray27 != null) {
			Static669.aByteArrayArray27[arg0][arg1] = (byte) arg4;
		}
	}
}
