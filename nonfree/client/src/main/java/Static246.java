import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
	public static int anInt4876;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
	public static int[] anIntArray478 = new int[50];

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[I")
	public static int[] anIntArray479 = new int[2048];

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt4875 = 2301979;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIILclient!ml;IJ)Z")
	public static boolean method3904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static84.method1512(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}
}
