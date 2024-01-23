import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!ed;")
	public static Class5_Sub5_Sub1 aClass5_Sub5_Sub1_2;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_68;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public static int anInt2498 = 0;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public static int anInt2499 = -1;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!sc;")
	public static Class107 aClass107_675 = Static231.method3737("(U0a )2 in: ");

	@OriginalMember(owner = "client!th", name = "e", descriptor = "[I")
	public static int[] anIntArray232 = new int[100];

	@OriginalMember(owner = "client!th", name = "f", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!o;IIIIII)V")
	public static void method1967(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static126.aBoolean230) {
			Static96.anInt2095 = 32;
		} else {
			Static96.anInt2095 = 0;
		}
		Static126.aBoolean230 = false;
		@Pc(145) int local145;
		if (Static198.anInt4319 != 0) {
			if (arg6 <= arg5 && arg5 < arg6 + 16 && arg0 <= arg2 && arg2 < arg0 + 16) {
				arg1.anInt3222 -= 4;
				Static16.method354(arg1);
			} else if (arg6 <= arg5 && arg5 < arg6 + 16 && arg2 >= arg4 + arg0 - 16 && arg4 + arg0 > arg2) {
				arg1.anInt3222 += 4;
				Static16.method354(arg1);
			} else if (arg6 - Static96.anInt2095 <= arg5 && arg5 < Static96.anInt2095 + arg6 + 16 && arg2 >= arg0 + 16 && arg0 + arg4 - 16 > arg2) {
				local145 = arg4 * (arg4 - 32) / arg3;
				if (local145 < 8) {
					local145 = 8;
				}
				@Pc(164) int local164 = arg2 - arg0 - local145 / 2 - 16;
				@Pc(171) int local171 = arg4 - local145 - 32;
				arg1.anInt3222 = (arg3 - arg4) * local164 / local171;
				Static16.method354(arg1);
				Static126.aBoolean230 = true;
			}
		}
		if (Static178.anInt3882 == 0) {
			return;
		}
		local145 = arg1.anInt3280;
		if (arg6 - local145 <= arg5 && arg0 <= arg2 && arg5 < arg6 + 16 && arg0 + arg4 >= arg2) {
			arg1.anInt3222 += Static178.anInt3882 * 45;
			Static16.method354(arg1);
			return;
		}
	}
}
