import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!e", name = "d", descriptor = "J")
	public static long aLong24;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
	public static boolean aBoolean36;

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!mb;")
	public static Class42 aClass42_19;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!fc;")
	public static Class24 aClass24_22 = new Class24();

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_288 = Static45.method753("p12_full");

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!v;")
	private static Class62 aClass62_290 = Static45.method753("To play on this world move to a free area first");

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_289 = aClass62_290;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "[I")
	public static int[] anIntArray54 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	public static int anInt704 = 0;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_291 = Static45.method753("Loading sprites )2 ");

	@OriginalMember(owner = "client!e", name = "s", descriptor = "Lclient!v;")
	public static Class62 aClass62_292 = aClass62_291;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method469(@OriginalArg(1) Class42 arg0) {
		Static7.aClass42_8 = arg0;
		Static55.anInt1541 = Static7.aClass42_8.method1494(16);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[Lclient!v;I)Lclient!v;")
	public static Class62 method470(@OriginalArg(2) Class62[] arg0, @OriginalArg(3) int arg1) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			if (arg0[local14] == null) {
				arg0[local14] = Static108.aClass62_1272;
			}
			local12 += arg0[local14].anInt2649;
		}
		@Pc(50) byte[] local50 = new byte[local12];
		@Pc(52) int local52 = 0;
		@Pc(63) Class62 local63;
		for (@Pc(54) int local54 = 0; local54 < arg1; local54++) {
			local63 = arg0[local54];
			Static112.method491(local63.aByteArray25, 0, local50, local52, local63.anInt2649);
			local52 += local63.anInt2649;
		}
		local63 = new Class62();
		local63.aByteArray25 = local50;
		local63.anInt2649 = local12;
		return local63;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Lclient!v;")
	public static Class62 method471(@OriginalArg(1) int arg0) {
		return Static49.method782(new Class62[] { Static99.method1662(arg0 >> 24 & 0xFF), Static105.aClass62_1261, Static99.method1662(arg0 >> 16 & 0xFF), Static105.aClass62_1261, Static99.method1662(arg0 >> 8 & 0xFF), Static105.aClass62_1261, Static99.method1662(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method472() {
		aByteArrayArrayArray4 = null;
		aClass42_19 = null;
		aClass62_292 = null;
		aClass62_289 = null;
		anIntArray55 = null;
		aClass24_22 = null;
		aClass62_288 = null;
		aClass62_290 = null;
		aClass62_291 = null;
		anIntArray54 = null;
	}
}
