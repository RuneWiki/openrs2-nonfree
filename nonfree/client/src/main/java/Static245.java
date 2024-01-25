import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static245 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!eb;)V")
	public static void method3495(@OriginalArg(0) Class89 arg0) {
		Static508.aClass89_1 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BJ)I")
	public static int method3496(@OriginalArg(1) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}
}
