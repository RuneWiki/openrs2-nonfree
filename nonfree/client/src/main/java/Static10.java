import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "Lclient!in;")
	public static Class157 aClass157_5;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
	public static int anInt160 = -1;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIII)V")
	public static void method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static118.anIntArrayArray13 != null) {
			Static118.anIntArrayArray13[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static15.aShortArrayArray1 != null) {
			Static15.aShortArrayArray1[arg0][arg1] = (short) arg3;
		}
		if (Static98.aByteArrayArray6 != null) {
			Static98.aByteArrayArray6[arg0][arg1] = (byte) arg4;
		}
	}
}
