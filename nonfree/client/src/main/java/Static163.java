import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray64;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public static final int anInt2947 = -1;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZILjava/lang/String;IIJIILjava/lang/String;IZ)V")
	public static void method2688(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) String arg8, @OriginalArg(10) boolean arg9) {
		if (!Static48.aBoolean87 && Static379.anInt1192 < 500) {
			@Pc(20) int local20 = arg6 == -1 ? Static332.anInt5811 : arg6;
			@Pc(34) Class2_Sub7 local34 = new Class2_Sub7(arg8, arg2, local20, arg4, arg7, arg5, arg1, arg3, arg9, arg0);
			Static66.aClass210_43.method5044(local34);
			Static379.anInt1192++;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2689(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static370.method5573(Static389.method5718(arg0));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(CI)Z")
	public static boolean method2690(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!km;ILclient!fc;Lclient!fc;)V")
	public static void method2691(@OriginalArg(0) Class82 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) Class71 arg2) {
		Static296.aClass216_6 = Static362.method5519(arg1, Static259.anInt4617);
		Static91.aClass13_2 = arg0.method4472(Static296.aClass216_6, Static404.method5314(arg2, Static259.anInt4617));
		Static62.aClass216_4 = Static362.method5519(arg1, Static263.anInt4664);
		Static246.aClass13_4 = arg0.method4472(Static62.aClass216_4, Static404.method5314(arg2, Static263.anInt4664));
		Static60.aClass216_3 = Static362.method5519(arg1, Static274.anInt1079);
		Static34.aClass13_1 = arg0.method4472(Static60.aClass216_3, Static404.method5314(arg2, Static274.anInt1079));
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIILclient!fc;)Lclient!wt;")
	public static Class2_Sub1_Sub17 method2692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(14) Class2_Sub13 local14 = new Class2_Sub13(arg2.method1555(arg1, arg0));
		@Pc(50) Class2_Sub1_Sub17 local50 = new Class2_Sub1_Sub17(arg0, local14.method4201(), local14.method4201(), local14.method4239(), local14.method4239(), local14.method4240() == 1, local14.method4240(), local14.method4240());
		@Pc(54) int local54 = local14.method4240();
		for (@Pc(56) int local56 = 0; local56 < local54; local56++) {
			local50.aClass210_47.method5044(new Class2_Sub11(local14.method4240(), local14.method4245(), local14.method4245(), local14.method4245(), local14.method4245(), local14.method4245(), local14.method4245(), local14.method4245(), local14.method4245()));
		}
		local50.method5757();
		return local50;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)V")
	public static void method2694(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub1_Sub2 local16 = Static323.method4982(arg1, 5);
		local16.method410();
		local16.anInt348 = arg0;
	}
}
