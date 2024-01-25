import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "(I)V")
	public static void method3923() {
		if (Static372.aClass366_5.aBoolean719 && Static476.aClass271_5.anInt7991 != -1) {
			Static435.method6471(Static476.aClass271_5.anInt7991, Static476.aClass271_5.aString164);
		}
	}

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(Z)V")
	public static void method3924() {
		Static407.anInt7865 = 0;
		Static520.anInt10609 = 0;
		Static111.method2041();
		Static262.method4142();
		Static170.method2831();
		@Pc(17) boolean local17 = false;
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static520.anInt10609; local19++) {
			local25 = Static192.anIntArray190[local19];
			@Pc(32) Class4_Sub29 local32 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			@Pc(35) Class21_Sub1_Sub1_Sub1_Sub1 local35 = local32.aClass21_Sub1_Sub1_Sub1_Sub1_1;
			if (Static117.aBoolean207 && Static467.method6810(local25)) {
				Static221.method954();
			}
			if (Static306.anInt6122 != local35.anInt4260) {
				if (local35.aClass51_1.method1374()) {
					Static408.method6171(local35);
				}
				local35.method1714(null);
				local32.method8193();
				local17 = true;
			}
		}
		if (local17) {
			Static222.anInt4653 = Static144.aClass221_6.method5070();
			Static144.aClass221_6.method5074(Static590.aClass4_Sub29Array1);
		}
		if (Static549.aClass4_Sub13_Sub2_2.anInt9170 != Static488.anInt9250) {
			throw new RuntimeException("gnp1 pos:" + Static549.aClass4_Sub13_Sub2_2.anInt9170 + " psize:" + Static488.anInt9250);
		}
		for (local25 = 0; local25 < Static137.anInt3042; local25++) {
			if (Static144.aClass221_6.method5075((long) Static24.anIntArray24[local25]) == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static137.anInt3042);
			}
		}
	}
}
