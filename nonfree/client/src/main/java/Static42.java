import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!he", name = "mb", descriptor = "I")
	public static int anInt1187;

	@OriginalMember(owner = "client!he", name = "vb", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!he", name = "yb", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_541 = Static56.method972("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!he", name = "ib", descriptor = "Lclient!ae;")
	public static Class5 aClass5_542 = Static56.method972("Angreifen");

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_543 = Static56.method972("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!he", name = "lb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_544 = Static56.method972("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
	public static int anInt1188 = -1;

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "[Lclient!v;")
	public static Class3_Sub1_Sub1_Sub6[] aClass3_Sub1_Sub1_Sub6Array1 = new Class3_Sub1_Sub1_Sub6[4];

	@OriginalMember(owner = "client!he", name = "qb", descriptor = "[Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1_Sub1[] aClass3_Sub1_Sub1_Sub1_Sub1Array1 = new Class3_Sub1_Sub1_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
	public static int anInt1190 = 0;

	@OriginalMember(owner = "client!he", name = "ub", descriptor = "Lclient!ae;")
	public static Class5 aClass5_545 = Static56.method972("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!he", name = "wb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_546 = Static56.method972("@or2@");

	@OriginalMember(owner = "client!he", name = "Bb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_547 = Static56.method972("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public static void method801() {
		aClass5_545 = null;
		anIntArrayArray10 = null;
		aClass5_546 = null;
		anIntArray141 = null;
		aClass3_Sub1_Sub1_Sub1_Sub1Array1 = null;
		aClass5_543 = null;
		aClass3_Sub1_Sub1_Sub6Array1 = null;
		aClass5_542 = null;
		anIntArray140 = null;
		aClass5_541 = null;
		aClass5_547 = null;
		aClass5_544 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!da;ZI)V")
	public static void method802(@OriginalArg(0) Class18 arg0, @OriginalArg(1) boolean arg1) {
		if (Static82.aClass18_2 != null) {
			try {
				Static82.aClass18_2.method405();
			} catch (@Pc(8) Exception local8) {
			}
			Static82.aClass18_2 = null;
		}
		Static82.aClass18_2 = arg0;
		Static105.method1750(arg1);
		Static108.aClass3_Sub1_Sub5_1 = null;
		Static45.anInt1270 = 0;
		Static94.aClass3_Sub6_3.anInt2416 = 0;
		Static64.aClass3_Sub6_5 = null;
		while (true) {
			@Pc(38) Class3_Sub1_Sub5 local38 = (Class3_Sub1_Sub5) Static7.aClass21_1.method453();
			if (local38 == null) {
				while (true) {
					local38 = (Class3_Sub1_Sub5) Static23.aClass21_5.method453();
					if (local38 == null) {
						if (Static94.aByte2 != 0) {
							try {
								@Pc(93) Class3_Sub6 local93 = new Class3_Sub6(4);
								local93.method1608(4);
								local93.method1608(Static94.aByte2);
								local93.method1634(0);
								Static82.aClass18_2.method409(local93.aByteArray17, 4);
							} catch (@Pc(114) IOException local114) {
								try {
									Static82.aClass18_2.method405();
								} catch (@Pc(119) Exception local119) {
								}
								Static109.anInt2870++;
								Static82.aClass18_2 = null;
							}
						}
						Static61.anInt1650 = 0;
						Static99.aLong73 = Static3.method125();
						return;
					}
					Static48.aClass56_2.method1542(local38);
					Static47.aClass21_7.method452(local38.aLong85, local38);
					Static62.anInt1664++;
					Static72.anInt1862--;
				}
			}
			Static35.aClass21_6.method452(local38.aLong85, local38);
			Static1.anInt2--;
			Static44.anInt1250++;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!bf;IIZ)Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 method803(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static16.method398(arg2, arg1, arg0) ? Static99.method1663() : null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILclient!te;Lclient!te;)Lclient!te;")
	public static Class3_Sub1_Sub17 method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub17 arg2, @OriginalArg(4) Class3_Sub1_Sub17 arg3) {
		@Pc(23) Class3_Sub1_Sub17 local23 = Static53.method930(arg3.anInt2651, arg0, arg3.anInt2667, Static31.aClass3_Sub1_Sub17ArrayArray3[arg3.anInt2651 >> 16], arg1, arg3.anInt2636, arg3.anInt2600, arg2, 0, 0, arg3.anInt2583);
		if (local23 == null) {
			if (arg3.aClass3_Sub1_Sub17Array1 != null) {
				local23 = Static53.method930(arg3.anInt2651, arg0, arg3.anInt2667, arg3.aClass3_Sub1_Sub17Array1, arg1, arg3.anInt2636, arg3.anInt2600, arg2, 0, 0, arg3.anInt2583);
			}
			return local23;
		} else {
			return local23;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)I")
	public static int method805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub13 local8 = (Class3_Sub13) Static15.aClass21_4.method459((long) arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(33) int local33 = 0; local33 < local8.anIntArray378.length; local33++) {
				if (arg0 == local8.anIntArray379[local33]) {
					local23 += local8.anIntArray378[local33];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IIB)I")
	public static int method806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
