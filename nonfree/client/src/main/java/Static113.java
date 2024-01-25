import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static113 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	public static final int[] anIntArray92 = new int[1000];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
	public static boolean method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static44.method8133(arg0, arg1) & Static567.method4396(arg1, arg0);
	}
}
