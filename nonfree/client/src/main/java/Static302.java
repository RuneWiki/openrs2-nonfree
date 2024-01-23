import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	public static int anInt5987;

	@OriginalMember(owner = "client!vn", name = "N", descriptor = "I")
	public static int anInt6003;

	@OriginalMember(owner = "client!vn", name = "T", descriptor = "I")
	public static int anInt6008;

	@OriginalMember(owner = "client!vn", name = "ab", descriptor = "[Lclient!ml;")
	public static Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array12;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	public static int anInt5981 = 0;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray48 = new String[100];

	@OriginalMember(owner = "client!vn", name = "H", descriptor = "I")
	public static int anInt5998 = 0;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
	public static int anInt5999 = 0;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(BI)V")
	public static void method4605(@OriginalArg(1) int arg0) {
		Static66.anInt4746 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!mf;I)Z")
	public static boolean method4609(@OriginalArg(0) Class107 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean239) {
			return false;
		} else if (!arg0.method2745()) {
			return false;
		} else if (Static255.aClass186_22.method4570((long) arg0.anInt3767) == null) {
			return Static31.aClass186_3.method4570((long) arg0.anInt3787) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V")
	public static void method4613() {
		Static187.aClass89_27.method2266();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V")
	public static void method4615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static310.method4692(arg1, arg4, arg0, arg3);
		} else if (arg1 - arg0 >= Static170.anInt3814 && Static310.anInt6206 >= arg0 + arg1 && arg3 - arg2 >= Static206.anInt4449 && Static90.anInt2088 >= arg3 + arg2) {
			Static25.method536(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static211.method3375(arg3, arg2, arg1, arg4, arg0);
		}
	}
}
