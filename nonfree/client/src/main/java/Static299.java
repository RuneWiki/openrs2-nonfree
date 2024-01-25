import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "[I")
	public static final int[] anIntArray459 = new int[256];

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
	public static int anInt4836 = 0;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
	public static void method4154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static480.aClass6_Sub37_Sub1_1.anInt6060 * arg1 >> 8;
		if (local10 != 0 && arg0 != -1) {
			Static483.method6704(Static168.aClass251_60, local10, arg0);
			Static150.aBoolean182 = true;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!fca;)Lclient!fca;")
	public static Class97 method4155(@OriginalArg(1) Class97 arg0) {
		if (arg0.anInt2325 != -1) {
			return Static133.method4068(arg0.anInt2325);
		}
		@Pc(19) int local19 = arg0.anInt2311 >>> 16;
		@Pc(24) Class243 local24 = new Class243(Static564.aClass212_39);
		for (@Pc(35) Class6_Sub31 local35 = (Class6_Sub31) local24.method5554(); local35 != null; local35 = (Class6_Sub31) local24.method5555()) {
			if (local35.anInt4563 == local19) {
				return Static133.method4068((int) local35.aLong249);
			}
		}
		return null;
	}
}
