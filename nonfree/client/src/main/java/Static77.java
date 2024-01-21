import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!mf", name = "Lb", descriptor = "I")
	public static int anInt1676;

	@OriginalMember(owner = "client!mf", name = "kb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_805 = Static78.method1313("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_806 = Static78.method1313("Handel akzeptieren");

	@OriginalMember(owner = "client!mf", name = "Gb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_809 = Static78.method1313("shake:");

	@OriginalMember(owner = "client!mf", name = "ub", descriptor = "Lclient!fc;")
	public static Class25 aClass25_807 = aClass25_809;

	@OriginalMember(owner = "client!mf", name = "Fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_808 = aClass25_809;

	@OriginalMember(owner = "client!mf", name = "Hb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_810 = Static78.method1313("@cr1@");

	@OriginalMember(owner = "client!mf", name = "Ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_811 = Static78.method1313("welle:");

	@OriginalMember(owner = "client!mf", name = "Kb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_812 = Static78.method1313("sl_back");

	@OriginalMember(owner = "client!mf", name = "Mb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_813 = Static78.method1313("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(BI)Lclient!fb;")
	public static Class1_Sub2_Sub8 method1289(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub8 local10 = (Class1_Sub2_Sub8) Static119.aClass63_25.method1517((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static90.aClass56_61.method1269(16, arg0);
		local10 = new Class1_Sub2_Sub8();
		if (local20 != null) {
			local10.method757(new Class1_Sub5(local20));
		}
		Static119.aClass63_25.method1520(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method1290() {
		aClass25_812 = null;
		aClass25_807 = null;
		aClass25_805 = null;
		aClass25_813 = null;
		aClass25_810 = null;
		aClass25_806 = null;
		aClass25_809 = null;
		aClass25_811 = null;
		aClass25_808 = null;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(ZI)V")
	public static void method1292(@OriginalArg(0) boolean arg0) {
		Static6.aBoolean3 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(70) int local70;
		@Pc(115) int local115;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(154) int local154;
		if (!Static6.aBoolean3) {
			local18 = Static35.aClass1_Sub5_Sub1_1.method670();
			local22 = Static35.aClass1_Sub5_Sub1_1.method670();
			local30 = (Static110.anInt2558 - Static35.aClass1_Sub5_Sub1_1.anInt792) / 16;
			Static127.anIntArrayArray30 = new int[local30][4];
			for (local36 = 0; local36 < local30; local36++) {
				for (local40 = 0; local40 < 4; local40++) {
					Static127.anIntArrayArray30[local36][local40] = Static35.aClass1_Sub5_Sub1_1.method661();
				}
			}
			local40 = Static35.aClass1_Sub5_Sub1_1.method670();
			local70 = Static35.aClass1_Sub5_Sub1_1.method670();
			@Pc(72) boolean local72 = false;
			if ((local22 / 8 == 48 || local22 / 8 == 49) && (local40 / 8) == 48) {
				local72 = true;
			}
			if (local22 / 8 == 48 && local40 / 8 == 148) {
				local72 = true;
			}
			local115 = Static35.aClass1_Sub5_Sub1_1.method630();
			Static14.anIntArray78 = new int[local30];
			Static123.aByteArrayArray9 = new byte[local30][];
			Static8.anIntArray43 = new int[local30];
			Static50.anIntArray244 = new int[local30];
			Static105.aByteArrayArray8 = new byte[local30][];
			local30 = 0;
			for (local138 = (local22 - 6) / 8; local138 <= (local22 + 6) / 8; local138++) {
				for (local146 = (local40 - 6) / 8; local146 <= (local40 + 6) / 8; local146++) {
					local154 = (local138 << 8) + local146;
					if (!local72 || local146 != 49 && local146 != 149 && local146 != 147 && local138 != 50 && (local138 != 49 || local146 != 47)) {
						Static8.anIntArray43[local30] = local154;
						Static50.anIntArray244[local30] = Static18.aClass56_Sub1_2.method1278(Static116.method1859(new Class25[] { Static61.aClass25_616, Static74.method1214(local138), Static116.aClass25_1302, Static74.method1214(local146) }));
						Static14.anIntArray78[local30] = Static18.aClass56_Sub1_2.method1278(Static116.method1859(new Class25[] { Static47.aClass25_504, Static74.method1214(local138), Static116.aClass25_1302, Static74.method1214(local146) }));
						local30++;
					}
				}
			}
			Static25.method588(local115, local22, local40, local70, local18);
			return;
		}
		Static35.aClass1_Sub5_Sub1_1.method685();
		for (local18 = 0; local18 < 4; local18++) {
			for (local22 = 0; local22 < 13; local22++) {
				for (local30 = 0; local30 < 13; local30++) {
					local36 = Static35.aClass1_Sub5_Sub1_1.method691(1);
					if (local36 == 1) {
						Static7.anIntArrayArrayArray4[local18][local22][local30] = Static35.aClass1_Sub5_Sub1_1.method691(26);
					} else {
						Static7.anIntArrayArrayArray4[local18][local22][local30] = -1;
					}
				}
			}
		}
		Static35.aClass1_Sub5_Sub1_1.method690();
		local22 = (Static110.anInt2558 - Static35.aClass1_Sub5_Sub1_1.anInt792) / 16;
		Static127.anIntArrayArray30 = new int[local22][4];
		for (local30 = 0; local30 < local22; local30++) {
			for (local36 = 0; local36 < 4; local36++) {
				Static127.anIntArrayArray30[local30][local36] = Static35.aClass1_Sub5_Sub1_1.method657();
			}
		}
		local36 = Static35.aClass1_Sub5_Sub1_1.method671();
		local40 = Static35.aClass1_Sub5_Sub1_1.method670();
		local70 = Static35.aClass1_Sub5_Sub1_1.method642();
		local115 = Static35.aClass1_Sub5_Sub1_1.method651();
		@Pc(408) int local408 = Static35.aClass1_Sub5_Sub1_1.method651();
		Static105.aByteArrayArray8 = new byte[local22][];
		Static8.anIntArray43 = new int[local22];
		Static123.aByteArrayArray9 = new byte[local22][];
		Static14.anIntArray78 = new int[local22];
		Static50.anIntArray244 = new int[local22];
		local22 = 0;
		for (local138 = 0; local138 < 4; local138++) {
			for (local146 = 0; local146 < 13; local146++) {
				for (local154 = 0; local154 < 13; local154++) {
					@Pc(445) int local445 = Static7.anIntArrayArrayArray4[local138][local146][local154];
					if (local445 != -1) {
						@Pc(455) int local455 = local445 >> 14 & 0x3FF;
						@Pc(461) int local461 = local445 >> 3 & 0x7FF;
						@Pc(471) int local471 = local461 / 8 + (local455 / 8 << 8);
						for (@Pc(473) int local473 = 0; local473 < local22; local473++) {
							if (local471 == Static8.anIntArray43[local473]) {
								local471 = -1;
								break;
							}
						}
						if (local471 != -1) {
							Static8.anIntArray43[local22] = local471;
							@Pc(506) int local506 = local471 >> 8 & 0xFF;
							@Pc(510) int local510 = local471 & 0xFF;
							Static50.anIntArray244[local22] = Static18.aClass56_Sub1_2.method1278(Static116.method1859(new Class25[] { Static61.aClass25_616, Static74.method1214(local506), Static116.aClass25_1302, Static74.method1214(local510) }));
							Static14.anIntArray78[local22] = Static18.aClass56_Sub1_2.method1278(Static116.method1859(new Class25[] { Static47.aClass25_504, Static74.method1214(local506), Static116.aClass25_1302, Static74.method1214(local510) }));
							local22++;
						}
					}
				}
			}
		}
		Static25.method588(local36, local115, local408, local40, local70);
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(BI)V")
	public static void method1294(@OriginalArg(1) int arg0) {
		if (!Static57.method1727(arg0)) {
			return;
		}
		@Pc(14) Class1_Sub2_Sub14[] local14 = Static56.aClass1_Sub2_Sub14ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class1_Sub2_Sub14 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt1940 = 0;
				local27.anInt1929 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(ZI)V")
	public static void method1295(@OriginalArg(0) boolean arg0) {
		if (Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832 >> 7 == Static62.anInt1391 && Static110.anInt2547 == Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827 >> 7) {
			Static62.anInt1391 = 0;
		}
		@Pc(25) int local25 = Static96.anInt2797;
		if (arg0) {
			local25 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			@Pc(37) Class1_Sub2_Sub3_Sub4_Sub2 local37;
			@Pc(39) int local39;
			if (arg0) {
				local37 = Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1;
				local39 = 33538048;
			} else {
				local39 = Static28.anIntArray150[local31] << 14;
				local37 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local31]];
			}
			if (local37 != null && local37.method1977()) {
				local37.aBoolean127 = false;
				@Pc(67) int local67 = local37.anInt2827 >> 7;
				@Pc(72) int local72 = local37.anInt2832 >> 7;
				if ((Static63.aBoolean55 && Static96.anInt2797 > 50 || Static96.anInt2797 > 200) && !arg0 && local37.anInt2835 == local37.anInt2795) {
					local37.aBoolean127 = true;
				}
				if (local72 >= 0 && local72 < 104 && local67 >= 0 && local67 < 104) {
					if (local37.aClass1_Sub2_Sub3_Sub2_3 == null || Static60.anInt1366 < local37.anInt2857 || Static60.anInt1366 >= local37.anInt2849) {
						if ((local37.anInt2832 & 0x7F) == 64 && (local37.anInt2827 & 0x7F) == 64) {
							if (Static124.anInt2899 == Static49.anIntArrayArray12[local72][local67]) {
								continue;
							}
							Static49.anIntArrayArray12[local72][local67] = Static124.anInt2899;
						}
						local37.anInt2864 = Static129.method2048(local37.anInt2827, Static21.anInt596, local37.anInt2832);
						Static118.aClass4_1.method66(Static21.anInt596, local37.anInt2832, local37.anInt2827, local37.anInt2864, 60, local37, local37.anInt2819, local39, local37.aBoolean124);
					} else {
						local37.aBoolean127 = false;
						local37.anInt2864 = Static129.method2048(local37.anInt2827, Static21.anInt596, local37.anInt2832);
						Static118.aClass4_1.method55(Static21.anInt596, local37.anInt2832, local37.anInt2827, local37.anInt2864, local37, local37.anInt2819, local39, local37.anInt2844, local37.anInt2851, local37.anInt2841, local37.anInt2847);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ob;I)I")
	public static int method1300(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		@Pc(25) Class1_Sub19 local25 = (Class1_Sub19) Static125.aClass66_15.method1650((long) arg0.anInt1942 + ((long) arg0.anInt1937 << 32));
		return local25 == null ? arg0.anInt1961 : local25.anInt2733;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
	public static void method1302() {
		try {
			@Pc(6) Graphics local6 = Static119.aCanvas1.getGraphics();
			Static31.aClass7_5.method1095(local6, 0, 4);
			Static119.aClass7_18.method1095(local6, 0, 357);
			Static75.aClass7_12.method1095(local6, 722, 4);
			Static14.aClass7_2.method1095(local6, 743, 205);
			Static71.aClass7_11.method1095(local6, 0, 0);
			Static61.aClass7_9.method1095(local6, 516, 4);
			Static119.aClass7_17.method1095(local6, 516, 205);
			Static33.aClass7_6.method1095(local6, 496, 357);
			Static71.aClass7_10.method1095(local6, 0, 338);
		} catch (@Pc(68) Exception local68) {
			Static119.aCanvas1.repaint();
		}
	}
}
