import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "Lclient!aea;")
	public static Class3_Sub3_Sub1 aClass3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_152 = new Class194(27, 0);

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBI)I")
	public static int method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 & 0x3;
		if (local8 == 0) {
			return arg2;
		} else if (local8 == 1) {
			return 7 - arg1;
		} else if (local8 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBIII)I")
	public static int method4468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg3 : arg1;
		@Pc(43) int local43 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg1 : arg2) : arg3;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local43 : -local43);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBII)I")
	public static int method4470(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
