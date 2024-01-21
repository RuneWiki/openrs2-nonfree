import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public static int anInt3804;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "[[S")
	public static short[][] aShortArrayArray107;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage105;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1616 = Static51.method932("null");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1617 = Static51.method932("wishes to duel with you)3");

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1618 = aClass10_1617;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1619 = Static51.method932("");

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1620 = Static51.method932(":clan:");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!cd;Z)Z")
	public static boolean method2706(@OriginalArg(0) Class10 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static139.anInt3081; local18++) {
			if (arg0.method343(Static116.aClass10Array20[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method2708() {
		aClass10_1620 = null;
		aClass10_1619 = null;
		aShortArrayArray107 = null;
		anImage105 = null;
		aClass10_1618 = null;
		aClass10_1617 = null;
		aClass10_1616 = null;
	}
}
