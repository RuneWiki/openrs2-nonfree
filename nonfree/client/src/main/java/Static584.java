import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static584 {

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)Z")
	public static boolean method8078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIII)V")
	public static void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static161.anIntArrayArray14 != null) {
			Static161.anIntArrayArray14[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static225.aShortArrayArray13 != null) {
			Static225.aShortArrayArray13[arg0][arg1] = (short) arg3;
		}
		if (Static312.aByteArrayArray25 != null) {
			Static312.aByteArrayArray25[arg0][arg1] = (byte) arg4;
		}
	}
}
