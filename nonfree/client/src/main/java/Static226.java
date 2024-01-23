import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "[Lclient!gh;")
	public static Class58[] aClass58Array3;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
	public static int anInt4572;

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "[S")
	public static short[] aShortArray75;

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "Lclient!nn;")
	public static Class119 aClass119_7;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "Z")
	public static boolean aBoolean286 = true;

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "[I")
	public static int[] anIntArray370 = new int[100];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)V")
	public static void method3571(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)I")
	public static int method3573(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIIIBII)V")
	public static void method3574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class4_Sub9 local7 = new Class4_Sub9();
		local7.anInt1059 = arg3;
		local7.anInt1060 = arg2;
		local7.anInt1064 = arg0;
		local7.anInt1053 = arg6;
		local7.anInt1063 = arg10;
		local7.anInt1062 = arg5;
		local7.anInt1057 = arg9;
		local7.anInt1065 = arg7;
		local7.anInt1067 = arg11;
		local7.anInt1055 = arg4;
		local7.anInt1068 = arg8;
		local7.anInt1058 = arg1;
		Static95.aClass17_15.method619(local7);
	}
}
