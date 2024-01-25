import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_95 = new Class376(81, -1);

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!bl;")
	public static final Class41 aClass41_4 = new Class41();

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_134 = new Class126(0, -2);

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method5599(@OriginalArg(0) Class16 arg0) {
		if (Static51.aClass193_6.method4463() == 0) {
			return;
		}
		@Pc(62) Class3_Sub42 local62;
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() == 0) {
			for (local62 = (Class3_Sub42) Static51.aClass193_6.method4457(); local62 != null; local62 = (Class3_Sub42) Static51.aClass193_6.method4459()) {
				Static237.aClass371_2.method8313(false, false, local62.anInt7954, local62.anInt7950, Static157.aClass69_2, arg0, local62.aBoolean602 ? Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 : null, local62.anInt7953, arg0, local62.anInt7956, local62.anInt7955);
				local62.method8770();
			}
			Static517.method7334();
			return;
		}
		if (Static605.aClass16_14 == null) {
			@Pc(32) Canvas local32 = new Canvas();
			local32.setSize(36, 32);
			Static605.aClass16_14 = Static13.method132(Static10.aClass143_2, Static166.anInterface5_5, 0, 0, local32);
			Static103.aClass69_1 = Static605.aClass16_14.method8117(Static102.method2014(Static72.anInt1666, Static41.aClass143_11), Static683.method3282(Static235.aClass143_57, Static72.anInt1666));
		}
		for (local62 = (Class3_Sub42) Static51.aClass193_6.method4457(); local62 != null; local62 = (Class3_Sub42) Static51.aClass193_6.method4459()) {
			Static237.aClass371_2.method8313(false, false, local62.anInt7954, local62.anInt7950, Static103.aClass69_1, arg0, local62.aBoolean602 ? Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aClass293_1 : null, local62.anInt7953, Static605.aClass16_14, local62.anInt7956, local62.anInt7955);
			local62.method8770();
		}
	}
}
