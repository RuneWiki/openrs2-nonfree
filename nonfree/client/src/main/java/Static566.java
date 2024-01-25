import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!ko;")
	public static final Class208 aClass208_10 = new Class208("", 17);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_235 = new Class381(36, 7);

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V")
	public static void method7656() {
		@Pc(15) Class5_Sub36_Sub2 local15 = Static4.aClass389_17.aClass5_Sub36_Sub2_2;
		while (local15.method7344(Static4.aClass389_17.anInt10756) >= 15) {
			@Pc(29) int local29 = local15.method7343(15);
			if (local29 == 32767) {
				break;
			}
			@Pc(36) boolean local36 = false;
			@Pc(43) Class5_Sub9 local43 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local29);
			@Pc(49) Class4_Sub1_Sub1_Sub2_Sub2 local49;
			if (local43 == null) {
				local49 = new Class4_Sub1_Sub1_Sub2_Sub2();
				local49.anInt6843 = local29;
				local43 = new Class5_Sub9(local49);
				Static677.aClass306_37.method6944(local43, (long) local29, -12002);
				local36 = true;
				Static591.aClass5_Sub9Array1[Static259.anInt4657++] = local43;
			}
			local49 = local43.aClass4_Sub1_Sub1_Sub2_Sub2_1;
			Static558.anIntArray500[Static438.anInt7239++] = local29;
			local49.anInt6827 = Static115.anInt1871;
			if (local49.aClass105_1 != null && local49.aClass105_1.method2620()) {
				Static72.method1169(local49);
			}
			@Pc(113) int local113 = (local15.method7343(3) + 4 & 0x75C00007) << 11;
			local49.method5947(Static378.aClass369_2.method8471(local15.method7343(14)));
			@Pc(128) int local128 = local15.method7343(5);
			if (local128 > 15) {
				local128 -= 32;
			}
			@Pc(141) int local141 = local15.method7343(1);
			@Pc(146) int local146 = local15.method7343(2);
			@Pc(151) int local151 = local15.method7343(5);
			if (local151 > 15) {
				local151 -= 32;
			}
			@Pc(162) int local162 = local15.method7343(1);
			if (local162 == 1) {
				Static669.anIntArray619[Static149.anInt2925++] = local29;
			}
			local49.method5931(local49.aClass105_1.anInt2811);
			local49.anInt6855 = local49.aClass105_1.anInt2841 << 3;
			if (local36) {
				local49.method5936(true, local113);
			}
			local49.method5946(local151 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0], local141 == 1, local128 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0], local49.method5932(), local146);
			if (local49.aClass105_1.method2620()) {
				Static114.method1694(local49, (Class354) null, 0, local49.aByte139, local49.anIntArray405[0], (Class4_Sub1_Sub1_Sub2_Sub1) null, local49.anIntArray404[0]);
			}
		}
		local15.method7340();
	}
}
