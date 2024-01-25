import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "I")
	public static int anInt6656;

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "(I)V")
	public static void method5814() {
		Static472.aClass14_Sub1_Sub3_3.method1914();
		Static625.anInt11174 = 1;
		Static556.aClass14_Sub1_Sub3_4 = null;
		Static431.aClass310_93 = null;
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V")
	public static void method5815() {
		Static538.method7933(Static649.aClass299_12);
		Static207.anInt3640++;
		if (Static690.aBoolean785 && Static30.aBoolean33) {
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			if (Static656.aBoolean741) {
				local32 = Static532.method7876();
				local34 = Static276.method4674();
			}
			@Pc(48) int local48 = local32 + Static656.aClass118_1.method7586();
			@Pc(54) int local54 = local34 + Static656.aClass118_1.method7590();
			local48 -= Static109.anInt1855;
			local54 -= Static611.anInt10054;
			if (local48 < Static327.anInt5651) {
				local48 = Static327.anInt5651;
			}
			if (local54 < Static558.anInt9347) {
				local54 = Static558.anInt9347;
			}
			if (local48 + Static649.aClass299_12.anInt8573 > Static327.anInt5651 + Static530.aClass299_9.anInt8573) {
				local48 = Static530.aClass299_9.anInt8573 + Static327.anInt5651 - Static649.aClass299_12.anInt8573;
			}
			if (local54 + Static649.aClass299_12.anInt8547 > Static558.anInt9347 + Static530.aClass299_9.anInt8547) {
				local54 = Static530.aClass299_9.anInt8547 + Static558.anInt9347 - Static649.aClass299_12.anInt8547;
			}
			@Pc(125) int local125 = Static530.aClass299_9.anInt8552 + local48 - Static327.anInt5651;
			@Pc(140) int local140 = local54 + Static530.aClass299_9.anInt8617 - Static558.anInt9347;
			@Pc(211) Class14_Sub10 local211;
			if (Static656.aClass118_1.method7593()) {
				if (Static207.anInt3640 > Static649.aClass299_12.anInt8601) {
					@Pc(159) int local159 = local48 - Static681.anInt11091;
					@Pc(164) int local164 = local54 - Static575.anInt9532;
					if (local159 > Static649.aClass299_12.anInt8592 || local159 < -Static649.aClass299_12.anInt8592 || Static649.aClass299_12.anInt8592 < local164 || -Static649.aClass299_12.anInt8592 > local164) {
						Static614.aBoolean702 = true;
					}
				}
				if (Static649.aClass299_12.anObjectArray18 != null && Static614.aBoolean702) {
					local211 = new Class14_Sub10();
					local211.anInt1058 = local140;
					local211.anObjectArray1 = Static649.aClass299_12.anObjectArray18;
					local211.anInt1053 = local125;
					local211.aClass299_2 = Static649.aClass299_12;
					Static672.method9304(local211);
					return;
				}
			} else {
				if (Static614.aBoolean702) {
					Static214.method3269();
					if (Static649.aClass299_12.anObjectArray4 != null) {
						local211 = new Class14_Sub10();
						local211.anObjectArray1 = Static649.aClass299_12.anObjectArray4;
						local211.aClass299_1 = Static381.aClass299_6;
						local211.anInt1053 = local125;
						local211.anInt1058 = local140;
						local211.aClass299_2 = Static649.aClass299_12;
						Static672.method9304(local211);
					}
					if (Static381.aClass299_6 != null && Static80.method1363(Static649.aClass299_12) != null) {
						Static372.method5789(Static649.aClass299_12, Static381.aClass299_6);
					}
				} else if ((Static237.anInt4576 == 1 || Static407.method2877()) && Static638.anInt10454 > 2) {
					Static103.method1713(Static575.anInt9532 + Static611.anInt10054, Static109.anInt1855 - -Static681.anInt11091);
				} else if (Static145.method2168()) {
					Static103.method1713(Static575.anInt9532 + Static611.anInt10054, Static109.anInt1855 + Static681.anInt11091);
				}
				Static649.aClass299_12 = null;
			}
		} else if (Static207.anInt3640 > 1) {
			Static649.aClass299_12 = null;
		}
	}
}
