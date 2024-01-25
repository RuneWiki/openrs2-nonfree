import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Lclient!bq;")
	public static Class35 aClass35_8;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!bq;")
	public static Class35 aClass35_9;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
	public static int anInt3364;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_16 = new Class38(64);

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "Lclient!ik;")
	public static final Class117 aClass117_4 = new Class117();

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "[I")
	public static final int[] anIntArray346 = new int[3];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	public static void method2624(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static267.aFloat83 = local11;
		Static26.aFloat5 = local7;
		if (Static21.anInt6762 == 2) {
			Static217.anInt4351 = local7;
			Static147.anInt3170 = local11;
			Static403.anInt7268 = 0;
		}
		Static208.method3584();
		Static450.aBoolean515 = true;
	}
}
