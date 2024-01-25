import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "Z")
	public static boolean aBoolean355 = true;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	public static int anInt4523 = 0;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
	public static int anInt4525 = 1;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	public static void method3842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static521.aClass333_6 == Static256.aClass333_3) {
			if (!Static597.method8258(false, 0, arg1, -2, arg0, 0, 1, 1)) {
				Static597.method8258(false, 0, arg1, -3, arg0, 0, 1, 1);
			}
		} else if (!Static597.method8258(false, 0, arg1, -3, arg0, 0, 1, 1)) {
			Static597.method8258(false, 0, arg1, -2, arg0, 0, 1, 1);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZILjava/lang/String;Ljava/lang/String;)V")
	public static void method3843(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static471.anInt7980 = -1;
		}
		Static43.aString11 = arg2;
		Static289.aString139 = arg3;
		Static504.aBoolean656 = arg0;
		Static121.aBoolean173 = arg1;
		if (!Static121.aBoolean173 && (Static289.aString139.equals("") || Static43.aString11.equals(""))) {
			Static326.method4967(3);
			return;
		}
		Static246.aBoolean334 = false;
		if (Static670.anInt10721 != 1) {
			Static41.anInt727 = 0;
			Static462.anInt7858 = -1;
		}
		Static326.method4967(-3);
		Static566.anInt9503 = 1;
		Static370.anInt10364 = 0;
		Static499.anInt8314 = 0;
	}
}
