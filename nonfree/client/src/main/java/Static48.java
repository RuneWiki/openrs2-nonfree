import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!pa;")
	public static Class51 aClass51_28;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "J")
	public static long aLong33;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_605 = Static2.method66("K");

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_602 = aClass39_605;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[B")
	public static byte[] aByteArray11 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_603 = aClass39_605;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_604 = Static2.method66("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static int anInt1342 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method911() {
		@Pc(18) int local18 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 + Static39.anInt1168;
		@Pc(23) int local23 = Static7.anInt138 + Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899;
		if (Static45.anInt1238 - local18 < -500 || Static45.anInt1238 - local18 > 500 || Static10.anInt251 - local23 < -500 || Static10.anInt251 - local23 > 500) {
			Static45.anInt1238 = local18;
			Static10.anInt251 = local23;
		}
		@Pc(59) int local59 = 0;
		if (local18 != Static45.anInt1238) {
			Static45.anInt1238 += (local18 - Static45.anInt1238) / 16;
		}
		@Pc(79) int local79 = Static45.anInt1238 >> 7;
		if (local23 != Static10.anInt251) {
			Static10.anInt251 += (local23 - Static10.anInt251) / 16;
		}
		@Pc(94) int local94 = Static10.anInt251 >> 7;
		if (Static60.aBooleanArray10[96]) {
			Static87.anInt2326 += (-Static87.anInt2326 - 24) / 2;
		} else if (Static60.aBooleanArray10[97]) {
			Static87.anInt2326 += (24 - Static87.anInt2326) / 2;
		} else {
			Static87.anInt2326 /= 2;
		}
		if (Static60.aBooleanArray10[98]) {
			Static15.anInt2852 += (12 - Static15.anInt2852) / 2;
		} else if (Static60.aBooleanArray10[99]) {
			Static15.anInt2852 += (-Static15.anInt2852 - 12) / 2;
		} else {
			Static15.anInt2852 /= 2;
		}
		Static107.anInt2653 += Static15.anInt2852 / 2;
		if (Static107.anInt2653 < 128) {
			Static107.anInt2653 = 128;
		}
		if (Static107.anInt2653 > 383) {
			Static107.anInt2653 = 383;
		}
		Static101.anInt2748 = Static87.anInt2326 / 2 + Static101.anInt2748 & 0x7FF;
		@Pc(194) int local194 = Static51.method1779(Static10.anInt251, Static45.anInt1238, Static18.anInt560);
		@Pc(216) int local216;
		if (local79 > 3 && local94 > 3 && local79 < 100 && local94 < 100) {
			for (local216 = local79 - 4; local216 <= local79 + 4; local216++) {
				for (@Pc(222) int local222 = local94 - 4; local222 <= local94 + 4; local222++) {
					@Pc(226) int local226 = Static18.anInt560;
					if (local226 < 3 && (Static96.aByteArrayArrayArray8[1][local216][local222] & 0x2) == 2) {
						local226++;
					}
					@Pc(254) int local254 = local194 - Static22.anIntArrayArrayArray3[local226][local216][local222];
					if (local254 > local59) {
						local59 = local254;
					}
				}
			}
		}
		local216 = local59 * 192;
		if (local216 > 98048) {
			local216 = 98048;
		}
		if (local216 < 32768) {
			local216 = 32768;
		}
		if (Static83.anInt2261 < local216) {
			Static83.anInt2261 += (local216 - Static83.anInt2261) / 24;
		} else if (local216 < Static83.anInt2261) {
			Static83.anInt2261 += (local216 - Static83.anInt2261) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lclient!ke;")
	public static Class39 method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return Static71.aClass39_899;
		} else if (local8 < -6) {
			return Static10.aClass39_115;
		} else if (local8 < -3) {
			return Static64.aClass39_833;
		} else if (local8 < 0) {
			return Static72.aClass39_913;
		} else if (local8 > 9) {
			return Static42.aClass39_536;
		} else if (local8 > 6) {
			return Static46.aClass39_567;
		} else if (local8 > 3) {
			return Static2.aClass39_37;
		} else if (local8 > 0) {
			return Static53.aClass39_643;
		} else {
			return Static44.aClass39_547;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!da;")
	public static Class2_Sub1_Sub5 method916(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) Static61.aClass54_17.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static22.aClass36_16.method1761(6, arg0);
		local10 = new Class2_Sub1_Sub5();
		local10.anInt557 = arg0;
		if (local25 != null) {
			local10.method423(new Class2_Sub5(local25));
		}
		local10.method417();
		if (local10.aBoolean27) {
			local10.aBoolean31 = false;
			local10.aBoolean30 = false;
		}
		Static61.aClass54_17.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method918() {
		aClass39_603 = null;
		aClass39_602 = null;
		aClass39_604 = null;
		aClass51_28 = null;
		aByteArray11 = null;
		aClass39_605 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!ta;Lclient!ld;)V")
	public static void method919(@OriginalArg(0) int arg0, @OriginalArg(2) Class36_Sub1 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.aClass42_1 = arg2;
		local7.anInt1926 = 1;
		local7.aClass36_Sub1_15 = arg1;
		local7.aLong82 = arg0;
		@Pc(22) Class34 local22 = Static41.aClass34_21;
		synchronized (Static41.aClass34_21) {
			Static41.aClass34_21.method876(local7);
		}
		Static86.method1632();
	}
}
