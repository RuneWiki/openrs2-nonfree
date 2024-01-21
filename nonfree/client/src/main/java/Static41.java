import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public static int anInt1196;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	public static int anInt1198;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
	public static int anInt1203;

	@OriginalMember(owner = "client!ic", name = "zb", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "Lclient!v;")
	public static Class62 aClass62_513 = Static45.method753("");

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!v;")
	public static Class62 aClass62_514 = aClass62_513;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Lclient!v;")
	public static Class62 aClass62_515 = Static45.method753(":");

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "Lclient!v;")
	public static Class62 aClass62_516 = aClass62_513;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "Lclient!mc;")
	public static Class43 aClass43_4 = new Class43(32);

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
	public static int anInt1202 = -1;

	@OriginalMember(owner = "client!ic", name = "W", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!v;")
	public static Class62 aClass62_517 = Static45.method753("Welt");

	@OriginalMember(owner = "client!ic", name = "sb", descriptor = "Lclient!v;")
	private static Class62 aClass62_525 = Static45.method753("Unexpected server response: ");

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lclient!v;")
	public static Class62 aClass62_518 = aClass62_525;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_519 = aClass62_513;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lclient!v;")
	public static Class62 aClass62_520 = Static45.method753("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_521 = Static45.method753(" )2>");

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "Lclient!v;")
	public static Class62 aClass62_522 = aClass62_513;

	@OriginalMember(owner = "client!ic", name = "kb", descriptor = "I")
	public static int anInt1209 = 0;

	@OriginalMember(owner = "client!ic", name = "nb", descriptor = "I")
	public static int anInt1211 = 2;

	@OriginalMember(owner = "client!ic", name = "ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_523 = aClass62_513;

	@OriginalMember(owner = "client!ic", name = "pb", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!ic", name = "qb", descriptor = "Lclient!v;")
	public static Class62 aClass62_524 = aClass62_513;

	@OriginalMember(owner = "client!ic", name = "ub", descriptor = "I")
	public static int anInt1213 = -1;

	@OriginalMember(owner = "client!ic", name = "yb", descriptor = "Lclient!v;")
	private static Class62 aClass62_529 = Static45.method753("Login attempts exceeded)3");

	@OriginalMember(owner = "client!ic", name = "vb", descriptor = "Lclient!v;")
	public static Class62 aClass62_526 = aClass62_529;

	@OriginalMember(owner = "client!ic", name = "wb", descriptor = "Lclient!v;")
	private static Class62 aClass62_527 = Static45.method753("Loading title screen )2 ");

	@OriginalMember(owner = "client!ic", name = "xb", descriptor = "Lclient!v;")
	private static Class62 aClass62_528 = Static45.method753("Loaded interfaces");

	@OriginalMember(owner = "client!ic", name = "Ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_530 = Static45.method753("Offline");

	@OriginalMember(owner = "client!ic", name = "Bb", descriptor = "Lclient!v;")
	public static Class62 aClass62_531 = aClass62_528;

	@OriginalMember(owner = "client!ic", name = "Cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_532 = aClass62_527;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lclient!oe;")
	public static Class3_Sub1_Sub11 method705(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub11 local10 = (Class3_Sub1_Sub11) Static50.aClass34_34.method764((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static53.aClass42_39.method1504(12, arg0);
		local10 = new Class3_Sub1_Sub11();
		if (local20 != null) {
			local10.method1216(new Class3_Sub8(local20));
		}
		local10.method1224();
		Static50.aClass34_34.method765((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Lclient!v;")
	public static Class62 method706(@OriginalArg(1) int arg0) {
		@Pc(9) Class62 local9 = Static99.method1662(arg0);
		for (@Pc(15) int local15 = local9.method1688() - 3; local15 > 0; local15 -= 3) {
			local9 = Static49.method782(new Class62[] { local9.method1693(local15, 0), Static18.aClass62_286, local9.method1702(local15) });
		}
		if (local9.method1688() > 8) {
			local9 = Static49.method782(new Class62[] { Static64.aClass62_769, local9.method1693(local9.method1688() - 8, 0), Static70.aClass62_840, Static76.aClass62_903, local9, Static90.aClass62_1087 });
		} else if (local9.method1688() > 4) {
			local9 = Static49.method782(new Class62[] { Static100.aClass62_1119, local9.method1693(local9.method1688() - 4, 0), Static99.aClass62_1207, Static76.aClass62_903, local9, Static90.aClass62_1087 });
		}
		return Static49.method782(new Class62[] { Static56.aClass62_682, local9 });
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public static void method707() {
		if (Static86.aClass14_1 == null) {
			return;
		}
		@Pc(13) long local13 = System.currentTimeMillis();
		if (Static45.aLong37 >= local13) {
			return;
		}
		Static86.aClass14_1.method1871(local13);
		@Pc(27) int local27 = (int) (local13 - Static45.aLong37);
		Static45.aLong37 = local13;
		@Pc(38) Class local38 = dc.class;
		synchronized (dc.class) {
			Static36.anInt1111 += local27 * Static14.anInt545;
			@Pc(55) int local55 = (Static36.anInt1111 - Static14.anInt545 * 2000) / 1000;
			if (local55 > 0) {
				if (Static92.aClass3_Sub4_1 != null) {
					Static92.aClass3_Sub4_1.method1566(local55);
				}
				Static36.anInt1111 -= local55 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public static void method709() {
		aClass62_523 = null;
		aClass62_516 = null;
		aClass62_517 = null;
		aClass43_4 = null;
		aClass62_525 = null;
		aClass62_521 = null;
		aClass62_518 = null;
		aClass62_526 = null;
		aClass62_529 = null;
		aClass62_531 = null;
		anIntArray84 = null;
		aClass62_524 = null;
		aClass62_515 = null;
		aClass62_519 = null;
		aClass62_528 = null;
		aClass62_522 = null;
		aClass62_532 = null;
		aClass62_530 = null;
		aClass62_513 = null;
		aClass62_514 = null;
		aClass62_527 = null;
		aClass62_520 = null;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	public static void method710() {
		Static89.aClass34_29.method762();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZBILclient!jc;)Z")
	public static boolean method711(@OriginalArg(0) boolean arg0, @OriginalArg(3) Class35 arg1) {
		return Static96.method1631(arg1, arg0);
	}
}
