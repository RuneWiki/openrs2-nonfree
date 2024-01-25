import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "Lclient!pl;")
	public static Class259 aClass259_88;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!ni;I)V")
	public static void method4370(@OriginalArg(1) Class6_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArray507 == null) {
			return;
		}
		@Pc(13) int local13 = arg0.anIntArray507[arg1 + 1];
		if (local13 == arg0.anInt7370) {
			return;
		}
		arg0.anInt7416 = 0;
		arg0.anInt7370 = local13;
		arg0.anInt7400 = 0;
		arg0.anInt7349 = 1;
		arg0.anInt7378 = 0;
		arg0.anInt7423 = arg0.anInt7424;
		if (arg0.anInt7370 != -1) {
			Static434.method4018(arg0.aByte112, Static116.aClass140_2.method3287(arg0.anInt7370), arg0.anInt8761, arg0.anInt8764, arg0.anInt7416, arg0 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2);
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)I")
	public static int method4371(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
