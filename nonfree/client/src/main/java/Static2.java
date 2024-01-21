import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lclient!ve;")
	public static Class2_Sub2_Sub17 aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!aa", name = "cb", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
	public static int anInt38;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "Lclient!ic;")
	public static Class2_Sub10 aClass2_Sub10_3 = new Class2_Sub10(new byte[5000]);

	@OriginalMember(owner = "client!aa", name = "X", descriptor = "Lclient!u;")
	private static Class74 aClass74_22 = Static72.method1077("M");

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "Lclient!u;")
	public static Class74 aClass74_23 = Static72.method1077("rot:");

	@OriginalMember(owner = "client!aa", name = "Z", descriptor = "[I")
	public static int[] anIntArray6 = new int[128];

	@OriginalMember(owner = "client!aa", name = "kb", descriptor = "Lclient!u;")
	private static Class74 aClass74_29 = Static72.method1077("Click to continue");

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_24 = aClass74_29;

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
	public static final int anInt39 = 5063219;

	@OriginalMember(owner = "client!aa", name = "fb", descriptor = "Lclient!u;")
	private static Class74 aClass74_25 = Static72.method1077("Examine");

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
	public static int anInt40 = 0;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_26 = aClass74_22;

	@OriginalMember(owner = "client!aa", name = "ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_27 = aClass74_25;

	@OriginalMember(owner = "client!aa", name = "jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_28 = Static72.method1077(":duelreq:");

	@OriginalMember(owner = "client!aa", name = "lb", descriptor = "Lclient!u;")
	public static Class74 aClass74_30 = Static72.method1077("Einloggen");

	@OriginalMember(owner = "client!aa", name = "nb", descriptor = "Lclient!u;")
	public static Class74 aClass74_31 = Static72.method1077(": ");

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!ff;")
	public static Class2_Sub2_Sub7 method18(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub7 local6 = (Class2_Sub2_Sub7) Static75.aClass16_58.method490((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static82.aClass26_20.method1358(arg0, 3);
		local6 = new Class2_Sub2_Sub7();
		if (local20 != null) {
			local6.method616(new Class2_Sub10(local20));
		}
		Static75.aClass16_58.method492(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)Lclient!rb;")
	public static Class2_Sub2_Sub14 method19(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub14 local10 = (Class2_Sub2_Sub14) Static87.aClass16_46.method490((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static112.aClass26_29.method1358(arg0, 6);
		local10 = new Class2_Sub2_Sub14();
		local10.anInt2267 = arg0;
		if (local27 != null) {
			local10.method1562(new Class2_Sub10(local27));
		}
		local10.method1560();
		if (local10.aBoolean96) {
			local10.anInt2242 = 0;
			local10.aBoolean93 = false;
		}
		Static87.aClass16_46.method492(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(II)V")
	public static void method20(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static52.method874(Static65.aClass74_1014, Static10.aClass74_279, Static64.aClass74_1001);
		} else if (arg0 == -2) {
			Static52.method874(Static55.aClass74_430, Static10.aClass74_289, Static10.aClass74_268);
		} else if (arg0 == -1) {
			Static52.method874(Static65.aClass74_1008, Static10.aClass74_263, Static107.aClass74_1498);
		} else if (arg0 == 3) {
			Static52.method874(Static66.aClass74_1020, Static10.aClass74_281, Static10.aClass74_254);
		} else if (arg0 == 4) {
			Static52.method874(Static42.aClass74_701, Static10.aClass74_287, Static68.aClass74_1054);
		} else if (arg0 == 5) {
			Static52.method874(Static113.aClass74_1550, Static10.aClass74_280, Static9.aClass74_222);
		} else if (arg0 == 6) {
			Static52.method874(Static30.aClass74_565, Static10.aClass74_277, Static37.aClass74_1326);
		} else if (arg0 == 7) {
			Static52.method874(Static20.aClass74_457, Static10.aClass74_288, Static20.aClass74_463);
		} else if (arg0 == 8) {
			Static52.method874(Static56.aClass74_954, Static10.aClass74_257, Static42.aClass74_704);
		} else if (arg0 == 9) {
			Static52.method874(Static54.aClass74_936, Static10.aClass74_285, Static34.aClass74_620);
		} else if (arg0 == 10) {
			Static52.method874(Static19.aClass74_445, Static10.aClass74_286, Static42.aClass74_705);
		} else if (arg0 == 11) {
			Static52.method874(Static56.aClass74_955, Static10.aClass74_265, Static36.aClass74_653);
		} else if (arg0 == 12) {
			Static52.method874(Static126.aClass74_1709, Static10.aClass74_282, Static124.aClass74_1665);
		} else if (arg0 == 13) {
			Static52.method874(Static65.aClass74_1018, Static10.aClass74_296, Static63.aClass74_995);
		} else if (arg0 == 14) {
			Static52.method874(Static30.aClass74_568, Static10.aClass74_262, Static40.aClass74_687);
		} else if (arg0 == 16) {
			Static52.method874(Static32.aClass74_600, Static10.aClass74_266, Static66.aClass74_1024);
		} else if (arg0 == 17) {
			Static52.method874(Static114.aClass74_1552, Static10.aClass74_264, Static103.aClass74_1479);
		} else if (arg0 == 18) {
			Static52.method874(Static117.aClass74_1583, Static10.aClass74_270, Static20.aClass74_465);
		} else if (arg0 == 19) {
			Static52.method874(Static128.aClass74_1742, Static20.aClass74_461, Static111.aClass74_1539);
		} else if (arg0 == 20) {
			Static52.method874(Static65.aClass74_1016, Static10.aClass74_259, Static68.aClass74_1051);
		} else if (arg0 == 22) {
			Static52.method874(Static107.aClass74_1495, Static10.aClass74_252, Static86.aClass74_1250);
		} else if (arg0 == 23) {
			Static52.method874(Static30.aClass74_562, Static10.aClass74_275, Static119.aClass74_1596);
		} else if (arg0 == 24) {
			Static52.method874(Static81.aClass74_1222, Static10.aClass74_294, Static38.aClass74_675);
		} else if (arg0 == 25) {
			Static52.method874(Static65.aClass74_1010, Static10.aClass74_258, Static57.aClass74_968);
		} else if (arg0 == 26) {
			Static52.method874(Static78.aClass74_1185, Static10.aClass74_260, Static68.aClass74_1049);
		} else if (arg0 == 27) {
			Static52.method874(Static55.aClass74_434, Static10.aClass74_271, Static10.aClass74_290);
		} else {
			Static52.method874(Static65.aClass74_1006, Static10.aClass74_256, Static11.aClass74_302);
		}
		Static106.method1597(10);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public static void method21() {
		aClass74_26 = null;
		aClass74_29 = null;
		anIntArray6 = null;
		aClass74_24 = null;
		aClass74_22 = null;
		aClass2_Sub10_3 = null;
		aClass74_31 = null;
		aClass2_Sub2_Sub17_1 = null;
		aClass74_30 = null;
		aClass74_23 = null;
		aClass74_28 = null;
		aClass74_25 = null;
		aClass2_Sub2_Sub1_Sub1Array1 = null;
		aClass74_27 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B[BI)I")
	public static int method22(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static77.method1204(arg0, arg1, 0);
	}
}
