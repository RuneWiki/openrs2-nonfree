import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString1 = "slide:";

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public static int anInt17 = 0;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	public static int anInt18 = 1;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
	public static final int[] anIntArray1 = new int[4096];

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Ljava/lang/String;")
	public static final String aString2 = "green:";

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZIII)V")
	public static void method12(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static329.anInt6220 == 0) {
			Static319.method5154(false);
		} else {
			Static177.anInt3641 = Static329.anInt6220;
			Static244.method4219(0);
		}
		Static50.aBoolean110 = arg1;
		Static233.anInt4638 = arg3;
		Static126.anInt2792 = arg0;
		Static306.method3066(arg2);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method15() {
		Static210.aClass103_40.method2678();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIIIIII)V")
	public static void method16(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(5) Class50[] local5 = Static174.aClass50Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(12) Class50 local12 = local5[local7];
			if (local12 != null && local12.anInt1480 == 2) {
				Static222.method3930(arg0 >> 1, local12.anInt1477 * 2, (local12.anInt1476 - Static237.anInt4696 << 7) + local12.anInt1474, local12.anInt1475 + (local12.anInt1481 + -Static350.anInt6609 << 7), arg3 >> 1);
				if (Static157.anIntArray430[0] > -1 && Static212.anInt4234 % 20 < 10) {
					Static14.aClass52Array2[local12.anInt1485].method4123(arg2 + Static157.anIntArray430[0] - 12, arg1 - -Static157.anIntArray430[1] + -28);
				}
			}
		}
	}
}
