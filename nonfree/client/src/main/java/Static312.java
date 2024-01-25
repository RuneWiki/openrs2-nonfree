import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!mm", name = "H", descriptor = "Lclient!rl;")
	public static Class256 aClass256_7;

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_52 = new Class236(64, 15);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
	public static void method5066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static2.anIntArrayArray1 != null) {
			Static2.anIntArrayArray1[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static401.aShortArrayArray8 != null) {
			Static401.aShortArrayArray8[arg0][arg1] = (short) arg3;
		}
		if (Static60.aByteArrayArray48 != null) {
			Static60.aByteArrayArray48[arg0][arg1] = (byte) arg4;
		}
	}
}
