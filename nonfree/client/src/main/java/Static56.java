import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Lclient!ed;")
	public static Class23 aClass23_3;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "Lclient!ae;")
	private static Class5 aClass5_737 = method972("Public chat");

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "Lclient!ae;")
	public static Class5 aClass5_735 = aClass5_737;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "[I")
	public static int[] anIntArray171 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Lclient!ae;")
	public static Class5 aClass5_736 = method972("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	public static int anInt1479 = 0;

	@OriginalMember(owner = "client!kc", name = "cb", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
	public static int anInt1483 = 127;

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "[I")
	public static int[] anIntArray173 = new int[50];

	@OriginalMember(owner = "client!kc", name = "lb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_738 = method972("*6n");

	@OriginalMember(owner = "client!kc", name = "ob", descriptor = "Lclient!ae;")
	public static Class5 aClass5_739 = method972("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!kc", name = "pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_740 = method972(" )2> @yel@");

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ae;ILclient!ae;Lclient!bf;)Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 method965(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(8) int local8 = arg2.method1880(arg0);
		@Pc(19) int local19 = arg2.method1860(local8, arg1);
		return Static74.method1226(arg2, local19, local8);
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)V")
	public static void method966() {
		aClass5_736 = null;
		aClass5_740 = null;
		anIntArray170 = null;
		aClass5_739 = null;
		aClass5_735 = null;
		anIntArray171 = null;
		aClass23_3 = null;
		aClass5_737 = null;
		aLongArray4 = null;
		aClass5_738 = null;
		anIntArray172 = null;
		anIntArray173 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!te;Z)Z")
	public static boolean method968(@OriginalArg(0) Class3_Sub1_Sub17 arg0) {
		@Pc(6) int local6 = arg0.anInt2646;
		if (local6 >= 1 && local6 <= 200 || !(local6 < 701 || local6 > 900)) {
			if (local6 >= 801) {
				local6 -= 701;
			} else if (local6 >= 701) {
				local6 -= 601;
			} else if (local6 >= 101) {
				local6 -= 101;
			} else {
				local6--;
			}
			Static4.method129(0, Static35.aClass5_467, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, Static34.aClass5Array8[local6] }), 0, 2);
			Static4.method129(0, Static5.aClass5_114, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, Static34.aClass5Array8[local6] }), 0, 10);
			return true;
		} else if (local6 >= 401 && local6 <= 500) {
			Static4.method129(0, Static35.aClass5_467, 0, Static75.method1261(new Class5[] { Static36.aClass5_1258, arg0.aClass5_1183 }), 0, 50);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V")
	public static void method970() {
		Static80.aClass9_20.method283();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ae;")
	public static Class5 method972(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(9) int local9 = local2.length;
		@Pc(13) Class5 local13 = new Class5();
		local13.aByteArray1 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local9 > local19) {
			@Pc(27) int local27 = local2[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local9 <= local19) {
					break;
				}
				@Pc(49) int local49 = local2[local19++] & 0xFF;
				local13.aByteArray1[local13.anInt311++] = (byte) (local49 + local27 * 43 - 48 - 1720);
			} else if (local27 != 0) {
				local13.aByteArray1[local13.anInt311++] = (byte) local27;
			}
		}
		local13.method149();
		return local13.method131();
	}

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
	public static void method973() {
		@Pc(13) int local13 = Static48.aClass3_Sub1_Sub2_Sub1_2.method267(Static54.aClass5_710);
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < Static75.anInt1934; local15++) {
			local23 = Static48.aClass3_Sub1_Sub2_Sub1_2.method276(Static49.aClass5Array9[local15]);
			if (local23 > local13) {
				local13 = local23;
			}
		}
		local13 += 8;
		local23 = Static75.anInt1934 * 15 + 21;
		@Pc(72) int local72;
		@Pc(86) int local86;
		if (Static45.anInt1269 > 4 && Static99.anInt2491 > 4 && Static45.anInt1269 < 516 && Static99.anInt2491 < 338) {
			Static58.anInt1603 = 0;
			Static61.anInt1656 = Static75.anInt1934 * 15 + 22;
			Static103.aBoolean142 = true;
			Static15.anInt520 = local13;
			local72 = Static45.anInt1269 - local13 / 2 - 4;
			if (local72 + local13 > 512) {
				local72 = 512 - local13;
			}
			local86 = Static99.anInt2491 - 4;
			if (local86 + local23 > 334) {
				local86 = 334 - local23;
			}
			if (local86 < 0) {
				local86 = 0;
			}
			if (local72 < 0) {
				local72 = 0;
			}
			Static102.anInt2635 = local72;
			Static53.anInt1408 = local86;
		}
		if (Static45.anInt1269 > 553 && Static99.anInt2491 > 205 && Static45.anInt1269 < 743 && Static99.anInt2491 < 466) {
			Static61.anInt1656 = Static75.anInt1934 * 15 + 22;
			Static58.anInt1603 = 1;
			Static103.aBoolean142 = true;
			local72 = Static45.anInt1269 - local13 / 2 - 553;
			local86 = Static99.anInt2491 - 205;
			Static15.anInt520 = local13;
			if (local86 < 0) {
				local86 = 0;
			} else if (local86 + local23 > 261) {
				local86 = 261 - local23;
			}
			Static53.anInt1408 = local86;
			if (local72 < 0) {
				local72 = 0;
			} else if (local13 + local72 > 190) {
				local72 = 190 - local13;
			}
			Static102.anInt2635 = local72;
		}
		if (Static45.anInt1269 <= 17 || Static99.anInt2491 <= 357 || Static45.anInt1269 >= 496 || Static99.anInt2491 >= 453) {
			return;
		}
		Static58.anInt1603 = 2;
		Static103.aBoolean142 = true;
		Static15.anInt520 = local13;
		Static61.anInt1656 = Static75.anInt1934 * 15 + 22;
		local72 = Static45.anInt1269 - local13 / 2 - 17;
		local86 = Static99.anInt2491 - 357;
		if (local86 < 0) {
			local86 = 0;
		} else if (local23 + local86 > 96) {
			local86 = 96 - local23;
		}
		Static53.anInt1408 = local86;
		if (local72 < 0) {
			local72 = 0;
		} else if (local13 + local72 > 479) {
			local72 = 479 - local13;
		}
		Static102.anInt2635 = local72;
	}
}
