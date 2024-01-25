import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Lclient!bh;")
	public static Class29 aClass29_6;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
	public static final int anInt5832 = -1;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "Lclient!us;")
	public static final Class344 aClass344_68 = new Class344(21, 3);

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "[I")
	public static final int[] anIntArray339 = new int[1];

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIII)I")
	public static int method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg2;
			arg2 = arg4;
			arg4 = local14;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 8 - arg2 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg5;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Lclient!jaa;")
	public static Class153_Sub1 method4941() {
		return Static258.anInt5693 < Static199.aClass153_Sub1Array1.length ? Static199.aClass153_Sub1Array1[Static258.anInt5693++] : null;
	}
}
