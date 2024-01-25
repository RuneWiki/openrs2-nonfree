import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_168 = new Class131(42, 3);

	@OriginalMember(owner = "client!td", name = "R", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_112 = new Class237(38, 9);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5214(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static193.anInt1026; local11++) {
			if (arg0.equalsIgnoreCase(Static397.aStringArray53[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51);
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
	public static void method5215() {
		if (Static230.anInt4125 != -1) {
			Static405.method5580(Static230.anInt4125, -1, -1, false);
			Static230.anInt4125 = -1;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public static void method5216() {
		Static268.aClass219Array2 = null;
		Static243.method3592(Static255.anInt4574, 0, 0, -1, 0, Static207.anInt3842, Static273.anInt4878, 0);
		if (Static268.aClass219Array2 != null) {
			Static208.method3190(0, Static207.anInt3842, -1412584499, Static255.anInt4574, Static195.anInt3535, Static268.aClass219Array2, Static207.aClass219_11.anInt6359, 0, Static209.anInt7824);
			Static268.aClass219Array2 = null;
		}
	}
}
