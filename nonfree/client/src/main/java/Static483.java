import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
	public static int anInt8236;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray68;

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_138 = new Class337(20, 6);

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method7166(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = local6 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (local22 - 2 >= local6 || Static193.method7306(arg0.charAt(local22 - 2)) == -1) {
			local28 -= 2;
		} else if (local6 <= local22 - 1 || Static193.method7306(arg0.charAt(local22 - 1)) == -1) {
			local28--;
		}
		@Pc(67) byte[] local67 = new byte[local28];
		Static99.method1614(local67, 0, arg0);
		return local67;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7167(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static517.aClass34Array5[Static274.anInt4914++] = new Class34(4, arg3, arg2, arg6, arg6, arg2, arg4, arg5, arg5, arg4, arg1, arg1, arg0, arg0);
	}
}
