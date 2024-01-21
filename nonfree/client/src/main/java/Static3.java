import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!t;")
	public static Class2_Sub17 aClass2_Sub17_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!be;")
	public static Class2_Sub4 aClass2_Sub4_4;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public static int anInt106;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!pe;")
	private static Class65 aClass65_49 = Static119.method1462("Select a world");

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!pe;")
	public static Class65 aClass65_47 = aClass65_49;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!bc;")
	public static Class8 aClass8_6 = new Class8(128);

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_48 = Static119.method1462(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!bc;")
	public static Class8 aClass8_7 = new Class8(64);

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_50 = Static119.method1462("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[I")
	public static int[] anIntArray11 = new int[1000];

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!pe;")
	public static Class65 aClass65_51 = Static119.method1462("scape main");

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_52 = Static119.method1462("titlebox");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method67() {
		aClass2_Sub17_1 = null;
		aClass65_52 = null;
		aClass65_51 = null;
		aClass8_6 = null;
		aClass8_7 = null;
		aClass65_48 = null;
		aClass65_49 = null;
		aClass65_47 = null;
		anIntArray11 = null;
		aClass2_Sub4_4 = null;
		aClass65_50 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BZZ)I")
	public static int method68() {
		return Static7.anInt224 + Static47.anInt1163;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBII)Lclient!lc;")
	public static Class2_Sub7 method71(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub7 local16 = new Class2_Sub7();
		local16.anInt1526 = arg2;
		local16.anInt1527 = arg0;
		Static112.aClass40_21.method849(local16, (long) arg1);
		Static126.method1927(arg0);
		Static12.method244(arg0);
		@Pc(38) Class2_Sub22 local38 = Static35.method645(arg1);
		if (local38 != null) {
			Static116.method1853(local38);
		}
		if (Static101.aClass2_Sub22_12 != null) {
			Static116.method1853(Static101.aClass2_Sub22_12);
			Static101.aClass2_Sub22_12 = null;
		}
		aBoolean5 = false;
		Static49.anInt1205 = 0;
		Static7.method151(Static15.anInt372, Static45.anInt1093, Static56.anInt1421, Static75.anInt2326);
		if (Static17.anInt384 != -1) {
			Static30.method607(1, Static17.anInt384);
		}
		return local16;
	}
}
