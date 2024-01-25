import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "[I")
	public static final int[] anIntArray609 = new int[1];

	@OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
	public static int anInt9374 = 0;

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
	public static int anInt9375 = 64;

	@OriginalMember(owner = "client!uba", name = "f", descriptor = "[I")
	public static final int[] anIntArray610 = new int[3];

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
	public static int method7959(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI[I[IILclient!hk;)Lclient!pc;")
	public static Class1_Sub2 method7960(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class16_Sub2 arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(22) int local22 = arg1[local12] + arg3 * local12;
			for (@Pc(24) int local24 = 0; local24 < arg2[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class1_Sub2(arg4, arg3, arg0, local10);
	}
}
