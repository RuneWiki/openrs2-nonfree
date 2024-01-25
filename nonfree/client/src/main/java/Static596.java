import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static596 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIII)V")
	public static void method747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static114.anIntArrayArray59 != null) {
			Static114.anIntArrayArray59[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static535.aShortArrayArray12 != null) {
			Static535.aShortArrayArray12[arg0][arg1] = (short) arg3;
		}
		if (Static548.aByteArrayArray32 != null) {
			Static548.aByteArrayArray32[arg0][arg1] = (byte) arg4;
		}
	}
}
