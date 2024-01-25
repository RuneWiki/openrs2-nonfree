import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static410 {

	@OriginalMember(owner = "client!np", name = "U", descriptor = "I")
	public static int anInt6542;

	@OriginalMember(owner = "client!np", name = "Q", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ib;I)Z")
	public static boolean method5855(@OriginalArg(0) Class147 arg0) {
		return arg0 == Static371.aClass147_6 || Static440.aClass147_7 == arg0 || Static152.aClass147_3 == arg0 || arg0 == Static101.aClass147_2 || Static613.aClass147_9 == arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!saa;III)V")
	public static void method5858(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static654.aClass312ArrayArray1[arg1][arg2] = arg0;
	}
}
