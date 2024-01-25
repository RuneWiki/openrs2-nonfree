import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "Z")
	public static boolean aBoolean637 = false;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "D")
	public static double aDouble11 = -1.0D;

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public static int anInt8247 = 0;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
	public static int anInt8249 = 0;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I")
	public static int method6931() {
		@Pc(7) int local7 = Static458.aClass281_23.method6260();
		if (local7 < Static22.aClass281Array1.length - 1) {
			Static458.aClass281_23 = Static22.aClass281Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method6932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method6933(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 512 || arg2 < 512 || (Static400.anInt6818 - 2) * 512 < arg0 || Static271.anInt5050 * 512 - 1024 < arg2) {
			Static449.anIntArray577[0] = Static449.anIntArray577[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static130.method2562(arg2, arg1, arg0) - arg4;
		Static328.aClass109_5.U(arg6, 0, 0);
		Static4.aClass43_1.method7187(Static328.aClass109_5);
		Static4.aClass43_1.AA(arg0, local51, arg2, Static449.anIntArray577);
		Static328.aClass109_5.U(-arg6, 0, 0);
		Static4.aClass43_1.method7187(Static328.aClass109_5);
	}
}
