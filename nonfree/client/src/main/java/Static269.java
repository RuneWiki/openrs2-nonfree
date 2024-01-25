import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "[B")
	public static final byte[] aByteArray61 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public static int anInt5294 = 0;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
	public static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!gi;ZILclient!gi;IZ)I")
	public static int method4547(@OriginalArg(1) Class116_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class116_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static276.method4588(arg5, arg3, arg4, arg0);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static276.method4588(arg1, arg3, arg2, arg0);
			return arg1 ? -local40 : local40;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!jo;)V")
	public static void method4548(@OriginalArg(1) Class168 arg0) {
		Static231.aClass168_56 = arg0;
	}
}
