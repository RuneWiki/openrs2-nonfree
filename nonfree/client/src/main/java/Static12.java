import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!jb;")
	public static Class40 aClass40_5;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "Lclient!na;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!cd;")
	public static Class13 aClass13_5 = new Class13();

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_119 = Static119.method1462("sl_back");

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public static int anInt342 = 0;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
	public static int[] anIntArray33 = new int[25];

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "Lclient!pe;")
	public static Class65 aClass65_120 = Static119.method1462("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	public static void method244(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static94.method1566(arg0)) {
			return;
		}
		@Pc(23) Class2_Sub22[] local23 = Static95.aClass2_Sub22ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class2_Sub22 local31 = local23[local25];
			if (local31.anObjectArray16 != null) {
				@Pc(38) Class2_Sub9 local38 = new Class2_Sub9();
				local38.aClass2_Sub22_7 = local31;
				local38.anObjectArray2 = local31.anObjectArray16;
				Static103.method1703(local38);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public static void method247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static118.method2073(arg2, arg1, arg3 + arg2, arg1 + arg0);
		Static87.method1426();
		Static77.anInt1714++;
		Static57.method1077(true);
		Static8.method159(true);
		Static57.method1077(false);
		Static8.method159(false);
		Static53.method885();
		Static91.method1516();
		@Pc(39) int local39;
		@Pc(58) int local58;
		if (!Static38.aBoolean36) {
			local39 = Static44.anInt1082;
			if (Static37.anInt813 / 256 > local39) {
				local39 = Static37.anInt813 / 256;
			}
			local58 = Static13.anInt2586 + Static82.anInt2719 & 0x7FF;
			if (Static16.aBooleanArray15[4] && local39 < Static97.anIntArray287[4] + 128) {
				local39 = Static97.anIntArray287[4] + 128;
			}
			Static21.method350(local58, local39, Static133.anInt2927, Static106.method1718(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1958, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anInt1948, Static59.anInt1479) - 50, Static41.anInt1012, local39 * 3 + 600);
		}
		if (Static38.aBoolean36) {
			local39 = Static5.method129();
		} else {
			local39 = Static124.method1895();
		}
		@Pc(117) int local117 = Static84.anInt1818;
		local58 = Static69.anInt1610;
		@Pc(121) int local121 = Static130.anInt2838;
		@Pc(123) int local123 = Static97.anInt2216;
		@Pc(125) int local125 = Static45.anInt1096;
		@Pc(168) int local168;
		for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
			if (Static16.aBooleanArray15[local127]) {
				local168 = (int) (Math.random() * (double) (Static71.anIntArray197[local127] * 2 + 1) - (double) Static71.anIntArray197[local127] + Math.sin((double) Static73.anIntArray200[local127] / 100.0D * (double) Static28.anIntArray75[local127]) * (double) Static97.anIntArray287[local127]);
				if (local127 == 1) {
					Static84.anInt1818 += local168;
				}
				if (local127 == 3) {
					Static45.anInt1096 = Static45.anInt1096 + local168 & 0x7FF;
				}
				if (local127 == 4) {
					Static97.anInt2216 += local168;
					if (Static97.anInt2216 < 128) {
						Static97.anInt2216 = 128;
					}
					if (Static97.anInt2216 > 383) {
						Static97.anInt2216 = 383;
					}
				}
				if (local127 == 0) {
					Static69.anInt1610 += local168;
				}
				if (local127 == 2) {
					Static130.anInt2838 += local168;
				}
			}
		}
		local168 = Static66.anInt1586;
		@Pc(228) int local228 = Static39.anInt837;
		if (local168 >= arg2 && arg3 + arg2 > local168 && arg1 <= local228 && local228 < arg1 + arg0) {
			Static131.aBoolean131 = true;
			Static131.anInt2870 = Static39.anInt837 - arg1;
			Static131.anInt2871 = 0;
			Static131.anInt2872 = Static66.anInt1586 - arg2;
		} else {
			Static131.aBoolean131 = false;
			Static131.anInt2871 = 0;
		}
		Static124.method1897();
		Static118.method2081(arg2, arg1, arg3, arg0, 0);
		Static124.method1897();
		Static124.aClass49_1.method1169(Static69.anInt1610, Static84.anInt1818, Static130.anInt2838, Static97.anInt2216, Static45.anInt1096, local39);
		Static124.method1897();
		Static124.aClass49_1.method1192();
		Static98.method1614(arg3, arg1, arg0, arg2);
		Static1.method16(arg2, arg1);
		((Class1) Static87.anInterface1_1).method11(Static117.anInt2579);
		Static133.method2041(arg1, arg0, arg2, arg3);
		Static84.anInt1818 = local117;
		Static45.anInt1096 = local125;
		Static69.anInt1610 = local58;
		Static97.anInt2216 = local123;
		Static130.anInt2838 = local121;
		if (Static4.aBoolean49 && Static3.method68() == 0) {
			Static4.aBoolean49 = false;
		}
		if (Static4.aBoolean49) {
			Static118.method2081(arg2, arg1, arg3, arg0, 0);
			Static20.method338(Static37.aClass65_390, false);
		}
		if (!Static4.aBoolean49 && !Static3.aBoolean5 && local168 >= arg2 && local168 < arg2 + arg3 && local228 >= arg1 && arg0 + arg1 > local228) {
			Static114.method1833(local168, arg1, local228, arg2);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method248() {
		anIntArray33 = null;
		aClass65_120 = null;
		aClass13_5 = null;
		aClass56_4 = null;
		anIntArray34 = null;
		aClass65_119 = null;
		anIntArray30 = null;
		aClass40_5 = null;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	public static void method251() {
		while (true) {
			if (Static66.aClass2_Sub4_Sub1_2.method960(Static90.anInt1997) >= 11) {
				@Pc(22) int local22 = Static66.aClass2_Sub4_Sub1_2.method953(11);
				if (local22 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local22] == null) {
						Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local22] = new Class2_Sub1_Sub1_Sub4_Sub1();
						local27 = true;
						if (Static43.aClass2_Sub4Array1[local22] != null) {
							Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local22].method731(Static43.aClass2_Sub4Array1[local22]);
						}
					}
					Static76.anIntArray223[Static35.anInt795++] = local22;
					@Pc(63) Class2_Sub1_Sub1_Sub4_Sub1 local63 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local22];
					local63.anInt1969 = Static10.anInt2951;
					@Pc(71) int local71 = Static66.aClass2_Sub4_Sub1_2.method953(5);
					if (local71 > 15) {
						local71 -= 32;
					}
					@Pc(80) int local80 = Static66.aClass2_Sub4_Sub1_2.method953(1);
					@Pc(87) int local87 = Static32.anIntArray97[Static66.aClass2_Sub4_Sub1_2.method953(3)];
					if (local27) {
						local63.anInt1962 = local63.anInt1965 = local87;
					}
					@Pc(100) int local100 = Static66.aClass2_Sub4_Sub1_2.method953(1);
					if (local100 == 1) {
						Static68.anIntArray376[Static33.anInt761++] = local22;
					}
					@Pc(118) int local118 = Static66.aClass2_Sub4_Sub1_2.method953(5);
					if (local118 > 15) {
						local118 -= 32;
					}
					local63.method1468(local80 == 1, local118 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], local71 + Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0]);
					continue;
				}
			}
			Static66.aClass2_Sub4_Sub1_2.method963();
			return;
		}
	}
}
