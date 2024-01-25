import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "Z")
	public static boolean aBoolean740 = false;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IBILclient!em;)V")
	public static void method7562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub5_Sub9 arg2) {
		if (arg2 == null || Static68.aClass163_14.aClass6_178 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt3242;
		@Pc(18) int local18 = arg2.anInt3241;
		@Pc(21) int local21 = arg2.anInt3240;
		@Pc(25) int local25 = (int) arg2.aLong78;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg2.aLong78;
		@Pc(52) Class6_Sub42 local52;
		@Pc(57) Class9_Sub4_Sub2_Sub1_Sub1 local57;
		if (local21 == 1002) {
			Static109.anInt2941 = 2;
			Static620.anInt10443 = arg0;
			Static516.anInt9014 = 0;
			Static623.anInt10490 = arg1;
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				@Pc(60) Class158 local60 = local57.aClass158_1;
				if (local60.anIntArray260 != null) {
					local60 = local60.method4867(Static140.aClass157_1);
				}
				if (local60 != null) {
					@Pc(79) Class6_Sub17 local79 = Static330.method7824(Static66.aClass185_19, Static569.aClass134_2);
					local79.aClass6_Sub8_Sub1_2.method8241(local60.anInt5817);
					Static452.method6867(local79);
				}
			}
		}
		@Pc(95) Class9_Sub4_Sub2_Sub1_Sub2 local95;
		@Pc(116) Class6_Sub17 local116;
		if (local21 == 51) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 2;
				Static620.anInt10443 = arg0;
				Static623.anInt10490 = arg1;
				local116 = Static330.method7824(Static228.aClass185_50, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8255(local25);
				local116.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 45) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static623.anInt10490 = arg1;
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 2;
				Static620.anInt10443 = arg0;
				local116 = Static330.method7824(Static490.aClass185_52, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8223(Static391.aClass91_1.method6224(82) ? 1 : 0);
				local116.aClass6_Sub8_Sub1_2.method8241(local25);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		@Pc(248) Class6_Sub17 local248;
		if (local21 == 58) {
			Static620.anInt10443 = arg0;
			Static623.anInt10490 = arg1;
			Static109.anInt2941 = 2;
			Static516.anInt9014 = 0;
			local248 = Static330.method7824(Static18.aClass185_7, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8217(Static350.anInt6854);
			local248.aClass6_Sub8_Sub1_2.method8255(Static227.anInt5049 + local18);
			local248.aClass6_Sub8_Sub1_2.method8255(local25);
			local248.aClass6_Sub8_Sub1_2.method8211(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8255(Static641.anInt10722);
			local248.aClass6_Sub8_Sub1_2.method8212(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8255(Static541.anInt9362);
			Static452.method6867(local248);
			Static90.method2285(local18, local15);
		}
		if (local21 == 1011 || local21 == 1003 || local21 == 1001 || local21 == 1010 || local21 == 1004) {
			Static302.method5137(local21, local15, local25);
		}
		if (local21 == 2) {
			Static109.anInt2941 = 2;
			Static620.anInt10443 = arg0;
			Static623.anInt10490 = arg1;
			Static516.anInt9014 = 0;
			local248 = Static330.method7824(Static295.aClass185_64, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8212(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8212(local25);
			local248.aClass6_Sub8_Sub1_2.method8199(local18 + Static227.anInt5049);
			local248.aClass6_Sub8_Sub1_2.method8261(Static391.aClass91_1.method6224(82) ? 1 : 0);
			Static452.method6867(local248);
			Static90.method2285(local18, local15);
		}
		if (local21 == 50) {
			Static516.anInt9014 = 0;
			Static623.anInt10490 = arg1;
			Static620.anInt10443 = arg0;
			Static109.anInt2941 = 2;
			local248 = Static330.method7824(Static259.aClass185_70, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8262(Static350.anInt6854);
			local248.aClass6_Sub8_Sub1_2.method8255(Static541.anInt9362);
			local248.aClass6_Sub8_Sub1_2.method8241(Static641.anInt10722);
			local248.aClass6_Sub8_Sub1_2.method8241(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8223(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8199((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local248.aClass6_Sub8_Sub1_2.method8255(Static227.anInt5049 + local18);
			Static452.method6867(local248);
			Static129.method2651(local34, local15, local18);
		}
		@Pc(504) Class6_Sub17 local504;
		if (local21 == 11) {
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				Static620.anInt10443 = arg0;
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				Static516.anInt9014 = 0;
				Static623.anInt10490 = arg1;
				Static109.anInt2941 = 2;
				local504 = Static330.method7824(Static548.aClass185_104, Static569.aClass134_2);
				local504.aClass6_Sub8_Sub1_2.method8241(local25);
				local504.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local504);
				Static168.method3192(0, 0, local57.method3620(), -2, local57.anIntArray198[0], local57.anIntArray197[0], true, local57.method3620());
			}
		}
		if (local21 == 20) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static623.anInt10490 = arg1;
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 2;
				Static620.anInt10443 = arg0;
				local116 = Static330.method7824(Static127.aClass185_31, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8212(local25);
				local116.aClass6_Sub8_Sub1_2.method8223(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 5) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static109.anInt2941 = 2;
				Static623.anInt10490 = arg1;
				Static516.anInt9014 = 0;
				Static620.anInt10443 = arg0;
				local116 = Static330.method7824(Static300.aClass185_65, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8255(local25);
				local116.aClass6_Sub8_Sub1_2.method8199(Static541.anInt9362);
				local116.aClass6_Sub8_Sub1_2.method8262(Static350.anInt6854);
				local116.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				local116.aClass6_Sub8_Sub1_2.method8199(Static641.anInt10722);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 19) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static620.anInt10443 = arg0;
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 2;
				Static623.anInt10490 = arg1;
				local116 = Static330.method7824(Static632.aClass185_112, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8199(local25);
				local116.aClass6_Sub8_Sub1_2.method8261(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 30) {
			Static620.anInt10443 = arg0;
			Static109.anInt2941 = 2;
			Static516.anInt9014 = 0;
			Static623.anInt10490 = arg1;
			local248 = Static330.method7824(Static102.aClass185_26, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8212(local18 + Static227.anInt5049);
			local248.aClass6_Sub8_Sub1_2.method8255(local25);
			local248.aClass6_Sub8_Sub1_2.method8212(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			Static452.method6867(local248);
			Static90.method2285(local18, local15);
		}
		if (local21 == 47) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static623.anInt10490 = arg1;
				Static620.anInt10443 = arg0;
				Static109.anInt2941 = 2;
				Static516.anInt9014 = 0;
				local116 = Static330.method7824(Static525.aClass185_100, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8223(Static391.aClass91_1.method6224(82) ? 1 : 0);
				local116.aClass6_Sub8_Sub1_2.method8241(local25);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 16) {
			Static623.anInt10490 = arg1;
			Static620.anInt10443 = arg0;
			Static516.anInt9014 = 0;
			Static109.anInt2941 = 2;
			local248 = Static330.method7824(Static360.aClass185_69, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8212(local15 + Static477.anInt8412);
			local248.aClass6_Sub8_Sub1_2.method8212(local18 + Static227.anInt5049);
			local248.aClass6_Sub8_Sub1_2.method8199((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			Static452.method6867(local248);
			Static129.method2651(local34, local15, local18);
		}
		if (local21 == 3) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static620.anInt10443 = arg0;
				Static109.anInt2941 = 2;
				Static623.anInt10490 = arg1;
				Static516.anInt9014 = 0;
				local116 = Static330.method7824(Static97.aClass185_25, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8261(Static391.aClass91_1.method6224(82) ? 1 : 0);
				local116.aClass6_Sub8_Sub1_2.method8241(local25);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 8) {
			Static109.anInt2941 = 2;
			Static620.anInt10443 = arg0;
			Static623.anInt10490 = arg1;
			Static516.anInt9014 = 0;
			local248 = Static330.method7824(Static465.aClass185_94, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8199(local15 + Static477.anInt8412);
			local248.aClass6_Sub8_Sub1_2.method8255(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8255(Static227.anInt5049 + local18);
			Static452.method6867(local248);
			Static129.method2651(local34, local15, local18);
		}
		if (local21 == 17) {
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				Static623.anInt10490 = arg1;
				Static109.anInt2941 = 2;
				Static516.anInt9014 = 0;
				Static620.anInt10443 = arg0;
				local504 = Static330.method7824(Static578.aClass185_108, Static569.aClass134_2);
				local504.aClass6_Sub8_Sub1_2.method8241(local25);
				local504.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local504);
				Static168.method3192(0, 0, local57.method3620(), -2, local57.anIntArray198[0], local57.anIntArray197[0], true, local57.method3620());
			}
		}
		if (local21 == 9 && Static97.aClass302_2 == null) {
			Static287.method4983(local15, local18);
			Static97.aClass302_2 = Static454.method6884(local18, local15);
			Static580.method8049(Static97.aClass302_2);
		}
		@Pc(1218) Class302 local1218;
		if (local21 == 59) {
			local1218 = Static454.method6884(local18, local15);
			if (local1218 != null) {
				Static320.method5326(local1218);
			}
		}
		if (local21 == 13) {
			Static623.anInt10490 = arg1;
			Static620.anInt10443 = arg0;
			Static516.anInt9014 = 0;
			Static109.anInt2941 = 2;
			local248 = Static330.method7824(Static397.aClass185_83, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8199(local15 + Static477.anInt8412);
			local248.aClass6_Sub8_Sub1_2.method8212(local25);
			local248.aClass6_Sub8_Sub1_2.method8255(local18 + Static227.anInt5049);
			Static452.method6867(local248);
			Static90.method2285(local18, local15);
		}
		if (local21 == 49 || local21 == 1006) {
			Static526.method7485(local25, local15, arg2.aString25, local18);
		}
		if (local21 == 48) {
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				Static623.anInt10490 = arg1;
				Static109.anInt2941 = 2;
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				Static620.anInt10443 = arg0;
				Static516.anInt9014 = 0;
				local504 = Static330.method7824(Static153.aClass185_34, Static569.aClass134_2);
				local504.aClass6_Sub8_Sub1_2.method8217(Static350.anInt6854);
				local504.aClass6_Sub8_Sub1_2.method8212(Static541.anInt9362);
				local504.aClass6_Sub8_Sub1_2.method8241(local25);
				local504.aClass6_Sub8_Sub1_2.method8223(Static391.aClass91_1.method6224(82) ? 1 : 0);
				local504.aClass6_Sub8_Sub1_2.method8212(Static641.anInt10722);
				Static452.method6867(local504);
				Static168.method3192(0, 0, local57.method3620(), -2, local57.anIntArray198[0], local57.anIntArray197[0], true, local57.method3620());
			}
		}
		if (local21 == 1009) {
			Static620.anInt10443 = arg0;
			Static623.anInt10490 = arg1;
			Static109.anInt2941 = 2;
			Static516.anInt9014 = 0;
			local248 = Static330.method7824(Static226.aClass185_47, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8241(local25);
			Static452.method6867(local248);
		}
		if (local21 == 57) {
			Static109.anInt2941 = 2;
			Static623.anInt10490 = arg1;
			Static620.anInt10443 = arg0;
			Static516.anInt9014 = 0;
			local248 = Static330.method7824(Static300.aClass185_65, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8255(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4299);
			local248.aClass6_Sub8_Sub1_2.method8199(Static541.anInt9362);
			local248.aClass6_Sub8_Sub1_2.method8262(Static350.anInt6854);
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8199(Static641.anInt10722);
			Static452.method6867(local248);
		}
		if (local21 == 15) {
			Static623.anInt10490 = arg1;
			Static516.anInt9014 = 0;
			Static109.anInt2941 = 2;
			Static620.anInt10443 = arg0;
			local248 = Static330.method7824(Static439.aClass185_87, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8212(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local248.aClass6_Sub8_Sub1_2.method8211(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8255(local15 + Static477.anInt8412);
			local248.aClass6_Sub8_Sub1_2.method8199(local18 + Static227.anInt5049);
			Static452.method6867(local248);
			Static129.method2651(local34, local15, local18);
		}
		if (local21 == 6) {
			if (Static497.anInt8643 > 0 && Static391.aClass91_1.method6224(82) && Static391.aClass91_1.method6224(81)) {
				Static602.method8316(Static227.anInt5049 + local18, Static477.anInt8412 - -local15, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135);
			} else {
				local248 = Static103.method2430(local18, local25, local15);
				if (local25 == 1) {
					local248.aClass6_Sub8_Sub1_2.method8211(-1);
					local248.aClass6_Sub8_Sub1_2.method8211(-1);
					local248.aClass6_Sub8_Sub1_2.method8241((int) Static595.aFloat184);
					local248.aClass6_Sub8_Sub1_2.method8211(57);
					local248.aClass6_Sub8_Sub1_2.method8211(Static372.anInt7080);
					local248.aClass6_Sub8_Sub1_2.method8211(Static289.anInt10738);
					local248.aClass6_Sub8_Sub1_2.method8211(89);
					local248.aClass6_Sub8_Sub1_2.method8241(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360);
					local248.aClass6_Sub8_Sub1_2.method8241(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357);
					local248.aClass6_Sub8_Sub1_2.method8211(63);
				} else {
					Static109.anInt2941 = 1;
					Static516.anInt9014 = 0;
					Static620.anInt10443 = arg0;
					Static623.anInt10490 = arg1;
				}
				Static452.method6867(local248);
				Static168.method3192(0, 0, 1, -4, local18, local15, true, 1);
			}
		}
		if (local21 == 4) {
			Static109.anInt2941 = 2;
			Static516.anInt9014 = 0;
			Static623.anInt10490 = arg1;
			Static620.anInt10443 = arg0;
			local248 = Static330.method7824(Static499.aClass185_98, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8241(Static227.anInt5049 + local18);
			local248.aClass6_Sub8_Sub1_2.method8212((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local248.aClass6_Sub8_Sub1_2.method8241(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8223(Static391.aClass91_1.method6224(82) ? 1 : 0);
			Static452.method6867(local248);
			Static129.method2651(local34, local15, local18);
		}
		if (local21 == 60) {
			if (Static497.anInt8643 > 0 && Static391.aClass91_1.method6224(82) && Static391.aClass91_1.method6224(81)) {
				Static602.method8316(local18 + Static227.anInt5049, local15 + Static477.anInt8412, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135);
			} else {
				Static620.anInt10443 = arg0;
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 1;
				Static623.anInt10490 = arg1;
				local248 = Static330.method7824(Static573.aClass185_107, Static569.aClass134_2);
				local248.aClass6_Sub8_Sub1_2.method8199(local18 + Static227.anInt5049);
				local248.aClass6_Sub8_Sub1_2.method8199(Static477.anInt8412 + local15);
				Static452.method6867(local248);
			}
		}
		if (local21 == 1007) {
			Static516.anInt9014 = 0;
			Static620.anInt10443 = arg0;
			Static109.anInt2941 = 2;
			Static623.anInt10490 = arg1;
			local248 = Static330.method7824(Static448.aClass185_91, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8199(local15 + Static477.anInt8412);
			local248.aClass6_Sub8_Sub1_2.method8255(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8255(Static227.anInt5049 + local18);
			Static452.method6867(local248);
			Static129.method2651(local34, local15, local18);
		}
		if (local21 == 21) {
			local1218 = Static454.method6884(local18, local15);
			if (local1218 != null) {
				Static516.method7391();
				@Pc(1922) Class6_Sub50 local1922 = Static75.method2151(local1218);
				Static246.method4414(local1922.anInt10442, local1218, local1922.method8492());
				Static381.aString72 = Static316.method5294(local1218);
				if (Static381.aString72 == null) {
					Static381.aString72 = "Null";
				}
				Static275.aString109 = local1218.aString89 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 10) {
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				Static516.anInt9014 = 0;
				Static623.anInt10490 = arg1;
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				Static109.anInt2941 = 2;
				Static620.anInt10443 = arg0;
				local504 = Static330.method7824(Static572.aClass185_106, Static569.aClass134_2);
				local504.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				local504.aClass6_Sub8_Sub1_2.method8212(local25);
				Static452.method6867(local504);
				Static168.method3192(0, 0, local57.method3620(), -2, local57.anIntArray198[0], local57.anIntArray197[0], true, local57.method3620());
			}
		}
		if (local21 == 46) {
			Static109.anInt2941 = 1;
			Static623.anInt10490 = arg1;
			Static516.anInt9014 = 0;
			Static620.anInt10443 = arg0;
			local248 = Static330.method7824(Static470.aClass185_95, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8249(Static350.anInt6854);
			local248.aClass6_Sub8_Sub1_2.method8255(Static541.anInt9362);
			local248.aClass6_Sub8_Sub1_2.method8241(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8241(Static641.anInt10722);
			local248.aClass6_Sub8_Sub1_2.method8241(Static227.anInt5049 + local18);
			Static452.method6867(local248);
			Static168.method3192(0, 0, 1, -4, local18, local15, true, 1);
		}
		if (local21 == 18) {
			Static620.anInt10443 = arg0;
			Static109.anInt2941 = 2;
			Static623.anInt10490 = arg1;
			Static516.anInt9014 = 0;
			local248 = Static330.method7824(Static595.aClass185_110, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8255(Static477.anInt8412 + local15);
			local248.aClass6_Sub8_Sub1_2.method8255(local25);
			local248.aClass6_Sub8_Sub1_2.method8255(Static227.anInt5049 + local18);
			local248.aClass6_Sub8_Sub1_2.method8211(Static391.aClass91_1.method6224(82) ? 1 : 0);
			Static452.method6867(local248);
			Static90.method2285(local18, local15);
		}
		if (local21 == 1008) {
			Static516.anInt9014 = 0;
			Static623.anInt10490 = arg1;
			Static109.anInt2941 = 2;
			Static620.anInt10443 = arg0;
			local248 = Static330.method7824(Static624.aClass185_111, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8241(local25);
			Static452.method6867(local248);
		}
		if (local21 == 22) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 2;
				Static623.anInt10490 = arg1;
				Static620.anInt10443 = arg0;
				local116 = Static330.method7824(Static443.aClass185_88, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8255(local25);
				local116.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 44) {
			local95 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local25];
			if (local95 != null) {
				Static516.anInt9014 = 0;
				Static623.anInt10490 = arg1;
				Static620.anInt10443 = arg0;
				Static109.anInt2941 = 2;
				local116 = Static330.method7824(Static364.aClass185_72, Static569.aClass134_2);
				local116.aClass6_Sub8_Sub1_2.method8241(local25);
				local116.aClass6_Sub8_Sub1_2.method8211(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local116);
				Static168.method3192(0, 0, local95.method3620(), -2, local95.anIntArray198[0], local95.anIntArray197[0], true, local95.method3620());
			}
		}
		if (local21 == 23) {
			Static620.anInt10443 = arg0;
			Static516.anInt9014 = 0;
			Static623.anInt10490 = arg1;
			Static109.anInt2941 = 2;
			local248 = Static330.method7824(Static197.aClass185_63, Static569.aClass134_2);
			local248.aClass6_Sub8_Sub1_2.method8255(local18 + Static227.anInt5049);
			local248.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
			local248.aClass6_Sub8_Sub1_2.method8199(local25);
			local248.aClass6_Sub8_Sub1_2.method8255(local15 + Static477.anInt8412);
			Static452.method6867(local248);
			Static90.method2285(local18, local15);
		}
		if (local21 == 12) {
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				Static516.anInt9014 = 0;
				Static109.anInt2941 = 2;
				Static620.anInt10443 = arg0;
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				Static623.anInt10490 = arg1;
				local504 = Static330.method7824(Static81.aClass185_21, Static569.aClass134_2);
				local504.aClass6_Sub8_Sub1_2.method8241(local25);
				local504.aClass6_Sub8_Sub1_2.method8248(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local504);
				Static168.method3192(0, 0, local57.method3620(), -2, local57.anIntArray198[0], local57.anIntArray197[0], true, local57.method3620());
			}
		}
		if (local21 == 25) {
			local52 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local25);
			if (local52 != null) {
				Static623.anInt10490 = arg1;
				Static109.anInt2941 = 2;
				Static620.anInt10443 = arg0;
				Static516.anInt9014 = 0;
				local57 = local52.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				local504 = Static330.method7824(Static189.aClass185_41, Static569.aClass134_2);
				local504.aClass6_Sub8_Sub1_2.method8241(local25);
				local504.aClass6_Sub8_Sub1_2.method8261(Static391.aClass91_1.method6224(82) ? 1 : 0);
				Static452.method6867(local504);
				Static168.method3192(0, 0, local57.method3620(), -2, local57.anIntArray198[0], local57.anIntArray197[0], true, local57.method3620());
			}
		}
		if (Static141.aBoolean262) {
			Static516.method7391();
		}
		if (Static146.aClass302_10 != null && Static428.anInt7856 == 0) {
			Static580.method8049(Static146.aClass302_10);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7565(@OriginalArg(1) String arg0) {
		return Static403.method6331(10, arg0);
	}
}
