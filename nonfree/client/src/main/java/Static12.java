import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!kc;")
	public static Class37 aClass37_7;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt362 = 0;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!mc;")
	private static Class42 aClass42_205 = Static23.method501("Connection timed out)3");

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!mc;")
	private static Class42 aClass42_213 = Static23.method501("To");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_206 = aClass42_213;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!kc;")
	public static Class37 aClass37_6 = new Class37(20);

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_207 = Static23.method501("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_208 = aClass42_205;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "[I")
	public static int[] anIntArray35 = new int[128];

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_209 = Static23.method501("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!mc;")
	private static Class42 aClass42_210 = Static23.method501("Select");

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_211 = Static23.method501("scrollbar");

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_212 = Static23.method501("Classic");

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_214 = aClass42_210;

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "Lclient!mc;")
	public static Class42 aClass42_215 = Static23.method501("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!mc;")
	public static Class42 aClass42_216 = Static23.method501("null");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method271(@OriginalArg(0) Class1_Sub1_Sub8_Sub1 arg0) {
		if (arg0.anInt2577 == 0) {
			return;
		}
		@Pc(31) int local31;
		@Pc(38) int local38;
		if (arg0.anInt2590 != -1 && arg0.anInt2590 < 32768) {
			@Pc(22) Class1_Sub1_Sub8_Sub1_Sub1 local22 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[arg0.anInt2590];
			if (local22 != null) {
				local31 = arg0.anInt2576 - local22.anInt2576;
				local38 = arg0.anInt2583 - local22.anInt2583;
				if (local31 != 0 || local38 != 0) {
					arg0.anInt2606 = (int) (Math.atan2((double) local31, (double) local38) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt2590 >= 32768) {
			local71 = arg0.anInt2590 - 32768;
			if (local71 == Static75.anInt1420) {
				local71 = 2047;
			}
			@Pc(80) Class1_Sub1_Sub8_Sub1_Sub2 local80 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local71];
			if (local80 != null) {
				local38 = arg0.anInt2576 - local80.anInt2576;
				@Pc(96) int local96 = arg0.anInt2583 - local80.anInt2583;
				if (local38 != 0 || local96 != 0) {
					arg0.anInt2606 = (int) (Math.atan2((double) local38, (double) local96) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2587 != 0 || arg0.anInt2554 != 0) && (arg0.anInt2603 == 0 || arg0.anInt2594 > 0)) {
			local71 = arg0.anInt2576 - (arg0.anInt2587 - Static51.anInt1373 - Static51.anInt1373) * 64;
			local31 = arg0.anInt2583 - (arg0.anInt2554 - Static45.anInt1843 - Static45.anInt1843) * 64;
			if (local71 != 0 || local31 != 0) {
				arg0.anInt2606 = (int) (Math.atan2((double) local71, (double) local31) * 325.949D) & 0x7FF;
			}
			arg0.anInt2587 = 0;
			arg0.anInt2554 = 0;
		}
		local71 = arg0.anInt2606 - arg0.anInt2564 & 0x7FF;
		if (local71 == 0) {
			return;
		}
		if (local71 > 1024) {
			arg0.anInt2564 -= arg0.anInt2577;
			if (arg0.anInt2567 == arg0.anInt2563) {
				if (arg0.anInt2579 == -1) {
					arg0.anInt2563 = arg0.anInt2578;
				} else {
					arg0.anInt2563 = arg0.anInt2579;
				}
			}
		} else {
			arg0.anInt2564 += arg0.anInt2577;
			if (arg0.anInt2567 == arg0.anInt2563) {
				if (arg0.anInt2585 == -1) {
					arg0.anInt2563 = arg0.anInt2578;
				} else {
					arg0.anInt2563 = arg0.anInt2585;
				}
			}
		}
		if (arg0.anInt2577 > local71 || 2048 - arg0.anInt2577 < local71) {
			arg0.anInt2564 = arg0.anInt2606;
		}
		arg0.anInt2564 &= 0x7FF;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Lclient!kb;")
	public static Class1_Sub1_Sub10 method272(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub10 local10 = (Class1_Sub1_Sub10) Static92.aClass37_26.method982((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static27.aClass33_9.method1305(arg0, 3);
		local10 = new Class1_Sub1_Sub10();
		if (local20 != null) {
			local10.method965(new Class1_Sub8(local20));
		}
		Static92.aClass37_26.method981((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method273() {
		Static2.aClass37_2.method976();
		Static38.aClass37_15.method976();
		Static88.aClass37_23.method976();
		Static2.aClass37_1.method976();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method274() {
		Static67.aClass37_19.method976();
		Static18.aClass37_9.method976();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public static void method275() {
		@Pc(7) Class42 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static83.anInt2216; local9++) {
			if (Static36.aClass42Array6[local9].method1050(Static28.aClass42_438) != -1) {
				local7 = Static36.aClass42Array6[local9].method1051(Static36.aClass42Array6[local9].method1050(Static28.aClass42_438));
				break;
			}
		}
		if (local7 == null) {
			Static97.method1699();
			return;
		}
		@Pc(49) int local49 = Static91.anInt2407;
		if (local49 < 0) {
			local49 = 0;
		}
		@Pc(55) int local55 = Static81.anInt2119;
		if (local55 > 190) {
			local55 = 190;
		}
		@Pc(62) int local62 = Static50.anInt1724;
		@Pc(64) int local64 = Static27.anInt792;
		Static55.method1129(local49, local62, local55, local64, 6116423);
		Static55.method1129(local49 + 1, local62 - -1, local55 - 2, 16, 0);
		Static55.method1138(local49 + 1, local62 + 18, local55 - 2, local64 + -19, 0);
		Static3.aClass1_Sub1_Sub1_Sub3_1.method807(local7, local49 + 3, local62 + 14, 6116423, false);
		@Pc(111) int local111 = Static73.anInt1884;
		@Pc(113) int local113 = Static38.anInt948;
		if (Static73.anInt1891 == 0) {
			local111 -= 4;
			local113 -= 4;
		}
		if (Static73.anInt1891 == 1) {
			local113 -= 205;
			local111 -= 553;
		}
		if (Static73.anInt1891 == 2) {
			local113 -= 357;
			local111 -= 17;
		}
		for (@Pc(134) int local134 = 0; local134 < Static83.anInt2216; local134++) {
			@Pc(150) int local150 = local62 + (Static83.anInt2216 - local134 - 1) * 15 + 31;
			@Pc(152) int local152 = 16777215;
			@Pc(156) Class42 local156 = Static36.aClass42Array6[local134];
			if (local156.method1032(local7)) {
				local156 = local156.method1053(0, local156.method1027() - local7.method1027());
				if (local156.method1032(Static3.aClass42_81)) {
					local156 = local156.method1053(0, local156.method1027() - Static3.aClass42_81.method1027());
				}
			}
			if (local49 < local111 && local55 + local49 > local111 && local150 - 13 < local113 && local150 + 3 > local113) {
				local152 = 16776960;
			}
			Static3.aClass1_Sub1_Sub1_Sub3_1.method807(local156, local49 + 3, local150, local152, true);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)V")
	public static void method276() {
		Static92.aClass37_26.method976();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!p;ILclient!be;)V")
	public static void method277(@OriginalArg(1) Class33_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8 arg2) {
		@Pc(7) Class1_Sub9 local7 = new Class1_Sub9();
		local7.aClass8_2 = arg2;
		local7.aLong83 = arg1;
		local7.aClass33_Sub1_13 = arg0;
		local7.anInt1408 = 1;
		@Pc(22) Class22 local22 = Static72.aClass22_11;
		synchronized (Static72.aClass22_11) {
			Static72.aClass22_11.method512(local7);
		}
		Static80.method1481();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V")
	public static void method278(@OriginalArg(0) int arg0) {
		if (arg0 == Static91.anInt2400) {
			return;
		}
		if (Static91.anInt2400 == 0) {
			Static84.method1535();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static49.anInt1281 = 0;
			Static3.anInt119 = 0;
			Static68.anInt1657 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static107.aClass47_32 != null) {
			Static107.aClass47_32.method1338();
		}
		if (Static91.anInt2400 == 25 || Static91.anInt2400 == 40) {
			Static6.method120();
			Static55.method1135();
		}
		if (Static91.anInt2400 == 25) {
			Static11.anInt344 = 1;
			Static90.anInt2395 = 0;
			Static80.anInt2110 = 0;
			Static46.anInt1212 = 0;
			Static18.anInt611 = 1;
		}
		if (arg0 == 35) {
			Static68.method1169();
			Static74.method1336();
			if (Static13.aClass31_11 == null) {
				Static13.aClass31_11 = Static61.method1022(Static89.aCanvas1, 503, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static13.aClass31_11 = null;
			Static68.method1169();
			Static28.method559(Static25.aClass33_Sub1_10, Static89.aCanvas1, Static8.aClass33_Sub1_5);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static13.aClass31_11 = null;
			Static74.method1336();
			Static81.method1484(Static8.aClass33_Sub1_5, Static89.aCanvas1);
		}
		Static91.anInt2400 = arg0;
		Static91.aBoolean134 = true;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
	public static void method279() {
		aClass42_207 = null;
		anIntArray34 = null;
		aClass42_215 = null;
		aClass42_210 = null;
		aClass42_208 = null;
		aClass42_209 = null;
		anIntArray35 = null;
		aClass42_211 = null;
		aClass42_205 = null;
		aClass42_213 = null;
		aClass37_7 = null;
		aClass42_206 = null;
		aClass37_6 = null;
		aClass42_216 = null;
		aClass42_212 = null;
		aClass42_214 = null;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public static void method280() {
		if (Static102.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static43.anIntArray163[186] = 57;
			Static43.anIntArray163[187] = 27;
			Static43.anIntArray163[188] = 71;
			Static43.anIntArray163[189] = 26;
			Static43.anIntArray163[190] = 72;
			Static43.anIntArray163[191] = 73;
			Static43.anIntArray163[192] = 58;
			Static43.anIntArray163[219] = 42;
			Static43.anIntArray163[220] = 74;
			Static43.anIntArray163[221] = 43;
			Static43.anIntArray163[222] = 59;
			Static43.anIntArray163[223] = 28;
			return;
		}
		Static43.anIntArray163[44] = 71;
		Static43.anIntArray163[45] = 26;
		Static43.anIntArray163[46] = 72;
		Static43.anIntArray163[47] = 73;
		Static43.anIntArray163[59] = 57;
		Static43.anIntArray163[61] = 27;
		Static43.anIntArray163[91] = 42;
		Static43.anIntArray163[92] = 74;
		Static43.anIntArray163[93] = 43;
		if (Static102.aMethod1 == null) {
			Static43.anIntArray163[192] = 58;
			Static43.anIntArray163[222] = 59;
		} else {
			Static43.anIntArray163[192] = 28;
			Static43.anIntArray163[222] = 58;
			Static43.anIntArray163[520] = 59;
		}
	}
}
