import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
	public static int anInt6045;

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
	public static int anInt6057;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	public static int anInt6052 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static383.aBoolean467) {
			return false;
		} else if (Static325.anInt5933 < 100) {
			return false;
		} else if (Static258.method4012(arg2, arg0, arg3)) {
			@Pc(32) int local32 = arg2 << Static385.anInt6657;
			@Pc(36) int local36 = arg0 << Static385.anInt6657;
			if (Static469.method7096(Static331.anInt6010, Static331.anInt6010, local32, local36, Static256.aClass127Array3[arg3].method7862(arg0, arg2), arg1)) {
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
