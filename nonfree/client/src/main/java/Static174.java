import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "Lclient!bd;")
	public static final Class10 aClass10_97 = new Class10();

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1701 = Static193.method3027(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ce;B)Lclient!lb;")
	public static Class30_Sub2 method2692(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class30_Sub2(arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1267(), arg0.method1271(), arg0.method1271(), arg0.method1278());
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(B)V")
	public static void method2694() {
		for (@Pc(1) int local1 = 0; local1 < Static134.anInt2682; local1++) {
			@Pc(6) int local6 = Static108.anIntArray130[local1];
			@Pc(10) Class26_Sub2_Sub2 local10 = Static8.aClass26_Sub2_Sub2Array1[local6];
			@Pc(16) int local16 = Static48.aClass3_Sub4_Sub1_43.method1278();
			@Pc(27) int local27;
			@Pc(31) int local31;
			if ((local16 & 0x40) != 0) {
				local27 = Static48.aClass3_Sub4_Sub1_43.method1243();
				local31 = Static48.aClass3_Sub4_Sub1_43.method1286();
				local10.method1857(Static184.anInt3760, local27, local31);
				local10.anInt2626 = Static184.anInt3760 + 300;
				local10.anInt2627 = Static48.aClass3_Sub4_Sub1_43.method1286();
			}
			if ((local16 & 0x80) != 0) {
				local10.anInt2620 = Static48.aClass3_Sub4_Sub1_43.method1280();
				if (local10.anInt2620 == 65535) {
					local10.anInt2620 = -1;
				}
			}
			if ((local16 & 0x4) != 0) {
				local10.aClass70_1235 = Static48.aClass3_Sub4_Sub1_43.method1246();
				local10.anInt2632 = 100;
			}
			if ((local16 & 0x10) != 0) {
				local27 = Static48.aClass3_Sub4_Sub1_43.method1270();
				local31 = Static48.aClass3_Sub4_Sub1_43.method1243();
				if (local27 == 65535) {
					local27 = -1;
				}
				if (local27 == local10.anInt2599 && local27 != -1) {
					@Pc(169) Class3_Sub3_Sub17 local169 = Static11.method254(local27);
					@Pc(172) int local172 = local169.anInt2737;
					if (local172 == 1) {
						local10.anInt2621 = 0;
						local10.anInt2606 = 0;
						local10.anInt2610 = local31;
						local10.anInt2641 = 0;
						Static126.method1760(local10.anInt2621, local169, false, local10.anInt2611, local10.anInt2593);
					}
					if (local172 == 2) {
						local10.anInt2641 = 0;
					}
				} else if (local27 == -1 || local10.anInt2599 == -1 || Static11.method254(local27).anInt2750 >= Static11.method254(local10.anInt2599).anInt2750) {
					local10.anInt2642 = local10.anInt2635;
					local10.anInt2641 = 0;
					local10.anInt2606 = 0;
					local10.anInt2599 = local27;
					local10.anInt2610 = local31;
					local10.anInt2621 = 0;
					if (local10.anInt2599 != -1) {
						Static126.method1760(local10.anInt2621, Static11.method254(local10.anInt2599), false, local10.anInt2611, local10.anInt2593);
					}
				}
			}
			if ((local16 & 0x8) != 0) {
				local10.anInt2622 = Static48.aClass3_Sub4_Sub1_43.method1295();
				local10.anInt2631 = Static48.aClass3_Sub4_Sub1_43.method1295();
			}
			if ((local16 & 0x1) != 0) {
				local10.anInt2608 = Static48.aClass3_Sub4_Sub1_43.method1257();
				local27 = Static48.aClass3_Sub4_Sub1_43.method1242();
				local10.anInt2589 = local27 >> 16;
				local10.anInt2614 = (local27 & 0xFFFF) + Static184.anInt3760;
				if (local10.anInt2608 == 65535) {
					local10.anInt2608 = -1;
				}
				local10.anInt2612 = 0;
				local10.anInt2592 = 0;
				if (local10.anInt2614 > Static184.anInt3760) {
					local10.anInt2592 = -1;
				}
			}
			if ((local16 & 0x20) != 0) {
				local27 = Static48.aClass3_Sub4_Sub1_43.method1278();
				local31 = Static48.aClass3_Sub4_Sub1_43.method1286();
				local10.method1857(Static184.anInt3760, local27, local31);
			}
			if ((local16 & 0x2) != 0) {
				local10.aClass3_Sub3_Sub24_1 = Static37.method2344(Static48.aClass3_Sub4_Sub1_43.method1280());
				local10.anInt2616 = local10.aClass3_Sub3_Sub24_1.anInt3956;
				local10.anInt2603 = local10.aClass3_Sub3_Sub24_1.anInt3960;
				local10.anInt2609 = local10.aClass3_Sub3_Sub24_1.anInt3962;
				local10.anInt2590 = local10.aClass3_Sub3_Sub24_1.anInt3972;
				local10.anInt2604 = local10.aClass3_Sub3_Sub24_1.anInt3954;
				local10.anInt2625 = local10.aClass3_Sub3_Sub24_1.anInt3964;
				local10.anInt2594 = local10.aClass3_Sub3_Sub24_1.anInt3966;
				local10.anInt2617 = local10.aClass3_Sub3_Sub24_1.anInt3968;
				local10.anInt2633 = local10.aClass3_Sub3_Sub24_1.anInt3953;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method2695(@OriginalArg(1) Class70 arg0) {
		@Pc(7) Class3_Sub1 local7 = Static160.method2408(arg0);
		if (local7 == null) {
			return;
		}
		Static54.anInt1162 = Static50.anInt1046 + Static115.anInt2318 - local7.anInt24;
		Static136.anInt2777 = local7.anInt26 - Static157.anInt3260;
		@Pc(33) int local33 = Static136.anInt2777 - (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115);
		@Pc(42) int local42 = (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115) + Static136.anInt2777;
		if (local33 < 0) {
			Static136.anInt2777 = (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115);
		}
		if (Static65.anInt1364 < local42) {
			Static136.anInt2777 = Static65.anInt1364 - (int) ((double) Static58.aClass6_35.anInt244 / Static87.aDouble115);
		}
		@Pc(84) int local84 = Static54.anInt1162 - (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
		@Pc(93) int local93 = (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115) + Static54.anInt1162;
		if (local84 < 0) {
			Static54.anInt1162 = (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
		}
		if (Static50.anInt1046 < local93) {
			Static54.anInt1162 = Static50.anInt1046 - (int) ((double) Static58.aClass6_35.anInt217 / Static87.aDouble115);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!oc;I)V")
	public static void method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class70 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class6 local8 = Static64.method982(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray3 != null) {
			@Pc(22) Class3_Sub26 local22 = new Class3_Sub26();
			local22.anObjectArray29 = local8.anObjectArray3;
			local22.aClass6_116 = local8;
			local22.anInt4143 = arg0;
			local22.aClass70_2060 = arg2;
			Static185.method2901(local22);
		}
		@Pc(42) boolean local42 = true;
		if (local8.anInt274 > 0) {
			local42 = Static65.method990(local8);
		}
		if (!local42 || !Static24.method1263(Static157.method2365(local8), arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static93.aClass3_Sub4_Sub1_18.method1298(237);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 2) {
			Static93.aClass3_Sub4_Sub1_18.method1298(203);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 3) {
			Static93.aClass3_Sub4_Sub1_18.method1298(146);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 4) {
			Static93.aClass3_Sub4_Sub1_18.method1298(67);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 5) {
			Static93.aClass3_Sub4_Sub1_18.method1298(155);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 6) {
			Static93.aClass3_Sub4_Sub1_18.method1298(0);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 7) {
			Static93.aClass3_Sub4_Sub1_18.method1298(98);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 8) {
			Static93.aClass3_Sub4_Sub1_18.method1298(240);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 9) {
			Static93.aClass3_Sub4_Sub1_18.method1298(27);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
		if (arg0 == 10) {
			Static93.aClass3_Sub4_Sub1_18.method1298(87);
			Static93.aClass3_Sub4_Sub1_18.method1285(arg1);
			Static93.aClass3_Sub4_Sub1_18.method1252(arg3);
		}
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(B)V")
	public static void method2698() {
		if (Static94.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static9.anIntArray14[223] = 28;
			Static9.anIntArray14[192] = 58;
			Static9.anIntArray14[191] = 73;
			Static9.anIntArray14[188] = 71;
			Static9.anIntArray14[221] = 43;
			Static9.anIntArray14[186] = 57;
			Static9.anIntArray14[189] = 26;
			Static9.anIntArray14[190] = 72;
			Static9.anIntArray14[187] = 27;
			Static9.anIntArray14[222] = 59;
			Static9.anIntArray14[219] = 42;
			Static9.anIntArray14[220] = 74;
			return;
		}
		Static9.anIntArray14[91] = 42;
		Static9.anIntArray14[46] = 72;
		Static9.anIntArray14[93] = 43;
		Static9.anIntArray14[47] = 73;
		Static9.anIntArray14[45] = 26;
		if (Static94.aMethod1 == null) {
			Static9.anIntArray14[222] = 59;
			Static9.anIntArray14[192] = 58;
		} else {
			Static9.anIntArray14[520] = 59;
			Static9.anIntArray14[192] = 28;
			Static9.anIntArray14[222] = 58;
		}
		Static9.anIntArray14[44] = 71;
		Static9.anIntArray14[92] = 74;
		Static9.anIntArray14[61] = 27;
		Static9.anIntArray14[59] = 57;
	}
}
