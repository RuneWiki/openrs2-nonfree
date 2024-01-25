import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[Lclient!ct;")
	public static final Class40[] aClass40Array1 = new Class40[128];

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!ae;")
	public static Class6_Sub1 aClass6_Sub1_1 = new Class6_Sub1(1);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Lclient!uf;")
	public static Class3_Sub4 method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class3_Sub4 local14 = local7.aClass3_Sub4_1;
			local7.aClass3_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBII)I")
	public static int method3070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
