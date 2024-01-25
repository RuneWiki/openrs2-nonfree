import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "F")
	public static float aFloat119 = 1.0F;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "[I")
	public static final int[] anIntArray457 = new int[50];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public static void method5371() {
		Static205.aClass38_30 = new Class38();
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)Z")
	public static boolean method5372(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
