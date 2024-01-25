import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "[I")
	public static final int[] anIntArray392 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)Z")
	public static boolean method5510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)Z")
	public static boolean method5511(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)I")
	public static int method5513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
