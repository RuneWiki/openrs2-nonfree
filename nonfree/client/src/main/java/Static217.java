import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
	public static int anInt4229;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
	public static int anInt4222 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
	public static int method3478() {
		return Static701.anInt10979++;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
	public static void method3479(@OriginalArg(1) int arg0) {
		Static608.anInt9862 = 100;
		Static541.anInt6223 = arg0;
		Static143.anInt2734 = -1;
		Static148.anInt2790 = 3;
	}
}
