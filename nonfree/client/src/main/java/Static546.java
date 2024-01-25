import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!tia", name = "t", descriptor = "I")
	public static int anInt9224;

	@OriginalMember(owner = "client!tia", name = "u", descriptor = "[Lclient!uda;")
	public static final Class329[] aClass329Array3 = new Class329[2048];

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7616(@OriginalArg(0) Class33 arg0) {
		if (Static238.aClass276_35.method6918() == 0) {
			return;
		}
		@Pc(31) Class3_Sub19 local31;
		if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 0) {
			for (local31 = (Class3_Sub19) Static238.aClass276_35.method6907(); local31 != null; local31 = (Class3_Sub19) Static238.aClass276_35.method6912()) {
				Static367.aClass281_1.method6985(local31.anInt3492, local31.anInt3499, local31.aBoolean290 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 : null, Static641.aClass25_14, local31.anInt3497, local31.anInt3500, local31.anInt3495, false, arg0, arg0, false);
				local31.method8671();
			}
			Static594.method8139();
			return;
		}
		if (Static431.aClass33_15 == null) {
			@Pc(78) Canvas local78 = new Canvas();
			local78.setSize(36, 32);
			Static431.aClass33_15 = Static322.method5439(Static641.anInterface5_12, Static393.aClass181_30, 0, local78, 0);
			Static584.aClass25_11 = Static431.aClass33_15.method6202(Static256.method4821(Static397.anInt7604, Static340.aClass181_62), Static649.method607(Static150.aClass181_34, Static397.anInt7604));
		}
		for (local31 = (Class3_Sub19) Static238.aClass276_35.method6907(); local31 != null; local31 = (Class3_Sub19) Static238.aClass276_35.method6912()) {
			Static367.aClass281_1.method6985(local31.anInt3492, local31.anInt3499, local31.aBoolean290 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aClass352_1 : null, Static584.aClass25_11, local31.anInt3497, local31.anInt3500, local31.anInt3495, false, Static431.aClass33_15, arg0, false);
			local31.method8671();
		}
	}
}
