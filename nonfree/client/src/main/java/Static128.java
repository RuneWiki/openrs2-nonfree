import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public static int anInt3496;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public static int anInt3498 = 0;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_49 = new Class89(64);

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public static int anInt3500 = -1;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_968 = Static158.method3034("Service unavailable)3");

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_967 = aClass60_968;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIZII)V")
	public static void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg6 < 1 || arg3 > 102 || arg6 > 102) {
			return;
		}
		if (Static8.aBoolean3 && arg4 != Static62.anInt1923) {
			return;
		}
		@Pc(34) int local34 = arg4;
		if (arg4 < 3 && (Static147.aByteArrayArrayArray36[1][arg3][arg6] & 0x2) == 2) {
			local34 = arg4 + 1;
		}
		Static175.method3272(arg4, local34, arg3, Static48.aClass35Array1[arg4], arg1, arg6);
		if (arg5 >= 0) {
			Static7.method3558(arg2, arg3, arg5, arg4, false, arg6, local34, arg0, false, Static48.aClass35Array1[arg4]);
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
	public static boolean method2704(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IJ)V")
	public static void method2705(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static7.aClass2_Sub3_Sub1_43.method244(82);
			Static7.aClass2_Sub3_Sub1_43.method205(arg0);
		}
	}
}
