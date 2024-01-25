import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wr", name = "zb", descriptor = "I")
	public static int anInt7783;

	@OriginalMember(owner = "client!wr", name = "rb", descriptor = "I")
	public static int anInt7775 = 0;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
	public static void method6036() {
		Static144.anInt2452 = 1;
		Static363.anInt6199 = 2;
		Static296.aBoolean145 = false;
		Static348.anInt5981 = -1;
		Static228.anInt4117 = 0;
		Static32.aClass250_7 = null;
		Static37.anInt703 = -1;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public static void method6037() {
		for (@Pc(6) Class1_Sub4 local6 = (Class1_Sub4) Static323.aClass266_43.method6000(); local6 != null; local6 = (Class1_Sub4) Static323.aClass266_43.method5994()) {
			if (Static268.aClass211ArrayArrayArray4 == null) {
				local6.method6071();
			} else {
				@Pc(30) int local30;
				@Pc(40) Class26_Sub1 local40;
				@Pc(76) Class26_Sub1_Sub3 local76;
				@Pc(98) Class26_Sub3 local98;
				@Pc(208) Class26_Sub2 local208;
				@Pc(163) Class26_Sub4 local163;
				@Pc(134) Class26_Sub3_Sub3 local134;
				@Pc(182) Class26_Sub4_Sub2 local182;
				if (Static403.anInt6978 >= local6.anInt791) {
					local30 = Static127.anIntArray286[local6.anInt795];
					if (local30 == 0) {
						local40 = Static259.method5039(local6.anInt799, local6.anInt796, local6.anInt802);
						if (local40 instanceof Class26_Sub1_Sub3) {
							Static198.method3012(local6.anInt799, local6.anInt796, local6.anInt802);
							local76 = (Class26_Sub1_Sub3) local40;
							if (local76.aClass26_Sub1_1 != null) {
								Static174.method2722(local6.anInt799, local6.anInt796, local6.anInt802, local76.aClass26_Sub1_1, null);
							}
						}
					} else if (local30 == 1) {
						local98 = Static81.method1400(local6.anInt799, local6.anInt796, local6.anInt802);
						if (local98 instanceof Class26_Sub3_Sub3) {
							Static176.method2751(local6.anInt799, local6.anInt796, local6.anInt802);
							local134 = (Class26_Sub3_Sub3) local98;
							if (local134.aClass26_Sub3_1 != null) {
								Static35.method1646(local6.anInt799, local6.anInt796, local6.anInt802, local134.aClass26_Sub3_1, null);
							}
						}
					} else if (local30 == 2) {
						local208 = Static278.method5819(local6.anInt799, local6.anInt796, local6.anInt802, jv.class);
						if (local208 instanceof Class26_Sub2_Sub6) {
							Static148.method2223(local6.anInt799, local6.anInt796, local6.anInt802, jv.class);
							@Pc(427) Class26_Sub2_Sub6 local427 = (Class26_Sub2_Sub6) local208;
							if (local427.aClass26_Sub2_2 != null) {
								Static176.method2753(local427.aClass26_Sub2_2, false);
							}
						}
					} else if (local30 == 3) {
						local163 = Static366.method4342(local6.anInt799, local6.anInt796, local6.anInt802);
						if (local163 instanceof Class26_Sub4_Sub2) {
							Static397.method5404(local6.anInt799, local6.anInt796, local6.anInt802);
							local182 = (Class26_Sub4_Sub2) local163;
							if (local182.aClass26_Sub4_1 != null) {
								Static208.method3188(local6.anInt799, local6.anInt796, local6.anInt802, local182.aClass26_Sub4_1);
							}
						}
					}
					local6.method6071();
				} else if (Static403.anInt6978 == local6.anInt807) {
					local30 = Static127.anIntArray286[local6.anInt795];
					if (local30 == 0) {
						local40 = Static259.method5039(local6.anInt799, local6.anInt796, local6.anInt802);
						if (local40 instanceof Class26_Sub1_Sub3) {
							local6.method6071();
						} else if (Static359.method4949(local6.anInt799, local6.anInt796, local6.anInt802) == null) {
							local76 = new Class26_Sub1_Sub3(local6.anInt795, local6.anInt793, local6.anInt794, local6.anInt797, local6.anInt790, local40);
							Static174.method2722(local6.anInt799, local6.anInt796, local6.anInt802, local76, null);
						} else {
							local6.method6071();
						}
					} else if (local30 == 1) {
						local98 = Static81.method1400(local6.anInt799, local6.anInt796, local6.anInt802);
						if (local98 instanceof Class26_Sub3_Sub3) {
							local6.method6071();
						} else if (Static182.method5528(local6.anInt799, local6.anInt796, local6.anInt802) == null) {
							local134 = new Class26_Sub3_Sub3(local6.anInt795, local6.anInt793, local6.anInt794, local6.anInt797, local6.anInt790, local98);
							Static35.method1646(local6.anInt799, local6.anInt796, local6.anInt802, local134, null);
						} else {
							local6.method6071();
						}
					} else if (local30 == 2) {
						local208 = Static278.method5819(local6.anInt799, local6.anInt796, local6.anInt802, jv.class);
						if (local208 instanceof Class26_Sub2_Sub6) {
							local6.method6071();
						} else {
							Static148.method2223(local6.anInt799, local6.anInt796, local6.anInt802, jv.class);
							@Pc(239) Class182 local239 = Static71.aClass105_6.method2336(local6.anInt806);
							@Pc(252) int local252;
							@Pc(255) int local255;
							if (local6.anInt793 == 1 || local6.anInt793 == 3) {
								local255 = local239.anInt5486;
								local252 = local239.anInt5487;
							} else {
								local252 = local239.anInt5486;
								local255 = local239.anInt5487;
							}
							@Pc(296) Class26_Sub2_Sub6 local296 = new Class26_Sub2_Sub6(local6.anInt795, local6.anInt793, local6.anInt799, local6.anInt794, local6.anInt797, local6.anInt790, local6.anInt796, local252 + local6.anInt796 - 1, local6.anInt802, local255 + local6.anInt802 - 1, local208);
							Static176.method2753(local296, false);
						}
					} else if (local30 == 3) {
						local163 = Static366.method4342(local6.anInt799, local6.anInt796, local6.anInt802);
						if (local163 instanceof Class26_Sub4_Sub2) {
							local6.method6071();
						} else {
							local182 = new Class26_Sub4_Sub2(local6.anInt794, local6.anInt797, local6.anInt790, local163);
							Static208.method3188(local6.anInt799, local6.anInt796, local6.anInt802, local182);
						}
					}
				}
			}
		}
	}
}
