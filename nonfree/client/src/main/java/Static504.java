import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[Lclient!ri;")
	public static final Interface19[] anInterface19Array2 = new Interface19[128];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public static void method7251() {
		Static25.aClass7_1.method7801(Static4.aFloat51, Static388.aFloat183, Static231.aFloat106);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Lclient!ph;")
	public static Class4_Sub39 method7252() {
		@Pc(11) Class4_Sub39 local11 = Static423.method6346();
		local11.aClass344_67 = null;
		local11.anInt7831 = 0;
		local11.aClass4_Sub13_Sub2_1 = new Class4_Sub13_Sub2(5000);
		return local11;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)I")
	public static int method7253(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!r;)V")
	public static void method7254(@OriginalArg(1) Class7 arg0) {
		@Pc(7) int local7 = Static593.anInt10604;
		@Pc(9) int local9 = Static469.anInt8895;
		@Pc(11) int local11 = Static303.anInt6098;
		@Pc(15) int local15 = Static340.anInt6537 - 3;
		if (Static322.aClass88_17 == null || Static189.aClass88_12 == null) {
			if (Static159.aClass348_38.method7960(Static527.anInt9680) && Static159.aClass348_38.method7960(Static153.anInt3262)) {
				Static322.aClass88_17 = arg0.method7808(Static598.method2462(Static159.aClass348_38, Static527.anInt9680, 0), true);
				@Pc(44) Class103 local44 = Static598.method2462(Static159.aClass348_38, Static153.anInt3262, 0);
				Static189.aClass88_12 = arg0.method7808(local44, true);
				local44.method2454();
				Static337.aClass88_18 = arg0.method7808(local44, true);
			} else {
				arg0.J(local7, local9, local11, 20, 255 - Static579.anInt10413 << 24 | Static548.anInt10019, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static322.aClass88_17 != null && Static189.aClass88_12 != null) {
			local88 = (local11 - Static189.aClass88_12.E() * 2) / Static322.aClass88_17.E();
			for (local90 = 0; local90 < local88; local90++) {
				Static322.aClass88_17.method8051(Static189.aClass88_12.E() + local7 + Static322.aClass88_17.E() * local90, local9);
			}
			Static189.aClass88_12.method8051(local7, local9);
			Static337.aClass88_18.method8051(local11 + local7 - Static337.aClass88_18.E(), local9);
		}
		Static306.aClass45_4.method4843(local7 + 3, Static223.aClass152_28.method3624(Static142.anInt3088), -1, -16777216 | Static94.anInt2379, local9 + 14);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static548.anInt10019 | -Static579.anInt10413 + 255 << 24, 1);
		local88 = Static294.aClass83_1.method6895();
		local90 = Static294.aClass83_1.method6896();
		@Pc(170) int local170 = 0;
		@Pc(199) int local199;
		for (@Pc(183) Class4_Sub36 local183 = (Class4_Sub36) Static593.aClass22_65.method895(); local183 != null; local183 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			local199 = (Static384.anInt7556 - local170 - 1) * 16 + local9 + 20 + 13;
			if (local7 < local88 && local88 < local7 + local11 && local199 - 13 < local90 && local90 < local199 + 4 && local183.aBoolean510) {
				arg0.J(local7, local199 - 12, local11, 16, Static113.anInt2576 | 255 - Static220.anInt9344 << 24, 1);
			}
			local170++;
		}
		if ((Static214.aClass88_13 == null || Static175.aClass88_11 == null || Static524.aClass88_31 == null) && Static159.aClass348_38.method7960(Static174.anInt3681) && Static159.aClass348_38.method7960(Static29.anInt1116) && Static159.aClass348_38.method7960(Static161.anInt3349)) {
			@Pc(286) Class103 local286 = Static598.method2462(Static159.aClass348_38, Static29.anInt1116, 0);
			Static175.aClass88_11 = arg0.method7808(local286, true);
			local286.method2454();
			Static244.aClass88_30 = arg0.method7808(local286, true);
			Static214.aClass88_13 = arg0.method7808(Static598.method2462(Static159.aClass348_38, Static174.anInt3681, 0), true);
			@Pc(311) Class103 local311 = Static598.method2462(Static159.aClass348_38, Static161.anInt3349, 0);
			Static524.aClass88_31 = arg0.method7808(local311, true);
			local311.method2454();
			Static144.aClass88_10 = arg0.method7808(local311, true);
		}
		@Pc(378) int local378;
		@Pc(341) int local341;
		if (Static214.aClass88_13 != null && Static175.aClass88_11 != null && Static524.aClass88_31 != null) {
			local199 = (local11 - Static524.aClass88_31.E() * 2) / Static214.aClass88_13.E();
			for (local341 = 0; local341 < local199; local341++) {
				Static214.aClass88_13.method8051(local7 + Static524.aClass88_31.E() + local341 * Static214.aClass88_13.E(), -Static214.aClass88_13.u() + local15 + local9);
			}
			local378 = (local15 - Static524.aClass88_31.u() - 20) / Static175.aClass88_11.u();
			for (@Pc(380) int local380 = 0; local380 < local378; local380++) {
				Static175.aClass88_11.method8051(local7, local9 + Static175.aClass88_11.u() * local380 + 20);
				Static244.aClass88_30.method8051(local7 + local11 - Static244.aClass88_30.E(), local380 * Static175.aClass88_11.u() + 20 + local9);
			}
			Static524.aClass88_31.method8051(local7, local9 + local15 - Static524.aClass88_31.u());
			Static144.aClass88_10.method8051(local11 + local7 - Static524.aClass88_31.E(), -Static524.aClass88_31.u() + local15 + local9);
		}
		local170 = 0;
		for (@Pc(447) Class4_Sub36 local447 = (Class4_Sub36) Static593.aClass22_65.method895(); local447 != null; local447 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			local341 = local9 + (Static384.anInt7556 - local170 - 1) * 16 + 33;
			local378 = Static94.anInt2379 | 0xFF000000;
			if (local88 > local7 && local7 + local11 > local88 && local341 - 13 < local90 && local341 + 4 > local90 && local447.aBoolean510) {
				local378 = Static118.anInt2711 | 0xFF000000;
			}
			@Pc(503) int[] local503 = null;
			if (Static221.method956(local447.anInt7137)) {
				local503 = Static338.aClass29_1.method977((int) local447.aLong194).anIntArray384;
			} else if (local447.anInt7142 != -1) {
				local503 = Static338.aClass29_1.method977(local447.anInt7142).anIntArray384;
			} else if (Static208.method3402(local447.anInt7137)) {
				@Pc(586) Class4_Sub29 local586 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local447.aLong194);
				if (local586 != null) {
					@Pc(591) Class21_Sub1_Sub1_Sub1_Sub1 local591 = local586.aClass21_Sub1_Sub1_Sub1_Sub1_1;
					@Pc(594) Class51 local594 = local591.aClass51_1;
					if (local594.anIntArray61 != null) {
						local594 = local594.method1371(Static523.aClass173_1);
					}
					if (local594 != null) {
						local503 = local594.anIntArray63;
					}
				}
			} else if (Static324.method5022(local447.anInt7137)) {
				@Pc(549) Class233 local549;
				if (local447.anInt7137 == 1008) {
					local549 = Static103.aClass298_1.method6822((int) local447.aLong194);
				} else {
					local549 = Static103.aClass298_1.method6822((int) (local447.aLong194 >>> 32 & 0x7FFFFFFFL));
				}
				if (local549.anIntArray374 != null) {
					local549 = local549.method5295(Static523.aClass173_1);
				}
				if (local549 != null) {
					local503 = local549.anIntArray376;
				}
			}
			@Pc(621) String local621 = Static576.method8116(local447);
			if (local503 != null) {
				local621 = local621 + Static282.method4486(local503);
			}
			Static306.aClass45_4.method4846(local341, local621, Static44.anIntArray33, local7 + 3, local378, Static393.aClass88Array9);
			local170++;
			if (local447.aBoolean509) {
				Static575.aClass88_37.method8051(Static503.aClass198_12.method4769(local621) + local7 + 5, local341 + -12);
			}
		}
		Static563.method7978(Static593.anInt10604, Static469.anInt8895, Static303.anInt6098, Static340.anInt6537);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)Z")
	public static boolean method7255(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
