import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
	public static int anInt8081 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)Z")
	public static boolean method6982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
