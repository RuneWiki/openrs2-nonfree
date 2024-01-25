import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
	public static int anInt4448 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIBI)Z")
	public static boolean method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!Static383.aBoolean467) {
			return false;
		} else if (Static325.anInt5933 < 100) {
			return false;
		} else {
			@Pc(41) int local41;
			@Pc(45) int local45;
			if (arg1 != arg2 || arg3 != arg4) {
				for (local41 = arg1; local41 <= arg2; local41++) {
					for (local45 = arg4; local45 <= arg3; local45++) {
						if (Static461.anIntArrayArrayArray13[arg0][local41][local45] == -Static136.anInt3255) {
							return false;
						}
					}
				}
				local45 = (arg1 << Static385.anInt6657) + 1;
				@Pc(116) int local116 = (arg4 << Static385.anInt6657) + 2;
				if (Static469.method7096((arg3 + 1 - arg4) * Static331.anInt6010, Static331.anInt6010 * (arg2 + 1 - arg1), local45, local116, Static256.aClass127Array3[arg0].method7862(arg4, arg1), arg5)) {
					Static310.anInt5725++;
					return true;
				} else {
					return false;
				}
			} else if (Static258.method4012(arg1, arg4, arg0)) {
				local41 = arg1 << Static385.anInt6657;
				local45 = arg4 << Static385.anInt6657;
				if (Static469.method7096(Static331.anInt6010, Static331.anInt6010, local41, local45, Static256.aClass127Array3[arg0].method7862(arg4, arg1), arg5)) {
					Static310.anInt5725++;
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
