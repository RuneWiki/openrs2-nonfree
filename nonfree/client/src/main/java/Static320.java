import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static320 {

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "B")
	public static byte aByte74;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "Z")
	public static boolean aBoolean413 = true;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)Z")
	public static boolean method4653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
