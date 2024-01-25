import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public static int anInt3291;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!pt;")
	public static Class198 aClass198_2;

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array88;

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[8];

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
	public static int anInt3308 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V")
	public static void method2668(@OriginalArg(1) boolean arg0) {
		Static88.method1666(Static123.anInt2625, Static226.anInt4225, Static333.anInt5712, arg0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)Z")
	public static boolean method2673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
