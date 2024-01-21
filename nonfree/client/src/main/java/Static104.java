import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!e;")
	public static Class16 aClass16_91 = new Class16(64);

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!da;")
	public static Class13 aClass13_66 = new Class13();

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!u;")
	public static Class74 aClass74_1697 = Static72.method1077("Wordpack geladen)3");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1698 = Static72.method1077("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1699 = Static72.method1077("welle2:");

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
	public static int[] anIntArray407 = new int[256];

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public static int anInt2839 = 1;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public static void method1902() {
		for (@Pc(7) int local7 = 0; local7 < Static107.anInt2342; local7++) {
			@Pc(13) int local13 = Static81.anIntArray255[local7];
			@Pc(17) Class2_Sub2_Sub2_Sub1_Sub2 local17 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static19.aClass2_Sub10_Sub1_1.method1514();
			if ((local21 & 0x40) != 0) {
				local21 += Static19.aClass2_Sub10_Sub1_1.method1514() << 8;
			}
			Static79.method1243(local17, local13, local21);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method1904() {
		anIntArray407 = null;
		aClass13_66 = null;
		aClass74_1699 = null;
		aClass74_1698 = null;
		aClass74_1697 = null;
		aClass16_91 = null;
	}
}
