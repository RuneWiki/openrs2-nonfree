import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "Z")
	public static boolean aBoolean137;

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1081 = Static64.method1101("glow2:");

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1080 = aClass51_1081;

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1082 = Static64.method1101("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!nh", name = "gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1083 = Static64.method1101(": ");

	@OriginalMember(owner = "client!nh", name = "ib", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1084 = aClass51_1081;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)[Lclient!te;")
	public static Class1_Sub2_Sub1[] method2447() {
		@Pc(8) Class1_Sub2_Sub1[] local8 = new Class1_Sub2_Sub1[Static43.anInt1027];
		for (@Pc(10) int local10 = 0; local10 < Static43.anInt1027; local10++) {
			@Pc(20) int local20 = Static89.anIntArray85[local10] * Static51.anIntArray72[local10];
			@Pc(24) byte[] local24 = Static73.aByteArrayArray4[local10];
			@Pc(27) int[] local27 = new int[local20];
			for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
				local27[local29] = Static52.anIntArray74[local24[local29] & 0xFF];
			}
			local8[local10] = new Class1_Sub2_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[local10], Static152.anIntArray225[local10], Static51.anIntArray72[local10], Static89.anIntArray85[local10], local27);
		}
		Static134.method2401();
		return local8;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method2448(@OriginalArg(1) Class70 arg0) {
		Static81.aClass70_22 = arg0;
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
	public static void method2449() {
		if (Static130.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static106.anIntArray140[221] = 43;
			Static106.anIntArray140[223] = 28;
			Static106.anIntArray140[188] = 71;
			Static106.anIntArray140[190] = 72;
			Static106.anIntArray140[191] = 73;
			Static106.anIntArray140[186] = 57;
			Static106.anIntArray140[189] = 26;
			Static106.anIntArray140[192] = 58;
			Static106.anIntArray140[219] = 42;
			Static106.anIntArray140[222] = 59;
			Static106.anIntArray140[220] = 74;
			Static106.anIntArray140[187] = 27;
			return;
		}
		Static106.anIntArray140[45] = 26;
		if (Static130.aMethod1 == null) {
			Static106.anIntArray140[222] = 59;
			Static106.anIntArray140[192] = 58;
		} else {
			Static106.anIntArray140[222] = 58;
			Static106.anIntArray140[192] = 28;
			Static106.anIntArray140[520] = 59;
		}
		Static106.anIntArray140[47] = 73;
		Static106.anIntArray140[92] = 74;
		Static106.anIntArray140[46] = 72;
		Static106.anIntArray140[61] = 27;
		Static106.anIntArray140[59] = 57;
		Static106.anIntArray140[44] = 71;
		Static106.anIntArray140[93] = 43;
		Static106.anIntArray140[91] = 42;
	}
}
