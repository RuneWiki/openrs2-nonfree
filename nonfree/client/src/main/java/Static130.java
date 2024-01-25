import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public static int anInt2825;

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
	public static int anInt2824 = -1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZZ)V")
	public static void method2676(@OriginalArg(1) boolean arg0) {
		Static312.anInt6005++;
		Static137.method2769();
		if (arg0) {
			Static281.anInt5478++;
			Static283.method5051();
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(ILclient!ct;)V")
	public static void method2677(@OriginalArg(1) Class30 arg0) {
		Static56.aClass30_13 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V")
	public static void method2678(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static122.anInt1360 = arg0;
		Static93.anInt5014 = 0;
		Static38.anInt945 = arg1;
		Static131.anInt2843 = 0;
	}
}
