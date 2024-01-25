import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static581 {

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)V")
	public static void method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static356.anIntArrayArray72 != null) {
			Static356.anIntArrayArray72[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static348.aShortArrayArray5 != null) {
			Static348.aShortArrayArray5[arg0][arg1] = (short) arg3;
		}
		if (Static216.aByteArrayArray9 != null) {
			Static216.aByteArrayArray9[arg0][arg1] = (byte) arg4;
		}
	}
}
