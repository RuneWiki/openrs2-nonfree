import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static247 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_123 = new Class205(103, 3);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
	public static void method4892(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static138.anInt932 = 0;
		Static40.anInt818 = arg1;
		Static243.anInt4326 = 0;
		Static235.anInt4193 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
	public static String method4893(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static142.method2679(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method4895(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
	public static void method4896(@OriginalArg(1) int arg0) {
		Static24.anInt533 = -1;
		Static308.anInt5181 = arg0;
		Static24.anInt533 = -1;
		Static52.method874();
	}
}
