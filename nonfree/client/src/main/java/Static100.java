import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!td", name = "l", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!bb;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_20;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1241 = Static24.method441("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1246 = Static24.method441("Too many connections from your address)3");

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1242 = aClass65_1246;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1243 = Static24.method441("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1244 = Static24.method441("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt2779 = 0;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt2780 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1245 = Static24.method441("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!td", name = "v", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1247 = Static24.method441("cross");

	@OriginalMember(owner = "client!td", name = "z", descriptor = "I")
	public static int anInt2785 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public static int method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = local20 * (local20 * 15731 * local20 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lclient!ba;")
	public static Class2_Sub1_Sub3 method1707(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub3 local10 = (Class2_Sub1_Sub3) Static102.aClass21_34.method744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static96.aClass33_42.method1150(arg0, 3);
		local10 = new Class2_Sub1_Sub3();
		if (local28 != null) {
			local10.method146(new Class2_Sub8(local28));
		}
		Static102.aClass21_34.method745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public static void method1708() {
		aClass6_1 = null;
		aByteArrayArrayArray9 = null;
		aClass65_1242 = null;
		aClass2_Sub1_Sub4_Sub3_20 = null;
		aClass65_1244 = null;
		aClass65_1241 = null;
		aClass65_1243 = null;
		aClass65_1247 = null;
		aClass65_1246 = null;
		anIntArrayArrayArray7 = null;
		anIntArray407 = null;
		aClass65_1245 = null;
	}
}
