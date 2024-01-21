import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_13;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!sd;")
	private static Class73 aClass73_826 = Static122.method531("glow3:");

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_827 = Static122.method531("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_828 = Static122.method531("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!sd;")
	public static Class73 aClass73_829 = aClass73_826;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!sd;")
	public static Class73 aClass73_830 = aClass73_826;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public static void method1184(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static59.anInt2722 != 0 && Static59.anInt2722 != 3 || Static2.anInt7 != 1) {
			return;
		}
		@Pc(23) int local23 = Static51.anInt1243 - arg1 - 5;
		@Pc(30) int local30 = Static61.anInt1463 - arg0 - 25;
		if (local30 < 0 || local23 < 0 || local30 >= 146 || local23 >= 151) {
			return;
		}
		local23 -= 75;
		local30 -= 73;
		@Pc(53) int local53 = Static120.anInt2841 + Static25.anInt716 & 0x7FF;
		@Pc(57) int local57 = Class3_Sub1_Sub3_Sub2.anIntArray88[local53];
		@Pc(61) int local61 = Class3_Sub1_Sub3_Sub2.anIntArray87[local53];
		@Pc(69) int local69 = (Static170.anInt3687 + 256) * local61 >> 8;
		@Pc(77) int local77 = local57 * (Static170.anInt3687 + 256) >> 8;
		@Pc(87) int local87 = local77 * local30 + local23 * local69 >> 11;
		@Pc(97) int local97 = local77 * local23 - local69 * local30 >> 11;
		@Pc(104) int local104 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169 + local87 >> 7;
		@Pc(112) int local112 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159 - local97 >> 7;
		@Pc(132) boolean local132 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local112, true, local104, 0, 1, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
		if (!local132) {
			return;
		}
		Static139.aClass3_Sub12_Sub1_3.method1383(local30);
		Static139.aClass3_Sub12_Sub1_3.method1383(local23);
		Static139.aClass3_Sub12_Sub1_3.method1361(Static25.anInt716);
		Static139.aClass3_Sub12_Sub1_3.method1383(57);
		Static139.aClass3_Sub12_Sub1_3.method1383(Static120.anInt2841);
		Static139.aClass3_Sub12_Sub1_3.method1383(Static170.anInt3687);
		Static139.aClass3_Sub12_Sub1_3.method1383(89);
		Static139.aClass3_Sub12_Sub1_3.method1361(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3169);
		Static139.aClass3_Sub12_Sub1_3.method1361(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anInt3159);
		Static139.aClass3_Sub12_Sub1_3.method1383(Static179.anInt3897);
		Static139.aClass3_Sub12_Sub1_3.method1383(63);
		return;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BII)I")
	public static int method1185(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static96.method1659(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method1186() {
		aClass73_829 = null;
		aClass73_827 = null;
		aClass73_830 = null;
		aClass3_Sub1_Sub3_Sub4_13 = null;
		aClass73_828 = null;
		aClass73_826 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	public static boolean method1187(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
