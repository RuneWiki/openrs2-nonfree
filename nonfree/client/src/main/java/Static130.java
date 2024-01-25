import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!ega", name = "f", descriptor = "Lclient!ie;")
	public static Class158 aClass158_5;

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIII)V")
	public static void method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg1) {
			Static679.method9323(Static274.anIntArrayArray34[arg3], arg2, arg0, arg1);
		} else {
			Static679.method9323(Static274.anIntArrayArray34[arg3], arg1, arg0, arg2);
		}
	}
}
