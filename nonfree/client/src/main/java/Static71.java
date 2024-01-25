import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Z")
	public static boolean aBoolean130;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
	public static final int[] anIntArray241 = new int[250];

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "J")
	public static long aLong55 = 0L;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ao;IBI)V")
	public static void method1391(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static321.aClass14ArrayArray1[arg2][arg1] = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IB)V")
	public static void method1393(@OriginalArg(0) int arg0) {
		if (Static264.method4436(arg0)) {
			Static252.method5171(Static298.aClass26ArrayArray1[arg0], -1);
		}
	}
}
