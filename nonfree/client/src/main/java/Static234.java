import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static234 {

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "[Ljava/lang/Object;")
	public static Object[] anObjectArray1;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
	public static int anInt3711;

	@OriginalMember(owner = "client!hfa", name = "f", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BI)V")
	public static void method3336(@OriginalArg(1) int arg0) {
		Static589.aLong344 = 1000000000L / (long) arg0;
	}
}
