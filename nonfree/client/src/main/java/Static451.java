import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static451 {

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!oo;")
	public static Class181 aClass181_7;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
	public static int anInt7440;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!fr;")
	public static final Class85 aClass85_48 = new Class85();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method5736(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static199.aString38 = arg0;
		Static308.aString53 = arg1;
		if (Static267.anInt4536 != 3 && (Static199.aString38.equals("") || Static308.aString53.equals(""))) {
			Static221.method3102(3);
			return;
		}
		Static28.aBoolean13 = false;
		if (Static267.anInt4536 != 1) {
			Static432.anInt7270 = 0;
			Static164.anInt2971 = -1;
		}
		Static221.method3102(-3);
		Static398.anInt6357 = 0;
		Static88.anInt1767 = 0;
		Static64.anInt1229 = 1;
	}
}
