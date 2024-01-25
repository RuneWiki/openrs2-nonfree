import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bca", name = "u", descriptor = "Lclient!n;")
	public static Interface8 anInterface8_6;

	@OriginalMember(owner = "client!bca", name = "v", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray5;

	@OriginalMember(owner = "client!bca", name = "p", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_14 = new Class6(51, 2);

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "Lclient!vp;")
	public static Class309 aClass309_2 = null;

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "Lclient!gf;")
	public static final Class102 aClass102_1 = new Class102();

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "[B")
	public static final byte[] aByteArray12 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!bca", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString5 = "";

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIILclient!qa;IIZI[[[BI)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg4 == 0 || arg1 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg4 = 1;
			arg9 = arg9 + 1 & 0x3;
		}
		if (arg4 == 10) {
			arg4 = 1;
			arg9 = arg9 + 3 & 0x3;
		}
		if (arg4 == 11) {
			arg4 = 8;
			arg9 = arg9 + 3 & 0x3;
		}
		arg6.za(arg2, arg11, arg5, arg0, arg8, arg3, arg10[arg4 - 1][arg9], arg1, arg7);
	}
}
