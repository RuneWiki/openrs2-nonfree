import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "Z")
	public static boolean aBoolean675;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "Lclient!kea;")
	public static Class161 aClass161_116;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "Lclient!ov;")
	public static Class3_Sub9_Sub3 aClass3_Sub9_Sub3_2;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_150 = new Class67("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public static void method7628() {
		Static300.method6522(false);
		Static225.anInt4875 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static326.aByteArrayArray16.length; local14++) {
			if (Static112.anIntArray658[local14] != -1 && Static326.aByteArrayArray16[local14] == null) {
				Static326.aByteArrayArray16[local14] = Static307.aClass161_51.method4243(0, Static112.anIntArray658[local14]);
				if (Static326.aByteArrayArray16[local14] == null) {
					Static225.anInt4875++;
					local12 = false;
				}
			}
			if (Static330.anIntArray546[local14] != -1 && Static328.aByteArrayArray17[local14] == null) {
				Static328.aByteArrayArray17[local14] = Static307.aClass161_51.method4254(0, Static523.anIntArrayArray87[local14], Static330.anIntArray546[local14]);
				if (Static328.aByteArrayArray17[local14] == null) {
					Static225.anInt4875++;
					local12 = false;
				}
			}
			if (Static28.anIntArray129[local14] != -1 && Static457.aByteArrayArray25[local14] == null) {
				Static457.aByteArrayArray25[local14] = Static307.aClass161_51.method4243(0, Static28.anIntArray129[local14]);
				if (Static457.aByteArrayArray25[local14] == null) {
					local12 = false;
					Static225.anInt4875++;
				}
			}
			if (Static75.anIntArray738[local14] != -1 && Static343.aByteArrayArray18[local14] == null) {
				Static343.aByteArrayArray18[local14] = Static307.aClass161_51.method4243(0, Static75.anIntArray738[local14]);
				if (Static343.aByteArrayArray18[local14] == null) {
					Static225.anInt4875++;
					local12 = false;
				}
			}
			if (Static165.anIntArray376 != null && Static521.aByteArrayArray29[local14] == null && Static165.anIntArray376[local14] != -1) {
				Static521.aByteArrayArray29[local14] = Static307.aClass161_51.method4254(0, Static523.anIntArrayArray87[local14], Static165.anIntArray376[local14]);
				if (Static521.aByteArrayArray29[local14] == null) {
					local12 = false;
					Static225.anInt4875++;
				}
			}
		}
		if (Static267.aClass82_3 == null) {
			if (Static496.aClass3_Sub10_Sub5_3 == null || !Static4.aClass161_114.method4251(Static496.aClass3_Sub10_Sub5_3.aString18 + "_staticelements")) {
				Static267.aClass82_3 = new Class82(0);
			} else if (Static4.aClass161_114.method4246(Static496.aClass3_Sub10_Sub5_3.aString18 + "_staticelements")) {
				Static267.aClass82_3 = Static332.method5276(Static496.aClass3_Sub10_Sub5_3.aString18 + "_staticelements", Static4.aClass161_114, Static56.aBoolean91);
			} else {
				Static225.anInt4875++;
				local12 = false;
			}
		}
		if (!local12) {
			Static366.anInt6835 = 1;
			return;
		}
		local12 = true;
		Static26.anInt760 = 0;
		@Pc(274) int local274;
		@Pc(284) int local284;
		for (@Pc(255) int local255 = 0; local255 < Static326.aByteArrayArray16.length; local255++) {
			@Pc(261) byte[] local261 = Static328.aByteArrayArray17[local255];
			if (local261 != null) {
				local274 = (Static467.anIntArray715[local255] >> 8) * 64 - Static223.anInt4827;
				local284 = (Static467.anIntArray715[local255] & 0xFF) * 64 - Static150.anInt3027;
				if (Static318.anInt5230 != 0) {
					local284 = 10;
					local274 = 10;
				}
				local12 &= Static166.method5705(local261, Static549.anInt9482, local284, local274, Static118.anInt2527);
			}
			local261 = Static343.aByteArrayArray18[local255];
			if (local261 != null) {
				local274 = (Static467.anIntArray715[local255] >> 8) * 64 - Static223.anInt4827;
				local284 = (Static467.anIntArray715[local255] & 0xFF) * 64 - Static150.anInt3027;
				if (Static318.anInt5230 != 0) {
					local284 = 10;
					local274 = 10;
				}
				local12 &= Static166.method5705(local261, Static549.anInt9482, local284, local274, Static118.anInt2527);
			}
		}
		if (!local12) {
			Static366.anInt6835 = 2;
			return;
		}
		if (Static366.anInt6835 != 0) {
			Static141.method2464(true, Static164.aClass59_1, Static157.aClass67_50.method1934(Static193.anInt7803) + "<br>(100%)");
		}
		Static442.method6680();
		Static130.method2265();
		@Pc(383) boolean local383 = false;
		if (Static121.aClass5_7.method7465() && Static7.aClass3_Sub15_Sub1_1.aBoolean607) {
			for (local274 = 0; local274 < Static326.aByteArrayArray16.length; local274++) {
				if (Static343.aByteArrayArray18[local274] != null || Static457.aByteArrayArray25[local274] != null) {
					local383 = true;
					break;
				}
			}
		}
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean606) {
			local274 = Static229.anIntArray440[Static249.anInt5108];
		} else {
			local274 = Static356.anIntArray567[Static249.anInt5108];
		}
		if (Static121.aClass5_7.method7426()) {
			local274++;
		}
		Static522.method7499(Static118.anInt2527, Static549.anInt9482, local274, local383, Static121.aClass5_7.method7479() > 0);
		for (local284 = 0; local284 < 4; local284++) {
			Static95.aClass306Array1[local284].method7366();
		}
		Static437.method6623();
		Static312.method5076(false);
		Static374.method5882();
		Static388.aBoolean628 = false;
		Static87.aClass178_1 = null;
		Static442.method6680();
		System.gc();
		Static300.method6522(true);
		Static241.method7408();
		Static272.anInt5626 = Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091);
		Static545.aBoolean688 = Static7.aClass3_Sub15_Sub1_1.aBoolean607;
		Static313.aBoolean391 = Class5_Sub1.lb >= 96;
		Static18.aBoolean61 = Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091);
		Static44.aBoolean80 = !Static7.aClass3_Sub15_Sub1_1.aBoolean599;
		Static132.anInt2742 = Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091) ? -1 : Static445.anInt8174;
		Static371.aBoolean443 = Static469.method7007(Static382.anInt7091) || Static7.aClass3_Sub15_Sub1_1.aBoolean601;
		Static397.aBoolean512 = Static7.aClass3_Sub15_Sub1_1.aBoolean602;
		Static143.aClass85_Sub1_1 = new Class85_Sub1(4, Static118.anInt2527, Static549.anInt9482, false);
		if (Static318.anInt5230 == 0) {
			Static134.method2308(Static143.aClass85_Sub1_1, Static326.aByteArrayArray16);
		} else {
			Static321.method5156(Static326.aByteArrayArray16, Static143.aClass85_Sub1_1);
		}
		Static134.method2311(Static118.anInt2527 >> 4, Static549.anInt9482 >> 4);
		Static135.method2316();
		if (local383) {
			Static124.method7288(true);
			Static537.aClass85_Sub1_2 = new Class85_Sub1(1, Static118.anInt2527, Static549.anInt9482, true);
			if (Static318.anInt5230 == 0) {
				Static134.method2308(Static537.aClass85_Sub1_2, Static457.aByteArrayArray25);
				Static300.method6522(true);
			} else {
				Static321.method5156(Static457.aByteArrayArray25, Static537.aClass85_Sub1_2);
				Static300.method6522(true);
			}
			Static537.aClass85_Sub1_2.method2281(Static143.aClass85_Sub1_1.anIntArrayArrayArray6[0]);
			Static537.aClass85_Sub1_2.method2285(Static121.aClass5_7, null, null);
			Static124.method7288(false);
		}
		Static143.aClass85_Sub1_1.method2285(Static121.aClass5_7, Static95.aClass306Array1, local383 ? Static537.aClass85_Sub1_2.anIntArrayArrayArray6 : null);
		if (Static318.anInt5230 == 0) {
			Static300.method6522(true);
			Static367.method5757(Static143.aClass85_Sub1_1, Static328.aByteArrayArray17);
			if (Static521.aByteArrayArray29 != null) {
				Static185.method3505();
			}
		} else {
			Static300.method6522(true);
			Static264.method4648(Static328.aByteArrayArray17, Static143.aClass85_Sub1_1);
		}
		Static130.method2265();
		if (Class5_Sub1.lb < 96) {
			Static97.method1902();
		}
		Static300.method6522(true);
		Static143.aClass85_Sub1_1.method2280(Static121.aClass5_7, null, local383 ? Static238.aClass52Array2[0] : null);
		Static143.aClass85_Sub1_1.method2291(Static121.aClass5_7);
		Static300.method6522(true);
		if (local383) {
			Static124.method7288(true);
			Static300.method6522(true);
			if (Static318.anInt5230 == 0) {
				Static367.method5757(Static537.aClass85_Sub1_2, Static343.aByteArrayArray18);
			} else {
				Static264.method4648(Static343.aByteArrayArray18, Static537.aClass85_Sub1_2);
			}
			Static130.method2265();
			Static300.method6522(true);
			Static537.aClass85_Sub1_2.method2280(Static121.aClass5_7, Static163.aClass52Array4[0], null);
			Static537.aClass85_Sub1_2.method2291(Static121.aClass5_7);
			Static300.method6522(true);
			Static124.method7288(false);
		}
		Static131.method2293();
		@Pc(716) int local716 = Static143.aClass85_Sub1_1.anInt2729;
		if (local716 > Static420.anInt7829) {
			local716 = Static420.anInt7829;
		}
		if (Static420.anInt7829 - 1 > local716) {
			local716 = Static420.anInt7829 - 1;
		}
		if (Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091)) {
			Static323.method5180(0);
		} else {
			Static323.method5180(local716);
		}
		@Pc(747) int local747;
		@Pc(751) int local751;
		for (@Pc(743) int local743 = 0; local743 < 4; local743++) {
			for (local747 = 0; local747 < Static118.anInt2527; local747++) {
				for (local751 = 0; local751 < Static549.anInt9482; local751++) {
					Static71.method1459(local743, local747, local751);
				}
			}
		}
		Static444.method6747();
		Static442.method6680();
		Static345.method5499();
		Static130.method2265();
		Static347.method5527();
		if (Static107.aFrame1 != null && Static467.aClass41_1 != null && Static512.anInt8932 == 10) {
			Static278.method4791(Static521.aClass158_122);
			Static515.aClass3_Sub27_Sub1_2.method7594(1057001181);
		}
		if (Static318.anInt5230 == 0) {
			local747 = (Static429.anInt7899 - (Static118.anInt2527 >> 4)) / 8;
			local751 = (Static429.anInt7899 + (Static118.anInt2527 >> 4)) / 8;
			@Pc(838) int local838 = (Static34.anInt888 - (Static549.anInt9482 >> 4)) / 8;
			@Pc(846) int local846 = ((Static549.anInt9482 >> 4) + Static34.anInt888) / 8;
			for (@Pc(850) int local850 = local747 - 1; local850 <= local751 + 1; local850++) {
				for (@Pc(856) int local856 = local838 - 1; local856 <= local846 + 1; local856++) {
					if (local850 < local747 || local850 > local751 || local838 > local856 || local846 < local856) {
						Static307.aClass161_51.method4259("m" + local850 + "_" + local856);
						Static307.aClass161_51.method4259("l" + local850 + "_" + local856);
					}
				}
			}
		}
		if (Static512.anInt8932 == 3) {
			Static333.method5283(2);
		} else if (Static512.anInt8932 == 7) {
			Static333.method5283(6);
		} else {
			Static333.method5283(9);
			if (Static467.aClass41_1 != null) {
				Static278.method4791(Static295.aClass158_75);
			}
		}
		Static206.method3803();
		Static442.method6680();
		Static221.method4024();
	}
}
