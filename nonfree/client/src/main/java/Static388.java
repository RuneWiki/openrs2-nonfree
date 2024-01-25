import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!ada;")
	public static Class6 aClass6_117;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public static int anInt6744 = -1;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
	public static int anInt6745 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
	public static void method5855(@OriginalArg(0) int arg0) {
		Static19.anInt868 = arg0;
		Static216.aClass316_28.method7794();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IFFF)F")
	public static float method5857(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg0 - arg2) * arg1 + arg2;
	}
}
