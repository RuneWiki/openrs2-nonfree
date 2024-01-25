import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	public static int anInt4282;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_91 = new Class180(37, -1);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILclient!el;IIII)Z")
	public static boolean method3906(@OriginalArg(0) int arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static237.aBoolean328 || !Static665.aBoolean805) {
			return false;
		} else if (Static293.anInt4968 < 100) {
			return false;
		} else if (arg0 != arg5 || arg2 != arg3) {
			for (@Pc(46) int local46 = arg5; local46 <= arg0; local46++) {
				for (@Pc(50) int local50 = arg2; local50 <= arg3; local50++) {
					if (Static282.anIntArrayArrayArray15[arg4][local46][local50] == -Static100.anInt1840) {
						return false;
					}
				}
			}
			if (Static198.method9278(arg1)) {
				Static627.anInt10013++;
				return true;
			} else {
				return false;
			}
		} else if (!Static304.method4669(arg5, arg2, arg4)) {
			return false;
		} else if (Static198.method9278(arg1)) {
			Static627.anInt10013++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg5) {
			Static633.method8835(arg6, arg5, arg4, arg1, arg0, arg2);
		} else if (arg6 - arg5 >= Static7.anInt93 && Static115.anInt2377 >= arg6 + arg5 && Static374.anInt5986 <= arg4 - arg3 && arg3 + arg4 <= Static84.anInt1667) {
			Static349.method4825(arg4, arg2, arg6, arg0, arg1, arg5, arg3);
		} else {
			Static611.method8670(arg5, arg2, arg0, arg6, arg4, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
	public static void method3909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static62.anInt1251 != arg0) {
			Static239.anIntArray394 = new int[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				Static239.anIntArray394[local15] = (local15 << 12) / arg0;
			}
			Static302.anInt5067 = arg0 - 1;
			Static154.anInt3055 = arg0 * 32;
			Static62.anInt1251 = arg0;
		}
		if (arg1 == Static452.anInt7497) {
			return;
		}
		if (Static62.anInt1251 == arg1) {
			Static147.anIntArray259 = Static239.anIntArray394;
		} else {
			Static147.anIntArray259 = new int[arg1];
			for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
				Static147.anIntArray259[local68] = (local68 << 12) / arg1;
			}
		}
		Static636.anInt10126 = arg1 - 1;
		Static452.anInt7497 = arg1;
	}
}
