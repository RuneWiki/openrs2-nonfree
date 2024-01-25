import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
	public static int anInt10721 = -2;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
	public static int anInt10722 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static12.aBoolean9 || !Static33.aBoolean71) {
			return false;
		} else if (Static24.anInt440 < 100) {
			return false;
		} else if (Static623.method8750(arg1, arg2, arg3)) {
			@Pc(28) int local28 = arg2 << Static579.anInt9935;
			@Pc(32) int local32 = arg1 << Static579.anInt9935;
			if (Static566.method8152(Static222.anInt4166, Static576.aClass51Array3[arg3].method7857(arg1, arg2), local28, Static222.anInt4166, local32, arg0)) {
				Static508.anInt8976++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
