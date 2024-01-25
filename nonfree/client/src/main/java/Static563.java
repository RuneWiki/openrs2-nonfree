import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "[Lclient!wda;")
	public static Class356[] aClass356Array1;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray67 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)Z")
	public static boolean method7642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static225.aBoolean343) {
			return false;
		} else if (Static228.anInt4256 < 100) {
			return false;
		} else {
			@Pc(20) int local20 = Static119.anIntArrayArrayArray15[arg0][arg1][arg2];
			if (-Static83.anInt1807 == local20) {
				return false;
			} else if (local20 == Static83.anInt1807) {
				return true;
			} else if (Static592.aClass67Array4 == Static421.aClass67Array7) {
				return false;
			} else {
				@Pc(44) int local44 = arg1 << Static134.anInt2822;
				@Pc(48) int local48 = arg2 << Static134.anInt2822;
				if (Static56.method937(Static421.aClass67Array7[arg0].method6707(arg2 + 1, arg1), Static421.aClass67Array7[arg0].method6707(arg2 + 1, arg1 + 1), local48 + Static33.anInt857 - 1, local48 + 1, local48 + Static33.anInt857 - 1, Static33.anInt857 + -1 + local44, Static421.aClass67Array7[arg0].method6707(arg2, arg1), local44 + 1, local44 - -1) && Static56.method937(Static421.aClass67Array7[arg0].method6707(arg2 + 1, arg1 + 1), Static421.aClass67Array7[arg0].method6707(arg2, arg1 + 1), Static33.anInt857 + local48 - 1, local48 + 1, local48 + 1, Static33.anInt857 + -1 + local44, Static421.aClass67Array7[arg0].method6707(arg2, arg1), Static33.anInt857 + local44 - 1, local44 + 1)) {
					Static237.anInt8062++;
					Static119.anIntArrayArrayArray15[arg0][arg1][arg2] = Static83.anInt1807;
					return true;
				} else {
					Static119.anIntArrayArrayArray15[arg0][arg1][arg2] = -Static83.anInt1807;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!ww;B)Z")
	public static boolean method7643(@OriginalArg(0) Class366 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean734) {
			return false;
		} else if (!arg0.method7995(Static270.anInterface9_2)) {
			return false;
		} else if (Static84.aClass162_12.method3519((long) arg0.anInt9645) == null) {
			return Static262.aClass162_22.method3519((long) arg0.anInt9642) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BLclient!es;)Lclient!sl;")
	public static Class221_Sub3 method7644(@OriginalArg(1) Class2_Sub15 arg0) {
		return new Class221_Sub3(arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4334(), arg0.method4341(), arg0.method4325());
	}
}
