import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_13;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!ml;")
	public static Class1_Sub3_Sub13 aClass1_Sub3_Sub13_14;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	public static int anInt4437;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public static int anInt4440;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public static int anInt4436 = -1;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "[I")
	public static int[] anIntArray394 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	public static int anInt4438 = 0;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "[I")
	public static int[] anIntArray395 = new int[14];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
	public static void method3260(@OriginalArg(0) int arg0) {
		Static102.method731();
		Static134.method2279();
		@Pc(14) int local14 = Static119.method1932(arg0).anInt3541;
		if (local14 == 0) {
			return;
		}
		@Pc(22) int local22 = Static296.anIntArray530[arg0];
		if (local14 == 9) {
			Static134.anInt3080 = local22;
		}
		if (local14 == 6) {
			Static111.anInt2434 = local22;
		}
		if (local14 == 5) {
			Static102.anInt849 = local22;
		}
	}
}
