import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Z")
	public static boolean aBoolean751 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method8692(@OriginalArg(0) Class67 arg0) {
		if (Static192.aClass357_10.method8397() == 0) {
			return;
		}
		@Pc(26) Class3_Sub37 local26;
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 0) {
			for (local26 = (Class3_Sub37) Static192.aClass357_10.method8391(); local26 != null; local26 = (Class3_Sub37) Static192.aClass357_10.method8392()) {
				Static243.aClass406_2.method9395(arg0, local26.anInt8020, local26.anInt8018, local26.anInt8015, arg0, local26.anInt8017, false, local26.aBoolean613 ? Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 : null, local26.anInt8014, false, Static705.aClass44_53);
				local26.method9446();
			}
			Static693.method9085();
			return;
		}
		if (Static258.aClass67_8 == null) {
			@Pc(82) Canvas local82 = new Canvas();
			local82.setSize(36, 32);
			Static258.aClass67_8 = Static494.method7146(0, Static644.anInterface2_12, 0, local82, Static689.aClass221_83);
			Static224.aClass44_16 = Static258.aClass67_8.method7641(Static708.method9245(Static671.anInt10623, Static385.aClass221_110), Static728.method4754(Static403.aClass221_115, Static671.anInt10623), true);
		}
		for (local26 = (Class3_Sub37) Static192.aClass357_10.method8391(); local26 != null; local26 = (Class3_Sub37) Static192.aClass357_10.method8392()) {
			Static243.aClass406_2.method9395(Static258.aClass67_8, local26.anInt8020, local26.anInt8018, local26.anInt8015, arg0, local26.anInt8017, false, local26.aBoolean613 ? Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 : null, local26.anInt8014, false, Static224.aClass44_16);
			local26.method9446();
		}
	}
}
