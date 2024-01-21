import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
	public static int[] anIntArray71;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt890 = 0;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "Lclient!gg;")
	private static Class28 aClass28_544 = Static107.method1838("This computers address has been blocked");

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_543 = aClass28_544;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_545 = Static107.method1838("welle:");

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "Lclient!gg;")
	public static Class28 aClass28_546 = Static107.method1838("headicons_prayer");

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
	public static int method608(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local14 >> 12;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static179.anInt4042; local7++) {
			if (Static90.anIntArray221[local7] + Static27.anIntArray264[local7] > arg2 && Static27.anIntArray264[local7] < arg2 + arg3 && arg1 < Static91.anIntArray223[local7] + Static101.anIntArray29[local7] && Static101.anIntArray29[local7] < arg1 + arg0) {
				Static123.aBooleanArray17[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Lclient!eg;")
	public static Class2_Sub4_Sub7 method611(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub4_Sub7 local6 = (Class2_Sub4_Sub7) Static154.aClass14_174.method603((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static15.aClass40_6.method1771(13, arg0);
		local6 = new Class2_Sub4_Sub7();
		local6.anInt1226 = arg0;
		if (local20 != null) {
			local6.method889(new Class2_Sub2(local20));
		}
		Static154.aClass14_174.method607((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	public static void method618() {
		aClass28_546 = null;
		aClass28_543 = null;
		anIntArray71 = null;
		aClass28_545 = null;
		aClass28_544 = null;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
	public static boolean method619() {
		try {
			if (Static43.anInt1114 == 2) {
				if (Static22.aClass2_Sub25_1 == null) {
					Static22.aClass2_Sub25_1 = Static187.method2728(Static49.aClass40_14, Static90.anInt2314, Static135.anInt3102);
					if (Static22.aClass2_Sub25_1 == null) {
						return false;
					}
				}
				if (Static99.aClass39_1 == null) {
					Static99.aClass39_1 = new Class39(Static88.aClass40_26, Static130.aClass40_32);
				}
				if (Static164.aClass2_Sub8_Sub1_2.method778(Static99.aClass39_1, Static171.aClass40_37, Static22.aClass2_Sub25_1)) {
					Static164.aClass2_Sub8_Sub1_2.method794();
					Static164.aClass2_Sub8_Sub1_2.method782(Static94.anInt2360);
					Static164.aClass2_Sub8_Sub1_2.method783(Static22.aClass2_Sub25_1, Static84.aBoolean104);
					Static43.anInt1114 = 0;
					Static99.aClass39_1 = null;
					Static22.aClass2_Sub25_1 = null;
					Static49.aClass40_14 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static164.aClass2_Sub8_Sub1_2.method779();
			Static22.aClass2_Sub25_1 = null;
			Static99.aClass39_1 = null;
			Static43.anInt1114 = 0;
			Static49.aClass40_14 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)Z")
	public static boolean method621(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
