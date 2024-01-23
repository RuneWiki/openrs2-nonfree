import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V")
	public static void method4076() {
		Static276.aClass8_Sub1_Sub5_4 = null;
		Static277.aClass8_Sub1_Sub7Array121 = null;
		Static15.aClass8_Sub1_Sub7Array10 = null;
		Static160.aClass8_Sub1_Sub7Array69 = null;
		Static64.aClass8_Sub1_Sub7Array30 = null;
		Static213.aClass8_Sub1_Sub7Array91 = null;
		Static73.aClass8_Sub1_Sub7Array36 = null;
		Static229.aClass8_Sub1_Sub5_3 = null;
		Static13.aClass8_Sub1_Sub7_Sub1Array1 = null;
		Static10.aClass8_Sub1_Sub7Array3 = null;
		Static267.aClass43Array5 = null;
		Static247.aClass8_Sub1_Sub5_5 = null;
		Static293.aClass8_Sub1_Sub7Array122 = null;
		Static198.aClass8_Sub1_Sub7Array85 = null;
		Static207.aClass8_Sub1_Sub7_7 = null;
		Static210.aClass8_Sub1_Sub5_Sub2_7 = null;
		Static199.aClass43Array4 = null;
		Static241.aClass8_Sub1_Sub7_11 = null;
		Static184.aClass8_Sub1_Sub7Array80 = null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)C")
	public static char method4077(@OriginalArg(0) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(49) char local49 = Static200.aCharArray4[local14 - 128];
			if (local49 == '\u0000') {
				local49 = '?';
			}
			local14 = local49;
		}
		return (char) local14;
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V")
	public static void method4079() {
		Static270.aClass61_51.method1379();
		Static222.aClass61_42.method1379();
		Static156.aClass61_26.method1379();
	}
}
