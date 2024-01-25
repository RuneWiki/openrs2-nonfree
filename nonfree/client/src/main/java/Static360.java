import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ns", name = "Z", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray3;

	@OriginalMember(owner = "client!ns", name = "ab", descriptor = "Lclient!n;")
	public static Class123_Sub1 aClass123_Sub1_2;

	@OriginalMember(owner = "client!ns", name = "bb", descriptor = "I")
	public static int anInt6967;

	@OriginalMember(owner = "client!ns", name = "X", descriptor = "Lclient!au;")
	public static final Class22 aClass22_45 = new Class22();

	@OriginalMember(owner = "client!ns", name = "Y", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_10 = new Class184(2, 2);

	@OriginalMember(owner = "client!ns", name = "cb", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_99 = new Class90(69, -1);

	@OriginalMember(owner = "client!ns", name = "db", descriptor = "I")
	public static int anInt6968 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIILclient!od;)V")
	public static void method5445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub36 arg2) {
		if (arg2 == null || arg2 == Static593.aClass22_65.aClass4_13) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt7135;
		@Pc(18) int local18 = arg2.anInt7143;
		@Pc(21) int local21 = arg2.anInt7137;
		@Pc(25) int local25 = (int) arg2.aLong194;
		@Pc(32) long local32 = arg2.aLong194;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(58) Class4_Sub39 local58;
		if (local21 == 2) {
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			Static277.anInt5776 = arg0;
			Static517.anInt10518 = 0;
			local58 = Static32.method999(Static402.aClass356_1, Static184.aClass344_26);
			local58.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method6999(local15 + Static242.anInt10133);
			local58.aClass4_Sub13_Sub2_1.method7001(local18 + Static157.anInt3323);
			local58.aClass4_Sub13_Sub2_1.method7001(local25);
			Static50.method1166(local58);
			Static98.method1904(local15, local18);
		}
		if (local21 == 12) {
			Static141.anInt10589 = 2;
			Static277.anInt5776 = arg0;
			Static517.anInt10521 = arg1;
			Static517.anInt10518 = 0;
			local58 = Static32.method999(Static402.aClass356_1, Static503.aClass344_90);
			local58.aClass4_Sub13_Sub2_1.method6999(local18 + Static157.anInt3323);
			local58.aClass4_Sub13_Sub2_1.method7038((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method6999(local15 + Static242.anInt10133);
			Static50.method1166(local58);
			Static374.method5816(local32, local15, local18);
		}
		@Pc(187) Class21_Sub1_Sub1_Sub1_Sub1 local187;
		@Pc(182) Class4_Sub29 local182;
		if (local21 == 1004) {
			Static517.anInt10521 = arg1;
			Static517.anInt10518 = 0;
			Static277.anInt5776 = arg0;
			Static141.anInt10589 = 2;
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				@Pc(190) Class51 local190 = local187.aClass51_1;
				if (local190.anIntArray61 != null) {
					local190 = local190.method1371(Static523.aClass173_1);
				}
				if (local190 != null) {
					@Pc(209) Class4_Sub39 local209 = Static32.method999(Static402.aClass356_1, Static390.aClass344_65);
					local209.aClass4_Sub13_Sub2_1.method7038(local190.anInt1582);
					Static50.method1166(local209);
				}
			}
		}
		if (local21 == 6) {
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			Static277.anInt5776 = arg0;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static429.aClass344_76);
			local58.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
			local58.aClass4_Sub13_Sub2_1.method7044(Static231.anInt4893);
			local58.aClass4_Sub13_Sub2_1.method7032(Static286.anInt6126);
			local58.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method6999(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4256);
			Static50.method1166(local58);
		}
		@Pc(283) Class21_Sub1_Sub1_Sub1_Sub2 local283;
		@Pc(302) Class4_Sub39 local302;
		if (local21 == 20) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static277.anInt5776 = arg0;
				Static517.anInt10521 = arg1;
				Static141.anInt10589 = 2;
				Static517.anInt10518 = 0;
				local302 = Static32.method999(Static402.aClass356_1, Static46.aClass344_10);
				local302.aClass4_Sub13_Sub2_1.method7044(local25);
				local302.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		@Pc(377) Class4_Sub39 local377;
		if (local21 == 49) {
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				Static517.anInt10518 = 0;
				Static517.anInt10521 = arg1;
				Static141.anInt10589 = 2;
				Static277.anInt5776 = arg0;
				local377 = Static32.method999(Static402.aClass356_1, Static403.aClass344_68);
				local377.aClass4_Sub13_Sub2_1.method7001(local25);
				local377.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local377);
				Static225.method3649(local187.anIntArray207[0], 0, local187.method3339(), local187.method3339(), true, -2, 0, local187.anIntArray206[0]);
			}
		}
		if (local21 == 18) {
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				Static517.anInt10521 = arg1;
				Static517.anInt10518 = 0;
				Static277.anInt5776 = arg0;
				Static141.anInt10589 = 2;
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				local377 = Static32.method999(Static402.aClass356_1, Static374.aClass344_61);
				local377.aClass4_Sub13_Sub2_1.method7023(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local377.aClass4_Sub13_Sub2_1.method6999(local25);
				Static50.method1166(local377);
				Static225.method3649(local187.anIntArray207[0], 0, local187.method3339(), local187.method3339(), true, -2, 0, local187.anIntArray206[0]);
			}
		}
		if (local21 == 8) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static141.anInt10589 = 2;
				Static517.anInt10518 = 0;
				Static517.anInt10521 = arg1;
				Static277.anInt5776 = arg0;
				local302 = Static32.method999(Static402.aClass356_1, Static278.aClass344_46);
				local302.aClass4_Sub13_Sub2_1.method7044(local25);
				local302.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 57) {
			Static277.anInt5776 = arg0;
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static249.aClass344_22);
			local58.aClass4_Sub13_Sub2_1.method7044((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local58.aClass4_Sub13_Sub2_1.method7038(Static157.anInt3323 + local18);
			local58.aClass4_Sub13_Sub2_1.method6999(local15 + Static242.anInt10133);
			local58.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
			local58.aClass4_Sub13_Sub2_1.method7040(Static286.anInt6126);
			local58.aClass4_Sub13_Sub2_1.method6999(Static231.anInt4893);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			Static50.method1166(local58);
			Static374.method5816(local32, local15, local18);
		}
		if (local21 == 50) {
			Static277.anInt5776 = arg0;
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static165.aClass344_21);
			local58.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7038((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local58.aClass4_Sub13_Sub2_1.method7044(local15 + Static242.anInt10133);
			local58.aClass4_Sub13_Sub2_1.method7044(local18 + Static157.anInt3323);
			Static50.method1166(local58);
			Static374.method5816(local32, local15, local18);
		}
		if (local21 == 5) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static141.anInt10589 = 2;
				Static277.anInt5776 = arg0;
				Static517.anInt10521 = arg1;
				Static517.anInt10518 = 0;
				local302 = Static32.method999(Static402.aClass356_1, Static442.aClass344_81);
				local302.aClass4_Sub13_Sub2_1.method7044(local25);
				local302.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 48) {
			Static517.anInt10518 = 0;
			Static517.anInt10521 = arg1;
			Static277.anInt5776 = arg0;
			Static141.anInt10589 = 2;
			local58 = Static32.method999(Static402.aClass356_1, Static479.aClass344_86);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7001(Static157.anInt3323 + local18);
			local58.aClass4_Sub13_Sub2_1.method7044(Static242.anInt10133 + local15);
			local58.aClass4_Sub13_Sub2_1.method7038(local25);
			Static50.method1166(local58);
			Static98.method1904(local15, local18);
		}
		if (local21 == 45) {
			if (Static100.anInt2432 > 0 && Static38.aClass174_1.method4090(82) && Static38.aClass174_1.method4090(81)) {
				Static387.method5969(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, local15 + Static242.anInt10133, local18 + Static157.anInt3323);
			} else {
				local58 = Static293.method4724(local18, local15, local25);
				if (local25 == 1) {
					local58.aClass4_Sub13_Sub2_1.method7052(-1);
					local58.aClass4_Sub13_Sub2_1.method7052(-1);
					local58.aClass4_Sub13_Sub2_1.method7038((int) Static189.aFloat83);
					local58.aClass4_Sub13_Sub2_1.method7052(57);
					local58.aClass4_Sub13_Sub2_1.method7052(Static136.anInt3033);
					local58.aClass4_Sub13_Sub2_1.method7052(Static273.anInt5737);
					local58.aClass4_Sub13_Sub2_1.method7052(89);
					local58.aClass4_Sub13_Sub2_1.method7038(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551);
					local58.aClass4_Sub13_Sub2_1.method7038(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550);
					local58.aClass4_Sub13_Sub2_1.method7052(63);
				} else {
					Static277.anInt5776 = arg0;
					Static517.anInt10521 = arg1;
					Static141.anInt10589 = 1;
					Static517.anInt10518 = 0;
				}
				Static50.method1166(local58);
				Static225.method3649(local18, 0, 1, 1, true, -4, 0, local15);
			}
		}
		if (local21 == 21) {
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			Static277.anInt5776 = arg0;
			local58 = Static32.method999(Static402.aClass356_1, Static546.aClass344_95);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7001(Static242.anInt10133 + local15);
			local58.aClass4_Sub13_Sub2_1.method7001(local18 + Static157.anInt3323);
			local58.aClass4_Sub13_Sub2_1.method7001(local25);
			Static50.method1166(local58);
			Static98.method1904(local15, local18);
		}
		if (local21 == 1006 || local21 == 1010 || local21 == 1007 || local21 == 1002 || local21 == 1012) {
			Static414.method6241(local15, local25, local21);
		}
		if (local21 == 47) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static277.anInt5776 = arg0;
				Static517.anInt10518 = 0;
				Static141.anInt10589 = 2;
				Static517.anInt10521 = arg1;
				local302 = Static32.method999(Static402.aClass356_1, Static442.aClass344_80);
				local302.aClass4_Sub13_Sub2_1.method7044(local25);
				local302.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 60) {
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				Static277.anInt5776 = arg0;
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				Static141.anInt10589 = 2;
				Static517.anInt10521 = arg1;
				Static517.anInt10518 = 0;
				local377 = Static32.method999(Static402.aClass356_1, Static487.aClass344_87);
				local377.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local377.aClass4_Sub13_Sub2_1.method7044(local25);
				Static50.method1166(local377);
				Static225.method3649(local187.anIntArray207[0], 0, local187.method3339(), local187.method3339(), true, -2, 0, local187.anIntArray206[0]);
			}
		}
		if (local21 == 51) {
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				Static517.anInt10518 = 0;
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				Static517.anInt10521 = arg1;
				Static277.anInt5776 = arg0;
				Static141.anInt10589 = 2;
				local377 = Static32.method999(Static402.aClass356_1, Static325.aClass344_54);
				local377.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local377.aClass4_Sub13_Sub2_1.method7044(local25);
				Static50.method1166(local377);
				Static225.method3649(local187.anIntArray207[0], 0, local187.method3339(), local187.method3339(), true, -2, 0, local187.anIntArray206[0]);
			}
		}
		if (local21 == 59) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static517.anInt10521 = arg1;
				Static141.anInt10589 = 2;
				Static277.anInt5776 = arg0;
				Static517.anInt10518 = 0;
				local302 = Static32.method999(Static402.aClass356_1, Static429.aClass344_76);
				local302.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
				local302.aClass4_Sub13_Sub2_1.method7044(Static231.anInt4893);
				local302.aClass4_Sub13_Sub2_1.method7032(Static286.anInt6126);
				local302.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local302.aClass4_Sub13_Sub2_1.method6999(local25);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		@Pc(1357) Class155 local1357;
		if (local21 == 10) {
			local1357 = Static539.method7544(local18, local15);
			if (local1357 != null) {
				Static398.method6102(local1357);
			}
		}
		if (local21 == 23) {
			local1357 = Static539.method7544(local18, local15);
			if (local1357 != null) {
				Static263.method4151();
				@Pc(1381) Class4_Sub40 local1381 = Static70.method1542(local1357);
				Static331.method7987(local1381.anInt8121, local1381.method6330(), local1357);
				Static317.aString131 = Static476.method6911(local1357);
				Static393.aString154 = local1357.aString97 + "<col=ffffff>";
				if (Static317.aString131 == null) {
					Static317.aString131 = "Null";
				}
			}
			return;
		}
		if (local21 == 15) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static277.anInt5776 = arg0;
				Static141.anInt10589 = 2;
				Static517.anInt10518 = 0;
				Static517.anInt10521 = arg1;
				local302 = Static32.method999(Static402.aClass356_1, Static311.aClass344_50);
				local302.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local302.aClass4_Sub13_Sub2_1.method7044(local25);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 22) {
			Static141.anInt10589 = 2;
			Static517.anInt10518 = 0;
			Static277.anInt5776 = arg0;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static490.aClass344_88);
			local58.aClass4_Sub13_Sub2_1.method7038(local15 + Static242.anInt10133);
			local58.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7038((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local58.aClass4_Sub13_Sub2_1.method7038(local18 + Static157.anInt3323);
			Static50.method1166(local58);
			Static374.method5816(local32, local15, local18);
		}
		if (local21 == 46) {
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			Static277.anInt5776 = arg0;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static205.aClass344_31);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method6999(local25);
			local58.aClass4_Sub13_Sub2_1.method7044(local18 + Static157.anInt3323);
			local58.aClass4_Sub13_Sub2_1.method7001(Static242.anInt10133 + local15);
			Static50.method1166(local58);
			Static98.method1904(local15, local18);
		}
		if (local21 == 1008) {
			Static277.anInt5776 = arg0;
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			Static517.anInt10518 = 0;
			local58 = Static32.method999(Static402.aClass356_1, Static344.aClass344_58);
			local58.aClass4_Sub13_Sub2_1.method7038(local25);
			Static50.method1166(local58);
		}
		if (local21 == 17) {
			if (Static100.anInt2432 > 0 && Static38.aClass174_1.method4090(82) && Static38.aClass174_1.method4090(81)) {
				Static387.method5969(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, local15 + Static242.anInt10133, local18 + Static157.anInt3323);
			} else {
				Static517.anInt10521 = arg1;
				Static141.anInt10589 = 1;
				Static517.anInt10518 = 0;
				Static277.anInt5776 = arg0;
				local58 = Static32.method999(Static402.aClass356_1, Static270.aClass344_41);
				local58.aClass4_Sub13_Sub2_1.method7001(Static242.anInt10133 + local15);
				local58.aClass4_Sub13_Sub2_1.method7001(Static157.anInt3323 + local18);
				Static50.method1166(local58);
			}
		}
		if (local21 == 30) {
			Static277.anInt5776 = arg0;
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			Static517.anInt10518 = 0;
			local58 = Static32.method999(Static402.aClass356_1, Static231.aClass344_33);
			local58.aClass4_Sub13_Sub2_1.method7038((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local58.aClass4_Sub13_Sub2_1.method7038(local18 + Static157.anInt3323);
			local58.aClass4_Sub13_Sub2_1.method7044(Static242.anInt10133 + local15);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			Static50.method1166(local58);
			Static374.method5816(local32, local15, local18);
		}
		if (local21 == 11) {
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				Static517.anInt10521 = arg1;
				Static141.anInt10589 = 2;
				Static517.anInt10518 = 0;
				Static277.anInt5776 = arg0;
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				local377 = Static32.method999(Static402.aClass356_1, Static191.aClass344_28);
				local377.aClass4_Sub13_Sub2_1.method7044(local25);
				local377.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
				local377.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local377.aClass4_Sub13_Sub2_1.method7038(Static231.anInt4893);
				local377.aClass4_Sub13_Sub2_1.method7032(Static286.anInt6126);
				Static50.method1166(local377);
				Static225.method3649(local187.anIntArray207[0], 0, local187.method3339(), local187.method3339(), true, -2, 0, local187.anIntArray206[0]);
			}
		}
		if (local21 == 19) {
			Static517.anInt10518 = 0;
			Static517.anInt10521 = arg1;
			Static277.anInt5776 = arg0;
			Static141.anInt10589 = 2;
			local58 = Static32.method999(Static402.aClass356_1, Static417.aClass344_38);
			local58.aClass4_Sub13_Sub2_1.method6999(local25);
			local58.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7001(Static569.anInt7644);
			local58.aClass4_Sub13_Sub2_1.method7038(Static242.anInt10133 + local15);
			local58.aClass4_Sub13_Sub2_1.method6999(local18 + Static157.anInt3323);
			local58.aClass4_Sub13_Sub2_1.method7001(Static231.anInt4893);
			local58.aClass4_Sub13_Sub2_1.method7034(Static286.anInt6126);
			Static50.method1166(local58);
			Static98.method1904(local15, local18);
		}
		if (local21 == 44 && Static238.aClass155_6 == null) {
			Static509.method7323(local18, local15);
			Static238.aClass155_6 = Static539.method7544(local18, local15);
			Static368.method5060(Static238.aClass155_6);
		}
		if (local21 == 1011) {
			Static517.anInt10521 = arg1;
			Static277.anInt5776 = arg0;
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			local58 = Static32.method999(Static402.aClass356_1, Static274.aClass344_44);
			local58.aClass4_Sub13_Sub2_1.method7038(local25);
			Static50.method1166(local58);
		}
		if (local21 == 25) {
			local182 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local25);
			if (local182 != null) {
				local187 = local182.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				Static517.anInt10518 = 0;
				Static517.anInt10521 = arg1;
				Static277.anInt5776 = arg0;
				Static141.anInt10589 = 2;
				local377 = Static32.method999(Static402.aClass356_1, Static80.aClass344_14);
				local377.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
				local377.aClass4_Sub13_Sub2_1.method7001(local25);
				Static50.method1166(local377);
				Static225.method3649(local187.anIntArray207[0], 0, local187.method3339(), local187.method3339(), true, -2, 0, local187.anIntArray206[0]);
			}
		}
		if (local21 == 58) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static141.anInt10589 = 2;
				Static277.anInt5776 = arg0;
				Static517.anInt10521 = arg1;
				Static517.anInt10518 = 0;
				local302 = Static32.method999(Static402.aClass356_1, Static491.aClass344_89);
				local302.aClass4_Sub13_Sub2_1.method7038(local25);
				local302.aClass4_Sub13_Sub2_1.method7052(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 1003) {
			Static277.anInt5776 = arg0;
			Static517.anInt10518 = 0;
			Static517.anInt10521 = arg1;
			Static141.anInt10589 = 2;
			local58 = Static32.method999(Static402.aClass356_1, Static580.aClass344_63);
			local58.aClass4_Sub13_Sub2_1.method7038(Static157.anInt3323 + local18);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7044((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local58.aClass4_Sub13_Sub2_1.method7044(Static242.anInt10133 + local15);
			Static50.method1166(local58);
			Static374.method5816(local32, local15, local18);
		}
		if (local21 == 16) {
			Static517.anInt10518 = 0;
			Static277.anInt5776 = arg0;
			Static141.anInt10589 = 1;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static278.aClass344_45);
			local58.aClass4_Sub13_Sub2_1.method6999(Static157.anInt3323 + local18);
			local58.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
			local58.aClass4_Sub13_Sub2_1.method7001(local15 + Static242.anInt10133);
			local58.aClass4_Sub13_Sub2_1.method7034(Static286.anInt6126);
			local58.aClass4_Sub13_Sub2_1.method7001(Static231.anInt4893);
			Static50.method1166(local58);
			Static225.method3649(local18, 0, 1, 1, true, -4, 0, local15);
		}
		if (local21 == 9) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static277.anInt5776 = arg0;
				Static517.anInt10518 = 0;
				Static517.anInt10521 = arg1;
				Static141.anInt10589 = 2;
				local302 = Static32.method999(Static402.aClass356_1, Static55.aClass344_12);
				local302.aClass4_Sub13_Sub2_1.method6999(local25);
				local302.aClass4_Sub13_Sub2_1.method6996(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 13 || local21 == 1009) {
			Static101.method1932(arg2.aString145, local15, local18, local25);
		}
		if (local21 == 3) {
			local283 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local283 != null) {
				Static517.anInt10518 = 0;
				Static517.anInt10521 = arg1;
				Static277.anInt5776 = arg0;
				Static141.anInt10589 = 2;
				local302 = Static32.method999(Static402.aClass356_1, Static425.aClass344_75);
				local302.aClass4_Sub13_Sub2_1.method7038(local25);
				local302.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
				Static50.method1166(local302);
				Static225.method3649(local283.anIntArray207[0], 0, local283.method3339(), local283.method3339(), true, -2, 0, local283.anIntArray206[0]);
			}
		}
		if (local21 == 4) {
			Static277.anInt5776 = arg0;
			Static517.anInt10518 = 0;
			Static141.anInt10589 = 2;
			Static517.anInt10521 = arg1;
			local58 = Static32.method999(Static402.aClass356_1, Static432.aClass344_78);
			local58.aClass4_Sub13_Sub2_1.method7051(Static38.aClass174_1.method4090(82) ? 1 : 0);
			local58.aClass4_Sub13_Sub2_1.method7038(local25);
			local58.aClass4_Sub13_Sub2_1.method6999(Static242.anInt10133 + local15);
			local58.aClass4_Sub13_Sub2_1.method6999(local18 + Static157.anInt3323);
			Static50.method1166(local58);
			Static98.method1904(local15, local18);
		}
		if (Static430.aBoolean586) {
			Static263.method4151();
		}
		if (Static411.aClass155_12 != null && Static169.anInt3497 == 0) {
			Static368.method5060(Static411.aClass155_12);
		}
	}
}
