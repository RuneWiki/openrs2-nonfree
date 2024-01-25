import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static499 {

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!td;")
	public static Class24 aClass24_29;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIII)V")
	public static void method7388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static307.anIntArrayArray38 != null) {
			Static307.anIntArrayArray38[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static503.aShortArrayArray15 != null) {
			Static503.aShortArrayArray15[arg0][arg1] = (short) arg3;
		}
		if (Static241.aByteArrayArray12 != null) {
			Static241.aByteArrayArray12[arg0][arg1] = (byte) arg4;
		}
	}
}
