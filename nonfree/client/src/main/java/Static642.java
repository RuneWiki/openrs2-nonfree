import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!ad;")
	public static final Class7 aClass7_7 = new Class7();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method8426() {
		if (Static44.aClass182ArrayArray1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < Static44.aClass182ArrayArray1.length; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static44.aClass182ArrayArray1[local9].length; local13++) {
				Static44.aClass182ArrayArray1[local9][local13] = Static527.aClass182_2;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public static void method8429() {
		Static374.method5525(Static503.aClass208_9);
		Static149.anInt2809++;
		if (Static303.aBoolean731 && Static363.aBoolean495) {
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			if (Static649.aBoolean735) {
				local26 = Static359.method5380();
				local28 = Static265.method7952();
			}
			@Pc(43) int local43 = Static542.aClass75_1.method8412() + local26;
			@Pc(49) int local49 = Static542.aClass75_1.method8405() + local28;
			local49 -= Static595.anInt9374;
			local43 -= Static67.anInt9111;
			if (local43 < Static216.anInt3996) {
				local43 = Static216.anInt3996;
			}
			if (Static526.aClass208_10.anInt5639 + Static216.anInt3996 < Static503.aClass208_9.anInt5639 + local43) {
				local43 = Static216.anInt3996 + Static526.aClass208_10.anInt5639 - Static503.aClass208_9.anInt5639;
			}
			if (local49 < Static551.anInt8933) {
				local49 = Static551.anInt8933;
			}
			if (local49 + Static503.aClass208_9.anInt5630 > Static551.anInt8933 + Static526.aClass208_10.anInt5630) {
				local49 = Static526.aClass208_10.anInt5630 + Static551.anInt8933 - Static503.aClass208_9.anInt5630;
			}
			@Pc(124) int local124 = local43 + Static526.aClass208_10.anInt5594 - Static216.anInt3996;
			@Pc(132) int local132 = Static526.aClass208_10.anInt5648 + local49 - Static551.anInt8933;
			@Pc(182) Class3_Sub13 local182;
			if (Static542.aClass75_1.method8413()) {
				if (Static149.anInt2809 > Static503.aClass208_9.anInt5654) {
					@Pc(144) int local144 = local43 - Static96.anInt2065;
					@Pc(149) int local149 = local49 - Static344.anInt6204;
					if (local144 > Static503.aClass208_9.anInt5621 || local144 < -Static503.aClass208_9.anInt5621 || local149 > Static503.aClass208_9.anInt5621 || -Static503.aClass208_9.anInt5621 > local149) {
						Static514.aBoolean645 = true;
					}
				}
				if (Static503.aClass208_9.anObjectArray11 != null && Static514.aBoolean645) {
					local182 = new Class3_Sub13();
					local182.anInt2330 = local124;
					local182.anObjectArray1 = Static503.aClass208_9.anObjectArray11;
					local182.anInt2327 = local132;
					local182.aClass208_2 = Static503.aClass208_9;
					Static543.method7498(local182);
					return;
				}
			} else {
				if (Static514.aBoolean645) {
					Static61.method1523();
					if (Static503.aClass208_9.anObjectArray8 != null) {
						local182 = new Class3_Sub13();
						local182.anInt2327 = local132;
						local182.aClass208_2 = Static503.aClass208_9;
						local182.anInt2330 = local124;
						local182.anObjectArray1 = Static503.aClass208_9.anObjectArray8;
						local182.aClass208_1 = Static267.aClass208_5;
						Static543.method7498(local182);
					}
					if (Static267.aClass208_5 != null && Static82.method1766(Static503.aClass208_9) != null) {
						Static364.method5418(Static267.aClass208_5, Static503.aClass208_9);
					}
				} else if ((Static516.anInt8103 == 1 || Static101.method1997()) && Static37.anInt1104 > 2) {
					Static603.method8017(Static595.anInt9374 + Static344.anInt6204, Static96.anInt2065 + Static67.anInt9111);
				} else if (Static61.method1521()) {
					Static603.method8017(Static344.anInt6204 + Static595.anInt9374, Static67.anInt9111 - -Static96.anInt2065);
				}
				Static503.aClass208_9 = null;
			}
		} else if (Static149.anInt2809 > 1) {
			Static503.aClass208_9 = null;
		}
	}
}
