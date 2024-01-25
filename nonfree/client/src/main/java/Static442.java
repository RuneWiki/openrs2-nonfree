import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!dda;")
	public static Class53 aClass53_122;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "Lclient!qq;")
	public static final Class240 aClass240_8 = new Class240();

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZII)I")
	public static int method6724(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IFFF)I")
	public static int method6726(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(20) float local20 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(29) float local29 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(38) float local38 = arg2 < 0.0F ? -arg2 : arg2;
		if (local29 > local20 && local29 > local38) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local20 < local38 && local38 > local29) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
