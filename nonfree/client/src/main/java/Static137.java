import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Z")
	public static boolean aBoolean120;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static int anInt2804;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_943 = Static186.method3527("Fps:");

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Z")
	public static boolean aBoolean119 = true;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIILclient!qh;II)V")
	public static void method2287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class93 arg5, @OriginalArg(6) int arg6) {
		if (Static234.aBoolean217) {
			Static134.anInt2780 = 32;
		} else {
			Static134.anInt2780 = 0;
		}
		Static234.aBoolean217 = false;
		@Pc(117) int local117;
		if (Static64.anInt1281 != 0) {
			if (arg3 <= arg6 && arg3 + 16 > arg6 && arg0 >= arg2 && arg0 < arg2 + 16) {
				arg5.anInt3608 -= 4;
				Static66.method999(arg5);
			} else if (arg3 <= arg6 && arg3 + 16 > arg6 && arg2 + arg4 - 16 <= arg0 && arg0 < arg4 + arg2) {
				arg5.anInt3608 += 4;
				Static66.method999(arg5);
			} else if (arg6 >= arg3 - Static134.anInt2780 && arg6 < Static134.anInt2780 + arg3 + 16 && arg0 >= arg2 + 16 && arg4 + arg2 - 16 > arg0) {
				local117 = arg4 * (arg4 - 32) / arg1;
				if (local117 < 8) {
					local117 = 8;
				}
				@Pc(133) int local133 = arg0 - arg2 - local117 / 2 - 16;
				@Pc(140) int local140 = arg4 - local117 - 32;
				arg5.anInt3608 = local133 * (arg1 - arg4) / local140;
				Static66.method999(arg5);
				Static234.aBoolean217 = true;
			}
		}
		if (Static87.anInt1831 == 0) {
			return;
		}
		local117 = arg5.anInt3600;
		if (arg6 >= arg3 - local117 && arg0 >= arg2 && arg6 < arg3 + 16 && arg0 <= arg2 + arg4) {
			arg5.anInt3608 += Static87.anInt1831 * 45;
			Static66.method999(arg5);
			return;
		}
	}
}
