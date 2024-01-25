import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
	public static final int[] anIntArray433 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
	public static void method4359(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 3);
		local8.method2034();
	}
}
