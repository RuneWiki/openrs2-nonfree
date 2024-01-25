import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "Lclient!ci;")
	public static Class38 aClass38_29;

	@OriginalMember(owner = "client!gn", name = "R", descriptor = "Lclient!tc;")
	public static Class4_Sub7_Sub4 aClass4_Sub7_Sub4_1;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_35 = new Class212(2, 7);

	@OriginalMember(owner = "client!gn", name = "P", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_95 = new Class214(4, 6);

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString19 = "";

	@OriginalMember(owner = "client!gn", name = "S", descriptor = "I")
	public static int anInt2706 = 0;

	@OriginalMember(owner = "client!gn", name = "T", descriptor = "[I")
	public static final int[] anIntArray236 = new int[14];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)V")
	public static void method2437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static104.method1974(arg0)) {
			Static156.method5956(arg1, Static122.aClass240ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)Z")
	public static boolean method2439(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}
}
