import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static620 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public static int anInt10811 = 0;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "F")
	public static float aFloat200 = 1.0F;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "[I")
	public static final int[] anIntArray562 = new int[1000];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZII)Z")
	public static boolean method9240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static326.method5371(arg0, arg1) || Static616.method9601(arg1, arg0);
	}
}
