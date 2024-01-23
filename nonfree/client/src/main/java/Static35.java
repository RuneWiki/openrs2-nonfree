import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString10 = " more options";

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)I")
	public static int method224() {
		Static135.anInt2670 = 0;
		return Static151.method2391();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method225() {
		if (Static100.aClass112_44 != null) {
			Static100.aClass112_44.method4463();
		}
		if (Static260.aClass112_115 != null) {
			Static260.aClass112_115.method4463();
		}
		Static82.method1397(Static159.aBoolean209);
		Static100.aClass112_44 = Static144.method2299(0, Static139.aCanvas1, 22050, Static95.aClass184_3);
		Static100.aClass112_44.method4455(Static292.aClass4_Sub6_Sub2_3);
		Static260.aClass112_115 = Static144.method2299(1, Static139.aCanvas1, 2048, Static95.aClass184_3);
		Static260.aClass112_115.method4455(Static10.aClass4_Sub6_Sub4_1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method226(@OriginalArg(1) Class22 arg0) {
		Static113.aClass22_37 = arg0;
	}
}
