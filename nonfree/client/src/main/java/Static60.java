import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "[Lclient!rl;")
	public static Class154[] aClass154Array1;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!g;")
	public static Class58 aClass58_3 = new Class58(64);

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "F")
	public static float aFloat10 = 0.0F;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	public static int anInt1202 = 0;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt1203 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZIBZ)Lclient!ph;")
	public static Class138 method1021(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class120 local1 = null;
		if (Static176.aClass187_7 != null) {
			local1 = new Class120(arg2, Static176.aClass187_7, Static306.aClass187Array2[arg2], 1000000);
		}
		Static305.aClass55_Sub1Array2[arg2] = Static161.aClass158_1.method3839(local1, arg2, Static72.aClass120_1);
		if (arg3) {
			Static305.aClass55_Sub1Array2[arg2].method4249();
		}
		return new Class138(Static305.aClass55_Sub1Array2[arg2], arg1, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIZI)V")
	public static void method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static312.anInt5850 <= arg1 && arg4 <= Static214.anInt4216 && Static240.anInt1319 <= arg3 && Static59.anInt1155 >= arg0) {
			if (arg5 == 1) {
				Static169.method2848(arg0, arg2, arg3, arg4, arg1);
			} else {
				Static260.method3912(arg5, arg3, arg1, arg0, arg4, arg2);
			}
		} else if (arg5 == 1) {
			Static161.method2706(arg2, arg3, arg1, arg0, arg4);
		} else {
			Static164.method2787(arg5, arg1, arg0, arg2, arg4, arg3);
		}
	}
}
