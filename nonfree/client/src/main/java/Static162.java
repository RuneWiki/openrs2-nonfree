import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "Lclient!qj;")
	public static Class204 aClass204_4;

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
	public static int anInt3324 = 0;

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
	public static int anInt3325 = 0;

	@OriginalMember(owner = "client!hv", name = "i", descriptor = "[I")
	public static final int[] anIntArray212 = new int[2048];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIII)I")
	public static int method2687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 1023 - arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}
}
