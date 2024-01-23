import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
	public static int[] anIntArray209;

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "I")
	public static int anInt3141;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1108 = Static64.method1101("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1109 = Static64.method1101("p11_full");

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1110 = Static64.method1101("Konfig geladen)3");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
	public static void method2488() {
		@Pc(9) byte[][] local9 = Static43.aByteArrayArray1;
		@Pc(20) int local20 = local9.length;
		@Pc(35) int local35;
		@Pc(46) int local46;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			local35 = (Static164.anIntArray240[local22] >> 8) * 64 - Static198.anInt4217;
			local46 = (Static164.anIntArray240[local22] & 0xFF) * 64 - Static118.anInt2541;
			@Pc(50) byte[] local50 = local9[local22];
			if (local50 != null) {
				Static208.method3447();
				Static150.method2582(Static57.anInt1354 * 8 - 48, Static228.aClass90Array1, local46, local35, local50, Static39.anInt965 * 8 - 48);
			}
		}
		for (local35 = 0; local35 < local20; local35++) {
			local46 = (Static164.anIntArray240[local35] >> 8) * 64 - Static198.anInt4217;
			@Pc(94) byte[] local94 = local9[local35];
			@Pc(105) int local105 = (Static164.anIntArray240[local35] & 0xFF) * 64 - Static118.anInt2541;
			if (local94 == null && Static39.anInt965 < 800) {
				Static208.method3447();
				for (@Pc(116) int local116 = 0; local116 < 4; local116++) {
					Static163.method2757(local116, local105, local46, 64, 64);
				}
			}
		}
	}
}
