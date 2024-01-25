import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cs", name = "n", descriptor = "[I")
	public static int[] anIntArray123 = new int[2];

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
	public static boolean method1687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return method1689(arg1, arg0) | (arg1 & 0x60000) != 0 || Static310.method4847(arg1, arg0) || Static6.method101(arg1, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)Z")
	public static boolean method1689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
