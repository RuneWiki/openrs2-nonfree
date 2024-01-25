import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static109 {

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
	public static int anInt2412;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!on;III)V")
	public static void method2354(@OriginalArg(0) Class146 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static285.aClass146_14 != null || Static29.aBoolean66 || (arg0 == null || Static189.method5115(arg0) == null)) {
			return;
		}
		Static285.aClass146_14 = arg0;
		Static163.aClass146_5 = Static189.method5115(arg0);
		Static173.aBoolean315 = false;
		Static39.anInt780 = arg2;
		Static52.anInt1118 = arg1;
		Static76.anInt1623 = 0;
	}
}
