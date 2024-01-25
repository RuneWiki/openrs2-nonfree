import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
	public static int anInt4626;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "Lclient!jo;")
	public static Class3_Sub1_Sub10 aClass3_Sub1_Sub10_1 = null;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZI)I")
	public static int method3933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		if (arg1 < arg0) {
			local19 = arg1;
			arg1 = arg0;
			arg0 = local19;
		}
		while (arg0 != 0) {
			local19 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local19;
		}
		return arg1;
	}
}
