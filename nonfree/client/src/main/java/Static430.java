import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "[I")
	public static final int[] anIntArray604 = new int[250];

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_157 = new Class239(35, 14);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
	public static void method6614(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static403.aBoolean564 = arg0;
		Static43.aString22 = arg1;
		Static454.aString170 = arg2;
		if (!Static403.aBoolean564 && Static86.anInt1765 != 3 && (Static43.aString22.equals("") || Static454.aString170.equals(""))) {
			Static468.method7051(3);
			return;
		}
		if (Static86.anInt1765 != 1) {
			Static273.anInt4975 = 0;
			Static13.anInt295 = -1;
		}
		Static158.aBoolean237 = false;
		Static468.method7051(-3);
		Static331.anInt6217 = 0;
		Static437.anInt7978 = 0;
		Static528.anInt9122 = 1;
	}
}
