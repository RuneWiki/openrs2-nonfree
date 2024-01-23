import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt4372;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public static int anInt4376;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
	public static int anInt4381;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "Lclient!kk;")
	public static Class108 aClass108_7;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString269 = "Allocated memory";

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
	public static int anInt4385 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method3638() {
		Static253.aClass26_51.method511();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)I")
	public static int method3640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIIII)V")
	public static void method3644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg0 - 32) * arg0 / arg2;
		Static182.aClass56Array5[0].method2828(arg1, arg3);
		if (local11 < 8) {
			local11 = 8;
		}
		Static182.aClass56Array5[1].method2828(arg1, arg0 + arg3 - 16);
		@Pc(53) int local53 = arg4 * (arg0 - local11 - 32) / (arg2 - arg0);
		if (!Static94.aBoolean138) {
			Static270.method4242(arg1, arg3 + 16, 16, arg0 - 32, Static108.anInt2193);
			Static270.method4242(arg1, arg3 + local53 + 16, 16, local11, Static71.anInt1360);
			Static270.method4249(arg1, local53 + arg3 + 16, local11, Static62.anInt1221);
			Static270.method4249(arg1 + 1, arg3 + 16 + local53, local11, Static62.anInt1221);
			Static270.method4251(arg1, arg3 + local53 + 16, 16, Static62.anInt1221);
			Static270.method4251(arg1, arg3 + local53 + 17, 16, Static62.anInt1221);
			Static270.method4249(arg1 + 15, local53 + arg3 - -16, local11, Static203.anInt3907);
			Static270.method4249(arg1 + 14, local53 + 17 + arg3, local11 - 1, Static203.anInt3907);
			Static270.method4251(arg1, local11 + local53 + arg3 + 15, 16, Static203.anInt3907);
			Static270.method4251(arg1 + 1, local53 + arg3 + (14 - -local11), 15, Static203.anInt3907);
			return;
		}
		Static104.method1702(arg1, arg3 + 16, 16, arg0 - 32, Static108.anInt2193);
		Static104.method1702(arg1, arg3 + local53 + 16, 16, local11, Static71.anInt1360);
		Static104.method1689(arg1, local53 + arg3 + 16, local11, Static62.anInt1221);
		Static104.method1689(arg1 + 1, arg3 + 16 + local53, local11, Static62.anInt1221);
		Static104.method1700(arg1, arg3 + local53 + 16, 16, Static62.anInt1221);
		Static104.method1700(arg1, local53 + arg3 + 17, 16, Static62.anInt1221);
		Static104.method1689(arg1 + 15, arg3 - (-local53 + -16), local11, Static203.anInt3907);
		Static104.method1689(arg1 + 14, arg3 + 17 + local53, local11 - 1, Static203.anInt3907);
		Static104.method1700(arg1, local11 + arg3 + local53 + 15, 16, Static203.anInt3907);
		Static104.method1700(arg1 + 1, local11 + 14 + (arg3 - -local53), 15, Static203.anInt3907);
	}
}
