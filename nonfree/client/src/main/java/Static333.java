import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	public static int anInt6446 = 2;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray72 = null;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)I")
	public static int method5738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method5739(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
