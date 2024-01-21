import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_804 = Static38.method685("Loading )2 please wait)3");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_801 = aClass6_804;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!ai;")
	private static Class6 aClass6_802 = Static38.method685(" from your ignore list first)3");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	public static int anInt2796 = 0;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_803 = Static38.method685("huffman");

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_805 = Static38.method685("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!dd;")
	public static Class17 aClass17_15 = new Class17(64);

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_806 = aClass6_802;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	public static int anInt2798 = 0;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
	public static int[] anIntArray238 = new int[500];

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_807 = Static38.method685("Abbrechen");

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[5];

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_808 = Static38.method685("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	public static void method1873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class84 local11 = Static27.aClass84ArrayArrayArray1[Static36.anInt1020][arg1][arg0];
		if (local11 == null) {
			Static30.aClass44_1.method1281(Static36.anInt1020, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub3_Sub5_Sub2 local23 = null;
		@Pc(28) Class2_Sub3_Sub5_Sub2 local28;
		for (local28 = (Class2_Sub3_Sub5_Sub2) local11.method2694(); local28 != null; local28 = (Class2_Sub3_Sub5_Sub2) local11.method2697()) {
			@Pc(34) Class2_Sub3_Sub10 local34 = Static92.method1502(local28.anInt1025);
			@Pc(37) int local37 = local34.anInt2016;
			if (local34.anInt2000 == 1) {
				local37 *= local28.anInt1018 + 1;
			}
			if (local37 > local21) {
				local23 = local28;
				local21 = local37;
			}
		}
		if (local23 == null) {
			Static30.aClass44_1.method1281(Static36.anInt1020, arg1, arg0);
			return;
		}
		local11.method2702(local23);
		@Pc(76) Class2_Sub3_Sub5_Sub2 local76 = null;
		@Pc(78) Class2_Sub3_Sub5_Sub2 local78 = null;
		for (local28 = (Class2_Sub3_Sub5_Sub2) local11.method2694(); local28 != null; local28 = (Class2_Sub3_Sub5_Sub2) local11.method2697()) {
			if (local23.anInt1025 != local28.anInt1025) {
				if (local78 == null) {
					local78 = local28;
				}
				if (local28.anInt1025 != local78.anInt1025 && local76 == null) {
					local76 = local28;
				}
			}
		}
		@Pc(122) int local122 = arg1 + (arg0 << 7) + 1610612736;
		Static30.aClass44_1.method1251(Static36.anInt1020, arg1, arg0, Static131.method2041(arg1 * 128 + 64, arg0 * 128 + 64, Static36.anInt1020), local23, local122, local78, local76);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)V")
	public static void method1874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static34.anInt997 == 0 || arg1 == 0 || Static122.anInt2842 >= 50) {
			return;
		}
		Static162.anIntArray377[Static122.anInt2842] = arg2;
		Static158.anIntArray360[Static122.anInt2842] = arg1;
		Static143.anIntArray297[Static122.anInt2842] = arg0;
		Static126.aClass86Array1[Static122.anInt2842] = null;
		Static152.anIntArray350[Static122.anInt2842] = 0;
		Static122.anInt2842++;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method1875() {
		aClass6_807 = null;
		aClass6_804 = null;
		aClass6_808 = null;
		aBooleanArray9 = null;
		aClass17_15 = null;
		aClass6_806 = null;
		anIntArray238 = null;
		aClass6_801 = null;
		aClass6_803 = null;
		aClass6_805 = null;
		aBooleanArray8 = null;
		aClass6_802 = null;
	}
}
