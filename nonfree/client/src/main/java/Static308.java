import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[Lclient!wca;")
	public static Class310[] aClass310Array1;

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "[Lclient!gp;")
	public static Class105[] aClass105Array1;

	@OriginalMember(owner = "client!mt", name = "o", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_116 = new Class239(100, -1);

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "Lclient!rk;")
	public static Class249 aClass249_30 = new Class249();

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "[I")
	public static final int[] anIntArray482 = new int[14];

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method4795(@OriginalArg(0) Class39 arg0) {
		@Pc(7) int local7 = Static536.anInt9313;
		@Pc(9) int local9 = Static178.anInt3307;
		@Pc(11) int local11 = Static529.anInt9144;
		@Pc(15) int local15 = Static193.anInt3519 - 3;
		if (Static82.aClass35_6 == null || Static254.aClass35_21 == null) {
			if (Static460.aClass53_147.method1621(Static138.anInt2610) && Static460.aClass53_147.method1621(Static6.anInt160)) {
				Static82.aClass35_6 = arg0.method6018(Static558.method6373(Static460.aClass53_147, Static138.anInt2610, 0));
				@Pc(61) Class241 local61 = Static558.method6373(Static460.aClass53_147, Static6.anInt160, 0);
				Static254.aClass35_21 = arg0.method6018(local61);
				local61.method6362();
				Static107.aClass35_16 = arg0.method6018(local61);
			} else {
				arg0.f(local7, local9, local11, 20, Static103.anInt1992 | 255 - Static431.anInt7912 << 24, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static82.aClass35_6 != null && Static254.aClass35_21 != null) {
			local88 = (local11 - Static254.aClass35_21.c() * 2) / Static82.aClass35_6.c();
			for (local90 = 0; local90 < local88; local90++) {
				Static82.aClass35_6.method7351(Static254.aClass35_21.c() + local7 + Static82.aClass35_6.c() * local90, local9);
			}
			Static254.aClass35_21.method7351(local7, local9);
			Static107.aClass35_16.method7351(local11 + local7 - Static107.aClass35_16.c(), local9);
		}
		Static175.aClass47_1.method7617(Static148.anInt2727 | 0xFF000000, -1, Static239.aClass202_253.method5139(Static172.anInt6352), local7 + 3, local9 + 14);
		arg0.f(local7, local9 + 20, local11, local15 - 20, -Static431.anInt7912 + 255 << 24 | Static103.anInt1992, 1);
		local88 = Static61.aClass214_1.method7241();
		local90 = Static61.aClass214_1.method7240();
		@Pc(173) int local173 = 0;
		@Pc(196) int local196;
		for (@Pc(178) Class2_Sub44 local178 = (Class2_Sub44) Static448.aClass249_63.method6527(); local178 != null; local178 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			local196 = (Static323.anInt6016 - local173 - 1) * 16 + local9 + 13 + 20;
			local173++;
			if (local7 < local88 && local88 < local7 + local11 && local90 > local196 - 13 && local196 + 4 > local90 && local178.aBoolean611) {
				arg0.f(local7, local196 - 12, local11, 16, Static539.anInt9336 | 255 - Static61.anInt1175 << 24, 1);
			}
		}
		if ((Static298.aClass35_24 == null || Static251.aClass35_20 == null || Static281.aClass35_23 == null) && Static460.aClass53_147.method1621(Static451.anInt8201) && Static460.aClass53_147.method1621(Static386.anInt7086) && Static460.aClass53_147.method1621(Static174.anInt3155)) {
			@Pc(278) Class241 local278 = Static558.method6373(Static460.aClass53_147, Static386.anInt7086, 0);
			Static251.aClass35_20 = arg0.method6018(local278);
			local278.method6362();
			Static274.aClass35_22 = arg0.method6018(local278);
			Static298.aClass35_24 = arg0.method6018(Static558.method6373(Static460.aClass53_147, Static451.anInt8201, 0));
			@Pc(303) Class241 local303 = Static558.method6373(Static460.aClass53_147, Static174.anInt3155, 0);
			Static281.aClass35_23 = arg0.method6018(local303);
			local303.method6362();
			Static275.aClass35_28 = arg0.method6018(local303);
		}
		@Pc(374) int local374;
		@Pc(334) int local334;
		if (Static298.aClass35_24 != null && Static251.aClass35_20 != null && Static281.aClass35_23 != null) {
			local196 = (local11 - Static281.aClass35_23.c() * 2) / Static298.aClass35_24.c();
			for (local334 = 0; local334 < local196; local334++) {
				Static298.aClass35_24.method7351(local7 + Static281.aClass35_23.c() + Static298.aClass35_24.c() * local334, local9 + local15 + -Static298.aClass35_24.la());
			}
			local374 = (local15 - Static281.aClass35_23.la() - 20) / Static251.aClass35_20.la();
			for (@Pc(376) int local376 = 0; local376 < local374; local376++) {
				Static251.aClass35_20.method7351(local7, local9 + Static251.aClass35_20.la() * local376 + 20);
				Static274.aClass35_22.method7351(local11 + local7 - Static274.aClass35_22.c(), Static251.aClass35_20.la() * local376 + local9 + 20);
			}
			Static281.aClass35_23.method7351(local7, local15 + local9 - Static281.aClass35_23.la());
			Static275.aClass35_28.method7351(local7 + local11 - Static281.aClass35_23.c(), -Static281.aClass35_23.la() + (local9 - -local15));
		}
		local173 = 0;
		for (@Pc(449) Class2_Sub44 local449 = (Class2_Sub44) Static448.aClass249_63.method6527(); local449 != null; local449 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			local334 = (Static323.anInt6016 - local173 - 1) * 16 + local9 + 13 + 20;
			local374 = Static148.anInt2727 | 0xFF000000;
			if (local7 < local88 && local88 < local11 + local7 && local334 - 13 < local90 && local90 < local334 + 4 && local449.aBoolean611) {
				local374 = Static445.anInt8077 | 0xFF000000;
			}
			@Pc(505) int[] local505 = null;
			if (Static450.method6872(local449.anInt8460)) {
				local505 = Static464.aClass115_1.method2970((int) local449.aLong215).anIntArray682;
			} else if (local449.anInt8465 != -1) {
				local505 = Static464.aClass115_1.method2970(local449.anInt8465).anIntArray682;
			} else if (Static224.method3540(local449.anInt8460)) {
				@Pc(592) Class2_Sub11 local592 = (Class2_Sub11) Static71.aClass127_13.method3205((long) local449.aLong215);
				if (local592 != null) {
					@Pc(597) Class1_Sub1_Sub2_Sub2 local597 = local592.aClass1_Sub1_Sub2_Sub2_1;
					@Pc(600) Class12 local600 = local597.aClass12_1;
					if (local600.anIntArray21 != null) {
						local600 = local600.method455(Static84.aClass302_1);
					}
					if (local600 != null) {
						local505 = local600.anIntArray22;
					}
				}
			} else if (Static326.method5156(local449.anInt8460)) {
				@Pc(561) Class129 local561;
				if (local449.anInt8460 == 1006) {
					local561 = Static505.aClass206_4.method5326((int) local449.aLong215);
				} else {
					local561 = Static505.aClass206_4.method5326((int) (local449.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local561.anIntArray392 != null) {
					local561 = local561.method3276(Static84.aClass302_1);
				}
				if (local561 != null) {
					local505 = local561.anIntArray396;
				}
			}
			@Pc(617) String local617 = Static288.method5991(local449);
			if (local505 != null) {
				local617 = local617 + Static98.method1916(local505);
			}
			Static175.aClass47_1.method7611(Static376.aClass35Array31, local374, local7 + 3, local334, local617, Static55.anIntArray91);
			if (local449.aBoolean610) {
				Static98.aClass35_13.method7351(Static188.aClass52_2.method1582(local617) + local7 + 5, local334 + -12);
			}
			local173++;
		}
		Static247.method3923(Static536.anInt9313, Static193.anInt3519, Static178.anInt3307, Static529.anInt9144);
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V")
	public static void method4796() {
		Static531.aClass231_69.method6240();
		Static2.aClass231_1.method6240();
		Static21.aClass231_4.method6240();
		Static275.aClass231_66.method6240();
		Static300.aClass231_47.method6240();
	}
}
