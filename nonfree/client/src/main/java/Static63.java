import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
	public static int anInt978;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array3;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
	public static int anInt976 = 0;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
	public static int anInt981 = 0;

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
	public static int anInt982 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Z")
	public static boolean method856(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIIIILclient!za;I[[[BIII)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class117 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg1 == 0 || arg9 == 0) {
			return;
		}
		if (arg1 == 9) {
			arg1 = 1;
			arg4 = arg4 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg1 = 1;
			arg4 = arg4 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg4 = arg4 + 3 & 0x3;
			arg1 = 8;
		}
		arg6.K(arg10, arg2, arg0, arg5, arg3, arg11, arg8[arg1 - 1][arg4], arg9, arg7);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZLclient!la;Ljava/lang/String;B)V")
	public static void method859(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) String arg2) {
		@Pc(29) int local29 = Static392.aClass252_121.method5296(250, arg2, null);
		@Pc(38) int local38 = Static392.aClass252_121.method5292(250, arg2, null) * 13;
		Static186.aClass117_3.P(6, 6, local29 + 8, local38 + 4 + 4, -16777216, 0);
		Static186.aClass117_3.method5690(6, 6, local29 + 4 + 4, local38 - -4 + 4, -1, 0);
		arg1.method4595(local38, -1, 10, 1, -1, null, 10, 0, local29, null, 0, null, arg2);
		Static171.method2271(6, 6, local38 + 8, local29 + 8);
		if (arg0) {
			Static186.aClass117_3.method5698();
		}
	}
}
