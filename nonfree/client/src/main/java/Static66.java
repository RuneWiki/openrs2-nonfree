import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public static int anInt1118 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIB)Z")
	public static boolean method871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static275.method3945(arg0, arg1) || Static252.method3570(arg1, arg0) || Static288.method4064(arg1, arg0);
	}
}
