import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray761 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IB)Z")
	public static boolean method9037(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 9 || arg0 == 11;
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(IB)V")
	public static void method9040(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 17);
		local9.method9260();
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZI)Z")
	public static boolean method9042(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 | Static546.method7200(arg0, arg1) || Static571.method7409(arg0, arg1);
	}
}
