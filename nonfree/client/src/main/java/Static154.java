import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_38 = new Class208(3, 15);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIC)I")
	public static int method2308(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(11) int local11 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local11 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local11 = 1762;
		}
		return local11;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)[Lclient!j;")
	public static Class127[] method2313() {
		return new Class127[] { Static227.aClass127_3, Static70.aClass127_1, Static369.aClass127_5 };
	}
}
