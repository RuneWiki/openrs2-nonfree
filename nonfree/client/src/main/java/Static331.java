import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "Lclient!cn;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "[Lclient!un;")
	public static Class254[] aClass254Array1;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public static int anInt5431;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(JB)V")
	public static void method4343(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static177.method2570(arg0 - 1L);
			Static177.method2570(1L);
		} else {
			Static177.method2570(arg0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZIIZJ)Ljava/lang/String;")
	public static String method4345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local24 = true;
		}
		@Pc(40) StringBuffer local40 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg0 > 0) {
			for (local47 = 0; local47 < arg0; local47++) {
				local52 = (int) arg3;
				arg3 /= 10L;
				local40.append((char) (local52 + 48 - (int) arg3 * 10));
			}
			local40.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg3;
			arg3 /= 10L;
			local40.append((char) (local52 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local24) {
					local40.append('-');
				}
				return local40.reverse().toString();
			}
			if (arg2) {
				local47++;
				if (local47 % 3 == 0) {
					local40.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!dh;ZII)V")
	public static void method4349(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static57.aClass14_3.aClass1_5 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1052;
		@Pc(18) int local18 = arg0.anInt1058;
		@Pc(21) int local21 = arg0.anInt1057;
		@Pc(25) int local25 = (int) arg0.aLong31;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong31;
		if (local21 == 2) {
			Static101.anInt1354 = arg2;
			Static40.anInt598 = 2;
			Static294.anInt4897 = arg1;
			Static344.anInt5674 = 0;
			Static178.method2589(Static460.aClass242_123);
			Static426.aClass1_Sub19_Sub2_2.method2926(Static315.anInt5207 + local15);
			Static426.aClass1_Sub19_Sub2_2.method2926(local25);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2889(Static47.anInt676 + local18);
			Static303.method4044(local18, local15);
		}
		if (local21 == 1001) {
			Static40.anInt598 = 2;
			Static294.anInt4897 = arg1;
			Static344.anInt5674 = 0;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static168.aClass242_53);
			Static426.aClass1_Sub19_Sub2_2.method2930(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static426.aClass1_Sub19_Sub2_2.method2926(local15 + Static315.anInt5207);
			Static426.aClass1_Sub19_Sub2_2.method2894(local18 + Static47.anInt676);
			Static426.aClass1_Sub19_Sub2_2.method2933(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static250.method3542(local18, local34, local15);
		}
		if (local21 == 15) {
			Static40.anInt598 = 2;
			Static294.anInt4897 = arg1;
			Static101.anInt1354 = arg2;
			Static344.anInt5674 = 0;
			Static178.method2589(Static247.aClass242_74);
			Static426.aClass1_Sub19_Sub2_2.method2894(local18 + Static47.anInt676);
			Static426.aClass1_Sub19_Sub2_2.method2930(local25);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2926(Static315.anInt5207 + local15);
			Static303.method4044(local18, local15);
		}
		@Pc(200) Class11_Sub1_Sub3_Sub2 local200;
		if (local21 == 9) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static40.anInt598 = 2;
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static294.anInt4897 = arg1;
				Static178.method2589(Static180.aClass242_48);
				Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2889(local25);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 58) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static294.anInt4897 = arg1;
				Static40.anInt598 = 2;
				Static178.method2589(Static135.aClass242_39);
				Static426.aClass1_Sub19_Sub2_2.method2894(local25);
				Static426.aClass1_Sub19_Sub2_2.method2933(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 60) {
			Static294.anInt4897 = arg1;
			Static344.anInt5674 = 0;
			Static40.anInt598 = 2;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static205.aClass242_54);
			Static426.aClass1_Sub19_Sub2_2.method2926((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2894(local18 + Static47.anInt676);
			Static426.aClass1_Sub19_Sub2_2.method2894(local15 + Static315.anInt5207);
			Static250.method3542(local18, local34, local15);
		}
		@Pc(392) Class11_Sub1_Sub3_Sub1 local392;
		@Pc(381) Class1_Sub44 local381;
		if (local21 == 3) {
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				Static344.anInt5674 = 0;
				Static294.anInt4897 = arg1;
				Static101.anInt1354 = arg2;
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				Static40.anInt598 = 2;
				Static178.method2589(Static191.aClass242_52);
				Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2894(local25);
				Static224.method3210(-2, local392.method2635(), true, 0, 0, local392.anIntArray247[0], local392.method2635(), local392.anIntArray246[0]);
			}
		}
		if (local21 == 22) {
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				Static101.anInt1354 = arg2;
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				Static40.anInt598 = 2;
				Static344.anInt5674 = 0;
				Static294.anInt4897 = arg1;
				Static178.method2589(Static392.aClass242_105);
				Static426.aClass1_Sub19_Sub2_2.method2889(local25);
				Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static224.method3210(-2, local392.method2635(), true, 0, 0, local392.anIntArray247[0], local392.method2635(), local392.anIntArray246[0]);
			}
		}
		if (local21 == 6) {
			if (Static435.anInt6026 > 0 && Static269.aClass53_1.method3910(82) && Static269.aClass53_1.method3910(81)) {
				Static290.method3881(Static47.anInt676 + local18, local15 + Static315.anInt5207, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90);
			} else {
				Static334.method4388(local18, local25, local15);
				if (local25 == 1) {
					Static426.aClass1_Sub19_Sub2_2.method2934(-1);
					Static426.aClass1_Sub19_Sub2_2.method2934(-1);
					Static426.aClass1_Sub19_Sub2_2.method2930((int) Static99.aFloat9);
					Static426.aClass1_Sub19_Sub2_2.method2934(57);
					Static426.aClass1_Sub19_Sub2_2.method2934(Static20.anInt301);
					Static426.aClass1_Sub19_Sub2_2.method2934(Static265.anInt4616);
					Static426.aClass1_Sub19_Sub2_2.method2934(89);
					Static426.aClass1_Sub19_Sub2_2.method2930(Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428);
					Static426.aClass1_Sub19_Sub2_2.method2930(Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430);
					Static426.aClass1_Sub19_Sub2_2.method2934(63);
				} else {
					Static40.anInt598 = 1;
					Static294.anInt4897 = arg1;
					Static101.anInt1354 = arg2;
					Static344.anInt5674 = 0;
				}
				Static224.method3210(-4, 1, true, 0, 0, local18, 1, local15);
			}
		}
		if (local21 == 57) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static344.anInt5674 = 0;
				Static294.anInt4897 = arg1;
				Static40.anInt598 = 2;
				Static101.anInt1354 = arg2;
				Static178.method2589(Static30.aClass242_7);
				Static426.aClass1_Sub19_Sub2_2.method2930(local25);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 51 && Static414.aClass107_15 == null) {
			Static134.method1706(local18, local15);
			Static414.aClass107_15 = Static220.method3163(local15, local18);
			Static260.method3633(Static414.aClass107_15);
		}
		if (local21 == 19) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static40.anInt598 = 2;
				Static294.anInt4897 = arg1;
				Static101.anInt1354 = arg2;
				Static344.anInt5674 = 0;
				Static178.method2589(Static398.aClass242_109);
				Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2894(local25);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 46) {
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				Static294.anInt4897 = arg1;
				Static40.anInt598 = 2;
				Static101.anInt1354 = arg2;
				Static344.anInt5674 = 0;
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				Static178.method2589(Static454.aClass242_121);
				Static426.aClass1_Sub19_Sub2_2.method2930(Static2.anInt29);
				Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2926(local25);
				Static426.aClass1_Sub19_Sub2_2.method2926(Static403.anInt6355);
				Static426.aClass1_Sub19_Sub2_2.method2887(Static276.anInt4734);
				Static224.method3210(-2, local392.method2635(), true, 0, 0, local392.anIntArray247[0], local392.method2635(), local392.anIntArray246[0]);
			}
		}
		if (local21 == 23) {
			Static344.anInt5674 = 0;
			Static40.anInt598 = 1;
			Static294.anInt4897 = arg1;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static298.aClass242_80);
			Static426.aClass1_Sub19_Sub2_2.method2889(Static2.anInt29);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static47.anInt676 + local18);
			Static426.aClass1_Sub19_Sub2_2.method2894(local15 + Static315.anInt5207);
			Static426.aClass1_Sub19_Sub2_2.method2885(Static276.anInt4734);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static403.anInt6355);
			Static224.method3210(-4, 1, true, 0, 0, local18, 1, local15);
		}
		if (local21 == 50) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static294.anInt4897 = arg1;
				Static40.anInt598 = 2;
				Static178.method2589(Static188.aClass242_51);
				Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2930(local25);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 13) {
			Static294.anInt4897 = arg1;
			Static344.anInt5674 = 0;
			Static101.anInt1354 = arg2;
			Static40.anInt598 = 2;
			Static178.method2589(Static225.aClass242_62);
			Static426.aClass1_Sub19_Sub2_2.method2930(local25);
			Static426.aClass1_Sub19_Sub2_2.method2930(local15 + Static315.anInt5207);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2894(Static47.anInt676 + local18);
			Static303.method4044(local18, local15);
		}
		if (local21 == 44) {
			Static294.anInt4897 = arg1;
			Static101.anInt1354 = arg2;
			Static40.anInt598 = 2;
			Static344.anInt5674 = 0;
			Static178.method2589(Static29.aClass242_6);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3279);
			Static426.aClass1_Sub19_Sub2_2.method2894(Static2.anInt29);
			Static426.aClass1_Sub19_Sub2_2.method2894(Static403.anInt6355);
			Static426.aClass1_Sub19_Sub2_2.method2885(Static276.anInt4734);
		}
		if (local21 == 1006) {
			Static101.anInt1354 = arg2;
			Static344.anInt5674 = 0;
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static178.method2589(Static111.aClass242_32);
			Static426.aClass1_Sub19_Sub2_2.method2930(local25);
		}
		if (local21 == 59) {
			Static101.anInt1354 = arg2;
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static344.anInt5674 = 0;
			Static178.method2589(Static32.aClass242_8);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static47.anInt676 + local18);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static315.anInt5207 + local15);
			Static426.aClass1_Sub19_Sub2_2.method2930(local25);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static303.method4044(local18, local15);
		}
		if (local21 == 1008 || local21 == 1003 || local21 == 1012 || local21 == 1011 || local21 == 1007) {
			Static240.method3455(local21, local25, local15);
		}
		if (local21 == 1002) {
			Static101.anInt1354 = arg2;
			Static344.anInt5674 = 0;
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static178.method2589(Static51.aClass242_13);
			Static426.aClass1_Sub19_Sub2_2.method2930(local25);
		}
		if (local21 == 16) {
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				Static344.anInt5674 = 0;
				Static40.anInt598 = 2;
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				Static101.anInt1354 = arg2;
				Static294.anInt4897 = arg1;
				Static178.method2589(Static413.aClass242_112);
				Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2926(local25);
				Static224.method3210(-2, local392.method2635(), true, 0, 0, local392.anIntArray247[0], local392.method2635(), local392.anIntArray246[0]);
			}
		}
		if (local21 == 47) {
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static344.anInt5674 = 0;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static439.aClass242_117);
			Static426.aClass1_Sub19_Sub2_2.method2889(local15 + Static315.anInt5207);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static47.anInt676 + local18);
			Static426.aClass1_Sub19_Sub2_2.method2887(Static276.anInt4734);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static403.anInt6355);
			Static426.aClass1_Sub19_Sub2_2.method2894(local25);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static2.anInt29);
			Static303.method4044(local18, local15);
		}
		if (local21 == 20 || local21 == 1004) {
			Static265.method3661(arg0.aString9, local25, local18, local15);
		}
		if (local21 == 8) {
			Static344.anInt5674 = 0;
			Static294.anInt4897 = arg1;
			Static101.anInt1354 = arg2;
			Static40.anInt598 = 2;
			Static178.method2589(Static252.aClass242_75);
			Static426.aClass1_Sub19_Sub2_2.method2926(Static403.anInt6355);
			Static426.aClass1_Sub19_Sub2_2.method2885(Static276.anInt4734);
			Static426.aClass1_Sub19_Sub2_2.method2926(Static47.anInt676 + local18);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2926(local15 + Static315.anInt5207);
			Static426.aClass1_Sub19_Sub2_2.method2926((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static2.anInt29);
			Static250.method3542(local18, local34, local15);
		}
		@Pc(1387) Class107 local1387;
		if (local21 == 11) {
			local1387 = Static220.method3163(local15, local18);
			if (local1387 != null) {
				Static403.method5125();
				@Pc(1394) Class1_Sub27 local1394 = Static55.method767(local1387);
				Static305.method4063(local1387, local1394.anInt3884, local1394.method3034());
				Static28.aString5 = Static210.method5855(local1387);
				if (Static28.aString5 == null) {
					Static28.aString5 = "Null";
				}
				Static392.aString62 = local1387.aString23 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 5) {
			if (Static435.anInt6026 > 0 && Static269.aClass53_1.method3910(82) && Static269.aClass53_1.method3910(81)) {
				Static290.method3881(local18 + Static47.anInt676, Static315.anInt5207 + local15, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90);
			} else {
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static294.anInt4897 = arg1;
				Static40.anInt598 = 1;
				Static178.method2589(Static342.aClass242_93);
				Static426.aClass1_Sub19_Sub2_2.method2894(Static47.anInt676 + local18);
				Static426.aClass1_Sub19_Sub2_2.method2930(Static315.anInt5207 + local15);
			}
		}
		if (local21 == 30) {
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				Static40.anInt598 = 2;
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				Static101.anInt1354 = arg2;
				Static344.anInt5674 = 0;
				Static294.anInt4897 = arg1;
				Static178.method2589(Static232.aClass242_65);
				Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2889(local25);
				Static224.method3210(-2, local392.method2635(), true, 0, 0, local392.anIntArray247[0], local392.method2635(), local392.anIntArray246[0]);
			}
		}
		if (local21 == 25) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static40.anInt598 = 2;
				Static294.anInt4897 = arg1;
				Static178.method2589(Static39.aClass242_9);
				Static426.aClass1_Sub19_Sub2_2.method2894(local25);
				Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 1009) {
			Static101.anInt1354 = arg2;
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static344.anInt5674 = 0;
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				@Pc(1637) Class272 local1637 = local392.aClass272_1;
				if (local1637.anIntArray543 != null) {
					local1637 = local1637.method5900(Static32.aClass4_1);
				}
				if (local1637 != null) {
					Static178.method2589(Static24.aClass242_3);
					Static426.aClass1_Sub19_Sub2_2.method2930(local1637.anInt7325);
				}
			}
		}
		if (local21 == 12) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static40.anInt598 = 2;
				Static294.anInt4897 = arg1;
				Static178.method2589(Static29.aClass242_6);
				Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2930(local25);
				Static426.aClass1_Sub19_Sub2_2.method2894(Static2.anInt29);
				Static426.aClass1_Sub19_Sub2_2.method2894(Static403.anInt6355);
				Static426.aClass1_Sub19_Sub2_2.method2885(Static276.anInt4734);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 49) {
			Static40.anInt598 = 2;
			Static344.anInt5674 = 0;
			Static294.anInt4897 = arg1;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static324.aClass242_86);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static47.anInt676 + local18);
			Static426.aClass1_Sub19_Sub2_2.method2894(local25);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2894(local15 + Static315.anInt5207);
			Static303.method4044(local18, local15);
		}
		if (local21 == 18) {
			Static344.anInt5674 = 0;
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static74.aClass242_59);
			Static426.aClass1_Sub19_Sub2_2.method2894((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2926(local18 + Static47.anInt676);
			Static426.aClass1_Sub19_Sub2_2.method2894(Static315.anInt5207 + local15);
			Static250.method3542(local18, local34, local15);
		}
		if (local21 == 10) {
			local1387 = Static220.method3163(local15, local18);
			if (local1387 != null) {
				Static451.method5818(local1387);
			}
		}
		if (local21 == 48) {
			local381 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local25);
			if (local381 != null) {
				Static101.anInt1354 = arg2;
				local392 = local381.aClass11_Sub1_Sub3_Sub1_2;
				Static40.anInt598 = 2;
				Static294.anInt4897 = arg1;
				Static344.anInt5674 = 0;
				Static178.method2589(Static432.aClass242_115);
				Static426.aClass1_Sub19_Sub2_2.method2898(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2889(local25);
				Static224.method3210(-2, local392.method2635(), true, 0, 0, local392.anIntArray247[0], local392.method2635(), local392.anIntArray246[0]);
			}
		}
		if (local21 == 45) {
			Static40.anInt598 = 2;
			Static101.anInt1354 = arg2;
			Static294.anInt4897 = arg1;
			Static344.anInt5674 = 0;
			Static178.method2589(Static208.aClass242_55);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static315.anInt5207 + local15);
			Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2930((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static426.aClass1_Sub19_Sub2_2.method2930(Static47.anInt676 + local18);
			Static250.method3542(local18, local34, local15);
		}
		if (local21 == 21) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static294.anInt4897 = arg1;
				Static344.anInt5674 = 0;
				Static101.anInt1354 = arg2;
				Static40.anInt598 = 2;
				Static178.method2589(Static68.aClass242_18);
				Static426.aClass1_Sub19_Sub2_2.method2894(local25);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 17) {
			local200 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local25];
			if (local200 != null) {
				Static101.anInt1354 = arg2;
				Static40.anInt598 = 2;
				Static294.anInt4897 = arg1;
				Static344.anInt5674 = 0;
				Static178.method2589(Static324.aClass242_85);
				Static426.aClass1_Sub19_Sub2_2.method2879(Static269.aClass53_1.method3910(82) ? 1 : 0);
				Static426.aClass1_Sub19_Sub2_2.method2894(local25);
				Static224.method3210(-2, local200.method2635(), true, 0, 0, local200.anIntArray247[0], local200.method2635(), local200.anIntArray246[0]);
			}
		}
		if (local21 == 4) {
			Static344.anInt5674 = 0;
			Static294.anInt4897 = arg1;
			Static40.anInt598 = 2;
			Static101.anInt1354 = arg2;
			Static178.method2589(Static319.aClass242_84);
			Static426.aClass1_Sub19_Sub2_2.method2894(local18 + Static47.anInt676);
			Static426.aClass1_Sub19_Sub2_2.method2934(Static269.aClass53_1.method3910(82) ? 1 : 0);
			Static426.aClass1_Sub19_Sub2_2.method2926(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static426.aClass1_Sub19_Sub2_2.method2894(Static315.anInt5207 + local15);
			Static250.method3542(local18, local34, local15);
		}
		if (Static290.aBoolean449) {
			Static403.method5125();
		}
		if (Static184.aClass107_8 != null && Static83.anInt1148 == 0) {
			Static260.method3633(Static184.aClass107_8);
		}
	}
}
