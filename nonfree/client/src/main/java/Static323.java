import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_51 = new Class144(26, -1);

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public static int anInt5198 = 0;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "Lclient!le;")
	public static final Class222 aClass222_3 = new Class222();

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIBI)Z")
	public static boolean method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static42.aBoolean87 || !Static497.aBoolean530) {
			return false;
		} else if (Static532.anInt8283 < 100) {
			return false;
		} else {
			@Pc(28) int local28 = Static466.anIntArrayArrayArray12[arg0][arg2][arg1];
			if (-Static414.anInt6386 == local28) {
				return false;
			} else if (local28 == Static414.anInt6386) {
				return true;
			} else if (Static477.aClass259Array3 == Static378.aClass259Array2) {
				return false;
			} else {
				@Pc(55) int local55 = arg2 << Static626.anInt9669;
				@Pc(65) int local65 = arg1 << Static626.anInt9669;
				if (Static574.method7434(Static477.aClass259Array3[arg0].method9295(arg1, arg2), Static477.aClass259Array3[arg0].method9295(arg1 + 1, arg2), local55 + Static308.anInt4969 - 1, local55 - -1, local65 + Static308.anInt4969 - 1, local65 + 1, local55 + 1, Static477.aClass259Array3[arg0].method9295(arg1 - -1, arg2 + 1), Static308.anInt4969 + local65 - 1) && Static574.method7434(Static477.aClass259Array3[arg0].method9295(arg1, arg2), Static477.aClass259Array3[arg0].method9295(arg1 + 1, arg2 - -1), local55 + Static308.anInt4969 - 1, local55 - -1, local65 + 1, local65 + 1, local55 + Static308.anInt4969 - 1, Static477.aClass259Array3[arg0].method9295(arg1, arg2 - -1), Static308.anInt4969 + local65 - 1)) {
					Static65.anInt8656++;
					Static466.anIntArrayArrayArray12[arg0][arg2][arg1] = Static414.anInt6386;
					return true;
				} else {
					Static466.anIntArrayArrayArray12[arg0][arg2][arg1] = -Static414.anInt6386;
					return false;
				}
			}
		}
	}
}
