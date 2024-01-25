import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!uia", name = "t", descriptor = "Z")
	public static boolean aBoolean685 = false;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IIIIIII)V")
	public static void method8314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static230.anInt3962 <= arg3 && arg0 <= Static463.anInt7530 && arg2 >= Static573.anInt8986 && Static319.anInt5445 >= arg5) {
			if (arg4 == 1) {
				Static509.method7020(arg1, arg5, arg2, arg0, arg3);
			} else {
				Static561.method7579(arg2, arg5, arg3, arg0, arg1, arg4);
			}
		} else if (arg4 == 1) {
			Static13.method206(arg2, arg3, arg1, arg0, arg5);
		} else {
			Static180.method3129(arg4, arg5, arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Z)V")
	public static void method8315() {
		Static290.method4607();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static553.aClass169Array1[local8].method3869();
		}
		Static124.method1849();
		Static109.method8573();
		Static43.method773();
		System.gc();
		Static273.aClass100_6.ya();
	}
}
