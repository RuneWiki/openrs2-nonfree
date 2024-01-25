import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!lo;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_3;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "[I")
	public static final int[] anIntArray513 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!vp;BI)Ljava/lang/String;")
	public static String method5887(@OriginalArg(0) Class309 arg0, @OriginalArg(2) int arg1) {
		if (!Static62.method1740(arg0).method7986(arg1) && arg0.anObjectArray6 == null) {
			return null;
		} else if (arg0.aStringArray46 == null || arg1 >= arg0.aStringArray46.length || arg0.aStringArray46[arg1] == null || arg0.aStringArray46[arg1].trim().length() == 0) {
			return Static192.aBoolean246 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray46[arg1];
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
	public static void method5888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class308 local17 = Static208.aClass308ArrayArray1[arg0][arg1];
		Static106.method2292(arg2, local17 == null ? Static15.aClass308_1 : local17);
	}
}
