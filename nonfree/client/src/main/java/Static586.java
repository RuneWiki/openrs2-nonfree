import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_189 = new Class156(74, 4);

	@OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
	public static int anInt9462 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method8070(@OriginalArg(1) Class100 arg0) {
		if (Static385.aClass20_32.method372() == 0) {
			return;
		}
		@Pc(33) Class5_Sub45 local33;
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 0) {
			for (local33 = (Class5_Sub45) Static385.aClass20_32.method378(); local33 != null; local33 = (Class5_Sub45) Static385.aClass20_32.method366()) {
				Static82.aClass134_1.method3186(local33.anInt7233, false, local33.anInt7235, false, Static510.aClass70_11, arg0, local33.anInt7234, local33.aBoolean483 ? Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 : null, arg0, local33.anInt7236, local33.anInt7231);
				local33.method9222();
			}
			Static352.method5188(-107);
			return;
		}
		if (Static75.aClass100_2 == null) {
			@Pc(87) Canvas local87 = new Canvas();
			local87.setSize(36, 32);
			Static75.aClass100_2 = Static121.method1790(local87, Static63.aClass126_44, 0, 0, Static472.anInterface7_10);
			Static429.aClass70_8 = Static75.aClass100_2.method8612(Static603.method8267(Static600.aClass126_275, Static50.anInt900), Static692.method8280(Static27.aClass126_18, Static50.anInt900));
		}
		for (local33 = (Class5_Sub45) Static385.aClass20_32.method378(); local33 != null; local33 = (Class5_Sub45) Static385.aClass20_32.method366()) {
			Static82.aClass134_1.method3186(local33.anInt7233, false, local33.anInt7235, false, Static429.aClass70_8, Static75.aClass100_2, local33.anInt7234, local33.aBoolean483 ? Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aClass359_1 : null, arg0, local33.anInt7236, local33.anInt7231);
			local33.method9222();
		}
	}
}
