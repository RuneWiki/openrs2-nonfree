import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "[[Lclient!lo;")
	public static Class6_Sub1[][] aClass6_Sub1ArrayArray2;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)[Lclient!wea;")
	public static Class357[] method923() {
		return new Class357[] { Static459.aClass357_12, Static95.aClass357_2, Static543.aClass357_13, Static362.aClass357_9, Static259.aClass357_7, Static92.aClass357_1, Static375.aClass357_10, Static161.aClass357_3, Static172.aClass357_4, Static185.aClass357_14 };
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method924(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) byte[] local18 = new byte[arg0.length];
			Static598.method1137(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
