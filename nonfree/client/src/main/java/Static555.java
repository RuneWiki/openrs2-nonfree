import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static555 {

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public static int anInt9335;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!qw;")
	public static final Class284 aClass284_26 = new Class284(10, 4);

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "[I")
	public static final int[] anIntArray702 = new int[64];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)Z")
	public static boolean method7672(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static419.method6622(arg0, arg1) || Static183.method3404(arg1, arg0);
	}
}
