import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "[Lclient!li;")
	public static Class160[] aClass160Array1;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "Z")
	public static boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_43 = new Class231("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
	public static int anInt2069 = 100;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIBII)I")
	public static int method1962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg2;
			arg2 = local14;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return 7 + 1 - arg1 - arg2;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BIIIII)V")
	public static void method1964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static355.method4986(arg1, arg0, arg2, arg4);
		} else if (Static347.anInt6160 <= arg0 - arg4 && Static385.anInt6686 >= arg4 + arg0 && arg2 - arg3 >= Static118.anInt2005 && arg3 + arg2 <= anInt2069) {
			Static196.method2786(arg3, arg1, arg4, arg2, arg0);
		} else {
			Static64.method1052(arg3, arg2, arg0, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIIIIII)V")
	public static void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static301.method3387(anInt2069, Static118.anInt2005, arg0);
		@Pc(17) int local17 = Static301.method3387(anInt2069, Static118.anInt2005, arg5);
		@Pc(23) int local23 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg2);
		@Pc(29) int local29 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3);
		@Pc(38) int local38 = Static301.method3387(anInt2069, Static118.anInt2005, arg0 + arg1);
		@Pc(47) int local47 = Static301.method3387(anInt2069, Static118.anInt2005, arg5 - arg1);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static215.method3035(local23, local29, Static46.anIntArrayArray24[local49], arg4);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static215.method3035(local23, local29, Static46.anIntArrayArray24[local69], arg4);
		}
		@Pc(95) int local95 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg1 + arg2);
		@Pc(104) int local104 = Static301.method3387(Static385.anInt6686, Static347.anInt6160, arg3 - arg1);
		for (@Pc(106) int local106 = local38; local106 <= local47; local106++) {
			@Pc(112) int[] local112 = Static46.anIntArrayArray24[local106];
			Static215.method3035(local23, local95, local112, arg4);
			Static215.method3035(local104, local29, local112, arg4);
		}
	}
}
