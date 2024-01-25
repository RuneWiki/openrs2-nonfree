import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kja", name = "Qb", descriptor = "I")
	public static int anInt5772;

	@OriginalMember(owner = "client!kja", name = "Nb", descriptor = "I")
	public static int anInt5770 = 0;

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(Lclient!ha;I)V")
	public static void method5238(@OriginalArg(0) Class101 arg0) {
		if (Static510.aClass271_52.method7178() == 0) {
			return;
		}
		@Pc(32) Class2_Sub50 local32;
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 0) {
			for (local32 = (Class2_Sub50) Static510.aClass271_52.method7177(); local32 != null; local32 = (Class2_Sub50) Static510.aClass271_52.method7175()) {
				Static372.aClass343_1.method8552(false, local32.anInt10519, Static514.aClass59_13, local32.anInt10516, local32.anInt10520, local32.aBoolean769 ? Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 : null, local32.anInt10517, local32.anInt10518, arg0, arg0, false);
				local32.method9825();
			}
			Static403.method6620();
			return;
		}
		if (Static355.aClass101_8 == null) {
			@Pc(79) Canvas local79 = new Canvas();
			local79.setSize(36, 32);
			Static355.aClass101_8 = Static502.method7892(Static560.aClass124_118, 0, local79, 0, Static117.anInterface3_2);
			Static639.aClass59_14 = Static355.aClass101_8.method8146(Static266.method4575(Static227.aClass124_49, Static307.anInt5549), Static676.method1697(Static409.aClass124_84, Static307.anInt5549));
		}
		for (local32 = (Class2_Sub50) Static510.aClass271_52.method7177(); local32 != null; local32 = (Class2_Sub50) Static510.aClass271_52.method7175()) {
			Static372.aClass343_1.method8552(false, local32.anInt10519, Static639.aClass59_14, local32.anInt10516, local32.anInt10520, local32.aBoolean769 ? Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aClass9_1 : null, local32.anInt10517, local32.anInt10518, arg0, Static355.aClass101_8, false);
			local32.method9825();
		}
	}
}
