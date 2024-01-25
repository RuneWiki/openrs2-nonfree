import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
	public static int anInt5017;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_168 = new Class123(41, -2);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IFFF)F")
	public static float method4010(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 * (arg1 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)Z")
	public static boolean method4012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static383.aBoolean467) {
			return false;
		} else if (Static325.anInt5933 < 100) {
			return false;
		} else {
			@Pc(25) int local25 = Static461.anIntArrayArrayArray13[arg2][arg0][arg1];
			if (-Static136.anInt3255 == local25) {
				return false;
			} else if (local25 == Static136.anInt3255) {
				return true;
			} else if (Static108.aClass127Array5 == Static256.aClass127Array3) {
				return false;
			} else {
				@Pc(53) int local53 = arg0 << Static385.anInt6657;
				@Pc(57) int local57 = arg1 << Static385.anInt6657;
				if (Static343.method5000(Static256.aClass127Array3[arg2].method7862(arg1 + 1, arg0 + 1), Static256.aClass127Array3[arg2].method7862(arg1 + 1, arg0), local53 + 1, local57 - (-Static331.anInt6010 + 1), local53 + 1, Static331.anInt6010 + -1 + local57, local57 + 1, Static331.anInt6010 + -1 + local53, Static256.aClass127Array3[arg2].method7862(arg1, arg0)) && Static343.method5000(Static256.aClass127Array3[arg2].method7862(arg1, arg0 + 1), Static256.aClass127Array3[arg2].method7862(arg1 + 1, arg0 - -1), local53 + 1, local57 - -Static331.anInt6010 + -1, Static331.anInt6010 + local53 - 1, local57 - -1, local57 + 1, Static331.anInt6010 + local53 + -1, Static256.aClass127Array3[arg2].method7862(arg1, arg0))) {
					Static590.anInt10263++;
					Static461.anIntArrayArrayArray13[arg2][arg0][arg1] = Static136.anInt3255;
					return true;
				} else {
					Static461.anIntArrayArrayArray13[arg2][arg0][arg1] = -Static136.anInt3255;
					return false;
				}
			}
		}
	}
}
