import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	public static int anInt1269;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "I")
	public static int anInt1279;

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "I")
	public static int anInt1281;

	@OriginalMember(owner = "client!gb", name = "ub", descriptor = "I")
	public static int anInt1283;

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "[I")
	public static int[] anIntArray132 = new int[32768];

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "[S")
	public static short[] aShortArray7 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
	public static int anInt1278 = 0;

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_705 = Static122.method531("Fallen lassen");

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lclient!ff;")
	public static Class3_Sub12 aClass3_Sub12_4 = new Class3_Sub12(new byte[5000]);

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "(I)V")
	public static void method964() {
		aClass73_705 = null;
		anIntArray132 = null;
		aClass3_Sub12_4 = null;
		aShortArray7 = null;
	}
}
