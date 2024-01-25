import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static538 {

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Z")
	public static boolean aBoolean657 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method7889(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static116.method2391(arg1, arg0, 0, arg1.length - 1);
	}
}
