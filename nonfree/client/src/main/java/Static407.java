import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static407 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!kk;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
	public static int anInt7439 = -1;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
	public static final int[] anIntArray502 = new int[64];

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
	public static final int[] anIntArray503 = new int[2];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIILclient!ha;IIIII[[[B)V")
	public static void method6257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg8 == 0 || arg7 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg1 = arg1 + 1 & 0x3;
			arg8 = 1;
		}
		if (arg8 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg8 = 1;
		}
		if (arg8 == 11) {
			arg1 = arg1 + 3 & 0x3;
			arg8 = 8;
		}
		arg5.Q(arg10, arg0, arg2, arg4, arg3, arg6, arg11[arg8 - 1][arg1], arg7, arg9);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!eo;Z)V")
	public static void method6258(@OriginalArg(0) Class11_Sub3 arg0) {
		arg0.aClass11_Sub1_Sub1_Sub2_1 = null;
		if (Static490.anInt8356 < 20) {
			Static600.aClass143_9.method3529(arg0);
			Static490.anInt8356++;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)Z")
	public static boolean method6262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
