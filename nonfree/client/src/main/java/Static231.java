import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	public static int anInt4994 = 0;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
	public static int anInt4995 = 0;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1350 = method3737("Sep");

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1353 = method3737("Jan");

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1356 = method3737("Feb");

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1352 = method3737("Mar");

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1357 = method3737("Apr");

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1358 = method3737("May");

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1361 = method3737("Jun");

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1351 = method3737("Jul");

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1355 = method3737("Aug");

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1360 = method3737("Oct");

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1362 = method3737("Nov");

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1359 = method3737("Dec");

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array31 = new Class107[] { aClass107_1353, aClass107_1356, aClass107_1352, aClass107_1357, aClass107_1358, aClass107_1361, aClass107_1351, aClass107_1355, aClass107_1350, aClass107_1360, aClass107_1362, aClass107_1359 };

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
	public static boolean aBoolean446 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)Lclient!sc;")
	public static Class107 method3737(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(14) int local14 = local6.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class107 local20 = new Class107();
		local20.aByteArray55 = new byte[local14];
		while (local16 < local14) {
			@Pc(32) int local32 = local6[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local16 >= local14) {
					break;
				}
				@Pc(67) int local67 = local6[local16++] & 0xFF;
				local20.aByteArray55[local20.anInt4186++] = (byte) ((local32 - 40) * 43 + local67 - 48);
			} else if (local32 != 0) {
				local20.aByteArray55[local20.anInt4186++] = (byte) local32;
			}
		}
		local20.method3090();
		return local20.method3069();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method3738() {
		Static165.aClass61_43.method1695(5);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
	public static void method3740() {
		Static221.aClass61_90.method1695(5);
		Static153.aClass61_59.method1695(5);
		Static58.aClass61_20.method1695(5);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B[Lclient!sc;)[Lclient!sc;")
	public static Class107[] method3741(@OriginalArg(1) Class107[] arg0) {
		@Pc(13) Class107[] local13 = new Class107[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static149.method2437(new Class107[] { Static115.method2001(local15), Static110.aClass107_659 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static149.method2437(new Class107[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}
}
