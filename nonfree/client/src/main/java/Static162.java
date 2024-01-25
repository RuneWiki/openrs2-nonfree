import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static162 {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
	public static int anInt7993;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Lclient!gb;")
	public static Class98 aClass98_11;

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(III)Z")
	public static boolean method6797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static34.method1307(arg1, arg0) | (arg0 & 0x60000) != 0 || Static50.method7746(arg0, arg1) || Static530.method7542(arg1, arg0);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
	public static void method6803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static184.anIntArrayArray32 != null) {
			Static184.anIntArrayArray32[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static184.aShortArrayArray3 != null) {
			Static184.aShortArrayArray3[arg0][arg1] = (short) arg3;
		}
		if (Static39.aByteArrayArray7 != null) {
			Static39.aByteArrayArray7[arg0][arg1] = (byte) arg4;
		}
	}
}
