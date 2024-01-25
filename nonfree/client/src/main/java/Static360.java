import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_48 = new Class263(6, 0, 4, 2);

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)I")
	public static int method5003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 <= arg2) {
			return arg0 >= arg2 ? arg2 : arg0;
		} else {
			return arg1;
		}
	}
}
