import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "T", descriptor = "Lclient!fb;")
	public static Class5_Sub1_Sub6 aClass5_Sub1_Sub6_1;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
	public static int anInt202;

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "Lclient!me;")
	public static Class5_Sub1_Sub11 aClass5_Sub1_Sub11_1;

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "Lclient!nb;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!af", name = "xb", descriptor = "[I")
	public static int[] anIntArray9;

	@OriginalMember(owner = "client!af", name = "U", descriptor = "Lclient!vc;")
	private static Class71 aClass71_149 = Static38.method736("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!af", name = "X", descriptor = "Lclient!vc;")
	public static Class71 aClass71_150 = Static38.method736("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "[I")
	public static int[] anIntArray7 = new int[25];

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
	public static int anInt204 = 0;

	@OriginalMember(owner = "client!af", name = "eb", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
	public static final int anInt208 = 20;

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "Lclient!qe;")
	public static Class5_Sub11 aClass5_Sub11_1 = new Class5_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!af", name = "sb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_152 = Static38.method736("white:");

	@OriginalMember(owner = "client!af", name = "pb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_151 = aClass71_152;

	@OriginalMember(owner = "client!af", name = "tb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_153 = aClass71_149;

	@OriginalMember(owner = "client!af", name = "ub", descriptor = "Lclient!vc;")
	private static Class71 aClass71_154 = Static38.method736(" from your ignore list first");

	@OriginalMember(owner = "client!af", name = "vb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_155 = aClass71_154;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!nb;)V")
	public static void method142(@OriginalArg(1) Class24 arg0) {
		Static99.aClass24_20 = arg0;
		Static75.anInt1856 = Static99.aClass24_20.method660(16);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!vc;Lclient!vc;Z)V")
	public static void method143(@OriginalArg(1) Class71 arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) boolean arg2) {
		if (Static73.aBoolean87) {
			Static73.aBoolean87 = false;
			Static59.method1036();
			Static17.method476();
			Static70.method1172();
			Static37.method452();
			Static59.method1035(Static60.anInt1551, Static93.anInt2252, Static64.aClass5_Sub1_Sub10_Sub4_6, Static16.anInt518);
			Static89.method1410(-1, Static95.anInt2286 == -1, Static64.anInt2489, Static26.anIntArray168);
			Static57.aBoolean61 = true;
			Static54.aBoolean56 = true;
			Static78.aBoolean42 = true;
		}
		@Pc(41) short local41 = 151;
		@Pc(42) int local42 = local41 - 3;
		Static16.method424();
		Static64.aClass5_Sub1_Sub10_Sub4_6.method2048(arg0, 257, 148, 0);
		Static64.aClass5_Sub1_Sub10_Sub4_6.method2048(arg0, 256, 147, 16777215);
		if (arg1 != null) {
			local42 += 15;
			if (arg2) {
				@Pc(79) int local79 = Static64.aClass5_Sub1_Sub10_Sub4_6.method2032(arg1) + 4;
				Static52.method2024(257 - local79 / 2, 152, local79, 11, 0);
			}
			Static64.aClass5_Sub1_Sub10_Sub4_6.method2048(arg1, 257, 163, 0);
			Static64.aClass5_Sub1_Sub10_Sub4_6.method2048(arg1, 256, 162, 16777215);
		}
		Static115.method1802();
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
	public static void method145() {
		aClass5_Sub11_1 = null;
		anIntArray7 = null;
		aClass71_149 = null;
		aClass71_154 = null;
		aClass5_Sub1_Sub11_1 = null;
		aClass71_152 = null;
		aClass71_153 = null;
		aClass24_2 = null;
		aClass71_155 = null;
		anIntArray8 = null;
		aClass71_150 = null;
		anIntArray9 = null;
		aClass71_151 = null;
		aClass5_Sub1_Sub6_1 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!vc;I)V")
	public static void method146(@OriginalArg(0) Class71 arg0) {
		if (arg0 == null || arg0.method1784() == 0) {
			Static32.anInt853 = 0;
			return;
		}
		@Pc(19) Class71 local19 = arg0;
		@Pc(22) Class71[] local22 = new Class71[100];
		@Pc(24) int local24 = 0;
		while (true) {
			@Pc(29) int local29 = local19.method1818();
			if (local29 == -1) {
				local19 = local19.method1821();
				if (local19.method1784() > 0) {
					local22[local24++] = local19.method1792();
				}
				Static32.anInt853 = 0;
				label46: for (local29 = 0; local29 < Static69.anInt1703; local29++) {
					@Pc(88) Class5_Sub1_Sub17 local88 = Static33.method691(local29);
					if (local88.anInt2905 == -1 && local88.aClass71_1359 != null) {
						@Pc(100) Class71 local100 = local88.aClass71_1359.method1792();
						for (@Pc(102) int local102 = 0; local102 < local24; local102++) {
							if (local100.method1790(local22[local102]) == -1) {
								continue label46;
							}
						}
						Static4.aClass71Array1[Static32.anInt853] = local100;
						Static56.anIntArray171[Static32.anInt853] = local29;
						Static32.anInt853++;
						if (Static4.aClass71Array1.length <= Static32.anInt853) {
							return;
						}
					}
				}
				return;
			}
			@Pc(58) Class71 local58 = local19.method1800(local29, 0).method1821();
			if (local58.method1784() > 0) {
				local22[local24++] = local58.method1792();
			}
			local19 = local19.method1822(local29 + 1);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V")
	public static void method148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static51.anIntArrayArrayArray3[arg1][local3 + arg2][local7 + arg0] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static51.anIntArrayArrayArray3[arg1][arg2][local7 + arg0] = Static51.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 + local7];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static51.anIntArrayArrayArray3[arg1][arg2 + local7][arg0] = Static51.anIntArrayArrayArray3[arg1][arg2 + local7][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static51.anIntArrayArrayArray3[arg1][arg2 - 1][arg0] != 0) {
			Static51.anIntArrayArrayArray3[arg1][arg2][arg0] = Static51.anIntArrayArrayArray3[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static51.anIntArrayArrayArray3[arg1][arg2][arg0 - 1] != 0) {
			Static51.anIntArrayArrayArray3[arg1][arg2][arg0] = Static51.anIntArrayArrayArray3[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static51.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static51.anIntArrayArrayArray3[arg1][arg2][arg0] = Static51.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
	public static void method149() {
		@Pc(1) Object local1 = Static50.anObject2;
		synchronized (Static50.anObject2) {
			if (Static9.anInt301 == 0) {
				Static111.aClass29_3.method774(new Class18(), 5);
			}
			Static9.anInt301 = 600;
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public static void method150() {
		for (@Pc(12) int local12 = 0; local12 < Static57.anInt1493; local12++) {
			@Pc(18) int local18 = Static72.anIntArray224[local12];
			@Pc(22) Class5_Sub1_Sub1_Sub3_Sub1 local22 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local18];
			@Pc(26) int local26 = Static86.aClass5_Sub11_Sub1_12.method1546();
			if ((local26 & 0x40) != 0) {
				local22.aClass71_1229 = Static86.aClass5_Sub11_Sub1_12.method1541();
				local22.anInt2462 = 100;
			}
			@Pc(52) int local52;
			@Pc(56) int local56;
			if ((local26 & 0x1) != 0) {
				local52 = Static86.aClass5_Sub11_Sub1_12.method1502();
				local56 = Static86.aClass5_Sub11_Sub1_12.method1533();
				local22.method1682(local56, local52, Static95.anInt2285);
				local22.anInt2445 = Static95.anInt2285 + 300;
				local22.anInt2473 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local22.anInt2468 = Static86.aClass5_Sub11_Sub1_12.method1516();
			}
			if ((local26 & 0x8) != 0) {
				local52 = Static86.aClass5_Sub11_Sub1_12.method1546();
				local56 = Static86.aClass5_Sub11_Sub1_12.method1516();
				local22.method1682(local56, local52, Static95.anInt2285);
				local22.anInt2445 = Static95.anInt2285 + 300;
				local22.anInt2473 = Static86.aClass5_Sub11_Sub1_12.method1516();
				local22.anInt2468 = Static86.aClass5_Sub11_Sub1_12.method1533();
			}
			if ((local26 & 0x2) != 0) {
				local22.anInt2436 = Static86.aClass5_Sub11_Sub1_12.method1529();
				if (local22.anInt2436 == 65535) {
					local22.anInt2436 = -1;
				}
			}
			if ((local26 & 0x10) != 0) {
				local52 = Static86.aClass5_Sub11_Sub1_12.method1539();
				if (local52 == 65535) {
					local52 = -1;
				}
				local56 = Static86.aClass5_Sub11_Sub1_12.method1546();
				if (local22.anInt2458 == local52 && local52 != -1) {
					@Pc(214) int local214 = Static57.method1017(local52).anInt2944;
					if (local214 == 1) {
						local22.anInt2482 = 0;
						local22.anInt2471 = local56;
						local22.anInt2450 = 0;
						local22.anInt2438 = 0;
					}
					if (local214 == 2) {
						local22.anInt2450 = 0;
					}
				} else if (local52 == -1 || local22.anInt2458 == -1 || Static57.method1017(local52).anInt2941 >= Static57.method1017(local22.anInt2458).anInt2941) {
					local22.anInt2458 = local52;
					local22.anInt2471 = local56;
					local22.anInt2435 = local22.anInt2440;
					local22.anInt2438 = 0;
					local22.anInt2482 = 0;
					local22.anInt2450 = 0;
				}
			}
			if ((local26 & 0x4) != 0) {
				local22.anInt2480 = Static86.aClass5_Sub11_Sub1_12.method1549();
				local22.anInt2465 = Static86.aClass5_Sub11_Sub1_12.method1549();
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt2459 = Static86.aClass5_Sub11_Sub1_12.method1529();
				local52 = Static86.aClass5_Sub11_Sub1_12.method1540();
				local22.anInt2433 = 0;
				local22.anInt2432 = local52 >> 16;
				local22.anInt2476 = (local52 & 0xFFFF) + Static95.anInt2285;
				local22.anInt2464 = 0;
				if (local22.anInt2459 == 65535) {
					local22.anInt2459 = -1;
				}
				if (local22.anInt2476 > Static95.anInt2285) {
					local22.anInt2464 = -1;
				}
			}
			if ((local26 & 0x80) != 0) {
				local22.aClass5_Sub1_Sub16_1 = Static56.method994(Static86.aClass5_Sub11_Sub1_12.method1539());
				local22.anInt2448 = local22.aClass5_Sub1_Sub16_1.anInt2794;
				local22.anInt2485 = local22.aClass5_Sub1_Sub16_1.anInt2817;
				local22.anInt2487 = local22.aClass5_Sub1_Sub16_1.anInt2822;
				local22.anInt2453 = local22.aClass5_Sub1_Sub16_1.anInt2802;
				local22.anInt2443 = local22.aClass5_Sub1_Sub16_1.anInt2818;
				local22.anInt2439 = local22.aClass5_Sub1_Sub16_1.anInt2806;
				local22.anInt2478 = local22.aClass5_Sub1_Sub16_1.anInt2803;
				local22.anInt2475 = local22.aClass5_Sub1_Sub16_1.anInt2819;
				local22.anInt2479 = local22.aClass5_Sub1_Sub16_1.anInt2821;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
	public static void method151(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub7 local6 = (Class5_Sub7) Static71.aClass57_10.method1575((long) arg0);
		if (local6 != null) {
			local6.method2002();
		}
	}
}
