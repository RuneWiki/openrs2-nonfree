import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "[Lclient!lc;")
	public static Class41[] aClass41Array2;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "D")
	public static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "Lclient!ia;")
	public static Class51 aClass51_459 = Static64.method1101("<col=00ffff>");

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!ia;")
	public static Class51 aClass51_460 = Static64.method1101("event_opbase");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!mb;III)[Lclient!fe;")
	public static Class41_Sub1[] method1096(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		return Static36.method640(arg1, arg0) ? Static20.method448() : null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method1097(@OriginalArg(1) Class70 arg0) {
		Static140.anInt3108 = arg0.method3523(Static9.aClass51_58);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ad;I)V")
	public static void method1098(@OriginalArg(0) Class5_Sub1 arg0) {
		arg0.anInt3589 = 0;
		if (arg0.anInt3586 == 0) {
			arg0.anInt3581 = 1024;
		}
		if (arg0.anInt3586 == 1) {
			arg0.anInt3581 = 1536;
		}
		if (arg0.anInt3586 == 2) {
			arg0.anInt3581 = 0;
		}
		@Pc(33) int local33 = arg0.anInt3610 - Static109.anInt2430;
		@Pc(43) int local43 = arg0.anInt3590 * 128 + arg0.anInt3584 * 64;
		@Pc(53) int local53 = arg0.anInt3584 * 64 + arg0.anInt3615 * 128;
		arg0.anInt3598 += (local43 - arg0.anInt3598) / local33;
		arg0.anInt3624 += (local53 - arg0.anInt3624) / local33;
		if (arg0.anInt3586 == 3) {
			arg0.anInt3581 = 512;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	public static int method1100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) ((arg1 << 16) + arg0);
		return Static79.aClass1_Sub2_Sub8_1 != null && Static79.aClass1_Sub2_Sub8_1.aLong170 == local17 ? Static61.aClass1_Sub16_3.anInt4860 * 99 / (Static61.aClass1_Sub16_3.aByteArray62.length - Static79.aClass1_Sub2_Sub8_1.aByte5) + 1 : 0;
	}
}
