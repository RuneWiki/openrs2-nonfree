import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!jd;")
	public static Class11 aClass11_79;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public static int anInt1854;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
	public static int anInt1855;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!na;")
	public static Class5_Sub9_Sub1 aClass5_Sub9_Sub1_2 = new Class5_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!mb;")
	public static Class45 aClass45_785 = Static63.method1251("Abbrechen");

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!mb;")
	private static Class45 aClass45_787 = Static63.method1251("Close");

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!mb;")
	public static Class45 aClass45_786 = aClass45_787;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[I")
	public static int[] anIntArray282 = new int[] { 0, 0, 4, 10, 6, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 6, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 2, 0, 1, 1, 0, 0, 0, 0, 11, 4, 0, 5, 0, 0, 0, 0, 15, 0, 0, 0, 6, 0, 0, 4, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 5, 7, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 6, -1, 0, 2, 3, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 14, 0, 3, 1, 0, -2, 0, 2, -2, 0, 0, -2, 4, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 6, 8, 2, 0, 0, 8, 6, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, -1, 0, 0, 0, 0, 4, 0, 2, 0, 0, 0, -2, 2, 0, 0, 0, -2, 0, 0, 4, 0, 0, 4, -2, -1, 1, 0, 0, 6, 2, 0, 3, 0, 0, 0, 0, 7, 0, 2, 0, 0, 0, 0, 0, 2, 4, 6, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 5, 0, 6 };

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_788 = Static63.method1251(")3");

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
	public static int[] anIntArray283 = new int[2048];

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public static int anInt1856 = 1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1258() {
		Static25.aClass67_8.method1819();
		Static105.aClass67_24.method1819();
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public static void method1259() {
		aClass45_786 = null;
		aClass45_785 = null;
		aClass5_Sub9_Sub1_2 = null;
		anIntArray283 = null;
		aClass45_787 = null;
		anIntArray282 = null;
		aClass45_788 = null;
		aClass11_79 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public static void method1260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static23.anInt776 = -1;
			Static16.anInt504 = -1;
			return;
		}
		@Pc(32) int local32 = Static32.method676(arg2, arg1, Static8.anInt262) - arg0;
		@Pc(36) int local36 = arg1 - Static46.anInt1334;
		@Pc(40) int local40 = Class5_Sub2_Sub6_Sub2.anIntArray360[Static38.anInt1089];
		@Pc(44) int local44 = arg2 - Static25.anInt791;
		@Pc(48) int local48 = local32 - Static50.anInt1602;
		@Pc(55) int local55 = Class5_Sub2_Sub6_Sub2.anIntArray362[Static38.anInt1089];
		@Pc(59) int local59 = Class5_Sub2_Sub6_Sub2.anIntArray362[Static56.anInt1690];
		@Pc(63) int local63 = Class5_Sub2_Sub6_Sub2.anIntArray360[Static56.anInt1690];
		@Pc(73) int local73 = local44 * local59 + local36 * local63 >> 16;
		@Pc(83) int local83 = local59 * local36 - local44 * local63 >> 16;
		@Pc(85) int local85 = local73;
		@Pc(96) int local96 = local48 * local55 - local83 * local40 >> 16;
		@Pc(106) int local106 = local83 * local55 + local48 * local40 >> 16;
		if (local106 >= 50) {
			Static23.anInt776 = (local96 << 9) / local106 + 167;
			Static16.anInt504 = (local85 << 9) / local106 + 256;
		} else {
			Static16.anInt504 = -1;
			Static23.anInt776 = -1;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ge;IB)V")
	public static void method1261(@OriginalArg(0) Class29_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static104.aClass5_Sub9_4 == null) {
			Static112.method2061(0, (byte) 0, null, 255, 255, true);
			Static29.aClass29_Sub1Array1[arg1] = arg0;
		} else {
			Static104.aClass5_Sub9_4.anInt2140 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static104.aClass5_Sub9_4.method1434();
			arg0.method769(local16);
		}
	}
}
