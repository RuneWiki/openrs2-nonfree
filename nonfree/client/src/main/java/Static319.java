import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!uh", name = "R", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!ae;Lclient!tq;Lclient!tq;)V")
	public static void method5612(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class191 arg1, @OriginalArg(3) Class191 arg2) {
		Static203.aClass188_7 = Static154.method5669(Static2.anInt73, arg2);
		Static299.aClass37_5 = arg0.method4305(Static203.aClass188_7, Static361.method2367(arg1, Static2.anInt73));
		Static24.aClass188_1 = Static154.method5669(Static106.anInt2392, arg2);
		Static193.aClass37_2 = arg0.method4305(Static24.aClass188_1, Static361.method2367(arg1, Static106.anInt2392));
		Static289.aClass188_8 = Static154.method5669(Static90.anInt5299, arg2);
		Static56.aClass37_1 = arg0.method4305(Static289.aClass188_8, Static361.method2367(arg1, Static90.anInt5299));
	}
}
