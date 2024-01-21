import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "kc", descriptor = "I")
	public static int anInt835;

	@OriginalMember(owner = "client!d", name = "Bc", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_7;

	@OriginalMember(owner = "client!d", name = "Fc", descriptor = "I")
	public static int anInt843;

	@OriginalMember(owner = "client!d", name = "Qb", descriptor = "Lclient!a;")
	private static Class1 aClass1_731 = Static94.method1596("Feb");

	@OriginalMember(owner = "client!d", name = "Nc", descriptor = "Lclient!a;")
	private static Class1 aClass1_745 = Static94.method1596("Jan");

	@OriginalMember(owner = "client!d", name = "rc", descriptor = "Lclient!a;")
	private static Class1 aClass1_739 = Static94.method1596("Mar");

	@OriginalMember(owner = "client!d", name = "Qc", descriptor = "Lclient!a;")
	private static Class1 aClass1_747 = Static94.method1596("Apr");

	@OriginalMember(owner = "client!d", name = "zc", descriptor = "Lclient!a;")
	private static Class1 aClass1_741 = Static94.method1596("May");

	@OriginalMember(owner = "client!d", name = "mc", descriptor = "Lclient!a;")
	private static Class1 aClass1_737 = Static94.method1596("Jun");

	@OriginalMember(owner = "client!d", name = "sc", descriptor = "Lclient!a;")
	private static Class1 aClass1_740 = Static94.method1596("Jul");

	@OriginalMember(owner = "client!d", name = "Wb", descriptor = "Lclient!a;")
	private static Class1 aClass1_735 = Static94.method1596("Aug");

	@OriginalMember(owner = "client!d", name = "Tb", descriptor = "Lclient!a;")
	private static Class1 aClass1_733 = Static94.method1596("Sep");

	@OriginalMember(owner = "client!d", name = "Sb", descriptor = "Lclient!a;")
	private static Class1 aClass1_732 = Static94.method1596("Oct");

	@OriginalMember(owner = "client!d", name = "pc", descriptor = "Lclient!a;")
	private static Class1 aClass1_738 = Static94.method1596("Nov");

	@OriginalMember(owner = "client!d", name = "Ub", descriptor = "Lclient!a;")
	private static Class1 aClass1_734 = Static94.method1596("Dec");

	@OriginalMember(owner = "client!d", name = "Rb", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array10 = new Class1[] { aClass1_745, aClass1_731, aClass1_739, aClass1_747, aClass1_741, aClass1_737, aClass1_740, aClass1_735, aClass1_733, aClass1_732, aClass1_738, aClass1_734 };

	@OriginalMember(owner = "client!d", name = "cc", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[5];

	@OriginalMember(owner = "client!d", name = "ec", descriptor = "Lclient!a;")
	public static Class1 aClass1_736 = Static94.method1596("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!d", name = "oc", descriptor = "[I")
	public static int[] anIntArray88 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!d", name = "Ac", descriptor = "I")
	public static int anInt841 = 0;

	@OriginalMember(owner = "client!d", name = "Dc", descriptor = "Lclient!a;")
	private static Class1 aClass1_742 = Static94.method1596("Loading wordpack )2 ");

	@OriginalMember(owner = "client!d", name = "Lc", descriptor = "Lclient!a;")
	private static Class1 aClass1_744 = Static94.method1596("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!d", name = "Kc", descriptor = "Lclient!a;")
	public static Class1 aClass1_743 = aClass1_744;

	@OriginalMember(owner = "client!d", name = "Pc", descriptor = "Lclient!a;")
	public static Class1 aClass1_746 = aClass1_742;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bd;Lclient!bd;Lclient!bd;B)V")
	public static void method519(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class8 arg2) {
		Static13.aClass8_7 = arg2;
		Static30.aClass8_9 = arg0;
		Static95.aClass8_24 = arg1;
		Static98.aClass2_Sub1_Sub14ArrayArray1 = new Class2_Sub1_Sub14[Static30.aClass8_9.method1687()][];
		Static113.aBooleanArray17 = new boolean[Static30.aClass8_9.method1687()];
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	public static void method520() {
		Static13.aClass2_Sub3_Sub1_1.method843();
		@Pc(13) int local13 = Static13.aClass2_Sub3_Sub1_1.method838(8);
		@Pc(22) int local22;
		if (local13 < Static44.anInt1516) {
			for (local22 = local13; local22 < Static44.anInt1516; local22++) {
				Static10.anIntArray317[Static27.anInt1037++] = Static20.anIntArray89[local22];
			}
		}
		if (local13 > Static44.anInt1516) {
			throw new RuntimeException("gnpov1");
		}
		Static44.anInt1516 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(64) int local64 = Static20.anIntArray89[local22];
			@Pc(68) Class2_Sub1_Sub1_Sub1_Sub2 local68 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local64];
			@Pc(73) int local73 = Static13.aClass2_Sub3_Sub1_1.method838(1);
			if (local73 == 0) {
				Static20.anIntArray89[Static44.anInt1516++] = local64;
				local68.anInt2755 = Static69.anInt2806;
			} else {
				@Pc(93) int local93 = Static13.aClass2_Sub3_Sub1_1.method838(2);
				if (local93 == 0) {
					Static20.anIntArray89[Static44.anInt1516++] = local64;
					local68.anInt2755 = Static69.anInt2806;
					Static45.anIntArray156[Static67.anInt2767++] = local64;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local93 == 1) {
						Static20.anIntArray89[Static44.anInt1516++] = local64;
						local68.anInt2755 = Static69.anInt2806;
						local140 = Static13.aClass2_Sub3_Sub1_1.method838(3);
						local68.method1781(local140, false);
						local150 = Static13.aClass2_Sub3_Sub1_1.method838(1);
						if (local150 == 1) {
							Static45.anIntArray156[Static67.anInt2767++] = local64;
						}
					} else if (local93 == 2) {
						Static20.anIntArray89[Static44.anInt1516++] = local64;
						local68.anInt2755 = Static69.anInt2806;
						local140 = Static13.aClass2_Sub3_Sub1_1.method838(3);
						local68.method1781(local140, true);
						local150 = Static13.aClass2_Sub3_Sub1_1.method838(3);
						local68.method1781(local150, true);
						@Pc(204) int local204 = Static13.aClass2_Sub3_Sub1_1.method838(1);
						if (local204 == 1) {
							Static45.anIntArray156[Static67.anInt2767++] = local64;
						}
					} else if (local93 == 3) {
						Static10.anIntArray317[Static27.anInt1037++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBLclient!bd;I)Lclient!bc;")
	public static Class2_Sub1_Sub2_Sub1 method521(@OriginalArg(0) int arg0, @OriginalArg(2) Class8 arg1, @OriginalArg(3) int arg2) {
		return Static87.method1560(arg0, arg2, arg1) ? Static99.method1664() : null;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	public static void method522() {
		aClass1Array10 = null;
		aClass1_733 = null;
		aClass1_731 = null;
		aClass8_Sub1_7 = null;
		aBooleanArray5 = null;
		aClass1_739 = null;
		aClass1_736 = null;
		aClass1_740 = null;
		aClass1_742 = null;
		aClass1_745 = null;
		aClass1_737 = null;
		aClass1_735 = null;
		aClass1_732 = null;
		aClass1_746 = null;
		anIntArray88 = null;
		aClass1_747 = null;
		aClass1_734 = null;
		aClass1_741 = null;
		aClass1_738 = null;
		aClass1_744 = null;
		aClass1_743 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method523(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt2737 == 0) {
			return;
		}
		@Pc(43) int local43;
		@Pc(36) int local36;
		if (arg0.anInt2756 != -1 && arg0.anInt2756 < 32768) {
			@Pc(27) Class2_Sub1_Sub1_Sub1_Sub2 local27 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt2756];
			if (local27 != null) {
				local36 = arg0.anInt2717 - local27.anInt2717;
				local43 = arg0.anInt2724 - local27.anInt2724;
				if (local43 != 0 || local36 != 0) {
					arg0.anInt2711 = (int) (Math.atan2((double) local43, (double) local36) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt2756 >= 32768) {
			local73 = arg0.anInt2756 - 32768;
			if (Static57.anInt1796 == local73) {
				local73 = 2047;
			}
			@Pc(86) Class2_Sub1_Sub1_Sub1_Sub1 local86 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local73];
			if (local86 != null) {
				local36 = arg0.anInt2724 - local86.anInt2724;
				@Pc(101) int local101 = arg0.anInt2717 - local86.anInt2717;
				if (local36 != 0 || local101 != 0) {
					arg0.anInt2711 = (int) (Math.atan2((double) local36, (double) local101) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2765 != 0 || arg0.anInt2726 != 0) && (arg0.anInt2734 == 0 || arg0.anInt2705 > 0)) {
			local43 = arg0.anInt2717 - (arg0.anInt2726 - Static47.anInt1563 - Static47.anInt1563) * 64;
			local73 = arg0.anInt2724 - (arg0.anInt2765 - Static25.anInt1022 - Static25.anInt1022) * 64;
			if (local73 != 0 || local43 != 0) {
				arg0.anInt2711 = (int) (Math.atan2((double) local73, (double) local43) * 325.949D) & 0x7FF;
			}
			arg0.anInt2726 = 0;
			arg0.anInt2765 = 0;
		}
		local73 = arg0.anInt2711 - arg0.anInt2741 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt2723 = 0;
			return;
		}
		arg0.anInt2723++;
		@Pc(228) boolean local228;
		if (local73 > 1024) {
			arg0.anInt2741 -= arg0.anInt2737;
			local228 = true;
			if (arg0.anInt2737 > local73 || 2048 - arg0.anInt2737 < local73) {
				local228 = false;
				arg0.anInt2741 = arg0.anInt2711;
			}
			if (arg0.anInt2708 == arg0.anInt2747 && (arg0.anInt2723 > 25 || local228)) {
				if (arg0.anInt2762 == -1) {
					arg0.anInt2708 = arg0.anInt2752;
				} else {
					arg0.anInt2708 = arg0.anInt2762;
				}
			}
		} else {
			arg0.anInt2741 += arg0.anInt2737;
			local228 = true;
			if (local73 < arg0.anInt2737 || local73 > 2048 - arg0.anInt2737) {
				arg0.anInt2741 = arg0.anInt2711;
				local228 = false;
			}
			if (arg0.anInt2708 == arg0.anInt2747 && (arg0.anInt2723 > 25 || local228)) {
				if (arg0.anInt2714 == -1) {
					arg0.anInt2708 = arg0.anInt2752;
				} else {
					arg0.anInt2708 = arg0.anInt2714;
				}
			}
		}
		arg0.anInt2741 &= 0x7FF;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;BLclient!bd;)V")
	public static void method524(@OriginalArg(0) Component arg0, @OriginalArg(2) Class8 arg1) {
		if (Static39.aBoolean157) {
			return;
		}
		Static46.aClass2_Sub1_Sub2_Sub2_12 = Static54.method1225(Static54.aClass1_1828, Static12.aClass1_2755, arg1);
		Static73.aClass2_Sub1_Sub2_Sub2_19 = Static54.method1225(Static1.aClass1_7, Static12.aClass1_2755, arg1);
		Static62.aClass2_Sub1_Sub2_Sub2_17 = Static54.method1225(Static77.aClass1_2162, Static12.aClass1_2755, arg1);
		Static93.aClass2_Sub1_Sub2_Sub2_24 = Static54.method1225(Static98.aClass1_2626, Static12.aClass1_2755, arg1);
		Static91.aClass2_Sub1_Sub2_Sub2_23 = Static54.method1225(Static10.aClass1_2677, Static12.aClass1_2755, arg1);
		Static7.aClass2_Sub1_Sub2_Sub2_9 = Static54.method1225(Static15.aClass1_653, Static12.aClass1_2755, arg1);
		Static53.aClass4_40 = Static86.method1550(96, 479, arg0);
		Static73.aClass2_Sub1_Sub2_Sub2_19.method637(0, 0);
		Static1.aClass4_1 = Static86.method1550(156, 172, arg0);
		Static92.method1127();
		Static62.aClass2_Sub1_Sub2_Sub2_17.method637(0, 0);
		Static39.aClass4_62 = Static86.method1550(261, 190, arg0);
		Static46.aClass2_Sub1_Sub2_Sub2_12.method637(0, 0);
		Static30.aClass4_22 = Static86.method1550(334, 512, arg0);
		Static92.method1127();
		Static111.aClass4_63 = Static86.method1550(50, 496, arg0);
		Static53.aClass4_39 = Static86.method1550(37, 269, arg0);
		Static32.aClass4_23 = Static86.method1550(45, 249, arg0);
		@Pc(106) Class2_Sub1_Sub2_Sub4 local106 = Static111.method1805(arg1, Static102.aClass1_2697, Static12.aClass1_2755);
		Static84.aClass4_51 = Static86.method1550(local106.anInt1669, local106.anInt1670, arg0);
		local106.method1146(0, 0);
		@Pc(124) Class2_Sub1_Sub2_Sub4 local124 = Static111.method1805(arg1, Static72.aClass1_2043, Static12.aClass1_2755);
		Static14.aClass4_13 = Static86.method1550(local124.anInt1669, local124.anInt1670, arg0);
		local124.method1146(0, 0);
		@Pc(142) Class2_Sub1_Sub2_Sub4 local142 = Static111.method1805(arg1, Static12.aClass1_2746, Static12.aClass1_2755);
		Static68.aClass4_45 = Static86.method1550(local142.anInt1669, local142.anInt1670, arg0);
		local142.method1146(0, 0);
		@Pc(160) Class2_Sub1_Sub2_Sub4 local160 = Static111.method1805(arg1, Static88.aClass1_2437, Static12.aClass1_2755);
		Static48.aClass4_34 = Static86.method1550(local160.anInt1669, local160.anInt1670, arg0);
		local160.method1146(0, 0);
		@Pc(178) Class2_Sub1_Sub2_Sub4 local178 = Static111.method1805(arg1, Static17.aClass1_681, Static12.aClass1_2755);
		Static97.aClass4_59 = Static86.method1550(local178.anInt1669, local178.anInt1670, arg0);
		local178.method1146(0, 0);
		@Pc(196) Class2_Sub1_Sub2_Sub4 local196 = Static111.method1805(arg1, Static94.aClass1_2471, Static12.aClass1_2755);
		Static61.aClass4_42 = Static86.method1550(local196.anInt1669, local196.anInt1670, arg0);
		local196.method1146(0, 0);
		@Pc(214) Class2_Sub1_Sub2_Sub4 local214 = Static111.method1805(arg1, Static79.aClass1_2213, Static12.aClass1_2755);
		Static102.aClass4_60 = Static86.method1550(local214.anInt1669, local214.anInt1670, arg0);
		local214.method1146(0, 0);
		@Pc(232) Class2_Sub1_Sub2_Sub4 local232 = Static111.method1805(arg1, Static8.aClass1_422, Static12.aClass1_2755);
		Static57.aClass4_41 = Static86.method1550(local232.anInt1669, local232.anInt1670, arg0);
		local232.method1146(0, 0);
		@Pc(250) Class2_Sub1_Sub2_Sub4 local250 = Static111.method1805(arg1, Static12.aClass1_2754, Static12.aClass1_2755);
		Static27.aClass4_18 = Static86.method1550(local250.anInt1669, local250.anInt1670, arg0);
		local250.method1146(0, 0);
		Static91.aClass2_Sub1_Sub2_Sub2_22 = Static54.method1225(Static39.aClass1_2857, Static12.aClass1_2755, arg1);
		Static55.aClass2_Sub1_Sub2_Sub2_6 = Static54.method1225(Static97.aClass1_2623, Static12.aClass1_2755, arg1);
		Static63.aClass2_Sub1_Sub2_Sub2_18 = Static54.method1225(Static108.aClass1_2810, Static12.aClass1_2755, arg1);
		Static50.aClass2_Sub1_Sub2_Sub2_14 = Static91.aClass2_Sub1_Sub2_Sub2_22.method636();
		Static50.aClass2_Sub1_Sub2_Sub2_14.method640();
		Static88.aClass2_Sub1_Sub2_Sub2_21 = Static55.aClass2_Sub1_Sub2_Sub2_6.method636();
		Static88.aClass2_Sub1_Sub2_Sub2_21.method640();
		Static107.aClass2_Sub1_Sub2_Sub2_28 = Static91.aClass2_Sub1_Sub2_Sub2_22.method636();
		Static107.aClass2_Sub1_Sub2_Sub2_28.method641();
		Static43.aClass2_Sub1_Sub2_Sub2_11 = Static55.aClass2_Sub1_Sub2_Sub2_6.method636();
		Static43.aClass2_Sub1_Sub2_Sub2_11.method641();
		Static52.aClass2_Sub1_Sub2_Sub2_16 = Static63.aClass2_Sub1_Sub2_Sub2_18.method636();
		Static52.aClass2_Sub1_Sub2_Sub2_16.method641();
		Static34.aClass2_Sub1_Sub2_Sub2_10 = Static91.aClass2_Sub1_Sub2_Sub2_22.method636();
		Static34.aClass2_Sub1_Sub2_Sub2_10.method640();
		Static34.aClass2_Sub1_Sub2_Sub2_10.method641();
		Static22.aClass2_Sub1_Sub2_Sub2_8 = Static55.aClass2_Sub1_Sub2_Sub2_6.method636();
		Static22.aClass2_Sub1_Sub2_Sub2_8.method640();
		Static22.aClass2_Sub1_Sub2_Sub2_8.method641();
		Static95.aClass2_Sub1_Sub2_Sub2Array9 = Static25.method716(arg1, Static95.aClass1_2522, Static12.aClass1_2755);
		Static84.anIntArray285 = new int[151];
		Static53.anIntArray181 = new int[33];
		Static53.anIntArray180 = new int[33];
		Static62.anIntArray202 = new int[151];
		@Pc(353) int local353;
		@Pc(351) int local351;
		@Pc(355) int local355;
		for (@Pc(347) int local347 = 0; local347 < 33; local347++) {
			local351 = 0;
			local353 = 999;
			for (local355 = 0; local355 < 34; local355++) {
				if (Static62.aClass2_Sub1_Sub2_Sub2_17.aByteArray5[Static62.aClass2_Sub1_Sub2_Sub2_17.anInt954 * local347 + local355] == 0) {
					if (local353 == 999) {
						local353 = local355;
					}
				} else if (local353 != 999) {
					local351 = local355;
					break;
				}
			}
			Static53.anIntArray180[local347] = local353;
			Static53.anIntArray181[local347] = local351 - local353;
		}
		for (local353 = 5; local353 < 156; local353++) {
			local355 = 0;
			local351 = 999;
			for (@Pc(417) int local417 = 25; local417 < 172; local417++) {
				if (Static62.aClass2_Sub1_Sub2_Sub2_17.aByteArray5[local417 + Static62.aClass2_Sub1_Sub2_Sub2_17.anInt954 * local353] == 0 && (local417 > 34 || local353 > 34)) {
					if (local351 == 999) {
						local351 = local417;
					}
				} else if (local351 != 999) {
					local355 = local417;
					break;
				}
			}
			Static84.anIntArray285[local353 - 5] = local351 - 25;
			Static62.anIntArray202[local353 - 5] = local355 - local351;
		}
		Static39.aBoolean157 = true;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)I")
	public static int method525() {
		@Pc(7) int local7 = 3;
		if (Static47.anInt1561 < 310) {
			@Pc(16) int local16 = Static41.anInt1396 >> 7;
			@Pc(20) int local20 = Static21.anInt916 >> 7;
			if ((Static29.aByteArrayArrayArray2[Static2.anInt287][local20][local16] & 0x4) != 0) {
				local7 = Static2.anInt287;
			}
			@Pc(37) int local37 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 >> 7;
			@Pc(42) int local42 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 >> 7;
			@Pc(50) int local50;
			if (local37 <= local20) {
				local50 = local20 - local37;
			} else {
				local50 = local37 - local20;
			}
			@Pc(69) int local69;
			if (local16 < local42) {
				local69 = local42 - local16;
			} else {
				local69 = local16 - local42;
			}
			@Pc(85) int local85;
			@Pc(87) int local87;
			if (local50 <= local69) {
				local85 = local50 * 65536 / local69;
				local87 = 32768;
				while (local42 != local16) {
					if (local42 > local16) {
						local16++;
					} else if (local16 > local42) {
						local16--;
					}
					local87 += local85;
					if ((Static29.aByteArrayArrayArray2[Static2.anInt287][local20][local16] & 0x4) != 0) {
						local7 = Static2.anInt287;
					}
					if (local87 >= 65536) {
						if (local20 < local37) {
							local20++;
						} else if (local37 < local20) {
							local20--;
						}
						local87 -= 65536;
						if ((Static29.aByteArrayArrayArray2[Static2.anInt287][local20][local16] & 0x4) != 0) {
							local7 = Static2.anInt287;
						}
					}
				}
			} else {
				local85 = local69 * 65536 / local50;
				local87 = 32768;
				while (local37 != local20) {
					if (local20 < local37) {
						local20++;
					} else if (local37 < local20) {
						local20--;
					}
					if ((Static29.aByteArrayArrayArray2[Static2.anInt287][local20][local16] & 0x4) != 0) {
						local7 = Static2.anInt287;
					}
					local87 += local85;
					if (local87 >= 65536) {
						local87 -= 65536;
						if (local42 > local16) {
							local16++;
						} else if (local16 > local42) {
							local16--;
						}
						if ((Static29.aByteArrayArrayArray2[Static2.anInt287][local20][local16] & 0x4) != 0) {
							local7 = Static2.anInt287;
						}
					}
				}
			}
		}
		if ((Static29.aByteArrayArrayArray2[Static2.anInt287][Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 >> 7][Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 >> 7] & 0x4) != 0) {
			local7 = Static2.anInt287;
		}
		return local7;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!ad;ILclient!ab;IIIII)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static77.aBoolean113 && (Static29.aByteArrayArrayArray2[0][arg2][arg6] & 0x2) == 0) {
			if ((Static29.aByteArrayArrayArray2[arg7][arg2][arg6] & 0x10) != 0) {
				return;
			}
			if (Static98.method1663(arg7, arg6, arg2) != Static50.anInt1644) {
				return;
			}
		}
		if (Static108.anInt2678 > arg7) {
			Static108.anInt2678 = arg7;
		}
		@Pc(63) int local63 = Static50.anIntArrayArrayArray7[arg7][arg2 + 1][arg6 + 1];
		@Pc(71) int local71 = Static50.anIntArrayArrayArray7[arg7][arg2][arg6];
		@Pc(81) int local81 = Static50.anIntArrayArrayArray7[arg7][arg2 + 1][arg6];
		@Pc(91) int local91 = Static50.anIntArrayArrayArray7[arg7][arg2][arg6 + 1];
		@Pc(104) int local104 = (arg6 << 7) + arg2 + (arg5 << 14) + 1073741824;
		@Pc(110) int local110 = arg4 + (arg0 << 6);
		@Pc(120) int local120 = local91 + local63 + local81 + local71 >> 2;
		@Pc(124) Class2_Sub1_Sub10 local124 = Static28.method739(arg5);
		if (local124.anInt1498 == 1) {
			local110 += 256;
		}
		if (local124.anInt1508 == 0) {
			local104 += Integer.MIN_VALUE;
		}
		if (local124.method1008()) {
			Static65.method1345(arg6, arg7, arg0, arg2, local124);
		}
		@Pc(184) Class2_Sub1_Sub1 local184;
		if (arg4 != 22) {
			@Pc(280) int local280;
			if (arg4 == 10 || arg4 == 11) {
				if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
					local184 = local124.method1007(local63, local91, arg0, local71, 10, local81);
				} else {
					local184 = new Class2_Sub1_Sub1_Sub3(arg5, 10, arg0, local71, local81, local63, local91, local124.anInt1484, true);
				}
				if (local184 != null) {
					@Pc(283) int local283;
					if (arg0 == 1 || arg0 == 3) {
						local283 = local124.anInt1481;
						local280 = local124.anInt1491;
					} else {
						local280 = local124.anInt1481;
						local283 = local124.anInt1491;
					}
					@Pc(293) int local293 = 0;
					if (arg4 == 11) {
						local293 += 256;
					}
					if (arg3.method169(arg7, arg2, arg6, local120, local280, local283, local184, local293, local104, local110) && local124.aBoolean81) {
						@Pc(321) Class2_Sub1_Sub1_Sub5 local321;
						if (local184 instanceof Class2_Sub1_Sub1_Sub5) {
							local321 = (Class2_Sub1_Sub1_Sub5) local184;
						} else {
							local321 = local124.method1007(local63, local91, arg0, local71, 10, local81);
						}
						if (local321 != null) {
							for (@Pc(337) int local337 = 0; local337 <= local280; local337++) {
								for (@Pc(341) int local341 = 0; local341 <= local283; local341++) {
									@Pc(348) int local348 = local321.method1406() / 4;
									if (local348 > 30) {
										local348 = 30;
									}
									if (local348 > Static32.aByteArrayArrayArray4[arg7][arg2 + local337][arg6 + local341]) {
										Static32.aByteArrayArrayArray4[arg7][local337 + arg2][arg6 + local341] = (byte) local348;
									}
								}
							}
						}
					}
				}
				if (local124.aBoolean75 && arg1 != null) {
					arg1.method206(arg2, local124.aBoolean79, local124.anInt1491, arg0, arg6, local124.anInt1481);
				}
			} else if (arg4 >= 12) {
				if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
					local184 = local124.method1007(local63, local91, arg0, local71, arg4, local81);
				} else {
					local184 = new Class2_Sub1_Sub1_Sub3(arg5, arg4, arg0, local71, local81, local63, local91, local124.anInt1484, true);
				}
				arg3.method169(arg7, arg2, arg6, local120, 1, 1, local184, 0, local104, local110);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0) {
					Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x924;
				}
				if (local124.aBoolean75 && arg1 != null) {
					arg1.method206(arg2, local124.aBoolean79, local124.anInt1491, arg0, arg6, local124.anInt1481);
				}
			} else if (arg4 == 0) {
				if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
					local184 = local124.method1007(local63, local91, arg0, local71, 0, local81);
				} else {
					local184 = new Class2_Sub1_Sub1_Sub3(arg5, 0, arg0, local71, local81, local63, local91, local124.anInt1484, true);
				}
				arg3.method126(arg7, arg2, arg6, local120, local184, null, Static59.anIntArray194[arg0], 0, local104, local110);
				if (arg0 == 0) {
					if (local124.aBoolean81) {
						Static32.aByteArrayArrayArray4[arg7][arg2][arg6] = 50;
						Static32.aByteArrayArrayArray4[arg7][arg2][arg6 + 1] = 50;
					}
					if (local124.aBoolean78) {
						Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local124.aBoolean81) {
						Static32.aByteArrayArrayArray4[arg7][arg2][arg6 + 1] = 50;
						Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6 + 1] = 50;
					}
					if (local124.aBoolean78) {
						Static10.anIntArrayArrayArray8[arg7][arg2][arg6 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local124.aBoolean81) {
						Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6] = 50;
						Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6 + 1] = 50;
					}
					if (local124.aBoolean78) {
						Static10.anIntArrayArrayArray8[arg7][arg2 + 1][arg6] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local124.aBoolean81) {
						Static32.aByteArrayArrayArray4[arg7][arg2][arg6] = 50;
						Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6] = 50;
					}
					if (local124.aBoolean78) {
						Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x492;
					}
				}
				if (local124.aBoolean75 && arg1 != null) {
					arg1.method202(arg6, arg4, arg0, arg2, local124.aBoolean79);
				}
				if (local124.anInt1483 != 16) {
					arg3.method147(arg7, arg2, arg6, local124.anInt1483);
				}
			} else if (arg4 == 1) {
				if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
					local184 = local124.method1007(local63, local91, arg0, local71, 1, local81);
				} else {
					local184 = new Class2_Sub1_Sub1_Sub3(arg5, 1, arg0, local71, local81, local63, local91, local124.anInt1484, true);
				}
				arg3.method126(arg7, arg2, arg6, local120, local184, null, Static95.anIntArray298[arg0], 0, local104, local110);
				if (local124.aBoolean81) {
					if (arg0 == 0) {
						Static32.aByteArrayArrayArray4[arg7][arg2][arg6 + 1] = 50;
					} else if (arg0 == 1) {
						Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6 + 1] = 50;
					} else if (arg0 == 2) {
						Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6] = 50;
					} else if (arg0 == 3) {
						Static32.aByteArrayArrayArray4[arg7][arg2][arg6] = 50;
					}
				}
				if (local124.aBoolean75 && arg1 != null) {
					arg1.method202(arg6, arg4, arg0, arg2, local124.aBoolean79);
				}
			} else {
				@Pc(929) int local929;
				@Pc(958) Class2_Sub1_Sub1 local958;
				if (arg4 == 2) {
					local929 = arg0 + 1 & 0x3;
					@Pc(948) Class2_Sub1_Sub1 local948;
					if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
						local948 = local124.method1007(local63, local91, arg0 + 4, local71, 2, local81);
						local958 = local124.method1007(local63, local91, local929, local71, 2, local81);
					} else {
						local948 = new Class2_Sub1_Sub1_Sub3(arg5, 2, arg0 + 4, local71, local81, local63, local91, local124.anInt1484, true);
						local958 = new Class2_Sub1_Sub1_Sub3(arg5, 2, local929, local71, local81, local63, local91, local124.anInt1484, true);
					}
					arg3.method126(arg7, arg2, arg6, local120, local948, local958, Static59.anIntArray194[arg0], Static59.anIntArray194[local929], local104, local110);
					if (local124.aBoolean78) {
						if (arg0 == 0) {
							Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x249;
							Static10.anIntArrayArrayArray8[arg7][arg2][arg6 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static10.anIntArrayArrayArray8[arg7][arg2][arg6 + 1] |= 0x492;
							Static10.anIntArrayArrayArray8[arg7][arg2 + 1][arg6] |= 0x249;
						} else if (arg0 == 2) {
							Static10.anIntArrayArrayArray8[arg7][arg2 + 1][arg6] |= 0x249;
							Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x492;
						} else if (arg0 == 3) {
							Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x492;
							Static10.anIntArrayArrayArray8[arg7][arg2][arg6] |= 0x249;
						}
					}
					if (local124.aBoolean75 && arg1 != null) {
						arg1.method202(arg6, arg4, arg0, arg2, local124.aBoolean79);
					}
					if (local124.anInt1483 != 16) {
						arg3.method147(arg7, arg2, arg6, local124.anInt1483);
					}
				} else if (arg4 == 3) {
					if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
						local184 = local124.method1007(local63, local91, arg0, local71, 3, local81);
					} else {
						local184 = new Class2_Sub1_Sub1_Sub3(arg5, 3, arg0, local71, local81, local63, local91, local124.anInt1484, true);
					}
					arg3.method126(arg7, arg2, arg6, local120, local184, null, Static95.anIntArray298[arg0], 0, local104, local110);
					if (local124.aBoolean81) {
						if (arg0 == 0) {
							Static32.aByteArrayArrayArray4[arg7][arg2][arg6 + 1] = 50;
						} else if (arg0 == 1) {
							Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6 + 1] = 50;
						} else if (arg0 == 2) {
							Static32.aByteArrayArrayArray4[arg7][arg2 + 1][arg6] = 50;
						} else if (arg0 == 3) {
							Static32.aByteArrayArrayArray4[arg7][arg2][arg6] = 50;
						}
					}
					if (local124.aBoolean75 && arg1 != null) {
						arg1.method202(arg6, arg4, arg0, arg2, local124.aBoolean79);
					}
				} else if (arg4 == 9) {
					if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
						local184 = local124.method1007(local63, local91, arg0, local71, arg4, local81);
					} else {
						local184 = new Class2_Sub1_Sub1_Sub3(arg5, arg4, arg0, local71, local81, local63, local91, local124.anInt1484, true);
					}
					arg3.method169(arg7, arg2, arg6, local120, 1, 1, local184, 0, local104, local110);
					if (local124.aBoolean75 && arg1 != null) {
						arg1.method206(arg2, local124.aBoolean79, local124.anInt1491, arg0, arg6, local124.anInt1481);
					}
				} else {
					if (local124.aBoolean80) {
						if (arg0 == 1) {
							local929 = local91;
							local91 = local63;
							local63 = local81;
							local81 = local71;
							local71 = local929;
						} else if (arg0 == 2) {
							local929 = local91;
							local91 = local81;
							local81 = local929;
							local929 = local63;
							local63 = local71;
							local71 = local929;
						} else if (arg0 == 3) {
							local929 = local91;
							local91 = local71;
							local71 = local81;
							local81 = local63;
							local63 = local929;
						}
					}
					if (arg4 == 4) {
						if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
							local184 = local124.method1007(local63, local91, 0, local71, 4, local81);
						} else {
							local184 = new Class2_Sub1_Sub1_Sub3(arg5, 4, 0, local71, local81, local63, local91, local124.anInt1484, true);
						}
						arg3.method141(arg7, arg2, arg6, local120, local184, Static59.anIntArray194[arg0], arg0 * 512, 0, 0, local104, local110);
					} else if (arg4 == 5) {
						local280 = arg3.method154(arg7, arg2, arg6);
						local929 = 16;
						if (local280 > 0) {
							local929 = Static28.method739(local280 >> 14 & 0x7FFF).anInt1483;
						}
						if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
							local958 = local124.method1007(local63, local91, 0, local71, 4, local81);
						} else {
							local958 = new Class2_Sub1_Sub1_Sub3(arg5, 4, 0, local71, local81, local63, local91, local124.anInt1484, true);
						}
						arg3.method141(arg7, arg2, arg6, local120, local958, Static59.anIntArray194[arg0], arg0 * 512, local929 * Static54.anIntArray182[arg0], Static4.anIntArray41[arg0] * local929, local104, local110);
					} else if (arg4 == 6) {
						if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
							local184 = local124.method1007(local63, local91, 0, local71, 4, local81);
						} else {
							local184 = new Class2_Sub1_Sub1_Sub3(arg5, 4, 0, local71, local81, local63, local91, local124.anInt1484, true);
						}
						arg3.method141(arg7, arg2, arg6, local120, local184, 256, arg0, 0, 0, local104, local110);
					} else if (arg4 == 7) {
						if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
							local184 = local124.method1007(local63, local91, 0, local71, 4, local81);
						} else {
							local184 = new Class2_Sub1_Sub1_Sub3(arg5, 4, 0, local71, local81, local63, local91, local124.anInt1484, true);
						}
						arg3.method141(arg7, arg2, arg6, local120, local184, 512, arg0, 0, 0, local104, local110);
					} else if (arg4 == 8) {
						if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
							local184 = local124.method1007(local63, local91, 0, local71, 4, local81);
						} else {
							local184 = new Class2_Sub1_Sub1_Sub3(arg5, 4, 0, local71, local81, local63, local91, local124.anInt1484, true);
						}
						arg3.method141(arg7, arg2, arg6, local120, local184, 768, arg0, 0, 0, local104, local110);
					}
				}
			}
		} else if (!Static77.aBoolean113 || local124.anInt1508 != 0 || local124.aBoolean82) {
			if (local124.anInt1484 == -1 && local124.anIntArray154 == null) {
				local184 = local124.method1007(local63, local91, arg0, local71, 22, local81);
			} else {
				local184 = new Class2_Sub1_Sub1_Sub3(arg5, 22, arg0, local71, local81, local63, local91, local124.anInt1484, true);
			}
			arg3.method164(arg7, arg2, arg6, local120, local184, local104, local110);
			if (local124.aBoolean75 && local124.anInt1508 == 1 && arg1 != null) {
				arg1.method203(arg6, arg2);
			}
		}
	}
}
