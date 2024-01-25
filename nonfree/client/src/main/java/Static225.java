import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!il", name = "k", descriptor = "[I")
	public static final int[] anIntArray303 = new int[50];

	@OriginalMember(owner = "client!il", name = "m", descriptor = "S")
	public static short aShort42 = 205;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIII)V")
	public static void method4047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static376.anInt7071 <= arg5 && Class179_Sub2.lb >= arg1 && Static96.anInt2302 <= arg0 && arg2 <= Static289.anInt5545) {
			if (arg3 == 1) {
				Static66.method1376(arg4, arg0, arg5, arg2, arg1);
			} else {
				Static467.method7192(arg1, arg4, arg3, arg5, arg0, arg2);
			}
		} else if (arg3 == 1) {
			Static216.method3978(arg0, arg4, arg5, arg2, arg1);
		} else {
			Static371.method5915(arg4, arg2, arg1, arg3, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static376.anInt7071 && Class179_Sub2.lb >= arg3 && Static96.anInt2302 <= arg2 && arg4 <= Static289.anInt5545) {
			Static111.method2283(arg2, arg6, arg0, arg5, arg4, arg1, arg3);
		} else {
			Static553.method7875(arg3, arg1, arg2, arg5, arg0, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III[B)I")
	public static int method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local7 = Class6_Sub1_Sub24.anIntArray538[(arg2[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
	public static boolean method4050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZI)Z")
	public static boolean method4052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static52.method1233(arg1, arg0) || Static401.method6295(arg0, arg1);
	}
}
