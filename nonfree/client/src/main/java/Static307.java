import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "Lclient!um;")
	public static final Class244 aClass244_26 = new Class244();

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!pj;")
	public static final Class195 aClass195_3 = new Class195(2);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBII)I")
	public static int method4512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Lclient!jq;")
	public static Class6_Sub2_Sub7 method4513() {
		@Pc(13) Class6_Sub2_Sub7 local13 = (Class6_Sub2_Sub7) Static96.aClass170_6.method4006();
		if (local13 != null) {
			local13.method6525();
			local13.method6373();
			return local13;
		}
		do {
			local13 = (Class6_Sub2_Sub7) Static79.aClass170_2.method4006();
			if (local13 == null) {
				return null;
			}
			if (local13.method3087() > Static449.method6552()) {
				return null;
			}
			local13.method6525();
			local13.method6373();
		} while ((Long.MIN_VALUE & local13.aLong225) == 0L);
		return local13;
	}
}
