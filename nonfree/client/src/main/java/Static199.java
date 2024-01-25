import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static199 {

	@OriginalMember(owner = "client!hp", name = "Cg", descriptor = "[Lclient!i;")
	public static Class47[] aClass47Array1;

	@OriginalMember(owner = "client!hp", name = "Og", descriptor = "Lclient!f;")
	public static Class22 aClass22_19;

	@OriginalMember(owner = "client!hp", name = "Tg", descriptor = "Lclient!sn;")
	public static final Class308 aClass308_3 = new Class308("LIVE", 0);

	@OriginalMember(owner = "client!hp", name = "dh", descriptor = "S")
	public static short aShort49 = 32767;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Z)V")
	public static void method3213(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static399.aString69 = arg2;
		Static275.aBoolean360 = arg0;
		Static157.aString27 = arg1;
		if (!Static275.aBoolean360 && Static404.anInt7074 != 3 && (Static157.aString27.equals("") || Static399.aString69.equals(""))) {
			Static138.method2101(3);
			return;
		}
		if (Static404.anInt7074 != 1) {
			Static437.anInt7656 = 0;
			Static541.anInt9060 = -1;
		}
		Static90.aBoolean154 = false;
		Static138.method2101(-3);
		Static50.anInt933 = 0;
		Static374.anInt6268 = 0;
		Static181.anInt3169 = 1;
	}
}
