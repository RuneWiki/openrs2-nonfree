import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt1180;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_10;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array8;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!sb;")
	public static Class25 aClass25_55;

	@OriginalMember(owner = "client!id", name = "y", descriptor = "I")
	public static int anInt1186;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt1179 = 0;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!ad;")
	private static Class4 aClass4_600 = Static75.method1216("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_599 = aClass4_600;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!ad;")
	private static Class4 aClass4_601 = Static75.method1216("Examine");

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	public static final int anInt1184 = 20;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_602 = aClass4_601;

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!ad;")
	private static Class4 aClass4_607 = Static75.method1216("wishes to duel with you)3");

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_603 = aClass4_607;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "I")
	public static int anInt1185 = 99;

	@OriginalMember(owner = "client!id", name = "s", descriptor = "Lclient!ad;")
	private static Class4 aClass4_605 = Static75.method1216("Login limit exceeded)3");

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_604 = aClass4_605;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_606 = Static75.method1216("@or3@");

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_608 = Static75.method1216("scrollen:");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Lclient!s;")
	public static Class3_Sub1_Sub15 method827(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub15 local10 = (Class3_Sub1_Sub15) Static89.aClass8_26.method195((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static63.aClass64_47.method1625(13, arg0);
		local10 = new Class3_Sub1_Sub15();
		local10.anInt2208 = arg0;
		if (local20 != null) {
			local10.method1485(new Class3_Sub4(local20));
		}
		Static89.aClass8_26.method199((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IZ)Lclient!rc;")
	public static Class3_Sub1_Sub14 method828(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static104.aClass3_Sub1_Sub14ArrayArray1[local7] == null || Static104.aClass3_Sub1_Sub14ArrayArray1[local7][local11] == null) {
			@Pc(30) boolean local30 = Static100.method1650(local7);
			if (!local30) {
				return null;
			}
		}
		return Static104.aClass3_Sub1_Sub14ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method829() {
		aClass4_601 = null;
		aClass4_606 = null;
		aClass4_600 = null;
		aClass64_Sub1_10 = null;
		aClass25_55 = null;
		aClass3_Sub1_Sub4_Sub2Array8 = null;
		aClass4_607 = null;
		aClass4_608 = null;
		aClass4_603 = null;
		aClass4_605 = null;
		anIntArray172 = null;
		aClass4_604 = null;
		Canvas_Sub1.anIntArray171 = null;
		aClass4_602 = null;
		aClass4_599 = null;
	}
}
