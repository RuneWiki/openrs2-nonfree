import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public static int anInt5411;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[[[Lclient!ct;")
	public static Class48[][][] aClass48ArrayArrayArray5;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public static final int anInt5414 = 1;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public static int anInt5415 = 1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIZ)I")
	public static int method4817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class3_Sub18 local13 = Static214.method3324(arg1, arg2);
		if (local13 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray226.length) {
			return local13.anIntArray226[arg0];
		} else {
			return -1;
		}
	}
}
