import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "[I")
	public static final int[] anIntArray180 = new int[13];

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIZIILclient!qn;I)V")
	public static void method1754(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class211 arg3) {
		Static252.aClass211_63 = arg3;
		Static186.anInt3434 = arg1;
		Static66.aBoolean66 = false;
		Static350.anInt5812 = 1;
		Static403.anInt6562 = 0;
		Static417.anInt7023 = arg0;
		Static107.anInt2011 = Static383.aClass4_Sub14_Sub1_2.method1913() / arg2;
		if (Static107.anInt2011 < 1) {
			Static107.anInt2011 = 1;
		}
	}
}
