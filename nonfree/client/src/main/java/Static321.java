import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt4799 = 0;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_41 = new Class116();

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "Lclient!an;")
	public static Interface2 anInterface2_5 = null;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII[[[BIIIIBILclient!vq;I)V")
	public static void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class47 arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg6 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 10) {
			arg0 = arg0 + 3 & 0x3;
			arg2 = 1;
		}
		if (arg2 == 11) {
			arg0 = arg0 + 3 & 0x3;
			arg2 = 8;
		}
		arg10.method2685(arg3, arg9, arg11, arg8, arg5, arg7, arg4[arg2 - 1][arg0], arg6, arg1);
	}
}
