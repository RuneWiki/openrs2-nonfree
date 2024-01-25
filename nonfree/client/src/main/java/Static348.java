import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!fo;")
	public static Class82 aClass82_81;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean679 = true;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	public static int anInt5969 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Z")
	public static boolean method4710(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 50 || arg0 == 49 || arg0 == 12 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
	public static void method4711() {
		for (@Pc(1) int local1 = 0; local1 < Static131.anInt2379; local1++) {
			@Pc(6) Class25_Sub5 local6 = Static372.aClass25_Sub5Array2[local1];
			Static72.method1149(local6);
			Static372.aClass25_Sub5Array2[local1] = null;
		}
		Static131.anInt2379 = 0;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	public static void method4712() {
		Static8.aClass1_Sub19_1 = new Class1_Sub19(Static339.aClass119_136.method2673(Static394.anInt6582), "", Static33.anInt530, 1008, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)V")
	public static void method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class109 local9 = Static383.aClass109ArrayArray1[arg2][arg1];
		Static214.method3137(local9 == null ? Static136.aClass109_3 : local9, arg0);
	}
}
