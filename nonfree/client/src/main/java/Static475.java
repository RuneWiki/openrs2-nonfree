import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
	public static int[] anIntArray649;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "J")
	public static long aLong216 = 0L;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
	public static int anInt8486 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZIIII)V")
	public static void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 - arg1;
		@Pc(13) int local13 = arg1 + arg4;
		for (@Pc(20) int local20 = arg4; local20 < local13; local20++) {
			Static403.method6377(arg2, Static130.anIntArrayArray89[local20], arg5, arg0);
		}
		@Pc(38) int local38 = arg1 + arg0;
		for (@Pc(40) int local40 = arg3; local40 > local9; local40--) {
			Static403.method6377(arg2, Static130.anIntArrayArray89[local40], arg5, arg0);
		}
		@Pc(62) int local62 = arg5 - arg1;
		for (@Pc(64) int local64 = local13; local64 <= local9; local64++) {
			@Pc(70) int[] local70 = Static130.anIntArrayArray89[local64];
			Static403.method6377(arg2, local70, local38, arg0);
			Static403.method6377(arg2, local70, arg5, local62);
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method7099() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static352.aBooleanArray29[local7] = false;
		}
		Static537.anInt9322 = 0;
		Static284.anInt9395 = 0;
		Static516.anInt8985 = Static353.anInt5258;
		Static135.anInt2545 = Static429.anInt7997;
		Static427.anInt7875 = 5;
		Static516.anInt8983 = Static187.anInt3432;
		Static87.anInt1766 = Static329.anInt3848;
		Static498.anInt8755 = Static115.anInt2326;
		Static401.anInt7597 = -1;
		Static28.anInt525 = -1;
		Static78.anInt1650 = Static209.anInt3769;
	}
}
