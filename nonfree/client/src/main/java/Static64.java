import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!vb;")
	public static Class60 aClass60_3;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt1567;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!mc;")
	private static Class42 aClass42_826 = Static23.method501("Enter name of friend to add to list");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_825 = aClass42_826;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
	public static int[] anIntArray224 = new int[1000];

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!mc;")
	private static Class42 aClass42_831 = Static23.method501("scroll:");

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!mc;")
	public static Class42 aClass42_827 = aClass42_831;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_828 = Static23.method501("");

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!mc;")
	private static Class42 aClass42_829 = Static23.method501("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public static int anInt1561 = 0;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_830 = aClass42_829;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	public static int anInt1563 = -1;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	public static int anInt1564 = 0;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
	public static int[] anIntArray225 = new int[25];

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_832 = Static23.method501("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!n", name = "z", descriptor = "Lclient!mc;")
	public static Class42 aClass42_833 = Static23.method501("null");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method1094() {
		aClass42_830 = null;
		anIntArray225 = null;
		aClass42_828 = null;
		aClass42_827 = null;
		aClass42_825 = null;
		anIntArray224 = null;
		aClass60_3 = null;
		aClass42_826 = null;
		aClass42_829 = null;
		aClass42_832 = null;
		aClass42_833 = null;
		aClass42_831 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)Z")
	public static boolean method1095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(29) Class1_Sub1_Sub9 local29 = Static42.method1755(arg0);
		return local29.method875(arg1);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(JI)Lclient!mc;")
	public static Class42 method1096(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(49) byte[] local49 = new byte[local32];
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local32--;
				local49[local32] = Static59.aByteArray28[(int) (local52 - arg0 * 37L)];
			}
			@Pc(77) Class42 local77 = new Class42();
			local77.aByteArray17 = local49;
			local77.anInt1468 = local49.length;
			return local77;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1097() {
		if (Static91.aBoolean134) {
			Static91.aBoolean134 = false;
			Static63.method1076();
			Static28.aBoolean41 = true;
			Static45.aBoolean100 = true;
			Static89.aBoolean132 = true;
			Static23.aBoolean33 = true;
		}
		Static10.method256();
		if (Static10.aBoolean13 && Static73.anInt1891 == 1) {
			Static89.aBoolean132 = true;
		}
		if (Static29.anInt819 != -1) {
			@Pc(36) boolean local36 = Static48.method861(Static29.anInt819);
			if (local36) {
				Static89.aBoolean132 = true;
			}
		}
		if (Static37.anInt921 == 2) {
			Static89.aBoolean132 = true;
		}
		if (Static30.anInt828 == 2) {
			Static89.aBoolean132 = true;
		}
		if (Static89.aBoolean132) {
			Static89.aBoolean132 = false;
			Static46.method853();
		}
		@Pc(112) int local112;
		if (Static108.anInt2745 == -1) {
			Static92.aClass1_Sub1_Sub12_1.anInt2152 = Static39.anInt416 - Static4.anInt125 - 77;
			if (Static73.anInt1884 > 448 && Static73.anInt1884 < 560 && Static38.anInt948 > 332) {
				Static38.method645(463, Static73.anInt1884 - 17, Static38.anInt948 + -357, Static39.anInt416, Static92.aClass1_Sub1_Sub12_1, -1, 77, 0);
			}
			local112 = Static39.anInt416 - Static92.aClass1_Sub1_Sub12_1.anInt2152 - 77;
			if (local112 < 0) {
				local112 = 0;
			}
			if (local112 > Static39.anInt416 - 77) {
				local112 = Static39.anInt416 - 77;
			}
			if (local112 != Static4.anInt125) {
				Static28.aBoolean41 = true;
				Static4.anInt125 = local112;
			}
		}
		if (Static108.anInt2745 == -1 && Static106.anInt2737 == 3) {
			Static92.aClass1_Sub1_Sub12_1.anInt2152 = Static87.anInt2275;
			local112 = Static7.anInt233 * 14 + 7;
			if (Static73.anInt1884 > 448 && Static73.anInt1884 < 560 && Static38.anInt948 > 332) {
				Static38.method645(463, Static73.anInt1884 - 17, Static38.anInt948 + -357, local112, Static92.aClass1_Sub1_Sub12_1, -1, 77, 0);
			}
			@Pc(187) int local187 = Static92.aClass1_Sub1_Sub12_1.anInt2152;
			if (local187 < 0) {
				local187 = 0;
			}
			if (local187 > local112 - 77) {
				local187 = local112 - 77;
			}
			if (Static87.anInt2275 != local187) {
				Static28.aBoolean41 = true;
				Static87.anInt2275 = local187;
			}
		}
		if (Static108.anInt2745 != -1) {
			@Pc(218) boolean local218 = Static48.method861(Static108.anInt2745);
			if (local218) {
				Static28.aBoolean41 = true;
			}
		}
		if (Static37.anInt921 == 3) {
			Static28.aBoolean41 = true;
		}
		if (Static30.anInt828 == 3) {
			Static28.aBoolean41 = true;
		}
		if (Static25.aClass42_396 != null) {
			Static28.aBoolean41 = true;
		}
		if (Static10.aBoolean13 && Static73.anInt1891 == 2) {
			Static28.aBoolean41 = true;
		}
		if (Static28.aBoolean41) {
			Static28.aBoolean41 = false;
			Static79.method1444();
		}
		Static27.method544();
		if (Static36.anInt903 != -1) {
			Static23.aBoolean33 = true;
		}
		if (Static23.aBoolean33) {
			if (Static36.anInt903 != -1 && Static36.anInt903 == Static108.anInt2748) {
				Static36.anInt903 = -1;
				Static98.aClass1_Sub8_Sub1_3.method1236(30);
				Static98.aClass1_Sub8_Sub1_3.method1185(Static108.anInt2748);
			}
			Static23.aBoolean33 = false;
			Static48.aBoolean68 = true;
			Static104.method1820(Static29.anInt819 == -1, Static27.anInt768 % 20 < 10 ? -1 : Static36.anInt903, Static10.anIntArray33, Static108.anInt2748);
		}
		if (Static45.aBoolean100) {
			Static48.aBoolean68 = true;
			Static45.aBoolean100 = false;
			Static106.method1845(Static59.anInt1999, Static30.anInt834, Static95.aClass1_Sub1_Sub1_Sub3_3, Static63.anInt1526);
		}
		Static17.method422(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583, Static59.anInt1992, Static82.anInt2165);
		Static59.anInt1992 = 0;
	}
}
