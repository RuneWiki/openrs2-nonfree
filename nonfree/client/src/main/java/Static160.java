import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static160 {

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt3217;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public static int anInt3208 = 0;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)I")
	public static int method2872(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
