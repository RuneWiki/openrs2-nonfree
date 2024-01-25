import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
	public static int anInt1670 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static255.aByteArrayArrayArray13[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static255.aByteArrayArrayArray13[arg0][arg1][arg3] & 0x10) == 0) {
			return Static301.method5298(arg0, arg1, arg3) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLclient!dn;I[[BLclient!ea;[[B[[BBLclient!dn;I[[I[[BI)V")
	public static void method1604(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class55 arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(8) Class51 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11) {
		if (Static342.anInt6605 == 0 && !Static326.aBoolean530) {
			Static75.method1397(arg3, arg8, arg4, arg6, arg0, arg11, arg5, arg9, arg10, arg1, arg2, arg7);
		} else {
			Static196.method3474(arg5, arg3, arg11, arg6, arg9, arg10, arg4, arg8, arg0, arg7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!ea;B)V")
	public static void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2) {
		Static291.aClass55_11 = arg2;
		Static42.aClass65ArrayArray1 = new Class65[arg1][arg0];
		if (Static292.anIntArray240 != null) {
			Static297.aClass54_3 = Static357.method6057(Static292.anIntArray240[1], Static292.anIntArray240[0], Static292.anIntArray240[4], Static292.anIntArray240[3], Static292.anIntArray240[5], Static292.anIntArray240[2]);
		}
		Static322.aClass65_3 = new Class65();
		Static195.method3462();
	}
}
