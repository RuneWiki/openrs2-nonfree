import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!dc;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[200];

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "[I")
	public static final int[] anIntArray374 = new int[6];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method2563(@OriginalArg(0) Class164 arg0) {
		if (Static329.aClass17_38.method210() == 0) {
			return;
		}
		@Pc(54) Class1_Sub5 local54;
		if (Static25.anInt394 == 0) {
			for (local54 = (Class1_Sub5) Static329.aClass17_38.method202(); local54 != null; local54 = (Class1_Sub5) Static329.aClass17_38.method207()) {
				Static263.aClass102_2.method2179(local54.anInt619, false, local54.anInt622, local54.anInt620, local54.anInt623, local54.anInt624, arg0, Static227.aClass137_6, false, arg0, local54.aBoolean56 ? Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 : null);
				local54.method5577();
			}
			Static262.method5507();
			return;
		}
		if (Static17.aClass164_1 == null) {
			@Pc(22) Canvas local22 = new Canvas();
			local22.setSize(36, 32);
			Static17.aClass164_1 = Static347.method5335(0, Static341.aClass162_5, Static16.anInterface2_1, local22, 0);
			Static42.aClass137_1 = Static17.aClass164_1.method5352(Static286.method4348(Static27.aClass230_8, Static107.anInt5816), Static397.method1432(Static145.aClass230_41, Static107.anInt5816));
		}
		for (local54 = (Class1_Sub5) Static329.aClass17_38.method202(); local54 != null; local54 = (Class1_Sub5) Static329.aClass17_38.method207()) {
			Static263.aClass102_2.method2179(local54.anInt619, false, local54.anInt622, local54.anInt620, local54.anInt623, local54.anInt624, arg0, Static42.aClass137_1, false, Static17.aClass164_1, local54.aBoolean56 ? Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 : null);
			local54.method5577();
		}
	}
}
