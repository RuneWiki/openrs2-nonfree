import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!av", name = "f", descriptor = "Lclient!no;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "[I")
	public static final int[] anIntArray42 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBI)V")
	public static void method532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class2_Sub1_Sub5 local14 = Static653.method9595(18, (long) arg1 << 32 | (long) arg0);
		local14.method2489();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZI)Z")
	public static boolean method534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static194.method3765(arg0, arg1) || Static318.method5254(arg0, arg1);
	}
}
