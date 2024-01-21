import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!ug;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!f;")
	public static Class13 aClass13_5;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!b;")
	public static Class7 aClass7_6 = new Class7(500);

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!sd;")
	private static Class73 aClass73_398 = Static122.method531("Jan");

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_399 = Static122.method531("Jul");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_400 = Static122.method531("Dec");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_401 = Static122.method531("Nov");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_402 = Static122.method531("Oct");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!sd;")
	private static Class73 aClass73_403 = Static122.method531("Feb");

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
	public static int anInt715 = 0;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_404 = Static122.method531("Apr");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_405 = Static122.method531("Mar");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_406 = Static122.method531("Aug");

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!sd;")
	private static Class73 aClass73_407 = Static122.method531("Sep");

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_408 = Static122.method531("Jun");

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_409 = Static122.method531("May");

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_411 = Static122.method531("Ok");

	@OriginalMember(owner = "client!client", name = "yb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_410 = aClass73_411;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array7 = new Class73[] { aClass73_398, aClass73_403, aClass73_405, aClass73_404, aClass73_409, aClass73_408, aClass73_399, aClass73_406, aClass73_407, aClass73_402, aClass73_401, aClass73_400 };

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method541() {
		if (!Static169.aBoolean245) {
			Static11.aClass73Array3[0] = Static28.aClass73_430;
			Static142.anInt3262 = 1;
			Static176.anIntArray419[0] = 1003;
			Static162.aClass73Array24[0] = Static173.aClass73_2030;
		}
		if (Static133.anInt3052 != -1) {
			Static87.method1529(Static133.anInt3052);
		}
		for (@Pc(29) int local29 = 0; local29 < Static81.anInt1818; local29++) {
			if (Static27.aBooleanArray3[local29]) {
				Static84.aBooleanArray7[local29] = true;
			}
			Static139.aBooleanArray9[local29] = Static27.aBooleanArray3[local29];
			Static27.aBooleanArray3[local29] = false;
		}
		Static83.anInt1856 = Static44.anInt1024;
		Static58.anInt1371 = -1;
		Static131.anInt2984 = -1;
		Static9.aClass83_2 = null;
		if (Static133.anInt3052 != -1) {
			Static81.anInt1818 = 0;
			Static4.method50(765, Static133.anInt3052, 503, 0, 0, -1, 0, 0);
		}
		Static15.method2307();
		Static12.method191();
		if (Static169.aBoolean245) {
			Static72.method1261();
		} else if (Static58.anInt1371 != -1) {
			Static60.method1109(Static131.anInt2984, Static58.anInt1371);
		}
		if (Static20.anInt540 == 3) {
			for (@Pc(109) int local109 = 0; local109 < Static81.anInt1818; local109++) {
				if (Static139.aBooleanArray9[local109]) {
					Static15.method2302(Static72.anIntArray176[local109], Static163.anIntArray325[local109], Static19.anIntArray47[local109], Static34.anIntArray78[local109], 16711935, 128);
				} else if (Static84.aBooleanArray7[local109]) {
					Static15.method2302(Static72.anIntArray176[local109], Static163.anIntArray325[local109], Static19.anIntArray47[local109], Static34.anIntArray78[local109], 16711680, 128);
				}
			}
		}
		Static75.method1290(Static147.anInt3309, Static165.anInt320, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159);
		Static165.anInt320 = 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
	public static void method542(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static107.anInt2468 >= 100) {
			Static135.method2234(0, Static181.aClass73_2111, Static173.aClass73_2030);
			return;
		}
		@Pc(29) Class73 local29 = Static168.method2643(arg0).method2451();
		for (@Pc(31) int local31 = 0; local31 < Static107.anInt2468; local31++) {
			if (arg0 == Static63.aLongArray1[local31]) {
				Static135.method2234(0, Static19.method372(new Class73[] { local29, Static127.aClass73_359 }), Static173.aClass73_2030);
				return;
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static166.anInt3619; local75++) {
			if (arg0 == Static138.aLongArray5[local75]) {
				Static135.method2234(0, Static19.method372(new Class73[] { Static122.aClass73_394, local29, Static134.aClass73_1703 }), Static173.aClass73_2030);
				return;
			}
		}
		if (local29.method2430(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521)) {
			Static135.method2234(0, Static139.aClass73_1299, Static173.aClass73_2030);
			return;
		}
		Static63.aLongArray1[Static107.anInt2468] = arg0;
		Static116.aClass73Array18[Static107.anInt2468++] = Static168.method2643(arg0);
		Static116.anInt2760 = Static84.anInt1893;
		Static139.aClass3_Sub12_Sub1_3.method1400(201);
		Static139.aClass3_Sub12_Sub1_3.method1382(arg0);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method544() {
		aClass73_411 = null;
		aClass73_410 = null;
		aClass7_6 = null;
		aClass73_404 = null;
		aClass10_1 = null;
		aClass73_401 = null;
		aClass73_398 = null;
		aClass13_5 = null;
		aClass73_399 = null;
		aClass73_408 = null;
		aClass73_407 = null;
		aClass73_402 = null;
		aClass73_406 = null;
		aClass73_409 = null;
		aClass73_405 = null;
		aClass73_400 = null;
		aClass73_403 = null;
		aClass73Array7 = null;
	}
}
