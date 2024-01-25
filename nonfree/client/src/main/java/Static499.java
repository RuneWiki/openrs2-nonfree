import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static499 {

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "I")
	public static int anInt8894 = 0;

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "[I")
	public static int[] anIntArray450 = new int[1];

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z")
	public static boolean method7860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static388.method6538(arg1, arg0) || Static616.method9601(arg1, arg0);
	}
}
