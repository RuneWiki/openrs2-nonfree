import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_84 = new Class130(33, -1);

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
	public static int anInt5359 = 0;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
	public static int anInt5362 = 1;

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
	public static int anInt5364 = 0;

	@OriginalMember(owner = "client!kr", name = "v", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_9 = new Class337(4, 2);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II[[[BIIIIIIIILclient!ha;I)V")
	public static void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class5 arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg0 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg8 = arg8 + 3 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 11) {
			arg6 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		arg10.Q(arg5, arg9, arg3, arg1, arg4, arg7, arg2[arg6 - 1][arg8], arg0, arg11);
	}
}
