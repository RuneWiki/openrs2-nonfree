import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!de", name = "R", descriptor = "Lclient!rd;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_285 = Static109.method1737("Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!ke;")
	public static Class43 aClass43_1 = new Class43();

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public static int anInt733 = 0;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!na;")
	private static Class53 aClass53_286 = Static109.method1737("May");

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Lclient!na;")
	private static Class53 aClass53_287 = Static109.method1737("Apr");

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!na;")
	private static Class53 aClass53_291 = Static109.method1737(" more options");

	@OriginalMember(owner = "client!de", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_288 = aClass53_291;

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Lclient!na;")
	private static Class53 aClass53_289 = Static109.method1737("Oct");

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Lclient!na;")
	private static Class53 aClass53_290 = Static109.method1737(" seconds)3");

	@OriginalMember(owner = "client!de", name = "F", descriptor = "Lclient!na;")
	private static Class53 aClass53_292 = Static109.method1737("Mar");

	@OriginalMember(owner = "client!de", name = "G", descriptor = "Lclient!na;")
	public static Class53 aClass53_293 = aClass53_290;

	@OriginalMember(owner = "client!de", name = "H", descriptor = "Lclient!na;")
	private static Class53 aClass53_294 = Static109.method1737("Feb");

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Lclient!na;")
	private static Class53 aClass53_295 = Static109.method1737("Jun");

	@OriginalMember(owner = "client!de", name = "J", descriptor = "Lclient!na;")
	public static Class53 aClass53_296 = Static109.method1737("au");

	@OriginalMember(owner = "client!de", name = "S", descriptor = "Lclient!na;")
	private static Class53 aClass53_301 = Static109.method1737("Jan");

	@OriginalMember(owner = "client!de", name = "L", descriptor = "Lclient!na;")
	private static Class53 aClass53_297 = Static109.method1737("Jul");

	@OriginalMember(owner = "client!de", name = "M", descriptor = "Lclient!na;")
	private static Class53 aClass53_298 = Static109.method1737("Aug");

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!na;")
	private static Class53 aClass53_302 = Static109.method1737("Sep");

	@OriginalMember(owner = "client!de", name = "P", descriptor = "Lclient!na;")
	private static Class53 aClass53_300 = Static109.method1737("Nov");

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!na;")
	private static Class53 aClass53_299 = Static109.method1737("Dec");

	@OriginalMember(owner = "client!de", name = "K", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array6 = new Class53[] { aClass53_301, aClass53_294, aClass53_292, aClass53_287, aClass53_286, aClass53_295, aClass53_297, aClass53_298, aClass53_302, aClass53_289, aClass53_300, aClass53_299 };

	@OriginalMember(owner = "client!de", name = "O", descriptor = "I")
	public static int anInt737 = 0;

	@OriginalMember(owner = "client!de", name = "U", descriptor = "I")
	public static int anInt738 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
	public static boolean method400(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public static void method401() {
		for (@Pc(1) int local1 = 0; local1 < Static20.anInt693; local1++) {
			@Pc(9) int local9 = Static18.anIntArray49[local1];
			@Pc(13) Class3_Sub1_Sub4_Sub1_Sub1 local13 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local9];
			if (local13 != null) {
				Static18.method296(local13.aClass3_Sub1_Sub1_1.anInt137, local13);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
	public static void method402() {
		for (@Pc(3) int local3 = 0; local3 < Static107.anInt2462; local3++) {
			@Pc(9) int local9 = Static5.anIntArray19[local3];
			@Pc(13) Class3_Sub1_Sub4_Sub1_Sub1 local13 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = Static62.aClass3_Sub7_Sub1_2.method647();
			@Pc(30) int local30;
			@Pc(34) int local34;
			if ((local17 & 0x20) != 0) {
				local30 = Static62.aClass3_Sub7_Sub1_2.method652();
				local34 = Static62.aClass3_Sub7_Sub1_2.method647();
				local13.method1035(Static27.anInt843, local34, local30);
				local13.anInt1432 = Static27.anInt843 + 300;
				local13.anInt1458 = Static62.aClass3_Sub7_Sub1_2.method647();
				local13.anInt1457 = Static62.aClass3_Sub7_Sub1_2.method647();
			}
			if ((local17 & 0x1) != 0) {
				local13.anInt1439 = Static62.aClass3_Sub7_Sub1_2.method617();
				local30 = Static62.aClass3_Sub7_Sub1_2.method638();
				local13.anInt1459 = 0;
				local13.anInt1469 = Static27.anInt843 + (local30 & 0xFFFF);
				local13.anInt1425 = local30 >> 16;
				if (local13.anInt1439 == 65535) {
					local13.anInt1439 = -1;
				}
				local13.anInt1431 = 0;
				if (local13.anInt1469 > Static27.anInt843) {
					local13.anInt1431 = -1;
				}
			}
			if ((local17 & 0x2) != 0) {
				local30 = Static62.aClass3_Sub7_Sub1_2.method602();
				if (local30 == 65535) {
					local30 = -1;
				}
				local34 = Static62.aClass3_Sub7_Sub1_2.method647();
				if (local30 == local13.anInt1442 && local30 != -1) {
					@Pc(147) int local147 = Static97.method1629(local30).anInt2246;
					if (local147 == 1) {
						local13.anInt1460 = local34;
						local13.anInt1456 = 0;
						local13.anInt1466 = 0;
						local13.anInt1422 = 0;
					}
					if (local147 == 2) {
						local13.anInt1466 = 0;
					}
				} else if (local30 == -1 || local13.anInt1442 == -1 || Static97.method1629(local30).anInt2259 >= Static97.method1629(local13.anInt1442).anInt2259) {
					local13.anInt1466 = 0;
					local13.anInt1420 = local13.anInt1418;
					local13.anInt1442 = local30;
					local13.anInt1460 = local34;
					local13.anInt1422 = 0;
					local13.anInt1456 = 0;
				}
			}
			if ((local17 & 0x10) != 0) {
				local13.anInt1417 = Static62.aClass3_Sub7_Sub1_2.method617();
				if (local13.anInt1417 == 65535) {
					local13.anInt1417 = -1;
				}
			}
			if ((local17 & 0x80) != 0) {
				local30 = Static62.aClass3_Sub7_Sub1_2.method652();
				local34 = Static62.aClass3_Sub7_Sub1_2.method647();
				local13.method1035(Static27.anInt843, local34, local30);
				local13.anInt1432 = Static27.anInt843 + 300;
				local13.anInt1458 = Static62.aClass3_Sub7_Sub1_2.method612();
				local13.anInt1457 = Static62.aClass3_Sub7_Sub1_2.method612();
			}
			if ((local17 & 0x8) != 0) {
				local13.anInt1451 = Static62.aClass3_Sub7_Sub1_2.method602();
				local13.anInt1423 = Static62.aClass3_Sub7_Sub1_2.method617();
			}
			if ((local17 & 0x4) != 0) {
				local13.aClass53_662 = Static62.aClass3_Sub7_Sub1_2.method605();
				local13.anInt1450 = 100;
			}
			if ((local17 & 0x40) != 0) {
				local13.aClass3_Sub1_Sub1_1 = Static101.method1666(Static62.aClass3_Sub7_Sub1_2.method602());
				local13.anInt1441 = local13.aClass3_Sub1_Sub1_1.anInt135;
				local13.anInt1437 = local13.aClass3_Sub1_Sub1_1.anInt126;
				local13.anInt1414 = local13.aClass3_Sub1_Sub1_1.anInt124;
				local13.anInt1440 = local13.aClass3_Sub1_Sub1_1.anInt143;
				local13.anInt1453 = local13.aClass3_Sub1_Sub1_1.anInt137;
				local13.anInt1449 = local13.aClass3_Sub1_Sub1_1.anInt134;
				local13.anInt1428 = local13.aClass3_Sub1_Sub1_1.anInt127;
				local13.anInt1438 = local13.aClass3_Sub1_Sub1_1.anInt138;
				local13.anInt1446 = local13.aClass3_Sub1_Sub1_1.anInt115;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public static void method403() {
		aClass53_286 = null;
		aClass53_302 = null;
		aClass43_1 = null;
		aClass53_295 = null;
		aClass53_300 = null;
		aClass53_285 = null;
		aClass53Array6 = null;
		aClass53_301 = null;
		aClass53_293 = null;
		aClass53_292 = null;
		aClass53_294 = null;
		aClass53_288 = null;
		aClass53_297 = null;
		aClass53_291 = null;
		aClass53_287 = null;
		aClass53_298 = null;
		aClass53_296 = null;
		aClass68_1 = null;
		aClass53_299 = null;
		aClass53_289 = null;
		aClass53_290 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)Lclient!wb;")
	public static Class3_Sub1_Sub17 method404(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub17 local10 = (Class3_Sub1_Sub17) Static29.aClass75_25.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static21.aClass62_3.method1512(16, arg0);
		local10 = new Class3_Sub1_Sub17();
		if (local20 != null) {
			local10.method1958(new Class3_Sub7(local20));
		}
		Static29.aClass75_25.method1730(local10, (long) arg0);
		return local10;
	}
}
