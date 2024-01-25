import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
	public static int anInt3928;

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "[I")
	public static final int[] anIntArray206 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;Z)V")
	public static void method3630(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		Static67.aBoolean56 = arg0;
		Static527.aString100 = arg1;
		if (!arg0) {
			Static561.anInt9080 = -1;
		}
		Static653.aBoolean739 = arg3;
		Static366.aString75 = arg2;
		if (!Static67.aBoolean56 && (Static527.aString100.equals("") || Static366.aString75.equals(""))) {
			Static378.method5857(3);
			return;
		}
		if (Static41.anInt544 != 1) {
			Static584.anInt9324 = -1;
			Static634.anInt9904 = 0;
			Static562.anInt9091 = -1;
		}
		Static305.aClass260_2.aBoolean538 = false;
		Static378.method5857(-3);
		Static264.anInt5014 = 0;
		Static597.anInt9453 = 1;
		Static337.anInt5763 = 0;
	}
}
