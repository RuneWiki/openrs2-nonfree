import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
	public static int anInt6038;

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_86 = new Class27(40, 3);

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)I")
	public static int method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(III)I")
	public static int method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static35.method481(4, arg1 + 91923, arg0 + 45365) + (Static35.method481(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static35.method481(1, arg1, arg0) + -128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(III)Z")
	public static boolean method4775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
