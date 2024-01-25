import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!pe;")
	public static Class254 aClass254_50;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "Z")
	public static boolean aBoolean260 = true;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!ta;Lclient!fa;IIILclient!sga;IIILclient!tc;Ljava/lang/String;)V")
	public static void method2968(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class297 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class305 arg9, @OriginalArg(11) String arg10) {
		@Pc(15) int local15;
		if (Static267.anInt5668 == 4) {
			local15 = (int) Static533.aFloat188 & 0x3FFF;
		} else {
			local15 = Static288.anInt5964 + (int) Static533.aFloat188 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg9.anInt9242 / 2, arg9.anInt9160 / 2) + 10;
		@Pc(41) int local41 = arg5 * arg5 + arg0 * arg0;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(60) int local60 = Class2_Sub3.anIntArray620[local15];
		@Pc(64) int local64 = Class2_Sub3.anIntArray621[local15];
		if (Static267.anInt5668 != 4) {
			local64 = local64 * 256 / (Static66.anInt1706 + 256);
			local60 = local60 * 256 / (Static66.anInt1706 + 256);
		}
		@Pc(93) int local93 = arg0 * local60 + local64 * arg5 >> 14;
		@Pc(104) int local104 = arg0 * local64 - local60 * arg5 >> 14;
		@Pc(111) int local111 = arg6.method7312(null, 100, arg10);
		@Pc(117) int local117 = local93 - local111 / 2;
		@Pc(125) int local125 = arg6.method7318(0, 100, arg10, null);
		if (local117 >= -arg9.anInt9242 && arg9.anInt9242 >= local117 && -arg9.anInt9160 <= local104 && local104 <= arg9.anInt9160) {
			arg1.method6688(arg3, arg4, 50, arg9.anInt9160 / 2 + arg3 - arg8 - local104 - local125, arg9.anInt9242 / 2 + local117 + arg7, 0, arg10, arg2, null, 0, null, arg7, local111, 1, 0);
		}
	}
}
