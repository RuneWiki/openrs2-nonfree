import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "Lclient!pc;")
	public static Class255 aClass255_1;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "[I")
	public static final int[] anIntArray184 = new int[32];

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!jga;)Lclient!jga;")
	public static Class6_Sub4_Sub2 method3379(@OriginalArg(1) Class6_Sub4_Sub2 arg0) {
		@Pc(22) Class6_Sub4_Sub2 local22 = arg0 == null ? new Class6_Sub4_Sub2() : new Class6_Sub4_Sub2(arg0);
		local22.method4798();
		return local22;
	}
}
