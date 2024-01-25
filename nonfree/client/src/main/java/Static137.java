import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!gr", name = "C", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "[I")
	public static final int[] anIntArray162 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	public static int anInt2436 = -1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!fo;IIIZ)V")
	public static void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(5) int arg3) {
		Static303.anInt7492 = arg3;
		Static2.aClass82_1 = arg2;
		Static255.anInt1147 = 1;
		Static72.anInt1316 = 0;
		Static128.aBoolean263 = false;
		Static48.anInt814 = arg0;
		Static31.anInt497 = Static420.aClass1_Sub6_Sub2_3.method4475() / arg1;
		if (Static31.anInt497 < 1) {
			Static31.anInt497 = 1;
		}
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)[Lclient!bu;")
	public static Class30[] method2092() {
		return new Class30[] { Static459.aClass30_13, Static259.aClass30_8, Static207.aClass30_11, Static43.aClass30_2, Static38.aClass30_1, Static327.aClass30_9 };
	}
}
