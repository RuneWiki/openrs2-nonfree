import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Lclient!ke;")
	public static Class3_Sub1_Sub3_Sub3_Sub2 aClass3_Sub1_Sub3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "[I")
	public static int[] anIntArray468;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt7418 = 4;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	public static int anInt7422 = 7000;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	public static int anInt7419 = anInt7422;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	public static int anInt7421 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;B)V")
	public static void method6293(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static415.aString88 = arg0;
		Static456.aString69 = arg2;
		Static286.aBoolean453 = arg1;
		if (!Static286.aBoolean453 && (Static415.aString88.equals("") || Static456.aString69.equals(""))) {
			Static557.method8312(3);
			return;
		}
		if (Static26.anInt543 != 1) {
			Static278.anInt5908 = 0;
			Static441.anInt8171 = -1;
		}
		Static356.aBoolean506 = false;
		Static557.method8312(-3);
		Static513.anInt9420 = 1;
		Static201.anInt4637 = 0;
		Static579.anInt10320 = 0;
	}
}
