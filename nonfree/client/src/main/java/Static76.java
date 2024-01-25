import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	public static int anInt1385;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!kr;")
	public static Class171 aClass171_30;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	public static int anInt1386;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public static int anInt1378 = 0;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!go;")
	public static final Class111 aClass111_1 = Static533.method7374();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
	public static void method1318(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static242.aClass255ArrayArrayArray2 = Static332.aClass255ArrayArrayArray3;
			Static544.aClass205Array3 = Static209.aClass205Array2;
		} else {
			Static242.aClass255ArrayArrayArray2 = Static222.aClass255ArrayArrayArray1;
			Static544.aClass205Array3 = Static16.aClass205Array1;
		}
		Static388.anInt7032 = Static242.aClass255ArrayArrayArray2.length;
	}
}
