import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_896 = Static2.method66("Fertigkeit)2");

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	public static int anInt2019 = 0;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!ke;")
	public static Class39 aClass39_897 = Static2.method66("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_898 = Static2.method66("Side panel redrawn");

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_899 = Static2.method66("@red@");

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public static int anInt2029 = 0;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "Lclient!ke;")
	private static Class39 aClass39_903 = Static2.method66("Loading ignore list");

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_900 = aClass39_903;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!ke;")
	public static Class39 aClass39_901 = Static2.method66(" )2> @yel@");

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	public static int anInt2035 = -1;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "Lclient!ke;")
	public static Class39 aClass39_902 = Static2.method66("::");

	@OriginalMember(owner = "client!ne", name = "E", descriptor = "Lclient!ke;")
	private static Class39 aClass39_904 = Static2.method66("Select");

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "Lclient!ke;")
	public static Class39 aClass39_905 = aClass39_904;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method1463() {
		Static94.aClass51_51.method1970();
		Static26.aClass2_Sub1_Sub4_Sub3_5.method1946(0, 0);
		Static27.anIntArray87 = Static106.method2031(Static27.anIntArray87);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZI)V")
	public static void method1465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static73.anInt2080 = -1;
			Static9.anInt196 = -1;
			return;
		}
		@Pc(38) int local38 = Static51.method1779(arg1, arg2, Static18.anInt560) - arg0;
		@Pc(42) int local42 = local38 - Static5.anInt100;
		@Pc(46) int local46 = arg2 - Static88.anInt1136;
		@Pc(50) int local50 = Static32.anIntArray122[Static64.anInt1897];
		@Pc(54) int local54 = Static32.anIntArray122[Static41.anInt1190];
		@Pc(58) int local58 = Static32.anIntArray129[Static64.anInt1897];
		@Pc(62) int local62 = arg1 - Static41.anInt1188;
		@Pc(66) int local66 = Static32.anIntArray129[Static41.anInt1190];
		@Pc(77) int local77 = local62 * local54 + local66 * local46 >> 16;
		@Pc(88) int local88 = local62 * local66 - local46 * local54 >> 16;
		@Pc(90) int local90 = local77;
		@Pc(100) int local100 = local58 * local42 - local88 * local50 >> 16;
		@Pc(111) int local111 = local42 * local50 + local58 * local88 >> 16;
		if (local111 < 50) {
			Static73.anInt2080 = -1;
			Static9.anInt196 = -1;
		} else {
			Static73.anInt2080 = (local90 << 9) / local111 + 256;
			Static9.anInt196 = (local100 << 9) / local111 + 167;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method1469() {
		aClass39_900 = null;
		aClass39_898 = null;
		aClass39_902 = null;
		aClass39_899 = null;
		aClass39_903 = null;
		aClass39_904 = null;
		anIntArray255 = null;
		aClass39_897 = null;
		aClass39_901 = null;
		aClass39_905 = null;
		anIntArray254 = null;
		aClass39_896 = null;
	}
}
