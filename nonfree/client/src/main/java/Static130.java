import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "Lclient!ea;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
	public static int anInt2597;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "Lclient!tk;")
	public static Class159 aClass159_11;

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
	public static int anInt2600 = -2;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIILclient!eh;IJ)Z")
	public static boolean method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class36 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static34.method537(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public static void method2092() {
		Static271.anInt5345++;
	}
}
