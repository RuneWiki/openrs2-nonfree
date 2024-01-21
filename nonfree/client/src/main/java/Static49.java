import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!ge;")
	public static Class7 aClass7_29;

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!b;")
	public static Class6_Sub2 aClass6_Sub2_1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!i", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_802 = Static80.method1463("");

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_789 = aClass63_802;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt1513 = -1;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!rd;")
	private static Class63 aClass63_793 = Static80.method1463("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_790 = aClass63_793;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Lclient!rd;")
	private static Class63 aClass63_801 = Static80.method1463("No reply from loginserver)3");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_791 = aClass63_801;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[S")
	public static short[] aShortArray7 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!rd;")
	private static Class63 aClass63_792 = Static80.method1463("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_794 = aClass63_802;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_795 = aClass63_802;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_796 = aClass63_802;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!rd;")
	private static Class63 aClass63_797 = Static80.method1463("cyan:");

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_798 = aClass63_792;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_799 = aClass63_802;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_800 = aClass63_797;

	@OriginalMember(owner = "client!i", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_803 = aClass63_797;

	@OriginalMember(owner = "client!i", name = "v", descriptor = "Z")
	public static volatile boolean aBoolean75 = false;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "Lclient!rd;")
	public static Class63 aClass63_804 = Static80.method1463("Sprites geladen)3");

	@OriginalMember(owner = "client!i", name = "y", descriptor = "Lclient!rd;")
	public static Class63 aClass63_805 = aClass63_802;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method1037() {
		@Pc(7) int local7 = Static115.anInt3132;
		@Pc(9) int local9 = Static40.anInt2113;
		@Pc(16) int local16 = Static90.anInt2542;
		@Pc(20) int local20 = Static71.anInt2035;
		Static121.method1976(local7, local9, local20, local16, 6116423);
		Static121.method1976(local7 + 1, local9 + 1, local20 - 2, 16, 0);
		Static121.method1974(local7 + 1, local9 - -18, local20 - 2, local16 - 19, 0);
		Static114.aClass6_Sub3_Sub3_Sub1_4.method456(Static14.aClass63_324, local7 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Static59.anInt1768;
		@Pc(66) int local66 = Static102.anInt2823;
		if (Static19.anInt634 == 0) {
			local64 -= 4;
			local66 -= 4;
		}
		if (Static19.anInt634 == 1) {
			local66 -= 553;
			local64 -= 205;
		}
		if (Static19.anInt634 == 2) {
			local64 -= 357;
			local66 -= 17;
		}
		for (@Pc(84) int local84 = 0; local84 < Static18.anInt569; local84++) {
			@Pc(88) int local88 = 16777215;
			@Pc(100) int local100 = (Static18.anInt569 - local84 - 1) * 15 + local9 + 31;
			if (local66 > local7 && local66 < local7 + local20 && local100 - 13 < local64 && local64 < local100 + 3) {
				local88 = 16776960;
			}
			Static114.aClass6_Sub3_Sub3_Sub1_4.method440(Static31.aClass63Array7[local84], local7 + 3, local100, local88, true);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!wa;)Lclient!wa;")
	public static Class6_Sub3_Sub17 method1038(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		@Pc(14) Class6_Sub3_Sub17 local14 = Static44.method970(arg0);
		if (local14 == null) {
			local14 = arg0.aClass6_Sub3_Sub17_5;
		}
		return local14;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V")
	public static void method1039() {
		aClass63_792 = null;
		aClass63_804 = null;
		aClass63_797 = null;
		aClass63_791 = null;
		aClass63_803 = null;
		aClass63_802 = null;
		aClass63_799 = null;
		aClass63_794 = null;
		aClass63_789 = null;
		aShortArray7 = null;
		aLongArray2 = null;
		aClass63_795 = null;
		aClass6_Sub2_1 = null;
		aClass63_801 = null;
		aClass63_796 = null;
		aClass63_798 = null;
		aClass7_29 = null;
		aClass63_793 = null;
		aClass63_790 = null;
		aClass63_800 = null;
		aClass63_805 = null;
	}
}
