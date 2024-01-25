import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "Lclient!ae;")
	public static Class8 aClass8_134;

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "I")
	public static int anInt9747;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIB)V")
	public static void method8224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static502.anInt8456 <= arg3 - arg1 && Static153.anInt2554 >= arg3 + arg1 && Static55.anInt4238 <= arg0 - arg1 && Static292.anInt4921 >= arg0 + arg1) {
			Static455.method6590(arg0, arg2, arg1, arg3);
		} else {
			Static380.method5387(arg0, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([Ljava/lang/String;B)V")
	public static void method8231(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static330.aString6 = Static330.aString6 + arg0[0];
			Static241.anInt4292 += arg0[0].length();
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			if (arg0[local33].startsWith("pause")) {
				@Pc(43) int local43 = 5;
				try {
					local43 = Integer.parseInt(arg0[local33].substring(6));
				} catch (@Pc(52) Exception local52) {
				}
				Static67.method1187("Pausing for " + local43 + " seconds...");
				Static61.aStringArray11 = arg0;
				Static418.anInt7264 = local33 + 1;
				Static666.aLong308 = (long) (local43 * 1000) + Static566.method7936();
				return;
			}
			Static330.aString6 = arg0[local33];
			Static52.method1006(false);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V")
	public static void method8238() {
		Static232.method3400(Static96.aClass6_Sub22_7.aClass29_Sub24_1.method7431() == 1);
		Static231.aClass64_2 = Static539.method7688(22050, Static569.aClass380_6, 0, Static140.aCanvas1);
		Static92.method1535(Static633.method8702((Class6_Sub8_Sub4) null));
		Static165.aClass64_1 = Static539.method7688(2048, Static569.aClass380_6, 1, Static140.aCanvas1);
		Static106.aClass6_Sub8_Sub3_2 = new Class6_Sub8_Sub3();
		Static165.aClass64_1.method1730(Static106.aClass6_Sub8_Sub3_2);
		Static20.aClass101_1 = new Class101(22050, Static328.anInt8868);
		Static189.method2689();
	}
}
