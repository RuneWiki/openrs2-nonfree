import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
	public static int anInt2491;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(JB)V")
	public static void method2004(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static261.method3342(arg0 - 1L);
			Static261.method3342(1L);
		} else {
			Static261.method3342(arg0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
	public static void method2005(@OriginalArg(0) int arg0) {
		Static358.anInt5850 = arg0;
		Static180.aClass44_29.method1031();
	}
}
