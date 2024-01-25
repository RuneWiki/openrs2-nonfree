import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "[S")
	public static short[] aShortArray33;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
	public static int anInt2257;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
	public static final int[] anIntArray156 = new int[500];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!cf;ZIIZLclient!cf;I)I")
	public static int method2163(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class22_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static127.method2248(arg1, arg4, arg0, arg2);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg5 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static127.method2248(arg3, arg4, arg0, arg5);
			return arg3 ? -local37 : local37;
		}
	}
}
