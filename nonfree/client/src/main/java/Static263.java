import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "Lclient!bu;")
	public static Class38 aClass38_39;

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[100];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
	public static boolean method4390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static71.method1916(arg0, arg1) || Static50.method7746(arg1, arg0);
	}
}
