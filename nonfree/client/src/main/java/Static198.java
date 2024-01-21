import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!wa;")
	public static Class23 aClass23_77;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
	public static int anInt3862;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
	public static int anInt3860 = 0;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
	public static int anInt3861 = 0;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1458 = Static161.method2452("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1457 = aClass20_1458;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method2924(@OriginalArg(0) int arg0) {
		Static180.anInt3609 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static210.anInt919; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static31.anInt671; local6++) {
				if (Static157.aClass5_Sub3ArrayArrayArray2[arg0][local3][local6] == null) {
					Static157.aClass5_Sub3ArrayArrayArray2[arg0][local3][local6] = new Class5_Sub3(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)I")
	public static int method2925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 + arg0 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = (local20 * 15731 * local20 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
