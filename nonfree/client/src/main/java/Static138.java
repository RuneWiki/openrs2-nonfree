import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public static int anInt6829 = 0;

	@OriginalMember(owner = "client!h", name = "w", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IC)Z")
	public static boolean method5579(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V")
	public static void method5580() {
		Static433.aBoolean315 = true;
	}
}
