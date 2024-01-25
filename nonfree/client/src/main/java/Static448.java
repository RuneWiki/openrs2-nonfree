import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public static int anInt6651;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "[I")
	public static final int[] anIntArray444 = new int[8];

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	public static int anInt6654 = 1;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
	public static int anInt6659 = -1;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIII)Lclient!tl;")
	public static Class9 method5117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 986053L ^ (long) arg1 * 67481L ^ (long) arg3 * 97549L ^ (long) arg2 * 475427L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(39) Class9 local39 = (Class9) Static38.aClass167_16.method3386(local33);
		if (local39 == null) {
			local39 = Static38.aClass128_9.method3562(arg1, arg3, arg2, arg0, arg4, arg5);
			Static38.aClass167_16.method3392(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BIZ)V")
	public static void method5120(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) Class1_Sub20 local12 = Static240.method3131(arg1, arg0);
		if (local12 != null) {
			local12.method5617();
		}
	}
}
