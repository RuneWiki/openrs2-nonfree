import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "Lclient!ak;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
	public static int anInt3586;

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_61 = new Class57("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_51 = new Class244(18, -1);

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
	public static int anInt3587 = 0;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
	public static final int[] anIntArray389 = new int[1000];

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "[I")
	public static final int[] anIntArray390 = new int[8];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!b;)V")
	public static void method3132(@OriginalArg(1) Class20 arg0) {
		Static163.anInt2727 = 0;
		anInt3587 = 0;
		Static156.aClass22_5 = new Class22();
		Static381.aClass12_Sub1_Sub1_Sub1Array2 = new Class12_Sub1_Sub1_Sub1[1024];
		Static102.method1692(arg0);
		Static176.method3098(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public static void method3133(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub7_Sub8 local13 = Static275.method4307(7, arg0);
		local13.method3217();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBI)V")
	public static void method3134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static23.aClass3_Sub5_Sub1_1.method2782(arg1);
		Static23.aClass3_Sub5_Sub1_1.method2749(arg0);
		Static23.aClass3_Sub5_Sub1_1.method2727(arg2);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)I")
	public static int method3135() {
		if (Static225.aFrame2 == null) {
			return Static104.aBoolean156 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
