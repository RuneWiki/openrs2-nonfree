import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!up", name = "v", descriptor = "Lclient!vn;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!up", name = "z", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "[I")
	public static final int[] anIntArray763 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!up", name = "B", descriptor = "S")
	public static short aShort131 = 256;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	public static void method6769(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static541.method7520(9, arg0);
		local8.method4945();
	}
}
