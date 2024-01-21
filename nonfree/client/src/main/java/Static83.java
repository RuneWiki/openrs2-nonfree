import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_827 = Static169.method2903("<)4col> x");

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_828 = Static169.method2903("sl_flags");

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
	public static void method1470() {
		aClass23_828 = null;
		anIntArray287 = null;
		aClass23_827 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!ob;IIIIII)V")
	public static void method1471(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static86.aBoolean116) {
			Static170.anInt830 = 32;
		} else {
			Static170.anInt830 = 0;
		}
		Static86.aBoolean116 = false;
		@Pc(142) int local142;
		if (Static18.anInt568 != 0) {
			if (arg5 >= arg3 && arg5 < arg3 + 16 && arg2 >= arg4 && arg2 < arg4 + 16) {
				arg1.anInt3029 -= 4;
				Static39.method659(arg1);
			} else if (arg5 >= arg3 && arg3 + 16 > arg5 && arg4 + arg6 - 16 <= arg2 && arg2 < arg6 + arg4) {
				arg1.anInt3029 += 4;
				Static39.method659(arg1);
			} else if (arg5 >= arg3 - Static170.anInt830 && arg3 + Static170.anInt830 + 16 > arg5 && arg2 >= arg4 + 16 && arg2 < arg4 + arg6 - 16) {
				local142 = (arg6 - 32) * arg6 / arg0;
				if (local142 < 8) {
					local142 = 8;
				}
				@Pc(159) int local159 = arg2 - local142 / 2 - arg4 - 16;
				@Pc(166) int local166 = arg6 - local142 - 32;
				arg1.anInt3029 = (arg0 - arg6) * local159 / local166;
				Static39.method659(arg1);
				Static86.aBoolean116 = true;
			}
		}
		if (Static138.anInt3532 == 0) {
			return;
		}
		local142 = arg1.anInt3014;
		if (arg3 - local142 <= arg5 && arg4 <= arg2 && arg5 < arg3 + 16 && arg4 + arg6 >= arg2) {
			arg1.anInt3029 += Static138.anInt3532 * 45;
			Static39.method659(arg1);
			return;
		}
	}
}
