import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "F")
	public static float aFloat157;

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "[F")
	public static final float[] aFloatArray53 = new float[4];

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!qs;)I")
	public static int method5721(@OriginalArg(1) Class273 arg0) {
		if (Static274.aClass273_1 == arg0) {
			return 9216;
		} else if (Static596.aClass273_4 == arg0) {
			return 34065;
		} else if (Static401.aClass273_2 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IBI)V")
	public static void method5722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static466.anInt8098 = arg0 - Static157.anInt2670;
		Static82.anInt9708 = arg1 - Static157.anInt2671;
	}
}
