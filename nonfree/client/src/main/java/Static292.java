import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!on", name = "s", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "Lclient!oa;")
	public static Class16 aClass16_3;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IZII)I")
	public static int method3818(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub20 local8 = Static240.method3131(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray150.length > arg2) {
			return local8.anIntArray150[arg2];
		} else {
			return 0;
		}
	}
}
