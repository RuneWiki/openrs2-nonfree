import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "F")
	public static float aFloat69 = 0.0F;

	@OriginalMember(owner = "client!cu", name = "p", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_11 = new Class102(5);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)I")
	public static int method1958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg0 > arg1) {
			local14 = arg1;
			arg1 = arg0;
			arg0 = local14;
		}
		while (arg0 != 0) {
			local14 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local14;
		}
		return arg1;
	}
}
