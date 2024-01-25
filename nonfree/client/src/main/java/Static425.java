import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "[I")
	public static final int[] anIntArray669 = new int[13];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
	public static void method6516(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static346.method5506(arg0.length - 1, 0, arg1, arg0);
	}
}
