import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
	public static final int[] anIntArray8 = new int[16];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
	public static void method71(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) Class188 local9 = Static17.aClass188Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static17.aClass188Array1[local11] = Static17.aClass188Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class188(arg6, arg2, arg3, arg0, arg4, arg5, arg1);
		} else {
			local9.method4481(arg4, arg5, arg1, arg2, arg3, arg0, arg6);
		}
		Static188.anInt3791 = Static446.anInt7635;
		Static190.anInt3813++;
		Static17.aClass188Array1[0] = local9;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Lclient!vv;")
	public static Class82_Sub1 method72(@OriginalArg(0) int arg0) {
		return Static445.aBoolean559 && arg0 >= Static11.anInt210 && arg0 <= Static174.anInt3434 ? Static128.aClass82_Sub1Array5[arg0 - Static11.anInt210] : null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Z")
	public static boolean method75(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class4_Sub14 local10 = (Class4_Sub14) Static289.aClass91_31.method2584(); local10 != null; local10 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			if (Static258.method3303(local10.anInt2132) && local10.aLong69 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
