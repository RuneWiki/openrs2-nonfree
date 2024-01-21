import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array4;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Lclient!fd;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "Lclient!lf;")
	public static Class48 aClass48_26 = new Class48(30);

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Lclient!ic;")
	public static Class34 aClass34_650 = Static56.method816("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "Lclient!ic;")
	private static Class34 aClass34_651 = Static56.method816("wishes to trade with you)3");

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Lclient!ic;")
	public static Class34 aClass34_652 = null;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	public static int anInt1314 = 0;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!ic;")
	public static Class34 aClass34_653 = aClass34_651;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_654 = Static56.method816("Freie Welt");

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI)Lclient!fe;")
	public static Class8_Sub7 method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class8_Sub7 local7 = new Class8_Sub7();
		local7.anInt953 = arg0;
		local7.anInt954 = arg1;
		Static31.aClass7_3.method48(local7, (long) arg2);
		Static127.method1980(arg1);
		Static91.method1323(arg1);
		@Pc(29) Class8_Sub24 local29 = Static113.method1614(arg2);
		if (local29 != null) {
			Static40.method608(local29);
		}
		if (Static126.aClass8_Sub24_8 != null) {
			Static40.method608(Static126.aClass8_Sub24_8);
			Static126.aClass8_Sub24_8 = null;
		}
		Static90.aBoolean14 = false;
		Static96.anInt552 = 0;
		Static125.method1974(Static28.anInt802, Static117.anInt2629, Static109.anInt2499, Static134.anInt3164);
		if (Static107.anInt2463 != -1) {
			Static22.method1598(Static107.anInt2463, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V")
	public static void method746() {
		aClass48_26 = null;
		aClass34_654 = null;
		aClass8_Sub1_Sub3_Sub2Array4 = null;
		aClass34_651 = null;
		aClass25_3 = null;
		aClass34_653 = null;
		aClass34_652 = null;
		aClass34_650 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public static void method748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static1.anInt24 == 2) {
			Static74.method1092(Static91.anInt2198 + (Static133.anInt3059 - Static64.anInt2062 << 7), Static28.anInt803 + (-Static82.anInt1959 + Static67.anInt1664 << 7), Static73.anInt1779 * 2);
			if (Static87.anInt2186 > -1 && Static21.anInt655 % 20 < 10) {
				Static59.aClass8_Sub1_Sub3_Sub3Array24[0].method1587(Static87.anInt2186 + arg1 - 12, Static125.anInt2997 + arg0 - 28);
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
	public static void method749() {
		if (!Static76.aBoolean69) {
			return;
		}
		Static28.anIntArray104 = null;
		Static48.aClass8_Sub1_Sub3_Sub3Array39 = null;
		aClass8_Sub1_Sub3_Sub2Array4 = null;
		Static123.aClass8_Sub1_Sub3_Sub3_7 = null;
		Static21.aClass8_Sub1_Sub3_Sub2Array1 = null;
		Static112.aClass8_Sub1_Sub3_Sub3_4 = null;
		Static80.aClass8_Sub1_Sub3_Sub2Array7 = null;
		Static50.aClass8_Sub1_Sub3_Sub2Array5 = null;
		Static92.anIntArray305 = null;
		Static130.anIntArray407 = null;
		Static111.anIntArray400 = null;
		Static68.anIntArray209 = null;
		Static24.anIntArray247 = null;
		Static77.aClass8_Sub1_Sub3_Sub2_6 = null;
		Static47.aClass8_Sub1_Sub3_Sub2_2 = null;
		Static103.anIntArray327 = null;
		Static81.aClass8_Sub1_Sub3_Sub3_3 = null;
		Static82.anIntArray255 = null;
		Static61.aClass8_Sub1_Sub3_Sub2_4 = null;
		Static117.aClass8_Sub1_Sub3_Sub3_6 = null;
		Static75.aClass8_Sub1_Sub3_Sub2_5 = null;
		Static115.aClass8_Sub1_Sub3_Sub2Array8 = null;
		Static53.method779();
		Static47.method734(true);
		Static76.aBoolean69 = false;
	}
}
