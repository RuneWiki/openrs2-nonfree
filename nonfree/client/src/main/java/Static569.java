import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
	public static int anInt9376;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "[Lclient!hn;")
	public static final Class149[] aClass149Array2 = new Class149[14];

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	public static void method7833() {
		if (Static630.method8481(Static538.anInt8985) || Static562.method7785(Static538.anInt8985)) {
			Static150.method2868(Static395.anInt3530 >> 12, Static53.anInt1153 >> 12, 5000);
		} else {
			@Pc(28) int local28 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray232[0] >> 3;
			@Pc(35) int local35 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anIntArray233[0] >> 3;
			if (local28 >= 0 && local28 < Static3.anInt46 >> 3 && local35 >= 0 && Static270.anInt5194 >> 3 > local35) {
				Static150.method2868(local35, local28, 5000);
			} else {
				Static150.method2868(Static270.anInt5194 >> 4, Static3.anInt46 >> 4, 0);
			}
		}
		Static617.method8391();
		Static478.method6849();
		Static109.method1819();
		method7836();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(FLclient!se;IIFFFFIII)[B")
	public static byte[] method7835(@OriginalArg(0) float arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static127.method2523(local15, arg3, arg5, arg4, arg1, 0, arg0, arg2);
		return local15;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)V")
	public static void method7836() {
		Static555.aClass87_14.L(Static121.anInt2897, Static404.aClass2_Sub13_2.aClass33_Sub13_1.method4689() == 1 ? Static578.anInt9537 + 256 << 2 : -1, 0);
	}
}
