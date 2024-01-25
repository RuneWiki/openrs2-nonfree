import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "[I")
	public static int[] anIntArray614;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Z")
	public static boolean aBoolean673 = false;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!kq;IB)I")
	public static int method7443(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1) {
		if (!Static75.method1604(arg0).method814(arg1) && arg0.anObjectArray22 == null) {
			return -1;
		} else if (arg0.anIntArray390 == null || arg1 >= arg0.anIntArray390.length) {
			return -1;
		} else {
			return arg0.anIntArray390[arg1];
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
	public static boolean method7444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
