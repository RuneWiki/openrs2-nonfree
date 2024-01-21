import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ke", name = "Xc", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_507 = Static129.method2060("Hidden)2use");

	@OriginalMember(owner = "client!ke", name = "V", descriptor = "Lclient!ge;")
	public static Class29 aClass29_18 = new Class29(64);

	@OriginalMember(owner = "client!ke", name = "sc", descriptor = "Lclient!wf;")
	public static Class83 aClass83_2 = new Class83();

	@OriginalMember(owner = "client!ke", name = "Sc", descriptor = "B")
	public static byte aByte5 = 0;

	@OriginalMember(owner = "client!ke", name = "ad", descriptor = "[Lclient!m;")
	public static Class5_Sub2_Sub2_Sub3_Sub1[] aClass5_Sub2_Sub2_Sub3_Sub1Array1 = new Class5_Sub2_Sub2_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!ke", name = "bd", descriptor = "Lclient!r;")
	public static Class61 aClass61_512 = Static129.method2060(")1");

	@OriginalMember(owner = "client!ke", name = "cd", descriptor = "[I")
	public static int[] anIntArray248 = new int[5];

	@OriginalMember(owner = "client!ke", name = "dd", descriptor = "I")
	public static int anInt1683 = 1;

	@OriginalMember(owner = "client!ke", name = "ed", descriptor = "J")
	public static long aLong55 = 0L;

	@OriginalMember(owner = "client!ke", name = "gd", descriptor = "[I")
	public static int[] anIntArray249 = new int[50];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!r;)Z")
	public static boolean method1118(@OriginalArg(1) Class61 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static45.anInt1203; local9++) {
			if (arg0.method1709(Static1.aClass61Array1[local9])) {
				return true;
			}
		}
		return arg0.method1709(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.aClass61_877);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
	public static void method1122() {
		anIntArray249 = null;
		anIntArray248 = null;
		aClass83_2 = null;
		aClass61_507 = null;
		aByteArrayArray7 = null;
		aClass29_18 = null;
		aClass61_512 = null;
		aClass5_Sub2_Sub2_Sub3_Sub1Array1 = null;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1123() {
		Static76.anInt1870 = 0;
		Static83.anInt2281 = 0;
		Static71.method1179();
		Static28.method616();
		Static49.method883();
		Static120.method1904();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static76.anInt1870; local19++) {
			local25 = Static2.anIntArray1[local19];
			if (Static58.anInt1422 != Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local25].anInt2900) {
				Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local25] = null;
			}
		}
		if (Static80.anInt2057 != Static47.aClass5_Sub14_Sub1_2.anInt2199) {
			throw new RuntimeException("gpp1 pos:" + Static47.aClass5_Sub14_Sub1_2.anInt2199 + " psize:" + Static80.anInt2057);
		}
		for (local25 = 0; local25 < Static92.anInt2219; local25++) {
			if (Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[Static66.anIntArray236[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static92.anInt2219);
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
	public static void method1126(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static24.method503(Static127.aClass61_1059, Static83.aClass61_659, Static44.aClass61_342);
		} else if (arg0 == -2) {
			Static24.method503(Static127.aClass61_1045, Static127.aClass61_1032, Static8.aClass61_75);
		} else if (arg0 == -1) {
			Static24.method503(Static127.aClass61_1025, Static115.aClass61_909, Static44.aClass61_351);
		} else if (arg0 == 3) {
			Static24.method503(Static127.aClass61_1040, Static127.aClass61_1046, Static91.aClass61_710);
		} else if (arg0 == 4) {
			Static24.method503(Static127.aClass61_1027, Static31.aClass61_289, Static124.aClass61_985);
		} else if (arg0 == 5) {
			Static24.method503(Static127.aClass61_1028, Static95.aClass61_724, Static43.aClass61_341);
		} else if (arg0 == 6) {
			Static24.method503(Static127.aClass61_1053, Static17.aClass61_169, Static66.aClass61_502);
		} else if (arg0 == 7) {
			Static24.method503(Static127.aClass61_1044, Static113.aClass61_891, Static39.aClass61_315);
		} else if (arg0 == 8) {
			Static24.method503(Static127.aClass61_1021, Static64.aClass61_815, Static91.aClass61_712);
		} else if (arg0 == 9) {
			Static24.method503(Static127.aClass61_1056, Static95.aClass61_725, Static83.aClass61_656);
		} else if (arg0 == 10) {
			Static24.method503(Static127.aClass61_1054, Static64.aClass61_818, Static107.aClass61_839);
		} else if (arg0 == 11) {
			Static24.method503(Static127.aClass61_1050, Static92.aClass61_644, Static105.aClass61_1083);
		} else if (arg0 == 12) {
			Static24.method503(Static127.aClass61_1036, Static13.aClass61_121, Static109.aClass61_846);
		} else if (arg0 == 13) {
			Static24.method503(Static127.aClass61_1052, Static87.aClass61_685, Static44.aClass61_350);
		} else if (arg0 == 14) {
			Static24.method503(Static127.aClass61_1019, Static75.aClass61_555, Static62.aClass61_475);
		} else if (arg0 == 16) {
			Static24.method503(Static127.aClass61_1023, Static134.aClass61_1097, Static12.aClass61_110);
		} else if (arg0 == 17) {
			Static24.method503(Static127.aClass61_1039, Static114.aClass61_898, Static22.aClass61_203);
		} else if (arg0 == 18) {
			Static24.method503(Static127.aClass61_1049, Static26.aClass61_182, Static42.aClass61_333);
		} else if (arg0 == 19) {
			Static24.method503(Static39.aClass61_316, Static10.aClass61_90, Static64.aClass61_821);
		} else if (arg0 == 20) {
			Static24.method503(Static127.aClass61_1030, Static108.aClass61_36, Static44.aClass61_343);
		} else if (arg0 == 22) {
			Static24.method503(Static127.aClass61_1029, Static101.aClass61_795, Static48.aClass61_376);
		} else if (arg0 == 23) {
			Static24.method503(Static127.aClass61_1026, Static74.aClass61_544, Static62.aClass61_478);
		} else if (arg0 == 24) {
			Static24.method503(Static127.aClass61_1041, Static132.aClass61_1090, Static59.aClass61_458);
		} else if (arg0 == 25) {
			Static24.method503(Static127.aClass61_1033, Static30.aClass61_275, Static44.aClass61_347);
		} else if (arg0 == 26) {
			Static24.method503(Static127.aClass61_1051, Static108.aClass61_31, Static33.aClass61_303);
		} else if (arg0 == 27) {
			Static24.method503(Static127.aClass61_1035, Static127.aClass61_1034, Static29.aClass61_273);
		} else {
			Static24.method503(Static127.aClass61_1022, Static37.aClass61_307, Static44.aClass61_344);
		}
		Static36.method697(10);
	}
}
