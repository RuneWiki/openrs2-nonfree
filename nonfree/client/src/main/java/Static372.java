import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	public static int anInt6690 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Z")
	public static boolean method5999(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)I")
	public static int method6000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(31) int local31 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local31;
		}
		return arg0;
	}
}
