import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
	public static int anInt8061;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "[I")
	public static final int[] anIntArray477 = new int[5];

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!or;")
	public static final Class244 aClass244_58 = new Class244();

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(II)I")
	public static int method6342(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6345(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static153.method2852(Static68.method1648(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(II)Z")
	public static boolean method6346(@OriginalArg(0) int arg0) {
		return arg0 == 0;
	}
}
