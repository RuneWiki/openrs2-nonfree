import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_12 = new Class146(38, 6);

	@OriginalMember(owner = "client!ar", name = "R", descriptor = "[I")
	public static final int[] anIntArray16 = new int[3];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)I")
	public static int method270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(20) int local20 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local20;
		}
		return arg0;
	}
}
