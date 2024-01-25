import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "[Lclient!fi;")
	public static final Class114[] aClass114Array1 = new Class114[100];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)Z")
	public static boolean method5086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static429.aBoolean478 || !Static343.aBoolean381) {
			return false;
		} else if (Static547.anInt8693 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static648.anIntArrayArrayArray19[arg1][arg0][arg2];
			if (local28 == -Static489.anInt7963) {
				return false;
			} else if (local28 == Static489.anInt7963) {
				return true;
			} else if (Static77.aClass84Array1 == Static177.aClass84Array2) {
				return false;
			} else {
				@Pc(63) int local63 = arg0 << Static314.anInt5377;
				@Pc(67) int local67 = arg2 << Static314.anInt5377;
				if (Static542.method7427(local63 + Static492.anInt7972 - 1, local63 + 1, local63 + 1, Static492.anInt7972 + local67 + -1, local67 + Static492.anInt7972 - 1, Static177.aClass84Array2[arg1].method7620(arg2, arg0), Static177.aClass84Array2[arg1].method7620(arg2 + 1, arg0), local67 + 1, Static177.aClass84Array2[arg1].method7620(arg2 + 1, arg0 + 1)) && Static542.method7427(Static492.anInt7972 + local63 - 1, local63 + 1, Static492.anInt7972 + local63 - 1, local67 - -Static492.anInt7972 + -1, local67 + 1, Static177.aClass84Array2[arg1].method7620(arg2, arg0), Static177.aClass84Array2[arg1].method7620(arg2 + 1, arg0 + 1), local67 + 1, Static177.aClass84Array2[arg1].method7620(arg2, arg0 + 1))) {
					Static179.anInt3379++;
					Static648.anIntArrayArrayArray19[arg1][arg0][arg2] = Static489.anInt7963;
					return true;
				} else {
					Static648.anIntArrayArrayArray19[arg1][arg0][arg2] = -Static489.anInt7963;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public static void method5094(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub1_Sub18 local17 = Static123.method1827((long) arg0, 10);
		local17.method7444();
	}
}
