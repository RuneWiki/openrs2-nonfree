import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!va", name = "z", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array10;

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Lclient!gd;")
	public static Class3_Sub1_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_4;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1397 = Static59.method1195("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public static int anInt3350 = 500;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1398 = Static59.method1195("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public static int anInt3361 = 0;

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1399 = Static59.method1195("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLclient!jb;)V")
	public static void method2246(@OriginalArg(1) Class25 arg0) {
		Static83.aClass25_24 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!jb;I)I")
	public static int method2247(@OriginalArg(0) Class25 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method925(Static6.aClass60_98, Static11.aClass60_146)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static10.aClass60_135)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static16.aClass60_268)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static21.aClass60_324)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static95.aClass60_1171)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static16.aClass60_264)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static98.aClass60_1206)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static4.aClass60_76)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static75.aClass60_1021)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static15.aClass60_248)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static55.aClass60_778)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static66.aClass60_897)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static50.aClass60_732)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static96.aClass60_1179)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static50.aClass60_733)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static62.aClass60_859)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static36.aClass60_473)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static31.aClass60_424)) {
			local5++;
		}
		if (arg0.method925(Static6.aClass60_98, Static11.aClass60_150)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!la;Lclient!qf;)I")
	public static int method2248(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(6) int local6 = arg0.anInt2886;
		arg0.method1956(arg1.anInt2817);
		arg0.anInt2886 += Static73.aClass21_1.method729(0, arg1.anInt2817, arg0.aByteArray77, arg0.anInt2886, arg1.aByteArray73);
		return arg0.anInt2886 - local6;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!cf;IB)V")
	public static void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub1_Sub3_Sub1 arg2, @OriginalArg(3) int arg3) {
		if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1 == arg2 || Static22.anInt872 >= 400) {
			return;
		}
		@Pc(67) Class60 local67;
		if (arg2.anInt631 == 0) {
			local67 = Static60.method1211(new Class60[] { arg2.aClass60_245, Static56.method1162(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt622, arg2.anInt622), Static104.aClass60_1262, Static104.aClass60_1267, Static65.method1341(arg2.anInt622), Static73.aClass60_999 });
		} else {
			local67 = Static60.method1211(new Class60[] { arg2.aClass60_245, Static104.aClass60_1262, Static102.aClass60_1250, Static65.method1341(arg2.anInt631), Static73.aClass60_999 });
		}
		@Pc(141) int local141;
		if (Static73.anInt2349 == 1) {
			Static118.method2137(arg1, 2, Static60.method1211(new Class60[] { Static124.aClass60_1361, Static15.aClass60_247, local67 }), arg0, Static8.aClass60_131, arg3);
		} else if (!Static72.aBoolean85) {
			for (local141 = 4; local141 >= 0; local141--) {
				if (Static12.aClass60Array1[local141] != null) {
					@Pc(153) short local153 = 0;
					@Pc(155) int local155 = 0;
					if (Static12.aClass60Array1[local141].method1860(Static42.aClass60_612)) {
						if (arg2.anInt622 > Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt622) {
							local153 = 2000;
						}
						if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt637 != 0 && arg2.anInt637 != 0) {
							if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt637 == arg2.anInt637) {
								local153 = 2000;
							} else {
								local153 = 0;
							}
						}
					} else if (Static130.aBooleanArray72[local141]) {
						local153 = 2000;
					}
					if (local141 == 0) {
						local155 = local153 + 56;
					}
					if (local141 == 1) {
						local155 = local153 + 26;
					}
					if (local141 == 2) {
						local155 = local153 + 45;
					}
					if (local141 == 3) {
						local155 = local153 + 44;
					}
					if (local141 == 4) {
						local155 = local153 + 16;
					}
					Static118.method2137(arg1, local155, Static60.method1211(new Class60[] { Static57.aClass60_1411, local67 }), arg0, Static12.aClass60Array1[local141], arg3);
				}
			}
		} else if ((Static11.anInt335 & 0x8) == 8) {
			Static118.method2137(arg1, 23, Static60.method1211(new Class60[] { Static96.aClass60_1181, Static15.aClass60_247, local67 }), arg0, Static73.aClass60_998, arg3);
		}
		for (local141 = 0; local141 < Static22.anInt872; local141++) {
			if (Static2.anIntArray22[local141] == 33) {
				Static68.aClass60Array12[local141] = Static60.method1211(new Class60[] { Static128.aClass60_1428, Static84.aClass60_1113, Static57.aClass60_1411, local67 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method2250() {
		aClass60_1398 = null;
		aClass3_Sub1_Sub2_Sub2_4 = null;
		aClass60_1397 = null;
		aClass3_Sub1_Sub2_Sub3Array10 = null;
		anIntArray378 = null;
		aClass60_1399 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZIII)I")
	public static int method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg2;
			arg2 = local12;
		}
		@Pc(20) int local20 = arg0 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return 7 + 1 - arg1 - arg4;
		} else if (local20 == 2) {
			return 1 + 7 - arg2 - arg3;
		} else {
			return arg1;
		}
	}
}
