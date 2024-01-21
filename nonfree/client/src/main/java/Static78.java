import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "mb", descriptor = "I")
	public static int anInt1699;

	@OriginalMember(owner = "client!nd", name = "rb", descriptor = "I")
	public static int anInt1701;

	@OriginalMember(owner = "client!nd", name = "Xb", descriptor = "Lclient!re;")
	public static Class9 aClass9_38;

	@OriginalMember(owner = "client!nd", name = "gc", descriptor = "Lclient!g;")
	public static Class26 aClass26_18;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[112];

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1177 = Static72.method1077("green:");

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_1176 = aClass74_1177;

	@OriginalMember(owner = "client!nd", name = "hb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1178 = Static72.method1077("Your profile will be transferred in:");

	@OriginalMember(owner = "client!nd", name = "qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1179 = aClass74_1178;

	@OriginalMember(owner = "client!nd", name = "xb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1180 = aClass74_1177;

	@OriginalMember(owner = "client!nd", name = "Ib", descriptor = "Lclient!u;")
	private static Class74 aClass74_1181 = Static72.method1077("as it was used to break our rules)3");

	@OriginalMember(owner = "client!nd", name = "Pb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1182 = Static72.method1077("Die Verbindung konnte");

	@OriginalMember(owner = "client!nd", name = "jc", descriptor = "[I")
	public static int[] anIntArray251 = new int[200];

	@OriginalMember(owner = "client!nd", name = "lc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1183 = Static72.method1077("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!nd", name = "oc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1185 = aClass74_1181;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/Object;Z)[B")
	public static byte[] method1221(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static117.method1742(local18) : local18;
		} else if (arg0 instanceof Class1) {
			@Pc(32) Class1 local32 = (Class1) arg0;
			return local32.method1457();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)Z")
	public static boolean method1222(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public static void method1228() {
		aBooleanArray5 = null;
		aClass9_38 = null;
		anIntArray251 = null;
		aClass74_1179 = null;
		aClass74_1182 = null;
		aClass74_1176 = null;
		aClass74_1183 = null;
		aClass74_1177 = null;
		aClass74_1185 = null;
		aClass74_1181 = null;
		aClass74_1178 = null;
		aClass74_1180 = null;
		aClass26_18 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V")
	public static void method1230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub2_Sub3 local7 = Static120.method1766(arg0);
		@Pc(15) int local15 = local7.anInt354;
		@Pc(18) int local18 = local7.anInt355;
		@Pc(21) int local21 = local7.anInt358;
		@Pc(28) int local28 = Class26_Sub1.anIntArray273[local21 - local15];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local15;
		Static88.anIntArray260[local18] = local28 & arg1 << local15 | Static88.anIntArray260[local18] & ~local28;
	}
}
