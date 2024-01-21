import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Lclient!we;")
	public static Class62 aClass62_16;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Lclient!te;")
	public static Class75 aClass75_55 = new Class75(64);

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "Lclient!na;")
	private static Class53 aClass53_892 = Static109.method1737("purple:");

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_890 = aClass53_892;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "Lclient!na;")
	public static Class53 aClass53_891 = aClass53_892;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Lclient!na;")
	private static Class53 aClass53_893 = Static109.method1737("Hide");

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "Lclient!na;")
	private static Class53 aClass53_894 = Static109.method1737("wishes to trade with you)3");

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	public static int anInt1980 = 0;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "Lclient!na;")
	public static Class53 aClass53_895 = Static109.method1737("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_896 = Static109.method1737("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lclient!na;")
	private static Class53 aClass53_901 = Static109.method1737("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_897 = aClass53_901;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "[I")
	public static int[] anIntArray262 = new int[5];

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "[Lclient!bf;")
	public static Class10[] aClass10Array1 = new Class10[16];

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_898 = aClass53_893;

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
	public static int anInt1981 = 0;

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Lclient!te;")
	public static Class75 aClass75_56 = new Class75(50);

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "Lclient!na;")
	private static Class53 aClass53_899 = Static109.method1737("Remove");

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lclient!na;")
	public static Class53 aClass53_900 = aClass53_899;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!na;")
	public static Class53 aClass53_902 = aClass53_894;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lclient!na;")
	private static Class53 aClass53_903 = Static109.method1737(" million");

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_904 = aClass53_903;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
	public static int anInt1982 = 0;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "Lclient!na;")
	private static Class53 aClass53_906 = Static109.method1737("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_905 = aClass53_906;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method1379() {
		aClass53_902 = null;
		aClass53_894 = null;
		aClass53_897 = null;
		aClass53_892 = null;
		aClass53_893 = null;
		aClass75_56 = null;
		aClass53_899 = null;
		aClass75_55 = null;
		aClass53_903 = null;
		aClass53_900 = null;
		aClass53_901 = null;
		aClass53_904 = null;
		aClass53_896 = null;
		aClass53_891 = null;
		aClass53_906 = null;
		anIntArray262 = null;
		aClass53_905 = null;
		aClass53_895 = null;
		aClass10Array1 = null;
		aClass62_16 = null;
		aClass53_898 = null;
		aClass53_890 = null;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public static void method1381() {
		aClass75_55.method1724();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZIII)V")
	public static void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static100.aClass3_Sub1_Sub5_Sub3Array9[0].method813(arg4, arg2);
		Static100.aClass3_Sub1_Sub5_Sub3Array9[1].method813(arg4, arg2 + arg0 - 16);
		Static84.method1316(arg4, arg2 + 16, 16, arg0 - 32, Static65.anInt1659);
		@Pc(34) int local34 = arg0 * (arg0 - 32) / arg1;
		if (local34 < 8) {
			local34 = 8;
		}
		@Pc(57) int local57 = (arg0 - local34 - 32) * arg3 / (arg1 - arg0);
		Static84.method1316(arg4, local57 + arg2 + 16, 16, local34, Static22.anInt719);
		Static84.method1311(arg4, arg2 + local57 + 16, local34, Static87.anInt2089);
		Static84.method1311(arg4 + 1, local57 + 16 + arg2, local34, Static87.anInt2089);
		Static84.method1322(arg4, local57 + arg2 + 16, 16, Static87.anInt2089);
		Static84.method1322(arg4, arg2 + local57 + 17, 16, Static87.anInt2089);
		Static84.method1311(arg4 + 15, arg2 + 16 + local57, local34, Static51.anInt1330);
		Static84.method1311(arg4 + 14, arg2 - -17 + local57, local34 - 1, Static51.anInt1330);
		Static84.method1322(arg4, local34 + local57 + arg2 + 15, 16, Static51.anInt1330);
		Static84.method1322(arg4 + 1, local57 + 14 + (arg2 - -local34), 15, Static51.anInt1330);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
	public static void method1384() {
		for (@Pc(18) Class3_Sub1_Sub4_Sub2 local18 = (Class3_Sub1_Sub4_Sub2) Static31.aClass11_3.method189(); local18 != null; local18 = (Class3_Sub1_Sub4_Sub2) Static31.aClass11_3.method187()) {
			if (Static72.anInt1813 != local18.anInt850 || local18.anInt855 < Static27.anInt843) {
				local18.method1962();
			} else if (Static27.anInt843 >= local18.anInt838) {
				if (local18.anInt836 > 0) {
					@Pc(50) Class3_Sub1_Sub4_Sub1_Sub1 local50 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local18.anInt836 - 1];
					if (local50 != null && local50.anInt1424 >= 0 && local50.anInt1424 < 13312 && local50.anInt1427 >= 0 && local50.anInt1427 < 13312) {
						local18.method521(Static27.anInt843, Static77.method1355(local50.anInt1427, local18.anInt850, local50.anInt1424) - local18.anInt845, local50.anInt1427, local50.anInt1424);
					}
				}
				if (local18.anInt836 < 0) {
					@Pc(102) int local102 = -local18.anInt836 - 1;
					@Pc(113) Class3_Sub1_Sub4_Sub1_Sub2 local113;
					if (Static78.anInt1959 == local102) {
						local113 = Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1;
					} else {
						local113 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local102];
					}
					if (local113 != null && local113.anInt1424 >= 0 && local113.anInt1424 < 13312 && local113.anInt1427 >= 0 && local113.anInt1427 < 13312) {
						local18.method521(Static27.anInt843, Static77.method1355(local113.anInt1427, local18.anInt850, local113.anInt1424) - local18.anInt845, local113.anInt1427, local113.anInt1424);
					}
				}
				local18.method519(Static37.anInt2215);
				Static120.aClass39_1.method987(Static72.anInt1813, (int) local18.aDouble6, (int) local18.aDouble3, (int) local18.aDouble8, 60, local18, local18.anInt833, -1, false);
			}
		}
	}
}
