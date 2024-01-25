import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	public static int anInt4110 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method3326(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static475.method6623(0, arg1.length - 1, arg0, arg1);
	}
}
