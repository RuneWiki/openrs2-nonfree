import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cs", name = "N", descriptor = "I")
	public static int anInt1094 = -1;

	@OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
	public static int anInt1097 = 0;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!jj;IILclient!ae;Lclient!nd;IILclient!li;)V")
	public static void method1187(@OriginalArg(0) Class98 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) Class2_Sub31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class120 arg6) {
		@Pc(15) int local15 = arg3.anInt4060 - arg5 / 2 - 5;
		@Pc(19) int local19 = arg1 + 2;
		if (arg6.anInt3653 != 0) {
			arg2.method4261(local19, local15, arg4 * arg0.method2965() + arg1 + 1 - local19, arg5 + 10, arg6.anInt3653);
		}
		if (arg6.anInt3643 != 0) {
			arg2.method4300(arg6.anInt3643, arg1 + arg0.method2965() * arg4 + 1 - local19, arg5 + 10, local19, local15);
		}
		@Pc(80) int local80 = arg6.anInt3663;
		if (arg3.aBoolean363 && arg6.anInt3667 != -1) {
			local80 = arg6.anInt3667;
		}
		for (@Pc(92) int local92 = 0; local92 < arg4; local92++) {
			@Pc(98) String local98 = Static6.aStringArray1[local92];
			if (arg4 - 1 > local92) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg0.method2963(arg2, local98, arg3.anInt4060, arg1, local80);
			arg1 += arg0.method2965();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
	public static void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static70.anInt1524 == 1) {
			Static355.aClass31Array19[Static164.anInt3283 / 100].method4377(Static79.anInt1737 - 8, Static301.anInt5016 + -8);
		}
		if (Static70.anInt1524 == 2) {
			Static355.aClass31Array19[Static164.anInt3283 / 100 + 4].method4377(Static79.anInt1737 - 8, Static301.anInt5016 + -8);
		}
		Static167.method3155();
	}
}
