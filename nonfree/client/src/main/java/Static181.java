import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gha", name = "f", descriptor = "Z")
	public static boolean aBoolean367;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_48 = new Class218(18, 8);

	@OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
	public static int anInt4316 = -1;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method3691(@OriginalArg(0) byte[] arg0) {
		return Static89.method2282(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ILclient!tn;)Lclient!cda;")
	public static Class41_Sub1 method3692(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(7) Class41 local7 = Static465.method6957(arg0);
		@Pc(11) int local11 = arg0.method8414();
		@Pc(20) int local20 = arg0.method8414();
		@Pc(24) int local24 = arg0.method8414();
		@Pc(28) int local28 = arg0.method8414();
		@Pc(32) int local32 = arg0.method8414();
		@Pc(36) int local36 = arg0.method8414();
		return new Class41_Sub1(local7.aClass117_13, local7.aClass178_12, local7.anInt9780, local7.anInt9781, local7.anInt9779, local7.anInt9773, local7.anInt9775, local7.anInt9771, local7.anInt9777, local11, local20, local24, local28, local32, local36);
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)Z")
	public static boolean method3693() {
		if (Static193.aBoolean378) {
			try {
				Static653.method5390("showVideoAd", Static632.anApplet2);
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return false;
	}
}
