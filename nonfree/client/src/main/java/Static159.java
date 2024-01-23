import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Z")
	public static boolean aBoolean202;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public static int anInt3170 = 0;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Z")
	public static boolean aBoolean203 = true;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method2494(@OriginalArg(1) int arg0) {
		if (Static222.method3559(arg0)) {
			Static279.method4159(Static148.aClass22ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method2495() {
		anIntArray285 = null;
	}
}
