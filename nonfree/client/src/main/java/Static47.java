import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString8 = "";

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method632() {
		Static148.method2205();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method635(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(14) int local14;
		if (local9 == 0) {
			local14 = 0;
		} else {
			local14 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg0 + 8 - 1) / 8);
		@Pc(40) int local40 = -((arg2 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local30; local42 < 0; local42++) {
			for (@Pc(46) int local46 = local40; local46 < 0; local46++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local14;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}
}
