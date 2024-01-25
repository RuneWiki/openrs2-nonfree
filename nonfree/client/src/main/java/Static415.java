import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
	public static int anInt6935 = -1;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLclient!qi;I)Lclient!a;")
	public static Class1 method5446(@OriginalArg(1) Class24_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1 local7;
		if (Static4.aClass1_8 == null) {
			local7 = new Class1();
		} else {
			local7 = Static4.aClass1_8;
			Static4.aClass1_8 = Static4.aClass1_8.aClass1_1;
			local7.aClass1_1 = null;
			Static92.anInt1933--;
		}
		local7.anInt1 = arg1;
		local7.aClass24_Sub3_1 = arg0;
		return local7;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
	public static void method5448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 + arg5;
		@Pc(14) int local14 = arg1 - arg5;
		for (@Pc(16) int local16 = arg3; local16 < local9; local16++) {
			Static212.method3267(arg4, arg0, arg2, Class10_Sub10_Sub1.lb[local16]);
		}
		@Pc(38) int local38 = arg0 - arg5;
		for (@Pc(40) int local40 = arg1; local40 > local14; local40--) {
			Static212.method3267(arg4, arg0, arg2, Class10_Sub10_Sub1.lb[local40]);
		}
		@Pc(62) int local62 = arg5 + arg4;
		for (@Pc(71) int local71 = local9; local71 <= local14; local71++) {
			@Pc(77) int[] local77 = Class10_Sub10_Sub1.lb[local71];
			Static212.method3267(arg4, local62, arg2, local77);
			Static212.method3267(local38, arg0, arg2, local77);
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(ILclient!nn;)Ljava/lang/String;")
	public static String method5451(@OriginalArg(1) Class10_Sub8 arg0) {
		return Static310.method4281(arg0);
	}
}
