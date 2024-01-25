import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static145 {

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Z")
	public static boolean aBoolean208;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "Lclient!on;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!fo", name = "z", descriptor = "[I")
	public static int[] anIntArray125;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
	public static boolean method2449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static10.method241(arg0, arg1) & Static105.method6466(arg0, arg1);
	}
}
