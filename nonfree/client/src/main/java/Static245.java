import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!xa;")
	public static Class4 aClass4_13;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "[I")
	public static final int[] anIntArray432 = new int[1000];

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_9 = new Class165(2, 1);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)Lclient!nd;")
	public static Class210 method3526(@OriginalArg(0) int arg0) {
		@Pc(13) Class210[] local13 = Static25.method397();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class210 local21 = local13[local15];
			if (local21.anInt5872 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)I")
	public static int method3527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static303.aByteArrayArrayArray13[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static303.aByteArrayArrayArray13[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
