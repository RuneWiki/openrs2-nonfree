import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static28 {

	@OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lclient!df;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!ef", name = "yb", descriptor = "Z")
	public static boolean aBoolean29;

	@OriginalMember(owner = "client!ef", name = "Mb", descriptor = "Lclient!wa;")
	public static Class2_Sub22 aClass2_Sub22_3;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_321 = Static119.method1462("Dec");

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_322 = Static119.method1462("Jul");

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_323 = Static119.method1462("Jun");

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_324 = Static119.method1462("Aug");

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lclient!pe;")
	private static Class65 aClass65_325 = Static119.method1462("Nov");

	@OriginalMember(owner = "client!ef", name = "kb", descriptor = "Lclient!bc;")
	public static Class8 aClass8_18 = new Class8(30);

	@OriginalMember(owner = "client!ef", name = "lb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_326 = Static119.method1462("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!ef", name = "mb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_327 = Static119.method1462("scroll:");

	@OriginalMember(owner = "client!ef", name = "nb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_328 = aClass65_327;

	@OriginalMember(owner = "client!ef", name = "vb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_329 = Static119.method1462("Oct");

	@OriginalMember(owner = "client!ef", name = "xb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_330 = Static119.method1462("Sep");

	@OriginalMember(owner = "client!ef", name = "zb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_331 = Static119.method1462("Feb");

	@OriginalMember(owner = "client!ef", name = "Ab", descriptor = "Lclient!pe;")
	private static Class65 aClass65_332 = Static119.method1462("Jan");

	@OriginalMember(owner = "client!ef", name = "Cb", descriptor = "I")
	public static int anInt694 = 0;

	@OriginalMember(owner = "client!ef", name = "Eb", descriptor = "[I")
	public static int[] anIntArray74 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ef", name = "Fb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_333 = Static119.method1462("Mar");

	@OriginalMember(owner = "client!ef", name = "Gb", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!ef", name = "Hb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_334 = Static119.method1462("Apr");

	@OriginalMember(owner = "client!ef", name = "Ib", descriptor = "Lclient!pe;")
	public static Class65 aClass65_335 = aClass65_327;

	@OriginalMember(owner = "client!ef", name = "Jb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_336 = Static119.method1462("May");

	@OriginalMember(owner = "client!ef", name = "Lb", descriptor = "Lclient!pe;")
	private static Class65 aClass65_338 = Static119.method1462("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!ef", name = "Kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_337 = aClass65_338;

	@OriginalMember(owner = "client!ef", name = "Nb", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array17 = new Class65[] { aClass65_332, aClass65_331, aClass65_333, aClass65_334, aClass65_336, aClass65_323, aClass65_322, aClass65_324, aClass65_330, aClass65_329, aClass65_325, aClass65_321 };

	@OriginalMember(owner = "client!ef", name = "Pb", descriptor = "[I")
	public static int[] anIntArray75 = new int[5];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lclient!pe;")
	public static Class65 method576(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static35.method647(new Class65[] { Static93.aClass65_880, Static120.method1871(arg0), Static121.aClass65_1131 });
		} else if (arg0 < 10000000) {
			return Static35.method647(new Class65[] { Static39.aClass65_404, Static120.method1871(arg0 / 1000), Static115.aClass65_1088, Static121.aClass65_1131 });
		} else {
			return Static35.method647(new Class65[] { Static97.aClass65_924, Static120.method1871(arg0 / 1000000), Static95.aClass65_900, Static121.aClass65_1131 });
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Z")
	public static boolean method578(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method579() {
		if (Static48.aBoolean47 && Static59.anInt1479 != Static37.anInt812) {
			Static34.method638(Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], Static50.anInt1210, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], Static42.anInt1052, Static59.anInt1479);
		} else if (Static59.anInt1479 != Static68.anInt2858) {
			Static68.anInt2858 = Static59.anInt1479;
			Static103.method1691(Static59.anInt1479);
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
	public static void method580() {
		aClass65_329 = null;
		anIntArray74 = null;
		aClass65_322 = null;
		anIntArray75 = null;
		aClass65_321 = null;
		aClass65_333 = null;
		aClass65_330 = null;
		aClass65_323 = null;
		aClass65_335 = null;
		aClass65_337 = null;
		aClass65_326 = null;
		aClass65_334 = null;
		aClass8_18 = null;
		aClass65_325 = null;
		aClass65_328 = null;
		aClass20_2 = null;
		aClass65_327 = null;
		aClass65_324 = null;
		aClass65_331 = null;
		aClass65Array17 = null;
		aClass65_338 = null;
		aClass65_332 = null;
		aClass65_336 = null;
		aClass2_Sub22_3 = null;
	}
}
