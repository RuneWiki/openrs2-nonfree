import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt4511 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!wp;Lclient!wp;B)V")
	public static void method3919(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Class361 arg1) {
		@Pc(12) Class3_Sub42 local12 = Static591.method7910(Static9.aClass199_3, Static5.aClass303_5);
		local12.aClass3_Sub11_Sub1_1.method5215(arg0.anInt9594);
		local12.aClass3_Sub11_Sub1_1.method5215(arg1.anInt9594);
		local12.aClass3_Sub11_Sub1_1.method5176(arg0.anInt9608);
		local12.aClass3_Sub11_Sub1_1.method5167(arg0.anInt9645);
		local12.aClass3_Sub11_Sub1_1.method5200(arg1.anInt9608);
		local12.aClass3_Sub11_Sub1_1.method5167(arg1.anInt9645);
		Static511.method6885(local12);
	}
}
