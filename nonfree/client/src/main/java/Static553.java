import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[Lclient!ww;")
	public static final Class252_Sub1[] aClass252_Sub1Array2 = new Class252_Sub1[35];

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public static int anInt9060 = 0;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_161 = new Class319(28, -1);

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "[Lclient!nt;")
	public static final Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array6 = new Class1_Sub3_Sub13[14];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BI)V")
	public static void method7505(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class1_Sub20 local13 = new Class1_Sub20(arg0);
		while (true) {
			@Pc(17) int local17 = local13.method4393();
			if (local17 == 0) {
				return;
			}
			if (local17 == 2) {
				Static214.anInt4163 = local13.method4426();
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!io;)Lclient!dt;")
	public static Class78_Sub1 method7506(@OriginalArg(1) Class1_Sub20 arg0) {
		return new Class78_Sub1(arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4396(), arg0.method4393());
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static457.aBoolean566) {
			return false;
		} else if (Static13.anInt359 < 100) {
			return false;
		} else if (Static158.method2431(arg0, arg3, arg2)) {
			@Pc(24) int local24 = arg0 << Static378.anInt6665;
			@Pc(28) int local28 = arg2 << Static378.anInt6665;
			if (Static20.method542(Static20.aClass17Array1[arg3].method6642(arg0, arg2), local24, Static47.anInt1239, Static47.anInt1239, arg1, local28)) {
				Static264.anInt4970++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
