import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!kga", name = "v", descriptor = "I")
	public static int anInt5922 = -1;

	@OriginalMember(owner = "client!kga", name = "w", descriptor = "[I")
	public static final int[] anIntArray348 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(BII)Z")
	public static boolean method5018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static132.method3076(arg0, arg1) | (arg0 & 0x40000) != 0 || Static289.method4998(arg1, arg0);
	}
}
