import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!jj;B)V")
	public static void method1141(@OriginalArg(0) Class62_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static299.anObject15 == null) {
			@Pc(5) Class53_Sub1_Sub1 local5 = new Class53_Sub1_Sub1();
			local12 = local5.method4397();
			Static299.anObject15 = Static65.method1201(local12);
		}
		if (Static259.anObject12 == null) {
			@Pc(27) Class53_Sub2_Sub1 local27 = new Class53_Sub2_Sub1();
			local12 = local27.method2377();
			Static259.anObject12 = Static65.method1201(local12);
		}
		@Pc(50) Class215 local50 = arg0.aClass215_1;
		if (local50.method5313() && Static86.anObject2 == null) {
			@Pc(72) byte[] local72 = Static240.method4084(4.0F, 0.6F, 4.0F, new Class304_Sub1(419684), 0.5F, 16.0F);
			Static86.anObject2 = Static65.method1201(local72);
		}
	}
}
