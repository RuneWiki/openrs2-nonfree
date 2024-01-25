import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public static int anInt5801;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!qj;")
	public static Class165 aClass165_90;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!qj;")
	public static Class165 aClass165_91;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "Lclient!sr;")
	public static Interface7 anInterface7_8;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "I")
	public static int anInt5803 = 16777215;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JI)V")
	public static void method5107(@OriginalArg(0) long arg0) {
		Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
		Static248.aClass1_Sub7_Sub1_2.method3108(21);
		Static248.aClass1_Sub7_Sub1_2.method3121(arg0);
		Static350.anInt6501 = 0;
		Static183.anInt3821 = 0;
		Static76.anInt1538 = 1;
		Static202.anInt4091 = -3;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!rg;II)Ljava/lang/String;")
	public static String method5111(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1) {
		if (!Static47.method1096(arg0).method4899(arg1) && arg0.anObjectArray14 == null) {
			return null;
		} else if (arg0.aStringArray34 == null || arg1 >= arg0.aStringArray34.length || arg0.aStringArray34[arg1] == null || arg0.aStringArray34[arg1].trim().length() == 0) {
			return Static25.aBoolean62 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray34[arg1];
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!jj;ZI)V")
	public static void method5112(@OriginalArg(0) Class5_Sub3_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static215.anInt4246 < arg0.anInt4961) {
			Static297.method5092(arg0);
		} else if (Static215.anInt4246 > arg0.anInt4971) {
			Static87.method1672(arg0, false);
			local7 = Static145.anInt2839;
			local9 = Static55.anInt1237;
		} else {
			Static235.method4220(arg0);
		}
		if (arg0.anInt5050 < 128 || arg0.anInt5047 < 128 || arg0.anInt5050 >= Static48.anInt1107 * 128 - 128 || Static337.anInt6402 * 128 - 128 <= arg0.anInt5047) {
			arg0.anInt4961 = 0;
			arg0.anInt4977 = -1;
			arg0.anInt4971 = 0;
			arg0.anInt4934 = -1;
			arg0.anInt5050 = arg0.anIntArray638[0] * 128 + arg0.method4541() * 64;
			arg0.anInt5047 = arg0.anIntArray637[0] * 128 + arg0.method4541() * 64;
			arg0.method4529();
		}
		if (arg0 == Static130.aClass5_Sub3_Sub3_Sub1_1 && (arg0.anInt5050 < 1536 || arg0.anInt5047 < 1536 || Static48.anInt1107 * 128 - 1536 <= arg0.anInt5050 || arg0.anInt5047 >= (Static337.anInt6402 - 12) * 128)) {
			arg0.anInt4934 = -1;
			arg0.anInt4977 = -1;
			arg0.anInt4961 = 0;
			arg0.anInt4971 = 0;
			arg0.anInt5050 = arg0.anIntArray638[0] * 128 + arg0.method4541() * 64;
			arg0.anInt5047 = arg0.anIntArray637[0] * 128 + arg0.method4541() * 64;
			arg0.method4529();
		}
		@Pc(195) int local195 = Static332.method5565(arg0);
		Static306.method5161(local7, arg0, local195, local9);
		Static155.method2946(arg0);
	}
}
