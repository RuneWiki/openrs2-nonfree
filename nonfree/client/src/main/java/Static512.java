import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
	public static int anInt8631;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public static int anInt8633;

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public static int anInt8632 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "[I")
	public static final int[] anIntArray472 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Z")
	public static boolean method7321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static279.method3859(arg0, arg1) | Static588.method8006(arg1, arg0) | Static278.method3851(arg1, arg0)) & Static221.method3131(arg0, arg1);
	}
}
