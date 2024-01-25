import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
	public static int anInt5814;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_35 = new Class91();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 >= Static176.anInt3462 && Static418.anInt3023 >= arg8 && arg1 >= Static176.anInt3462 && Static418.anInt3023 >= arg1 && Static176.anInt3462 <= arg6 && arg6 <= Static418.anInt3023 && Static176.anInt3462 <= arg5 && arg5 <= Static418.anInt3023 && Static162.anInt1715 <= arg7 && arg7 <= Static55.anInt1319 && Static162.anInt1715 <= arg4 && Static55.anInt1319 >= arg4 && Static162.anInt1715 <= arg3 && Static55.anInt1319 >= arg3 && Static162.anInt1715 <= arg2 && arg2 <= Static55.anInt1319) {
			Static57.method1245(arg4, arg3, arg7, arg5, arg8, arg1, arg6, arg2, arg0);
		} else {
			Static71.method1562(arg8, arg0, arg1, arg2, arg6, arg3, arg7, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)I")
	public static int method4834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
