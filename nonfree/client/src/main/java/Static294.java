import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public static int anInt4896;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	public static int anInt4900;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	public static int anInt4897 = 0;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	public static int anInt4901 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I")
	public static int method3907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}
}
