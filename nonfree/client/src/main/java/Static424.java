import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static424 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Lclient!kea;")
	public static Class161 aClass161_94;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_7 = new Class91("", 16);

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "Lclient!fj;")
	public static final Class91 aClass91_8 = new Class91("", 14);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method6498(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static36.anInt940 = -1;
		Static312.anInt6059 = 1;
		Static434.method6593(false, arg0, arg1);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBI)Z")
	public static boolean method6501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static188.method3553(arg0, arg1)) {
			return Static459.method6873(arg1, arg0) | (arg0 & 0x9000) != 0 | Static151.method2597(arg0, arg1) ? true : (Static469.method7009(arg0, arg1) | (arg0 & 0x2000) != 0 | Static229.method4100(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
