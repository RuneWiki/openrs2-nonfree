import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	public static int anInt1142 = 0;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!ia;")
	private static Class51 aClass51_344 = Static64.method1101("Select a world");

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!ia;")
	public static Class51 aClass51_343 = aClass51_344;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!me;IIIIIB)V")
	public static void method829(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static151.aBoolean159) {
			Static16.anInt391 = 32;
		} else {
			Static16.anInt391 = 0;
		}
		Static151.aBoolean159 = false;
		@Pc(134) int local134;
		if (Static71.anInt1636 != 0) {
			if (arg6 <= arg2 && arg2 < arg6 + 16 && arg4 >= arg0 && arg0 + 16 > arg4) {
				arg1.anInt2779 -= 4;
				Static82.method1438(arg1);
			} else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg4 >= arg5 + arg0 - 16 && arg4 < arg0 + arg5) {
				arg1.anInt2779 += 4;
				Static82.method1438(arg1);
			} else if (arg2 >= arg6 - Static16.anInt391 && Static16.anInt391 + arg6 + 16 > arg2 && arg4 >= arg0 + 16 && arg4 < arg0 + arg5 - 16) {
				local134 = (arg5 - 32) * arg5 / arg3;
				if (local134 < 8) {
					local134 = 8;
				}
				@Pc(151) int local151 = arg4 - local134 / 2 - arg0 - 16;
				@Pc(158) int local158 = arg5 - local134 - 32;
				arg1.anInt2779 = (arg3 - arg5) * local151 / local158;
				Static82.method1438(arg1);
				Static151.aBoolean159 = true;
			}
		}
		if (Static105.anInt2335 == 0) {
			return;
		}
		local134 = arg1.anInt2802;
		if (arg6 - local134 <= arg2 && arg4 >= arg0 && arg6 + 16 > arg2 && arg0 + arg5 >= arg4) {
			arg1.anInt2779 += Static105.anInt2335 * 45;
			Static82.method1438(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
	public static int method830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}
}
