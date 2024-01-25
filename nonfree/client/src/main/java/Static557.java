import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
	public static int anInt9404;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lclient!cl;")
	public static Class57 aClass57_9;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIILclient!oj;)V")
	public static void method8108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub5_Sub15 arg2) {
		if (arg2 == null || arg2 == Static84.aClass330_6.aClass5_257) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt6762;
		@Pc(18) int local18 = arg2.anInt6759;
		@Pc(21) int local21 = arg2.anInt6765;
		@Pc(25) int local25 = (int) arg2.aLong172;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg2.aLong172;
		@Pc(39) Class4_Sub2_Sub1_Sub1_Sub1 local39;
		@Pc(58) Class5_Sub48 local58;
		if (local21 == 4) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static397.anInt6609 = arg0;
				Static158.anInt2675 = arg1;
				Static158.anInt2674 = 2;
				Static173.anInt3107 = 0;
				local58 = Static16.method232(Static261.aClass46_58, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5904(local25);
				local58.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		@Pc(126) Class5_Sub48 local126;
		if (local21 == 16) {
			if (Static210.anInt4035 > 0 && Static45.aClass115_1.method2490(82) && Static45.aClass115_1.method2490(81)) {
				Static180.method2779(Static565.anInt9560 + local15, local18 + Static567.anInt9589, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132);
			} else {
				local126 = Static359.method5342(local18, local15, local25);
				if (local25 == 1) {
					local126.aClass5_Sub22_Sub1_2.method5905(-1);
					local126.aClass5_Sub22_Sub1_2.method5905(-1);
					local126.aClass5_Sub22_Sub1_2.method5918((int) Static311.aFloat95);
					local126.aClass5_Sub22_Sub1_2.method5905(57);
					local126.aClass5_Sub22_Sub1_2.method5905(Static2.anInt7);
					local126.aClass5_Sub22_Sub1_2.method5905(Static372.anInt6183);
					local126.aClass5_Sub22_Sub1_2.method5905(89);
					local126.aClass5_Sub22_Sub1_2.method5918(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231);
					local126.aClass5_Sub22_Sub1_2.method5918(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229);
					local126.aClass5_Sub22_Sub1_2.method5905(63);
				} else {
					Static158.anInt2675 = arg1;
					Static158.anInt2674 = 1;
					Static173.anInt3107 = 0;
					Static397.anInt6609 = arg0;
				}
				Static277.method4436(local126);
				Static552.method8051(local15, 1, true, 1, 0, -4, local18, 0);
			}
		}
		if (local21 == 17) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2674 = 2;
				Static397.anInt6609 = arg0;
				Static158.anInt2675 = arg1;
				Static173.anInt3107 = 0;
				local58 = Static16.method232(Static533.aClass46_99, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5961(local25);
				local58.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 1011) {
			Static158.anInt2674 = 2;
			Static158.anInt2675 = arg1;
			Static173.anInt3107 = 0;
			Static397.anInt6609 = arg0;
			local126 = Static16.method232(Static352.aClass46_66, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5918(local25);
			Static277.method4436(local126);
		}
		if (local21 == 11) {
			Static173.anInt3107 = 0;
			Static397.anInt6609 = arg0;
			Static158.anInt2675 = arg1;
			Static158.anInt2674 = 2;
			local126 = Static16.method232(Static293.aClass46_61, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5918(local25);
			local126.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5918(local15 + Static565.anInt9560);
			local126.aClass5_Sub22_Sub1_2.method5961(Static567.anInt9589 + local18);
			Static277.method4436(local126);
			Static15.method227(local15, local18);
		}
		if (local21 == 20) {
			Static158.anInt2674 = 2;
			Static173.anInt3107 = 0;
			Static158.anInt2675 = arg1;
			Static397.anInt6609 = arg0;
			local126 = Static16.method232(Static42.aClass46_11, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5904(Static570.anInt9615);
			local126.aClass5_Sub22_Sub1_2.method5918(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt1225);
			local126.aClass5_Sub22_Sub1_2.method5949(Static375.anInt6224);
			local126.aClass5_Sub22_Sub1_2.method5904(Static289.anInt5055);
			local126.aClass5_Sub22_Sub1_2.method5938(Static45.aClass115_1.method2490(82) ? 1 : 0);
			Static277.method4436(local126);
		}
		@Pc(465) Class5_Sub48 local465;
		@Pc(460) Class4_Sub2_Sub1_Sub1_Sub2 local460;
		@Pc(443) Class5_Sub3 local443;
		if (local21 == 2) {
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				Static397.anInt6609 = arg0;
				Static158.anInt2675 = arg1;
				Static173.anInt3107 = 0;
				Static158.anInt2674 = 2;
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				local465 = Static16.method232(Static320.aClass46_64, Static276.aClass251_2);
				local465.aClass5_Sub22_Sub1_2.method5941(Static45.aClass115_1.method2490(82) ? 1 : 0);
				local465.aClass5_Sub22_Sub1_2.method5961(local25);
				Static277.method4436(local465);
				Static552.method8051(local460.anIntArray94[0], local460.method1018(), true, local460.method1018(), 0, -2, local460.anIntArray95[0], 0);
			}
		}
		if (local21 == 23) {
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				Static158.anInt2675 = arg1;
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				Static158.anInt2674 = 2;
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				local465 = Static16.method232(Static211.aClass46_47, Static276.aClass251_2);
				local465.aClass5_Sub22_Sub1_2.method5961(local25);
				local465.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local465);
				Static552.method8051(local460.anIntArray94[0], local460.method1018(), true, local460.method1018(), 0, -2, local460.anIntArray95[0], 0);
			}
		}
		if (local21 == 13) {
			Static397.anInt6609 = arg0;
			Static158.anInt2674 = 2;
			Static158.anInt2675 = arg1;
			Static173.anInt3107 = 0;
			local126 = Static16.method232(Static4.aClass46_1, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5961(local15 + Static565.anInt9560);
			local126.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5927(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5904(local25);
			Static277.method4436(local126);
			Static15.method227(local15, local18);
		}
		if (local21 == 46 || local21 == 1001) {
			Static360.method5376(local25, local18, arg2.aString75, local15);
		}
		if (local21 == 6) {
			Static397.anInt6609 = arg0;
			Static158.anInt2675 = arg1;
			Static158.anInt2674 = 2;
			Static173.anInt3107 = 0;
			local126 = Static16.method232(Static427.aClass46_81, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5904(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5961(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5927((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static277.method4436(local126);
			Static377.method5549(local15, local18, local32);
		}
		if (local21 == 1006) {
			Static158.anInt2675 = arg1;
			Static173.anInt3107 = 0;
			Static158.anInt2674 = 2;
			Static397.anInt6609 = arg0;
			local126 = Static16.method232(Static635.aClass46_108, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5918(local25);
			Static277.method4436(local126);
		}
		if (local21 == 30) {
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				Static158.anInt2675 = arg1;
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				Static158.anInt2674 = 2;
				local465 = Static16.method232(Static127.aClass46_25, Static276.aClass251_2);
				local465.aClass5_Sub22_Sub1_2.method5941(Static45.aClass115_1.method2490(82) ? 1 : 0);
				local465.aClass5_Sub22_Sub1_2.method5904(local25);
				Static277.method4436(local465);
				Static552.method8051(local460.anIntArray94[0], local460.method1018(), true, local460.method1018(), 0, -2, local460.anIntArray95[0], 0);
			}
		}
		if (local21 == 1009) {
			Static173.anInt3107 = 0;
			Static158.anInt2675 = arg1;
			Static397.anInt6609 = arg0;
			Static158.anInt2674 = 2;
			local126 = Static16.method232(Static496.aClass46_90, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5927((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local126.aClass5_Sub22_Sub1_2.method5961(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5918(local15 + Static565.anInt9560);
			Static277.method4436(local126);
			Static377.method5549(local15, local18, local32);
		}
		if (local21 == 59) {
			if (Static210.anInt4035 > 0 && Static45.aClass115_1.method2490(82) && Static45.aClass115_1.method2490(81)) {
				Static180.method2779(local15 + Static565.anInt9560, Static567.anInt9589 - -local18, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132);
			} else {
				Static158.anInt2675 = arg1;
				Static397.anInt6609 = arg0;
				Static173.anInt3107 = 0;
				Static158.anInt2674 = 1;
				local126 = Static16.method232(Static469.aClass46_86, Static276.aClass251_2);
				local126.aClass5_Sub22_Sub1_2.method5961(Static567.anInt9589 + local18);
				local126.aClass5_Sub22_Sub1_2.method5904(local15 + Static565.anInt9560);
				Static277.method4436(local126);
			}
		}
		if (local21 == 60) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2674 = 2;
				Static158.anInt2675 = arg1;
				Static397.anInt6609 = arg0;
				Static173.anInt3107 = 0;
				local58 = Static16.method232(Static209.aClass46_46, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5938(Static45.aClass115_1.method2490(82) ? 1 : 0);
				local58.aClass5_Sub22_Sub1_2.method5927(local25);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 58) {
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				Static397.anInt6609 = arg0;
				Static173.anInt3107 = 0;
				Static158.anInt2675 = arg1;
				Static158.anInt2674 = 2;
				local465 = Static16.method232(Static121.aClass46_24, Static276.aClass251_2);
				local465.aClass5_Sub22_Sub1_2.method5938(Static45.aClass115_1.method2490(82) ? 1 : 0);
				local465.aClass5_Sub22_Sub1_2.method5961(local25);
				Static277.method4436(local465);
				Static552.method8051(local460.anIntArray94[0], local460.method1018(), true, local460.method1018(), 0, -2, local460.anIntArray95[0], 0);
			}
		}
		if (local21 == 50) {
			Static173.anInt3107 = 0;
			Static158.anInt2675 = arg1;
			Static397.anInt6609 = arg0;
			Static158.anInt2674 = 2;
			local126 = Static16.method232(Static78.aClass46_18, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5918(Static567.anInt9589 + local18);
			local126.aClass5_Sub22_Sub1_2.method5918(local15 + Static565.anInt9560);
			local126.aClass5_Sub22_Sub1_2.method5918((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local126.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
			Static277.method4436(local126);
			Static377.method5549(local15, local18, local32);
		}
		if (local21 == 5) {
			Static158.anInt2674 = 2;
			Static397.anInt6609 = arg0;
			Static158.anInt2675 = arg1;
			Static173.anInt3107 = 0;
			local126 = Static16.method232(Static408.aClass46_77, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5904(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5961(Static289.anInt5055);
			local126.aClass5_Sub22_Sub1_2.method5961(local15 + Static565.anInt9560);
			local126.aClass5_Sub22_Sub1_2.method5961((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local126.aClass5_Sub22_Sub1_2.method5949(Static375.anInt6224);
			local126.aClass5_Sub22_Sub1_2.method5961(Static570.anInt9615);
			Static277.method4436(local126);
			Static377.method5549(local15, local18, local32);
		}
		if (local21 == 25) {
			Static173.anInt3107 = 0;
			Static158.anInt2674 = 2;
			Static158.anInt2675 = arg1;
			Static397.anInt6609 = arg0;
			local126 = Static16.method232(Static427.aClass46_82, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5918((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local126.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5918(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5918(Static567.anInt9589 + local18);
			Static277.method4436(local126);
			Static377.method5549(local15, local18, local32);
		}
		if (local21 == 22) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2675 = arg1;
				Static158.anInt2674 = 2;
				Static397.anInt6609 = arg0;
				Static173.anInt3107 = 0;
				local58 = Static16.method232(Static513.aClass46_13, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5918(local25);
				local58.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 12) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				Static158.anInt2674 = 2;
				Static158.anInt2675 = arg1;
				local58 = Static16.method232(Static497.aClass46_91, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5961(local25);
				local58.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 45) {
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				Static158.anInt2674 = 2;
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				Static158.anInt2675 = arg1;
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				local465 = Static16.method232(Static512.aClass46_95, Static276.aClass251_2);
				local465.aClass5_Sub22_Sub1_2.method5961(Static289.anInt5055);
				local465.aClass5_Sub22_Sub1_2.method5961(local25);
				local465.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
				local465.aClass5_Sub22_Sub1_2.method5961(Static570.anInt9615);
				local465.aClass5_Sub22_Sub1_2.method5959(Static375.anInt6224);
				Static277.method4436(local465);
				Static552.method8051(local460.anIntArray94[0], local460.method1018(), true, local460.method1018(), 0, -2, local460.anIntArray95[0], 0);
			}
		}
		if (local21 == 21) {
			Static173.anInt3107 = 0;
			Static397.anInt6609 = arg0;
			Static158.anInt2674 = 1;
			Static158.anInt2675 = arg1;
			local126 = Static16.method232(Static179.aClass46_36, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5918(Static289.anInt5055);
			local126.aClass5_Sub22_Sub1_2.method5927(Static567.anInt9589 + local18);
			local126.aClass5_Sub22_Sub1_2.method5927(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5904(Static570.anInt9615);
			local126.aClass5_Sub22_Sub1_2.method5959(Static375.anInt6224);
			Static277.method4436(local126);
			Static552.method8051(local15, 1, true, 1, 0, -4, local18, 0);
		}
		if (local21 == 15) {
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				Static397.anInt6609 = arg0;
				Static173.anInt3107 = 0;
				Static158.anInt2674 = 2;
				Static158.anInt2675 = arg1;
				local465 = Static16.method232(Static133.aClass46_27, Static276.aClass251_2);
				local465.aClass5_Sub22_Sub1_2.method5927(local25);
				local465.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local465);
				Static552.method8051(local460.anIntArray94[0], local460.method1018(), true, local460.method1018(), 0, -2, local460.anIntArray95[0], 0);
			}
		}
		if (local21 == 18) {
			Static173.anInt3107 = 0;
			Static158.anInt2674 = 2;
			Static397.anInt6609 = arg0;
			Static158.anInt2675 = arg1;
			local126 = Static16.method232(Static573.aClass46_32, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5961(local25);
			local126.aClass5_Sub22_Sub1_2.method5918(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5941(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5918(Static567.anInt9589 + local18);
			Static277.method4436(local126);
			Static15.method227(local15, local18);
		}
		if (local21 == 3 && Static69.aClass295_5 == null) {
			Static42.method753(local15, local18);
			Static69.aClass295_5 = Static324.method4920(local18, local15);
			Static465.method6901(Static69.aClass295_5);
		}
		if (local21 == 47) {
			Static397.anInt6609 = arg0;
			Static158.anInt2675 = arg1;
			Static158.anInt2674 = 2;
			Static173.anInt3107 = 0;
			local126 = Static16.method232(Static30.aClass46_7, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5961(local25);
			local126.aClass5_Sub22_Sub1_2.method5904(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5918(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5941(Static45.aClass115_1.method2490(82) ? 1 : 0);
			Static277.method4436(local126);
			Static15.method227(local15, local18);
		}
		if (local21 == 1007 || local21 == 1003 || local21 == 1008 || local21 == 1012 || local21 == 1002) {
			Static372.method5483(local25, local21, local15);
		}
		if (local21 == 57) {
			Static158.anInt2675 = arg1;
			Static158.anInt2674 = 2;
			Static173.anInt3107 = 0;
			Static397.anInt6609 = arg0;
			local126 = Static16.method232(Static129.aClass46_26, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5927(local15 + Static565.anInt9560);
			local126.aClass5_Sub22_Sub1_2.method5941(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5961(local25);
			local126.aClass5_Sub22_Sub1_2.method5904(Static567.anInt9589 + local18);
			Static277.method4436(local126);
			Static15.method227(local15, local18);
		}
		if (local21 == 9) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2675 = arg1;
				Static397.anInt6609 = arg0;
				Static173.anInt3107 = 0;
				Static158.anInt2674 = 2;
				local58 = Static16.method232(Static400.aClass46_74, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5961(local25);
				local58.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 49) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2675 = arg1;
				Static158.anInt2674 = 2;
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				local58 = Static16.method232(Static198.aClass46_41, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5918(local25);
				local58.aClass5_Sub22_Sub1_2.method5934(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 1004) {
			Static397.anInt6609 = arg0;
			Static173.anInt3107 = 0;
			Static158.anInt2674 = 2;
			Static158.anInt2675 = arg1;
			local443 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local25);
			if (local443 != null) {
				local460 = local443.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				@Pc(2062) Class225 local2062 = local460.aClass225_1;
				if (local2062.anIntArray304 != null) {
					local2062 = local2062.method4990(Static301.aClass59_1);
				}
				if (local2062 != null) {
					@Pc(2081) Class5_Sub48 local2081 = Static16.method232(Static429.aClass46_84, Static276.aClass251_2);
					local2081.aClass5_Sub22_Sub1_2.method5918(local2062.anInt5613);
					Static277.method4436(local2081);
				}
			}
		}
		@Pc(2098) Class295 local2098;
		if (local21 == 8) {
			local2098 = Static324.method4920(local18, local15);
			if (local2098 != null) {
				Static420.method6387();
				@Pc(2105) Class5_Sub40 local2105 = Static75.method1286(local2098);
				Static356.method5281(local2105.anInt7585, local2098, local2105.method6707());
				Static493.aString96 = Static393.method8896(local2098);
				if (Static493.aString96 == null) {
					Static493.aString96 = "Null";
				}
				Static92.aString22 = local2098.aString92 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 44) {
			Static397.anInt6609 = arg0;
			Static158.anInt2675 = arg1;
			Static158.anInt2674 = 2;
			Static173.anInt3107 = 0;
			local126 = Static16.method232(Static54.aClass46_15, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5941(Static45.aClass115_1.method2490(82) ? 1 : 0);
			local126.aClass5_Sub22_Sub1_2.method5918(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5927(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5904(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static277.method4436(local126);
			Static377.method5549(local15, local18, local32);
		}
		if (local21 == 10) {
			local2098 = Static324.method4920(local18, local15);
			if (local2098 != null) {
				Static122.method1872(local2098);
			}
		}
		if (local21 == 51) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2674 = 2;
				Static158.anInt2675 = arg1;
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				local58 = Static16.method232(Static42.aClass46_11, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5904(Static570.anInt9615);
				local58.aClass5_Sub22_Sub1_2.method5918(local25);
				local58.aClass5_Sub22_Sub1_2.method5949(Static375.anInt6224);
				local58.aClass5_Sub22_Sub1_2.method5904(Static289.anInt5055);
				local58.aClass5_Sub22_Sub1_2.method5938(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 19) {
			local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local25];
			if (local39 != null) {
				Static158.anInt2674 = 2;
				Static173.anInt3107 = 0;
				Static397.anInt6609 = arg0;
				Static158.anInt2675 = arg1;
				local58 = Static16.method232(Static396.aClass46_71, Static276.aClass251_2);
				local58.aClass5_Sub22_Sub1_2.method5904(local25);
				local58.aClass5_Sub22_Sub1_2.method5938(Static45.aClass115_1.method2490(82) ? 1 : 0);
				Static277.method4436(local58);
				Static552.method8051(local39.anIntArray94[0], local39.method1018(), true, local39.method1018(), 0, -2, local39.anIntArray95[0], 0);
			}
		}
		if (local21 == 48) {
			Static158.anInt2675 = arg1;
			Static173.anInt3107 = 0;
			Static397.anInt6609 = arg0;
			Static158.anInt2674 = 2;
			local126 = Static16.method232(Static293.aClass46_60, Static276.aClass251_2);
			local126.aClass5_Sub22_Sub1_2.method5961(Static289.anInt5055);
			local126.aClass5_Sub22_Sub1_2.method5949(Static375.anInt6224);
			local126.aClass5_Sub22_Sub1_2.method5961(Static565.anInt9560 + local15);
			local126.aClass5_Sub22_Sub1_2.method5927(local25);
			local126.aClass5_Sub22_Sub1_2.method5918(Static570.anInt9615);
			local126.aClass5_Sub22_Sub1_2.method5904(local18 + Static567.anInt9589);
			local126.aClass5_Sub22_Sub1_2.method5905(Static45.aClass115_1.method2490(82) ? 1 : 0);
			Static277.method4436(local126);
			Static15.method227(local15, local18);
		}
		if (Static285.aBoolean378) {
			Static420.method6387();
		}
		if (Static334.aClass295_11 != null && Static140.anInt2439 == 0) {
			Static465.method6901(Static334.aClass295_11);
		}
	}
}
