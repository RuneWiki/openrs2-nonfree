import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "[I")
	public static final int[] anIntArray666 = new int[1000];

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
	public static int anInt9191 = 0;

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_23 = new Class28(12, 0, 1, 0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
	public static int method7630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIIIII)Z")
	public static boolean method7634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static225.aBoolean343) {
			return false;
		} else if (Static228.anInt4256 < 100) {
			return false;
		} else {
			@Pc(32) int local32;
			@Pc(36) int local36;
			if (arg5 != arg2 || arg4 != arg1) {
				for (local32 = arg5; local32 <= arg2; local32++) {
					for (local36 = arg1; local36 <= arg4; local36++) {
						if (-Static83.anInt1807 == Static119.anIntArrayArrayArray15[arg3][local32][local36]) {
							return false;
						}
					}
				}
				local36 = (arg5 << Static134.anInt2822) + 1;
				@Pc(111) int local111 = (arg1 << Static134.anInt2822) + 2;
				if (Static84.method1347((arg4 + 1 - arg1) * Static33.anInt857, arg0, local111, Static421.aClass67Array7[arg3].method6707(arg1, arg5), local36, (arg2 + 1 - arg5) * Static33.anInt857)) {
					Static301.anInt5412++;
					return true;
				} else {
					return false;
				}
			} else if (Static563.method7642(arg3, arg5, arg1)) {
				local32 = arg5 << Static134.anInt2822;
				local36 = arg1 << Static134.anInt2822;
				if (Static84.method1347(Static33.anInt857, arg0, local36, Static421.aClass67Array7[arg3].method6707(arg1, arg5), local32, Static33.anInt857)) {
					Static301.anInt5412++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
