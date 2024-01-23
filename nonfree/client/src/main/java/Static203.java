import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
	public static int anInt4236;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Lclient!jd;")
	public static Class84 aClass84_86;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString210 = "Attack";

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
	public static int[] anIntArray350 = new int[25];

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[C")
	public static char[] aCharArray5 = new char[128];

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
	public static void method3422() {
		if (Static68.aClass3_1 != null) {
			Static68.aClass3_1.method2242();
		}
		if (Static107.aClass3_2 != null) {
			Static107.aClass3_2.method2242();
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Lclient!bi;")
	public static Class19 method3423() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!jd;)Lclient!jn;")
	public static Class71 method3424(@OriginalArg(1) int arg0, @OriginalArg(2) Class84 arg1) {
		return Static61.method2444(arg1, arg0) ? Static259.method4332() : null;
	}
}
