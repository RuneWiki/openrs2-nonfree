import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
	public static int anInt3618;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!ji;)Lclient!eo;")
	public static Class18_Sub1 method3173(@OriginalArg(1) Class6_Sub21 arg0) {
		@Pc(12) Class18 local12 = Static268.method6658(arg0);
		@Pc(16) int local16 = arg0.method6036();
		@Pc(20) int local20 = arg0.method6036();
		@Pc(24) int local24 = arg0.method6003();
		return new Class18_Sub1(local12.aClass319_12, local12.aClass247_12, local12.anInt6642, local12.anInt6646, local12.anInt6645, local12.anInt6643, local12.anInt6639, local12.anInt6641, local12.anInt6640, local16, local20, local24);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3174(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static206.method3660();
		Static326.method5133();
		Static283.method4640();
		Static423.method6100(arg1, arg0);
		Static531.method7229();
		Static389.method5727(Static240.aClass14_7);
		Static511.method7089(Static240.aClass14_7);
		Static230.method4062(Static398.aClass251_94, Static240.aClass14_7);
		Static531.method7227();
		Static150.method2878(Static241.aClass58Array12);
		Static415.method7746();
		Static468.method6538();
		if (Static557.anInt9206 == 3) {
			Static449.method6350(4);
		} else if (Static557.anInt9206 == 7) {
			Static449.method6350(8);
		} else if (Static557.anInt9206 == 10) {
			Static449.method6350(11);
		} else if (Static557.anInt9206 == 1 || Static557.anInt9206 == 2) {
			Static290.method4683();
		}
	}
}
