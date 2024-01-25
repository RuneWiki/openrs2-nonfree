import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "[I")
	public static int[] anIntArray253;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "I")
	public static int anInt4971;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(Z)I")
	public static int method4284() {
		@Pc(7) int local7 = Static137.aClass167_2.method4891();
		if (local7 < Static217.aClass167Array2.length - 1) {
			Static137.aClass167_2 = Static217.aClass167Array2[local7 + 1];
		}
		return 100;
	}
}
