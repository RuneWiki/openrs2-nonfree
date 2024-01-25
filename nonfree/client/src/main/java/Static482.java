import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
	public static int anInt8091;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(BLclient!pea;)V")
	public static void method6686(@OriginalArg(1) Class121_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static476.anObject26 == null) {
			@Pc(5) Class11_Sub2_Sub1 local5 = new Class11_Sub2_Sub1();
			local12 = local5.method5743();
			Static476.anObject26 = Static78.method1178(local12);
		}
		if (Static448.anObject25 == null) {
			@Pc(27) Class11_Sub1_Sub1 local27 = new Class11_Sub1_Sub1();
			local12 = local27.method171();
			Static448.anObject25 = Static78.method1178(local12);
		}
		@Pc(50) Class54 local50 = arg0.aClass54_1;
		if (local50.method887() && Static109.anObject30 == null) {
			@Pc(72) byte[] local72 = Static569.method7792(4.0F, 0.6F, new Class310_Sub1(419684), 4.0F, 0.5F, 16.0F);
			Static109.anObject30 = Static78.method1178(local72);
		}
	}
}
