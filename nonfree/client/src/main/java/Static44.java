import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!h", name = "Sb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray38;

	@OriginalMember(owner = "client!h", name = "qc", descriptor = "Lclient!we;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_739 = Static80.method1463("logo");

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_741 = Static80.method1463("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "Lclient!rd;")
	public static Class63 aClass63_740 = aClass63_741;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "[I")
	public static int[] anIntArray157 = new int[2000];

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "Lclient!mb;")
	public static Class49 aClass49_13 = new Class49(64);

	@OriginalMember(owner = "client!h", name = "Xb", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!h", name = "ac", descriptor = "I")
	public static final int anInt1391 = 50;

	@OriginalMember(owner = "client!h", name = "kc", descriptor = "I")
	public static int anInt1399 = 0;

	@OriginalMember(owner = "client!h", name = "pc", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
	public static void method953() {
		aClass63_739 = null;
		aClass63_741 = null;
		anIntArray157 = null;
		aByteArrayArrayArray38 = null;
		aClass78_1 = null;
		aClass49_13 = null;
		aBooleanArray8 = null;
		aClass63_740 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method956(@OriginalArg(1) Class7 arg0) {
		Static68.aClass7_39 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(JI)V")
	public static void method957(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static92.anInt2592 >= 100) {
			Static46.method996(Static111.aClass63_1661, 0, Static49.aClass63_790);
			return;
		}
		@Pc(27) Class63 local27 = Static24.method578(arg0).method1814();
		for (@Pc(29) int local29 = 0; local29 < Static92.anInt2592; local29++) {
			if (arg0 == Static92.aLongArray5[local29]) {
				Static46.method996(Static111.aClass63_1661, 0, Static15.method374(new Class63[] { local27, Static75.aClass63_1098 }));
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static5.anInt52; local68++) {
			if (arg0 == Static49.aLongArray2[local68]) {
				Static46.method996(Static111.aClass63_1661, 0, Static15.method374(new Class63[] { Static39.aClass63_678, local27, Static90.aClass63_1328 }));
				return;
			}
		}
		if (!local27.method1819(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass63_1237)) {
			Static92.aLongArray5[Static92.anInt2592++] = arg0;
			Static10.aBoolean20 = true;
			Static23.aClass6_Sub4_Sub1_4.method1347(103);
			Static23.aClass6_Sub4_Sub1_4.method1331(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V")
	public static void method958() {
		@Pc(3) Class63 local3 = null;
		for (@Pc(9) int local9 = 0; local9 < Static18.anInt569; local9++) {
			if (Static31.aClass63Array7[local9].method1805(Static36.aClass63_646) != -1) {
				local3 = Static31.aClass63Array7[local9].method1806(Static31.aClass63Array7[local9].method1805(Static36.aClass63_646));
				break;
			}
		}
		if (local3 == null) {
			Static49.method1037();
			return;
		}
		@Pc(43) int local43 = Static115.anInt3132;
		@Pc(45) int local45 = Static40.anInt2113;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(51) int local51 = Static71.anInt2035;
		if (local51 > 190) {
			local51 = 190;
		}
		@Pc(58) int local58 = Static90.anInt2542;
		Static121.method1976(local43, local45, local51, local58, 6116423);
		Static121.method1976(local43 + 1, local45 + 1, local51 - 2, 16, 0);
		Static121.method1974(local43 + 1, local45 + 18, local51 - 2, local58 + -19, 0);
		Static114.aClass6_Sub3_Sub3_Sub1_4.method440(local3, local43 + 3, local45 + 14, 6116423, false);
		@Pc(109) int local109 = Static59.anInt1768;
		@Pc(111) int local111 = Static102.anInt2823;
		if (Static19.anInt634 == 0) {
			local109 -= 4;
			local111 -= 4;
		}
		if (Static19.anInt634 == 1) {
			local111 -= 553;
			local109 -= 205;
		}
		if (Static19.anInt634 == 2) {
			local111 -= 17;
			local109 -= 357;
		}
		for (@Pc(134) int local134 = 0; local134 < Static18.anInt569; local134++) {
			@Pc(149) int local149 = (Static18.anInt569 - local134 - 1) * 15 + local45 + 31;
			@Pc(151) int local151 = 16777215;
			if (local111 > local43 && local51 + local43 > local111 && local109 > local149 - 13 && local149 + 3 > local109) {
				local151 = 16776960;
			}
			@Pc(179) Class63 local179 = Static31.aClass63Array7[local134];
			if (local179.method1821(local3)) {
				local179 = local179.method1820(local179.method1811() - local3.method1811(), 0);
				if (local179.method1821(Static33.aClass63_608)) {
					local179 = local179.method1820(local179.method1811() - Static33.aClass63_608.method1811(), 0);
				}
			}
			Static114.aClass6_Sub3_Sub3_Sub1_4.method440(local179, local43 + 3, local149, local151, true);
		}
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
	public static void method959() {
		if (Static97.aClass10_2 != null) {
			Static97.aClass10_2.method1726();
		}
		if (Static54.aClass10_1 != null) {
			Static54.aClass10_1.method1726();
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V")
	public static void method960() {
		for (@Pc(12) int local12 = 0; local12 < Static43.anInt129; local12++) {
			@Pc(18) int local18 = Static112.anIntArray355[local12];
			@Pc(22) Class6_Sub3_Sub1_Sub2_Sub2 local22 = Static78.aClass6_Sub3_Sub1_Sub2_Sub2Array1[local18];
			@Pc(26) int local26 = Static88.aClass6_Sub4_Sub1_5.method1321();
			if ((local26 & 0x40) != 0) {
				local26 += Static88.aClass6_Sub4_Sub1_5.method1321() << 8;
			}
			Static88.method1595(local22, local18, local26);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!rd;Lclient!rd;Lclient!ge;IZI)V")
	public static void method963(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(4) int local4 = arg2.method91(arg1);
		@Pc(18) int local18 = arg2.method107(local4, arg0);
		Static47.method1028(arg2, local4, local18, 255);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!wa;Z)Lclient!wa;")
	public static Class6_Sub3_Sub17 method970(@OriginalArg(0) Class6_Sub3_Sub17 arg0) {
		@Pc(11) int local11 = Static11.method1325(Static82.method1498(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < local11; local22++) {
			arg0 = Static12.method339(arg0.anInt3274);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
