import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!bt;")
	public static Class33 aClass33_2;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	public static int anInt3757;

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "Lclient!oh;")
	public static final Class252 aClass252_7 = new Class252(3, 2);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z")
	public static boolean method3055(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static10.method241(arg1, arg0) | (arg0 & 0x60000) != 0 || Static145.method2449(arg1, arg0);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I")
	public static int method3059(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
