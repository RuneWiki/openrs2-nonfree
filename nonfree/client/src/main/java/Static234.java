import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lq", name = "H", descriptor = "Lclient!qg;")
	public static Class87 aClass87_19;

	@OriginalMember(owner = "client!lq", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_98 = new Class92(20, -1);

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "[I")
	public static final int[] anIntArray329 = new int[256];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!eq;)V")
	public static void method4163(@OriginalArg(1) Class66 arg0) {
		if (Static213.aClass244_27.method5965() == 0) {
			return;
		}
		@Pc(48) Class6_Sub20 local48;
		if (Static294.anInt5208 == 0) {
			for (local48 = (Class6_Sub20) Static213.aClass244_27.method5976(); local48 != null; local48 = (Class6_Sub20) Static213.aClass244_27.method5964()) {
				Static380.aClass231_2.method5641(local48.anInt3759, arg0, local48.anInt3760, false, local48.aBoolean247 ? Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 : null, false, local48.anInt3762, Static440.aClass29_3, local48.anInt3758, local48.anInt3761, arg0);
				local48.method6525();
			}
			Static206.method3172();
			return;
		}
		if (Static77.aClass66_4 == null) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(36, 32);
			Static77.aClass66_4 = Static96.method5011(local18, 0, Static45.aClass209_127, Static397.anInterface8_6, 0);
			Static451.aClass29_4 = Static77.aClass66_4.method5036(Static30.method756(Static146.anInt2984, Static410.aClass100_89), Static458.method4492(Static350.aClass100_69, Static146.anInt2984));
		}
		for (local48 = (Class6_Sub20) Static213.aClass244_27.method5976(); local48 != null; local48 = (Class6_Sub20) Static213.aClass244_27.method5964()) {
			Static380.aClass231_2.method5641(local48.anInt3759, arg0, local48.anInt3760, false, local48.aBoolean247 ? Static302.aClass3_Sub2_Sub1_Sub2_2.aClass259_1 : null, false, local48.anInt3762, Static451.aClass29_4, local48.anInt3758, local48.anInt3761, Static77.aClass66_4);
			local48.method6525();
		}
	}
}
