import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "Lclient!cm;")
	public static Class8_Sub1_Sub5 aClass8_Sub1_Sub5_5;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "Lclient!pd;")
	public static Class129 aClass129_29 = new Class129(16);

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
	public static int anInt5536 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!pk;IIB)Z")
	public static boolean method4168(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method3194(arg2, arg1);
		if (local5 == null) {
			return false;
		} else {
			Static145.method2287(local5);
			return true;
		}
	}
}
