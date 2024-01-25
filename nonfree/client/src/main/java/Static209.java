import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!jda;")
	public static Class149_Sub1 aClass149_Sub1_1;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[Lclient!sa;")
	public static Class205[] aClass205Array2;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(6, arg1);
		local8.method4946();
		local8.anInt5822 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!jq;BLclient!jq;)V")
	public static void method3564(@OriginalArg(0) Class156 arg0, @OriginalArg(2) Class156 arg1) {
		Static144.method2331(Static150.aClass296_135);
		Static455.aClass1_Sub6_Sub2_2.method3948(arg0.anInt4677);
		Static455.aClass1_Sub6_Sub2_2.method3950(arg1.anInt4697);
		Static455.aClass1_Sub6_Sub2_2.method3966(arg1.anInt4677);
		Static455.aClass1_Sub6_Sub2_2.method3921(arg0.anInt4697);
		Static455.aClass1_Sub6_Sub2_2.method3921(arg1.anInt4723);
		Static455.aClass1_Sub6_Sub2_2.method3959(arg0.anInt4723);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(JI)V")
	public static void method3565(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static465.method6534(arg0 - 1L);
			Static465.method6534(1L);
		} else {
			Static465.method6534(arg0);
		}
	}
}
