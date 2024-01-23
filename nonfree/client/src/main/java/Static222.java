import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!vf", name = "nb", descriptor = "[I")
	public static int[] anIntArray342 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(BI)V")
	public static void method2941(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static224.method3669(arg0)) {
			return;
		}
		@Pc(23) Class86[] local23 = Static6.aClass86ArrayArray11[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class86 local31 = local23[local25];
			if (local31.anObjectArray6 != null) {
				@Pc(38) Class1_Sub22 local38 = new Class1_Sub22();
				local38.anObjectArray33 = local31.anObjectArray6;
				local38.aClass86_10 = local31;
				Static29.method577(2000000, local38);
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
	public static int method2947(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(20) int local20 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local20 * arg0 >> 12) + 40960;
		return local9 * local33 >> 12;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)J")
	public static long method2957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass97_1 == null ? 0L : local7.aClass97_1.aLong136;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)V")
	public static void method2962(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		if (Static157.anInt3442 == 2) {
			if (Static32.anInt604 != Static37.anInt767 || Static1.anInt74 != Static11.anInt298) {
				return;
			}
			Static157.anInt3442 = 0;
		} else if (Static32.anInt604 == Static20.anInt2218 && Static11.anInt298 == Static161.anInt3533) {
			Static157.anInt3442 = 0;
		} else {
			Static157.anInt3442 = 2;
			Static1.anInt74 = Static161.anInt3533;
			Static37.anInt767 = Static20.anInt2218;
			return;
		}
		@Pc(53) int local53 = Static4.anIntArray378[arg0];
		@Pc(57) int local57 = Static152.anIntArray293[arg0];
		@Pc(61) int local61 = Static106.aShortArray30[arg0];
		@Pc(66) int local66 = (int) Static199.aLongArray6[arg0];
		if (local61 >= 2000) {
			local61 -= 2000;
		}
		@Pc(76) long local76 = Static199.aLongArray6[arg0];
		@Pc(83) Class5_Sub5_Sub2 local83;
		if (local61 == 26) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static163.anInt3549 = Static20.anInt2218;
				Static118.anInt2619 = Static161.anInt3533;
				Static217.anInt4746 = 2;
				Static228.anInt4955 = 0;
				Static193.aClass1_Sub26_Sub1_2.method3000(174);
				Static193.aClass1_Sub26_Sub1_2.method2966(local66);
			}
		}
		if (local61 == 24) {
			Static141.method2355(local57, local76, local53);
			Static193.aClass1_Sub26_Sub1_2.method3000(253);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2949((int) (local76 >>> 32) & Integer.MAX_VALUE);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static152.anInt3377 + local53);
		}
		@Pc(178) Class5_Sub5_Sub1 local178;
		if (local61 == 32) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static217.anInt4746 = 2;
				Static163.anInt3549 = Static20.anInt2218;
				Static118.anInt2619 = Static161.anInt3533;
				Static228.anInt4955 = 0;
				Static193.aClass1_Sub26_Sub1_2.method3000(27);
				Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			}
		}
		if (local61 == 29) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static163.anInt3549 = Static20.anInt2218;
				Static217.anInt4746 = 2;
				Static193.aClass1_Sub26_Sub1_2.method3000(127);
				Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			}
		}
		if (local61 == 3) {
			Static193.aClass1_Sub26_Sub1_2.method3000(80);
			Static193.aClass1_Sub26_Sub1_2.method2994(local53);
			Static193.aClass1_Sub26_Sub1_2.method2949(local57);
			Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 1006) {
			Static141.method2355(local57, local76, local53);
			Static193.aClass1_Sub26_Sub1_2.method3000(202);
			Static193.aClass1_Sub26_Sub1_2.method2988(Integer.MAX_VALUE & (int) (local76 >>> 32));
			Static193.aClass1_Sub26_Sub1_2.method2988(local53 + Static152.anInt3377);
			Static193.aClass1_Sub26_Sub1_2.method2949(local57 + Static36.anInt764);
		}
		@Pc(380) boolean local380;
		if (local61 == 58) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static228.anInt4955 = 0;
			Static163.anInt3549 = Static20.anInt2218;
			Static118.anInt2619 = Static161.anInt3533;
			Static217.anInt4746 = 2;
			Static193.aClass1_Sub26_Sub1_2.method3000(51);
			Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static152.anInt3377 + local53);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static36.anInt764 + local57);
		}
		if (local61 == 46) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static217.anInt4746 = 2;
				Static118.anInt2619 = Static161.anInt3533;
				Static163.anInt3549 = Static20.anInt2218;
				Static228.anInt4955 = 0;
				Static193.aClass1_Sub26_Sub1_2.method3000(211);
				Static193.aClass1_Sub26_Sub1_2.method2994(Static218.anInt4759);
				Static193.aClass1_Sub26_Sub1_2.method2963(Static70.anInt1591);
				Static193.aClass1_Sub26_Sub1_2.method2966(local66);
				Static193.aClass1_Sub26_Sub1_2.method2988(Static49.anInt1274);
			}
		}
		if (local61 == 13) {
			Static193.aClass1_Sub26_Sub1_2.method3000(194);
			Static193.aClass1_Sub26_Sub1_2.method2949(local57);
			Static193.aClass1_Sub26_Sub1_2.method2973(local53);
			Static193.aClass1_Sub26_Sub1_2.method2966(local66);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		@Pc(545) Class86 local545;
		if (local61 == 45) {
			Static128.method2152();
			local545 = Static13.method333(local53);
			Static218.anInt4759 = local53;
			Static49.anInt1274 = local57;
			Static70.anInt1591 = local66;
			Static167.anInt3590 = 1;
			Static16.method354(local545);
			Static6.aClass107_820 = Static149.method2437(new Class107[] { Static132.aClass107_768, Static128.method2147(local66).aClass107_737, Static125.aClass107_735 });
			if (Static6.aClass107_820 == null) {
				Static6.aClass107_820 = Static35.aClass107_245;
			}
			return;
		}
		if (local61 == 47) {
			Static54.method1091();
		}
		if (local61 == 42) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static217.anInt4746 = 2;
			Static163.anInt3549 = Static20.anInt2218;
			Static228.anInt4955 = 0;
			Static118.anInt2619 = Static161.anInt3533;
			Static193.aClass1_Sub26_Sub1_2.method3000(216);
			Static193.aClass1_Sub26_Sub1_2.method2988(Static152.anInt3377 + local53);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static70.anInt1591);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static49.anInt1274);
			Static193.aClass1_Sub26_Sub1_2.method2994(Static218.anInt4759);
		}
		if (local61 == 11) {
			local545 = Static11.method314(local53, local57);
			if (local545 != null) {
				Static128.method2152();
				Static56.method1123(local57, local53, Static65.method1211(Static34.method676(local545)));
				Static167.anInt3590 = 0;
				Static71.aClass107_470 = Static213.method3436(local545);
				if (Static71.aClass107_470 == null) {
					Static71.aClass107_470 = Static36.aClass107_255;
				}
				if (local545.aBoolean280) {
					Static219.aClass107_1291 = Static149.method2437(new Class107[] { local545.aClass107_863, Static125.aClass107_735 });
					return;
				}
				Static219.aClass107_1291 = Static149.method2437(new Class107[] { Static7.aClass107_103, local545.aClass107_865, Static125.aClass107_735 });
			}
			return;
		}
		if (local61 == 44) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static163.anInt3549 = Static20.anInt2218;
				Static217.anInt4746 = 2;
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static193.aClass1_Sub26_Sub1_2.method3000(172);
				Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			}
		}
		if (local61 == 25) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static217.anInt4746 = 2;
				Static163.anInt3549 = Static20.anInt2218;
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static193.aClass1_Sub26_Sub1_2.method3000(95);
				Static193.aClass1_Sub26_Sub1_2.method2966(local66);
			}
		}
		if (local61 == 8) {
			Static193.aClass1_Sub26_Sub1_2.method3000(102);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static153.anInt3386);
			Static193.aClass1_Sub26_Sub1_2.method2934(local53);
			Static193.aClass1_Sub26_Sub1_2.method2949(local57);
			Static193.aClass1_Sub26_Sub1_2.method2934(Static123.anInt2677);
		}
		if (local61 == 1002) {
			Static217.anInt4746 = 2;
			Static118.anInt2619 = Static161.anInt3533;
			Static163.anInt3549 = Static20.anInt2218;
			Static228.anInt4955 = 0;
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				@Pc(913) Class30 local913 = local83.aClass30_1;
				if (local913.anIntArray102 != null) {
					local913 = local913.method870();
				}
				if (local913 != null) {
					Static193.aClass1_Sub26_Sub1_2.method3000(150);
					Static193.aClass1_Sub26_Sub1_2.method2988(local913.anInt964);
				}
			}
		}
		if (local61 == 36) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static217.anInt4746 = 2;
				Static163.anInt3549 = Static20.anInt2218;
				Static193.aClass1_Sub26_Sub1_2.method3000(199);
				Static193.aClass1_Sub26_Sub1_2.method2949(Static70.anInt1591);
				Static193.aClass1_Sub26_Sub1_2.method2966(Static49.anInt1274);
				Static193.aClass1_Sub26_Sub1_2.method2949(local66);
				Static193.aClass1_Sub26_Sub1_2.method2934(Static218.anInt4759);
			}
		}
		if (local61 == 18) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static217.anInt4746 = 2;
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static163.anInt3549 = Static20.anInt2218;
				Static193.aClass1_Sub26_Sub1_2.method3000(34);
				Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			}
		}
		if (local61 == 37) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static163.anInt3549 = Static20.anInt2218;
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static217.anInt4746 = 2;
				Static193.aClass1_Sub26_Sub1_2.method3000(170);
				Static193.aClass1_Sub26_Sub1_2.method2966(local66);
			}
		}
		if (local61 == 14) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static228.anInt4955 = 0;
			Static118.anInt2619 = Static161.anInt3533;
			Static163.anInt3549 = Static20.anInt2218;
			Static217.anInt4746 = 2;
			Static193.aClass1_Sub26_Sub1_2.method3000(125);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			Static193.aClass1_Sub26_Sub1_2.method2966(local53 + Static152.anInt3377);
		}
		if (local61 == 20) {
			Static152.method2503(Static191.anInt4237, local57, local53);
		}
		if (local61 == 1007) {
			Static163.anInt3549 = Static20.anInt2218;
			Static217.anInt4746 = 2;
			Static228.anInt4955 = 0;
			Static118.anInt2619 = Static161.anInt3533;
			Static193.aClass1_Sub26_Sub1_2.method3000(230);
			Static193.aClass1_Sub26_Sub1_2.method2966(local66);
		}
		if (local61 == 21) {
			Static193.aClass1_Sub26_Sub1_2.method3000(238);
			Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static70.anInt1591);
			Static193.aClass1_Sub26_Sub1_2.method2988(local57);
			Static193.aClass1_Sub26_Sub1_2.method2973(Static218.anInt4759);
			Static193.aClass1_Sub26_Sub1_2.method2934(local53);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static49.anInt1274);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 10) {
			local545 = Static13.method333(local53);
			@Pc(1285) boolean local1285 = true;
			if (local545.anInt3285 > 0) {
				local1285 = Static160.method2580(local545);
			}
			if (local1285) {
				Static193.aClass1_Sub26_Sub1_2.method3000(3);
				Static193.aClass1_Sub26_Sub1_2.method2973(local53);
			}
		}
		if (local61 == 19) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static163.anInt3549 = Static20.anInt2218;
			Static217.anInt4746 = 2;
			Static228.anInt4955 = 0;
			Static118.anInt2619 = Static161.anInt3533;
			Static193.aClass1_Sub26_Sub1_2.method3000(24);
			Static193.aClass1_Sub26_Sub1_2.method2966(local53 + Static152.anInt3377);
			Static193.aClass1_Sub26_Sub1_2.method2963(local57 + Static36.anInt764);
			Static193.aClass1_Sub26_Sub1_2.method2949(local66);
		}
		if (local61 == 1004) {
			local545 = Static13.method333(local53);
			if (local545 == null || local545.anIntArray275[local57] < 100000) {
				Static193.aClass1_Sub26_Sub1_2.method3000(230);
				Static193.aClass1_Sub26_Sub1_2.method2966(local66);
			} else {
				Static136.method2282(Static149.method2437(new Class107[] { Static115.method2001(local545.anIntArray275[local57]), Static119.aClass107_706, Static128.method2147(local66).aClass107_737 }), 0, Static63.aClass107_427);
			}
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 38) {
			Static193.aClass1_Sub26_Sub1_2.method3000(197);
			Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			Static193.aClass1_Sub26_Sub1_2.method2994(local53);
			Static193.aClass1_Sub26_Sub1_2.method2988(local57);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 2) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static217.anInt4746 = 2;
				Static118.anInt2619 = Static161.anInt3533;
				Static228.anInt4955 = 0;
				Static163.anInt3549 = Static20.anInt2218;
				Static193.aClass1_Sub26_Sub1_2.method3000(76);
				Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			}
		}
		if (local61 == 12) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static118.anInt2619 = Static161.anInt3533;
			Static217.anInt4746 = 2;
			Static163.anInt3549 = Static20.anInt2218;
			Static228.anInt4955 = 0;
			Static193.aClass1_Sub26_Sub1_2.method3000(212);
			Static193.aClass1_Sub26_Sub1_2.method2963(local53 + Static152.anInt3377);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2966(local66);
		}
		if (local61 == 16) {
			Static193.aClass1_Sub26_Sub1_2.method3000(146);
			Static193.aClass1_Sub26_Sub1_2.method2934(local53);
			Static193.aClass1_Sub26_Sub1_2.method2966(local57);
			Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 5) {
			Static193.aClass1_Sub26_Sub1_2.method3000(201);
			Static193.aClass1_Sub26_Sub1_2.method2934(local53);
			Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			Static193.aClass1_Sub26_Sub1_2.method2949(local57);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 35) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static163.anInt3549 = Static20.anInt2218;
			Static228.anInt4955 = 0;
			Static118.anInt2619 = Static161.anInt3533;
			Static217.anInt4746 = 2;
			Static193.aClass1_Sub26_Sub1_2.method3000(177);
			Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			Static193.aClass1_Sub26_Sub1_2.method2963(local57 + Static36.anInt764);
			Static193.aClass1_Sub26_Sub1_2.method2988(Static152.anInt3377 + local53);
		}
		if (local61 == 34) {
			Static141.method2355(local57, local76, local53);
			Static193.aClass1_Sub26_Sub1_2.method3000(110);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static152.anInt3377 + local53);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2988((int) (local76 >>> 32) & Integer.MAX_VALUE);
		}
		if (local61 == 23) {
			Static193.aClass1_Sub26_Sub1_2.method3000(30);
			Static193.aClass1_Sub26_Sub1_2.method2951(local53);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static193.aClass1_Sub26_Sub1_2.method2988(local57);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 17 && Static141.method2355(local57, local76, local53)) {
			Static193.aClass1_Sub26_Sub1_2.method3000(228);
			Static193.aClass1_Sub26_Sub1_2.method2963(local57 + Static36.anInt764);
			Static193.aClass1_Sub26_Sub1_2.method2966(Integer.MAX_VALUE & (int) (local76 >>> 32));
			Static193.aClass1_Sub26_Sub1_2.method2949(Static152.anInt3377 + local53);
			Static193.aClass1_Sub26_Sub1_2.method2934(Static123.anInt2677);
			Static193.aClass1_Sub26_Sub1_2.method2988(Static153.anInt3386);
		}
		if (local61 == 31) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static217.anInt4746 = 2;
				Static163.anInt3549 = Static20.anInt2218;
				Static193.aClass1_Sub26_Sub1_2.method3000(251);
				Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			}
		}
		if (local61 == 41) {
			Static193.aClass1_Sub26_Sub1_2.method3000(128);
			Static193.aClass1_Sub26_Sub1_2.method2934(local53);
			Static193.aClass1_Sub26_Sub1_2.method2963(local57);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		@Pc(2043) int local2043;
		if (local61 == 9) {
			Static193.aClass1_Sub26_Sub1_2.method3000(3);
			Static193.aClass1_Sub26_Sub1_2.method2973(local53);
			local545 = Static13.method333(local53);
			if (local545.anIntArrayArray32 != null && local545.anIntArrayArray32[0][0] == 5) {
				local2043 = local545.anIntArrayArray32[0][1];
				Static141.anIntArray267[local2043] = 1 - Static141.anIntArray267[local2043];
				Static126.method2109(local2043);
			}
		}
		if (local61 == 28) {
			Static141.method2355(local57, local76, local53);
			Static193.aClass1_Sub26_Sub1_2.method3000(103);
			Static193.aClass1_Sub26_Sub1_2.method2949(local53 + Static152.anInt3377);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2949((int) (local76 >>> 32) & Integer.MAX_VALUE);
		}
		if (local61 == 57) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static217.anInt4746 = 2;
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static163.anInt3549 = Static20.anInt2218;
				Static193.aClass1_Sub26_Sub1_2.method3000(96);
				Static193.aClass1_Sub26_Sub1_2.method2963(local66);
				Static193.aClass1_Sub26_Sub1_2.method2963(Static153.anInt3386);
				Static193.aClass1_Sub26_Sub1_2.method2934(Static123.anInt2677);
			}
		}
		if (local61 == 48) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static163.anInt3549 = Static20.anInt2218;
				Static118.anInt2619 = Static161.anInt3533;
				Static217.anInt4746 = 2;
				Static228.anInt4955 = 0;
				Static193.aClass1_Sub26_Sub1_2.method3000(137);
				Static193.aClass1_Sub26_Sub1_2.method2988(local66);
				Static193.aClass1_Sub26_Sub1_2.method2988(Static153.anInt3386);
				Static193.aClass1_Sub26_Sub1_2.method2934(Static123.anInt2677);
			}
		}
		if (local61 == 4) {
			Static193.aClass1_Sub26_Sub1_2.method3000(19);
			Static193.aClass1_Sub26_Sub1_2.method2994(local53);
			Static193.aClass1_Sub26_Sub1_2.method2963(local57);
			Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 40 && Static184.aClass86_14 == null) {
			Static185.method3678(local53, local57);
			Static184.aClass86_14 = Static11.method314(local53, local57);
			Static16.method354(Static184.aClass86_14);
		}
		if (local61 == 7) {
			Static193.aClass1_Sub26_Sub1_2.method3000(3);
			Static193.aClass1_Sub26_Sub1_2.method2973(local53);
			local545 = Static13.method333(local53);
			if (local545.anIntArrayArray32 != null && local545.anIntArrayArray32[0][0] == 5) {
				local2043 = local545.anIntArrayArray32[0][1];
				if (local545.anIntArray288[0] != Static141.anIntArray267[local2043]) {
					Static141.anIntArray267[local2043] = local545.anIntArray288[0];
					Static126.method2109(local2043);
				}
			}
		}
		if (local61 == 33 || local61 == 1001) {
			Static104.method2406(local66, Static168.aClass107Array21[arg0], local57, local53);
		}
		if (local61 == 1) {
			local83 = Static33.aClass5_Sub5_Sub2Array1[local66];
			if (local83 != null) {
				Static119.method2054(0, local83.anIntArray256[0], 1, local83.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static217.anInt4746 = 2;
				Static163.anInt3549 = Static20.anInt2218;
				Static193.aClass1_Sub26_Sub1_2.method3000(205);
				Static193.aClass1_Sub26_Sub1_2.method2963(local66);
			}
		}
		if (local61 == 30) {
			Static193.aClass1_Sub26_Sub1_2.method3000(100);
			Static193.aClass1_Sub26_Sub1_2.method2966(local57);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static193.aClass1_Sub26_Sub1_2.method2994(local53);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 51) {
			Static193.aClass1_Sub26_Sub1_2.method3000(186);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static193.aClass1_Sub26_Sub1_2.method2994(local53);
			Static193.aClass1_Sub26_Sub1_2.method2949(local57);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 1005) {
			Static217.anInt4746 = 2;
			Static118.anInt2619 = Static161.anInt3533;
			Static228.anInt4955 = 0;
			Static163.anInt3549 = Static20.anInt2218;
			Static193.aClass1_Sub26_Sub1_2.method3000(7);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
		}
		if (local61 == 22) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static118.anInt2619 = Static161.anInt3533;
				Static163.anInt3549 = Static20.anInt2218;
				Static228.anInt4955 = 0;
				Static217.anInt4746 = 2;
				Static193.aClass1_Sub26_Sub1_2.method3000(81);
				Static193.aClass1_Sub26_Sub1_2.method2966(local66);
			}
		}
		if (local61 == 39) {
			Static193.aClass1_Sub26_Sub1_2.method3000(165);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static193.aClass1_Sub26_Sub1_2.method2934(local53);
			Static193.aClass1_Sub26_Sub1_2.method2973(Static123.anInt2677);
			Static193.aClass1_Sub26_Sub1_2.method2988(local57);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static153.anInt3386);
			Static157.anInt3441 = 0;
			Static213.aClass86_15 = Static13.method333(local53);
			Static227.anInt4919 = local57;
		}
		if (local61 == 6) {
			Static141.method2355(local57, local76, local53);
			Static193.aClass1_Sub26_Sub1_2.method3000(173);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2949((int) (local76 >>> 32) & Integer.MAX_VALUE);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static152.anInt3377 + local53);
		}
		if (local61 == 49) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static163.anInt3549 = Static20.anInt2218;
				Static217.anInt4746 = 2;
				Static228.anInt4955 = 0;
				Static118.anInt2619 = Static161.anInt3533;
				Static193.aClass1_Sub26_Sub1_2.method3000(73);
				Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			}
		}
		if (local61 == 50) {
			local380 = Static119.method2054(0, local53, 0, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 0, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			if (!local380) {
				Static119.method2054(0, local53, 1, local57, Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
			}
			Static118.anInt2619 = Static161.anInt3533;
			Static228.anInt4955 = 0;
			Static217.anInt4746 = 2;
			Static163.anInt3549 = Static20.anInt2218;
			Static193.aClass1_Sub26_Sub1_2.method3000(111);
			Static193.aClass1_Sub26_Sub1_2.method2949(local53 + Static152.anInt3377);
			Static193.aClass1_Sub26_Sub1_2.method2963(local57 + Static36.anInt764);
			Static193.aClass1_Sub26_Sub1_2.method2988(local66);
			Static193.aClass1_Sub26_Sub1_2.method2973(Static123.anInt2677);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static153.anInt3386);
		}
		if (local61 == 43 && Static141.method2355(local57, local76, local53)) {
			Static193.aClass1_Sub26_Sub1_2.method3000(154);
			Static193.aClass1_Sub26_Sub1_2.method2966(Static36.anInt764 + local57);
			Static193.aClass1_Sub26_Sub1_2.method2963((int) (local76 >>> 32) & Integer.MAX_VALUE);
			Static193.aClass1_Sub26_Sub1_2.method2934(Static218.anInt4759);
			Static193.aClass1_Sub26_Sub1_2.method2949(Static49.anInt1274);
			Static193.aClass1_Sub26_Sub1_2.method2949(local53 + Static152.anInt3377);
			Static193.aClass1_Sub26_Sub1_2.method2963(Static70.anInt1591);
		}
		if (local61 == 15) {
			local178 = Static198.aClass5_Sub5_Sub1Array1[local66];
			if (local178 != null) {
				Static119.method2054(0, local178.anIntArray256[0], 1, local178.anIntArray260[0], Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], 0, false, 1, 0, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0], 2);
				Static118.anInt2619 = Static161.anInt3533;
				Static228.anInt4955 = 0;
				Static163.anInt3549 = Static20.anInt2218;
				Static217.anInt4746 = 2;
				Static193.aClass1_Sub26_Sub1_2.method3000(176);
				Static193.aClass1_Sub26_Sub1_2.method2949(local66);
			}
		}
		if (Static167.anInt3590 != 0) {
			Static167.anInt3590 = 0;
			Static16.method354(Static13.method333(Static218.anInt4759));
		}
		if (Static56.aBoolean124) {
			Static128.method2152();
		}
		if (Static213.aClass86_15 != null && Static157.anInt3441 == 0) {
			Static16.method354(Static213.aClass86_15);
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lclient!sc;I)I")
	public static int method2986(@OriginalArg(0) Class107 arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static231.anInt4994; local11++) {
			if (arg0.method3096(Static178.aClass107Array23[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
