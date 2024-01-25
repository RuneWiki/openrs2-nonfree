import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt97;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method156(@OriginalArg(1) Class13 arg0) {
		if (Static395.aClass338_155.method8164() == 0) {
			return;
		}
		@Pc(60) Class3_Sub44 local60;
		if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 0) {
			for (local60 = (Class3_Sub44) Static395.aClass338_155.method8177(); local60 != null; local60 = (Class3_Sub44) Static395.aClass338_155.method8168()) {
				Static170.aClass370_1.method8903(local60.anInt6806, false, local60.aBoolean486 ? Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 : null, local60.anInt6803, local60.anInt6807, Static400.aClass69_9, arg0, false, local60.anInt6801, local60.anInt6805, arg0);
				local60.method9380();
			}
			Static540.method7765();
			return;
		}
		if (Static631.aClass13_17 == null) {
			@Pc(30) Canvas local30 = new Canvas();
			local30.setSize(36, 32);
			Static631.aClass13_17 = Static550.method7865(0, Static512.aClass15_130, Static35.anInterface4_3, 0, local30);
			Static503.aClass69_10 = Static631.aClass13_17.method8515(Static617.method8708(Static218.aClass15_62, Static35.anInt818), Static682.method2750(Static369.aClass15_97, Static35.anInt818));
		}
		for (local60 = (Class3_Sub44) Static395.aClass338_155.method8177(); local60 != null; local60 = (Class3_Sub44) Static395.aClass338_155.method8168()) {
			Static170.aClass370_1.method8903(local60.anInt6806, false, local60.aBoolean486 ? Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 : null, local60.anInt6803, local60.anInt6807, Static503.aClass69_10, arg0, false, local60.anInt6801, local60.anInt6805, Static631.aClass13_17);
			local60.method9380();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!jp;)Lclient!cea;")
	public static Class55_Sub1 method157(@OriginalArg(1) Class3_Sub25 arg0) {
		return new Class55_Sub1(arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8607(), arg0.method8607(), arg0.method8632());
	}
}
