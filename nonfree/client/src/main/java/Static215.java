import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
	public static int anInt4228;

	@OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
	public static int anInt4229;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "Lclient!th;")
	public static Class169 aClass169_118 = new Class169(500);

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
	public static int anInt4230 = 0;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
	public static boolean aBoolean288 = true;

	@OriginalMember(owner = "client!pk", name = "C", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "[S")
	public static short[] aShortArray61 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!ph;B)V")
	public static void method3398(@OriginalArg(0) Class138 arg0) {
		if (Static59.aBoolean94) {
			return;
		}
		if (Static291.aBoolean404) {
			Static133.method2178();
		} else {
			Static41.method751();
		}
		Static263.aClass1_Sub1_Sub3_9 = Static47.method826(Static220.anInt5831, arg0);
		@Pc(19) int local19 = Static136.anInt2696;
		@Pc(29) int local29 = local19 * 956 / 503;
		Static263.aClass1_Sub1_Sub3_9.method4631((Static159.anInt3348 - local29) / 2, 0, local29, local19);
		Static148.aClass103_1 = Static90.method3651(arg0, Static24.anInt474);
		Static148.aClass103_1.method4594(Static159.anInt3348 / 2 - Static148.aClass103_1.anInt5857 / 2, 18);
		Static59.aBoolean94 = true;
	}
}
