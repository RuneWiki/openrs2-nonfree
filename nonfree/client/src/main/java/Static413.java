import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "Lclient!iv;")
	public static Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "Lclient!vl;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public static int anInt6988;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZII)Z")
	public static boolean method5614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(13) Class114 local13 = Static51.aClass151_1.method2917(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local13.method2180(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIBI)V")
	public static void method5615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static39.method544(arg3, Static254.anInt4211, Static275.anInt4594);
		@Pc(17) int local17 = Static39.method544(arg1, Static254.anInt4211, Static275.anInt4594);
		@Pc(23) int local23 = Static39.method544(arg4, Static62.anInt1114, Static207.anInt3632);
		@Pc(29) int local29 = Static39.method544(arg5, Static62.anInt1114, Static207.anInt3632);
		@Pc(37) int local37 = Static39.method544(arg2 + arg3, Static254.anInt4211, Static275.anInt4594);
		@Pc(46) int local46 = Static39.method544(arg1 - arg2, Static254.anInt4211, Static275.anInt4594);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static249.method6044(Static267.anIntArrayArray50[local48], arg0, local29, local23);
		}
		for (@Pc(66) int local66 = local17; local66 > local46; local66--) {
			Static249.method6044(Static267.anIntArrayArray50[local66], arg0, local29, local23);
		}
		@Pc(92) int local92 = Static39.method544(arg2 + arg4, Static62.anInt1114, Static207.anInt3632);
		@Pc(101) int local101 = Static39.method544(arg5 - arg2, Static62.anInt1114, Static207.anInt3632);
		for (@Pc(103) int local103 = local37; local103 <= local46; local103++) {
			@Pc(109) int[] local109 = Static267.anIntArrayArray50[local103];
			Static249.method6044(local109, arg0, local92, local23);
			Static249.method6044(local109, arg0, local29, local101);
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public static void method5616() {
		if (Static300.anInt4900 == 2) {
			Static18.anInt296 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Static18.anInt296 = (int) (local39 / 1048576L) + 1;
				} catch (@Pc(49) Throwable local49) {
				}
			}
		} catch (@Pc(51) Exception local51) {
		}
	}
}
